package com.mrousavy.camera.frameprocessor;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import androidx.camera.core.ImageProxy;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
@Keep
public class ImageProxyUtils {
    @C6410a
    @Keep
    public static int getBytesPerRow(ImageProxy imageProxy) {
        return imageProxy.mo2542m()[0].mo2545e();
    }

    @C6410a
    @Keep
    public static int getPlanesCount(ImageProxy imageProxy) {
        return imageProxy.mo2542m().length;
    }

    @C6410a
    @SuppressLint({"UnsafeOptInUsageError"})
    @Keep
    public static boolean isImageProxyValid(ImageProxy imageProxy) {
        try {
            if (imageProxy.mo2538b0() == null) {
                return false;
            }
            imageProxy.mo2538b0().getCropRect();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
