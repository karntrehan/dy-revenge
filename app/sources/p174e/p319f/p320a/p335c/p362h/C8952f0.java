package p174e.p319f.p320a.p335c.p362h;

/* renamed from: e.f.a.c.h.f0 */
final class C8952f0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C8963l f24360f;

    /* renamed from: o */
    final /* synthetic */ C8954g0 f24361o;

    C8952f0(C8954g0 g0Var, C8963l lVar) {
        this.f24361o = g0Var;
        this.f24360f = lVar;
    }

    public final void run() {
        synchronized (this.f24361o.f24363b) {
            C8954g0 g0Var = this.f24361o;
            if (g0Var.f24364c != null) {
                g0Var.f24364c.mo16116a(this.f24360f.mo22776l());
            }
        }
    }
}
