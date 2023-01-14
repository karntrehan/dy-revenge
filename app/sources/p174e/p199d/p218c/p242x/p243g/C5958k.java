package p174e.p199d.p218c.p242x.p243g;

import java.util.ArrayList;
import p027c.p028a.C1444j;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.p242x.C5946e;
import p174e.p199d.p218c.p242x.p244h.C5970i;
import p174e.p199d.p218c.p242x.p244h.C5976o;

/* renamed from: e.d.c.x.g.k */
public class C5958k extends C5951d {

    /* renamed from: f */
    long f16534f;

    /* renamed from: g */
    ArrayList<C5959a> f16535g = new ArrayList<>();

    /* renamed from: e.d.c.x.g.k$a */
    class C5959a {

        /* renamed from: a */
        long f16536a;

        /* renamed from: b */
        long f16537b;

        public C5959a(long j, long j2) {
            this.f16536a = j;
            this.f16537b = j2;
        }
    }

    public C5958k(C5714o oVar, C5949b bVar) {
        super(oVar, bVar);
        this.f16534f = oVar.mo17097q();
        for (int i = 0; ((long) i) < this.f16534f; i++) {
            this.f16535g.add(new C5959a(oVar.mo17097q(), oVar.mo17097q()));
        }
    }

    /* renamed from: a */
    public void mo17867a(C5970i iVar) {
        iVar.mo17121F(104, (double) C5946e.f16493a.longValue());
    }

    /* renamed from: b */
    public void mo17868b(C5976o oVar) {
        oVar.mo17123H(C1444j.f4216D0, ((float) C5946e.f16493a.longValue()) / ((float) this.f16535g.get(0).f16537b));
    }
}
