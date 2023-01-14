package com.learnium.RNDeviceInfo.p166d;

import android.content.Context;

/* renamed from: com.learnium.RNDeviceInfo.d.a */
public class C5087a {

    /* renamed from: a */
    private final Context f14432a;

    public C5087a(Context context) {
        this.f14432a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo15543a() {
        Object invoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        return (String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo15544b() {
        Object invoke = Class.forName("e.f.a.c.e.a").getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{this.f14432a});
        return (String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000c */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo15545c() {
        /*
            r2 = this;
            java.lang.String r0 = r2.mo15543a()     // Catch:{ ClassNotFoundException -> 0x000c, IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0005 }
            return r0
        L_0x0005:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "N/A: Unsupported version of com.google.firebase:firebase-iid in your project."
            r0.println(r1)
        L_0x000c:
            java.lang.String r0 = r2.mo15544b()     // Catch:{ ClassNotFoundException -> 0x0018, IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0011 }
            return r0
        L_0x0011:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "N/A: Unsupported version of com.google.android.gms.iid in your project."
            r0.println(r1)
        L_0x0018:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Can't generate id. Please add com.google.firebase:firebase-iid to your project."
            r0.println(r1)
            java.lang.String r0 = "unknown"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.learnium.RNDeviceInfo.p166d.C5087a.mo15545c():java.lang.String");
    }
}
