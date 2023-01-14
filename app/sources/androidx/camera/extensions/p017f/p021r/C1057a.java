package androidx.camera.extensions.p017f.p021r;

import android.media.ImageReader;

/* renamed from: androidx.camera.extensions.f.r.a */
public final /* synthetic */ class C1057a implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ ImageReader f2949f;

    public /* synthetic */ C1057a(ImageReader imageReader) {
        this.f2949f = imageReader;
    }

    public final void run() {
        this.f2949f.close();
    }
}
