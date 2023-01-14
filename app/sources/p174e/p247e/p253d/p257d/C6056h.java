package p174e.p247e.p253d.p257d;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: e.e.d.d.h */
public class C6056h<E> extends HashSet<E> {
    private C6056h(Set<E> set) {
        super(set);
    }

    /* renamed from: g */
    public static <E> C6056h<E> m22823g(E... eArr) {
        HashSet hashSet = new HashSet(eArr.length);
        Collections.addAll(hashSet, eArr);
        return new C6056h<>(hashSet);
    }
}
