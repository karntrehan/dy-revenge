package com.google.firebase.crashlytics.p139h.p149p;

import android.text.TextUtils;
import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p142j.C4596q;
import com.google.firebase.crashlytics.p139h.p146m.C4774a;
import com.google.firebase.crashlytics.p139h.p146m.C4775b;
import com.google.firebase.crashlytics.p139h.p146m.C4776c;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.h.p.c */
class C4791c implements C4802k {

    /* renamed from: a */
    private final String f13496a;

    /* renamed from: b */
    private final C4775b f13497b;

    /* renamed from: c */
    private final C4542f f13498c;

    public C4791c(String str, C4775b bVar) {
        this(str, bVar, C4542f.m17259f());
    }

    C4791c(String str, C4775b bVar, C4542f fVar) {
        if (str != null) {
            this.f13498c = fVar;
            this.f13497b = bVar;
            this.f13496a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    /* renamed from: b */
    private C4774a m18324b(C4774a aVar, C4801j jVar) {
        m18325c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", jVar.f13526a);
        m18325c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m18325c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", C4596q.m17480l());
        m18325c(aVar, "Accept", "application/json");
        m18325c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", jVar.f13527b);
        m18325c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", jVar.f13528c);
        m18325c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jVar.f13529d);
        m18325c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", jVar.f13530e.mo14117a());
        return aVar;
    }

    /* renamed from: c */
    private void m18325c(C4774a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.mo14654d(str, str2);
        }
    }

    /* renamed from: e */
    private JSONObject m18326e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            C4542f fVar = this.f13498c;
            fVar.mo14113l("Failed to parse settings JSON from " + this.f13496a, e);
            C4542f fVar2 = this.f13498c;
            fVar2.mo14112k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    private Map<String, String> m18327f(C4801j jVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", jVar.f13533h);
        hashMap.put("display_version", jVar.f13532g);
        hashMap.put("source", Integer.toString(jVar.f13534i));
        String str = jVar.f13531f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: a */
    public JSONObject mo14693a(C4801j jVar, boolean z) {
        if (z) {
            try {
                Map<String, String> f = m18327f(jVar);
                C4774a b = m18324b(mo14694d(f), jVar);
                C4542f fVar = this.f13498c;
                fVar.mo14104b("Requesting settings from " + this.f13496a);
                C4542f fVar2 = this.f13498c;
                fVar2.mo14110i("Settings query params were: " + f);
                return mo14695g(b.mo14653c());
            } catch (IOException e) {
                this.f13498c.mo14107e("Settings request failed.", e);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C4774a mo14694d(Map<String, String> map) {
        C4774a a = this.f13497b.mo14655a(this.f13496a, map);
        return a.mo14654d("User-Agent", "Crashlytics Android SDK/" + C4596q.m17480l()).mo14654d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public JSONObject mo14695g(C4776c cVar) {
        int b = cVar.mo14657b();
        C4542f fVar = this.f13498c;
        fVar.mo14110i("Settings response code was: " + b);
        if (mo14696h(b)) {
            return m18326e(cVar.mo14656a());
        }
        C4542f fVar2 = this.f13498c;
        fVar2.mo14106d("Settings request failed; (status: " + b + ") from " + this.f13496a);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo14696h(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }
}
