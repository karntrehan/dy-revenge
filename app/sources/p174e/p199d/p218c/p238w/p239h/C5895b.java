package p174e.p199d.p218c.p238w.p239h;

import java.util.ArrayList;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.p238w.C5890d;

/* renamed from: e.d.c.w.h.b */
public class C5895b extends C5894a {

    /* renamed from: c */
    String f16380c;

    /* renamed from: d */
    long f16381d;

    /* renamed from: e */
    ArrayList<String> f16382e = new ArrayList<>((int) ((this.f16378a / 16) >> 2));

    public C5895b(C5714o oVar, C5894a aVar) {
        super(aVar);
        this.f16380c = oVar.mo17093m(4);
        this.f16381d = oVar.mo17097q();
        for (int i = 16; ((long) i) < this.f16378a; i += 4) {
            this.f16382e.add(oVar.mo17093m(4));
        }
    }

    /* renamed from: a */
    public void mo17827a(C5890d dVar) {
        dVar.mo17133R(4096, this.f16380c);
        dVar.mo17127L(4097, this.f16381d);
        ArrayList<String> arrayList = this.f16382e;
        dVar.mo17134S(4098, (String[]) arrayList.toArray(new String[arrayList.size()]));
    }
}
