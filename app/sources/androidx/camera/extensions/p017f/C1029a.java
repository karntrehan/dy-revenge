package androidx.camera.extensions.p017f;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.p002d.C0303a;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.C0795d1;
import androidx.camera.core.impl.C0830k0;
import androidx.camera.core.impl.C0834l0;
import androidx.camera.core.impl.C0885t1;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.camera.extensions.f.a */
public final class C1029a implements C0795d1 {

    /* renamed from: a */
    private final CaptureProcessorImpl f2890a;

    public C1029a(CaptureProcessorImpl captureProcessorImpl) {
        this.f2890a = captureProcessorImpl;
    }

    /* renamed from: a */
    public void mo2708a(Surface surface, int i) {
        this.f2890a.onOutputSurface(surface, i);
        this.f2890a.onImageFormatUpdate(i);
    }

    /* renamed from: b */
    public void mo2709b(Size size) {
        this.f2890a.onResolutionUpdate(size);
    }

    /* renamed from: c */
    public void mo2710c(C0885t1 t1Var) {
        C0830k0 a;
        CaptureResult a2;
        List<Integer> b = t1Var.mo3083b();
        HashMap hashMap = new HashMap();
        for (Integer next : b) {
            try {
                ImageProxy imageProxy = t1Var.mo3082a(next.intValue()).get(5, TimeUnit.SECONDS);
                if (imageProxy.mo2538b0() != null && (a = C0834l0.m3269a(imageProxy.mo2537U())) != null && (a2 = C0303a.m1504a(a)) != null) {
                    hashMap.put(next, new Pair(imageProxy.mo2538b0(), (TotalCaptureResult) a2));
                } else {
                    return;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                return;
            }
        }
        this.f2890a.process(hashMap);
    }
}
