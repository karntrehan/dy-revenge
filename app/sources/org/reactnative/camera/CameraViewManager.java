package org.reactnative.camera;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C2693e;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p120j1.C2991a;
import java.util.ArrayList;
import java.util.Map;
import p174e.p319f.p320a.p321a.C6412a;
import p174e.p319f.p320a.p321a.C6455j;

public class CameraViewManager extends ViewGroupManager<C10942d> {
    private static final String REACT_CLASS = "RNCamera";

    /* renamed from: org.reactnative.camera.CameraViewManager$a */
    public enum C10938a {
        EVENT_CAMERA_READY("onCameraReady"),
        EVENT_ON_MOUNT_ERROR("onMountError"),
        EVENT_ON_BAR_CODE_READ("onBarCodeRead"),
        EVENT_ON_FACES_DETECTED("onFacesDetected"),
        EVENT_ON_BARCODES_DETECTED("onGoogleVisionBarcodesDetected"),
        EVENT_ON_FACE_DETECTION_ERROR("onFaceDetectionError"),
        EVENT_ON_BARCODE_DETECTION_ERROR("onGoogleVisionBarcodeDetectionError"),
        EVENT_ON_TEXT_RECOGNIZED("onTextRecognized"),
        EVENT_ON_PICTURE_TAKEN("onPictureTaken"),
        EVENT_ON_PICTURE_SAVED("onPictureSaved"),
        EVENT_ON_RECORDING_START("onRecordingStart"),
        EVENT_ON_RECORDING_END("onRecordingEnd"),
        EVENT_ON_TOUCH("onTouch");
        

        /* renamed from: B */
        private final String f28621B;

        private C10938a(String str) {
            this.f28621B = str;
        }

        public String toString() {
            return this.f28621B;
        }
    }

    /* access modifiers changed from: protected */
    public C10942d createViewInstance(C3031o0 o0Var) {
        return new C10942d(o0Var);
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        C2693e.C2695b a = C2693e.m10911a();
        for (C10938a aVar : C10938a.values()) {
            a.mo8815b(aVar.toString(), C2693e.m10914d("registrationName", aVar.toString()));
        }
        return a.mo8814a();
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void onDropViewInstance(C10942d dVar) {
        dVar.onHostDestroy();
        super.onDropViewInstance(dVar);
    }

    @C2991a(name = "autoFocus")
    public void setAutoFocus(C10942d dVar, boolean z) {
        dVar.setAutoFocus(z);
    }

    @C2991a(name = "autoFocusPointOfInterest")
    public void setAutoFocusPointOfInterest(C10942d dVar, ReadableMap readableMap) {
        if (readableMap != null) {
            dVar.mo19158v((float) readableMap.getDouble("x"), (float) readableMap.getDouble("y"));
        }
    }

    @C2991a(name = "barCodeScannerEnabled")
    public void setBarCodeScanning(C10942d dVar, boolean z) {
        dVar.setShouldScanBarCodes(z);
    }

    @C2991a(name = "barCodeTypes")
    public void setBarCodeTypes(C10942d dVar, ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList arrayList = new ArrayList(readableArray.size());
            for (int i = 0; i < readableArray.size(); i++) {
                arrayList.add(readableArray.getString(i));
            }
            dVar.setBarCodeTypes(arrayList);
        }
    }

    @C2991a(name = "cameraId")
    public void setCameraId(C10942d dVar, String str) {
        dVar.setCameraId(str);
    }

    @C2991a(name = "cameraViewDimensions")
    public void setCameraViewDimensions(C10942d dVar, ReadableMap readableMap) {
        if (readableMap != null) {
            dVar.mo28937p0((int) readableMap.getDouble("width"), (int) readableMap.getDouble("height"));
        }
    }

    @C2991a(name = "detectedImageInEvent")
    public void setDetectedImageInEvent(C10942d dVar, boolean z) {
        dVar.setDetectedImageInEvent(z);
    }

    @C2991a(name = "exposure")
    public void setExposureCompensation(C10942d dVar, float f) {
        dVar.setExposureCompensation(f);
    }

    @C2991a(name = "faceDetectorEnabled")
    public void setFaceDetecting(C10942d dVar, boolean z) {
        dVar.setShouldDetectFaces(z);
    }

    @C2991a(name = "faceDetectionClassifications")
    public void setFaceDetectionClassifications(C10942d dVar, int i) {
        dVar.setFaceDetectionClassifications(i);
    }

    @C2991a(name = "faceDetectionLandmarks")
    public void setFaceDetectionLandmarks(C10942d dVar, int i) {
        dVar.setFaceDetectionLandmarks(i);
    }

    @C2991a(name = "faceDetectionMode")
    public void setFaceDetectionMode(C10942d dVar, int i) {
        dVar.setFaceDetectionMode(i);
    }

    @C2991a(name = "flashMode")
    public void setFlashMode(C10942d dVar, int i) {
        dVar.setFlash(i);
    }

    @C2991a(name = "focusDepth")
    public void setFocusDepth(C10942d dVar, float f) {
        dVar.setFocusDepth(f);
    }

    @C2991a(name = "googleVisionBarcodeDetectorEnabled")
    public void setGoogleVisionBarcodeDetecting(C10942d dVar, boolean z) {
        dVar.setShouldGoogleDetectBarcodes(z);
    }

    @C2991a(name = "googleVisionBarcodeMode")
    public void setGoogleVisionBarcodeMode(C10942d dVar, int i) {
        dVar.setGoogleVisionBarcodeMode(i);
    }

    @C2991a(name = "googleVisionBarcodeType")
    public void setGoogleVisionBarcodeType(C10942d dVar, int i) {
        dVar.setGoogleVisionBarcodeType(i);
    }

    @C2991a(name = "pictureSize")
    public void setPictureSize(C10942d dVar, String str) {
        dVar.setPictureSize(str.equals("None") ? null : C6455j.m24833P(str));
    }

    @C2991a(name = "playSoundOnCapture")
    public void setPlaySoundOnCapture(C10942d dVar, boolean z) {
        dVar.setPlaySoundOnCapture(z);
    }

    @C2991a(name = "playSoundOnRecord")
    public void setPlaySoundOnRecord(C10942d dVar, boolean z) {
        dVar.setPlaySoundOnRecord(z);
    }

    @C2991a(name = "ratio")
    public void setRatio(C10942d dVar, String str) {
        dVar.setAspectRatio(C6412a.m24527T(str));
    }

    @C2991a(name = "rectOfInterest")
    public void setRectOfInterest(C10942d dVar, ReadableMap readableMap) {
        if (readableMap != null) {
            dVar.mo28938q0((float) readableMap.getDouble("x"), (float) readableMap.getDouble("y"), (float) readableMap.getDouble("width"), (float) readableMap.getDouble("height"));
        }
    }

    @C2991a(name = "textRecognizerEnabled")
    public void setTextRecognizing(C10942d dVar, boolean z) {
        dVar.setShouldRecognizeText(z);
    }

    @C2991a(name = "touchDetectorEnabled")
    public void setTouchDetectorEnabled(C10942d dVar, boolean z) {
        dVar.setShouldDetectTouches(z);
    }

    @C2991a(name = "trackingEnabled")
    public void setTracking(C10942d dVar, boolean z) {
        dVar.setTracking(z);
    }

    @C2991a(name = "type")
    public void setType(C10942d dVar, int i) {
        dVar.setFacing(i);
    }

    @C2991a(name = "useCamera2Api")
    public void setUseCamera2Api(C10942d dVar, boolean z) {
        dVar.setUsingCamera2Api(z);
    }

    @C2991a(name = "useNativeZoom")
    public void setUseNativeZoom(C10942d dVar, boolean z) {
        dVar.setUseNativeZoom(z);
    }

    @C2991a(name = "whiteBalance")
    public void setWhiteBalance(C10942d dVar, int i) {
        dVar.setWhiteBalance(i);
    }

    @C2991a(name = "zoom")
    public void setZoom(C10942d dVar, float f) {
        dVar.setZoom(f);
    }
}
