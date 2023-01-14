package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p455g.C10323s;
import p455g.p462v.C10381g;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p471c.C10434p;

/* renamed from: kotlinx.coroutines.n1 */
public interface C10812n1 extends C10381g.C10384b {

    /* renamed from: n */
    public static final C10814b f28353n = C10814b.f28354f;

    /* renamed from: kotlinx.coroutines.n1$a */
    public static final class C10813a {
        /* renamed from: a */
        public static <R> R m36734a(C10812n1 n1Var, R r, C10434p<? super R, ? super C10381g.C10384b, ? extends R> pVar) {
            return C10381g.C10384b.C10385a.m35227a(n1Var, r, pVar);
        }

        /* renamed from: b */
        public static <E extends C10381g.C10384b> E m36735b(C10812n1 n1Var, C10381g.C10386c<E> cVar) {
            return C10381g.C10384b.C10385a.m35228b(n1Var, cVar);
        }

        /* renamed from: c */
        public static /* synthetic */ C10849y0 m36736c(C10812n1 n1Var, boolean z, boolean z2, C10430l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return n1Var.mo26809A(z, z2, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: d */
        public static C10381g m36737d(C10812n1 n1Var, C10381g.C10386c<?> cVar) {
            return C10381g.C10384b.C10385a.m35229c(n1Var, cVar);
        }

        /* renamed from: e */
        public static C10381g m36738e(C10812n1 n1Var, C10381g gVar) {
            return C10381g.C10384b.C10385a.m35230d(n1Var, gVar);
        }
    }

    /* renamed from: kotlinx.coroutines.n1$b */
    public static final class C10814b implements C10381g.C10386c<C10812n1> {

        /* renamed from: f */
        static final /* synthetic */ C10814b f28354f = new C10814b();

        private C10814b() {
        }
    }

    /* renamed from: A */
    C10849y0 mo26809A(boolean z, boolean z2, C10430l<? super Throwable, C10323s> lVar);

    /* renamed from: E */
    CancellationException mo26810E();

    /* renamed from: W */
    C10849y0 mo26811W(C10430l<? super Throwable, C10323s> lVar);

    /* renamed from: b */
    boolean mo26647b();

    /* renamed from: i0 */
    void mo26812i0(CancellationException cancellationException);

    /* renamed from: s0 */
    C10827s mo26813s0(C10833u uVar);

    boolean start();
}
