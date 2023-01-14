package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.soloader.C3264d;

@C3264d
class PreverificationHelper {
    PreverificationHelper() {
    }

    /* access modifiers changed from: package-private */
    @TargetApi(26)
    @C3264d
    public boolean shouldUseHardwareBitmapConfig(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }
}
