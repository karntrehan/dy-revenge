package p027c.p043d.p044a;

import java.util.concurrent.atomic.AtomicReference;
import p027c.p043d.p044a.C1532f1;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: c.d.a.z */
public final /* synthetic */ class C1730z implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C1532f1.C1534b f5149f;

    /* renamed from: o */
    public final /* synthetic */ C9172b f5150o;

    /* renamed from: p */
    public final /* synthetic */ AtomicReference f5151p;

    public /* synthetic */ C1730z(C1532f1.C1534b bVar, C9172b bVar2, AtomicReference atomicReference) {
        this.f5149f = bVar;
        this.f5150o = bVar2;
        this.f5151p = atomicReference;
    }

    public final void run() {
        this.f5149f.mo5662f(this.f5150o, this.f5151p);
    }
}
