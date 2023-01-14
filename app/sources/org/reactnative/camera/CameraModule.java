package org.reactnative.camera;

import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C3022n;
import com.facebook.react.uimanager.C3039r0;
import com.facebook.react.uimanager.UIManagerModule;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import org.reactnative.camera.p515h.C10991d;
import org.reactnative.facedetector.C10997b;
import p174e.p319f.p320a.p321a.C6412a;
import p174e.p319f.p320a.p321a.C6455j;
import p174e.p319f.p416e.C9655a;
import p497j.p502b.p503a.C10676a;

public class CameraModule extends ReactContextBaseJavaModule {
    static final int GOOGLE_VISION_BARCODE_MODE_ALTERNATE = 1;
    static final int GOOGLE_VISION_BARCODE_MODE_INVERTED = 2;
    static final int GOOGLE_VISION_BARCODE_MODE_NORMAL = 0;
    private static final String TAG = "CameraModule";
    public static final Map<String, Object> VALID_BARCODE_TYPES = Collections.unmodifiableMap(new C10917f());
    static final int VIDEO_1080P = 1;
    static final int VIDEO_2160P = 0;
    static final int VIDEO_480P = 3;
    static final int VIDEO_4x3 = 4;
    static final int VIDEO_720P = 2;
    private C10991d mScopedContext;

    /* renamed from: org.reactnative.camera.CameraModule$a */
    class C10912a implements C3039r0 {

        /* renamed from: a */
        final /* synthetic */ int f28558a;

        /* renamed from: b */
        final /* synthetic */ Promise f28559b;

        C10912a(int i, Promise promise) {
            this.f28558a = i;
            this.f28559b = promise;
        }

        /* renamed from: a */
        public void mo8417a(C3022n nVar) {
            try {
                C10942d dVar = (C10942d) nVar.mo9786w(this.f28558a);
                WritableArray createArray = Arguments.createArray();
                if (dVar.mo19136p()) {
                    for (C6412a aVar : dVar.getSupportedAspectRatios()) {
                        createArray.pushString(aVar.toString());
                    }
                    this.f28559b.resolve(createArray);
                    return;
                }
                this.f28559b.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$b */
    class C10913b implements C3039r0 {

        /* renamed from: a */
        final /* synthetic */ int f28561a;

        /* renamed from: b */
        final /* synthetic */ Promise f28562b;

        C10913b(int i, Promise promise) {
            this.f28561a = i;
            this.f28562b = promise;
        }

        /* renamed from: a */
        public void mo8417a(C3022n nVar) {
            try {
                WritableArray createArray = Arguments.createArray();
                for (Properties next : ((C10942d) nVar.mo9786w(this.f28561a)).getCameraIds()) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("id", next.getProperty("id"));
                    writableNativeMap.putInt("type", Integer.valueOf(next.getProperty("type")).intValue());
                    createArray.pushMap(writableNativeMap);
                }
                this.f28562b.resolve(createArray);
            } catch (Exception e) {
                e.printStackTrace();
                this.f28562b.reject("E_CAMERA_FAILED", e.getMessage());
            }
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$c */
    class C10914c implements C3039r0 {

        /* renamed from: a */
        final /* synthetic */ int f28564a;

        /* renamed from: b */
        final /* synthetic */ String f28565b;

        /* renamed from: c */
        final /* synthetic */ Promise f28566c;

        C10914c(int i, String str, Promise promise) {
            this.f28564a = i;
            this.f28565b = str;
            this.f28566c = promise;
        }

        /* renamed from: a */
        public void mo8417a(C3022n nVar) {
            try {
                C10942d dVar = (C10942d) nVar.mo9786w(this.f28564a);
                WritableArray createArray = Arguments.createArray();
                if (dVar.mo19136p()) {
                    for (C6455j jVar : dVar.mo19130o(C6412a.m24527T(this.f28565b))) {
                        createArray.pushString(jVar.toString());
                    }
                    this.f28566c.resolve(createArray);
                    return;
                }
                this.f28566c.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
            } catch (Exception unused) {
                this.f28566c.reject("E_CAMERA_BAD_VIEWTAG", "getAvailablePictureSizesAsync: Expected a Camera component");
            }
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$d */
    class C10915d implements C3039r0 {

        /* renamed from: a */
        final /* synthetic */ int f28568a;

        /* renamed from: b */
        final /* synthetic */ Promise f28569b;

        C10915d(int i, Promise promise) {
            this.f28568a = i;
            this.f28569b = promise;
        }

        /* renamed from: a */
        public void mo8417a(C3022n nVar) {
            try {
                WritableArray createArray = Arguments.createArray();
                Iterator<int[]> it = ((C10942d) nVar.mo9786w(this.f28568a)).getSupportedPreviewFpsRange().iterator();
                while (it.hasNext()) {
                    int[] next = it.next();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putInt("MINIMUM_FPS", next[0]);
                    writableNativeMap.putInt("MAXIMUM_FPS", next[1]);
                    createArray.pushMap(writableNativeMap);
                }
                this.f28569b.resolve(createArray);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$e */
    class C10916e extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ String f28571a;

        /* renamed from: b */
        final /* synthetic */ Promise f28572b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10916e(ReactContext reactContext, String str, Promise promise) {
            super(reactContext);
            this.f28571a = str;
            this.f28572b = promise;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(this.f28571a);
                try {
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(17);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(12);
                    this.f28572b.resolve(Boolean.valueOf(extractMetadata != null && ("yes".equals(extractMetadata) || "true".equals(extractMetadata) || (extractMetadata2 != null && extractMetadata2.contains("video")))));
                    try {
                        mediaMetadataRetriever.release();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                } catch (Throwable unused2) {
                }
                throw th;
            } catch (Exception e) {
                e.printStackTrace();
                this.f28572b.resolve(Boolean.TRUE);
                mediaMetadataRetriever.release();
            } catch (Throwable unused3) {
            }
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$f */
    class C10917f extends HashMap<String, Object> {
        C10917f() {
            put("aztec", C9655a.AZTEC.toString());
            put("ean13", C9655a.EAN_13.toString());
            put("ean8", C9655a.EAN_8.toString());
            put("qr", C9655a.QR_CODE.toString());
            put("pdf417", C9655a.PDF_417.toString());
            put("upc_e", C9655a.UPC_E.toString());
            put("datamatrix", C9655a.DATA_MATRIX.toString());
            put("code39", C9655a.CODE_39.toString());
            put("code93", C9655a.CODE_93.toString());
            put("interleaved2of5", C9655a.ITF.toString());
            put("codabar", C9655a.CODABAR.toString());
            put("code128", C9655a.CODE_128.toString());
            put("maxicode", C9655a.MAXICODE.toString());
            put("rss14", C9655a.RSS_14.toString());
            put("rssexpanded", C9655a.RSS_EXPANDED.toString());
            put("upc_a", C9655a.UPC_A.toString());
            put("upc_ean", C9655a.UPC_EAN_EXTENSION.toString());
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$g */
    class C10918g extends HashMap<String, Object> {

        /* renamed from: org.reactnative.camera.CameraModule$g$a */
        class C10919a extends HashMap<String, Object> {

            /* renamed from: org.reactnative.camera.CameraModule$g$a$a */
            class C10920a extends HashMap<String, Object> {
                C10920a() {
                    put("fast", Integer.valueOf(C10997b.f28822f));
                    put("accurate", Integer.valueOf(C10997b.f28821e));
                }
            }

            /* renamed from: org.reactnative.camera.CameraModule$g$a$b */
            class C10921b extends HashMap<String, Object> {
                C10921b() {
                    put("all", Integer.valueOf(C10997b.f28817a));
                    put("none", Integer.valueOf(C10997b.f28818b));
                }
            }

            /* renamed from: org.reactnative.camera.CameraModule$g$a$c */
            class C10922c extends HashMap<String, Object> {
                C10922c() {
                    put("all", Integer.valueOf(C10997b.f28819c));
                    put("none", Integer.valueOf(C10997b.f28820d));
                }
            }

            C10919a() {
                put("Mode", m37081e());
                put("Landmarks", m37080d());
                put("Classifications", m37079c());
            }

            /* renamed from: c */
            private Map<String, Object> m37079c() {
                return Collections.unmodifiableMap(new C10921b());
            }

            /* renamed from: d */
            private Map<String, Object> m37080d() {
                return Collections.unmodifiableMap(new C10922c());
            }

            /* renamed from: e */
            private Map<String, Object> m37081e() {
                return Collections.unmodifiableMap(new C10920a());
            }
        }

        /* renamed from: org.reactnative.camera.CameraModule$g$b */
        class C10923b extends HashMap<String, Object> {
            C10923b() {
                put("BarcodeType", C10676a.f28154b);
                put("BarcodeMode", C10918g.this.m37075g());
            }
        }

        /* renamed from: org.reactnative.camera.CameraModule$g$c */
        class C10924c extends HashMap<String, Object> {
            C10924c() {
                put("auto", 0);
                put("portrait", 1);
                put("portraitUpsideDown", 2);
                put("landscapeLeft", 3);
                put("landscapeRight", 4);
            }
        }

        /* renamed from: org.reactnative.camera.CameraModule$g$d */
        class C10925d extends HashMap<String, Object> {
            C10925d() {
                put("front", 1);
                put("back", 0);
            }
        }

        /* renamed from: org.reactnative.camera.CameraModule$g$e */
        class C10926e extends HashMap<String, Object> {
            C10926e() {
                put("off", 0);
                put("on", 1);
                put("auto", 3);
                put("torch", 2);
            }
        }

        /* renamed from: org.reactnative.camera.CameraModule$g$f */
        class C10927f extends HashMap<String, Object> {
            C10927f() {
                put("on", Boolean.TRUE);
                put("off", Boolean.FALSE);
            }
        }

        /* renamed from: org.reactnative.camera.CameraModule$g$g */
        class C10928g extends HashMap<String, Object> {
            C10928g() {
                put("auto", 0);
                put("cloudy", 1);
                put("sunny", 2);
                put("shadow", 3);
                put("fluorescent", 4);
                put("incandescent", 5);
            }
        }

        /* renamed from: org.reactnative.camera.CameraModule$g$h */
        class C10929h extends HashMap<String, Object> {
            C10929h() {
                put("2160p", 0);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_1080P, 1);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_720P, 2);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_480P, 3);
                put("4:3", 4);
            }
        }

        /* renamed from: org.reactnative.camera.CameraModule$g$i */
        class C10930i extends HashMap<String, Object> {
            C10930i() {
                put("NORMAL", 0);
                put("ALTERNATE", 1);
                put("INVERTED", 2);
            }
        }

        C10918g() {
            put("Type", m37076i());
            put("FlashMode", m37074f());
            put("AutoFocus", m37072d());
            put("WhiteBalance", m37078k());
            put("VideoQuality", m37077j());
            put("BarCodeType", m37073e());
            put("FaceDetection", Collections.unmodifiableMap(new C10919a()));
            put("GoogleVisionBarcodeDetection", Collections.unmodifiableMap(new C10923b()));
            put("Orientation", Collections.unmodifiableMap(new C10924c()));
        }

        /* renamed from: d */
        private Map<String, Object> m37072d() {
            return Collections.unmodifiableMap(new C10927f());
        }

        /* renamed from: e */
        private Map<String, Object> m37073e() {
            return CameraModule.VALID_BARCODE_TYPES;
        }

        /* renamed from: f */
        private Map<String, Object> m37074f() {
            return Collections.unmodifiableMap(new C10926e());
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public Map<String, Object> m37075g() {
            return Collections.unmodifiableMap(new C10930i());
        }

        /* renamed from: i */
        private Map<String, Object> m37076i() {
            return Collections.unmodifiableMap(new C10925d());
        }

        /* renamed from: j */
        private Map<String, Object> m37077j() {
            return Collections.unmodifiableMap(new C10929h());
        }

        /* renamed from: k */
        private Map<String, Object> m37078k() {
            return Collections.unmodifiableMap(new C10928g());
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$h */
    class C10931h implements C3039r0 {

        /* renamed from: a */
        final /* synthetic */ int f28587a;

        C10931h(int i) {
            this.f28587a = i;
        }

        /* renamed from: a */
        public void mo8417a(C3022n nVar) {
            try {
                C10942d dVar = (C10942d) nVar.mo9786w(this.f28587a);
                if (dVar.mo19136p()) {
                    dVar.mo19137q();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$i */
    class C10932i implements C3039r0 {

        /* renamed from: a */
        final /* synthetic */ int f28589a;

        C10932i(int i) {
            this.f28589a = i;
        }

        /* renamed from: a */
        public void mo8417a(C3022n nVar) {
            try {
                C10942d dVar = (C10942d) nVar.mo9786w(this.f28589a);
                if (dVar.mo19136p()) {
                    dVar.mo19156t();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$j */
    class C10933j implements C3039r0 {

        /* renamed from: a */
        final /* synthetic */ int f28591a;

        /* renamed from: b */
        final /* synthetic */ ReadableMap f28592b;

        /* renamed from: c */
        final /* synthetic */ Promise f28593c;

        /* renamed from: d */
        final /* synthetic */ File f28594d;

        C10933j(int i, ReadableMap readableMap, Promise promise, File file) {
            this.f28591a = i;
            this.f28592b = readableMap;
            this.f28593c = promise;
            this.f28594d = file;
        }

        /* renamed from: a */
        public void mo8417a(C3022n nVar) {
            C10942d dVar = (C10942d) nVar.mo9786w(this.f28591a);
            try {
                if (dVar.mo19136p()) {
                    dVar.mo28954t0(this.f28592b, this.f28593c, this.f28594d);
                } else {
                    this.f28593c.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
                }
            } catch (Exception e) {
                this.f28593c.reject("E_TAKE_PICTURE_FAILED", e.getMessage());
            }
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$k */
    class C10934k implements C3039r0 {

        /* renamed from: a */
        final /* synthetic */ int f28596a;

        /* renamed from: b */
        final /* synthetic */ ReadableMap f28597b;

        /* renamed from: c */
        final /* synthetic */ Promise f28598c;

        /* renamed from: d */
        final /* synthetic */ File f28599d;

        C10934k(int i, ReadableMap readableMap, Promise promise, File file) {
            this.f28596a = i;
            this.f28597b = readableMap;
            this.f28598c = promise;
            this.f28599d = file;
        }

        /* renamed from: a */
        public void mo8417a(C3022n nVar) {
            try {
                C10942d dVar = (C10942d) nVar.mo9786w(this.f28596a);
                if (dVar.mo19136p()) {
                    dVar.mo28934n0(this.f28597b, this.f28598c, this.f28599d);
                } else {
                    this.f28598c.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
                }
            } catch (Exception e) {
                this.f28598c.reject("E_CAPTURE_FAILED", e.getMessage());
            }
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$l */
    class C10935l implements C3039r0 {

        /* renamed from: a */
        final /* synthetic */ int f28601a;

        C10935l(int i) {
            this.f28601a = i;
        }

        /* renamed from: a */
        public void mo8417a(C3022n nVar) {
            try {
                C10942d dVar = (C10942d) nVar.mo9786w(this.f28601a);
                if (dVar.mo19136p()) {
                    dVar.mo19161y();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$m */
    class C10936m implements C3039r0 {

        /* renamed from: a */
        final /* synthetic */ int f28603a;

        C10936m(int i) {
            this.f28603a = i;
        }

        /* renamed from: a */
        public void mo8417a(C3022n nVar) {
            try {
                C10942d dVar = (C10942d) nVar.mo9786w(this.f28603a);
                if (dVar.mo19136p()) {
                    dVar.mo19138r();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$n */
    class C10937n implements C3039r0 {

        /* renamed from: a */
        final /* synthetic */ int f28605a;

        C10937n(int i) {
            this.f28605a = i;
        }

        /* renamed from: a */
        public void mo8417a(C3022n nVar) {
            try {
                C10942d dVar = (C10942d) nVar.mo9786w(this.f28605a);
                if (dVar.mo19136p()) {
                    dVar.mo19157u();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public CameraModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mScopedContext = new C10991d(reactApplicationContext);
    }

    @ReactMethod
    public void checkIfRecordAudioPermissionsAreDefined(Promise promise) {
        try {
            String[] strArr = getCurrentActivity().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String equals : strArr) {
                    if (equals.equals("android.permission.RECORD_AUDIO")) {
                        promise.resolve(Boolean.TRUE);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        promise.resolve(Boolean.FALSE);
    }

    @ReactMethod
    public void checkIfVideoIsValid(String str, Promise promise) {
        new C10916e(getReactApplicationContext(), str, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getAvailablePictureSizes(String str, int i, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new C10914c(i, str, promise));
    }

    @ReactMethod
    public void getCameraIds(int i, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new C10913b(i, promise));
    }

    public Map<String, Object> getConstants() {
        return Collections.unmodifiableMap(new C10918g());
    }

    public String getName() {
        return "RNCameraModule";
    }

    public C10991d getScopedContext() {
        return this.mScopedContext;
    }

    @ReactMethod
    public void getSupportedPreviewFpsRange(int i, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new C10915d(i, promise));
    }

    @ReactMethod
    public void getSupportedRatios(int i, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new C10912a(i, promise));
    }

    @ReactMethod
    public void hasTorch(Promise promise) {
        promise.resolve(Boolean.valueOf(getReactApplicationContext().getPackageManager().hasSystemFeature("android.hardware.camera.flash")));
    }

    @ReactMethod
    public void pausePreview(int i) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new C10931h(i));
    }

    @ReactMethod
    public void pauseRecording(int i) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new C10936m(i));
    }

    @ReactMethod
    public void record(ReadableMap readableMap, int i, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new C10934k(i, readableMap, promise, this.mScopedContext.mo29004b()));
    }

    @ReactMethod
    public void resumePreview(int i) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new C10932i(i));
    }

    @ReactMethod
    public void resumeRecording(int i) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new C10937n(i));
    }

    @ReactMethod
    public void stopRecording(int i) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new C10935l(i));
    }

    @ReactMethod
    public void takePicture(ReadableMap readableMap, int i, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new C10933j(i, readableMap, promise, this.mScopedContext.mo29004b()));
    }
}
