package p174e.p199d.p218c.p246z;

import java.util.Set;
import p174e.p199d.p217b.C5700b;
import p174e.p199d.p217b.C5710k;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p218c.C5722b;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p223e0.C5735c;
import p174e.p199d.p218c.p228n.C5830n;
import p174e.p199d.p218c.p232q.C5860c;

/* renamed from: e.d.c.z.g */
public class C5987g extends C5830n {
    public C5987g(C5732e eVar, C5722b bVar) {
        super(eVar, bVar);
    }

    /* renamed from: f */
    public boolean mo16994f(int i, Set<Integer> set, int i2, C5710k kVar, int i3, int i4) {
        if (i3 == 700) {
            new C5735c().mo17177f(kVar.mo17018c(i, i4), this.f16194d);
            return true;
        } else if (i3 == 34377) {
            new C5986f().mo17893c(new C5713n(kVar.mo17018c(i, i4)), i4, this.f16194d);
            return true;
        } else if (i3 != 34675) {
            return super.mo16994f(i, set, i2, kVar, i3, i4);
        } else {
            new C5860c().mo17775c(new C5700b(kVar.mo17018c(i, i4)), this.f16194d);
            return true;
        }
    }
}
