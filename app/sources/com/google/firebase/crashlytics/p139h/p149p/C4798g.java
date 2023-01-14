package com.google.firebase.crashlytics.p139h.p149p;

import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p142j.C4606v;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.h.p.g */
public class C4798g {

    /* renamed from: a */
    private final C4606v f13525a;

    C4798g(C4606v vVar) {
        this.f13525a = vVar;
    }

    /* renamed from: a */
    private static C4799h m18353a(int i) {
        if (i == 3) {
            return new C4803l();
        }
        C4542f f = C4542f.m17259f();
        f.mo14106d("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
        return new C4790b();
    }

    /* renamed from: b */
    public C4792d mo14704b(JSONObject jSONObject) {
        return m18353a(jSONObject.getInt("settings_version")).mo14692a(this.f13525a, jSONObject);
    }
}
