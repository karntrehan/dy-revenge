package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.ka */
final class C6869ka implements C6981ra {

    /* renamed from: a */
    private final C6805ga f18594a;

    /* renamed from: b */
    private final C6854jb f18595b;

    /* renamed from: c */
    private final boolean f18596c;

    /* renamed from: d */
    private final C6915n8 f18597d;

    private C6869ka(C6854jb jbVar, C6915n8 n8Var, C6805ga gaVar) {
        this.f18595b = jbVar;
        this.f18596c = n8Var.mo20000c(gaVar);
        this.f18597d = n8Var;
        this.f18594a = gaVar;
    }

    /* renamed from: j */
    static C6869ka m26069j(C6854jb jbVar, C6915n8 n8Var, C6805ga gaVar) {
        return new C6869ka(jbVar, n8Var, gaVar);
    }

    /* renamed from: a */
    public final int mo19892a(Object obj) {
        C6854jb jbVar = this.f18595b;
        int b = jbVar.mo19902b(jbVar.mo19903c(obj));
        if (!this.f18596c) {
            return b;
        }
        this.f18597d.mo19998a(obj);
        throw null;
    }

    /* renamed from: b */
    public final void mo19893b(Object obj) {
        this.f18595b.mo19907g(obj);
        this.f18597d.mo19999b(obj);
    }

    /* renamed from: c */
    public final Object mo19894c() {
        return this.f18594a.mo19517e().mo19766e0();
    }

    /* renamed from: d */
    public final int mo19895d(Object obj) {
        int hashCode = this.f18595b.mo19903c(obj).hashCode();
        if (!this.f18596c) {
            return hashCode;
        }
        this.f18597d.mo19998a(obj);
        throw null;
    }

    /* renamed from: e */
    public final void mo19896e(Object obj, Object obj2) {
        C7013ta.m26584f(this.f18595b, obj, obj2);
        if (this.f18596c) {
            C7013ta.m26583e(this.f18597d, obj, obj2);
        }
    }

    /* renamed from: f */
    public final boolean mo19897f(Object obj) {
        this.f18597d.mo19998a(obj);
        throw null;
    }

    /* renamed from: g */
    public final void mo19898g(Object obj, C6739cc ccVar) {
        this.f18597d.mo19998a(obj);
        throw null;
    }

    /* renamed from: h */
    public final void mo19899h(Object obj, byte[] bArr, int i, int i2, C6882l7 l7Var) {
        C6702a9 a9Var = (C6702a9) obj;
        if (a9Var.zzc == C6870kb.m26079c()) {
            a9Var.zzc = C6870kb.m26081e();
        }
        C7091y8 y8Var = (C7091y8) obj;
        throw null;
    }

    /* renamed from: i */
    public final boolean mo19900i(Object obj, Object obj2) {
        if (!this.f18595b.mo19903c(obj).equals(this.f18595b.mo19903c(obj2))) {
            return false;
        }
        if (!this.f18596c) {
            return true;
        }
        this.f18597d.mo19998a(obj);
        this.f18597d.mo19998a(obj2);
        throw null;
    }
}
