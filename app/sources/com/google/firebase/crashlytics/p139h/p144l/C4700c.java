package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.c */
final class C4700c extends C4655a0.C4656a {

    /* renamed from: a */
    private final int f13245a;

    /* renamed from: b */
    private final String f13246b;

    /* renamed from: c */
    private final int f13247c;

    /* renamed from: d */
    private final int f13248d;

    /* renamed from: e */
    private final long f13249e;

    /* renamed from: f */
    private final long f13250f;

    /* renamed from: g */
    private final long f13251g;

    /* renamed from: h */
    private final String f13252h;

    /* renamed from: com.google.firebase.crashlytics.h.l.c$b */
    static final class C4702b extends C4655a0.C4656a.C4657a {

        /* renamed from: a */
        private Integer f13253a;

        /* renamed from: b */
        private String f13254b;

        /* renamed from: c */
        private Integer f13255c;

        /* renamed from: d */
        private Integer f13256d;

        /* renamed from: e */
        private Long f13257e;

        /* renamed from: f */
        private Long f13258f;

        /* renamed from: g */
        private Long f13259g;

        /* renamed from: h */
        private String f13260h;

        C4702b() {
        }

        /* renamed from: a */
        public C4655a0.C4656a mo14322a() {
            Integer num = this.f13253a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (num == null) {
                str = str + " pid";
            }
            if (this.f13254b == null) {
                str = str + " processName";
            }
            if (this.f13255c == null) {
                str = str + " reasonCode";
            }
            if (this.f13256d == null) {
                str = str + " importance";
            }
            if (this.f13257e == null) {
                str = str + " pss";
            }
            if (this.f13258f == null) {
                str = str + " rss";
            }
            if (this.f13259g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C4700c(this.f13253a.intValue(), this.f13254b, this.f13255c.intValue(), this.f13256d.intValue(), this.f13257e.longValue(), this.f13258f.longValue(), this.f13259g.longValue(), this.f13260h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C4655a0.C4656a.C4657a mo14323b(int i) {
            this.f13256d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4656a.C4657a mo14324c(int i) {
            this.f13253a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C4655a0.C4656a.C4657a mo14325d(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.f13254b = str;
            return this;
        }

        /* renamed from: e */
        public C4655a0.C4656a.C4657a mo14326e(long j) {
            this.f13257e = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public C4655a0.C4656a.C4657a mo14327f(int i) {
            this.f13255c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: g */
        public C4655a0.C4656a.C4657a mo14328g(long j) {
            this.f13258f = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public C4655a0.C4656a.C4657a mo14329h(long j) {
            this.f13259g = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public C4655a0.C4656a.C4657a mo14330i(String str) {
            this.f13260h = str;
            return this;
        }
    }

    private C4700c(int i, String str, int i2, int i3, long j, long j2, long j3, String str2) {
        this.f13245a = i;
        this.f13246b = str;
        this.f13247c = i2;
        this.f13248d = i3;
        this.f13249e = j;
        this.f13250f = j2;
        this.f13251g = j3;
        this.f13252h = str2;
    }

    /* renamed from: b */
    public int mo14314b() {
        return this.f13248d;
    }

    /* renamed from: c */
    public int mo14315c() {
        return this.f13245a;
    }

    /* renamed from: d */
    public String mo14316d() {
        return this.f13246b;
    }

    /* renamed from: e */
    public long mo14317e() {
        return this.f13249e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4655a0.C4656a)) {
            return false;
        }
        C4655a0.C4656a aVar = (C4655a0.C4656a) obj;
        if (this.f13245a == aVar.mo14315c() && this.f13246b.equals(aVar.mo14316d()) && this.f13247c == aVar.mo14318f() && this.f13248d == aVar.mo14314b() && this.f13249e == aVar.mo14317e() && this.f13250f == aVar.mo14319g() && this.f13251g == aVar.mo14320h()) {
            String str = this.f13252h;
            String i = aVar.mo14321i();
            if (str == null) {
                if (i == null) {
                    return true;
                }
            } else if (str.equals(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public int mo14318f() {
        return this.f13247c;
    }

    /* renamed from: g */
    public long mo14319g() {
        return this.f13250f;
    }

    /* renamed from: h */
    public long mo14320h() {
        return this.f13251g;
    }

    public int hashCode() {
        long j = this.f13249e;
        long j2 = this.f13250f;
        long j3 = this.f13251g;
        int hashCode = (((((((((((((this.f13245a ^ 1000003) * 1000003) ^ this.f13246b.hashCode()) * 1000003) ^ this.f13247c) * 1000003) ^ this.f13248d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f13252h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    /* renamed from: i */
    public String mo14321i() {
        return this.f13252h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f13245a + ", processName=" + this.f13246b + ", reasonCode=" + this.f13247c + ", importance=" + this.f13248d + ", pss=" + this.f13249e + ", rss=" + this.f13250f + ", timestamp=" + this.f13251g + ", traceFile=" + this.f13252h + "}";
    }
}
