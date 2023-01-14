package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3705r;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.s */
public final class C4034s {

    /* renamed from: a */
    final String f11253a;

    /* renamed from: b */
    final String f11254b;

    /* renamed from: c */
    final String f11255c;

    /* renamed from: d */
    final long f11256d;

    /* renamed from: e */
    final long f11257e;

    /* renamed from: f */
    final C4070v f11258f;

    C4034s(C3955l5 l5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C4070v vVar;
        C3705r.m14342g(str2);
        C3705r.m14342g(str3);
        this.f11253a = str2;
        this.f11254b = str3;
        this.f11255c = true == TextUtils.isEmpty(str) ? null : str;
        this.f11256d = j;
        this.f11257e = j2;
        if (j2 != 0 && j2 > j) {
            l5Var.mo11935b().mo12549w().mo12477b("Event created with reverse previous/current timestamps. appId", C4122z3.m15469z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            vVar = new C4070v(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    l5Var.mo11935b().mo12544r().mo12476a("Param name can't be null");
                } else {
                    Object o = l5Var.mo12161N().mo12513o(str4, bundle2.get(str4));
                    if (o == null) {
                        l5Var.mo11935b().mo12549w().mo12477b("Param value can't be null", l5Var.mo12152D().mo12439e(str4));
                    } else {
                        l5Var.mo12161N().mo12486C(bundle2, str4, o);
                    }
                }
                it.remove();
            }
            vVar = new C4070v(bundle2);
        }
        this.f11258f = vVar;
    }

    private C4034s(C3955l5 l5Var, String str, String str2, String str3, long j, long j2, C4070v vVar) {
        C3705r.m14342g(str2);
        C3705r.m14342g(str3);
        C3705r.m14346k(vVar);
        this.f11253a = str2;
        this.f11254b = str3;
        this.f11255c = true == TextUtils.isEmpty(str) ? null : str;
        this.f11256d = j;
        this.f11257e = j2;
        if (j2 != 0 && j2 > j) {
            l5Var.mo11935b().mo12549w().mo12478c("Event created with reverse previous/current timestamps. appId, name", C4122z3.m15469z(str2), C4122z3.m15469z(str3));
        }
        this.f11258f = vVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C4034s mo12403a(C3955l5 l5Var, long j) {
        return new C4034s(l5Var, this.f11255c, this.f11253a, this.f11254b, this.f11256d, j, this.f11258f);
    }

    public final String toString() {
        String str = this.f11253a;
        String str2 = this.f11254b;
        String obj = this.f11258f.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + obj + "}";
    }
}
