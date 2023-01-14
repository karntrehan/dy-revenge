package p174e.p319f.p393c.p394a.p404z.p405a;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9563v;

/* renamed from: e.f.c.a.z.a.j1 */
final class C9489j1 {

    /* renamed from: a */
    private static final Class<?> f25399a = m31810B();

    /* renamed from: b */
    private static final C9522o1<?, ?> f25400b = m31811C(false);

    /* renamed from: c */
    private static final C9522o1<?, ?> f25401c = m31811C(true);

    /* renamed from: d */
    private static final C9522o1<?, ?> f25402d = new C9529q1();

    /* renamed from: A */
    static <UT, UB> UB m31809A(int i, List<Integer> list, C9431b0.C9436e eVar, UB ub, C9522o1<UT, UB> o1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.mo23510a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m31820L(i, intValue, ub, o1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.mo23510a(intValue2)) {
                    ub = m31820L(i, intValue2, ub, o1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B */
    private static Class<?> m31810B() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    private static C9522o1<?, ?> m31811C(boolean z) {
        try {
            Class<?> D = m31812D();
            if (D == null) {
                return null;
            }
            return (C9522o1) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static Class<?> m31812D() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    static <T, FT extends C9563v.C9565b<FT>> void m31813E(C9530r<FT> rVar, T t, T t2) {
        C9563v<FT> c = rVar.mo23949c(t2);
        if (!c.mo24021m()) {
            rVar.mo23950d(t).mo24026t(c);
        }
    }

    /* renamed from: F */
    static <T> void m31814F(C9518n0 n0Var, T t, T t2, long j) {
        C9539s1.m32314O(t, j, n0Var.mo23889a(C9539s1.m32300A(t, j), C9539s1.m32300A(t2, j)));
    }

    /* renamed from: G */
    static <T, UT, UB> void m31815G(C9522o1<UT, UB> o1Var, T t, T t2) {
        o1Var.mo23913p(t, o1Var.mo23908k(o1Var.mo23904g(t), o1Var.mo23904g(t2)));
    }

    /* renamed from: H */
    public static C9522o1<?, ?> m31816H() {
        return f25400b;
    }

    /* renamed from: I */
    public static C9522o1<?, ?> m31817I() {
        return f25401c;
    }

    /* renamed from: J */
    public static void m31818J(Class<?> cls) {
        Class<?> cls2;
        if (!C9577z.class.isAssignableFrom(cls) && (cls2 = f25399a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: K */
    static boolean m31819K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: L */
    static <UT, UB> UB m31820L(int i, int i2, UB ub, C9522o1<UT, UB> o1Var) {
        if (ub == null) {
            ub = o1Var.mo23911n();
        }
        o1Var.mo23902e(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: M */
    public static C9522o1<?, ?> m31821M() {
        return f25402d;
    }

    /* renamed from: N */
    public static void m31822N(int i, List<Boolean> list, C9567v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23821B(i, list, z);
        }
    }

    /* renamed from: O */
    public static void m31823O(int i, List<C9468i> list, C9567v1 v1Var) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23834O(i, list);
        }
    }

    /* renamed from: P */
    public static void m31824P(int i, List<Double> list, C9567v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23832M(i, list, z);
        }
    }

    /* renamed from: Q */
    public static void m31825Q(int i, List<Integer> list, C9567v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23831L(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m31826R(int i, List<Integer> list, C9567v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23820A(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m31827S(int i, List<Long> list, C9567v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23858x(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m31828T(int i, List<Float> list, C9567v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23835a(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m31829U(int i, List<?> list, C9567v1 v1Var, C9467h1 h1Var) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23850p(i, list, h1Var);
        }
    }

    /* renamed from: V */
    public static void m31830V(int i, List<Integer> list, C9567v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23851q(i, list, z);
        }
    }

    /* renamed from: W */
    public static void m31831W(int i, List<Long> list, C9567v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23830K(i, list, z);
        }
    }

    /* renamed from: X */
    public static void m31832X(int i, List<?> list, C9567v1 v1Var, C9467h1 h1Var) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23854t(i, list, h1Var);
        }
    }

    /* renamed from: Y */
    public static void m31833Y(int i, List<Integer> list, C9567v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23859y(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m31834Z(int i, List<Long> list, C9567v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23840f(i, list, z);
        }
    }

    /* renamed from: a */
    static int m31835a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? C9504l.m31975U(i) + C9504l.m31957C(size) : size * C9504l.m31983d(i, true);
    }

    /* renamed from: a0 */
    public static void m31836a0(int i, List<Integer> list, C9567v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23828I(i, list, z);
        }
    }

    /* renamed from: b */
    static int m31837b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m31838b0(int i, List<Long> list, C9567v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23824E(i, list, z);
        }
    }

    /* renamed from: c */
    static int m31839c(int i, List<C9468i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = size * C9504l.m31975U(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            U += C9504l.m31989h(list.get(i2));
        }
        return U;
    }

    /* renamed from: c0 */
    public static void m31840c0(int i, List<String> list, C9567v1 v1Var) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23846l(i, list);
        }
    }

    /* renamed from: d */
    static int m31841d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = m31843e(list);
        int U = C9504l.m31975U(i);
        return z ? U + C9504l.m31957C(e) : e + (size * U);
    }

    /* renamed from: d0 */
    public static void m31842d0(int i, List<Integer> list, C9567v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23823D(i, list, z);
        }
    }

    /* renamed from: e */
    static int m31843e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9428a0) {
            C9428a0 a0Var = (C9428a0) list;
            i = 0;
            while (i2 < size) {
                i += C9504l.m31993l(a0Var.mo23499r(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9504l.m31993l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public static void m31844e0(int i, List<Long> list, C9567v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.mo23842h(i, list, z);
        }
    }

    /* renamed from: f */
    static int m31845f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? C9504l.m31975U(i) + C9504l.m31957C(size * 4) : size * C9504l.m31994m(i, 0);
    }

    /* renamed from: g */
    static int m31846g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    static int m31847h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? C9504l.m31975U(i) + C9504l.m31957C(size * 8) : size * C9504l.m31996o(i, 0);
    }

    /* renamed from: i */
    static int m31848i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    static int m31849j(int i, List<C9537s0> list, C9467h1 h1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C9504l.m32000s(i, list.get(i3), h1Var);
        }
        return i2;
    }

    /* renamed from: k */
    static int m31850k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = m31851l(list);
        int U = C9504l.m31975U(i);
        return z ? U + C9504l.m31957C(l) : l + (size * U);
    }

    /* renamed from: l */
    static int m31851l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9428a0) {
            C9428a0 a0Var = (C9428a0) list;
            i = 0;
            while (i2 < size) {
                i += C9504l.m32004w(a0Var.mo23499r(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9504l.m32004w(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    static int m31852m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = m31853n(list);
        return z ? C9504l.m31975U(i) + C9504l.m31957C(n) : n + (list.size() * C9504l.m31975U(i));
    }

    /* renamed from: n */
    static int m31853n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9488j0) {
            C9488j0 j0Var = (C9488j0) list;
            i = 0;
            while (i2 < size) {
                i += C9504l.m32006y(j0Var.mo23716r(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9504l.m32006y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    static int m31854o(int i, Object obj, C9467h1 h1Var) {
        return obj instanceof C9460f0 ? C9504l.m31955A(i, (C9460f0) obj) : C9504l.m31960F(i, (C9537s0) obj, h1Var);
    }

    /* renamed from: p */
    static int m31855p(int i, List<?> list, C9467h1 h1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = C9504l.m31975U(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            U += obj instanceof C9460f0 ? C9504l.m31956B((C9460f0) obj) : C9504l.m31962H((C9537s0) obj, h1Var);
        }
        return U;
    }

    /* renamed from: q */
    static int m31856q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = m31857r(list);
        int U = C9504l.m31975U(i);
        return z ? U + C9504l.m31957C(r) : r + (size * U);
    }

    /* renamed from: r */
    static int m31857r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9428a0) {
            C9428a0 a0Var = (C9428a0) list;
            i = 0;
            while (i2 < size) {
                i += C9504l.m31970P(a0Var.mo23499r(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9504l.m31970P(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    static int m31858s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = m31859t(list);
        int U = C9504l.m31975U(i);
        return z ? U + C9504l.m31957C(t) : t + (size * U);
    }

    /* renamed from: t */
    static int m31859t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9488j0) {
            C9488j0 j0Var = (C9488j0) list;
            i = 0;
            while (i2 < size) {
                i += C9504l.m31972R(j0Var.mo23716r(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9504l.m31972R(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    static int m31860u(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int U = C9504l.m31975U(i) * size;
        if (list instanceof C9466h0) {
            C9466h0 h0Var = (C9466h0) list;
            while (i2 < size) {
                Object x = h0Var.mo23627x(i2);
                U += x instanceof C9468i ? C9504l.m31989h((C9468i) x) : C9504l.m31974T((String) x);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                U += obj instanceof C9468i ? C9504l.m31989h((C9468i) obj) : C9504l.m31974T((String) obj);
                i2++;
            }
        }
        return U;
    }

    /* renamed from: v */
    static int m31861v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = m31862w(list);
        int U = C9504l.m31975U(i);
        return z ? U + C9504l.m31957C(w) : w + (size * U);
    }

    /* renamed from: w */
    static int m31862w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9428a0) {
            C9428a0 a0Var = (C9428a0) list;
            i = 0;
            while (i2 < size) {
                i += C9504l.m31977W(a0Var.mo23499r(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9504l.m31977W(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    static int m31863x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = m31864y(list);
        int U = C9504l.m31975U(i);
        return z ? U + C9504l.m31957C(y) : y + (size * U);
    }

    /* renamed from: y */
    static int m31864y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9488j0) {
            C9488j0 j0Var = (C9488j0) list;
            i = 0;
            while (i2 < size) {
                i += C9504l.m31979Y(j0Var.mo23716r(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C9504l.m31979Y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    static <UT, UB> UB m31865z(int i, List<Integer> list, C9431b0.C9435d<?> dVar, UB ub, C9522o1<UT, UB> o1Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dVar.mo23424a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m31820L(i, intValue, ub, o1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.mo23424a(intValue2) == null) {
                    ub = m31820L(i, intValue2, ub, o1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
