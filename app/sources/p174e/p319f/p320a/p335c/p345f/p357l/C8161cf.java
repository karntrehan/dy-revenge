package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.Map;

/* renamed from: e.f.a.c.f.l.cf */
final class C8161cf implements Map.Entry, Comparable<C8161cf> {

    /* renamed from: f */
    private final Comparable f22165f;

    /* renamed from: o */
    private Object f22166o;

    /* renamed from: p */
    final /* synthetic */ C8218ff f22167p;

    C8161cf(C8218ff ffVar, Comparable comparable, Object obj) {
        this.f22167p = ffVar;
        this.f22165f = comparable;
        this.f22166o = obj;
    }

    /* renamed from: g */
    private static final boolean m28397g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f22165f.compareTo(((C8161cf) obj).f22165f);
    }

    /* renamed from: e */
    public final Comparable mo21730e() {
        return this.f22165f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m28397g(this.f22165f, entry.getKey()) && m28397g(this.f22166o, entry.getValue());
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f22165f;
    }

    public final Object getValue() {
        return this.f22166o;
    }

    public final int hashCode() {
        Comparable comparable = this.f22165f;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f22166o;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f22167p.m28511n();
        Object obj2 = this.f22166o;
        this.f22166o = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f22165f);
        String valueOf2 = String.valueOf(this.f22166o);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
