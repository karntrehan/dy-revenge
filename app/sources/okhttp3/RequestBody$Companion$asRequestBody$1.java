package okhttp3;

import java.io.File;

public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ File $this_asRequestBody;

    RequestBody$Companion$asRequestBody$1(File file, MediaType mediaType) {
        this.$this_asRequestBody = file;
        this.$contentType = mediaType;
    }

    public long contentLength() {
        return this.$this_asRequestBody.length();
    }

    public MediaType contentType() {
        return this.$contentType;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        p455g.p469x.C10416a.m35288a(r0, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeTo(p493i.C10608g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "sink"
            p455g.p470y.p472d.C10457l.m35320e(r3, r0)
            java.io.File r0 = r2.$this_asRequestBody
            i.d0 r0 = p493i.C10625q.m36162j(r0)
            r3.mo26330Q(r0)     // Catch:{ all -> 0x0013 }
            r3 = 0
            p455g.p469x.C10416a.m35288a(r0, r3)
            return
        L_0x0013:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r1 = move-exception
            p455g.p469x.C10416a.m35288a(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody$Companion$asRequestBody$1.writeTo(i.g):void");
    }
}
