package p174e.p319f.p320a.p335c.p362h;

import java.util.concurrent.Executor;

/* renamed from: e.f.a.c.h.c0 */
final class C8946c0<TResult> implements C8960j0<TResult> {

    /* renamed from: a */
    private final Executor f24352a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f24353b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8951f<TResult> f24354c;

    public C8946c0(Executor executor, C8951f<TResult> fVar) {
        this.f24352a = executor;
        this.f24354c = fVar;
    }

    /* renamed from: d */
    public final void mo22754d(C8963l<TResult> lVar) {
        synchronized (this.f24353b) {
            if (this.f24354c != null) {
                this.f24352a.execute(new C8944b0(this, lVar));
            }
        }
    }
}
