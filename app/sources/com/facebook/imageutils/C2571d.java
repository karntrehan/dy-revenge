package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imageutils.d */
class C2571d {
    /* renamed from: a */
    public static int m10713a(InputStream inputStream, int i, boolean z) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int read = inputStream.read();
            if (read != -1) {
                if (z) {
                    i2 = (read & 255) << (i3 * 8);
                } else {
                    i4 <<= 8;
                    i2 = read & 255;
                }
                i4 |= i2;
                i3++;
            } else {
                throw new IOException("no more bytes");
            }
        }
        return i4;
    }
}
