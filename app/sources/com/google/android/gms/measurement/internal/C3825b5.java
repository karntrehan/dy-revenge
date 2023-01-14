package com.google.android.gms.measurement.internal;

import java.util.Map;
import p174e.p319f.p320a.p335c.p345f.p352g.C7079xc;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
final class C3825b5 implements C7079xc {

    /* renamed from: a */
    final /* synthetic */ String f10537a;

    /* renamed from: b */
    final /* synthetic */ C3838c5 f10538b;

    C3825b5(C3838c5 c5Var, String str) {
        this.f10538b = c5Var;
        this.f10537a = str;
    }

    /* renamed from: a */
    public final String mo11860a(String str) {
        Map map = (Map) this.f10538b.f10560d.get(this.f10537a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
