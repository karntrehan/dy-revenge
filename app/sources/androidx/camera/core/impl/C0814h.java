package androidx.camera.core.impl;

import java.util.concurrent.Executor;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.h */
public final /* synthetic */ class C0814h implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ Executor f2415f;

    /* renamed from: o */
    public final /* synthetic */ C9172b f2416o;

    /* renamed from: p */
    public final /* synthetic */ C1814b.C1815a f2417p;

    /* renamed from: q */
    public final /* synthetic */ long f2418q;

    public /* synthetic */ C0814h(Executor executor, C9172b bVar, C1814b.C1815a aVar, long j) {
        this.f2415f = executor;
        this.f2416o = bVar;
        this.f2417p = aVar;
        this.f2418q = j;
    }

    public final void run() {
        this.f2415f.execute(new C0803f(this.f2416o, this.f2417p, this.f2418q));
    }
}
