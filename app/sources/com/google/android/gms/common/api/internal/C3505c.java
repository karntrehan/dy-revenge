package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C3765l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.c */
public final class C3505c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f */
    private static final C3505c f9900f = new C3505c();

    /* renamed from: o */
    private final AtomicBoolean f9901o = new AtomicBoolean();

    /* renamed from: p */
    private final AtomicBoolean f9902p = new AtomicBoolean();

    /* renamed from: q */
    private final ArrayList<C3506a> f9903q = new ArrayList<>();

    /* renamed from: r */
    private boolean f9904r = false;

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public interface C3506a {
        /* renamed from: a */
        void mo11265a(boolean z);
    }

    private C3505c() {
    }

    /* renamed from: b */
    public static C3505c m13613b() {
        return f9900f;
    }

    /* renamed from: c */
    public static void m13614c(Application application) {
        C3505c cVar = f9900f;
        synchronized (cVar) {
            if (!cVar.f9904r) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f9904r = true;
            }
        }
    }

    /* renamed from: f */
    private final void m13615f(boolean z) {
        synchronized (f9900f) {
            Iterator<C3506a> it = this.f9903q.iterator();
            while (it.hasNext()) {
                it.next().mo11265a(z);
            }
        }
    }

    /* renamed from: a */
    public void mo11269a(C3506a aVar) {
        synchronized (f9900f) {
            this.f9903q.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean mo11270d() {
        return this.f9901o.get();
    }

    @TargetApi(16)
    /* renamed from: e */
    public boolean mo11271e(boolean z) {
        if (!this.f9902p.get()) {
            if (!C3765l.m14525c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f9902p.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f9901o.set(true);
            }
        }
        return mo11270d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f9901o.compareAndSet(true, false);
        this.f9902p.set(true);
        if (compareAndSet) {
            m13615f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f9901o.compareAndSet(true, false);
        this.f9902p.set(true);
        if (compareAndSet) {
            m13615f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f9901o.compareAndSet(false, true)) {
            this.f9902p.set(true);
            m13615f(true);
        }
    }
}
