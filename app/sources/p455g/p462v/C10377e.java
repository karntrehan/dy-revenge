package p455g.p462v;

import p455g.p462v.C10381g;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.v.e */
public interface C10377e extends C10381g.C10384b {

    /* renamed from: l */
    public static final C10379b f27571l = C10379b.f27572f;

    /* renamed from: g.v.e$a */
    public static final class C10378a {
        /* renamed from: a */
        public static <E extends C10381g.C10384b> E m35221a(C10377e eVar, C10381g.C10386c<E> cVar) {
            C10457l.m35320e(cVar, "key");
            if (cVar instanceof C10373b) {
                C10373b bVar = (C10373b) cVar;
                if (!bVar.mo25775a(eVar.getKey())) {
                    return null;
                }
                E b = bVar.mo25776b(eVar);
                if (b instanceof C10381g.C10384b) {
                    return b;
                }
                return null;
            } else if (C10377e.f27571l != cVar) {
                return null;
            } else {
                C10457l.m35318c(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
        }

        /* renamed from: b */
        public static C10381g m35222b(C10377e eVar, C10381g.C10386c<?> cVar) {
            C10457l.m35320e(cVar, "key");
            if (!(cVar instanceof C10373b)) {
                return C10377e.f27571l == cVar ? C10387h.f27574f : eVar;
            }
            C10373b bVar = (C10373b) cVar;
            return (!bVar.mo25775a(eVar.getKey()) || bVar.mo25776b(eVar) == null) ? eVar : C10387h.f27574f;
        }
    }

    /* renamed from: g.v.e$b */
    public static final class C10379b implements C10381g.C10386c<C10377e> {

        /* renamed from: f */
        static final /* synthetic */ C10379b f27572f = new C10379b();

        private C10379b() {
        }
    }

    /* renamed from: h */
    void mo25783h(C10376d<?> dVar);

    /* renamed from: r */
    <T> C10376d<T> mo25784r(C10376d<? super T> dVar);
}
