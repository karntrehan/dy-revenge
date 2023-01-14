package p174e.p319f.p320a.p335c.p362h;

import com.google.android.gms.common.internal.C3705r;

/* renamed from: e.f.a.c.h.d0 */
final class C8948d0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C8963l f24355f;

    /* renamed from: o */
    final /* synthetic */ C8950e0 f24356o;

    C8948d0(C8950e0 e0Var, C8963l lVar) {
        this.f24356o = e0Var;
        this.f24355f = lVar;
    }

    public final void run() {
        synchronized (this.f24356o.f24358b) {
            C8950e0 e0Var = this.f24356o;
            if (e0Var.f24359c != null) {
                e0Var.f24359c.mo14987b((Exception) C3705r.m14346k(this.f24355f.mo22775k()));
            }
        }
    }
}
