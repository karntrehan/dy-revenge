package androidx.camera.core.p009e3.p010p.p012f;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.p009e3.p010p.p011e.C0668a;
import androidx.camera.core.p009e3.p010p.p011e.C0670c;

/* renamed from: androidx.camera.core.e3.p.f.b */
public class C0675b {
    /* renamed from: a */
    public boolean mo2717a() {
        C0670c cVar = (C0670c) C0668a.m2796a(C0670c.class);
        if (cVar != null) {
            return cVar.mo2715c(C0788c1.f2357a);
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo2718b(ImageProxy imageProxy) {
        C0670c cVar = (C0670c) C0668a.m2796a(C0670c.class);
        return (cVar == null || cVar.mo2715c(C0788c1.f2357a)) && imageProxy.mo2543q0() == 256;
    }
}
