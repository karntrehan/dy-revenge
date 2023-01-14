package p174e.p319f.p320a.p321a;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import p027c.p060f.C1788a;

/* renamed from: e.f.a.a.k */
class C6457k {

    /* renamed from: a */
    private final C1788a<C6412a, SortedSet<C6455j>> f17995a = new C1788a<>();

    C6457k() {
    }

    /* renamed from: a */
    public boolean mo19218a(C6455j jVar) {
        for (C6412a next : this.f17995a.keySet()) {
            if (next.mo18991R(jVar)) {
                SortedSet sortedSet = this.f17995a.get(next);
                if (sortedSet.contains(jVar)) {
                    return false;
                }
                sortedSet.add(jVar);
                return true;
            }
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(jVar);
        this.f17995a.put(C6412a.m24526S(jVar.mo19206O(), jVar.mo19205N()), treeSet);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19219b() {
        this.f17995a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo19220c() {
        return this.f17995a.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Set<C6412a> mo19221d() {
        return this.f17995a.keySet();
    }

    /* renamed from: e */
    public void mo19222e(C6412a aVar) {
        this.f17995a.remove(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public SortedSet<C6455j> mo19223f(C6412a aVar) {
        return this.f17995a.get(aVar);
    }
}
