package androidx.camera.core.impl;

import androidx.camera.core.impl.C0809g1;
import java.util.Objects;

/* renamed from: androidx.camera.core.impl.t */
final class C0882t<T> extends C0809g1.C0810a<T> {

    /* renamed from: a */
    private final String f2563a;

    /* renamed from: b */
    private final Class<T> f2564b;

    /* renamed from: c */
    private final Object f2565c;

    C0882t(String str, Class<T> cls, Object obj) {
        Objects.requireNonNull(str, "Null id");
        this.f2563a = str;
        Objects.requireNonNull(cls, "Null valueClass");
        this.f2564b = cls;
        this.f2565c = obj;
    }

    /* renamed from: c */
    public String mo2986c() {
        return this.f2563a;
    }

    /* renamed from: d */
    public Object mo2987d() {
        return this.f2565c;
    }

    /* renamed from: e */
    public Class<T> mo2988e() {
        return this.f2564b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0809g1.C0810a)) {
            return false;
        }
        C0809g1.C0810a aVar = (C0809g1.C0810a) obj;
        if (this.f2563a.equals(aVar.mo2986c()) && this.f2564b.equals(aVar.mo2988e())) {
            Object obj2 = this.f2565c;
            Object d = aVar.mo2987d();
            if (obj2 == null) {
                if (d == null) {
                    return true;
                }
            } else if (obj2.equals(d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f2563a.hashCode() ^ 1000003) * 1000003) ^ this.f2564b.hashCode()) * 1000003;
        Object obj = this.f2565c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f2563a + ", valueClass=" + this.f2564b + ", token=" + this.f2565c + "}";
    }
}
