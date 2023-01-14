package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: e.f.a.c.f.g.u6 */
public final class C7025u6 {
    /* renamed from: a */
    public static C6954q m26735a(C6960q5 q5Var) {
        if (q5Var == null) {
            return C6954q.f18804c;
        }
        int G = q5Var.mo20098G() - 1;
        if (G == 1) {
            return q5Var.mo20097F() ? new C7018u(q5Var.mo20092A()) : C6954q.f18811k;
        }
        if (G == 2) {
            return q5Var.mo20096E() ? new C6826i(Double.valueOf(q5Var.mo20099x())) : new C6826i((Double) null);
        }
        if (G == 3) {
            return q5Var.mo20095D() ? new C6794g(Boolean.valueOf(q5Var.mo20094C())) : new C6794g((Boolean) null);
        }
        if (G == 4) {
            List<C6960q5> B = q5Var.mo20093B();
            ArrayList arrayList = new ArrayList();
            for (C6960q5 a : B) {
                arrayList.add(m26735a(a));
            }
            return new C6970r(q5Var.mo20100z(), arrayList);
        }
        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
    }

    /* renamed from: b */
    public static C6954q m26736b(Object obj) {
        if (obj == null) {
            return C6954q.f18805d;
        }
        if (obj instanceof String) {
            return new C7018u((String) obj);
        }
        if (obj instanceof Double) {
            return new C6826i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C6826i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C6826i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C6794g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C6906n nVar = new C6906n();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                C6954q b = m26736b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    nVar.mo19747o((String) next, b);
                }
            }
            return nVar;
        } else if (obj instanceof List) {
            C6777f fVar = new C6777f();
            for (Object b2 : (List) obj) {
                fVar.mo19736H(fVar.mo19752z(), m26736b(b2));
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
