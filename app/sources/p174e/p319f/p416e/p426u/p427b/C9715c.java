package p174e.p319f.p416e.p426u.p427b;

import java.util.Map;
import p174e.p319f.p416e.C9658d;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9660f;
import p174e.p319f.p416e.p420s.C9680b;
import p174e.p319f.p416e.p420s.C9683e;
import p174e.p319f.p416e.p420s.p422n.C9693a;
import p174e.p319f.p416e.p420s.p422n.C9695c;
import p174e.p319f.p416e.p420s.p422n.C9696d;

/* renamed from: e.f.e.u.b.c */
public final class C9715c {

    /* renamed from: a */
    private final C9695c f26030a = new C9695c(C9693a.f25975h);

    /* renamed from: a */
    private void m33076a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[(i5 / i6)];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f26030a.mo24322a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (C9696d unused) {
            throw C9658d.m32835a();
        }
    }

    /* renamed from: b */
    public C9683e mo24348b(C9680b bVar, Map<C9659e, ?> map) {
        int i;
        byte[] a = new C9713a(bVar).mo24347a();
        m33076a(a, 0, 10, 10, 0);
        byte b = a[0] & 15;
        if (b == 2 || b == 3 || b == 4) {
            byte[] bArr = a;
            m33076a(bArr, 20, 84, 40, 1);
            m33076a(bArr, 20, 84, 40, 2);
            i = 94;
        } else if (b == 5) {
            byte[] bArr2 = a;
            m33076a(bArr2, 20, 68, 56, 1);
            m33076a(bArr2, 20, 68, 56, 2);
            i = 78;
        } else {
            throw C9660f.m32836a();
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(a, 0, bArr3, 0, 10);
        System.arraycopy(a, 20, bArr3, 10, bArr3.length - 10);
        return C9714b.m33067a(bArr3, b);
    }
}
