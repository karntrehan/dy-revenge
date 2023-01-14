package p174e.p319f.p393c.p394a.p395a0;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: e.f.c.a.a0.q */
class C9206q {
    /* renamed from: a */
    static byte[] m30584a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            int i = 0;
            long c = m30586c(bArr3, 0, 0) & 67108863;
            int i2 = 3;
            long c2 = m30586c(bArr3, 3, 2) & 67108611;
            long c3 = m30586c(bArr3, 6, 4) & 67092735;
            long c4 = m30586c(bArr3, 9, 6) & 66076671;
            long c5 = m30586c(bArr3, 12, 8) & 1048575;
            long j = c2 * 5;
            long j2 = c3 * 5;
            long j3 = c4 * 5;
            long j4 = c5 * 5;
            byte[] bArr5 = new byte[17];
            long j5 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            int i3 = 0;
            while (i3 < bArr4.length) {
                m30585b(bArr5, bArr4, i3);
                long c6 = j9 + m30586c(bArr5, i, i);
                long c7 = j5 + m30586c(bArr5, i2, 2);
                long c8 = j6 + m30586c(bArr5, 6, 4);
                long c9 = j7 + m30586c(bArr5, 9, 6);
                long c10 = j8 + (m30586c(bArr5, 12, 8) | ((long) (bArr5[16] << 24)));
                long j10 = (c6 * c) + (c7 * j4) + (c8 * j3) + (c9 * j2) + (c10 * j);
                long j11 = (c6 * c2) + (c7 * c) + (c8 * j4) + (c9 * j3) + (c10 * j2) + (j10 >> 26);
                long j12 = (c6 * c3) + (c7 * c2) + (c8 * c) + (c9 * j4) + (c10 * j3) + (j11 >> 26);
                long j13 = (c6 * c4) + (c7 * c3) + (c8 * c2) + (c9 * c) + (c10 * j4) + (j12 >> 26);
                long j14 = (c6 * c5) + (c7 * c4) + (c8 * c3) + (c9 * c2) + (c10 * c) + (j13 >> 26);
                long j15 = (j10 & 67108863) + ((j14 >> 26) * 5);
                j5 = (j11 & 67108863) + (j15 >> 26);
                i3 += 16;
                j6 = j12 & 67108863;
                j7 = j13 & 67108863;
                j8 = j14 & 67108863;
                i2 = 3;
                j9 = j15 & 67108863;
                i = 0;
            }
            long j16 = j6 + (j5 >> 26);
            long j17 = j16 & 67108863;
            long j18 = j7 + (j16 >> 26);
            long j19 = j18 & 67108863;
            long j20 = j8 + (j18 >> 26);
            long j21 = j20 & 67108863;
            long j22 = j9 + ((j20 >> 26) * 5);
            long j23 = j22 & 67108863;
            long j24 = (j5 & 67108863) + (j22 >> 26);
            long j25 = j23 + 5;
            long j26 = j25 & 67108863;
            long j27 = (j25 >> 26) + j24;
            long j28 = j17 + (j27 >> 26);
            long j29 = j19 + (j28 >> 26);
            long j30 = (j21 + (j29 >> 26)) - 67108864;
            long j31 = j30 >> 63;
            long j32 = j23 & j31;
            long j33 = j24 & j31;
            long j34 = j17 & j31;
            long j35 = j19 & j31;
            long j36 = j21 & j31;
            long j37 = ~j31;
            long j38 = (j27 & 67108863 & j37) | j33;
            long j39 = (j28 & 67108863 & j37) | j34;
            long j40 = (j29 & 67108863 & j37) | j35;
            long d = ((j32 | (j26 & j37) | (j38 << 26)) & 4294967295L) + m30587d(bArr3, 16);
            long j41 = d & 4294967295L;
            long d2 = (((j38 >> 6) | (j39 << 20)) & 4294967295L) + m30587d(bArr3, 20) + (d >> 32);
            long d3 = (((j39 >> 12) | (j40 << 14)) & 4294967295L) + m30587d(bArr3, 24) + (d2 >> 32);
            byte[] bArr6 = new byte[16];
            m30588e(bArr6, j41, 0);
            m30588e(bArr6, d2 & 4294967295L, 4);
            m30588e(bArr6, d3 & 4294967295L, 8);
            m30588e(bArr6, ((((j40 >> 18) | (((j30 & j37) | j36) << 8)) & 4294967295L) + m30587d(bArr3, 28) + (d3 >> 32)) & 4294967295L, 12);
            return bArr6;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    /* renamed from: b */
    private static void m30585b(byte[] bArr, byte[] bArr2, int i) {
        int min = Math.min(16, bArr2.length - i);
        System.arraycopy(bArr2, i, bArr, 0, min);
        bArr[min] = 1;
        if (min != 16) {
            Arrays.fill(bArr, min + 1, bArr.length, (byte) 0);
        }
    }

    /* renamed from: c */
    private static long m30586c(byte[] bArr, int i, int i2) {
        return (m30587d(bArr, i) >> i2) & 67108863;
    }

    /* renamed from: d */
    private static long m30587d(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    /* renamed from: e */
    private static void m30588e(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }

    /* renamed from: f */
    static void m30589f(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!C9189g.m30531b(m30584a(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
