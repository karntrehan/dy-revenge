package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C0783b0;
import androidx.camera.core.impl.C0784b1;
import androidx.camera.core.impl.C0795d1;
import androidx.camera.core.impl.C0800e1;
import androidx.camera.core.impl.C0889u1;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.t2 */
class C0977t2 implements C0889u1 {

    /* renamed from: a */
    final Object f2732a = new Object();

    /* renamed from: b */
    private C0889u1.C0890a f2733b = new C0978a();

    /* renamed from: c */
    private C0889u1.C0890a f2734c = new C0979b();

    /* renamed from: d */
    private C0765d<List<ImageProxy>> f2735d = new C0980c();

    /* renamed from: e */
    boolean f2736e = false;

    /* renamed from: f */
    boolean f2737f = false;

    /* renamed from: g */
    final C0953p2 f2738g;

    /* renamed from: h */
    final C0889u1 f2739h;

    /* renamed from: i */
    C0889u1.C0890a f2740i;

    /* renamed from: j */
    Executor f2741j;

    /* renamed from: k */
    C1814b.C1815a<Void> f2742k;

    /* renamed from: l */
    private C9172b<Void> f2743l;

    /* renamed from: m */
    final Executor f2744m;

    /* renamed from: n */
    final C0795d1 f2745n;

    /* renamed from: o */
    private String f2746o = new String();

    /* renamed from: p */
    C1002x2 f2747p = new C1002x2(Collections.emptyList(), this.f2746o);

    /* renamed from: q */
    private final List<Integer> f2748q = new ArrayList();

    /* renamed from: androidx.camera.core.t2$a */
    class C0978a implements C0889u1.C0890a {
        C0978a() {
        }

        /* renamed from: a */
        public void mo2595a(C0889u1 u1Var) {
            C0977t2.this.mo3245m(u1Var);
        }
    }

    /* renamed from: androidx.camera.core.t2$b */
    class C0979b implements C0889u1.C0890a {
        C0979b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void mo3249c(C0889u1.C0890a aVar) {
            aVar.mo2595a(C0977t2.this);
        }

        /* renamed from: a */
        public void mo2595a(C0889u1 u1Var) {
            C0889u1.C0890a aVar;
            Executor executor;
            synchronized (C0977t2.this.f2732a) {
                C0977t2 t2Var = C0977t2.this;
                aVar = t2Var.f2740i;
                executor = t2Var.f2741j;
                t2Var.f2747p.mo3285e();
                C0977t2.this.mo3248q();
            }
            if (aVar == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new C0929k0(this, aVar));
            } else {
                aVar.mo2595a(C0977t2.this);
            }
        }
    }

    /* renamed from: androidx.camera.core.t2$c */
    class C0980c implements C0765d<List<ImageProxy>> {
        C0980c() {
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r3 = r2.f2751a;
            r3.f2737f = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
            if (r3.f2736e == false) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            r3.f2738g.close();
            r2.f2751a.f2747p.mo3284d();
            r2.f2751a.f2739h.close();
            r3 = r2.f2751a.f2742k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
            if (r3 == null) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
            r3.mo6308c(null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
            r0.f2745n.mo2710c(r1);
            r0 = r2.f2751a.f2732a;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1980a(java.util.List<androidx.camera.core.ImageProxy> r3) {
            /*
                r2 = this;
                androidx.camera.core.t2 r3 = androidx.camera.core.C0977t2.this
                java.lang.Object r3 = r3.f2732a
                monitor-enter(r3)
                androidx.camera.core.t2 r0 = androidx.camera.core.C0977t2.this     // Catch:{ all -> 0x0048 }
                boolean r1 = r0.f2736e     // Catch:{ all -> 0x0048 }
                if (r1 == 0) goto L_0x000d
                monitor-exit(r3)     // Catch:{ all -> 0x0048 }
                return
            L_0x000d:
                r1 = 1
                r0.f2737f = r1     // Catch:{ all -> 0x0048 }
                androidx.camera.core.x2 r1 = r0.f2747p     // Catch:{ all -> 0x0048 }
                monitor-exit(r3)     // Catch:{ all -> 0x0048 }
                androidx.camera.core.impl.d1 r3 = r0.f2745n
                r3.mo2710c(r1)
                androidx.camera.core.t2 r3 = androidx.camera.core.C0977t2.this
                java.lang.Object r0 = r3.f2732a
                monitor-enter(r0)
                androidx.camera.core.t2 r3 = androidx.camera.core.C0977t2.this     // Catch:{ all -> 0x0045 }
                r1 = 0
                r3.f2737f = r1     // Catch:{ all -> 0x0045 }
                boolean r1 = r3.f2736e     // Catch:{ all -> 0x0045 }
                if (r1 == 0) goto L_0x0043
                androidx.camera.core.p2 r3 = r3.f2738g     // Catch:{ all -> 0x0045 }
                r3.close()     // Catch:{ all -> 0x0045 }
                androidx.camera.core.t2 r3 = androidx.camera.core.C0977t2.this     // Catch:{ all -> 0x0045 }
                androidx.camera.core.x2 r3 = r3.f2747p     // Catch:{ all -> 0x0045 }
                r3.mo3284d()     // Catch:{ all -> 0x0045 }
                androidx.camera.core.t2 r3 = androidx.camera.core.C0977t2.this     // Catch:{ all -> 0x0045 }
                androidx.camera.core.impl.u1 r3 = r3.f2739h     // Catch:{ all -> 0x0045 }
                r3.close()     // Catch:{ all -> 0x0045 }
                androidx.camera.core.t2 r3 = androidx.camera.core.C0977t2.this     // Catch:{ all -> 0x0045 }
                c.g.a.b$a<java.lang.Void> r3 = r3.f2742k     // Catch:{ all -> 0x0045 }
                if (r3 == 0) goto L_0x0043
                r1 = 0
                r3.mo6308c(r1)     // Catch:{ all -> 0x0045 }
            L_0x0043:
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0045:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                throw r3
            L_0x0048:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0048 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0977t2.C0980c.mo1980a(java.util.List):void");
        }
    }

    /* renamed from: androidx.camera.core.t2$d */
    static final class C0981d {

        /* renamed from: a */
        protected final C0953p2 f2752a;

        /* renamed from: b */
        protected final C0784b1 f2753b;

        /* renamed from: c */
        protected final C0795d1 f2754c;

        /* renamed from: d */
        protected int f2755d;

        /* renamed from: e */
        protected Executor f2756e;

        C0981d(int i, int i2, int i3, int i4, C0784b1 b1Var, C0795d1 d1Var) {
            this(new C0953p2(i, i2, i3, i4), b1Var, d1Var);
        }

        C0981d(C0953p2 p2Var, C0784b1 b1Var, C0795d1 d1Var) {
            this.f2756e = Executors.newSingleThreadExecutor();
            this.f2752a = p2Var;
            this.f2753b = b1Var;
            this.f2754c = d1Var;
            this.f2755d = p2Var.mo2637d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0977t2 mo3251a() {
            return new C0977t2(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0981d mo3252b(int i) {
            this.f2755d = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0981d mo3253c(Executor executor) {
            this.f2756e = executor;
            return this;
        }
    }

    C0977t2(C0981d dVar) {
        if (dVar.f2752a.mo2639f() >= dVar.f2753b.mo2947a().size()) {
            C0953p2 p2Var = dVar.f2752a;
            this.f2738g = p2Var;
            int e = p2Var.mo2638e();
            int c = p2Var.mo2635c();
            int i = dVar.f2755d;
            if (i == 256) {
                e = ((int) (((float) (e * c)) * 1.5f)) + 64000;
                c = 1;
            }
            C0633d1 d1Var = new C0633d1(ImageReader.newInstance(e, c, i, p2Var.mo2639f()));
            this.f2739h = d1Var;
            this.f2744m = dVar.f2756e;
            C0795d1 d1Var2 = dVar.f2754c;
            this.f2745n = d1Var2;
            d1Var2.mo2708a(d1Var.mo2634b(), dVar.f2755d);
            d1Var2.mo2709b(new Size(p2Var.mo2638e(), p2Var.mo2635c()));
            mo3247p(dVar.f2753b);
            return;
        }
        throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object mo3246o(C1814b.C1815a aVar) {
        synchronized (this.f2732a) {
            this.f2742k = aVar;
        }
        return "ProcessingImageReader-close";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0783b0 mo3242a() {
        C0783b0 n;
        synchronized (this.f2732a) {
            n = this.f2738g.mo3194n();
        }
        return n;
    }

    /* renamed from: b */
    public Surface mo2634b() {
        Surface b;
        synchronized (this.f2732a) {
            b = this.f2738g.mo2634b();
        }
        return b;
    }

    /* renamed from: c */
    public int mo2635c() {
        int c;
        synchronized (this.f2732a) {
            c = this.f2738g.mo2635c();
        }
        return c;
    }

    public void close() {
        synchronized (this.f2732a) {
            if (!this.f2736e) {
                this.f2739h.mo2641h();
                if (!this.f2737f) {
                    this.f2738g.close();
                    this.f2747p.mo3284d();
                    this.f2739h.close();
                    C1814b.C1815a<Void> aVar = this.f2742k;
                    if (aVar != null) {
                        aVar.mo6308c(null);
                    }
                }
                this.f2736e = true;
            }
        }
    }

    /* renamed from: d */
    public int mo2637d() {
        int d;
        synchronized (this.f2732a) {
            d = this.f2739h.mo2637d();
        }
        return d;
    }

    /* renamed from: e */
    public int mo2638e() {
        int e;
        synchronized (this.f2732a) {
            e = this.f2738g.mo2638e();
        }
        return e;
    }

    /* renamed from: f */
    public int mo2639f() {
        int f;
        synchronized (this.f2732a) {
            f = this.f2738g.mo2639f();
        }
        return f;
    }

    /* renamed from: g */
    public ImageProxy mo2640g() {
        ImageProxy g;
        synchronized (this.f2732a) {
            g = this.f2739h.mo2640g();
        }
        return g;
    }

    /* renamed from: h */
    public void mo2641h() {
        synchronized (this.f2732a) {
            this.f2740i = null;
            this.f2741j = null;
            this.f2738g.mo2641h();
            this.f2739h.mo2641h();
            if (!this.f2737f) {
                this.f2747p.mo3284d();
            }
        }
    }

    /* renamed from: i */
    public ImageProxy mo2642i() {
        ImageProxy i;
        synchronized (this.f2732a) {
            i = this.f2739h.mo2642i();
        }
        return i;
    }

    /* renamed from: j */
    public void mo2643j(C0889u1.C0890a aVar, Executor executor) {
        synchronized (this.f2732a) {
            this.f2740i = (C0889u1.C0890a) C1177h.m4583e(aVar);
            this.f2741j = (Executor) C1177h.m4583e(executor);
            this.f2738g.mo2643j(this.f2733b, executor);
            this.f2739h.mo2643j(this.f2734c, executor);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C9172b<Void> mo3243k() {
        C9172b<Void> bVar;
        synchronized (this.f2732a) {
            if (!this.f2736e || this.f2737f) {
                if (this.f2743l == null) {
                    this.f2743l = C1814b.m7736a(new C0933l0(this));
                }
                bVar = C0768f.m3083i(this.f2743l);
            } else {
                bVar = C0768f.m3081g(null);
            }
        }
        return bVar;
    }

    /* renamed from: l */
    public String mo3244l() {
        return this.f2746o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3245m(C0889u1 u1Var) {
        synchronized (this.f2732a) {
            if (!this.f2736e) {
                try {
                    ImageProxy i = u1Var.mo2642i();
                    if (i != null) {
                        Integer num = (Integer) i.mo2537U().mo2693c().mo3114c(this.f2746o);
                        if (!this.f2748q.contains(num)) {
                            C0949o2.m3698k("ProcessingImageReader", "ImageProxyBundle does not contain this id: " + num);
                            i.close();
                        } else {
                            this.f2747p.mo3283c(i);
                        }
                    }
                } catch (IllegalStateException e) {
                    C0949o2.m3691d("ProcessingImageReader", "Failed to acquire latest image.", e);
                }
                return;
            }
            return;
        }
    }

    /* renamed from: p */
    public void mo3247p(C0784b1 b1Var) {
        synchronized (this.f2732a) {
            if (b1Var.mo2947a() != null) {
                if (this.f2738g.mo2639f() >= b1Var.mo2947a().size()) {
                    this.f2748q.clear();
                    for (C0800e1 next : b1Var.mo2947a()) {
                        if (next != null) {
                            this.f2748q.add(Integer.valueOf(next.mo2980a()));
                        }
                    }
                } else {
                    throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                }
            }
            String num = Integer.toString(b1Var.hashCode());
            this.f2746o = num;
            this.f2747p = new C1002x2(this.f2748q, num);
            mo3248q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3248q() {
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : this.f2748q) {
            arrayList.add(this.f2747p.mo3082a(intValue.intValue()));
        }
        C0768f.m3075a(C0768f.m3076b(arrayList), this.f2735d, this.f2744m);
    }
}
