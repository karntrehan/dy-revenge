package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p174e.p247e.p253d.p257d.C6052d;
import p174e.p247e.p253d.p257d.C6062k;

@C6052d
public class NativeRoundingFilter {
    static {
        C2436b.m10147a();
    }

    @C6052d
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    @C6052d
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    @C6052d
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @C6052d
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    @C6052d
    public static void toCircle(Bitmap bitmap, boolean z) {
        C6062k.m22839g(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFilter(bitmap, z);
        }
    }

    @C6052d
    public static void toCircleFast(Bitmap bitmap, boolean z) {
        C6062k.m22839g(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFastFilter(bitmap, z);
        }
    }
}
