package p455g.p462v;

import p455g.p462v.C10381g;
import p455g.p462v.C10381g.C10384b;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.v.b */
public abstract class C10373b<B extends C10381g.C10384b, E extends B> implements C10381g.C10386c<E> {

    /* renamed from: f */
    private final C10430l<C10381g.C10384b, E> f27566f;

    /* renamed from: o */
    private final C10381g.C10386c<?> f27567o;

    public C10373b(C10381g.C10386c<B> cVar, C10430l<? super C10381g.C10384b, ? extends E> lVar) {
        C10457l.m35320e(cVar, "baseKey");
        C10457l.m35320e(lVar, "safeCast");
        this.f27566f = lVar;
        this.f27567o = cVar instanceof C10373b ? ((C10373b) cVar).f27567o : cVar;
    }

    /* renamed from: a */
    public final boolean mo25775a(C10381g.C10386c<?> cVar) {
        C10457l.m35320e(cVar, "key");
        return cVar == this || this.f27567o == cVar;
    }

    /* renamed from: b */
    public final E mo25776b(C10381g.C10384b bVar) {
        C10457l.m35320e(bVar, "element");
        return (C10381g.C10384b) this.f27566f.invoke(bVar);
    }
}
