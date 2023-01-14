package com.mrousavy.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.C0634d2;
import androidx.camera.core.C0693h2;
import androidx.camera.core.C0930k1;
import androidx.camera.core.C0965s1;
import androidx.camera.core.C0967s2;
import androidx.camera.core.ImageProxy;
import androidx.camera.extensions.ExtensionsManager;
import androidx.camera.lifecycle.C1083e;
import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1291g;
import androidx.lifecycle.C1292h;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.mrousavy.camera.frameprocessor.C5149c;
import com.mrousavy.camera.frameprocessor.C5151d;
import com.mrousavy.camera.frameprocessor.FrameProcessorRuntimeManager;
import com.mrousavy.camera.p168n0.C5177f;
import com.mrousavy.camera.p168n0.C5185n;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.C10784l0;
import kotlinx.coroutines.C10789m0;
import kotlinx.coroutines.C10810n0;
import kotlinx.coroutines.C10812n1;
import kotlinx.coroutines.C10846x0;
import p027c.p043d.p044a.C1502a1;
import p027c.p043d.p044a.C1516b1;
import p027c.p043d.p044a.C1532f1;
import p027c.p043d.p053b.C1759t;
import p174e.p247e.p317m.p318a.C6410a;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p462v.C10381g;
import p455g.p462v.p464k.p465a.C10399d;
import p455g.p462v.p464k.p465a.C10401f;
import p455g.p462v.p464k.p465a.C10407k;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10467v;

@SuppressLint({"ClickableViewAccessibility", "ViewConstructor"})
public final class CameraView extends FrameLayout implements C1291g {

    /* renamed from: f */
    public static final C5123c f14517f = new C5123c((C10452g) null);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final ArrayList<String> f14518o = C10350l.m35134c("cameraId", "format", "fps", "hdr", "lowLightBoost", "photo", "video", "enableFrameProcessor");
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final ArrayList<String> f14519p = C10350l.m35134c("zoom");

    /* renamed from: A */
    private Integer f14520A;

    /* renamed from: B */
    private Boolean f14521B;

    /* renamed from: C */
    private String f14522C;

    /* renamed from: D */
    private Boolean f14523D;

    /* renamed from: E */
    private boolean f14524E;

    /* renamed from: F */
    private String f14525F = "off";

    /* renamed from: G */
    private float f14526G = 1.0f;

    /* renamed from: H */
    private String f14527H;

    /* renamed from: I */
    private boolean f14528I;

    /* renamed from: J */
    private double f14529J = 1.0d;

    /* renamed from: K */
    private boolean f14530K;

    /* renamed from: L */
    private final C1759t f14531L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final ExecutorService f14532M = Executors.newSingleThreadExecutor();

    /* renamed from: N */
    private final ExecutorService f14533N = Executors.newSingleThreadExecutor();

    /* renamed from: O */
    private final ExecutorService f14534O = Executors.newSingleThreadExecutor();

    /* renamed from: P */
    private C10784l0 f14535P = C10789m0.m36646a(C10846x0.m36937c());

    /* renamed from: Q */
    private C0930k1 f14536Q;

    /* renamed from: R */
    private C0693h2 f14537R;

    /* renamed from: S */
    private C1532f1<C1502a1> f14538S;

    /* renamed from: T */
    private C0634d2 f14539T;

    /* renamed from: U */
    private C0967s2 f14540U;

    /* renamed from: V */
    private C1516b1 f14541V;

    /* renamed from: W */
    private long f14542W = System.currentTimeMillis();
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public ExtensionsManager f14543a0;

    /* renamed from: b0 */
    private final ScaleGestureDetector.SimpleOnScaleGestureListener f14544b0;

    /* renamed from: c0 */
    private final ScaleGestureDetector f14545c0;

    /* renamed from: d0 */
    private final View.OnTouchListener f14546d0;

    /* renamed from: e0 */
    private final C1292h f14547e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public C1286d.C1288b f14548f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public float f14549g0 = 1.0f;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public float f14550h0 = 1.0f;

    /* renamed from: i0 */
    private double f14551i0 = 30.0d;

    /* renamed from: j0 */
    private final C5149c f14552j0 = new C5149c();

    /* renamed from: k0 */
    private double f14553k0;

    /* renamed from: l0 */
    private long f14554l0 = System.currentTimeMillis();
    @C6410a
    private HybridData mHybridData;

    /* renamed from: q */
    private final ExecutorService f14555q;

    /* renamed from: r */
    private String f14556r;

    /* renamed from: s */
    private boolean f14557s;

    /* renamed from: t */
    private Boolean f14558t;

    /* renamed from: u */
    private boolean f14559u;

    /* renamed from: v */
    private Boolean f14560v;

    /* renamed from: w */
    private Boolean f14561w;

    /* renamed from: x */
    private Boolean f14562x;

    /* renamed from: y */
    private boolean f14563y;

    /* renamed from: z */
    private ReadableMap f14564z;

    /* renamed from: com.mrousavy.camera.CameraView$a */
    public static final class C5121a extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* renamed from: a */
        final /* synthetic */ CameraView f14565a;

        C5121a(CameraView cameraView) {
            this.f14565a = cameraView;
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C10457l.m35320e(scaleGestureDetector, "detector");
            CameraView cameraView = this.f14565a;
            cameraView.setZoom(Math.max(Math.min(cameraView.getZoom() * scaleGestureDetector.getScaleFactor(), this.f14565a.f14550h0), this.f14565a.f14549g0));
            this.f14565a.mo15705x(CameraView.f14519p);
            return true;
        }
    }

    /* renamed from: com.mrousavy.camera.CameraView$b */
    public static final class C5122b implements LifecycleEventListener {

        /* renamed from: f */
        final /* synthetic */ CameraView f14566f;

        C5122b(CameraView cameraView) {
            this.f14566f = cameraView;
        }

        public void onHostDestroy() {
            this.f14566f.f14548f0 = C1286d.C1288b.DESTROYED;
            this.f14566f.m19362z();
            this.f14566f.f14532M.shutdown();
            this.f14566f.getTakePhotoExecutor$react_native_vision_camera_release().shutdown();
            this.f14566f.getRecordVideoExecutor$react_native_vision_camera_release().shutdown();
            this.f14566f.getReactContext().removeLifecycleEventListener(this);
        }

        public void onHostPause() {
            this.f14566f.f14548f0 = C1286d.C1288b.CREATED;
            this.f14566f.m19362z();
        }

        public void onHostResume() {
            this.f14566f.f14548f0 = C1286d.C1288b.RESUMED;
            this.f14566f.m19362z();
            this.f14566f.mo15705x(CameraView.f14518o);
        }
    }

    /* renamed from: com.mrousavy.camera.CameraView$c */
    public static final class C5123c {
        private C5123c() {
        }

        public /* synthetic */ C5123c(C10452g gVar) {
            this();
        }
    }

    @C10401f(mo25797c = "com.mrousavy.camera.CameraView", mo25798f = "CameraView.kt", mo25799l = {366, 447, 450}, mo25800m = "configureSession")
    /* renamed from: com.mrousavy.camera.CameraView$d */
    static final class C5124d extends C10399d {

        /* renamed from: A */
        final /* synthetic */ CameraView f14567A;

        /* renamed from: B */
        int f14568B;

        /* renamed from: q */
        Object f14569q;

        /* renamed from: r */
        Object f14570r;

        /* renamed from: s */
        Object f14571s;

        /* renamed from: t */
        Object f14572t;

        /* renamed from: u */
        Object f14573u;

        /* renamed from: v */
        Object f14574v;

        /* renamed from: w */
        Object f14575w;

        /* renamed from: x */
        Object f14576x;

        /* renamed from: y */
        long f14577y;

        /* renamed from: z */
        /* synthetic */ Object f14578z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5124d(CameraView cameraView, C10376d<? super C5124d> dVar) {
            super(dVar);
            this.f14567A = cameraView;
        }

        /* renamed from: n */
        public final Object mo15707n(Object obj) {
            this.f14578z = obj;
            this.f14568B |= RecyclerView.UNDEFINED_DURATION;
            return this.f14567A.m19354p(this);
        }
    }

    @C10401f(mo25797c = "com.mrousavy.camera.CameraView$configureSession$tryEnableExtension$1", mo25798f = "CameraView.kt", mo25799l = {373}, mo25800m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraView$e */
    static final class C5125e extends C10407k implements C10434p<Integer, C10376d<? super C10323s>, Object> {

        /* renamed from: r */
        Object f14579r;

        /* renamed from: s */
        int f14580s;

        /* renamed from: t */
        /* synthetic */ int f14581t;

        /* renamed from: u */
        final /* synthetic */ CameraView f14582u;

        /* renamed from: v */
        final /* synthetic */ C1083e f14583v;

        /* renamed from: w */
        final /* synthetic */ C10467v<C0965s1> f14584w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5125e(CameraView cameraView, C1083e eVar, C10467v<C0965s1> vVar, C10376d<? super C5125e> dVar) {
            super(2, dVar);
            this.f14582u = cameraView;
            this.f14583v = eVar;
            this.f14584w = vVar;
        }

        /* renamed from: b */
        public final C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
            C5125e eVar = new C5125e(this.f14582u, this.f14583v, this.f14584w, dVar);
            eVar.f14581t = ((Number) obj).intValue();
            return eVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ Object mo15709j(Object obj, Object obj2) {
            return mo15710q(((Number) obj).intValue(), (C10376d) obj2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00a4  */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo15707n(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p455g.p462v.p463j.C10395d.m35244c()
                int r1 = r6.f14580s
                r2 = 1
                java.lang.String r3 = "CameraView"
                if (r1 == 0) goto L_0x001f
                if (r1 != r2) goto L_0x0017
                int r0 = r6.f14581t
                java.lang.Object r1 = r6.f14579r
                com.mrousavy.camera.CameraView r1 = (com.mrousavy.camera.CameraView) r1
                p455g.C10318n.m35017b(r7)
                goto L_0x0051
            L_0x0017:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001f:
                p455g.C10318n.m35017b(r7)
                int r7 = r6.f14581t
                com.mrousavy.camera.CameraView r1 = r6.f14582u
                androidx.camera.extensions.ExtensionsManager r1 = r1.f14543a0
                if (r1 != 0) goto L_0x0057
                java.lang.String r1 = "Initializing ExtensionsManager..."
                android.util.Log.i(r3, r1)
                com.mrousavy.camera.CameraView r1 = r6.f14582u
                android.content.Context r4 = r1.getContext()
                androidx.camera.lifecycle.e r5 = r6.f14583v
                e.f.b.a.a.b r4 = androidx.camera.extensions.ExtensionsManager.m3952b(r4, r5)
                java.lang.String r5 = "getInstanceAsync(context, cameraProvider)"
                p455g.p470y.p472d.C10457l.m35319d(r4, r5)
                r6.f14579r = r1
                r6.f14581t = r7
                r6.f14580s = r2
                java.lang.Object r2 = kotlinx.coroutines.p505k2.C10780a.m36633b(r4, r6)
                if (r2 != r0) goto L_0x004f
                return r0
            L_0x004f:
                r0 = r7
                r7 = r2
            L_0x0051:
                androidx.camera.extensions.ExtensionsManager r7 = (androidx.camera.extensions.ExtensionsManager) r7
                r1.f14543a0 = r7
                r7 = r0
            L_0x0057:
                com.mrousavy.camera.CameraView r0 = r6.f14582u
                androidx.camera.extensions.ExtensionsManager r0 = r0.f14543a0
                p455g.p470y.p472d.C10457l.m35317b(r0)
                g.y.d.v<androidx.camera.core.s1> r1 = r6.f14584w
                T r1 = r1.f27625f
                androidx.camera.core.s1 r1 = (androidx.camera.core.C0965s1) r1
                boolean r0 = r0.mo3307e(r1, r7)
                if (r0 == 0) goto L_0x00a4
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Enabling extension "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r1 = "..."
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.util.Log.i(r3, r0)
                g.y.d.v<androidx.camera.core.s1> r0 = r6.f14584w
                com.mrousavy.camera.CameraView r1 = r6.f14582u
                androidx.camera.extensions.ExtensionsManager r1 = r1.f14543a0
                p455g.p470y.p472d.C10457l.m35317b(r1)
                g.y.d.v<androidx.camera.core.s1> r2 = r6.f14584w
                T r2 = r2.f27625f
                androidx.camera.core.s1 r2 = (androidx.camera.core.C0965s1) r2
                androidx.camera.core.s1 r7 = r1.mo3306a(r2, r7)
                java.lang.String r1 = "extensionsManager!!.getE…ameraSelector, extension)"
                p455g.p470y.p472d.C10457l.m35319d(r7, r1)
                r0.f27625f = r7
                g.s r7 = p455g.C10323s.f27547a
                return r7
            L_0x00a4:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Extension "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r1 = " is not available for the given Camera!"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.util.Log.e(r3, r0)
                r0 = 2
                if (r7 == r0) goto L_0x00e5
                r0 = 3
                if (r7 == r0) goto L_0x00df
                java.lang.Error r0 = new java.lang.Error
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid extension supplied! Extension "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = " is not available."
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                goto L_0x00ea
            L_0x00df:
                com.mrousavy.camera.a0 r0 = new com.mrousavy.camera.a0
                r0.<init>()
                goto L_0x00ea
            L_0x00e5:
                com.mrousavy.camera.t r0 = new com.mrousavy.camera.t
                r0.<init>()
            L_0x00ea:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraView.C5125e.mo15707n(java.lang.Object):java.lang.Object");
        }

        /* renamed from: q */
        public final Object mo15710q(int i, C10376d<? super C10323s> dVar) {
            return ((C5125e) mo15708b(Integer.valueOf(i), dVar)).mo15707n(C10323s.f27547a);
        }
    }

    @C10401f(mo25797c = "com.mrousavy.camera.CameraView$update$1$1", mo25798f = "CameraView.kt", mo25799l = {327}, mo25800m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraView$f */
    static final class C5126f extends C10407k implements C10434p<C10784l0, C10376d<? super C10323s>, Object> {

        /* renamed from: r */
        int f14585r;

        /* renamed from: s */
        int f14586s;

        /* renamed from: t */
        int f14587t;

        /* renamed from: u */
        int f14588u;

        /* renamed from: v */
        final /* synthetic */ ArrayList<String> f14589v;

        /* renamed from: w */
        final /* synthetic */ CameraView f14590w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5126f(ArrayList<String> arrayList, CameraView cameraView, C10376d<? super C5126f> dVar) {
            super(2, dVar);
            this.f14589v = arrayList;
            this.f14590w = cameraView;
        }

        /* renamed from: b */
        public final C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
            return new C5126f(this.f14589v, this.f14590w, dVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A[Catch:{ all -> 0x00d3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0063 A[Catch:{ all -> 0x00d3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x006a A[Catch:{ all -> 0x00d3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0083 A[Catch:{ all -> 0x00d3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00af A[Catch:{ all -> 0x00d3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd A[Catch:{ all -> 0x00d3 }] */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo15707n(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p455g.p462v.p463j.C10395d.m35244c()
                int r1 = r7.f14588u
                r2 = 1
                if (r1 == 0) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                int r0 = r7.f14587t
                int r1 = r7.f14586s
                int r2 = r7.f14585r
                p455g.C10318n.m35017b(r8)     // Catch:{ all -> 0x00d3 }
                goto L_0x007e
            L_0x0016:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001e:
                p455g.C10318n.m35017b(r8)
                java.util.ArrayList<java.lang.String> r8 = r7.f14589v     // Catch:{ all -> 0x00d3 }
                java.util.ArrayList r1 = com.mrousavy.camera.CameraView.f14518o     // Catch:{ all -> 0x00d3 }
                boolean r8 = com.mrousavy.camera.p168n0.C5184m.m19465a(r8, r1)     // Catch:{ all -> 0x00d3 }
                r1 = 0
                if (r8 != 0) goto L_0x003b
                java.util.ArrayList<java.lang.String> r3 = r7.f14589v     // Catch:{ all -> 0x00d3 }
                java.lang.String r4 = "zoom"
                boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x00d3 }
                if (r3 == 0) goto L_0x0039
                goto L_0x003b
            L_0x0039:
                r3 = 0
                goto L_0x003c
            L_0x003b:
                r3 = 1
            L_0x003c:
                if (r8 != 0) goto L_0x004b
                java.util.ArrayList<java.lang.String> r4 = r7.f14589v     // Catch:{ all -> 0x00d3 }
                java.lang.String r5 = "torch"
                boolean r4 = r4.contains(r5)     // Catch:{ all -> 0x00d3 }
                if (r4 == 0) goto L_0x0049
                goto L_0x004b
            L_0x0049:
                r4 = 0
                goto L_0x004c
            L_0x004b:
                r4 = 1
            L_0x004c:
                if (r8 != 0) goto L_0x0058
                java.util.ArrayList<java.lang.String> r5 = r7.f14589v     // Catch:{ all -> 0x00d3 }
                java.lang.String r6 = "orientation"
                boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x00d3 }
                if (r5 == 0) goto L_0x0059
            L_0x0058:
                r1 = 1
            L_0x0059:
                java.util.ArrayList<java.lang.String> r5 = r7.f14589v     // Catch:{ all -> 0x00d3 }
                java.lang.String r6 = "isActive"
                boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x00d3 }
                if (r5 == 0) goto L_0x0068
                com.mrousavy.camera.CameraView r5 = r7.f14590w     // Catch:{ all -> 0x00d3 }
                r5.m19362z()     // Catch:{ all -> 0x00d3 }
            L_0x0068:
                if (r8 == 0) goto L_0x0081
                com.mrousavy.camera.CameraView r8 = r7.f14590w     // Catch:{ all -> 0x00d3 }
                r7.f14585r = r3     // Catch:{ all -> 0x00d3 }
                r7.f14586s = r4     // Catch:{ all -> 0x00d3 }
                r7.f14587t = r1     // Catch:{ all -> 0x00d3 }
                r7.f14588u = r2     // Catch:{ all -> 0x00d3 }
                java.lang.Object r8 = r8.m19354p(r7)     // Catch:{ all -> 0x00d3 }
                if (r8 != r0) goto L_0x007b
                return r0
            L_0x007b:
                r0 = r1
                r2 = r3
                r1 = r4
            L_0x007e:
                r4 = r1
                r3 = r2
                r1 = r0
            L_0x0081:
                if (r3 == 0) goto L_0x00ad
                com.mrousavy.camera.CameraView r8 = r7.f14590w     // Catch:{ all -> 0x00d3 }
                float r8 = r8.getZoom()     // Catch:{ all -> 0x00d3 }
                com.mrousavy.camera.CameraView r0 = r7.f14590w     // Catch:{ all -> 0x00d3 }
                float r0 = r0.f14550h0     // Catch:{ all -> 0x00d3 }
                float r8 = java.lang.Math.min(r8, r0)     // Catch:{ all -> 0x00d3 }
                com.mrousavy.camera.CameraView r0 = r7.f14590w     // Catch:{ all -> 0x00d3 }
                float r0 = r0.f14549g0     // Catch:{ all -> 0x00d3 }
                float r8 = java.lang.Math.max(r8, r0)     // Catch:{ all -> 0x00d3 }
                com.mrousavy.camera.CameraView r0 = r7.f14590w     // Catch:{ all -> 0x00d3 }
                androidx.camera.core.k1 r0 = r0.getCamera$react_native_vision_camera_release()     // Catch:{ all -> 0x00d3 }
                p455g.p470y.p472d.C10457l.m35317b(r0)     // Catch:{ all -> 0x00d3 }
                androidx.camera.core.m1 r0 = r0.mo2384c()     // Catch:{ all -> 0x00d3 }
                r0.mo2324c(r8)     // Catch:{ all -> 0x00d3 }
            L_0x00ad:
                if (r4 == 0) goto L_0x00cb
                com.mrousavy.camera.CameraView r8 = r7.f14590w     // Catch:{ all -> 0x00d3 }
                androidx.camera.core.k1 r8 = r8.getCamera$react_native_vision_camera_release()     // Catch:{ all -> 0x00d3 }
                p455g.p470y.p472d.C10457l.m35317b(r8)     // Catch:{ all -> 0x00d3 }
                androidx.camera.core.m1 r8 = r8.mo2384c()     // Catch:{ all -> 0x00d3 }
                com.mrousavy.camera.CameraView r0 = r7.f14590w     // Catch:{ all -> 0x00d3 }
                java.lang.String r0 = r0.getTorch()     // Catch:{ all -> 0x00d3 }
                java.lang.String r2 = "on"
                boolean r0 = p455g.p470y.p472d.C10457l.m35316a(r0, r2)     // Catch:{ all -> 0x00d3 }
                r8.mo2330f(r0)     // Catch:{ all -> 0x00d3 }
            L_0x00cb:
                if (r1 == 0) goto L_0x00e8
                com.mrousavy.camera.CameraView r8 = r7.f14590w     // Catch:{ all -> 0x00d3 }
                r8.m19339A()     // Catch:{ all -> 0x00d3 }
                goto L_0x00e8
            L_0x00d3:
                r8 = move-exception
                java.lang.String r0 = r8.getMessage()
                java.lang.String r1 = "update() threw: "
                java.lang.String r0 = p455g.p470y.p472d.C10457l.m35326k(r1, r0)
                java.lang.String r1 = "CameraView"
                android.util.Log.e(r1, r0)
                com.mrousavy.camera.CameraView r0 = r7.f14590w
                com.mrousavy.camera.C5162l.m19422b(r0, r8)
            L_0x00e8:
                g.s r8 = p455g.C10323s.f27547a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraView.C5126f.mo15707n(java.lang.Object):java.lang.Object");
        }

        /* renamed from: q */
        public final Object mo15709j(C10784l0 l0Var, C10376d<? super C10323s> dVar) {
            return ((C5126f) mo15708b(l0Var, dVar)).mo15707n(C10323s.f27547a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraView(Context context, ExecutorService executorService) {
        super(context);
        C10457l.m35320e(context, "context");
        C10457l.m35320e(executorService, "frameProcessorThread");
        this.f14555q = executorService;
        if (FrameProcessorRuntimeManager.f14632a.mo15759a()) {
            this.mHybridData = initHybrid();
        }
        C1759t tVar = new C1759t(context);
        this.f14531L = tVar;
        tVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        C5185n.m19466a(tVar);
        addView(tVar);
        C5121a aVar = new C5121a(this);
        this.f14544b0 = aVar;
        this.f14545c0 = new ScaleGestureDetector(context, aVar);
        this.f14546d0 = new C5134a(this);
        this.f14548f0 = C1286d.C1288b.INITIALIZED;
        this.f14547e0 = new C1292h(this);
        getReactContext().addLifecycleEventListener(new C5122b(this));
    }

    /* access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    /* renamed from: A */
    public final void m19339A() {
        C0967s2 s2Var = this.f14540U;
        if (s2Var != null) {
            s2Var.mo3225U(getInputRotation());
        }
        C0693h2 h2Var = this.f14537R;
        if (h2Var != null) {
            h2Var.mo2755p0(getOutputRotation());
        }
        C1532f1<C1502a1> f1Var = this.f14538S;
        if (f1Var != null) {
            f1Var.mo5659X(getOutputRotation());
        }
        C0634d2 d2Var = this.f14539T;
        if (d2Var != null) {
            d2Var.mo2655X(getOutputRotation());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m19340a(CameraView cameraView, View view, MotionEvent motionEvent) {
        C10457l.m35320e(cameraView, "this$0");
        return cameraView.f14545c0.onTouchEvent(motionEvent);
    }

    private final native void frameProcessorCallback(ImageProxy imageProxy);

    /* renamed from: getFallbackToSnapshot$react_native_vision_camera_release$annotations */
    public static /* synthetic */ void m19346x5c3495a9() {
    }

    private final int getInputRotation() {
        Context context = getContext();
        C10457l.m35319d(context, "context");
        return C5177f.m19454a(context);
    }

    private final int getOutputRotation() {
        String str = this.f14527H;
        if (str == null) {
            return getInputRotation();
        }
        C10457l.m35317b(str);
        switch (str.hashCode()) {
            case -2022952606:
                if (str.equals("landscapeLeft")) {
                    return 3;
                }
                break;
            case -1090566097:
                if (str.equals("portraitUpsideDown")) {
                    return 2;
                }
                break;
            case 729267099:
                if (str.equals("portrait")) {
                    return 0;
                }
                break;
            case 1718639649:
                if (str.equals("landscapeRight")) {
                    return 1;
                }
                break;
        }
        String str2 = this.f14527H;
        C10457l.m35317b(str2);
        throw new C5206y("orientation", str2);
    }

    public static /* synthetic */ void getPreviewView$react_native_vision_camera_release$annotations() {
    }

    /* access modifiers changed from: private */
    public final ReactContext getReactContext() {
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (ReactContext) context;
    }

    private final native HybridData initHybrid();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.mrousavy.camera.CameraView$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: com.mrousavy.camera.CameraView$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: com.mrousavy.camera.CameraView$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: com.mrousavy.camera.CameraView$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v11, types: [androidx.camera.core.d2, c.d.a.f1, androidx.camera.core.h2] */
    /* JADX WARNING: type inference failed for: r1v40 */
    /* JADX WARNING: type inference failed for: r1v42 */
    /* JADX WARNING: type inference failed for: r1v85 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0348 A[Catch:{ all -> 0x053f, all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0377 A[Catch:{ all -> 0x053f, all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x038b A[Catch:{ all -> 0x053f, all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03b9 A[Catch:{ all -> 0x053f, all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03e0 A[Catch:{ all -> 0x053f, all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0410 A[Catch:{ all -> 0x053f, all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0421 A[Catch:{ all -> 0x053f, all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0449 A[Catch:{ all -> 0x053f, all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x04a1 A[Catch:{ all -> 0x053f, all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0537 A[SYNTHETIC, Splitter:B:151:0x0537] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0190 A[Catch:{ all -> 0x055a }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b7 A[Catch:{ all -> 0x055a }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02ab A[Catch:{ all -> 0x055a }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02b2 A[Catch:{ all -> 0x055a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    @android.annotation.SuppressLint({"RestrictedApi"})
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m19354p(p455g.p462v.C10376d<? super p455g.C10323s> r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            boolean r2 = r0 instanceof com.mrousavy.camera.CameraView.C5124d
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.mrousavy.camera.CameraView$d r2 = (com.mrousavy.camera.CameraView.C5124d) r2
            int r3 = r2.f14568B
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f14568B = r3
            goto L_0x001c
        L_0x0017:
            com.mrousavy.camera.CameraView$d r2 = new com.mrousavy.camera.CameraView$d
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f14578z
            java.lang.Object r3 = p455g.p462v.p463j.C10395d.m35244c()
            int r4 = r2.f14568B
            r5 = 3
            r6 = 2
            java.lang.String r8 = "CameraView"
            r9 = 1
            if (r4 == 0) goto L_0x0095
            if (r4 == r9) goto L_0x0088
            if (r4 == r6) goto L_0x005e
            if (r4 != r5) goto L_0x0056
            long r3 = r2.f14577y
            java.lang.Object r5 = r2.f14575w
            androidx.camera.core.d2$c r5 = (androidx.camera.core.C0634d2.C0637c) r5
            java.lang.Object r11 = r2.f14574v
            c.d.a.a1$h r11 = (p027c.p043d.p044a.C1502a1.C1510h) r11
            java.lang.Object r12 = r2.f14573u
            androidx.camera.core.h2$e r12 = (androidx.camera.core.C0693h2.C0698e) r12
            java.lang.Object r13 = r2.f14572t
            androidx.camera.core.s2$b r13 = (androidx.camera.core.C0967s2.C0969b) r13
            java.lang.Object r14 = r2.f14571s
            g.y.d.v r14 = (p455g.p470y.p472d.C10467v) r14
            java.lang.Object r15 = r2.f14570r
            androidx.camera.lifecycle.e r15 = (androidx.camera.lifecycle.C1083e) r15
            java.lang.Object r2 = r2.f14569q
            com.mrousavy.camera.CameraView r2 = (com.mrousavy.camera.CameraView) r2
            p455g.C10318n.m35017b(r0)     // Catch:{ all -> 0x055a }
            r17 = r8
            goto L_0x03af
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x005e:
            long r11 = r2.f14577y
            java.lang.Object r4 = r2.f14576x
            androidx.camera.core.d2$c r4 = (androidx.camera.core.C0634d2.C0637c) r4
            java.lang.Object r13 = r2.f14575w
            c.d.a.a1$h r13 = (p027c.p043d.p044a.C1502a1.C1510h) r13
            java.lang.Object r14 = r2.f14574v
            androidx.camera.core.h2$e r14 = (androidx.camera.core.C0693h2.C0698e) r14
            java.lang.Object r15 = r2.f14573u
            androidx.camera.core.s2$b r15 = (androidx.camera.core.C0967s2.C0969b) r15
            java.lang.Object r5 = r2.f14572t
            g.y.c.p r5 = (p455g.p470y.p471c.C10434p) r5
            java.lang.Object r6 = r2.f14571s
            g.y.d.v r6 = (p455g.p470y.p472d.C10467v) r6
            java.lang.Object r10 = r2.f14570r
            androidx.camera.lifecycle.e r10 = (androidx.camera.lifecycle.C1083e) r10
            java.lang.Object r7 = r2.f14569q
            com.mrousavy.camera.CameraView r7 = (com.mrousavy.camera.CameraView) r7
            p455g.C10318n.m35017b(r0)     // Catch:{ all -> 0x055a }
            r1 = r3
            r17 = r8
            goto L_0x036f
        L_0x0088:
            long r4 = r2.f14577y
            java.lang.Object r6 = r2.f14569q
            com.mrousavy.camera.CameraView r6 = (com.mrousavy.camera.CameraView) r6
            p455g.C10318n.m35017b(r0)     // Catch:{ all -> 0x055a }
            r11 = r4
            r7 = r6
            goto L_0x010c
        L_0x0095:
            p455g.C10318n.m35017b(r0)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x055a }
            java.lang.String r0 = "Configuring session..."
            android.util.Log.i(r8, r0)     // Catch:{ all -> 0x055a }
            android.content.Context r0 = r21.getContext()     // Catch:{ all -> 0x055a }
            java.lang.String r6 = "android.permission.CAMERA"
            int r0 = androidx.core.content.C1135a.m4415a(r0, r6)     // Catch:{ all -> 0x055a }
            if (r0 != 0) goto L_0x0551
            java.lang.String r0 = r21.getCameraId()     // Catch:{ all -> 0x055a }
            if (r0 == 0) goto L_0x054a
            com.facebook.react.bridge.ReadableMap r0 = r21.getFormat()     // Catch:{ all -> 0x055a }
            java.lang.String r6 = "Configuring session with Camera ID "
            if (r0 == 0) goto L_0x00d7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x055a }
            r0.<init>()     // Catch:{ all -> 0x055a }
            r0.append(r6)     // Catch:{ all -> 0x055a }
            java.lang.String r6 = r21.getCameraId()     // Catch:{ all -> 0x055a }
            r0.append(r6)     // Catch:{ all -> 0x055a }
            java.lang.String r6 = " and custom format..."
            r0.append(r6)     // Catch:{ all -> 0x055a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x055a }
        L_0x00d3:
            android.util.Log.i(r8, r0)     // Catch:{ all -> 0x055a }
            goto L_0x00f0
        L_0x00d7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x055a }
            r0.<init>()     // Catch:{ all -> 0x055a }
            r0.append(r6)     // Catch:{ all -> 0x055a }
            java.lang.String r6 = r21.getCameraId()     // Catch:{ all -> 0x055a }
            r0.append(r6)     // Catch:{ all -> 0x055a }
            java.lang.String r6 = " and default format options..."
            r0.append(r6)     // Catch:{ all -> 0x055a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x055a }
            goto L_0x00d3
        L_0x00f0:
            com.facebook.react.bridge.ReactContext r0 = r21.getReactContext()     // Catch:{ all -> 0x055a }
            e.f.b.a.a.b r0 = androidx.camera.lifecycle.C1083e.m4160d(r0)     // Catch:{ all -> 0x055a }
            java.lang.String r6 = "getInstance(reactContext)"
            p455g.p470y.p472d.C10457l.m35319d(r0, r6)     // Catch:{ all -> 0x055a }
            r2.f14569q = r1     // Catch:{ all -> 0x055a }
            r2.f14577y = r4     // Catch:{ all -> 0x055a }
            r2.f14568B = r9     // Catch:{ all -> 0x055a }
            java.lang.Object r0 = kotlinx.coroutines.p505k2.C10780a.m36633b(r0, r2)     // Catch:{ all -> 0x055a }
            if (r0 != r3) goto L_0x010a
            return r3
        L_0x010a:
            r7 = r1
            r11 = r4
        L_0x010c:
            r10 = r0
            androidx.camera.lifecycle.e r10 = (androidx.camera.lifecycle.C1083e) r10     // Catch:{ all -> 0x055a }
            g.y.d.v r6 = new g.y.d.v     // Catch:{ all -> 0x055a }
            r6.<init>()     // Catch:{ all -> 0x055a }
            androidx.camera.core.s1$a r0 = new androidx.camera.core.s1$a     // Catch:{ all -> 0x055a }
            r0.<init>()     // Catch:{ all -> 0x055a }
            java.lang.String r4 = r7.getCameraId()     // Catch:{ all -> 0x055a }
            p455g.p470y.p472d.C10457l.m35317b(r4)     // Catch:{ all -> 0x055a }
            androidx.camera.core.s1$a r0 = com.mrousavy.camera.p168n0.C5176e.m19451a(r0, r4)     // Catch:{ all -> 0x055a }
            androidx.camera.core.s1 r0 = r0.mo3218b()     // Catch:{ all -> 0x055a }
            java.lang.String r4 = "Builder().byID(cameraId!!).build()"
            p455g.p470y.p472d.C10457l.m35319d(r0, r4)     // Catch:{ all -> 0x055a }
            r6.f27625f = r0     // Catch:{ all -> 0x055a }
            com.mrousavy.camera.CameraView$e r5 = new com.mrousavy.camera.CameraView$e     // Catch:{ all -> 0x055a }
            r4 = 0
            r5.<init>(r7, r10, r6, r4)     // Catch:{ all -> 0x055a }
            androidx.camera.core.s2$b r0 = new androidx.camera.core.s2$b     // Catch:{ all -> 0x055a }
            r0.<init>()     // Catch:{ all -> 0x055a }
            int r4 = r7.getInputRotation()     // Catch:{ all -> 0x055a }
            androidx.camera.core.s2$b r15 = r0.mo2604d(r4)     // Catch:{ all -> 0x055a }
            java.lang.String r0 = "Builder()\n        .setTa…etRotation(inputRotation)"
            p455g.p470y.p472d.C10457l.m35319d(r15, r0)     // Catch:{ all -> 0x055a }
            androidx.camera.core.h2$e r0 = new androidx.camera.core.h2$e     // Catch:{ all -> 0x055a }
            r0.<init>()     // Catch:{ all -> 0x055a }
            int r4 = r7.getOutputRotation()     // Catch:{ all -> 0x055a }
            androidx.camera.core.h2$e r0 = r0.mo2604d(r4)     // Catch:{ all -> 0x055a }
            androidx.camera.core.h2$e r14 = r0.mo2765i(r9)     // Catch:{ all -> 0x055a }
            java.lang.String r0 = "Builder()\n        .setTa…RE_MODE_MINIMIZE_LATENCY)"
            p455g.p470y.p472d.C10457l.m35319d(r14, r0)     // Catch:{ all -> 0x055a }
            c.d.a.a1$h r0 = new c.d.a.a1$h     // Catch:{ all -> 0x055a }
            r0.<init>()     // Catch:{ all -> 0x055a }
            java.util.concurrent.ExecutorService r4 = r7.f14532M     // Catch:{ all -> 0x055a }
            c.d.a.a1$h r13 = r0.mo5607c(r4)     // Catch:{ all -> 0x055a }
            java.lang.String r0 = "Builder()\n        .setExecutor(cameraExecutor)"
            p455g.p470y.p472d.C10457l.m35319d(r13, r0)     // Catch:{ all -> 0x055a }
            androidx.camera.core.d2$c r0 = new androidx.camera.core.d2$c     // Catch:{ all -> 0x055a }
            r0.<init>()     // Catch:{ all -> 0x055a }
            int r4 = r7.getOutputRotation()     // Catch:{ all -> 0x055a }
            androidx.camera.core.d2$c r0 = r0.mo2604d(r4)     // Catch:{ all -> 0x055a }
            r4 = 0
            androidx.camera.core.d2$c r0 = r0.mo2661i(r4)     // Catch:{ all -> 0x055a }
            java.util.concurrent.ExecutorService r4 = r7.f14555q     // Catch:{ all -> 0x055a }
            androidx.camera.core.d2$c r4 = r0.mo2660h(r4)     // Catch:{ all -> 0x055a }
            java.lang.String r0 = "Builder()\n        .setTa…tor(frameProcessorThread)"
            p455g.p470y.p472d.C10457l.m35319d(r4, r0)     // Catch:{ all -> 0x055a }
            com.facebook.react.bridge.ReadableMap r0 = r7.getFormat()     // Catch:{ all -> 0x055a }
            if (r0 != 0) goto L_0x01b7
            java.lang.String r0 = "No custom format has been set, CameraX will automatically determine best configuration..."
            android.util.Log.i(r8, r0)     // Catch:{ all -> 0x055a }
            c.d.b.t r0 = r7.getPreviewView$react_native_vision_camera_release()     // Catch:{ all -> 0x055a }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x055a }
            c.d.b.t r2 = r7.getPreviewView$react_native_vision_camera_release()     // Catch:{ all -> 0x055a }
            int r2 = r2.getWidth()     // Catch:{ all -> 0x055a }
            int r0 = com.mrousavy.camera.p168n0.C5173b.m19445a(r0, r2)     // Catch:{ all -> 0x055a }
            r15.mo3233l(r0)     // Catch:{ all -> 0x055a }
            r14.mo2770n(r0)     // Catch:{ all -> 0x055a }
            r4.mo2664l(r0)     // Catch:{ all -> 0x055a }
            r17 = r8
            r1 = 0
            goto L_0x03c1
        L_0x01b7:
            com.mrousavy.camera.n0.g r0 = new com.mrousavy.camera.n0.g     // Catch:{ all -> 0x055a }
            com.facebook.react.bridge.ReadableMap r9 = r7.getFormat()     // Catch:{ all -> 0x055a }
            p455g.p470y.p472d.C10457l.m35317b(r9)     // Catch:{ all -> 0x055a }
            r0.<init>(r9)     // Catch:{ all -> 0x055a }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x055a }
            r9.<init>()     // Catch:{ all -> 0x055a }
            java.lang.String r1 = "Using custom format - photo: "
            r9.append(r1)     // Catch:{ all -> 0x055a }
            android.util.Size r1 = r0.mo15777b()     // Catch:{ all -> 0x055a }
            r9.append(r1)     // Catch:{ all -> 0x055a }
            java.lang.String r1 = ", video: "
            r9.append(r1)     // Catch:{ all -> 0x055a }
            android.util.Size r1 = r0.mo15778c()     // Catch:{ all -> 0x055a }
            r9.append(r1)     // Catch:{ all -> 0x055a }
            java.lang.String r1 = " @ "
            r9.append(r1)     // Catch:{ all -> 0x055a }
            java.lang.Integer r1 = r7.getFps()     // Catch:{ all -> 0x055a }
            r9.append(r1)     // Catch:{ all -> 0x055a }
            java.lang.String r1 = " FPS"
            r9.append(r1)     // Catch:{ all -> 0x055a }
            java.lang.String r1 = r9.toString()     // Catch:{ all -> 0x055a }
            android.util.Log.i(r8, r1)     // Catch:{ all -> 0x055a }
            java.lang.Boolean r1 = r7.getVideo()     // Catch:{ all -> 0x055a }
            r16 = r3
            r9 = 1
            java.lang.Boolean r3 = p455g.p462v.p464k.p465a.C10397b.m35252a(r9)     // Catch:{ all -> 0x055a }
            boolean r1 = p455g.p470y.p472d.C10457l.m35316a(r1, r3)     // Catch:{ all -> 0x055a }
            if (r1 == 0) goto L_0x0211
            android.util.Size r1 = r0.mo15778c()     // Catch:{ all -> 0x055a }
        L_0x020d:
            r15.mo2602a(r1)     // Catch:{ all -> 0x055a }
            goto L_0x0216
        L_0x0211:
            android.util.Size r1 = r0.mo15777b()     // Catch:{ all -> 0x055a }
            goto L_0x020d
        L_0x0216:
            android.util.Size r1 = r0.mo15777b()     // Catch:{ all -> 0x055a }
            r14.mo2602a(r1)     // Catch:{ all -> 0x055a }
            android.util.Size r1 = r0.mo15777b()     // Catch:{ all -> 0x055a }
            r4.mo2602a(r1)     // Catch:{ all -> 0x055a }
            android.util.Size r1 = r0.mo15778c()     // Catch:{ all -> 0x055a }
            int r1 = r1.getHeight()     // Catch:{ all -> 0x055a }
            android.util.Size r3 = r0.mo15778c()     // Catch:{ all -> 0x055a }
            int r3 = r3.getWidth()     // Catch:{ all -> 0x055a }
            int r1 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x055a }
            r3 = 480(0x1e0, float:6.73E-43)
            if (r1 < 0) goto L_0x0240
            if (r1 > r3) goto L_0x0240
            r9 = 1
            goto L_0x0241
        L_0x0240:
            r9 = 0
        L_0x0241:
            if (r9 == 0) goto L_0x024d
            c.d.a.y0 r1 = p027c.p043d.p044a.C1727y0.f5140a     // Catch:{ all -> 0x055a }
            c.d.a.z0 r1 = p027c.p043d.p044a.C1731z0.m7388d(r1)     // Catch:{ all -> 0x055a }
        L_0x0249:
            r13.mo5608d(r1)     // Catch:{ all -> 0x055a }
            goto L_0x02a5
        L_0x024d:
            r9 = 720(0x2d0, float:1.009E-42)
            if (r3 > r1) goto L_0x0255
            if (r1 > r9) goto L_0x0255
            r3 = 1
            goto L_0x0256
        L_0x0255:
            r3 = 0
        L_0x0256:
            if (r3 == 0) goto L_0x0263
            c.d.a.y0 r1 = p027c.p043d.p044a.C1727y0.f5141b     // Catch:{ all -> 0x055a }
            c.d.a.q0 r3 = p027c.p043d.p044a.C1703q0.m7334b(r1)     // Catch:{ all -> 0x055a }
            c.d.a.z0 r1 = p027c.p043d.p044a.C1731z0.m7389e(r1, r3)     // Catch:{ all -> 0x055a }
            goto L_0x0249
        L_0x0263:
            r3 = 1080(0x438, float:1.513E-42)
            if (r9 > r1) goto L_0x026b
            if (r1 > r3) goto L_0x026b
            r9 = 1
            goto L_0x026c
        L_0x026b:
            r9 = 0
        L_0x026c:
            if (r9 == 0) goto L_0x0279
            c.d.a.y0 r1 = p027c.p043d.p044a.C1727y0.f5142c     // Catch:{ all -> 0x055a }
            c.d.a.q0 r3 = p027c.p043d.p044a.C1703q0.m7334b(r1)     // Catch:{ all -> 0x055a }
            c.d.a.z0 r1 = p027c.p043d.p044a.C1731z0.m7389e(r1, r3)     // Catch:{ all -> 0x055a }
            goto L_0x0249
        L_0x0279:
            r9 = 2160(0x870, float:3.027E-42)
            if (r3 > r1) goto L_0x0281
            if (r1 > r9) goto L_0x0281
            r3 = 1
            goto L_0x0282
        L_0x0281:
            r3 = 0
        L_0x0282:
            if (r3 == 0) goto L_0x028f
            c.d.a.y0 r1 = p027c.p043d.p044a.C1727y0.f5143d     // Catch:{ all -> 0x055a }
            c.d.a.q0 r3 = p027c.p043d.p044a.C1703q0.m7334b(r1)     // Catch:{ all -> 0x055a }
            c.d.a.z0 r1 = p027c.p043d.p044a.C1731z0.m7389e(r1, r3)     // Catch:{ all -> 0x055a }
            goto L_0x0249
        L_0x028f:
            if (r9 > r1) goto L_0x0297
            r3 = 4320(0x10e0, float:6.054E-42)
            if (r1 > r3) goto L_0x0297
            r1 = 1
            goto L_0x0298
        L_0x0297:
            r1 = 0
        L_0x0298:
            if (r1 == 0) goto L_0x02a5
            c.d.a.y0 r1 = p027c.p043d.p044a.C1727y0.f5145f     // Catch:{ all -> 0x055a }
            c.d.a.q0 r3 = p027c.p043d.p044a.C1703q0.m7334b(r1)     // Catch:{ all -> 0x055a }
            c.d.a.z0 r1 = p027c.p043d.p044a.C1731z0.m7389e(r1, r3)     // Catch:{ all -> 0x055a }
            goto L_0x0249
        L_0x02a5:
            java.lang.Integer r1 = r7.getFps()     // Catch:{ all -> 0x055a }
            if (r1 != 0) goto L_0x02b2
            r9 = r4
            r17 = r8
            r19 = r11
            goto L_0x0339
        L_0x02b2:
            int r1 = r1.intValue()     // Catch:{ all -> 0x055a }
            java.util.List r0 = r0.mo15776a()     // Catch:{ all -> 0x055a }
            boolean r3 = r0 instanceof java.util.Collection     // Catch:{ all -> 0x055a }
            if (r3 == 0) goto L_0x02c6
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x055a }
            if (r3 == 0) goto L_0x02c6
        L_0x02c4:
            r0 = 0
            goto L_0x02e1
        L_0x02c6:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x055a }
        L_0x02ca:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x055a }
            if (r3 == 0) goto L_0x02c4
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x055a }
            android.util.Range r3 = (android.util.Range) r3     // Catch:{ all -> 0x055a }
            java.lang.Integer r9 = p455g.p462v.p464k.p465a.C10397b.m35254c(r1)     // Catch:{ all -> 0x055a }
            boolean r3 = r3.contains(r9)     // Catch:{ all -> 0x055a }
            if (r3 == 0) goto L_0x02ca
            r0 = 1
        L_0x02e1:
            if (r0 == 0) goto L_0x0543
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r19 = r11
            double r11 = (double) r1     // Catch:{ all -> 0x055a }
            double r11 = r17 / r11
            long r11 = (long) r11     // Catch:{ all -> 0x055a }
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            r9 = r4
            long r3 = (long) r0     // Catch:{ all -> 0x055a }
            long r11 = r11 * r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x055a }
            r0.<init>()     // Catch:{ all -> 0x055a }
            java.lang.String r3 = "Setting AE_TARGET_FPS_RANGE to "
            r0.append(r3)     // Catch:{ all -> 0x055a }
            r0.append(r1)     // Catch:{ all -> 0x055a }
            r3 = 45
            r0.append(r3)     // Catch:{ all -> 0x055a }
            r0.append(r1)     // Catch:{ all -> 0x055a }
            java.lang.String r3 = ", and SENSOR_FRAME_DURATION to "
            r0.append(r3)     // Catch:{ all -> 0x055a }
            r0.append(r11)     // Catch:{ all -> 0x055a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x055a }
            android.util.Log.i(r8, r0)     // Catch:{ all -> 0x055a }
            androidx.camera.camera2.f.j r0 = new androidx.camera.camera2.f.j     // Catch:{ all -> 0x055a }
            r0.<init>(r15)     // Catch:{ all -> 0x055a }
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE     // Catch:{ all -> 0x055a }
            android.util.Range r4 = new android.util.Range     // Catch:{ all -> 0x055a }
            r17 = r8
            java.lang.Integer r8 = p455g.p462v.p464k.p465a.C10397b.m35254c(r1)     // Catch:{ all -> 0x053f }
            java.lang.Integer r1 = p455g.p462v.p464k.p465a.C10397b.m35254c(r1)     // Catch:{ all -> 0x053f }
            r4.<init>(r8, r1)     // Catch:{ all -> 0x053f }
            androidx.camera.camera2.f.j r0 = r0.mo2534a(r3, r4)     // Catch:{ all -> 0x053f }
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.SENSOR_FRAME_DURATION     // Catch:{ all -> 0x053f }
            java.lang.Long r3 = p455g.p462v.p464k.p465a.C10397b.m35255d(r11)     // Catch:{ all -> 0x053f }
            r0.mo2534a(r1, r3)     // Catch:{ all -> 0x053f }
        L_0x0339:
            java.lang.Boolean r0 = r7.getHdr()     // Catch:{ all -> 0x053f }
            r1 = 1
            java.lang.Boolean r3 = p455g.p462v.p464k.p465a.C10397b.m35252a(r1)     // Catch:{ all -> 0x053f }
            boolean r0 = p455g.p470y.p472d.C10457l.m35316a(r0, r3)     // Catch:{ all -> 0x053f }
            if (r0 == 0) goto L_0x0377
            r1 = 2
            java.lang.Integer r0 = p455g.p462v.p464k.p465a.C10397b.m35254c(r1)     // Catch:{ all -> 0x053f }
            r2.f14569q = r7     // Catch:{ all -> 0x053f }
            r2.f14570r = r10     // Catch:{ all -> 0x053f }
            r2.f14571s = r6     // Catch:{ all -> 0x053f }
            r2.f14572t = r5     // Catch:{ all -> 0x053f }
            r2.f14573u = r15     // Catch:{ all -> 0x053f }
            r2.f14574v = r14     // Catch:{ all -> 0x053f }
            r2.f14575w = r13     // Catch:{ all -> 0x053f }
            r2.f14576x = r9     // Catch:{ all -> 0x053f }
            r3 = r19
            r2.f14577y = r3     // Catch:{ all -> 0x053f }
            r1 = 2
            r2.f14568B = r1     // Catch:{ all -> 0x053f }
            java.lang.Object r0 = r5.mo15709j(r0, r2)     // Catch:{ all -> 0x053f }
            r1 = r16
            if (r0 != r1) goto L_0x036d
            return r1
        L_0x036d:
            r11 = r3
            r4 = r9
        L_0x036f:
            r9 = r4
            r3 = r11
        L_0x0371:
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r6
            r15 = r10
            goto L_0x037c
        L_0x0377:
            r1 = r16
            r3 = r19
            goto L_0x0371
        L_0x037c:
            java.lang.Boolean r0 = r7.getLowLightBoost()     // Catch:{ all -> 0x053f }
            r6 = 1
            java.lang.Boolean r8 = p455g.p462v.p464k.p465a.C10397b.m35252a(r6)     // Catch:{ all -> 0x053f }
            boolean r0 = p455g.p470y.p472d.C10457l.m35316a(r0, r8)     // Catch:{ all -> 0x053f }
            if (r0 == 0) goto L_0x03b9
            r0 = 3
            java.lang.Integer r6 = p455g.p462v.p464k.p465a.C10397b.m35254c(r0)     // Catch:{ all -> 0x053f }
            r2.f14569q = r7     // Catch:{ all -> 0x053f }
            r2.f14570r = r15     // Catch:{ all -> 0x053f }
            r2.f14571s = r14     // Catch:{ all -> 0x053f }
            r2.f14572t = r13     // Catch:{ all -> 0x053f }
            r2.f14573u = r12     // Catch:{ all -> 0x053f }
            r2.f14574v = r11     // Catch:{ all -> 0x053f }
            r2.f14575w = r9     // Catch:{ all -> 0x053f }
            r8 = 0
            r2.f14576x = r8     // Catch:{ all -> 0x053f }
            r2.f14577y = r3     // Catch:{ all -> 0x053f }
            r0 = 3
            r2.f14568B = r0     // Catch:{ all -> 0x053f }
            java.lang.Object r0 = r5.mo15709j(r6, r2)     // Catch:{ all -> 0x053f }
            if (r0 != r1) goto L_0x03ad
            return r1
        L_0x03ad:
            r2 = r7
            r5 = r9
        L_0x03af:
            r7 = r2
            r6 = r14
            r10 = r15
            r1 = 0
            r14 = r12
            r15 = r13
            r13 = r11
            r11 = r3
            r4 = r5
            goto L_0x03c1
        L_0x03b9:
            r6 = r14
            r10 = r15
            r1 = 0
            r14 = r12
            r15 = r13
            r13 = r11
            r11 = r3
            r4 = r9
        L_0x03c1:
            r7.setVideoCapture$react_native_vision_camera_release(r1)     // Catch:{ all -> 0x053f }
            r7.setImageCapture$react_native_vision_camera_release(r1)     // Catch:{ all -> 0x053f }
            r7.f14539T = r1     // Catch:{ all -> 0x053f }
            r10.mo3415l()     // Catch:{ all -> 0x053f }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x053f }
            r0.<init>()     // Catch:{ all -> 0x053f }
            java.lang.Boolean r1 = r7.getVideo()     // Catch:{ all -> 0x053f }
            r2 = 1
            java.lang.Boolean r3 = p455g.p462v.p464k.p465a.C10397b.m35252a(r2)     // Catch:{ all -> 0x053f }
            boolean r1 = p455g.p470y.p472d.C10457l.m35316a(r1, r3)     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x0410
            java.lang.String r1 = "Adding VideoCapture use-case..."
            r2 = r17
            android.util.Log.i(r2, r1)     // Catch:{ all -> 0x0558 }
            c.d.a.a1 r1 = r13.mo5606a()     // Catch:{ all -> 0x0558 }
            java.lang.String r3 = "videoRecorderBuilder.build()"
            p455g.p470y.p472d.C10457l.m35319d(r1, r3)     // Catch:{ all -> 0x0558 }
            c.d.a.f1 r1 = p027c.p043d.p044a.C1532f1.m6852Z(r1)     // Catch:{ all -> 0x0558 }
            r7.setVideoCapture$react_native_vision_camera_release(r1)     // Catch:{ all -> 0x0558 }
            c.d.a.f1 r1 = r7.getVideoCapture$react_native_vision_camera_release()     // Catch:{ all -> 0x0558 }
            p455g.p470y.p472d.C10457l.m35317b(r1)     // Catch:{ all -> 0x0558 }
            int r3 = r7.getOutputRotation()     // Catch:{ all -> 0x0558 }
            r1.mo5659X(r3)     // Catch:{ all -> 0x0558 }
            c.d.a.f1 r1 = r7.getVideoCapture$react_native_vision_camera_release()     // Catch:{ all -> 0x0558 }
            p455g.p470y.p472d.C10457l.m35317b(r1)     // Catch:{ all -> 0x0558 }
            r0.add(r1)     // Catch:{ all -> 0x0558 }
            goto L_0x0412
        L_0x0410:
            r2 = r17
        L_0x0412:
            java.lang.Boolean r1 = r7.getPhoto()     // Catch:{ all -> 0x0558 }
            r3 = 1
            java.lang.Boolean r5 = p455g.p462v.p464k.p465a.C10397b.m35252a(r3)     // Catch:{ all -> 0x0558 }
            boolean r1 = p455g.p470y.p472d.C10457l.m35316a(r1, r5)     // Catch:{ all -> 0x0558 }
            if (r1 == 0) goto L_0x0443
            boolean r1 = r7.getFallbackToSnapshot$react_native_vision_camera_release()     // Catch:{ all -> 0x0558 }
            if (r1 == 0) goto L_0x042d
            java.lang.String r1 = "Tried to add photo use-case (`photo={true}`) but the Camera device only supports a single use-case at a time. Falling back to Snapshot capture."
            android.util.Log.i(r2, r1)     // Catch:{ all -> 0x0558 }
            goto L_0x0443
        L_0x042d:
            java.lang.String r1 = "Adding ImageCapture use-case..."
            android.util.Log.i(r2, r1)     // Catch:{ all -> 0x0558 }
            androidx.camera.core.h2 r1 = r14.mo2762e()     // Catch:{ all -> 0x0558 }
            r7.setImageCapture$react_native_vision_camera_release(r1)     // Catch:{ all -> 0x0558 }
            androidx.camera.core.h2 r1 = r7.getImageCapture$react_native_vision_camera_release()     // Catch:{ all -> 0x0558 }
            p455g.p470y.p472d.C10457l.m35317b(r1)     // Catch:{ all -> 0x0558 }
            r0.add(r1)     // Catch:{ all -> 0x0558 }
        L_0x0443:
            boolean r1 = r7.getEnableFrameProcessor()     // Catch:{ all -> 0x0558 }
            if (r1 == 0) goto L_0x0466
            java.lang.String r1 = "Adding ImageAnalysis use-case..."
            android.util.Log.i(r2, r1)     // Catch:{ all -> 0x0558 }
            androidx.camera.core.d2 r1 = r4.mo2658e()     // Catch:{ all -> 0x0558 }
            java.util.concurrent.ExecutorService r3 = r7.f14532M     // Catch:{ all -> 0x0558 }
            com.mrousavy.camera.b r4 = new com.mrousavy.camera.b     // Catch:{ all -> 0x0558 }
            r4.<init>(r7)     // Catch:{ all -> 0x0558 }
            r1.mo2654W(r3, r4)     // Catch:{ all -> 0x0558 }
            g.s r3 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0558 }
            r7.f14539T = r1     // Catch:{ all -> 0x0558 }
            p455g.p470y.p472d.C10457l.m35317b(r1)     // Catch:{ all -> 0x0558 }
            r0.add(r1)     // Catch:{ all -> 0x0558 }
        L_0x0466:
            androidx.camera.core.s2 r1 = r15.mo3227e()     // Catch:{ all -> 0x0558 }
            r7.f14540U = r1     // Catch:{ all -> 0x0558 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0558 }
            r1.<init>()     // Catch:{ all -> 0x0558 }
            java.lang.String r3 = "Attaching "
            r1.append(r3)     // Catch:{ all -> 0x0558 }
            int r3 = r0.size()     // Catch:{ all -> 0x0558 }
            r1.append(r3)     // Catch:{ all -> 0x0558 }
            java.lang.String r3 = " use-cases..."
            r1.append(r3)     // Catch:{ all -> 0x0558 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0558 }
            android.util.Log.i(r2, r1)     // Catch:{ all -> 0x0558 }
            T r1 = r6.f27625f     // Catch:{ all -> 0x0558 }
            androidx.camera.core.s1 r1 = (androidx.camera.core.C0965s1) r1     // Catch:{ all -> 0x0558 }
            g.y.d.y r3 = new g.y.d.y     // Catch:{ all -> 0x0558 }
            r4 = 2
            r3.<init>(r4)     // Catch:{ all -> 0x0558 }
            androidx.camera.core.s2 r4 = r7.f14540U     // Catch:{ all -> 0x0558 }
            r3.mo25843a(r4)     // Catch:{ all -> 0x0558 }
            r4 = 0
            androidx.camera.core.a3[] r5 = new androidx.camera.core.C0608a3[r4]     // Catch:{ all -> 0x0558 }
            java.lang.Object[] r0 = r0.toArray(r5)     // Catch:{ all -> 0x0558 }
            if (r0 == 0) goto L_0x0537
            r3.mo25844b(r0)     // Catch:{ all -> 0x0558 }
            int r0 = r3.mo25845c()     // Catch:{ all -> 0x0558 }
            androidx.camera.core.a3[] r0 = new androidx.camera.core.C0608a3[r0]     // Catch:{ all -> 0x0558 }
            java.lang.Object[] r0 = r3.mo25846d(r0)     // Catch:{ all -> 0x0558 }
            androidx.camera.core.a3[] r0 = (androidx.camera.core.C0608a3[]) r0     // Catch:{ all -> 0x0558 }
            androidx.camera.core.k1 r0 = r10.mo3413c(r7, r1, r0)     // Catch:{ all -> 0x0558 }
            r7.setCamera$react_native_vision_camera_release(r0)     // Catch:{ all -> 0x0558 }
            androidx.camera.core.s2 r0 = r7.f14540U     // Catch:{ all -> 0x0558 }
            p455g.p470y.p472d.C10457l.m35317b(r0)     // Catch:{ all -> 0x0558 }
            c.d.b.t r1 = r7.getPreviewView$react_native_vision_camera_release()     // Catch:{ all -> 0x0558 }
            androidx.camera.core.s2$d r1 = r1.getSurfaceProvider()     // Catch:{ all -> 0x0558 }
            r0.mo3223S(r1)     // Catch:{ all -> 0x0558 }
            androidx.camera.core.k1 r0 = r7.getCamera$react_native_vision_camera_release()     // Catch:{ all -> 0x0558 }
            p455g.p470y.p472d.C10457l.m35317b(r0)     // Catch:{ all -> 0x0558 }
            androidx.camera.core.q1 r0 = r0.mo2380a()     // Catch:{ all -> 0x0558 }
            androidx.lifecycle.LiveData r0 = r0.mo2460h()     // Catch:{ all -> 0x0558 }
            java.lang.Object r0 = r0.mo2469e()     // Catch:{ all -> 0x0558 }
            androidx.camera.core.d3 r0 = (androidx.camera.core.C0640d3) r0     // Catch:{ all -> 0x0558 }
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x04e3
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x04e7
        L_0x04e3:
            float r0 = r0.mo2069b()     // Catch:{ all -> 0x0558 }
        L_0x04e7:
            r7.f14549g0 = r0     // Catch:{ all -> 0x0558 }
            androidx.camera.core.k1 r0 = r7.getCamera$react_native_vision_camera_release()     // Catch:{ all -> 0x0558 }
            p455g.p470y.p472d.C10457l.m35317b(r0)     // Catch:{ all -> 0x0558 }
            androidx.camera.core.q1 r0 = r0.mo2380a()     // Catch:{ all -> 0x0558 }
            androidx.lifecycle.LiveData r0 = r0.mo2460h()     // Catch:{ all -> 0x0558 }
            java.lang.Object r0 = r0.mo2469e()     // Catch:{ all -> 0x0558 }
            androidx.camera.core.d3 r0 = (androidx.camera.core.C0640d3) r0     // Catch:{ all -> 0x0558 }
            if (r0 != 0) goto L_0x0501
            goto L_0x0505
        L_0x0501:
            float r1 = r0.mo2068a()     // Catch:{ all -> 0x0558 }
        L_0x0505:
            r7.f14550h0 = r1     // Catch:{ all -> 0x0558 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0558 }
            long r0 = r0 - r11
            java.lang.String r3 = "CameraView.performance"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0558 }
            r4.<init>()     // Catch:{ all -> 0x0558 }
            java.lang.String r5 = "Session configured in "
            r4.append(r5)     // Catch:{ all -> 0x0558 }
            r4.append(r0)     // Catch:{ all -> 0x0558 }
            java.lang.String r0 = " ms! Camera: "
            r4.append(r0)     // Catch:{ all -> 0x0558 }
            androidx.camera.core.k1 r0 = r7.getCamera$react_native_vision_camera_release()     // Catch:{ all -> 0x0558 }
            p455g.p470y.p472d.C10457l.m35317b(r0)     // Catch:{ all -> 0x0558 }
            r4.append(r0)     // Catch:{ all -> 0x0558 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0558 }
            android.util.Log.i(r3, r0)     // Catch:{ all -> 0x0558 }
            com.mrousavy.camera.C5162l.m19424d(r7)     // Catch:{ all -> 0x0558 }
            g.s r0 = p455g.C10323s.f27547a
            return r0
        L_0x0537:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0558 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            r0.<init>(r1)     // Catch:{ all -> 0x0558 }
            throw r0     // Catch:{ all -> 0x0558 }
        L_0x053f:
            r0 = move-exception
            r2 = r17
            goto L_0x055c
        L_0x0543:
            r2 = r8
            com.mrousavy.camera.s r0 = new com.mrousavy.camera.s     // Catch:{ all -> 0x0558 }
            r0.<init>(r1)     // Catch:{ all -> 0x0558 }
            throw r0     // Catch:{ all -> 0x0558 }
        L_0x054a:
            r2 = r8
            com.mrousavy.camera.c0 r0 = new com.mrousavy.camera.c0     // Catch:{ all -> 0x0558 }
            r0.<init>()     // Catch:{ all -> 0x0558 }
            throw r0     // Catch:{ all -> 0x0558 }
        L_0x0551:
            r2 = r8
            com.mrousavy.camera.k r0 = new com.mrousavy.camera.k     // Catch:{ all -> 0x0558 }
            r0.<init>()     // Catch:{ all -> 0x0558 }
            throw r0     // Catch:{ all -> 0x0558 }
        L_0x0558:
            r0 = move-exception
            goto L_0x055c
        L_0x055a:
            r0 = move-exception
            r2 = r8
        L_0x055c:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r3 = "Failed to configure session: "
            java.lang.String r1 = p455g.p470y.p472d.C10457l.m35326k(r3, r1)
            android.util.Log.e(r2, r1)
            boolean r1 = r0 instanceof com.mrousavy.camera.C5152g
            if (r1 != 0) goto L_0x059a
            boolean r1 = r0 instanceof java.lang.IllegalArgumentException
            if (r1 == 0) goto L_0x0594
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L_0x0579
        L_0x0577:
            r9 = 0
            goto L_0x0586
        L_0x0579:
            java.lang.String r2 = "too many use cases"
            r3 = 2
            r4 = 0
            r5 = 0
            boolean r1 = p455g.p459d0.C10288g.m34883G(r1, r2, r5, r3, r4)
            r2 = 1
            if (r1 != r2) goto L_0x0577
            r9 = 1
        L_0x0586:
            if (r9 == 0) goto L_0x058e
            com.mrousavy.camera.f0 r1 = new com.mrousavy.camera.f0
            r1.<init>(r0)
            goto L_0x0599
        L_0x058e:
            com.mrousavy.camera.w r1 = new com.mrousavy.camera.w
            r1.<init>(r0)
            goto L_0x0599
        L_0x0594:
            com.mrousavy.camera.i0 r1 = new com.mrousavy.camera.i0
            r1.<init>(r0)
        L_0x0599:
            r0 = r1
        L_0x059a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraView.m19354p(g.v.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m19355q(CameraView cameraView, ImageProxy imageProxy) {
        C10457l.m35320e(cameraView, "this$0");
        C10457l.m35320e(imageProxy, "image");
        long currentTimeMillis = System.currentTimeMillis();
        if (((double) (currentTimeMillis - cameraView.f14542W)) > (1.0d / cameraView.f14551i0) * 1000.0d) {
            cameraView.f14542W = currentTimeMillis;
            C5151d d = cameraView.f14552j0.mo15763d();
            cameraView.frameProcessorCallback(imageProxy);
            d.mo15768a().invoke();
        }
        imageProxy.close();
        if (cameraView.m19357t()) {
            cameraView.m19356r();
        }
    }

    /* renamed from: r */
    private final void m19356r() {
        this.f14554l0 = System.currentTimeMillis();
        double floor = Math.floor(Math.min(1.0d / this.f14552j0.mo15765f(), (double) 30));
        double d = this.f14529J;
        boolean z = true;
        if (d == -1.0d) {
            this.f14551i0 = floor;
            return;
        }
        if (!(floor == this.f14553k0)) {
            if (floor != d) {
                z = false;
            }
            if (!z) {
                C5162l.m19423c(this, d, floor);
                this.f14553k0 = floor;
            }
        }
    }

    /* renamed from: t */
    private final boolean m19357t() {
        return System.currentTimeMillis() - this.f14554l0 > 1000;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final void m19361y(CameraView cameraView, ArrayList arrayList) {
        C10457l.m35320e(cameraView, "this$0");
        C10457l.m35320e(arrayList, "$changedProps");
        C10812n1 unused = C10776k.m36628d(cameraView.getCoroutineScope$react_native_vision_camera_release(), (C10381g) null, (C10810n0) null, new C5126f(arrayList, cameraView, (C10376d<? super C5126f>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m19362z() {
        C1292h hVar;
        C1286d.C1288b b = this.f14547e0.mo4339b();
        C10457l.m35319d(b, "lifecycleRegistry.currentState");
        C1286d.C1288b bVar = this.f14548f0;
        C1286d.C1288b bVar2 = C1286d.C1288b.RESUMED;
        if (bVar == bVar2) {
            if (!this.f14524E || !isAttachedToWindow()) {
                hVar = this.f14547e0;
                bVar2 = C1286d.C1288b.CREATED;
            } else {
                hVar = this.f14547e0;
            }
            hVar.mo4344p(bVar2);
        } else {
            this.f14547e0.mo4344p(bVar);
        }
        Log.d("CameraView", "Lifecycle went from " + b.name() + " -> " + this.f14547e0.mo4339b().name() + " (isActive: " + this.f14524E + " | isAttachedToWindow: " + isAttachedToWindow() + ')');
    }

    public final C1516b1 getActiveVideoRecording$react_native_vision_camera_release() {
        return this.f14541V;
    }

    public final Boolean getAudio() {
        return this.f14562x;
    }

    public final C0930k1 getCamera$react_native_vision_camera_release() {
        return this.f14536Q;
    }

    public final String getCameraId() {
        return this.f14556r;
    }

    public final String getColorSpace() {
        return this.f14522C;
    }

    public final C10784l0 getCoroutineScope$react_native_vision_camera_release() {
        return this.f14535P;
    }

    public final boolean getEnableDepthData() {
        return this.f14557s;
    }

    public final boolean getEnableFrameProcessor() {
        return this.f14563y;
    }

    public final Boolean getEnableHighQualityPhotos() {
        return this.f14558t;
    }

    public final boolean getEnablePortraitEffectsMatteDelivery() {
        return this.f14559u;
    }

    public final boolean getEnableZoomGesture() {
        return this.f14528I;
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    public final boolean getFallbackToSnapshot$react_native_vision_camera_release() {
        String str;
        Boolean bool = this.f14561w;
        Boolean bool2 = Boolean.TRUE;
        if ((C10457l.m35316a(bool, bool2) || this.f14563y) && (str = this.f14556r) != null) {
            Object systemService = getReactContext().getSystemService("camera");
            CameraManager cameraManager = systemService instanceof CameraManager ? (CameraManager) systemService : null;
            if (cameraManager != null) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                C10457l.m35319d(cameraCharacteristics, "cameraManger.getCameraCharacteristics(cameraId)");
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                if (num != null && num.intValue() == 2) {
                    return true;
                }
                return C10457l.m35316a(getVideo(), bool2) && getEnableFrameProcessor();
            }
        }
        return false;
    }

    public final ReadableMap getFormat() {
        return this.f14564z;
    }

    public final Integer getFps() {
        return this.f14520A;
    }

    public final double getFrameProcessorFps() {
        return this.f14529J;
    }

    public final Boolean getHdr() {
        return this.f14521B;
    }

    public final C0693h2 getImageCapture$react_native_vision_camera_release() {
        return this.f14537R;
    }

    public C1286d getLifecycle() {
        return this.f14547e0;
    }

    public final Boolean getLowLightBoost() {
        return this.f14523D;
    }

    public final String getOrientation() {
        return this.f14527H;
    }

    public final Boolean getPhoto() {
        return this.f14560v;
    }

    public final C1759t getPreviewView$react_native_vision_camera_release() {
        return this.f14531L;
    }

    public final ExecutorService getRecordVideoExecutor$react_native_vision_camera_release() {
        return this.f14534O;
    }

    public final ExecutorService getTakePhotoExecutor$react_native_vision_camera_release() {
        return this.f14533N;
    }

    public final String getTorch() {
        return this.f14525F;
    }

    public final Boolean getVideo() {
        return this.f14561w;
    }

    public final C1532f1<C1502a1> getVideoCapture$react_native_vision_camera_release() {
        return this.f14538S;
    }

    public final float getZoom() {
        return this.f14526G;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m19362z();
        if (!this.f14530K) {
            this.f14530K = true;
            C5162l.m19425e(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m19339A();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m19362z();
    }

    /* renamed from: s */
    public final boolean mo15680s() {
        return this.f14524E;
    }

    public final void setActive(boolean z) {
        this.f14524E = z;
    }

    public final void setActiveVideoRecording$react_native_vision_camera_release(C1516b1 b1Var) {
        this.f14541V = b1Var;
    }

    public final void setAudio(Boolean bool) {
        this.f14562x = bool;
    }

    public final void setCamera$react_native_vision_camera_release(C0930k1 k1Var) {
        this.f14536Q = k1Var;
    }

    public final void setCameraId(String str) {
        this.f14556r = str;
    }

    public final void setColorSpace(String str) {
        this.f14522C = str;
    }

    public final void setCoroutineScope$react_native_vision_camera_release(C10784l0 l0Var) {
        C10457l.m35320e(l0Var, "<set-?>");
        this.f14535P = l0Var;
    }

    public final void setEnableDepthData(boolean z) {
        this.f14557s = z;
    }

    public final void setEnableFrameProcessor(boolean z) {
        this.f14563y = z;
    }

    public final void setEnableHighQualityPhotos(Boolean bool) {
        this.f14558t = bool;
    }

    public final void setEnablePortraitEffectsMatteDelivery(boolean z) {
        this.f14559u = z;
    }

    public final void setEnableZoomGesture(boolean z) {
        this.f14528I = z;
        setOnTouchListener(z ? this.f14546d0 : null);
    }

    public final void setFormat(ReadableMap readableMap) {
        this.f14564z = readableMap;
    }

    public final void setFps(Integer num) {
        this.f14520A = num;
    }

    public final void setFrameProcessorFps(double d) {
        this.f14529J = d;
        if (d == -1.0d) {
            d = 30.0d;
        }
        this.f14551i0 = d;
        this.f14554l0 = System.currentTimeMillis();
        this.f14552j0.mo15764e();
    }

    public final void setHdr(Boolean bool) {
        this.f14521B = bool;
    }

    public final void setImageCapture$react_native_vision_camera_release(C0693h2 h2Var) {
        this.f14537R = h2Var;
    }

    public final void setLowLightBoost(Boolean bool) {
        this.f14523D = bool;
    }

    public final void setOrientation(String str) {
        this.f14527H = str;
    }

    public final void setPhoto(Boolean bool) {
        this.f14560v = bool;
    }

    public final void setTorch(String str) {
        C10457l.m35320e(str, "<set-?>");
        this.f14525F = str;
    }

    public final void setVideo(Boolean bool) {
        this.f14561w = bool;
    }

    public final void setVideoCapture$react_native_vision_camera_release(C1532f1<C1502a1> f1Var) {
        this.f14538S = f1Var;
    }

    public final void setZoom(float f) {
        this.f14526G = f;
    }

    /* renamed from: x */
    public final boolean mo15705x(ArrayList<String> arrayList) {
        C10457l.m35320e(arrayList, "changedProps");
        return this.f14531L.post(new C5138c(this, arrayList));
    }
}
