package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.z6 */
final class C4125z6 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Bundle f11464f;

    /* renamed from: o */
    final /* synthetic */ C4030r7 f11465o;

    C4125z6(C4030r7 r7Var, Bundle bundle) {
        this.f11465o = r7Var;
        this.f11464f = bundle;
    }

    public final void run() {
        C4030r7 r7Var = this.f11465o;
        Bundle bundle = this.f11464f;
        r7Var.mo11931h();
        r7Var.mo11949i();
        C3705r.m14346k(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C3705r.m14342g(string);
        C3705r.m14342g(string2);
        C3705r.m14346k(bundle.get("value"));
        if (!r7Var.f10651a.mo12174o()) {
            r7Var.f10651a.mo11935b().mo12548v().mo12476a("Conditional property not set since app measurement is disabled");
            return;
        }
        C4045sa saVar = new C4045sa(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C4094x w0 = r7Var.f10651a.mo12161N().mo12527w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, true);
            C4094x w02 = r7Var.f10651a.mo12161N().mo12527w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, true);
            C4094x w03 = r7Var.f10651a.mo12161N().mo12527w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, true);
            r7Var.f10651a.mo12159L().mo11999s(new C3845d(bundle.getString("app_id"), string2, saVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), w02, bundle.getLong("trigger_timeout"), w0, bundle.getLong("time_to_live"), w03));
        } catch (IllegalArgumentException unused) {
        }
    }
}
