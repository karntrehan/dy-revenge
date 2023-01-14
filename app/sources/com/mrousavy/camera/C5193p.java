package com.mrousavy.camera;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import kotlinx.coroutines.C10784l0;
import p027c.p084n.p085a.C2049a;
import p455g.C10318n;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p462v.p464k.p465a.C10399d;
import p455g.p462v.p464k.p465a.C10401f;
import p455g.p462v.p464k.p465a.C10407k;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10467v;

/* renamed from: com.mrousavy.camera.p */
public final class C5193p {

    @C10401f(mo25797c = "com.mrousavy.camera.CameraView_TakeSnapshotKt", mo25798f = "CameraView+TakeSnapshot.kt", mo25799l = {16}, mo25800m = "takeSnapshot")
    /* renamed from: com.mrousavy.camera.p$a */
    static final class C5194a extends C10399d {

        /* renamed from: q */
        /* synthetic */ Object f14684q;

        /* renamed from: r */
        int f14685r;

        C5194a(C10376d<? super C5194a> dVar) {
            super(dVar);
        }

        /* renamed from: n */
        public final Object mo15707n(Object obj) {
            this.f14684q = obj;
            this.f14685r |= RecyclerView.UNDEFINED_DURATION;
            return C5193p.m19486a((CameraView) null, (ReadableMap) null, this);
        }
    }

    @C10401f(mo25797c = "com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2", mo25798f = "CameraView+TakeSnapshot.kt", mo25799l = {22, 25, 34}, mo25800m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.p$b */
    static final class C5195b extends C10407k implements C10434p<C10784l0, C10376d<? super WritableMap>, Object> {

        /* renamed from: r */
        Object f14686r;

        /* renamed from: s */
        Object f14687s;

        /* renamed from: t */
        Object f14688t;

        /* renamed from: u */
        Object f14689u;

        /* renamed from: v */
        boolean f14690v;

        /* renamed from: w */
        int f14691w;

        /* renamed from: x */
        final /* synthetic */ CameraView f14692x;

        /* renamed from: y */
        final /* synthetic */ ReadableMap f14693y;

        @C10401f(mo25797c = "com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2$1", mo25798f = "CameraView+TakeSnapshot.kt", mo25799l = {}, mo25800m = "invokeSuspend")
        /* renamed from: com.mrousavy.camera.p$b$a */
        static final class C5196a extends C10407k implements C10434p<C10784l0, C10376d<? super C10323s>, Object> {

            /* renamed from: r */
            int f14694r;

            /* renamed from: s */
            final /* synthetic */ C10467v<File> f14695s;

            /* renamed from: t */
            final /* synthetic */ CameraView f14696t;

            /* renamed from: u */
            final /* synthetic */ C10467v<C2049a> f14697u;

            /* renamed from: v */
            final /* synthetic */ Bitmap f14698v;

            /* renamed from: w */
            final /* synthetic */ int f14699w;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5196a(C10467v<File> vVar, CameraView cameraView, C10467v<C2049a> vVar2, Bitmap bitmap, int i, C10376d<? super C5196a> dVar) {
                super(2, dVar);
                this.f14695s = vVar;
                this.f14696t = cameraView;
                this.f14697u = vVar2;
                this.f14698v = bitmap;
                this.f14699w = i;
            }

            /* renamed from: b */
            public final C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
                return new C5196a(this.f14695s, this.f14696t, this.f14697u, this.f14698v, this.f14699w, dVar);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
                p455g.p469x.C10416a.m35288a(r6, r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
                throw r1;
             */
            /* renamed from: n */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object mo15707n(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object unused = p455g.p462v.p463j.C10395d.m35244c()
                    int r0 = r5.f14694r
                    if (r0 != 0) goto L_0x0059
                    p455g.C10318n.m35017b(r6)
                    g.y.d.v<java.io.File> r6 = r5.f14695s
                    com.mrousavy.camera.CameraView r0 = r5.f14696t
                    android.content.Context r0 = r0.getContext()
                    java.io.File r0 = r0.getCacheDir()
                    java.lang.String r1 = "mrousavy"
                    java.lang.String r2 = ".jpg"
                    java.io.File r0 = java.io.File.createTempFile(r1, r2, r0)
                    r0.deleteOnExit()
                    g.s r1 = p455g.C10323s.f27547a
                    java.lang.String r2 = "createTempFile(\"mrousavy….apply { deleteOnExit() }"
                    p455g.p470y.p472d.C10457l.m35319d(r0, r2)
                    r6.f27625f = r0
                    java.io.FileOutputStream r6 = new java.io.FileOutputStream
                    g.y.d.v<java.io.File> r0 = r5.f14695s
                    T r0 = r0.f27625f
                    java.io.File r0 = (java.io.File) r0
                    r6.<init>(r0)
                    android.graphics.Bitmap r0 = r5.f14698v
                    int r2 = r5.f14699w
                    r3 = 0
                    android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0052 }
                    r0.compress(r4, r2, r6)     // Catch:{ all -> 0x0052 }
                    p455g.p469x.C10416a.m35288a(r6, r3)
                    g.y.d.v<c.n.a.a> r6 = r5.f14697u
                    c.n.a.a r0 = new c.n.a.a
                    g.y.d.v<java.io.File> r2 = r5.f14695s
                    T r2 = r2.f27625f
                    java.io.File r2 = (java.io.File) r2
                    r0.<init>((java.io.File) r2)
                    r6.f27625f = r0
                    return r1
                L_0x0052:
                    r0 = move-exception
                    throw r0     // Catch:{ all -> 0x0054 }
                L_0x0054:
                    r1 = move-exception
                    p455g.p469x.C10416a.m35288a(r6, r0)
                    throw r1
                L_0x0059:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.C5193p.C5195b.C5196a.mo15707n(java.lang.Object):java.lang.Object");
            }

            /* renamed from: q */
            public final Object mo15709j(C10784l0 l0Var, C10376d<? super C10323s> dVar) {
                return ((C5196a) mo15708b(l0Var, dVar)).mo15707n(C10323s.f27547a);
            }
        }

        @C10401f(mo25797c = "com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2$bitmap$1", mo25798f = "CameraView+TakeSnapshot.kt", mo25799l = {}, mo25800m = "invokeSuspend")
        /* renamed from: com.mrousavy.camera.p$b$b */
        static final class C5197b extends C10407k implements C10434p<C10784l0, C10376d<? super Bitmap>, Object> {

            /* renamed from: r */
            int f14700r;

            /* renamed from: s */
            final /* synthetic */ CameraView f14701s;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5197b(CameraView cameraView, C10376d<? super C5197b> dVar) {
                super(2, dVar);
                this.f14701s = cameraView;
            }

            /* renamed from: b */
            public final C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
                return new C5197b(this.f14701s, dVar);
            }

            /* renamed from: n */
            public final Object mo15707n(Object obj) {
                Object unused = C10395d.m35244c();
                if (this.f14700r == 0) {
                    C10318n.m35017b(obj);
                    Bitmap bitmap = this.f14701s.getPreviewView$react_native_vision_camera_release().getBitmap();
                    if (bitmap != null) {
                        return bitmap;
                    }
                    throw new C5156i();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: q */
            public final Object mo15709j(C10784l0 l0Var, C10376d<? super Bitmap> dVar) {
                return ((C5197b) mo15708b(l0Var, dVar)).mo15707n(C10323s.f27547a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5195b(CameraView cameraView, ReadableMap readableMap, C10376d<? super C5195b> dVar) {
            super(2, dVar);
            this.f14692x = cameraView;
            this.f14693y = readableMap;
        }

        /* renamed from: b */
        public final C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
            return new C5195b(this.f14692x, this.f14693y, dVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4 A[Catch:{ all -> 0x0058 }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00cd A[Catch:{ all -> 0x0058 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0103 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0104  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x013d A[Catch:{ all -> 0x0031 }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0145 A[Catch:{ all -> 0x0031 }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0147 A[Catch:{ all -> 0x0031 }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0156  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x016a  */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo15707n(java.lang.Object r21) {
            /*
                r20 = this;
                r1 = r20
                java.lang.String r0 = "skipMetadata"
                java.lang.String r2 = "quality"
                java.lang.Object r3 = p455g.p462v.p463j.C10395d.m35244c()
                int r4 = r1.f14691w
                r5 = 0
                r6 = 3
                r7 = 2
                java.lang.String r8 = "on"
                r9 = 1
                if (r4 == 0) goto L_0x005d
                if (r4 == r9) goto L_0x004e
                if (r4 == r7) goto L_0x003c
                if (r4 != r6) goto L_0x0034
                boolean r2 = r1.f14690v
                java.lang.Object r3 = r1.f14689u
                g.y.d.v r3 = (p455g.p470y.p472d.C10467v) r3
                java.lang.Object r4 = r1.f14688t
                g.y.d.v r4 = (p455g.p470y.p472d.C10467v) r4
                java.lang.Object r6 = r1.f14687s
                android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
                java.lang.Object r7 = r1.f14686r
                androidx.camera.core.k1 r7 = (androidx.camera.core.C0930k1) r7
                p455g.C10318n.m35017b(r21)     // Catch:{ all -> 0x0031 }
                goto L_0x010c
            L_0x0031:
                r0 = move-exception
                goto L_0x0168
            L_0x0034:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x003c:
                boolean r4 = r1.f14690v
                java.lang.Object r7 = r1.f14686r
                androidx.camera.core.k1 r7 = (androidx.camera.core.C0930k1) r7
                p455g.C10318n.m35017b(r21)     // Catch:{ all -> 0x004a }
                r9 = r7
                r7 = r21
                goto L_0x00b5
            L_0x004a:
                r0 = move-exception
                r2 = r4
                goto L_0x0168
            L_0x004e:
                boolean r4 = r1.f14690v
                java.lang.Object r9 = r1.f14686r
                androidx.camera.core.k1 r9 = (androidx.camera.core.C0930k1) r9
                p455g.C10318n.m35017b(r21)     // Catch:{ all -> 0x0058 }
                goto L_0x0097
            L_0x0058:
                r0 = move-exception
                r2 = r4
                r7 = r9
                goto L_0x0168
            L_0x005d:
                p455g.C10318n.m35017b(r21)
                com.mrousavy.camera.CameraView r4 = r1.f14692x
                androidx.camera.core.k1 r4 = r4.getCamera$react_native_vision_camera_release()
                if (r4 == 0) goto L_0x017c
                com.facebook.react.bridge.ReadableMap r10 = r1.f14693y
                java.lang.String r11 = "flash"
                java.lang.String r10 = r10.getString(r11)
                boolean r10 = p455g.p470y.p472d.C10457l.m35316a(r10, r8)
                if (r10 == 0) goto L_0x0095
                androidx.camera.core.m1 r11 = r4.mo2384c()     // Catch:{ all -> 0x0090 }
                e.f.b.a.a.b r11 = r11.mo2330f(r9)     // Catch:{ all -> 0x0090 }
                java.lang.String r12 = "camera.cameraControl.enableTorch(true)"
                p455g.p470y.p472d.C10457l.m35319d(r11, r12)     // Catch:{ all -> 0x0090 }
                r1.f14686r = r4     // Catch:{ all -> 0x0090 }
                r1.f14690v = r10     // Catch:{ all -> 0x0090 }
                r1.f14691w = r9     // Catch:{ all -> 0x0090 }
                java.lang.Object r9 = kotlinx.coroutines.p505k2.C10780a.m36633b(r11, r1)     // Catch:{ all -> 0x0090 }
                if (r9 != r3) goto L_0x0095
                return r3
            L_0x0090:
                r0 = move-exception
                r7 = r4
                r2 = r10
                goto L_0x0168
            L_0x0095:
                r9 = r4
                r4 = r10
            L_0x0097:
                com.mrousavy.camera.CameraView r10 = r1.f14692x     // Catch:{ all -> 0x0058 }
                kotlinx.coroutines.l0 r10 = r10.getCoroutineScope$react_native_vision_camera_release()     // Catch:{ all -> 0x0058 }
                g.v.g r10 = r10.mo26649f()     // Catch:{ all -> 0x0058 }
                com.mrousavy.camera.p$b$b r11 = new com.mrousavy.camera.p$b$b     // Catch:{ all -> 0x0058 }
                com.mrousavy.camera.CameraView r12 = r1.f14692x     // Catch:{ all -> 0x0058 }
                r11.<init>(r12, r5)     // Catch:{ all -> 0x0058 }
                r1.f14686r = r9     // Catch:{ all -> 0x0058 }
                r1.f14690v = r4     // Catch:{ all -> 0x0058 }
                r1.f14691w = r7     // Catch:{ all -> 0x0058 }
                java.lang.Object r7 = kotlinx.coroutines.C10771j.m36623e(r10, r11, r1)     // Catch:{ all -> 0x0058 }
                if (r7 != r3) goto L_0x00b5
                return r3
            L_0x00b5:
                java.lang.String r10 = "CameraView.takeSnapshot(…meraNotReadyError()\n    }"
                p455g.p470y.p472d.C10457l.m35319d(r7, r10)     // Catch:{ all -> 0x0058 }
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch:{ all -> 0x0058 }
                com.facebook.react.bridge.ReadableMap r10 = r1.f14693y     // Catch:{ all -> 0x0058 }
                boolean r10 = r10.hasKey(r2)     // Catch:{ all -> 0x0058 }
                if (r10 == 0) goto L_0x00cd
                com.facebook.react.bridge.ReadableMap r10 = r1.f14693y     // Catch:{ all -> 0x0058 }
                int r2 = r10.getInt(r2)     // Catch:{ all -> 0x0058 }
                r16 = r2
                goto L_0x00d1
            L_0x00cd:
                r2 = 100
                r16 = 100
            L_0x00d1:
                g.y.d.v r2 = new g.y.d.v     // Catch:{ all -> 0x0058 }
                r2.<init>()     // Catch:{ all -> 0x0058 }
                g.y.d.v r10 = new g.y.d.v     // Catch:{ all -> 0x0058 }
                r10.<init>()     // Catch:{ all -> 0x0058 }
                kotlinx.coroutines.f0 r15 = kotlinx.coroutines.C10846x0.m36936b()     // Catch:{ all -> 0x0058 }
                com.mrousavy.camera.p$b$a r14 = new com.mrousavy.camera.p$b$a     // Catch:{ all -> 0x0058 }
                com.mrousavy.camera.CameraView r13 = r1.f14692x     // Catch:{ all -> 0x0058 }
                r17 = 0
                r11 = r14
                r12 = r2
                r5 = r14
                r14 = r10
                r18 = r15
                r15 = r7
                r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0058 }
                r1.f14686r = r9     // Catch:{ all -> 0x0058 }
                r1.f14687s = r7     // Catch:{ all -> 0x0058 }
                r1.f14688t = r2     // Catch:{ all -> 0x0058 }
                r1.f14689u = r10     // Catch:{ all -> 0x0058 }
                r1.f14690v = r4     // Catch:{ all -> 0x0058 }
                r1.f14691w = r6     // Catch:{ all -> 0x0058 }
                r6 = r18
                java.lang.Object r5 = kotlinx.coroutines.C10771j.m36623e(r6, r5, r1)     // Catch:{ all -> 0x0058 }
                if (r5 != r3) goto L_0x0104
                return r3
            L_0x0104:
                r6 = r7
                r7 = r9
                r3 = r10
                r19 = r4
                r4 = r2
                r2 = r19
            L_0x010c:
                com.facebook.react.bridge.WritableMap r5 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ all -> 0x0031 }
                java.lang.String r9 = "path"
                T r4 = r4.f27625f     // Catch:{ all -> 0x0031 }
                java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x0031 }
                java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x0031 }
                r5.putString(r9, r4)     // Catch:{ all -> 0x0031 }
                java.lang.String r4 = "width"
                int r9 = r6.getWidth()     // Catch:{ all -> 0x0031 }
                r5.putInt(r4, r9)     // Catch:{ all -> 0x0031 }
                java.lang.String r4 = "height"
                int r6 = r6.getHeight()     // Catch:{ all -> 0x0031 }
                r5.putInt(r4, r6)     // Catch:{ all -> 0x0031 }
                java.lang.String r4 = "isRawPhoto"
                r6 = 0
                r5.putBoolean(r4, r6)     // Catch:{ all -> 0x0031 }
                com.facebook.react.bridge.ReadableMap r4 = r1.f14693y     // Catch:{ all -> 0x0031 }
                boolean r4 = r4.hasKey(r0)     // Catch:{ all -> 0x0031 }
                if (r4 == 0) goto L_0x0143
                com.facebook.react.bridge.ReadableMap r4 = r1.f14693y     // Catch:{ all -> 0x0031 }
                boolean r6 = r4.getBoolean(r0)     // Catch:{ all -> 0x0031 }
            L_0x0143:
                if (r6 == 0) goto L_0x0147
                r0 = 0
                goto L_0x014f
            L_0x0147:
                T r0 = r3.f27625f     // Catch:{ all -> 0x0031 }
                c.n.a.a r0 = (p027c.p084n.p085a.C2049a) r0     // Catch:{ all -> 0x0031 }
                com.facebook.react.bridge.WritableMap r0 = com.mrousavy.camera.p168n0.C5180i.m19459a(r0)     // Catch:{ all -> 0x0031 }
            L_0x014f:
                java.lang.String r3 = "metadata"
                r5.putMap(r3, r0)     // Catch:{ all -> 0x0031 }
                if (r2 == 0) goto L_0x0167
                androidx.camera.core.m1 r0 = r7.mo2384c()
                com.mrousavy.camera.CameraView r2 = r1.f14692x
                java.lang.String r2 = r2.getTorch()
                boolean r2 = p455g.p470y.p472d.C10457l.m35316a(r2, r8)
                r0.mo2330f(r2)
            L_0x0167:
                return r5
            L_0x0168:
                if (r2 == 0) goto L_0x017b
                androidx.camera.core.m1 r2 = r7.mo2384c()
                com.mrousavy.camera.CameraView r3 = r1.f14692x
                java.lang.String r3 = r3.getTorch()
                boolean r3 = p455g.p470y.p472d.C10457l.m35316a(r3, r8)
                r2.mo2330f(r3)
            L_0x017b:
                throw r0
            L_0x017c:
                com.mrousavy.camera.i r0 = new com.mrousavy.camera.i
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.C5193p.C5195b.mo15707n(java.lang.Object):java.lang.Object");
        }

        /* renamed from: q */
        public final Object mo15709j(C10784l0 l0Var, C10376d<? super WritableMap> dVar) {
            return ((C5195b) mo15708b(l0Var, dVar)).mo15707n(C10323s.f27547a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m19486a(com.mrousavy.camera.CameraView r4, com.facebook.react.bridge.ReadableMap r5, p455g.p462v.C10376d<? super com.facebook.react.bridge.WritableMap> r6) {
        /*
            boolean r0 = r6 instanceof com.mrousavy.camera.C5193p.C5194a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.mrousavy.camera.p$a r0 = (com.mrousavy.camera.C5193p.C5194a) r0
            int r1 = r0.f14685r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f14685r = r1
            goto L_0x0018
        L_0x0013:
            com.mrousavy.camera.p$a r0 = new com.mrousavy.camera.p$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f14684q
            java.lang.Object r1 = p455g.p462v.p463j.C10395d.m35244c()
            int r2 = r0.f14685r
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p455g.C10318n.m35017b(r6)
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            p455g.C10318n.m35017b(r6)
            com.mrousavy.camera.p$b r6 = new com.mrousavy.camera.p$b
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.f14685r = r3
            java.lang.Object r6 = kotlinx.coroutines.C10789m0.m36650e(r6, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            java.lang.String r4 = "CameraView.takeSnapshot(…orch == \"on\")\n    }\n  }\n}"
            p455g.p470y.p472d.C10457l.m35319d(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.C5193p.m19486a(com.mrousavy.camera.CameraView, com.facebook.react.bridge.ReadableMap, g.v.d):java.lang.Object");
    }
}
