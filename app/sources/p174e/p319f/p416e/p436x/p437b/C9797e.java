package p174e.p319f.p416e.p436x.p437b;

import java.util.Map;
import p174e.p319f.p416e.C9658d;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9660f;
import p174e.p319f.p416e.p420s.C9680b;
import p174e.p319f.p416e.p420s.C9683e;
import p174e.p319f.p416e.p420s.p422n.C9693a;
import p174e.p319f.p416e.p420s.p422n.C9695c;
import p174e.p319f.p416e.p420s.p422n.C9696d;

/* renamed from: e.f.e.x.b.e */
public final class C9797e {

    /* renamed from: a */
    private final C9695c f26234a = new C9695c(C9693a.f25972e);

    /* renamed from: a */
    private void m33461a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f26234a.mo24322a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C9696d unused) {
            throw C9658d.m32835a();
        }
    }

    /* renamed from: c */
    private C9683e m33462c(C9784a aVar, Map<C9659e, ?> map) {
        C9802j e = aVar.mo24511e();
        C9798f d = aVar.mo24510d().mo24520d();
        C9785b[] b = C9785b.m33440b(aVar.mo24509c(), e, d);
        int i = 0;
        for (C9785b c : b) {
            i += c.mo24515c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C9785b bVar : b) {
            byte[] a = bVar.mo24514a();
            int c2 = bVar.mo24515c();
            m33461a(a, c2);
            int i3 = 0;
            while (i3 < c2) {
                bArr[i2] = a[i3];
                i3++;
                i2++;
            }
        }
        return C9795d.m33453a(bArr, e, d, map);
    }

    /* renamed from: b */
    public C9683e mo24518b(C9680b bVar, Map<C9659e, ?> map) {
        C9658d e;
        C9784a aVar = new C9784a(bVar);
        C9660f fVar = null;
        try {
            return m33462c(aVar, map);
        } catch (C9660f e2) {
            C9660f fVar2 = e2;
            e = null;
            fVar = fVar2;
            try {
                aVar.mo24512f();
                aVar.mo24513g(true);
                aVar.mo24511e();
                aVar.mo24510d();
                aVar.mo24508b();
                C9683e c = m33462c(aVar, map);
                c.mo24294m(new C9801i(true));
                return c;
            } catch (C9658d | C9660f unused) {
                if (fVar != null) {
                    throw fVar;
                }
                throw e;
            }
        } catch (C9658d e3) {
            e = e3;
            aVar.mo24512f();
            aVar.mo24513g(true);
            aVar.mo24511e();
            aVar.mo24510d();
            aVar.mo24508b();
            C9683e c2 = m33462c(aVar, map);
            c2.mo24294m(new C9801i(true));
            return c2;
        }
    }
}
