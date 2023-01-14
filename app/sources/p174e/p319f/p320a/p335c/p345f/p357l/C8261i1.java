package p174e.p319f.p320a.p335c.p345f.p357l;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.l.i1 */
public final class C8261i1 {
    /* renamed from: a */
    public static <T> C8185e1<T> m28560a(C8185e1<T> e1Var) {
        return ((e1Var instanceof C8223g1) || (e1Var instanceof C8204f1)) ? e1Var : e1Var instanceof Serializable ? new C8204f1(e1Var) : new C8223g1(e1Var);
    }

    /* renamed from: b */
    public static <T> C8185e1<T> m28561b(@NullableDecl T t) {
        return new C8242h1(t);
    }
}
