package com.lwansbrough.RCTCamera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.MediaActionSound;
import android.media.MediaRecorder;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RCTCameraModule extends ReactContextBaseJavaModule implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener, LifecycleEventListener {
    public static final int MEDIA_TYPE_IMAGE = 1;
    public static final int MEDIA_TYPE_VIDEO = 2;
    public static final int RCT_CAMERA_ASPECT_FILL = 0;
    public static final int RCT_CAMERA_ASPECT_FIT = 1;
    public static final int RCT_CAMERA_ASPECT_STRETCH = 2;
    public static final int RCT_CAMERA_CAPTURE_MODE_STILL = 0;
    public static final int RCT_CAMERA_CAPTURE_MODE_VIDEO = 1;
    public static final String RCT_CAMERA_CAPTURE_QUALITY_1080P = "1080p";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_480P = "480p";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_720P = "720p";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_HIGH = "high";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_LOW = "low";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_MEDIUM = "medium";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_PREVIEW = "preview";
    public static final int RCT_CAMERA_CAPTURE_TARGET_CAMERA_ROLL = 2;
    public static final int RCT_CAMERA_CAPTURE_TARGET_DISK = 1;
    public static final int RCT_CAMERA_CAPTURE_TARGET_MEMORY = 0;
    public static final int RCT_CAMERA_CAPTURE_TARGET_TEMP = 3;
    public static final int RCT_CAMERA_FLASH_MODE_AUTO = 2;
    public static final int RCT_CAMERA_FLASH_MODE_OFF = 0;
    public static final int RCT_CAMERA_FLASH_MODE_ON = 1;
    public static final int RCT_CAMERA_ORIENTATION_AUTO = Integer.MAX_VALUE;
    public static final int RCT_CAMERA_ORIENTATION_LANDSCAPE_LEFT = 1;
    public static final int RCT_CAMERA_ORIENTATION_LANDSCAPE_RIGHT = 3;
    public static final int RCT_CAMERA_ORIENTATION_PORTRAIT = 0;
    public static final int RCT_CAMERA_ORIENTATION_PORTRAIT_UPSIDE_DOWN = 2;
    public static final int RCT_CAMERA_TORCH_MODE_AUTO = 2;
    public static final int RCT_CAMERA_TORCH_MODE_OFF = 0;
    public static final int RCT_CAMERA_TORCH_MODE_ON = 1;
    public static final int RCT_CAMERA_TYPE_BACK = 2;
    public static final int RCT_CAMERA_TYPE_FRONT = 1;
    private static final String TAG = "RCTCameraModule";
    private static ReactApplicationContext _reactContext;
    private long MRStartTime;
    /* access modifiers changed from: private */
    public C5117f _sensorOrientationChecker;
    private Camera mCamera = null;
    private MediaRecorder mMediaRecorder;
    private ReadableMap mRecordingOptions;
    private Promise mRecordingPromise = null;
    /* access modifiers changed from: private */
    public Boolean mSafeToCapture = Boolean.TRUE;
    private File mVideoFile;

    /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$a */
    class C5089a extends HashMap<String, Object> {

        /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$a$a */
        class C5090a extends HashMap<String, Object> {
            C5090a() {
                put("stretch", 2);
                put("fit", 1);
                put("fill", 0);
            }
        }

        /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$a$b */
        class C5091b extends HashMap<String, Object> {
            C5091b() {
            }
        }

        /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$a$c */
        class C5092c extends HashMap<String, Object> {
            C5092c() {
                put("front", 1);
                put("back", 2);
            }
        }

        /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$a$d */
        class C5093d extends HashMap<String, Object> {
            C5093d() {
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH);
                put("photo", RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_480P, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_480P);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_720P, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_720P);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_1080P, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_1080P);
            }
        }

        /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$a$e */
        class C5094e extends HashMap<String, Object> {
            C5094e() {
                put("still", 0);
                put("video", 1);
            }
        }

        /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$a$f */
        class C5095f extends HashMap<String, Object> {
            C5095f() {
                put("memory", 0);
                put("disk", 1);
                put("cameraRoll", 2);
                put("temp", 3);
            }
        }

        /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$a$g */
        class C5096g extends HashMap<String, Object> {
            C5096g() {
                put("auto", Integer.valueOf(RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO));
                put("landscapeLeft", 1);
                put("landscapeRight", 3);
                put("portrait", 0);
                put("portraitUpsideDown", 2);
            }
        }

        /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$a$h */
        class C5097h extends HashMap<String, Object> {
            C5097h() {
                put("off", 0);
                put("on", 1);
                put("auto", 2);
            }
        }

        /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$a$i */
        class C5098i extends HashMap<String, Object> {
            C5098i() {
                put("off", 0);
                put("on", 1);
                put("auto", 2);
            }
        }

        C5089a() {
            put("Aspect", m19240c());
            put("BarCodeType", m19241d());
            put("Type", m19248l());
            put("CaptureQuality", m19243f());
            put("CaptureMode", m19242e());
            put("CaptureTarget", m19244g());
            put("Orientation", m19246j());
            put("FlashMode", m19245i());
            put("TorchMode", m19247k());
        }

        /* renamed from: c */
        private Map<String, Object> m19240c() {
            return Collections.unmodifiableMap(new C5090a());
        }

        /* renamed from: d */
        private Map<String, Object> m19241d() {
            return Collections.unmodifiableMap(new C5091b());
        }

        /* renamed from: e */
        private Map<String, Object> m19242e() {
            return Collections.unmodifiableMap(new C5094e());
        }

        /* renamed from: f */
        private Map<String, Object> m19243f() {
            return Collections.unmodifiableMap(new C5093d());
        }

        /* renamed from: g */
        private Map<String, Object> m19244g() {
            return Collections.unmodifiableMap(new C5095f());
        }

        /* renamed from: i */
        private Map<String, Object> m19245i() {
            return Collections.unmodifiableMap(new C5097h());
        }

        /* renamed from: j */
        private Map<String, Object> m19246j() {
            return Collections.unmodifiableMap(new C5096g());
        }

        /* renamed from: k */
        private Map<String, Object> m19247k() {
            return Collections.unmodifiableMap(new C5098i());
        }

        /* renamed from: l */
        private Map<String, Object> m19248l() {
            return Collections.unmodifiableMap(new C5092c());
        }
    }

    /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$b */
    class C5099b implements C5120g {

        /* renamed from: a */
        final /* synthetic */ ReadableMap f14444a;

        /* renamed from: b */
        final /* synthetic */ Promise f14445b;

        C5099b(ReadableMap readableMap, Promise promise) {
            this.f14444a = readableMap;
            this.f14445b = promise;
        }

        /* renamed from: a */
        public void mo15554a() {
            int b = RCTCameraModule.this._sensorOrientationChecker.mo15643b();
            RCTCameraModule.this._sensorOrientationChecker.mo15647f();
            RCTCameraModule.this._sensorOrientationChecker.mo15644c();
            RCTCameraModule.this.captureWithOrientation(this.f14444a, this.f14445b, b);
        }
    }

    /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$c */
    class C5100c implements Camera.PictureCallback {

        /* renamed from: a */
        final /* synthetic */ ReadableMap f14447a;

        /* renamed from: b */
        final /* synthetic */ Promise f14448b;

        /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$c$a */
        class C5101a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ byte[] f14450f;

            C5101a(byte[] bArr) {
                this.f14450f = bArr;
            }

            public void run() {
                RCTCameraModule rCTCameraModule = RCTCameraModule.this;
                C5104a aVar = new C5104a(this.f14450f);
                C5100c cVar = C5100c.this;
                rCTCameraModule.processImage(aVar, cVar.f14447a, cVar.f14448b);
            }
        }

        C5100c(ReadableMap readableMap, Promise promise) {
            this.f14447a = readableMap;
            this.f14448b = promise;
        }

        public void onPictureTaken(byte[] bArr, Camera camera) {
            camera.stopPreview();
            camera.startPreview();
            AsyncTask.execute(new C5101a(bArr));
            Boolean unused = RCTCameraModule.this.mSafeToCapture = Boolean.TRUE;
        }
    }

    /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$d */
    class C5102d implements Camera.ShutterCallback {

        /* renamed from: a */
        final /* synthetic */ Camera f14452a;

        C5102d(Camera camera) {
            this.f14452a = camera;
        }

        public void onShutter() {
            try {
                this.f14452a.setPreviewCallback((Camera.PreviewCallback) null);
                this.f14452a.setPreviewTexture((SurfaceTexture) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$e */
    class C5103e implements MediaScannerConnection.OnScanCompletedListener {

        /* renamed from: a */
        final /* synthetic */ WritableMap f14454a;

        /* renamed from: b */
        final /* synthetic */ Promise f14455b;

        C5103e(WritableMap writableMap, Promise promise) {
            this.f14454a = writableMap;
            this.f14455b = promise;
        }

        public void onScanCompleted(String str, Uri uri) {
            if (uri != null) {
                this.f14454a.putString("mediaUri", uri.toString());
            }
            this.f14455b.resolve(this.f14454a);
        }
    }

    public RCTCameraModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        _reactContext = reactApplicationContext;
        this._sensorOrientationChecker = new C5117f(reactApplicationContext);
        _reactContext.addLifecycleEventListener(this);
    }

    private void addToMediaStore(String str) {
        MediaScannerConnection.scanFile(_reactContext, new String[]{str}, (String[]) null, (MediaScannerConnection.OnScanCompletedListener) null);
    }

    /* access modifiers changed from: private */
    public void captureWithOrientation(ReadableMap readableMap, Promise promise, int i) {
        Camera a = C5107b.m19270h().mo15583a(readableMap.getInt("type"));
        if (a == null) {
            promise.reject("No camera found.");
        } else if (readableMap.getInt("mode") == 1) {
            record(readableMap, promise, i);
        } else {
            C5107b.m19270h().mo15601w(readableMap.getInt("type"), readableMap.getString("quality"));
            if (readableMap.hasKey("playSoundOnCapture") && readableMap.getBoolean("playSoundOnCapture")) {
                new MediaActionSound().play(0);
            }
            if (readableMap.hasKey("quality")) {
                C5107b.m19270h().mo15601w(readableMap.getInt("type"), readableMap.getString("quality"));
            }
            C5107b.m19270h().mo15584b(readableMap.getInt("type"), i);
            a.setPreviewCallback((Camera.PreviewCallback) null);
            C5100c cVar = new C5100c(readableMap, promise);
            C5102d dVar = new C5102d(a);
            if (this.mSafeToCapture.booleanValue()) {
                try {
                    a.takePicture(dVar, (Camera.PictureCallback) null, cVar);
                    this.mSafeToCapture = Boolean.FALSE;
                } catch (RuntimeException e) {
                    Log.e(TAG, "Couldn't capture photo.", e);
                }
            }
        }
    }

    public static byte[] convertFileToByteArray(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private File getOutputCameraRollFile(int i) {
        return getOutputFile(i, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM));
    }

    private File getOutputFile(int i, File file) {
        String str;
        if (file.exists() || file.mkdirs()) {
            String format = String.format("%s", new Object[]{new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())});
            if (i == 1) {
                str = String.format("IMG_%s.jpg", new Object[]{format});
            } else if (i == 2) {
                str = String.format("VID_%s.mp4", new Object[]{format});
            } else {
                Log.e(TAG, "Unsupported media type:" + i);
                return null;
            }
            return new File(String.format("%s%s%s", new Object[]{file.getPath(), File.separator, str}));
        }
        Log.e(TAG, "failed to create directory:" + file.getAbsolutePath());
        return null;
    }

    private File getOutputMediaFile(int i) {
        String str;
        if (i == 1) {
            str = Environment.DIRECTORY_PICTURES;
        } else if (i == 2) {
            str = Environment.DIRECTORY_MOVIES;
        } else {
            Log.e(TAG, "Unsupported media type:" + i);
            return null;
        }
        return getOutputFile(i, Environment.getExternalStoragePublicDirectory(str));
    }

    public static ReactApplicationContext getReactContextSingleton() {
        return _reactContext;
    }

    private File getTempMediaFile(int i) {
        String str;
        String str2;
        try {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            File cacheDir = _reactContext.getCacheDir();
            if (i == 1) {
                str = "IMG_" + format;
                str2 = ".jpg";
            } else if (i == 2) {
                str = "VID_" + format;
                str2 = ".mp4";
            } else {
                Log.e(TAG, "Unsupported media type:" + i);
                return null;
            }
            return File.createTempFile(str, str2, cacheDir);
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Throwable prepareMediaRecorder(com.facebook.react.bridge.ReadableMap r5, int r6) {
        /*
            r4 = this;
            com.lwansbrough.RCTCamera.b r0 = com.lwansbrough.RCTCamera.C5107b.m19270h()
            java.lang.String r1 = "type"
            int r1 = r5.getInt(r1)
            java.lang.String r2 = "quality"
            java.lang.String r2 = r5.getString(r2)
            android.media.CamcorderProfile r0 = r0.mo15602x(r1, r2)
            if (r0 != 0) goto L_0x001e
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "CamcorderProfile not found in prepareMediaRecorder."
            r5.<init>(r6)
            return r5
        L_0x001e:
            android.hardware.Camera r1 = r4.mCamera
            r1.unlock()
            android.media.MediaRecorder r1 = new android.media.MediaRecorder
            r1.<init>()
            r4.mMediaRecorder = r1
            r1.setOnInfoListener(r4)
            android.media.MediaRecorder r1 = r4.mMediaRecorder
            r1.setOnErrorListener(r4)
            android.media.MediaRecorder r1 = r4.mMediaRecorder
            android.hardware.Camera r2 = r4.mCamera
            r1.setCamera(r2)
            android.media.MediaRecorder r1 = r4.mMediaRecorder
            r2 = 5
            r1.setAudioSource(r2)
            android.media.MediaRecorder r1 = r4.mMediaRecorder
            r2 = 1
            r1.setVideoSource(r2)
            r1 = 3
            r3 = 2
            if (r6 == 0) goto L_0x005e
            if (r6 == r2) goto L_0x005a
            if (r6 == r3) goto L_0x0055
            if (r6 == r1) goto L_0x0050
            goto L_0x0065
        L_0x0050:
            android.media.MediaRecorder r6 = r4.mMediaRecorder
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x0062
        L_0x0055:
            android.media.MediaRecorder r6 = r4.mMediaRecorder
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x0062
        L_0x005a:
            android.media.MediaRecorder r6 = r4.mMediaRecorder
            r2 = 0
            goto L_0x0062
        L_0x005e:
            android.media.MediaRecorder r6 = r4.mMediaRecorder
            r2 = 90
        L_0x0062:
            r6.setOrientationHint(r2)
        L_0x0065:
            r0.fileFormat = r3
            android.media.MediaRecorder r6 = r4.mMediaRecorder
            r6.setProfile(r0)
            r6 = 0
            r4.mVideoFile = r6
            java.lang.String r0 = "target"
            int r0 = r5.getInt(r0)
            if (r0 == 0) goto L_0x0085
            if (r0 == r3) goto L_0x0080
            if (r0 == r1) goto L_0x0085
            java.io.File r0 = r4.getOutputMediaFile(r3)
            goto L_0x0089
        L_0x0080:
            java.io.File r0 = r4.getOutputCameraRollFile(r3)
            goto L_0x0089
        L_0x0085:
            java.io.File r0 = r4.getTempMediaFile(r3)
        L_0x0089:
            r4.mVideoFile = r0
            java.io.File r0 = r4.mVideoFile
            if (r0 != 0) goto L_0x0097
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "Error while preparing output file in prepareMediaRecorder."
            r5.<init>(r6)
            return r5
        L_0x0097:
            android.media.MediaRecorder r1 = r4.mMediaRecorder
            java.lang.String r0 = r0.getPath()
            r1.setOutputFile(r0)
            java.lang.String r0 = "totalSeconds"
            boolean r1 = r5.hasKey(r0)
            if (r1 == 0) goto L_0x00b3
            int r0 = r5.getInt(r0)
            android.media.MediaRecorder r1 = r4.mMediaRecorder
            int r0 = r0 * 1000
            r1.setMaxDuration(r0)
        L_0x00b3:
            java.lang.String r0 = "maxFileSize"
            boolean r1 = r5.hasKey(r0)
            if (r1 == 0) goto L_0x00c5
            int r5 = r5.getInt(r0)
            android.media.MediaRecorder r0 = r4.mMediaRecorder
            long r1 = (long) r5
            r0.setMaxFileSize(r1)
        L_0x00c5:
            android.media.MediaRecorder r5 = r4.mMediaRecorder     // Catch:{ Exception -> 0x00cb }
            r5.prepare()     // Catch:{ Exception -> 0x00cb }
            return r6
        L_0x00cb:
            r5 = move-exception
            java.lang.String r6 = "RCTCameraModule"
            java.lang.String r0 = "Media recorder prepare error."
            android.util.Log.e(r6, r0, r5)
            r4.releaseMediaRecorder()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lwansbrough.RCTCamera.RCTCameraModule.prepareMediaRecorder(com.facebook.react.bridge.ReadableMap, int):java.lang.Throwable");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0154, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void processImage(com.lwansbrough.RCTCamera.C5104a r12, com.facebook.react.bridge.ReadableMap r13, com.facebook.react.bridge.Promise r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "fixOrientation"
            boolean r0 = r13.hasKey(r0)     // Catch:{ all -> 0x0155 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "fixOrientation"
            boolean r0 = r13.getBoolean(r0)     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0022
            r12.mo15574c()     // Catch:{ b -> 0x001c }
            goto L_0x0022
        L_0x001c:
            r0 = move-exception
            java.lang.String r3 = "Error fixing orientation image"
            r14.reject((java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0155 }
        L_0x0022:
            int r0 = r12.mo15576e()     // Catch:{ all -> 0x0155 }
            double r3 = (double) r0     // Catch:{ all -> 0x0155 }
            int r0 = r12.mo15575d()     // Catch:{ all -> 0x0155 }
            double r5 = (double) r0
            double r3 = r3 / r5
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r0 = "type"
            int r0 = r13.getInt(r0)     // Catch:{ IllegalArgumentException -> 0x005d }
            com.lwansbrough.RCTCamera.b r7 = com.lwansbrough.RCTCamera.C5107b.m19270h()     // Catch:{ IllegalArgumentException -> 0x005d }
            int r7 = r7.mo15591l(r0)     // Catch:{ IllegalArgumentException -> 0x005d }
            double r7 = (double) r7     // Catch:{ IllegalArgumentException -> 0x005d }
            com.lwansbrough.RCTCamera.b r9 = com.lwansbrough.RCTCamera.C5107b.m19270h()     // Catch:{ IllegalArgumentException -> 0x005d }
            int r0 = r9.mo15590k(r0)     // Catch:{ IllegalArgumentException -> 0x005d }
            double r9 = (double) r0
            double r7 = r7 / r9
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x004e
            r0 = 1
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x0055
            r3 = 1
            goto L_0x0056
        L_0x0055:
            r3 = 0
        L_0x0056:
            if (r0 == r3) goto L_0x005a
            r0 = 1
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            r3 = r7
            goto L_0x005e
        L_0x005d:
            r0 = 0
        L_0x005e:
            java.lang.String r7 = "cropToPreview"
            boolean r7 = r13.hasKey(r7)     // Catch:{ all -> 0x0155 }
            if (r7 == 0) goto L_0x0070
            java.lang.String r7 = "cropToPreview"
            boolean r7 = r13.getBoolean(r7)     // Catch:{ all -> 0x0155 }
            if (r7 == 0) goto L_0x0070
            r7 = 1
            goto L_0x0071
        L_0x0070:
            r7 = 0
        L_0x0071:
            if (r7 == 0) goto L_0x0081
            if (r0 == 0) goto L_0x0077
            double r3 = r5 / r3
        L_0x0077:
            r12.mo15573b(r3)     // Catch:{ IllegalArgumentException -> 0x007b }
            goto L_0x0081
        L_0x007b:
            r3 = move-exception
            java.lang.String r4 = "Error cropping image to preview"
            r14.reject((java.lang.String) r4, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0155 }
        L_0x0081:
            java.lang.String r3 = "mirrorImage"
            boolean r3 = r13.hasKey(r3)     // Catch:{ all -> 0x0155 }
            if (r3 == 0) goto L_0x0092
            java.lang.String r3 = "mirrorImage"
            boolean r3 = r13.getBoolean(r3)     // Catch:{ all -> 0x0155 }
            if (r3 == 0) goto L_0x0092
            r1 = 1
        L_0x0092:
            if (r1 == 0) goto L_0x009e
            r12.mo15577f()     // Catch:{ b -> 0x0098 }
            goto L_0x009e
        L_0x0098:
            r1 = move-exception
            java.lang.String r3 = "Error mirroring image"
            r14.reject((java.lang.String) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0155 }
        L_0x009e:
            r1 = 80
            java.lang.String r3 = "jpegQuality"
            boolean r3 = r13.hasKey(r3)     // Catch:{ all -> 0x0155 }
            if (r3 == 0) goto L_0x00ae
            java.lang.String r1 = "jpegQuality"
            int r1 = r13.getInt(r1)     // Catch:{ all -> 0x0155 }
        L_0x00ae:
            if (r0 == 0) goto L_0x00b5
            int r3 = r12.mo15575d()     // Catch:{ all -> 0x0155 }
            goto L_0x00b9
        L_0x00b5:
            int r3 = r12.mo15576e()     // Catch:{ all -> 0x0155 }
        L_0x00b9:
            r6 = r3
            if (r0 == 0) goto L_0x00c1
            int r0 = r12.mo15576e()     // Catch:{ all -> 0x0155 }
            goto L_0x00c5
        L_0x00c1:
            int r0 = r12.mo15575d()     // Catch:{ all -> 0x0155 }
        L_0x00c5:
            r7 = r0
            java.lang.String r0 = "target"
            int r0 = r13.getInt(r0)     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x0138
            if (r0 == r2) goto L_0x011f
            r3 = 2
            if (r0 == r3) goto L_0x00f7
            r3 = 3
            if (r0 == r3) goto L_0x00d8
            goto L_0x0153
        L_0x00d8:
            java.io.File r5 = r11.getTempMediaFile(r2)     // Catch:{ all -> 0x0155 }
            if (r5 != 0) goto L_0x00e5
            java.lang.String r12 = "Error creating media file."
            r14.reject((java.lang.String) r12)     // Catch:{ all -> 0x0155 }
            monitor-exit(r11)
            return
        L_0x00e5:
            r12.mo15579m(r5, r13, r1)     // Catch:{ IOException -> 0x00ef }
        L_0x00e8:
            r9 = 0
            r4 = r11
            r8 = r14
            r4.resolveImage(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0155 }
            goto L_0x0153
        L_0x00ef:
            r12 = move-exception
            java.lang.String r13 = "failed to save image file"
            r14.reject((java.lang.String) r13, (java.lang.Throwable) r12)     // Catch:{ all -> 0x0155 }
            monitor-exit(r11)
            return
        L_0x00f7:
            java.io.File r5 = r11.getOutputCameraRollFile(r2)     // Catch:{ all -> 0x0155 }
            if (r5 != 0) goto L_0x0104
            java.lang.String r12 = "Error creating media file."
            r14.reject((java.lang.String) r12)     // Catch:{ all -> 0x0155 }
            monitor-exit(r11)
            return
        L_0x0104:
            r12.mo15579m(r5, r13, r1)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0115 }
            java.lang.String r12 = r5.getAbsolutePath()     // Catch:{ all -> 0x0155 }
            r11.addToMediaStore(r12)     // Catch:{ all -> 0x0155 }
            r9 = 1
            r4 = r11
            r8 = r14
            r4.resolveImage(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0155 }
            goto L_0x0153
        L_0x0115:
            r12 = move-exception
            goto L_0x0118
        L_0x0117:
            r12 = move-exception
        L_0x0118:
            java.lang.String r13 = "failed to save image file"
            r14.reject((java.lang.String) r13, (java.lang.Throwable) r12)     // Catch:{ all -> 0x0155 }
            monitor-exit(r11)
            return
        L_0x011f:
            java.io.File r5 = r11.getOutputMediaFile(r2)     // Catch:{ all -> 0x0155 }
            if (r5 != 0) goto L_0x012c
            java.lang.String r12 = "Error creating media file."
            r14.reject((java.lang.String) r12)     // Catch:{ all -> 0x0155 }
            monitor-exit(r11)
            return
        L_0x012c:
            r12.mo15579m(r5, r13, r1)     // Catch:{ IOException -> 0x0130 }
            goto L_0x00e8
        L_0x0130:
            r12 = move-exception
            java.lang.String r13 = "failed to save image file"
            r14.reject((java.lang.String) r13, (java.lang.Throwable) r12)     // Catch:{ all -> 0x0155 }
            monitor-exit(r11)
            return
        L_0x0138:
            java.lang.String r12 = r12.mo15578j(r1)     // Catch:{ all -> 0x0155 }
            com.facebook.react.bridge.WritableNativeMap r13 = new com.facebook.react.bridge.WritableNativeMap     // Catch:{ all -> 0x0155 }
            r13.<init>()     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = "data"
            r13.putString(r0, r12)     // Catch:{ all -> 0x0155 }
            java.lang.String r12 = "width"
            r13.putInt(r12, r6)     // Catch:{ all -> 0x0155 }
            java.lang.String r12 = "height"
            r13.putInt(r12, r7)     // Catch:{ all -> 0x0155 }
            r14.resolve(r13)     // Catch:{ all -> 0x0155 }
        L_0x0153:
            monitor-exit(r11)
            return
        L_0x0155:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lwansbrough.RCTCamera.RCTCameraModule.processImage(com.lwansbrough.RCTCamera.a, com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Promise):void");
    }

    private void record(ReadableMap readableMap, Promise promise, int i) {
        if (this.mRecordingPromise == null) {
            Camera a = C5107b.m19270h().mo15583a(readableMap.getInt("type"));
            this.mCamera = a;
            if (a == null) {
                promise.reject((Throwable) new RuntimeException("No camera found."));
                return;
            }
            Throwable prepareMediaRecorder = prepareMediaRecorder(readableMap, i);
            if (prepareMediaRecorder != null) {
                promise.reject(prepareMediaRecorder);
                return;
            }
            try {
                this.mMediaRecorder.start();
                this.MRStartTime = System.currentTimeMillis();
                this.mRecordingOptions = readableMap;
                this.mRecordingPromise = promise;
            } catch (Exception e) {
                Log.e(TAG, "Media recorder start error.", e);
                promise.reject((Throwable) e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        if (r4 != 3) goto L_0x012d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void releaseMediaRecorder() {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.MRStartTime
            long r0 = r0 - r2
            java.lang.String r2 = "RCTCameraModule"
            r3 = 1500(0x5dc, double:7.41E-321)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001a
            long r3 = r3 - r0
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0014 }
            goto L_0x001a
        L_0x0014:
            r0 = move-exception
            java.lang.String r1 = "releaseMediaRecorder thread sleep error."
            android.util.Log.e(r2, r1, r0)
        L_0x001a:
            android.media.MediaRecorder r0 = r6.mMediaRecorder
            r1 = 0
            if (r0 == 0) goto L_0x0035
            r0.stop()     // Catch:{ RuntimeException -> 0x0023 }
            goto L_0x0029
        L_0x0023:
            r0 = move-exception
            java.lang.String r3 = "Media recorder stop error."
            android.util.Log.e(r2, r3, r0)
        L_0x0029:
            android.media.MediaRecorder r0 = r6.mMediaRecorder
            r0.reset()
            android.media.MediaRecorder r0 = r6.mMediaRecorder
            r0.release()
            r6.mMediaRecorder = r1
        L_0x0035:
            android.hardware.Camera r0 = r6.mCamera
            if (r0 == 0) goto L_0x003c
            r0.lock()
        L_0x003c:
            com.facebook.react.bridge.Promise r0 = r6.mRecordingPromise
            if (r0 != 0) goto L_0x0041
            return
        L_0x0041:
            java.io.File r0 = new java.io.File
            java.io.File r2 = r6.mVideoFile
            java.lang.String r2 = r2.getPath()
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x0061
            com.facebook.react.bridge.Promise r0 = r6.mRecordingPromise
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "There is nothing recorded."
            r2.<init>(r3)
            r0.reject((java.lang.Throwable) r2)
            r6.mRecordingPromise = r1
            return
        L_0x0061:
            r2 = 1
            r3 = 0
            r0.setReadable(r2, r3)
            r0.setWritable(r2, r3)
            com.facebook.react.bridge.WritableNativeMap r3 = new com.facebook.react.bridge.WritableNativeMap
            r3.<init>()
            com.facebook.react.bridge.ReadableMap r4 = r6.mRecordingOptions
            java.lang.String r5 = "target"
            int r4 = r4.getInt(r5)
            r5 = 2
            if (r4 == 0) goto L_0x0115
            java.lang.String r0 = "path"
            if (r4 == r2) goto L_0x0102
            if (r4 == r5) goto L_0x0084
            r2 = 3
            if (r4 == r2) goto L_0x0102
            goto L_0x012d
        L_0x0084:
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.io.File r4 = r6.mVideoFile
            java.lang.String r4 = r4.getPath()
            java.lang.String r5 = "_data"
            r2.put(r5, r4)
            com.facebook.react.bridge.ReadableMap r4 = r6.mRecordingOptions
            java.lang.String r5 = "title"
            boolean r4 = r4.hasKey(r5)
            if (r4 == 0) goto L_0x00a5
            com.facebook.react.bridge.ReadableMap r4 = r6.mRecordingOptions
            java.lang.String r4 = r4.getString(r5)
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r4 = "video"
        L_0x00a7:
            r2.put(r5, r4)
            com.facebook.react.bridge.ReadableMap r4 = r6.mRecordingOptions
            java.lang.String r5 = "description"
            boolean r4 = r4.hasKey(r5)
            if (r4 == 0) goto L_0x00c1
            com.facebook.react.bridge.ReadableMap r4 = r6.mRecordingOptions
            boolean r4 = r4.hasKey(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.put(r5, r4)
        L_0x00c1:
            com.facebook.react.bridge.ReadableMap r4 = r6.mRecordingOptions
            java.lang.String r5 = "latitude"
            boolean r4 = r4.hasKey(r5)
            if (r4 == 0) goto L_0x00d4
            com.facebook.react.bridge.ReadableMap r4 = r6.mRecordingOptions
            java.lang.String r4 = r4.getString(r5)
            r2.put(r5, r4)
        L_0x00d4:
            com.facebook.react.bridge.ReadableMap r4 = r6.mRecordingOptions
            java.lang.String r5 = "longitude"
            boolean r4 = r4.hasKey(r5)
            if (r4 == 0) goto L_0x00e7
            com.facebook.react.bridge.ReadableMap r4 = r6.mRecordingOptions
            java.lang.String r4 = r4.getString(r5)
            r2.put(r5, r4)
        L_0x00e7:
            java.lang.String r4 = "mime_type"
            java.lang.String r5 = "video/mp4"
            r2.put(r4, r5)
            com.facebook.react.bridge.ReactApplicationContext r4 = _reactContext
            android.content.ContentResolver r4 = r4.getContentResolver()
            android.net.Uri r5 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            r4.insert(r5, r2)
            java.io.File r2 = r6.mVideoFile
            java.lang.String r2 = r2.getAbsolutePath()
            r6.addToMediaStore(r2)
        L_0x0102:
            java.io.File r2 = r6.mVideoFile
            android.net.Uri r2 = android.net.Uri.fromFile(r2)
            java.lang.String r2 = r2.toString()
            r3.putString(r0, r2)
            com.facebook.react.bridge.Promise r0 = r6.mRecordingPromise
            r0.resolve(r3)
            goto L_0x012d
        L_0x0115:
            java.io.File r2 = r6.mVideoFile
            byte[] r2 = convertFileToByteArray(r2)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2, r5)
            java.lang.String r2 = "data"
            r3.putString(r2, r4)
            com.facebook.react.bridge.Promise r2 = r6.mRecordingPromise
            r2.resolve(r3)
            r0.delete()
        L_0x012d:
            r6.mRecordingPromise = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lwansbrough.RCTCamera.RCTCameraModule.releaseMediaRecorder():void");
    }

    private void resolveImage(File file, int i, int i2, Promise promise, boolean z) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("path", Uri.fromFile(file).toString());
        writableNativeMap.putInt("width", i);
        writableNativeMap.putInt("height", i2);
        if (z) {
            MediaScannerConnection.scanFile(_reactContext, new String[]{file.getAbsolutePath()}, (String[]) null, new C5103e(writableNativeMap, promise));
            return;
        }
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public void capture(ReadableMap readableMap, Promise promise) {
        if (C5107b.m19270h() == null) {
            promise.reject("Camera is not ready yet.");
            return;
        }
        int i = readableMap.hasKey("orientation") ? readableMap.getInt("orientation") : C5107b.m19270h().mo15588i();
        if (i == Integer.MAX_VALUE) {
            this._sensorOrientationChecker.mo15645d();
            this._sensorOrientationChecker.mo15646e(new C5099b(readableMap, promise));
            return;
        }
        captureWithOrientation(readableMap, promise, i);
    }

    public Map<String, Object> getConstants() {
        return Collections.unmodifiableMap(new C5089a());
    }

    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void hasFlash(ReadableMap readableMap, Promise promise) {
        Camera a = C5107b.m19270h().mo15583a(readableMap.getInt("type"));
        if (a == null) {
            promise.reject("No camera found.");
            return;
        }
        List<String> supportedFlashModes = a.getParameters().getSupportedFlashModes();
        promise.resolve(Boolean.valueOf(supportedFlashModes != null && !supportedFlashModes.isEmpty()));
    }

    public void onError(MediaRecorder mediaRecorder, int i, int i2) {
        if (this.mRecordingPromise != null) {
            releaseMediaRecorder();
        }
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        if (this.mRecordingPromise != null) {
            releaseMediaRecorder();
        }
    }

    public void onHostResume() {
        this.mSafeToCapture = Boolean.TRUE;
    }

    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if ((i == 800 || i == 801) && this.mRecordingPromise != null) {
            releaseMediaRecorder();
        }
    }

    @ReactMethod
    public void setZoom(ReadableMap readableMap, int i) {
        Camera a;
        C5107b h = C5107b.m19270h();
        if (h != null && (a = h.mo15583a(readableMap.getInt("type"))) != null) {
            Camera.Parameters parameters = a.getParameters();
            int maxZoom = parameters.getMaxZoom();
            if (parameters.isZoomSupported() && i >= 0 && i < maxZoom) {
                parameters.setZoom(i);
                try {
                    a.setParameters(parameters);
                } catch (RuntimeException e) {
                    Log.e(TAG, "setParameters failed", e);
                }
            }
        }
    }

    @ReactMethod
    public void stopCapture(Promise promise) {
        String str;
        if (this.mRecordingPromise != null) {
            releaseMediaRecorder();
            str = "Finished recording.";
        } else {
            str = "Not recording.";
        }
        promise.resolve(str);
    }
}
