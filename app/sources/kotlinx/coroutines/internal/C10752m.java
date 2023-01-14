package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.m */
public class C10752m<E> {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28249a = AtomicReferenceFieldUpdater.newUpdater(C10752m.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public C10752m(boolean z) {
        this._cur = new C10753n(8, z);
    }

    /* renamed from: a */
    public final boolean mo26735a(E e) {
        while (true) {
            C10753n nVar = (C10753n) this._cur;
            int a = nVar.mo26739a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                f28249a.compareAndSet(this, nVar, nVar.mo26743i());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo26736b() {
        while (true) {
            C10753n nVar = (C10753n) this._cur;
            if (!nVar.mo26740d()) {
                f28249a.compareAndSet(this, nVar, nVar.mo26743i());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int mo26737c() {
        return ((C10753n) this._cur).mo26741f();
    }

    /* renamed from: d */
    public final E mo26738d() {
        while (true) {
            C10753n nVar = (C10753n) this._cur;
            E j = nVar.mo26744j();
            if (j != C10753n.f28253d) {
                return j;
            }
            f28249a.compareAndSet(this, nVar, nVar.mo26743i());
        }
    }
}
