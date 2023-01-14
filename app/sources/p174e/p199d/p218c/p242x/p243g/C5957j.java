package p174e.p199d.p218c.p242x.p243g;

import okhttp3.internal.http2.Settings;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.p242x.p244h.C5970i;

/* renamed from: e.d.c.x.g.j */
public class C5957j extends C5951d {

    /* renamed from: f */
    int f16533f;

    public C5957j(C5714o oVar, C5949b bVar) {
        super(oVar, bVar);
        this.f16533f = oVar.mo17086e();
        oVar.mo17084t(2);
    }

    /* renamed from: a */
    public void mo17866a(C5970i iVar) {
        int i = this.f16533f;
        iVar.mo17121F(105, ((double) (-65536 & i)) + (((double) (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) / Math.pow(2.0d, 4.0d)));
    }
}
