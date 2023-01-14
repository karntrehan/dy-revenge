package p174e.p319f.p320a.p335c.p362h;

import java.util.concurrent.Executor;

/* renamed from: e.f.a.c.h.e0 */
final class C8950e0<TResult> implements C8960j0<TResult> {

    /* renamed from: a */
    private final Executor f24357a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f24358b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8953g f24359c;

    public C8950e0(Executor executor, C8953g gVar) {
        this.f24357a = executor;
        this.f24359c = gVar;
    }

    /* renamed from: d */
    public final void mo22754d(C8963l<TResult> lVar) {
        if (!lVar.mo22779o() && !lVar.mo22777m()) {
            synchronized (this.f24358b) {
                if (this.f24359c != null) {
                    this.f24357a.execute(new C8948d0(this, lVar));
                }
            }
        }
    }
}
