package androidx.camera.core;

import android.os.HandlerThread;

/* renamed from: androidx.camera.core.a */
public final /* synthetic */ class C0603a implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ HandlerThread f1965f;

    public /* synthetic */ C0603a(HandlerThread handlerThread) {
        this.f1965f = handlerThread;
    }

    public final void run() {
        this.f1965f.quitSafely();
    }
}
