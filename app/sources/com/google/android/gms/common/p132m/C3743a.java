package com.google.android.gms.common.p132m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.C3719v1;
import com.google.android.gms.common.p133n.C3746c;
import com.google.android.gms.common.util.C3765l;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.m.a */
public class C3743a {

    /* renamed from: a */
    private static final Object f10430a = new Object();

    /* renamed from: b */
    private static volatile C3743a f10431b;

    /* renamed from: c */
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f10432c = new ConcurrentHashMap<>();

    private C3743a() {
    }

    /* renamed from: b */
    public static C3743a m14478b() {
        if (f10431b == null) {
            synchronized (f10430a) {
                if (f10431b == null) {
                    f10431b = new C3743a();
                }
            }
        }
        C3743a aVar = f10431b;
        C3705r.m14346k(aVar);
        return aVar;
    }

    /* renamed from: e */
    private static void m14479e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m14480f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C3746c.m14493a(context).mo11717b(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m14481g(serviceConnection)) {
            return m14482h(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection putIfAbsent = this.f10432c.putIfAbsent(serviceConnection, serviceConnection);
        if (!(putIfAbsent == null || serviceConnection == putIfAbsent)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean h = m14482h(context, intent, serviceConnection, i, executor);
            if (h) {
                return h;
            }
            return false;
        } finally {
            this.f10432c.remove(serviceConnection, serviceConnection);
        }
    }

    /* renamed from: g */
    private static boolean m14481g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof C3719v1);
    }

    /* renamed from: h */
    private static final boolean m14482h(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        return (!C3765l.m14532j() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
    }

    /* renamed from: a */
    public boolean mo11713a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m14480f(context, context.getClass().getName(), intent, serviceConnection, i, true, (Executor) null);
    }

    /* renamed from: c */
    public void mo11714c(Context context, ServiceConnection serviceConnection) {
        if (!m14481g(serviceConnection) || !this.f10432c.containsKey(serviceConnection)) {
            m14479e(context, serviceConnection);
            return;
        }
        try {
            m14479e(context, this.f10432c.get(serviceConnection));
        } finally {
            this.f10432c.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean mo11715d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        return m14480f(context, str, intent, serviceConnection, i, true, executor);
    }
}
