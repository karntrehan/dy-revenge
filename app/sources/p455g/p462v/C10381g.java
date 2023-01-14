package p455g.p462v;

import p455g.p462v.C10377e;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10458m;

/* renamed from: g.v.g */
public interface C10381g {

    /* renamed from: g.v.g$a */
    public static final class C10382a {

        /* renamed from: g.v.g$a$a */
        static final class C10383a extends C10458m implements C10434p<C10381g, C10384b, C10381g> {

            /* renamed from: f */
            public static final C10383a f27573f = new C10383a();

            C10383a() {
                super(2);
            }

            /* renamed from: a */
            public final C10381g mo15709j(C10381g gVar, C10384b bVar) {
                C10374c cVar;
                C10457l.m35320e(gVar, "acc");
                C10457l.m35320e(bVar, "element");
                C10381g minusKey = gVar.minusKey(bVar.getKey());
                C10387h hVar = C10387h.f27574f;
                if (minusKey == hVar) {
                    return bVar;
                }
                C10377e.C10379b bVar2 = C10377e.f27571l;
                C10377e eVar = (C10377e) minusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new C10374c(minusKey, bVar);
                } else {
                    C10381g minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == hVar) {
                        return new C10374c(bVar, eVar);
                    }
                    cVar = new C10374c(new C10374c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        /* renamed from: a */
        public static C10381g m35224a(C10381g gVar, C10381g gVar2) {
            C10457l.m35320e(gVar2, "context");
            return gVar2 == C10387h.f27574f ? gVar : (C10381g) gVar2.fold(gVar, C10383a.f27573f);
        }
    }

    /* renamed from: g.v.g$b */
    public interface C10384b extends C10381g {

        /* renamed from: g.v.g$b$a */
        public static final class C10385a {
            /* renamed from: a */
            public static <R> R m35227a(C10384b bVar, R r, C10434p<? super R, ? super C10384b, ? extends R> pVar) {
                C10457l.m35320e(pVar, "operation");
                return pVar.mo15709j(r, bVar);
            }

            /* renamed from: b */
            public static <E extends C10384b> E m35228b(C10384b bVar, C10386c<E> cVar) {
                C10457l.m35320e(cVar, "key");
                if (!C10457l.m35316a(bVar.getKey(), cVar)) {
                    return null;
                }
                C10457l.m35318c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            /* renamed from: c */
            public static C10381g m35229c(C10384b bVar, C10386c<?> cVar) {
                C10457l.m35320e(cVar, "key");
                return C10457l.m35316a(bVar.getKey(), cVar) ? C10387h.f27574f : bVar;
            }

            /* renamed from: d */
            public static C10381g m35230d(C10384b bVar, C10381g gVar) {
                C10457l.m35320e(gVar, "context");
                return C10382a.m35224a(bVar, gVar);
            }
        }

        <E extends C10384b> E get(C10386c<E> cVar);

        C10386c<?> getKey();
    }

    /* renamed from: g.v.g$c */
    public interface C10386c<E extends C10384b> {
    }

    <R> R fold(R r, C10434p<? super R, ? super C10384b, ? extends R> pVar);

    <E extends C10384b> E get(C10386c<E> cVar);

    C10381g minusKey(C10386c<?> cVar);

    C10381g plus(C10381g gVar);
}
