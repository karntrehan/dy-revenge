package androidx.camera.camera2.p003e.p004j3.p007t0;

import android.util.Size;
import androidx.camera.camera2.p003e.p004j3.p006s0.C0457i;
import androidx.camera.camera2.p003e.p004j3.p006s0.C0467s;
import androidx.camera.core.impl.C0879s2;

/* renamed from: androidx.camera.camera2.e.j3.t0.g */
public class C0479g {

    /* renamed from: a */
    private final C0467s f1612a;

    public C0479g() {
        this((C0467s) C0457i.m1980a(C0467s.class));
    }

    C0479g(C0467s sVar) {
        this.f1612a = sVar;
    }

    /* renamed from: a */
    public Size mo2223a(Size size) {
        Size c;
        C0467s sVar = this.f1612a;
        if (sVar == null || (c = sVar.mo2214c(C0879s2.C0881b.PRIV)) == null) {
            return size;
        }
        return c.getWidth() * c.getHeight() > size.getWidth() * size.getHeight() ? c : size;
    }
}
