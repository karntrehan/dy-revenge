package p174e.p319f.p320a.p335c.p345f.p352g;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C3851d5;
import p174e.p319f.p320a.p335c.p343d.C6636b;

/* renamed from: e.f.a.c.f.g.u1 */
final class C7020u1 extends C6861k2 {

    /* renamed from: r */
    final /* synthetic */ String f18978r;

    /* renamed from: s */
    final /* synthetic */ String f18979s;

    /* renamed from: t */
    final /* synthetic */ Context f18980t;

    /* renamed from: u */
    final /* synthetic */ Bundle f18981u;

    /* renamed from: v */
    final /* synthetic */ C7037v2 f18982v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7020u1(C7037v2 v2Var, String str, String str2, Context context, Bundle bundle) {
        super(v2Var, true);
        this.f18982v = v2Var;
        this.f18978r = str;
        this.f18979s = str2;
        this.f18980t = context;
        this.f18981u = bundle;
    }

    /* renamed from: a */
    public final void mo19485a() {
        String str;
        String str2;
        String str3;
        try {
            if (C7037v2.m26768l(this.f18978r, this.f18979s)) {
                String str4 = this.f18979s;
                str2 = this.f18978r;
                str = str4;
                str3 = this.f18982v.f18999b;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            C3705r.m14346k(this.f18980t);
            C7037v2 v2Var = this.f18982v;
            v2Var.f19007j = v2Var.mo20306q(this.f18980t, true);
            if (this.f18982v.f19007j == null) {
                Log.w(this.f18982v.f18999b, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.m14548a(this.f18980t, ModuleDescriptor.MODULE_ID);
            int b = DynamiteModule.m14549b(this.f18980t, ModuleDescriptor.MODULE_ID);
            ((C6779f1) C3705r.m14346k(this.f18982v.f19007j)).initialize(C6636b.m25276Y(this.f18980t), new C6924o1(68000, (long) Math.max(a, b), b < a, str3, str2, str, this.f18981u, C3851d5.m14684a(this.f18980t)), this.f18574f);
        } catch (Exception e) {
            this.f18982v.m26765i(e, true, false);
        }
    }
}
