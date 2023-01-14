package p174e.p319f.p320a.p335c.p362h;

import java.util.concurrent.Executor;

/* renamed from: e.f.a.c.h.i0 */
final class C8958i0<TResult, TContinuationResult> implements C8955h<TContinuationResult>, C8953g, C8949e, C8960j0 {

    /* renamed from: a */
    private final Executor f24367a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8961k<TResult, TContinuationResult> f24368b;

    /* renamed from: c */
    private final C8970o0<TContinuationResult> f24369c;

    public C8958i0(Executor executor, C8961k<TResult, TContinuationResult> kVar, C8970o0<TContinuationResult> o0Var) {
        this.f24367a = executor;
        this.f24368b = kVar;
        this.f24369c = o0Var;
    }

    /* renamed from: a */
    public final void mo16116a(TContinuationResult tcontinuationresult) {
        this.f24369c.mo22790s(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo14987b(Exception exc) {
        this.f24369c.mo22789r(exc);
    }

    /* renamed from: c */
    public final void mo22759c() {
        this.f24369c.mo22791t();
    }

    /* renamed from: d */
    public final void mo22754d(C8963l<TResult> lVar) {
        this.f24367a.execute(new C8956h0(this, lVar));
    }
}
