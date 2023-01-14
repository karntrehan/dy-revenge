package p027c.p043d.p044a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: c.d.a.y0 */
public class C1727y0 {

    /* renamed from: a */
    public static final C1727y0 f5140a;

    /* renamed from: b */
    public static final C1727y0 f5141b;

    /* renamed from: c */
    public static final C1727y0 f5142c;

    /* renamed from: d */
    public static final C1727y0 f5143d;

    /* renamed from: e */
    public static final C1727y0 f5144e;

    /* renamed from: f */
    public static final C1727y0 f5145f;

    /* renamed from: g */
    static final C1727y0 f5146g = C1729b.m7382e(-1, "NONE");

    /* renamed from: h */
    private static final Set<C1727y0> f5147h;

    /* renamed from: i */
    private static final List<C1727y0> f5148i;

    /* renamed from: c.d.a.y0$b */
    static abstract class C1729b extends C1727y0 {
        C1729b() {
            super();
        }

        /* renamed from: e */
        static C1729b m7382e(int i, String str) {
            return new C1565l0(i, str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract String mo5724c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract int mo5725d();
    }

    static {
        C1729b e = C1729b.m7382e(4, "SD");
        f5140a = e;
        C1729b e2 = C1729b.m7382e(5, "HD");
        f5141b = e2;
        C1729b e3 = C1729b.m7382e(6, "FHD");
        f5142c = e3;
        C1729b e4 = C1729b.m7382e(8, "UHD");
        f5143d = e4;
        C1729b e5 = C1729b.m7382e(0, "LOWEST");
        f5144e = e5;
        C1729b e6 = C1729b.m7382e(1, "HIGHEST");
        f5145f = e6;
        f5147h = new HashSet(Arrays.asList(new C1727y0[]{e5, e6, e, e2, e3, e4}));
        f5148i = Arrays.asList(new C1727y0[]{e4, e3, e2, e});
    }

    private C1727y0() {
    }

    /* renamed from: a */
    static boolean m7380a(C1727y0 y0Var) {
        return f5147h.contains(y0Var);
    }

    /* renamed from: b */
    static List<C1727y0> m7381b() {
        return new ArrayList(f5148i);
    }
}
