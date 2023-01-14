package p174e.p247e.p294k.p300d;

import java.util.LinkedHashSet;

/* renamed from: e.e.k.d.d */
public class C6276d<E> {

    /* renamed from: a */
    private int f17373a;

    /* renamed from: b */
    private LinkedHashSet<E> f17374b;

    public C6276d(int i) {
        this.f17374b = new LinkedHashSet<>(i);
        this.f17373a = i;
    }

    /* renamed from: a */
    public synchronized boolean mo18591a(E e) {
        if (this.f17374b.size() == this.f17373a) {
            LinkedHashSet<E> linkedHashSet = this.f17374b;
            linkedHashSet.remove(linkedHashSet.iterator().next());
        }
        this.f17374b.remove(e);
        return this.f17374b.add(e);
    }

    /* renamed from: b */
    public synchronized boolean mo18592b(E e) {
        return this.f17374b.contains(e);
    }
}
