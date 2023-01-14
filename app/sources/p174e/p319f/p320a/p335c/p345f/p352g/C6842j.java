package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: e.f.a.c.f.g.j */
public abstract class C6842j implements C6954q, C6890m {

    /* renamed from: f */
    protected final String f18539f;

    /* renamed from: o */
    protected final Map f18540o = new HashMap();

    public C6842j(String str) {
        this.f18539f = str;
    }

    /* renamed from: a */
    public abstract C6954q mo19542a(C6991s4 s4Var, List list);

    /* renamed from: b */
    public C6954q mo19738b() {
        return this;
    }

    /* renamed from: c */
    public final String mo19845c() {
        return this.f18539f;
    }

    /* renamed from: d */
    public final Double mo19739d() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6842j)) {
            return false;
        }
        C6842j jVar = (C6842j) obj;
        String str = this.f18539f;
        if (str != null) {
            return str.equals(jVar.f18539f);
        }
        return false;
    }

    /* renamed from: g */
    public final String mo19741g() {
        return this.f18539f;
    }

    /* renamed from: h */
    public final Boolean mo19742h() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        String str = this.f18539f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: j */
    public final Iterator mo19745j() {
        return C6858k.m26040b(this.f18540o);
    }

    /* renamed from: k */
    public final boolean mo19746k(String str) {
        return this.f18540o.containsKey(str);
    }

    /* renamed from: o */
    public final void mo19747o(String str, C6954q qVar) {
        if (qVar == null) {
            this.f18540o.remove(str);
        } else {
            this.f18540o.put(str, qVar);
        }
    }

    /* renamed from: p */
    public final C6954q mo19748p(String str, C6991s4 s4Var, List list) {
        return "toString".equals(str) ? new C7018u(this.f18539f) : C6858k.m26039a(this, new C7018u(str), s4Var, list);
    }

    /* renamed from: r */
    public final C6954q mo19749r(String str) {
        return this.f18540o.containsKey(str) ? (C6954q) this.f18540o.get(str) : C6954q.f18804c;
    }
}
