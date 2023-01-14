package p174e.p247e.p253d.p261h;

import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p261h.C6088a;

/* renamed from: e.e.d.h.b */
public class C6092b<T> extends C6088a<T> {
    private C6092b(C6099i<T> iVar, C6088a.C6091c cVar, Throwable th) {
        super(iVar, cVar, th);
    }

    C6092b(T t, C6098h<T> hVar, C6088a.C6091c cVar, Throwable th) {
        super(t, hVar, cVar, th);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = r6.f16731s.mo18093f();
        r3 = new java.lang.Object[3];
        r3[0] = java.lang.Integer.valueOf(java.lang.System.identityHashCode(r6));
        r3[1] = java.lang.Integer.valueOf(java.lang.System.identityHashCode(r6.f16731s));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r0 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r0 = r0.getClass().getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r3[2] = r0;
        p174e.p247e.p253d.p258e.C6071a.m22861I("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", r3);
        r6.f16732t.mo18086a(r6.f16731s, r6.f16733u);
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        super.finalize();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finalize() {
        /*
            r6 = this;
            monitor-enter(r6)     // Catch:{ all -> 0x0055 }
            boolean r0 = r6.f16730r     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r6)     // Catch:{ all -> 0x0052 }
            super.finalize()
            return
        L_0x000a:
            monitor-exit(r6)     // Catch:{ all -> 0x0052 }
            e.e.d.h.i<T> r0 = r6.f16731s     // Catch:{ all -> 0x0055 }
            java.lang.Object r0 = r0.mo18093f()     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = "DefaultCloseableReference"
            java.lang.String r2 = "Finalized without closing: %x %x (type = %s)"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0055 }
            r4 = 0
            int r5 = java.lang.System.identityHashCode(r6)     // Catch:{ all -> 0x0055 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0055 }
            r3[r4] = r5     // Catch:{ all -> 0x0055 }
            r4 = 1
            e.e.d.h.i<T> r5 = r6.f16731s     // Catch:{ all -> 0x0055 }
            int r5 = java.lang.System.identityHashCode(r5)     // Catch:{ all -> 0x0055 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0055 }
            r3[r4] = r5     // Catch:{ all -> 0x0055 }
            r4 = 2
            if (r0 != 0) goto L_0x0035
            r0 = 0
            goto L_0x003d
        L_0x0035:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0055 }
        L_0x003d:
            r3[r4] = r0     // Catch:{ all -> 0x0055 }
            p174e.p247e.p253d.p258e.C6071a.m22861I(r1, r2, r3)     // Catch:{ all -> 0x0055 }
            e.e.d.h.a$c r0 = r6.f16732t     // Catch:{ all -> 0x0055 }
            e.e.d.h.i<T> r1 = r6.f16731s     // Catch:{ all -> 0x0055 }
            java.lang.Throwable r2 = r6.f16733u     // Catch:{ all -> 0x0055 }
            r0.mo18086a(r1, r2)     // Catch:{ all -> 0x0055 }
            r6.close()     // Catch:{ all -> 0x0055 }
            super.finalize()
            return
        L_0x0052:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            super.finalize()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p253d.p261h.C6092b.finalize():void");
    }

    /* renamed from: n0 */
    public C6088a<T> clone() {
        C6062k.m22841i(mo18084y0());
        return new C6092b(this.f16731s, this.f16732t, this.f16733u != null ? new Throwable(this.f16733u) : null);
    }
}
