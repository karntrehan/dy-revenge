package p027c.p058e.p059a;

import android.content.res.ColorStateList;

/* renamed from: c.e.a.c */
class C1780c implements C1784f {
    C1780c() {
    }

    /* renamed from: n */
    private C1785g m7518n(C1783e eVar) {
        return (C1785g) eVar.mo6088e();
    }

    /* renamed from: a */
    public void mo6070a(C1783e eVar, float f) {
        m7518n(eVar).mo6098h(f);
    }

    /* renamed from: b */
    public float mo6071b(C1783e eVar) {
        return eVar.mo6089f().getElevation();
    }

    /* renamed from: c */
    public float mo6072c(C1783e eVar) {
        return m7518n(eVar).mo6092d();
    }

    /* renamed from: d */
    public void mo6073d(C1783e eVar) {
        mo6081m(eVar, mo6075f(eVar));
    }

    /* renamed from: e */
    public void mo6074e(C1783e eVar, float f) {
        eVar.mo6089f().setElevation(f);
    }

    /* renamed from: f */
    public float mo6075f(C1783e eVar) {
        return m7518n(eVar).mo6091c();
    }

    /* renamed from: g */
    public ColorStateList mo6076g(C1783e eVar) {
        return m7518n(eVar).mo6090b();
    }

    /* renamed from: h */
    public void mo6068h() {
    }

    /* renamed from: i */
    public float mo6077i(C1783e eVar) {
        return mo6072c(eVar) * 2.0f;
    }

    /* renamed from: j */
    public float mo6078j(C1783e eVar) {
        return mo6072c(eVar) * 2.0f;
    }

    /* renamed from: k */
    public void mo6079k(C1783e eVar) {
        mo6081m(eVar, mo6075f(eVar));
    }

    /* renamed from: l */
    public void mo6080l(C1783e eVar, ColorStateList colorStateList) {
        m7518n(eVar).mo6094f(colorStateList);
    }

    /* renamed from: m */
    public void mo6081m(C1783e eVar, float f) {
        m7518n(eVar).mo6095g(f, eVar.mo6087d(), eVar.mo6086c());
        mo6082o(eVar);
    }

    /* renamed from: o */
    public void mo6082o(C1783e eVar) {
        if (!eVar.mo6087d()) {
            eVar.mo6084a(0, 0, 0, 0);
            return;
        }
        float f = mo6075f(eVar);
        float c = mo6072c(eVar);
        int ceil = (int) Math.ceil((double) C1786h.m7579c(f, c, eVar.mo6086c()));
        int ceil2 = (int) Math.ceil((double) C1786h.m7580d(f, c, eVar.mo6086c()));
        eVar.mo6084a(ceil, ceil2, ceil, ceil2);
    }
}
