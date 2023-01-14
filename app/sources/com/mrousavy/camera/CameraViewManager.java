package com.mrousavy.camera;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C2693e;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p120j1.C2991a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

public final class CameraViewManager extends ViewGroupManager<CameraView> {
    public static final C5127a Companion = new C5127a((C10452g) null);
    public static final String TAG = "CameraView";
    /* access modifiers changed from: private */
    public static final HashMap<CameraView, ArrayList<String>> cameraViewTransactions = new HashMap<>();

    /* renamed from: com.mrousavy.camera.CameraViewManager$a */
    public static final class C5127a {
        private C5127a() {
        }

        public /* synthetic */ C5127a(C10452g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m19375b(CameraView cameraView, String str) {
            if (mo15732c().get(cameraView) == null) {
                mo15732c().put(cameraView, new ArrayList());
            }
            ArrayList<String> arrayList = mo15732c().get(cameraView);
            C10457l.m35317b(arrayList);
            arrayList.add(str);
        }

        /* renamed from: c */
        public final HashMap<CameraView, ArrayList<String>> mo15732c() {
            return CameraViewManager.cameraViewTransactions;
        }
    }

    public CameraViewManager(ReactApplicationContext reactApplicationContext) {
        C10457l.m35320e(reactApplicationContext, "reactContext");
    }

    public CameraView createViewInstance(C3031o0 o0Var) {
        C10457l.m35320e(o0Var, "context");
        NativeModule nativeModule = o0Var.getNativeModule(CameraViewModule.class);
        C10457l.m35317b(nativeModule);
        C10457l.m35319d(nativeModule, "context.getNativeModule(…ViewModule::class.java)!!");
        return new CameraView(o0Var, ((CameraViewModule) nativeModule).getFrameProcessorThread());
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return C2693e.m10911a().mo8815b("cameraViewReady", C2693e.m10914d("registrationName", "onViewReady")).mo8815b("cameraInitialized", C2693e.m10914d("registrationName", "onInitialized")).mo8815b("cameraError", C2693e.m10914d("registrationName", "onError")).mo8815b("cameraPerformanceSuggestionAvailable", C2693e.m10914d("registrationName", "onFrameProcessorPerformanceSuggestionAvailable")).mo8814a();
    }

    public String getName() {
        return "CameraView";
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(CameraView cameraView) {
        C10457l.m35320e(cameraView, "view");
        super.onAfterUpdateTransaction(cameraView);
        HashMap<CameraView, ArrayList<String>> hashMap = cameraViewTransactions;
        ArrayList arrayList = hashMap.get(cameraView);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        cameraView.mo15705x(arrayList);
        hashMap.remove(cameraView);
    }

    @C2991a(name = "audio")
    public final void setAudio(CameraView cameraView, Boolean bool) {
        C10457l.m35320e(cameraView, "view");
        if (!C10457l.m35316a(cameraView.getAudio(), bool)) {
            Companion.m19375b(cameraView, "audio");
        }
        cameraView.setAudio(bool);
    }

    @C2991a(name = "cameraId")
    public final void setCameraId(CameraView cameraView, String str) {
        C10457l.m35320e(cameraView, "view");
        C10457l.m35320e(str, "cameraId");
        if (!C10457l.m35316a(cameraView.getCameraId(), str)) {
            Companion.m19375b(cameraView, "cameraId");
        }
        cameraView.setCameraId(str);
    }

    @C2991a(name = "colorSpace")
    public final void setColorSpace(CameraView cameraView, String str) {
        C10457l.m35320e(cameraView, "view");
        if (!C10457l.m35316a(cameraView.getColorSpace(), str)) {
            Companion.m19375b(cameraView, "colorSpace");
        }
        cameraView.setColorSpace(str);
    }

    @C2991a(name = "enableDepthData")
    public final void setEnableDepthData(CameraView cameraView, boolean z) {
        C10457l.m35320e(cameraView, "view");
        if (cameraView.getEnableDepthData() != z) {
            Companion.m19375b(cameraView, "enableDepthData");
        }
        cameraView.setEnableDepthData(z);
    }

    @C2991a(name = "enableFrameProcessor")
    public final void setEnableFrameProcessor(CameraView cameraView, boolean z) {
        C10457l.m35320e(cameraView, "view");
        if (cameraView.getEnableFrameProcessor() != z) {
            Companion.m19375b(cameraView, "enableFrameProcessor");
        }
        cameraView.setEnableFrameProcessor(z);
    }

    @C2991a(name = "enableHighQualityPhotos")
    public final void setEnableHighQualityPhotos(CameraView cameraView, Boolean bool) {
        C10457l.m35320e(cameraView, "view");
        if (!C10457l.m35316a(cameraView.getEnableHighQualityPhotos(), bool)) {
            Companion.m19375b(cameraView, "enableHighQualityPhotos");
        }
        cameraView.setEnableHighQualityPhotos(bool);
    }

    @C2991a(name = "enablePortraitEffectsMatteDelivery")
    public final void setEnablePortraitEffectsMatteDelivery(CameraView cameraView, boolean z) {
        C10457l.m35320e(cameraView, "view");
        if (cameraView.getEnablePortraitEffectsMatteDelivery() != z) {
            Companion.m19375b(cameraView, "enablePortraitEffectsMatteDelivery");
        }
        cameraView.setEnablePortraitEffectsMatteDelivery(z);
    }

    @C2991a(name = "enableZoomGesture")
    public final void setEnableZoomGesture(CameraView cameraView, boolean z) {
        C10457l.m35320e(cameraView, "view");
        if (cameraView.getEnableZoomGesture() != z) {
            Companion.m19375b(cameraView, "enableZoomGesture");
        }
        cameraView.setEnableZoomGesture(z);
    }

    @C2991a(name = "format")
    public final void setFormat(CameraView cameraView, ReadableMap readableMap) {
        C10457l.m35320e(cameraView, "view");
        if (!C10457l.m35316a(cameraView.getFormat(), readableMap)) {
            Companion.m19375b(cameraView, "format");
        }
        cameraView.setFormat(readableMap);
    }

    @C2991a(defaultInt = -1, name = "fps")
    public final void setFps(CameraView cameraView, int i) {
        C10457l.m35320e(cameraView, "view");
        Integer fps = cameraView.getFps();
        if (fps == null || fps.intValue() != i) {
            Companion.m19375b(cameraView, "fps");
        }
        cameraView.setFps(i > 0 ? Integer.valueOf(i) : null);
    }

    @C2991a(defaultDouble = 1.0d, name = "frameProcessorFps")
    public final void setFrameProcessorFps(CameraView cameraView, double d) {
        C10457l.m35320e(cameraView, "view");
        if (!(cameraView.getFrameProcessorFps() == d)) {
            Companion.m19375b(cameraView, "frameProcessorFps");
        }
        cameraView.setFrameProcessorFps(d);
    }

    @C2991a(name = "hdr")
    public final void setHdr(CameraView cameraView, Boolean bool) {
        C10457l.m35320e(cameraView, "view");
        if (!C10457l.m35316a(cameraView.getHdr(), bool)) {
            Companion.m19375b(cameraView, "hdr");
        }
        cameraView.setHdr(bool);
    }

    @C2991a(name = "isActive")
    public final void setIsActive(CameraView cameraView, boolean z) {
        C10457l.m35320e(cameraView, "view");
        if (cameraView.mo15680s() != z) {
            Companion.m19375b(cameraView, "isActive");
        }
        cameraView.setActive(z);
    }

    @C2991a(name = "lowLightBoost")
    public final void setLowLightBoost(CameraView cameraView, Boolean bool) {
        C10457l.m35320e(cameraView, "view");
        if (!C10457l.m35316a(cameraView.getLowLightBoost(), bool)) {
            Companion.m19375b(cameraView, "lowLightBoost");
        }
        cameraView.setLowLightBoost(bool);
    }

    @C2991a(name = "orientation")
    public final void setOrientation(CameraView cameraView, String str) {
        C10457l.m35320e(cameraView, "view");
        C10457l.m35320e(str, "orientation");
        if (!C10457l.m35316a(cameraView.getOrientation(), str)) {
            Companion.m19375b(cameraView, "orientation");
        }
        cameraView.setOrientation(str);
    }

    @C2991a(name = "photo")
    public final void setPhoto(CameraView cameraView, Boolean bool) {
        C10457l.m35320e(cameraView, "view");
        if (!C10457l.m35316a(cameraView.getPhoto(), bool)) {
            Companion.m19375b(cameraView, "photo");
        }
        cameraView.setPhoto(bool);
    }

    @C2991a(name = "torch")
    public final void setTorch(CameraView cameraView, String str) {
        C10457l.m35320e(cameraView, "view");
        C10457l.m35320e(str, "torch");
        if (!C10457l.m35316a(cameraView.getTorch(), str)) {
            Companion.m19375b(cameraView, "torch");
        }
        cameraView.setTorch(str);
    }

    @C2991a(name = "video")
    public final void setVideo(CameraView cameraView, Boolean bool) {
        C10457l.m35320e(cameraView, "view");
        if (!C10457l.m35316a(cameraView.getVideo(), bool)) {
            Companion.m19375b(cameraView, "video");
        }
        cameraView.setVideo(bool);
    }

    @C2991a(name = "zoom")
    public final void setZoom(CameraView cameraView, double d) {
        C10457l.m35320e(cameraView, "view");
        float f = (float) d;
        if (!(cameraView.getZoom() == f)) {
            Companion.m19375b(cameraView, "zoom");
        }
        cameraView.setZoom(f);
    }
}
