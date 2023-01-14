package com.lwansbrough.RCTCamera;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9657c;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9663i;
import p174e.p319f.p416e.C9665k;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p420s.C9688j;

/* renamed from: com.lwansbrough.RCTCamera.e */
class C5113e extends TextureView implements TextureView.SurfaceTextureListener, Camera.PreviewCallback {

    /* renamed from: f */
    public static volatile boolean f14494f = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f14495o;

    /* renamed from: p */
    private int f14496p;

    /* renamed from: q */
    private SurfaceTexture f14497q;

    /* renamed from: r */
    private int f14498r;

    /* renamed from: s */
    private int f14499s;

    /* renamed from: t */
    private boolean f14500t;

    /* renamed from: u */
    private boolean f14501u;

    /* renamed from: v */
    private Camera f14502v;

    /* renamed from: w */
    private boolean f14503w = false;

    /* renamed from: x */
    private float f14504x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C9663i f14505y = new C9663i();

    /* renamed from: com.lwansbrough.RCTCamera.e$a */
    class C5114a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f14506f;

        C5114a(int i) {
            this.f14506f = i;
        }

        public void run() {
            C5113e.this.mo15638u();
            int unused = C5113e.this.f14495o = this.f14506f;
            C5113e.this.mo15637s();
        }
    }

    /* renamed from: com.lwansbrough.RCTCamera.e$b */
    class C5115b implements Camera.AutoFocusCallback {
        C5115b() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            if (z) {
                camera.cancelAutoFocus();
            }
        }
    }

    /* renamed from: com.lwansbrough.RCTCamera.e$c */
    private class C5116c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private byte[] f14509a;

        /* renamed from: b */
        private final Camera f14510b;

        C5116c(Camera camera, byte[] bArr) {
            this.f14510b = camera;
            this.f14509a = bArr;
        }

        /* renamed from: b */
        private C9668n m19328b(int i, int i2, boolean z) {
            try {
                C9665k kVar = new C9665k(this.f14509a, i, i2, 0, 0, i, i2, false);
                C9668n d = C5113e.this.f14505y.mo24218d(z ? new C9657c(new C9688j(kVar.mo24214e())) : new C9657c(new C9688j(kVar)));
                C5113e.this.f14505y.mo24216a();
                return d;
            } catch (Throwable unused) {
                C5113e.this.f14505y.mo24216a();
                return null;
            }
        }

        /* renamed from: c */
        private C9668n m19329c() {
            Camera.Size previewSize = this.f14510b.getParameters().getPreviewSize();
            int i = previewSize.width;
            int i2 = previewSize.height;
            C9668n b = m19328b(i, i2, false);
            if (b != null) {
                return b;
            }
            C9668n b2 = m19328b(i, i2, true);
            if (b2 != null) {
                return b2;
            }
            m19330d(i, i2);
            int i3 = previewSize.height;
            int i4 = previewSize.width;
            C9668n b3 = m19328b(i3, i4, false);
            return b3 != null ? b3 : m19328b(i3, i4, true);
        }

        /* renamed from: d */
        private void m19330d(int i, int i2) {
            byte[] bArr = new byte[this.f14509a.length];
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = (i3 * i2) + i4;
                    int i6 = (((i4 * i) + i) - i3) - 1;
                    if (i5 >= 0) {
                        byte[] bArr2 = this.f14509a;
                        if (i5 < bArr2.length && i6 >= 0 && i6 < bArr2.length) {
                            bArr[i6] = bArr2[i5];
                        }
                    }
                }
            }
            this.f14509a = bArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            if (isCancelled()) {
                return null;
            }
            try {
                C9668n c = m19329c();
                if (c != null) {
                    ReactApplicationContext reactContextSingleton = RCTCameraModule.getReactContextSingleton();
                    WritableMap createMap = Arguments.createMap();
                    WritableArray createArray = Arguments.createArray();
                    C9670p[] e = c.mo24225e();
                    if (e != null) {
                        for (C9670p pVar : e) {
                            WritableMap createMap2 = Arguments.createMap();
                            createMap2.putString("x", String.valueOf(pVar.mo24230c()));
                            createMap2.putString("y", String.valueOf(pVar.mo24231d()));
                            createArray.pushMap(createMap2);
                        }
                    }
                    createMap.putArray("bounds", createArray);
                    createMap.putString("data", c.mo24226f());
                    createMap.putString("type", c.mo24222b().toString());
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextSingleton.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("CameraBarCodeReadAndroid", createMap);
                    C5113e.this.f14505y.mo24216a();
                    C5113e.f14494f = false;
                    return null;
                }
                throw new Exception();
            } catch (Throwable unused) {
            }
        }
    }

    public C5113e(Context context, int i) {
        super(context);
        setSurfaceTextureListener(this);
        this.f14495o = i;
        m19312i(C5107b.m19270h().mo15586e());
    }

    /* renamed from: c */
    private Activity m19309c() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: e */
    private float m19310e(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    /* renamed from: h */
    private void m19311h(MotionEvent motionEvent, Camera.Parameters parameters) {
        int maxZoom = parameters.getMaxZoom();
        int zoom = parameters.getZoom();
        float e = m19310e(motionEvent);
        float f = this.f14504x;
        if (e > f) {
            if (zoom < maxZoom) {
                zoom++;
            }
        } else if (e < f && zoom > 0) {
            zoom--;
        }
        this.f14504x = e;
        parameters.setZoom(zoom);
        try {
            this.f14502v.setParameters(parameters);
        } catch (RuntimeException e2) {
            Log.e("RCTCameraViewFinder", "setParameters failed", e2);
        }
    }

    /* renamed from: i */
    private void m19312i(List<String> list) {
        EnumMap enumMap = new EnumMap(C9659e.class);
        EnumSet<E> noneOf = EnumSet.noneOf(C9655a.class);
        if (list != null) {
            for (String j : list) {
                C9655a j2 = m19313j(j);
                if (j2 != null) {
                    noneOf.add(j2);
                }
            }
        }
        enumMap.put(C9659e.POSSIBLE_FORMATS, noneOf);
        this.f14505y.mo24219e(enumMap);
    }

    /* renamed from: j */
    private C9655a m19313j(String str) {
        if ("aztec".equals(str)) {
            return C9655a.AZTEC;
        }
        if ("ean13".equals(str)) {
            return C9655a.EAN_13;
        }
        if ("ean8".equals(str)) {
            return C9655a.EAN_8;
        }
        if ("qr".equals(str)) {
            return C9655a.QR_CODE;
        }
        if ("pdf417".equals(str)) {
            return C9655a.PDF_417;
        }
        if ("upce".equals(str)) {
            return C9655a.UPC_E;
        }
        if ("datamatrix".equals(str)) {
            return C9655a.DATA_MATRIX;
        }
        if ("code39".equals(str)) {
            return C9655a.CODE_39;
        }
        if ("code93".equals(str)) {
            return C9655a.CODE_93;
        }
        if ("interleaved2of5".equals(str)) {
            return C9655a.ITF;
        }
        if ("codabar".equals(str)) {
            return C9655a.CODABAR;
        }
        if ("code128".equals(str)) {
            return C9655a.CODE_128;
        }
        if ("maxicode".equals(str)) {
            return C9655a.MAXICODE;
        }
        if ("rss14".equals(str)) {
            return C9655a.RSS_14;
        }
        if ("rssexpanded".equals(str)) {
            return C9655a.RSS_EXPANDED;
        }
        if ("upca".equals(str)) {
            return C9655a.UPC_A;
        }
        if ("upceanextension".equals(str)) {
            return C9655a.UPC_EAN_EXTENSION;
        }
        Log.v("RCTCamera", "Unsupported code.. [" + str + "]");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        android.util.Log.e("RCTCameraViewFinder", "setParameters failed", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r0.printStackTrace();
        m19315t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r6.f14500t = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f1, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070 A[Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075 A[Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e2 A[ExcHandler: Exception (r0v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:6:0x0009] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m19314r() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f14500t     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x00f2
            r0 = 1
            r6.f14500t = r0     // Catch:{ all -> 0x00f4 }
            r1 = 0
            com.lwansbrough.RCTCamera.b r2 = com.lwansbrough.RCTCamera.C5107b.m19270h()     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            int r3 = r6.f14495o     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            android.hardware.Camera r2 = r2.mo15583a(r3)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            r6.f14502v = r2     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            android.hardware.Camera$Parameters r2 = r2.getParameters()     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            int r3 = r6.f14496p     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            if (r3 != 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            if (r3 != r0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r4 != 0) goto L_0x0042
            if (r0 == 0) goto L_0x0029
            goto L_0x0042
        L_0x0029:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            r2.<init>()     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            java.lang.String r3 = "Unsupported capture mode:"
            r2.append(r3)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            int r3 = r6.f14496p     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            r2.append(r3)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            java.lang.String r2 = r2.toString()     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            r0.<init>(r2)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            throw r0     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
        L_0x0042:
            java.util.List r3 = r2.getSupportedFocusModes()     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            if (r4 == 0) goto L_0x0056
            java.lang.String r5 = "continuous-picture"
            boolean r5 = r3.contains(r5)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            if (r5 == 0) goto L_0x0056
            java.lang.String r3 = "continuous-picture"
        L_0x0052:
            r2.setFocusMode(r3)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            goto L_0x006e
        L_0x0056:
            if (r0 == 0) goto L_0x0063
            java.lang.String r5 = "continuous-video"
            boolean r5 = r3.contains(r5)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            if (r5 == 0) goto L_0x0063
            java.lang.String r3 = "continuous-video"
            goto L_0x0052
        L_0x0063:
            java.lang.String r5 = "auto"
            boolean r3 = r3.contains(r5)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            if (r3 == 0) goto L_0x006e
            java.lang.String r3 = "auto"
            goto L_0x0052
        L_0x006e:
            if (r4 == 0) goto L_0x0075
            java.util.List r0 = r2.getSupportedPictureSizes()     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            goto L_0x0081
        L_0x0075:
            if (r0 == 0) goto L_0x00c7
            com.lwansbrough.RCTCamera.b r0 = com.lwansbrough.RCTCamera.C5107b.m19270h()     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            android.hardware.Camera r3 = r6.f14502v     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            java.util.List r0 = r0.mo15593o(r3)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
        L_0x0081:
            com.lwansbrough.RCTCamera.b r3 = com.lwansbrough.RCTCamera.C5107b.m19270h()     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            android.hardware.Camera$Size r0 = r3.mo15587f(r0, r4, r4)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            int r3 = r0.width     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            int r0 = r0.height     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            r2.setPictureSize(r3, r0)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            android.hardware.Camera r0 = r6.f14502v     // Catch:{ RuntimeException -> 0x0099, Exception -> 0x00e2 }
            r0.setParameters(r2)     // Catch:{ RuntimeException -> 0x0099, Exception -> 0x00e2 }
            goto L_0x00a1
        L_0x0099:
            r0 = move-exception
            java.lang.String r2 = "RCTCameraViewFinder"
            java.lang.String r3 = "setParameters failed"
            android.util.Log.e(r2, r3, r0)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
        L_0x00a1:
            android.hardware.Camera r0 = r6.f14502v     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            android.graphics.SurfaceTexture r2 = r6.f14497q     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            r0.setPreviewTexture(r2)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            android.hardware.Camera r0 = r6.f14502v     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            r0.startPreview()     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            boolean r0 = r6.f14503w     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            if (r0 == 0) goto L_0x00bf
            android.app.Activity r0 = r6.m19309c()     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            if (r0 == 0) goto L_0x00bf
            android.view.Window r0 = r0.getWindow()     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            r2 = 0
            r0.setBackgroundDrawable(r2)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
        L_0x00bf:
            android.hardware.Camera r0 = r6.f14502v     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            r0.setPreviewCallback(r6)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
        L_0x00c4:
            r6.f14500t = r1     // Catch:{ all -> 0x00f4 }
            goto L_0x00f2
        L_0x00c7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            r2.<init>()     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            java.lang.String r3 = "Unsupported capture mode:"
            r2.append(r3)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            int r3 = r6.f14496p     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            r2.append(r3)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            java.lang.String r2 = r2.toString()     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            r0.<init>(r2)     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
            throw r0     // Catch:{ NullPointerException -> 0x00ea, Exception -> 0x00e2 }
        L_0x00e0:
            r0 = move-exception
            goto L_0x00ef
        L_0x00e2:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x00e0 }
            r6.m19315t()     // Catch:{ all -> 0x00e0 }
            goto L_0x00c4
        L_0x00ea:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x00e0 }
            goto L_0x00c4
        L_0x00ef:
            r6.f14500t = r1     // Catch:{ all -> 0x00f4 }
            throw r0     // Catch:{ all -> 0x00f4 }
        L_0x00f2:
            monitor-exit(r6)
            return
        L_0x00f4:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lwansbrough.RCTCamera.C5113e.m19314r():void");
    }

    /* renamed from: t */
    private synchronized void m19315t() {
        if (!this.f14501u) {
            this.f14501u = true;
            try {
                Camera camera = this.f14502v;
                if (camera != null) {
                    camera.stopPreview();
                    this.f14502v.setPreviewCallback((Camera.PreviewCallback) null);
                    C5107b.m19270h().mo15595q(this.f14495o);
                    this.f14502v = null;
                }
            } catch (Exception e) {
                try {
                    e.printStackTrace();
                } catch (Throwable th) {
                    this.f14501u = false;
                    throw th;
                }
            }
            this.f14501u = false;
        }
    }

    /* renamed from: d */
    public int mo15621d() {
        return this.f14495o;
    }

    /* renamed from: f */
    public double mo15622f() {
        return (double) (((float) C5107b.m19270h().mo15592m(this.f14495o)) / ((float) C5107b.m19270h().mo15589j(this.f14495o)));
    }

    /* renamed from: g */
    public void mo15623g(MotionEvent motionEvent, Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null && supportedFocusModes.contains("auto") && parameters.getMaxNumFocusAreas() != 0) {
            this.f14502v.cancelAutoFocus();
            try {
                Camera.Area a = C5110c.m19297a(motionEvent, this.f14498r, this.f14499s);
                parameters.setFocusMode("auto");
                ArrayList arrayList = new ArrayList();
                arrayList.add(a);
                parameters.setFocusAreas(arrayList);
                if (parameters.getMaxNumMeteringAreas() > 0) {
                    parameters.setMeteringAreas(arrayList);
                }
                try {
                    this.f14502v.setParameters(parameters);
                } catch (RuntimeException e) {
                    Log.e("RCTCameraViewFinder", "setParameters failed", e);
                }
                try {
                    this.f14502v.autoFocus(new C5115b());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (RuntimeException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: k */
    public void mo15624k(int i) {
        if (this.f14495o != i) {
            new Thread(new C5114a(i)).start();
        }
    }

    /* renamed from: l */
    public void mo15625l(int i) {
        C5107b.m19270h().mo15600v(this.f14495o, i);
        this.f14496p = i;
    }

    /* renamed from: m */
    public void mo15626m(String str) {
        C5107b.m19270h().mo15601w(this.f14495o, str);
    }

    /* renamed from: n */
    public void mo15627n(boolean z) {
        this.f14503w = z;
    }

    /* renamed from: o */
    public void mo15628o(int i) {
        C5107b.m19270h().mo15603y(this.f14495o, i);
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (C5107b.m19270h().mo15594p() && !f14494f) {
            f14494f = true;
            new C5116c(camera, bArr).execute(new Void[0]);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f14497q = surfaceTexture;
        this.f14498r = i;
        this.f14499s = i2;
        m19314r();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f14497q = null;
        this.f14498r = 0;
        this.f14499s = 0;
        m19315t();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f14498r = i;
        this.f14499s = i2;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Camera camera = this.f14502v;
        if (camera == null) {
            return false;
        }
        Camera.Parameters parameters = camera.getParameters();
        int action = motionEvent.getAction();
        if (motionEvent.getPointerCount() > 1) {
            if (action == 5) {
                this.f14504x = m19310e(motionEvent);
            } else if (action == 2 && parameters.isZoomSupported()) {
                this.f14502v.cancelAutoFocus();
                m19311h(motionEvent, parameters);
            }
        } else if (action == 1) {
            mo15623g(motionEvent, parameters);
        }
        return true;
    }

    /* renamed from: p */
    public void mo15635p(int i) {
        C5107b.m19270h().mo15581B(this.f14495o, i);
    }

    /* renamed from: q */
    public void mo15636q(int i) {
        C5107b.m19270h().mo15582C(this.f14495o, i);
    }

    /* renamed from: s */
    public void mo15637s() {
        if (this.f14497q != null) {
            m19314r();
        }
    }

    /* renamed from: u */
    public void mo15638u() {
        if (this.f14502v != null) {
            m19315t();
        }
    }
}
