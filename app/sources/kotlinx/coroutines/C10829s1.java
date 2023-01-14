package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p455g.p462v.C10381g;

/* renamed from: kotlinx.coroutines.s1 */
final /* synthetic */ class C10829s1 {
    /* renamed from: a */
    public static final C10842w m36805a(C10812n1 n1Var) {
        return new C10823q1(n1Var);
    }

    /* renamed from: b */
    public static /* synthetic */ C10842w m36806b(C10812n1 n1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            n1Var = null;
        }
        return C10826r1.m36798a(n1Var);
    }

    /* renamed from: c */
    public static final void m36807c(C10381g gVar, CancellationException cancellationException) {
        C10812n1 n1Var = (C10812n1) gVar.get(C10812n1.f28353n);
        if (n1Var != null) {
            n1Var.mo26812i0(cancellationException);
        }
    }

    /* renamed from: d */
    public static final void m36808d(C10381g gVar) {
        C10812n1 n1Var = (C10812n1) gVar.get(C10812n1.f28353n);
        if (n1Var != null) {
            C10826r1.m36802e(n1Var);
        }
    }

    /* renamed from: e */
    public static final void m36809e(C10812n1 n1Var) {
        if (!n1Var.mo26647b()) {
            throw n1Var.mo26810E();
        }
    }
}
