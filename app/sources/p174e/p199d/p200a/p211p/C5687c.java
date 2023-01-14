package p174e.p199d.p200a.p211p;

import java.io.IOException;
import java.io.InputStream;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p217b.C5715p;
import p174e.p199d.p218c.p238w.p239h.C5894a;

/* renamed from: e.d.a.p.c */
public class C5687c {
    /* renamed from: a */
    public static void m21155a(InputStream inputStream, C5685a aVar) {
        C5715p pVar = new C5715p(inputStream);
        pVar.mo17099s(true);
        m21156b(pVar, -1, aVar);
    }

    /* renamed from: b */
    private static void m21156b(C5715p pVar, long j, C5685a aVar) {
        while (true) {
            if (j != -1) {
                try {
                    if (pVar.mo17083l() >= j) {
                        return;
                    }
                } catch (IOException e) {
                    aVar.mo16974a(e.getMessage());
                    return;
                }
            }
            C5894a aVar2 = new C5894a((C5714o) pVar);
            if (aVar.mo16979f(aVar2)) {
                m21156b(pVar, (aVar2.f16378a + pVar.mo17083l()) - 8, aVar.mo16977d(aVar2));
            } else if (aVar.mo16978e(aVar2)) {
                aVar = aVar.mo16976c(aVar2, pVar.mo17082d(((int) aVar2.f16378a) - 8));
            } else {
                long j2 = aVar2.f16378a;
                if (j2 > 1) {
                    pVar.mo17084t(j2 - 8);
                } else if (j2 == -1) {
                    return;
                }
            }
        }
    }
}
