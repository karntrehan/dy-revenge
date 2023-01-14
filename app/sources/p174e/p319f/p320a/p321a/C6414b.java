package p174e.p319f.p320a.p321a;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaActionSound;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import com.facebook.react.bridge.ReadableMap;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import org.reactnative.camera.p515h.C10989b;
import p027c.p060f.C1802h;
import p174e.p319f.p320a.p321a.C6448f;
import p174e.p319f.p320a.p321a.C6453i;

/* renamed from: e.f.a.a.b */
class C6414b extends C6448f implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener, Camera.PreviewCallback {

    /* renamed from: q */
    private static final C1802h<String> f17849q;

    /* renamed from: r */
    private static final String[] f17850r = {"SM-G532M", "SM-T813", "SM-T819", "SM-T307U", "SM-T713"};

    /* renamed from: s */
    private static final C1802h<String> f17851s;

    /* renamed from: A */
    private final Camera.CameraInfo f17852A = new Camera.CameraInfo();

    /* renamed from: B */
    private MediaRecorder f17853B;

    /* renamed from: C */
    private String f17854C;

    /* renamed from: D */
    private final AtomicBoolean f17855D = new AtomicBoolean(false);

    /* renamed from: E */
    private final C6457k f17856E = new C6457k();
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f17857F = false;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f17858G = true;

    /* renamed from: H */
    private final C6457k f17859H = new C6457k();

    /* renamed from: I */
    private C6455j f17860I;

    /* renamed from: J */
    private C6412a f17861J;

    /* renamed from: K */
    private boolean f17862K;

    /* renamed from: L */
    private int f17863L;

    /* renamed from: M */
    private int f17864M;

    /* renamed from: N */
    private float f17865N;

    /* renamed from: O */
    private int f17866O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public int f17867P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public int f17868Q = 0;

    /* renamed from: R */
    private float f17869R;

    /* renamed from: S */
    private int f17870S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public boolean f17871T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public Boolean f17872U;

    /* renamed from: V */
    private Boolean f17873V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f17874W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public boolean f17875X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public SurfaceTexture f17876Y;

    /* renamed from: t */
    private Handler f17877t = new Handler();

    /* renamed from: u */
    private int f17878u;

    /* renamed from: v */
    private String f17879v = HttpUrl.FRAGMENT_ENCODE_SET;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final AtomicBoolean f17880w = new AtomicBoolean(false);

    /* renamed from: x */
    Camera f17881x;

    /* renamed from: y */
    MediaActionSound f17882y = new MediaActionSound();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public Camera.Parameters f17883z;

    /* renamed from: e.f.a.a.b$a */
    class C6415a implements C6453i.C6454a {

        /* renamed from: e.f.a.a.b$a$a */
        class C6416a implements Runnable {
            C6416a() {
            }

            public void run() {
                C6414b.this.mo19023R();
            }
        }

        /* renamed from: e.f.a.a.b$a$b */
        class C6417b implements Runnable {
            C6417b() {
            }

            public void run() {
                C6414b.this.mo19024S();
            }
        }

        C6415a() {
        }

        /* renamed from: a */
        public void mo19059a() {
            boolean unused = C6414b.this.f17875X = true;
            C6414b bVar = C6414b.this;
            if (bVar.f17881x != null) {
                bVar.f17981p.post(new C6417b());
            }
        }

        /* renamed from: b */
        public void mo19060b() {
            synchronized (C6414b.this) {
                if (!C6414b.this.f17875X) {
                    C6414b.this.m24550Q0();
                } else {
                    C6414b.this.f17981p.post(new C6416a());
                }
            }
        }
    }

    /* renamed from: e.f.a.a.b$b */
    class C6418b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ float f17887f;

        /* renamed from: o */
        final /* synthetic */ float f17888o;

        /* renamed from: e.f.a.a.b$b$a */
        class C6419a implements Camera.AutoFocusCallback {
            C6419a() {
            }

            public void onAutoFocus(boolean z, Camera camera) {
            }
        }

        /* renamed from: e.f.a.a.b$b$b */
        class C6420b implements Camera.AutoFocusCallback {
            C6420b() {
            }

            public void onAutoFocus(boolean z, Camera camera) {
            }
        }

        /* renamed from: e.f.a.a.b$b$c */
        class C6421c implements Camera.AutoFocusCallback {
            C6421c() {
            }

            public void onAutoFocus(boolean z, Camera camera) {
            }
        }

        C6418b(float f, float f2) {
            this.f17887f = f;
            this.f17888o = f2;
        }

        public void run() {
            String str;
            String str2;
            synchronized (C6414b.this) {
                C6414b bVar = C6414b.this;
                if (bVar.f17881x != null) {
                    Camera.Parameters a0 = bVar.f17883z;
                    if (a0 != null) {
                        String focusMode = a0.getFocusMode();
                        Rect b0 = C6414b.this.m24570p0(this.f17887f, this.f17888o);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new Camera.Area(b0, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA));
                        if (a0.getMaxNumFocusAreas() != 0 && focusMode != null && (focusMode.equals("auto") || focusMode.equals("macro") || focusMode.equals("continuous-picture") || focusMode.equals("continuous-video"))) {
                            a0.setFocusMode("auto");
                            a0.setFocusAreas(arrayList);
                            if (a0.getMaxNumMeteringAreas() > 0) {
                                a0.setMeteringAreas(arrayList);
                            }
                            if (a0.getSupportedFocusModes().contains("auto")) {
                                try {
                                    C6414b.this.f17881x.setParameters(a0);
                                } catch (RuntimeException e) {
                                    Log.e("CAMERA_1::", "setParameters failed", e);
                                }
                                try {
                                    C6414b.this.f17881x.autoFocus(new C6419a());
                                } catch (RuntimeException e2) {
                                    e = e2;
                                    str = "CAMERA_1::";
                                    str2 = "autoFocus failed";
                                }
                            } else {
                                return;
                            }
                        } else if (a0.getMaxNumMeteringAreas() <= 0) {
                            try {
                                C6414b.this.f17881x.autoFocus(new C6421c());
                            } catch (RuntimeException e3) {
                                e = e3;
                                str = "CAMERA_1::";
                                str2 = "autoFocus failed";
                            }
                        } else if (a0.getSupportedFocusModes().contains("auto")) {
                            a0.setFocusMode("auto");
                            a0.setFocusAreas(arrayList);
                            a0.setMeteringAreas(arrayList);
                            try {
                                C6414b.this.f17881x.setParameters(a0);
                            } catch (RuntimeException e4) {
                                Log.e("CAMERA_1::", "setParameters failed", e4);
                            }
                            try {
                                C6414b.this.f17881x.autoFocus(new C6420b());
                            } catch (RuntimeException e5) {
                                e = e5;
                                str = "CAMERA_1::";
                                str2 = "autoFocus failed";
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            Log.e(str, str2, e);
        }
    }

    /* renamed from: e.f.a.a.b$c */
    class C6422c implements Runnable {
        C6422c() {
        }

        public void run() {
            synchronized (C6414b.this) {
                C6414b bVar = C6414b.this;
                if (bVar.f17881x != null) {
                    boolean unused = bVar.f17874W = false;
                    C6414b.this.mo19015K0();
                    C6414b.this.mo19040m0();
                    if (C6414b.this.f17858G) {
                        C6414b.this.m24548N0();
                    }
                }
            }
        }
    }

    /* renamed from: e.f.a.a.b$d */
    class C6423d implements Runnable {
        C6423d() {
        }

        public void run() {
            synchronized (this) {
                boolean unused = C6414b.this.f17858G = true;
                C6414b.this.m24548N0();
            }
        }
    }

    /* renamed from: e.f.a.a.b$e */
    class C6424e implements Runnable {
        C6424e() {
        }

        public void run() {
            if (C6414b.this.mo19051u()) {
                C6414b.this.mo19024S();
                C6414b.this.mo19023R();
            }
        }
    }

    /* renamed from: e.f.a.a.b$f */
    class C6425f implements Runnable {
        C6425f() {
        }

        public void run() {
            if (C6414b.this.mo19051u()) {
                C6414b.this.mo19024S();
                C6414b.this.mo19023R();
            }
        }
    }

    /* renamed from: e.f.a.a.b$g */
    class C6426g implements Runnable {
        C6426g() {
        }

        public void run() {
            synchronized (C6414b.this) {
                C6414b bVar = C6414b.this;
                if (bVar.f17881x != null) {
                    bVar.mo19040m0();
                }
            }
        }
    }

    /* renamed from: e.f.a.a.b$h */
    class C6427h implements Runnable {
        C6427h() {
        }

        public void run() {
            synchronized (C6414b.this) {
                C6414b bVar = C6414b.this;
                if (bVar.f17881x != null) {
                    bVar.mo19040m0();
                }
            }
        }
    }

    /* renamed from: e.f.a.a.b$i */
    class C6428i implements Camera.PictureCallback {

        /* renamed from: a */
        final /* synthetic */ ReadableMap f17899a;

        /* renamed from: b */
        final /* synthetic */ int f17900b;

        C6428i(ReadableMap readableMap, int i) {
            this.f17899a = readableMap;
            this.f17900b = i;
        }

        public void onPictureTaken(byte[] bArr, Camera camera) {
            if (C6414b.this.f17872U.booleanValue()) {
                C6414b.this.f17882y.play(0);
            }
            synchronized (C6414b.this) {
                if (C6414b.this.f17881x != null) {
                    if (!this.f17899a.hasKey("pauseAfterCapture") || this.f17899a.getBoolean("pauseAfterCapture")) {
                        try {
                            C6414b.this.f17881x.stopPreview();
                        } catch (Exception e) {
                            Log.e("CAMERA_1::", "camera stopPreview failed", e);
                        }
                        boolean unused = C6414b.this.f17857F = false;
                        C6414b.this.f17881x.setPreviewCallback((Camera.PreviewCallback) null);
                    } else {
                        try {
                            C6414b.this.f17881x.startPreview();
                            boolean unused2 = C6414b.this.f17857F = true;
                            if (C6414b.this.f17871T) {
                                C6414b bVar = C6414b.this;
                                bVar.f17881x.setPreviewCallback(bVar);
                            }
                        } catch (Exception e2) {
                            boolean unused3 = C6414b.this.f17857F = false;
                            C6414b.this.f17881x.setPreviewCallback((Camera.PreviewCallback) null);
                            Log.e("CAMERA_1::", "camera startPreview failed", e2);
                        }
                    }
                }
            }
            C6414b.this.f17880w.set(false);
            int unused4 = C6414b.this.f17868Q = 0;
            C6414b bVar2 = C6414b.this;
            bVar2.f17979f.mo19172a(bArr, bVar2.mo19050t0(bVar2.f17867P), this.f17900b);
            if (C6414b.this.f17874W) {
                C6414b.this.m24550Q0();
            }
        }
    }

    /* renamed from: e.f.a.a.b$j */
    class C6429j implements Runnable {

        /* renamed from: f */
        final /* synthetic */ SurfaceTexture f17902f;

        C6429j(SurfaceTexture surfaceTexture) {
            this.f17902f = surfaceTexture;
        }

        public void run() {
            Camera camera;
            try {
                C6414b bVar = C6414b.this;
                Camera camera2 = bVar.f17881x;
                if (camera2 == null) {
                    SurfaceTexture unused = bVar.f17876Y = this.f17902f;
                    return;
                }
                camera2.stopPreview();
                boolean unused2 = C6414b.this.f17857F = false;
                SurfaceTexture surfaceTexture = this.f17902f;
                if (surfaceTexture == null) {
                    C6414b bVar2 = C6414b.this;
                    camera = bVar2.f17881x;
                    surfaceTexture = (SurfaceTexture) bVar2.f17980o.mo19197g();
                } else {
                    camera = C6414b.this.f17881x;
                }
                camera.setPreviewTexture(surfaceTexture);
                SurfaceTexture unused3 = C6414b.this.f17876Y = this.f17902f;
                C6414b.this.m24548N0();
            } catch (IOException e) {
                Log.e("CAMERA_1::", "setPreviewTexture failed", e);
            }
        }
    }

    static {
        C1802h<String> hVar = new C1802h<>();
        f17849q = hVar;
        hVar.mo6281m(0, "off");
        hVar.mo6281m(1, "on");
        hVar.mo6281m(2, "torch");
        hVar.mo6281m(3, "auto");
        hVar.mo6281m(4, "red-eye");
        C1802h<String> hVar2 = new C1802h<>();
        f17851s = hVar2;
        hVar2.mo6281m(0, "auto");
        hVar2.mo6281m(1, "cloudy-daylight");
        hVar2.mo6281m(2, "daylight");
        hVar2.mo6281m(3, "shade");
        hVar2.mo6281m(4, "fluorescent");
        hVar2.mo6281m(5, "incandescent");
    }

    C6414b(C6448f.C6449a aVar, C6453i iVar, Handler handler) {
        super(aVar, iVar, handler);
        Boolean bool = Boolean.FALSE;
        this.f17872U = bool;
        this.f17873V = bool;
        iVar.mo19202l(new C6415a());
    }

    /* renamed from: A0 */
    private void m24536A0() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f17853B.pause();
        }
    }

    /* renamed from: B0 */
    private void m24537B0() {
        Camera camera = this.f17881x;
        if (camera != null) {
            camera.release();
            this.f17881x = null;
            this.f17979f.mo19173b();
            this.f17880w.set(false);
            this.f17855D.set(false);
        }
    }

    /* renamed from: C0 */
    private void m24538C0() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f17853B.resume();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r0.contains(r4) != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r0.contains(r4) != false) goto L_0x0019;
     */
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m24539D0(boolean r4) {
        /*
            r3 = this;
            r3.f17862K = r4
            boolean r0 = r3.mo19051u()
            r1 = 0
            if (r0 == 0) goto L_0x004b
            android.hardware.Camera$Parameters r0 = r3.f17883z
            java.util.List r0 = r0.getSupportedFocusModes()
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "continuous-picture"
            boolean r2 = r0.contains(r4)
            if (r2 == 0) goto L_0x001f
        L_0x0019:
            android.hardware.Camera$Parameters r0 = r3.f17883z
            r0.setFocusMode(r4)
            goto L_0x0049
        L_0x001f:
            boolean r4 = r3.f17871T
            if (r4 == 0) goto L_0x002c
            java.lang.String r4 = "macro"
            boolean r2 = r0.contains(r4)
            if (r2 == 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            java.lang.String r4 = "fixed"
            boolean r2 = r0.contains(r4)
            if (r2 == 0) goto L_0x0035
            goto L_0x0019
        L_0x0035:
            java.lang.String r4 = "infinity"
            boolean r2 = r0.contains(r4)
            if (r2 == 0) goto L_0x003e
            goto L_0x0019
        L_0x003e:
            android.hardware.Camera$Parameters r4 = r3.f17883z
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r4.setFocusMode(r0)
        L_0x0049:
            r4 = 1
            return r4
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p321a.C6414b.m24539D0(boolean):boolean");
    }

    /* renamed from: E0 */
    private void m24540E0(CamcorderProfile camcorderProfile, boolean z, int i) {
        if (!m24575w0(i)) {
            i = camcorderProfile.videoFrameRate;
        }
        this.f17853B.setOutputFormat(camcorderProfile.fileFormat);
        this.f17853B.setVideoFrameRate(i);
        this.f17853B.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        this.f17853B.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
        this.f17853B.setVideoEncoder(camcorderProfile.videoCodec);
        if (z) {
            this.f17853B.setAudioEncodingBitRate(camcorderProfile.audioBitRate);
            this.f17853B.setAudioChannels(camcorderProfile.audioChannels);
            this.f17853B.setAudioSamplingRate(camcorderProfile.audioSampleRate);
            this.f17853B.setAudioEncoder(camcorderProfile.audioCodec);
        }
    }

    /* renamed from: F0 */
    private boolean m24541F0(float f) {
        int minExposureCompensation;
        int maxExposureCompensation;
        this.f17865N = f;
        int i = 0;
        if (!mo19051u() || (minExposureCompensation = this.f17883z.getMinExposureCompensation()) == (maxExposureCompensation = this.f17883z.getMaxExposureCompensation())) {
            return false;
        }
        float f2 = this.f17865N;
        if (f2 >= 0.0f && f2 <= 1.0f) {
            i = ((int) (f2 * ((float) (maxExposureCompensation - minExposureCompensation)))) + minExposureCompensation;
        }
        this.f17883z.setExposureCompensation(i);
        return true;
    }

    /* renamed from: G0 */
    private boolean m24542G0(int i) {
        if (mo19051u()) {
            List<String> supportedFlashModes = this.f17883z.getSupportedFlashModes();
            C1802h<String> hVar = f17849q;
            String g = hVar.mo6276g(i);
            if (supportedFlashModes == null) {
                return false;
            }
            if (supportedFlashModes.contains(g)) {
                this.f17883z.setFlashMode(g);
                this.f17864M = i;
                return true;
            } else if (supportedFlashModes.contains(hVar.mo6276g(this.f17864M))) {
                return false;
            } else {
                this.f17883z.setFlashMode("off");
                return true;
            }
        } else {
            this.f17864M = i;
            return false;
        }
    }

    /* renamed from: H0 */
    private void m24543H0(boolean z) {
        this.f17872U = Boolean.valueOf(z);
        Camera camera = this.f17881x;
        if (camera != null) {
            try {
                if (!camera.enableShutterSound(false)) {
                    this.f17872U = Boolean.FALSE;
                }
            } catch (Exception e) {
                Log.e("CAMERA_1::", "setPlaySoundInternal failed", e);
                this.f17872U = Boolean.FALSE;
            }
        }
    }

    /* renamed from: I0 */
    private void m24544I0(boolean z) {
        this.f17871T = z;
        if (!mo19051u()) {
            return;
        }
        if (this.f17871T) {
            this.f17881x.setPreviewCallback(this);
        } else {
            this.f17881x.setPreviewCallback((Camera.PreviewCallback) null);
        }
    }

    /* renamed from: J0 */
    private void m24545J0(String str, int i, int i2, boolean z, CamcorderProfile camcorderProfile, int i3) {
        this.f17853B = new MediaRecorder();
        this.f17881x.unlock();
        this.f17853B.setCamera(this.f17881x);
        this.f17853B.setVideoSource(1);
        if (z) {
            this.f17853B.setAudioSource(5);
        }
        this.f17853B.setOutputFile(str);
        this.f17854C = str;
        CamcorderProfile camcorderProfile2 = CamcorderProfile.hasProfile(this.f17878u, camcorderProfile.quality) ? CamcorderProfile.get(this.f17878u, camcorderProfile.quality) : CamcorderProfile.get(this.f17878u, 1);
        camcorderProfile2.videoBitRate = camcorderProfile.videoBitRate;
        m24540E0(camcorderProfile2, z, i3);
        MediaRecorder mediaRecorder = this.f17853B;
        int i4 = this.f17868Q;
        mediaRecorder.setOrientationHint(m24568n0(i4 != 0 ? mo19058z0(i4) : this.f17867P));
        if (i != -1) {
            this.f17853B.setMaxDuration(i);
        }
        if (i2 != -1) {
            this.f17853B.setMaxFileSize((long) i2);
        }
        this.f17853B.setOnInfoListener(this);
        this.f17853B.setOnErrorListener(this);
    }

    /* renamed from: L0 */
    private boolean m24546L0(int i) {
        this.f17870S = i;
        if (!mo19051u()) {
            return false;
        }
        List<String> supportedWhiteBalance = this.f17883z.getSupportedWhiteBalance();
        C1802h<String> hVar = f17851s;
        String g = hVar.mo6276g(i);
        if (supportedWhiteBalance == null || !supportedWhiteBalance.contains(g)) {
            String g2 = hVar.mo6276g(this.f17870S);
            if (supportedWhiteBalance != null && supportedWhiteBalance.contains(g2)) {
                return false;
            }
            this.f17883z.setWhiteBalance("auto");
            return true;
        }
        this.f17883z.setWhiteBalance(g);
        return true;
    }

    /* renamed from: M0 */
    private boolean m24547M0(float f) {
        if (!mo19051u() || !this.f17883z.isZoomSupported()) {
            this.f17869R = f;
            return false;
        }
        this.f17883z.setZoom((int) (((float) this.f17883z.getMaxZoom()) * f));
        this.f17869R = f;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: N0 */
    public void m24548N0() {
        Camera camera;
        if (!this.f17857F && (camera = this.f17881x) != null) {
            try {
                this.f17857F = true;
                camera.startPreview();
                if (this.f17871T) {
                    this.f17881x.setPreviewCallback(this);
                }
            } catch (Exception e) {
                this.f17857F = false;
                Log.e("CAMERA_1::", "startCameraPreview failed", e);
            }
        }
    }

    /* renamed from: O0 */
    private void m24549O0() {
        synchronized (this) {
            MediaRecorder mediaRecorder = this.f17853B;
            if (mediaRecorder != null) {
                try {
                    mediaRecorder.stop();
                } catch (RuntimeException e) {
                    Log.e("CAMERA_1::", "stopMediaRecorder stop failed", e);
                }
                try {
                    this.f17853B.reset();
                    this.f17853B.release();
                } catch (RuntimeException e2) {
                    Log.e("CAMERA_1::", "stopMediaRecorder reset failed", e2);
                }
                this.f17853B = null;
            }
            this.f17979f.mo19174c();
            if (this.f17873V.booleanValue()) {
                this.f17882y.play(3);
            }
            int t0 = mo19050t0(this.f17867P);
            if (this.f17854C != null) {
                if (new File(this.f17854C).exists()) {
                    C6448f.C6449a aVar = this.f17979f;
                    String str = this.f17854C;
                    int i = this.f17868Q;
                    if (i == 0) {
                        i = t0;
                    }
                    aVar.mo19179h(str, i, t0);
                    this.f17854C = null;
                    return;
                }
            }
            C6448f.C6449a aVar2 = this.f17979f;
            int i2 = this.f17868Q;
            if (i2 == 0) {
                i2 = t0;
            }
            aVar2.mo19179h((String) null, i2, t0);
            return;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public void m24550Q0() {
        if (this.f17881x == null) {
            return;
        }
        if (this.f17880w.get() || this.f17855D.get()) {
            this.f17874W = true;
        } else {
            this.f17981p.post(new C6422c());
        }
    }

    /* renamed from: n0 */
    private int m24568n0(int i) {
        Camera.CameraInfo cameraInfo = this.f17852A;
        if (cameraInfo.facing == 0) {
            return (cameraInfo.orientation + i) % 360;
        }
        return ((this.f17852A.orientation + i) + (m24576x0(i) ? 180 : 0)) % 360;
    }

    /* renamed from: o0 */
    private int m24569o0(int i) {
        Camera.CameraInfo cameraInfo = this.f17852A;
        int i2 = cameraInfo.facing;
        int i3 = cameraInfo.orientation;
        return i2 == 1 ? (360 - ((i3 + i) % 360)) % 360 : ((i3 - i) + 360) % 360;
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public Rect m24570p0(float f, float f2) {
        int i = (int) (f * 2000.0f);
        int i2 = (int) (f2 * 2000.0f);
        int i3 = i - 150;
        int i4 = i2 - 150;
        int i5 = i + 150;
        int i6 = i2 + 150;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i5 > 2000) {
            i5 = 2000;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i6 > 2000) {
            i6 = 2000;
        }
        return new Rect(i3 - 1000, i4 - 1000, i5 - 1000, i6 - 1000);
    }

    /* renamed from: q0 */
    private C6412a m24571q0() {
        Iterator<C6412a> it = this.f17856E.mo19221d().iterator();
        C6412a aVar = null;
        while (it.hasNext()) {
            aVar = it.next();
            if (aVar.equals(C6450g.f17982a)) {
                break;
            }
        }
        return aVar;
    }

    /* renamed from: r0 */
    private void m24572r0() {
        String str = this.f17879v;
        if (str == null || str.isEmpty()) {
            try {
                int numberOfCameras = Camera.getNumberOfCameras();
                if (numberOfCameras == 0) {
                    this.f17878u = -1;
                    Log.w("CAMERA_1::", "getNumberOfCameras returned 0. No camera available.");
                    return;
                }
                for (int i = 0; i < numberOfCameras; i++) {
                    Camera.getCameraInfo(i, this.f17852A);
                    if (this.f17852A.facing == this.f17863L) {
                        this.f17878u = i;
                        return;
                    }
                }
                this.f17878u = 0;
                Camera.getCameraInfo(0, this.f17852A);
            } catch (Exception e) {
                Log.e("CAMERA_1::", "chooseCamera failed.", e);
                this.f17878u = -1;
            }
        } else {
            try {
                int parseInt = Integer.parseInt(this.f17879v);
                this.f17878u = parseInt;
                Camera.getCameraInfo(parseInt, this.f17852A);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: s0 */
    private C6455j m24573s0(SortedSet<C6455j> sortedSet) {
        if (!this.f17980o.mo19200j()) {
            return sortedSet.first();
        }
        int i = this.f17980o.mo19199i();
        int c = this.f17980o.mo19193c();
        if (m24576x0(this.f17866O)) {
            int i2 = c;
            c = i;
            i = i2;
        }
        r2 = null;
        for (C6455j jVar : sortedSet) {
            if (i <= jVar.mo19206O() && c <= jVar.mo19205N()) {
                break;
            }
        }
        return jVar;
    }

    /* renamed from: v0 */
    private C6455j m24574v0(int i, int i2, SortedSet<C6455j> sortedSet) {
        if (sortedSet == null || sortedSet.isEmpty()) {
            return null;
        }
        C6455j last = sortedSet.last();
        if (i == 0 || i2 == 0) {
            return last;
        }
        for (C6455j jVar : sortedSet) {
            if (i <= jVar.mo19206O() && i2 <= jVar.mo19205N()) {
                return jVar;
            }
        }
        return last;
    }

    /* renamed from: w0 */
    private boolean m24575w0(int i) {
        boolean z;
        ArrayList<int[]> q = mo19047q();
        int i2 = i * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        Iterator<int[]> it = q.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                int[] next = it.next();
                boolean z2 = i2 >= next[0] && i2 <= next[1];
                boolean z3 = i2 > 0;
                if (z2 && z3) {
                    z = true;
                    continue;
                }
            } else {
                Log.w("CAMERA_1::", "fps (framePerSecond) received an unsupported value and will be ignored.");
                return false;
            }
        } while (!z);
        return true;
    }

    /* renamed from: x0 */
    private boolean m24576x0(int i) {
        return i == 90 || i == 270;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r6.f17881x.release();
        r6.f17881x = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b7, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00af */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m24577y0() {
        /*
            r6 = this;
            android.hardware.Camera r0 = r6.f17881x
            if (r0 == 0) goto L_0x0007
            r6.m24537B0()
        L_0x0007:
            int r0 = r6.f17878u
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L_0x000e
            return r2
        L_0x000e:
            android.hardware.Camera r0 = android.hardware.Camera.open(r0)     // Catch:{ RuntimeException -> 0x00af }
            r6.f17881x = r0     // Catch:{ RuntimeException -> 0x00af }
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ RuntimeException -> 0x00af }
            r6.f17883z = r0     // Catch:{ RuntimeException -> 0x00af }
            e.f.a.a.k r0 = r6.f17856E     // Catch:{ RuntimeException -> 0x00af }
            r0.mo19219b()     // Catch:{ RuntimeException -> 0x00af }
            android.hardware.Camera$Parameters r0 = r6.f17883z     // Catch:{ RuntimeException -> 0x00af }
            java.util.List r0 = r0.getSupportedPreviewSizes()     // Catch:{ RuntimeException -> 0x00af }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RuntimeException -> 0x00af }
        L_0x0029:
            boolean r1 = r0.hasNext()     // Catch:{ RuntimeException -> 0x00af }
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r0.next()     // Catch:{ RuntimeException -> 0x00af }
            android.hardware.Camera$Size r1 = (android.hardware.Camera.Size) r1     // Catch:{ RuntimeException -> 0x00af }
            e.f.a.a.k r3 = r6.f17856E     // Catch:{ RuntimeException -> 0x00af }
            e.f.a.a.j r4 = new e.f.a.a.j     // Catch:{ RuntimeException -> 0x00af }
            int r5 = r1.width     // Catch:{ RuntimeException -> 0x00af }
            int r1 = r1.height     // Catch:{ RuntimeException -> 0x00af }
            r4.<init>(r5, r1)     // Catch:{ RuntimeException -> 0x00af }
            r3.mo19218a(r4)     // Catch:{ RuntimeException -> 0x00af }
            goto L_0x0029
        L_0x0044:
            e.f.a.a.k r0 = r6.f17859H     // Catch:{ RuntimeException -> 0x00af }
            r0.mo19219b()     // Catch:{ RuntimeException -> 0x00af }
            android.hardware.Camera$Parameters r0 = r6.f17883z     // Catch:{ RuntimeException -> 0x00af }
            java.util.List r0 = r0.getSupportedPictureSizes()     // Catch:{ RuntimeException -> 0x00af }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RuntimeException -> 0x00af }
        L_0x0053:
            boolean r1 = r0.hasNext()     // Catch:{ RuntimeException -> 0x00af }
            if (r1 == 0) goto L_0x006e
            java.lang.Object r1 = r0.next()     // Catch:{ RuntimeException -> 0x00af }
            android.hardware.Camera$Size r1 = (android.hardware.Camera.Size) r1     // Catch:{ RuntimeException -> 0x00af }
            e.f.a.a.k r3 = r6.f17859H     // Catch:{ RuntimeException -> 0x00af }
            e.f.a.a.j r4 = new e.f.a.a.j     // Catch:{ RuntimeException -> 0x00af }
            int r5 = r1.width     // Catch:{ RuntimeException -> 0x00af }
            int r1 = r1.height     // Catch:{ RuntimeException -> 0x00af }
            r4.<init>(r5, r1)     // Catch:{ RuntimeException -> 0x00af }
            r3.mo19218a(r4)     // Catch:{ RuntimeException -> 0x00af }
            goto L_0x0053
        L_0x006e:
            e.f.a.a.k r0 = r6.f17856E     // Catch:{ RuntimeException -> 0x00af }
            java.util.Set r0 = r0.mo19221d()     // Catch:{ RuntimeException -> 0x00af }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RuntimeException -> 0x00af }
        L_0x0078:
            boolean r1 = r0.hasNext()     // Catch:{ RuntimeException -> 0x00af }
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r0.next()     // Catch:{ RuntimeException -> 0x00af }
            e.f.a.a.a r1 = (p174e.p319f.p320a.p321a.C6412a) r1     // Catch:{ RuntimeException -> 0x00af }
            e.f.a.a.k r3 = r6.f17859H     // Catch:{ RuntimeException -> 0x00af }
            java.util.SortedSet r3 = r3.mo19223f(r1)     // Catch:{ RuntimeException -> 0x00af }
            if (r3 != 0) goto L_0x0078
            e.f.a.a.k r3 = r6.f17856E     // Catch:{ RuntimeException -> 0x00af }
            r3.mo19222e(r1)     // Catch:{ RuntimeException -> 0x00af }
            goto L_0x0078
        L_0x0092:
            e.f.a.a.a r0 = r6.f17861J     // Catch:{ RuntimeException -> 0x00af }
            if (r0 != 0) goto L_0x009a
            e.f.a.a.a r0 = p174e.p319f.p320a.p321a.C6450g.f17982a     // Catch:{ RuntimeException -> 0x00af }
            r6.f17861J = r0     // Catch:{ RuntimeException -> 0x00af }
        L_0x009a:
            r6.mo19040m0()     // Catch:{ RuntimeException -> 0x00af }
            android.hardware.Camera r0 = r6.f17881x     // Catch:{ RuntimeException -> 0x00af }
            int r1 = r6.f17866O     // Catch:{ RuntimeException -> 0x00af }
            int r1 = r6.m24569o0(r1)     // Catch:{ RuntimeException -> 0x00af }
            r0.setDisplayOrientation(r1)     // Catch:{ RuntimeException -> 0x00af }
            e.f.a.a.f$a r0 = r6.f17979f     // Catch:{ RuntimeException -> 0x00af }
            r0.mo19176e()     // Catch:{ RuntimeException -> 0x00af }
            r0 = 1
            return r0
        L_0x00af:
            android.hardware.Camera r0 = r6.f17881x     // Catch:{ RuntimeException -> 0x00b7 }
            r0.release()     // Catch:{ RuntimeException -> 0x00b7 }
            r0 = 0
            r6.f17881x = r0     // Catch:{ RuntimeException -> 0x00b7 }
        L_0x00b7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p321a.C6414b.m24577y0():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo19004A(C6412a aVar) {
        if (this.f17861J == null || !mo19051u()) {
            this.f17861J = aVar;
            return true;
        } else if (this.f17861J.equals(aVar)) {
            return false;
        } else {
            if (this.f17856E.mo19223f(aVar) == null) {
                Log.w("CAMERA_1::", "setAspectRatio received an unsupported value and will be ignored.");
                return false;
            }
            this.f17861J = aVar;
            this.f17981p.post(new C6427h());
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo19005B(boolean z) {
        if (this.f17862K != z) {
            synchronized (this) {
                if (m24539D0(z)) {
                    try {
                        Camera camera = this.f17881x;
                        if (camera != null) {
                            camera.setParameters(this.f17883z);
                        }
                    } catch (RuntimeException e) {
                        Log.e("CAMERA_1::", "setParameters failed", e);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo19006C(String str) {
        if (!C10989b.m37291a(this.f17879v, str)) {
            this.f17879v = str;
            if (!C10989b.m37291a(str, String.valueOf(this.f17878u))) {
                this.f17981p.post(new C6425f());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo19007D(int i) {
        synchronized (this) {
            if (this.f17867P != i) {
                this.f17867P = i;
                if (mo19051u() && this.f17868Q == 0 && !this.f17855D.get() && !this.f17880w.get()) {
                    try {
                        this.f17883z.setRotation(m24568n0(i));
                        this.f17881x.setParameters(this.f17883z);
                    } catch (RuntimeException e) {
                        Log.e("CAMERA_1::", "setParameters failed", e);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19008E(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f17866O     // Catch:{ all -> 0x003f }
            if (r0 != r4) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            return
        L_0x0007:
            r3.f17866O = r4     // Catch:{ all -> 0x003f }
            boolean r0 = r3.mo19051u()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003d
            boolean r0 = r3.f17857F     // Catch:{ all -> 0x003f }
            r1 = 0
            if (r0 == 0) goto L_0x001c
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x003f }
            r2 = 14
            if (r0 >= r2) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0026
            android.hardware.Camera r2 = r3.f17881x     // Catch:{ all -> 0x003f }
            r2.stopPreview()     // Catch:{ all -> 0x003f }
            r3.f17857F = r1     // Catch:{ all -> 0x003f }
        L_0x0026:
            android.hardware.Camera r1 = r3.f17881x     // Catch:{ RuntimeException -> 0x0030 }
            int r4 = r3.m24569o0(r4)     // Catch:{ RuntimeException -> 0x0030 }
            r1.setDisplayOrientation(r4)     // Catch:{ RuntimeException -> 0x0030 }
            goto L_0x0038
        L_0x0030:
            r4 = move-exception
            java.lang.String r1 = "CAMERA_1::"
            java.lang.String r2 = "setDisplayOrientation failed"
            android.util.Log.e(r1, r2, r4)     // Catch:{ all -> 0x003f }
        L_0x0038:
            if (r0 == 0) goto L_0x003d
            r3.m24548N0()     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p321a.C6414b.mo19008E(int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo19009F(float f) {
        if (f != this.f17865N && m24541F0(f)) {
            try {
                Camera camera = this.f17881x;
                if (camera != null) {
                    camera.setParameters(this.f17883z);
                }
            } catch (RuntimeException e) {
                Log.e("CAMERA_1::", "setParameters failed", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo19010G(int i) {
        if (this.f17863L != i) {
            this.f17863L = i;
            this.f17981p.post(new C6424e());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo19011H(int i) {
        if (i != this.f17864M && m24542G0(i)) {
            try {
                Camera camera = this.f17881x;
                if (camera != null) {
                    camera.setParameters(this.f17883z);
                }
            } catch (RuntimeException e) {
                Log.e("CAMERA_1::", "setParameters failed", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo19012I(float f, float f2) {
        this.f17981p.post(new C6418b(f, f2));
    }

    /* renamed from: J */
    public void mo19013J(float f) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo19014K(C6455j jVar) {
        if (jVar != null || this.f17860I != null) {
            if (jVar == null || !jVar.equals(this.f17860I)) {
                this.f17860I = jVar;
                if (mo19051u()) {
                    this.f17981p.post(new C6426g());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: K0 */
    public void mo19015K0() {
        try {
            this.f17875X = false;
            Camera camera = this.f17881x;
            if (camera != null) {
                SurfaceTexture surfaceTexture = this.f17876Y;
                if (surfaceTexture != null) {
                    camera.setPreviewTexture(surfaceTexture);
                } else if (this.f17980o.mo19194d() == SurfaceHolder.class) {
                    boolean z = this.f17857F && Build.VERSION.SDK_INT < 14;
                    if (z) {
                        this.f17881x.stopPreview();
                        this.f17857F = false;
                    }
                    this.f17881x.setPreviewDisplay(this.f17980o.mo19196f());
                    if (z) {
                        m24548N0();
                    }
                } else {
                    this.f17881x.setPreviewTexture((SurfaceTexture) this.f17980o.mo19197g());
                }
            }
        } catch (Exception e) {
            Log.e("CAMERA_1::", "setUpPreview failed", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo19016L(boolean z) {
        if (z != this.f17872U.booleanValue()) {
            m24543H0(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo19017M(boolean z) {
        this.f17873V = Boolean.valueOf(z);
    }

    /* renamed from: N */
    public void mo19018N(SurfaceTexture surfaceTexture) {
        this.f17981p.post(new C6429j(surfaceTexture));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo19019O(boolean z) {
        if (z != this.f17871T) {
            m24544I0(z);
        }
    }

    /* renamed from: P */
    public void mo19020P(int i) {
        if (i != this.f17870S && m24546L0(i)) {
            try {
                Camera camera = this.f17881x;
                if (camera != null) {
                    camera.setParameters(this.f17883z);
                }
            } catch (RuntimeException e) {
                Log.e("CAMERA_1::", "setParameters failed", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo19021P0(ReadableMap readableMap) {
        if (this.f17855D.get() || !this.f17880w.compareAndSet(false, true)) {
            throw new IllegalStateException("Camera capture failed. Camera is already capturing.");
        }
        try {
            if (readableMap.hasKey("orientation")) {
                if (readableMap.getInt("orientation") != 0) {
                    int i = readableMap.getInt("orientation");
                    this.f17868Q = i;
                    this.f17883z.setRotation(m24568n0(mo19058z0(i)));
                    try {
                        this.f17881x.setParameters(this.f17883z);
                    } catch (RuntimeException e) {
                        Log.e("CAMERA_1::", "setParameters rotation failed", e);
                    }
                }
            }
            int n0 = m24568n0(mo19058z0(this.f17868Q));
            if (n0 == 0 || !mo19052u0()) {
                n0 = 0;
            } else {
                this.f17883z.setRotation(0);
                try {
                    this.f17881x.setParameters(this.f17883z);
                } catch (RuntimeException e2) {
                    Log.e("CAMERA_1::", "setParameters 0 rotation failed", e2);
                }
            }
            if (readableMap.hasKey("quality")) {
                this.f17883z.setJpegQuality((int) (readableMap.getDouble("quality") * 100.0d));
                try {
                    this.f17881x.setParameters(this.f17883z);
                } catch (RuntimeException e3) {
                    Log.e("CAMERA_1::", "setParameters quality failed", e3);
                }
            }
            this.f17881x.takePicture((Camera.ShutterCallback) null, (Camera.PictureCallback) null, (Camera.PictureCallback) null, new C6428i(readableMap, n0));
        } catch (Exception e4) {
            this.f17880w.set(false);
            throw e4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo19022Q(float f) {
        if (f != this.f17869R && m24547M0(f)) {
            try {
                Camera camera = this.f17881x;
                if (camera != null) {
                    camera.setParameters(this.f17883z);
                }
            } catch (RuntimeException e) {
                Log.e("CAMERA_1::", "setParameters failed", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        return true;
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo19023R() {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.m24572r0()     // Catch:{ all -> 0x0026 }
            boolean r0 = r2.m24577y0()     // Catch:{ all -> 0x0026 }
            r1 = 1
            if (r0 != 0) goto L_0x0012
            e.f.a.a.f$a r0 = r2.f17979f     // Catch:{ all -> 0x0026 }
            r0.mo19177f()     // Catch:{ all -> 0x0026 }
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            return r1
        L_0x0012:
            e.f.a.a.i r0 = r2.f17980o     // Catch:{ all -> 0x0026 }
            boolean r0 = r0.mo19200j()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0024
            r2.mo19015K0()     // Catch:{ all -> 0x0026 }
            boolean r0 = r2.f17858G     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0024
            r2.m24548N0()     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            return r1
        L_0x0026:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p321a.C6414b.mo19023R():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo19024S() {
        synchronized (this) {
            MediaRecorder mediaRecorder = this.f17853B;
            if (mediaRecorder != null) {
                try {
                    mediaRecorder.stop();
                } catch (RuntimeException e) {
                    Log.e("CAMERA_1::", "mMediaRecorder.stop() failed", e);
                }
                try {
                    this.f17853B.reset();
                    this.f17853B.release();
                } catch (RuntimeException e2) {
                    Log.e("CAMERA_1::", "mMediaRecorder.release() failed", e2);
                }
                this.f17853B = null;
                if (this.f17855D.get()) {
                    this.f17979f.mo19174c();
                    int t0 = mo19050t0(this.f17867P);
                    C6448f.C6449a aVar = this.f17979f;
                    String str = this.f17854C;
                    int i = this.f17868Q;
                    if (i == 0) {
                        i = t0;
                    }
                    aVar.mo19179h(str, i, t0);
                }
            }
            Camera camera = this.f17881x;
            if (camera != null) {
                this.f17857F = false;
                try {
                    camera.stopPreview();
                    this.f17881x.setPreviewCallback((Camera.PreviewCallback) null);
                } catch (Exception e3) {
                    Log.e("CAMERA_1::", "stop preview cleanup failed", e3);
                }
            }
            m24537B0();
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo19025T() {
        if (this.f17855D.compareAndSet(true, false)) {
            m24549O0();
            Camera camera = this.f17881x;
            if (camera != null) {
                camera.lock();
            }
            if (this.f17874W) {
                m24550Q0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo19026U(ReadableMap readableMap) {
        if (!mo19051u()) {
            throw new IllegalStateException("Camera is not ready. Call start() before takePicture().");
        } else if (this.f17857F) {
            mo19021P0(readableMap);
        } else {
            throw new IllegalStateException("Preview is paused - resume it before taking a picture.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6412a mo19027a() {
        return this.f17861J;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo19028b() {
        if (!mo19051u()) {
            return this.f17862K;
        }
        String focusMode = this.f17883z.getFocusMode();
        return focusMode != null && focusMode.contains("continuous");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public SortedSet<C6455j> mo19029c(C6412a aVar) {
        return this.f17859H.mo19223f(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo19030d() {
        return this.f17879v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public List<Properties> mo19031e() {
        ArrayList arrayList = new ArrayList();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Properties properties = new Properties();
            Camera.getCameraInfo(i, cameraInfo);
            properties.put("id", String.valueOf(i));
            properties.put("type", String.valueOf(cameraInfo.facing));
            arrayList.add(properties);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo19032f() {
        return this.f17852A.orientation;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo19033g() {
        return this.f17865N;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo19034h() {
        return this.f17863L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo19035i() {
        return this.f17864M;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo19036j() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C6455j mo19037k() {
        return this.f17860I;
    }

    /* renamed from: l */
    public boolean mo19038l() {
        return this.f17872U.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo19039m() {
        return this.f17873V.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo19040m0() {
        SortedSet<C6455j> f = this.f17856E.mo19223f(this.f17861J);
        if (f == null) {
            Log.w("CAMERA_1::", "adjustCameraParameters received an unsupported aspect ratio value and will be ignored.");
            C6412a q0 = m24571q0();
            this.f17861J = q0;
            f = this.f17856E.mo19223f(q0);
        }
        C6455j s0 = m24573s0(f);
        C6455j jVar = this.f17860I;
        C6455j v0 = jVar != null ? m24574v0(jVar.mo19206O(), this.f17860I.mo19205N(), this.f17859H.mo19223f(this.f17861J)) : m24574v0(0, 0, this.f17859H.mo19223f(this.f17861J));
        boolean z = this.f17857F;
        if (z) {
            this.f17881x.stopPreview();
            this.f17857F = false;
        }
        this.f17883z.setPreviewSize(s0.mo19206O(), s0.mo19205N());
        this.f17883z.setPictureSize(v0.mo19206O(), v0.mo19205N());
        this.f17883z.setJpegThumbnailSize(0, 0);
        int i = this.f17868Q;
        if (i != 0) {
            this.f17883z.setRotation(m24568n0(mo19058z0(i)));
        } else {
            this.f17883z.setRotation(m24568n0(this.f17867P));
        }
        m24539D0(this.f17862K);
        m24542G0(this.f17864M);
        m24541F0(this.f17865N);
        mo19004A(this.f17861J);
        m24547M0(this.f17869R);
        m24546L0(this.f17870S);
        m24544I0(this.f17871T);
        m24543H0(this.f17872U.booleanValue());
        try {
            this.f17881x.setParameters(this.f17883z);
        } catch (RuntimeException e) {
            Log.e("CAMERA_1::", "setParameters failed", e);
        }
        if (z) {
            m24548N0();
        }
    }

    /* renamed from: n */
    public C6455j mo19041n() {
        Camera.Size previewSize = this.f17883z.getPreviewSize();
        return new C6455j(previewSize.width, previewSize.height);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo19042o() {
        return this.f17871T;
    }

    public void onError(MediaRecorder mediaRecorder, int i, int i2) {
        mo19025T();
    }

    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 800 || i == 801) {
            mo19025T();
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera.Size previewSize = this.f17883z.getPreviewSize();
        this.f17979f.mo19175d(bArr, previewSize.width, previewSize.height, this.f17867P);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public Set<C6412a> mo19046p() {
        C6457k kVar = this.f17856E;
        for (C6412a next : kVar.mo19221d()) {
            if (this.f17859H.mo19223f(next) == null) {
                kVar.mo19222e(next);
            }
        }
        return kVar.mo19221d();
    }

    /* renamed from: q */
    public ArrayList<int[]> mo19047q() {
        return (ArrayList) this.f17883z.getSupportedPreviewFpsRange();
    }

    /* renamed from: s */
    public int mo19048s() {
        return this.f17870S;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public float mo19049t() {
        return this.f17869R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public int mo19050t0(int i) {
        if (i == 90) {
            return 4;
        }
        if (i != 180) {
            return i != 270 ? 1 : 3;
        }
        return 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo19051u() {
        return this.f17881x != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public boolean mo19052u0() {
        return Arrays.asList(f17850r).contains(Build.MODEL);
    }

    /* renamed from: v */
    public void mo19053v() {
        synchronized (this) {
            this.f17857F = false;
            this.f17858G = false;
            Camera camera = this.f17881x;
            if (camera != null) {
                camera.stopPreview();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo19054w() {
        m24536A0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo19055x(String str, int i, int i2, boolean z, CamcorderProfile camcorderProfile, int i3, int i4) {
        int i5 = i3;
        if (!this.f17880w.get() && this.f17855D.compareAndSet(false, true)) {
            if (i5 != 0) {
                this.f17868Q = i5;
            }
            try {
                m24545J0(str, i, i2, z, camcorderProfile, i4);
                this.f17853B.prepare();
                this.f17853B.start();
                try {
                    this.f17881x.setParameters(this.f17883z);
                } catch (Exception e) {
                    Log.e("CAMERA_1::", "Record setParameters failed", e);
                }
                int t0 = mo19050t0(this.f17867P);
                C6448f.C6449a aVar = this.f17979f;
                int i6 = this.f17868Q;
                String str2 = str;
                if (i6 == 0) {
                    i6 = t0;
                }
                aVar.mo19178g(str, i6, t0);
                if (this.f17873V.booleanValue()) {
                    this.f17882y.play(2);
                }
                return true;
            } catch (Exception e2) {
                this.f17855D.set(false);
                Log.e("CAMERA_1::", "Record start failed", e2);
            }
        }
        return false;
    }

    /* renamed from: y */
    public void mo19056y() {
        this.f17981p.post(new C6423d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo19057z() {
        m24538C0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public int mo19058z0(int i) {
        if (i == 2) {
            return 180;
        }
        if (i != 3) {
            return i != 4 ? 0 : 90;
        }
        return 270;
    }
}
