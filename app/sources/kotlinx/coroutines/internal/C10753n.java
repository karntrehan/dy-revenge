package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C10819p0;
import p455g.p470y.p472d.C10452g;

/* renamed from: kotlinx.coroutines.internal.n */
public final class C10753n<E> {

    /* renamed from: a */
    public static final C10754a f28250a = new C10754a((C10452g) null);

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28251b;

    /* renamed from: c */
    private static final /* synthetic */ AtomicLongFieldUpdater f28252c;

    /* renamed from: d */
    public static final C10763v f28253d = new C10763v("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: e */
    private final int f28254e;

    /* renamed from: f */
    private final boolean f28255f;

    /* renamed from: g */
    private final int f28256g;

    /* renamed from: h */
    private /* synthetic */ AtomicReferenceArray f28257h;

    /* renamed from: kotlinx.coroutines.internal.n$a */
    public static final class C10754a {
        private C10754a() {
        }

        public /* synthetic */ C10754a(C10452g gVar) {
            this();
        }

        /* renamed from: a */
        public final int mo26745a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long mo26746b(long j, int i) {
            return mo26748d(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: c */
        public final long mo26747c(long j, int i) {
            return mo26748d(j, 1152921503533105152L) | (((long) i) << 30);
        }

        /* renamed from: d */
        public final long mo26748d(long j, long j2) {
            return j & (~j2);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.n$b */
    public static final class C10755b {

        /* renamed from: a */
        public final int f28258a;

        public C10755b(int i) {
            this.f28258a = i;
        }
    }

    static {
        Class<C10753n> cls = C10753n.class;
        f28251b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f28252c = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C10753n(int i, boolean z) {
        this.f28254e = i;
        this.f28255f = z;
        int i2 = i - 1;
        this.f28256g = i2;
        this.f28257h = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    private final C10753n<E> m36551b(long j) {
        C10753n<E> nVar = new C10753n<>(this.f28254e * 2, this.f28255f);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f28256g;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f28257h.get(i3 & i);
                if (obj == null) {
                    obj = new C10755b(i);
                }
                nVar.f28257h.set(nVar.f28256g & i, obj);
                i++;
            } else {
                nVar._state = f28250a.mo26748d(j, 1152921504606846976L);
                return nVar;
            }
        }
    }

    /* renamed from: c */
    private final C10753n<E> m36552c(long j) {
        while (true) {
            C10753n<E> nVar = (C10753n) this._next;
            if (nVar != null) {
                return nVar;
            }
            f28251b.compareAndSet(this, (Object) null, m36551b(j));
        }
    }

    /* renamed from: e */
    private final C10753n<E> m36553e(int i, E e) {
        Object obj = this.f28257h.get(this.f28256g & i);
        if (!(obj instanceof C10755b) || ((C10755b) obj).f28258a != i) {
            return null;
        }
        this.f28257h.set(i & this.f28256g, e);
        return this;
    }

    /* renamed from: h */
    private final long m36554h() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f28252c.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: k */
    private final C10753n<E> m36555k(int i, int i2) {
        long j;
        C10754a aVar;
        int i3;
        do {
            j = this._state;
            aVar = f28250a;
            boolean z = false;
            i3 = (int) ((1073741823 & j) >> 0);
            if (C10819p0.m36781a()) {
                if (i3 == i) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return mo26743i();
            }
        } while (!f28252c.compareAndSet(this, j, aVar.mo26746b(j, i2)));
        this.f28257h.set(this.f28256g & i3, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069 A[LOOP:1: B:19:0x0069->B:22:0x007b, LOOP_START, PHI: r0 
      PHI: (r0v7 kotlinx.coroutines.internal.n) = (r0v6 kotlinx.coroutines.internal.n), (r0v9 kotlinx.coroutines.internal.n) binds: [B:18:0x0061, B:22:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo26739a(E r14) {
        /*
            r13 = this;
        L_0x0000:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0012
            kotlinx.coroutines.internal.n$a r14 = f28250a
            int r14 = r14.mo26745a(r2)
            return r14
        L_0x0012:
            kotlinx.coroutines.internal.n$a r0 = f28250a
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.f28256g
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L_0x0030
            return r11
        L_0x0030:
            boolean r4 = r13.f28255f
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.f28257h
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L_0x004f
            int r0 = r13.f28254e
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L_0x004e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L_0x0000
        L_0x004e:
            return r11
        L_0x004f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f28252c
            long r11 = r0.mo26747c(r2, r1)
            r0 = r4
            r1 = r13
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f28257h
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L_0x0069:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0073
            goto L_0x007d
        L_0x0073:
            kotlinx.coroutines.internal.n r0 = r0.mo26743i()
            kotlinx.coroutines.internal.n r0 = r0.m36553e(r9, r14)
            if (r0 != 0) goto L_0x0069
        L_0x007d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C10753n.mo26739a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean mo26740d() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f28252c.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int mo26741f() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    /* renamed from: g */
    public final boolean mo26742g() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: i */
    public final C10753n<E> mo26743i() {
        return m36552c(m36554h());
    }

    /* renamed from: j */
    public final Object mo26744j() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return f28253d;
            }
            C10754a aVar = f28250a;
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f28256g;
            if ((i2 & i3) == (i & i3)) {
                return null;
            }
            Object obj = this.f28257h.get(i3 & i);
            if (obj == null) {
                if (this.f28255f) {
                    return null;
                }
            } else if (obj instanceof C10755b) {
                return null;
            } else {
                int i4 = (i + 1) & 1073741823;
                if (f28252c.compareAndSet(this, j, aVar.mo26746b(j, i4))) {
                    this.f28257h.set(this.f28256g & i, (Object) null);
                    return obj;
                } else if (this.f28255f) {
                    C10753n nVar = this;
                    do {
                        nVar = nVar.m36555k(i, i4);
                    } while (nVar != null);
                    return obj;
                }
            }
        }
    }
}
