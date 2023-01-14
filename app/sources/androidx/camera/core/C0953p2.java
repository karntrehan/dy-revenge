package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.C0627c2;
import androidx.camera.core.impl.C0783b0;
import androidx.camera.core.impl.C0830k0;
import androidx.camera.core.impl.C0889u1;
import androidx.camera.core.p009e3.C0648d;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.p2 */
class C0953p2 implements C0889u1, C0627c2.C0628a {

    /* renamed from: a */
    private final Object f2676a;

    /* renamed from: b */
    private C0783b0 f2677b;

    /* renamed from: c */
    private C0889u1.C0890a f2678c;

    /* renamed from: d */
    private boolean f2679d;

    /* renamed from: e */
    private final C0889u1 f2680e;

    /* renamed from: f */
    C0889u1.C0890a f2681f;

    /* renamed from: g */
    private Executor f2682g;

    /* renamed from: h */
    private final LongSparseArray<C0927j2> f2683h;

    /* renamed from: i */
    private final LongSparseArray<ImageProxy> f2684i;

    /* renamed from: j */
    private int f2685j;

    /* renamed from: k */
    private final List<ImageProxy> f2686k;

    /* renamed from: l */
    private final List<ImageProxy> f2687l;

    /* renamed from: androidx.camera.core.p2$a */
    class C0954a extends C0783b0 {
        C0954a() {
        }

        /* renamed from: b */
        public void mo1920b(C0830k0 k0Var) {
            super.mo1920b(k0Var);
            C0953p2.this.mo3198v(k0Var);
        }
    }

    C0953p2(int i, int i2, int i3, int i4) {
        this(m3703k(i, i2, i3, i4));
    }

    C0953p2(C0889u1 u1Var) {
        this.f2676a = new Object();
        this.f2677b = new C0954a();
        this.f2678c = new C0680f0(this);
        this.f2679d = false;
        this.f2683h = new LongSparseArray<>();
        this.f2684i = new LongSparseArray<>();
        this.f2687l = new ArrayList();
        this.f2680e = u1Var;
        this.f2685j = 0;
        this.f2686k = new ArrayList(mo2639f());
    }

    /* renamed from: k */
    private static C0889u1 m3703k(int i, int i2, int i3, int i4) {
        return new C0633d1(ImageReader.newInstance(i, i2, i3, i4));
    }

    /* renamed from: l */
    private void m3704l(ImageProxy imageProxy) {
        synchronized (this.f2676a) {
            int indexOf = this.f2686k.indexOf(imageProxy);
            if (indexOf >= 0) {
                this.f2686k.remove(indexOf);
                int i = this.f2685j;
                if (indexOf <= i) {
                    this.f2685j = i - 1;
                }
            }
            this.f2687l.remove(imageProxy);
        }
    }

    /* renamed from: m */
    private void m3705m(C0997w2 w2Var) {
        C0889u1.C0890a aVar;
        Executor executor;
        synchronized (this.f2676a) {
            aVar = null;
            if (this.f2686k.size() < mo2639f()) {
                w2Var.mo2623a(this);
                this.f2686k.add(w2Var);
                aVar = this.f2681f;
                executor = this.f2682g;
            } else {
                C0949o2.m3688a("TAG", "Maximum image number reached.");
                w2Var.close();
                executor = null;
            }
        }
        if (aVar == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new C0685g0(this, aVar));
        } else {
            aVar.mo2595a(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void mo3196q(C0889u1.C0890a aVar) {
        aVar.mo2595a(this);
    }

    /* renamed from: t */
    private void m3708t() {
        synchronized (this.f2676a) {
            for (int size = this.f2683h.size() - 1; size >= 0; size--) {
                C0927j2 valueAt = this.f2683h.valueAt(size);
                long b = valueAt.mo2692b();
                ImageProxy imageProxy = this.f2684i.get(b);
                if (imageProxy != null) {
                    this.f2684i.remove(b);
                    this.f2683h.removeAt(size);
                    m3705m(new C0997w2(imageProxy, valueAt));
                }
            }
            m3709u();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        return;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3709u() {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f2676a
            monitor-enter(r0)
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r1 = r10.f2684i     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            android.util.LongSparseArray<androidx.camera.core.j2> r1 = r10.f2683h     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0015
            goto L_0x008c
        L_0x0015:
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r1 = r10.f2684i     // Catch:{ all -> 0x008e }
            r2 = 0
            long r3 = r1.keyAt(r2)     // Catch:{ all -> 0x008e }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x008e }
            android.util.LongSparseArray<androidx.camera.core.j2> r3 = r10.f2683h     // Catch:{ all -> 0x008e }
            long r3 = r3.keyAt(r2)     // Catch:{ all -> 0x008e }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x008e }
            boolean r4 = r3.equals(r1)     // Catch:{ all -> 0x008e }
            r5 = 1
            if (r4 != 0) goto L_0x0032
            r2 = 1
        L_0x0032:
            androidx.core.util.C1177h.m4579a(r2)     // Catch:{ all -> 0x008e }
            long r6 = r3.longValue()     // Catch:{ all -> 0x008e }
            long r8 = r1.longValue()     // Catch:{ all -> 0x008e }
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x006b
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r1 = r10.f2684i     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            int r1 = r1 - r5
        L_0x0048:
            if (r1 < 0) goto L_0x008a
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r2 = r10.f2684i     // Catch:{ all -> 0x008e }
            long r4 = r2.keyAt(r1)     // Catch:{ all -> 0x008e }
            long r6 = r3.longValue()     // Catch:{ all -> 0x008e }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0068
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r2 = r10.f2684i     // Catch:{ all -> 0x008e }
            java.lang.Object r2 = r2.valueAt(r1)     // Catch:{ all -> 0x008e }
            androidx.camera.core.ImageProxy r2 = (androidx.camera.core.ImageProxy) r2     // Catch:{ all -> 0x008e }
            r2.close()     // Catch:{ all -> 0x008e }
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r2 = r10.f2684i     // Catch:{ all -> 0x008e }
            r2.removeAt(r1)     // Catch:{ all -> 0x008e }
        L_0x0068:
            int r1 = r1 + -1
            goto L_0x0048
        L_0x006b:
            android.util.LongSparseArray<androidx.camera.core.j2> r2 = r10.f2683h     // Catch:{ all -> 0x008e }
            int r2 = r2.size()     // Catch:{ all -> 0x008e }
            int r2 = r2 - r5
        L_0x0072:
            if (r2 < 0) goto L_0x008a
            android.util.LongSparseArray<androidx.camera.core.j2> r3 = r10.f2683h     // Catch:{ all -> 0x008e }
            long r3 = r3.keyAt(r2)     // Catch:{ all -> 0x008e }
            long r5 = r1.longValue()     // Catch:{ all -> 0x008e }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0087
            android.util.LongSparseArray<androidx.camera.core.j2> r3 = r10.f2683h     // Catch:{ all -> 0x008e }
            r3.removeAt(r2)     // Catch:{ all -> 0x008e }
        L_0x0087:
            int r2 = r2 + -1
            goto L_0x0072
        L_0x008a:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x008e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0953p2.m3709u():void");
    }

    /* renamed from: a */
    public void mo2625a(ImageProxy imageProxy) {
        synchronized (this.f2676a) {
            m3704l(imageProxy);
        }
    }

    /* renamed from: b */
    public Surface mo2634b() {
        Surface b;
        synchronized (this.f2676a) {
            b = this.f2680e.mo2634b();
        }
        return b;
    }

    /* renamed from: c */
    public int mo2635c() {
        int c;
        synchronized (this.f2676a) {
            c = this.f2680e.mo2635c();
        }
        return c;
    }

    public void close() {
        synchronized (this.f2676a) {
            if (!this.f2679d) {
                for (ImageProxy close : new ArrayList(this.f2686k)) {
                    close.close();
                }
                this.f2686k.clear();
                this.f2680e.close();
                this.f2679d = true;
            }
        }
    }

    /* renamed from: d */
    public int mo2637d() {
        int d;
        synchronized (this.f2676a) {
            d = this.f2680e.mo2637d();
        }
        return d;
    }

    /* renamed from: e */
    public int mo2638e() {
        int e;
        synchronized (this.f2676a) {
            e = this.f2680e.mo2638e();
        }
        return e;
    }

    /* renamed from: f */
    public int mo2639f() {
        int f;
        synchronized (this.f2676a) {
            f = this.f2680e.mo2639f();
        }
        return f;
    }

    /* renamed from: g */
    public ImageProxy mo2640g() {
        synchronized (this.f2676a) {
            if (this.f2686k.isEmpty()) {
                return null;
            }
            if (this.f2685j < this.f2686k.size()) {
                ArrayList<ImageProxy> arrayList = new ArrayList<>();
                for (int i = 0; i < this.f2686k.size() - 1; i++) {
                    if (!this.f2687l.contains(this.f2686k.get(i))) {
                        arrayList.add(this.f2686k.get(i));
                    }
                }
                for (ImageProxy close : arrayList) {
                    close.close();
                }
                int size = this.f2686k.size() - 1;
                this.f2685j = size;
                List<ImageProxy> list = this.f2686k;
                this.f2685j = size + 1;
                ImageProxy imageProxy = list.get(size);
                this.f2687l.add(imageProxy);
                return imageProxy;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    /* renamed from: h */
    public void mo2641h() {
        synchronized (this.f2676a) {
            this.f2681f = null;
            this.f2682g = null;
        }
    }

    /* renamed from: i */
    public ImageProxy mo2642i() {
        synchronized (this.f2676a) {
            if (this.f2686k.isEmpty()) {
                return null;
            }
            if (this.f2685j < this.f2686k.size()) {
                List<ImageProxy> list = this.f2686k;
                int i = this.f2685j;
                this.f2685j = i + 1;
                ImageProxy imageProxy = list.get(i);
                this.f2687l.add(imageProxy);
                return imageProxy;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    /* renamed from: j */
    public void mo2643j(C0889u1.C0890a aVar, Executor executor) {
        synchronized (this.f2676a) {
            this.f2681f = (C0889u1.C0890a) C1177h.m4583e(aVar);
            this.f2682g = (Executor) C1177h.m4583e(executor);
            this.f2680e.mo2643j(this.f2678c, executor);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C0783b0 mo3194n() {
        return this.f2677b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m3707r(androidx.camera.core.impl.C0889u1 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2676a
            monitor-enter(r0)
            boolean r1 = r6.f2679d     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0009:
            r1 = 0
        L_0x000a:
            r2 = 0
            androidx.camera.core.ImageProxy r2 = r7.mo2642i()     // Catch:{ IllegalStateException -> 0x0026 }
            if (r2 == 0) goto L_0x002e
            int r1 = r1 + 1
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r3 = r6.f2684i     // Catch:{ all -> 0x0039 }
            androidx.camera.core.j2 r4 = r2.mo2537U()     // Catch:{ all -> 0x0039 }
            long r4 = r4.mo2692b()     // Catch:{ all -> 0x0039 }
            r3.put(r4, r2)     // Catch:{ all -> 0x0039 }
            r6.m3708t()     // Catch:{ all -> 0x0039 }
            goto L_0x002e
        L_0x0024:
            r7 = move-exception
            goto L_0x0038
        L_0x0026:
            r3 = move-exception
            java.lang.String r4 = "MetadataImageReader"
            java.lang.String r5 = "Failed to acquire next image."
            androidx.camera.core.C0949o2.m3689b(r4, r5, r3)     // Catch:{ all -> 0x0024 }
        L_0x002e:
            if (r2 == 0) goto L_0x0036
            int r2 = r7.mo2639f()     // Catch:{ all -> 0x0039 }
            if (r1 < r2) goto L_0x000a
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0038:
            throw r7     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0953p2.m3707r(androidx.camera.core.impl.u1):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3198v(C0830k0 k0Var) {
        synchronized (this.f2676a) {
            if (!this.f2679d) {
                this.f2683h.put(k0Var.mo2295b(), new C0648d(k0Var));
                m3708t();
            }
        }
    }
}
