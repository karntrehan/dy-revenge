package com.facebook.react.uimanager;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.uimanager.events.C2953g;
import com.facebook.react.uimanager.p121k1.C2996a;

/* renamed from: com.facebook.react.uimanager.u0 */
public class C3051u0 {

    /* renamed from: a */
    private static final String f8491a = "com.facebook.react.uimanager.u0";

    /* renamed from: a */
    public static C2945d m12084a(ReactContext reactContext, int i) {
        if (reactContext.isBridgeless()) {
            if (reactContext instanceof C3031o0) {
                reactContext = ((C3031o0) reactContext).mo9807b();
            }
            return ((C2953g) reactContext).getEventDispatcher();
        }
        UIManager g = m12090g(reactContext, i, false);
        if (g == null) {
            String str = f8491a;
            ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Unable to find UIManager for UIManagerType " + i));
            return null;
        }
        C2945d dVar = (C2945d) g.getEventDispatcher();
        if (dVar == null) {
            String str2 = f8491a;
            ReactSoftExceptionLogger.logSoftException(str2, new IllegalStateException("Cannot get EventDispatcher for UIManagerType " + i));
        }
        return dVar;
    }

    /* renamed from: b */
    public static C2945d m12085b(ReactContext reactContext, int i) {
        C2945d a = m12084a(reactContext, C2996a.m11878a(i));
        if (a == null) {
            String str = f8491a;
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot get EventDispatcher for reactTag " + i));
        }
        return a;
    }

    /* renamed from: c */
    public static ReactContext m12086c(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    /* renamed from: d */
    public static int m12087d(Context context) {
        if (context instanceof C3031o0) {
            return ((C3031o0) context).mo9808c();
        }
        return -1;
    }

    /* renamed from: e */
    public static int m12088e(View view) {
        int id = view.getId();
        if (C2996a.m11878a(id) == 1) {
            return -1;
        }
        Context context = view.getContext();
        if (!(context instanceof C3031o0) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        int d = m12087d(context);
        if (d == -1) {
            String str = f8491a;
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Fabric View [" + id + "] does not have SurfaceId associated with it"));
        }
        return d;
    }

    /* renamed from: f */
    public static UIManager m12089f(ReactContext reactContext, int i) {
        return m12090g(reactContext, i, true);
    }

    /* renamed from: g */
    private static UIManager m12090g(ReactContext reactContext, int i, boolean z) {
        Object nativeModule;
        String str;
        ReactNoCrashSoftException reactNoCrashSoftException;
        Class cls = UIManagerModule.class;
        if (reactContext.isBridgeless()) {
            UIManager uIManager = (UIManager) reactContext.getJSIModule(JSIModuleType.UIManager);
            if (uIManager != null) {
                return uIManager;
            }
            str = f8491a;
            reactNoCrashSoftException = new ReactNoCrashSoftException("Cannot get UIManager because the instance hasn't been initialized yet.");
        } else if (!reactContext.hasCatalystInstance()) {
            str = f8491a;
            reactNoCrashSoftException = new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain a CatalystInstance.");
        } else {
            if (!reactContext.hasActiveReactInstance()) {
                ReactSoftExceptionLogger.logSoftException(f8491a, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
                if (z) {
                    return null;
                }
            }
            CatalystInstance catalystInstance = reactContext.getCatalystInstance();
            if (i == 2) {
                try {
                    nativeModule = catalystInstance.getJSIModule(JSIModuleType.UIManager);
                } catch (IllegalArgumentException unused) {
                    String str2 = f8491a;
                    ReactSoftExceptionLogger.logSoftException(str2, new ReactNoCrashSoftException("Cannot get UIManager for UIManagerType: " + i));
                    return (UIManager) catalystInstance.getNativeModule(cls);
                }
            } else {
                nativeModule = catalystInstance.getNativeModule(cls);
            }
            return (UIManager) nativeModule;
        }
        ReactSoftExceptionLogger.logSoftException(str, reactNoCrashSoftException);
        return null;
    }

    /* renamed from: h */
    public static UIManager m12091h(ReactContext reactContext, int i) {
        return m12089f(reactContext, C2996a.m11878a(i));
    }
}
