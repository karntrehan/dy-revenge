package com.google.firebase.crashlytics.p139h.p143k;

import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p142j.C4577n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.k.d */
class C4617d {

    /* renamed from: a */
    private final Map<String, String> f13064a = new HashMap();

    /* renamed from: b */
    private final int f13065b;

    /* renamed from: c */
    private final int f13066c;

    public C4617d(int i, int i2) {
        this.f13065b = i;
        this.f13066c = i2;
    }

    /* renamed from: b */
    private String m17563b(String str) {
        if (str != null) {
            return m17564c(str, this.f13066c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: c */
    public static String m17564c(String str, int i) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i ? trim.substring(0, i) : trim;
    }

    /* renamed from: a */
    public synchronized Map<String, String> mo14243a() {
        return Collections.unmodifiableMap(new HashMap(this.f13064a));
    }

    /* renamed from: d */
    public synchronized boolean mo14244d(String str, String str2) {
        String b = m17563b(str);
        if (this.f13064a.size() >= this.f13065b) {
            if (!this.f13064a.containsKey(b)) {
                C4542f f = C4542f.m17259f();
                f.mo14112k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f13065b);
                return false;
            }
        }
        String c = m17564c(str2, this.f13066c);
        if (C4577n.m17369A(this.f13064a.get(b), c)) {
            return false;
        }
        Map<String, String> map = this.f13064a;
        if (str2 == null) {
            c = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        map.put(b, c);
        return true;
    }

    /* renamed from: e */
    public synchronized void mo14245e(Map<String, String> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            String b = m17563b((String) next.getKey());
            if (this.f13064a.size() >= this.f13065b) {
                if (!this.f13064a.containsKey(b)) {
                    i++;
                }
            }
            String str = (String) next.getValue();
            this.f13064a.put(b, str == null ? HttpUrl.FRAGMENT_ENCODE_SET : m17564c(str, this.f13066c));
        }
        if (i > 0) {
            C4542f f = C4542f.m17259f();
            f.mo14112k("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f13065b);
        }
    }
}
