package p174e.p199d.p218c.p222d0;

import java.io.IOException;
import p174e.p199d.p200a.p213r.C5689a;
import p174e.p199d.p217b.C5700b;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p223e0.C5735c;
import p174e.p199d.p218c.p228n.C5825i;
import p174e.p199d.p218c.p232q.C5860c;

/* renamed from: e.d.c.d0.c */
public class C5731c implements C5689a {

    /* renamed from: a */
    private final C5732e f16207a;

    public C5731c(C5732e eVar) {
        this.f16207a = eVar;
    }

    /* renamed from: a */
    public void mo16980a(String str, byte[] bArr) {
        C5730b bVar = new C5730b();
        if (str.equals("EXIF")) {
            new C5825i().mo17745c(new C5700b(bArr), this.f16207a);
        } else if (str.equals("ICCP")) {
            new C5860c().mo17775c(new C5700b(bArr), this.f16207a);
        } else if (str.equals("XMP ")) {
            new C5735c().mo17177f(bArr, this.f16207a);
        } else if (str.equals("VP8X") && bArr.length == 10) {
            C5700b bVar2 = new C5700b(bArr);
            bVar2.mo17058w(false);
            try {
                boolean a = bVar2.mo17039a(1);
                boolean a2 = bVar2.mo17039a(4);
                int g = bVar2.mo17043g(4);
                int g2 = bVar2.mo17043g(7);
                bVar.mo17125J(2, g + 1);
                bVar.mo17125J(1, g2 + 1);
                bVar.mo17117B(3, a2);
                bVar.mo17117B(4, a);
                this.f16207a.mo17166a(bVar);
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        } else if (str.equals("VP8L") && bArr.length > 4) {
            C5700b bVar3 = new C5700b(bArr);
            bVar3.mo17058w(false);
            if (bVar3.mo17046j(0) == 47) {
                short u = bVar3.mo17056u(1);
                short u2 = bVar3.mo17056u(2);
                short u3 = bVar3.mo17056u(3);
                bVar.mo17125J(2, (u | ((u2 & 63) << 8)) + 1);
                bVar.mo17125J(1, (((bVar3.mo17056u(4) & 15) << 10) | (u3 << 2) | ((u2 & 192) >> 6)) + 1);
                this.f16207a.mo17166a(bVar);
            }
        } else if (str.equals("VP8 ") && bArr.length > 9) {
            C5700b bVar4 = new C5700b(bArr);
            bVar4.mo17058w(false);
            try {
                if (bVar4.mo17056u(3) != 157 || bVar4.mo17056u(4) != 1) {
                    return;
                }
                if (bVar4.mo17056u(5) == 42) {
                    int s = bVar4.mo17054s(6);
                    int s2 = bVar4.mo17054s(8);
                    bVar.mo17125J(2, s);
                    bVar.mo17125J(1, s2);
                    this.f16207a.mo17166a(bVar);
                }
            } catch (IOException e2) {
                bVar.mo17137a(e2.getMessage());
            }
        }
    }

    /* renamed from: b */
    public boolean mo16981b(String str) {
        return false;
    }

    /* renamed from: c */
    public boolean mo16982c(String str) {
        return str.equals("VP8X") || str.equals("VP8L") || str.equals("VP8 ") || str.equals("EXIF") || str.equals("ICCP") || str.equals("XMP ");
    }

    /* renamed from: d */
    public boolean mo16983d(String str) {
        return str.equals("WEBP");
    }
}
