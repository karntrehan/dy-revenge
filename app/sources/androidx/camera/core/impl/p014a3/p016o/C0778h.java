package androidx.camera.core.impl.p014a3.p016o;

import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.a3.o.h */
class C0778h<V> implements C9172b<List<V>> {

    /* renamed from: f */
    List<? extends C9172b<? extends V>> f2341f;

    /* renamed from: o */
    List<V> f2342o;

    /* renamed from: p */
    private final boolean f2343p;

    /* renamed from: q */
    private final AtomicInteger f2344q;

    /* renamed from: r */
    private final C9172b<List<V>> f2345r = C1814b.m7736a(new C0779a());

    /* renamed from: s */
    C1814b.C1815a<List<V>> f2346s;

    /* renamed from: androidx.camera.core.impl.a3.o.h$a */
    class C0779a implements C1814b.C1817c<List<V>> {
        C0779a() {
        }

        /* renamed from: a */
        public Object mo1960a(C1814b.C1815a<List<V>> aVar) {
            C1177h.m4586h(C0778h.this.f2346s == null, "The result can only set once!");
            C0778h.this.f2346s = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.o.h$b */
    class C0780b implements Runnable {
        C0780b() {
        }

        public void run() {
            C0778h hVar = C0778h.this;
            hVar.f2342o = null;
            hVar.f2341f = null;
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.o.h$c */
    class C0781c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f2349f;

        /* renamed from: o */
        final /* synthetic */ C9172b f2350o;

        C0781c(int i, C9172b bVar) {
            this.f2349f = i;
            this.f2350o = bVar;
        }

        public void run() {
            C0778h.this.mo2939f(this.f2349f, this.f2350o);
        }
    }

    C0778h(List<? extends C9172b<? extends V>> list, boolean z, Executor executor) {
        this.f2341f = (List) C1177h.m4583e(list);
        this.f2342o = new ArrayList(list.size());
        this.f2343p = z;
        this.f2344q = new AtomicInteger(list.size());
        m3096d(executor);
    }

    /* renamed from: a */
    private void m3095a() {
        List<? extends C9172b<? extends V>> list = this.f2341f;
        if (list != null && !isDone()) {
            for (C9172b bVar : list) {
                while (true) {
                    if (!bVar.isDone()) {
                        try {
                            bVar.get();
                        } catch (Error e) {
                            throw e;
                        } catch (InterruptedException e2) {
                            throw e2;
                        } catch (Throwable unused) {
                            if (this.f2343p) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m3096d(Executor executor) {
        mo2919e(new C0780b(), C0744a.m3044a());
        if (this.f2341f.isEmpty()) {
            this.f2346s.mo6308c(new ArrayList(this.f2342o));
            return;
        }
        for (int i = 0; i < this.f2341f.size(); i++) {
            this.f2342o.add((Object) null);
        }
        List<? extends C9172b<? extends V>> list = this.f2341f;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C9172b bVar = (C9172b) list.get(i2);
            bVar.mo2919e(new C0781c(i2, bVar), executor);
        }
    }

    /* renamed from: b */
    public List<V> get() {
        m3095a();
        return this.f2345r.get();
    }

    /* renamed from: c */
    public List<V> get(long j, TimeUnit timeUnit) {
        return this.f2345r.get(j, timeUnit);
    }

    public boolean cancel(boolean z) {
        List<? extends C9172b<? extends V>> list = this.f2341f;
        if (list != null) {
            for (C9172b cancel : list) {
                cancel.cancel(z);
            }
        }
        return this.f2345r.cancel(z);
    }

    /* renamed from: e */
    public void mo2919e(Runnable runnable, Executor executor) {
        this.f2345r.mo2919e(runnable, executor);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00ba */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2939f(int r7, java.util.concurrent.Future<? extends V> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "Less than 0 remaining futures"
            java.util.List<V> r1 = r6.f2342o
            boolean r2 = r6.isDone()
            if (r2 != 0) goto L_0x0104
            if (r1 != 0) goto L_0x000e
            goto L_0x0104
        L_0x000e:
            r2 = 1
            r3 = 0
            boolean r4 = r8.isDone()     // Catch:{ CancellationException -> 0x00ba, ExecutionException -> 0x0091, RuntimeException -> 0x006c, Error -> 0x004b }
            java.lang.String r5 = "Tried to set value from future which is not done"
            androidx.core.util.C1177h.m4586h(r4, r5)     // Catch:{ CancellationException -> 0x00ba, ExecutionException -> 0x0091, RuntimeException -> 0x006c, Error -> 0x004b }
            java.lang.Object r8 = androidx.camera.core.impl.p014a3.p016o.C0768f.m3078d(r8)     // Catch:{ CancellationException -> 0x00ba, ExecutionException -> 0x0091, RuntimeException -> 0x006c, Error -> 0x004b }
            r1.set(r7, r8)     // Catch:{ CancellationException -> 0x00ba, ExecutionException -> 0x0091, RuntimeException -> 0x006c, Error -> 0x004b }
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f2344q
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            androidx.core.util.C1177h.m4586h(r2, r0)
            if (r7 != 0) goto L_0x00dd
            java.util.List<V> r7 = r6.f2342o
            if (r7 == 0) goto L_0x003f
            c.g.a.b$a<java.util.List<V>> r8 = r6.f2346s
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
        L_0x003a:
            r8.mo6308c(r0)
            goto L_0x00dd
        L_0x003f:
            boolean r7 = r6.isDone()
            androidx.core.util.C1177h.m4585g(r7)
            goto L_0x00dd
        L_0x0048:
            r7 = move-exception
            goto L_0x00de
        L_0x004b:
            r7 = move-exception
            c.g.a.b$a<java.util.List<V>> r8 = r6.f2346s     // Catch:{ all -> 0x0048 }
            r8.mo6310f(r7)     // Catch:{ all -> 0x0048 }
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f2344q
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            androidx.core.util.C1177h.m4586h(r2, r0)
            if (r7 != 0) goto L_0x00dd
            java.util.List<V> r7 = r6.f2342o
            if (r7 == 0) goto L_0x003f
            c.g.a.b$a<java.util.List<V>> r8 = r6.f2346s
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            goto L_0x003a
        L_0x006c:
            r7 = move-exception
            boolean r8 = r6.f2343p     // Catch:{ all -> 0x0048 }
            if (r8 == 0) goto L_0x0076
            c.g.a.b$a<java.util.List<V>> r8 = r6.f2346s     // Catch:{ all -> 0x0048 }
            r8.mo6310f(r7)     // Catch:{ all -> 0x0048 }
        L_0x0076:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f2344q
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r2 = 0
        L_0x0080:
            androidx.core.util.C1177h.m4586h(r2, r0)
            if (r7 != 0) goto L_0x00dd
            java.util.List<V> r7 = r6.f2342o
            if (r7 == 0) goto L_0x003f
            c.g.a.b$a<java.util.List<V>> r8 = r6.f2346s
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            goto L_0x003a
        L_0x0091:
            r7 = move-exception
            boolean r8 = r6.f2343p     // Catch:{ all -> 0x0048 }
            if (r8 == 0) goto L_0x009f
            c.g.a.b$a<java.util.List<V>> r8 = r6.f2346s     // Catch:{ all -> 0x0048 }
            java.lang.Throwable r7 = r7.getCause()     // Catch:{ all -> 0x0048 }
            r8.mo6310f(r7)     // Catch:{ all -> 0x0048 }
        L_0x009f:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f2344q
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r2 = 0
        L_0x00a9:
            androidx.core.util.C1177h.m4586h(r2, r0)
            if (r7 != 0) goto L_0x00dd
            java.util.List<V> r7 = r6.f2342o
            if (r7 == 0) goto L_0x003f
            c.g.a.b$a<java.util.List<V>> r8 = r6.f2346s
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            goto L_0x003a
        L_0x00ba:
            boolean r7 = r6.f2343p     // Catch:{ all -> 0x0048 }
            if (r7 == 0) goto L_0x00c1
            r6.cancel(r3)     // Catch:{ all -> 0x0048 }
        L_0x00c1:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f2344q
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r2 = 0
        L_0x00cb:
            androidx.core.util.C1177h.m4586h(r2, r0)
            if (r7 != 0) goto L_0x00dd
            java.util.List<V> r7 = r6.f2342o
            if (r7 == 0) goto L_0x003f
            c.g.a.b$a<java.util.List<V>> r8 = r6.f2346s
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            goto L_0x003a
        L_0x00dd:
            return
        L_0x00de:
            java.util.concurrent.atomic.AtomicInteger r8 = r6.f2344q
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r2 = 0
        L_0x00e8:
            androidx.core.util.C1177h.m4586h(r2, r0)
            if (r8 != 0) goto L_0x0103
            java.util.List<V> r8 = r6.f2342o
            if (r8 == 0) goto L_0x00fc
            c.g.a.b$a<java.util.List<V>> r0 = r6.f2346s
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r8)
            r0.mo6308c(r1)
            goto L_0x0103
        L_0x00fc:
            boolean r8 = r6.isDone()
            androidx.core.util.C1177h.m4585g(r8)
        L_0x0103:
            throw r7
        L_0x0104:
            boolean r7 = r6.f2343p
            java.lang.String r8 = "Future was done before all dependencies completed"
            androidx.core.util.C1177h.m4586h(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.p014a3.p016o.C0778h.mo2939f(int, java.util.concurrent.Future):void");
    }

    public boolean isCancelled() {
        return this.f2345r.isCancelled();
    }

    public boolean isDone() {
        return this.f2345r.isDone();
    }
}
