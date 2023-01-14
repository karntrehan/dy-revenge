package p174e.p319f.p320a.p335c.p362h;

import java.util.concurrent.Executor;

/* renamed from: e.f.a.c.h.g0 */
final class C8954g0<TResult> implements C8960j0<TResult> {

    /* renamed from: a */
    private final Executor f24362a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f24363b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8955h<? super TResult> f24364c;

    public C8954g0(Executor executor, C8955h<? super TResult> hVar) {
        this.f24362a = executor;
        this.f24364c = hVar;
    }

    /* renamed from: d */
    public final void mo22754d(C8963l<TResult> lVar) {
        if (lVar.mo22779o()) {
            synchronized (this.f24363b) {
                if (this.f24364c != null) {
                    this.f24362a.execute(new C8952f0(this, lVar));
                }
            }
        }
    }
}
