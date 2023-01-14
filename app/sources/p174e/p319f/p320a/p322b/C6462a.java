package p174e.p319f.p320a.p322b;

import java.util.Objects;

/* renamed from: e.f.a.b.a */
final class C6462a<T> extends C6464c<T> {

    /* renamed from: a */
    private final Integer f18001a;

    /* renamed from: b */
    private final T f18002b;

    /* renamed from: c */
    private final C6465d f18003c;

    C6462a(Integer num, T t, C6465d dVar) {
        this.f18001a = num;
        Objects.requireNonNull(t, "Null payload");
        this.f18002b = t;
        Objects.requireNonNull(dVar, "Null priority");
        this.f18003c = dVar;
    }

    /* renamed from: a */
    public Integer mo19233a() {
        return this.f18001a;
    }

    /* renamed from: b */
    public T mo19234b() {
        return this.f18002b;
    }

    /* renamed from: c */
    public C6465d mo19235c() {
        return this.f18003c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6464c)) {
            return false;
        }
        C6464c cVar = (C6464c) obj;
        Integer num = this.f18001a;
        if (num != null ? num.equals(cVar.mo19233a()) : cVar.mo19233a() == null) {
            return this.f18002b.equals(cVar.mo19234b()) && this.f18003c.equals(cVar.mo19235c());
        }
    }

    public int hashCode() {
        Integer num = this.f18001a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f18002b.hashCode()) * 1000003) ^ this.f18003c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f18001a + ", payload=" + this.f18002b + ", priority=" + this.f18003c + "}";
    }
}
