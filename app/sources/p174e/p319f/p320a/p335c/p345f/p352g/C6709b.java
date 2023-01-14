package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.HashMap;
import java.util.Map;

/* renamed from: e.f.a.c.f.g.b */
public final class C6709b {

    /* renamed from: a */
    private String f18373a;

    /* renamed from: b */
    private final long f18374b;

    /* renamed from: c */
    private final Map f18375c;

    public C6709b(String str, long j, Map map) {
        this.f18373a = str;
        this.f18374b = j;
        HashMap hashMap = new HashMap();
        this.f18375c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long mo19543a() {
        return this.f18374b;
    }

    /* renamed from: b */
    public final C6709b clone() {
        return new C6709b(this.f18373a, this.f18374b, new HashMap(this.f18375c));
    }

    /* renamed from: c */
    public final Object mo19545c(String str) {
        if (this.f18375c.containsKey(str)) {
            return this.f18375c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String mo19547d() {
        return this.f18373a;
    }

    /* renamed from: e */
    public final Map mo19548e() {
        return this.f18375c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6709b)) {
            return false;
        }
        C6709b bVar = (C6709b) obj;
        if (this.f18374b == bVar.f18374b && this.f18373a.equals(bVar.f18373a)) {
            return this.f18375c.equals(bVar.f18375c);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo19550f(String str) {
        this.f18373a = str;
    }

    /* renamed from: g */
    public final void mo19551g(String str, Object obj) {
        if (obj == null) {
            this.f18375c.remove(str);
        } else {
            this.f18375c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f18373a.hashCode();
        long j = this.f18374b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f18375c.hashCode();
    }

    public final String toString() {
        String str = this.f18373a;
        long j = this.f18374b;
        String obj = this.f18375c.toString();
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + obj + "}";
    }
}
