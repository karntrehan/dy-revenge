package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.imageutils.C2567a;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.facebook.imagepipeline.memory.f */
public class C2407f extends C2427t<Bitmap> {
    /* renamed from: e */
    public Bitmap get(int i) {
        Bitmap bitmap = (Bitmap) super.get(i);
        if (bitmap == null || !mo8124g(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    /* renamed from: f */
    public int mo8095a(Bitmap bitmap) {
        return C2567a.m10705e(bitmap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo8124g(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            C6071a.m22866N("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            C6071a.m22866N("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }

    /* renamed from: h */
    public void mo8097c(Bitmap bitmap) {
        if (mo8124g(bitmap)) {
            super.mo8097c(bitmap);
        }
    }
}
