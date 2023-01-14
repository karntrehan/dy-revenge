package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.g.ta */
final class C7013ta {

    /* renamed from: a */
    private static final Class f18957a;

    /* renamed from: b */
    private static final C6854jb f18958b = m26553C(false);

    /* renamed from: c */
    private static final C6854jb f18959c = m26553C(true);

    /* renamed from: d */
    private static final C6854jb f18960d = new C6886lb();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f18957a = cls;
    }

    /* renamed from: A */
    static int m26551A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C6819h8.m25806a(i << 3) + 1);
    }

    /* renamed from: B */
    static void m26552B(C6720ba baVar, Object obj, Object obj2, long j) {
        C7014tb.m26633x(obj, j, C6720ba.m25467b(C7014tb.m26620k(obj, j), C7014tb.m26620k(obj2, j)));
    }

    /* renamed from: C */
    private static C6854jb m26553C(boolean z) {
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
            return (C6854jb) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    static int m26554D(List list) {
        return list.size();
    }

    /* renamed from: E */
    static int m26555E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * C6819h8.m25805D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            D += C6819h8.m25810x((C7106z7) list.get(i2));
        }
        return D;
    }

    /* renamed from: F */
    static int m26556F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26557G(list) + (size * C6819h8.m25805D(i));
    }

    /* renamed from: G */
    static int m26557G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6719b9) {
            C6719b9 b9Var = (C6719b9) list;
            i = 0;
            while (i2 < size) {
                i += C6819h8.m25812z(b9Var.mo19571g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C6819h8.m25812z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    static int m26558H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C6819h8.m25806a(i << 3) + 4);
    }

    /* renamed from: I */
    static int m26559I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    static int m26560J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C6819h8.m25806a(i << 3) + 8);
    }

    /* renamed from: K */
    static int m26561K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    static int m26562L(int i, List list, C6981ra raVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C6819h8.m25811y(i, (C6805ga) list.get(i3), raVar);
        }
        return i2;
    }

    /* renamed from: M */
    static int m26563M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26564N(list) + (size * C6819h8.m25805D(i));
    }

    /* renamed from: N */
    static int m26564N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6719b9) {
            C6719b9 b9Var = (C6719b9) list;
            i = 0;
            while (i2 < size) {
                i += C6819h8.m25812z(b9Var.mo19571g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C6819h8.m25812z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m26565O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m26566P(list) + (list.size() * C6819h8.m25805D(i));
    }

    /* renamed from: P */
    static int m26566P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7044v9) {
            C7044v9 v9Var = (C7044v9) list;
            i = 0;
            while (i2 < size) {
                i += C6819h8.m25807b(v9Var.mo19763e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C6819h8.m25807b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m26567Q(int i, Object obj, C6981ra raVar) {
        if (!(obj instanceof C6884l9)) {
            return C6819h8.m25806a(i << 3) + C6819h8.m25803B((C6805ga) obj, raVar);
        }
        int a = C6819h8.m25806a(i << 3);
        int a2 = ((C6884l9) obj).mo19944a();
        return a + C6819h8.m25806a(a2) + a2;
    }

    /* renamed from: R */
    static int m26568R(int i, List list, C6981ra raVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = C6819h8.m25805D(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            D += obj instanceof C6884l9 ? C6819h8.m25802A((C6884l9) obj) : C6819h8.m25803B((C6805ga) obj, raVar);
        }
        return D;
    }

    /* renamed from: S */
    static int m26569S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26570T(list) + (size * C6819h8.m25805D(i));
    }

    /* renamed from: T */
    static int m26570T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6719b9) {
            C6719b9 b9Var = (C6719b9) list;
            i = 0;
            while (i2 < size) {
                int g = b9Var.mo19571g(i2);
                i += C6819h8.m25806a((g >> 31) ^ (g + g));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + C6819h8.m25806a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m26571U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26572V(list) + (size * C6819h8.m25805D(i));
    }

    /* renamed from: V */
    static int m26572V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7044v9) {
            C7044v9 v9Var = (C7044v9) list;
            i = 0;
            while (i2 < size) {
                long e = v9Var.mo19763e(i2);
                i += C6819h8.m25807b((e >> 63) ^ (e + e));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + C6819h8.m25807b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    static int m26573W(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int D = C6819h8.m25805D(i) * size;
        if (list instanceof C6916n9) {
            C6916n9 n9Var = (C6916n9) list;
            while (i2 < size) {
                Object i3 = n9Var.mo19957i(i2);
                D += i3 instanceof C7106z7 ? C6819h8.m25810x((C7106z7) i3) : C6819h8.m25804C((String) i3);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                D += obj instanceof C7106z7 ? C6819h8.m25810x((C7106z7) obj) : C6819h8.m25804C((String) obj);
                i2++;
            }
        }
        return D;
    }

    /* renamed from: X */
    static int m26574X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26575Y(list) + (size * C6819h8.m25805D(i));
    }

    /* renamed from: Y */
    static int m26575Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6719b9) {
            C6719b9 b9Var = (C6719b9) list;
            i = 0;
            while (i2 < size) {
                i += C6819h8.m25806a(b9Var.mo19571g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C6819h8.m25806a(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    static int m26576Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26578a0(list) + (size * C6819h8.m25805D(i));
    }

    /* renamed from: a */
    public static C6854jb m26577a() {
        return f18959c;
    }

    /* renamed from: a0 */
    static int m26578a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7044v9) {
            C7044v9 v9Var = (C7044v9) list;
            i = 0;
            while (i2 < size) {
                i += C6819h8.m25807b(v9Var.mo19763e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C6819h8.m25807b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C6854jb m26579b() {
        return f18960d;
    }

    /* renamed from: b0 */
    public static C6854jb m26580b0() {
        return f18958b;
    }

    /* renamed from: c */
    static Object m26581c(int i, List list, C6753d9 d9Var, Object obj, C6854jb jbVar) {
        if (d9Var == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (d9Var.mo19609e(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = m26582d(i, intValue, obj, jbVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!d9Var.mo19609e(intValue2)) {
                    obj = m26582d(i, intValue2, obj, jbVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: d */
    static Object m26582d(int i, int i2, Object obj, C6854jb jbVar) {
        if (obj == null) {
            obj = jbVar.mo19905e();
        }
        jbVar.mo19906f(obj, i, (long) i2);
        return obj;
    }

    /* renamed from: e */
    static void m26583e(C6915n8 n8Var, Object obj, Object obj2) {
        n8Var.mo19998a(obj2);
        throw null;
    }

    /* renamed from: f */
    static void m26584f(C6854jb jbVar, Object obj, Object obj2) {
        jbVar.mo19908h(obj, jbVar.mo19904d(jbVar.mo19903c(obj), jbVar.mo19903c(obj2)));
    }

    /* renamed from: g */
    public static void m26585g(Class cls) {
        Class cls2;
        if (!C6702a9.class.isAssignableFrom(cls) && (cls2 = f18957a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static void m26586h(int i, List list, C6739cc ccVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19634i(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m26587i(int i, List list, C6739cc ccVar) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19628c(i, list);
        }
    }

    /* renamed from: j */
    public static void m26588j(int i, List list, C6739cc ccVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19617B(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m26589k(int i, List list, C6739cc ccVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19640o(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m26590l(int i, List list, C6739cc ccVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19637l(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m26591m(int i, List list, C6739cc ccVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19645t(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m26592n(int i, List list, C6739cc ccVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19620E(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m26593o(int i, List list, C6739cc ccVar, C6981ra raVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C6835i8) ccVar).mo19650y(i, list.get(i2), raVar);
            }
        }
    }

    /* renamed from: p */
    public static void m26594p(int i, List list, C6739cc ccVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19638m(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m26595q(int i, List list, C6739cc ccVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19649x(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m26596r(int i, List list, C6739cc ccVar, C6981ra raVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C6835i8) ccVar).mo19621F(i, list.get(i2), raVar);
            }
        }
    }

    /* renamed from: s */
    public static void m26597s(int i, List list, C6739cc ccVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19616A(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m26598t(int i, List list, C6739cc ccVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19627b(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m26599u(int i, List list, C6739cc ccVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19648w(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m26600v(int i, List list, C6739cc ccVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19623H(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m26601w(int i, List list, C6739cc ccVar) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19643r(i, list);
        }
    }

    /* renamed from: x */
    public static void m26602x(int i, List list, C6739cc ccVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19636k(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m26603y(int i, List list, C6739cc ccVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ccVar.mo19651z(i, list, z);
        }
    }

    /* renamed from: z */
    static boolean m26604z(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
