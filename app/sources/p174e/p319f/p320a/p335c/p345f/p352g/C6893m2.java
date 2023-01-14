package p174e.p319f.p320a.p335c.p345f.p352g;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3705r;
import p174e.p319f.p320a.p335c.p343d.C6636b;

/* renamed from: e.f.a.c.f.g.m2 */
final class C6893m2 extends C6861k2 {

    /* renamed from: r */
    final /* synthetic */ Bundle f18624r;

    /* renamed from: s */
    final /* synthetic */ Activity f18625s;

    /* renamed from: t */
    final /* synthetic */ C7021u2 f18626t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6893m2(C7021u2 u2Var, Bundle bundle, Activity activity) {
        super(u2Var.f18983f, true);
        this.f18626t = u2Var;
        this.f18624r = bundle;
        this.f18625s = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19485a() {
        Bundle bundle;
        if (this.f18624r != null) {
            bundle = new Bundle();
            if (this.f18624r.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f18624r.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((C6779f1) C3705r.m14346k(this.f18626t.f18983f.f19007j)).onActivityCreated(C6636b.m25276Y(this.f18625s), bundle, this.f18575o);
    }
}
