package com.mrousavy.camera;

import android.annotation.SuppressLint;
import androidx.camera.core.C0930k1;
import androidx.core.content.C1135a;
import androidx.core.util.C1170a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.mrousavy.camera.p168n0.C5174c;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p027c.p043d.p044a.C1502a1;
import p027c.p043d.p044a.C1516b1;
import p027c.p043d.p044a.C1532f1;
import p027c.p043d.p044a.C1549i1;
import p027c.p043d.p044a.C1710s0;
import p027c.p043d.p044a.C1725x0;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.n */
public final class C5170n {

    /* renamed from: com.mrousavy.camera.n$a */
    public static final class C5171a implements C1170a<C1549i1> {

        /* renamed from: a */
        final /* synthetic */ Callback f14654a;

        /* renamed from: b */
        final /* synthetic */ CameraView f14655b;

        C5171a(Callback callback, CameraView cameraView) {
            this.f14654a = callback;
            this.f14655b = cameraView;
        }

        /* renamed from: b */
        public void mo2687a(C1549i1 i1Var) {
            C5152g gVar;
            if (i1Var instanceof C1549i1.C1550a) {
                C1549i1.C1550a aVar = (C1549i1.C1550a) i1Var;
                if (aVar.mo5696l()) {
                    switch (aVar.mo5694j()) {
                        case 2:
                            gVar = new C5199r(aVar.mo5693i());
                            break;
                        case 3:
                            gVar = new C5203v(aVar.mo5693i());
                            break;
                        case 4:
                            gVar = new C5202u(aVar.mo5693i());
                            break;
                        case 5:
                            gVar = new C5207z(aVar.mo5693i());
                            break;
                        case 6:
                            gVar = new C5159j0(aVar.mo5693i());
                            break;
                        case 7:
                            gVar = new C5155h0(aVar.mo5693i());
                            break;
                        case 8:
                            gVar = new C5143e0(aVar.mo5693i());
                            break;
                        default:
                            gVar = new C5157i0(aVar.mo5693i());
                            break;
                    }
                    C5152g gVar2 = gVar;
                    ReadableMap c = C5174c.m19448c(gVar2.mo15772a() + '/' + gVar2.mo15773b(), gVar2.getMessage(), gVar2, (WritableMap) null, 8, (Object) null);
                    this.f14654a.invoke(null, c);
                } else {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("path", aVar.mo5695k().mo5719a().toString());
                    createMap.putDouble("duration", (((double) aVar.mo5692d().mo5632c()) / 1000000.0d) / 1000.0d);
                    createMap.putDouble("size", ((double) aVar.mo5692d().mo5631b()) / 1000.0d);
                    this.f14654a.invoke(createMap, null);
                }
                C0930k1 camera$react_native_vision_camera_release = this.f14655b.getCamera$react_native_vision_camera_release();
                C10457l.m35317b(camera$react_native_vision_camera_release);
                camera$react_native_vision_camera_release.mo2384c().mo2330f(C10457l.m35316a(this.f14655b.getTorch(), "on"));
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public static final void m19437a(CameraView cameraView) {
        C10457l.m35320e(cameraView, "<this>");
        if (cameraView.getVideoCapture$react_native_vision_camera_release() == null) {
            throw new C5156i();
        } else if (cameraView.getActiveVideoRecording$react_native_vision_camera_release() != null) {
            C1516b1 activeVideoRecording$react_native_vision_camera_release = cameraView.getActiveVideoRecording$react_native_vision_camera_release();
            C10457l.m35317b(activeVideoRecording$react_native_vision_camera_release);
            activeVideoRecording$react_native_vision_camera_release.mo5629r();
        } else {
            throw new C5141d0();
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: b */
    public static final void m19438b(CameraView cameraView) {
        C10457l.m35320e(cameraView, "<this>");
        if (cameraView.getVideoCapture$react_native_vision_camera_release() == null) {
            throw new C5156i();
        } else if (cameraView.getActiveVideoRecording$react_native_vision_camera_release() != null) {
            C1516b1 activeVideoRecording$react_native_vision_camera_release = cameraView.getActiveVideoRecording$react_native_vision_camera_release();
            C10457l.m35317b(activeVideoRecording$react_native_vision_camera_release);
            activeVideoRecording$react_native_vision_camera_release.mo5623A();
        } else {
            throw new C5141d0();
        }
    }

    /* renamed from: c */
    public static final void m19439c(CameraView cameraView, ReadableMap readableMap, Callback callback) {
        C10457l.m35320e(cameraView, "<this>");
        C10457l.m35320e(readableMap, "options");
        C10457l.m35320e(callback, "onRecordCallback");
        if (cameraView.getVideoCapture$react_native_vision_camera_release() != null) {
            Boolean audio = cameraView.getAudio();
            Boolean bool = Boolean.TRUE;
            if (!C10457l.m35316a(audio, bool) || C1135a.m4415a(cameraView.getContext(), "android.permission.RECORD_AUDIO") == 0) {
                if (readableMap.hasKey("flash")) {
                    boolean a = C10457l.m35316a(readableMap.getString("flash"), "on");
                    C0930k1 camera$react_native_vision_camera_release = cameraView.getCamera$react_native_vision_camera_release();
                    C10457l.m35317b(camera$react_native_vision_camera_release);
                    camera$react_native_vision_camera_release.mo2384c().mo2330f(a);
                }
                C1710s0 a2 = new C1710s0.C1711a(File.createTempFile(C10457l.m35326k("VisionCamera-", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date())), ".mp4")).mo5944a();
                C10457l.m35319d(a2, "Builder(file).build()");
                C1532f1<C1502a1> videoCapture$react_native_vision_camera_release = cameraView.getVideoCapture$react_native_vision_camera_release();
                C10457l.m35317b(videoCapture$react_native_vision_camera_release);
                C1502a1 S = videoCapture$react_native_vision_camera_release.mo5656S();
                C10457l.m35319d(S, "videoCapture!!.output");
                C1725x0 c0 = S.mo5577c0(cameraView.getContext(), a2);
                C10457l.m35319d(c0, "recorder.prepareRecording(context, fileOptions)");
                if (C10457l.m35316a(cameraView.getAudio(), bool)) {
                    c0 = c0.mo5961h();
                    C10457l.m35319d(c0, "recording.withAudioEnabled()");
                }
                cameraView.setActiveVideoRecording$react_native_vision_camera_release(c0.mo5960g(C1135a.m4422h(cameraView.getContext()), new C5171a(callback, cameraView)));
                return;
            }
            throw new C5137b0();
        } else if (C10457l.m35316a(cameraView.getVideo(), Boolean.TRUE)) {
            throw new C5156i();
        } else {
            throw new C5161k0();
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: d */
    public static final void m19440d(CameraView cameraView) {
        C10457l.m35320e(cameraView, "<this>");
        if (cameraView.getVideoCapture$react_native_vision_camera_release() == null) {
            throw new C5156i();
        } else if (cameraView.getActiveVideoRecording$react_native_vision_camera_release() != null) {
            C1516b1 activeVideoRecording$react_native_vision_camera_release = cameraView.getActiveVideoRecording$react_native_vision_camera_release();
            C10457l.m35317b(activeVideoRecording$react_native_vision_camera_release);
            activeVideoRecording$react_native_vision_camera_release.mo5624E();
            C0930k1 camera$react_native_vision_camera_release = cameraView.getCamera$react_native_vision_camera_release();
            C10457l.m35317b(camera$react_native_vision_camera_release);
            camera$react_native_vision_camera_release.mo2384c().mo2330f(C10457l.m35316a(cameraView.getTorch(), "on"));
        } else {
            throw new C5141d0();
        }
    }
}
