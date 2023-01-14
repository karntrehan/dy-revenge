package p174e.p319f.p406d.p407a.p409c;

import java.util.concurrent.Executor;
import p174e.p319f.p320a.p335c.p362h.C8941a;
import p174e.p319f.p320a.p335c.p362h.C8943b;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: e.f.d.a.c.b0 */
public final /* synthetic */ class C9594b0 implements Executor {

    /* renamed from: f */
    public final /* synthetic */ Executor f25681f;

    /* renamed from: o */
    public final /* synthetic */ C8941a f25682o;

    /* renamed from: p */
    public final /* synthetic */ C8943b f25683p;

    /* renamed from: q */
    public final /* synthetic */ C8965m f25684q;

    public /* synthetic */ C9594b0(Executor executor, C8941a aVar, C8943b bVar, C8965m mVar) {
        this.f25681f = executor;
        this.f25682o = aVar;
        this.f25683p = bVar;
        this.f25684q = mVar;
    }

    public final void execute(Runnable runnable) {
        Executor executor = this.f25681f;
        C8941a aVar = this.f25682o;
        C8943b bVar = this.f25683p;
        C8965m mVar = this.f25684q;
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            if (aVar.mo22752a()) {
                bVar.mo22755a();
            } else {
                mVar.mo22783b(e);
            }
            throw e;
        }
    }
}
