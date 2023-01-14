package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlinx.coroutines.C10705e2;
import p455g.p462v.C10381g;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10458m;

/* renamed from: kotlinx.coroutines.internal.z */
public final class C10767z {

    /* renamed from: a */
    public static final C10763v f28271a = new C10763v("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final C10434p<Object, C10381g.C10384b, Object> f28272b = C10768a.f28275f;

    /* renamed from: c */
    private static final C10434p<C10705e2<?>, C10381g.C10384b, C10705e2<?>> f28273c = C10769b.f28276f;

    /* renamed from: d */
    private static final C10434p<C10734c0, C10381g.C10384b, C10734c0> f28274d = C10770c.f28277f;

    /* renamed from: kotlinx.coroutines.internal.z$a */
    static final class C10768a extends C10458m implements C10434p<Object, C10381g.C10384b, Object> {

        /* renamed from: f */
        public static final C10768a f28275f = new C10768a();

        C10768a() {
            super(2);
        }

        /* renamed from: a */
        public final Object mo15709j(Object obj, C10381g.C10384b bVar) {
            if (!(bVar instanceof C10705e2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.z$b */
    static final class C10769b extends C10458m implements C10434p<C10705e2<?>, C10381g.C10384b, C10705e2<?>> {

        /* renamed from: f */
        public static final C10769b f28276f = new C10769b();

        C10769b() {
            super(2);
        }

        /* renamed from: a */
        public final C10705e2<?> mo15709j(C10705e2<?> e2Var, C10381g.C10384b bVar) {
            if (e2Var != null) {
                return e2Var;
            }
            if (bVar instanceof C10705e2) {
                return (C10705e2) bVar;
            }
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.z$c */
    static final class C10770c extends C10458m implements C10434p<C10734c0, C10381g.C10384b, C10734c0> {

        /* renamed from: f */
        public static final C10770c f28277f = new C10770c();

        C10770c() {
            super(2);
        }

        /* renamed from: a */
        public final C10734c0 mo15709j(C10734c0 c0Var, C10381g.C10384b bVar) {
            if (bVar instanceof C10705e2) {
                C10705e2 e2Var = (C10705e2) bVar;
                c0Var.mo26704a(e2Var, e2Var.mo26661n0(c0Var.f28219a));
            }
            return c0Var;
        }
    }

    /* renamed from: a */
    public static final void m36610a(C10381g gVar, Object obj) {
        if (obj != f28271a) {
            if (obj instanceof C10734c0) {
                ((C10734c0) obj).mo26705b(gVar);
                return;
            }
            Object fold = gVar.fold(null, f28273c);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((C10705e2) fold).mo26660X(gVar, obj);
        }
    }

    /* renamed from: b */
    public static final Object m36611b(C10381g gVar) {
        Object fold = gVar.fold(0, f28272b);
        C10457l.m35317b(fold);
        return fold;
    }

    /* renamed from: c */
    public static final Object m36612c(C10381g gVar, Object obj) {
        if (obj == null) {
            obj = m36611b(gVar);
        }
        return obj == 0 ? f28271a : obj instanceof Integer ? gVar.fold(new C10734c0(gVar, ((Number) obj).intValue()), f28274d) : ((C10705e2) obj).mo26661n0(gVar);
    }
}
