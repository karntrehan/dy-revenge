package com.facebook.imageutils;

import java.io.InputStream;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.facebook.imageutils.e */
class C2572e {

    /* renamed from: a */
    private static final Class<?> f7561a = C2572e.class;

    /* renamed from: com.facebook.imageutils.e$b */
    private static class C2574b {

        /* renamed from: a */
        boolean f7562a;

        /* renamed from: b */
        int f7563b;

        /* renamed from: c */
        int f7564c;

        private C2574b() {
        }
    }

    C2572e() {
    }

    /* renamed from: a */
    public static int m10714a(int i) {
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    /* renamed from: b */
    private static int m10715b(InputStream inputStream, int i, boolean z) {
        if (i >= 10 && C2571d.m10713a(inputStream, 2, z) == 3 && C2571d.m10713a(inputStream, 4, z) == 1) {
            return C2571d.m10713a(inputStream, 2, z);
        }
        return 0;
    }

    /* renamed from: c */
    private static int m10716c(InputStream inputStream, int i, boolean z, int i2) {
        if (i < 14) {
            return 0;
        }
        int a = C2571d.m10713a(inputStream, 2, z);
        int i3 = i - 2;
        while (true) {
            int i4 = a - 1;
            if (a <= 0 || i3 < 12) {
                return 0;
            }
            int i5 = i3 - 2;
            if (C2571d.m10713a(inputStream, 2, z) == i2) {
                return i5;
            }
            inputStream.skip(10);
            i3 = i5 - 10;
            a = i4;
        }
        return 0;
    }

    /* renamed from: d */
    public static int m10717d(InputStream inputStream, int i) {
        C2574b bVar = new C2574b();
        int e = m10718e(inputStream, i, bVar);
        int i2 = bVar.f7564c - 8;
        if (e == 0 || i2 > e) {
            return 0;
        }
        inputStream.skip((long) i2);
        return m10715b(inputStream, m10716c(inputStream, e - i2, bVar.f7562a, 274), bVar.f7562a);
    }

    /* renamed from: e */
    private static int m10718e(InputStream inputStream, int i, C2574b bVar) {
        Class<?> cls;
        String str;
        if (i <= 8) {
            return 0;
        }
        int a = C2571d.m10713a(inputStream, 4, false);
        bVar.f7563b = a;
        int i2 = i - 4;
        if (a == 1229531648 || a == 1296891946) {
            boolean z = a == 1229531648;
            bVar.f7562a = z;
            int a2 = C2571d.m10713a(inputStream, 4, z);
            bVar.f7564c = a2;
            int i3 = i2 - 4;
            if (a2 >= 8 && a2 - 8 <= i3) {
                return i3;
            }
            cls = f7561a;
            str = "Invalid offset";
        } else {
            cls = f7561a;
            str = "Invalid TIFF header";
        }
        C6071a.m22871e(cls, str);
        return 0;
    }
}
