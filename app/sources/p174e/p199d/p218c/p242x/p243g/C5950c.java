package p174e.p199d.p218c.p242x.p243g;

import java.util.ArrayList;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.p242x.C5945d;

/* renamed from: e.d.c.x.g.c */
public class C5950c extends C5949b {

    /* renamed from: d */
    String f16505d;

    /* renamed from: e */
    long f16506e;

    /* renamed from: f */
    ArrayList<String> f16507f = new ArrayList<>();

    public C5950c(C5714o oVar, C5949b bVar) {
        super(bVar);
        this.f16505d = oVar.mo17093m(4);
        this.f16506e = oVar.mo17097q();
        for (int i = 16; ((long) i) < this.f16502a; i += 4) {
            this.f16507f.add(oVar.mo17093m(4));
        }
    }

    /* renamed from: a */
    public void mo17862a(C5945d dVar) {
        dVar.mo17133R(1, this.f16505d);
        dVar.mo17127L(2, this.f16506e);
        ArrayList<String> arrayList = this.f16507f;
        dVar.mo17134S(3, (String[]) arrayList.toArray(new String[arrayList.size()]));
    }
}
