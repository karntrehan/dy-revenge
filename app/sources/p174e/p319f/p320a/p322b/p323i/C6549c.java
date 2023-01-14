package p174e.p319f.p320a.p322b.p323i;

import java.util.Map;
import java.util.Objects;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p322b.p323i.C6573j;

/* renamed from: e.f.a.b.i.c */
final class C6549c extends C6573j {

    /* renamed from: a */
    private final String f18148a;

    /* renamed from: b */
    private final Integer f18149b;

    /* renamed from: c */
    private final C6572i f18150c;

    /* renamed from: d */
    private final long f18151d;

    /* renamed from: e */
    private final long f18152e;

    /* renamed from: f */
    private final Map<String, String> f18153f;

    /* renamed from: e.f.a.b.i.c$b */
    static final class C6551b extends C6573j.C6574a {

        /* renamed from: a */
        private String f18154a;

        /* renamed from: b */
        private Integer f18155b;

        /* renamed from: c */
        private C6572i f18156c;

        /* renamed from: d */
        private Long f18157d;

        /* renamed from: e */
        private Long f18158e;

        /* renamed from: f */
        private Map<String, String> f18159f;

        C6551b() {
        }

        /* renamed from: d */
        public C6573j mo19331d() {
            String str = this.f18154a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = str2 + " transportName";
            }
            if (this.f18156c == null) {
                str2 = str2 + " encodedPayload";
            }
            if (this.f18157d == null) {
                str2 = str2 + " eventMillis";
            }
            if (this.f18158e == null) {
                str2 = str2 + " uptimeMillis";
            }
            if (this.f18159f == null) {
                str2 = str2 + " autoMetadata";
            }
            if (str2.isEmpty()) {
                return new C6549c(this.f18154a, this.f18155b, this.f18156c, this.f18157d.longValue(), this.f18158e.longValue(), this.f18159f);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Map<String, String> mo19332e() {
            Map<String, String> map = this.f18159f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public C6573j.C6574a mo19333f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f18159f = map;
            return this;
        }

        /* renamed from: g */
        public C6573j.C6574a mo19334g(Integer num) {
            this.f18155b = num;
            return this;
        }

        /* renamed from: h */
        public C6573j.C6574a mo19335h(C6572i iVar) {
            Objects.requireNonNull(iVar, "Null encodedPayload");
            this.f18156c = iVar;
            return this;
        }

        /* renamed from: i */
        public C6573j.C6574a mo19336i(long j) {
            this.f18157d = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public C6573j.C6574a mo19337j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f18154a = str;
            return this;
        }

        /* renamed from: k */
        public C6573j.C6574a mo19338k(long j) {
            this.f18158e = Long.valueOf(j);
            return this;
        }
    }

    private C6549c(String str, Integer num, C6572i iVar, long j, long j2, Map<String, String> map) {
        this.f18148a = str;
        this.f18149b = num;
        this.f18150c = iVar;
        this.f18151d = j;
        this.f18152e = j2;
        this.f18153f = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo19322c() {
        return this.f18153f;
    }

    /* renamed from: d */
    public Integer mo19323d() {
        return this.f18149b;
    }

    /* renamed from: e */
    public C6572i mo19324e() {
        return this.f18150c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f18149b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p174e.p319f.p320a.p322b.p323i.C6573j
            r2 = 0
            if (r1 == 0) goto L_0x005b
            e.f.a.b.i.j r8 = (p174e.p319f.p320a.p322b.p323i.C6573j) r8
            java.lang.String r1 = r7.f18148a
            java.lang.String r3 = r8.mo19328j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.f18149b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.mo19323d()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.mo19323d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            e.f.a.b.i.i r1 = r7.f18150c
            e.f.a.b.i.i r3 = r8.mo19324e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.f18151d
            long r5 = r8.mo19326f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f18152e
            long r5 = r8.mo19329k()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f18153f
            java.util.Map r8 = r8.mo19322c()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p322b.p323i.C6549c.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public long mo19326f() {
        return this.f18151d;
    }

    public int hashCode() {
        int hashCode = (this.f18148a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f18149b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f18151d;
        long j2 = this.f18152e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f18150c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f18153f.hashCode();
    }

    /* renamed from: j */
    public String mo19328j() {
        return this.f18148a;
    }

    /* renamed from: k */
    public long mo19329k() {
        return this.f18152e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f18148a + ", code=" + this.f18149b + ", encodedPayload=" + this.f18150c + ", eventMillis=" + this.f18151d + ", uptimeMillis=" + this.f18152e + ", autoMetadata=" + this.f18153f + "}";
    }
}
