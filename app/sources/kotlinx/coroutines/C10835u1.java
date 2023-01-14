package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C10812n1;
import kotlinx.coroutines.internal.C10749k;
import kotlinx.coroutines.internal.C10750l;
import kotlinx.coroutines.internal.C10759r;
import kotlinx.coroutines.internal.C10762u;
import p455g.C10323s;
import p455g.p462v.C10381g;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.u1 */
public class C10835u1 implements C10812n1, C10833u, C10697c2 {

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28374f = AtomicReferenceFieldUpdater.newUpdater(C10835u1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* renamed from: kotlinx.coroutines.u1$a */
    private static final class C10836a extends C10832t1 {

        /* renamed from: r */
        private final C10835u1 f28375r;

        /* renamed from: s */
        private final C10837b f28376s;

        /* renamed from: t */
        private final C10830t f28377t;

        /* renamed from: u */
        private final Object f28378u;

        public C10836a(C10835u1 u1Var, C10837b bVar, C10830t tVar, Object obj) {
            this.f28375r = u1Var;
            this.f28376s = bVar;
            this.f28377t = tVar;
            this.f28378u = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo26607t((Throwable) obj);
            return C10323s.f27547a;
        }

        /* renamed from: t */
        public void mo26607t(Throwable th) {
            this.f28375r.m36824B(this.f28376s, this.f28377t, this.f28378u);
        }
    }

    /* renamed from: kotlinx.coroutines.u1$b */
    private static final class C10837b implements C10727i1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: f */
        private final C10853z1 f28379f;

        public C10837b(C10853z1 z1Var, boolean z, Throwable th) {
            this.f28379f = z1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: d */
        private final ArrayList<Throwable> m36886d() {
            return new ArrayList<>(4);
        }

        /* renamed from: e */
        private final Object m36887e() {
            return this._exceptionsHolder;
        }

        /* renamed from: l */
        private final void m36888l(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: a */
        public final void mo26857a(Throwable th) {
            Throwable f = mo26858f();
            if (f == null) {
                mo26864m(th);
            } else if (th != f) {
                Object e = m36887e();
                if (e == null) {
                    m36888l(th);
                } else if (e instanceof Throwable) {
                    if (th != e) {
                        ArrayList<Throwable> d = m36886d();
                        d.add(e);
                        d.add(th);
                        C10323s sVar = C10323s.f27547a;
                        m36888l(d);
                    }
                } else if (e instanceof ArrayList) {
                    ((ArrayList) e).add(th);
                } else {
                    throw new IllegalStateException(C10457l.m35326k("State is ", e).toString());
                }
            }
        }

        /* renamed from: b */
        public boolean mo26676b() {
            return mo26858f() == null;
        }

        /* renamed from: c */
        public C10853z1 mo26677c() {
            return this.f28379f;
        }

        /* renamed from: f */
        public final Throwable mo26858f() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: g */
        public final boolean mo26859g() {
            return mo26858f() != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: h */
        public final boolean mo26860h() {
            return this._isCompleting;
        }

        /* renamed from: i */
        public final boolean mo26861i() {
            return m36887e() == C10841v1.f28391e;
        }

        /* renamed from: j */
        public final List<Throwable> mo26862j(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object e = m36887e();
            if (e == null) {
                arrayList = m36886d();
            } else if (e instanceof Throwable) {
                ArrayList<Throwable> d = m36886d();
                d.add(e);
                arrayList = d;
            } else if (e instanceof ArrayList) {
                arrayList = (ArrayList) e;
            } else {
                throw new IllegalStateException(C10457l.m35326k("State is ", e).toString());
            }
            Throwable f = mo26858f();
            if (f != null) {
                arrayList.add(0, f);
            }
            if (th != null && !C10457l.m35316a(th, f)) {
                arrayList.add(th);
            }
            m36888l(C10841v1.f28391e);
            return arrayList;
        }

        /* renamed from: k */
        public final void mo26863k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: m */
        public final void mo26864m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + mo26859g() + ", completing=" + mo26860h() + ", rootCause=" + mo26858f() + ", exceptions=" + m36887e() + ", list=" + mo26677c() + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.u1$c */
    public static final class C10838c extends C10750l.C10751a {

        /* renamed from: d */
        final /* synthetic */ C10750l f28380d;

        /* renamed from: e */
        final /* synthetic */ C10835u1 f28381e;

        /* renamed from: f */
        final /* synthetic */ Object f28382f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10838c(C10750l lVar, C10835u1 u1Var, Object obj) {
            super(lVar);
            this.f28380d = lVar;
            this.f28381e = u1Var;
            this.f28382f = obj;
        }

        /* renamed from: i */
        public Object mo26703g(C10750l lVar) {
            if (this.f28381e.mo26843O() == this.f28382f) {
                return null;
            }
            return C10749k.m36530a();
        }
    }

    public C10835u1(boolean z) {
        this._state = z ? C10841v1.f28393g : C10841v1.f28392f;
        this._parentHandle = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m36824B(C10837b bVar, C10830t tVar, Object obj) {
        if (C10819p0.m36781a()) {
            if (!(mo26843O() == bVar)) {
                throw new AssertionError();
            }
        }
        C10830t Z = m36833Z(tVar);
        if (Z == null || !m36851w0(bVar, Z, obj)) {
            mo26754s(m36826D(bVar, obj));
        }
    }

    /* renamed from: C */
    private final Throwable m36825C(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C10817o1(mo26650x(), (Throwable) null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((C10697c2) obj).mo26657e0();
    }

    /* renamed from: D */
    private final Object m36826D(C10837b bVar, Object obj) {
        boolean g;
        Throwable J;
        boolean z = true;
        if (C10819p0.m36781a()) {
            if (!(mo26843O() == bVar)) {
                throw new AssertionError();
            }
        }
        if (C10819p0.m36781a() && !(!bVar.mo26861i())) {
            throw new AssertionError();
        } else if (!C10819p0.m36781a() || bVar.mo26860h()) {
            C10848y yVar = obj instanceof C10848y ? (C10848y) obj : null;
            Throwable th = yVar == null ? null : yVar.f28406b;
            synchronized (bVar) {
                g = bVar.mo26859g();
                List<Throwable> j = bVar.mo26862j(th);
                J = m36829J(bVar, j);
                if (J != null) {
                    m36844q(J, j);
                }
            }
            if (!(J == null || J == th)) {
                obj = new C10848y(J, false, 2, (C10452g) null);
            }
            if (J != null) {
                if (!m36850w(J) && !mo26659P(J)) {
                    z = false;
                }
                if (z) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    ((C10848y) obj).mo26878b();
                }
            }
            if (!g) {
                mo26846c0(J);
            }
            mo26648d0(obj);
            boolean compareAndSet = f28374f.compareAndSet(this, bVar, C10841v1.m36923g(obj));
            if (!C10819p0.m36781a() || compareAndSet) {
                m36852z(bVar, obj);
                return obj;
            }
            throw new AssertionError();
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: F */
    private final C10830t m36827F(C10727i1 i1Var) {
        C10830t tVar = i1Var instanceof C10830t ? (C10830t) i1Var : null;
        if (tVar != null) {
            return tVar;
        }
        C10853z1 c = i1Var.mo26677c();
        if (c == null) {
            return null;
        }
        return m36833Z(c);
    }

    /* renamed from: H */
    private final Throwable m36828H(Object obj) {
        C10848y yVar = obj instanceof C10848y ? (C10848y) obj : null;
        if (yVar == null) {
            return null;
        }
        return yVar.f28406b;
    }

    /* renamed from: J */
    private final Throwable m36829J(C10837b bVar, List<? extends Throwable> list) {
        T t = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (!(((Throwable) next) instanceof CancellationException)) {
                    t = next;
                    break;
                }
            }
            Throwable th = (Throwable) t;
            return th != null ? th : (Throwable) list.get(0);
        } else if (bVar.mo26859g()) {
            return new C10817o1(mo26650x(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    /* renamed from: M */
    private final C10853z1 m36830M(C10727i1 i1Var) {
        C10853z1 c = i1Var.mo26677c();
        if (c != null) {
            return c;
        }
        if (i1Var instanceof C10852z0) {
            return new C10853z1();
        }
        if (i1Var instanceof C10832t1) {
            m36837h0((C10832t1) i1Var);
            return null;
        }
        throw new IllegalStateException(C10457l.m35326k("State should have list: ", i1Var).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        m36834a0(((kotlinx.coroutines.C10835u1.C10837b) r2).mo26677c(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        return kotlinx.coroutines.C10841v1.m36917a();
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m36831T(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.mo26843O()
            boolean r3 = r2 instanceof kotlinx.coroutines.C10835u1.C10837b
            if (r3 == 0) goto L_0x0052
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.u1$b r3 = (kotlinx.coroutines.C10835u1.C10837b) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo26861i()     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x001a
            kotlinx.coroutines.internal.v r7 = kotlinx.coroutines.C10841v1.f28390d     // Catch:{ all -> 0x004f }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            kotlinx.coroutines.u1$b r3 = (kotlinx.coroutines.C10835u1.C10837b) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo26859g()     // Catch:{ all -> 0x004f }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.m36825C(r7)     // Catch:{ all -> 0x004f }
        L_0x002b:
            r7 = r2
            kotlinx.coroutines.u1$b r7 = (kotlinx.coroutines.C10835u1.C10837b) r7     // Catch:{ all -> 0x004f }
            r7.mo26857a(r1)     // Catch:{ all -> 0x004f }
        L_0x0031:
            r7 = r2
            kotlinx.coroutines.u1$b r7 = (kotlinx.coroutines.C10835u1.C10837b) r7     // Catch:{ all -> 0x004f }
            java.lang.Throwable r7 = r7.mo26858f()     // Catch:{ all -> 0x004f }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0041
            goto L_0x004a
        L_0x0041:
            kotlinx.coroutines.u1$b r2 = (kotlinx.coroutines.C10835u1.C10837b) r2
            kotlinx.coroutines.z1 r7 = r2.mo26677c()
            r6.m36834a0(r7, r0)
        L_0x004a:
            kotlinx.coroutines.internal.v r7 = kotlinx.coroutines.C10841v1.f28387a
            return r7
        L_0x004f:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0052:
            boolean r3 = r2 instanceof kotlinx.coroutines.C10727i1
            if (r3 == 0) goto L_0x009a
            if (r1 != 0) goto L_0x005c
            java.lang.Throwable r1 = r6.m36825C(r7)
        L_0x005c:
            r3 = r2
            kotlinx.coroutines.i1 r3 = (kotlinx.coroutines.C10727i1) r3
            boolean r4 = r3.mo26676b()
            if (r4 == 0) goto L_0x0070
            boolean r2 = r6.m36846t0(r3, r1)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.internal.v r7 = kotlinx.coroutines.C10841v1.f28387a
            return r7
        L_0x0070:
            kotlinx.coroutines.y r3 = new kotlinx.coroutines.y
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.m36847u0(r2, r3)
            kotlinx.coroutines.internal.v r4 = kotlinx.coroutines.C10841v1.f28387a
            if (r3 == r4) goto L_0x008a
            kotlinx.coroutines.internal.v r2 = kotlinx.coroutines.C10841v1.f28389c
            if (r3 != r2) goto L_0x0089
            goto L_0x0002
        L_0x0089:
            return r3
        L_0x008a:
            java.lang.String r7 = "Cannot happen in "
            java.lang.String r7 = p455g.p470y.p472d.C10457l.m35326k(r7, r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x009a:
            kotlinx.coroutines.internal.v r7 = kotlinx.coroutines.C10841v1.f28390d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10835u1.m36831T(java.lang.Object):java.lang.Object");
    }

    /* renamed from: V */
    private final C10832t1 m36832V(C10430l<? super Throwable, C10323s> lVar, boolean z) {
        C10832t1 t1Var = null;
        if (z) {
            if (lVar instanceof C10820p1) {
                t1Var = (C10820p1) lVar;
            }
            if (t1Var == null) {
                t1Var = new C10785l1(lVar);
            }
        } else {
            C10832t1 t1Var2 = lVar instanceof C10832t1 ? (C10832t1) lVar : null;
            if (t1Var2 != null) {
                if (!C10819p0.m36781a() || (!(t1Var2 instanceof C10820p1))) {
                    t1Var = t1Var2;
                } else {
                    throw new AssertionError();
                }
            }
            if (t1Var == null) {
                t1Var = new C10790m1(lVar);
            }
        }
        t1Var.mo26838v(this);
        return t1Var;
    }

    /* renamed from: Z */
    private final C10830t m36833Z(C10750l lVar) {
        while (lVar.mo26725o()) {
            lVar = lVar.mo26729n();
        }
        while (true) {
            lVar = lVar.mo26728m();
            if (!lVar.mo26725o()) {
                if (lVar instanceof C10830t) {
                    return (C10830t) lVar;
                }
                if (lVar instanceof C10853z1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: a0 */
    private final void m36834a0(C10853z1 z1Var, Throwable th) {
        C10689b0 b0Var;
        mo26846c0(th);
        C10689b0 b0Var2 = null;
        for (C10750l lVar = (C10750l) z1Var.mo26727l(); !C10457l.m35316a(lVar, z1Var); lVar = lVar.mo26728m()) {
            if (lVar instanceof C10820p1) {
                C10832t1 t1Var = (C10832t1) lVar;
                try {
                    t1Var.mo26607t(th);
                } catch (Throwable th2) {
                    if (b0Var2 == null) {
                        b0Var = null;
                    } else {
                        C10248b.m34834a(b0Var2, th2);
                        b0Var = b0Var2;
                    }
                    if (b0Var == null) {
                        b0Var2 = new C10689b0("Exception in completion handler " + t1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (b0Var2 != null) {
            mo26645Q(b0Var2);
        }
        m36850w(th);
    }

    /* renamed from: b0 */
    private final void m36835b0(C10853z1 z1Var, Throwable th) {
        C10689b0 b0Var;
        C10689b0 b0Var2 = null;
        for (C10750l lVar = (C10750l) z1Var.mo26727l(); !C10457l.m35316a(lVar, z1Var); lVar = lVar.mo26728m()) {
            if (lVar instanceof C10832t1) {
                C10832t1 t1Var = (C10832t1) lVar;
                try {
                    t1Var.mo26607t(th);
                } catch (Throwable th2) {
                    if (b0Var2 == null) {
                        b0Var = null;
                    } else {
                        C10248b.m34834a(b0Var2, th2);
                        b0Var = b0Var2;
                    }
                    if (b0Var == null) {
                        b0Var2 = new C10689b0("Exception in completion handler " + t1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (b0Var2 != null) {
            mo26645Q(b0Var2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlinx.coroutines.h1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m36836g0(kotlinx.coroutines.C10852z0 r3) {
        /*
            r2 = this;
            kotlinx.coroutines.z1 r0 = new kotlinx.coroutines.z1
            r0.<init>()
            boolean r1 = r3.mo26676b()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            kotlinx.coroutines.h1 r1 = new kotlinx.coroutines.h1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f28374f
            r1.compareAndSet(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10835u1.m36836g0(kotlinx.coroutines.z0):void");
    }

    /* renamed from: h0 */
    private final void m36837h0(C10832t1 t1Var) {
        t1Var.mo26726d(new C10853z1());
        f28374f.compareAndSet(this, t1Var, t1Var.mo26728m());
    }

    /* renamed from: l0 */
    private final int m36839l0(Object obj) {
        if (obj instanceof C10852z0) {
            if (((C10852z0) obj).mo26676b()) {
                return 0;
            }
            if (!f28374f.compareAndSet(this, obj, C10841v1.f28393g)) {
                return -1;
            }
            mo26847f0();
            return 1;
        } else if (!(obj instanceof C10722h1)) {
            return 0;
        } else {
            if (!f28374f.compareAndSet(this, obj, ((C10722h1) obj).mo26677c())) {
                return -1;
            }
            mo26847f0();
            return 1;
        }
    }

    /* renamed from: m0 */
    private final String m36840m0(Object obj) {
        if (!(obj instanceof C10837b)) {
            return obj instanceof C10727i1 ? ((C10727i1) obj).mo26676b() ? "Active" : "New" : obj instanceof C10848y ? "Cancelled" : "Completed";
        }
        C10837b bVar = (C10837b) obj;
        return bVar.mo26859g() ? "Cancelling" : bVar.mo26860h() ? "Completing" : "Active";
    }

    /* renamed from: p */
    private final boolean m36842p(Object obj, C10853z1 z1Var, C10832t1 t1Var) {
        int s;
        C10838c cVar = new C10838c(t1Var, this, obj);
        do {
            s = z1Var.mo26729n().mo26732s(t1Var, z1Var, cVar);
            if (s == 1) {
                return true;
            }
        } while (s != 2);
        return false;
    }

    /* renamed from: p0 */
    public static /* synthetic */ CancellationException m36843p0(C10835u1 u1Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return u1Var.mo26851o0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: q */
    private final void m36844q(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Throwable l = !C10819p0.m36784d() ? th : C10762u.m36595l(th);
            for (Throwable th2 : list) {
                if (C10819p0.m36784d()) {
                    th2 = C10762u.m36595l(th2);
                }
                if (th2 != th && th2 != l && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C10248b.m34834a(th, th2);
                }
            }
        }
    }

    /* renamed from: r0 */
    private final boolean m36845r0(C10727i1 i1Var, Object obj) {
        if (C10819p0.m36781a()) {
            if (!((i1Var instanceof C10852z0) || (i1Var instanceof C10832t1))) {
                throw new AssertionError();
            }
        }
        if (C10819p0.m36781a() && !(!(obj instanceof C10848y))) {
            throw new AssertionError();
        } else if (!f28374f.compareAndSet(this, i1Var, C10841v1.m36923g(obj))) {
            return false;
        } else {
            mo26846c0((Throwable) null);
            mo26648d0(obj);
            m36852z(i1Var, obj);
            return true;
        }
    }

    /* renamed from: t0 */
    private final boolean m36846t0(C10727i1 i1Var, Throwable th) {
        if (C10819p0.m36781a() && !(!(i1Var instanceof C10837b))) {
            throw new AssertionError();
        } else if (!C10819p0.m36781a() || i1Var.mo26676b()) {
            C10853z1 M = m36830M(i1Var);
            if (M == null) {
                return false;
            }
            if (!f28374f.compareAndSet(this, i1Var, new C10837b(M, false, th))) {
                return false;
            }
            m36834a0(M, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: u0 */
    private final Object m36847u0(Object obj, Object obj2) {
        return !(obj instanceof C10727i1) ? C10841v1.f28387a : (((obj instanceof C10852z0) || (obj instanceof C10832t1)) && !(obj instanceof C10830t) && !(obj2 instanceof C10848y)) ? m36845r0((C10727i1) obj, obj2) ? obj2 : C10841v1.f28389c : m36849v0((C10727i1) obj, obj2);
    }

    /* renamed from: v */
    private final Object m36848v(Object obj) {
        Object u0;
        do {
            Object O = mo26843O();
            if (!(O instanceof C10727i1) || ((O instanceof C10837b) && ((C10837b) O).mo26860h())) {
                return C10841v1.f28387a;
            }
            u0 = m36847u0(O, new C10848y(m36825C(obj), false, 2, (C10452g) null));
        } while (u0 == C10841v1.f28389c);
        return u0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        if (r2 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0075, code lost:
        m36834a0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0078, code lost:
        r7 = m36827F(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007c, code lost:
        if (r7 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0082, code lost:
        if (m36851w0(r1, r7, r8) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0086, code lost:
        return kotlinx.coroutines.C10841v1.f28388b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008b, code lost:
        return m36826D(r1, r8);
     */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m36849v0(kotlinx.coroutines.C10727i1 r7, java.lang.Object r8) {
        /*
            r6 = this;
            kotlinx.coroutines.z1 r0 = r6.m36830M(r7)
            if (r0 != 0) goto L_0x000b
            kotlinx.coroutines.internal.v r7 = kotlinx.coroutines.C10841v1.f28389c
            return r7
        L_0x000b:
            boolean r1 = r7 instanceof kotlinx.coroutines.C10835u1.C10837b
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r7
            kotlinx.coroutines.u1$b r1 = (kotlinx.coroutines.C10835u1.C10837b) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            if (r1 != 0) goto L_0x001d
            kotlinx.coroutines.u1$b r1 = new kotlinx.coroutines.u1$b
            r3 = 0
            r1.<init>(r0, r3, r2)
        L_0x001d:
            monitor-enter(r1)
            boolean r3 = r1.mo26860h()     // Catch:{ all -> 0x008c }
            if (r3 == 0) goto L_0x002a
            kotlinx.coroutines.internal.v r7 = kotlinx.coroutines.C10841v1.f28387a     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            return r7
        L_0x002a:
            r3 = 1
            r1.mo26863k(r3)     // Catch:{ all -> 0x008c }
            if (r1 == r7) goto L_0x003e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f28374f     // Catch:{ all -> 0x008c }
            boolean r4 = r4.compareAndSet(r6, r7, r1)     // Catch:{ all -> 0x008c }
            if (r4 != 0) goto L_0x003e
            kotlinx.coroutines.internal.v r7 = kotlinx.coroutines.C10841v1.f28389c     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            return r7
        L_0x003e:
            boolean r4 = kotlinx.coroutines.C10819p0.m36781a()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0052
            boolean r4 = r1.mo26861i()     // Catch:{ all -> 0x008c }
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x008c }
            r7.<init>()     // Catch:{ all -> 0x008c }
            throw r7     // Catch:{ all -> 0x008c }
        L_0x0052:
            boolean r4 = r1.mo26859g()     // Catch:{ all -> 0x008c }
            boolean r5 = r8 instanceof kotlinx.coroutines.C10848y     // Catch:{ all -> 0x008c }
            if (r5 == 0) goto L_0x005e
            r5 = r8
            kotlinx.coroutines.y r5 = (kotlinx.coroutines.C10848y) r5     // Catch:{ all -> 0x008c }
            goto L_0x005f
        L_0x005e:
            r5 = r2
        L_0x005f:
            if (r5 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            java.lang.Throwable r5 = r5.f28406b     // Catch:{ all -> 0x008c }
            r1.mo26857a(r5)     // Catch:{ all -> 0x008c }
        L_0x0067:
            java.lang.Throwable r5 = r1.mo26858f()     // Catch:{ all -> 0x008c }
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x006f
            r2 = r5
        L_0x006f:
            g.s r3 = p455g.C10323s.f27547a     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            if (r2 != 0) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            r6.m36834a0(r0, r2)
        L_0x0078:
            kotlinx.coroutines.t r7 = r6.m36827F(r7)
            if (r7 == 0) goto L_0x0087
            boolean r7 = r6.m36851w0(r1, r7, r8)
            if (r7 == 0) goto L_0x0087
            kotlinx.coroutines.internal.v r7 = kotlinx.coroutines.C10841v1.f28388b
            return r7
        L_0x0087:
            java.lang.Object r7 = r6.m36826D(r1, r8)
            return r7
        L_0x008c:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10835u1.m36849v0(kotlinx.coroutines.i1, java.lang.Object):java.lang.Object");
    }

    /* renamed from: w */
    private final boolean m36850w(Throwable th) {
        if (mo26753S()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C10827s N = mo26842N();
        return (N == null || N == C10684a2.f28171f) ? z : N.mo26617h(th) || z;
    }

    /* renamed from: w0 */
    private final boolean m36851w0(C10837b bVar, C10830t tVar, Object obj) {
        while (C10812n1.C10813a.m36736c(tVar.f28371r, false, false, new C10836a(this, bVar, tVar, obj), 1, (Object) null) == C10684a2.f28171f) {
            tVar = m36833Z(tVar);
            if (tVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: z */
    private final void m36852z(C10727i1 i1Var, Object obj) {
        C10827s N = mo26842N();
        if (N != null) {
            N.mo26616e();
            mo26849k0(C10684a2.f28171f);
        }
        Throwable th = null;
        C10848y yVar = obj instanceof C10848y ? (C10848y) obj : null;
        if (yVar != null) {
            th = yVar.f28406b;
        }
        if (i1Var instanceof C10832t1) {
            try {
                ((C10832t1) i1Var).mo26607t(th);
            } catch (Throwable th2) {
                mo26645Q(new C10689b0("Exception in completion handler " + i1Var + " for " + this, th2));
            }
        } else {
            C10853z1 c = i1Var.mo26677c();
            if (c != null) {
                m36835b0(c, th);
            }
        }
    }

    /* renamed from: A */
    public final C10849y0 mo26809A(boolean z, boolean z2, C10430l<? super Throwable, C10323s> lVar) {
        C10832t1 V = m36832V(lVar, z);
        while (true) {
            Object O = mo26843O();
            if (O instanceof C10852z0) {
                C10852z0 z0Var = (C10852z0) O;
                if (!z0Var.mo26676b()) {
                    m36836g0(z0Var);
                } else if (f28374f.compareAndSet(this, O, V)) {
                    return V;
                }
            } else {
                Throwable th = null;
                if (O instanceof C10727i1) {
                    C10853z1 c = ((C10727i1) O).mo26677c();
                    if (c == null) {
                        Objects.requireNonNull(O, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        m36837h0((C10832t1) O);
                    } else {
                        C10849y0 y0Var = C10684a2.f28171f;
                        if (z && (O instanceof C10837b)) {
                            synchronized (O) {
                                th = ((C10837b) O).mo26858f();
                                if (th == null || ((lVar instanceof C10830t) && !((C10837b) O).mo26860h())) {
                                    if (m36842p(O, c, V)) {
                                        if (th == null) {
                                            return V;
                                        }
                                        y0Var = V;
                                    }
                                }
                                C10323s sVar = C10323s.f27547a;
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                lVar.invoke(th);
                            }
                            return y0Var;
                        } else if (m36842p(O, c, V)) {
                            return V;
                        }
                    }
                } else {
                    if (z2) {
                        C10848y yVar = O instanceof C10848y ? (C10848y) O : null;
                        if (yVar != null) {
                            th = yVar.f28406b;
                        }
                        lVar.invoke(th);
                    }
                    return C10684a2.f28171f;
                }
            }
        }
    }

    /* renamed from: E */
    public final CancellationException mo26810E() {
        Object O = mo26843O();
        if (O instanceof C10837b) {
            Throwable f = ((C10837b) O).mo26858f();
            if (f != null) {
                return mo26851o0(f, C10457l.m35326k(C10822q0.m36786a(this), " is cancelling"));
            }
            throw new IllegalStateException(C10457l.m35326k("Job is still new or active: ", this).toString());
        } else if (!(O instanceof C10727i1)) {
            return O instanceof C10848y ? m36843p0(this, ((C10848y) O).f28406b, (String) null, 1, (Object) null) : new C10817o1(C10457l.m35326k(C10822q0.m36786a(this), " has completed normally"), (Throwable) null, this);
        } else {
            throw new IllegalStateException(C10457l.m35326k("Job is still new or active: ", this).toString());
        }
    }

    /* renamed from: G */
    public final Object mo26841G() {
        Object O = mo26843O();
        if (!(!(O instanceof C10727i1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(O instanceof C10848y)) {
            return C10841v1.m36924h(O);
        } else {
            throw ((C10848y) O).f28406b;
        }
    }

    /* renamed from: I */
    public final void mo26839I(C10697c2 c2Var) {
        mo26853t(c2Var);
    }

    /* renamed from: K */
    public boolean mo26833K() {
        return true;
    }

    /* renamed from: L */
    public boolean mo26834L() {
        return false;
    }

    /* renamed from: N */
    public final C10827s mo26842N() {
        return (C10827s) this._parentHandle;
    }

    /* renamed from: O */
    public final Object mo26843O() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C10759r)) {
                return obj;
            }
            ((C10759r) obj).mo26699c(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public boolean mo26659P(Throwable th) {
        return false;
    }

    /* renamed from: Q */
    public void mo26645Q(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo26844R(C10812n1 n1Var) {
        if (C10819p0.m36781a()) {
            if (!(mo26842N() == null)) {
                throw new AssertionError();
            }
        }
        if (n1Var == null) {
            mo26849k0(C10684a2.f28171f);
            return;
        }
        n1Var.start();
        C10827s s0 = n1Var.mo26813s0(this);
        mo26849k0(s0);
        if (mo26850l()) {
            s0.mo26616e();
            mo26849k0(C10684a2.f28171f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public boolean mo26753S() {
        return false;
    }

    /* renamed from: U */
    public final Object mo26845U(Object obj) {
        Object u0;
        do {
            u0 = m36847u0(mo26843O(), obj);
            if (u0 == C10841v1.f28387a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m36828H(obj));
            }
        } while (u0 == C10841v1.f28389c);
        return u0;
    }

    /* renamed from: W */
    public final C10849y0 mo26811W(C10430l<? super Throwable, C10323s> lVar) {
        return mo26809A(false, true, lVar);
    }

    /* renamed from: Y */
    public String mo26646Y() {
        return C10822q0.m36786a(this);
    }

    /* renamed from: b */
    public boolean mo26647b() {
        Object O = mo26843O();
        return (O instanceof C10727i1) && ((C10727i1) O).mo26676b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo26846c0(Throwable th) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo26648d0(Object obj) {
    }

    /* renamed from: e0 */
    public CancellationException mo26657e0() {
        Throwable th;
        Object O = mo26843O();
        CancellationException cancellationException = null;
        if (O instanceof C10837b) {
            th = ((C10837b) O).mo26858f();
        } else if (O instanceof C10848y) {
            th = ((C10848y) O).f28406b;
        } else if (!(O instanceof C10727i1)) {
            th = null;
        } else {
            throw new IllegalStateException(C10457l.m35326k("Cannot be cancelling child in this state: ", O).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new C10817o1(C10457l.m35326k("Parent job is ", m36840m0(O)), th, this) : cancellationException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo26847f0() {
    }

    public <R> R fold(R r, C10434p<? super R, ? super C10381g.C10384b, ? extends R> pVar) {
        return C10812n1.C10813a.m36734a(this, r, pVar);
    }

    public <E extends C10381g.C10384b> E get(C10381g.C10386c<E> cVar) {
        return C10812n1.C10813a.m36735b(this, cVar);
    }

    public final C10381g.C10386c<?> getKey() {
        return C10812n1.f28353n;
    }

    /* renamed from: i0 */
    public void mo26812i0(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C10817o1(mo26650x(), (Throwable) null, this);
        }
        mo26855u(cancellationException);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26848j0(kotlinx.coroutines.C10832t1 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo26843O()
            boolean r1 = r0 instanceof kotlinx.coroutines.C10832t1
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f28374f
            kotlinx.coroutines.z0 r2 = kotlinx.coroutines.C10841v1.f28393g
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof kotlinx.coroutines.C10727i1
            if (r1 == 0) goto L_0x0027
            kotlinx.coroutines.i1 r0 = (kotlinx.coroutines.C10727i1) r0
            kotlinx.coroutines.z1 r0 = r0.mo26677c()
            if (r0 == 0) goto L_0x0027
            r4.mo26730p()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10835u1.mo26848j0(kotlinx.coroutines.t1):void");
    }

    /* renamed from: k0 */
    public final void mo26849k0(C10827s sVar) {
        this._parentHandle = sVar;
    }

    /* renamed from: l */
    public final boolean mo26850l() {
        return !(mo26843O() instanceof C10727i1);
    }

    public C10381g minusKey(C10381g.C10386c<?> cVar) {
        return C10812n1.C10813a.m36737d(this, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public final CancellationException mo26851o0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo26650x();
            }
            cancellationException = new C10817o1(str, th, this);
        }
        return cancellationException;
    }

    public C10381g plus(C10381g gVar) {
        return C10812n1.C10813a.m36738e(this, gVar);
    }

    /* renamed from: q0 */
    public final String mo26852q0() {
        return mo26646Y() + '{' + m36840m0(mo26843O()) + '}';
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo26754s(Object obj) {
    }

    /* renamed from: s0 */
    public final C10827s mo26813s0(C10833u uVar) {
        return (C10827s) C10812n1.C10813a.m36736c(this, true, false, new C10830t(uVar), 2, (Object) null);
    }

    public final boolean start() {
        int l0;
        do {
            l0 = m36839l0(mo26843O());
            if (l0 == 0) {
                return false;
            }
        } while (l0 != 1);
        return true;
    }

    /* renamed from: t */
    public final boolean mo26853t(Object obj) {
        Object a = C10841v1.f28387a;
        if (mo26834L() && (a = m36848v(obj)) == C10841v1.f28388b) {
            return true;
        }
        if (a == C10841v1.f28387a) {
            a = m36831T(obj);
        }
        if (a == C10841v1.f28387a || a == C10841v1.f28388b) {
            return true;
        }
        if (a == C10841v1.f28390d) {
            return false;
        }
        mo26754s(a);
        return true;
    }

    public String toString() {
        return mo26852q0() + '@' + C10822q0.m36787b(this);
    }

    /* renamed from: u */
    public void mo26855u(Throwable th) {
        mo26853t(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public String mo26650x() {
        return "Job was cancelled";
    }

    /* renamed from: y */
    public boolean mo26856y(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return mo26853t(th) && mo26833K();
    }
}
