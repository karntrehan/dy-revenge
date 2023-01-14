package androidx.camera.extensions.p017f;

import android.hardware.camera2.CaptureRequest;
import android.util.Pair;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0800e1;
import androidx.camera.extensions.impl.CaptureStageImpl;

/* renamed from: androidx.camera.extensions.f.b */
public final class C1030b implements C0800e1 {

    /* renamed from: a */
    private final C0788c1 f2891a;

    /* renamed from: b */
    private final int f2892b;

    public C1030b(CaptureStageImpl captureStageImpl) {
        this.f2892b = captureStageImpl.getId();
        C0304b.C0305a aVar = new C0304b.C0305a();
        for (Pair pair : captureStageImpl.getParameters()) {
            aVar.mo1889e((CaptureRequest.Key) pair.first, pair.second);
        }
        C0788c1.C0789a aVar2 = new C0788c1.C0789a();
        aVar2.mo2961e(aVar.mo1886a());
        this.f2891a = aVar2.mo2964h();
    }

    /* renamed from: a */
    public int mo2980a() {
        return this.f2892b;
    }

    /* renamed from: b */
    public C0788c1 mo2981b() {
        return this.f2891a;
    }
}
