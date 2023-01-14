package p174e.p199d.p218c.p225k;

import java.io.IOException;
import p174e.p199d.p200a.p213r.C5689a;
import p174e.p199d.p217b.C5700b;
import p174e.p199d.p218c.C5732e;

/* renamed from: e.d.c.k.c */
public class C5745c implements C5689a {

    /* renamed from: a */
    private final C5744b f16218a;

    public C5745c(C5732e eVar) {
        C5744b bVar = new C5744b();
        this.f16218a = bVar;
        eVar.mo17166a(bVar);
    }

    /* renamed from: a */
    public void mo16980a(String str, byte[] bArr) {
        try {
            if (str.equals("strh")) {
                C5700b bVar = new C5700b(bArr);
                bVar.mo17058w(false);
                String str2 = new String(bVar.mo17018c(0, 4));
                String str3 = new String(bVar.mo17018c(4, 4));
                float e = bVar.mo17041e(20);
                float e2 = bVar.mo17041e(24);
                int h = bVar.mo17044h(32);
                if (str2.equals("vids")) {
                    if (!this.f16218a.mo17138b(1)) {
                        float f = e2 / e;
                        this.f16218a.mo17121F(1, (double) f);
                        double d = (double) (((float) h) / f);
                        int i = (int) d;
                        Integer valueOf = Integer.valueOf(i / ((int) Math.pow(60.0d, 2.0d)));
                        Integer valueOf2 = Integer.valueOf((i / ((int) Math.pow(60.0d, 1.0d))) - (valueOf.intValue() * 60));
                        this.f16218a.mo17133R(3, String.format("%1$02d:%2$02d:%3$02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) Math.round((d / Math.pow(60.0d, 0.0d)) - ((double) (valueOf2.intValue() * 60))))}));
                        this.f16218a.mo17133R(4, str3);
                    }
                } else if (str2.equals("auds") && !this.f16218a.mo17138b(2)) {
                    this.f16218a.mo17121F(2, (double) (e2 / e));
                }
            } else if (str.equals("avih")) {
                C5700b bVar2 = new C5700b(bArr);
                bVar2.mo17058w(false);
                int h2 = bVar2.mo17044h(24);
                int h3 = bVar2.mo17044h(32);
                int h4 = bVar2.mo17044h(36);
                this.f16218a.mo17125J(6, h3);
                this.f16218a.mo17125J(7, h4);
                this.f16218a.mo17125J(8, h2);
            }
        } catch (IOException e3) {
            this.f16218a.mo17137a(e3.getMessage());
        }
    }

    /* renamed from: b */
    public boolean mo16981b(String str) {
        return str.equals("hdrl") || str.equals("strl") || str.equals("AVI ");
    }

    /* renamed from: c */
    public boolean mo16982c(String str) {
        return str.equals("strh") || str.equals("avih");
    }

    /* renamed from: d */
    public boolean mo16983d(String str) {
        return str.equals("AVI ");
    }
}
