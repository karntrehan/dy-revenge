package com.facebook.yoga;

/* renamed from: com.facebook.yoga.o */
public class C3315o {
    /* renamed from: a */
    public static long m12981a(float f, float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        return ((long) Float.floatToRawIntBits(f2)) | (((long) floatToRawIntBits) << 32);
    }

    /* renamed from: b */
    public static long m12982b(int i, int i2) {
        return m12981a((float) i, (float) i2);
    }
}
