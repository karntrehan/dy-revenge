package com.mrousavy.camera.p168n0;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.n0.c */
public final class C5174c {
    /* renamed from: a */
    private static final ReadableMap m19446a(Throwable th) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", th.getMessage());
        createMap.putString("stacktrace", C10248b.m34835b(th));
        if (th.getCause() != null) {
            Throwable cause = th.getCause();
            C10457l.m35317b(cause);
            createMap.putMap("cause", m19446a(cause));
        }
        C10457l.m35319d(createMap, "map");
        return createMap;
    }

    /* renamed from: b */
    public static final ReadableMap m19447b(String str, String str2, Throwable th, WritableMap writableMap) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("code", str);
        createMap.putString("message", str2);
        createMap.putMap("cause", th != null ? m19446a(th) : null);
        createMap.putMap("userInfo", writableMap);
        C10457l.m35319d(createMap, "map");
        return createMap;
    }

    /* renamed from: c */
    public static /* synthetic */ ReadableMap m19448c(String str, String str2, Throwable th, WritableMap writableMap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            writableMap = null;
        }
        return m19447b(str, str2, th, writableMap);
    }
}
