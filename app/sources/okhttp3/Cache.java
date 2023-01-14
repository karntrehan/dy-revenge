package okhttp3;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.p509io.FileSystem;
import okhttp3.internal.platform.Platform;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10471z;
import p493i.C10590b0;
import p493i.C10598d0;
import p493i.C10603f;
import p493i.C10608g;
import p493i.C10615h;
import p493i.C10616i;
import p493i.C10619k;
import p493i.C10620l;
import p493i.C10625q;

public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion((C10452g) null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    private static final class CacheResponseBody extends ResponseBody {
        private final C10615h bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot2, String str, String str2) {
            C10457l.m35320e(snapshot2, "snapshot");
            this.snapshot = snapshot2;
            this.contentType = str;
            this.contentLength = str2;
            C10598d0 source = snapshot2.getSource(1);
            this.bodySource = C10625q.m36156d(new C10620l(this, source, source) {
                final /* synthetic */ C10598d0 $source;
                final /* synthetic */ CacheResponseBody this$0;

                {
                    this.this$0 = r1;
                    this.$source = r2;
                }

                public void close() {
                    this.this$0.getSnapshot().close();
                    super.close();
                }
            });
        }

        public long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.toLongOrDefault(str, -1);
            }
            return -1;
        }

        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        public C10615h source() {
            return this.bodySource;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (C10299p.m34929o("Vary", headers.name(i), true)) {
                    String value = headers.value(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(C10299p.m34930p(C10471z.f27629a));
                    }
                    for (String str : C10300q.m34983n0(value, new char[]{','}, false, 0, 6, (Object) null)) {
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        treeSet.add(C10300q.m34948E0(str).toString());
                    }
                }
            }
            return treeSet != null ? treeSet : C10346i0.m35098b();
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i));
                }
            }
            return builder.build();
        }

        public final boolean hasVaryAll(Response response) {
            C10457l.m35320e(response, "$this$hasVaryAll");
            return varyFields(response.headers()).contains("*");
        }

        public final String key(HttpUrl httpUrl) {
            C10457l.m35320e(httpUrl, "url");
            return C10616i.f28050o.mo26428d(httpUrl.toString()).mo26415Q().mo26262N();
        }

        public final int readInt$okhttp(C10615h hVar) {
            C10457l.m35320e(hVar, "source");
            try {
                long D = hVar.mo26312D();
                String Y = hVar.mo26342Y();
                if (D >= 0 && D <= ((long) RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO)) {
                    if (!(Y.length() > 0)) {
                        return (int) D;
                    }
                }
                throw new IOException("expected an int but was \"" + D + Y + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final Headers varyHeaders(Response response) {
            C10457l.m35320e(response, "$this$varyHeaders");
            Response networkResponse = response.networkResponse();
            C10457l.m35317b(networkResponse);
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(Response response, Headers headers, Request request) {
            C10457l.m35320e(response, "cachedResponse");
            C10457l.m35320e(headers, "cachedRequest");
            C10457l.m35320e(request, "newRequest");
            Set<String> varyFields = varyFields(response.headers());
            if ((varyFields instanceof Collection) && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!C10457l.m35316a(headers.values(str), request.headers(str))) {
                    return false;
                }
            }
            return true;
        }
    }

    private static final class Entry {
        public static final Companion Companion = new Companion((C10452g) null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C10452g gVar) {
                this();
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            Platform.Companion companion = Platform.Companion;
            sb.append(companion.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + "-Received-Millis";
        }

        public Entry(C10598d0 d0Var) {
            Handshake handshake2;
            C10457l.m35320e(d0Var, "rawSource");
            try {
                C10615h d = C10625q.m36156d(d0Var);
                this.url = d.mo26342Y();
                this.requestMethod = d.mo26342Y();
                Headers.Builder builder = new Headers.Builder();
                int readInt$okhttp = Cache.Companion.readInt$okhttp(d);
                boolean z = false;
                for (int i = 0; i < readInt$okhttp; i++) {
                    builder.addLenient$okhttp(d.mo26342Y());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.Companion.parse(d.mo26342Y());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt$okhttp2 = Cache.Companion.readInt$okhttp(d);
                for (int i2 = 0; i2 < readInt$okhttp2; i2++) {
                    builder2.addLenient$okhttp(d.mo26342Y());
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                long j = 0;
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : j;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String Y = d.mo26342Y();
                    if (!(Y.length() > 0 ? true : z)) {
                        handshake2 = Handshake.Companion.get(!d.mo26390x() ? TlsVersion.Companion.forJavaName(d.mo26342Y()) : TlsVersion.SSL_3_0, CipherSuite.Companion.forJavaName(d.mo26342Y()), readCertificateList(d), readCertificateList(d));
                    } else {
                        throw new IOException("expected \"\" but was \"" + Y + '\"');
                    }
                } else {
                    handshake2 = null;
                }
                this.handshake = handshake2;
            } finally {
                d0Var.close();
            }
        }

        public Entry(Response response) {
            C10457l.m35320e(response, "response");
            this.url = response.request().url().toString();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }

        private final boolean isHttps() {
            return C10299p.m34926B(this.url, "https://", false, 2, (Object) null);
        }

        private final List<Certificate> readCertificateList(C10615h hVar) {
            int readInt$okhttp = Cache.Companion.readInt$okhttp(hVar);
            if (readInt$okhttp == -1) {
                return C10350l.m35138g();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                for (int i = 0; i < readInt$okhttp; i++) {
                    String Y = hVar.mo26342Y();
                    C10603f fVar = new C10603f();
                    C10616i a = C10616i.f28050o.mo26425a(Y);
                    C10457l.m35317b(a);
                    fVar.mo26351d0(a);
                    arrayList.add(instance.generateCertificate(fVar.mo26367r0()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void writeCertList(C10608g gVar, List<? extends Certificate> list) {
            try {
                gVar.mo26360m0((long) list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    byte[] encoded = ((Certificate) list.get(i)).getEncoded();
                    C10616i.C10617a aVar = C10616i.f28050o;
                    C10457l.m35319d(encoded, "bytes");
                    gVar.mo26320K(C10616i.C10617a.m36135g(aVar, encoded, 0, 0, 3, (Object) null).mo26270e()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            C10457l.m35320e(request, "request");
            C10457l.m35320e(response, "response");
            return C10457l.m35316a(this.url, request.url().toString()) && C10457l.m35316a(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request);
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            C10457l.m35320e(snapshot, "snapshot");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, (RequestBody) null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0114, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0115, code lost:
            p455g.p469x.C10416a.m35288a(r8, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0118, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeTo(okhttp3.internal.cache.DiskLruCache.Editor r8) {
            /*
                r7 = this;
                java.lang.String r0 = "editor"
                p455g.p470y.p472d.C10457l.m35320e(r8, r0)
                r0 = 0
                i.b0 r8 = r8.newSink(r0)
                i.g r8 = p493i.C10625q.m36155c(r8)
                java.lang.String r1 = r7.url     // Catch:{ all -> 0x0112 }
                i.g r1 = r8.mo26320K(r1)     // Catch:{ all -> 0x0112 }
                r2 = 10
                r1.writeByte(r2)     // Catch:{ all -> 0x0112 }
                java.lang.String r1 = r7.requestMethod     // Catch:{ all -> 0x0112 }
                i.g r1 = r8.mo26320K(r1)     // Catch:{ all -> 0x0112 }
                r1.writeByte(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r1 = r7.varyHeaders     // Catch:{ all -> 0x0112 }
                int r1 = r1.size()     // Catch:{ all -> 0x0112 }
                long r3 = (long) r1     // Catch:{ all -> 0x0112 }
                i.g r1 = r8.mo26360m0(r3)     // Catch:{ all -> 0x0112 }
                r1.writeByte(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r1 = r7.varyHeaders     // Catch:{ all -> 0x0112 }
                int r1 = r1.size()     // Catch:{ all -> 0x0112 }
                r3 = 0
            L_0x0037:
                java.lang.String r4 = ": "
                if (r3 >= r1) goto L_0x0059
                okhttp3.Headers r5 = r7.varyHeaders     // Catch:{ all -> 0x0112 }
                java.lang.String r5 = r5.name(r3)     // Catch:{ all -> 0x0112 }
                i.g r5 = r8.mo26320K(r5)     // Catch:{ all -> 0x0112 }
                i.g r4 = r5.mo26320K(r4)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r5 = r7.varyHeaders     // Catch:{ all -> 0x0112 }
                java.lang.String r5 = r5.value(r3)     // Catch:{ all -> 0x0112 }
                i.g r4 = r4.mo26320K(r5)     // Catch:{ all -> 0x0112 }
                r4.writeByte(r2)     // Catch:{ all -> 0x0112 }
                int r3 = r3 + 1
                goto L_0x0037
            L_0x0059:
                okhttp3.internal.http.StatusLine r1 = new okhttp3.internal.http.StatusLine     // Catch:{ all -> 0x0112 }
                okhttp3.Protocol r3 = r7.protocol     // Catch:{ all -> 0x0112 }
                int r5 = r7.code     // Catch:{ all -> 0x0112 }
                java.lang.String r6 = r7.message     // Catch:{ all -> 0x0112 }
                r1.<init>(r3, r5, r6)     // Catch:{ all -> 0x0112 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0112 }
                i.g r1 = r8.mo26320K(r1)     // Catch:{ all -> 0x0112 }
                r1.writeByte(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r1 = r7.responseHeaders     // Catch:{ all -> 0x0112 }
                int r1 = r1.size()     // Catch:{ all -> 0x0112 }
                int r1 = r1 + 2
                long r5 = (long) r1     // Catch:{ all -> 0x0112 }
                i.g r1 = r8.mo26360m0(r5)     // Catch:{ all -> 0x0112 }
                r1.writeByte(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r1 = r7.responseHeaders     // Catch:{ all -> 0x0112 }
                int r1 = r1.size()     // Catch:{ all -> 0x0112 }
            L_0x0085:
                if (r0 >= r1) goto L_0x00a5
                okhttp3.Headers r3 = r7.responseHeaders     // Catch:{ all -> 0x0112 }
                java.lang.String r3 = r3.name(r0)     // Catch:{ all -> 0x0112 }
                i.g r3 = r8.mo26320K(r3)     // Catch:{ all -> 0x0112 }
                i.g r3 = r3.mo26320K(r4)     // Catch:{ all -> 0x0112 }
                okhttp3.Headers r5 = r7.responseHeaders     // Catch:{ all -> 0x0112 }
                java.lang.String r5 = r5.value(r0)     // Catch:{ all -> 0x0112 }
                i.g r3 = r3.mo26320K(r5)     // Catch:{ all -> 0x0112 }
                r3.writeByte(r2)     // Catch:{ all -> 0x0112 }
                int r0 = r0 + 1
                goto L_0x0085
            L_0x00a5:
                java.lang.String r0 = SENT_MILLIS     // Catch:{ all -> 0x0112 }
                i.g r0 = r8.mo26320K(r0)     // Catch:{ all -> 0x0112 }
                i.g r0 = r0.mo26320K(r4)     // Catch:{ all -> 0x0112 }
                long r5 = r7.sentRequestMillis     // Catch:{ all -> 0x0112 }
                i.g r0 = r0.mo26360m0(r5)     // Catch:{ all -> 0x0112 }
                r0.writeByte(r2)     // Catch:{ all -> 0x0112 }
                java.lang.String r0 = RECEIVED_MILLIS     // Catch:{ all -> 0x0112 }
                i.g r0 = r8.mo26320K(r0)     // Catch:{ all -> 0x0112 }
                i.g r0 = r0.mo26320K(r4)     // Catch:{ all -> 0x0112 }
                long r3 = r7.receivedResponseMillis     // Catch:{ all -> 0x0112 }
                i.g r0 = r0.mo26360m0(r3)     // Catch:{ all -> 0x0112 }
                r0.writeByte(r2)     // Catch:{ all -> 0x0112 }
                boolean r0 = r7.isHttps()     // Catch:{ all -> 0x0112 }
                if (r0 == 0) goto L_0x010b
                r8.writeByte(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0112 }
                p455g.p470y.p472d.C10457l.m35317b(r0)     // Catch:{ all -> 0x0112 }
                okhttp3.CipherSuite r0 = r0.cipherSuite()     // Catch:{ all -> 0x0112 }
                java.lang.String r0 = r0.javaName()     // Catch:{ all -> 0x0112 }
                i.g r0 = r8.mo26320K(r0)     // Catch:{ all -> 0x0112 }
                r0.writeByte(r2)     // Catch:{ all -> 0x0112 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0112 }
                java.util.List r0 = r0.peerCertificates()     // Catch:{ all -> 0x0112 }
                r7.writeCertList(r8, r0)     // Catch:{ all -> 0x0112 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0112 }
                java.util.List r0 = r0.localCertificates()     // Catch:{ all -> 0x0112 }
                r7.writeCertList(r8, r0)     // Catch:{ all -> 0x0112 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0112 }
                okhttp3.TlsVersion r0 = r0.tlsVersion()     // Catch:{ all -> 0x0112 }
                java.lang.String r0 = r0.javaName()     // Catch:{ all -> 0x0112 }
                i.g r0 = r8.mo26320K(r0)     // Catch:{ all -> 0x0112 }
                r0.writeByte(r2)     // Catch:{ all -> 0x0112 }
            L_0x010b:
                g.s r0 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0112 }
                r0 = 0
                p455g.p469x.C10416a.m35288a(r8, r0)
                return
            L_0x0112:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0114 }
            L_0x0114:
                r1 = move-exception
                p455g.p469x.C10416a.m35288a(r8, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache.Entry.writeTo(okhttp3.internal.cache.DiskLruCache$Editor):void");
        }
    }

    private final class RealCacheRequest implements CacheRequest {
        private final C10590b0 body;
        private final C10590b0 cacheOut;
        private boolean done;
        /* access modifiers changed from: private */
        public final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(Cache cache, DiskLruCache.Editor editor2) {
            C10457l.m35320e(editor2, "editor");
            this.this$0 = cache;
            this.editor = editor2;
            C10590b0 newSink = editor2.newSink(1);
            this.cacheOut = newSink;
            this.body = new C10619k(this, newSink) {
                final /* synthetic */ RealCacheRequest this$0;

                {
                    this.this$0 = r1;
                }

                public void close() {
                    synchronized (this.this$0.this$0) {
                        if (!this.this$0.getDone()) {
                            this.this$0.setDone(true);
                            Cache cache = this.this$0.this$0;
                            cache.setWriteSuccessCount$okhttp(cache.getWriteSuccessCount$okhttp() + 1);
                            super.close();
                            this.this$0.editor.commit();
                        }
                    }
                }
            };
        }

        public void abort() {
            synchronized (this.this$0) {
                if (!this.done) {
                    this.done = true;
                    Cache cache = this.this$0;
                    cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                    Util.closeQuietly((Closeable) this.cacheOut);
                    try {
                        this.editor.abort();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public C10590b0 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
        C10457l.m35320e(file, "directory");
    }

    public Cache(File file, long j, FileSystem fileSystem) {
        C10457l.m35320e(file, "directory");
        C10457l.m35320e(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    /* renamed from: -deprecated_directory  reason: not valid java name */
    public final File m37340deprecated_directory() {
        return this.cache.getDirectory();
    }

    public void close() {
        this.cache.close();
    }

    public final void delete() {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() {
        this.cache.evictAll();
    }

    public void flush() {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) {
        C10457l.m35320e(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot != null) {
                try {
                    Entry entry = new Entry(snapshot.getSource(0));
                    Response response = entry.response(snapshot);
                    if (entry.matches(request, response)) {
                        return response;
                    }
                    ResponseBody body = response.body();
                    if (body != null) {
                        Util.closeQuietly((Closeable) body);
                    }
                    return null;
                } catch (IOException unused) {
                    Util.closeQuietly((Closeable) snapshot);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editor;
        C10457l.m35320e(response, "response");
        String method = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!C10457l.m35316a(method, "GET")) {
            return null;
        } else {
            Companion companion = Companion;
            if (companion.hasVaryAll(response)) {
                return null;
            }
            Entry entry = new Entry(response);
            try {
                editor = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0, 2, (Object) null);
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new RealCacheRequest(this, editor);
                } catch (IOException unused2) {
                    abortQuietly(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
                abortQuietly(editor);
                return null;
            }
        }
    }

    public final void remove$okhttp(Request request) {
        C10457l.m35320e(request, "request");
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final long size() {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        C10457l.m35320e(cacheStrategy, "cacheStrategy");
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final void update$okhttp(Response response, Response response2) {
        C10457l.m35320e(response, "cached");
        C10457l.m35320e(response2, "network");
        Entry entry = new Entry(response2);
        ResponseBody body = response.body();
        Objects.requireNonNull(body, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            DiskLruCache.Editor edit = ((CacheResponseBody) body).getSnapshot().edit();
            if (edit != null) {
                entry.writeTo(edit);
                edit.commit();
            }
        } catch (IOException unused) {
            abortQuietly((DiskLruCache.Editor) null);
        }
    }

    public final Iterator<String> urls() {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }
}
