package androidx.camera.core.impl;

import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.e */
public final /* synthetic */ class C0798e implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C9172b f2375f;

    public /* synthetic */ C0798e(C9172b bVar) {
        this.f2375f = bVar;
    }

    public final void run() {
        this.f2375f.cancel(true);
    }
}
