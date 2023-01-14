package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.p132m.C3743a;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import p174e.p319f.p320a.p335c.p345f.p352g.C6999sc;
import p174e.p319f.p320a.p335c.p345f.p352g.C7003t0;

/* renamed from: com.google.android.gms.measurement.internal.q4 */
final class C4015q4 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C7003t0 f11202f;

    /* renamed from: o */
    final /* synthetic */ ServiceConnection f11203o;

    /* renamed from: p */
    final /* synthetic */ C4027r4 f11204p;

    C4015q4(C4027r4 r4Var, C7003t0 t0Var, ServiceConnection serviceConnection) {
        this.f11204p = r4Var;
        this.f11202f = t0Var;
        this.f11203o = serviceConnection;
    }

    public final void run() {
        Bundle bundle;
        C4098x3 r;
        String str;
        C4027r4 r4Var = this.f11204p;
        C4039s4 s4Var = r4Var.f11227b;
        String a = r4Var.f11226a;
        C7003t0 t0Var = this.f11202f;
        ServiceConnection serviceConnection = this.f11203o;
        s4Var.f11264a.mo11934a().mo11931h();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", a);
        try {
            bundle = t0Var.mo20120f(bundle2);
            if (bundle == null) {
                s4Var.f11264a.mo11935b().mo12544r().mo12476a("Install Referrer Service returned a null response");
                bundle = null;
            }
        } catch (Exception e) {
            s4Var.f11264a.mo11935b().mo12544r().mo12477b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        s4Var.f11264a.mo11934a().mo11931h();
        C3955l5.m14979t();
        if (bundle != null) {
            long j = bundle.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                r = s4Var.f11264a.mo11935b().mo12549w();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    r = s4Var.f11264a.mo11935b().mo12544r();
                    str = "No referrer defined in Install Referrer response";
                } else {
                    s4Var.f11264a.mo11935b().mo12548v().mo12477b("InstallReferrer API result", string);
                    C4105xa N = s4Var.f11264a.mo12161N();
                    Uri parse = Uri.parse("?".concat(string));
                    C6999sc.m26505b();
                    boolean B = s4Var.f11264a.mo12181z().mo12010B((String) null, C3966m3.f11013n0);
                    C6999sc.m26505b();
                    Bundle t0 = N.mo12522t0(parse, B, s4Var.f11264a.mo12181z().mo12010B((String) null, C3966m3.f11019q0));
                    if (t0 == null) {
                        r = s4Var.f11264a.mo11935b().mo12544r();
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = t0.getString(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM);
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                r = s4Var.f11264a.mo11935b().mo12544r();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                t0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == s4Var.f11264a.mo12154F().f11111g.mo12147a()) {
                            s4Var.f11264a.mo11935b().mo12548v().mo12476a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (s4Var.f11264a.mo12174o()) {
                            s4Var.f11264a.mo12154F().f11111g.mo12148b(j);
                            s4Var.f11264a.mo11935b().mo12548v().mo12477b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            t0.putString("_cis", "referrer API v2");
                            s4Var.f11264a.mo12156I().mo12380t("auto", "_cmp", t0, a);
                        }
                    }
                }
            }
            r.mo12476a(str);
        }
        C3743a.m14478b().mo11714c(s4Var.f11264a.mo11938f(), serviceConnection);
    }
}
