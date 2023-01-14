package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.r1 */
final /* synthetic */ class C4425r1 implements Runnable {

    /* renamed from: f */
    private final C4439v f12625f;

    private C4425r1(C4439v vVar) {
        this.f12625f = vVar;
    }

    /* renamed from: a */
    static Runnable m16930a(C4439v vVar) {
        return new C4425r1(vVar);
    }

    public final void run() {
        this.f12625f.mo13926F();
    }
}
