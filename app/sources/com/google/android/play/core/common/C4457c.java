package com.google.android.play.core.common;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;

/* renamed from: com.google.android.play.core.common.c */
public class C4457c {

    /* renamed from: a */
    private static final Set<String> f12732a = new HashSet(Arrays.asList(new String[]{"app_update", "review"}));

    /* renamed from: b */
    private static final Set<String> f12733b = new HashSet(Arrays.asList(new String[]{"native", "unity"}));

    /* renamed from: c */
    private static final Map<String, Map<String, Integer>> f12734c = new HashMap();

    /* renamed from: d */
    private static final C9101a f12735d = new C9101a("PlayCoreVersion");

    /* renamed from: a */
    public static synchronized Map<String, Integer> m17032a(String str) {
        Map<String, Integer> map;
        synchronized (C4457c.class) {
            Map<String, Map<String, Integer>> map2 = f12734c;
            if (!map2.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 10901);
                map2.put(str, hashMap);
            }
            map = map2.get(str);
        }
        return map;
    }

    /* renamed from: b */
    public static Bundle m17033b(String str) {
        Bundle bundle = new Bundle();
        Map<String, Integer> a = m17032a(str);
        bundle.putInt("playcore_version_code", a.get("java").intValue());
        if (a.containsKey("native")) {
            bundle.putInt("playcore_native_version", a.get("native").intValue());
        }
        if (a.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", a.get("unity").intValue());
        }
        return bundle;
    }
}
