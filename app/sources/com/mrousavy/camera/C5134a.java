package com.mrousavy.camera;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.mrousavy.camera.a */
public final /* synthetic */ class C5134a implements View.OnTouchListener {

    /* renamed from: f */
    public final /* synthetic */ CameraView f14623f;

    public /* synthetic */ C5134a(CameraView cameraView) {
        this.f14623f = cameraView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return CameraView.m19340a(this.f14623f, view, motionEvent);
    }
}
