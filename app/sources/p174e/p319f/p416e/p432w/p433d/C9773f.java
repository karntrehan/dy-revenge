package p174e.p319f.p416e.p432w.p433d;

/* renamed from: e.f.e.w.d.f */
final class C9773f {

    /* renamed from: a */
    private final C9766a f26191a;

    /* renamed from: b */
    private final C9774g[] f26192b;

    /* renamed from: c */
    private C9768c f26193c;

    /* renamed from: d */
    private final int f26194d;

    C9773f(C9766a aVar, C9768c cVar) {
        this.f26191a = aVar;
        int a = aVar.mo24437a();
        this.f26194d = a;
        this.f26193c = cVar;
        this.f26192b = new C9774g[(a + 2)];
    }

    /* renamed from: a */
    private void m33338a(C9774g gVar) {
        if (gVar != null) {
            ((C9775h) gVar).mo24480g(this.f26191a);
        }
    }

    /* renamed from: b */
    private static boolean m33339b(C9769d dVar, C9769d dVar2) {
        if (dVar2 == null || !dVar2.mo24459g() || dVar2.mo24453a() != dVar.mo24453a()) {
            return false;
        }
        dVar.mo24461i(dVar2.mo24455c());
        return true;
    }

    /* renamed from: c */
    private static int m33340c(int i, int i2, C9769d dVar) {
        if (dVar == null || dVar.mo24459g()) {
            return i2;
        }
        if (!dVar.mo24460h(i)) {
            return i2 + 1;
        }
        dVar.mo24461i(i);
        return 0;
    }

    /* renamed from: d */
    private int m33341d() {
        int f = m33343f();
        if (f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f26194d + 1; i++) {
            C9769d[] d = this.f26192b[i].mo24476d();
            for (int i2 = 0; i2 < d.length; i2++) {
                if (d[i2] != null && !d[i2].mo24459g()) {
                    m33342e(i, i2, d);
                }
            }
        }
        return f;
    }

    /* renamed from: e */
    private void m33342e(int i, int i2, C9769d[] dVarArr) {
        C9769d dVar = dVarArr[i2];
        C9769d[] d = this.f26192b[i - 1].mo24476d();
        C9774g[] gVarArr = this.f26192b;
        int i3 = i + 1;
        C9769d[] d2 = gVarArr[i3] != null ? gVarArr[i3].mo24476d() : d;
        C9769d[] dVarArr2 = new C9769d[14];
        dVarArr2[2] = d[i2];
        dVarArr2[3] = d2[i2];
        int i4 = 0;
        if (i2 > 0) {
            int i5 = i2 - 1;
            dVarArr2[0] = dVarArr[i5];
            dVarArr2[4] = d[i5];
            dVarArr2[5] = d2[i5];
        }
        if (i2 > 1) {
            int i6 = i2 - 2;
            dVarArr2[8] = dVarArr[i6];
            dVarArr2[10] = d[i6];
            dVarArr2[11] = d2[i6];
        }
        if (i2 < dVarArr.length - 1) {
            int i7 = i2 + 1;
            dVarArr2[1] = dVarArr[i7];
            dVarArr2[6] = d[i7];
            dVarArr2[7] = d2[i7];
        }
        if (i2 < dVarArr.length - 2) {
            int i8 = i2 + 2;
            dVarArr2[9] = dVarArr[i8];
            dVarArr2[12] = d[i8];
            dVarArr2[13] = d2[i8];
        }
        while (i4 < 14 && !m33339b(dVar, dVarArr2[i4])) {
            i4++;
        }
    }

    /* renamed from: f */
    private int m33343f() {
        m33344g();
        return m33345h() + m33346i();
    }

    /* renamed from: g */
    private void m33344g() {
        C9774g[] gVarArr = this.f26192b;
        if (gVarArr[0] != null && gVarArr[this.f26194d + 1] != null) {
            C9769d[] d = gVarArr[0].mo24476d();
            C9769d[] d2 = this.f26192b[this.f26194d + 1].mo24476d();
            for (int i = 0; i < d.length; i++) {
                if (!(d[i] == null || d2[i] == null || d[i].mo24455c() != d2[i].mo24455c())) {
                    for (int i2 = 1; i2 <= this.f26194d; i2++) {
                        C9769d dVar = this.f26192b[i2].mo24476d()[i];
                        if (dVar != null) {
                            dVar.mo24461i(d[i].mo24455c());
                            if (!dVar.mo24459g()) {
                                this.f26192b[i2].mo24476d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private int m33345h() {
        C9774g[] gVarArr = this.f26192b;
        if (gVarArr[0] == null) {
            return 0;
        }
        C9769d[] d = gVarArr[0].mo24476d();
        int i = 0;
        for (int i2 = 0; i2 < d.length; i2++) {
            if (d[i2] != null) {
                int c = d[i2].mo24455c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f26194d + 1 && i3 < 2; i4++) {
                    C9769d dVar = this.f26192b[i4].mo24476d()[i2];
                    if (dVar != null) {
                        i3 = m33340c(c, i3, dVar);
                        if (!dVar.mo24459g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    private int m33346i() {
        C9774g[] gVarArr = this.f26192b;
        int i = this.f26194d;
        if (gVarArr[i + 1] == null) {
            return 0;
        }
        C9769d[] d = gVarArr[i + 1].mo24476d();
        int i2 = 0;
        for (int i3 = 0; i3 < d.length; i3++) {
            if (d[i3] != null) {
                int c = d[i3].mo24455c();
                int i4 = 0;
                for (int i5 = this.f26194d + 1; i5 > 0 && i4 < 2; i5--) {
                    C9769d dVar = this.f26192b[i5].mo24476d()[i3];
                    if (dVar != null) {
                        i4 = m33340c(c, i4, dVar);
                        if (!dVar.mo24459g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo24464j() {
        return this.f26194d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo24465k() {
        return this.f26191a.mo24438b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo24466l() {
        return this.f26191a.mo24439c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C9768c mo24467m() {
        return this.f26193c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C9774g mo24468n(int i) {
        return this.f26192b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C9774g[] mo24469o() {
        m33338a(this.f26192b[0]);
        m33338a(this.f26192b[this.f26194d + 1]);
        int i = 928;
        while (true) {
            int d = m33341d();
            if (d > 0 && d < i) {
                i = d;
            }
        }
        return this.f26192b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo24470p(C9768c cVar) {
        this.f26193c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo24471q(int i, C9774g gVar) {
        this.f26192b[i] = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            e.f.e.w.d.g[] r0 = r10.f26192b
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x000d
            int r2 = r10.f26194d
            int r2 = r2 + r3
            r2 = r0[r2]
        L_0x000d:
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r4 = 0
        L_0x0013:
            e.f.e.w.d.d[] r5 = r2.mo24476d()     // Catch:{ all -> 0x007c }
            int r5 = r5.length     // Catch:{ all -> 0x007c }
            if (r4 >= r5) goto L_0x0074
            java.lang.String r5 = "CW %3d:"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x007c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007c }
            r6[r1] = r7     // Catch:{ all -> 0x007c }
            r0.format(r5, r6)     // Catch:{ all -> 0x007c }
            r5 = 0
        L_0x0028:
            int r6 = r10.f26194d     // Catch:{ all -> 0x007c }
            r7 = 2
            int r6 = r6 + r7
            if (r5 >= r6) goto L_0x006a
            e.f.e.w.d.g[] r6 = r10.f26192b     // Catch:{ all -> 0x007c }
            r8 = r6[r5]     // Catch:{ all -> 0x007c }
            java.lang.String r9 = "    |   "
            if (r8 != 0) goto L_0x003c
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007c }
            r0.format(r9, r6)     // Catch:{ all -> 0x007c }
            goto L_0x0067
        L_0x003c:
            r6 = r6[r5]     // Catch:{ all -> 0x007c }
            e.f.e.w.d.d[] r6 = r6.mo24476d()     // Catch:{ all -> 0x007c }
            r6 = r6[r4]     // Catch:{ all -> 0x007c }
            if (r6 != 0) goto L_0x004c
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007c }
            r0.format(r9, r6)     // Catch:{ all -> 0x007c }
            goto L_0x0067
        L_0x004c:
            java.lang.String r8 = " %3d|%3d"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x007c }
            int r9 = r6.mo24455c()     // Catch:{ all -> 0x007c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x007c }
            r7[r1] = r9     // Catch:{ all -> 0x007c }
            int r6 = r6.mo24457e()     // Catch:{ all -> 0x007c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x007c }
            r7[r3] = r6     // Catch:{ all -> 0x007c }
            r0.format(r8, r7)     // Catch:{ all -> 0x007c }
        L_0x0067:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x006a:
            java.lang.String r5 = "%n"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007c }
            r0.format(r5, r6)     // Catch:{ all -> 0x007c }
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0074:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x007c }
            r0.close()
            return r1
        L_0x007c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007e }
        L_0x007e:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0087:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p432w.p433d.C9773f.toString():java.lang.String");
    }
}
