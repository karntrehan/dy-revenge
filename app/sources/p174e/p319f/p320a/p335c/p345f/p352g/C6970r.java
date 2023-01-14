package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: e.f.a.c.f.g.r */
public final class C6970r implements C6954q {

    /* renamed from: f */
    private final String f18826f;

    /* renamed from: o */
    private final ArrayList f18827o;

    public C6970r(String str, List list) {
        this.f18826f = str;
        ArrayList arrayList = new ArrayList();
        this.f18827o = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String mo20116a() {
        return this.f18826f;
    }

    /* renamed from: b */
    public final C6954q mo19738b() {
        return this;
    }

    /* renamed from: c */
    public final ArrayList mo20117c() {
        return this.f18827o;
    }

    /* renamed from: d */
    public final Double mo19739d() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6970r)) {
            return false;
        }
        C6970r rVar = (C6970r) obj;
        String str = this.f18826f;
        if (str == null ? rVar.f18826f == null : str.equals(rVar.f18826f)) {
            return this.f18827o.equals(rVar.f18827o);
        }
        return false;
    }

    /* renamed from: g */
    public final String mo19741g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    /* renamed from: h */
    public final Boolean mo19742h() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final int hashCode() {
        String str = this.f18826f;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f18827o.hashCode();
    }

    /* renamed from: j */
    public final Iterator mo19745j() {
        return null;
    }

    /* renamed from: p */
    public final C6954q mo19748p(String str, C6991s4 s4Var, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
