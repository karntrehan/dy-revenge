package androidx.camera.core;

import androidx.camera.core.C0693h2;

/* renamed from: androidx.camera.core.s */
public final /* synthetic */ class C0963s implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0693h2.C0700g f2700f;

    /* renamed from: o */
    public final /* synthetic */ int f2701o;

    /* renamed from: p */
    public final /* synthetic */ String f2702p;

    /* renamed from: q */
    public final /* synthetic */ Throwable f2703q;

    public /* synthetic */ C0963s(C0693h2.C0700g gVar, int i, String str, Throwable th) {
        this.f2700f = gVar;
        this.f2701o = i;
        this.f2702p = str;
        this.f2703q = th;
    }

    public final void run() {
        this.f2700f.mo2779e(this.f2701o, this.f2702p, this.f2703q);
    }
}
