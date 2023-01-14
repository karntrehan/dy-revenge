package androidx.camera.core;

import androidx.camera.core.impl.C0889u1;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0768f;

/* renamed from: androidx.camera.core.f2 */
final class C0682f2 extends C0644e2 {

    /* renamed from: androidx.camera.core.f2$a */
    class C0683a implements C0765d<Void> {

        /* renamed from: a */
        final /* synthetic */ ImageProxy f2140a;

        C0683a(ImageProxy imageProxy) {
            this.f2140a = imageProxy;
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            this.f2140a.close();
        }

        /* renamed from: c */
        public void mo1980a(Void voidR) {
        }
    }

    C0682f2() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ImageProxy mo2670b(C0889u1 u1Var) {
        return u1Var.mo2642i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2673e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2677p(ImageProxy imageProxy) {
        C0768f.m3075a(mo2671c(imageProxy), new C0683a(imageProxy), C0744a.m3044a());
    }
}
