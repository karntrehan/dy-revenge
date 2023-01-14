package androidx.camera.camera2.p003e.p004j3.p007t0;

import android.util.Size;
import androidx.camera.camera2.p003e.p004j3.p006s0.C0453e;
import androidx.camera.core.impl.C0711a0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.camera.camera2.e.j3.t0.c */
public class C0475c {

    /* renamed from: a */
    private final C0453e f1608a;

    /* renamed from: b */
    private final Set<Size> f1609b;

    public C0475c(C0453e eVar) {
        this.f1608a = eVar;
        this.f1609b = eVar != null ? new HashSet<>(eVar.mo2210a()) : Collections.emptySet();
    }

    /* renamed from: a */
    public boolean mo2218a() {
        return this.f1608a != null;
    }

    /* renamed from: b */
    public boolean mo2219b(C0711a0 a0Var) {
        if (a0Var == null) {
            return false;
        }
        if (this.f1608a == null) {
            return true;
        }
        return this.f1609b.contains(new Size(a0Var.mo2811p(), a0Var.mo2809n()));
    }
}
