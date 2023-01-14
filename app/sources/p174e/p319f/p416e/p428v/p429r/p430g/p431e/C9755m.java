package p174e.p319f.p416e.p428v.p429r.p430g.p431e;

/* renamed from: e.f.e.v.r.g.e.m */
final class C9755m {

    /* renamed from: a */
    private int f26125a = 0;

    /* renamed from: b */
    private C9756a f26126b = C9756a.NUMERIC;

    /* renamed from: e.f.e.v.r.g.e.m$a */
    private enum C9756a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    C9755m() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo24404a() {
        return this.f26125a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo24405b(int i) {
        this.f26125a += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo24406c() {
        return this.f26126b == C9756a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo24407d() {
        return this.f26126b == C9756a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo24408e() {
        this.f26126b = C9756a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24409f() {
        this.f26126b = C9756a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo24410g() {
        this.f26126b = C9756a.NUMERIC;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo24411h(int i) {
        this.f26125a = i;
    }
}
