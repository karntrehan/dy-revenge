package p174e.p181b.p182a.p188w.p189j;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p174e.p181b.p182a.p183a0.C5417a;

/* renamed from: e.b.a.w.j.n */
abstract class C5546n<V, O> implements C5545m<V, O> {

    /* renamed from: a */
    final List<C5417a<V>> f15643a;

    C5546n(V v) {
        this(Collections.singletonList(new C5417a(v)));
    }

    C5546n(List<C5417a<V>> list) {
        this.f15643a = list;
    }

    /* renamed from: b */
    public List<C5417a<V>> mo16694b() {
        return this.f15643a;
    }

    /* renamed from: c */
    public boolean mo16695c() {
        return this.f15643a.isEmpty() || (this.f15643a.size() == 1 && this.f15643a.get(0).mo16366h());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f15643a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f15643a.toArray()));
        }
        return sb.toString();
    }
}
