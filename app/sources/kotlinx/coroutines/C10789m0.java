package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.C10735d;
import kotlinx.coroutines.internal.C10761t;
import kotlinx.coroutines.p506l2.C10787b;
import p455g.p462v.C10376d;
import p455g.p462v.C10381g;
import p455g.p462v.p464k.p465a.C10403h;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.m0 */
public final class C10789m0 {
    /* renamed from: a */
    public static final C10784l0 m36646a(C10381g gVar) {
        if (gVar.get(C10812n1.f28353n) == null) {
            gVar = gVar.plus(C10829s1.m36806b((C10812n1) null, 1, (Object) null));
        }
        return new C10735d(gVar);
    }

    /* renamed from: b */
    public static final void m36647b(C10784l0 l0Var, String str, Throwable th) {
        m36648c(l0Var, C10710f1.m36432a(str, th));
    }

    /* renamed from: c */
    public static final void m36648c(C10784l0 l0Var, CancellationException cancellationException) {
        C10812n1 n1Var = (C10812n1) l0Var.mo26649f().get(C10812n1.f28353n);
        if (n1Var != null) {
            n1Var.mo26812i0(cancellationException);
            return;
        }
        throw new IllegalStateException(C10457l.m35326k("Scope cannot be cancelled because it does not have a job: ", l0Var).toString());
    }

    /* renamed from: d */
    public static /* synthetic */ void m36649d(C10784l0 l0Var, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m36647b(l0Var, str, th);
    }

    /* renamed from: e */
    public static final <R> Object m36650e(C10434p<? super C10784l0, ? super C10376d<? super R>, ? extends Object> pVar, C10376d<? super R> dVar) {
        C10761t tVar = new C10761t(dVar.mo25781a(), dVar);
        Object b = C10787b.m36644b(tVar, tVar, pVar);
        if (b == C10395d.m35244c()) {
            C10403h.m35274c(dVar);
        }
        return b;
    }

    /* renamed from: f */
    public static final boolean m36651f(C10784l0 l0Var) {
        C10812n1 n1Var = (C10812n1) l0Var.mo26649f().get(C10812n1.f28353n);
        if (n1Var == null) {
            return true;
        }
        return n1Var.mo26647b();
    }
}
