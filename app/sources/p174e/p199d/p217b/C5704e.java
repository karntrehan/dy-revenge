package p174e.p199d.p217b;

/* renamed from: e.d.b.e */
public class C5704e {
    /* renamed from: a */
    public static int m21214a(byte[] bArr, int i, boolean z) {
        byte b;
        int i2;
        if (z) {
            b = ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
            i2 = bArr[i + 3] & 255;
        } else {
            b = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            i2 = (bArr[i + 3] & 255) << 24;
        }
        return i2 | b;
    }
}
