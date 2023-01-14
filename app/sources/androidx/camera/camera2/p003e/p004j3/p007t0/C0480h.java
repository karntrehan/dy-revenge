package androidx.camera.camera2.p003e.p004j3.p007t0;

import android.graphics.PointF;
import androidx.camera.camera2.p003e.p004j3.p006s0.C0450b;
import androidx.camera.core.C0958q2;
import androidx.camera.core.impl.C0823i2;

/* renamed from: androidx.camera.camera2.e.j3.t0.h */
public class C0480h {

    /* renamed from: a */
    private final C0823i2 f1613a;

    public C0480h(C0823i2 i2Var) {
        this.f1613a = i2Var;
    }

    /* renamed from: a */
    public PointF mo2224a(C0958q2 q2Var, int i) {
        return (i != 1 || !this.f1613a.mo3014a(C0450b.class)) ? new PointF(q2Var.mo3202c(), q2Var.mo3203d()) : new PointF(1.0f - q2Var.mo3202c(), q2Var.mo3203d());
    }
}
