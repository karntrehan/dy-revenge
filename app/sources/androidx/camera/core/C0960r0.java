package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.C1011z2;
import androidx.core.util.C1170a;

/* renamed from: androidx.camera.core.r0 */
public final /* synthetic */ class C0960r0 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C1170a f2697f;

    /* renamed from: o */
    public final /* synthetic */ Surface f2698o;

    public /* synthetic */ C0960r0(C1170a aVar, Surface surface) {
        this.f2697f = aVar;
        this.f2698o = surface;
    }

    public final void run() {
        this.f2697f.mo2687a(C1011z2.C1017f.m3944c(4, this.f2698o));
    }
}
