package androidx.camera.core;

import java.util.concurrent.Executor;
import p027c.p061g.p062a.C1814b;

/* renamed from: androidx.camera.core.g */
public final /* synthetic */ class C0684g implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0989v1 f2142f;

    /* renamed from: o */
    public final /* synthetic */ Executor f2143o;

    /* renamed from: p */
    public final /* synthetic */ long f2144p;

    /* renamed from: q */
    public final /* synthetic */ C1814b.C1815a f2145q;

    public /* synthetic */ C0684g(C0989v1 v1Var, Executor executor, long j, C1814b.C1815a aVar) {
        this.f2142f = v1Var;
        this.f2143o = executor;
        this.f2144p = j;
        this.f2145q = aVar;
    }

    public final void run() {
        this.f2142f.mo3265j(this.f2143o, this.f2144p, this.f2145q);
    }
}
