package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import android.os.Build;
import androidx.camera.core.C0634d2;
import androidx.camera.core.impl.C0889u1;
import androidx.camera.core.p009e3.p010p.C0664a;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import p027c.p061g.p062a.C1814b;
import p027c.p064i.p069g.C1860j;

/* renamed from: androidx.camera.core.e2 */
abstract class C0644e2 implements C0889u1.C0890a {

    /* renamed from: a */
    private static final RectF f2071a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* renamed from: b */
    private C0634d2.C0635a f2072b;

    /* renamed from: c */
    private volatile int f2073c;

    /* renamed from: d */
    private volatile int f2074d;

    /* renamed from: e */
    private volatile int f2075e = 1;

    /* renamed from: f */
    private volatile boolean f2076f;

    /* renamed from: g */
    private volatile boolean f2077g;

    /* renamed from: h */
    private Executor f2078h;

    /* renamed from: i */
    private C0991v2 f2079i;

    /* renamed from: j */
    private ImageWriter f2080j;

    /* renamed from: k */
    private Rect f2081k = new Rect();

    /* renamed from: l */
    private Rect f2082l = new Rect();

    /* renamed from: m */
    private Matrix f2083m = new Matrix();

    /* renamed from: n */
    private Matrix f2084n = new Matrix();

    /* renamed from: o */
    ByteBuffer f2085o;

    /* renamed from: p */
    ByteBuffer f2086p;

    /* renamed from: q */
    ByteBuffer f2087q;

    /* renamed from: r */
    ByteBuffer f2088r;

    /* renamed from: s */
    private final Object f2089s = new Object();

    /* renamed from: t */
    protected boolean f2090t = true;

    C0644e2() {
    }

    /* renamed from: f */
    private void m2694f(ImageProxy imageProxy) {
        if (this.f2075e == 1) {
            if (this.f2086p == null) {
                this.f2086p = ByteBuffer.allocateDirect(imageProxy.mo2541e() * imageProxy.mo2539c());
            }
            this.f2086p.position(0);
            if (this.f2087q == null) {
                this.f2087q = ByteBuffer.allocateDirect((imageProxy.mo2541e() * imageProxy.mo2539c()) / 4);
            }
            this.f2087q.position(0);
            if (this.f2088r == null) {
                this.f2088r = ByteBuffer.allocateDirect((imageProxy.mo2541e() * imageProxy.mo2539c()) / 4);
            }
            this.f2088r.position(0);
        } else if (this.f2075e == 2 && this.f2085o == null) {
            this.f2085o = ByteBuffer.allocateDirect(imageProxy.mo2541e() * imageProxy.mo2539c() * 4);
        }
    }

    /* renamed from: g */
    private static C0991v2 m2695g(int i, int i2, int i3, int i4, int i5) {
        boolean z = i3 == 90 || i3 == 270;
        int i6 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        return new C0991v2(C0935l2.m3670a(i6, i, i4, i5));
    }

    /* renamed from: i */
    static Matrix m2696i(int i, int i2, int i3, int i4, int i5) {
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, (float) i, (float) i2), f2071a, Matrix.ScaleToFit.FILL);
            matrix.postRotate((float) i5);
            matrix.postConcat(m2697j(new RectF(0.0f, 0.0f, (float) i3, (float) i4)));
        }
        return matrix;
    }

    /* renamed from: j */
    private static Matrix m2697j(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f2071a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    /* renamed from: k */
    static Rect m2698k(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void mo2675m(ImageProxy imageProxy, Matrix matrix, ImageProxy imageProxy2, Rect rect, C0634d2.C0635a aVar, C1814b.C1815a aVar2) {
        if (this.f2090t) {
            C0997w2 w2Var = new C0997w2(imageProxy2, C0940m2.m3675a(imageProxy.mo2537U().mo2693c(), imageProxy.mo2537U().mo2692b(), this.f2076f ? 0 : this.f2073c, matrix));
            w2Var.mo2536S(rect);
            aVar.mo2657a(w2Var);
            aVar2.mo6308c(null);
            return;
        }
        aVar2.mo6310f(new C1860j("ImageAnalysis is detached"));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object mo2676o(Executor executor, ImageProxy imageProxy, Matrix matrix, ImageProxy imageProxy2, Rect rect, C0634d2.C0635a aVar, C1814b.C1815a aVar2) {
        Executor executor2 = executor;
        executor.execute(new C0941n(this, imageProxy, matrix, imageProxy2, rect, aVar, aVar2));
        return "analyzeImage";
    }

    /* renamed from: q */
    private void m2701q(int i, int i2, int i3, int i4) {
        Matrix i5 = m2696i(i, i2, i3, i4, this.f2073c);
        this.f2082l = m2698k(this.f2081k, i5);
        this.f2084n.setConcat(this.f2083m, i5);
    }

    /* renamed from: r */
    private void m2702r(ImageProxy imageProxy, int i) {
        C0991v2 v2Var = this.f2079i;
        if (v2Var != null) {
            v2Var.mo3270n();
            this.f2079i = m2695g(imageProxy.mo2541e(), imageProxy.mo2539c(), i, this.f2079i.mo2637d(), this.f2079i.mo2639f());
            if (Build.VERSION.SDK_INT >= 23 && this.f2075e == 1) {
                ImageWriter imageWriter = this.f2080j;
                if (imageWriter != null) {
                    C0664a.m2785a(imageWriter);
                }
                this.f2080j = C0664a.m2787c(this.f2079i.mo2634b(), this.f2079i.mo2639f());
            }
        }
    }

    /* renamed from: a */
    public void mo2595a(C0889u1 u1Var) {
        try {
            ImageProxy b = mo2670b(u1Var);
            if (b != null) {
                mo2677p(b);
            }
        } catch (IllegalStateException e) {
            C0949o2.m3691d("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract ImageProxy mo2670b(C0889u1 u1Var);

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0076  */
    /* renamed from: c */
    p174e.p319f.p390b.p391a.p392a.C9172b<java.lang.Void> mo2671c(androidx.camera.core.ImageProxy r17) {
        /*
            r16 = this;
            r9 = r16
            r0 = r17
            boolean r1 = r9.f2076f
            r8 = 0
            if (r1 == 0) goto L_0x000d
            int r1 = r9.f2073c
            r10 = r1
            goto L_0x000e
        L_0x000d:
            r10 = 0
        L_0x000e:
            java.lang.Object r1 = r9.f2089s
            monitor-enter(r1)
            java.util.concurrent.Executor r11 = r9.f2078h     // Catch:{ all -> 0x00c8 }
            androidx.camera.core.d2$a r12 = r9.f2072b     // Catch:{ all -> 0x00c8 }
            boolean r2 = r9.f2076f     // Catch:{ all -> 0x00c8 }
            r13 = 1
            if (r2 == 0) goto L_0x0020
            int r2 = r9.f2074d     // Catch:{ all -> 0x00c8 }
            if (r10 == r2) goto L_0x0020
            r14 = 1
            goto L_0x0021
        L_0x0020:
            r14 = 0
        L_0x0021:
            if (r14 == 0) goto L_0x0026
            r9.m2702r(r0, r10)     // Catch:{ all -> 0x00c8 }
        L_0x0026:
            boolean r2 = r9.f2076f     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x002d
            r16.m2694f(r17)     // Catch:{ all -> 0x00c8 }
        L_0x002d:
            androidx.camera.core.v2 r2 = r9.f2079i     // Catch:{ all -> 0x00c8 }
            android.media.ImageWriter r3 = r9.f2080j     // Catch:{ all -> 0x00c8 }
            java.nio.ByteBuffer r4 = r9.f2085o     // Catch:{ all -> 0x00c8 }
            java.nio.ByteBuffer r5 = r9.f2086p     // Catch:{ all -> 0x00c8 }
            java.nio.ByteBuffer r6 = r9.f2087q     // Catch:{ all -> 0x00c8 }
            java.nio.ByteBuffer r7 = r9.f2088r     // Catch:{ all -> 0x00c8 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c8 }
            if (r12 == 0) goto L_0x00bc
            if (r11 == 0) goto L_0x00bc
            boolean r1 = r9.f2090t
            if (r1 == 0) goto L_0x00bc
            if (r2 == 0) goto L_0x006e
            int r15 = r9.f2075e
            r1 = 2
            if (r15 != r1) goto L_0x0050
            boolean r1 = r9.f2077g
            androidx.camera.core.ImageProxy r1 = androidx.camera.core.ImageProcessingUtil.m2491c(r0, r2, r4, r10, r1)
            goto L_0x006f
        L_0x0050:
            int r1 = r9.f2075e
            if (r1 != r13) goto L_0x006e
            boolean r1 = r9.f2077g
            if (r1 == 0) goto L_0x005b
            androidx.camera.core.ImageProcessingUtil.m2489a(r17)
        L_0x005b:
            if (r3 == 0) goto L_0x006e
            if (r5 == 0) goto L_0x006e
            if (r6 == 0) goto L_0x006e
            if (r7 == 0) goto L_0x006e
            r1 = r17
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            androidx.camera.core.ImageProxy r1 = androidx.camera.core.ImageProcessingUtil.m2497i(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            if (r1 != 0) goto L_0x0072
            r8 = 1
        L_0x0072:
            if (r8 == 0) goto L_0x0076
            r6 = r0
            goto L_0x0077
        L_0x0076:
            r6 = r1
        L_0x0077:
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            java.lang.Object r1 = r9.f2089s
            monitor-enter(r1)
            if (r14 == 0) goto L_0x009b
            if (r8 != 0) goto L_0x009b
            int r2 = r17.mo2541e()     // Catch:{ all -> 0x00b9 }
            int r3 = r17.mo2539c()     // Catch:{ all -> 0x00b9 }
            int r4 = r6.mo2541e()     // Catch:{ all -> 0x00b9 }
            int r8 = r6.mo2539c()     // Catch:{ all -> 0x00b9 }
            r9.m2701q(r2, r3, r4, r8)     // Catch:{ all -> 0x00b9 }
        L_0x009b:
            r9.f2074d = r10     // Catch:{ all -> 0x00b9 }
            android.graphics.Rect r2 = r9.f2082l     // Catch:{ all -> 0x00b9 }
            r7.set(r2)     // Catch:{ all -> 0x00b9 }
            android.graphics.Matrix r2 = r9.f2084n     // Catch:{ all -> 0x00b9 }
            r5.set(r2)     // Catch:{ all -> 0x00b9 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b9 }
            androidx.camera.core.m r10 = new androidx.camera.core.m
            r1 = r10
            r2 = r16
            r3 = r11
            r4 = r17
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            e.f.b.a.a.b r0 = p027c.p061g.p062a.C1814b.m7736a(r10)
            goto L_0x00c7
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b9 }
            throw r0
        L_0x00bc:
            c.i.g.j r0 = new c.i.g.j
            java.lang.String r1 = "No analyzer or executor currently set."
            r0.<init>(r1)
            e.f.b.a.a.b r0 = androidx.camera.core.impl.p014a3.p016o.C0768f.m3079e(r0)
        L_0x00c7:
            return r0
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0644e2.mo2671c(androidx.camera.core.ImageProxy):e.f.b.a.a.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2672d() {
        this.f2090t = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo2673e();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2674h() {
        this.f2090t = false;
        mo2673e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo2677p(ImageProxy imageProxy);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2678s(Executor executor, C0634d2.C0635a aVar) {
        synchronized (this.f2089s) {
            if (aVar == null) {
                mo2673e();
            }
            this.f2072b = aVar;
            this.f2078h = executor;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2679t(boolean z) {
        this.f2077g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2680u(int i) {
        this.f2075e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo2681v(boolean z) {
        this.f2076f = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2682w(C0991v2 v2Var) {
        synchronized (this.f2089s) {
            this.f2079i = v2Var;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo2683x(int i) {
        this.f2073c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo2684y(Matrix matrix) {
        synchronized (this.f2089s) {
            this.f2083m = matrix;
            this.f2084n = new Matrix(this.f2083m);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo2685z(Rect rect) {
        synchronized (this.f2089s) {
            this.f2081k = rect;
            this.f2082l = new Rect(this.f2081k);
        }
    }
}
