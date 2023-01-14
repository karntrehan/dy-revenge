package com.mrousavy.camera;

import com.facebook.react.bridge.Promise;
import com.facebook.react.modules.core.C2803f;

/* renamed from: com.mrousavy.camera.f */
public final /* synthetic */ class C5144f implements C2803f {

    /* renamed from: f */
    public final /* synthetic */ int f14630f;

    /* renamed from: o */
    public final /* synthetic */ Promise f14631o;

    public /* synthetic */ C5144f(int i, Promise promise) {
        this.f14630f = i;
        this.f14631o = promise;
    }

    public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        return CameraViewModule.m37325requestCameraPermission$lambda4(this.f14630f, this.f14631o, i, strArr, iArr);
    }
}
