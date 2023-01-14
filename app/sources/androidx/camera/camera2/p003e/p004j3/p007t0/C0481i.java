package androidx.camera.camera2.p003e.p004j3.p007t0;

import androidx.camera.camera2.p003e.p004j3.p006s0.C0452d;
import androidx.camera.core.impl.C0823i2;

/* renamed from: androidx.camera.camera2.e.j3.t0.i */
public class C0481i {

    /* renamed from: a */
    private final boolean f1614a;

    /* renamed from: b */
    private boolean f1615b = false;

    public C0481i(C0823i2 i2Var) {
        boolean z = false;
        this.f1614a = i2Var.mo3015b(C0452d.class) != null ? true : z;
    }

    /* renamed from: a */
    public void mo2225a() {
        this.f1615b = false;
    }

    /* renamed from: b */
    public void mo2226b() {
        this.f1615b = true;
    }

    /* renamed from: c */
    public boolean mo2227c(int i) {
        return this.f1615b && i == 0 && this.f1614a;
    }
}
