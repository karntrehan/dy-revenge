package kotlinx.coroutines.p505k2;

import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.C10808n;
import p174e.p319f.p390b.p391a.p392a.C9172b;
import p174e.p319f.p390b.p391a.p392a.C9174d;
import p455g.C10315m;
import p455g.C10318n;

/* renamed from: kotlinx.coroutines.k2.b */
final class C10782b<T> implements Runnable {

    /* renamed from: f */
    private final C9172b<T> f28285f;

    /* renamed from: o */
    private final C10808n<T> f28286o;

    public C10782b(C9172b<T> bVar, C10808n<? super T> nVar) {
        this.f28285f = bVar;
        this.f28286o = nVar;
    }

    public void run() {
        if (this.f28285f.isCancelled()) {
            C10808n.C10809a.m36724a(this.f28286o, (Throwable) null, 1, (Object) null);
            return;
        }
        try {
            C10808n<T> nVar = this.f28286o;
            T a = C9174d.m30496a(this.f28285f);
            C10315m.C10316a aVar = C10315m.f27541f;
            nVar.mo25782d(C10315m.m35012a(a));
        } catch (ExecutionException e) {
            C10808n<T> nVar2 = this.f28286o;
            Throwable a2 = C10780a.m36634c(e);
            C10315m.C10316a aVar2 = C10315m.f27541f;
            nVar2.mo25782d(C10315m.m35012a(C10318n.m35016a(a2)));
        }
    }
}
