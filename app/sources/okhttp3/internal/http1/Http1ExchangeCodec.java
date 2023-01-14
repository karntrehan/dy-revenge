package okhttp3.internal.http1;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10590b0;
import p493i.C10598d0;
import p493i.C10600e0;
import p493i.C10603f;
import p493i.C10608g;
import p493i.C10615h;
import p493i.C10621m;

public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion((C10452g) null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    /* access modifiers changed from: private */
    public final OkHttpClient client;
    private final RealConnection connection;
    /* access modifiers changed from: private */
    public final HeadersReader headersReader;
    /* access modifiers changed from: private */
    public final C10608g sink;
    /* access modifiers changed from: private */
    public final C10615h source;
    /* access modifiers changed from: private */
    public int state;
    /* access modifiers changed from: private */
    public Headers trailers;

    private abstract class AbstractSource implements C10598d0 {
        private boolean closed;
        private final C10621m timeout;

        public AbstractSource() {
            this.timeout = new C10621m(Http1ExchangeCodec.this.source.timeout());
        }

        public abstract /* synthetic */ void close();

        /* access modifiers changed from: protected */
        public final boolean getClosed() {
            return this.closed;
        }

        /* access modifiers changed from: protected */
        public final C10621m getTimeout() {
            return this.timeout;
        }

        public long read(C10603f fVar, long j) {
            C10457l.m35320e(fVar, "sink");
            try {
                return Http1ExchangeCodec.this.source.read(fVar, j);
            } catch (IOException e) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e;
            }
        }

        public final void responseBodyComplete() {
            if (Http1ExchangeCodec.this.state != 6) {
                if (Http1ExchangeCodec.this.state == 5) {
                    Http1ExchangeCodec.this.detachTimeout(this.timeout);
                    Http1ExchangeCodec.this.state = 6;
                    return;
                }
                throw new IllegalStateException("state: " + Http1ExchangeCodec.this.state);
            }
        }

        /* access modifiers changed from: protected */
        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public C10600e0 timeout() {
            return this.timeout;
        }
    }

    private final class ChunkedSink implements C10590b0 {
        private boolean closed;
        private final C10621m timeout;

        public ChunkedSink() {
            this.timeout = new C10621m(Http1ExchangeCodec.this.sink.timeout());
        }

        public synchronized void close() {
            if (!this.closed) {
                this.closed = true;
                Http1ExchangeCodec.this.sink.mo26320K("0\r\n\r\n");
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 3;
            }
        }

        public synchronized void flush() {
            if (!this.closed) {
                Http1ExchangeCodec.this.sink.flush();
            }
        }

        public C10600e0 timeout() {
            return this.timeout;
        }

        public void write(C10603f fVar, long j) {
            C10457l.m35320e(fVar, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                Http1ExchangeCodec.this.sink.mo26332R(j);
                Http1ExchangeCodec.this.sink.mo26320K("\r\n");
                Http1ExchangeCodec.this.sink.write(fVar, j);
                Http1ExchangeCodec.this.sink.mo26320K("\r\n");
            }
        }
    }

    private final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk = -1;
        private boolean hasMoreChunks = true;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super();
            C10457l.m35320e(httpUrl, "url");
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
        }

        private final void readChunkSize() {
            if (this.bytesRemainingInChunk != -1) {
                this.this$0.source.mo26342Y();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.mo26364p0();
                String Y = this.this$0.source.mo26342Y();
                if (Y != null) {
                    String obj = C10300q.m34948E0(Y).toString();
                    if (this.bytesRemainingInChunk >= 0) {
                        if (!(obj.length() > 0) || C10299p.m34926B(obj, ";", false, 2, (Object) null)) {
                            if (this.bytesRemainingInChunk == 0) {
                                this.hasMoreChunks = false;
                                Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                                http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                                OkHttpClient access$getClient$p = this.this$0.client;
                                C10457l.m35317b(access$getClient$p);
                                CookieJar cookieJar = access$getClient$p.cookieJar();
                                HttpUrl httpUrl = this.url;
                                Headers access$getTrailers$p = this.this$0.trailers;
                                C10457l.m35317b(access$getTrailers$p);
                                HttpHeaders.receiveHeaders(cookieJar, httpUrl, access$getTrailers$p);
                                responseBodyComplete();
                                return;
                            }
                            return;
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions" + " but was \"" + this.bytesRemainingInChunk + obj + '\"');
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() {
            if (!getClosed()) {
                if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.this$0.getConnection().noNewExchanges$okhttp();
                    responseBodyComplete();
                }
                setClosed(true);
            }
        }

        public long read(C10603f fVar, long j) {
            C10457l.m35320e(fVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!(true ^ getClosed())) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.hasMoreChunks) {
                return -1;
            } else {
                long j2 = this.bytesRemainingInChunk;
                if (j2 == 0 || j2 == -1) {
                    readChunkSize();
                    if (!this.hasMoreChunks) {
                        return -1;
                    }
                }
                long read = super.read(fVar, Math.min(j, this.bytesRemainingInChunk));
                if (read != -1) {
                    this.bytesRemainingInChunk -= read;
                    return read;
                }
                this.this$0.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }
    }

    private final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete();
            }
        }

        public void close() {
            if (!getClosed()) {
                if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                    responseBodyComplete();
                }
                setClosed(true);
            }
        }

        public long read(C10603f fVar, long j) {
            C10457l.m35320e(fVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (true ^ getClosed()) {
                long j2 = this.bytesRemaining;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(fVar, Math.min(j2, j));
                if (read != -1) {
                    long j3 = this.bytesRemaining - read;
                    this.bytesRemaining = j3;
                    if (j3 == 0) {
                        responseBodyComplete();
                    }
                    return read;
                }
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    private final class KnownLengthSink implements C10590b0 {
        private boolean closed;
        private final C10621m timeout;

        public KnownLengthSink() {
            this.timeout = new C10621m(Http1ExchangeCodec.this.sink.timeout());
        }

        public void close() {
            if (!this.closed) {
                this.closed = true;
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 3;
            }
        }

        public void flush() {
            if (!this.closed) {
                Http1ExchangeCodec.this.sink.flush();
            }
        }

        public C10600e0 timeout() {
            return this.timeout;
        }

        public void write(C10603f fVar, long j) {
            C10457l.m35320e(fVar, "source");
            if (!this.closed) {
                Util.checkOffsetAndCount(fVar.size(), 0, j);
                Http1ExchangeCodec.this.sink.write(fVar, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    private final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        public void close() {
            if (!getClosed()) {
                if (!this.inputExhausted) {
                    responseBodyComplete();
                }
                setClosed(true);
            }
        }

        public long read(C10603f fVar, long j) {
            C10457l.m35320e(fVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!(!getClosed())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.inputExhausted) {
                return -1;
            } else {
                long read = super.read(fVar, j);
                if (read != -1) {
                    return read;
                }
                this.inputExhausted = true;
                responseBodyComplete();
                return -1;
            }
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, C10615h hVar, C10608g gVar) {
        C10457l.m35320e(realConnection, "connection");
        C10457l.m35320e(hVar, "source");
        C10457l.m35320e(gVar, "sink");
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = hVar;
        this.sink = gVar;
        this.headersReader = new HeadersReader(hVar);
    }

    /* access modifiers changed from: private */
    public final void detachTimeout(C10621m mVar) {
        C10600e0 a = mVar.mo26439a();
        mVar.mo26440b(C10600e0.NONE);
        a.clearDeadline();
        a.clearTimeout();
    }

    private final boolean isChunked(Request request) {
        return C10299p.m34929o("chunked", request.header("Transfer-Encoding"), true);
    }

    private final boolean isChunked(Response response) {
        return C10299p.m34929o("chunked", Response.header$default(response, "Transfer-Encoding", (String) null, 2, (Object) null), true);
    }

    private final C10590b0 newChunkedSink() {
        boolean z = true;
        if (this.state != 1) {
            z = false;
        }
        if (z) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final C10598d0 newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(this, httpUrl);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final C10598d0 newFixedLengthSource(long j) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final C10590b0 newKnownLengthSink() {
        boolean z = true;
        if (this.state != 1) {
            z = false;
        }
        if (z) {
            this.state = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final C10598d0 newUnknownLengthSource() {
        if (this.state == 4) {
            this.state = 5;
            getConnection().noNewExchanges$okhttp();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    public void cancel() {
        getConnection().cancel();
    }

    public C10590b0 createRequestBody(Request request, long j) {
        C10457l.m35320e(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (isChunked(request)) {
            return newChunkedSink();
        } else {
            if (j != -1) {
                return newKnownLengthSink();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public void finishRequest() {
        this.sink.flush();
    }

    public void flushRequest() {
        this.sink.flush();
    }

    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    public C10598d0 openResponseBodySource(Response response) {
        long headersContentLength;
        C10457l.m35320e(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            headersContentLength = 0;
        } else if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        } else {
            headersContentLength = Util.headersContentLength(response);
            if (headersContentLength == -1) {
                return newUnknownLengthSource();
            }
        }
        return newFixedLengthSource(headersContentLength);
    }

    public Response.Builder readResponseHeaders(boolean z) {
        int i = this.state;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                StatusLine parse = StatusLine.Companion.parse(this.headersReader.readLine());
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.headersReader.readHeaders());
                if (z && parse.code == 100) {
                    return null;
                }
                if (parse.code == 100) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e) {
                String redact = getConnection().route().address().url().redact();
                throw new IOException("unexpected end of stream on " + redact, e);
            }
        } else {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
    }

    public long reportedContentLength(Response response) {
        C10457l.m35320e(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0;
        }
        if (isChunked(response)) {
            return -1;
        }
        return Util.headersContentLength(response);
    }

    public final void skipConnectBody(Response response) {
        C10457l.m35320e(response, "response");
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength != -1) {
            C10598d0 newFixedLengthSource = newFixedLengthSource(headersContentLength);
            Util.skipAll(newFixedLengthSource, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, TimeUnit.MILLISECONDS);
            newFixedLengthSource.close();
        }
    }

    public Headers trailers() {
        if (this.state == 6) {
            Headers headers = this.trailers;
            return headers != null ? headers : Util.EMPTY_HEADERS;
        }
        throw new IllegalStateException("too early; can't read the trailers yet".toString());
    }

    public final void writeRequest(Headers headers, String str) {
        C10457l.m35320e(headers, "headers");
        C10457l.m35320e(str, "requestLine");
        if (this.state == 0) {
            this.sink.mo26320K(str).mo26320K("\r\n");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.sink.mo26320K(headers.name(i)).mo26320K(": ").mo26320K(headers.value(i)).mo26320K("\r\n");
            }
            this.sink.mo26320K("\r\n");
            this.state = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    public void writeRequestHeaders(Request request) {
        C10457l.m35320e(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        C10457l.m35319d(type, "connection.route().proxy.type()");
        writeRequest(request.headers(), requestLine.get(request, type));
    }
}
