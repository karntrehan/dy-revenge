package p174e.p199d.p217b;

import java.io.IOException;

/* renamed from: e.d.b.a */
public final class C5699a extends IOException {
    public C5699a(int i, int i2, long j) {
        super(m21199a(i, i2, j));
    }

    public C5699a(String str) {
        super(str);
    }

    /* renamed from: a */
    private static String m21199a(int i, int i2, long j) {
        if (i < 0) {
            return String.format("Attempt to read from buffer using a negative index (%d)", new Object[]{Integer.valueOf(i)});
        } else if (i2 < 0) {
            return String.format("Number of requested bytes cannot be negative (%d)", new Object[]{Integer.valueOf(i2)});
        } else if ((((long) i) + ((long) i2)) - 1 > 2147483647L) {
            return String.format("Number of requested bytes summed with starting index exceed maximum range of signed 32 bit integers (requested index: %d, requested count: %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        } else {
            return String.format("Attempt to read from beyond end of underlying data source (requested index: %d, requested count: %d, max index: %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j - 1)});
        }
    }
}
