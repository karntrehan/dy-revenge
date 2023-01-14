package p174e.p199d.p218c.p242x.p243g;

import okhttp3.internal.p510ws.WebSocketProtocol;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.p242x.p244h.C5976o;

/* renamed from: e.d.c.x.g.m */
public class C5961m extends C5956i {

    /* renamed from: j */
    int f16541j;

    /* renamed from: k */
    int f16542k;

    /* renamed from: l */
    String f16543l;

    /* renamed from: m */
    int f16544m;

    /* renamed from: n */
    int f16545n;

    /* renamed from: o */
    int f16546o;

    /* renamed from: p */
    int f16547p;

    /* renamed from: q */
    long f16548q;

    /* renamed from: r */
    long f16549r;

    /* renamed from: s */
    int f16550s;

    /* renamed from: t */
    String f16551t;

    /* renamed from: u */
    int f16552u;

    public C5961m(C5714o oVar, C5949b bVar) {
        super(oVar, bVar);
        this.f16541j = oVar.mo17086e();
        this.f16542k = oVar.mo17086e();
        this.f16543l = oVar.mo17093m(4);
        this.f16544m = oVar.mo17087f();
        this.f16545n = oVar.mo17087f();
        this.f16546o = oVar.mo17096p();
        this.f16547p = oVar.mo17096p();
        this.f16548q = oVar.mo17097q();
        this.f16549r = oVar.mo17097q();
        oVar.mo17084t(4);
        this.f16550s = oVar.mo17096p();
        this.f16551t = oVar.mo17093m(32);
        this.f16552u = oVar.mo17096p();
        oVar.mo17084t(2);
    }

    /* renamed from: a */
    public void mo17870a(C5976o oVar) {
        C5976o oVar2 = oVar;
        oVar2.mo17125J(104, this.f16546o);
        oVar2.mo17125J(105, this.f16547p);
        oVar2.mo17133R(110, this.f16551t.trim());
        oVar2.mo17125J(109, this.f16552u);
        long j = this.f16548q;
        oVar2.mo17121F(106, ((double) ((j & -65536) >> 16)) + (((double) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX)) / Math.pow(2.0d, 4.0d)));
        long j2 = this.f16549r;
        oVar2.mo17121F(107, ((double) ((-65536 & j2) >> 16)) + (((double) (j2 & WebSocketProtocol.PAYLOAD_SHORT_MAX)) / Math.pow(2.0d, 4.0d)));
    }
}
