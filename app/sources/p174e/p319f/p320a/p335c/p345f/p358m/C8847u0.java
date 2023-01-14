package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.m.u0 */
public final class C8847u0 {
    /* renamed from: a */
    public static <F, T> List<T> m29704a(List<F> list, C8806qb<? super F, ? extends T> qbVar) {
        return list instanceof RandomAccess ? new C8808r0(list, qbVar) : new C8834t0(list, qbVar);
    }
}
