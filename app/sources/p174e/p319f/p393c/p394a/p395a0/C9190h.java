package p174e.p319f.p393c.p394a.p395a0;

/* renamed from: e.f.c.a.a0.h */
class C9190h extends C9191i {
    C9190h(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int[] mo23169d(int[] iArr, int i) {
        if (iArr.length == mo23170g() / 4) {
            int[] iArr2 = new int[16];
            C9191i.m30541k(iArr2, this.f25094b);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo23170g() {
        return 12;
    }
}
