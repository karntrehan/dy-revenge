package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.k2 */
abstract class C6861k2 implements Runnable {

    /* renamed from: f */
    final long f18574f;

    /* renamed from: o */
    final long f18575o;

    /* renamed from: p */
    final boolean f18576p;

    /* renamed from: q */
    final /* synthetic */ C7037v2 f18577q;

    C6861k2(C7037v2 v2Var, boolean z) {
        this.f18577q = v2Var;
        this.f18574f = v2Var.f19000c.mo11730a();
        this.f18575o = v2Var.f19000c.mo11731b();
        this.f18576p = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo19485a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19486b() {
    }

    public final void run() {
        if (this.f18577q.f19005h) {
            mo19486b();
            return;
        }
        try {
            mo19485a();
        } catch (Exception e) {
            this.f18577q.m26765i(e, false, this.f18576p);
            mo19486b();
        }
    }
}
