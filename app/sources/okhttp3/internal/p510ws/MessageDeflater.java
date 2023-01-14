package okhttp3.internal.p510ws;

import java.io.Closeable;
import java.util.zip.Deflater;
import p493i.C10590b0;
import p493i.C10603f;
import p493i.C10616i;
import p493i.C10618j;

/* renamed from: okhttp3.internal.ws.MessageDeflater */
public final class MessageDeflater implements Closeable {
    private final C10603f deflatedBytes;
    private final Deflater deflater;
    private final C10618j deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        C10603f fVar = new C10603f();
        this.deflatedBytes = fVar;
        Deflater deflater2 = new Deflater(-1, true);
        this.deflater = deflater2;
        this.deflaterSink = new C10618j((C10590b0) fVar, deflater2);
    }

    private final boolean endsWith(C10603f fVar, C10616i iVar) {
        return fVar.mo26323M(fVar.size() - ((long) iVar.mo26420Y()), iVar);
    }

    public void close() {
        this.deflaterSink.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        p455g.p469x.C10416a.m35288a(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void deflate(p493i.C10603f r8) {
        /*
            r7 = this;
            java.lang.String r0 = "buffer"
            p455g.p470y.p472d.C10457l.m35320e(r8, r0)
            i.f r0 = r7.deflatedBytes
            long r0 = r0.size()
            r2 = 1
            r3 = 0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0068
            boolean r0 = r7.noContextTakeover
            if (r0 == 0) goto L_0x0021
            java.util.zip.Deflater r0 = r7.deflater
            r0.reset()
        L_0x0021:
            i.j r0 = r7.deflaterSink
            long r4 = r8.size()
            r0.write(r8, r4)
            i.j r0 = r7.deflaterSink
            r0.flush()
            i.f r0 = r7.deflatedBytes
            i.i r1 = okhttp3.internal.p510ws.MessageDeflaterKt.EMPTY_DEFLATE_BLOCK
            boolean r0 = r7.endsWith(r0, r1)
            if (r0 == 0) goto L_0x0059
            i.f r0 = r7.deflatedBytes
            long r0 = r0.size()
            r3 = 4
            long r3 = (long) r3
            long r0 = r0 - r3
            i.f r3 = r7.deflatedBytes
            r4 = 0
            i.f$a r2 = p493i.C10603f.m35979F0(r3, r4, r2, r4)
            r2.mo26396b(r0)     // Catch:{ all -> 0x0052 }
            p455g.p469x.C10416a.m35288a(r2, r4)
            goto L_0x005e
        L_0x0052:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            p455g.p469x.C10416a.m35288a(r2, r8)
            throw r0
        L_0x0059:
            i.f r0 = r7.deflatedBytes
            r0.writeByte(r3)
        L_0x005e:
            i.f r0 = r7.deflatedBytes
            long r1 = r0.size()
            r8.write(r0, r1)
            return
        L_0x0068:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p510ws.MessageDeflater.deflate(i.f):void");
    }
}
