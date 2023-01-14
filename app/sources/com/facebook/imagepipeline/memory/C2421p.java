package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import java.util.Set;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6064m;

/* renamed from: com.facebook.imagepipeline.memory.p */
public class C2421p implements C2405e {

    /* renamed from: a */
    private final Set<Bitmap> f7196a = C6064m.m22845b();

    /* renamed from: f */
    public Bitmap get(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
        this.f7196a.add(createBitmap);
        return createBitmap;
    }

    /* renamed from: g */
    public void mo8068a(Bitmap bitmap) {
        C6062k.m22839g(bitmap);
        this.f7196a.remove(bitmap);
        bitmap.recycle();
    }
}
