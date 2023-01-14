package p174e.p319f.p416e.p423t.p424b;

import p174e.p319f.p416e.C9658d;
import p174e.p319f.p416e.p420s.C9680b;
import p174e.p319f.p416e.p420s.C9683e;
import p174e.p319f.p416e.p420s.p422n.C9693a;
import p174e.p319f.p416e.p420s.p422n.C9695c;
import p174e.p319f.p416e.p420s.p422n.C9696d;

/* renamed from: e.f.e.t.b.d */
public final class C9703d {

    /* renamed from: a */
    private final C9695c f26007a = new C9695c(C9693a.f25973f);

    /* renamed from: a */
    private void m33036a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f26007a.mo24322a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C9696d unused) {
            throw C9658d.m32835a();
        }
    }

    /* renamed from: b */
    public C9683e mo24327b(C9680b bVar) {
        C9698a aVar = new C9698a(bVar);
        C9699b[] b = C9699b.m33024b(aVar.mo24324c(), aVar.mo24323b());
        int i = 0;
        for (C9699b c : b) {
            i += c.mo24326c();
        }
        byte[] bArr = new byte[i];
        int length = b.length;
        for (int i2 = 0; i2 < length; i2++) {
            C9699b bVar2 = b[i2];
            byte[] a = bVar2.mo24325a();
            int c2 = bVar2.mo24326c();
            m33036a(a, c2);
            for (int i3 = 0; i3 < c2; i3++) {
                bArr[(i3 * length) + i2] = a[i3];
            }
        }
        return C9700c.m33027a(bArr);
    }
}
