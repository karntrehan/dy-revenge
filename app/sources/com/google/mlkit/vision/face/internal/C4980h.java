package com.google.mlkit.vision.face.internal;

import android.os.SystemClock;
import com.google.android.gms.common.internal.C3705r;
import com.google.mlkit.vision.common.internal.C4963a;
import com.google.mlkit.vision.common.internal.C4966d;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p174e.p319f.p320a.p335c.p345f.p356k.C7778a8;
import p174e.p319f.p320a.p335c.p345f.p356k.C7791b8;
import p174e.p319f.p320a.p335c.p345f.p356k.C7811d2;
import p174e.p319f.p320a.p335c.p345f.p356k.C7816d7;
import p174e.p319f.p320a.p335c.p345f.p356k.C7817d8;
import p174e.p319f.p320a.p335c.p345f.p356k.C7824e2;
import p174e.p319f.p320a.p335c.p345f.p356k.C7837f2;
import p174e.p319f.p320a.p335c.p345f.p356k.C7923la;
import p174e.p319f.p320a.p335c.p345f.p356k.C7949na;
import p174e.p319f.p320a.p335c.p345f.p356k.C7959o7;
import p174e.p319f.p320a.p335c.p345f.p356k.C7962oa;
import p174e.p319f.p320a.p335c.p345f.p356k.C7972p7;
import p174e.p319f.p320a.p335c.p345f.p356k.C7986q8;
import p174e.p319f.p320a.p335c.p345f.p356k.C7999r8;
import p174e.p319f.p320a.p335c.p345f.p356k.C8024t7;
import p174e.p319f.p406d.p407a.p409c.C9601f;
import p174e.p319f.p406d.p407a.p409c.C9606i;
import p174e.p319f.p406d.p411b.p413b.C9631a;
import p174e.p319f.p406d.p411b.p414c.C9633a;
import p174e.p319f.p406d.p411b.p414c.C9637e;

/* renamed from: com.google.mlkit.vision.face.internal.h */
public final class C4980h extends C9601f<List<C9633a>, C9631a> {

    /* renamed from: d */
    static final AtomicBoolean f13884d = new AtomicBoolean(true);

    /* renamed from: e */
    private static final C4966d f13885e = C4966d.m18871b();

    /* renamed from: f */
    private final C9637e f13886f;

    /* renamed from: g */
    private final C7923la f13887g;

    /* renamed from: h */
    private final C7949na f13888h;

    /* renamed from: i */
    private final C4974b f13889i;

    /* renamed from: j */
    private boolean f13890j;

    /* renamed from: k */
    private final C4963a f13891k = new C4963a();

    public C4980h(C7923la laVar, C9637e eVar, C4974b bVar) {
        C3705r.m14347l(eVar, "FaceDetectorOptions can not be null");
        this.f13886f = eVar;
        this.f13887g = laVar;
        this.f13889i = bVar;
        this.f13888h = C7949na.m28095a(C9606i.m32708c().mo24098b());
    }

    /* renamed from: j */
    static void m18892j(List<C9633a> list) {
        for (C9633a n : list) {
            n.mo24150n(-1);
        }
    }

    /* renamed from: m */
    private final synchronized void m18893m(C7778a8 a8Var, long j, C9631a aVar, int i, int i2) {
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            this.f13887g.mo21441b(new C4979g(this, elapsedRealtime, a8Var, i, i2, aVar), C7791b8.ON_DEVICE_FACE_DETECT);
            C7824e2 e2Var = new C7824e2();
            e2Var.mo21307c(a8Var);
            e2Var.mo21308d(Boolean.valueOf(f13884d.get()));
            e2Var.mo21305a(Integer.valueOf(i));
            e2Var.mo21309e(Integer.valueOf(i2));
            e2Var.mo21306b(C4982j.m18900a(this.f13886f));
            this.f13887g.mo21445f(e2Var.mo21310f(), elapsedRealtime, C7791b8.AGGREGATED_ON_DEVICE_FACE_DETECTION, new C4978f(this));
            long currentTimeMillis = System.currentTimeMillis();
            this.f13888h.mo21486c(true != this.f13890j ? 24303 : 24304, a8Var.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
        }
    }

    /* renamed from: b */
    public final synchronized void mo14956b() {
        this.f13890j = this.f13889i.mo14991b();
    }

    /* renamed from: d */
    public final synchronized void mo14957d() {
        this.f13889i.zzb();
        f13884d.set(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0109 A[Catch:{ a -> 0x012a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010b A[Catch:{ a -> 0x012a }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0112 A[Catch:{ a -> 0x012a }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0114 A[Catch:{ a -> 0x012a }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013a  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<p174e.p319f.p406d.p411b.p414c.C9633a> mo14958h(p174e.p319f.p406d.p411b.p413b.C9631a r21) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            monitor-enter(r20)
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0149 }
            com.google.mlkit.vision.common.internal.a r0 = r8.f13891k     // Catch:{ all -> 0x0149 }
            r0.mo14974a(r9)     // Catch:{ all -> 0x0149 }
            com.google.mlkit.vision.face.internal.b r0 = r8.f13889i     // Catch:{ a -> 0x012c }
            android.util.Pair r0 = r0.mo14992c(r9)     // Catch:{ a -> 0x012c }
            java.lang.Object r1 = r0.first     // Catch:{ a -> 0x012c }
            java.util.List r1 = (java.util.List) r1     // Catch:{ a -> 0x012c }
            java.lang.Object r0 = r0.second     // Catch:{ a -> 0x012c }
            java.util.List r0 = (java.util.List) r0     // Catch:{ a -> 0x012c }
            if (r1 != 0) goto L_0x002b
            if (r0 == 0) goto L_0x0021
            goto L_0x002b
        L_0x0021:
            e.f.d.a.a r0 = new e.f.d.a.a     // Catch:{ a -> 0x012c }
            java.lang.String r1 = "No detector is enabled"
            r2 = 13
            r0.<init>(r1, r2)     // Catch:{ a -> 0x012c }
            throw r0     // Catch:{ a -> 0x012c }
        L_0x002b:
            if (r1 != 0) goto L_0x0038
            java.lang.Object r2 = com.google.android.gms.common.internal.C3705r.m14346k(r0)     // Catch:{ a -> 0x012c }
        L_0x0031:
            java.util.List r2 = (java.util.List) r2     // Catch:{ a -> 0x012c }
            r9 = r2
            r18 = r10
            goto L_0x0105
        L_0x0038:
            if (r0 != 0) goto L_0x003f
            java.lang.Object r2 = com.google.android.gms.common.internal.C3705r.m14346k(r1)     // Catch:{ a -> 0x012c }
            goto L_0x0031
        L_0x003f:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ a -> 0x012c }
            r2.<init>()     // Catch:{ a -> 0x012c }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ a -> 0x012c }
        L_0x0048:
            boolean r4 = r3.hasNext()     // Catch:{ a -> 0x012c }
            if (r4 == 0) goto L_0x00fd
            java.lang.Object r4 = r3.next()     // Catch:{ a -> 0x012c }
            e.f.d.b.c.a r4 = (p174e.p319f.p406d.p411b.p414c.C9633a) r4     // Catch:{ a -> 0x012c }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ a -> 0x012c }
            r6 = 0
        L_0x0059:
            boolean r7 = r5.hasNext()     // Catch:{ a -> 0x012c }
            if (r7 == 0) goto L_0x00ec
            java.lang.Object r7 = r5.next()     // Catch:{ a -> 0x012c }
            e.f.d.b.c.a r7 = (p174e.p319f.p406d.p411b.p414c.C9633a) r7     // Catch:{ a -> 0x012c }
            android.graphics.Rect r13 = r4.mo24138b()     // Catch:{ a -> 0x012c }
            if (r13 == 0) goto L_0x00d9
            android.graphics.Rect r13 = r7.mo24138b()     // Catch:{ a -> 0x012c }
            if (r13 == 0) goto L_0x00d9
            android.graphics.Rect r13 = r4.mo24138b()     // Catch:{ a -> 0x012c }
            android.graphics.Rect r14 = r7.mo24138b()     // Catch:{ a -> 0x012c }
            boolean r15 = r13.intersect(r14)     // Catch:{ a -> 0x012c }
            if (r15 == 0) goto L_0x00d9
            int r15 = r13.right     // Catch:{ a -> 0x012c }
            int r12 = r14.right     // Catch:{ a -> 0x012c }
            int r12 = java.lang.Math.min(r15, r12)     // Catch:{ a -> 0x012c }
            int r15 = r13.left     // Catch:{ a -> 0x012c }
            r16 = r3
            int r3 = r14.left     // Catch:{ a -> 0x012c }
            int r3 = java.lang.Math.max(r15, r3)     // Catch:{ a -> 0x012c }
            int r12 = r12 - r3
            int r3 = r13.bottom     // Catch:{ a -> 0x012c }
            int r15 = r14.bottom     // Catch:{ a -> 0x012c }
            int r3 = java.lang.Math.min(r3, r15)     // Catch:{ a -> 0x012c }
            int r15 = r13.top     // Catch:{ a -> 0x012c }
            r17 = r5
            int r5 = r14.top     // Catch:{ a -> 0x012c }
            int r5 = java.lang.Math.max(r15, r5)     // Catch:{ a -> 0x012c }
            int r3 = r3 - r5
            int r12 = r12 * r3
            r18 = r10
            double r9 = (double) r12
            int r3 = r13.right     // Catch:{ a -> 0x012a }
            int r5 = r13.left     // Catch:{ a -> 0x012a }
            int r3 = r3 - r5
            int r5 = r13.bottom     // Catch:{ a -> 0x012a }
            int r11 = r13.top     // Catch:{ a -> 0x012a }
            int r5 = r5 - r11
            int r3 = r3 * r5
            double r11 = (double) r3     // Catch:{ a -> 0x012a }
            int r3 = r14.right     // Catch:{ a -> 0x012a }
            int r5 = r14.left     // Catch:{ a -> 0x012a }
            int r3 = r3 - r5
            int r5 = r14.bottom     // Catch:{ a -> 0x012a }
            int r13 = r14.top     // Catch:{ a -> 0x012a }
            int r5 = r5 - r13
            int r3 = r3 * r5
            double r13 = (double) r3     // Catch:{ a -> 0x012a }
            double r11 = r11 + r13
            double r11 = r11 - r9
            double r9 = r9 / r11
            r11 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x00df
            android.util.SparseArray r3 = r4.mo24148l()     // Catch:{ a -> 0x012a }
            r7.mo24149m(r3)     // Catch:{ a -> 0x012a }
            r6 = 1
            goto L_0x00df
        L_0x00d9:
            r16 = r3
            r17 = r5
            r18 = r10
        L_0x00df:
            r2.add(r7)     // Catch:{ a -> 0x012a }
            r9 = r21
            r3 = r16
            r5 = r17
            r10 = r18
            goto L_0x0059
        L_0x00ec:
            r16 = r3
            r18 = r10
            if (r6 != 0) goto L_0x00f5
            r2.add(r4)     // Catch:{ a -> 0x012a }
        L_0x00f5:
            r9 = r21
            r3 = r16
            r10 = r18
            goto L_0x0048
        L_0x00fd:
            r18 = r10
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ a -> 0x012a }
            r3.<init>(r2)     // Catch:{ a -> 0x012a }
            r9 = r3
        L_0x0105:
            e.f.a.c.f.k.a8 r2 = p174e.p319f.p320a.p335c.p345f.p356k.C7778a8.NO_ERROR     // Catch:{ a -> 0x012a }
            if (r0 != 0) goto L_0x010b
            r6 = 0
            goto L_0x0110
        L_0x010b:
            int r0 = r0.size()     // Catch:{ a -> 0x012a }
            r6 = r0
        L_0x0110:
            if (r1 != 0) goto L_0x0114
            r7 = 0
            goto L_0x0119
        L_0x0114:
            int r0 = r1.size()     // Catch:{ a -> 0x012a }
            r7 = r0
        L_0x0119:
            r1 = r20
            r3 = r18
            r5 = r21
            r1.m18893m(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x012a }
            java.util.concurrent.atomic.AtomicBoolean r0 = f13884d     // Catch:{ a -> 0x012a }
            r1 = 0
            r0.set(r1)     // Catch:{ a -> 0x012a }
            monitor-exit(r20)
            return r9
        L_0x012a:
            r0 = move-exception
            goto L_0x012f
        L_0x012c:
            r0 = move-exception
            r18 = r10
        L_0x012f:
            int r1 = r0.mo24081a()     // Catch:{ all -> 0x0149 }
            r2 = 14
            if (r1 != r2) goto L_0x013a
            e.f.a.c.f.k.a8 r1 = p174e.p319f.p320a.p335c.p345f.p356k.C7778a8.MODEL_NOT_DOWNLOADED     // Catch:{ all -> 0x0149 }
            goto L_0x013c
        L_0x013a:
            e.f.a.c.f.k.a8 r1 = p174e.p319f.p320a.p335c.p345f.p356k.C7778a8.UNKNOWN_ERROR     // Catch:{ all -> 0x0149 }
        L_0x013c:
            r2 = r1
            r6 = 0
            r7 = 0
            r1 = r20
            r3 = r18
            r5 = r21
            r1.m18893m(r2, r3, r5, r6, r7)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0149:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.internal.C4980h.mo14958h(e.f.d.b.b.a):java.util.List");
    }

    /* renamed from: k */
    public final /* synthetic */ C7962oa mo14998k(long j, C7778a8 a8Var, int i, int i2, C9631a aVar) {
        C7986q8 q8Var = new C7986q8();
        C8024t7 t7Var = new C8024t7();
        t7Var.mo21579c(Long.valueOf(j));
        t7Var.mo21580d(a8Var);
        t7Var.mo21581e(Boolean.valueOf(f13884d.get()));
        Boolean bool = Boolean.TRUE;
        t7Var.mo21577a(bool);
        t7Var.mo21578b(bool);
        q8Var.mo21550g(t7Var.mo21582f());
        q8Var.mo21548e(C4982j.m18900a(this.f13886f));
        q8Var.mo21547d(Integer.valueOf(i));
        q8Var.mo21551h(Integer.valueOf(i2));
        C4966d dVar = f13885e;
        int c = dVar.mo14982c(aVar);
        int d = dVar.mo14983d(aVar);
        C7959o7 o7Var = new C7959o7();
        o7Var.mo21507a(c != -1 ? c != 35 ? c != 842094169 ? c != 16 ? c != 17 ? C7972p7.UNKNOWN_FORMAT : C7972p7.NV21 : C7972p7.NV16 : C7972p7.YV12 : C7972p7.YUV_420_888 : C7972p7.BITMAP);
        o7Var.mo21508b(Integer.valueOf(d));
        q8Var.mo21549f(o7Var.mo21509d());
        C7999r8 i3 = q8Var.mo21552i();
        C7817d8 d8Var = new C7817d8();
        d8Var.mo21272e(Boolean.valueOf(this.f13890j));
        d8Var.mo21273f(i3);
        return C7962oa.m28112d(d8Var);
    }

    /* renamed from: l */
    public final /* synthetic */ C7962oa mo14999l(C7837f2 f2Var, int i, C7816d7 d7Var) {
        C7817d8 d8Var = new C7817d8();
        d8Var.mo21272e(Boolean.valueOf(this.f13890j));
        C7811d2 d2Var = new C7811d2();
        d2Var.mo21258a(Integer.valueOf(i));
        d2Var.mo21260c(f2Var);
        d2Var.mo21259b(d7Var);
        d8Var.mo21270c(d2Var.mo21261e());
        return C7962oa.m28112d(d8Var);
    }
}
