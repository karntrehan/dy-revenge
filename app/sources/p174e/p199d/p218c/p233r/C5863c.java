package p174e.p199d.p218c.p233r;

import java.io.IOException;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.C5732e;

/* renamed from: e.d.c.r.c */
public class C5863c {
    /* renamed from: a */
    public void mo17781a(C5714o oVar, C5732e eVar) {
        int i;
        int p;
        oVar.mo17099s(false);
        try {
            if (oVar.mo17096p() != 0) {
                C5862b bVar = new C5862b();
                bVar.mo17137a("Invalid header bytes");
                eVar.mo17166a(bVar);
                return;
            }
            int p2 = oVar.mo17096p();
            if (p2 == 1 || p2 == 2) {
                int p3 = oVar.mo17096p();
                if (p3 == 0) {
                    C5862b bVar2 = new C5862b();
                    bVar2.mo17137a("Image count cannot be zero");
                    eVar.mo17166a(bVar2);
                    return;
                }
                for (int i2 = 0; i2 < p3; i2++) {
                    C5862b bVar3 = new C5862b();
                    try {
                        bVar3.mo17125J(1, p2);
                        bVar3.mo17125J(2, oVar.mo17098r());
                        bVar3.mo17125J(3, oVar.mo17098r());
                        bVar3.mo17125J(4, oVar.mo17098r());
                        oVar.mo17098r();
                        if (p2 == 1) {
                            bVar3.mo17125J(5, oVar.mo17096p());
                            i = 7;
                            p = oVar.mo17096p();
                        } else {
                            bVar3.mo17125J(6, oVar.mo17096p());
                            i = 8;
                            p = oVar.mo17096p();
                        }
                        bVar3.mo17125J(i, p);
                        bVar3.mo17127L(9, oVar.mo17097q());
                        bVar3.mo17127L(10, oVar.mo17097q());
                    } catch (IOException e) {
                        bVar3.mo17137a("Exception reading ICO file metadata: " + e.getMessage());
                    }
                    eVar.mo17166a(bVar3);
                }
                return;
            }
            C5862b bVar4 = new C5862b();
            bVar4.mo17137a("Invalid type " + p2 + " -- expecting 1 or 2");
            eVar.mo17166a(bVar4);
        } catch (IOException e2) {
            C5862b bVar5 = new C5862b();
            bVar5.mo17137a("Exception reading ICO file metadata: " + e2.getMessage());
            eVar.mo17166a(bVar5);
        }
    }
}
