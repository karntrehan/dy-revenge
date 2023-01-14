package p455g.p461u;

import java.util.Comparator;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.u.f */
final class C10371f implements Comparator<Comparable<? super Object>> {

    /* renamed from: f */
    public static final C10371f f27565f = new C10371f();

    private C10371f() {
    }

    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        C10457l.m35320e(comparable, "a");
        C10457l.m35320e(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return C10370e.f27564f;
    }
}
