package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Map;

/* renamed from: e.f.a.c.f.g.za */
final class C7109za implements Map.Entry, Comparable {

    /* renamed from: f */
    private final Comparable f19082f;

    /* renamed from: o */
    private Object f19083o;

    /* renamed from: p */
    final /* synthetic */ C6789fb f19084p;

    C7109za(C6789fb fbVar, Comparable comparable, Object obj) {
        this.f19084p = fbVar;
        this.f19082f = comparable;
        this.f19083o = obj;
    }

    /* renamed from: g */
    private static final boolean m27087g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f19082f.compareTo(((C7109za) obj).f19082f);
    }

    /* renamed from: e */
    public final Comparable mo20479e() {
        return this.f19082f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m27087g(this.f19082f, entry.getKey()) && m27087g(this.f19083o, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f19082f;
    }

    public final Object getValue() {
        return this.f19083o;
    }

    public final int hashCode() {
        Comparable comparable = this.f19082f;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f19083o;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f19084p.m25709n();
        Object obj2 = this.f19083o;
        this.f19083o = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19082f);
        String valueOf2 = String.valueOf(this.f19083o);
        return valueOf + "=" + valueOf2;
    }
}
