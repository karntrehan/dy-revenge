package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: e.f.a.c.f.g.n */
public class C6906n implements C6954q, C6890m {

    /* renamed from: f */
    final Map f18644f = new HashMap();

    /* renamed from: a */
    public final List mo19972a() {
        return new ArrayList(this.f18644f.keySet());
    }

    /* renamed from: b */
    public final C6954q mo19738b() {
        String str;
        Map map;
        C6954q qVar;
        C6906n nVar = new C6906n();
        for (Map.Entry entry : this.f18644f.entrySet()) {
            if (entry.getValue() instanceof C6890m) {
                map = nVar.f18644f;
                str = (String) entry.getKey();
                qVar = (C6954q) entry.getValue();
            } else {
                map = nVar.f18644f;
                str = (String) entry.getKey();
                qVar = ((C6954q) entry.getValue()).mo19738b();
            }
            map.put(str, qVar);
        }
        return nVar;
    }

    /* renamed from: d */
    public final Double mo19739d() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6906n)) {
            return false;
        }
        return this.f18644f.equals(((C6906n) obj).f18644f);
    }

    /* renamed from: g */
    public final String mo19741g() {
        return "[object Object]";
    }

    /* renamed from: h */
    public final Boolean mo19742h() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        return this.f18644f.hashCode();
    }

    /* renamed from: j */
    public final Iterator mo19745j() {
        return C6858k.m26040b(this.f18644f);
    }

    /* renamed from: k */
    public final boolean mo19746k(String str) {
        return this.f18644f.containsKey(str);
    }

    /* renamed from: o */
    public final void mo19747o(String str, C6954q qVar) {
        if (qVar == null) {
            this.f18644f.remove(str);
        } else {
            this.f18644f.put(str, qVar);
        }
    }

    /* renamed from: p */
    public C6954q mo19748p(String str, C6991s4 s4Var, List list) {
        return "toString".equals(str) ? new C7018u(toString()) : C6858k.m26039a(this, new C7018u(str), s4Var, list);
    }

    /* renamed from: r */
    public final C6954q mo19749r(String str) {
        return this.f18644f.containsKey(str) ? (C6954q) this.f18644f.get(str) : C6954q.f18804c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f18644f.isEmpty()) {
            for (String str : this.f18644f.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, this.f18644f.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
