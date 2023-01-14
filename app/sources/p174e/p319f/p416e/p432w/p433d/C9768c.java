package p174e.p319f.p416e.p432w.p433d;

import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p420s.C9680b;

/* renamed from: e.f.e.w.d.c */
final class C9768c {

    /* renamed from: a */
    private final C9680b f26166a;

    /* renamed from: b */
    private final C9670p f26167b;

    /* renamed from: c */
    private final C9670p f26168c;

    /* renamed from: d */
    private final C9670p f26169d;

    /* renamed from: e */
    private final C9670p f26170e;

    /* renamed from: f */
    private final int f26171f;

    /* renamed from: g */
    private final int f26172g;

    /* renamed from: h */
    private final int f26173h;

    /* renamed from: i */
    private final int f26174i;

    C9768c(C9680b bVar, C9670p pVar, C9670p pVar2, C9670p pVar3, C9670p pVar4) {
        boolean z = false;
        boolean z2 = pVar == null || pVar2 == null;
        z = (pVar3 == null || pVar4 == null) ? true : z;
        if (!z2 || !z) {
            if (z2) {
                pVar = new C9670p(0.0f, pVar3.mo24231d());
                pVar2 = new C9670p(0.0f, pVar4.mo24231d());
            } else if (z) {
                pVar3 = new C9670p((float) (bVar.mo24271m() - 1), pVar.mo24231d());
                pVar4 = new C9670p((float) (bVar.mo24271m() - 1), pVar2.mo24231d());
            }
            this.f26166a = bVar;
            this.f26167b = pVar;
            this.f26168c = pVar2;
            this.f26169d = pVar3;
            this.f26170e = pVar4;
            this.f26171f = (int) Math.min(pVar.mo24230c(), pVar2.mo24230c());
            this.f26172g = (int) Math.max(pVar3.mo24230c(), pVar4.mo24230c());
            this.f26173h = (int) Math.min(pVar.mo24231d(), pVar3.mo24231d());
            this.f26174i = (int) Math.max(pVar2.mo24231d(), pVar4.mo24231d());
            return;
        }
        throw C9664j.m32854a();
    }

    C9768c(C9768c cVar) {
        this.f26166a = cVar.f26166a;
        this.f26167b = cVar.mo24451h();
        this.f26168c = cVar.mo24445b();
        this.f26169d = cVar.mo24452i();
        this.f26170e = cVar.mo24446c();
        this.f26171f = cVar.mo24449f();
        this.f26172g = cVar.mo24447d();
        this.f26173h = cVar.mo24450g();
        this.f26174i = cVar.mo24448e();
    }

    /* renamed from: j */
    static C9768c m33311j(C9768c cVar, C9768c cVar2) {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new C9768c(cVar.f26166a, cVar.f26167b, cVar.f26168c, cVar2.f26169d, cVar2.f26170e);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p174e.p319f.p416e.p432w.p433d.C9768c mo24444a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            e.f.e.p r0 = r12.f26167b
            e.f.e.p r1 = r12.f26168c
            e.f.e.p r2 = r12.f26169d
            e.f.e.p r3 = r12.f26170e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.mo24231d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            e.f.e.p r13 = new e.f.e.p
            float r4 = r4.mo24230c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            e.f.e.p r13 = r12.f26168c
            goto L_0x0034
        L_0x0032:
            e.f.e.p r13 = r12.f26170e
        L_0x0034:
            float r0 = r13.mo24231d()
            int r0 = (int) r0
            int r0 = r0 + r14
            e.f.e.s.b r14 = r12.f26166a
            int r14 = r14.mo24268j()
            if (r0 < r14) goto L_0x004a
            e.f.e.s.b r14 = r12.f26166a
            int r14 = r14.mo24268j()
            int r0 = r14 + -1
        L_0x004a:
            e.f.e.p r14 = new e.f.e.p
            float r13 = r13.mo24230c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            e.f.e.w.d.c r13 = new e.f.e.w.d.c
            e.f.e.s.b r7 = r12.f26166a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p432w.p433d.C9768c.mo24444a(int, int, boolean):e.f.e.w.d.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C9670p mo24445b() {
        return this.f26168c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C9670p mo24446c() {
        return this.f26170e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo24447d() {
        return this.f26172g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo24448e() {
        return this.f26174i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo24449f() {
        return this.f26171f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo24450g() {
        return this.f26173h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C9670p mo24451h() {
        return this.f26167b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C9670p mo24452i() {
        return this.f26169d;
    }
}
