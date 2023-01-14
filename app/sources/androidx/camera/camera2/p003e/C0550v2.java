package androidx.camera.camera2.p003e;

import androidx.camera.camera2.p003e.p004j3.C0402g0;

/* renamed from: androidx.camera.camera2.e.v2 */
class C0550v2 {

    /* renamed from: a */
    private final Object f1785a = new Object();

    /* renamed from: b */
    private final C0402g0 f1786b;

    /* renamed from: c */
    private int f1787c;

    C0550v2(C0402g0 g0Var, int i) {
        this.f1786b = g0Var;
        this.f1787c = i;
    }

    /* renamed from: a */
    public int mo2366a() {
        int i;
        synchronized (this.f1785a) {
            i = this.f1787c;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2367b(int i) {
        synchronized (this.f1785a) {
            this.f1787c = i;
        }
    }
}
