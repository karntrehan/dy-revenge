package androidx.camera.core;

import android.content.Context;
import java.util.concurrent.Executor;
import p027c.p061g.p062a.C1814b;

/* renamed from: androidx.camera.core.f */
public final /* synthetic */ class C0679f implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0989v1 f2132f;

    /* renamed from: o */
    public final /* synthetic */ Context f2133o;

    /* renamed from: p */
    public final /* synthetic */ Executor f2134p;

    /* renamed from: q */
    public final /* synthetic */ C1814b.C1815a f2135q;

    /* renamed from: r */
    public final /* synthetic */ long f2136r;

    public /* synthetic */ C0679f(C0989v1 v1Var, Context context, Executor executor, C1814b.C1815a aVar, long j) {
        this.f2132f = v1Var;
        this.f2133o = context;
        this.f2134p = executor;
        this.f2135q = aVar;
        this.f2136r = j;
    }

    public final void run() {
        this.f2132f.mo3266l(this.f2133o, this.f2134p, this.f2135q, this.f2136r);
    }
}
