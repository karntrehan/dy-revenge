package androidx.camera.core.impl;

import androidx.camera.core.impl.C0796d2;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.util.C1177h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.q2 */
public abstract class C0864q2<T> implements C0796d2<T> {

    /* renamed from: a */
    private final Object f2514a = new Object();

    /* renamed from: b */
    private final AtomicReference<Object> f2515b;

    /* renamed from: c */
    private int f2516c = 0;

    /* renamed from: d */
    private boolean f2517d = false;

    /* renamed from: e */
    private final Map<C0796d2.C0797a<? super T>, C0866b<T>> f2518e = new HashMap();

    /* renamed from: f */
    private final CopyOnWriteArraySet<C0866b<T>> f2519f = new CopyOnWriteArraySet<>();

    /* renamed from: androidx.camera.core.impl.q2$a */
    static abstract class C0865a {
        C0865a() {
        }

        /* renamed from: b */
        static C0865a m3421b(Throwable th) {
            return new C0898w(th);
        }

        /* renamed from: a */
        public abstract Throwable mo3087a();
    }

    /* renamed from: androidx.camera.core.impl.q2$b */
    private static final class C0866b<T> implements Runnable {

        /* renamed from: f */
        private static final Object f2520f = new Object();

        /* renamed from: o */
        private final Executor f2521o;

        /* renamed from: p */
        private final C0796d2.C0797a<? super T> f2522p;

        /* renamed from: q */
        private final AtomicBoolean f2523q = new AtomicBoolean(true);

        /* renamed from: r */
        private final AtomicReference<Object> f2524r;

        /* renamed from: s */
        private Object f2525s = f2520f;

        /* renamed from: t */
        private int f2526t = -1;

        /* renamed from: u */
        private boolean f2527u = false;

        C0866b(AtomicReference<Object> atomicReference, Executor executor, C0796d2.C0797a<? super T> aVar) {
            this.f2524r = atomicReference;
            this.f2521o = executor;
            this.f2522p = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3088a() {
            this.f2523q.set(false);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3089b(int r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.f2523q     // Catch:{ all -> 0x002c }
                boolean r0 = r0.get()     // Catch:{ all -> 0x002c }
                if (r0 != 0) goto L_0x000b
                monitor-exit(r1)     // Catch:{ all -> 0x002c }
                return
            L_0x000b:
                int r0 = r1.f2526t     // Catch:{ all -> 0x002c }
                if (r2 > r0) goto L_0x0011
                monitor-exit(r1)     // Catch:{ all -> 0x002c }
                return
            L_0x0011:
                r1.f2526t = r2     // Catch:{ all -> 0x002c }
                boolean r2 = r1.f2527u     // Catch:{ all -> 0x002c }
                if (r2 == 0) goto L_0x0019
                monitor-exit(r1)     // Catch:{ all -> 0x002c }
                return
            L_0x0019:
                r2 = 1
                r1.f2527u = r2     // Catch:{ all -> 0x002c }
                monitor-exit(r1)     // Catch:{ all -> 0x002c }
                java.util.concurrent.Executor r2 = r1.f2521o     // Catch:{ all -> 0x0023 }
                r2.execute(r1)     // Catch:{ all -> 0x0023 }
                goto L_0x0028
            L_0x0023:
                monitor-enter(r1)
                r2 = 0
                r1.f2527u = r2     // Catch:{ all -> 0x0029 }
                monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            L_0x0028:
                return
            L_0x0029:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0029 }
                throw r2
            L_0x002c:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x002c }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C0864q2.C0866b.mo3089b(int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
            if (java.util.Objects.equals(r4.f2525s, r0) != false) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
            r4.f2525s = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
            if ((r0 instanceof androidx.camera.core.impl.C0864q2.C0865a) == false) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
            r4.f2522p.mo2977a(((androidx.camera.core.impl.C0864q2.C0865a) r0).mo3087a());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
            r4.f2522p.mo2978b(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
            monitor-enter(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
            if (r2 == r4.f2526t) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
            if (r4.f2523q.get() != false) goto L_0x0044;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
            r0 = r4.f2524r.get();
            r2 = r4.f2526t;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
            r4.f2527u = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                monitor-enter(r4)
                java.util.concurrent.atomic.AtomicBoolean r0 = r4.f2523q     // Catch:{ all -> 0x0055 }
                boolean r0 = r0.get()     // Catch:{ all -> 0x0055 }
                r1 = 0
                if (r0 != 0) goto L_0x000e
                r4.f2527u = r1     // Catch:{ all -> 0x0055 }
                monitor-exit(r4)     // Catch:{ all -> 0x0055 }
                return
            L_0x000e:
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r4.f2524r     // Catch:{ all -> 0x0055 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0055 }
                int r2 = r4.f2526t     // Catch:{ all -> 0x0055 }
                monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            L_0x0017:
                java.lang.Object r3 = r4.f2525s
                boolean r3 = java.util.Objects.equals(r3, r0)
                if (r3 != 0) goto L_0x0036
                r4.f2525s = r0
                boolean r3 = r0 instanceof androidx.camera.core.impl.C0864q2.C0865a
                if (r3 == 0) goto L_0x0031
                androidx.camera.core.impl.d2$a<? super T> r3 = r4.f2522p
                androidx.camera.core.impl.q2$a r0 = (androidx.camera.core.impl.C0864q2.C0865a) r0
                java.lang.Throwable r0 = r0.mo3087a()
                r3.mo2977a(r0)
                goto L_0x0036
            L_0x0031:
                androidx.camera.core.impl.d2$a<? super T> r3 = r4.f2522p
                r3.mo2978b(r0)
            L_0x0036:
                monitor-enter(r4)
                int r0 = r4.f2526t     // Catch:{ all -> 0x0052 }
                if (r2 == r0) goto L_0x004e
                java.util.concurrent.atomic.AtomicBoolean r0 = r4.f2523q     // Catch:{ all -> 0x0052 }
                boolean r0 = r0.get()     // Catch:{ all -> 0x0052 }
                if (r0 != 0) goto L_0x0044
                goto L_0x004e
            L_0x0044:
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r4.f2524r     // Catch:{ all -> 0x0052 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0052 }
                int r2 = r4.f2526t     // Catch:{ all -> 0x0052 }
                monitor-exit(r4)     // Catch:{ all -> 0x0052 }
                goto L_0x0017
            L_0x004e:
                r4.f2527u = r1     // Catch:{ all -> 0x0052 }
                monitor-exit(r4)     // Catch:{ all -> 0x0052 }
                return
            L_0x0052:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0052 }
                throw r0
            L_0x0055:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0055 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C0864q2.C0866b.run():void");
        }
    }

    C0864q2(Object obj, boolean z) {
        AtomicReference<Object> atomicReference;
        if (z) {
            C1177h.m4580b(obj instanceof Throwable, "Initial errors must be Throwable");
            atomicReference = new AtomicReference<>(C0865a.m3421b((Throwable) obj));
        } else {
            atomicReference = new AtomicReference<>(obj);
        }
        this.f2515b = atomicReference;
    }

    /* renamed from: b */
    private void m3415b(C0796d2.C0797a<? super T> aVar) {
        C0866b remove = this.f2518e.remove(aVar);
        if (remove != null) {
            remove.mo3088a();
            this.f2519f.remove(remove);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r1.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r1.next().mo3089b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r1 = r3.f2514a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r3.f2516c != r4) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        r3.f2517d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        r4 = r3.f2519f.iterator();
        r0 = r3.f2516c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        r1 = r4;
        r4 = r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3416g(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2514a
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r3.f2515b     // Catch:{ all -> 0x0051 }
            java.lang.Object r1 = r1.getAndSet(r4)     // Catch:{ all -> 0x0051 }
            boolean r4 = java.util.Objects.equals(r1, r4)     // Catch:{ all -> 0x0051 }
            if (r4 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return
        L_0x0011:
            int r4 = r3.f2516c     // Catch:{ all -> 0x0051 }
            r1 = 1
            int r4 = r4 + r1
            r3.f2516c = r4     // Catch:{ all -> 0x0051 }
            boolean r2 = r3.f2517d     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return
        L_0x001d:
            r3.f2517d = r1     // Catch:{ all -> 0x0051 }
            java.util.concurrent.CopyOnWriteArraySet<androidx.camera.core.impl.q2$b<T>> r1 = r3.f2519f     // Catch:{ all -> 0x0051 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0051 }
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
        L_0x0026:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r1.next()
            androidx.camera.core.impl.q2$b r0 = (androidx.camera.core.impl.C0864q2.C0866b) r0
            r0.mo3089b(r4)
            goto L_0x0026
        L_0x0036:
            java.lang.Object r1 = r3.f2514a
            monitor-enter(r1)
            int r0 = r3.f2516c     // Catch:{ all -> 0x004e }
            if (r0 != r4) goto L_0x0042
            r4 = 0
            r3.f2517d = r4     // Catch:{ all -> 0x004e }
            monitor-exit(r1)     // Catch:{ all -> 0x004e }
            return
        L_0x0042:
            java.util.concurrent.CopyOnWriteArraySet<androidx.camera.core.impl.q2$b<T>> r4 = r3.f2519f     // Catch:{ all -> 0x004e }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x004e }
            int r0 = r3.f2516c     // Catch:{ all -> 0x004e }
            monitor-exit(r1)     // Catch:{ all -> 0x004e }
            r1 = r4
            r4 = r0
            goto L_0x0026
        L_0x004e:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004e }
            throw r4
        L_0x0051:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C0864q2.m3416g(java.lang.Object):void");
    }

    /* renamed from: a */
    public void mo2974a(C0796d2.C0797a<? super T> aVar) {
        synchronized (this.f2514a) {
            m3415b(aVar);
        }
    }

    /* renamed from: d */
    public C9172b<T> mo2975d() {
        Object obj = this.f2515b.get();
        return obj instanceof C0865a ? C0768f.m3079e(((C0865a) obj).mo3087a()) : C0768f.m3081g(obj);
    }

    /* renamed from: e */
    public void mo2976e(Executor executor, C0796d2.C0797a<? super T> aVar) {
        C0866b bVar;
        synchronized (this.f2514a) {
            m3415b(aVar);
            bVar = new C0866b(this.f2515b, executor, aVar);
            this.f2518e.put(aVar, bVar);
            this.f2519f.add(bVar);
        }
        bVar.mo3089b(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3086f(T t) {
        m3416g(t);
    }
}
