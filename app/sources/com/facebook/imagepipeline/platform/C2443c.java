package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import androidx.core.util.C1176g;
import com.facebook.imagepipeline.memory.C2405e;
import com.facebook.imageutils.C2567a;

@TargetApi(26)
/* renamed from: com.facebook.imagepipeline.platform.c */
public class C2443c extends C2442b {
    public C2443c(C2405e eVar, int i, C1176g gVar) {
        super(eVar, i, gVar);
    }

    /* renamed from: g */
    private static boolean m10170g(BitmapFactory.Options options) {
        ColorSpace colorSpace = options.outColorSpace;
        return (colorSpace == null || !colorSpace.isWideGamut() || options.inPreferredConfig == Bitmap.Config.RGBA_F16) ? false : true;
    }

    /* renamed from: e */
    public int mo8196e(int i, int i2, BitmapFactory.Options options) {
        if (m10170g(options)) {
            return i * i2 * 8;
        }
        Bitmap.Config config = options.inPreferredConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return C2567a.m10704d(i, i2, config);
    }
}
