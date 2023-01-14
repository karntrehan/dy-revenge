package androidx.camera.camera2.p003e;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p003e.C0542u1;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.core.C0938m1;
import java.util.concurrent.Executor;
import p027c.p061g.p062a.C1814b;

/* renamed from: androidx.camera.camera2.e.u2 */
public class C0546u2 {

    /* renamed from: a */
    private final C0542u1 f1770a;

    /* renamed from: b */
    private final C0550v2 f1771b;

    /* renamed from: c */
    private final Executor f1772c;

    /* renamed from: d */
    private boolean f1773d = false;

    /* renamed from: e */
    private C1814b.C1815a<Integer> f1774e;

    /* renamed from: f */
    private C0542u1.C0545c f1775f;

    C0546u2(C0542u1 u1Var, C0402g0 g0Var, Executor executor) {
        this.f1770a = u1Var;
        this.f1771b = new C0550v2(g0Var, 0);
        this.f1772c = executor;
    }

    /* renamed from: a */
    private void m2214a() {
        C1814b.C1815a<Integer> aVar = this.f1774e;
        if (aVar != null) {
            aVar.mo6310f(new C0938m1.C0939a("Cancelled by another setExposureCompensationIndex()"));
            this.f1774e = null;
        }
        C0542u1.C0545c cVar = this.f1775f;
        if (cVar != null) {
            this.f1770a.mo2317X(cVar);
            this.f1775f = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2358b(boolean z) {
        if (z != this.f1773d) {
            this.f1773d = z;
            if (!z) {
                this.f1771b.mo2367b(0);
                m2214a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2359c(C0304b.C0305a aVar) {
        aVar.mo1889e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f1771b.mo2366a()));
    }
}
