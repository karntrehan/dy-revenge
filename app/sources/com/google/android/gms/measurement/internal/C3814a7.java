package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.C3705r;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.measurement.internal.a7 */
final class C3814a7 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Bundle f10512f;

    /* renamed from: o */
    final /* synthetic */ C4030r7 f10513o;

    C3814a7(C4030r7 r7Var, Bundle bundle) {
        this.f10513o = r7Var;
        this.f10512f = bundle;
    }

    public final void run() {
        C4030r7 r7Var = this.f10513o;
        Bundle bundle = this.f10512f;
        r7Var.mo11931h();
        r7Var.mo11949i();
        C3705r.m14346k(bundle);
        String g = C3705r.m14342g(bundle.getString("name"));
        if (!r7Var.f10651a.mo12174o()) {
            r7Var.f10651a.mo11935b().mo12548v().mo12476a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        C4045sa saVar = new C4045sa(g, 0, (Object) null, HttpUrl.FRAGMENT_ENCODE_SET);
        try {
            C3845d dVar = r4;
            C3845d dVar2 = new C3845d(bundle.getString("app_id"), HttpUrl.FRAGMENT_ENCODE_SET, saVar, bundle.getLong("creation_timestamp"), bundle.getBoolean(AppStateModule.APP_STATE_ACTIVE), bundle.getString("trigger_event_name"), (C4094x) null, bundle.getLong("trigger_timeout"), (C4094x) null, bundle.getLong("time_to_live"), r7Var.f10651a.mo12161N().mo12527w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), HttpUrl.FRAGMENT_ENCODE_SET, bundle.getLong("creation_timestamp"), true, true));
            r7Var.f10651a.mo12159L().mo11999s(dVar);
        } catch (IllegalArgumentException unused) {
        }
    }
}
