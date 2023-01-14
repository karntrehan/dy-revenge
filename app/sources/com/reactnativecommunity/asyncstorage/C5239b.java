package com.reactnativecommunity.asyncstorage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: com.reactnativecommunity.asyncstorage.b */
public class C5239b {
    /* renamed from: a */
    static WritableMap m19566a(String str) {
        return m19567b(str, "Database Error");
    }

    /* renamed from: b */
    static WritableMap m19567b(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str2);
        if (str != null) {
            createMap.putString("key", str);
        }
        return createMap;
    }

    /* renamed from: c */
    static WritableMap m19568c(String str) {
        return m19567b(str, "Invalid key");
    }

    /* renamed from: d */
    static WritableMap m19569d(String str) {
        return m19567b(str, "Invalid Value");
    }
}
