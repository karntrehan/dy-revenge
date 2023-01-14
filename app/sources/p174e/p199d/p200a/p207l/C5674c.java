package p174e.p199d.p200a.p207l;

import java.io.IOException;
import java.io.InputStream;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p217b.C5715p;
import p174e.p199d.p218c.p242x.p243g.C5949b;

/* renamed from: e.d.a.l.c */
public class C5674c {
    /* renamed from: a */
    public static void m21117a(InputStream inputStream, C5672a aVar) {
        C5715p pVar = new C5715p(inputStream);
        pVar.mo17099s(true);
        m21118b(pVar, -1, aVar);
    }

    /* renamed from: b */
    private static void m21118b(C5715p pVar, long j, C5672a aVar) {
        while (true) {
            if (j != -1) {
                try {
                    if (pVar.mo17083l() >= j) {
                        return;
                    }
                } catch (IOException e) {
                    aVar.mo16943a(e.getMessage());
                    return;
                }
            }
            C5949b bVar = new C5949b((C5714o) pVar);
            if (aVar.mo16948f(bVar)) {
                m21118b(pVar, (bVar.f16502a + pVar.mo17083l()) - 8, aVar.mo16946d(bVar));
            } else if (aVar.mo16947e(bVar)) {
                aVar = aVar.mo16945c(bVar, pVar.mo17082d(((int) bVar.f16502a) - 8));
            } else if (bVar.f16504c != null) {
                pVar.mo17084t(bVar.f16502a - 24);
            } else {
                long j2 = bVar.f16502a;
                if (j2 > 1) {
                    pVar.mo17084t(j2 - 8);
                } else if (j2 == -1) {
                    return;
                }
            }
        }
    }
}
