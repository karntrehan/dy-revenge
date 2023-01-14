package p455g;

import java.io.Serializable;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.l */
public final class C10314l<A, B> implements Serializable {

    /* renamed from: f */
    private final A f27539f;

    /* renamed from: o */
    private final B f27540o;

    public C10314l(A a, B b) {
        this.f27539f = a;
        this.f27540o = b;
    }

    /* renamed from: a */
    public final A mo25609a() {
        return this.f27539f;
    }

    /* renamed from: b */
    public final B mo25610b() {
        return this.f27540o;
    }

    /* renamed from: c */
    public final A mo25611c() {
        return this.f27539f;
    }

    /* renamed from: d */
    public final B mo25612d() {
        return this.f27540o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10314l)) {
            return false;
        }
        C10314l lVar = (C10314l) obj;
        return C10457l.m35316a(this.f27539f, lVar.f27539f) && C10457l.m35316a(this.f27540o, lVar.f27540o);
    }

    public int hashCode() {
        A a = this.f27539f;
        int i = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f27540o;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return '(' + this.f27539f + ", " + this.f27540o + ')';
    }
}
