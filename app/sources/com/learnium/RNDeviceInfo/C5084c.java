package com.learnium.RNDeviceInfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.learnium.RNDeviceInfo.c */
public class C5084c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static Class<?> f14425a;

    /* renamed from: b */
    private static Class<?> f14426b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Class<?> f14427c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final SharedPreferences f14428d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Object f14429e;

    /* renamed from: f */
    private Object f14430f;

    /* renamed from: com.learnium.RNDeviceInfo.c$b */
    private class C5086b implements InvocationHandler {
        private C5086b() {
        }

        /* renamed from: a */
        public void mo15540a() {
            Log.d("RNInstallReferrerClient", "InstallReferrerService disconnected");
        }

        /* renamed from: b */
        public void mo15541b(int i) {
            String str;
            if (i != 0) {
                if (i == 1) {
                    str = "SERVICE_UNAVAILABLE";
                } else if (i == 2) {
                    str = "FEATURE_NOT_SUPPORTED";
                } else {
                    return;
                }
                Log.d("InstallReferrerState", str);
                return;
            }
            try {
                Log.d("InstallReferrerState", "OK");
                Object invoke = C5084c.f14425a.getMethod("getInstallReferrer", new Class[0]).invoke(C5084c.this.f14429e, new Object[0]);
                SharedPreferences.Editor edit = C5084c.this.f14428d.edit();
                edit.putString("installReferrer", (String) C5084c.f14427c.getMethod("getInstallReferrer", new Class[0]).invoke(invoke, new Object[0]));
                edit.apply();
                C5084c.f14425a.getMethod("endConnection", new Class[0]).invoke(C5084c.this.f14429e, new Object[0]);
            } catch (Exception e) {
                PrintStream printStream = System.err;
                printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e.getMessage());
                e.printStackTrace(System.err);
            }
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            try {
                if (name.equals("onInstallReferrerSetupFinished") && objArr != null && (objArr[0] instanceof Integer)) {
                    mo15541b(objArr[0].intValue());
                    return null;
                } else if (!name.equals("onInstallReferrerServiceDisconnected")) {
                    return null;
                } else {
                    mo15540a();
                    return null;
                }
            } catch (Exception e) {
                throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
            }
        }
    }

    static {
        try {
            f14425a = Class.forName("e.c.a.a.a");
            f14426b = Class.forName("e.c.a.a.b");
            f14427c = Class.forName("e.c.a.a.c");
        } catch (Exception unused) {
            System.err.println("RNInstallReferrerClient exception. 'installreferrer' APIs are unavailable.");
        }
    }

    C5084c(Context context) {
        this.f14428d = context.getSharedPreferences("react-native-device-info", 0);
        Class<?> cls = f14425a;
        if (cls != null && f14426b != null && f14427c != null) {
            try {
                Object invoke = cls.getMethod("newBuilder", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
                this.f14429e = invoke.getClass().getMethod("build", new Class[0]).invoke(invoke, new Object[0]);
                this.f14430f = Proxy.newProxyInstance(f14426b.getClassLoader(), new Class[]{f14426b}, new C5086b());
                f14425a.getMethod("startConnection", new Class[]{f14426b}).invoke(this.f14429e, new Object[]{this.f14430f});
            } catch (Exception e) {
                PrintStream printStream = System.err;
                printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e.getMessage());
                e.printStackTrace(System.err);
            }
        }
    }
}
