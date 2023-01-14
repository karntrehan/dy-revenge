package p174e.p319f.p416e.p432w.p433d;

import p174e.p319f.p416e.C9670p;

/* renamed from: e.f.e.w.d.h */
final class C9775h extends C9774g {

    /* renamed from: c */
    private final boolean f26197c;

    C9775h(C9768c cVar, boolean z) {
        super(cVar);
        this.f26197c = z;
    }

    /* renamed from: h */
    private void m33361h(C9766a aVar) {
        C9768c a = mo24473a();
        C9670p h = this.f26197c ? a.mo24451h() : a.mo24452i();
        C9670p b = this.f26197c ? a.mo24445b() : a.mo24446c();
        int e = mo24477e((int) b.mo24231d());
        C9769d[] d = mo24476d();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int e2 = mo24477e((int) h.mo24231d()); e2 < e; e2++) {
            if (d[e2] != null) {
                C9769d dVar = d[e2];
                dVar.mo24462j();
                int c = dVar.mo24455c() - i;
                if (c == 0) {
                    i2++;
                } else {
                    if (c == 1) {
                        i3 = Math.max(i3, i2);
                    } else if (dVar.mo24455c() >= aVar.mo24439c()) {
                        d[e2] = null;
                    }
                    i = dVar.mo24455c();
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: l */
    private void m33362l(C9769d[] dVarArr, C9766a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            C9769d dVar = dVarArr[i];
            if (dVarArr[i] != null) {
                int e = dVar.mo24457e() % 30;
                int c = dVar.mo24455c();
                if (c > aVar.mo24439c()) {
                    dVarArr[i] = null;
                } else {
                    if (!this.f26197c) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != aVar.mo24437a()) {
                                dVarArr[i] = null;
                            }
                        } else if (e / 3 != aVar.mo24438b() || e % 3 != aVar.mo24440d()) {
                            dVarArr[i] = null;
                        }
                    } else if ((e * 3) + 1 != aVar.mo24441e()) {
                        dVarArr[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private void m33363m() {
        for (C9769d dVar : mo24476d()) {
            if (dVar != null) {
                dVar.mo24462j();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo24480g(C9766a aVar) {
        C9769d[] d = mo24476d();
        m33363m();
        m33362l(d, aVar);
        C9768c a = mo24473a();
        C9670p h = this.f26197c ? a.mo24451h() : a.mo24452i();
        C9670p b = this.f26197c ? a.mo24445b() : a.mo24446c();
        int e = mo24477e((int) h.mo24231d());
        int e2 = mo24477e((int) b.mo24231d());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (e < e2) {
            if (d[e] != null) {
                C9769d dVar = d[e];
                int c = dVar.mo24455c() - i;
                if (c == 0) {
                    i2++;
                } else {
                    if (c == 1) {
                        i3 = Math.max(i3, i2);
                    } else if (c < 0 || dVar.mo24455c() >= aVar.mo24439c() || c > e) {
                        d[e] = null;
                    } else {
                        if (i3 > 2) {
                            c *= i3 - 2;
                        }
                        boolean z = c >= e;
                        for (int i4 = 1; i4 <= c && !z; i4++) {
                            z = d[e - i4] != null;
                        }
                        if (z) {
                            d[e] = null;
                        }
                    }
                    i = dVar.mo24455c();
                    i2 = 1;
                }
            }
            e++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C9766a mo24481i() {
        C9769d[] d = mo24476d();
        C9767b bVar = new C9767b();
        C9767b bVar2 = new C9767b();
        C9767b bVar3 = new C9767b();
        C9767b bVar4 = new C9767b();
        for (C9769d dVar : d) {
            if (dVar != null) {
                dVar.mo24462j();
                int e = dVar.mo24457e() % 30;
                int c = dVar.mo24455c();
                if (!this.f26197c) {
                    c += 2;
                }
                int i = c % 3;
                if (i == 0) {
                    bVar2.mo24443b((e * 3) + 1);
                } else if (i == 1) {
                    bVar4.mo24443b(e / 3);
                    bVar3.mo24443b(e % 3);
                } else if (i == 2) {
                    bVar.mo24443b(e + 1);
                }
            }
        }
        if (bVar.mo24442a().length == 0 || bVar2.mo24442a().length == 0 || bVar3.mo24442a().length == 0 || bVar4.mo24442a().length == 0 || bVar.mo24442a()[0] <= 0 || bVar2.mo24442a()[0] + bVar3.mo24442a()[0] < 3 || bVar2.mo24442a()[0] + bVar3.mo24442a()[0] > 90) {
            return null;
        }
        C9766a aVar = new C9766a(bVar.mo24442a()[0], bVar2.mo24442a()[0], bVar3.mo24442a()[0], bVar4.mo24442a()[0]);
        m33362l(d, aVar);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] mo24482j() {
        int c;
        C9766a i = mo24481i();
        if (i == null) {
            return null;
        }
        m33361h(i);
        int c2 = i.mo24439c();
        int[] iArr = new int[c2];
        for (C9769d dVar : mo24476d()) {
            if (dVar != null && (c = dVar.mo24455c()) < c2) {
                iArr[c] = iArr[c] + 1;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo24483k() {
        return this.f26197c;
    }

    public String toString() {
        return "IsLeft: " + this.f26197c + 10 + super.toString();
    }
}
