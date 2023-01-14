package p174e.p319f.p320a.p335c.p362h;

import com.google.android.gms.common.internal.C3705r;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: e.f.a.c.h.o0 */
final class C8970o0<TResult> extends C8963l<TResult> {

    /* renamed from: a */
    private final Object f24378a = new Object();

    /* renamed from: b */
    private final C8962k0<TResult> f24379b = new C8962k0<>();

    /* renamed from: c */
    private boolean f24380c;

    /* renamed from: d */
    private volatile boolean f24381d;

    /* renamed from: e */
    private TResult f24382e;

    /* renamed from: f */
    private Exception f24383f;

    C8970o0() {
    }

    /* renamed from: w */
    private final void m29872w() {
        C3705r.m14350o(this.f24380c, "Task is not yet complete");
    }

    /* renamed from: x */
    private final void m29873x() {
        if (this.f24381d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: y */
    private final void m29874y() {
        if (this.f24380c) {
            throw C8947d.m29817a(this);
        }
    }

    /* renamed from: z */
    private final void m29875z() {
        synchronized (this.f24378a) {
            if (this.f24380c) {
                this.f24379b.mo22764b(this);
            }
        }
    }

    /* renamed from: a */
    public final C8963l<TResult> mo22765a(Executor executor, C8949e eVar) {
        this.f24379b.mo22763a(new C8942a0(executor, eVar));
        m29875z();
        return this;
    }

    /* renamed from: b */
    public final C8963l<TResult> mo22766b(C8951f<TResult> fVar) {
        this.f24379b.mo22763a(new C8946c0(C8967n.f24375a, fVar));
        m29875z();
        return this;
    }

    /* renamed from: c */
    public final C8963l<TResult> mo22767c(Executor executor, C8951f<TResult> fVar) {
        this.f24379b.mo22763a(new C8946c0(executor, fVar));
        m29875z();
        return this;
    }

    /* renamed from: d */
    public final C8963l<TResult> mo22768d(C8953g gVar) {
        mo22769e(C8967n.f24375a, gVar);
        return this;
    }

    /* renamed from: e */
    public final C8963l<TResult> mo22769e(Executor executor, C8953g gVar) {
        this.f24379b.mo22763a(new C8950e0(executor, gVar));
        m29875z();
        return this;
    }

    /* renamed from: f */
    public final C8963l<TResult> mo22770f(C8955h<? super TResult> hVar) {
        mo22771g(C8967n.f24375a, hVar);
        return this;
    }

    /* renamed from: g */
    public final C8963l<TResult> mo22771g(Executor executor, C8955h<? super TResult> hVar) {
        this.f24379b.mo22763a(new C8954g0(executor, hVar));
        m29875z();
        return this;
    }

    /* renamed from: h */
    public final <TContinuationResult> C8963l<TContinuationResult> mo22772h(C8945c<TResult, TContinuationResult> cVar) {
        return mo22773i(C8967n.f24375a, cVar);
    }

    /* renamed from: i */
    public final <TContinuationResult> C8963l<TContinuationResult> mo22773i(Executor executor, C8945c<TResult, TContinuationResult> cVar) {
        C8970o0 o0Var = new C8970o0();
        this.f24379b.mo22763a(new C8979w(executor, cVar, o0Var));
        m29875z();
        return o0Var;
    }

    /* renamed from: j */
    public final <TContinuationResult> C8963l<TContinuationResult> mo22774j(Executor executor, C8945c<TResult, C8963l<TContinuationResult>> cVar) {
        C8970o0 o0Var = new C8970o0();
        this.f24379b.mo22763a(new C8981y(executor, cVar, o0Var));
        m29875z();
        return o0Var;
    }

    /* renamed from: k */
    public final Exception mo22775k() {
        Exception exc;
        synchronized (this.f24378a) {
            exc = this.f24383f;
        }
        return exc;
    }

    /* renamed from: l */
    public final TResult mo22776l() {
        TResult tresult;
        synchronized (this.f24378a) {
            m29872w();
            m29873x();
            Exception exc = this.f24383f;
            if (exc == null) {
                tresult = this.f24382e;
            } else {
                throw new C8959j(exc);
            }
        }
        return tresult;
    }

    /* renamed from: m */
    public final boolean mo22777m() {
        return this.f24381d;
    }

    /* renamed from: n */
    public final boolean mo22778n() {
        boolean z;
        synchronized (this.f24378a) {
            z = this.f24380c;
        }
        return z;
    }

    /* renamed from: o */
    public final boolean mo22779o() {
        boolean z;
        synchronized (this.f24378a) {
            z = false;
            if (this.f24380c && !this.f24381d && this.f24383f == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: p */
    public final <TContinuationResult> C8963l<TContinuationResult> mo22780p(C8961k<TResult, TContinuationResult> kVar) {
        Executor executor = C8967n.f24375a;
        C8970o0 o0Var = new C8970o0();
        this.f24379b.mo22763a(new C8958i0(executor, kVar, o0Var));
        m29875z();
        return o0Var;
    }

    /* renamed from: q */
    public final <TContinuationResult> C8963l<TContinuationResult> mo22781q(Executor executor, C8961k<TResult, TContinuationResult> kVar) {
        C8970o0 o0Var = new C8970o0();
        this.f24379b.mo22763a(new C8958i0(executor, kVar, o0Var));
        m29875z();
        return o0Var;
    }

    /* renamed from: r */
    public final void mo22789r(Exception exc) {
        C3705r.m14347l(exc, "Exception must not be null");
        synchronized (this.f24378a) {
            m29874y();
            this.f24380c = true;
            this.f24383f = exc;
        }
        this.f24379b.mo22764b(this);
    }

    /* renamed from: s */
    public final void mo22790s(TResult tresult) {
        synchronized (this.f24378a) {
            m29874y();
            this.f24380c = true;
            this.f24382e = tresult;
        }
        this.f24379b.mo22764b(this);
    }

    /* renamed from: t */
    public final boolean mo22791t() {
        synchronized (this.f24378a) {
            if (this.f24380c) {
                return false;
            }
            this.f24380c = true;
            this.f24381d = true;
            this.f24379b.mo22764b(this);
            return true;
        }
    }

    /* renamed from: u */
    public final boolean mo22792u(Exception exc) {
        C3705r.m14347l(exc, "Exception must not be null");
        synchronized (this.f24378a) {
            if (this.f24380c) {
                return false;
            }
            this.f24380c = true;
            this.f24383f = exc;
            this.f24379b.mo22764b(this);
            return true;
        }
    }

    /* renamed from: v */
    public final boolean mo22793v(TResult tresult) {
        synchronized (this.f24378a) {
            if (this.f24380c) {
                return false;
            }
            this.f24380c = true;
            this.f24382e = tresult;
            this.f24379b.mo22764b(this);
            return true;
        }
    }
}
