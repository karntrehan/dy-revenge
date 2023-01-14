package p455g.p470y.p472d;

import java.util.Collection;
import java.util.List;
import p455g.C10263c;
import p455g.p470y.p471c.C10419a;
import p455g.p470y.p471c.C10420b;
import p455g.p470y.p471c.C10421c;
import p455g.p470y.p471c.C10422d;
import p455g.p470y.p471c.C10423e;
import p455g.p470y.p471c.C10424f;
import p455g.p470y.p471c.C10425g;
import p455g.p470y.p471c.C10426h;
import p455g.p470y.p471c.C10427i;
import p455g.p470y.p471c.C10428j;
import p455g.p470y.p471c.C10429k;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p471c.C10431m;
import p455g.p470y.p471c.C10432n;
import p455g.p470y.p471c.C10433o;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p471c.C10435q;
import p455g.p470y.p471c.C10436r;
import p455g.p470y.p471c.C10437s;
import p455g.p470y.p471c.C10438t;
import p455g.p470y.p471c.C10439u;
import p455g.p470y.p471c.C10440v;
import p455g.p470y.p471c.C10441w;
import p455g.p470y.p472d.p473b0.C10445a;

/* renamed from: g.y.d.a0 */
public class C10443a0 {
    /* renamed from: a */
    public static Collection m35293a(Object obj) {
        if (obj instanceof C10445a) {
            m35302j(obj, "kotlin.collections.MutableCollection");
        }
        return m35296d(obj);
    }

    /* renamed from: b */
    public static List m35294b(Object obj) {
        if (obj instanceof C10445a) {
            m35302j(obj, "kotlin.collections.MutableList");
        }
        return m35297e(obj);
    }

    /* renamed from: c */
    public static Object m35295c(Object obj, int i) {
        if (obj != null && !m35299g(obj, i)) {
            m35302j(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: d */
    public static Collection m35296d(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m35301i(e);
        }
    }

    /* renamed from: e */
    public static List m35297e(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m35301i(e);
        }
    }

    /* renamed from: f */
    public static int m35298f(Object obj) {
        if (obj instanceof C10453h) {
            return ((C10453h) obj).getArity();
        }
        if (obj instanceof C10419a) {
            return 0;
        }
        if (obj instanceof C10430l) {
            return 1;
        }
        if (obj instanceof C10434p) {
            return 2;
        }
        if (obj instanceof C10435q) {
            return 3;
        }
        if (obj instanceof C10436r) {
            return 4;
        }
        if (obj instanceof C10437s) {
            return 5;
        }
        if (obj instanceof C10438t) {
            return 6;
        }
        if (obj instanceof C10439u) {
            return 7;
        }
        if (obj instanceof C10440v) {
            return 8;
        }
        if (obj instanceof C10441w) {
            return 9;
        }
        if (obj instanceof C10420b) {
            return 10;
        }
        if (obj instanceof C10421c) {
            return 11;
        }
        if (obj instanceof C10422d) {
            return 12;
        }
        if (obj instanceof C10423e) {
            return 13;
        }
        if (obj instanceof C10424f) {
            return 14;
        }
        if (obj instanceof C10425g) {
            return 15;
        }
        if (obj instanceof C10426h) {
            return 16;
        }
        if (obj instanceof C10427i) {
            return 17;
        }
        if (obj instanceof C10428j) {
            return 18;
        }
        if (obj instanceof C10429k) {
            return 19;
        }
        if (obj instanceof C10431m) {
            return 20;
        }
        if (obj instanceof C10432n) {
            return 21;
        }
        return obj instanceof C10433o ? 22 : -1;
    }

    /* renamed from: g */
    public static boolean m35299g(Object obj, int i) {
        return (obj instanceof C10263c) && m35298f(obj) == i;
    }

    /* renamed from: h */
    private static <T extends Throwable> T m35300h(T t) {
        return C10457l.m35325j(t, C10443a0.class.getName());
    }

    /* renamed from: i */
    public static ClassCastException m35301i(ClassCastException classCastException) {
        throw ((ClassCastException) m35300h(classCastException));
    }

    /* renamed from: j */
    public static void m35302j(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m35303k(name + " cannot be cast to " + str);
    }

    /* renamed from: k */
    public static void m35303k(String str) {
        throw m35301i(new ClassCastException(str));
    }
}
