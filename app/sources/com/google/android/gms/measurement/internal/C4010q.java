package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C3705r;
import p174e.p319f.p320a.p335c.p345f.p352g.C6694a1;

/* renamed from: com.google.android.gms.measurement.internal.q */
abstract class C4010q {

    /* renamed from: a */
    private static volatile Handler f11180a;

    /* renamed from: b */
    private final C3891g6 f11181b;

    /* renamed from: c */
    private final Runnable f11182c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile long f11183d;

    C4010q(C3891g6 g6Var) {
        C3705r.m14346k(g6Var);
        this.f11181b = g6Var;
        this.f11182c = new C3998p(this, g6Var);
    }

    /* renamed from: f */
    private final Handler m15213f() {
        Handler handler;
        if (f11180a != null) {
            return f11180a;
        }
        synchronized (C4010q.class) {
            if (f11180a == null) {
                f11180a = new C6694a1(this.f11181b.mo11938f().getMainLooper());
            }
            handler = f11180a;
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12311b() {
        this.f11183d = 0;
        m15213f().removeCallbacks(this.f11182c);
    }

    /* renamed from: c */
    public abstract void mo12312c();

    /* renamed from: d */
    public final void mo12313d(long j) {
        mo12311b();
        if (j >= 0) {
            this.f11183d = this.f11181b.mo11936c().mo11730a();
            if (!m15213f().postDelayed(this.f11182c, j)) {
                this.f11181b.mo11935b().mo12544r().mo12477b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo12314e() {
        return this.f11183d != 0;
    }
}
