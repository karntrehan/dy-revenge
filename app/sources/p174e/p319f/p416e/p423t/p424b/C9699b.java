package p174e.p319f.p416e.p423t.p424b;

import p174e.p319f.p416e.p423t.p424b.C9704e;

/* renamed from: e.f.e.t.b.b */
final class C9699b {

    /* renamed from: a */
    private final int f25991a;

    /* renamed from: b */
    private final byte[] f25992b;

    private C9699b(int i, byte[] bArr) {
        this.f25991a = i;
        this.f25992b = bArr;
    }

    /* renamed from: b */
    static C9699b[] m33024b(byte[] bArr, C9704e eVar) {
        C9704e.C9707c d = eVar.mo24330d();
        C9704e.C9706b[] a = d.mo24338a();
        int i = 0;
        for (C9704e.C9706b a2 : a) {
            i += a2.mo24336a();
        }
        C9699b[] bVarArr = new C9699b[i];
        int i2 = 0;
        for (C9704e.C9706b bVar : a) {
            int i3 = 0;
            while (i3 < bVar.mo24336a()) {
                int b = bVar.mo24337b();
                bVarArr[i2] = new C9699b(b, new byte[(d.mo24339b() + b)]);
                i3++;
                i2++;
            }
        }
        int length = bVarArr[0].f25992b.length - d.mo24339b();
        int i4 = length - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                bVarArr[i7].f25992b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        boolean z = eVar.mo24334i() == 24;
        int i8 = z ? 8 : i2;
        int i9 = 0;
        while (i9 < i8) {
            bVarArr[i9].f25992b[i4] = bArr[i5];
            i9++;
            i5++;
        }
        int length2 = bVarArr[0].f25992b.length;
        while (length < length2) {
            int i10 = 0;
            while (i10 < i2) {
                int i11 = z ? (i10 + 8) % i2 : i10;
                bVarArr[i11].f25992b[(!z || i11 <= 7) ? length : length - 1] = bArr[i5];
                i10++;
                i5++;
            }
            length++;
        }
        if (i5 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo24325a() {
        return this.f25992b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo24326c() {
        return this.f25991a;
    }
}
