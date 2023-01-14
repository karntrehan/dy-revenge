package com.mrousavy.camera;

import com.facebook.react.bridge.Promise;
import com.facebook.react.modules.core.C2803f;

/* renamed from: com.mrousavy.camera.d */
public final /* synthetic */ class C5140d implements C2803f {

    /* renamed from: f */
    public final /* synthetic */ int f14627f;

    /* renamed from: o */
    public final /* synthetic */ Promise f14628o;

    public /* synthetic */ C5140d(int i, Promise promise) {
        this.f14627f = i;
        this.f14628o = promise;
    }

    public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        return CameraViewModule.m37326requestMicrophonePermission$lambda5(this.f14627f, this.f14628o, i, strArr, iArr);
    }
}
