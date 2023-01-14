package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.C3627d;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3651c;
import com.google.android.gms.common.internal.C3672h;
import com.google.android.gms.common.internal.C3678j;
import com.google.android.gms.common.internal.C3705r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.k */
public final class C3546k implements C3469a.C3478f, ServiceConnection {

    /* renamed from: a */
    private static final String f10003a = C3546k.class.getSimpleName();

    /* renamed from: b */
    private final String f10004b;

    /* renamed from: c */
    private final String f10005c;

    /* renamed from: d */
    private final ComponentName f10006d;

    /* renamed from: e */
    private final Context f10007e;

    /* renamed from: f */
    private final C3516e f10008f;

    /* renamed from: g */
    private final Handler f10009g;

    /* renamed from: h */
    private final C3550l f10010h;

    /* renamed from: i */
    private IBinder f10011i;

    /* renamed from: j */
    private boolean f10012j;

    /* renamed from: k */
    private String f10013k;

    /* renamed from: l */
    private String f10014l;

    /* renamed from: x */
    private final void m13769x() {
        if (Thread.currentThread() != this.f10009g.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    /* renamed from: y */
    private final void m13770y(String str) {
        String.valueOf(this.f10011i).length();
    }

    /* renamed from: a */
    public final boolean mo11186a() {
        m13769x();
        return this.f10011i != null;
    }

    /* renamed from: b */
    public final boolean mo11135b() {
        return false;
    }

    /* renamed from: c */
    public final Set<Scope> mo11187c() {
        return Collections.emptySet();
    }

    /* renamed from: d */
    public final void mo11188d(C3678j jVar, Set<Scope> set) {
    }

    /* renamed from: e */
    public final void mo11189e(String str) {
        m13769x();
        this.f10013k = str;
        mo11193i();
    }

    /* renamed from: f */
    public final boolean mo11190f() {
        m13769x();
        return this.f10012j;
    }

    /* renamed from: g */
    public final String mo11191g() {
        String str = this.f10004b;
        if (str != null) {
            return str;
        }
        C3705r.m14346k(this.f10006d);
        return this.f10006d.getPackageName();
    }

    /* renamed from: h */
    public final void mo11192h(C3651c.C3654c cVar) {
        m13769x();
        m13770y("Connect started.");
        if (mo11186a()) {
            try {
                mo11189e("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f10006d;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f10004b).setAction(this.f10005c);
            }
            boolean bindService = this.f10007e.bindService(intent, this, C3672h.m14271a());
            this.f10012j = bindService;
            if (!bindService) {
                this.f10011i = null;
                this.f10010h.mo11295k(new C3623b(16));
            }
            m13770y("Finished connect.");
        } catch (SecurityException e) {
            this.f10012j = false;
            this.f10011i = null;
            throw e;
        }
    }

    /* renamed from: i */
    public final void mo11193i() {
        m13769x();
        m13770y("Disconnect called.");
        try {
            this.f10007e.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f10012j = false;
        this.f10011i = null;
    }

    /* renamed from: j */
    public final void mo11194j(C3651c.C3656e eVar) {
    }

    /* renamed from: k */
    public final void mo11195k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: l */
    public final boolean mo11196l() {
        return false;
    }

    /* renamed from: n */
    public final int mo11136n() {
        return 0;
    }

    /* renamed from: o */
    public final C3627d[] mo11197o() {
        return new C3627d[0];
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f10009g.post(new C3593v1(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10009g.post(new C3589u1(this));
    }

    /* renamed from: r */
    public final String mo11198r() {
        return this.f10013k;
    }

    /* renamed from: s */
    public final Intent mo11138s() {
        return new Intent();
    }

    /* renamed from: t */
    public final boolean mo11199t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ void mo11378u() {
        this.f10012j = false;
        this.f10011i = null;
        m13770y("Disconnected.");
        this.f10008f.mo11294j(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ void mo11379v(IBinder iBinder) {
        this.f10012j = false;
        this.f10011i = iBinder;
        m13770y("Connected.");
        this.f10008f.mo11296m(new Bundle());
    }

    /* renamed from: w */
    public final void mo11380w(String str) {
        this.f10014l = str;
    }
}
