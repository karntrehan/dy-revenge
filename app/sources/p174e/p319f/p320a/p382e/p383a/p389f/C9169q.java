package p174e.p319f.p320a.p382e.p383a.p389f;

import java.util.concurrent.Executor;
import p174e.p319f.p320a.p382e.p383a.p385b.C9125m;

/* renamed from: e.f.a.e.a.f.q */
final class C9169q<ResultT> extends C9156d<ResultT> {

    /* renamed from: a */
    private final Object f25051a = new Object();

    /* renamed from: b */
    private final C9164l<ResultT> f25052b = new C9164l<>();

    /* renamed from: c */
    private boolean f25053c;

    /* renamed from: d */
    private ResultT f25054d;

    /* renamed from: e */
    private Exception f25055e;

    C9169q() {
    }

    /* renamed from: m */
    private final void m30476m() {
        C9125m.m30376b(this.f25053c, "Task is not yet complete");
    }

    /* renamed from: n */
    private final void m30477n() {
        C9125m.m30376b(!this.f25053c, "Task is already complete");
    }

    /* renamed from: o */
    private final void m30478o() {
        synchronized (this.f25051a) {
            if (this.f25053c) {
                this.f25052b.mo23138b(this);
            }
        }
    }

    /* renamed from: a */
    public final C9156d<ResultT> mo23126a(C9153a aVar) {
        mo23127b(C9157e.f25034a, aVar);
        return this;
    }

    /* renamed from: b */
    public final C9156d<ResultT> mo23127b(Executor executor, C9153a aVar) {
        this.f25052b.mo23137a(new C9160h(executor, aVar));
        m30478o();
        return this;
    }

    /* renamed from: c */
    public final C9156d<ResultT> mo23128c(C9154b<? super ResultT> bVar) {
        mo23129d(C9157e.f25034a, bVar);
        return this;
    }

    /* renamed from: d */
    public final C9156d<ResultT> mo23129d(Executor executor, C9154b<? super ResultT> bVar) {
        this.f25052b.mo23137a(new C9162j(executor, bVar));
        m30478o();
        return this;
    }

    /* renamed from: e */
    public final Exception mo23130e() {
        Exception exc;
        synchronized (this.f25051a) {
            exc = this.f25055e;
        }
        return exc;
    }

    /* renamed from: f */
    public final ResultT mo23131f() {
        ResultT resultt;
        synchronized (this.f25051a) {
            m30476m();
            Exception exc = this.f25055e;
            if (exc == null) {
                resultt = this.f25054d;
            } else {
                throw new C9155c(exc);
            }
        }
        return resultt;
    }

    /* renamed from: g */
    public final boolean mo23132g() {
        boolean z;
        synchronized (this.f25051a) {
            z = this.f25053c;
        }
        return z;
    }

    /* renamed from: h */
    public final boolean mo23133h() {
        boolean z;
        synchronized (this.f25051a) {
            z = false;
            if (this.f25053c && this.f25055e == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: i */
    public final void mo23146i(ResultT resultt) {
        synchronized (this.f25051a) {
            m30477n();
            this.f25053c = true;
            this.f25054d = resultt;
        }
        this.f25052b.mo23138b(this);
    }

    /* renamed from: j */
    public final boolean mo23147j(ResultT resultt) {
        synchronized (this.f25051a) {
            if (this.f25053c) {
                return false;
            }
            this.f25053c = true;
            this.f25054d = resultt;
            this.f25052b.mo23138b(this);
            return true;
        }
    }

    /* renamed from: k */
    public final void mo23148k(Exception exc) {
        synchronized (this.f25051a) {
            m30477n();
            this.f25053c = true;
            this.f25055e = exc;
        }
        this.f25052b.mo23138b(this);
    }

    /* renamed from: l */
    public final boolean mo23149l(Exception exc) {
        synchronized (this.f25051a) {
            if (this.f25053c) {
                return false;
            }
            this.f25053c = true;
            this.f25055e = exc;
            this.f25052b.mo23138b(this);
            return true;
        }
    }
}
