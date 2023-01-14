package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.C10737f;
import kotlinx.coroutines.internal.C10761t;
import p455g.p462v.C10376d;
import p455g.p462v.C10381g;
import p455g.p470y.p471c.C10430l;

/* renamed from: kotlinx.coroutines.u0 */
public final class C10834u0<T> extends C10761t<T> {

    /* renamed from: q */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28373q = AtomicIntegerFieldUpdater.newUpdater(C10834u0.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public C10834u0(C10381g gVar, C10376d<? super T> dVar) {
        super(gVar, dVar);
    }

    /* renamed from: C0 */
    private final boolean m36819C0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f28373q.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: D0 */
    private final boolean m36820D0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f28373q.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: B0 */
    public final Object mo26840B0() {
        if (m36820D0()) {
            return C10395d.m35244c();
        }
        Object h = C10841v1.m36924h(mo26843O());
        if (!(h instanceof C10848y)) {
            return h;
        }
        throw ((C10848y) h).f28406b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo26754s(Object obj) {
        mo26651x0(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public void mo26651x0(Object obj) {
        if (!m36819C0()) {
            C10737f.m36510c(C10392c.m35241b(this.f28266p), C10695c0.m36406a(obj, this.f28266p), (C10430l) null, 2, (Object) null);
        }
    }
}
