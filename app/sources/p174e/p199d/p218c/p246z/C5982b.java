package p174e.p199d.p218c.p246z;

import java.io.IOException;
import java.util.Collections;
import p174e.p199d.p200a.p206k.C5669d;
import p174e.p199d.p200a.p206k.C5671f;
import p174e.p199d.p217b.C5705f;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.C5732e;

/* renamed from: e.d.c.z.b */
public class C5982b implements C5669d {
    /* renamed from: a */
    public void mo16941a(Iterable<byte[]> iterable, C5732e eVar, C5671f fVar) {
        for (byte[] next : iterable) {
            if (next.length >= 5 && "Ducky".equals(new String(next, 0, 5))) {
                mo17880c(new C5713n(next, 5), eVar);
            }
        }
    }

    /* renamed from: b */
    public Iterable<C5671f> mo16942b() {
        return Collections.singletonList(C5671f.APPC);
    }

    /* renamed from: c */
    public void mo17880c(C5714o oVar, C5732e eVar) {
        C5981a aVar = new C5981a();
        eVar.mo17166a(aVar);
        while (true) {
            try {
                int p = oVar.mo17096p();
                if (p != 0) {
                    int p2 = oVar.mo17096p();
                    if (p != 1) {
                        if (p == 2 || p == 3) {
                            oVar.mo17084t(4);
                            aVar.mo17135T(p, oVar.mo17095o(p2 - 4, C5705f.f16155e));
                        } else {
                            aVar.mo17118C(p, oVar.mo17082d(p2));
                        }
                    } else if (p2 != 4) {
                        aVar.mo17137a("Unexpected length for the quality tag");
                        return;
                    } else {
                        aVar.mo17125J(p, oVar.mo17087f());
                    }
                } else {
                    return;
                }
            } catch (IOException e) {
                aVar.mo17137a(e.getMessage());
                return;
            }
        }
    }
}
