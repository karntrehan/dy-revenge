package androidx.camera.extensions.p017f;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.p002d.C0303a;
import androidx.camera.core.C0949o2;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.C0795d1;
import androidx.camera.core.impl.C0834l0;
import androidx.camera.core.impl.C0885t1;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.core.util.C1177h;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.extensions.f.c */
public final class C1031c implements C0795d1, C1039i {

    /* renamed from: a */
    private final PreviewImageProcessorImpl f2893a;

    /* renamed from: b */
    private C1038h f2894b = new C1038h();

    public C1031c(PreviewImageProcessorImpl previewImageProcessorImpl) {
        this.f2893a = previewImageProcessorImpl;
    }

    /* renamed from: a */
    public void mo2708a(Surface surface, int i) {
        if (this.f2894b.mo3334c()) {
            try {
                this.f2893a.onOutputSurface(surface, i);
                this.f2893a.onImageFormatUpdate(35);
            } finally {
                this.f2894b.mo3332a();
            }
        }
    }

    /* renamed from: b */
    public void mo2709b(Size size) {
        if (this.f2894b.mo3334c()) {
            try {
                this.f2893a.onResolutionUpdate(size);
            } finally {
                this.f2894b.mo3332a();
            }
        }
    }

    /* renamed from: c */
    public void mo2710c(C0885t1 t1Var) {
        List<Integer> b = t1Var.mo3083b();
        boolean z = true;
        if (b.size() != 1) {
            z = false;
        }
        C1177h.m4580b(z, "Processing preview bundle must be 1, but found " + b.size());
        C9172b<ImageProxy> a = t1Var.mo3082a(b.get(0).intValue());
        C1177h.m4579a(a.isDone());
        try {
            ImageProxy imageProxy = a.get();
            Image b0 = imageProxy.mo2538b0();
            CaptureResult a2 = C0303a.m1504a(C0834l0.m3269a(imageProxy.mo2537U()));
            TotalCaptureResult totalCaptureResult = null;
            if (a2 instanceof TotalCaptureResult) {
                totalCaptureResult = (TotalCaptureResult) a2;
            }
            if (b0 != null && this.f2894b.mo3334c()) {
                try {
                    this.f2893a.process(b0, totalCaptureResult);
                } finally {
                    this.f2894b.mo3332a();
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            C0949o2.m3690c("AdaptingPreviewProcesso", "Unable to retrieve ImageProxy from bundle");
        }
    }

    public void close() {
        this.f2894b.mo3333b();
    }
}
