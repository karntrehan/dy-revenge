package p174e.p319f.p320a.p335c.p362h;

import java.util.concurrent.Executor;

/* renamed from: e.f.a.c.h.a0 */
final class C8942a0<TResult> implements C8960j0<TResult> {

    /* renamed from: a */
    private final Executor f24346a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f24347b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8949e f24348c;

    public C8942a0(Executor executor, C8949e eVar) {
        this.f24346a = executor;
        this.f24348c = eVar;
    }

    /* renamed from: d */
    public final void mo22754d(C8963l<TResult> lVar) {
        if (lVar.mo22777m()) {
            synchronized (this.f24347b) {
                if (this.f24348c != null) {
                    this.f24346a.execute(new C8982z(this));
                }
            }
        }
    }
}
