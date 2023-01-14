package com.facebook.hermes.instrumentation;

import com.facebook.soloader.SoLoader;

public class HermesSamplingProfiler {
    static {
        SoLoader.m12782j("jsijniprofiler");
    }

    public static native void disable();

    public static native void dumpSampledTraceToFile(String str);

    public static native void enable();
}
