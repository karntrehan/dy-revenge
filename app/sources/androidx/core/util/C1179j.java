package androidx.core.util;

import java.io.PrintWriter;

/* renamed from: androidx.core.util.j */
public final class C1179j {

    /* renamed from: a */
    private static final Object f3265a = new Object();

    /* renamed from: b */
    private static char[] f3266b = new char[24];

    /* renamed from: a */
    private static int m4587a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static void m4588b(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m4590d(j - j2, printWriter, 0);
        }
    }

    /* renamed from: c */
    public static void m4589c(long j, PrintWriter printWriter) {
        m4590d(j, printWriter, 0);
    }

    /* renamed from: d */
    public static void m4590d(long j, PrintWriter printWriter, int i) {
        synchronized (f3265a) {
            printWriter.print(new String(f3266b, 0, m4591e(j, i)));
        }
    }

    /* renamed from: e */
    private static int m4591e(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        int i7 = i;
        if (f3266b.length < i7) {
            f3266b = new char[i7];
        }
        char[] cArr = f3266b;
        int i8 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i8 == 0) {
            int i9 = i7 - 1;
            while (i9 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (i8 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i10 = (int) (j2 % 1000);
        int floor = (int) Math.floor((double) (j2 / 1000));
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i11 = floor / 60;
            i4 = floor - (i11 * 60);
            i5 = i11;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i7 != 0) {
            int a = m4587a(i2, 1, false, 0);
            int a2 = a + m4587a(i3, 1, a > 0, 2);
            int a3 = a2 + m4587a(i5, 1, a2 > 0, 2);
            int a4 = a3 + m4587a(i4, 1, a3 > 0, 2);
            i6 = 0;
            for (int a5 = a4 + m4587a(i10, 2, true, a4 > 0 ? 3 : 0) + 1; a5 < i7; a5++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i12 = i6 + 1;
        boolean z = i7 != 0;
        int i13 = i12;
        int f = m4592f(cArr, i2, 'd', i12, false, 0);
        int f2 = m4592f(cArr, i3, 'h', f, f != i13, z ? 2 : 0);
        int f3 = m4592f(cArr, i5, 'm', f2, f2 != i13, z ? 2 : 0);
        int f4 = m4592f(cArr, i4, 's', f3, f3 != i13, z ? 2 : 0);
        int f5 = m4592f(cArr, i10, 'm', f4, true, (!z || f4 == i13) ? 0 : 3);
        cArr[f5] = 's';
        return f5 + 1;
    }

    /* renamed from: f */
    private static int m4592f(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }
}
