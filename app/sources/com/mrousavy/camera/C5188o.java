package com.mrousavy.camera;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.camera.core.C0693h2;
import androidx.camera.core.ImageProxy;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.mrousavy.camera.p168n0.C5181j;
import com.mrousavy.camera.p168n0.C5183l;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.C10784l0;
import kotlinx.coroutines.C10789m0;
import p027c.p084n.p085a.C2049a;
import p455g.C10318n;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p462v.C10388i;
import p455g.p462v.p464k.p465a.C10401f;
import p455g.p462v.p464k.p465a.C10403h;
import p455g.p462v.p464k.p465a.C10407k;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10467v;

/* renamed from: com.mrousavy.camera.o */
public final class C5188o {

    @C10401f(mo25797c = "com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2", mo25798f = "CameraView+TakePhoto.kt", mo25799l = {22, 68, 87}, mo25800m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.o$a */
    static final class C5189a extends C10407k implements C10434p<C10784l0, C10376d<? super WritableMap>, Object> {

        /* renamed from: r */
        Object f14663r;

        /* renamed from: s */
        Object f14664s;

        /* renamed from: t */
        long f14665t;

        /* renamed from: u */
        int f14666u;

        /* renamed from: v */
        int f14667v;

        /* renamed from: w */
        private /* synthetic */ Object f14668w;

        /* renamed from: x */
        final /* synthetic */ CameraView f14669x;

        /* renamed from: y */
        final /* synthetic */ ReadableMap f14670y;

        @C10401f(mo25797c = "com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2$1", mo25798f = "CameraView+TakePhoto.kt", mo25799l = {}, mo25800m = "invokeSuspend")
        /* renamed from: com.mrousavy.camera.o$a$a */
        static final class C5190a extends C10407k implements C10434p<C10784l0, C10376d<? super C10323s>, Object> {

            /* renamed from: r */
            int f14671r;

            /* renamed from: s */
            final /* synthetic */ File f14672s;

            /* renamed from: t */
            final /* synthetic */ C10467v<C2049a> f14673t;

            /* renamed from: u */
            final /* synthetic */ boolean f14674u;

            /* renamed from: v */
            final /* synthetic */ Integer f14675v;

            /* renamed from: w */
            final /* synthetic */ ImageProxy f14676w;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5190a(File file, C10467v<C2049a> vVar, boolean z, Integer num, ImageProxy imageProxy, C10376d<? super C5190a> dVar) {
                super(2, dVar);
                this.f14672s = file;
                this.f14673t = vVar;
                this.f14674u = z;
                this.f14675v = num;
                this.f14676w = imageProxy;
            }

            /* renamed from: b */
            public final C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
                return new C5190a(this.f14672s, this.f14673t, this.f14674u, this.f14675v, this.f14676w, dVar);
            }

            /* renamed from: n */
            public final Object mo15707n(Object obj) {
                Object unused = C10395d.m35244c();
                if (this.f14671r == 0) {
                    C10318n.m35017b(obj);
                    Log.d("CameraView", "Saving picture to " + this.f14672s.getAbsolutePath() + "...");
                    Integer num = this.f14675v;
                    ImageProxy imageProxy = this.f14676w;
                    File file = this.f14672s;
                    long currentTimeMillis = System.currentTimeMillis();
                    C5183l.m19464b(imageProxy, file, num != null && num.intValue() == 0);
                    Log.i("CameraView.performance", "Finished image saving in " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                    this.f14673t.f27625f = this.f14674u ? null : new C2049a(this.f14672s);
                    return C10323s.f27547a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: q */
            public final Object mo15709j(C10784l0 l0Var, C10376d<? super C10323s> dVar) {
                return ((C5190a) mo15708b(l0Var, dVar)).mo15707n(C10323s.f27547a);
            }
        }

        @C10401f(mo25797c = "com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2$results$1", mo25798f = "CameraView+TakePhoto.kt", mo25799l = {116}, mo25800m = "invokeSuspend")
        /* renamed from: com.mrousavy.camera.o$a$b */
        static final class C5191b extends C10407k implements C10434p<C10784l0, C10376d<? super ImageProxy>, Object> {

            /* renamed from: r */
            long f14677r;

            /* renamed from: s */
            Object f14678s;

            /* renamed from: t */
            Object f14679t;

            /* renamed from: u */
            int f14680u;

            /* renamed from: v */
            final /* synthetic */ CameraView f14681v;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5191b(CameraView cameraView, C10376d<? super C5191b> dVar) {
                super(2, dVar);
                this.f14681v = cameraView;
            }

            /* renamed from: b */
            public final C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
                return new C5191b(this.f14681v, dVar);
            }

            /* renamed from: n */
            public final Object mo15707n(Object obj) {
                long j;
                Object c = C10395d.m35244c();
                int i = this.f14680u;
                if (i == 0) {
                    C10318n.m35017b(obj);
                    Log.d("CameraView", "Taking picture...");
                    long nanoTime = System.nanoTime();
                    C0693h2 imageCapture$react_native_vision_camera_release = this.f14681v.getImageCapture$react_native_vision_camera_release();
                    C10457l.m35317b(imageCapture$react_native_vision_camera_release);
                    ExecutorService takePhotoExecutor$react_native_vision_camera_release = this.f14681v.getTakePhotoExecutor$react_native_vision_camera_release();
                    C10457l.m35319d(takePhotoExecutor$react_native_vision_camera_release, "takePhotoExecutor");
                    this.f14678s = imageCapture$react_native_vision_camera_release;
                    this.f14679t = takePhotoExecutor$react_native_vision_camera_release;
                    this.f14677r = nanoTime;
                    this.f14680u = 1;
                    C10388i iVar = new C10388i(C10392c.m35241b(this));
                    imageCapture$react_native_vision_camera_release.m2859f0(takePhotoExecutor$react_native_vision_camera_release, new C5181j(iVar));
                    obj = iVar.mo25788b();
                    if (obj == C10395d.m35244c()) {
                        C10403h.m35274c(this);
                    }
                    if (obj == c) {
                        return c;
                    }
                    j = nanoTime;
                } else if (i == 1) {
                    j = this.f14677r;
                    Executor executor = (Executor) this.f14679t;
                    C0693h2 h2Var = (C0693h2) this.f14678s;
                    C10318n.m35017b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ImageProxy imageProxy = (ImageProxy) obj;
                long nanoTime2 = System.nanoTime();
                Log.i("CameraView.performance", "Finished image capture in " + ((nanoTime2 - j) / ((long) 1000000)) + "ms");
                return imageProxy;
            }

            /* renamed from: q */
            public final Object mo15709j(C10784l0 l0Var, C10376d<? super ImageProxy> dVar) {
                return ((C5191b) mo15708b(l0Var, dVar)).mo15707n(C10323s.f27547a);
            }
        }

        @C10401f(mo25797c = "com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2$results$2", mo25798f = "CameraView+TakePhoto.kt", mo25799l = {}, mo25800m = "invokeSuspend")
        /* renamed from: com.mrousavy.camera.o$a$c */
        static final class C5192c extends C10407k implements C10434p<C10784l0, C10376d<? super File>, Object> {

            /* renamed from: r */
            int f14682r;

            /* renamed from: s */
            final /* synthetic */ CameraView f14683s;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5192c(CameraView cameraView, C10376d<? super C5192c> dVar) {
                super(2, dVar);
                this.f14683s = cameraView;
            }

            /* renamed from: b */
            public final C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
                return new C5192c(this.f14683s, dVar);
            }

            /* renamed from: n */
            public final Object mo15707n(Object obj) {
                Object unused = C10395d.m35244c();
                if (this.f14682r == 0) {
                    C10318n.m35017b(obj);
                    Log.d("CameraView", "Creating temp file...");
                    File createTempFile = File.createTempFile("mrousavy", ".jpg", this.f14683s.getContext().getCacheDir());
                    createTempFile.deleteOnExit();
                    return createTempFile;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: q */
            public final Object mo15709j(C10784l0 l0Var, C10376d<? super File> dVar) {
                return ((C5192c) mo15708b(l0Var, dVar)).mo15707n(C10323s.f27547a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5189a(CameraView cameraView, ReadableMap readableMap, C10376d<? super C5189a> dVar) {
            super(2, dVar);
            this.f14669x = cameraView;
            this.f14670y = readableMap;
        }

        /* renamed from: b */
        public final C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
            C5189a aVar = new C5189a(this.f14669x, this.f14670y, dVar);
            aVar.f14668w = obj;
            return aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: androidx.camera.core.ImageProxy} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.io.File} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0246  */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo15707n(java.lang.Object r27) {
            /*
                r26 = this;
                r0 = r26
                java.lang.Object r1 = p455g.p462v.p463j.C10395d.m35244c()
                int r2 = r0.f14667v
                r3 = 3
                r4 = 0
                java.lang.String r5 = "CameraView"
                r6 = 0
                r7 = 2
                r8 = 1
                if (r2 == 0) goto L_0x004e
                if (r2 == r8) goto L_0x0048
                if (r2 == r7) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                long r1 = r0.f14665t
                java.lang.Object r3 = r0.f14664s
                g.y.d.v r3 = (p455g.p470y.p472d.C10467v) r3
                java.lang.Object r6 = r0.f14663r
                java.io.File r6 = (java.io.File) r6
                java.lang.Object r7 = r0.f14668w
                androidx.camera.core.ImageProxy r7 = (androidx.camera.core.ImageProxy) r7
                p455g.C10318n.m35017b(r27)
                goto L_0x0217
            L_0x002a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0032:
                int r2 = r0.f14666u
                long r9 = r0.f14665t
                java.lang.Object r7 = r0.f14668w
                java.lang.Integer r7 = (java.lang.Integer) r7
                p455g.C10318n.m35017b(r27)
                r21 = r7
                r7 = r27
                r24 = r9
                r10 = r2
                r2 = r24
                goto L_0x01aa
            L_0x0048:
                p455g.C10318n.m35017b(r27)
                r2 = r27
                goto L_0x006f
            L_0x004e:
                p455g.C10318n.m35017b(r27)
                java.lang.Object r2 = r0.f14668w
                kotlinx.coroutines.l0 r2 = (kotlinx.coroutines.C10784l0) r2
                com.mrousavy.camera.CameraView r9 = r0.f14669x
                boolean r9 = r9.getFallbackToSnapshot$react_native_vision_camera_release()
                if (r9 == 0) goto L_0x0070
                java.lang.String r2 = "takePhoto() called, but falling back to Snapshot because 1 use-case is already occupied."
                android.util.Log.i(r5, r2)
                com.mrousavy.camera.CameraView r2 = r0.f14669x
                com.facebook.react.bridge.ReadableMap r3 = r0.f14670y
                r0.f14667v = r8
                java.lang.Object r2 = com.mrousavy.camera.C5193p.m19486a(r2, r3, r0)
                if (r2 != r1) goto L_0x006f
                return r1
            L_0x006f:
                return r2
            L_0x0070:
                long r14 = java.lang.System.nanoTime()
                java.lang.String r9 = "takePhoto() called"
                android.util.Log.i(r5, r9)
                com.mrousavy.camera.CameraView r9 = r0.f14669x
                androidx.camera.core.h2 r9 = r9.getImageCapture$react_native_vision_camera_release()
                if (r9 != 0) goto L_0x009d
                com.mrousavy.camera.CameraView r1 = r0.f14669x
                java.lang.Boolean r1 = r1.getPhoto()
                java.lang.Boolean r2 = p455g.p462v.p464k.p465a.C10397b.m35252a(r8)
                boolean r1 = p455g.p470y.p472d.C10457l.m35316a(r1, r2)
                if (r1 == 0) goto L_0x0097
                com.mrousavy.camera.i r1 = new com.mrousavy.camera.i
                r1.<init>()
                throw r1
            L_0x0097:
                com.mrousavy.camera.g0 r1 = new com.mrousavy.camera.g0
                r1.<init>()
                throw r1
            L_0x009d:
                com.facebook.react.bridge.ReadableMap r9 = r0.f14670y
                java.lang.String r10 = "flash"
                boolean r9 = r9.hasKey(r10)
                if (r9 == 0) goto L_0x00f9
                com.facebook.react.bridge.ReadableMap r9 = r0.f14670y
                java.lang.String r9 = r9.getString(r10)
                com.mrousavy.camera.CameraView r11 = r0.f14669x
                androidx.camera.core.h2 r11 = r11.getImageCapture$react_native_vision_camera_release()
                p455g.p470y.p472d.C10457l.m35317b(r11)
                if (r9 == 0) goto L_0x00ef
                int r12 = r9.hashCode()
                r13 = 3551(0xddf, float:4.976E-42)
                if (r12 == r13) goto L_0x00e1
                r13 = 109935(0x1ad6f, float:1.54052E-40)
                if (r12 == r13) goto L_0x00d6
                r13 = 3005871(0x2dddaf, float:4.212122E-39)
                if (r12 == r13) goto L_0x00cb
                goto L_0x00ef
            L_0x00cb:
                java.lang.String r12 = "auto"
                boolean r12 = r9.equals(r12)
                if (r12 != 0) goto L_0x00d4
                goto L_0x00ef
            L_0x00d4:
                r9 = 0
                goto L_0x00eb
            L_0x00d6:
                java.lang.String r12 = "off"
                boolean r12 = r9.equals(r12)
                if (r12 != 0) goto L_0x00df
                goto L_0x00ef
            L_0x00df:
                r9 = 2
                goto L_0x00eb
            L_0x00e1:
                java.lang.String r12 = "on"
                boolean r12 = r9.equals(r12)
                if (r12 != 0) goto L_0x00ea
                goto L_0x00ef
            L_0x00ea:
                r9 = 1
            L_0x00eb:
                r11.mo2754o0(r9)
                goto L_0x00f9
            L_0x00ef:
                com.mrousavy.camera.y r1 = new com.mrousavy.camera.y
                if (r9 != 0) goto L_0x00f5
                java.lang.String r9 = "(null)"
            L_0x00f5:
                r1.<init>(r10, r9)
                throw r1
            L_0x00f9:
                com.facebook.react.bridge.ReadableMap r9 = r0.f14670y
                java.lang.String r10 = "photoCodec"
                r9.hasKey(r10)
                com.facebook.react.bridge.ReadableMap r9 = r0.f14670y
                java.lang.String r10 = "qualityPrioritization"
                r9.hasKey(r10)
                com.facebook.react.bridge.ReadableMap r9 = r0.f14670y
                java.lang.String r10 = "enableAutoRedEyeReduction"
                r9.hasKey(r10)
                com.facebook.react.bridge.ReadableMap r9 = r0.f14670y
                java.lang.String r10 = "enableDualCameraFusion"
                r9.hasKey(r10)
                com.facebook.react.bridge.ReadableMap r9 = r0.f14670y
                java.lang.String r10 = "enableAutoStabilization"
                r9.hasKey(r10)
                com.facebook.react.bridge.ReadableMap r9 = r0.f14670y
                java.lang.String r10 = "enableAutoDistortionCorrection"
                r9.hasKey(r10)
                com.facebook.react.bridge.ReadableMap r9 = r0.f14670y
                java.lang.String r10 = "skipMetadata"
                boolean r9 = r9.hasKey(r10)
                if (r9 == 0) goto L_0x0135
                com.facebook.react.bridge.ReadableMap r9 = r0.f14670y
                boolean r9 = r9.getBoolean(r10)
                r13 = r9
                goto L_0x0136
            L_0x0135:
                r13 = 0
            L_0x0136:
                com.mrousavy.camera.CameraView r9 = r0.f14669x
                androidx.camera.core.k1 r9 = r9.getCamera$react_native_vision_camera_release()
                p455g.p470y.p472d.C10457l.m35317b(r9)
                androidx.camera.core.q1 r9 = r9.mo2380a()
                androidx.camera.camera2.f.i r9 = androidx.camera.camera2.p008f.C0597i.m2471b(r9)
                java.lang.String r10 = "from(camera!!.cameraInfo)"
                p455g.p470y.p472d.C10457l.m35319d(r9, r10)
                android.hardware.camera2.CameraCharacteristics$Key r10 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
                java.lang.Object r9 = r9.mo2531c(r10)
                r12 = r9
                java.lang.Integer r12 = (java.lang.Integer) r12
                kotlinx.coroutines.s0[] r11 = new kotlinx.coroutines.C10828s0[r7]
                g.v.g r10 = r2.mo26649f()
                r16 = 0
                com.mrousavy.camera.o$a$b r9 = new com.mrousavy.camera.o$a$b
                com.mrousavy.camera.CameraView r3 = r0.f14669x
                r9.<init>(r3, r4)
                r3 = 2
                r17 = 0
                r18 = r9
                r9 = r2
                r7 = r11
                r11 = r16
                r20 = r12
                r12 = r18
                r21 = r13
                r13 = r3
                r22 = r14
                r14 = r17
                kotlinx.coroutines.s0 r3 = kotlinx.coroutines.C10776k.m36626b(r9, r10, r11, r12, r13, r14)
                r7[r6] = r3
                kotlinx.coroutines.f0 r10 = kotlinx.coroutines.C10846x0.m36936b()
                r11 = 0
                com.mrousavy.camera.o$a$c r12 = new com.mrousavy.camera.o$a$c
                com.mrousavy.camera.CameraView r3 = r0.f14669x
                r12.<init>(r3, r4)
                r13 = 2
                r14 = 0
                kotlinx.coroutines.s0 r2 = kotlinx.coroutines.C10776k.m36626b(r9, r10, r11, r12, r13, r14)
                r7[r8] = r2
                r9 = r20
                r0.f14668w = r9
                r2 = r22
                r0.f14665t = r2
                r10 = r21
                r0.f14666u = r10
                r11 = 2
                r0.f14667v = r11
                java.lang.Object r7 = kotlinx.coroutines.C10720h.m36449a(r7, r0)
                if (r7 != r1) goto L_0x01a8
                return r1
            L_0x01a8:
                r21 = r9
            L_0x01aa:
                java.util.List r7 = (java.util.List) r7
                java.util.Iterator r9 = r7.iterator()
            L_0x01b0:
                boolean r11 = r9.hasNext()
                java.lang.String r12 = "Collection contains no element matching the predicate."
                if (r11 == 0) goto L_0x0288
                java.lang.Object r11 = r9.next()
                boolean r13 = r11 instanceof androidx.camera.core.ImageProxy
                if (r13 == 0) goto L_0x01b0
                java.lang.String r9 = "null cannot be cast to non-null type androidx.camera.core.ImageProxy"
                java.util.Objects.requireNonNull(r11, r9)
                r9 = r11
                androidx.camera.core.ImageProxy r9 = (androidx.camera.core.ImageProxy) r9
                java.util.Iterator r7 = r7.iterator()
            L_0x01cc:
                boolean r11 = r7.hasNext()
                if (r11 == 0) goto L_0x0282
                java.lang.Object r11 = r7.next()
                boolean r13 = r11 instanceof java.io.File
                if (r13 == 0) goto L_0x01cc
                java.lang.String r7 = "null cannot be cast to non-null type java.io.File"
                java.util.Objects.requireNonNull(r11, r7)
                r7 = r11
                java.io.File r7 = (java.io.File) r7
                g.y.d.v r11 = new g.y.d.v
                r11.<init>()
                kotlinx.coroutines.f0 r12 = kotlinx.coroutines.C10846x0.m36936b()
                com.mrousavy.camera.o$a$a r13 = new com.mrousavy.camera.o$a$a
                if (r10 == 0) goto L_0x01f2
                r20 = 1
                goto L_0x01f4
            L_0x01f2:
                r20 = 0
            L_0x01f4:
                r23 = 0
                r17 = r13
                r18 = r7
                r19 = r11
                r22 = r9
                r17.<init>(r18, r19, r20, r21, r22, r23)
                r0.f14668w = r9
                r0.f14663r = r7
                r0.f14664s = r11
                r0.f14665t = r2
                r14 = 3
                r0.f14667v = r14
                java.lang.Object r6 = kotlinx.coroutines.C10771j.m36623e(r12, r13, r0)
                if (r6 != r1) goto L_0x0213
                return r1
            L_0x0213:
                r1 = r2
                r6 = r7
                r7 = r9
                r3 = r11
            L_0x0217:
                com.facebook.react.bridge.WritableMap r8 = com.facebook.react.bridge.Arguments.createMap()
                java.lang.String r6 = r6.getAbsolutePath()
                java.lang.String r9 = "path"
                r8.putString(r9, r6)
                int r6 = r7.mo2541e()
                java.lang.String r9 = "width"
                r8.putInt(r9, r6)
                int r6 = r7.mo2539c()
                java.lang.String r9 = "height"
                r8.putInt(r9, r6)
                boolean r6 = com.mrousavy.camera.p168n0.C5182k.m19462a(r7)
                java.lang.String r9 = "isRawPhoto"
                r8.putBoolean(r9, r6)
                T r3 = r3.f27625f
                c.n.a.a r3 = (p027c.p084n.p085a.C2049a) r3
                if (r3 != 0) goto L_0x0246
                goto L_0x024a
            L_0x0246:
                com.facebook.react.bridge.WritableMap r4 = com.mrousavy.camera.p168n0.C5180i.m19459a(r3)
            L_0x024a:
                java.lang.String r3 = "metadata"
                r8.putMap(r3, r4)
                r7.close()
                java.lang.String r3 = "Finished taking photo!"
                android.util.Log.d(r5, r3)
                long r3 = java.lang.System.nanoTime()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Finished function execution in "
                r5.append(r6)
                long r3 = r3 - r1
                r1 = 1000000(0xf4240, float:1.401298E-39)
                long r1 = (long) r1
                long r3 = r3 / r1
                r5.append(r3)
                java.lang.String r1 = "ms"
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                java.lang.String r2 = "CameraView.performance"
                android.util.Log.i(r2, r1)
                java.lang.String r1 = "map"
                p455g.p470y.p472d.C10457l.m35319d(r8, r1)
                return r8
            L_0x0282:
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                r1.<init>(r12)
                throw r1
            L_0x0288:
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                r1.<init>(r12)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.C5188o.C5189a.mo15707n(java.lang.Object):java.lang.Object");
        }

        /* renamed from: q */
        public final Object mo15709j(C10784l0 l0Var, C10376d<? super WritableMap> dVar) {
            return ((C5189a) mo15708b(l0Var, dVar)).mo15707n(C10323s.f27547a);
        }
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    /* renamed from: a */
    public static final Object m19469a(CameraView cameraView, ReadableMap readableMap, C10376d<? super WritableMap> dVar) {
        return C10789m0.m36650e(new C5189a(cameraView, readableMap, (C10376d<? super C5189a>) null), dVar);
    }
}
