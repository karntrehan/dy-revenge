package com.swmansion.reanimated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.swmansion.reanimated.b */
public class C9909b {
    /* renamed from: a */
    public static int m33754a(ReadableMap readableMap, String str, String str2) {
        try {
            return readableMap.getInt(str);
        } catch (NoSuchKeyException unused) {
            throw new JSApplicationCausedNativeException(str2);
        }
    }

    /* renamed from: b */
    public static String m33755b(ReadableMap readableMap, String str, String str2) {
        try {
            return readableMap.getString(str);
        } catch (NoSuchKeyException unused) {
            throw new JSApplicationCausedNativeException(str2);
        }
    }
}
