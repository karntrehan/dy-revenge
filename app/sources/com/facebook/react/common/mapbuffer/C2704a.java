package com.facebook.react.common.mapbuffer;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.C3294a;

/* renamed from: com.facebook.react.common.mapbuffer.a */
public class C2704a {

    /* renamed from: a */
    private static volatile boolean f7800a = false;

    /* renamed from: a */
    public static void m10970a() {
        if (!f7800a) {
            C3294a.m12881c(0, "ReadableMapBufferSoLoader.staticInit::load:mapbufferjni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_START);
            SoLoader.m12782j("mapbufferjni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_END);
            C3294a.m12885g(0);
            f7800a = true;
        }
    }
}
