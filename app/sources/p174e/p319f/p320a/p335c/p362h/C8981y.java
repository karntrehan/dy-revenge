package p174e.p319f.p320a.p335c.p362h;

import java.util.concurrent.Executor;

/* renamed from: e.f.a.c.h.y */
final class C8981y<TResult, TContinuationResult> implements C8955h<TContinuationResult>, C8953g, C8949e, C8960j0 {

    /* renamed from: a */
    private final Executor f24404a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8945c<TResult, C8963l<TContinuationResult>> f24405b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8970o0<TContinuationResult> f24406c;

    public C8981y(Executor executor, C8945c<TResult, C8963l<TContinuationResult>> cVar, C8970o0<TContinuationResult> o0Var) {
        this.f24404a = executor;
        this.f24405b = cVar;
        this.f24406c = o0Var;
    }

    /* renamed from: a */
    public final void mo16116a(TContinuationResult tcontinuationresult) {
        this.f24406c.mo22790s(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo14987b(Exception exc) {
        this.f24406c.mo22789r(exc);
    }

    /* renamed from: c */
    public final void mo22759c() {
        this.f24406c.mo22791t();
    }

    /* renamed from: d */
    public final void mo22754d(C8963l<TResult> lVar) {
        this.f24404a.execute(new C8980x(this, lVar));
    }
}
