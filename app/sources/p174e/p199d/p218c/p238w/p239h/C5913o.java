package p174e.p199d.p218c.p238w.p239h;

import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.p238w.p240i.C5933o;

/* renamed from: e.d.c.w.h.o */
public class C5913o extends C5896c {

    /* renamed from: e */
    int f16447e;

    /* renamed from: f */
    int f16448f;

    /* renamed from: g */
    int f16449g;

    /* renamed from: h */
    int[] f16450h;

    /* renamed from: i */
    int[] f16451i;

    /* renamed from: j */
    String f16452j;

    public C5913o(C5714o oVar, C5894a aVar) {
        super(oVar, aVar);
        this.f16447e = oVar.mo17086e();
        this.f16448f = oVar.mo17086e();
        this.f16449g = oVar.mo17086e();
        oVar.mo17084t(2);
        this.f16450h = new int[]{oVar.mo17096p(), oVar.mo17096p(), oVar.mo17096p()};
        this.f16451i = new int[]{oVar.mo17096p(), oVar.mo17096p(), oVar.mo17096p()};
        this.f16452j = oVar.mo17093m(oVar.mo17098r());
    }

    /* renamed from: a */
    public void mo17841a(C5933o oVar) {
        String str;
        oVar.mo17125J(5, this.f16447e);
        int i = this.f16448f;
        if (i == 1) {
            str = "Bold";
        } else if (i == 2) {
            str = "Italic";
        } else if (i == 4) {
            str = "Underline";
        } else if (i == 8) {
            str = "Outline";
        } else if (i == 16) {
            str = "Shadow";
        } else if (i != 32) {
            if (i == 64) {
                str = "Extend";
            }
            oVar.mo17125J(7, this.f16449g);
            oVar.mo17126K(8, this.f16450h);
            oVar.mo17126K(9, this.f16451i);
            oVar.mo17133R(10, this.f16452j);
        } else {
            str = "Condense";
        }
        oVar.mo17133R(6, str);
        oVar.mo17125J(7, this.f16449g);
        oVar.mo17126K(8, this.f16450h);
        oVar.mo17126K(9, this.f16451i);
        oVar.mo17133R(10, this.f16452j);
    }
}
