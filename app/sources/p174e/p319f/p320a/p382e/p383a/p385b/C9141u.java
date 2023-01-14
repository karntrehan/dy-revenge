package p174e.p319f.p320a.p382e.p383a.p385b;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: e.f.a.e.a.b.u */
final class C9141u {

    /* renamed from: a */
    private final ConcurrentHashMap<C9139t, List<Throwable>> f25020a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f25021b = new ReferenceQueue<>();

    C9141u() {
    }

    /* renamed from: a */
    public final List<Throwable> mo23118a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> poll = this.f25021b.poll();
            if (poll == null) {
                break;
            }
            this.f25020a.remove(poll);
        }
        List<Throwable> list = this.f25020a.get(new C9139t(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f25020a.putIfAbsent(new C9139t(th, this.f25021b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
