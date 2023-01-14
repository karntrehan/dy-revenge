package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p455g.C10323s;
import p455g.p470y.p471c.C10430l;

/* renamed from: kotlinx.coroutines.l1 */
final class C10785l1 extends C10820p1 {

    /* renamed from: r */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28287r = AtomicIntegerFieldUpdater.newUpdater(C10785l1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: s */
    private final C10430l<Throwable, C10323s> f28288s;

    public C10785l1(C10430l<? super Throwable, C10323s> lVar) {
        this.f28288s = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo26607t((Throwable) obj);
        return C10323s.f27547a;
    }

    /* renamed from: t */
    public void mo26607t(Throwable th) {
        if (f28287r.compareAndSet(this, 0, 1)) {
            this.f28288s.invoke(th);
        }
    }
}
