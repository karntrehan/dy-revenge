package p455g.p461u;

import java.util.Comparator;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.u.b */
class C10367b {
    /* renamed from: a */
    public static <T extends Comparable<?>> int m35206a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    /* renamed from: b */
    public static <T extends Comparable<? super T>> Comparator<T> m35207b() {
        C10370e eVar = C10370e.f27564f;
        C10457l.m35318c(eVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return eVar;
    }
}
