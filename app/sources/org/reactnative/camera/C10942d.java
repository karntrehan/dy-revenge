package org.reactnative.camera;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.CamcorderProfile;
import android.os.AsyncTask;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.core.content.C1135a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3031o0;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.reactnative.camera.p514g.C10977a;
import org.reactnative.camera.p514g.C10978b;
import org.reactnative.camera.p514g.C10979c;
import org.reactnative.camera.p514g.C10980d;
import org.reactnative.camera.p514g.C10981e;
import org.reactnative.camera.p514g.C10982f;
import org.reactnative.camera.p514g.C10983g;
import org.reactnative.camera.p514g.C10984h;
import org.reactnative.camera.p514g.C10986i;
import org.reactnative.camera.p514g.C10987j;
import org.reactnative.camera.p515h.C10990c;
import org.reactnative.facedetector.C10997b;
import p174e.p319f.p320a.p321a.C6442e;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9663i;
import p174e.p319f.p416e.C9668n;
import p497j.p502b.p503a.C10677b;

/* renamed from: org.reactnative.camera.d */
public class C10942d extends C6442e implements LifecycleEventListener, C10978b, C10982f, C10980d, C10987j, C10983g {

    /* renamed from: A */
    private boolean f28622A = false;

    /* renamed from: B */
    private ScaleGestureDetector f28623B;

    /* renamed from: C */
    private GestureDetector f28624C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f28625D = false;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f28626E = true;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f28627F = false;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public Boolean f28628G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public Boolean f28629H;

    /* renamed from: I */
    private boolean f28630I;

    /* renamed from: J */
    public volatile boolean f28631J;

    /* renamed from: K */
    public volatile boolean f28632K;

    /* renamed from: L */
    public volatile boolean f28633L;

    /* renamed from: M */
    public volatile boolean f28634M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C9663i f28635N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C10997b f28636O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C10677b f28637P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public boolean f28638Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public boolean f28639R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public boolean f28640S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public boolean f28641T;

    /* renamed from: U */
    private boolean f28642U;

    /* renamed from: V */
    private int f28643V;

    /* renamed from: W */
    private int f28644W;

    /* renamed from: a0 */
    private int f28645a0;

    /* renamed from: b0 */
    private int f28646b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public int f28647c0;

    /* renamed from: d0 */
    private boolean f28648d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public int f28649e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public int f28650f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public boolean f28651g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public float f28652h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public float f28653i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public float f28654j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public float f28655k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public int f28656l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public int f28657m0;

    /* renamed from: n0 */
    private GestureDetector.SimpleOnGestureListener f28658n0;

    /* renamed from: o0 */
    private ScaleGestureDetector.OnScaleGestureListener f28659o0;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C3031o0 f28660u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Queue<Promise> f28661v = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public Map<Promise, ReadableMap> f28662w = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public Map<Promise, File> f28663x = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public Promise f28664y;

    /* renamed from: z */
    private List<String> f28665z = null;

    /* renamed from: org.reactnative.camera.d$a */
    class C10943a extends C6442e.C6444b {
        C10943a() {
        }

        /* renamed from: b */
        public void mo19165b(C6442e eVar) {
            C10950e.m37160e(eVar);
        }

        /* renamed from: c */
        public void mo19166c(C6442e eVar, byte[] bArr, int i, int i2, int i3) {
            C6442e eVar2 = eVar;
            byte[] bArr2 = bArr;
            int q = C10950e.m37172q(i3, C10942d.this.getFacing(), C10942d.this.getCameraOrientation());
            boolean z = C10942d.this.f28640S && !C10942d.this.f28631J && (eVar2 instanceof C10978b);
            boolean z2 = C10942d.this.f28638Q && !C10942d.this.f28632K && (eVar2 instanceof C10982f);
            boolean z3 = C10942d.this.f28639R && !C10942d.this.f28633L && (eVar2 instanceof C10980d);
            boolean z4 = C10942d.this.f28641T && !C10942d.this.f28634M && (eVar2 instanceof C10987j);
            if ((z || z2 || z3 || z4) && ((double) bArr2.length) >= ((double) i) * 1.5d * ((double) i2)) {
                if (z) {
                    C10942d.this.f28631J = true;
                    C10977a aVar = r2;
                    C10977a aVar2 = new C10977a((C10978b) eVar2, C10942d.this.f28635N, bArr, i, i2, C10942d.this.f28651g0, C10942d.this.f28652h0, C10942d.this.f28653i0, C10942d.this.f28654j0, C10942d.this.f28655k0, C10942d.this.f28656l0, C10942d.this.f28657m0, C10942d.this.getAspectRatio().mo18992U());
                    aVar.execute(new Void[0]);
                }
                if (z2) {
                    C10942d.this.f28632K = true;
                    new C10981e((C10982f) eVar, C10942d.this.f28636O, bArr, i, i2, q, C10942d.this.getResources().getDisplayMetrics().density, C10942d.this.getFacing(), C10942d.this.getWidth(), C10942d.this.getHeight(), C10942d.this.f28649e0, C10942d.this.f28650f0).execute(new Void[0]);
                }
                if (z3) {
                    C10942d.this.f28633L = true;
                    if (C10942d.this.f28647c0 == C10677b.f28155a) {
                        boolean unused = C10942d.this.f28627F = false;
                    } else if (C10942d.this.f28647c0 == C10677b.f28156b) {
                        C10942d dVar = C10942d.this;
                        boolean unused2 = dVar.f28627F = !dVar.f28627F;
                    } else if (C10942d.this.f28647c0 == C10677b.f28157c) {
                        boolean unused3 = C10942d.this.f28627F = true;
                    }
                    byte[] bArr3 = bArr;
                    if (C10942d.this.f28627F) {
                        for (int i4 = 0; i4 < bArr3.length; i4++) {
                            bArr3[i4] = (byte) (~bArr3[i4]);
                        }
                    }
                    new C10979c((C10980d) eVar, C10942d.this.f28637P, bArr, i, i2, q, C10942d.this.getResources().getDisplayMetrics().density, C10942d.this.getFacing(), C10942d.this.getWidth(), C10942d.this.getHeight(), C10942d.this.f28649e0, C10942d.this.f28650f0).execute(new Void[0]);
                }
                if (z4) {
                    C10942d.this.f28634M = true;
                    new C10986i((C10987j) eVar, C10942d.this.f28660u, bArr, i, i2, q, C10942d.this.getResources().getDisplayMetrics().density, C10942d.this.getFacing(), C10942d.this.getWidth(), C10942d.this.getHeight(), C10942d.this.f28649e0, C10942d.this.f28650f0).execute(new Void[0]);
                }
            }
        }

        /* renamed from: d */
        public void mo19167d(C6442e eVar) {
            C10950e.m37163h(eVar, "Camera view threw an error - component could not be rendered.");
        }

        /* renamed from: e */
        public void mo19168e(C6442e eVar, byte[] bArr, int i, int i2) {
            Promise promise = (Promise) C10942d.this.f28661v.poll();
            ReadableMap readableMap = (ReadableMap) C10942d.this.f28662w.remove(promise);
            if (readableMap.hasKey("fastMode") && readableMap.getBoolean("fastMode")) {
                promise.resolve((Object) null);
            }
            File file = (File) C10942d.this.f28663x.remove(promise);
            if (Build.VERSION.SDK_INT >= 11) {
                new C10984h(bArr, promise, readableMap, file, i, i2, C10942d.this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                new C10984h(bArr, promise, readableMap, file, i, i2, C10942d.this).execute(new Void[0]);
            }
            C10950e.m37165j(eVar);
        }

        /* renamed from: f */
        public void mo19169f(C6442e eVar) {
            C10950e.m37166k(eVar);
        }

        /* renamed from: g */
        public void mo19170g(C6442e eVar, String str, int i, int i2) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("videoOrientation", i);
            createMap.putInt("deviceOrientation", i2);
            createMap.putString("uri", C10990c.m37294c(new File(str)).toString());
            C10950e.m37167l(eVar, createMap);
        }

        /* renamed from: h */
        public void mo19171h(C6442e eVar, String str, int i, int i2) {
            if (C10942d.this.f28664y != null) {
                if (str != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("isRecordingInterrupted", C10942d.this.f28629H.booleanValue());
                    createMap.putInt("videoOrientation", i);
                    createMap.putInt("deviceOrientation", i2);
                    createMap.putString("uri", C10990c.m37294c(new File(str)).toString());
                    C10942d.this.f28664y.resolve(createMap);
                } else {
                    C10942d.this.f28664y.reject("E_RECORDING", "Couldn't stop recording - there is none in progress");
                }
                C10942d dVar = C10942d.this;
                Boolean bool = Boolean.FALSE;
                Boolean unused = dVar.f28628G = bool;
                Boolean unused2 = C10942d.this.f28629H = bool;
                Promise unused3 = C10942d.this.f28664y = null;
            }
        }
    }

    /* renamed from: org.reactnative.camera.d$b */
    class C10944b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Promise f28667f;

        /* renamed from: o */
        final /* synthetic */ ReadableMap f28668o;

        /* renamed from: p */
        final /* synthetic */ File f28669p;

        C10944b(Promise promise, ReadableMap readableMap, File file) {
            this.f28667f = promise;
            this.f28668o = readableMap;
            this.f28669p = file;
        }

        public void run() {
            C10942d.this.f28661v.add(this.f28667f);
            C10942d.this.f28662w.put(this.f28667f, this.f28668o);
            C10942d.this.f28663x.put(this.f28667f, this.f28669p);
            try {
                C10942d.super.mo19162z(this.f28668o);
            } catch (Exception e) {
                C10942d.this.f28661v.remove(this.f28667f);
                C10942d.this.f28662w.remove(this.f28667f);
                C10942d.this.f28663x.remove(this.f28667f);
                this.f28667f.reject("E_TAKE_PICTURE_FAILED", e.getMessage());
            }
        }
    }

    /* renamed from: org.reactnative.camera.d$c */
    class C10945c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ReadableMap f28671f;

        /* renamed from: o */
        final /* synthetic */ File f28672o;

        /* renamed from: p */
        final /* synthetic */ Promise f28673p;

        C10945c(ReadableMap readableMap, File file, Promise promise) {
            this.f28671f = readableMap;
            this.f28672o = file;
            this.f28673p = promise;
        }

        public void run() {
            try {
                String string = this.f28671f.hasKey("path") ? this.f28671f.getString("path") : C10990c.m37293b(this.f28672o, ".mp4");
                int i = this.f28671f.hasKey("maxDuration") ? this.f28671f.getInt("maxDuration") : -1;
                int i2 = this.f28671f.hasKey("maxFileSize") ? this.f28671f.getInt("maxFileSize") : -1;
                int i3 = this.f28671f.hasKey("fps") ? this.f28671f.getInt("fps") : -1;
                CamcorderProfile o = this.f28671f.hasKey("quality") ? C10950e.m37170o(this.f28671f.getInt("quality")) : CamcorderProfile.get(1);
                if (this.f28671f.hasKey("videoBitrate")) {
                    o.videoBitRate = this.f28671f.getInt("videoBitrate");
                }
                if (C10942d.super.mo19139s(string, i * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, i2, this.f28671f.hasKey("mute") ? !this.f28671f.getBoolean("mute") : true, o, this.f28671f.hasKey("orientation") ? this.f28671f.getInt("orientation") : 0, i3)) {
                    Boolean unused = C10942d.this.f28628G = Boolean.TRUE;
                    Promise unused2 = C10942d.this.f28664y = this.f28673p;
                    return;
                }
                this.f28673p.reject("E_RECORDING_FAILED", "Starting video recording failed. Another recording might be in progress.");
            } catch (IOException unused3) {
                this.f28673p.reject("E_RECORDING_FAILED", "Starting video recording failed - could not create video file.");
            }
        }
    }

    /* renamed from: org.reactnative.camera.d$d */
    class C10946d implements Runnable {
        C10946d() {
        }

        public void run() {
            if ((C10942d.this.f28625D && !C10942d.this.mo19136p()) || C10942d.this.f28626E) {
                boolean unused = C10942d.this.f28625D = false;
                boolean unused2 = C10942d.this.f28626E = false;
                C10942d.this.mo19159w();
            }
        }
    }

    /* renamed from: org.reactnative.camera.d$e */
    class C10947e implements Runnable {
        C10947e() {
        }

        public void run() {
            C10942d.this.mo19160x();
            C10942d.this.mo19129m();
        }
    }

    /* renamed from: org.reactnative.camera.d$f */
    class C10948f extends GestureDetector.SimpleOnGestureListener {
        C10948f() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            C10942d dVar = C10942d.this;
            C10950e.m37169n(dVar, true, dVar.m37131o0(motionEvent.getX()), C10942d.this.m37131o0(motionEvent.getY()));
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            C10942d dVar = C10942d.this;
            C10950e.m37169n(dVar, false, dVar.m37131o0(motionEvent.getX()), C10942d.this.m37131o0(motionEvent.getY()));
            return true;
        }
    }

    /* renamed from: org.reactnative.camera.d$g */
    class C10949g implements ScaleGestureDetector.OnScaleGestureListener {
        C10949g() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C10942d.this.m37130m0(scaleGestureDetector.getScaleFactor());
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C10942d.this.m37130m0(scaleGestureDetector.getScaleFactor());
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public C10942d(C3031o0 o0Var) {
        super(o0Var, true);
        Boolean bool = Boolean.FALSE;
        this.f28628G = bool;
        this.f28629H = bool;
        this.f28630I = false;
        this.f28631J = false;
        this.f28632K = false;
        this.f28633L = false;
        this.f28634M = false;
        this.f28638Q = false;
        this.f28639R = false;
        this.f28640S = false;
        this.f28641T = false;
        this.f28642U = false;
        this.f28643V = C10997b.f28822f;
        this.f28644W = C10997b.f28820d;
        this.f28645a0 = C10997b.f28818b;
        this.f28646b0 = C10677b.f28158d;
        this.f28647c0 = C10677b.f28155a;
        this.f28648d0 = true;
        this.f28651g0 = false;
        this.f28652h0 = 0.0f;
        this.f28653i0 = 0.0f;
        this.f28654j0 = 0.0f;
        this.f28655k0 = 0.0f;
        this.f28656l0 = 0;
        this.f28657m0 = 0;
        this.f28658n0 = new C10948f();
        this.f28659o0 = new C10949g();
        this.f28660u = o0Var;
        o0Var.addLifecycleEventListener(this);
        mo19128l(new C10943a());
    }

    /* renamed from: k0 */
    private boolean m37128k0() {
        return Build.VERSION.SDK_INT < 23 || C1135a.m4415a(getContext(), "android.permission.CAMERA") == 0;
    }

    /* renamed from: l0 */
    private void m37129l0() {
        this.f28635N = new C9663i();
        EnumMap enumMap = new EnumMap(C9659e.class);
        EnumSet<E> noneOf = EnumSet.noneOf(C9655a.class);
        List<String> list = this.f28665z;
        if (list != null) {
            for (String str : list) {
                String str2 = (String) CameraModule.VALID_BARCODE_TYPES.get(str);
                if (str2 != null) {
                    noneOf.add(C9655a.valueOf(str2));
                }
            }
        }
        enumMap.put(C9659e.POSSIBLE_FORMATS, noneOf);
        this.f28635N.mo24219e(enumMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m37130m0(float f) {
        float zoom = getZoom();
        float f2 = (f - 1.0f) + zoom;
        setZoom(f2 > zoom ? Math.min(f2, 1.0f) : Math.max(f2, 0.0f));
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public int m37131o0(float f) {
        Resources resources = getResources();
        resources.getConfiguration();
        return (int) (f / resources.getDisplayMetrics().density);
    }

    /* renamed from: r0 */
    private void m37132r0() {
        C10677b bVar = new C10677b(this.f28660u);
        this.f28637P = bVar;
        bVar.mo26602f(this.f28646b0);
    }

    /* renamed from: s0 */
    private void m37133s0() {
        C10997b bVar = new C10997b(this.f28660u);
        this.f28636O = bVar;
        bVar.mo29011h(this.f28643V);
        this.f28636O.mo29010g(this.f28644W);
        this.f28636O.mo29009f(this.f28645a0);
        this.f28636O.mo29012i(this.f28648d0);
    }

    /* renamed from: a */
    public void mo28923a(WritableArray writableArray, int i, int i2, byte[] bArr) {
        byte[] bArr2;
        if (this.f28639R) {
            if (this.f28622A) {
                try {
                    YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, (int[]) null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
                    bArr2 = byteArrayOutputStream.toByteArray();
                } catch (Exception e) {
                    throw new RuntimeException(String.format("Error decoding imageData from NV21 format (%d bytes)", new Object[]{Integer.valueOf(bArr.length)}), e);
                }
            } else {
                bArr2 = null;
            }
            C10950e.m37159d(this, writableArray, bArr2);
        }
    }

    /* renamed from: b */
    public void mo28924b(C10997b bVar) {
        if (this.f28638Q) {
            C10950e.m37161f(this, bVar);
        }
    }

    /* renamed from: c */
    public void mo28925c(WritableArray writableArray) {
        if (this.f28638Q) {
            C10950e.m37162g(this, writableArray);
        }
    }

    /* renamed from: d */
    public void mo28926d(C9668n nVar, int i, int i2, byte[] bArr) {
        byte[] bArr2;
        String str = nVar.mo24222b().toString();
        if (this.f28640S && this.f28665z.contains(str)) {
            if (this.f28622A) {
                try {
                    YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, (int[]) null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
                    bArr2 = byteArrayOutputStream.toByteArray();
                } catch (Exception e) {
                    throw new RuntimeException(String.format("Error decoding imageData from NV21 format (%d bytes)", new Object[]{Integer.valueOf(bArr.length)}), e);
                }
            } else {
                bArr2 = null;
            }
            C10950e.m37157b(this, nVar, i, i2, bArr2);
        }
    }

    /* renamed from: e */
    public void mo28927e(C10677b bVar) {
        if (this.f28639R) {
            C10950e.m37158c(this, bVar);
        }
    }

    /* renamed from: f */
    public void mo28928f() {
        this.f28634M = false;
    }

    /* renamed from: g */
    public void mo28929g() {
        this.f28631J = false;
        C9663i iVar = this.f28635N;
        if (iVar != null) {
            iVar.mo24216a();
        }
    }

    /* renamed from: h */
    public void mo28930h(WritableMap writableMap) {
        C10950e.m37164i(this, writableMap);
    }

    /* renamed from: i */
    public void mo28931i() {
        this.f28632K = false;
    }

    /* renamed from: j */
    public void mo28932j(WritableArray writableArray) {
        if (this.f28641T) {
            C10950e.m37168m(this, writableArray);
        }
    }

    /* renamed from: k */
    public void mo28933k() {
        this.f28633L = false;
    }

    /* renamed from: n0 */
    public void mo28934n0(ReadableMap readableMap, Promise promise, File file) {
        this.f17961t.post(new C10945c(readableMap, file, promise));
    }

    public void onHostDestroy() {
        C10997b bVar = this.f28636O;
        if (bVar != null) {
            bVar.mo29008d();
        }
        C10677b bVar2 = this.f28637P;
        if (bVar2 != null) {
            bVar2.mo26601d();
        }
        this.f28635N = null;
        this.f28660u.removeLifecycleEventListener(this);
        this.f17961t.post(new C10947e());
    }

    public void onHostPause() {
        if (this.f28628G.booleanValue()) {
            this.f28629H = Boolean.TRUE;
        }
        if (!this.f28625D && mo19136p()) {
            this.f28625D = true;
            mo19160x();
        }
    }

    public void onHostResume() {
        if (m37128k0()) {
            this.f17961t.post(new C10946d());
        } else {
            C10950e.m37163h(this, "Camera permissions not granted - component could not be rendered.");
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        View view = getView();
        if (view != null) {
            float f = (float) (i3 - i);
            float f2 = (float) (i4 - i2);
            float U = getAspectRatio().mo18992U();
            int i7 = getResources().getConfiguration().orientation;
            setBackgroundColor(-16777216);
            if (i7 == 2) {
                float f3 = U * f2;
                if (f3 < f) {
                    i6 = (int) (f / U);
                } else {
                    i5 = (int) f3;
                    i6 = (int) f2;
                    int i8 = (int) ((f - ((float) i5)) / 2.0f);
                    int i9 = (int) ((f2 - ((float) i6)) / 2.0f);
                    this.f28649e0 = i8;
                    this.f28650f0 = i9;
                    view.layout(i8, i9, i5 + i8, i6 + i9);
                }
            } else {
                float f4 = U * f;
                if (f4 > f2) {
                    i6 = (int) f4;
                } else {
                    i5 = (int) (f2 / U);
                    i6 = (int) f2;
                    int i82 = (int) ((f - ((float) i5)) / 2.0f);
                    int i92 = (int) ((f2 - ((float) i6)) / 2.0f);
                    this.f28649e0 = i82;
                    this.f28650f0 = i92;
                    view.layout(i82, i92, i5 + i82, i6 + i92);
                }
            }
            i5 = (int) f;
            int i822 = (int) ((f - ((float) i5)) / 2.0f);
            int i922 = (int) ((f2 - ((float) i6)) / 2.0f);
            this.f28649e0 = i822;
            this.f28650f0 = i922;
            view.layout(i822, i922, i5 + i822, i6 + i922);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f28630I) {
            this.f28623B.onTouchEvent(motionEvent);
        }
        if (!this.f28642U) {
            return true;
        }
        this.f28624C.onTouchEvent(motionEvent);
        return true;
    }

    /* renamed from: p0 */
    public void mo28937p0(int i, int i2) {
        this.f28656l0 = i;
        this.f28657m0 = i2;
    }

    /* renamed from: q0 */
    public void mo28938q0(float f, float f2, float f3, float f4) {
        this.f28651g0 = true;
        this.f28652h0 = f;
        this.f28653i0 = f2;
        this.f28654j0 = f3;
        this.f28655k0 = f4;
    }

    @SuppressLint({"all"})
    public void requestLayout() {
    }

    public void setBarCodeTypes(List<String> list) {
        this.f28665z = list;
        m37129l0();
    }

    public void setDetectedImageInEvent(boolean z) {
        this.f28622A = z;
    }

    public void setFaceDetectionClassifications(int i) {
        this.f28645a0 = i;
        C10997b bVar = this.f28636O;
        if (bVar != null) {
            bVar.mo29009f(i);
        }
    }

    public void setFaceDetectionLandmarks(int i) {
        this.f28644W = i;
        C10997b bVar = this.f28636O;
        if (bVar != null) {
            bVar.mo29010g(i);
        }
    }

    public void setFaceDetectionMode(int i) {
        this.f28643V = i;
        C10997b bVar = this.f28636O;
        if (bVar != null) {
            bVar.mo29011h(i);
        }
    }

    public void setGoogleVisionBarcodeMode(int i) {
        this.f28647c0 = i;
    }

    public void setGoogleVisionBarcodeType(int i) {
        this.f28646b0 = i;
        C10677b bVar = this.f28637P;
        if (bVar != null) {
            bVar.mo26602f(i);
        }
    }

    public void setShouldDetectFaces(boolean z) {
        if (z && this.f28636O == null) {
            m37133s0();
        }
        this.f28638Q = z;
        setScanning(z || this.f28639R || this.f28640S || this.f28641T);
    }

    public void setShouldDetectTouches(boolean z) {
        this.f28624C = (this.f28642U || !z) ? null : new GestureDetector(this.f28660u, this.f28658n0);
        this.f28642U = z;
    }

    public void setShouldGoogleDetectBarcodes(boolean z) {
        if (z && this.f28637P == null) {
            m37132r0();
        }
        this.f28639R = z;
        setScanning(this.f28638Q || z || this.f28640S || this.f28641T);
    }

    public void setShouldRecognizeText(boolean z) {
        this.f28641T = z;
        setScanning(this.f28638Q || this.f28639R || this.f28640S || z);
    }

    public void setShouldScanBarCodes(boolean z) {
        if (z && this.f28635N == null) {
            m37129l0();
        }
        this.f28640S = z;
        setScanning(this.f28638Q || this.f28639R || z || this.f28641T);
    }

    public void setTracking(boolean z) {
        this.f28648d0 = z;
        C10997b bVar = this.f28636O;
        if (bVar != null) {
            bVar.mo29012i(z);
        }
    }

    public void setUseNativeZoom(boolean z) {
        this.f28623B = (this.f28630I || !z) ? null : new ScaleGestureDetector(this.f28660u, this.f28659o0);
        this.f28630I = z;
    }

    /* renamed from: t0 */
    public void mo28954t0(ReadableMap readableMap, Promise promise, File file) {
        this.f17961t.post(new C10944b(promise, readableMap, file));
    }
}
