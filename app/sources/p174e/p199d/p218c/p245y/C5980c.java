package p174e.p199d.p218c.p245y;

import p174e.p199d.p200a.C5659d;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.C5732e;

/* renamed from: e.d.c.y.c */
public class C5980c {
    /* renamed from: a */
    public void mo17879a(C5714o oVar, C5732e eVar) {
        oVar.mo17099s(false);
        C5979b bVar = new C5979b();
        eVar.mo17166a(bVar);
        try {
            if (oVar.mo17089h() == 10) {
                bVar.mo17125J(1, oVar.mo17089h());
                if (oVar.mo17089h() == 1) {
                    bVar.mo17125J(2, oVar.mo17098r());
                    bVar.mo17125J(3, oVar.mo17096p());
                    bVar.mo17125J(4, oVar.mo17096p());
                    bVar.mo17125J(5, oVar.mo17096p());
                    bVar.mo17125J(6, oVar.mo17096p());
                    bVar.mo17125J(7, oVar.mo17096p());
                    bVar.mo17125J(8, oVar.mo17096p());
                    bVar.mo17118C(9, oVar.mo17082d(48));
                    oVar.mo17084t(1);
                    bVar.mo17125J(10, oVar.mo17098r());
                    bVar.mo17125J(11, oVar.mo17096p());
                    int p = oVar.mo17096p();
                    if (p != 0) {
                        bVar.mo17125J(12, p);
                    }
                    int p2 = oVar.mo17096p();
                    if (p2 != 0) {
                        bVar.mo17125J(13, p2);
                    }
                    int p3 = oVar.mo17096p();
                    if (p3 != 0) {
                        bVar.mo17125J(14, p3);
                        return;
                    }
                    return;
                }
                throw new C5659d("Invalid PCX encoding byte");
            }
            throw new C5659d("Invalid PCX identifier byte");
        } catch (Exception e) {
            bVar.mo17137a("Exception reading PCX file metadata: " + e.getMessage());
        }
    }
}
