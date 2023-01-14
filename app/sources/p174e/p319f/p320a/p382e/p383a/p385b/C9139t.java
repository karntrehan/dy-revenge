package p174e.p319f.p320a.p382e.p383a.p385b;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: e.f.a.e.a.b.t */
final class C9139t extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f25019a;

    public C9139t(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f25019a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C9139t.class) {
            if (this == obj) {
                return true;
            }
            C9139t tVar = (C9139t) obj;
            return this.f25019a == tVar.f25019a && get() == tVar.get();
        }
    }

    public final int hashCode() {
        return this.f25019a;
    }
}
