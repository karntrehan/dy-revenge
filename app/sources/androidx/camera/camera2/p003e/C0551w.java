package androidx.camera.camera2.p003e;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: androidx.camera.camera2.e.w */
public final /* synthetic */ class C0551w implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ Surface f1788f;

    /* renamed from: o */
    public final /* synthetic */ SurfaceTexture f1789o;

    public /* synthetic */ C0551w(Surface surface, SurfaceTexture surfaceTexture) {
        this.f1788f = surface;
        this.f1789o = surfaceTexture;
    }

    public final void run() {
        C0553w1.m2230E(this.f1788f, this.f1789o);
    }
}
