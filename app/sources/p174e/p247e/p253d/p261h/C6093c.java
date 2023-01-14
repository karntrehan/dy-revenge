package p174e.p247e.p253d.p261h;

import p174e.p247e.p253d.p261h.C6088a;

/* renamed from: e.e.d.h.c */
public class C6093c<T> extends C6088a<T> {
    C6093c(T t, C6098h<T> hVar, C6088a.C6091c cVar, Throwable th) {
        super(t, hVar, cVar, th);
    }

    public void close() {
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
        p174e.p247e.p253d.p258e.C6071a.m22861I("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", r3);
        r6.f16731s.mo18092d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        super.finalize();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finalize() {
        /*
            r6 = this;
            monitor-enter(r6)     // Catch:{ all -> 0x004e }
            boolean r0 = r6.f16730r     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r6)     // Catch:{ all -> 0x004b }
            super.finalize()
            return
        L_0x000a:
            monitor-exit(r6)     // Catch:{ all -> 0x004b }
            e.e.d.h.i<T> r0 = r6.f16731s     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.mo18093f()     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "FinalizerCloseableReference"
            java.lang.String r2 = "Finalized without closing: %x %x (type = %s)"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x004e }
            r4 = 0
            int r5 = java.lang.System.identityHashCode(r6)     // Catch:{ all -> 0x004e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x004e }
            r3[r4] = r5     // Catch:{ all -> 0x004e }
            r4 = 1
            e.e.d.h.i<T> r5 = r6.f16731s     // Catch:{ all -> 0x004e }
            int r5 = java.lang.System.identityHashCode(r5)     // Catch:{ all -> 0x004e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x004e }
            r3[r4] = r5     // Catch:{ all -> 0x004e }
            r4 = 2
            if (r0 != 0) goto L_0x0035
            r0 = 0
            goto L_0x003d
        L_0x0035:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x004e }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x004e }
        L_0x003d:
            r3[r4] = r0     // Catch:{ all -> 0x004e }
            p174e.p247e.p253d.p258e.C6071a.m22861I(r1, r2, r3)     // Catch:{ all -> 0x004e }
            e.e.d.h.i<T> r0 = r6.f16731s     // Catch:{ all -> 0x004e }
            r0.mo18092d()     // Catch:{ all -> 0x004e }
            super.finalize()
            return
        L_0x004b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            super.finalize()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p253d.p261h.C6093c.finalize():void");
    }

    /* renamed from: n0 */
    public C6088a<T> clone() {
        return this;
    }
}
