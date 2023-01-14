package p477h.p478a.p479a.p492i;

import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import p477h.p478a.p479a.p488f.C10544k;
import p477h.p478a.p479a.p488f.p489r.C10555d;

/* renamed from: h.a.a.i.h */
public class C10585h {
    /* renamed from: a */
    public static byte[] m35934a(char[] cArr) {
        byte[] bArr = new byte[cArr.length];
        for (int i = 0; i < cArr.length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    /* renamed from: b */
    private static long m35935b(long j) {
        int i = (int) ((j << 1) & 62);
        int i2 = (int) ((j >> 5) & 63);
        int i3 = (int) ((j >> 11) & 31);
        int i4 = (int) ((j >> 16) & 31);
        int i5 = (int) (((j >> 25) & 127) + 1980);
        Calendar instance = Calendar.getInstance();
        instance.set(i5, (int) (((j >> 21) & 15) - 1), i4, i3, i2, i);
        instance.set(14, 0);
        return instance.getTime().getTime();
    }

    /* renamed from: c */
    public static long m35936c(long j) {
        return m35935b(j) + (j >> 32);
    }

    /* renamed from: d */
    private static long m35937d(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(1);
        if (i < 1980) {
            return 2162688;
        }
        return (long) ((instance.get(13) >> 1) | ((i - 1980) << 25) | ((instance.get(2) + 1) << 21) | (instance.get(5) << 16) | (instance.get(11) << 11) | (instance.get(12) << 5));
    }

    /* renamed from: e */
    public static long m35938e(long j) {
        if (j < 0) {
            return 2162688;
        }
        long d = m35937d(j);
        if (d != 2162688) {
            return d + ((j % 2000) << 32);
        }
        return 2162688;
    }

    /* renamed from: f */
    public static C10555d m35939f(C10544k kVar) {
        if (kVar.mo26035e() != C10555d.AES_INTERNAL_ONLY) {
            return kVar.mo26035e();
        }
        if (kVar.mo26033c() != null) {
            return kVar.mo26033c().mo26011e();
        }
        throw new RuntimeException("AesExtraDataRecord not present in local header for aes encrypted data");
    }

    /* renamed from: g */
    public static boolean m35940g(String str) {
        return str != null && str.trim().length() > 0;
    }

    /* renamed from: h */
    public static int m35941h(InputStream inputStream, byte[] bArr) {
        int read = inputStream.read(bArr);
        if (read == bArr.length || (read = m35943j(inputStream, bArr, read)) == bArr.length) {
            return read;
        }
        throw new IOException("Cannot read fully into byte buffer");
    }

    /* renamed from: i */
    public static int m35942i(InputStream inputStream, byte[] bArr, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative offset");
        } else if (i2 >= 0) {
            int i3 = 0;
            if (i2 == 0) {
                return 0;
            }
            if (i + i2 <= bArr.length) {
                while (i3 != i2) {
                    int read = inputStream.read(bArr, i + i3, i2 - i3);
                    if (read != -1) {
                        i3 += read;
                    } else if (i3 == 0) {
                        return -1;
                    } else {
                        return i3;
                    }
                }
                return i3;
            }
            throw new IllegalArgumentException("Length greater than buffer size");
        } else {
            throw new IllegalArgumentException("Negative length");
        }
    }

    /* renamed from: j */
    private static int m35943j(InputStream inputStream, byte[] bArr, int i) {
        int length = bArr.length - i;
        int i2 = 1;
        int i3 = 0;
        while (i < bArr.length && i3 != -1 && i2 < 15) {
            i3 = inputStream.read(bArr, i, length);
            if (i3 > 0) {
                i += i3;
                length -= i3;
            }
            i2++;
        }
        return i;
    }
}
