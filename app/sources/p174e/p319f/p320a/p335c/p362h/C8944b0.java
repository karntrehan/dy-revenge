package p174e.p319f.p320a.p335c.p362h;

/* renamed from: e.f.a.c.h.b0 */
final class C8944b0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C8963l f24350f;

    /* renamed from: o */
    final /* synthetic */ C8946c0 f24351o;

    C8944b0(C8946c0 c0Var, C8963l lVar) {
        this.f24351o = c0Var;
        this.f24350f = lVar;
    }

    public final void run() {
        synchronized (this.f24351o.f24353b) {
            C8946c0 c0Var = this.f24351o;
            if (c0Var.f24354c != null) {
                c0Var.f24354c.mo11417a(this.f24350f);
            }
        }
    }
}
