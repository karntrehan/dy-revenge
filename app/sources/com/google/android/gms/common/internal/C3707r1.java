package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.r1 */
final class C3707r1 implements ServiceConnection, C3719v1 {

    /* renamed from: a */
    private final Map<ServiceConnection, ServiceConnection> f10369a = new HashMap();

    /* renamed from: b */
    private int f10370b = 2;

    /* renamed from: c */
    private boolean f10371c;

    /* renamed from: d */
    private IBinder f10372d;

    /* renamed from: e */
    private final C3704q1 f10373e;

    /* renamed from: f */
    private ComponentName f10374f;

    /* renamed from: g */
    final /* synthetic */ C3716u1 f10375g;

    public C3707r1(C3716u1 u1Var, C3704q1 q1Var) {
        this.f10375g = u1Var;
        this.f10373e = q1Var;
    }

    /* renamed from: a */
    public final int mo11657a() {
        return this.f10370b;
    }

    /* renamed from: b */
    public final ComponentName mo11658b() {
        return this.f10374f;
    }

    /* renamed from: c */
    public final IBinder mo11659c() {
        return this.f10372d;
    }

    /* renamed from: d */
    public final void mo11660d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f10369a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void mo11661e(String str, Executor executor) {
        this.f10370b = 3;
        C3716u1 u1Var = this.f10375g;
        boolean d = u1Var.f10395j.mo11715d(u1Var.f10392g, str, this.f10373e.mo11652c(u1Var.f10392g), this, this.f10373e.mo11650a(), executor);
        this.f10371c = d;
        if (d) {
            this.f10375g.f10393h.sendMessageDelayed(this.f10375g.f10393h.obtainMessage(1, this.f10373e), this.f10375g.f10397l);
            return;
        }
        this.f10370b = 2;
        try {
            C3716u1 u1Var2 = this.f10375g;
            u1Var2.f10395j.mo11714c(u1Var2.f10392g, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: f */
    public final void mo11662f(ServiceConnection serviceConnection, String str) {
        this.f10369a.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void mo11663g(String str) {
        this.f10375g.f10393h.removeMessages(1, this.f10373e);
        C3716u1 u1Var = this.f10375g;
        u1Var.f10395j.mo11714c(u1Var.f10392g, this);
        this.f10371c = false;
        this.f10370b = 2;
    }

    /* renamed from: h */
    public final boolean mo11664h(ServiceConnection serviceConnection) {
        return this.f10369a.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean mo11665i() {
        return this.f10369a.isEmpty();
    }

    /* renamed from: j */
    public final boolean mo11666j() {
        return this.f10371c;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f10375g.f10391f) {
            this.f10375g.f10393h.removeMessages(1, this.f10373e);
            this.f10372d = iBinder;
            this.f10374f = componentName;
            for (ServiceConnection onServiceConnected : this.f10369a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f10370b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f10375g.f10391f) {
            this.f10375g.f10393h.removeMessages(1, this.f10373e);
            this.f10372d = null;
            this.f10374f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f10369a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f10370b = 2;
        }
    }
}
