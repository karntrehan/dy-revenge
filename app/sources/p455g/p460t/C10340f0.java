package p455g.p460t;

import java.util.List;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.t.f0 */
class C10340f0<T> extends C10327b<T> {

    /* renamed from: o */
    private final List<T> f27558o;

    public C10340f0(List<? extends T> list) {
        C10457l.m35320e(list, "delegate");
        this.f27558o = list;
    }

    /* renamed from: b */
    public int mo25624b() {
        return this.f27558o.size();
    }

    public T get(int i) {
        return this.f27558o.get(C10356r.m35153v(this, i));
    }
}
