package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.lwansbrough.RCTCamera.RCTCameraModule;

/* renamed from: com.google.android.gms.measurement.internal.eb */
public final class C3870eb {

    /* renamed from: a */
    private final C3955l5 f10659a;

    public C3870eb(C3955l5 l5Var) {
        this.f10659a = l5Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11944a(String str, Bundle bundle) {
        String str2;
        this.f10659a.mo11934a().mo11931h();
        if (!this.f10659a.mo12174o()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f10659a.mo12154F().f11126v.mo12239b(str2);
                this.f10659a.mo12154F().f11127w.mo12148b(this.f10659a.mo11936c().mo11730a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11945b() {
        this.f10659a.mo11934a().mo11931h();
        if (mo11947d()) {
            if (mo11948e()) {
                this.f10659a.mo12154F().f11126v.mo12239b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM, "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f10659a.mo12156I().mo12381u("auto", "_cmpx", bundle);
            } else {
                String a = this.f10659a.mo12154F().f11126v.mo12238a();
                if (TextUtils.isEmpty(a)) {
                    this.f10659a.mo11935b().mo12546t().mo12476a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((this.f10659a.mo12154F().f11127w.mo12147a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    Object obj = pair.first;
                    this.f10659a.mo12156I().mo12381u(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f10659a.mo12154F().f11126v.mo12239b((String) null);
            }
            this.f10659a.mo12154F().f11127w.mo12148b(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo11946c() {
        if (mo11947d() && mo11948e()) {
            this.f10659a.mo12154F().f11126v.mo12239b((String) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo11947d() {
        return this.f10659a.mo12154F().f11127w.mo12147a() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo11948e() {
        return mo11947d() && this.f10659a.mo11936c().mo11730a() - this.f10659a.mo12154F().f11127w.mo12147a() > this.f10659a.mo12181z().mo12024r((String) null, C3966m3.f10978S);
    }
}
