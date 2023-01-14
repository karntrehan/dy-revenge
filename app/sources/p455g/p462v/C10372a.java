package p455g.p462v;

import p455g.p462v.C10381g;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.v.a */
public abstract class C10372a implements C10381g.C10384b {
    private final C10381g.C10386c<?> key;

    public C10372a(C10381g.C10386c<?> cVar) {
        C10457l.m35320e(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r, C10434p<? super R, ? super C10381g.C10384b, ? extends R> pVar) {
        return C10381g.C10384b.C10385a.m35227a(this, r, pVar);
    }

    public <E extends C10381g.C10384b> E get(C10381g.C10386c<E> cVar) {
        return C10381g.C10384b.C10385a.m35228b(this, cVar);
    }

    public C10381g.C10386c<?> getKey() {
        return this.key;
    }

    public C10381g minusKey(C10381g.C10386c<?> cVar) {
        return C10381g.C10384b.C10385a.m35229c(this, cVar);
    }

    public C10381g plus(C10381g gVar) {
        return C10381g.C10384b.C10385a.m35230d(this, gVar);
    }
}
