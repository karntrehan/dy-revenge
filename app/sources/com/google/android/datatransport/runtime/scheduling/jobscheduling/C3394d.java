package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import p174e.p319f.p320a.p322b.p323i.C6583p;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d */
public final /* synthetic */ class C3394d implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C3417u f9615f;

    /* renamed from: o */
    public final /* synthetic */ C6583p f9616o;

    /* renamed from: p */
    public final /* synthetic */ int f9617p;

    /* renamed from: q */
    public final /* synthetic */ Runnable f9618q;

    public /* synthetic */ C3394d(C3417u uVar, C6583p pVar, int i, Runnable runnable) {
        this.f9615f = uVar;
        this.f9616o = pVar;
        this.f9617p = i;
        this.f9618q = runnable;
    }

    public final void run() {
        this.f9615f.mo11018t(this.f9616o, this.f9617p, this.f9618q);
    }
}
