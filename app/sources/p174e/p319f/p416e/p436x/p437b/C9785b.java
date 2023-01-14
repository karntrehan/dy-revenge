package p174e.p319f.p416e.p436x.p437b;

import p174e.p319f.p416e.p436x.p437b.C9802j;

/* renamed from: e.f.e.x.b.b */
final class C9785b {

    /* renamed from: a */
    private final int f26221a;

    /* renamed from: b */
    private final byte[] f26222b;

    private C9785b(int i, byte[] bArr) {
        this.f26221a = i;
        this.f26222b = bArr;
    }

    /* renamed from: b */
    static C9785b[] m33440b(byte[] bArr, C9802j jVar, C9798f fVar) {
        if (bArr.length == jVar.mo24529h()) {
            C9802j.C9804b f = jVar.mo24528f(fVar);
            C9802j.C9803a[] a = f.mo24534a();
            int i = 0;
            for (C9802j.C9803a a2 : a) {
                i += a2.mo24532a();
            }
            C9785b[] bVarArr = new C9785b[i];
            int i2 = 0;
            for (C9802j.C9803a aVar : a) {
                int i3 = 0;
                while (i3 < aVar.mo24532a()) {
                    int b = aVar.mo24533b();
                    bVarArr[i2] = new C9785b(b, new byte[(f.mo24535b() + b)]);
                    i3++;
                    i2++;
                }
            }
            int length = bVarArr[0].f26222b.length;
            int i4 = i - 1;
            while (i4 >= 0 && bVarArr[i4].f26222b.length != length) {
                i4--;
            }
            int i5 = i4 + 1;
            int b2 = length - f.mo24535b();
            int i6 = 0;
            for (int i7 = 0; i7 < b2; i7++) {
                int i8 = 0;
                while (i8 < i2) {
                    bVarArr[i8].f26222b[i7] = bArr[i6];
                    i8++;
                    i6++;
                }
            }
            int i9 = i5;
            while (i9 < i2) {
                bVarArr[i9].f26222b[b2] = bArr[i6];
                i9++;
                i6++;
            }
            int length2 = bVarArr[0].f26222b.length;
            while (b2 < length2) {
                int i10 = 0;
                while (i10 < i2) {
                    bVarArr[i10].f26222b[i10 < i5 ? b2 : b2 + 1] = bArr[i6];
                    i10++;
                    i6++;
                }
                b2++;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo24514a() {
        return this.f26222b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo24515c() {
        return this.f26221a;
    }
}
