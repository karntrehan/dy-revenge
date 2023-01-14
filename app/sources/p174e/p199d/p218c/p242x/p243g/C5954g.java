package p174e.p199d.p218c.p242x.p243g;

import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.p242x.C5946e;

/* renamed from: e.d.c.x.g.g */
public class C5954g extends C5951d {

    /* renamed from: f */
    long f16516f;

    /* renamed from: g */
    long f16517g;

    /* renamed from: h */
    long f16518h;

    /* renamed from: i */
    long f16519i;

    /* renamed from: j */
    String f16520j;

    public C5954g(C5714o oVar, C5949b bVar) {
        super(oVar, bVar);
        long j;
        if (this.f16508d == 1) {
            this.f16516f = oVar.mo17088g();
            this.f16517g = oVar.mo17088g();
            this.f16518h = (long) oVar.mo17087f();
            j = oVar.mo17088g();
        } else {
            this.f16516f = oVar.mo17097q();
            this.f16517g = oVar.mo17097q();
            this.f16518h = oVar.mo17097q();
            j = oVar.mo17097q();
        }
        this.f16519i = j;
        short e = oVar.mo17086e();
        this.f16520j = new String(new char[]{(char) (((e & 31744) >> 10) + 96), (char) (((e & 992) >> 5) + 96), (char) ((e & 31) + 96)});
        C5946e.f16494b = Long.valueOf(this.f16516f);
        C5946e.f16495c = Long.valueOf(this.f16517g);
        C5946e.f16493a = Long.valueOf(this.f16518h);
        C5946e.f16496d = Long.valueOf(this.f16519i);
        C5946e.f16497e = this.f16520j;
    }
}
