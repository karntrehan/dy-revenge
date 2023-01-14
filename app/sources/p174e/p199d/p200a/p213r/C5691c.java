package p174e.p199d.p200a.p213r;

import p174e.p199d.p217b.C5714o;

/* renamed from: e.d.a.r.c */
public class C5691c {
    /* renamed from: a */
    public void mo16984a(C5714o oVar, int i, C5689a aVar) {
        long j;
        while (oVar.mo17083l() < ((long) i)) {
            String str = new String(oVar.mo17082d(4));
            int f = oVar.mo17087f();
            if (str.equals("LIST") || str.equals("RIFF")) {
                int i2 = f - 4;
                if (aVar.mo16981b(new String(oVar.mo17082d(4)))) {
                    mo16984a(oVar, i2, aVar);
                } else {
                    j = (long) i2;
                }
            } else {
                if (aVar.mo16982c(str)) {
                    aVar.mo16980a(str, oVar.mo17082d(f));
                } else {
                    oVar.mo17084t((long) f);
                }
                if (f % 2 == 1) {
                    j = 1;
                }
            }
            oVar.mo17084t(j);
        }
    }

    /* renamed from: b */
    public void mo16985b(C5714o oVar, C5689a aVar) {
        oVar.mo17099s(false);
        String m = oVar.mo17093m(4);
        if (m.equals("RIFF")) {
            int f = oVar.mo17087f() - 4;
            if (aVar.mo16983d(oVar.mo17093m(4))) {
                mo16984a(oVar, f, aVar);
                return;
            }
            return;
        }
        throw new C5690b("Invalid RIFF header: " + m);
    }
}
