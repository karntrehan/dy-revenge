package p174e.p199d.p218c.p238w.p239h;

import okhttp3.internal.http2.Settings;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.p238w.p240i.C5924f;

/* renamed from: e.d.c.w.h.j */
public class C5904j extends C5896c {

    /* renamed from: e */
    int f16415e;

    public C5904j(C5714o oVar, C5894a aVar) {
        super(oVar, aVar);
        this.f16415e = oVar.mo17086e();
        oVar.mo17084t(2);
    }

    /* renamed from: a */
    public void mo17833a(C5924f fVar) {
        int i = this.f16415e;
        fVar.mo17121F(773, ((double) (-65536 & i)) + (((double) (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) / Math.pow(2.0d, 4.0d)));
    }
}
