package p174e.p319f.p320a.p322b.p323i;

import java.util.Arrays;
import java.util.Objects;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p322b.C6465d;
import p174e.p319f.p320a.p322b.p323i.C6583p;

/* renamed from: e.f.a.b.i.e */
final class C6564e extends C6583p {

    /* renamed from: a */
    private final String f18174a;

    /* renamed from: b */
    private final byte[] f18175b;

    /* renamed from: c */
    private final C6465d f18176c;

    /* renamed from: e.f.a.b.i.e$b */
    static final class C6566b extends C6583p.C6584a {

        /* renamed from: a */
        private String f18177a;

        /* renamed from: b */
        private byte[] f18178b;

        /* renamed from: c */
        private C6465d f18179c;

        C6566b() {
        }

        /* renamed from: a */
        public C6583p mo19361a() {
            String str = this.f18177a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = str2 + " backendName";
            }
            if (this.f18179c == null) {
                str2 = str2 + " priority";
            }
            if (str2.isEmpty()) {
                return new C6564e(this.f18177a, this.f18178b, this.f18179c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: b */
        public C6583p.C6584a mo19362b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f18177a = str;
            return this;
        }

        /* renamed from: c */
        public C6583p.C6584a mo19363c(byte[] bArr) {
            this.f18178b = bArr;
            return this;
        }

        /* renamed from: d */
        public C6583p.C6584a mo19364d(C6465d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f18179c = dVar;
            return this;
        }
    }

    private C6564e(String str, byte[] bArr, C6465d dVar) {
        this.f18174a = str;
        this.f18175b = bArr;
        this.f18176c = dVar;
    }

    /* renamed from: b */
    public String mo19356b() {
        return this.f18174a;
    }

    /* renamed from: c */
    public byte[] mo19357c() {
        return this.f18175b;
    }

    /* renamed from: d */
    public C6465d mo19358d() {
        return this.f18176c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6583p)) {
            return false;
        }
        C6583p pVar = (C6583p) obj;
        if (this.f18174a.equals(pVar.mo19356b())) {
            return Arrays.equals(this.f18175b, pVar instanceof C6564e ? ((C6564e) pVar).f18175b : pVar.mo19357c()) && this.f18176c.equals(pVar.mo19358d());
        }
    }

    public int hashCode() {
        return ((((this.f18174a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f18175b)) * 1000003) ^ this.f18176c.hashCode();
    }
}
