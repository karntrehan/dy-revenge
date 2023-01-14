package p174e.p319f.p320a.p335c.p362h;

import java.util.concurrent.Executor;

/* renamed from: e.f.a.c.h.w */
final class C8979w<TResult, TContinuationResult> implements C8960j0<TResult> {

    /* renamed from: a */
    private final Executor f24399a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8945c<TResult, TContinuationResult> f24400b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8970o0<TContinuationResult> f24401c;

    public C8979w(Executor executor, C8945c<TResult, TContinuationResult> cVar, C8970o0<TContinuationResult> o0Var) {
        this.f24399a = executor;
        this.f24400b = cVar;
        this.f24401c = o0Var;
    }

    /* renamed from: d */
    public final void mo22754d(C8963l<TResult> lVar) {
        this.f24399a.execute(new C8978v(this, lVar));
    }
}
