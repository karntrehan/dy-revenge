package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.h */
public abstract class C3672h {

    /* renamed from: a */
    private static int f10308a = 4225;

    /* renamed from: b */
    private static final Object f10309b = new Object();

    /* renamed from: c */
    private static C3716u1 f10310c = null;

    /* renamed from: d */
    static HandlerThread f10311d = null;

    /* renamed from: e */
    private static boolean f10312e = false;

    /* renamed from: a */
    public static int m14271a() {
        return f10308a;
    }

    /* renamed from: b */
    public static C3672h m14272b(Context context) {
        synchronized (f10309b) {
            if (f10310c == null) {
                f10310c = new C3716u1(context.getApplicationContext(), f10312e ? m14273c().getLooper() : context.getMainLooper());
            }
        }
        return f10310c;
    }

    /* renamed from: c */
    public static HandlerThread m14273c() {
        synchronized (f10309b) {
            HandlerThread handlerThread = f10311d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f10311d = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f10311d;
            return handlerThread3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo11600d(C3704q1 q1Var, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void mo11601e(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        mo11600d(new C3704q1(str, str2, i, z), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo11602f(C3704q1 q1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
