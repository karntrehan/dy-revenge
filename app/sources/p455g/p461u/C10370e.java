package p455g.p461u;

import java.util.Comparator;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.u.e */
final class C10370e implements Comparator<Comparable<? super Object>> {

    /* renamed from: f */
    public static final C10370e f27564f = new C10370e();

    private C10370e() {
    }

    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        C10457l.m35320e(comparable, "a");
        C10457l.m35320e(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return C10371f.f27565f;
    }
}
