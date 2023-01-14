package com.google.firebase.crashlytics.p139h.p140h;

import android.os.Bundle;
import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p141i.C4550a;
import com.google.firebase.crashlytics.p139h.p141i.C4551b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.h.h.d */
public class C4547d implements C4545b, C4551b {

    /* renamed from: a */
    private C4550a f12885a;

    /* renamed from: b */
    private static String m17280b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: a */
    public void mo14083a(C4550a aVar) {
        this.f12885a = aVar;
        C4542f.m17259f().mo14104b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    /* renamed from: l */
    public void mo14114l(String str, Bundle bundle) {
        C4550a aVar = this.f12885a;
        if (aVar != null) {
            try {
                aVar.mo14115a("$A$:" + m17280b(str, bundle));
            } catch (JSONException unused) {
                C4542f.m17259f().mo14112k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
