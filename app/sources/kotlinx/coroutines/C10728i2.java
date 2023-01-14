package kotlinx.coroutines;

import p455g.p462v.C10381g;
import p455g.p470y.p471c.C10434p;

/* renamed from: kotlinx.coroutines.i2 */
final class C10728i2 implements C10381g.C10384b, C10381g.C10386c<C10728i2> {

    /* renamed from: f */
    public static final C10728i2 f28211f = new C10728i2();

    private C10728i2() {
    }

    public <R> R fold(R r, C10434p<? super R, ? super C10381g.C10384b, ? extends R> pVar) {
        return C10381g.C10384b.C10385a.m35227a(this, r, pVar);
    }

    public <E extends C10381g.C10384b> E get(C10381g.C10386c<E> cVar) {
        return C10381g.C10384b.C10385a.m35228b(this, cVar);
    }

    public C10381g.C10386c<?> getKey() {
        return this;
    }

    public C10381g minusKey(C10381g.C10386c<?> cVar) {
        return C10381g.C10384b.C10385a.m35229c(this, cVar);
    }

    public C10381g plus(C10381g gVar) {
        return C10381g.C10384b.C10385a.m35230d(this, gVar);
    }
}
