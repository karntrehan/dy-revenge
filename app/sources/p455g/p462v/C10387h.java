package p455g.p462v;

import java.io.Serializable;
import p455g.p462v.C10381g;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.v.h */
public final class C10387h implements C10381g, Serializable {

    /* renamed from: f */
    public static final C10387h f27574f = new C10387h();

    private C10387h() {
    }

    public <R> R fold(R r, C10434p<? super R, ? super C10381g.C10384b, ? extends R> pVar) {
        C10457l.m35320e(pVar, "operation");
        return r;
    }

    public <E extends C10381g.C10384b> E get(C10381g.C10386c<E> cVar) {
        C10457l.m35320e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C10381g minusKey(C10381g.C10386c<?> cVar) {
        C10457l.m35320e(cVar, "key");
        return this;
    }

    public C10381g plus(C10381g gVar) {
        C10457l.m35320e(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
