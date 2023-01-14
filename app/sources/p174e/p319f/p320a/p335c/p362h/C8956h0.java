package p174e.p319f.p320a.p335c.p362h;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: e.f.a.c.h.h0 */
final class C8956h0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C8963l f24365f;

    /* renamed from: o */
    final /* synthetic */ C8958i0 f24366o;

    C8956h0(C8958i0 i0Var, C8963l lVar) {
        this.f24366o = i0Var;
        this.f24365f = lVar;
    }

    public final void run() {
        try {
            C8963l a = this.f24366o.f24368b.mo14185a(this.f24365f.mo22776l());
            if (a == null) {
                this.f24366o.mo14987b(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C8967n.f24376b;
            a.mo22771g(executor, this.f24366o);
            a.mo22769e(executor, this.f24366o);
            a.mo22765a(executor, this.f24366o);
        } catch (C8959j e) {
            if (e.getCause() instanceof Exception) {
                this.f24366o.mo14987b((Exception) e.getCause());
            } else {
                this.f24366o.mo14987b(e);
            }
        } catch (CancellationException unused) {
            this.f24366o.mo22759c();
        } catch (Exception e2) {
            this.f24366o.mo14987b(e2);
        }
    }
}
