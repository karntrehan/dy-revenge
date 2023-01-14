package com.mrousavy.camera;

import android.app.Activity;
import android.os.Build;
import androidx.core.content.C1135a;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.C2802e;
import com.facebook.react.p109b0.p110a.C2639a;
import com.mrousavy.camera.frameprocessor.FrameProcessorRuntimeManager;
import com.mrousavy.camera.p168n0.C5174c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.C10784l0;
import kotlinx.coroutines.C10789m0;
import kotlinx.coroutines.C10810n0;
import kotlinx.coroutines.C10812n1;
import kotlinx.coroutines.C10846x0;
import p455g.C10318n;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p462v.C10381g;
import p455g.p462v.p464k.p465a.C10401f;
import p455g.p462v.p464k.p465a.C10407k;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

@C2639a(name = "CameraView")
public final class CameraViewModule extends ReactContextBaseJavaModule {
    public static final C5128a Companion = new C5128a((C10452g) null);
    /* access modifiers changed from: private */
    public static int RequestCode = 10;
    public static final String TAG = "CameraView";
    private final C10784l0 coroutineScope = C10789m0.m36646a(C10846x0.m36935a());
    private FrameProcessorRuntimeManager frameProcessorManager;
    private ExecutorService frameProcessorThread;

    /* renamed from: com.mrousavy.camera.CameraViewModule$a */
    public static final class C5128a {
        private C5128a() {
        }

        public /* synthetic */ C5128a(C10452g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo15747a(int i) {
            return i != -1 ? i != 0 ? "not-determined" : "authorized" : "denied";
        }
    }

    @C10401f(mo25797c = "com.mrousavy.camera.CameraViewModule$focus$1", mo25798f = "CameraViewModule.kt", mo25799l = {162}, mo25800m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$b */
    static final class C5129b extends C10407k implements C10434p<C10784l0, C10376d<? super C10323s>, Object> {

        /* renamed from: r */
        Object f14591r;

        /* renamed from: s */
        int f14592s;

        /* renamed from: t */
        final /* synthetic */ Promise f14593t;

        /* renamed from: u */
        final /* synthetic */ CameraViewModule f14594u;

        /* renamed from: v */
        final /* synthetic */ int f14595v;

        /* renamed from: w */
        final /* synthetic */ ReadableMap f14596w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5129b(Promise promise, CameraViewModule cameraViewModule, int i, ReadableMap readableMap, C10376d<? super C5129b> dVar) {
            super(2, dVar);
            this.f14593t = promise;
            this.f14594u = cameraViewModule;
            this.f14595v = i;
            this.f14596w = readableMap;
        }

        /* renamed from: b */
        public final C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
            return new C5129b(this.f14593t, this.f14594u, this.f14595v, this.f14596w, dVar);
        }

        /* renamed from: n */
        public final Object mo15707n(Object obj) {
            C5152g th;
            Promise promise;
            Object c = C10395d.m35244c();
            int i = this.f14592s;
            if (i == 0) {
                C10318n.m35017b(obj);
                Promise promise2 = this.f14593t;
                CameraViewModule cameraViewModule = this.f14594u;
                int i2 = this.f14595v;
                ReadableMap readableMap = this.f14596w;
                try {
                    CameraView access$findCameraView = cameraViewModule.findCameraView(i2);
                    this.f14591r = promise2;
                    this.f14592s = 1;
                    if (C5164m.m19426a(access$findCameraView, readableMap, this) == c) {
                        return c;
                    }
                    promise = promise2;
                } catch (Throwable th2) {
                    C5152g gVar = th2;
                    promise = promise2;
                    th = gVar;
                    th.printStackTrace();
                    C5152g i0Var = th instanceof C5152g ? th : new C5157i0(th);
                    promise.reject(i0Var.mo15772a() + '/' + i0Var.mo15773b(), i0Var.getMessage(), i0Var.getCause());
                    return C10323s.f27547a;
                }
            } else if (i == 1) {
                promise = (Promise) this.f14591r;
                try {
                    C10318n.m35017b(obj);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            promise.resolve((Object) null);
            return C10323s.f27547a;
        }

        /* renamed from: q */
        public final Object mo15709j(C10784l0 l0Var, C10376d<? super C10323s> dVar) {
            return ((C5129b) mo15708b(l0Var, dVar)).mo15707n(C10323s.f27547a);
        }
    }

    @C10401f(mo25797c = "com.mrousavy.camera.CameraViewModule$getAvailableCameraDevices$1", mo25798f = "CameraViewModule.kt", mo25799l = {175, 176, 177}, mo25800m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$c */
    static final class C5130c extends C10407k implements C10434p<C10784l0, C10376d<? super C10323s>, Object> {

        /* renamed from: r */
        Object f14597r;

        /* renamed from: s */
        Object f14598s;

        /* renamed from: t */
        Object f14599t;

        /* renamed from: u */
        Object f14600u;

        /* renamed from: v */
        long f14601v;

        /* renamed from: w */
        int f14602w;

        /* renamed from: x */
        final /* synthetic */ Promise f14603x;

        /* renamed from: y */
        final /* synthetic */ CameraViewModule f14604y;

        /* renamed from: z */
        final /* synthetic */ long f14605z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5130c(Promise promise, CameraViewModule cameraViewModule, long j, C10376d<? super C5130c> dVar) {
            super(2, dVar);
            this.f14603x = promise;
            this.f14604y = cameraViewModule;
            this.f14605z = j;
        }

        /* renamed from: b */
        public final C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
            return new C5130c(this.f14603x, this.f14604y, this.f14605z, dVar);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:142|143) */
        /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
            r13 = r27;
            android.util.Log.e(r13, "Minimum Frame Duration for MediaRecorder Output cannot be calculated, format \"" + r2 + "\" is not supported.");
            r27 = r7;
            r12 = null;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:142:0x0415 */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x02af A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x02b7 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x02b9 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x02cb A[SYNTHETIC, Splitter:B:108:0x02cb] */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x02ea A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x030b A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0348 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x035e A[Catch:{ all -> 0x0644, all -> 0x0676 }, LOOP:2: B:119:0x035c->B:120:0x035e, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x0385 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x0387 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x03ce A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:154:0x0471 A[Catch:{ all -> 0x0644, all -> 0x0676 }, LOOP:6: B:153:0x046f->B:154:0x0471, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:157:0x04c1 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:160:0x04d5 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:162:0x04d9 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:165:0x04e8 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:169:0x0515 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:181:0x054d A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:182:0x054f A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:185:0x055f A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:186:0x0561 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:189:0x0571 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:190:0x0573 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:193:0x057b A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:194:0x057d A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:197:0x058a A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:198:0x058c A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:201:0x059c A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:202:0x059d A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:208:0x05bf A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:209:0x05c1 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:222:0x067a A[Catch:{ all -> 0x0680 }] */
        /* JADX WARNING: Removed duplicated region for block: B:227:0x0688  */
        /* JADX WARNING: Removed duplicated region for block: B:228:0x068b  */
        /* JADX WARNING: Removed duplicated region for block: B:241:0x053f A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c8 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00c9  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00dc A[Catch:{ all -> 0x0680 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00df A[Catch:{ all -> 0x0680 }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00e2 A[Catch:{ all -> 0x0680 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01c1 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x01c6 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x01f0 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x01f9 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0200 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0209 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0253 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x027b A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x027d A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0285 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0287 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x028f A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0291 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0299 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x029b A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x02a3 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x02a5 A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x02ad A[Catch:{ all -> 0x0644, all -> 0x0676 }] */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo15707n(java.lang.Object r52) {
            /*
                r51 = this;
                r1 = r51
                java.lang.String r0 = "cameraConfig.outputFormats"
                java.lang.String r2 = "id"
                java.lang.Object r3 = p455g.p462v.p463j.C10395d.m35244c()
                int r4 = r1.f14602w
                java.lang.String r5 = "getInstance(reactApplicationContext)"
                r6 = 3
                r7 = 2
                r8 = 1
                if (r4 == 0) goto L_0x0060
                if (r4 == r8) goto L_0x0050
                if (r4 == r7) goto L_0x0038
                if (r4 != r6) goto L_0x0030
                long r3 = r1.f14601v
                java.lang.Object r5 = r1.f14600u
                androidx.camera.lifecycle.e r5 = (androidx.camera.lifecycle.C1083e) r5
                java.lang.Object r9 = r1.f14599t
                androidx.camera.extensions.ExtensionsManager r9 = (androidx.camera.extensions.ExtensionsManager) r9
                java.lang.Object r10 = r1.f14598s
                com.mrousavy.camera.CameraViewModule r10 = (com.mrousavy.camera.CameraViewModule) r10
                java.lang.Object r11 = r1.f14597r
                com.facebook.react.bridge.Promise r11 = (com.facebook.react.bridge.Promise) r11
                p455g.C10318n.m35017b(r52)     // Catch:{ all -> 0x0680 }
                goto L_0x00ce
            L_0x0030:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0038:
                long r9 = r1.f14601v
                java.lang.Object r4 = r1.f14599t
                androidx.camera.lifecycle.e r4 = (androidx.camera.lifecycle.C1083e) r4
                java.lang.Object r11 = r1.f14598s
                com.mrousavy.camera.CameraViewModule r11 = (com.mrousavy.camera.CameraViewModule) r11
                java.lang.Object r12 = r1.f14597r
                com.facebook.react.bridge.Promise r12 = (com.facebook.react.bridge.Promise) r12
                p455g.C10318n.m35017b(r52)     // Catch:{ all -> 0x004c }
                r13 = r52
                goto L_0x00a9
            L_0x004c:
                r0 = move-exception
                r11 = r12
                goto L_0x0681
            L_0x0050:
                long r9 = r1.f14601v
                java.lang.Object r4 = r1.f14598s
                com.mrousavy.camera.CameraViewModule r4 = (com.mrousavy.camera.CameraViewModule) r4
                java.lang.Object r11 = r1.f14597r
                com.facebook.react.bridge.Promise r11 = (com.facebook.react.bridge.Promise) r11
                p455g.C10318n.m35017b(r52)     // Catch:{ all -> 0x0680 }
                r12 = r52
                goto L_0x0083
            L_0x0060:
                p455g.C10318n.m35017b(r52)
                com.facebook.react.bridge.Promise r11 = r1.f14603x
                com.mrousavy.camera.CameraViewModule r4 = r1.f14604y
                long r9 = r1.f14605z
                com.facebook.react.bridge.ReactApplicationContext r12 = r4.getReactApplicationContext()     // Catch:{ all -> 0x0680 }
                e.f.b.a.a.b r12 = androidx.camera.lifecycle.C1083e.m4160d(r12)     // Catch:{ all -> 0x0680 }
                p455g.p470y.p472d.C10457l.m35319d(r12, r5)     // Catch:{ all -> 0x0680 }
                r1.f14597r = r11     // Catch:{ all -> 0x0680 }
                r1.f14598s = r4     // Catch:{ all -> 0x0680 }
                r1.f14601v = r9     // Catch:{ all -> 0x0680 }
                r1.f14602w = r8     // Catch:{ all -> 0x0680 }
                java.lang.Object r12 = kotlinx.coroutines.p505k2.C10780a.m36633b(r12, r1)     // Catch:{ all -> 0x0680 }
                if (r12 != r3) goto L_0x0083
                return r3
            L_0x0083:
                androidx.camera.lifecycle.e r12 = (androidx.camera.lifecycle.C1083e) r12     // Catch:{ all -> 0x0680 }
                com.facebook.react.bridge.ReactApplicationContext r13 = r4.getReactApplicationContext()     // Catch:{ all -> 0x0680 }
                e.f.b.a.a.b r13 = androidx.camera.extensions.ExtensionsManager.m3952b(r13, r12)     // Catch:{ all -> 0x0680 }
                java.lang.String r14 = "getInstanceAsync(reactAp…nContext, cameraProvider)"
                p455g.p470y.p472d.C10457l.m35319d(r13, r14)     // Catch:{ all -> 0x0680 }
                r1.f14597r = r11     // Catch:{ all -> 0x0680 }
                r1.f14598s = r4     // Catch:{ all -> 0x0680 }
                r1.f14599t = r12     // Catch:{ all -> 0x0680 }
                r1.f14601v = r9     // Catch:{ all -> 0x0680 }
                r1.f14602w = r7     // Catch:{ all -> 0x0680 }
                java.lang.Object r13 = kotlinx.coroutines.p505k2.C10780a.m36633b(r13, r1)     // Catch:{ all -> 0x0680 }
                if (r13 != r3) goto L_0x00a3
                return r3
            L_0x00a3:
                r50 = r11
                r11 = r4
                r4 = r12
                r12 = r50
            L_0x00a9:
                androidx.camera.extensions.ExtensionsManager r13 = (androidx.camera.extensions.ExtensionsManager) r13     // Catch:{ all -> 0x004c }
                com.facebook.react.bridge.ReactApplicationContext r14 = r11.getReactApplicationContext()     // Catch:{ all -> 0x004c }
                e.f.b.a.a.b r14 = androidx.camera.lifecycle.C1083e.m4160d(r14)     // Catch:{ all -> 0x004c }
                p455g.p470y.p472d.C10457l.m35319d(r14, r5)     // Catch:{ all -> 0x004c }
                r1.f14597r = r12     // Catch:{ all -> 0x004c }
                r1.f14598s = r11     // Catch:{ all -> 0x004c }
                r1.f14599t = r13     // Catch:{ all -> 0x004c }
                r1.f14600u = r4     // Catch:{ all -> 0x004c }
                r1.f14601v = r9     // Catch:{ all -> 0x004c }
                r1.f14602w = r6     // Catch:{ all -> 0x004c }
                java.lang.Object r5 = kotlinx.coroutines.p505k2.C10780a.m36633b(r14, r1)     // Catch:{ all -> 0x004c }
                if (r5 != r3) goto L_0x00c9
                return r3
            L_0x00c9:
                r5 = r4
                r3 = r9
                r10 = r11
                r11 = r12
                r9 = r13
            L_0x00ce:
                com.facebook.react.bridge.ReactApplicationContext r10 = r10.getReactApplicationContext()     // Catch:{ all -> 0x0680 }
                java.lang.String r12 = "camera"
                java.lang.Object r10 = r10.getSystemService(r12)     // Catch:{ all -> 0x0680 }
                boolean r12 = r10 instanceof android.hardware.camera2.CameraManager     // Catch:{ all -> 0x0680 }
                if (r12 == 0) goto L_0x00df
                android.hardware.camera2.CameraManager r10 = (android.hardware.camera2.CameraManager) r10     // Catch:{ all -> 0x0680 }
                goto L_0x00e0
            L_0x00df:
                r10 = 0
            L_0x00e0:
                if (r10 == 0) goto L_0x067a
                com.facebook.react.bridge.WritableArray r12 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ all -> 0x0680 }
                java.lang.String r14 = "createArray()"
                p455g.p470y.p472d.C10457l.m35319d(r12, r14)     // Catch:{ all -> 0x0680 }
                java.lang.String[] r14 = r10.getCameraIdList()     // Catch:{ all -> 0x0680 }
                java.lang.String r15 = "manager.cameraIdList"
                p455g.p470y.p472d.C10457l.m35319d(r14, r15)     // Catch:{ all -> 0x0680 }
                int r15 = r14.length     // Catch:{ all -> 0x0680 }
                r13 = 0
            L_0x00f6:
                java.lang.String r8 = "CameraView"
                if (r13 >= r15) goto L_0x0648
                r7 = r14[r13]     // Catch:{ all -> 0x0644 }
                int r13 = r13 + 1
                androidx.camera.core.s1$a r6 = new androidx.camera.core.s1$a     // Catch:{ all -> 0x0644 }
                r6.<init>()     // Catch:{ all -> 0x0644 }
                p455g.p470y.p472d.C10457l.m35319d(r7, r2)     // Catch:{ all -> 0x0644 }
                androidx.camera.core.s1$a r6 = com.mrousavy.camera.p168n0.C5176e.m19451a(r6, r7)     // Catch:{ all -> 0x0644 }
                androidx.camera.core.s1 r6 = r6.mo3218b()     // Catch:{ all -> 0x0644 }
                java.lang.String r1 = "Builder().byID(id).build()"
                p455g.p470y.p472d.C10457l.m35319d(r6, r1)     // Catch:{ all -> 0x0644 }
                android.hardware.camera2.CameraCharacteristics r1 = r10.getCameraCharacteristics(r7)     // Catch:{ all -> 0x0644 }
                r18 = r10
                java.lang.String r10 = "manager.getCameraCharacteristics(id)"
                p455g.p470y.p472d.C10457l.m35319d(r1, r10)     // Catch:{ all -> 0x0644 }
                android.hardware.camera2.CameraCharacteristics$Key r10 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ all -> 0x0644 }
                java.lang.Object r10 = r1.get(r10)     // Catch:{ all -> 0x0644 }
                p455g.p470y.p472d.C10457l.m35317b(r10)     // Catch:{ all -> 0x0644 }
                r19 = r13
                java.lang.String r13 = "characteristics.get(Came…PPORTED_HARDWARE_LEVEL)!!"
                p455g.p470y.p472d.C10457l.m35319d(r10, r13)     // Catch:{ all -> 0x0644 }
                java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ all -> 0x0644 }
                int r10 = r10.intValue()     // Catch:{ all -> 0x0644 }
                android.hardware.camera2.CameraCharacteristics$Key r13 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES     // Catch:{ all -> 0x0644 }
                java.lang.Object r13 = r1.get(r13)     // Catch:{ all -> 0x0644 }
                p455g.p470y.p472d.C10457l.m35317b(r13)     // Catch:{ all -> 0x0644 }
                r20 = r14
                java.lang.String r14 = "characteristics.get(Came…AVAILABLE_CAPABILITIES)!!"
                p455g.p470y.p472d.C10457l.m35319d(r13, r14)     // Catch:{ all -> 0x0644 }
                int[] r13 = (int[]) r13     // Catch:{ all -> 0x0644 }
                int r14 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0644 }
                r21 = r15
                r15 = 28
                if (r14 < r15) goto L_0x015a
                r15 = 11
                boolean r15 = p455g.p460t.C10343h.m35083n(r13, r15)     // Catch:{ all -> 0x0680 }
                if (r15 == 0) goto L_0x015a
                r23 = r11
                r15 = 1
                goto L_0x015d
            L_0x015a:
                r23 = r11
                r15 = 0
            L_0x015d:
                com.facebook.react.bridge.ReadableArray r11 = com.mrousavy.camera.p168n0.C5175d.m19449a(r1)     // Catch:{ all -> 0x0676 }
                r24 = r3
                android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ all -> 0x0676 }
                java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0676 }
                p455g.p470y.p472d.C10457l.m35317b(r3)     // Catch:{ all -> 0x0676 }
                java.lang.String r4 = "characteristics.get(Came…REAM_CONFIGURATION_MAP)!!"
                p455g.p470y.p472d.C10457l.m35319d(r3, r4)     // Catch:{ all -> 0x0676 }
                android.hardware.camera2.params.StreamConfigurationMap r3 = (android.hardware.camera2.params.StreamConfigurationMap) r3     // Catch:{ all -> 0x0676 }
                android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ all -> 0x0676 }
                java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0676 }
                p455g.p470y.p472d.C10457l.m35317b(r4)     // Catch:{ all -> 0x0676 }
                r26 = r12
                java.lang.String r12 = "characteristics.get(Came…cteristics.LENS_FACING)!!"
                p455g.p470y.p472d.C10457l.m35319d(r4, r12)     // Catch:{ all -> 0x0676 }
                java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ all -> 0x0676 }
                int r4 = r4.intValue()     // Catch:{ all -> 0x0676 }
                android.hardware.camera2.CameraCharacteristics$Key r12 = android.hardware.camera2.CameraCharacteristics.FLASH_INFO_AVAILABLE     // Catch:{ all -> 0x0676 }
                java.lang.Object r12 = r1.get(r12)     // Catch:{ all -> 0x0676 }
                p455g.p470y.p472d.C10457l.m35317b(r12)     // Catch:{ all -> 0x0676 }
                r27 = r8
                java.lang.String r8 = "characteristics.get(Came…s.FLASH_INFO_AVAILABLE)!!"
                p455g.p470y.p472d.C10457l.m35319d(r12, r8)     // Catch:{ all -> 0x0676 }
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x0676 }
                boolean r8 = r12.booleanValue()     // Catch:{ all -> 0x0676 }
                android.hardware.camera2.CameraCharacteristics$Key r12 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM     // Catch:{ all -> 0x0676 }
                java.lang.Object r12 = r1.get(r12)     // Catch:{ all -> 0x0676 }
                p455g.p470y.p472d.C10457l.m35317b(r12)     // Catch:{ all -> 0x0676 }
                r28 = r0
                java.lang.String r0 = "characteristics.get(Came…LABLE_MAX_DIGITAL_ZOOM)!!"
                p455g.p470y.p472d.C10457l.m35319d(r12, r0)     // Catch:{ all -> 0x0676 }
                java.lang.Number r12 = (java.lang.Number) r12     // Catch:{ all -> 0x0676 }
                float r0 = r12.floatValue()     // Catch:{ all -> 0x0676 }
                r12 = 23
                if (r14 < r12) goto L_0x01c6
                r12 = 8
                boolean r12 = p455g.p460t.C10343h.m35083n(r13, r12)     // Catch:{ all -> 0x0676 }
                if (r12 == 0) goto L_0x01c6
                r29 = r3
                r3 = 3
                r12 = 1
                goto L_0x01ca
            L_0x01c6:
                r29 = r3
                r3 = 3
                r12 = 0
            L_0x01ca:
                boolean r13 = p455g.p460t.C10343h.m35083n(r13, r3)     // Catch:{ all -> 0x0676 }
                android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE     // Catch:{ all -> 0x0676 }
                java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0676 }
                android.util.Range r3 = (android.util.Range) r3     // Catch:{ all -> 0x0676 }
                r30 = r3
                android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES     // Catch:{ all -> 0x0676 }
                java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0676 }
                int[] r3 = (int[]) r3     // Catch:{ all -> 0x0676 }
                r31 = r3
                android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION     // Catch:{ all -> 0x0676 }
                java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0676 }
                int[] r3 = (int[]) r3     // Catch:{ all -> 0x0676 }
                r32 = r3
                r3 = 30
                if (r14 < r3) goto L_0x01f9
                android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE     // Catch:{ all -> 0x0676 }
                java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0676 }
                android.util.Range r3 = (android.util.Range) r3     // Catch:{ all -> 0x0676 }
                goto L_0x01fa
            L_0x01f9:
                r3 = 0
            L_0x01fa:
                r33 = r5
                r5 = 28
                if (r14 < r5) goto L_0x0209
                android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.INFO_VERSION     // Catch:{ all -> 0x0676 }
                java.lang.Object r5 = r1.get(r5)     // Catch:{ all -> 0x0676 }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0676 }
                goto L_0x020a
            L_0x0209:
                r5 = 0
            L_0x020a:
                android.hardware.camera2.CameraCharacteristics$Key r14 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES     // Catch:{ all -> 0x0676 }
                java.lang.Object r14 = r1.get(r14)     // Catch:{ all -> 0x0676 }
                p455g.p470y.p472d.C10457l.m35317b(r14)     // Catch:{ all -> 0x0676 }
                r22 = r0
                java.lang.String r0 = "characteristics.get(Came…ABLE_TARGET_FPS_RANGES)!!"
                p455g.p470y.p472d.C10457l.m35319d(r14, r0)     // Catch:{ all -> 0x0676 }
                android.util.Range[] r14 = (android.util.Range[]) r14     // Catch:{ all -> 0x0676 }
                r0 = 2
                boolean r16 = r9.mo3307e(r6, r0)     // Catch:{ all -> 0x0676 }
                r0 = 3
                boolean r17 = r9.mo3307e(r6, r0)     // Catch:{ all -> 0x0676 }
                r0 = 2
                if (r10 == r0) goto L_0x022d
                if (r10 == 0) goto L_0x022d
                r10 = 1
                goto L_0x022e
            L_0x022d:
                r10 = 0
            L_0x022e:
                double r0 = com.mrousavy.camera.p168n0.C5175d.m19450b(r1)     // Catch:{ all -> 0x0676 }
                r34 = r9
                com.facebook.react.bridge.WritableMap r9 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ all -> 0x0676 }
                r9.putString(r2, r7)     // Catch:{ all -> 0x0676 }
                r35 = r2
                java.lang.String r2 = "devices"
                r9.putArray(r2, r11)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "position"
                java.lang.Integer r11 = p455g.p462v.p464k.p465a.C10397b.m35254c(r4)     // Catch:{ all -> 0x0676 }
                java.lang.String r11 = com.mrousavy.camera.p167m0.C5168b.m19433a(r11)     // Catch:{ all -> 0x0676 }
                r9.putString(r2, r11)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "name"
                if (r5 != 0) goto L_0x0274
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0676 }
                r5.<init>()     // Catch:{ all -> 0x0676 }
                java.lang.Integer r4 = p455g.p462v.p464k.p465a.C10397b.m35254c(r4)     // Catch:{ all -> 0x0676 }
                java.lang.String r4 = com.mrousavy.camera.p167m0.C5168b.m19433a(r4)     // Catch:{ all -> 0x0676 }
                r5.append(r4)     // Catch:{ all -> 0x0676 }
                java.lang.String r4 = " ("
                r5.append(r4)     // Catch:{ all -> 0x0676 }
                r5.append(r7)     // Catch:{ all -> 0x0676 }
                r4 = 41
                r5.append(r4)     // Catch:{ all -> 0x0676 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0676 }
            L_0x0274:
                r9.putString(r2, r5)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "hasFlash"
                if (r8 == 0) goto L_0x027d
                r4 = 1
                goto L_0x027e
            L_0x027d:
                r4 = 0
            L_0x027e:
                r9.putBoolean(r2, r4)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "hasTorch"
                if (r8 == 0) goto L_0x0287
                r4 = 1
                goto L_0x0288
            L_0x0287:
                r4 = 0
            L_0x0288:
                r9.putBoolean(r2, r4)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "isMultiCam"
                if (r15 == 0) goto L_0x0291
                r4 = 1
                goto L_0x0292
            L_0x0291:
                r4 = 0
            L_0x0292:
                r9.putBoolean(r2, r4)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "supportsParallelVideoProcessing"
                if (r10 == 0) goto L_0x029b
                r4 = 1
                goto L_0x029c
            L_0x029b:
                r4 = 0
            L_0x029c:
                r9.putBoolean(r2, r4)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "supportsRawCapture"
                if (r13 == 0) goto L_0x02a5
                r4 = 1
                goto L_0x02a6
            L_0x02a5:
                r4 = 0
            L_0x02a6:
                r9.putBoolean(r2, r4)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "supportsDepthCapture"
                if (r12 == 0) goto L_0x02af
                r4 = 1
                goto L_0x02b0
            L_0x02af:
                r4 = 0
            L_0x02b0:
                r9.putBoolean(r2, r4)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "supportsLowLightBoost"
                if (r17 == 0) goto L_0x02b9
                r4 = 1
                goto L_0x02ba
            L_0x02b9:
                r4 = 0
            L_0x02ba:
                r9.putBoolean(r2, r4)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "supportsFocus"
                r4 = 1
                r9.putBoolean(r2, r4)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "minZoom"
                java.lang.String r4 = "maxZoom"
                r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                if (r3 == 0) goto L_0x02ea
                java.lang.Comparable r5 = r3.getLower()     // Catch:{ all -> 0x0676 }
                java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x0676 }
                float r5 = r5.floatValue()     // Catch:{ all -> 0x0676 }
                double r10 = (double) r5     // Catch:{ all -> 0x0676 }
                r9.putDouble(r2, r10)     // Catch:{ all -> 0x0676 }
                java.lang.Comparable r2 = r3.getUpper()     // Catch:{ all -> 0x0676 }
                java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ all -> 0x0676 }
                float r2 = r2.floatValue()     // Catch:{ all -> 0x0676 }
                double r10 = (double) r2     // Catch:{ all -> 0x0676 }
                r9.putDouble(r4, r10)     // Catch:{ all -> 0x0676 }
                r2 = r22
                goto L_0x02f3
            L_0x02ea:
                r9.putDouble(r2, r7)     // Catch:{ all -> 0x0676 }
                r2 = r22
                double r10 = (double) r2     // Catch:{ all -> 0x0676 }
                r9.putDouble(r4, r10)     // Catch:{ all -> 0x0676 }
            L_0x02f3:
                java.lang.String r5 = "neutralZoom"
                r9.putDouble(r5, r7)     // Catch:{ all -> 0x0676 }
                java.util.List r5 = r33.mo3206a()     // Catch:{ all -> 0x0676 }
                java.util.List r5 = r6.mo3213b(r5)     // Catch:{ all -> 0x0676 }
                java.lang.String r6 = "cameraSelector.filter(ca…der.availableCameraInfos)"
                p455g.p470y.p472d.C10457l.m35319d(r5, r6)     // Catch:{ all -> 0x0676 }
                int r6 = r5.size()     // Catch:{ all -> 0x0676 }
                if (r6 <= 0) goto L_0x0348
                r6 = 0
                java.lang.Object r10 = r5.get(r6)     // Catch:{ all -> 0x0676 }
                androidx.camera.core.q1 r10 = (androidx.camera.core.C0957q1) r10     // Catch:{ all -> 0x0676 }
                java.util.List r6 = p027c.p043d.p044a.C1731z0.m7392i(r10)     // Catch:{ all -> 0x0676 }
                java.lang.String r10 = "getSupportedQualities(cameraInfos[0])"
                p455g.p470y.p472d.C10457l.m35319d(r6, r10)     // Catch:{ all -> 0x0676 }
                java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0676 }
                r11 = 10
                int r11 = p455g.p460t.C10351m.m35147p(r6, r11)     // Catch:{ all -> 0x0676 }
                r10.<init>(r11)     // Catch:{ all -> 0x0676 }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0676 }
            L_0x032a:
                boolean r11 = r6.hasNext()     // Catch:{ all -> 0x0676 }
                if (r11 == 0) goto L_0x034c
                java.lang.Object r11 = r6.next()     // Catch:{ all -> 0x0676 }
                c.d.a.y0 r11 = (p027c.p043d.p044a.C1727y0) r11     // Catch:{ all -> 0x0676 }
                r12 = 0
                java.lang.Object r13 = r5.get(r12)     // Catch:{ all -> 0x0676 }
                androidx.camera.core.q1 r13 = (androidx.camera.core.C0957q1) r13     // Catch:{ all -> 0x0676 }
                android.util.Size r11 = p027c.p043d.p044a.C1731z0.m7391h(r13, r11)     // Catch:{ all -> 0x0676 }
                p455g.p470y.p472d.C10457l.m35317b(r11)     // Catch:{ all -> 0x0676 }
                r10.add(r11)     // Catch:{ all -> 0x0676 }
                goto L_0x032a
            L_0x0348:
                java.util.List r10 = p455g.p460t.C10350l.m35138g()     // Catch:{ all -> 0x0676 }
            L_0x034c:
                int[] r5 = r29.getOutputFormats()     // Catch:{ all -> 0x0676 }
                r6 = r28
                p455g.p470y.p472d.C10457l.m35319d(r5, r6)     // Catch:{ all -> 0x0676 }
                java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0676 }
                r11.<init>()     // Catch:{ all -> 0x0676 }
                int r12 = r5.length     // Catch:{ all -> 0x0676 }
                r13 = 0
            L_0x035c:
                if (r13 >= r12) goto L_0x0379
                r15 = r5[r13]     // Catch:{ all -> 0x0676 }
                int r13 = r13 + 1
                r7 = r29
                android.util.Size[] r8 = r7.getOutputSizes(r15)     // Catch:{ all -> 0x0676 }
                java.lang.String r15 = "cameraConfig.getOutputSizes(it)"
                p455g.p470y.p472d.C10457l.m35319d(r8, r15)     // Catch:{ all -> 0x0676 }
                java.util.List r8 = p455g.p460t.C10343h.m35081C(r8)     // Catch:{ all -> 0x0676 }
                boolean unused = p455g.p460t.C10355q.m35149r(r11, r8)     // Catch:{ all -> 0x0676 }
                r29 = r7
                r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                goto L_0x035c
            L_0x0379:
                r7 = r29
                java.util.Iterator r5 = r11.iterator()     // Catch:{ all -> 0x0676 }
                boolean r8 = r5.hasNext()     // Catch:{ all -> 0x0676 }
                if (r8 != 0) goto L_0x0387
                r8 = 0
                goto L_0x03ba
            L_0x0387:
                java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x0676 }
                boolean r11 = r5.hasNext()     // Catch:{ all -> 0x0676 }
                if (r11 != 0) goto L_0x0392
                goto L_0x03ba
            L_0x0392:
                r11 = r8
                android.util.Size r11 = (android.util.Size) r11     // Catch:{ all -> 0x0676 }
                int r12 = r11.getWidth()     // Catch:{ all -> 0x0676 }
                int r11 = r11.getHeight()     // Catch:{ all -> 0x0676 }
                int r12 = r12 * r11
            L_0x039f:
                java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x0676 }
                r13 = r11
                android.util.Size r13 = (android.util.Size) r13     // Catch:{ all -> 0x0676 }
                int r15 = r13.getWidth()     // Catch:{ all -> 0x0676 }
                int r13 = r13.getHeight()     // Catch:{ all -> 0x0676 }
                int r15 = r15 * r13
                if (r12 >= r15) goto L_0x03b4
                r8 = r11
                r12 = r15
            L_0x03b4:
                boolean r11 = r5.hasNext()     // Catch:{ all -> 0x0676 }
                if (r11 != 0) goto L_0x063c
            L_0x03ba:
                p455g.p470y.p472d.C10457l.m35317b(r8)     // Catch:{ all -> 0x0676 }
                android.util.Size r8 = (android.util.Size) r8     // Catch:{ all -> 0x0676 }
                com.facebook.react.bridge.WritableArray r5 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ all -> 0x0676 }
                int[] r11 = r7.getOutputFormats()     // Catch:{ all -> 0x0676 }
                p455g.p470y.p472d.C10457l.m35319d(r11, r6)     // Catch:{ all -> 0x0676 }
                int r12 = r11.length     // Catch:{ all -> 0x0676 }
                r13 = 0
            L_0x03cc:
                if (r13 >= r12) goto L_0x0610
                r15 = r11[r13]     // Catch:{ all -> 0x0676 }
                int r13 = r13 + 1
                r22 = r2
                java.lang.String r2 = com.mrousavy.camera.p167m0.C5167a.m19432a(r15)     // Catch:{ all -> 0x0676 }
                r28 = r6
                android.util.Size[] r6 = r7.getOutputSizes(r15)     // Catch:{ all -> 0x0676 }
                r17 = r11
                java.lang.String r11 = "cameraConfig.getOutputSizes(formatId)"
                p455g.p470y.p472d.C10457l.m35319d(r6, r11)     // Catch:{ all -> 0x0676 }
                int r11 = r6.length     // Catch:{ all -> 0x0676 }
                r29 = r12
                r12 = 0
            L_0x03e9:
                if (r12 >= r11) goto L_0x05fe
                r38 = r11
                r11 = r6[r12]     // Catch:{ all -> 0x0676 }
                int r12 = r12 + 1
                r39 = r6
                java.lang.String r6 = "size"
                p455g.p470y.p472d.C10457l.m35319d(r11, r6)     // Catch:{ all -> 0x0676 }
                boolean r6 = com.mrousavy.camera.p167m0.C5169c.m19434a(r11, r8)     // Catch:{ all -> 0x0676 }
                r41 = r12
                r40 = r13
                long r12 = r7.getOutputMinFrameDuration(r15, r11)     // Catch:{ all -> 0x0415 }
                double r12 = (double) r12     // Catch:{ all -> 0x0415 }
                r42 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
                double r12 = r12 / r42
                java.lang.Double r12 = p455g.p462v.p464k.p465a.C10397b.m35253b(r12)     // Catch:{ all -> 0x0415 }
                r13 = r27
                r27 = r7
                goto L_0x0433
            L_0x0415:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0676 }
                r12.<init>()     // Catch:{ all -> 0x0676 }
                java.lang.String r13 = "Minimum Frame Duration for MediaRecorder Output cannot be calculated, format \""
                r12.append(r13)     // Catch:{ all -> 0x0676 }
                r12.append(r2)     // Catch:{ all -> 0x0676 }
                java.lang.String r13 = "\" is not supported."
                r12.append(r13)     // Catch:{ all -> 0x0676 }
                java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0676 }
                r13 = r27
                android.util.Log.e(r13, r12)     // Catch:{ all -> 0x0676 }
                r27 = r7
                r12 = 0
            L_0x0433:
                com.facebook.react.bridge.WritableArray r7 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ all -> 0x0676 }
                r42 = r8
                java.lang.String r8 = "maxFrameRate"
                r43 = r15
                java.lang.String r15 = "minFrameRate"
                if (r12 == 0) goto L_0x0467
                double r44 = r12.doubleValue()     // Catch:{ all -> 0x0676 }
                r46 = 0
                int r48 = (r44 > r46 ? 1 : (r44 == r46 ? 0 : -1))
                if (r48 <= 0) goto L_0x0467
                double r44 = r12.doubleValue()     // Catch:{ all -> 0x0676 }
                r46 = r13
                r36 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r12 = r36 / r44
                int r12 = (int) r12     // Catch:{ all -> 0x0676 }
                com.facebook.react.bridge.WritableMap r13 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ all -> 0x0676 }
                r44 = r9
                r9 = 1
                r13.putInt(r15, r9)     // Catch:{ all -> 0x0676 }
                r13.putInt(r8, r12)     // Catch:{ all -> 0x0676 }
                r7.pushMap(r13)     // Catch:{ all -> 0x0676 }
                goto L_0x046d
            L_0x0467:
                r44 = r9
                r46 = r13
                r36 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            L_0x046d:
                int r9 = r14.length     // Catch:{ all -> 0x0676 }
                r12 = 0
            L_0x046f:
                if (r12 >= r9) goto L_0x04ad
                r13 = r14[r12]     // Catch:{ all -> 0x0676 }
                int r12 = r12 + 1
                r45 = r9
                com.facebook.react.bridge.WritableMap r9 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ all -> 0x0676 }
                r47 = r12
                java.lang.Comparable r12 = r13.getLower()     // Catch:{ all -> 0x0676 }
                r48 = r14
                java.lang.String r14 = "range.lower"
                p455g.p470y.p472d.C10457l.m35319d(r12, r14)     // Catch:{ all -> 0x0676 }
                java.lang.Number r12 = (java.lang.Number) r12     // Catch:{ all -> 0x0676 }
                int r12 = r12.intValue()     // Catch:{ all -> 0x0676 }
                r9.putInt(r15, r12)     // Catch:{ all -> 0x0676 }
                java.lang.Comparable r12 = r13.getUpper()     // Catch:{ all -> 0x0676 }
                java.lang.String r13 = "range.upper"
                p455g.p470y.p472d.C10457l.m35319d(r12, r13)     // Catch:{ all -> 0x0676 }
                java.lang.Number r12 = (java.lang.Number) r12     // Catch:{ all -> 0x0676 }
                int r12 = r12.intValue()     // Catch:{ all -> 0x0676 }
                r9.putInt(r8, r12)     // Catch:{ all -> 0x0676 }
                r7.pushMap(r9)     // Catch:{ all -> 0x0676 }
                r9 = r45
                r12 = r47
                r14 = r48
                goto L_0x046f
            L_0x04ad:
                r48 = r14
                com.facebook.react.bridge.WritableArray r8 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ all -> 0x0676 }
                r8.pushString(r2)     // Catch:{ all -> 0x0676 }
                com.facebook.react.bridge.WritableArray r9 = com.facebook.react.bridge.Arguments.createArray()     // Catch:{ all -> 0x0676 }
                java.lang.String r12 = "off"
                r9.pushString(r12)     // Catch:{ all -> 0x0676 }
                if (r31 == 0) goto L_0x04d5
                r13 = r31
                r12 = 1
                boolean r14 = p455g.p460t.C10343h.m35083n(r13, r12)     // Catch:{ all -> 0x0676 }
                if (r14 == 0) goto L_0x04d7
                java.lang.String r12 = "auto"
                r9.pushString(r12)     // Catch:{ all -> 0x0676 }
                java.lang.String r12 = "standard"
                r9.pushString(r12)     // Catch:{ all -> 0x0676 }
                goto L_0x04d7
            L_0x04d5:
                r13 = r31
            L_0x04d7:
                if (r32 == 0) goto L_0x04e8
                r15 = r32
                r14 = 1
                boolean r12 = p455g.p460t.C10343h.m35083n(r15, r14)     // Catch:{ all -> 0x0676 }
                if (r12 == 0) goto L_0x04eb
                java.lang.String r12 = "cinematic"
                r9.pushString(r12)     // Catch:{ all -> 0x0676 }
                goto L_0x04eb
            L_0x04e8:
                r15 = r32
                r14 = 1
            L_0x04eb:
                java.lang.String r12 = "420v"
                com.facebook.react.bridge.WritableMap r14 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ all -> 0x0676 }
                r31 = r2
                java.lang.String r2 = "photoHeight"
                r32 = r13
                int r13 = r11.getHeight()     // Catch:{ all -> 0x0676 }
                r45 = r12
                double r12 = (double) r13     // Catch:{ all -> 0x0676 }
                r14.putDouble(r2, r12)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "photoWidth"
                int r12 = r11.getWidth()     // Catch:{ all -> 0x0676 }
                double r12 = (double) r12     // Catch:{ all -> 0x0676 }
                r14.putDouble(r2, r12)     // Catch:{ all -> 0x0676 }
                java.util.Iterator r2 = r10.iterator()     // Catch:{ all -> 0x0676 }
            L_0x050f:
                boolean r12 = r2.hasNext()     // Catch:{ all -> 0x0676 }
                if (r12 == 0) goto L_0x053f
                java.lang.Object r12 = r2.next()     // Catch:{ all -> 0x0676 }
                r13 = r12
                android.util.Size r13 = (android.util.Size) r13     // Catch:{ all -> 0x0676 }
                r47 = r2
                int r2 = r13.getWidth()     // Catch:{ all -> 0x0676 }
                r49 = r10
                int r10 = r11.getWidth()     // Catch:{ all -> 0x0676 }
                if (r2 > r10) goto L_0x0536
                int r2 = r13.getHeight()     // Catch:{ all -> 0x0676 }
                int r10 = r11.getHeight()     // Catch:{ all -> 0x0676 }
                if (r2 > r10) goto L_0x0536
                r2 = 1
                goto L_0x0537
            L_0x0536:
                r2 = 0
            L_0x0537:
                if (r2 == 0) goto L_0x053a
                goto L_0x0542
            L_0x053a:
                r2 = r47
                r10 = r49
                goto L_0x050f
            L_0x053f:
                r49 = r10
                r12 = 0
            L_0x0542:
                android.util.Size r12 = (android.util.Size) r12     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "format"
                p455g.p470y.p472d.C10457l.m35319d(r14, r2)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "videoHeight"
                if (r12 != 0) goto L_0x054f
                r10 = 0
                goto L_0x0558
            L_0x054f:
                int r10 = r12.getHeight()     // Catch:{ all -> 0x0676 }
                double r10 = (double) r10     // Catch:{ all -> 0x0676 }
                java.lang.Double r10 = p455g.p462v.p464k.p465a.C10397b.m35253b(r10)     // Catch:{ all -> 0x0676 }
            L_0x0558:
                com.mrousavy.camera.p168n0.C5187o.m19467a(r14, r2, r10)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "videoWidth"
                if (r12 != 0) goto L_0x0561
                r10 = 0
                goto L_0x056a
            L_0x0561:
                int r10 = r12.getWidth()     // Catch:{ all -> 0x0676 }
                double r10 = (double) r10     // Catch:{ all -> 0x0676 }
                java.lang.Double r10 = p455g.p462v.p464k.p465a.C10397b.m35253b(r10)     // Catch:{ all -> 0x0676 }
            L_0x056a:
                com.mrousavy.camera.p168n0.C5187o.m19467a(r14, r2, r10)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "isHighestPhotoQualitySupported"
                if (r6 == 0) goto L_0x0573
                r6 = 1
                goto L_0x0574
            L_0x0573:
                r6 = 0
            L_0x0574:
                r14.putBoolean(r2, r6)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "maxISO"
                if (r30 != 0) goto L_0x057d
                r6 = 0
                goto L_0x0583
            L_0x057d:
                java.lang.Comparable r6 = r30.getUpper()     // Catch:{ all -> 0x0676 }
                java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0676 }
            L_0x0583:
                com.mrousavy.camera.p168n0.C5187o.m19468b(r14, r2, r6)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "minISO"
                if (r30 != 0) goto L_0x058c
                r6 = 0
                goto L_0x0592
            L_0x058c:
                java.lang.Comparable r6 = r30.getLower()     // Catch:{ all -> 0x0676 }
                java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0676 }
            L_0x0592:
                com.mrousavy.camera.p168n0.C5187o.m19468b(r14, r2, r6)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "fieldOfView"
                r14.putDouble(r2, r0)     // Catch:{ all -> 0x0676 }
                if (r3 != 0) goto L_0x059d
                goto L_0x05a5
            L_0x059d:
                java.lang.Comparable r2 = r3.getUpper()     // Catch:{ all -> 0x0676 }
                java.lang.Float r2 = (java.lang.Float) r2     // Catch:{ all -> 0x0676 }
                if (r2 != 0) goto L_0x05a8
            L_0x05a5:
                r2 = r22
                goto L_0x05ac
            L_0x05a8:
                float r2 = r2.floatValue()     // Catch:{ all -> 0x0676 }
            L_0x05ac:
                double r10 = (double) r2     // Catch:{ all -> 0x0676 }
                r14.putDouble(r4, r10)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "colorSpaces"
                r14.putArray(r2, r8)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "supportsVideoHDR"
                r6 = 0
                r14.putBoolean(r2, r6)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "supportsPhotoHDR"
                if (r16 == 0) goto L_0x05c1
                r8 = 1
                goto L_0x05c2
            L_0x05c1:
                r8 = 0
            L_0x05c2:
                r14.putBoolean(r2, r8)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "frameRateRanges"
                r14.putArray(r2, r7)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "autoFocusSystem"
                java.lang.String r7 = "none"
                r14.putString(r2, r7)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "videoStabilizationModes"
                r14.putArray(r2, r9)     // Catch:{ all -> 0x0676 }
                java.lang.String r2 = "pixelFormat"
                r7 = r45
                r14.putString(r2, r7)     // Catch:{ all -> 0x0676 }
                r5.pushMap(r14)     // Catch:{ all -> 0x0676 }
                r7 = r27
                r2 = r31
                r31 = r32
                r11 = r38
                r6 = r39
                r13 = r40
                r12 = r41
                r8 = r42
                r9 = r44
                r27 = r46
                r14 = r48
                r10 = r49
                r32 = r15
                r15 = r43
                goto L_0x03e9
            L_0x05fe:
                r40 = r13
                r46 = r27
                r15 = r32
                r36 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                r11 = r17
                r2 = r22
                r6 = r28
                r12 = r29
                goto L_0x03cc
            L_0x0610:
                r28 = r6
                r44 = r9
                r6 = 0
                java.lang.String r0 = "formats"
                r2 = r44
                r2.putArray(r0, r5)     // Catch:{ all -> 0x0676 }
                r7 = r26
                r7.pushMap(r2)     // Catch:{ all -> 0x0676 }
                r1 = r51
                r12 = r7
                r10 = r18
                r13 = r19
                r14 = r20
                r15 = r21
                r11 = r23
                r3 = r24
                r0 = r28
                r5 = r33
                r9 = r34
                r2 = r35
                r6 = 3
                r7 = 2
                goto L_0x00f6
            L_0x063c:
                r46 = r27
                r15 = r32
                r36 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                goto L_0x039f
            L_0x0644:
                r0 = move-exception
                r23 = r11
                goto L_0x0681
            L_0x0648:
                r24 = r3
                r46 = r8
                r23 = r11
                r7 = r12
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0676 }
                long r0 = r0 - r24
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0676 }
                r2.<init>()     // Catch:{ all -> 0x0676 }
                java.lang.String r3 = "CameraViewModule::getAvailableCameraDevices took: "
                r2.append(r3)     // Catch:{ all -> 0x0676 }
                r2.append(r0)     // Catch:{ all -> 0x0676 }
                java.lang.String r0 = " ms"
                r2.append(r0)     // Catch:{ all -> 0x0676 }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0676 }
                r1 = r46
                android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0676 }
                r11 = r23
                r11.resolve(r7)     // Catch:{ all -> 0x0680 }
                goto L_0x06b8
            L_0x0676:
                r0 = move-exception
                r11 = r23
                goto L_0x0681
            L_0x067a:
                com.mrousavy.camera.h r0 = new com.mrousavy.camera.h     // Catch:{ all -> 0x0680 }
                r0.<init>()     // Catch:{ all -> 0x0680 }
                throw r0     // Catch:{ all -> 0x0680 }
            L_0x0680:
                r0 = move-exception
            L_0x0681:
                r0.printStackTrace()
                boolean r1 = r0 instanceof com.mrousavy.camera.C5152g
                if (r1 == 0) goto L_0x068b
                com.mrousavy.camera.g r0 = (com.mrousavy.camera.C5152g) r0
                goto L_0x0691
            L_0x068b:
                com.mrousavy.camera.i0 r1 = new com.mrousavy.camera.i0
                r1.<init>(r0)
                r0 = r1
            L_0x0691:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r0.mo15772a()
                r1.append(r2)
                r2 = 47
                r1.append(r2)
                java.lang.String r2 = r0.mo15773b()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r0.getMessage()
                java.lang.Throwable r0 = r0.getCause()
                r11.reject((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
            L_0x06b8:
                g.s r0 = p455g.C10323s.f27547a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraViewModule.C5130c.mo15707n(java.lang.Object):java.lang.Object");
        }

        /* renamed from: q */
        public final Object mo15709j(C10784l0 l0Var, C10376d<? super C10323s> dVar) {
            return ((C5130c) mo15708b(l0Var, dVar)).mo15707n(C10323s.f27547a);
        }
    }

    @C10401f(mo25797c = "com.mrousavy.camera.CameraViewModule$startRecording$1", mo25798f = "CameraViewModule.kt", mo25799l = {}, mo25800m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$d */
    static final class C5131d extends C10407k implements C10434p<C10784l0, C10376d<? super C10323s>, Object> {

        /* renamed from: r */
        int f14606r;

        /* renamed from: s */
        final /* synthetic */ CameraViewModule f14607s;

        /* renamed from: t */
        final /* synthetic */ int f14608t;

        /* renamed from: u */
        final /* synthetic */ ReadableMap f14609u;

        /* renamed from: v */
        final /* synthetic */ Callback f14610v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5131d(CameraViewModule cameraViewModule, int i, ReadableMap readableMap, Callback callback, C10376d<? super C5131d> dVar) {
            super(2, dVar);
            this.f14607s = cameraViewModule;
            this.f14608t = i;
            this.f14609u = readableMap;
            this.f14610v = callback;
        }

        /* renamed from: b */
        public final C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
            return new C5131d(this.f14607s, this.f14608t, this.f14609u, this.f14610v, dVar);
        }

        /* renamed from: n */
        public final Object mo15707n(Object obj) {
            Object unused = C10395d.m35244c();
            if (this.f14606r == 0) {
                C10318n.m35017b(obj);
                try {
                    C5170n.m19439c(this.f14607s.findCameraView(this.f14608t), this.f14609u, this.f14610v);
                } catch (C5152g e) {
                    C5152g gVar = e;
                    ReadableMap c = C5174c.m19448c(gVar.mo15772a() + '/' + gVar.mo15773b(), gVar.getMessage(), gVar, (WritableMap) null, 8, (Object) null);
                    this.f14610v.invoke(null, c);
                } catch (Throwable th) {
                    ReadableMap c2 = C5174c.m19448c("capture/unknown", "An unknown error occurred while trying to start a video recording!", th, (WritableMap) null, 8, (Object) null);
                    this.f14610v.invoke(null, c2);
                }
                return C10323s.f27547a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: q */
        public final Object mo15709j(C10784l0 l0Var, C10376d<? super C10323s> dVar) {
            return ((C5131d) mo15708b(l0Var, dVar)).mo15707n(C10323s.f27547a);
        }
    }

    @C10401f(mo25797c = "com.mrousavy.camera.CameraViewModule$takePhoto$1", mo25798f = "CameraViewModule.kt", mo25799l = {97}, mo25800m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$e */
    static final class C5132e extends C10407k implements C10434p<C10784l0, C10376d<? super C10323s>, Object> {

        /* renamed from: r */
        Object f14611r;

        /* renamed from: s */
        int f14612s;

        /* renamed from: t */
        final /* synthetic */ Promise f14613t;

        /* renamed from: u */
        final /* synthetic */ CameraViewModule f14614u;

        /* renamed from: v */
        final /* synthetic */ int f14615v;

        /* renamed from: w */
        final /* synthetic */ ReadableMap f14616w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5132e(Promise promise, CameraViewModule cameraViewModule, int i, ReadableMap readableMap, C10376d<? super C5132e> dVar) {
            super(2, dVar);
            this.f14613t = promise;
            this.f14614u = cameraViewModule;
            this.f14615v = i;
            this.f14616w = readableMap;
        }

        /* renamed from: b */
        public final C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
            return new C5132e(this.f14613t, this.f14614u, this.f14615v, this.f14616w, dVar);
        }

        /* renamed from: n */
        public final Object mo15707n(Object obj) {
            C5152g th;
            Promise promise;
            Object c = C10395d.m35244c();
            int i = this.f14612s;
            if (i == 0) {
                C10318n.m35017b(obj);
                Promise promise2 = this.f14613t;
                CameraViewModule cameraViewModule = this.f14614u;
                int i2 = this.f14615v;
                ReadableMap readableMap = this.f14616w;
                try {
                    CameraView access$findCameraView = cameraViewModule.findCameraView(i2);
                    this.f14611r = promise2;
                    this.f14612s = 1;
                    Object a = C5188o.m19469a(access$findCameraView, readableMap, this);
                    if (a == c) {
                        return c;
                    }
                    promise = promise2;
                    obj = a;
                } catch (Throwable th2) {
                    C5152g gVar = th2;
                    promise = promise2;
                    th = gVar;
                    th.printStackTrace();
                    C5152g i0Var = th instanceof C5152g ? th : new C5157i0(th);
                    promise.reject(i0Var.mo15772a() + '/' + i0Var.mo15773b(), i0Var.getMessage(), i0Var.getCause());
                    return C10323s.f27547a;
                }
            } else if (i == 1) {
                promise = (Promise) this.f14611r;
                try {
                    C10318n.m35017b(obj);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            promise.resolve(obj);
            return C10323s.f27547a;
        }

        /* renamed from: q */
        public final Object mo15709j(C10784l0 l0Var, C10376d<? super C10323s> dVar) {
            return ((C5132e) mo15708b(l0Var, dVar)).mo15707n(C10323s.f27547a);
        }
    }

    @C10401f(mo25797c = "com.mrousavy.camera.CameraViewModule$takeSnapshot$1", mo25798f = "CameraViewModule.kt", mo25799l = {108}, mo25800m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$f */
    static final class C5133f extends C10407k implements C10434p<C10784l0, C10376d<? super C10323s>, Object> {

        /* renamed from: r */
        Object f14617r;

        /* renamed from: s */
        int f14618s;

        /* renamed from: t */
        final /* synthetic */ Promise f14619t;

        /* renamed from: u */
        final /* synthetic */ CameraViewModule f14620u;

        /* renamed from: v */
        final /* synthetic */ int f14621v;

        /* renamed from: w */
        final /* synthetic */ ReadableMap f14622w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5133f(Promise promise, CameraViewModule cameraViewModule, int i, ReadableMap readableMap, C10376d<? super C5133f> dVar) {
            super(2, dVar);
            this.f14619t = promise;
            this.f14620u = cameraViewModule;
            this.f14621v = i;
            this.f14622w = readableMap;
        }

        /* renamed from: b */
        public final C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
            return new C5133f(this.f14619t, this.f14620u, this.f14621v, this.f14622w, dVar);
        }

        /* renamed from: n */
        public final Object mo15707n(Object obj) {
            C5152g th;
            Promise promise;
            Object c = C10395d.m35244c();
            int i = this.f14618s;
            if (i == 0) {
                C10318n.m35017b(obj);
                Promise promise2 = this.f14619t;
                CameraViewModule cameraViewModule = this.f14620u;
                int i2 = this.f14621v;
                ReadableMap readableMap = this.f14622w;
                try {
                    CameraView access$findCameraView = cameraViewModule.findCameraView(i2);
                    this.f14617r = promise2;
                    this.f14618s = 1;
                    Object a = C5193p.m19486a(access$findCameraView, readableMap, this);
                    if (a == c) {
                        return c;
                    }
                    promise = promise2;
                    obj = a;
                } catch (Throwable th2) {
                    C5152g gVar = th2;
                    promise = promise2;
                    th = gVar;
                    th.printStackTrace();
                    C5152g i0Var = th instanceof C5152g ? th : new C5157i0(th);
                    promise.reject(i0Var.mo15772a() + '/' + i0Var.mo15773b(), i0Var.getMessage(), i0Var.getCause());
                    return C10323s.f27547a;
                }
            } else if (i == 1) {
                promise = (Promise) this.f14617r;
                try {
                    C10318n.m35017b(obj);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            promise.resolve(obj);
            return C10323s.f27547a;
        }

        /* renamed from: q */
        public final Object mo15709j(C10784l0 l0Var, C10376d<? super C10323s> dVar) {
            return ((C5133f) mo15708b(l0Var, dVar)).mo15707n(C10323s.f27547a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C10457l.m35320e(reactApplicationContext, "reactContext");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C10457l.m35319d(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.frameProcessorThread = newSingleThreadExecutor;
    }

    private final void cleanup() {
        if (C10789m0.m36651f(this.coroutineScope)) {
            C10789m0.m36649d(this.coroutineScope, "CameraViewModule has been destroyed.", (Throwable) null, 2, (Object) null);
        }
        this.frameProcessorManager = null;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.view.View] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.mrousavy.camera.CameraView findCameraView(int r6) {
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
            java.lang.String r1 = "CameraView"
            android.util.Log.d(r1, r0)
            com.facebook.react.bridge.ReactApplicationContext r0 = r5.getReactApplicationContext()
            r2 = 0
            if (r0 == 0) goto L_0x0033
            com.facebook.react.bridge.ReactApplicationContext r0 = r5.getReactApplicationContext()
            com.facebook.react.bridge.UIManager r0 = com.facebook.react.uimanager.C3051u0.m12089f(r0, r6)
            if (r0 != 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            android.view.View r2 = r0.resolveView(r6)
        L_0x0031:
            com.mrousavy.camera.CameraView r2 = (com.mrousavy.camera.CameraView) r2
        L_0x0033:
            com.facebook.react.bridge.ReactApplicationContext r0 = r5.getReactApplicationContext()
            r3 = 33
            if (r0 == 0) goto L_0x0043
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Found view "
            goto L_0x004a
        L_0x0043:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Couldn't find view "
        L_0x004a:
            r0.append(r4)
            r0.append(r6)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
            if (r2 == 0) goto L_0x005d
            return r2
        L_0x005d:
            com.mrousavy.camera.l0 r0 = new com.mrousavy.camera.l0
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraViewModule.findCameraView(int):com.mrousavy.camera.CameraView");
    }

    /* access modifiers changed from: private */
    /* renamed from: initialize$lambda-0  reason: not valid java name */
    public static final void m37324initialize$lambda0(CameraViewModule cameraViewModule) {
        C10457l.m35320e(cameraViewModule, "this$0");
        ReactApplicationContext reactApplicationContext = cameraViewModule.getReactApplicationContext();
        C10457l.m35319d(reactApplicationContext, "reactApplicationContext");
        cameraViewModule.frameProcessorManager = new FrameProcessorRuntimeManager(reactApplicationContext, cameraViewModule.getFrameProcessorThread());
    }

    /* access modifiers changed from: private */
    /* renamed from: requestCameraPermission$lambda-4  reason: not valid java name */
    public static final boolean m37325requestCameraPermission$lambda4(int i, Promise promise, int i2, String[] strArr, int[] iArr) {
        C10457l.m35320e(promise, "$promise");
        C10457l.m35320e(strArr, "$noName_1");
        C10457l.m35320e(iArr, "grantResults");
        if (i2 != i) {
            return false;
        }
        promise.resolve(Companion.mo15747a((iArr.length == 0) ^ true ? iArr[0] : -1));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: requestMicrophonePermission$lambda-5  reason: not valid java name */
    public static final boolean m37326requestMicrophonePermission$lambda5(int i, Promise promise, int i2, String[] strArr, int[] iArr) {
        C10457l.m35320e(promise, "$promise");
        C10457l.m35320e(strArr, "$noName_1");
        C10457l.m35320e(iArr, "grantResults");
        if (i2 != i) {
            return false;
        }
        promise.resolve(Companion.mo15747a((iArr.length == 0) ^ true ? iArr[0] : -1));
        return true;
    }

    @ReactMethod
    public final void focus(int i, ReadableMap readableMap, Promise promise) {
        C10457l.m35320e(readableMap, "point");
        C10457l.m35320e(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        C10812n1 unused = C10776k.m36628d(this.coroutineScope, (C10381g) null, (C10810n0) null, new C5129b(promise, this, i, readableMap, (C10376d<? super C5129b>) null), 3, (Object) null);
    }

    @ReactMethod
    public final void getAvailableCameraDevices(Promise promise) {
        C10457l.m35320e(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        long currentTimeMillis = System.currentTimeMillis();
        C10812n1 unused = C10776k.m36628d(this.coroutineScope, (C10381g) null, (C10810n0) null, new C5130c(promise, this, currentTimeMillis, (C10376d<? super C5130c>) null), 3, (Object) null);
    }

    @ReactMethod
    public final void getCameraPermissionStatus(Promise promise) {
        C10457l.m35320e(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        promise.resolve(Companion.mo15747a(C1135a.m4415a(getReactApplicationContext(), "android.permission.CAMERA")));
    }

    public final ExecutorService getFrameProcessorThread() {
        return this.frameProcessorThread;
    }

    @ReactMethod
    public final void getMicrophonePermissionStatus(Promise promise) {
        C10457l.m35320e(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        promise.resolve(Companion.mo15747a(C1135a.m4415a(getReactApplicationContext(), "android.permission.RECORD_AUDIO")));
    }

    public String getName() {
        return "CameraView";
    }

    public void initialize() {
        super.initialize();
        if (this.frameProcessorManager == null) {
            this.frameProcessorThread.execute(new C5142e(this));
        }
    }

    public void invalidate() {
        super.invalidate();
        cleanup();
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        cleanup();
    }

    @ReactMethod
    public final void pauseRecording(int i, Promise promise) {
        C10457l.m35320e(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            C5170n.m19437a(findCameraView(i));
            promise.resolve((Object) null);
        } catch (Throwable th) {
            th.printStackTrace();
            C5152g i0Var = th instanceof C5152g ? th : new C5157i0(th);
            promise.reject(i0Var.mo15772a() + '/' + i0Var.mo15773b(), i0Var.getMessage(), i0Var.getCause());
        }
    }

    @ReactMethod
    public final void requestCameraPermission(Promise promise) {
        C10457l.m35320e(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (Build.VERSION.SDK_INT < 23) {
            promise.resolve("authorized");
            return;
        }
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity instanceof C2802e) {
            int i = RequestCode;
            RequestCode = i + 1;
            ((C2802e) currentActivity).mo8378i(new String[]{"android.permission.CAMERA"}, i, new C5144f(i, promise));
            return;
        }
        promise.reject("NO_ACTIVITY", "No PermissionAwareActivity was found! Make sure the app has launched before calling this function.");
    }

    @ReactMethod
    public final void requestMicrophonePermission(Promise promise) {
        C10457l.m35320e(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (Build.VERSION.SDK_INT < 23) {
            promise.resolve("authorized");
            return;
        }
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity instanceof C2802e) {
            int i = RequestCode;
            RequestCode = i + 1;
            ((C2802e) currentActivity).mo8378i(new String[]{"android.permission.RECORD_AUDIO"}, i, new C5140d(i, promise));
            return;
        }
        promise.reject("NO_ACTIVITY", "No PermissionAwareActivity was found! Make sure the app has launched before calling this function.");
    }

    @ReactMethod
    public final void resumeRecording(int i, Promise promise) {
        C10457l.m35320e(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            C5170n.m19438b(findCameraView(i));
            promise.resolve((Object) null);
        } catch (Throwable th) {
            th.printStackTrace();
            C5152g i0Var = th instanceof C5152g ? th : new C5157i0(th);
            promise.reject(i0Var.mo15772a() + '/' + i0Var.mo15773b(), i0Var.getMessage(), i0Var.getCause());
        }
    }

    public final void setFrameProcessorThread(ExecutorService executorService) {
        C10457l.m35320e(executorService, "<set-?>");
        this.frameProcessorThread = executorService;
    }

    @ReactMethod
    public final void startRecording(int i, ReadableMap readableMap, Callback callback) {
        C10457l.m35320e(readableMap, "options");
        C10457l.m35320e(callback, "onRecordCallback");
        C10812n1 unused = C10776k.m36628d(this.coroutineScope, (C10381g) null, (C10810n0) null, new C5131d(this, i, readableMap, callback, (C10376d<? super C5131d>) null), 3, (Object) null);
    }

    @ReactMethod
    public final void stopRecording(int i, Promise promise) {
        C10457l.m35320e(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            C5170n.m19440d(findCameraView(i));
            promise.resolve((Object) null);
        } catch (Throwable th) {
            th.printStackTrace();
            C5152g i0Var = th instanceof C5152g ? th : new C5157i0(th);
            promise.reject(i0Var.mo15772a() + '/' + i0Var.mo15773b(), i0Var.getMessage(), i0Var.getCause());
        }
    }

    @ReactMethod
    public final void takePhoto(int i, ReadableMap readableMap, Promise promise) {
        C10457l.m35320e(readableMap, "options");
        C10457l.m35320e(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        C10812n1 unused = C10776k.m36628d(this.coroutineScope, (C10381g) null, (C10810n0) null, new C5132e(promise, this, i, readableMap, (C10376d<? super C5132e>) null), 3, (Object) null);
    }

    @ReactMethod
    public final void takeSnapshot(int i, ReadableMap readableMap, Promise promise) {
        C10457l.m35320e(readableMap, "options");
        C10457l.m35320e(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        C10812n1 unused = C10776k.m36628d(this.coroutineScope, (C10381g) null, (C10810n0) null, new C5133f(promise, this, i, readableMap, (C10376d<? super C5133f>) null), 3, (Object) null);
    }
}
