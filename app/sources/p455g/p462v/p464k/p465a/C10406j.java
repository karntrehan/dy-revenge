package p455g.p462v.p464k.p465a;

import p455g.p462v.C10376d;
import p455g.p462v.C10381g;
import p455g.p462v.C10387h;

/* renamed from: g.v.k.a.j */
public abstract class C10406j extends C10396a {
    public C10406j(C10376d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.mo25781a() == C10387h.f27574f)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    /* renamed from: a */
    public C10381g mo25781a() {
        return C10387h.f27574f;
    }
}
