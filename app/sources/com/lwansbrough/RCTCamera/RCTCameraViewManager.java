package com.lwansbrough.RCTCamera;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.C2693e;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p120j1.C2991a;
import java.util.ArrayList;
import java.util.Map;

public class RCTCameraViewManager extends ViewGroupManager<C5111d> {
    public static final int COMMAND_START_PREVIEW = 2;
    public static final int COMMAND_STOP_PREVIEW = 1;
    private static final String REACT_CLASS = "RCTCamera";

    public C5111d createViewInstance(C3031o0 o0Var) {
        return new C5111d(o0Var);
    }

    public Map<String, Integer> getCommandsMap() {
        return C2693e.m10915e("stopPreview", 1, "startPreview", 2);
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void receiveCommand(C5111d dVar, int i, ReadableArray readableArray) {
        if (dVar == null) {
            throw new AssertionError();
        } else if (i == 1) {
            dVar.mo15606i();
        } else if (i == 2) {
            dVar.mo15605h();
        } else {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", new Object[]{Integer.valueOf(i), getClass().getSimpleName()}));
        }
    }

    @C2991a(name = "aspect")
    public void setAspect(C5111d dVar, int i) {
        dVar.setAspect(i);
    }

    @C2991a(name = "barCodeTypes")
    public void setBarCodeTypes(C5111d dVar, ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList arrayList = new ArrayList(readableArray.size());
            for (int i = 0; i < readableArray.size(); i++) {
                arrayList.add(readableArray.getString(i));
            }
            dVar.setBarCodeTypes(arrayList);
        }
    }

    @C2991a(name = "barcodeScannerEnabled")
    public void setBarcodeScannerEnabled(C5111d dVar, boolean z) {
        dVar.setBarcodeScannerEnabled(z);
    }

    @C2991a(name = "captureAudio")
    public void setCaptureAudio(C5111d dVar, boolean z) {
    }

    @C2991a(name = "captureMode")
    public void setCaptureMode(C5111d dVar, int i) {
        dVar.setCaptureMode(i);
    }

    @C2991a(name = "captureQuality")
    public void setCaptureQuality(C5111d dVar, String str) {
        dVar.setCaptureQuality(str);
    }

    @C2991a(name = "captureTarget")
    public void setCaptureTarget(C5111d dVar, int i) {
    }

    @C2991a(name = "clearWindowBackground")
    public void setClearWindowBackground(C5111d dVar, boolean z) {
        dVar.setClearWindowBackground(z);
    }

    @C2991a(name = "flashMode")
    public void setFlashMode(C5111d dVar, int i) {
        dVar.setFlashMode(i);
    }

    @C2991a(name = "orientation")
    public void setOrientation(C5111d dVar, int i) {
        dVar.setOrientation(i);
    }

    @C2991a(name = "torchMode")
    public void setTorchMode(C5111d dVar, int i) {
        dVar.setTorchMode(i);
    }

    @C2991a(name = "type")
    public void setType(C5111d dVar, int i) {
        dVar.setCameraType(i);
    }

    @C2991a(name = "zoom")
    public void setZoom(C5111d dVar, int i) {
        dVar.setZoom(i);
    }
}
