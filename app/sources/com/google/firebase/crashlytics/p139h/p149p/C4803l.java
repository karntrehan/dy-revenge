package com.google.firebase.crashlytics.p139h.p149p;

import com.google.firebase.crashlytics.p139h.p142j.C4606v;
import com.google.firebase.crashlytics.p139h.p149p.C4792d;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.h.p.l */
class C4803l implements C4799h {
    C4803l() {
    }

    /* renamed from: b */
    private static C4792d.C4793a m18359b(JSONObject jSONObject) {
        return new C4792d.C4793a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    /* renamed from: c */
    private static C4792d.C4794b m18360c(JSONObject jSONObject) {
        return new C4792d.C4794b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: d */
    private static long m18361d(C4606v vVar, long j, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : vVar.mo14142a() + (j * 1000);
    }

    /* renamed from: a */
    public C4792d mo14692a(C4606v vVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", 3600);
        return new C4792d(m18361d(vVar, (long) optInt2, jSONObject2), m18360c(jSONObject2.has("session") ? jSONObject2.getJSONObject("session") : new JSONObject()), m18359b(jSONObject2.getJSONObject("features")), optInt, optInt2, jSONObject2.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject2.optDouble("on_demand_backoff_base", 1.2d), jSONObject2.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
