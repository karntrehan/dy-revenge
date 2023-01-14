package p174e.p199d.p218c.p238w.p239h;

import okhttp3.internal.p510ws.WebSocketProtocol;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.p238w.C5889c;
import p174e.p199d.p218c.p238w.p240i.C5936r;

/* renamed from: e.d.c.w.h.r */
public class C5917r extends C5903i<C5918a> {

    /* renamed from: e.d.c.w.h.r$a */
    class C5918a extends C5902h {

        /* renamed from: d */
        int f16460d;

        /* renamed from: e */
        int f16461e;

        /* renamed from: f */
        String f16462f;

        /* renamed from: g */
        long f16463g;

        /* renamed from: h */
        long f16464h;

        /* renamed from: i */
        int f16465i;

        /* renamed from: j */
        int f16466j;

        /* renamed from: k */
        long f16467k;

        /* renamed from: l */
        long f16468l;

        /* renamed from: m */
        long f16469m;

        /* renamed from: n */
        int f16470n;

        /* renamed from: o */
        String f16471o;

        /* renamed from: p */
        int f16472p;

        /* renamed from: q */
        int f16473q;

        public C5918a(C5714o oVar) {
            super(oVar);
            this.f16460d = oVar.mo17096p();
            this.f16461e = oVar.mo17096p();
            this.f16462f = oVar.mo17093m(4);
            this.f16463g = oVar.mo17097q();
            this.f16464h = oVar.mo17097q();
            this.f16465i = oVar.mo17096p();
            this.f16466j = oVar.mo17096p();
            this.f16467k = oVar.mo17097q();
            this.f16468l = oVar.mo17097q();
            this.f16469m = oVar.mo17097q();
            this.f16470n = oVar.mo17096p();
            this.f16471o = oVar.mo17093m(oVar.mo17098r());
            this.f16472p = oVar.mo17096p();
            this.f16473q = oVar.mo17086e();
        }
    }

    public C5917r(C5714o oVar, C5894a aVar) {
        super(oVar, aVar);
    }

    /* renamed from: b */
    public void mo17845b(C5936r rVar) {
        C5936r rVar2 = rVar;
        C5918a aVar = (C5918a) this.f16414f.get(0);
        C5889c.m22368b(1, aVar.f16462f, rVar2);
        C5889c.m22368b(10, aVar.f16411b, rVar2);
        rVar2.mo17127L(2, aVar.f16463g);
        rVar2.mo17127L(3, aVar.f16464h);
        rVar2.mo17125J(4, aVar.f16465i);
        rVar2.mo17125J(5, aVar.f16466j);
        rVar2.mo17133R(8, aVar.f16471o.trim());
        rVar2.mo17125J(9, aVar.f16472p);
        rVar2.mo17125J(13, aVar.f16473q);
        long j = aVar.f16467k;
        rVar2.mo17121F(6, ((double) ((j & -65536) >> 16)) + (((double) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX)) / Math.pow(2.0d, 4.0d)));
        long j2 = aVar.f16468l;
        rVar2.mo17121F(7, ((double) ((j2 & -65536) >> 16)) + (((double) (j2 & WebSocketProtocol.PAYLOAD_SHORT_MAX)) / Math.pow(2.0d, 4.0d)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5918a mo17830a(C5714o oVar) {
        return new C5918a(oVar);
    }
}
