package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: com.facebook.imagepipeline.memory.o */
public class C2420o implements C2405e {
    /* renamed from: f */
    public Bitmap get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }

    /* renamed from: g */
    public void mo8068a(Bitmap bitmap) {
        C6062k.m22839g(bitmap);
        bitmap.recycle();
    }
}
