package p174e.p319f.p320a.p335c.p362h;

import java.util.concurrent.Executor;

/* renamed from: e.f.a.c.h.x */
final class C8980x implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C8963l f24402f;

    /* renamed from: o */
    final /* synthetic */ C8981y f24403o;

    C8980x(C8981y yVar, C8963l lVar) {
        this.f24403o = yVar;
        this.f24402f = lVar;
    }

    public final void run() {
        try {
            C8963l lVar = (C8963l) this.f24403o.f24405b.mo14079a(this.f24402f);
            if (lVar == null) {
                this.f24403o.mo14987b(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C8967n.f24376b;
            lVar.mo22771g(executor, this.f24403o);
            lVar.mo22769e(executor, this.f24403o);
            lVar.mo22765a(executor, this.f24403o);
        } catch (C8959j e) {
            if (e.getCause() instanceof Exception) {
                this.f24403o.f24406c.mo22789r((Exception) e.getCause());
            } else {
                this.f24403o.f24406c.mo22789r(e);
            }
        } catch (Exception e2) {
            this.f24403o.f24406c.mo22789r(e2);
        }
    }
}
