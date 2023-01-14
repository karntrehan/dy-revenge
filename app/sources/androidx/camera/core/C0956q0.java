package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.C1011z2;
import androidx.core.util.C1170a;

/* renamed from: androidx.camera.core.q0 */
public final /* synthetic */ class C0956q0 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C1170a f2690f;

    /* renamed from: o */
    public final /* synthetic */ Surface f2691o;

    public /* synthetic */ C0956q0(C1170a aVar, Surface surface) {
        this.f2690f = aVar;
        this.f2691o = surface;
    }

    public final void run() {
        this.f2690f.mo2687a(C1011z2.C1017f.m3944c(3, this.f2691o));
    }
}
