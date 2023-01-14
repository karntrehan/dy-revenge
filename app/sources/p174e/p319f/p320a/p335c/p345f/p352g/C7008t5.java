package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.t5 */
public final class C7008t5 {
    /* renamed from: a */
    public static double m26531a(double d) {
        int i;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || i == 0) {
            return d;
        }
        return ((double) (i > 0 ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    /* renamed from: b */
    public static int m26532b(double d) {
        int i;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((long) ((((double) (i > 0 ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d));
    }

    /* renamed from: c */
    public static int m26533c(C6991s4 s4Var) {
        int b = m26532b(s4Var.mo20146d("runtime.counter").mo19739d().doubleValue() + 1.0d);
        if (b <= 1000000) {
            s4Var.mo20149g("runtime.counter", new C6826i(Double.valueOf((double) b)));
            return b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m26534d(double d) {
        return ((long) m26532b(d)) & 4294967295L;
    }

    /* renamed from: e */
    public static C6907n0 m26535e(String str) {
        C6907n0 n0Var = null;
        if (str != null && !str.isEmpty()) {
            n0Var = C6907n0.m26199e(Integer.parseInt(str));
        }
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    /* renamed from: f */
    public static Object m26536f(C6954q qVar) {
        if (C6954q.f18805d.equals(qVar)) {
            return null;
        }
        if (C6954q.f18804c.equals(qVar)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (qVar instanceof C6906n) {
            return m26537g((C6906n) qVar);
        }
        if (!(qVar instanceof C6777f)) {
            return !qVar.mo19739d().isNaN() ? qVar.mo19739d() : qVar.mo19741g();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C6777f) qVar).iterator();
        while (it.hasNext()) {
            Object f = m26536f((C6954q) it.next());
            if (f != null) {
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static Map m26537g(C6906n nVar) {
        HashMap hashMap = new HashMap();
        for (String str : nVar.mo19972a()) {
            Object f = m26536f(nVar.mo19749r(str));
            if (f != null) {
                hashMap.put(str, f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m26538h(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: i */
    public static void m26539i(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: j */
    public static void m26540j(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: k */
    public static boolean m26541k(C6954q qVar) {
        if (qVar == null) {
            return false;
        }
        Double d = qVar.mo19739d();
        return !d.isNaN() && d.doubleValue() >= 0.0d && d.equals(Double.valueOf(Math.floor(d.doubleValue())));
    }

    /* renamed from: l */
    public static boolean m26542l(C6954q qVar, C6954q qVar2) {
        if (!qVar.getClass().equals(qVar2.getClass())) {
            return false;
        }
        if ((qVar instanceof C7034v) || (qVar instanceof C6922o)) {
            return true;
        }
        if (!(qVar instanceof C6826i)) {
            return qVar instanceof C7018u ? qVar.mo19741g().equals(qVar2.mo19741g()) : qVar instanceof C6794g ? qVar.mo19742h().equals(qVar2.mo19742h()) : qVar == qVar2;
        }
        if (Double.isNaN(qVar.mo19739d().doubleValue()) || Double.isNaN(qVar2.mo19739d().doubleValue())) {
            return false;
        }
        return qVar.mo19739d().equals(qVar2.mo19739d());
    }
}
