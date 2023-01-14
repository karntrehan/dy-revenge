package com.mrousavy.camera;

import androidx.camera.core.C0958q2;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.ReadableMap;
import kotlinx.coroutines.C10784l0;
import p455g.C10318n;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p462v.p464k.p465a.C10399d;
import p455g.p462v.p464k.p465a.C10401f;
import p455g.p462v.p464k.p465a.C10407k;
import p455g.p470y.p471c.C10434p;

/* renamed from: com.mrousavy.camera.m */
public final class C5164m {

    @C10401f(mo25797c = "com.mrousavy.camera.CameraView_FocusKt", mo25798f = "CameraView+Focus.kt", mo25799l = {20, 28}, mo25800m = "focus")
    /* renamed from: com.mrousavy.camera.m$a */
    static final class C5165a extends C10399d {

        /* renamed from: q */
        Object f14647q;

        /* renamed from: r */
        /* synthetic */ Object f14648r;

        /* renamed from: s */
        int f14649s;

        C5165a(C10376d<? super C5165a> dVar) {
            super(dVar);
        }

        /* renamed from: n */
        public final Object mo15707n(Object obj) {
            this.f14648r = obj;
            this.f14649s |= RecyclerView.UNDEFINED_DURATION;
            return C5164m.m19426a((CameraView) null, (ReadableMap) null, this);
        }
    }

    @C10401f(mo25797c = "com.mrousavy.camera.CameraView_FocusKt$focus$point$1", mo25798f = "CameraView+Focus.kt", mo25799l = {}, mo25800m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.m$b */
    static final class C5166b extends C10407k implements C10434p<C10784l0, C10376d<? super C0958q2>, Object> {

        /* renamed from: r */
        int f14650r;

        /* renamed from: s */
        final /* synthetic */ CameraView f14651s;

        /* renamed from: t */
        final /* synthetic */ double f14652t;

        /* renamed from: u */
        final /* synthetic */ double f14653u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5166b(CameraView cameraView, double d, double d2, C10376d<? super C5166b> dVar) {
            super(2, dVar);
            this.f14651s = cameraView;
            this.f14652t = d;
            this.f14653u = d2;
        }

        /* renamed from: b */
        public final C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
            return new C5166b(this.f14651s, this.f14652t, this.f14653u, dVar);
        }

        /* renamed from: n */
        public final Object mo15707n(Object obj) {
            Object unused = C10395d.m35244c();
            if (this.f14650r == 0) {
                C10318n.m35017b(obj);
                return this.f14651s.getPreviewView$react_native_vision_camera_release().getMeteringPointFactory().mo3208b((float) this.f14652t, (float) this.f14653u);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: q */
        public final Object mo15709j(C10784l0 l0Var, C10376d<? super C0958q2> dVar) {
            return ((C5166b) mo15708b(l0Var, dVar)).mo15707n(C10323s.f27547a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m19426a(com.mrousavy.camera.CameraView r22, com.facebook.react.bridge.ReadableMap r23, p455g.p462v.C10376d<? super p455g.C10323s> r24) {
        /*
            r0 = r23
            r1 = r24
            boolean r2 = r1 instanceof com.mrousavy.camera.C5164m.C5165a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.mrousavy.camera.m$a r2 = (com.mrousavy.camera.C5164m.C5165a) r2
            int r3 = r2.f14649s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f14649s = r3
            goto L_0x001c
        L_0x0017:
            com.mrousavy.camera.m$a r2 = new com.mrousavy.camera.m$a
            r2.<init>(r1)
        L_0x001c:
            java.lang.Object r1 = r2.f14648r
            java.lang.Object r3 = p455g.p462v.p463j.C10395d.m35244c()
            int r4 = r2.f14649s
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0042
            if (r4 == r7) goto L_0x003a
            if (r4 != r6) goto L_0x0032
            p455g.C10318n.m35017b(r1)
            goto L_0x00ce
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            java.lang.Object r0 = r2.f14647q
            androidx.camera.core.m1 r0 = (androidx.camera.core.C0938m1) r0
            p455g.C10318n.m35017b(r1)
            goto L_0x009c
        L_0x0042:
            p455g.C10318n.m35017b(r1)
            androidx.camera.core.k1 r1 = r22.getCamera$react_native_vision_camera_release()
            if (r1 != 0) goto L_0x004d
            r1 = r5
            goto L_0x0051
        L_0x004d:
            androidx.camera.core.m1 r1 = r1.mo2384c()
        L_0x0051:
            if (r1 == 0) goto L_0x00dd
            java.lang.String r4 = "x"
            boolean r8 = r0.hasKey(r4)
            if (r8 == 0) goto L_0x00d1
            java.lang.String r8 = "y"
            boolean r9 = r0.hasKey(r8)
            if (r9 == 0) goto L_0x00d1
            android.content.res.Resources r9 = r22.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            double r10 = r0.getDouble(r4)
            double r12 = (double) r9
            double r16 = r10 * r12
            double r8 = r0.getDouble(r8)
            double r18 = r8 * r12
            kotlinx.coroutines.l0 r0 = r22.getCoroutineScope$react_native_vision_camera_release()
            g.v.g r0 = r0.mo26649f()
            com.mrousavy.camera.m$b r4 = new com.mrousavy.camera.m$b
            r20 = 0
            r14 = r4
            r15 = r22
            r14.<init>(r15, r16, r18, r20)
            r2.f14647q = r1
            r2.f14649s = r7
            java.lang.Object r0 = kotlinx.coroutines.C10771j.m36623e(r0, r4, r2)
            if (r0 != r3) goto L_0x0097
            return r3
        L_0x0097:
            r21 = r1
            r1 = r0
            r0 = r21
        L_0x009c:
            java.lang.String r4 = "CameraView.focus(pointMa…loat(), y.toFloat());\n  }"
            p455g.p470y.p472d.C10457l.m35319d(r1, r4)
            androidx.camera.core.q2 r1 = (androidx.camera.core.C0958q2) r1
            androidx.camera.core.a2$a r4 = new androidx.camera.core.a2$a
            r7 = 3
            r4.<init>(r1, r7)
            r7 = 5
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            androidx.camera.core.a2$a r1 = r4.mo2557c(r7, r1)
            androidx.camera.core.a2 r1 = r1.mo2556b()
            java.lang.String r4 = "Builder(point, FocusMete…er 5 seconds\n    .build()"
            p455g.p470y.p472d.C10457l.m35319d(r1, r4)
            e.f.b.a.a.b r0 = r0.mo2335i(r1)
            java.lang.String r1 = "cameraControl.startFocusAndMetering(action)"
            p455g.p470y.p472d.C10457l.m35319d(r0, r1)
            r2.f14647q = r5
            r2.f14649s = r6
            java.lang.Object r0 = kotlinx.coroutines.p505k2.C10780a.m36633b(r0, r2)
            if (r0 != r3) goto L_0x00ce
            return r3
        L_0x00ce:
            g.s r0 = p455g.C10323s.f27547a
            return r0
        L_0x00d1:
            com.mrousavy.camera.y r1 = new com.mrousavy.camera.y
            java.lang.String r0 = r23.toString()
            java.lang.String r2 = "point"
            r1.<init>(r2, r0)
            throw r1
        L_0x00dd:
            com.mrousavy.camera.i r0 = new com.mrousavy.camera.i
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.C5164m.m19426a(com.mrousavy.camera.CameraView, com.facebook.react.bridge.ReadableMap, g.v.d):java.lang.Object");
    }
}
