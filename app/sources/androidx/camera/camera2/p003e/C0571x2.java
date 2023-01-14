package androidx.camera.camera2.p003e;

import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p003e.p004j3.p007t0.C0478f;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0849n1;
import androidx.camera.core.impl.C0908x2;

/* renamed from: androidx.camera.camera2.e.x2 */
final class C0571x2 extends C0582z1 {

    /* renamed from: b */
    static final C0571x2 f1888b = new C0571x2(new C0478f());

    /* renamed from: c */
    private final C0478f f1889c;

    private C0571x2(C0478f fVar) {
        this.f1889c = fVar;
    }

    /* renamed from: a */
    public void mo2471a(C0908x2<?> x2Var, C0788c1.C0789a aVar) {
        super.mo2471a(x2Var, aVar);
        if (x2Var instanceof C0849n1) {
            C0849n1 n1Var = (C0849n1) x2Var;
            C0304b.C0305a aVar2 = new C0304b.C0305a();
            if (n1Var.mo3071P()) {
                this.f1889c.mo2222a(n1Var.mo3063H(), aVar2);
            }
            aVar.mo2961e(aVar2.mo1886a());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
