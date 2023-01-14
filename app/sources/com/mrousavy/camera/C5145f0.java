package com.mrousavy.camera;

import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.f0 */
public final class C5145f0 extends C5152g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5145f0(Throwable th) {
        super("device", "parallel-video-processing-not-supported", "The given LEGACY Camera device does not support parallel video processing (`video={true}` + `frameProcessor={...}`). Disable either `video` or `frameProcessor`. To find out if a device supports parallel video processing, check the `supportsParallelVideoProcessing` property on the CameraDevice. See https://mrousavy.github.io/react-native-vision-camera/docs/guides/devices#the-supportsparallelvideoprocessing-prop for more information.", th);
        C10457l.m35320e(th, "cause");
    }
}
