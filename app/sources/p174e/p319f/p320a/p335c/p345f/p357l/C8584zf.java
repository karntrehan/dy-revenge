package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.zf */
final class C8584zf {

    /* renamed from: a */
    private static final C8530wf f23365a = new C8548xf();

    static {
        if (C8494uf.m29092C() && C8494uf.m29093D()) {
            int i = C8400pb.f22907a;
        }
    }

    /* renamed from: a */
    static /* synthetic */ int m29349a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == 1) {
                byte b2 = bArr[i];
                if (b <= -12 && b2 <= -65) {
                    return b ^ (b2 << 8);
                }
            } else if (i3 == 2) {
                byte b3 = bArr[i];
                byte b4 = bArr[i + 1];
                if (b <= -12 && b3 <= -65 && b4 <= -65) {
                    return ((b3 << 8) ^ b) ^ (b4 << 16);
                }
            } else {
                throw new AssertionError();
            }
        } else if (b > -12) {
            return -1;
        } else {
            return b;
        }
        return -1;
    }

    /* renamed from: b */
    static int m29350b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) charAt;
            i7++;
        }
        if (i7 == length) {
            return i + length;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 < 128 && i8 < i6) {
                i4 = i8 + 1;
                bArr[i8] = (byte) charAt2;
            } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                i8 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 & '?') | 128);
                i7++;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i8 <= i6 - 3) {
                int i10 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i4 = i11 + 1;
                bArr[i11] = (byte) ((charAt2 & '?') | 128);
            } else if (i8 <= i6 - 4) {
                int i12 = i7 + 1;
                if (i12 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i12);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i13 = i8 + 1;
                        bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i8 = i15 + 1;
                        bArr[i15] = (byte) ((codePoint & 63) | 128);
                        i7 = i12;
                        i7++;
                    } else {
                        i7 = i12;
                    }
                }
                throw new C8566yf(i7 - 1, length);
            } else if (charAt2 < 55296 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i8);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            } else {
                throw new C8566yf(i7, length);
            }
            i8 = i4;
            i7++;
        }
        return i8;
    }

    /* renamed from: c */
    static int m29351c(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C8566yf(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    static String m29352d(byte[] bArr, int i, int i2) {
        int i3;
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (r11 < i4) {
                byte b = bArr[r11];
                if (!C8512vf.m29196d(b)) {
                    break;
                }
                i = r11 + 1;
                cArr[i3] = (char) b;
                i5 = i3 + 1;
            }
            while (r11 < i4) {
                int i6 = r11 + 1;
                byte b2 = bArr[r11];
                if (C8512vf.m29196d(b2)) {
                    int i7 = i3 + 1;
                    cArr[i3] = (char) b2;
                    r11 = i6;
                    while (true) {
                        i3 = i7;
                        if (r11 >= i4) {
                            break;
                        }
                        byte b3 = bArr[r11];
                        if (!C8512vf.m29196d(b3)) {
                            break;
                        }
                        r11++;
                        i7 = i3 + 1;
                        cArr[i3] = (char) b3;
                    }
                } else if (b2 < -32) {
                    if (i6 < i4) {
                        C8512vf.m29194b(b2, bArr[i6], cArr, i3);
                        r11 = i6 + 1;
                        i3++;
                    } else {
                        throw C8366nd.m28886c();
                    }
                } else if (b2 < -16) {
                    if (i6 < i4 - 1) {
                        int i8 = i6 + 1;
                        C8512vf.m29195c(b2, bArr[i6], bArr[i8], cArr, i3);
                        r11 = i8 + 1;
                        i3++;
                    } else {
                        throw C8366nd.m28886c();
                    }
                } else if (i6 < i4 - 2) {
                    int i9 = i6 + 1;
                    int i10 = i9 + 1;
                    C8512vf.m29193a(b2, bArr[i6], bArr[i9], bArr[i10], cArr, i3);
                    i3 += 2;
                    r11 = i10 + 1;
                } else {
                    throw C8366nd.m28886c();
                }
            }
            return new String(cArr, 0, i3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: e */
    public static boolean m29353e(byte[] bArr) {
        return f23365a.mo22243b(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public static boolean m29354f(byte[] bArr, int i, int i2) {
        return f23365a.mo22243b(bArr, i, i2);
    }
}
