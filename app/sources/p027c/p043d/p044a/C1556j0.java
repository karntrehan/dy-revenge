package p027c.p043d.p044a;

import java.util.Objects;
import okhttp3.HttpUrl;
import p027c.p043d.p044a.C1715t0;

/* renamed from: c.d.a.j0 */
final class C1556j0 extends C1715t0 {

    /* renamed from: a */
    private final C1559j1 f4834a;

    /* renamed from: b */
    private final C1521d0 f4835b;

    /* renamed from: c */
    private final int f4836c;

    /* renamed from: c.d.a.j0$b */
    static final class C1558b extends C1715t0.C1716a {

        /* renamed from: a */
        private C1559j1 f4837a;

        /* renamed from: b */
        private C1521d0 f4838b;

        /* renamed from: c */
        private Integer f4839c;

        C1558b() {
        }

        private C1558b(C1715t0 t0Var) {
            this.f4837a = t0Var.mo5699d();
            this.f4838b = t0Var.mo5697b();
            this.f4839c = Integer.valueOf(t0Var.mo5698c());
        }

        /* renamed from: a */
        public C1715t0 mo5704a() {
            C1559j1 j1Var = this.f4837a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (j1Var == null) {
                str = str + " videoSpec";
            }
            if (this.f4838b == null) {
                str = str + " audioSpec";
            }
            if (this.f4839c == null) {
                str = str + " outputFormat";
            }
            if (str.isEmpty()) {
                return new C1556j0(this.f4837a, this.f4838b, this.f4839c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1559j1 mo5705c() {
            C1559j1 j1Var = this.f4837a;
            if (j1Var != null) {
                return j1Var;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        /* renamed from: d */
        public C1715t0.C1716a mo5706d(C1521d0 d0Var) {
            Objects.requireNonNull(d0Var, "Null audioSpec");
            this.f4838b = d0Var;
            return this;
        }

        /* renamed from: e */
        public C1715t0.C1716a mo5707e(int i) {
            this.f4839c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public C1715t0.C1716a mo5708f(C1559j1 j1Var) {
            Objects.requireNonNull(j1Var, "Null videoSpec");
            this.f4837a = j1Var;
            return this;
        }
    }

    private C1556j0(C1559j1 j1Var, C1521d0 d0Var, int i) {
        this.f4834a = j1Var;
        this.f4835b = d0Var;
        this.f4836c = i;
    }

    /* renamed from: b */
    public C1521d0 mo5697b() {
        return this.f4835b;
    }

    /* renamed from: c */
    public int mo5698c() {
        return this.f4836c;
    }

    /* renamed from: d */
    public C1559j1 mo5699d() {
        return this.f4834a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1715t0)) {
            return false;
        }
        C1715t0 t0Var = (C1715t0) obj;
        return this.f4834a.equals(t0Var.mo5699d()) && this.f4835b.equals(t0Var.mo5697b()) && this.f4836c == t0Var.mo5698c();
    }

    public int hashCode() {
        return ((((this.f4834a.hashCode() ^ 1000003) * 1000003) ^ this.f4835b.hashCode()) * 1000003) ^ this.f4836c;
    }

    /* renamed from: i */
    public C1715t0.C1716a mo5702i() {
        return new C1558b(this);
    }

    public String toString() {
        return "MediaSpec{videoSpec=" + this.f4834a + ", audioSpec=" + this.f4835b + ", outputFormat=" + this.f4836c + "}";
    }
}
