package androidx.camera.core;

import android.view.Surface;

/* renamed from: androidx.camera.core.h0 */
public final /* synthetic */ class C0691h0 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ Surface f2158f;

    public /* synthetic */ C0691h0(Surface surface) {
        this.f2158f = surface;
    }

    public final void run() {
        this.f2158f.release();
    }
}
