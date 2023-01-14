package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import p455g.p459d0.C10283d;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10603f;
import p493i.C10615h;
import p493i.C10616i;

public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion((C10452g) null);
    private Reader reader;

    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final C10615h source;

        public BomAwareReader(C10615h hVar, Charset charset2) {
            C10457l.m35320e(hVar, "source");
            C10457l.m35320e(charset2, "charset");
            this.source = hVar;
            this.charset = charset2;
        }

        public void close() {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        public int read(char[] cArr, int i, int i2) {
            C10457l.m35320e(cArr, "cbuf");
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.mo26367r0(), Util.readBomAsCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, C10615h hVar, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(hVar, mediaType, j);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, C10616i iVar, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(iVar, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public final ResponseBody create(C10615h hVar, MediaType mediaType, long j) {
            C10457l.m35320e(hVar, "$this$asResponseBody");
            return new ResponseBody$Companion$asResponseBody$1(hVar, mediaType, j);
        }

        public final ResponseBody create(C10616i iVar, MediaType mediaType) {
            C10457l.m35320e(iVar, "$this$toResponseBody");
            return create((C10615h) new C10603f().mo26351d0(iVar), mediaType, (long) iVar.mo26420Y());
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            C10457l.m35320e(str, "$this$toResponseBody");
            Charset charset = C10283d.f27505b;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, (Charset) null, 1, (Object) null);
                if (charset$default == null) {
                    MediaType.Companion companion = MediaType.Companion;
                    mediaType = companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            C10603f a1 = new C10603f().mo26346a1(str, charset);
            return create((C10615h) a1, mediaType, a1.size());
        }

        public final ResponseBody create(MediaType mediaType, long j, C10615h hVar) {
            C10457l.m35320e(hVar, "content");
            return create(hVar, mediaType, j);
        }

        public final ResponseBody create(MediaType mediaType, C10616i iVar) {
            C10457l.m35320e(iVar, "content");
            return create(iVar, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            C10457l.m35320e(str, "content");
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            C10457l.m35320e(bArr, "content");
            return create(bArr, mediaType);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            C10457l.m35320e(bArr, "$this$toResponseBody");
            return create((C10615h) new C10603f().write(bArr), mediaType, (long) bArr.length);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.charset(p455g.p459d0.C10283d.f27505b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.nio.charset.Charset charset() {
        /*
            r2 = this;
            okhttp3.MediaType r0 = r2.contentType()
            if (r0 == 0) goto L_0x000f
            java.nio.charset.Charset r1 = p455g.p459d0.C10283d.f27505b
            java.nio.charset.Charset r0 = r0.charset(r1)
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            java.nio.charset.Charset r0 = p455g.p459d0.C10283d.f27505b
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.charset():java.nio.charset.Charset");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        p455g.p470y.p472d.C10456k.m35315b(1);
        p455g.p469x.C10416a.m35288a(r2, r6);
        p455g.p470y.p472d.C10456k.m35314a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T consumeSource(p455g.p470y.p471c.C10430l<? super p493i.C10615h, ? extends T> r6, p455g.p470y.p471c.C10430l<? super T, java.lang.Integer> r7) {
        /*
            r5 = this;
            long r0 = r5.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0067
            i.h r2 = r5.source()
            r3 = 0
            r4 = 1
            java.lang.Object r6 = r6.invoke(r2)     // Catch:{ all -> 0x005a }
            p455g.p470y.p472d.C10456k.m35315b(r4)
            p455g.p469x.C10416a.m35288a(r2, r3)
            p455g.p470y.p472d.C10456k.m35314a(r4)
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0059
            long r2 = (long) r7
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0035
            goto L_0x0059
        L_0x0035:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Content-Length ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") and stream length ("
            r2.append(r0)
            r2.append(r7)
            java.lang.String r7 = ") disagree"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r6.<init>(r7)
            throw r6
        L_0x0059:
            return r6
        L_0x005a:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x005c }
        L_0x005c:
            r7 = move-exception
            p455g.p470y.p472d.C10456k.m35315b(r4)
            p455g.p469x.C10416a.m35288a(r2, r6)
            p455g.p470y.p472d.C10456k.m35314a(r4)
            throw r7
        L_0x0067:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Cannot buffer entire body for content length: "
            r7.append(r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.consumeSource(g.y.c.l, g.y.c.l):java.lang.Object");
    }

    public static final ResponseBody create(C10615h hVar, MediaType mediaType, long j) {
        return Companion.create(hVar, mediaType, j);
    }

    public static final ResponseBody create(C10616i iVar, MediaType mediaType) {
        return Companion.create(iVar, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j, C10615h hVar) {
        return Companion.create(mediaType, j, hVar);
    }

    public static final ResponseBody create(MediaType mediaType, C10616i iVar) {
        return Companion.create(mediaType, iVar);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public final InputStream byteStream() {
        return source().mo26367r0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        p455g.p469x.C10416a.m35288a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p493i.C10616i byteString() {
        /*
            r7 = this;
            long r0 = r7.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0054
            i.h r2 = r7.source()
            r3 = 0
            i.i r4 = r2.mo26335T()     // Catch:{ all -> 0x004d }
            p455g.p469x.C10416a.m35288a(r2, r3)
            int r2 = r4.mo26420Y()
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x004c
            long r5 = (long) r2
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0028
            goto L_0x004c
        L_0x0028:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x004c:
            return r4
        L_0x004d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            p455g.p469x.C10416a.m35288a(r2, r0)
            throw r1
        L_0x0054:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.byteString():i.i");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        p455g.p469x.C10416a.m35288a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] bytes() {
        /*
            r7 = this;
            long r0 = r7.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0051
            i.h r2 = r7.source()
            r3 = 0
            byte[] r4 = r2.mo26379u()     // Catch:{ all -> 0x004a }
            p455g.p469x.C10416a.m35288a(r2, r3)
            int r2 = r4.length
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0049
            long r5 = (long) r2
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0025
            goto L_0x0049
        L_0x0025:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x0049:
            return r4
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            p455g.p469x.C10416a.m35288a(r2, r0)
            throw r1
        L_0x0051:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.bytes():byte[]");
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    public void close() {
        Util.closeQuietly((Closeable) source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract C10615h source();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        p455g.p469x.C10416a.m35288a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String string() {
        /*
            r3 = this;
            i.h r0 = r3.source()
            java.nio.charset.Charset r1 = r3.charset()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r1 = okhttp3.internal.Util.readBomAsCharset(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.mo26325N(r1)     // Catch:{ all -> 0x0015 }
            r2 = 0
            p455g.p469x.C10416a.m35288a(r0, r2)
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            p455g.p469x.C10416a.m35288a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.string():java.lang.String");
    }
}
