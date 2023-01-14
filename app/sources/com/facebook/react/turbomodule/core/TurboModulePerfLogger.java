package com.facebook.react.turbomodule.core;

import com.facebook.react.perflogger.NativeModulePerfLogger;
import com.facebook.soloader.SoLoader;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class TurboModulePerfLogger {
    private static boolean sIsSoLibraryLoaded = false;
    private static NativeModulePerfLogger sNativeModulePerfLogger;

    public static void enableLogging(NativeModulePerfLogger nativeModulePerfLogger) {
        if (nativeModulePerfLogger != null) {
            sNativeModulePerfLogger = nativeModulePerfLogger;
            maybeLoadSoLibrary();
            jniEnableCppLogging(nativeModulePerfLogger);
        }
    }

    private static native void jniEnableCppLogging(NativeModulePerfLogger nativeModulePerfLogger);

    private static synchronized void maybeLoadSoLibrary() {
        synchronized (TurboModulePerfLogger.class) {
            if (!sIsSoLibraryLoaded) {
                SoLoader.m12782j("turbomodulejsijni");
                sIsSoLibraryLoaded = true;
            }
        }
    }

    public static void moduleCreateCacheHit(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.mo9326d(str, i);
        }
    }

    public static void moduleCreateConstructEnd(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.mo9327e(str, i);
        }
    }

    public static void moduleCreateConstructStart(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.mo9328f(str, i);
        }
    }

    public static void moduleCreateEnd(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.mo9329g(str, i);
        }
    }

    public static void moduleCreateFail(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.mo9330h(str, i);
        }
    }

    public static void moduleCreateSetUpEnd(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.mo9331i(str, i);
        }
    }

    public static void moduleCreateSetUpStart(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.mo9332j(str, i);
        }
    }

    public static void moduleCreateStart(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.mo9333k(str, i);
        }
    }

    public static void moduleDataCreateEnd(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.mo9334l(str, i);
        }
    }

    public static void moduleDataCreateStart(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.mo9335m(str, i);
        }
    }
}
