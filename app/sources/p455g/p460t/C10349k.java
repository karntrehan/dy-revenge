package p455g.p460t;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.t.k */
class C10349k {
    /* renamed from: a */
    public static final <T> Object[] m35132a(T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        C10457l.m35320e(tArr, "<this>");
        if (z && C10457l.m35316a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C10457l.m35319d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    /* renamed from: b */
    public static <T> List<T> m35133b(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C10457l.m35319d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
