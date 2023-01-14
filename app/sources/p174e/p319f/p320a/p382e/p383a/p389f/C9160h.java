package p174e.p319f.p320a.p382e.p383a.p389f;

import java.util.concurrent.Executor;

/* renamed from: e.f.a.e.a.f.h */
final class C9160h<ResultT> implements C9163k<ResultT> {

    /* renamed from: a */
    private final Executor f25038a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f25039b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9153a f25040c;

    public C9160h(Executor executor, C9153a aVar) {
        this.f25038a = executor;
        this.f25040c = aVar;
    }

    /* renamed from: a */
    public final void mo23135a(C9156d<ResultT> dVar) {
        if (!dVar.mo23133h()) {
            synchronized (this.f25039b) {
                if (this.f25040c != null) {
                    this.f25038a.execute(new C9159g(this, dVar));
                }
            }
        }
    }
}
