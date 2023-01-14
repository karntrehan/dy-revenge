package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p174e.p247e.p253d.p257d.C6052d;
import p174e.p247e.p253d.p257d.C6062k;

@C6052d
public class Bitmaps {
    static {
        C2435a.m10146a();
    }

    @C6052d
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z = true;
        C6062k.m22834b(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        C6062k.m22834b(Boolean.valueOf(bitmap.isMutable()));
        C6062k.m22834b(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z = false;
        }
        C6062k.m22834b(Boolean.valueOf(z));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @C6052d
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
