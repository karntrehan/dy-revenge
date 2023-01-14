package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.core.C0938m1;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.p014a3.C0743m;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.lifecycle.C1300m;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.camera2.e.g3 */
final class C0364g3 {

    /* renamed from: a */
    private final C0542u1 f1443a;

    /* renamed from: b */
    private final C1300m<Integer> f1444b;

    /* renamed from: c */
    private final boolean f1445c;

    /* renamed from: d */
    private final Executor f1446d;

    /* renamed from: e */
    private boolean f1447e;

    /* renamed from: f */
    C1814b.C1815a<Void> f1448f;

    /* renamed from: g */
    boolean f1449g;

    C0364g3(C0542u1 u1Var, C0402g0 g0Var, Executor executor) {
        this.f1443a = u1Var;
        this.f1446d = executor;
        Boolean bool = (Boolean) g0Var.mo2119a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        this.f1445c = bool != null && bool.booleanValue();
        this.f1444b = new C1300m<>(0);
        u1Var.mo2336j(new C0500l1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ Object mo2026g(boolean z, C1814b.C1815a aVar) {
        this.f1446d.execute(new C0495k1(this, aVar, z));
        return "enableTorch: " + z;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ boolean mo2027i(TotalCaptureResult totalCaptureResult) {
        if (this.f1448f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.f1449g) {
                this.f1448f.mo6308c(null);
                this.f1448f = null;
            }
        }
        return false;
    }

    /* renamed from: k */
    private <T> void m1745k(C1300m<T> mVar, T t) {
        if (C0743m.m3043b()) {
            mVar.mo4316n(t);
        } else {
            mVar.mo4314l(t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C9172b<Void> mo2022a(boolean z) {
        if (!this.f1445c) {
            C0949o2.m3688a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return C0768f.m3079e(new IllegalStateException("No flash unit"));
        }
        m1745k(this.f1444b, Integer.valueOf(z ? 1 : 0));
        return C1814b.m7736a(new C0504m1(this, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1742d(C1814b.C1815a<Void> aVar, boolean z) {
        if (!this.f1445c) {
            if (aVar != null) {
                aVar.mo6310f(new IllegalStateException("No flash unit"));
            }
        } else if (!this.f1447e) {
            m1745k(this.f1444b, 0);
            if (aVar != null) {
                aVar.mo6310f(new C0938m1.C0939a("Camera is not active."));
            }
        } else {
            this.f1449g = z;
            this.f1443a.mo2339m(z);
            m1745k(this.f1444b, Integer.valueOf(z ? 1 : 0));
            C1814b.C1815a<Void> aVar2 = this.f1448f;
            if (aVar2 != null) {
                aVar2.mo6310f(new C0938m1.C0939a("There is a new enableTorch being set"));
            }
            this.f1448f = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public LiveData<Integer> mo2024c() {
        return this.f1444b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2028j(boolean z) {
        if (this.f1447e != z) {
            this.f1447e = z;
            if (!z) {
                if (this.f1449g) {
                    this.f1449g = false;
                    this.f1443a.mo2339m(false);
                    m1745k(this.f1444b, 0);
                }
                C1814b.C1815a<Void> aVar = this.f1448f;
                if (aVar != null) {
                    aVar.mo6310f(new C0938m1.C0939a("Camera is not active."));
                    this.f1448f = null;
                }
            }
        }
    }
}
