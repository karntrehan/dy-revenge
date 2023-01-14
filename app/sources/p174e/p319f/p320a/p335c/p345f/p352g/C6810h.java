package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Iterator;
import java.util.List;

/* renamed from: e.f.a.c.f.g.h */
public final class C6810h implements C6954q {

    /* renamed from: f */
    private final C6954q f18511f;

    /* renamed from: o */
    private final String f18512o;

    public C6810h() {
        throw null;
    }

    public C6810h(String str) {
        this.f18511f = C6954q.f18804c;
        this.f18512o = str;
    }

    public C6810h(String str, C6954q qVar) {
        this.f18511f = qVar;
        this.f18512o = str;
    }

    /* renamed from: a */
    public final C6954q mo19807a() {
        return this.f18511f;
    }

    /* renamed from: b */
    public final C6954q mo19738b() {
        return new C6810h(this.f18512o, this.f18511f.mo19738b());
    }

    /* renamed from: c */
    public final String mo19808c() {
        return this.f18512o;
    }

    /* renamed from: d */
    public final Double mo19739d() {
        throw new IllegalStateException("Control is not a double");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6810h)) {
            return false;
        }
        C6810h hVar = (C6810h) obj;
        return this.f18512o.equals(hVar.f18512o) && this.f18511f.equals(hVar.f18511f);
    }

    /* renamed from: g */
    public final String mo19741g() {
        throw new IllegalStateException("Control is not a String");
    }

    /* renamed from: h */
    public final Boolean mo19742h() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final int hashCode() {
        return (this.f18512o.hashCode() * 31) + this.f18511f.hashCode();
    }

    /* renamed from: j */
    public final Iterator mo19745j() {
        return null;
    }

    /* renamed from: p */
    public final C6954q mo19748p(String str, C6991s4 s4Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
