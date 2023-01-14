package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.C10730a0;
import kotlinx.coroutines.internal.C10732b0;
import kotlinx.coroutines.internal.C10753n;
import p455g.p462v.C10381g;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.b1 */
public abstract class C10690b1 extends C10696c1 {

    /* renamed from: r */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28178r;

    /* renamed from: s */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28179s;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    /* renamed from: kotlinx.coroutines.b1$a */
    public static abstract class C10691a implements Runnable, Comparable<C10691a>, C10849y0, C10732b0 {

        /* renamed from: f */
        public long f28180f;

        /* renamed from: o */
        private Object f28181o;

        /* renamed from: p */
        private int f28182p;

        /* renamed from: A */
        public int mo26635A() {
            return this.f28182p;
        }

        /* renamed from: B */
        public int compareTo(C10691a aVar) {
            int i = ((this.f28180f - aVar.f28180f) > 0 ? 1 : ((this.f28180f - aVar.f28180f) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0046, code lost:
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
            return r8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0040  */
        /* renamed from: D */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized int mo26637D(long r8, kotlinx.coroutines.C10690b1.C10692b r10, kotlinx.coroutines.C10690b1 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7.f28181o     // Catch:{ all -> 0x004b }
                kotlinx.coroutines.internal.v r1 = kotlinx.coroutines.C10704e1.f28187a     // Catch:{ all -> 0x004b }
                if (r0 != r1) goto L_0x000c
                r8 = 2
            L_0x000a:
                monitor-exit(r7)
                return r8
            L_0x000c:
                monitor-enter(r10)     // Catch:{ all -> 0x004b }
                kotlinx.coroutines.internal.b0 r0 = r10.mo26691b()     // Catch:{ all -> 0x0048 }
                kotlinx.coroutines.b1$a r0 = (kotlinx.coroutines.C10690b1.C10691a) r0     // Catch:{ all -> 0x0048 }
                boolean r11 = r11.m36374N0()     // Catch:{ all -> 0x0048 }
                if (r11 == 0) goto L_0x001d
                r8 = 1
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                monitor-exit(r7)
                return r8
            L_0x001d:
                r1 = 0
                if (r0 != 0) goto L_0x0024
            L_0x0021:
                r10.f28183b = r8     // Catch:{ all -> 0x0048 }
                goto L_0x0037
            L_0x0024:
                long r3 = r0.f28180f     // Catch:{ all -> 0x0048 }
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r8 = r3
            L_0x002e:
                long r3 = r10.f28183b     // Catch:{ all -> 0x0048 }
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L_0x0037
                goto L_0x0021
            L_0x0037:
                long r8 = r7.f28180f     // Catch:{ all -> 0x0048 }
                long r3 = r10.f28183b     // Catch:{ all -> 0x0048 }
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L_0x0042
                r7.f28180f = r3     // Catch:{ all -> 0x0048 }
            L_0x0042:
                r10.mo26690a(r7)     // Catch:{ all -> 0x0048 }
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                r8 = 0
                goto L_0x000a
            L_0x0048:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                throw r8     // Catch:{ all -> 0x004b }
            L_0x004b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10690b1.C10691a.mo26637D(long, kotlinx.coroutines.b1$b, kotlinx.coroutines.b1):int");
        }

        /* renamed from: F */
        public final boolean mo26638F(long j) {
            return j - this.f28180f >= 0;
        }

        /* renamed from: e */
        public final synchronized void mo26616e() {
            Object obj = this.f28181o;
            if (obj != C10704e1.f28187a) {
                C10692b bVar = obj instanceof C10692b ? (C10692b) obj : null;
                if (bVar != null) {
                    bVar.mo26695g(this);
                }
                this.f28181o = C10704e1.f28187a;
            }
        }

        /* renamed from: g */
        public void mo26640g(C10730a0<?> a0Var) {
            if (this.f28181o != C10704e1.f28187a) {
                this.f28181o = a0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public String toString() {
            return "Delayed[nanos=" + this.f28180f + ']';
        }

        /* renamed from: v */
        public C10730a0<?> mo26642v() {
            Object obj = this.f28181o;
            if (obj instanceof C10730a0) {
                return (C10730a0) obj;
            }
            return null;
        }

        /* renamed from: z */
        public void mo26643z(int i) {
            this.f28182p = i;
        }
    }

    /* renamed from: kotlinx.coroutines.b1$b */
    public static final class C10692b extends C10730a0<C10691a> {

        /* renamed from: b */
        public long f28183b;

        public C10692b(long j) {
            this.f28183b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C10690b1> cls2 = C10690b1.class;
        f28178r = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f28179s = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* renamed from: J0 */
    private final void m36371J0() {
        if (!C10819p0.m36781a() || m36374N0()) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (f28178r.compareAndSet(this, (Object) null, C10704e1.f28188b)) {
                        return;
                    }
                } else if (obj instanceof C10753n) {
                    ((C10753n) obj).mo26740d();
                    return;
                } else if (obj != C10704e1.f28188b) {
                    C10753n nVar = new C10753n(8, true);
                    nVar.mo26739a((Runnable) obj);
                    if (f28178r.compareAndSet(this, obj, nVar)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: K0 */
    private final Runnable m36372K0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C10753n) {
                C10753n nVar = (C10753n) obj;
                Object j = nVar.mo26744j();
                if (j != C10753n.f28253d) {
                    return (Runnable) j;
                }
                f28178r.compareAndSet(this, obj, nVar.mo26743i());
            } else if (obj == C10704e1.f28188b) {
                return null;
            } else {
                if (f28178r.compareAndSet(this, obj, (Object) null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: M0 */
    private final boolean m36373M0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (m36374N0()) {
                return false;
            }
            if (obj == null) {
                if (f28178r.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C10753n) {
                C10753n nVar = (C10753n) obj;
                int a = nVar.mo26739a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    f28178r.compareAndSet(this, obj, nVar.mo26743i());
                } else if (a == 2) {
                    return false;
                }
            } else if (obj == C10704e1.f28188b) {
                return false;
            } else {
                C10753n nVar2 = new C10753n(8, true);
                nVar2.mo26739a((Runnable) obj);
                nVar2.mo26739a(runnable);
                if (f28178r.compareAndSet(this, obj, nVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* access modifiers changed from: private */
    /* renamed from: N0 */
    public final boolean m36374N0() {
        return this._isCompleted;
    }

    /* renamed from: Q0 */
    private final void m36375Q0() {
        if (C10702e.m36417a() == null) {
            long nanoTime = System.nanoTime();
            while (true) {
                C10692b bVar = (C10692b) this._delayed;
                C10691a aVar = bVar == null ? null : (C10691a) bVar.mo26697i();
                if (aVar != null) {
                    mo26655G0(nanoTime, aVar);
                } else {
                    return;
                }
            }
        } else {
            throw null;
        }
    }

    /* renamed from: T0 */
    private final int m36376T0(long j, C10691a aVar) {
        if (m36374N0()) {
            return 1;
        }
        C10692b bVar = (C10692b) this._delayed;
        if (bVar == null) {
            f28179s.compareAndSet(this, (Object) null, new C10692b(j));
            Object obj = this._delayed;
            C10457l.m35317b(obj);
            bVar = (C10692b) obj;
        }
        return aVar.mo26637D(j, bVar, this);
    }

    /* renamed from: U0 */
    private final void m36377U0(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: V0 */
    private final boolean m36378V0(C10691a aVar) {
        C10692b bVar = (C10692b) this._delayed;
        return (bVar == null ? null : (C10691a) bVar.mo26694e()) == aVar;
    }

    /* renamed from: L0 */
    public final void mo26630L0(Runnable runnable) {
        if (m36373M0(runnable)) {
            mo26656H0();
        } else {
            C10825r0.f28369t.mo26630L0(runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public boolean mo26631O0() {
        if (!mo26610D0()) {
            return false;
        }
        C10692b bVar = (C10692b) this._delayed;
        if (bVar != null && !bVar.mo26693d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            return obj instanceof C10753n ? ((C10753n) obj).mo26742g() : obj == C10704e1.f28188b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0055  */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo26632P0() {
        /*
            r9 = this;
            boolean r0 = r9.mo26611E0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            kotlinx.coroutines.b1$b r0 = (kotlinx.coroutines.C10690b1.C10692b) r0
            if (r0 == 0) goto L_0x004b
            boolean r3 = r0.mo26693d()
            if (r3 != 0) goto L_0x004b
            kotlinx.coroutines.d r3 = kotlinx.coroutines.C10702e.m36417a()
            r4 = 0
            if (r3 != 0) goto L_0x004a
            long r5 = java.lang.System.nanoTime()
        L_0x0020:
            monitor-enter(r0)
            kotlinx.coroutines.internal.b0 r3 = r0.mo26691b()     // Catch:{ all -> 0x0047 }
            if (r3 != 0) goto L_0x002a
            monitor-exit(r0)
            r3 = r4
            goto L_0x0042
        L_0x002a:
            kotlinx.coroutines.b1$a r3 = (kotlinx.coroutines.C10690b1.C10691a) r3     // Catch:{ all -> 0x0047 }
            boolean r7 = r3.mo26638F(r5)     // Catch:{ all -> 0x0047 }
            r8 = 0
            if (r7 == 0) goto L_0x0038
            boolean r3 = r9.m36373M0(r3)     // Catch:{ all -> 0x0047 }
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            if (r3 == 0) goto L_0x0040
            kotlinx.coroutines.internal.b0 r3 = r0.mo26696h(r8)     // Catch:{ all -> 0x0047 }
            goto L_0x0041
        L_0x0040:
            r3 = r4
        L_0x0041:
            monitor-exit(r0)
        L_0x0042:
            kotlinx.coroutines.b1$a r3 = (kotlinx.coroutines.C10690b1.C10691a) r3
            if (r3 != 0) goto L_0x0020
            goto L_0x004b
        L_0x0047:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004a:
            throw r4
        L_0x004b:
            java.lang.Runnable r0 = r9.m36372K0()
            if (r0 == 0) goto L_0x0055
            r0.run()
            return r1
        L_0x0055:
            long r0 = r9.mo26615z0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10690b1.mo26632P0():long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public final void mo26633R0() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: S0 */
    public final void mo26634S0(long j, C10691a aVar) {
        int T0 = m36376T0(j, aVar);
        if (T0 != 0) {
            if (T0 == 1) {
                mo26655G0(j, aVar);
            } else if (T0 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m36378V0(aVar)) {
            mo26656H0();
        }
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
        C10711f2.f28192a.mo26665b();
        m36377U0(true);
        m36371J0();
        do {
        } while (mo26632P0() <= 0);
        m36375Q0();
    }

    /* renamed from: u0 */
    public final void mo26625u0(C10381g gVar, Runnable runnable) {
        mo26630L0(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public long mo26615z0() {
        if (super.mo26615z0() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof C10753n)) {
                return obj == C10704e1.f28188b ? Long.MAX_VALUE : 0;
            }
            if (!((C10753n) obj).mo26742g()) {
                return 0;
            }
        }
        C10692b bVar = (C10692b) this._delayed;
        C10691a aVar = bVar == null ? null : (C10691a) bVar.mo26694e();
        if (aVar == null) {
            return Long.MAX_VALUE;
        }
        long j = aVar.f28180f;
        if (C10702e.m36417a() == null) {
            return C10247f.m34827c(j - System.nanoTime(), 0);
        }
        throw null;
    }
}
