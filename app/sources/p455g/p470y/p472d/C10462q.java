package p455g.p470y.p472d;

/* renamed from: g.y.d.q */
public final class C10462q implements C10448d {

    /* renamed from: f */
    private final Class<?> f27620f;

    /* renamed from: o */
    private final String f27621o;

    public C10462q(Class<?> cls, String str) {
        C10457l.m35320e(cls, "jClass");
        C10457l.m35320e(str, "moduleName");
        this.f27620f = cls;
        this.f27621o = str;
    }

    /* renamed from: b */
    public Class<?> mo25816b() {
        return this.f27620f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10462q) && C10457l.m35316a(mo25816b(), ((C10462q) obj).mo25816b());
    }

    public int hashCode() {
        return mo25816b().hashCode();
    }

    public String toString() {
        return mo25816b().toString() + " (Kotlin reflection is not available)";
    }
}
