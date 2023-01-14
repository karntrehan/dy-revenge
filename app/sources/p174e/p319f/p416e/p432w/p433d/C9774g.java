package p174e.p319f.p416e.p432w.p433d;

/* renamed from: e.f.e.w.d.g */
class C9774g {

    /* renamed from: a */
    private final C9768c f26195a;

    /* renamed from: b */
    private final C9769d[] f26196b;

    C9774g(C9768c cVar) {
        this.f26195a = new C9768c(cVar);
        this.f26196b = new C9769d[((cVar.mo24448e() - cVar.mo24450g()) + 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C9768c mo24473a() {
        return this.f26195a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C9769d mo24474b(int i) {
        return this.f26196b[mo24477e(i)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C9769d mo24475c(int i) {
        C9769d dVar;
        C9769d dVar2;
        C9769d b = mo24474b(i);
        if (b != null) {
            return b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int e = mo24477e(i) - i2;
            if (e >= 0 && (dVar2 = this.f26196b[e]) != null) {
                return dVar2;
            }
            int e2 = mo24477e(i) + i2;
            C9769d[] dVarArr = this.f26196b;
            if (e2 < dVarArr.length && (dVar = dVarArr[e2]) != null) {
                return dVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C9769d[] mo24476d() {
        return this.f26196b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo24477e(int i) {
        return i - this.f26195a.mo24450g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo24478f(int i, C9769d dVar) {
        this.f26196b[mo24477e(i)] = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r11 = this;
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            e.f.e.w.d.d[] r1 = r11.f26196b     // Catch:{ all -> 0x0054 }
            int r2 = r1.length     // Catch:{ all -> 0x0054 }
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000b:
            if (r4 >= r2) goto L_0x004c
            r6 = r1[r4]     // Catch:{ all -> 0x0054 }
            r7 = 1
            if (r6 != 0) goto L_0x0023
            java.lang.String r6 = "%3d:    |   %n"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0054 }
            int r8 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r7[r3] = r5     // Catch:{ all -> 0x0054 }
            r0.format(r6, r7)     // Catch:{ all -> 0x0054 }
            r5 = r8
            goto L_0x0049
        L_0x0023:
            java.lang.String r8 = "%3d: %3d|%3d%n"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0054 }
            int r10 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r9[r3] = r5     // Catch:{ all -> 0x0054 }
            int r5 = r6.mo24455c()     // Catch:{ all -> 0x0054 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r9[r7] = r5     // Catch:{ all -> 0x0054 }
            r5 = 2
            int r6 = r6.mo24457e()     // Catch:{ all -> 0x0054 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0054 }
            r9[r5] = r6     // Catch:{ all -> 0x0054 }
            r0.format(r8, r9)     // Catch:{ all -> 0x0054 }
            r5 = r10
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x004c:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0054 }
            r0.close()
            return r1
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x005f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p432w.p433d.C9774g.toString():java.lang.String");
    }
}
