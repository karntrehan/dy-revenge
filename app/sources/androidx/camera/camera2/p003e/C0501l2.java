package androidx.camera.camera2.p003e;

import androidx.camera.camera2.p003e.p004j3.C0386a0;
import androidx.camera.core.C0984u1;

/* renamed from: androidx.camera.camera2.e.l2 */
public final class C0501l2 {
    /* renamed from: a */
    public static C0984u1 m2043a(C0386a0 a0Var) {
        int d = a0Var.mo2075d();
        int i = 5;
        if (d == 1) {
            i = 1;
        } else if (d == 2) {
            i = 2;
        } else if (d == 3) {
            i = 3;
        } else if (d == 4) {
            i = 4;
        } else if (d != 5) {
            i = d != 10001 ? 0 : 6;
        }
        return new C0984u1(i, a0Var);
    }
}
