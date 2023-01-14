package androidx.camera.core;

import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.v */
public final /* synthetic */ class C0987v implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C9172b f2774f;

    public /* synthetic */ C0987v(C9172b bVar) {
        this.f2774f = bVar;
    }

    public final void run() {
        this.f2774f.cancel(true);
    }
}
