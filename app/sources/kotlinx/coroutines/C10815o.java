package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C10812n1;
import kotlinx.coroutines.internal.C10736e;
import kotlinx.coroutines.internal.C10762u;
import kotlinx.coroutines.internal.C10763v;
import p455g.C10279d;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p462v.C10381g;
import p455g.p462v.p464k.p465a.C10400e;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.o */
public class C10815o<T> extends C10840v0<T> implements C10808n<T>, C10400e {

    /* renamed from: q */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28355q = AtomicIntegerFieldUpdater.newUpdater(C10815o.class, "_decision");

    /* renamed from: r */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28356r = AtomicReferenceFieldUpdater.newUpdater(C10815o.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: s */
    private final C10376d<T> f28357s;

    /* renamed from: t */
    private final C10381g f28358t;

    /* renamed from: u */
    private C10849y0 f28359u;

    public C10815o(C10376d<? super T> dVar, int i) {
        super(i);
        this.f28357s = dVar;
        if (C10819p0.m36781a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        this.f28358t = dVar.mo25781a();
        this._decision = 0;
        this._state = C10706f.f28189f;
    }

    /* renamed from: A */
    private final String m36739A() {
        Object z = mo26826z();
        return z instanceof C10693b2 ? "Active" : z instanceof C10821q ? "Cancelled" : "Completed";
    }

    /* renamed from: C */
    private final C10849y0 m36740C() {
        C10812n1 n1Var = (C10812n1) mo25781a().get(C10812n1.f28353n);
        if (n1Var == null) {
            return null;
        }
        C10849y0 c = C10812n1.C10813a.m36736c(n1Var, true, false, new C10824r(this), 2, (Object) null);
        this.f28359u = c;
        return c;
    }

    /* renamed from: D */
    private final boolean m36741D() {
        return C10843w0.m36927c(this.f28386p) && ((C10736e) this.f28357s).mo26711r();
    }

    /* renamed from: E */
    private final C10783l m36742E(C10430l<? super Throwable, C10323s> lVar) {
        return lVar instanceof C10783l ? (C10783l) lVar : new C10779k1(lVar);
    }

    /* renamed from: F */
    private final void m36743F(C10430l<? super Throwable, C10323s> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    /* renamed from: I */
    private final void m36744I() {
        C10376d<T> dVar = this.f28357s;
        Throwable th = null;
        C10736e eVar = dVar instanceof C10736e ? (C10736e) dVar : null;
        if (eVar != null) {
            th = eVar.mo26715u(this);
        }
        if (th != null) {
            mo26823u();
            mo26804k(th);
        }
    }

    /* renamed from: J */
    private final void m36745J(Object obj, int i, C10430l<? super Throwable, C10323s> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof C10693b2) {
            } else {
                if (obj2 instanceof C10821q) {
                    C10821q qVar = (C10821q) obj2;
                    if (qVar.mo26832c()) {
                        if (lVar != null) {
                            mo26821s(lVar, qVar.f28406b);
                            return;
                        }
                        return;
                    }
                }
                m36751p(obj);
                throw new C10279d();
            }
        } while (!f28356r.compareAndSet(this, obj2, m36747L((C10693b2) obj2, obj, i, lVar, (Object) null)));
        m36754v();
        m36755w(i);
    }

    /* renamed from: K */
    static /* synthetic */ void m36746K(C10815o oVar, Object obj, int i, C10430l lVar, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                lVar = null;
            }
            oVar.m36745J(obj, i, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    /* renamed from: L */
    private final Object m36747L(C10693b2 b2Var, Object obj, int i, C10430l<? super Throwable, C10323s> lVar, Object obj2) {
        if (obj instanceof C10848y) {
            boolean z = true;
            if (C10819p0.m36781a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (!C10819p0.m36781a()) {
                return obj;
            }
            if (lVar != null) {
                z = false;
            }
            if (z) {
                return obj;
            }
            throw new AssertionError();
        } else if (!C10843w0.m36926b(i) && obj2 == null) {
            return obj;
        } else {
            if (lVar == null && !(b2Var instanceof C10783l) && obj2 == null) {
                return obj;
            }
            return new C10845x(obj, b2Var instanceof C10783l ? (C10783l) b2Var : null, lVar, obj2, (Throwable) null, 16, (C10452g) null);
        }
    }

    /* renamed from: M */
    private final boolean m36748M() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f28355q.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: N */
    private final C10763v m36749N(Object obj, Object obj2, C10430l<? super Throwable, C10323s> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof C10693b2) {
            } else if (!(obj3 instanceof C10845x) || obj2 == null) {
                return null;
            } else {
                C10845x xVar = (C10845x) obj3;
                if (xVar.f28398d != obj2) {
                    return null;
                }
                if (!C10819p0.m36781a() || C10457l.m35316a(xVar.f28395a, obj)) {
                    return C10818p.f28361a;
                }
                throw new AssertionError();
            }
        } while (!f28356r.compareAndSet(this, obj3, m36747L((C10693b2) obj3, obj, this.f28386p, lVar, obj2)));
        m36754v();
        return C10818p.f28361a;
    }

    /* renamed from: O */
    private final boolean m36750O() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f28355q.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: p */
    private final Void m36751p(Object obj) {
        throw new IllegalStateException(C10457l.m35326k("Already resumed, but proposed with update ", obj).toString());
    }

    /* renamed from: q */
    private final void m36752q(C10430l<? super Throwable, C10323s> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C10721h0.m36450a(mo25781a(), new C10689b0(C10457l.m35326k("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: t */
    private final boolean m36753t(Throwable th) {
        if (!m36741D()) {
            return false;
        }
        return ((C10736e) this.f28357s).mo26712s(th);
    }

    /* renamed from: v */
    private final void m36754v() {
        if (!m36741D()) {
            mo26823u();
        }
    }

    /* renamed from: w */
    private final void m36755w(int i) {
        if (!m36748M()) {
            C10843w0.m36925a(this, i);
        }
    }

    /* renamed from: B */
    public void mo26815B() {
        C10849y0 C = m36740C();
        if (C != null && mo26805l()) {
            C.mo26616e();
            this.f28359u = C10684a2.f28171f;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public String mo26816G() {
        return "CancellableContinuation";
    }

    /* renamed from: H */
    public final void mo26817H(Throwable th) {
        if (!m36753t(th)) {
            mo26804k(th);
            m36754v();
        }
    }

    /* renamed from: a */
    public C10381g mo25781a() {
        return this.f28358t;
    }

    /* renamed from: b */
    public void mo26707b(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C10693b2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof C10848y)) {
                if (obj2 instanceof C10845x) {
                    C10845x xVar = (C10845x) obj2;
                    if (!xVar.mo26872c()) {
                        if (f28356r.compareAndSet(this, obj2, C10845x.m36931b(xVar, (Object) null, (C10783l) null, (C10430l) null, (Object) null, th, 15, (Object) null))) {
                            xVar.mo26873d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f28356r.compareAndSet(this, obj2, new C10845x(obj2, (C10783l) null, (C10430l) null, (Object) null, th, 14, (C10452g) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public C10400e mo25789c() {
        C10376d<T> dVar = this.f28357s;
        if (dVar instanceof C10400e) {
            return (C10400e) dVar;
        }
        return null;
    }

    /* renamed from: d */
    public void mo25782d(Object obj) {
        m36746K(this, C10695c0.m36408c(obj, this), this.f28386p, (C10430l) null, 4, (Object) null);
    }

    /* renamed from: e */
    public void mo26802e(C10430l<? super Throwable, C10323s> lVar) {
        C10783l E = m36742E(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C10706f) {
                if (f28356r.compareAndSet(this, obj, E)) {
                    return;
                }
            } else if (obj instanceof C10783l) {
                m36743F(lVar, obj);
            } else {
                boolean z = obj instanceof C10848y;
                if (z) {
                    C10848y yVar = (C10848y) obj;
                    if (!yVar.mo26878b()) {
                        m36743F(lVar, obj);
                    }
                    if (obj instanceof C10821q) {
                        Throwable th = null;
                        if (!z) {
                            yVar = null;
                        }
                        if (yVar != null) {
                            th = yVar.f28406b;
                        }
                        m36752q(lVar, th);
                        return;
                    }
                    return;
                } else if (obj instanceof C10845x) {
                    C10845x xVar = (C10845x) obj;
                    if (xVar.f28396b != null) {
                        m36743F(lVar, obj);
                    }
                    if (xVar.mo26872c()) {
                        m36752q(lVar, xVar.f28399e);
                        return;
                    }
                    if (f28356r.compareAndSet(this, obj, C10845x.m36931b(xVar, (Object) null, E, (C10430l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                        return;
                    }
                } else {
                    if (f28356r.compareAndSet(this, obj, new C10845x(obj, E, (C10430l) null, (Object) null, (Throwable) null, 28, (C10452g) null))) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final C10376d<T> mo26708f() {
        return this.f28357s;
    }

    /* renamed from: g */
    public StackTraceElement mo25790g() {
        return null;
    }

    /* renamed from: h */
    public Throwable mo26818h(Object obj) {
        Throwable h = super.mo26818h(obj);
        if (h == null) {
            return null;
        }
        C10376d f = mo26708f();
        return (!C10819p0.m36784d() || !(f instanceof C10400e)) ? h : C10762u.m36593j(h, (C10400e) f);
    }

    /* renamed from: i */
    public Object mo26803i(Throwable th) {
        return m36749N(new C10848y(th, false, 2, (C10452g) null), (Object) null, (C10430l<? super Throwable, C10323s>) null);
    }

    /* renamed from: j */
    public <T> T mo26819j(Object obj) {
        return obj instanceof C10845x ? ((C10845x) obj).f28395a : obj;
    }

    /* renamed from: k */
    public boolean mo26804k(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof C10693b2)) {
                return false;
            }
            z = obj instanceof C10783l;
        } while (!f28356r.compareAndSet(this, obj, new C10821q(this, th, z)));
        C10783l lVar = z ? (C10783l) obj : null;
        if (lVar != null) {
            mo26820r(lVar, th);
        }
        m36754v();
        m36755w(this.f28386p);
        return true;
    }

    /* renamed from: l */
    public boolean mo26805l() {
        return !(mo26826z() instanceof C10693b2);
    }

    /* renamed from: m */
    public void mo26806m(Object obj) {
        if (C10819p0.m36781a()) {
            if (!(obj == C10818p.f28361a)) {
                throw new AssertionError();
            }
        }
        m36755w(this.f28386p);
    }

    /* renamed from: o */
    public Object mo26709o() {
        return mo26826z();
    }

    /* renamed from: r */
    public final void mo26820r(C10783l lVar, Throwable th) {
        try {
            lVar.mo26672a(th);
        } catch (Throwable th2) {
            C10721h0.m36450a(mo25781a(), new C10689b0(C10457l.m35326k("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: s */
    public final void mo26821s(C10430l<? super Throwable, C10323s> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C10721h0.m36450a(mo25781a(), new C10689b0(C10457l.m35326k("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    public String toString() {
        return mo26816G() + '(' + C10822q0.m36788c(this.f28357s) + "){" + m36739A() + "}@" + C10822q0.m36787b(this);
    }

    /* renamed from: u */
    public final void mo26823u() {
        C10849y0 y0Var = this.f28359u;
        if (y0Var != null) {
            y0Var.mo26616e();
            this.f28359u = C10684a2.f28171f;
        }
    }

    /* renamed from: x */
    public Throwable mo26824x(C10812n1 n1Var) {
        return n1Var.mo26810E();
    }

    /* renamed from: y */
    public final Object mo26825y() {
        C10812n1 n1Var;
        boolean D = m36741D();
        if (m36750O()) {
            if (this.f28359u == null) {
                m36740C();
            }
            if (D) {
                m36744I();
            }
            return C10395d.m35244c();
        }
        if (D) {
            m36744I();
        }
        Object z = mo26826z();
        if (z instanceof C10848y) {
            Throwable th = ((C10848y) z).f28406b;
            if (C10819p0.m36784d()) {
                th = C10762u.m36593j(th, this);
            }
            throw th;
        } else if (!C10843w0.m36926b(this.f28386p) || (n1Var = (C10812n1) mo25781a().get(C10812n1.f28353n)) == null || n1Var.mo26647b()) {
            return mo26819j(z);
        } else {
            Throwable E = n1Var.mo26810E();
            mo26707b(z, E);
            if (C10819p0.m36784d()) {
                E = C10762u.m36593j(E, this);
            }
            throw E;
        }
    }

    /* renamed from: z */
    public final Object mo26826z() {
        return this._state;
    }
}
