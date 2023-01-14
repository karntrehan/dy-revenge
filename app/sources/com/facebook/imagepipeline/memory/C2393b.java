package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Set;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6064m;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p253d.p260g.C6078c;
import p174e.p247e.p253d.p260g.C6080e;

/* renamed from: com.facebook.imagepipeline.memory.b */
public abstract class C2393b<V> implements C6080e<V> {

    /* renamed from: a */
    private final Class<?> f7115a;

    /* renamed from: b */
    final C6078c f7116b;

    /* renamed from: c */
    final C2408f0 f7117c;

    /* renamed from: d */
    final SparseArray<C2409g<V>> f7118d;

    /* renamed from: e */
    final Set<V> f7119e;

    /* renamed from: f */
    private boolean f7120f;

    /* renamed from: g */
    final C2394a f7121g;

    /* renamed from: h */
    final C2394a f7122h;

    /* renamed from: i */
    private final C2410g0 f7123i;

    /* renamed from: j */
    private boolean f7124j;

    /* renamed from: com.facebook.imagepipeline.memory.b$a */
    static class C2394a {

        /* renamed from: a */
        int f7125a;

        /* renamed from: b */
        int f7126b;

        C2394a() {
        }

        /* renamed from: a */
        public void mo8083a(int i) {
            int i2;
            int i3 = this.f7126b;
            if (i3 < i || (i2 = this.f7125a) <= 0) {
                C6071a.m22866N("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f7126b), Integer.valueOf(this.f7125a));
                return;
            }
            this.f7125a = i2 - 1;
            this.f7126b = i3 - i;
        }

        /* renamed from: b */
        public void mo8084b(int i) {
            this.f7125a++;
            this.f7126b += i;
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.b$b */
    public static class C2395b extends RuntimeException {
        public C2395b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.b$c */
    public static class C2396c extends RuntimeException {
        public C2396c(int i, int i2, int i3, int i4) {
            super("Pool hard cap violation? Hard cap = " + i + " Used size = " + i2 + " Free size = " + i3 + " Request size = " + i4);
        }
    }

    public C2393b(C6078c cVar, C2408f0 f0Var, C2410g0 g0Var) {
        this.f7115a = getClass();
        this.f7116b = (C6078c) C6062k.m22839g(cVar);
        C2408f0 f0Var2 = (C2408f0) C6062k.m22839g(f0Var);
        this.f7117c = f0Var2;
        this.f7123i = (C2410g0) C6062k.m22839g(g0Var);
        this.f7118d = new SparseArray<>();
        if (f0Var2.f7177f) {
            m9934q();
        } else {
            m9935u(new SparseIntArray(0));
        }
        this.f7119e = C6064m.m22845b();
        this.f7122h = new C2394a();
        this.f7121g = new C2394a();
    }

    public C2393b(C6078c cVar, C2408f0 f0Var, C2410g0 g0Var, boolean z) {
        this(cVar, f0Var, g0Var);
        this.f7124j = z;
    }

    /* renamed from: h */
    private synchronized void m9931h() {
        boolean z;
        if (mo8078s()) {
            if (this.f7122h.f7126b != 0) {
                z = false;
                C6062k.m22841i(z);
            }
        }
        z = true;
        C6062k.m22841i(z);
    }

    /* renamed from: i */
    private void m9932i(SparseIntArray sparseIntArray) {
        this.f7118d.clear();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int keyAt = sparseIntArray.keyAt(i);
            this.f7118d.put(keyAt, new C2409g(mo8075o(keyAt), sparseIntArray.valueAt(i), 0, this.f7117c.f7177f));
        }
    }

    /* renamed from: l */
    private synchronized C2409g<V> m9933l(int i) {
        return this.f7118d.get(i);
    }

    /* renamed from: q */
    private synchronized void m9934q() {
        SparseIntArray sparseIntArray = this.f7117c.f7174c;
        if (sparseIntArray != null) {
            m9932i(sparseIntArray);
            this.f7120f = false;
        } else {
            this.f7120f = true;
        }
    }

    /* renamed from: u */
    private synchronized void m9935u(SparseIntArray sparseIntArray) {
        C6062k.m22839g(sparseIntArray);
        this.f7118d.clear();
        SparseIntArray sparseIntArray2 = this.f7117c.f7174c;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                this.f7118d.put(keyAt, new C2409g(mo8075o(keyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0), this.f7117c.f7177f));
            }
            this.f7120f = false;
        } else {
            this.f7120f = true;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    /* renamed from: v */
    private void m9936v() {
        if (C6071a.m22886t(2)) {
            C6071a.m22891y(this.f7115a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f7121g.f7125a), Integer.valueOf(this.f7121g.f7126b), Integer.valueOf(this.f7122h.f7125a), Integer.valueOf(this.f7122h.f7126b));
        }
    }

    /* renamed from: a */
    public void mo8068a(V v) {
        C2410g0 g0Var;
        C6062k.m22839g(v);
        int n = mo8074n(v);
        int o = mo8075o(n);
        synchronized (this) {
            C2409g l = m9933l(n);
            if (!this.f7119e.remove(v)) {
                C6071a.m22873g(this.f7115a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(n));
                mo8071j(v);
                g0Var = this.f7123i;
            } else {
                if (l != null && !l.mo8130f() && !mo8078s()) {
                    if (mo8079t(v)) {
                        l.mo8131h(v);
                        this.f7122h.mo8084b(o);
                        this.f7121g.mo8083a(o);
                        this.f7123i.mo8067g(o);
                        if (C6071a.m22886t(2)) {
                            C6071a.m22889w(this.f7115a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(n));
                        }
                        m9936v();
                    }
                }
                if (l != null) {
                    l.mo8126b();
                }
                if (C6071a.m22886t(2)) {
                    C6071a.m22889w(this.f7115a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(n));
                }
                mo8071j(v);
                this.f7121g.mo8083a(o);
                g0Var = this.f7123i;
            }
            g0Var.mo8065e(o);
            m9936v();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract V mo8046f(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized boolean mo8069g(int i) {
        if (this.f7124j) {
            return true;
        }
        C2408f0 f0Var = this.f7117c;
        int i2 = f0Var.f7172a;
        int i3 = this.f7121g.f7126b;
        if (i > i2 - i3) {
            this.f7123i.mo8066f();
            return false;
        }
        int i4 = f0Var.f7173b;
        if (i > i4 - (i3 + this.f7122h.f7126b)) {
            mo8081x(i4 - i);
        }
        if (i <= i2 - (this.f7121g.f7126b + this.f7122h.f7126b)) {
            return true;
        }
        this.f7123i.mo8066f();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0052, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0 = mo8046f(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r5.f7121g.mo8083a(r2);
        r4 = mo8072k(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r4 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        r4.mo8126b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        p174e.p247e.p253d.p257d.C6070p.m22852c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        p174e.p247e.p253d.p257d.C6062k.m22841i(r5.f7119e.add(r0));
        mo8082y();
        r5.f7123i.mo8061a(r2);
        m9936v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (p174e.p247e.p253d.p258e.C6071a.m22886t(2) == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        p174e.p247e.p253d.p258e.C6071a.m22889w(r5.f7115a, "get (alloc) (object, size) = (%x, %s)", java.lang.Integer.valueOf(java.lang.System.identityHashCode(r0)), java.lang.Integer.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(int r6) {
        /*
            r5 = this;
            r5.m9931h()
            int r6 = r5.mo8073m(r6)
            monitor-enter(r5)
            com.facebook.imagepipeline.memory.g r0 = r5.mo8072k(r6)     // Catch:{ all -> 0x00ca }
            r1 = 2
            if (r0 == 0) goto L_0x0053
            java.lang.Object r2 = r5.mo8076p(r0)     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x0053
            java.util.Set<V> r6 = r5.f7119e     // Catch:{ all -> 0x00ca }
            boolean r6 = r6.add(r2)     // Catch:{ all -> 0x00ca }
            p174e.p247e.p253d.p257d.C6062k.m22841i(r6)     // Catch:{ all -> 0x00ca }
            int r6 = r5.mo8074n(r2)     // Catch:{ all -> 0x00ca }
            int r0 = r5.mo8075o(r6)     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.b$a r3 = r5.f7121g     // Catch:{ all -> 0x00ca }
            r3.mo8084b(r0)     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.b$a r3 = r5.f7122h     // Catch:{ all -> 0x00ca }
            r3.mo8083a(r0)     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.g0 r3 = r5.f7123i     // Catch:{ all -> 0x00ca }
            r3.mo8062b(r0)     // Catch:{ all -> 0x00ca }
            r5.m9936v()     // Catch:{ all -> 0x00ca }
            boolean r0 = p174e.p247e.p253d.p258e.C6071a.m22886t(r1)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x0051
            java.lang.Class<?> r0 = r5.f7115a     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "get (reuse) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r2)     // Catch:{ all -> 0x00ca }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00ca }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00ca }
            p174e.p247e.p253d.p258e.C6071a.m22889w(r0, r1, r3, r6)     // Catch:{ all -> 0x00ca }
        L_0x0051:
            monitor-exit(r5)     // Catch:{ all -> 0x00ca }
            return r2
        L_0x0053:
            int r2 = r5.mo8075o(r6)     // Catch:{ all -> 0x00ca }
            boolean r3 = r5.mo8069g(r2)     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x00b8
            com.facebook.imagepipeline.memory.b$a r3 = r5.f7121g     // Catch:{ all -> 0x00ca }
            r3.mo8084b(r2)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x0067
            r0.mo8129e()     // Catch:{ all -> 0x00ca }
        L_0x0067:
            monitor-exit(r5)     // Catch:{ all -> 0x00ca }
            r0 = 0
            java.lang.Object r0 = r5.mo8046f(r6)     // Catch:{ all -> 0x006e }
            goto L_0x0082
        L_0x006e:
            r3 = move-exception
            monitor-enter(r5)
            com.facebook.imagepipeline.memory.b$a r4 = r5.f7121g     // Catch:{ all -> 0x00b5 }
            r4.mo8083a(r2)     // Catch:{ all -> 0x00b5 }
            com.facebook.imagepipeline.memory.g r4 = r5.mo8072k(r6)     // Catch:{ all -> 0x00b5 }
            if (r4 == 0) goto L_0x007e
            r4.mo8126b()     // Catch:{ all -> 0x00b5 }
        L_0x007e:
            monitor-exit(r5)     // Catch:{ all -> 0x00b5 }
            p174e.p247e.p253d.p257d.C6070p.m22852c(r3)
        L_0x0082:
            monitor-enter(r5)
            java.util.Set<V> r3 = r5.f7119e     // Catch:{ all -> 0x00b2 }
            boolean r3 = r3.add(r0)     // Catch:{ all -> 0x00b2 }
            p174e.p247e.p253d.p257d.C6062k.m22841i(r3)     // Catch:{ all -> 0x00b2 }
            r5.mo8082y()     // Catch:{ all -> 0x00b2 }
            com.facebook.imagepipeline.memory.g0 r3 = r5.f7123i     // Catch:{ all -> 0x00b2 }
            r3.mo8061a(r2)     // Catch:{ all -> 0x00b2 }
            r5.m9936v()     // Catch:{ all -> 0x00b2 }
            boolean r1 = p174e.p247e.p253d.p258e.C6071a.m22886t(r1)     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x00b0
            java.lang.Class<?> r1 = r5.f7115a     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "get (alloc) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00b2 }
            p174e.p247e.p253d.p258e.C6071a.m22889w(r1, r2, r3, r6)     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            return r0
        L_0x00b2:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            throw r6
        L_0x00b5:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b5 }
            throw r6
        L_0x00b8:
            com.facebook.imagepipeline.memory.b$c r6 = new com.facebook.imagepipeline.memory.b$c     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.f0 r0 = r5.f7117c     // Catch:{ all -> 0x00ca }
            int r0 = r0.f7172a     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.b$a r1 = r5.f7121g     // Catch:{ all -> 0x00ca }
            int r1 = r1.f7126b     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.b$a r3 = r5.f7122h     // Catch:{ all -> 0x00ca }
            int r3 = r3.f7126b     // Catch:{ all -> 0x00ca }
            r6.<init>(r0, r1, r3, r2)     // Catch:{ all -> 0x00ca }
            throw r6     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ca }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.C2393b.get(int):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo8071j(V v);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return r0;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.facebook.imagepipeline.memory.C2409g<V> mo8072k(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.SparseArray<com.facebook.imagepipeline.memory.g<V>> r0 = r3.f7118d     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002f }
            com.facebook.imagepipeline.memory.g r0 = (com.facebook.imagepipeline.memory.C2409g) r0     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x002d
            boolean r1 = r3.f7120f     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x0010
            goto L_0x002d
        L_0x0010:
            r0 = 2
            boolean r0 = p174e.p247e.p253d.p258e.C6071a.m22886t(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0022
            java.lang.Class<?> r0 = r3.f7115a     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "creating new bucket %s"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x002f }
            p174e.p247e.p253d.p258e.C6071a.m22888v(r0, r1, r2)     // Catch:{ all -> 0x002f }
        L_0x0022:
            com.facebook.imagepipeline.memory.g r0 = r3.mo8080w(r4)     // Catch:{ all -> 0x002f }
            android.util.SparseArray<com.facebook.imagepipeline.memory.g<V>> r1 = r3.f7118d     // Catch:{ all -> 0x002f }
            r1.put(r4, r0)     // Catch:{ all -> 0x002f }
            monitor-exit(r3)
            return r0
        L_0x002d:
            monitor-exit(r3)
            return r0
        L_0x002f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.C2393b.mo8072k(int):com.facebook.imagepipeline.memory.g");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo8073m(int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract int mo8074n(V v);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo8075o(int i);

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public synchronized V mo8076p(C2409g<V> gVar) {
        return gVar.mo8127c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo8077r() {
        this.f7116b.mo18061a(this);
        this.f7123i.mo8063c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public synchronized boolean mo8078s() {
        boolean z;
        z = this.f7121g.f7126b + this.f7122h.f7126b > this.f7117c.f7173b;
        if (z) {
            this.f7123i.mo8064d();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo8079t(V v) {
        C6062k.m22839g(v);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C2409g<V> mo8080w(int i) {
        return new C2409g<>(mo8075o(i), RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, 0, this.f7117c.f7177f);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        return;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo8081x(int r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.b$a r0 = r7.f7121g     // Catch:{ all -> 0x008c }
            int r0 = r0.f7126b     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.b$a r1 = r7.f7122h     // Catch:{ all -> 0x008c }
            int r1 = r1.f7126b     // Catch:{ all -> 0x008c }
            int r0 = r0 + r1
            int r0 = r0 - r8
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x008c }
            if (r0 > 0) goto L_0x0013
            monitor-exit(r7)
            return
        L_0x0013:
            r1 = 2
            boolean r2 = p174e.p247e.p253d.p258e.C6071a.m22886t(r1)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0036
            java.lang.Class<?> r2 = r7.f7115a     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.b$a r5 = r7.f7121g     // Catch:{ all -> 0x008c }
            int r5 = r5.f7126b     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.b$a r6 = r7.f7122h     // Catch:{ all -> 0x008c }
            int r6 = r6.f7126b     // Catch:{ all -> 0x008c }
            int r5 = r5 + r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x008c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x008c }
            p174e.p247e.p253d.p258e.C6071a.m22890x(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008c }
        L_0x0036:
            r7.m9936v()     // Catch:{ all -> 0x008c }
            r2 = 0
        L_0x003a:
            android.util.SparseArray<com.facebook.imagepipeline.memory.g<V>> r3 = r7.f7118d     // Catch:{ all -> 0x008c }
            int r3 = r3.size()     // Catch:{ all -> 0x008c }
            if (r2 >= r3) goto L_0x0069
            if (r0 > 0) goto L_0x0045
            goto L_0x0069
        L_0x0045:
            android.util.SparseArray<com.facebook.imagepipeline.memory.g<V>> r3 = r7.f7118d     // Catch:{ all -> 0x008c }
            java.lang.Object r3 = r3.valueAt(r2)     // Catch:{ all -> 0x008c }
            java.lang.Object r3 = p174e.p247e.p253d.p257d.C6062k.m22839g(r3)     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.g r3 = (com.facebook.imagepipeline.memory.C2409g) r3     // Catch:{ all -> 0x008c }
        L_0x0051:
            if (r0 <= 0) goto L_0x0066
            java.lang.Object r4 = r3.mo8086g()     // Catch:{ all -> 0x008c }
            if (r4 != 0) goto L_0x005a
            goto L_0x0066
        L_0x005a:
            r7.mo8071j(r4)     // Catch:{ all -> 0x008c }
            int r4 = r3.f7179a     // Catch:{ all -> 0x008c }
            int r0 = r0 - r4
            com.facebook.imagepipeline.memory.b$a r5 = r7.f7122h     // Catch:{ all -> 0x008c }
            r5.mo8083a(r4)     // Catch:{ all -> 0x008c }
            goto L_0x0051
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x003a
        L_0x0069:
            r7.m9936v()     // Catch:{ all -> 0x008c }
            boolean r0 = p174e.p247e.p253d.p258e.C6071a.m22886t(r1)     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x008a
            java.lang.Class<?> r0 = r7.f7115a     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "trimToSize: TargetSize = %d; Final Size = %d"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.b$a r2 = r7.f7121g     // Catch:{ all -> 0x008c }
            int r2 = r2.f7126b     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.b$a r3 = r7.f7122h     // Catch:{ all -> 0x008c }
            int r3 = r3.f7126b     // Catch:{ all -> 0x008c }
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x008c }
            p174e.p247e.p253d.p258e.C6071a.m22889w(r0, r1, r8, r2)     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r7)
            return
        L_0x008c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.C2393b.mo8081x(int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public synchronized void mo8082y() {
        if (mo8078s()) {
            mo8081x(this.f7117c.f7173b);
        }
    }
}
