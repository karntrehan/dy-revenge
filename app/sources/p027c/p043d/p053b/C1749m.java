package p027c.p043d.p053b;

import android.view.Surface;
import androidx.camera.core.C1011z2;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: c.d.b.m */
public final /* synthetic */ class C1749m implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C1773y f5178f;

    /* renamed from: o */
    public final /* synthetic */ Surface f5179o;

    /* renamed from: p */
    public final /* synthetic */ C9172b f5180p;

    /* renamed from: q */
    public final /* synthetic */ C1011z2 f5181q;

    public /* synthetic */ C1749m(C1773y yVar, Surface surface, C9172b bVar, C1011z2 z2Var) {
        this.f5178f = yVar;
        this.f5179o = surface;
        this.f5180p = bVar;
        this.f5181q = z2Var;
    }

    public final void run() {
        this.f5178f.mo6038p(this.f5179o, this.f5180p, this.f5181q);
    }
}
