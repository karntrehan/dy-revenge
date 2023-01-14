package p174e.p199d.p218c.p238w.p239h;

import java.util.ArrayList;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.p238w.C5891e;
import p174e.p199d.p218c.p238w.p240i.C5936r;

/* renamed from: e.d.c.w.h.n */
public class C5911n extends C5896c {

    /* renamed from: e */
    long f16440e;

    /* renamed from: f */
    ArrayList<C5912a> f16441f = new ArrayList<>();

    /* renamed from: g */
    long f16442g;

    /* renamed from: h */
    long f16443h;

    /* renamed from: e.d.c.w.h.n$a */
    class C5912a {

        /* renamed from: a */
        long f16444a;

        /* renamed from: b */
        long f16445b;

        public C5912a(C5714o oVar) {
            this.f16444a = oVar.mo17097q();
            this.f16445b = oVar.mo17097q();
        }
    }

    public C5911n(C5714o oVar, C5894a aVar) {
        super(oVar, aVar);
        this.f16440e = oVar.mo17097q();
        for (int i = 0; ((long) i) < this.f16440e; i++) {
            this.f16441f.add(new C5912a(oVar));
        }
        this.f16442g = oVar.mo17097q();
        this.f16443h = oVar.mo17097q();
    }

    /* renamed from: a */
    public void mo17840a(C5936r rVar) {
        rVar.mo17123H(14, ((float) C5891e.f16373a.longValue()) / ((float) this.f16443h));
    }
}
