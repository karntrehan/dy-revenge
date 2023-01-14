package p174e.p319f.p320a.p322b.p323i;

import java.util.Objects;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p322b.C6463b;
import p174e.p319f.p320a.p322b.C6464c;
import p174e.p319f.p320a.p322b.C6466e;
import p174e.p319f.p320a.p322b.p323i.C6581o;

/* renamed from: e.f.a.b.i.d */
final class C6560d extends C6581o {

    /* renamed from: a */
    private final C6583p f18162a;

    /* renamed from: b */
    private final String f18163b;

    /* renamed from: c */
    private final C6464c<?> f18164c;

    /* renamed from: d */
    private final C6466e<?, byte[]> f18165d;

    /* renamed from: e */
    private final C6463b f18166e;

    /* renamed from: e.f.a.b.i.d$b */
    static final class C6562b extends C6581o.C6582a {

        /* renamed from: a */
        private C6583p f18167a;

        /* renamed from: b */
        private String f18168b;

        /* renamed from: c */
        private C6464c<?> f18169c;

        /* renamed from: d */
        private C6466e<?, byte[]> f18170d;

        /* renamed from: e */
        private C6463b f18171e;

        C6562b() {
        }

        /* renamed from: a */
        public C6581o mo19350a() {
            C6583p pVar = this.f18167a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (pVar == null) {
                str = str + " transportContext";
            }
            if (this.f18168b == null) {
                str = str + " transportName";
            }
            if (this.f18169c == null) {
                str = str + " event";
            }
            if (this.f18170d == null) {
                str = str + " transformer";
            }
            if (this.f18171e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C6560d(this.f18167a, this.f18168b, this.f18169c, this.f18170d, this.f18171e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C6581o.C6582a mo19351b(C6463b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f18171e = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C6581o.C6582a mo19352c(C6464c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f18169c = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C6581o.C6582a mo19353d(C6466e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f18170d = eVar;
            return this;
        }

        /* renamed from: e */
        public C6581o.C6582a mo19354e(C6583p pVar) {
            Objects.requireNonNull(pVar, "Null transportContext");
            this.f18167a = pVar;
            return this;
        }

        /* renamed from: f */
        public C6581o.C6582a mo19355f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f18168b = str;
            return this;
        }
    }

    private C6560d(C6583p pVar, String str, C6464c<?> cVar, C6466e<?, byte[]> eVar, C6463b bVar) {
        this.f18162a = pVar;
        this.f18163b = str;
        this.f18164c = cVar;
        this.f18165d = eVar;
        this.f18166e = bVar;
    }

    /* renamed from: b */
    public C6463b mo19342b() {
        return this.f18166e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6464c<?> mo19343c() {
        return this.f18164c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C6466e<?, byte[]> mo19344e() {
        return this.f18165d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6581o)) {
            return false;
        }
        C6581o oVar = (C6581o) obj;
        return this.f18162a.equals(oVar.mo19346f()) && this.f18163b.equals(oVar.mo19347g()) && this.f18164c.equals(oVar.mo19343c()) && this.f18165d.equals(oVar.mo19344e()) && this.f18166e.equals(oVar.mo19342b());
    }

    /* renamed from: f */
    public C6583p mo19346f() {
        return this.f18162a;
    }

    /* renamed from: g */
    public String mo19347g() {
        return this.f18163b;
    }

    public int hashCode() {
        return ((((((((this.f18162a.hashCode() ^ 1000003) * 1000003) ^ this.f18163b.hashCode()) * 1000003) ^ this.f18164c.hashCode()) * 1000003) ^ this.f18165d.hashCode()) * 1000003) ^ this.f18166e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f18162a + ", transportName=" + this.f18163b + ", event=" + this.f18164c + ", transformer=" + this.f18165d + ", encoding=" + this.f18166e + "}";
    }
}
