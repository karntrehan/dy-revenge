package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C10683a1;
import kotlinx.coroutines.C10695c0;
import kotlinx.coroutines.C10707f0;
import kotlinx.coroutines.C10711f2;
import kotlinx.coroutines.C10808n;
import kotlinx.coroutines.C10815o;
import kotlinx.coroutines.C10819p0;
import kotlinx.coroutines.C10822q0;
import kotlinx.coroutines.C10840v0;
import kotlinx.coroutines.C10851z;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p462v.C10381g;
import p455g.p462v.p464k.p465a.C10400e;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.internal.e */
public final class C10736e<T> extends C10840v0<T> implements C10400e, C10376d<T> {

    /* renamed from: q */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28224q = AtomicReferenceFieldUpdater.newUpdater(C10736e.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: r */
    public final C10707f0 f28225r;

    /* renamed from: s */
    public final C10376d<T> f28226s;

    /* renamed from: t */
    public Object f28227t = C10737f.f28229a;

    /* renamed from: u */
    public final Object f28228u = C10767z.m36611b(mo25781a());

    public C10736e(C10707f0 f0Var, C10376d<? super T> dVar) {
        super(-1);
        this.f28225r = f0Var;
        this.f28226s = dVar;
    }

    /* renamed from: q */
    private final C10815o<?> m36495q() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C10815o) {
            return (C10815o) obj;
        }
        return null;
    }

    /* renamed from: a */
    public C10381g mo25781a() {
        return this.f28226s.mo25781a();
    }

    /* renamed from: b */
    public void mo26707b(Object obj, Throwable th) {
        if (obj instanceof C10851z) {
            ((C10851z) obj).f28408b.invoke(th);
        }
    }

    /* renamed from: c */
    public C10400e mo25789c() {
        C10376d<T> dVar = this.f28226s;
        if (dVar instanceof C10400e) {
            return (C10400e) dVar;
        }
        return null;
    }

    /* renamed from: d */
    public void mo25782d(Object obj) {
        C10381g a;
        Object c;
        C10381g a2 = this.f28226s.mo25781a();
        Object d = C10695c0.m36409d(obj, (C10430l) null, 1, (Object) null);
        if (this.f28225r.mo26626v0(a2)) {
            this.f28227t = d;
            this.f28386p = 0;
            this.f28225r.mo26625u0(a2, this);
            return;
        }
        boolean a3 = C10819p0.m36781a();
        C10683a1 a4 = C10711f2.f28192a.mo26664a();
        if (a4.mo26609C0()) {
            this.f28227t = d;
            this.f28386p = 0;
            a4.mo26614y0(this);
            return;
        }
        a4.mo26608A0(true);
        try {
            a = mo25781a();
            c = C10767z.m36612c(a, this.f28228u);
            this.f28226s.mo25782d(obj);
            C10323s sVar = C10323s.f27547a;
            C10767z.m36610a(a, c);
            do {
            } while (a4.mo26611E0());
        } catch (Throwable th) {
            try {
                mo26869n(th, (Throwable) null);
            } catch (Throwable th2) {
                a4.mo26613w0(true);
                throw th2;
            }
        }
        a4.mo26613w0(true);
    }

    /* renamed from: f */
    public C10376d<T> mo26708f() {
        return this;
    }

    /* renamed from: g */
    public StackTraceElement mo25790g() {
        return null;
    }

    /* renamed from: o */
    public Object mo26709o() {
        Object obj = this.f28227t;
        if (C10819p0.m36781a()) {
            if (!(obj != C10737f.f28229a)) {
                throw new AssertionError();
            }
        }
        this.f28227t = C10737f.f28229a;
        return obj;
    }

    /* renamed from: p */
    public final void mo26710p() {
        do {
        } while (this._reusableCancellableContinuation == C10737f.f28230b);
    }

    /* renamed from: r */
    public final boolean mo26711r() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: s */
    public final boolean mo26712s(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C10763v vVar = C10737f.f28230b;
            if (C10457l.m35316a(obj, vVar)) {
                if (f28224q.compareAndSet(this, vVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f28224q.compareAndSet(this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: t */
    public final void mo26713t() {
        mo26710p();
        C10815o<?> q = m36495q();
        if (q != null) {
            q.mo26823u();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f28225r + ", " + C10822q0.m36788c(this.f28226s) + ']';
    }

    /* renamed from: u */
    public final Throwable mo26715u(C10808n<?> nVar) {
        C10763v vVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            vVar = C10737f.f28230b;
            if (obj != vVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(C10457l.m35326k("Inconsistent state ", obj).toString());
                } else if (f28224q.compareAndSet(this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!f28224q.compareAndSet(this, vVar, nVar));
        return null;
    }
}
