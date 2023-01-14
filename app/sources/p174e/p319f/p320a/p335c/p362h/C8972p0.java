package p174e.p319f.p320a.p335c.p362h;

import java.util.concurrent.Callable;

/* renamed from: e.f.a.c.h.p0 */
final class C8972p0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C8970o0 f24385f;

    /* renamed from: o */
    final /* synthetic */ Callable f24386o;

    C8972p0(C8970o0 o0Var, Callable callable) {
        this.f24385f = o0Var;
        this.f24386o = callable;
    }

    public final void run() {
        try {
            this.f24385f.mo22790s(this.f24386o.call());
        } catch (Exception e) {
            this.f24385f.mo22789r(e);
        } catch (Throwable th) {
            this.f24385f.mo22789r(new RuntimeException(th));
        }
    }
}
