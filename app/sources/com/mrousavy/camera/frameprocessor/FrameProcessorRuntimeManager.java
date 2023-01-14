package com.mrousavy.camera.frameprocessor;

import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import p174e.p247e.p317m.p318a.C6410a;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

public final class FrameProcessorRuntimeManager {

    /* renamed from: a */
    public static final C5146a f14632a = new C5146a((C10452g) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final ArrayList<FrameProcessorPlugin> f14633b = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f14634c;

    /* renamed from: d */
    private WeakReference<ReactApplicationContext> f14635d;

    /* renamed from: e */
    private VisionCameraScheduler f14636e;
    @C6410a
    private HybridData mHybridData;

    /* renamed from: com.mrousavy.camera.frameprocessor.FrameProcessorRuntimeManager$a */
    public static final class C5146a {
        private C5146a() {
        }

        public /* synthetic */ C5146a(C10452g gVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo15759a() {
            return FrameProcessorRuntimeManager.f14634c;
        }

        /* renamed from: b */
        public final ArrayList<FrameProcessorPlugin> mo15760b() {
            return FrameProcessorRuntimeManager.f14633b;
        }
    }

    static {
        f14634c = true;
        try {
            System.loadLibrary("reanimated");
            System.loadLibrary("VisionCamera");
        } catch (UnsatisfiedLinkError unused) {
            Log.w("FrameProcessorRuntime", "Failed to load Reanimated/VisionCamera C++ library. Frame Processors are disabled!");
            f14634c = false;
        }
    }

    public FrameProcessorRuntimeManager(ReactApplicationContext reactApplicationContext, ExecutorService executorService) {
        C10457l.m35320e(reactApplicationContext, "context");
        C10457l.m35320e(executorService, "frameProcessorThread");
        if (f14634c) {
            CallInvokerHolder jSCallInvokerHolder = reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder();
            Objects.requireNonNull(jSCallInvokerHolder, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.CallInvokerHolderImpl");
            this.f14636e = new VisionCameraScheduler(executorService);
            this.f14635d = new WeakReference<>(reactApplicationContext);
            long j = reactApplicationContext.getJavaScriptContextHolder().get();
            VisionCameraScheduler visionCameraScheduler = this.f14636e;
            C10457l.m35317b(visionCameraScheduler);
            this.mHybridData = initHybrid(j, (CallInvokerHolderImpl) jSCallInvokerHolder, visionCameraScheduler);
            initializeRuntime();
            Log.i("FrameProcessorRuntime", "Installing Frame Processor Plugins...");
            for (FrameProcessorPlugin registerPlugin : f14633b) {
                registerPlugin(registerPlugin);
            }
            Log.i("FrameProcessorRuntime", "Successfully installed " + f14633b.size() + " Frame Processor Plugins!");
            Log.i("FrameProcessorRuntime", "Installing JSI Bindings on JS Thread...");
            reactApplicationContext.runOnJSQueueThread(new C5147a(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m19402a(FrameProcessorRuntimeManager frameProcessorRuntimeManager) {
        C10457l.m35320e(frameProcessorRuntimeManager, "this$0");
        frameProcessorRuntimeManager.installJSIBindings();
    }

    private final native HybridData initHybrid(long j, CallInvokerHolderImpl callInvokerHolderImpl, VisionCameraScheduler visionCameraScheduler);

    private final native void initializeRuntime();

    private final native void installJSIBindings();

    private final native void registerPlugin(FrameProcessorPlugin frameProcessorPlugin);

    /* JADX WARNING: type inference failed for: r2v4, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @p174e.p247e.p317m.p318a.C6410a
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.mrousavy.camera.CameraView findCameraViewById(int r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Finding view "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = "..."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FrameProcessorRuntime"
            android.util.Log.d(r1, r0)
            java.lang.ref.WeakReference<com.facebook.react.bridge.ReactApplicationContext> r0 = r5.f14635d
            r2 = 0
            if (r0 != 0) goto L_0x0022
            r0 = r2
            goto L_0x0028
        L_0x0022:
            java.lang.Object r0 = r0.get()
            com.facebook.react.bridge.ReactApplicationContext r0 = (com.facebook.react.bridge.ReactApplicationContext) r0
        L_0x0028:
            if (r0 == 0) goto L_0x0037
            com.facebook.react.bridge.UIManager r0 = com.facebook.react.uimanager.C3051u0.m12089f(r0, r6)
            if (r0 != 0) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            android.view.View r2 = r0.resolveView(r6)
        L_0x0035:
            com.mrousavy.camera.CameraView r2 = (com.mrousavy.camera.CameraView) r2
        L_0x0037:
            r0 = 33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            if (r2 == 0) goto L_0x0043
            r3.<init>()
            java.lang.String r4 = "Found view "
            goto L_0x0048
        L_0x0043:
            r3.<init>()
            java.lang.String r4 = "Couldn't find view "
        L_0x0048:
            r3.append(r4)
            r3.append(r6)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.d(r1, r0)
            if (r2 == 0) goto L_0x005b
            return r2
        L_0x005b:
            com.mrousavy.camera.l0 r0 = new com.mrousavy.camera.l0
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.frameprocessor.FrameProcessorRuntimeManager.findCameraViewById(int):com.mrousavy.camera.CameraView");
    }
}
