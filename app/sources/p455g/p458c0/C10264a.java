package p455g.p458c0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.c0.a */
public final class C10264a<T> implements C10268d<T> {

    /* renamed from: a */
    private final AtomicReference<C10268d<T>> f27493a;

    public C10264a(C10268d<? extends T> dVar) {
        C10457l.m35320e(dVar, "sequence");
        this.f27493a = new AtomicReference<>(dVar);
    }

    public Iterator<T> iterator() {
        C10268d andSet = this.f27493a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
