package p174e.p319f.p320a.p382e.p383a.p389f;

import java.util.concurrent.Executor;

/* renamed from: e.f.a.e.a.f.j */
final class C9162j<ResultT> implements C9163k<ResultT> {

    /* renamed from: a */
    private final Executor f25043a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f25044b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9154b<? super ResultT> f25045c;

    public C9162j(Executor executor, C9154b<? super ResultT> bVar) {
        this.f25043a = executor;
        this.f25045c = bVar;
    }

    /* renamed from: a */
    public final void mo23135a(C9156d<ResultT> dVar) {
        if (dVar.mo23133h()) {
            synchronized (this.f25044b) {
                if (this.f25045c != null) {
                    this.f25043a.execute(new C9161i(this, dVar));
                }
            }
        }
    }
}
