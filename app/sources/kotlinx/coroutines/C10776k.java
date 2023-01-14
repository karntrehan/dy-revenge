package kotlinx.coroutines;

import kotlinx.coroutines.internal.C10761t;
import kotlinx.coroutines.internal.C10767z;
import kotlinx.coroutines.p506l2.C10786a;
import kotlinx.coroutines.p506l2.C10787b;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p462v.C10377e;
import p455g.p462v.C10381g;
import p455g.p462v.C10387h;
import p455g.p462v.p464k.p465a.C10403h;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.k */
final /* synthetic */ class C10776k {
    /* renamed from: a */
    public static final <T> C10828s0<T> m36625a(C10784l0 l0Var, C10381g gVar, C10810n0 n0Var, C10434p<? super C10784l0, ? super C10376d<? super T>, ? extends Object> pVar) {
        C10381g c = C10703e0.m36420c(l0Var, gVar);
        C10831t0 w1Var = n0Var.mo26808h() ? new C10844w1(c, pVar) : new C10831t0(c, true);
        w1Var.mo26644A0(n0Var, w1Var, pVar);
        return w1Var;
    }

    /* renamed from: b */
    public static /* synthetic */ C10828s0 m36626b(C10784l0 l0Var, C10381g gVar, C10810n0 n0Var, C10434p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C10387h.f27574f;
        }
        if ((i & 2) != 0) {
            n0Var = C10810n0.DEFAULT;
        }
        return C10771j.m36619a(l0Var, gVar, n0Var, pVar);
    }

    /* renamed from: c */
    public static final C10812n1 m36627c(C10784l0 l0Var, C10381g gVar, C10810n0 n0Var, C10434p<? super C10784l0, ? super C10376d<? super C10323s>, ? extends Object> pVar) {
        C10381g c = C10703e0.m36420c(l0Var, gVar);
        C10694c x1Var = n0Var.mo26808h() ? new C10847x1(c, pVar) : new C10701d2(c, true);
        x1Var.mo26644A0(n0Var, x1Var, pVar);
        return x1Var;
    }

    /* renamed from: d */
    public static /* synthetic */ C10812n1 m36628d(C10784l0 l0Var, C10381g gVar, C10810n0 n0Var, C10434p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C10387h.f27574f;
        }
        if ((i & 2) != 0) {
            n0Var = C10810n0.DEFAULT;
        }
        return C10771j.m36621c(l0Var, gVar, n0Var, pVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public static final <T> Object m36629e(C10381g gVar, C10434p<? super C10784l0, ? super C10376d<? super T>, ? extends Object> pVar, C10376d<? super T> dVar) {
        Object obj;
        C10381g a = dVar.mo25781a();
        C10381g plus = a.plus(gVar);
        C10826r1.m36801d(plus);
        if (plus == a) {
            C10761t tVar = new C10761t(plus, dVar);
            obj = C10787b.m36644b(tVar, tVar, pVar);
        } else {
            C10377e.C10379b bVar = C10377e.f27571l;
            if (C10457l.m35316a(plus.get(bVar), a.get(bVar))) {
                C10723h2 h2Var = new C10723h2(plus, dVar);
                Object c = C10767z.m36612c(plus, (Object) null);
                try {
                    Object b = C10787b.m36644b(h2Var, h2Var, pVar);
                    C10767z.m36610a(plus, c);
                    obj = b;
                } catch (Throwable th) {
                    C10767z.m36610a(plus, c);
                    throw th;
                }
            } else {
                C10834u0 u0Var = new C10834u0(plus, dVar);
                C10786a.m36642e(pVar, u0Var, u0Var, (C10430l) null, 4, (Object) null);
                obj = u0Var.mo26840B0();
            }
        }
        if (obj == C10395d.m35244c()) {
            C10403h.m35274c(dVar);
        }
        return obj;
    }
}
