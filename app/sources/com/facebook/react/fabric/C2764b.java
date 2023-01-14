package com.facebook.react.fabric;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.C3294a;

/* renamed from: com.facebook.react.fabric.b */
public class C2764b {

    /* renamed from: a */
    private static volatile boolean f7829a = false;

    /* renamed from: a */
    public static void m11078a() {
        if (!f7829a) {
            C3294a.m12881c(0, "FabricSoLoader.staticInit::load:fabricjni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
            SoLoader.m12782j("fabricjni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
            C3294a.m12885g(0);
            f7829a = true;
        }
    }
}
