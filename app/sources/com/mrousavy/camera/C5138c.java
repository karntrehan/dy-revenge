package com.mrousavy.camera;

import java.util.ArrayList;

/* renamed from: com.mrousavy.camera.c */
public final /* synthetic */ class C5138c implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ CameraView f14625f;

    /* renamed from: o */
    public final /* synthetic */ ArrayList f14626o;

    public /* synthetic */ C5138c(CameraView cameraView, ArrayList arrayList) {
        this.f14625f = cameraView;
        this.f14626o = arrayList;
    }

    public final void run() {
        CameraView.m19361y(this.f14625f, this.f14626o);
    }
}
