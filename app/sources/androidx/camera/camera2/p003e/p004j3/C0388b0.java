package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.e.j3.b0 */
public final class C0388b0 {

    /* renamed from: a */
    private final C0389a f1493a;

    /* renamed from: androidx.camera.camera2.e.j3.b0$a */
    interface C0389a {
        /* renamed from: a */
        CameraCaptureSession mo2080a();

        /* renamed from: b */
        int mo2081b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        /* renamed from: c */
        int mo2082c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    /* renamed from: androidx.camera.camera2.e.j3.b0$b */
    static final class C0390b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        final CameraCaptureSession.CaptureCallback f1494a;

        /* renamed from: b */
        private final Executor f1495b;

        C0390b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f1495b = executor;
            this.f1494a = captureCallback;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void mo2083b(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            C0490x.m2032a(this.f1494a, cameraCaptureSession, captureRequest, surface, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void mo2084d(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f1494a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void mo2085f(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f1494a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void mo2086h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f1494a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void mo2087j(CameraCaptureSession cameraCaptureSession, int i) {
            this.f1494a.onCaptureSequenceAborted(cameraCaptureSession, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void mo2088l(CameraCaptureSession cameraCaptureSession, int i, long j) {
            this.f1494a.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void mo2089n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.f1494a.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }

        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            this.f1495b.execute(new C0385a(this, cameraCaptureSession, captureRequest, surface, j));
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f1495b.execute(new C0399f(this, cameraCaptureSession, captureRequest, totalCaptureResult));
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f1495b.execute(new C0401g(this, cameraCaptureSession, captureRequest, captureFailure));
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f1495b.execute(new C0387b(this, cameraCaptureSession, captureRequest, captureResult));
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            this.f1495b.execute(new C0392c(this, cameraCaptureSession, i));
        }

        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            this.f1495b.execute(new C0397e(this, cameraCaptureSession, i, j));
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.f1495b.execute(new C0394d(this, cameraCaptureSession, captureRequest, j, j2));
        }
    }

    /* renamed from: androidx.camera.camera2.e.j3.b0$c */
    static final class C0391c extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        final CameraCaptureSession.StateCallback f1496a;

        /* renamed from: b */
        private final Executor f1497b;

        C0391c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f1497b = executor;
            this.f1496a = stateCallback;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void mo2097b(CameraCaptureSession cameraCaptureSession) {
            this.f1496a.onActive(cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void mo2098d(CameraCaptureSession cameraCaptureSession) {
            C0491y.m2034b(this.f1496a, cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void mo2099f(CameraCaptureSession cameraCaptureSession) {
            this.f1496a.onClosed(cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void mo2100h(CameraCaptureSession cameraCaptureSession) {
            this.f1496a.onConfigureFailed(cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void mo2101j(CameraCaptureSession cameraCaptureSession) {
            this.f1496a.onConfigured(cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void mo2102l(CameraCaptureSession cameraCaptureSession) {
            this.f1496a.onReady(cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void mo2103n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C0489w.m2031a(this.f1496a, cameraCaptureSession, surface);
        }

        public void onActive(CameraCaptureSession cameraCaptureSession) {
            this.f1497b.execute(new C0408i(this, cameraCaptureSession));
        }

        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            this.f1497b.execute(new C0412k(this, cameraCaptureSession));
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            this.f1497b.execute(new C0410j(this, cameraCaptureSession));
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            this.f1497b.execute(new C0417m(this, cameraCaptureSession));
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            this.f1497b.execute(new C0414l(this, cameraCaptureSession));
        }

        public void onReady(CameraCaptureSession cameraCaptureSession) {
            this.f1497b.execute(new C0421n(this, cameraCaptureSession));
        }

        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            this.f1497b.execute(new C0404h(this, cameraCaptureSession, surface));
        }
    }

    private C0388b0(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1493a = new C0393c0(cameraCaptureSession);
        } else {
            this.f1493a = C0395d0.m1831d(cameraCaptureSession, handler);
        }
    }

    /* renamed from: d */
    public static C0388b0 m1794d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C0388b0(cameraCaptureSession, handler);
    }

    /* renamed from: a */
    public int mo2077a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1493a.mo2082c(list, executor, captureCallback);
    }

    /* renamed from: b */
    public int mo2078b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1493a.mo2081b(captureRequest, executor, captureCallback);
    }

    /* renamed from: c */
    public CameraCaptureSession mo2079c() {
        return this.f1493a.mo2080a();
    }
}
