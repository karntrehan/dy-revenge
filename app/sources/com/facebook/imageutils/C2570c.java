package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: com.facebook.imageutils.c */
public class C2570c {
    /* renamed from: a */
    public static int m10708a(int i) {
        return C2572e.m10714a(i);
    }

    /* renamed from: b */
    public static int m10709b(InputStream inputStream) {
        try {
            int d = m10711d(inputStream);
            if (d == 0) {
                return 0;
            }
            return C2572e.m10717d(inputStream, d);
        } catch (IOException unused) {
            return 0;
        }
    }

    /* renamed from: c */
    private static boolean m10710c(int i) {
        switch (i) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: d */
    private static int m10711d(InputStream inputStream) {
        int a;
        if (m10712e(inputStream, 225) && (a = C2571d.m10713a(inputStream, 2, false) - 2) > 6) {
            int a2 = C2571d.m10713a(inputStream, 4, false);
            int a3 = C2571d.m10713a(inputStream, 2, false);
            int i = (a - 4) - 2;
            if (a2 == 1165519206 && a3 == 0) {
                return i;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: e */
    public static boolean m10712e(InputStream inputStream, int i) {
        C6062k.m22839g(inputStream);
        while (C2571d.m10713a(inputStream, 1, false) == 255) {
            int i2 = 255;
            while (i2 == 255) {
                i2 = C2571d.m10713a(inputStream, 1, false);
            }
            if ((i != 192 || !m10710c(i2)) && i2 != i) {
                if (!(i2 == 216 || i2 == 1)) {
                    if (i2 == 217 || i2 == 218) {
                        break;
                    }
                    inputStream.skip((long) (C2571d.m10713a(inputStream, 2, false) - 2));
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
