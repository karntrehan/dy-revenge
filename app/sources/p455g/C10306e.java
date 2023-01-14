package p455g;

import p455g.p456a0.C10243c;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.e */
public final class C10306e implements Comparable<C10306e> {

    /* renamed from: f */
    public static final C10307a f27532f = new C10307a((C10452g) null);

    /* renamed from: o */
    public static final C10306e f27533o = C10308f.m35005a();

    /* renamed from: p */
    private final int f27534p;

    /* renamed from: q */
    private final int f27535q;

    /* renamed from: r */
    private final int f27536r;

    /* renamed from: s */
    private final int f27537s;

    /* renamed from: g.e$a */
    public static final class C10307a {
        private C10307a() {
        }

        public /* synthetic */ C10307a(C10452g gVar) {
            this();
        }
    }

    public C10306e(int i, int i2, int i3) {
        this.f27534p = i;
        this.f27535q = i2;
        this.f27536r = i3;
        this.f27537s = m35003g(i, i2, i3);
    }

    /* renamed from: g */
    private final int m35003g(int i, int i2, int i3) {
        boolean z = false;
        if (new C10243c(0, 255).mo25559o(i) && new C10243c(0, 255).mo25559o(i2) && new C10243c(0, 255).mo25559o(i3)) {
            z = true;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    /* renamed from: e */
    public int compareTo(C10306e eVar) {
        C10457l.m35320e(eVar, "other");
        return this.f27537s - eVar.f27537s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C10306e eVar = obj instanceof C10306e ? (C10306e) obj : null;
        return eVar != null && this.f27537s == eVar.f27537s;
    }

    public int hashCode() {
        return this.f27537s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27534p);
        sb.append('.');
        sb.append(this.f27535q);
        sb.append('.');
        sb.append(this.f27536r);
        return sb.toString();
    }
}
