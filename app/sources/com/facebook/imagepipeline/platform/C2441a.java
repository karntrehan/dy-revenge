package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.util.C1176g;
import androidx.core.util.C1177h;
import com.facebook.imagepipeline.memory.C2405e;
import com.facebook.imageutils.C2567a;

@TargetApi(21)
/* renamed from: com.facebook.imagepipeline.platform.a */
public class C2441a extends C2442b {
    public C2441a(C2405e eVar, int i, C1176g gVar) {
        super(eVar, i, gVar);
    }

    /* renamed from: e */
    public int mo8196e(int i, int i2, BitmapFactory.Options options) {
        return C2567a.m10704d(i, i2, (Bitmap.Config) C1177h.m4583e(options.inPreferredConfig));
    }
}
