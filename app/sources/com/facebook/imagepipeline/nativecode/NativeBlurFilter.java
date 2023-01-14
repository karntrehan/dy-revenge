package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p174e.p247e.p253d.p257d.C6052d;
import p174e.p247e.p253d.p257d.C6062k;

@C6052d
public class NativeBlurFilter {
    static {
        C2436b.m10147a();
    }

    /* renamed from: a */
    public static void m10139a(Bitmap bitmap, int i, int i2) {
        C6062k.m22839g(bitmap);
        boolean z = true;
        C6062k.m22834b(Boolean.valueOf(i > 0));
        if (i2 <= 0) {
            z = false;
        }
        C6062k.m22834b(Boolean.valueOf(z));
        nativeIterativeBoxBlur(bitmap, i, i2);
    }

    @C6052d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
