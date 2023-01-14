package com.facebook.react.modules.storage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: com.facebook.react.modules.storage.b */
public class C2876b {
    /* renamed from: a */
    static WritableMap m11345a(String str) {
        return m11346b(str, "Database Error");
    }

    /* renamed from: b */
    static WritableMap m11346b(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str2);
        if (str != null) {
            createMap.putString("key", str);
        }
        return createMap;
    }

    /* renamed from: c */
    static WritableMap m11347c(String str) {
        return m11346b(str, "Invalid key");
    }

    /* renamed from: d */
    static WritableMap m11348d(String str) {
        return m11346b(str, "Invalid Value");
    }
}
