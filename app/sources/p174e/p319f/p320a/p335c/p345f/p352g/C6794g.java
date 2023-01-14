package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Iterator;
import java.util.List;

/* renamed from: e.f.a.c.f.g.g */
public final class C6794g implements C6954q {

    /* renamed from: f */
    private final boolean f18498f;

    public C6794g(Boolean bool) {
        this.f18498f = bool == null ? false : bool.booleanValue();
    }

    /* renamed from: b */
    public final C6954q mo19738b() {
        return new C6794g(Boolean.valueOf(this.f18498f));
    }

    /* renamed from: d */
    public final Double mo19739d() {
        return Double.valueOf(true != this.f18498f ? 0.0d : 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6794g) && this.f18498f == ((C6794g) obj).f18498f;
    }

    /* renamed from: g */
    public final String mo19741g() {
        return Boolean.toString(this.f18498f);
    }

    /* renamed from: h */
    public final Boolean mo19742h() {
        return Boolean.valueOf(this.f18498f);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f18498f).hashCode();
    }

    /* renamed from: j */
    public final Iterator mo19745j() {
        return null;
    }

    /* renamed from: p */
    public final C6954q mo19748p(String str, C6991s4 s4Var, List list) {
        if ("toString".equals(str)) {
            return new C7018u(Boolean.toString(this.f18498f));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f18498f), str}));
    }

    public final String toString() {
        return String.valueOf(this.f18498f);
    }
}
