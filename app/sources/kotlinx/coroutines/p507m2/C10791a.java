package kotlinx.coroutines.p507m2;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.C10702e;
import kotlinx.coroutines.C10819p0;
import kotlinx.coroutines.C10822q0;
import kotlinx.coroutines.internal.C10763v;
import p455g.C10323s;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p455g.p474z.C10475c;

/* renamed from: kotlinx.coroutines.m2.a */
public final class C10791a implements Executor, Closeable {

    /* renamed from: f */
    public static final C10792a f28290f = new C10792a((C10452g) null);

    /* renamed from: o */
    private static final /* synthetic */ AtomicLongFieldUpdater f28291o = AtomicLongFieldUpdater.newUpdater(C10791a.class, "parkedWorkersStack");

    /* renamed from: p */
    static final /* synthetic */ AtomicLongFieldUpdater f28292p = AtomicLongFieldUpdater.newUpdater(C10791a.class, "controlState");

    /* renamed from: q */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28293q = AtomicIntegerFieldUpdater.newUpdater(C10791a.class, "_isTerminated");

    /* renamed from: r */
    public static final C10763v f28294r = new C10763v("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: s */
    public final int f28295s;

    /* renamed from: t */
    public final int f28296t;

    /* renamed from: u */
    public final long f28297u;

    /* renamed from: v */
    public final String f28298v;

    /* renamed from: w */
    public final C10798d f28299w;

    /* renamed from: x */
    public final C10798d f28300x;

    /* renamed from: y */
    public final AtomicReferenceArray<C10794c> f28301y;

    /* renamed from: kotlinx.coroutines.m2.a$a */
    public static final class C10792a {
        private C10792a() {
        }

        public /* synthetic */ C10792a(C10452g gVar) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.m2.a$b */
    public /* synthetic */ class C10793b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28302a;

        static {
            int[] iArr = new int[C10795d.values().length];
            iArr[C10795d.PARKING.ordinal()] = 1;
            iArr[C10795d.BLOCKING.ordinal()] = 2;
            iArr[C10795d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[C10795d.DORMANT.ordinal()] = 4;
            iArr[C10795d.TERMINATED.ordinal()] = 5;
            f28302a = iArr;
        }
    }

    /* renamed from: kotlinx.coroutines.m2.a$c */
    public final class C10794c extends Thread {

        /* renamed from: f */
        static final /* synthetic */ AtomicIntegerFieldUpdater f28303f = AtomicIntegerFieldUpdater.newUpdater(C10794c.class, "workerCtl");
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: o */
        public final C10807m f28304o;

        /* renamed from: p */
        public C10795d f28305p;

        /* renamed from: q */
        private long f28306q;

        /* renamed from: r */
        private long f28307r;

        /* renamed from: s */
        private int f28308s;

        /* renamed from: t */
        public boolean f28309t;
        volatile /* synthetic */ int workerCtl;

        private C10794c() {
            setDaemon(true);
            this.f28304o = new C10807m();
            this.f28305p = C10795d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = C10791a.f28294r;
            this.f28308s = C10475c.f27631f.mo25847b();
        }

        public C10794c(int i) {
            this();
            mo26781n(i);
        }

        /* renamed from: a */
        private final void m36671a(int i) {
            if (i != 0) {
                C10791a.f28292p.addAndGet(C10791a.this, -2097152);
                C10795d dVar = this.f28305p;
                if (dVar != C10795d.TERMINATED) {
                    if (C10819p0.m36781a()) {
                        if (!(dVar == C10795d.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.f28305p = C10795d.DORMANT;
                }
            }
        }

        /* renamed from: b */
        private final void m36672b(int i) {
            if (i != 0 && mo26783r(C10795d.BLOCKING)) {
                C10791a.this.mo26774n0();
            }
        }

        /* renamed from: c */
        private final void m36673c(C10803i iVar) {
            int L = iVar.f28334o.mo26788L();
            m36675h(L);
            m36672b(L);
            C10791a.this.mo26768X(iVar);
            m36671a(L);
        }

        /* renamed from: d */
        private final C10803i m36674d(boolean z) {
            C10803i l;
            C10803i l2;
            if (z) {
                boolean z2 = mo26780j(C10791a.this.f28295s * 2) == 0;
                if (z2 && (l2 = m36678l()) != null) {
                    return l2;
                }
                C10803i h = this.f28304o.mo26799h();
                if (h != null) {
                    return h;
                }
                if (!z2 && (l = m36678l()) != null) {
                    return l;
                }
            } else {
                C10803i l3 = m36678l();
                if (l3 != null) {
                    return l3;
                }
            }
            return m36682s(false);
        }

        /* renamed from: h */
        private final void m36675h(int i) {
            this.f28306q = 0;
            if (this.f28305p == C10795d.PARKING) {
                if (C10819p0.m36781a()) {
                    boolean z = true;
                    if (i != 1) {
                        z = false;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                this.f28305p = C10795d.BLOCKING;
            }
        }

        /* renamed from: i */
        private final boolean m36676i() {
            return this.nextParkedWorker != C10791a.f28294r;
        }

        /* renamed from: k */
        private final void m36677k() {
            if (this.f28306q == 0) {
                this.f28306q = System.nanoTime() + C10791a.this.f28297u;
            }
            LockSupport.parkNanos(C10791a.this.f28297u);
            if (System.nanoTime() - this.f28306q >= 0) {
                this.f28306q = 0;
                m36683t();
            }
        }

        /* renamed from: l */
        private final C10803i m36678l() {
            C10798d dVar;
            if (mo26780j(2) == 0) {
                C10803i iVar = (C10803i) C10791a.this.f28299w.mo26738d();
                if (iVar != null) {
                    return iVar;
                }
                dVar = C10791a.this.f28300x;
            } else {
                C10803i iVar2 = (C10803i) C10791a.this.f28300x.mo26738d();
                if (iVar2 != null) {
                    return iVar2;
                }
                dVar = C10791a.this.f28299w;
            }
            return (C10803i) dVar.mo26738d();
        }

        /* renamed from: m */
        private final void m36679m() {
            loop0:
            while (true) {
                boolean z = false;
                while (!C10791a.this.isTerminated() && this.f28305p != C10795d.TERMINATED) {
                    C10803i e = mo26777e(this.f28309t);
                    if (e != null) {
                        this.f28307r = 0;
                        m36673c(e);
                    } else {
                        this.f28309t = false;
                        if (this.f28307r == 0) {
                            m36681q();
                        } else if (!z) {
                            z = true;
                        } else {
                            mo26783r(C10795d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f28307r);
                            this.f28307r = 0;
                        }
                    }
                }
            }
            mo26783r(C10795d.TERMINATED);
        }

        /* renamed from: p */
        private final boolean m36680p() {
            boolean z;
            if (this.f28305p != C10795d.CPU_ACQUIRED) {
                C10791a aVar = C10791a.this;
                while (true) {
                    long j = aVar.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (C10791a.f28292p.compareAndSet(aVar, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f28305p = C10795d.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: q */
        private final void m36681q() {
            if (!m36676i()) {
                C10791a.this.mo26766L(this);
                return;
            }
            if (C10819p0.m36781a()) {
                if (!(this.f28304o.mo26797f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (m36676i() && this.workerCtl == -1 && !C10791a.this.isTerminated() && this.f28305p != C10795d.TERMINATED) {
                mo26783r(C10795d.PARKING);
                Thread.interrupted();
                m36677k();
            }
        }

        /* renamed from: s */
        private final C10803i m36682s(boolean z) {
            if (C10819p0.m36781a()) {
                if (!(this.f28304o.mo26797f() == 0)) {
                    throw new AssertionError();
                }
            }
            int i = (int) (C10791a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int j = mo26780j(i);
            C10791a aVar = C10791a.this;
            long j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                j++;
                if (j > i) {
                    j = 1;
                }
                C10794c cVar = aVar.f28301y.get(j);
                if (!(cVar == null || cVar == this)) {
                    if (C10819p0.m36781a()) {
                        if (!(this.f28304o.mo26797f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    C10807m mVar = this.f28304o;
                    C10807m mVar2 = cVar.f28304o;
                    long k = z ? mVar.mo26800k(mVar2) : mVar.mo26801l(mVar2);
                    if (k == -1) {
                        return this.f28304o.mo26799h();
                    }
                    if (k > 0) {
                        j2 = Math.min(j2, k);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.f28307r = j2;
            return null;
        }

        /* renamed from: t */
        private final void m36683t() {
            C10791a aVar = C10791a.this;
            synchronized (aVar.f28301y) {
                if (!aVar.isTerminated()) {
                    if (((int) (aVar.controlState & 2097151)) > aVar.f28295s) {
                        if (f28303f.compareAndSet(this, -1, 1)) {
                            int f = mo26778f();
                            mo26781n(0);
                            aVar.mo26767W(this, f, 0);
                            int andDecrement = (int) (C10791a.f28292p.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != f) {
                                C10794c cVar = aVar.f28301y.get(andDecrement);
                                C10457l.m35317b(cVar);
                                C10794c cVar2 = cVar;
                                aVar.f28301y.set(f, cVar2);
                                cVar2.mo26781n(f);
                                aVar.mo26767W(cVar2, andDecrement, f);
                            }
                            aVar.f28301y.set(andDecrement, (Object) null);
                            C10323s sVar = C10323s.f27547a;
                            this.f28305p = C10795d.TERMINATED;
                        }
                    }
                }
            }
        }

        /* renamed from: e */
        public final C10803i mo26777e(boolean z) {
            C10803i iVar;
            if (m36680p()) {
                return m36674d(z);
            }
            if (!z || (iVar = this.f28304o.mo26799h()) == null) {
                iVar = (C10803i) C10791a.this.f28300x.mo26738d();
            }
            return iVar == null ? m36682s(true) : iVar;
        }

        /* renamed from: f */
        public final int mo26778f() {
            return this.indexInArray;
        }

        /* renamed from: g */
        public final Object mo26779g() {
            return this.nextParkedWorker;
        }

        /* renamed from: j */
        public final int mo26780j(int i) {
            int i2 = this.f28308s;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f28308s = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO) % i;
        }

        /* renamed from: n */
        public final void mo26781n(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C10791a.this.f28298v);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: o */
        public final void mo26782o(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: r */
        public final boolean mo26783r(C10795d dVar) {
            C10795d dVar2 = this.f28305p;
            boolean z = dVar2 == C10795d.CPU_ACQUIRED;
            if (z) {
                C10791a.f28292p.addAndGet(C10791a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f28305p = dVar;
            }
            return z;
        }

        public void run() {
            m36679m();
        }
    }

    /* renamed from: kotlinx.coroutines.m2.a$d */
    public enum C10795d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public C10791a(int i, int i2, long j, String str) {
        this.f28295s = i;
        this.f28296t = i2;
        this.f28297u = j;
        this.f28298v = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.f28299w = new C10798d();
                        this.f28300x = new C10798d();
                        this.parkedWorkersStack = 0;
                        this.f28301y = new AtomicReferenceArray<>(i2 + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: A */
    public static /* synthetic */ void m36653A(C10791a aVar, Runnable runnable, C10804j jVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            jVar = C10801g.f28331f;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.mo26775r(runnable, jVar, z);
    }

    /* renamed from: E */
    private final int m36654E(C10794c cVar) {
        int f;
        do {
            Object g = cVar.mo26779g();
            if (g == f28294r) {
                return -1;
            }
            if (g == null) {
                return 0;
            }
            cVar = (C10794c) g;
            f = cVar.mo26778f();
        } while (f == 0);
        return f;
    }

    /* renamed from: I */
    private final C10794c m36655I() {
        while (true) {
            long j = this.parkedWorkersStack;
            C10794c cVar = this.f28301y.get((int) (2097151 & j));
            if (cVar == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int E = m36654E(cVar);
            if (E >= 0) {
                if (f28291o.compareAndSet(this, j, ((long) E) | j2)) {
                    cVar.mo26782o(f28294r);
                    return cVar;
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m36656a(C10803i iVar) {
        boolean z = true;
        if (iVar.f28334o.mo26788L() != 1) {
            z = false;
        }
        return (z ? this.f28300x : this.f28299w).mo26735a(iVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m36657b() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.m2.a$c> r0 = r10.f28301y
            monitor-enter(r0)
            boolean r1 = r10.isTerminated()     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x000c
            r1 = -1
        L_0x000a:
            monitor-exit(r0)
            return r1
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x007a }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x007a }
            r7 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r7
            r5 = 21
            long r1 = r1 >> r5
            int r2 = (int) r1     // Catch:{ all -> 0x007a }
            int r1 = r6 - r2
            r2 = 0
            int r1 = p455g.p456a0.C10247f.m34826b(r1, r2)     // Catch:{ all -> 0x007a }
            int r5 = r10.f28295s     // Catch:{ all -> 0x007a }
            if (r1 < r5) goto L_0x002b
            monitor-exit(r0)
            return r2
        L_0x002b:
            int r5 = r10.f28296t     // Catch:{ all -> 0x007a }
            if (r6 < r5) goto L_0x0031
            monitor-exit(r0)
            return r2
        L_0x0031:
            long r5 = r10.controlState     // Catch:{ all -> 0x007a }
            long r5 = r5 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x007a }
            r5 = 1
            int r6 = r6 + r5
            if (r6 <= 0) goto L_0x0043
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.m2.a$c> r7 = r10.f28301y     // Catch:{ all -> 0x007a }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x007a }
            if (r7 != 0) goto L_0x0043
            r7 = 1
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x006e
            kotlinx.coroutines.m2.a$c r7 = new kotlinx.coroutines.m2.a$c     // Catch:{ all -> 0x007a }
            r7.<init>(r6)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.m2.a$c> r8 = r10.f28301y     // Catch:{ all -> 0x007a }
            r8.set(r6, r7)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f28292p     // Catch:{ all -> 0x007a }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x007a }
            long r3 = r3 & r8
            int r4 = (int) r3     // Catch:{ all -> 0x007a }
            if (r6 != r4) goto L_0x005b
            r2 = 1
        L_0x005b:
            if (r2 == 0) goto L_0x0062
            r7.start()     // Catch:{ all -> 0x007a }
            int r1 = r1 + r5
            goto L_0x000a
        L_0x0062:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x006e:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x007a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p507m2.C10791a.m36657b():int");
    }

    /* renamed from: i0 */
    private final void m36658i0(boolean z) {
        long addAndGet = f28292p.addAndGet(this, 2097152);
        if (!z && !m36663w0() && !m36661u0(addAndGet)) {
            m36663w0();
        }
    }

    /* renamed from: o */
    private final C10794c m36659o() {
        Thread currentThread = Thread.currentThread();
        C10794c cVar = currentThread instanceof C10794c ? (C10794c) currentThread : null;
        if (cVar != null && C10457l.m35316a(C10791a.this, this)) {
            return cVar;
        }
        return null;
    }

    /* renamed from: s0 */
    private final C10803i m36660s0(C10794c cVar, C10803i iVar, boolean z) {
        if (cVar == null || cVar.f28305p == C10795d.TERMINATED) {
            return iVar;
        }
        if (iVar.f28334o.mo26788L() == 0 && cVar.f28305p == C10795d.BLOCKING) {
            return iVar;
        }
        cVar.f28309t = true;
        return cVar.f28304o.mo26795a(iVar, z);
    }

    /* renamed from: u0 */
    private final boolean m36661u0(long j) {
        if (C10247f.m34826b(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.f28295s) {
            int b = m36657b();
            if (b == 1 && this.f28295s > 1) {
                m36657b();
            }
            if (b > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v0 */
    static /* synthetic */ boolean m36662v0(C10791a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = aVar.controlState;
        }
        return aVar.m36661u0(j);
    }

    /* renamed from: w0 */
    private final boolean m36663w0() {
        C10794c I;
        do {
            I = m36655I();
            if (I == null) {
                return false;
            }
        } while (!C10794c.f28303f.compareAndSet(I, -1, 0));
        LockSupport.unpark(I);
        return true;
    }

    /* renamed from: L */
    public final boolean mo26766L(C10794c cVar) {
        long j;
        long j2;
        int f;
        if (cVar.mo26779g() != f28294r) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            int i = (int) (2097151 & j);
            j2 = (2097152 + j) & -2097152;
            f = cVar.mo26778f();
            if (C10819p0.m36781a()) {
                if (!(f != 0)) {
                    throw new AssertionError();
                }
            }
            cVar.mo26782o(this.f28301y.get(i));
        } while (!f28291o.compareAndSet(this, j, ((long) f) | j2));
        return true;
    }

    /* renamed from: W */
    public final void mo26767W(C10794c cVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? m36654E(cVar) : i2;
            }
            if (i3 >= 0) {
                if (f28291o.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    /* renamed from: X */
    public final void mo26768X(C10803i iVar) {
        try {
            iVar.run();
            if (C10702e.m36417a() != null) {
                throw null;
            }
        } catch (Throwable th) {
            if (C10702e.m36417a() == null) {
                throw th;
            }
            throw null;
        }
    }

    public void close() {
        mo26770e0(10000);
    }

    /* renamed from: e0 */
    public final void mo26770e0(long j) {
        int i;
        boolean z = false;
        if (f28293q.compareAndSet(this, 0, 1)) {
            C10794c o = m36659o();
            synchronized (this.f28301y) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    C10794c cVar = this.f28301y.get(i2);
                    C10457l.m35317b(cVar);
                    C10794c cVar2 = cVar;
                    if (cVar2 != o) {
                        while (cVar2.isAlive()) {
                            LockSupport.unpark(cVar2);
                            cVar2.join(j);
                        }
                        C10795d dVar = cVar2.f28305p;
                        if (C10819p0.m36781a()) {
                            if (!(dVar == C10795d.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        cVar2.f28304o.mo26798g(this.f28300x);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.f28300x.mo26736b();
            this.f28299w.mo26736b();
            while (true) {
                C10803i e = o == null ? null : o.mo26777e(true);
                if (e == null && (e = (C10803i) this.f28299w.mo26738d()) == null && (e = (C10803i) this.f28300x.mo26738d()) == null) {
                    break;
                }
                mo26768X(e);
            }
            if (o != null) {
                o.mo26783r(C10795d.TERMINATED);
            }
            if (C10819p0.m36781a()) {
                if (((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.f28295s) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    public void execute(Runnable runnable) {
        m36653A(this, runnable, (C10804j) null, false, 6, (Object) null);
    }

    /* renamed from: h */
    public final C10803i mo26772h(Runnable runnable, C10804j jVar) {
        long a = C10806l.f28341f.mo26792a();
        if (!(runnable instanceof C10803i)) {
            return new C10805k(runnable, a, jVar);
        }
        C10803i iVar = (C10803i) runnable;
        iVar.f28333f = a;
        iVar.f28334o = jVar;
        return iVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: n0 */
    public final void mo26774n0() {
        if (!m36663w0() && !m36662v0(this, 0, 1, (Object) null)) {
            m36663w0();
        }
    }

    /* renamed from: r */
    public final void mo26775r(Runnable runnable, C10804j jVar, boolean z) {
        if (C10702e.m36417a() == null) {
            C10803i h = mo26772h(runnable, jVar);
            C10794c o = m36659o();
            C10803i s0 = m36660s0(o, h, z);
            if (s0 == null || m36656a(s0)) {
                boolean z2 = z && o != null;
                if (h.f28334o.mo26788L() != 0) {
                    m36658i0(z2);
                } else if (!z2) {
                    mo26774n0();
                }
            } else {
                throw new RejectedExecutionException(C10457l.m35326k(this.f28298v, " was terminated"));
            }
        } else {
            throw null;
        }
    }

    public String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int length = this.f28301y.length();
        int i5 = 0;
        if (1 < length) {
            i3 = 0;
            int i6 = 0;
            i2 = 0;
            i = 0;
            int i7 = 1;
            while (true) {
                int i8 = i7 + 1;
                C10794c cVar = this.f28301y.get(i7);
                if (cVar != null) {
                    int f = cVar.f28304o.mo26797f();
                    int i9 = C10793b.f28302a[cVar.f28305p.ordinal()];
                    if (i9 != 1) {
                        if (i9 == 2) {
                            i3++;
                            sb = new StringBuilder();
                            sb.append(f);
                            c = 'b';
                        } else if (i9 == 3) {
                            i6++;
                            sb = new StringBuilder();
                            sb.append(f);
                            c = 'c';
                        } else if (i9 == 4) {
                            i2++;
                            if (f > 0) {
                                sb = new StringBuilder();
                                sb.append(f);
                                c = 'd';
                            }
                        } else if (i9 == 5) {
                            i++;
                        }
                        sb.append(c);
                        arrayList.add(sb.toString());
                    } else {
                        i5++;
                    }
                }
                if (i8 >= length) {
                    break;
                }
                i7 = i8;
            }
            i4 = i5;
            i5 = i6;
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        long j = this.controlState;
        return this.f28298v + '@' + C10822q0.m36787b(this) + "[Pool Size {core = " + this.f28295s + ", max = " + this.f28296t + "}, Worker States {CPU = " + i5 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i2 + ", terminated = " + i + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f28299w.mo26737c() + ", global blocking queue size = " + this.f28300x.mo26737c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f28295s - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }
}
