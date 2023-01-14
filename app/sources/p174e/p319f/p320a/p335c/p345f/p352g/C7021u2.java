package p174e.p319f.p320a.p335c.p345f.p352g;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: e.f.a.c.f.g.u2 */
final class C7021u2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    final /* synthetic */ C7037v2 f18983f;

    C7021u2(C7037v2 v2Var) {
        this.f18983f = v2Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f18983f.m26767k(new C6893m2(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f18983f.m26767k(new C7005t2(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f18983f.m26767k(new C6941p2(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f18983f.m26767k(new C6925o2(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C6711b1 b1Var = new C6711b1();
        this.f18983f.m26767k(new C6989s2(this, activity, b1Var));
        Bundle k = b1Var.mo19556k(50);
        if (k != null) {
            bundle.putAll(k);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f18983f.m26767k(new C6909n2(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f18983f.m26767k(new C6973r2(this, activity));
    }
}
