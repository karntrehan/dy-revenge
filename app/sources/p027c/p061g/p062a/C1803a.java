package p027c.p061g.p062a;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: c.g.a.a */
public abstract class C1803a<V> implements C9172b<V> {

    /* renamed from: f */
    static final boolean f5363f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: o */
    private static final Logger f5364o = Logger.getLogger(C1803a.class.getName());

    /* renamed from: p */
    static final C1805b f5365p;

    /* renamed from: q */
    private static final Object f5366q = new Object();

    /* renamed from: r */
    volatile Object f5367r;

    /* renamed from: s */
    volatile C1809e f5368s;

    /* renamed from: t */
    volatile C1813i f5369t;

    /* renamed from: c.g.a.a$b */
    private static abstract class C1805b {
        private C1805b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo6297a(C1803a<?> aVar, C1809e eVar, C1809e eVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo6298b(C1803a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo6299c(C1803a<?> aVar, C1813i iVar, C1813i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo6300d(C1813i iVar, C1813i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo6301e(C1813i iVar, Thread thread);
    }

    /* renamed from: c.g.a.a$c */
    private static final class C1806c {

        /* renamed from: a */
        static final C1806c f5370a;

        /* renamed from: b */
        static final C1806c f5371b;

        /* renamed from: c */
        final boolean f5372c;

        /* renamed from: d */
        final Throwable f5373d;

        static {
            if (C1803a.f5363f) {
                f5371b = null;
                f5370a = null;
                return;
            }
            f5371b = new C1806c(false, (Throwable) null);
            f5370a = new C1806c(true, (Throwable) null);
        }

        C1806c(boolean z, Throwable th) {
            this.f5372c = z;
            this.f5373d = th;
        }
    }

    /* renamed from: c.g.a.a$d */
    private static final class C1807d {

        /* renamed from: a */
        static final C1807d f5374a = new C1807d(new C1808a("Failure occurred while trying to finish a future."));

        /* renamed from: b */
        final Throwable f5375b;

        /* renamed from: c.g.a.a$d$a */
        static class C1808a extends Throwable {
            C1808a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        C1807d(Throwable th) {
            this.f5375b = (Throwable) C1803a.m7703d(th);
        }
    }

    /* renamed from: c.g.a.a$e */
    private static final class C1809e {

        /* renamed from: a */
        static final C1809e f5376a = new C1809e((Runnable) null, (Executor) null);

        /* renamed from: b */
        final Runnable f5377b;

        /* renamed from: c */
        final Executor f5378c;

        /* renamed from: d */
        C1809e f5379d;

        C1809e(Runnable runnable, Executor executor) {
            this.f5377b = runnable;
            this.f5378c = executor;
        }
    }

    /* renamed from: c.g.a.a$f */
    private static final class C1810f extends C1805b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C1813i, Thread> f5380a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C1813i, C1813i> f5381b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<C1803a, C1813i> f5382c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<C1803a, C1809e> f5383d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<C1803a, Object> f5384e;

        C1810f(AtomicReferenceFieldUpdater<C1813i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C1813i, C1813i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C1803a, C1813i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C1803a, C1809e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C1803a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f5380a = atomicReferenceFieldUpdater;
            this.f5381b = atomicReferenceFieldUpdater2;
            this.f5382c = atomicReferenceFieldUpdater3;
            this.f5383d = atomicReferenceFieldUpdater4;
            this.f5384e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6297a(C1803a<?> aVar, C1809e eVar, C1809e eVar2) {
            return this.f5383d.compareAndSet(aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6298b(C1803a<?> aVar, Object obj, Object obj2) {
            return this.f5384e.compareAndSet(aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6299c(C1803a<?> aVar, C1813i iVar, C1813i iVar2) {
            return this.f5382c.compareAndSet(aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6300d(C1813i iVar, C1813i iVar2) {
            this.f5381b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6301e(C1813i iVar, Thread thread) {
            this.f5380a.lazySet(iVar, thread);
        }
    }

    /* renamed from: c.g.a.a$g */
    private static final class C1811g<V> implements Runnable {

        /* renamed from: f */
        final C1803a<V> f5385f;

        /* renamed from: o */
        final C9172b<? extends V> f5386o;

        public void run() {
            if (this.f5385f.f5367r == this) {
                if (C1803a.f5365p.mo6298b(this.f5385f, this, C1803a.m7708j(this.f5386o))) {
                    C1803a.m7705g(this.f5385f);
                }
            }
        }
    }

    /* renamed from: c.g.a.a$h */
    private static final class C1812h extends C1805b {
        C1812h() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6297a(C1803a<?> aVar, C1809e eVar, C1809e eVar2) {
            synchronized (aVar) {
                if (aVar.f5368s != eVar) {
                    return false;
                }
                aVar.f5368s = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6298b(C1803a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f5367r != obj) {
                    return false;
                }
                aVar.f5367r = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6299c(C1803a<?> aVar, C1813i iVar, C1813i iVar2) {
            synchronized (aVar) {
                if (aVar.f5369t != iVar) {
                    return false;
                }
                aVar.f5369t = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6300d(C1813i iVar, C1813i iVar2) {
            iVar.f5389c = iVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6301e(C1813i iVar, Thread thread) {
            iVar.f5388b = thread;
        }
    }

    /* renamed from: c.g.a.a$i */
    private static final class C1813i {

        /* renamed from: a */
        static final C1813i f5387a = new C1813i(false);

        /* renamed from: b */
        volatile Thread f5388b;

        /* renamed from: c */
        volatile C1813i f5389c;

        C1813i() {
            C1803a.f5365p.mo6301e(this, Thread.currentThread());
        }

        C1813i(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6304a(C1813i iVar) {
            C1803a.f5365p.mo6300d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6305b() {
            Thread thread = this.f5388b;
            if (thread != null) {
                this.f5388b = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: c.g.a.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: c.g.a.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: c.g.a.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: c.g.a.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<c.g.a.a$i> r0 = p027c.p061g.p062a.C1803a.C1813i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f5363f = r1
            java.lang.Class<c.g.a.a> r1 = p027c.p061g.p062a.C1803a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f5364o = r1
            c.g.a.a$f r1 = new c.g.a.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<c.g.a.a> r2 = p027c.p061g.p062a.C1803a.class
            java.lang.String r5 = "t"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<c.g.a.a> r0 = p027c.p061g.p062a.C1803a.class
            java.lang.Class<c.g.a.a$e> r2 = p027c.p061g.p062a.C1803a.C1809e.class
            java.lang.String r6 = "s"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<c.g.a.a> r0 = p027c.p061g.p062a.C1803a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "r"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            c.g.a.a$h r1 = new c.g.a.a$h
            r1.<init>()
        L_0x0054:
            f5365p = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f5364o
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f5366q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p061g.p062a.C1803a.<clinit>():void");
    }

    protected C1803a() {
    }

    /* renamed from: a */
    private void m7701a(StringBuilder sb) {
        String str = "]";
        try {
            Object k = m7709k(this);
            sb.append("SUCCESS, result=[");
            sb.append(m7712r(k));
            sb.append(str);
            return;
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
        } catch (CancellationException unused) {
            str = "CANCELLED";
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            str = " thrown from get()]";
        }
        sb.append(str);
    }

    /* renamed from: c */
    private static CancellationException m7702c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: d */
    static <T> T m7703d(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: f */
    private C1809e m7704f(C1809e eVar) {
        C1809e eVar2;
        do {
            eVar2 = this.f5368s;
        } while (!f5365p.mo6297a(this, eVar2, C1809e.f5376a));
        C1809e eVar3 = eVar2;
        C1809e eVar4 = eVar;
        C1809e eVar5 = eVar3;
        while (eVar5 != null) {
            C1809e eVar6 = eVar5.f5379d;
            eVar5.f5379d = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* renamed from: g */
    static void m7705g(C1803a<?> aVar) {
        C1809e eVar = null;
        C1803a<V> aVar2 = aVar;
        while (true) {
            aVar2.m7710n();
            aVar2.mo6286b();
            C1809e f = aVar2.m7704f(eVar);
            while (true) {
                if (f != null) {
                    eVar = f.f5379d;
                    Runnable runnable = f.f5377b;
                    if (runnable instanceof C1811g) {
                        C1811g gVar = (C1811g) runnable;
                        C1803a<V> aVar3 = gVar.f5385f;
                        if (aVar3.f5367r == gVar) {
                            if (f5365p.mo6298b(aVar3, gVar, m7708j(gVar.f5386o))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m7706h(runnable, f.f5378c);
                    }
                    f = eVar;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    private static void m7706h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f5364o;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: i */
    private V m7707i(Object obj) {
        if (obj instanceof C1806c) {
            throw m7702c("Task was cancelled.", ((C1806c) obj).f5373d);
        } else if (obj instanceof C1807d) {
            throw new ExecutionException(((C1807d) obj).f5375b);
        } else if (obj == f5366q) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: j */
    static Object m7708j(C9172b<?> bVar) {
        if (bVar instanceof C1803a) {
            Object obj = ((C1803a) bVar).f5367r;
            if (!(obj instanceof C1806c)) {
                return obj;
            }
            C1806c cVar = (C1806c) obj;
            return cVar.f5372c ? cVar.f5373d != null ? new C1806c(false, cVar.f5373d) : C1806c.f5371b : obj;
        }
        boolean isCancelled = bVar.isCancelled();
        if ((!f5363f) && isCancelled) {
            return C1806c.f5371b;
        }
        try {
            Object k = m7709k(bVar);
            return k == null ? f5366q : k;
        } catch (ExecutionException e) {
            return new C1807d(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C1806c(false, e2);
            }
            return new C1807d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bVar, e2));
        } catch (Throwable th) {
            return new C1807d(th);
        }
    }

    /* renamed from: k */
    private static <V> V m7709k(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: n */
    private void m7710n() {
        C1813i iVar;
        do {
            iVar = this.f5369t;
        } while (!f5365p.mo6299c(this, iVar, C1813i.f5387a));
        while (iVar != null) {
            iVar.mo6305b();
            iVar = iVar.f5389c;
        }
    }

    /* renamed from: o */
    private void m7711o(C1813i iVar) {
        iVar.f5388b = null;
        while (true) {
            C1813i iVar2 = this.f5369t;
            if (iVar2 != C1813i.f5387a) {
                C1813i iVar3 = null;
                while (iVar2 != null) {
                    C1813i iVar4 = iVar2.f5389c;
                    if (iVar2.f5388b != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f5389c = iVar4;
                        if (iVar3.f5388b == null) {
                        }
                    } else if (!f5365p.mo6299c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: r */
    private String m7712r(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6286b() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [e.f.b.a.a.b<? extends V>, java.util.concurrent.Future] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f5367r
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof p027c.p061g.p062a.C1803a.C1811g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f5363f
            if (r3 == 0) goto L_0x001f
            c.g.a.a$c r3 = new c.g.a.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            c.g.a.a$c r3 = p027c.p061g.p062a.C1803a.C1806c.f5370a
            goto L_0x0026
        L_0x0024:
            c.g.a.a$c r3 = p027c.p061g.p062a.C1803a.C1806c.f5371b
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            c.g.a.a$b r6 = f5365p
            boolean r6 = r6.mo6298b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.mo6292l()
        L_0x0035:
            m7705g(r4)
            boolean r4 = r0 instanceof p027c.p061g.p062a.C1803a.C1811g
            if (r4 == 0) goto L_0x0062
            c.g.a.a$g r0 = (p027c.p061g.p062a.C1803a.C1811g) r0
            e.f.b.a.a.b<? extends V> r0 = r0.f5386o
            boolean r4 = r0 instanceof p027c.p061g.p062a.C1803a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            c.g.a.a r4 = (p027c.p061g.p062a.C1803a) r4
            java.lang.Object r0 = r4.f5367r
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof p027c.p061g.p062a.C1803a.C1811g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f5367r
            boolean r6 = r0 instanceof p027c.p061g.p062a.C1803a.C1811g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p061g.p062a.C1803a.cancel(boolean):boolean");
    }

    /* renamed from: e */
    public final void mo2919e(Runnable runnable, Executor executor) {
        m7703d(runnable);
        m7703d(executor);
        C1809e eVar = this.f5368s;
        if (eVar != C1809e.f5376a) {
            C1809e eVar2 = new C1809e(runnable, executor);
            do {
                eVar2.f5379d = eVar;
                if (!f5365p.mo6297a(this, eVar, eVar2)) {
                    eVar = this.f5368s;
                } else {
                    return;
                }
            } while (eVar != C1809e.f5376a);
        }
        m7706h(runnable, executor);
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5367r;
            if ((obj2 != null) && (!(obj2 instanceof C1811g))) {
                return m7707i(obj2);
            }
            C1813i iVar = this.f5369t;
            if (iVar != C1813i.f5387a) {
                C1813i iVar2 = new C1813i();
                do {
                    iVar2.mo6304a(iVar);
                    if (f5365p.mo6299c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5367r;
                            } else {
                                m7711o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C1811g))));
                        return m7707i(obj);
                    }
                    iVar = this.f5369t;
                } while (iVar != C1813i.f5387a);
            }
            return m7707i(this.f5367r);
        }
        throw new InterruptedException();
    }

    public final V get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f5367r;
            if ((obj != null) && (!(obj instanceof C1811g))) {
                return m7707i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C1813i iVar = this.f5369t;
                if (iVar != C1813i.f5387a) {
                    C1813i iVar2 = new C1813i();
                    do {
                        iVar2.mo6304a(iVar);
                        if (f5365p.mo6299c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5367r;
                                    if ((obj2 != null) && (!(obj2 instanceof C1811g))) {
                                        return m7707i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m7711o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m7711o(iVar2);
                        } else {
                            iVar = this.f5369t;
                        }
                    } while (iVar != C1813i.f5387a);
                }
                return m7707i(this.f5367r);
            }
            while (nanos > 0) {
                Object obj3 = this.f5367r;
                if ((obj3 != null) && (!(obj3 instanceof C1811g))) {
                    return m7707i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f5367r instanceof C1806c;
    }

    public final boolean isDone() {
        Object obj = this.f5367r;
        return (!(obj instanceof C1811g)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo6292l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public String mo6293m() {
        Object obj = this.f5367r;
        if (obj instanceof C1811g) {
            return "setFuture=[" + m7712r(((C1811g) obj).f5386o) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo6294p(V v) {
        if (v == null) {
            v = f5366q;
        }
        if (!f5365p.mo6298b(this, (Object) null, v)) {
            return false;
        }
        m7705g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo6295q(Throwable th) {
        if (!f5365p.mo6298b(this, (Object) null, new C1807d((Throwable) m7703d(th)))) {
            return false;
        }
        m7705g(this);
        return true;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            str2 = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str = mo6293m();
                } catch (RuntimeException e) {
                    str = "Exception thrown from implementation: " + e.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                } else if (!isDone()) {
                    str2 = "PENDING";
                }
            }
            m7701a(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
