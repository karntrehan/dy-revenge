package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.p */
final class C4749p extends C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d {

    /* renamed from: a */
    private final String f13383a;

    /* renamed from: b */
    private final String f13384b;

    /* renamed from: c */
    private final long f13385c;

    /* renamed from: com.google.firebase.crashlytics.h.l.p$b */
    static final class C4751b extends C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d.C4682a {

        /* renamed from: a */
        private String f13386a;

        /* renamed from: b */
        private String f13387b;

        /* renamed from: c */
        private Long f13388c;

        C4751b() {
        }

        /* renamed from: a */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d mo14471a() {
            String str = this.f13386a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = str2 + " name";
            }
            if (this.f13387b == null) {
                str2 = str2 + " code";
            }
            if (this.f13388c == null) {
                str2 = str2 + " address";
            }
            if (str2.isEmpty()) {
                return new C4749p(this.f13386a, this.f13387b, this.f13388c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: b */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d.C4682a mo14472b(long j) {
            this.f13388c = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d.C4682a mo14473c(String str) {
            Objects.requireNonNull(str, "Null code");
            this.f13387b = str;
            return this;
        }

        /* renamed from: d */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d.C4682a mo14474d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f13386a = str;
            return this;
        }
    }

    private C4749p(String str, String str2, long j) {
        this.f13383a = str;
        this.f13384b = str2;
        this.f13385c = j;
    }

    /* renamed from: b */
    public long mo14468b() {
        return this.f13385c;
    }

    /* renamed from: c */
    public String mo14469c() {
        return this.f13384b;
    }

    /* renamed from: d */
    public String mo14470d() {
        return this.f13383a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d)) {
            return false;
        }
        C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d dVar = (C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d) obj;
        return this.f13383a.equals(dVar.mo14470d()) && this.f13384b.equals(dVar.mo14469c()) && this.f13385c == dVar.mo14468b();
    }

    public int hashCode() {
        long j = this.f13385c;
        return ((((this.f13383a.hashCode() ^ 1000003) * 1000003) ^ this.f13384b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f13383a + ", code=" + this.f13384b + ", address=" + this.f13385c + "}";
    }
}
