package p174e.p319f.p393c.p394a.p395a0;

import java.util.Arrays;

/* renamed from: e.f.c.a.a0.x */
class C9215x extends C9191i {
    C9215x(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: n */
    static int[] m30608n(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        C9191i.m30541k(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        C9191i.m30542l(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int[] mo23169d(int[] iArr, int i) {
        if (iArr.length == mo23170g() / 4) {
            int[] iArr2 = new int[16];
            C9191i.m30541k(iArr2, m30608n(this.f25094b, iArr));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo23170g() {
        return 24;
    }
}
