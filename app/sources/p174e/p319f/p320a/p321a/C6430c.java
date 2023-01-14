package p174e.p319f.p320a.p321a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaActionSound;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import okhttp3.HttpUrl;
import org.reactnative.camera.p515h.C10989b;
import p174e.p319f.p320a.p321a.C6448f;
import p174e.p319f.p320a.p321a.C6453i;

@TargetApi(21)
/* renamed from: e.f.a.a.c */
class C6430c extends C6448f implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener {

    /* renamed from: q */
    private static final SparseIntArray f17904q;

    /* renamed from: A */
    MediaActionSound f17905A = new MediaActionSound();

    /* renamed from: B */
    CameraCaptureSession f17906B;

    /* renamed from: C */
    CaptureRequest.Builder f17907C;

    /* renamed from: D */
    Set<String> f17908D = new HashSet();

    /* renamed from: E */
    private ImageReader f17909E;

    /* renamed from: F */
    private ImageReader f17910F;

    /* renamed from: G */
    private int f17911G;

    /* renamed from: H */
    private MediaRecorder f17912H;

    /* renamed from: I */
    private String f17913I;

    /* renamed from: J */
    private boolean f17914J;

    /* renamed from: K */
    private final C6457k f17915K = new C6457k();

    /* renamed from: L */
    private final C6457k f17916L = new C6457k();

    /* renamed from: M */
    private C6455j f17917M;

    /* renamed from: N */
    private int f17918N;

    /* renamed from: O */
    private C6412a f17919O = C6450g.f17982a;

    /* renamed from: P */
    private C6412a f17920P;

    /* renamed from: Q */
    private boolean f17921Q;

    /* renamed from: R */
    private int f17922R;

    /* renamed from: S */
    private float f17923S;

    /* renamed from: T */
    private int f17924T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f17925U;

    /* renamed from: V */
    private int f17926V;

    /* renamed from: W */
    private float f17927W;

    /* renamed from: X */
    private float f17928X;

    /* renamed from: Y */
    private int f17929Y;

    /* renamed from: Z */
    private boolean f17930Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public Boolean f17931a0;

    /* renamed from: b0 */
    private Boolean f17932b0;

    /* renamed from: c0 */
    private Surface f17933c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public Rect f17934d0;

    /* renamed from: r */
    private final CameraManager f17935r;

    /* renamed from: s */
    private final CameraDevice.StateCallback f17936s = new C6431a();

    /* renamed from: t */
    private final CameraCaptureSession.StateCallback f17937t = new C6432b();

    /* renamed from: u */
    C6440j f17938u = new C6433c();

    /* renamed from: v */
    private final ImageReader.OnImageAvailableListener f17939v = new C6434d();

    /* renamed from: w */
    private String f17940w;

    /* renamed from: x */
    private String f17941x = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: y */
    private CameraCharacteristics f17942y;

    /* renamed from: z */
    CameraDevice f17943z;

    /* renamed from: e.f.a.a.c$a */
    class C6431a extends CameraDevice.StateCallback {
        C6431a() {
        }

        public void onClosed(CameraDevice cameraDevice) {
            C6430c.this.f17979f.mo19173b();
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            C6430c.this.f17943z = null;
        }

        public void onError(CameraDevice cameraDevice, int i) {
            Log.e("Camera2", "onError: " + cameraDevice.getId() + " (" + i + ")");
            C6430c.this.f17943z = null;
        }

        public void onOpened(CameraDevice cameraDevice) {
            C6430c cVar = C6430c.this;
            cVar.f17943z = cameraDevice;
            cVar.f17979f.mo19176e();
            C6430c.this.mo19080q0();
        }
    }

    /* renamed from: e.f.a.a.c$b */
    class C6432b extends CameraCaptureSession.StateCallback {
        C6432b() {
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            CameraCaptureSession cameraCaptureSession2 = C6430c.this.f17906B;
            if (cameraCaptureSession2 != null && cameraCaptureSession2.equals(cameraCaptureSession)) {
                C6430c.this.f17906B = null;
            }
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Log.e("Camera2", "Failed to configure capture session.");
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            String str;
            C6430c cVar = C6430c.this;
            if (cVar.f17943z != null) {
                cVar.f17906B = cameraCaptureSession;
                Rect unused = cVar.f17934d0 = (Rect) cVar.f17907C.get(CaptureRequest.SCALER_CROP_REGION);
                C6430c.this.mo19082u0();
                C6430c.this.mo19083v0();
                C6430c.this.mo19084w0();
                C6430c.this.mo19085x0();
                C6430c.this.mo19086y0();
                try {
                    C6430c cVar2 = C6430c.this;
                    cVar2.f17906B.setRepeatingRequest(cVar2.f17907C.build(), C6430c.this.f17938u, (Handler) null);
                    return;
                } catch (CameraAccessException e) {
                    e = e;
                    str = "Failed to start camera preview because it couldn't access camera";
                } catch (IllegalStateException e2) {
                    e = e2;
                    str = "Failed to start camera preview.";
                }
            } else {
                return;
            }
            Log.e("Camera2", str, e);
        }
    }

    /* renamed from: e.f.a.a.c$c */
    class C6433c extends C6440j {
        C6433c() {
        }

        /* renamed from: b */
        public void mo19094b() {
            C6430c.this.f17907C.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            mo19105f(3);
            try {
                C6430c cVar = C6430c.this;
                cVar.f17906B.capture(cVar.f17907C.build(), this, (Handler) null);
                C6430c.this.f17907C.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            } catch (CameraAccessException e) {
                Log.e("Camera2", "Failed to run precapture sequence.", e);
            }
        }

        /* renamed from: c */
        public void mo19095c() {
            C6430c.this.mo19075Z();
        }
    }

    /* renamed from: e.f.a.a.c$d */
    class C6434d implements ImageReader.OnImageAvailableListener {
        C6434d() {
        }

        public void onImageAvailable(ImageReader imageReader) {
            Image acquireNextImage = imageReader.acquireNextImage();
            try {
                Image.Plane[] planes = acquireNextImage.getPlanes();
                if (planes.length > 0) {
                    ByteBuffer buffer = planes[0].getBuffer();
                    byte[] bArr = new byte[buffer.remaining()];
                    buffer.get(bArr);
                    if (acquireNextImage.getFormat() == 256) {
                        C6430c.this.f17979f.mo19172a(bArr, 0, 0);
                    } else {
                        C6430c.this.f17979f.mo19175d(bArr, acquireNextImage.getWidth(), acquireNextImage.getHeight(), C6430c.this.f17925U);
                    }
                    acquireNextImage.close();
                }
                acquireNextImage.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }
    }

    /* renamed from: e.f.a.a.c$e */
    class C6435e extends CameraManager.AvailabilityCallback {
        C6435e() {
        }

        public void onCameraAvailable(String str) {
            super.onCameraAvailable(str);
            C6430c.this.f17908D.add(str);
        }

        public void onCameraUnavailable(String str) {
            super.onCameraUnavailable(str);
            C6430c.this.f17908D.remove(str);
        }
    }

    /* renamed from: e.f.a.a.c$f */
    class C6436f implements C6453i.C6454a {
        C6436f() {
        }

        /* renamed from: a */
        public void mo19059a() {
            C6430c.this.mo19024S();
        }

        /* renamed from: b */
        public void mo19060b() {
            C6430c.this.mo19080q0();
        }
    }

    /* renamed from: e.f.a.a.c$g */
    class C6437g implements Runnable {
        C6437g() {
        }

        public void run() {
            CameraCaptureSession cameraCaptureSession = C6430c.this.f17906B;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                C6430c.this.f17906B = null;
            }
            C6430c.this.mo19080q0();
        }
    }

    /* renamed from: e.f.a.a.c$h */
    class C6438h extends CameraCaptureSession.CaptureCallback {
        C6438h() {
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (captureRequest.getTag() == "FOCUS_TAG") {
                C6430c.this.f17907C.set(CaptureRequest.CONTROL_AF_TRIGGER, (Object) null);
                try {
                    C6430c cVar = C6430c.this;
                    cVar.f17906B.setRepeatingRequest(cVar.f17907C.build(), (CameraCaptureSession.CaptureCallback) null, (Handler) null);
                } catch (CameraAccessException e) {
                    Log.e("Camera2", "Failed to manual focus.", e);
                }
            }
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            Log.e("Camera2", "Manual AF failure: " + captureFailure);
        }
    }

    /* renamed from: e.f.a.a.c$i */
    class C6439i extends CameraCaptureSession.CaptureCallback {
        C6439i() {
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            if (C6430c.this.f17938u.mo19103a().hasKey("pauseAfterCapture") && !C6430c.this.f17938u.mo19103a().getBoolean("pauseAfterCapture")) {
                C6430c.this.mo19081t0();
            }
            if (C6430c.this.f17931a0.booleanValue()) {
                C6430c.this.f17905A.play(0);
            }
        }
    }

    /* renamed from: e.f.a.a.c$j */
    private static abstract class C6440j extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        private int f17953a;

        /* renamed from: b */
        private ReadableMap f17954b = null;

        C6440j() {
        }

        /* renamed from: d */
        private void m24712d(CaptureResult captureResult) {
            int i = this.f17953a;
            if (i == 1) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num != null) {
                    if (num.intValue() == 4 || num.intValue() == 5) {
                        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (!(num2 == null || num2.intValue() == 2)) {
                            mo19105f(2);
                            mo19094b();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i == 3) {
                Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num3 == null || num3.intValue() == 5 || num3.intValue() == 4 || num3.intValue() == 2) {
                    mo19105f(4);
                    return;
                }
                return;
            } else if (i == 4) {
                Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num4 != null && num4.intValue() == 5) {
                    return;
                }
            } else {
                return;
            }
            mo19105f(5);
            mo19095c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public ReadableMap mo19103a() {
            return this.f17954b;
        }

        /* renamed from: b */
        public abstract void mo19094b();

        /* renamed from: c */
        public abstract void mo19095c();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo19104e(ReadableMap readableMap) {
            this.f17954b = readableMap;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo19105f(int i) {
            this.f17953a = i;
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            m24712d(totalCaptureResult);
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            m24712d(captureResult);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17904q = sparseIntArray;
        sparseIntArray.put(0, 1);
        sparseIntArray.put(1, 0);
    }

    C6430c(C6448f.C6449a aVar, C6453i iVar, Context context, Handler handler) {
        super(aVar, iVar, handler);
        Boolean bool = Boolean.FALSE;
        this.f17931a0 = bool;
        this.f17932b0 = bool;
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        this.f17935r = cameraManager;
        cameraManager.registerAvailabilityCallback(new C6435e(), (Handler) null);
        this.f17911G = this.f17930Z ? 35 : 256;
        this.f17980o.mo19202l(new C6436f());
    }

    /* renamed from: Y */
    private MeteringRectangle m24635Y(float f, float f2) {
        Rect rect = (Rect) this.f17942y.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return new MeteringRectangle(Math.max(((int) (f * ((float) rect.width()))) - 150, 0), Math.max(((int) (f2 * ((float) rect.height()))) - 150, 0), 300, 300, 999);
    }

    /* renamed from: a0 */
    private boolean m24636a0() {
        String str;
        String str2 = this.f17941x;
        if (str2 == null || str2.isEmpty()) {
            try {
                int i = f17904q.get(this.f17918N);
                String[] cameraIdList = this.f17935r.getCameraIdList();
                if (cameraIdList.length == 0) {
                    Log.e("Camera2", "No cameras available.");
                    return false;
                }
                for (String str3 : cameraIdList) {
                    CameraCharacteristics cameraCharacteristics = this.f17935r.getCameraCharacteristics(str3);
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (num == null) {
                        Log.e("Camera2", "Unexpected state: LENS_FACING null");
                    } else if (num.intValue() == i) {
                        this.f17940w = str3;
                        this.f17942y = cameraCharacteristics;
                        return true;
                    }
                }
                String str4 = cameraIdList[0];
                this.f17940w = str4;
                CameraCharacteristics cameraCharacteristics2 = this.f17935r.getCameraCharacteristics(str4);
                this.f17942y = cameraCharacteristics2;
                Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.LENS_FACING);
                if (num2 == null) {
                    Log.e("Camera2", "Unexpected state: LENS_FACING null");
                    return false;
                }
                int size = f17904q.size();
                for (int i2 = 0; i2 < size; i2++) {
                    SparseIntArray sparseIntArray = f17904q;
                    if (sparseIntArray.valueAt(i2) == num2.intValue()) {
                        this.f17918N = sparseIntArray.keyAt(i2);
                        return true;
                    }
                }
                this.f17918N = 0;
                return true;
            } catch (CameraAccessException e) {
                e = e;
                str = "Failed to get a list of camera devices";
                Log.e("Camera2", str, e);
                return false;
            }
        } else {
            try {
                CameraCharacteristics cameraCharacteristics3 = this.f17935r.getCameraCharacteristics(this.f17941x);
                this.f17942y = cameraCharacteristics3;
                Integer num3 = (Integer) cameraCharacteristics3.get(CameraCharacteristics.LENS_FACING);
                if (num3 == null) {
                    Log.e("Camera2", "Unexpected state: LENS_FACING null");
                    return false;
                }
                int size2 = f17904q.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    SparseIntArray sparseIntArray2 = f17904q;
                    if (sparseIntArray2.valueAt(i3) == num3.intValue()) {
                        this.f17918N = sparseIntArray2.keyAt(i3);
                        break;
                    }
                    i3++;
                }
                this.f17940w = this.f17941x;
                return true;
            } catch (Exception e2) {
                e = e2;
                str = "Failed to get camera characteristics";
                Log.e("Camera2", str, e);
                return false;
            }
        }
    }

    /* renamed from: b0 */
    private C6455j m24637b0() {
        int i = this.f17980o.mo19199i();
        int c = this.f17980o.mo19193c();
        if (i < c) {
            int i2 = c;
            c = i;
            i = i2;
        }
        SortedSet<C6455j> f = this.f17915K.mo19223f(this.f17919O);
        for (C6455j jVar : f) {
            if (jVar.mo19206O() >= i && jVar.mo19205N() >= c) {
                return jVar;
            }
        }
        return f.last();
    }

    /* renamed from: c0 */
    private void m24638c0() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f17942y.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            this.f17915K.mo19219b();
            for (Size size : streamConfigurationMap.getOutputSizes(this.f17980o.mo19194d())) {
                int width = size.getWidth();
                int height = size.getHeight();
                if (width <= 1920 && height <= 1080) {
                    this.f17915K.mo19218a(new C6455j(width, height));
                }
            }
            this.f17916L.mo19219b();
            mo19076d0(this.f17916L, streamConfigurationMap);
            if (this.f17917M == null) {
                this.f17917M = this.f17916L.mo19223f(this.f17919O).last();
            }
            for (C6412a next : this.f17915K.mo19221d()) {
                if (!this.f17916L.mo19221d().contains(next)) {
                    this.f17915K.mo19222e(next);
                }
            }
            if (!this.f17915K.mo19221d().contains(this.f17919O)) {
                this.f17919O = this.f17915K.mo19221d().iterator().next();
            }
            this.f17924T = ((Integer) this.f17942y.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            return;
        }
        throw new IllegalStateException("Failed to get configuration map: " + this.f17940w);
    }

    /* renamed from: e0 */
    private int m24639e0() {
        int i;
        int intValue = ((Integer) this.f17942y.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        if (this.f17918N == 0) {
            i = this.f17926V;
        } else {
            i = m24640g0(this.f17926V) ? 180 : 0;
            intValue += this.f17926V;
        }
        return (intValue + i) % 360;
    }

    /* renamed from: g0 */
    private boolean m24640g0(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: h0 */
    public static boolean m24641h0(Context context) {
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
            String[] cameraIdList = cameraManager.getCameraIdList();
            int length = cameraIdList.length;
            int i = 0;
            while (i < length) {
                Integer num = (Integer) cameraManager.getCameraCharacteristics(cameraIdList[i]).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                if (num != null) {
                    if (num.intValue() != 2) {
                        i++;
                    }
                }
                Log.w("Camera2", "Camera2 can only run in legacy mode and should not be used.");
                return true;
            }
            return false;
        } catch (CameraAccessException e) {
            Log.e("Camera2", "Failed to check camera legacy status, returning true.", e);
            return true;
        }
    }

    /* renamed from: i0 */
    private boolean m24642i0() {
        return ((Integer) this.f17942y.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() >= 1;
    }

    /* renamed from: j0 */
    private void m24643j0() {
        this.f17907C.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        try {
            this.f17938u.mo19105f(1);
            this.f17906B.capture(this.f17907C.build(), this.f17938u, (Handler) null);
        } catch (CameraAccessException e) {
            Log.e("Camera2", "Failed to lock focus.", e);
        }
    }

    /* renamed from: k0 */
    private void m24644k0() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f17912H.pause();
        }
    }

    /* renamed from: l0 */
    private void m24645l0() {
        ImageReader imageReader = this.f17910F;
        if (imageReader != null) {
            imageReader.close();
        }
        C6455j last = this.f17915K.mo19223f(this.f17919O).last();
        ImageReader newInstance = ImageReader.newInstance(last.mo19206O(), last.mo19205N(), 35, 1);
        this.f17910F = newInstance;
        newInstance.setOnImageAvailableListener(this.f17939v, (Handler) null);
    }

    /* renamed from: m0 */
    private void m24646m0() {
        ImageReader imageReader = this.f17909E;
        if (imageReader != null) {
            imageReader.close();
        }
        ImageReader newInstance = ImageReader.newInstance(this.f17917M.mo19206O(), this.f17917M.mo19205N(), 256, 1);
        this.f17909E = newInstance;
        newInstance.setOnImageAvailableListener(this.f17939v, (Handler) null);
    }

    /* renamed from: n0 */
    private void m24647n0() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f17912H.resume();
        }
    }

    /* renamed from: o0 */
    private void m24648o0(CamcorderProfile camcorderProfile, boolean z) {
        this.f17912H.setOutputFormat(camcorderProfile.fileFormat);
        this.f17912H.setVideoFrameRate(camcorderProfile.videoFrameRate);
        this.f17912H.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        this.f17912H.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
        this.f17912H.setVideoEncoder(camcorderProfile.videoCodec);
        if (z) {
            this.f17912H.setAudioEncodingBitRate(camcorderProfile.audioBitRate);
            this.f17912H.setAudioChannels(camcorderProfile.audioChannels);
            this.f17912H.setAudioSamplingRate(camcorderProfile.audioSampleRate);
            this.f17912H.setAudioEncoder(camcorderProfile.audioCodec);
        }
    }

    /* renamed from: p0 */
    private void m24649p0(String str, int i, int i2, boolean z, CamcorderProfile camcorderProfile) {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.f17912H = mediaRecorder;
        mediaRecorder.setVideoSource(2);
        if (z) {
            this.f17912H.setAudioSource(1);
        }
        this.f17912H.setOutputFile(str);
        this.f17913I = str;
        CamcorderProfile camcorderProfile2 = !CamcorderProfile.hasProfile(Integer.parseInt(this.f17940w), camcorderProfile.quality) ? CamcorderProfile.get(1) : camcorderProfile;
        camcorderProfile2.videoBitRate = camcorderProfile.videoBitRate;
        m24648o0(camcorderProfile2, z);
        this.f17912H.setOrientationHint(m24639e0());
        if (i != -1) {
            this.f17912H.setMaxDuration(i);
        }
        if (i2 != -1) {
            this.f17912H.setMaxFileSize((long) i2);
        }
        this.f17912H.setOnInfoListener(this);
        this.f17912H.setOnErrorListener(this);
    }

    /* renamed from: r0 */
    private void m24650r0() {
        try {
            this.f17935r.openCamera(this.f17940w, this.f17936s, (Handler) null);
        } catch (CameraAccessException e) {
            throw new RuntimeException("Failed to open camera: " + this.f17940w, e);
        }
    }

    /* renamed from: s0 */
    private void m24651s0() {
        this.f17914J = false;
        try {
            this.f17906B.stopRepeating();
            this.f17906B.abortCaptures();
            this.f17912H.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f17912H.reset();
        this.f17912H.release();
        this.f17912H = null;
        this.f17979f.mo19174c();
        if (this.f17932b0.booleanValue()) {
            this.f17905A.play(3);
        }
        if (this.f17913I == null || !new File(this.f17913I).exists()) {
            this.f17979f.mo19179h((String) null, 0, 0);
            return;
        }
        this.f17979f.mo19179h(this.f17913I, 0, 0);
        this.f17913I = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo19004A(C6412a aVar) {
        if (aVar != null && this.f17915K.mo19220c()) {
            this.f17920P = aVar;
            return false;
        } else if (aVar == null || aVar.equals(this.f17919O) || !this.f17915K.mo19221d().contains(aVar)) {
            return false;
        } else {
            this.f17919O = aVar;
            m24646m0();
            m24645l0();
            CameraCaptureSession cameraCaptureSession = this.f17906B;
            if (cameraCaptureSession == null) {
                return true;
            }
            cameraCaptureSession.close();
            this.f17906B = null;
            mo19080q0();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo19005B(boolean z) {
        if (this.f17921Q != z) {
            this.f17921Q = z;
            if (this.f17907C != null) {
                mo19082u0();
                CameraCaptureSession cameraCaptureSession = this.f17906B;
                if (cameraCaptureSession != null) {
                    try {
                        cameraCaptureSession.setRepeatingRequest(this.f17907C.build(), this.f17938u, (Handler) null);
                    } catch (CameraAccessException unused) {
                        this.f17921Q = !this.f17921Q;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo19006C(String str) {
        if (!C10989b.m37291a(this.f17941x, str)) {
            this.f17941x = str;
            if (!C10989b.m37291a(str, this.f17940w) && mo19051u()) {
                mo19024S();
                mo19023R();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo19007D(int i) {
        this.f17926V = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo19008E(int i) {
        this.f17925U = i;
        this.f17980o.mo19203m(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo19009F(float f) {
        Log.e("CAMERA_2:: ", "Adjusting exposure is not currently supported for Camera2");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo19010G(int i) {
        if (this.f17918N != i) {
            this.f17918N = i;
            if (mo19051u()) {
                mo19024S();
                mo19023R();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo19011H(int i) {
        int i2 = this.f17922R;
        if (i2 != i) {
            this.f17922R = i;
            if (this.f17907C != null) {
                mo19083v0();
                CameraCaptureSession cameraCaptureSession = this.f17906B;
                if (cameraCaptureSession != null) {
                    try {
                        cameraCaptureSession.setRepeatingRequest(this.f17907C.build(), this.f17938u, (Handler) null);
                    } catch (CameraAccessException unused) {
                        this.f17922R = i2;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo19012I(float f, float f2) {
        if (this.f17906B != null) {
            C6438h hVar = new C6438h();
            try {
                this.f17906B.stopRepeating();
            } catch (CameraAccessException e) {
                Log.e("Camera2", "Failed to manual focus.", e);
            }
            this.f17907C.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            this.f17907C.set(CaptureRequest.CONTROL_AF_MODE, 0);
            try {
                this.f17906B.capture(this.f17907C.build(), hVar, (Handler) null);
            } catch (CameraAccessException e2) {
                Log.e("Camera2", "Failed to manual focus.", e2);
            }
            if (m24642i0()) {
                MeteringRectangle Y = m24635Y(f, f2);
                this.f17907C.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{Y});
            }
            this.f17907C.set(CaptureRequest.CONTROL_MODE, 1);
            this.f17907C.set(CaptureRequest.CONTROL_AF_MODE, 1);
            this.f17907C.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            this.f17907C.setTag("FOCUS_TAG");
            try {
                this.f17906B.capture(this.f17907C.build(), hVar, (Handler) null);
            } catch (CameraAccessException e3) {
                Log.e("Camera2", "Failed to manual focus.", e3);
            }
        }
    }

    /* renamed from: J */
    public void mo19013J(float f) {
        float f2 = this.f17927W;
        if (f2 != f) {
            this.f17927W = f;
            if (this.f17906B != null) {
                mo19084w0();
                try {
                    this.f17906B.setRepeatingRequest(this.f17907C.build(), this.f17938u, (Handler) null);
                } catch (CameraAccessException unused) {
                    this.f17927W = f2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo19014K(C6455j jVar) {
        CameraCaptureSession cameraCaptureSession = this.f17906B;
        if (cameraCaptureSession != null) {
            try {
                cameraCaptureSession.stopRepeating();
            } catch (CameraAccessException e) {
                e.printStackTrace();
            }
            this.f17906B.close();
            this.f17906B = null;
        }
        ImageReader imageReader = this.f17909E;
        if (imageReader != null) {
            imageReader.close();
        }
        if (jVar == null) {
            C6412a aVar = this.f17919O;
            if (aVar != null && this.f17917M != null) {
                this.f17916L.mo19223f(aVar).last();
            } else {
                return;
            }
        } else {
            this.f17917M = jVar;
        }
        m24646m0();
        mo19080q0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo19016L(boolean z) {
        this.f17931a0 = Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo19017M(boolean z) {
        this.f17932b0 = Boolean.valueOf(z);
    }

    /* renamed from: N */
    public void mo19018N(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f17933c0 = new Surface(surfaceTexture);
        } else {
            this.f17933c0 = null;
        }
        new Handler(Looper.getMainLooper()).post(new C6437g());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo19019O(boolean z) {
        if (this.f17930Z != z) {
            this.f17930Z = z;
            this.f17911G = !z ? 256 : 35;
            CameraCaptureSession cameraCaptureSession = this.f17906B;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f17906B = null;
            }
            mo19080q0();
        }
    }

    /* renamed from: P */
    public void mo19020P(int i) {
        int i2 = this.f17929Y;
        if (i2 != i) {
            this.f17929Y = i;
            if (this.f17906B != null) {
                mo19085x0();
                try {
                    this.f17906B.setRepeatingRequest(this.f17907C.build(), this.f17938u, (Handler) null);
                } catch (CameraAccessException unused) {
                    this.f17929Y = i2;
                }
            }
        }
    }

    /* renamed from: Q */
    public void mo19022Q(float f) {
        float f2 = this.f17928X;
        if (f2 != f) {
            this.f17928X = f;
            if (this.f17906B != null) {
                mo19086y0();
                try {
                    this.f17906B.setRepeatingRequest(this.f17907C.build(), this.f17938u, (Handler) null);
                } catch (CameraAccessException unused) {
                    this.f17928X = f2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public boolean mo19023R() {
        if (!m24636a0()) {
            this.f17919O = this.f17920P;
            this.f17979f.mo19177f();
            return false;
        }
        m24638c0();
        mo19004A(this.f17920P);
        this.f17920P = null;
        m24646m0();
        m24645l0();
        m24650r0();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo19024S() {
        CameraCaptureSession cameraCaptureSession = this.f17906B;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f17906B = null;
        }
        CameraDevice cameraDevice = this.f17943z;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f17943z = null;
        }
        ImageReader imageReader = this.f17909E;
        if (imageReader != null) {
            imageReader.close();
            this.f17909E = null;
        }
        ImageReader imageReader2 = this.f17910F;
        if (imageReader2 != null) {
            imageReader2.close();
            this.f17910F = null;
        }
        MediaRecorder mediaRecorder = this.f17912H;
        if (mediaRecorder != null) {
            mediaRecorder.stop();
            this.f17912H.reset();
            this.f17912H.release();
            this.f17912H = null;
            if (this.f17914J) {
                this.f17979f.mo19174c();
                this.f17979f.mo19179h(this.f17913I, 0, 0);
                this.f17914J = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo19025T() {
        if (this.f17914J) {
            m24651s0();
            CameraCaptureSession cameraCaptureSession = this.f17906B;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f17906B = null;
            }
            mo19080q0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo19026U(ReadableMap readableMap) {
        this.f17938u.mo19104e(readableMap);
        if (this.f17921Q) {
            m24643j0();
        } else {
            mo19075Z();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0095 A[Catch:{ CameraAccessException -> 0x00d0 }] */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19075Z() {
        /*
            r6 = this;
            java.lang.String r0 = "quality"
            android.hardware.camera2.CameraDevice r1 = r6.f17943z     // Catch:{ CameraAccessException -> 0x00d0 }
            r2 = 2
            android.hardware.camera2.CaptureRequest$Builder r1 = r1.createCaptureRequest(r2)     // Catch:{ CameraAccessException -> 0x00d0 }
            boolean r3 = r6.f17930Z     // Catch:{ CameraAccessException -> 0x00d0 }
            if (r3 == 0) goto L_0x001a
            r3 = 256(0x100, float:3.59E-43)
            r6.f17911G = r3     // Catch:{ CameraAccessException -> 0x00d0 }
            android.media.ImageReader r3 = r6.f17910F     // Catch:{ CameraAccessException -> 0x00d0 }
            android.view.Surface r3 = r3.getSurface()     // Catch:{ CameraAccessException -> 0x00d0 }
            r1.removeTarget(r3)     // Catch:{ CameraAccessException -> 0x00d0 }
        L_0x001a:
            android.media.ImageReader r3 = r6.f17909E     // Catch:{ CameraAccessException -> 0x00d0 }
            android.view.Surface r3 = r3.getSurface()     // Catch:{ CameraAccessException -> 0x00d0 }
            r1.addTarget(r3)     // Catch:{ CameraAccessException -> 0x00d0 }
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE     // Catch:{ CameraAccessException -> 0x00d0 }
            android.hardware.camera2.CaptureRequest$Builder r4 = r6.f17907C     // Catch:{ CameraAccessException -> 0x00d0 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ CameraAccessException -> 0x00d0 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ CameraAccessException -> 0x00d0 }
            r1.set(r3, r4)     // Catch:{ CameraAccessException -> 0x00d0 }
            int r3 = r6.f17922R     // Catch:{ CameraAccessException -> 0x00d0 }
            r4 = 1
            if (r3 == 0) goto L_0x006b
            r5 = 3
            if (r3 == r4) goto L_0x0061
            if (r3 == r2) goto L_0x0051
            if (r3 == r5) goto L_0x004a
            r4 = 4
            if (r3 == r4) goto L_0x0040
            goto L_0x007c
        L_0x0040:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE     // Catch:{ CameraAccessException -> 0x00d0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ CameraAccessException -> 0x00d0 }
        L_0x0046:
            r1.set(r3, r2)     // Catch:{ CameraAccessException -> 0x00d0 }
            goto L_0x007c
        L_0x004a:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE     // Catch:{ CameraAccessException -> 0x00d0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ CameraAccessException -> 0x00d0 }
            goto L_0x0046
        L_0x0051:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE     // Catch:{ CameraAccessException -> 0x00d0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ CameraAccessException -> 0x00d0 }
            r1.set(r3, r4)     // Catch:{ CameraAccessException -> 0x00d0 }
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.FLASH_MODE     // Catch:{ CameraAccessException -> 0x00d0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ CameraAccessException -> 0x00d0 }
            goto L_0x0046
        L_0x0061:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE     // Catch:{ CameraAccessException -> 0x00d0 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ CameraAccessException -> 0x00d0 }
        L_0x0067:
            r1.set(r2, r3)     // Catch:{ CameraAccessException -> 0x00d0 }
            goto L_0x007c
        L_0x006b:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE     // Catch:{ CameraAccessException -> 0x00d0 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ CameraAccessException -> 0x00d0 }
            r1.set(r2, r3)     // Catch:{ CameraAccessException -> 0x00d0 }
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.FLASH_MODE     // Catch:{ CameraAccessException -> 0x00d0 }
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ CameraAccessException -> 0x00d0 }
            goto L_0x0067
        L_0x007c:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION     // Catch:{ CameraAccessException -> 0x00d0 }
            int r3 = r6.m24639e0()     // Catch:{ CameraAccessException -> 0x00d0 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ CameraAccessException -> 0x00d0 }
            r1.set(r2, r3)     // Catch:{ CameraAccessException -> 0x00d0 }
            e.f.a.a.c$j r2 = r6.f17938u     // Catch:{ CameraAccessException -> 0x00d0 }
            com.facebook.react.bridge.ReadableMap r2 = r2.mo19103a()     // Catch:{ CameraAccessException -> 0x00d0 }
            boolean r2 = r2.hasKey(r0)     // Catch:{ CameraAccessException -> 0x00d0 }
            if (r2 == 0) goto L_0x00ae
            e.f.a.a.c$j r2 = r6.f17938u     // Catch:{ CameraAccessException -> 0x00d0 }
            com.facebook.react.bridge.ReadableMap r2 = r2.mo19103a()     // Catch:{ CameraAccessException -> 0x00d0 }
            double r2 = r2.getDouble(r0)     // Catch:{ CameraAccessException -> 0x00d0 }
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r4
            int r0 = (int) r2     // Catch:{ CameraAccessException -> 0x00d0 }
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.JPEG_QUALITY     // Catch:{ CameraAccessException -> 0x00d0 }
            byte r0 = (byte) r0     // Catch:{ CameraAccessException -> 0x00d0 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ CameraAccessException -> 0x00d0 }
            r1.set(r2, r0)     // Catch:{ CameraAccessException -> 0x00d0 }
        L_0x00ae:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION     // Catch:{ CameraAccessException -> 0x00d0 }
            android.hardware.camera2.CaptureRequest$Builder r2 = r6.f17907C     // Catch:{ CameraAccessException -> 0x00d0 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ CameraAccessException -> 0x00d0 }
            android.graphics.Rect r2 = (android.graphics.Rect) r2     // Catch:{ CameraAccessException -> 0x00d0 }
            r1.set(r0, r2)     // Catch:{ CameraAccessException -> 0x00d0 }
            android.hardware.camera2.CameraCaptureSession r0 = r6.f17906B     // Catch:{ CameraAccessException -> 0x00d0 }
            r0.stopRepeating()     // Catch:{ CameraAccessException -> 0x00d0 }
            android.hardware.camera2.CameraCaptureSession r0 = r6.f17906B     // Catch:{ CameraAccessException -> 0x00d0 }
            android.hardware.camera2.CaptureRequest r1 = r1.build()     // Catch:{ CameraAccessException -> 0x00d0 }
            e.f.a.a.c$i r2 = new e.f.a.a.c$i     // Catch:{ CameraAccessException -> 0x00d0 }
            r2.<init>()     // Catch:{ CameraAccessException -> 0x00d0 }
            r3 = 0
            r0.capture(r1, r2, r3)     // Catch:{ CameraAccessException -> 0x00d0 }
            goto L_0x00d8
        L_0x00d0:
            r0 = move-exception
            java.lang.String r1 = "Camera2"
            java.lang.String r2 = "Cannot capture a still picture."
            android.util.Log.e(r1, r2, r0)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p321a.C6430c.mo19075Z():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6412a mo19027a() {
        return this.f17919O;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo19028b() {
        return this.f17921Q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public SortedSet<C6455j> mo19029c(C6412a aVar) {
        return this.f17916L.mo19223f(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo19030d() {
        return this.f17941x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo19076d0(C6457k kVar, StreamConfigurationMap streamConfigurationMap) {
        for (Size size : streamConfigurationMap.getOutputSizes(this.f17911G)) {
            this.f17916L.mo19218a(new C6455j(size.getWidth(), size.getHeight()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public List<Properties> mo19031e() {
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f17935r.getCameraIdList()) {
                Properties properties = new Properties();
                properties.put("id", str);
                properties.put("type", String.valueOf(((Integer) this.f17935r.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING)).intValue() == 0 ? 1 : 0));
                arrayList.add(properties);
            }
            return arrayList;
        } catch (CameraAccessException e) {
            throw new RuntimeException("Failed to get a list of camera ids", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo19032f() {
        return this.f17924T;
    }

    /* renamed from: f0 */
    public Surface mo19077f0() {
        Surface surface = this.f17933c0;
        return surface != null ? surface : this.f17980o.mo19195e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo19033g() {
        return this.f17923S;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo19034h() {
        return this.f17918N;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo19035i() {
        return this.f17922R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo19036j() {
        return this.f17927W;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C6455j mo19037k() {
        return this.f17917M;
    }

    /* renamed from: l */
    public boolean mo19038l() {
        return this.f17931a0.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo19039m() {
        return this.f17932b0.booleanValue();
    }

    /* renamed from: n */
    public C6455j mo19041n() {
        return new C6455j(this.f17980o.mo19199i(), this.f17980o.mo19193c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo19042o() {
        return this.f17930Z;
    }

    public void onError(MediaRecorder mediaRecorder, int i, int i2) {
        mo19025T();
    }

    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 800 || i == 801) {
            mo19025T();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public Set<C6412a> mo19046p() {
        return this.f17915K.mo19221d();
    }

    /* renamed from: q */
    public ArrayList<int[]> mo19047q() {
        Log.e("CAMERA_2:: ", "getSupportedPreviewFpsRange is not currently supported for Camera2");
        return new ArrayList<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo19080q0() {
        if (mo19051u() && this.f17980o.mo19200j() && this.f17909E != null && this.f17910F != null) {
            C6455j b0 = m24637b0();
            this.f17980o.mo19201k(b0.mo19206O(), b0.mo19205N());
            Surface f0 = mo19077f0();
            try {
                CaptureRequest.Builder createCaptureRequest = this.f17943z.createCaptureRequest(1);
                this.f17907C = createCaptureRequest;
                createCaptureRequest.addTarget(f0);
                if (this.f17930Z) {
                    this.f17907C.addTarget(this.f17910F.getSurface());
                }
                this.f17943z.createCaptureSession(Arrays.asList(new Surface[]{f0, this.f17909E.getSurface(), this.f17910F.getSurface()}), this.f17937t, (Handler) null);
            } catch (CameraAccessException e) {
                Log.e("Camera2", "Failed to start capture session", e);
                this.f17979f.mo19177f();
            }
        }
    }

    /* renamed from: s */
    public int mo19048s() {
        return this.f17929Y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public float mo19049t() {
        return this.f17928X;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public void mo19081t0() {
        this.f17907C.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        try {
            this.f17906B.capture(this.f17907C.build(), this.f17938u, (Handler) null);
            mo19082u0();
            mo19083v0();
            if (this.f17930Z) {
                this.f17911G = 35;
                mo19080q0();
                return;
            }
            this.f17907C.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            this.f17906B.setRepeatingRequest(this.f17907C.build(), this.f17938u, (Handler) null);
            this.f17938u.mo19105f(0);
        } catch (CameraAccessException e) {
            Log.e("Camera2", "Failed to restart camera preview.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo19051u() {
        return this.f17943z != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo19082u0() {
        CaptureRequest.Key key;
        CaptureRequest.Builder builder;
        int i = 0;
        if (this.f17921Q) {
            int[] iArr = (int[]) this.f17942y.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr == null || iArr.length == 0 || (iArr.length == 1 && iArr[0] == 0)) {
                this.f17921Q = false;
            } else {
                builder = this.f17907C;
                key = CaptureRequest.CONTROL_AF_MODE;
                i = 4;
                builder.set(key, i);
            }
        }
        builder = this.f17907C;
        key = CaptureRequest.CONTROL_AF_MODE;
        builder.set(key, i);
    }

    /* renamed from: v */
    public void mo19053v() {
        try {
            this.f17906B.stopRepeating();
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo19083v0() {
        int i;
        CaptureRequest.Key key;
        CaptureRequest.Builder builder;
        int i2;
        CaptureRequest.Key key2;
        CaptureRequest.Builder builder2;
        int i3 = this.f17922R;
        int i4 = 1;
        if (i3 != 0) {
            if (i3 == 1) {
                builder2 = this.f17907C;
                key2 = CaptureRequest.CONTROL_AE_MODE;
                i2 = 3;
            } else if (i3 == 2) {
                this.f17907C.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder = this.f17907C;
                key = CaptureRequest.FLASH_MODE;
                i = 2;
                builder.set(key, i);
            } else if (i3 != 3) {
                i4 = 4;
                if (i3 != 4) {
                    return;
                }
            } else {
                builder2 = this.f17907C;
                key2 = CaptureRequest.CONTROL_AE_MODE;
                i2 = 2;
            }
            builder2.set(key2, i2);
            builder = this.f17907C;
            key = CaptureRequest.FLASH_MODE;
            i = 0;
            builder.set(key, i);
        }
        this.f17907C.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(i4));
        builder = this.f17907C;
        key = CaptureRequest.FLASH_MODE;
        i = 0;
        builder.set(key, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo19054w() {
        m24644k0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo19084w0() {
        if (!this.f17921Q) {
            Float f = (Float) this.f17942y.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
            Objects.requireNonNull(f, "Unexpected state: LENS_INFO_MINIMUM_FOCUS_DISTANCE null");
            this.f17907C.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(this.f17927W * f.floatValue()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo19055x(String str, int i, int i2, boolean z, CamcorderProfile camcorderProfile, int i3, int i4) {
        if (!this.f17914J) {
            m24649p0(str, i, i2, z, camcorderProfile);
            try {
                this.f17912H.prepare();
                CameraCaptureSession cameraCaptureSession = this.f17906B;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.close();
                    this.f17906B = null;
                }
                C6455j b0 = m24637b0();
                this.f17980o.mo19201k(b0.mo19206O(), b0.mo19205N());
                Surface f0 = mo19077f0();
                Surface surface = this.f17912H.getSurface();
                CaptureRequest.Builder createCaptureRequest = this.f17943z.createCaptureRequest(3);
                this.f17907C = createCaptureRequest;
                createCaptureRequest.addTarget(f0);
                this.f17907C.addTarget(surface);
                this.f17943z.createCaptureSession(Arrays.asList(new Surface[]{f0, surface}), this.f17937t, (Handler) null);
                this.f17912H.start();
                this.f17914J = true;
                this.f17979f.mo19178g(this.f17913I, 0, 0);
                if (this.f17932b0.booleanValue()) {
                    this.f17905A.play(2);
                }
                return true;
            } catch (CameraAccessException | IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public void mo19085x0() {
        int i;
        CaptureRequest.Key key;
        CaptureRequest.Builder builder;
        int i2;
        int i3 = this.f17929Y;
        int i4 = 1;
        if (i3 != 0) {
            if (i3 != 1) {
                i4 = 5;
                i2 = 2;
                if (i3 != 2) {
                    if (i3 == 3) {
                        builder = this.f17907C;
                        key = CaptureRequest.CONTROL_AWB_MODE;
                        i2 = 8;
                    } else if (i3 == 4) {
                        builder = this.f17907C;
                        key = CaptureRequest.CONTROL_AWB_MODE;
                        i = 3;
                        builder.set(key, i);
                        return;
                    } else if (i3 == 5) {
                        builder = this.f17907C;
                        key = CaptureRequest.CONTROL_AWB_MODE;
                    } else {
                        return;
                    }
                }
            } else {
                builder = this.f17907C;
                key = CaptureRequest.CONTROL_AWB_MODE;
                i2 = 6;
            }
            i = Integer.valueOf(i2);
            builder.set(key, i);
            return;
        }
        this.f17907C.set(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(i4));
    }

    /* renamed from: y */
    public void mo19056y() {
        mo19081t0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo19086y0() {
        float floatValue = (this.f17928X * (((Float) this.f17942y.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue() - 1.0f)) + 1.0f;
        Rect rect = (Rect) this.f17942y.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect != null) {
            int width = rect.width();
            int height = rect.height();
            int i = (width - ((int) (((float) width) / floatValue))) / 2;
            int i2 = (height - ((int) (((float) height) / floatValue))) / 2;
            Rect rect2 = new Rect(rect.left + i, rect.top + i2, rect.right - i, rect.bottom - i2);
            if (floatValue != 1.0f) {
                this.f17907C.set(CaptureRequest.SCALER_CROP_REGION, rect2);
            } else {
                this.f17907C.set(CaptureRequest.SCALER_CROP_REGION, this.f17934d0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo19057z() {
        m24647n0();
    }
}
