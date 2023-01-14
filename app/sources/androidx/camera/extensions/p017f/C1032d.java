package androidx.camera.extensions.p017f;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.p002d.C0303a;
import androidx.camera.core.C0927j2;
import androidx.camera.core.impl.C0834l0;
import androidx.camera.core.impl.C0854o1;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.camera.extensions.impl.RequestUpdateProcessorImpl;
import androidx.core.util.C1177h;

/* renamed from: androidx.camera.extensions.f.d */
public final class C1032d implements C0854o1, C1039i {

    /* renamed from: a */
    private final PreviewExtenderImpl f2895a;

    /* renamed from: b */
    private final RequestUpdateProcessorImpl f2896b;

    /* renamed from: c */
    private C1038h f2897c = new C1038h();

    public C1032d(PreviewExtenderImpl previewExtenderImpl) {
        C1177h.m4580b(previewExtenderImpl.getProcessorType() == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY, "AdaptingRequestUpdateProcess can only adapt extender with PROCESSOR_TYPE_REQUEST_UPDATE_ONLY ProcessorType.");
        this.f2895a = previewExtenderImpl;
        this.f2896b = previewExtenderImpl.getProcessor();
    }

    /* renamed from: a */
    public boolean mo3081a(C0927j2 j2Var) {
        boolean z = false;
        if (!this.f2897c.mo3334c()) {
            return false;
        }
        try {
            CaptureResult a = C0303a.m1504a(C0834l0.m3269a(j2Var));
            if ((a instanceof TotalCaptureResult) && this.f2896b.process((TotalCaptureResult) a) != null) {
                z = true;
            }
            return z;
        } finally {
            this.f2897c.mo3332a();
        }
    }

    public void close() {
        this.f2897c.mo3333b();
    }
}
