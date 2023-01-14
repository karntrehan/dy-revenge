package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.p003e.p004j3.C0490x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.camera2.e.g2 */
class C0362g2 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> f1441a = new HashMap();

    /* renamed from: b */
    C0363a f1442b = null;

    /* renamed from: androidx.camera.camera2.e.g2$a */
    interface C0363a {
        /* renamed from: a */
        void mo2021a(CameraCaptureSession cameraCaptureSession, int i, boolean z);
    }

    C0362g2() {
    }

    /* renamed from: b */
    private List<CameraCaptureSession.CaptureCallback> m1738b(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = this.f1441a.get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2012a(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        List list2 = this.f1441a.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list.size() + list2.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            this.f1441a.put(captureRequest, arrayList);
            return;
        }
        this.f1441a.put(captureRequest, list);
    }

    /* renamed from: c */
    public void mo2013c(C0363a aVar) {
        this.f1442b = aVar;
    }

    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        for (CameraCaptureSession.CaptureCallback a : m1738b(captureRequest)) {
            C0490x.m2032a(a, cameraCaptureSession, captureRequest, surface, j);
        }
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        for (CameraCaptureSession.CaptureCallback onCaptureCompleted : m1738b(captureRequest)) {
            onCaptureCompleted.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        for (CameraCaptureSession.CaptureCallback onCaptureFailed : m1738b(captureRequest)) {
            onCaptureFailed.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        for (CameraCaptureSession.CaptureCallback onCaptureProgressed : m1738b(captureRequest)) {
            onCaptureProgressed.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        for (List<CameraCaptureSession.CaptureCallback> it : this.f1441a.values()) {
            for (CameraCaptureSession.CaptureCallback onCaptureSequenceAborted : it) {
                onCaptureSequenceAborted.onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }
        C0363a aVar = this.f1442b;
        if (aVar != null) {
            aVar.mo2021a(cameraCaptureSession, i, true);
        }
    }

    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        for (List<CameraCaptureSession.CaptureCallback> it : this.f1441a.values()) {
            for (CameraCaptureSession.CaptureCallback onCaptureSequenceCompleted : it) {
                onCaptureSequenceCompleted.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }
        C0363a aVar = this.f1442b;
        if (aVar != null) {
            aVar.mo2021a(cameraCaptureSession, i, false);
        }
    }

    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        for (CameraCaptureSession.CaptureCallback onCaptureStarted : m1738b(captureRequest)) {
            onCaptureStarted.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    }
}
