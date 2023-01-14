package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.l.xe */
final class C8547xe {

    /* renamed from: a */
    private static final Class<?> f23294a;

    /* renamed from: b */
    private static final C8294jf<?, ?> f23295b = m29255C(false);

    /* renamed from: c */
    private static final C8294jf<?, ?> f23296c = m29255C(true);

    /* renamed from: d */
    private static final C8294jf<?, ?> f23297d = new C8332lf();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f23294a = cls;
    }

    /* renamed from: A */
    static int m29253A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C8310kc.m28674d(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m29254B(int i, List<Long> list, C8329lc lcVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21960l(i, list, z);
        }
    }

    /* renamed from: C */
    private static C8294jf<?, ?> m29255C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C8294jf) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    static int m29256D(List<?> list) {
        return list.size();
    }

    /* renamed from: E */
    static int m29257E(int i, List<C8177dc> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c = size * C8310kc.m28673c(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            c += C8310kc.m28665B(list.get(i2));
        }
        return c;
    }

    /* renamed from: F */
    static int m29258F(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29259G(list) + (size * C8310kc.m28673c(i));
    }

    /* renamed from: G */
    static int m29259G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8216fd) {
            C8216fd fdVar = (C8216fd) list;
            i = 0;
            while (i2 < size) {
                i += C8310kc.m28668E(fdVar.mo21794g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8310kc.m28668E(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    static int m29260H(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C8310kc.m28674d(i << 3) + 4);
    }

    /* renamed from: I */
    static int m29261I(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    static int m29262J(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C8310kc.m28674d(i << 3) + 8);
    }

    /* renamed from: K */
    static int m29263K(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    static int m29264L(int i, List<C8274ie> list, C8511ve veVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C8310kc.m28666C(i, list.get(i3), veVar);
        }
        return i2;
    }

    /* renamed from: M */
    static int m29265M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29266N(list) + (size * C8310kc.m28673c(i));
    }

    /* renamed from: N */
    static int m29266N(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8216fd) {
            C8216fd fdVar = (C8216fd) list;
            i = 0;
            while (i2 < size) {
                i += C8310kc.m28668E(fdVar.mo21794g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8310kc.m28668E(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m29267O(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m29268P(list) + (list.size() * C8310kc.m28673c(i));
    }

    /* renamed from: P */
    static int m29268P(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8546xd) {
            C8546xd xdVar = (C8546xd) list;
            i = 0;
            while (i2 < size) {
                i += C8310kc.m28675e(xdVar.mo22266g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8310kc.m28675e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m29269Q(int i, Object obj, C8511ve veVar) {
        if (!(obj instanceof C8420qd)) {
            return C8310kc.m28674d(i << 3) + C8310kc.m28671a((C8274ie) obj, veVar);
        }
        int d = C8310kc.m28674d(i << 3);
        int a = ((C8420qd) obj).mo22103a();
        return d + C8310kc.m28674d(a) + a;
    }

    /* renamed from: R */
    static int m29270R(int i, List<?> list, C8511ve veVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c = C8310kc.m28673c(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            c += obj instanceof C8420qd ? C8310kc.m28669F((C8420qd) obj) : C8310kc.m28671a((C8274ie) obj, veVar);
        }
        return c;
    }

    /* renamed from: S */
    static int m29271S(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29272T(list) + (size * C8310kc.m28673c(i));
    }

    /* renamed from: T */
    static int m29272T(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8216fd) {
            C8216fd fdVar = (C8216fd) list;
            i = 0;
            while (i2 < size) {
                int g = fdVar.mo21794g(i2);
                i += C8310kc.m28674d((g >> 31) ^ (g + g));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + C8310kc.m28674d((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m29273U(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29274V(list) + (size * C8310kc.m28673c(i));
    }

    /* renamed from: V */
    static int m29274V(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8546xd) {
            C8546xd xdVar = (C8546xd) list;
            i = 0;
            while (i2 < size) {
                long g = xdVar.mo22266g(i2);
                i += C8310kc.m28675e((g >> 63) ^ (g + g));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + C8310kc.m28675e((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    static int m29275W(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int c = C8310kc.m28673c(i) * size;
        if (list instanceof C8456sd) {
            C8456sd sdVar = (C8456sd) list;
            while (i2 < size) {
                Object i3 = sdVar.mo22074i(i2);
                c += i3 instanceof C8177dc ? C8310kc.m28665B((C8177dc) i3) : C8310kc.m28672b((String) i3);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                c += obj instanceof C8177dc ? C8310kc.m28665B((C8177dc) obj) : C8310kc.m28672b((String) obj);
                i2++;
            }
        }
        return c;
    }

    /* renamed from: X */
    static int m29276X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29277Y(list) + (size * C8310kc.m28673c(i));
    }

    /* renamed from: Y */
    static int m29277Y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8216fd) {
            C8216fd fdVar = (C8216fd) list;
            i = 0;
            while (i2 < size) {
                i += C8310kc.m28674d(fdVar.mo21794g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8310kc.m28674d(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    static int m29278Z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29280a0(list) + (size * C8310kc.m28673c(i));
    }

    /* renamed from: a */
    public static C8294jf<?, ?> m29279a() {
        return f23296c;
    }

    /* renamed from: a0 */
    static int m29280a0(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8546xd) {
            C8546xd xdVar = (C8546xd) list;
            i = 0;
            while (i2 < size) {
                i += C8310kc.m28675e(xdVar.mo22266g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8310kc.m28675e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C8294jf<?, ?> m29281b() {
        return f23297d;
    }

    /* renamed from: b0 */
    public static C8294jf<?, ?> m29282b0() {
        return f23295b;
    }

    /* renamed from: c */
    static <UT, UB> UB m29283c(int i, List<Integer> list, C8273id idVar, UB ub, C8294jf<UT, UB> jfVar) {
        if (idVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (idVar.mo21778e(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m29284d(i, intValue, ub, jfVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!idVar.mo21778e(intValue2)) {
                    ub = m29284d(i, intValue2, ub, jfVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: d */
    static <UT, UB> UB m29284d(int i, int i2, UB ub, C8294jf<UT, UB> jfVar) {
        if (ub == null) {
            ub = jfVar.mo21899e();
        }
        jfVar.mo21900f(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: e */
    static <T, FT extends C8491uc<FT>> void m29285e(C8437rc<FT> rcVar, T t, T t2) {
        C8509vc<FT> b = rcVar.mo22110b(t2);
        if (!b.f23187b.isEmpty()) {
            rcVar.mo22111c(t).mo22213i(b);
        }
    }

    /* renamed from: f */
    static <T, UT, UB> void m29286f(C8294jf<UT, UB> jfVar, T t, T t2) {
        jfVar.mo21902h(t, jfVar.mo21898d(jfVar.mo21897c(t), jfVar.mo21897c(t2)));
    }

    /* renamed from: g */
    public static void m29287g(Class<?> cls) {
        Class<?> cls2;
        if (!C8197ed.class.isAssignableFrom(cls) && (cls2 = f23294a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    static boolean m29288h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: i */
    static <T> void m29289i(C8179de deVar, T t, T t2, long j) {
        C8494uf.m29118x(t, j, C8179de.m28433b(C8494uf.m29105k(t, j), C8494uf.m29105k(t2, j)));
    }

    /* renamed from: j */
    public static void m29290j(int i, List<Boolean> list, C8329lc lcVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21962o(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m29291k(int i, List<C8177dc> list, C8329lc lcVar) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21964q(i, list);
        }
    }

    /* renamed from: l */
    public static void m29292l(int i, List<Double> list, C8329lc lcVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21966s(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m29293m(int i, List<Integer> list, C8329lc lcVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21969v(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m29294n(int i, List<Integer> list, C8329lc lcVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21971x(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m29295o(int i, List<Long> list, C8329lc lcVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21973z(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m29296p(int i, List<Float> list, C8329lc lcVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21938B(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m29297q(int i, List<?> list, C8329lc lcVar, C8511ve veVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                lcVar.mo21939C(i, list.get(i2), veVar);
            }
        }
    }

    /* renamed from: r */
    public static void m29298r(int i, List<Integer> list, C8329lc lcVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21941E(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m29299s(int i, List<Long> list, C8329lc lcVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21943G(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m29300t(int i, List<?> list, C8329lc lcVar, C8511ve veVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                lcVar.mo21944H(i, list.get(i2), veVar);
            }
        }
    }

    /* renamed from: u */
    public static void m29301u(int i, List<Integer> list, C8329lc lcVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21947K(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m29302v(int i, List<Long> list, C8329lc lcVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21949a(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m29303w(int i, List<Integer> list, C8329lc lcVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21951c(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m29304x(int i, List<Long> list, C8329lc lcVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21953e(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m29305y(int i, List<String> list, C8329lc lcVar) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21956h(i, list);
        }
    }

    /* renamed from: z */
    public static void m29306z(int i, List<Integer> list, C8329lc lcVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            lcVar.mo21958j(i, list, z);
        }
    }
}
