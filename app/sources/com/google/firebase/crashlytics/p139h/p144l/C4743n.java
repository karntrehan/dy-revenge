package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.n */
final class C4743n extends C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a {

    /* renamed from: a */
    private final long f13365a;

    /* renamed from: b */
    private final long f13366b;

    /* renamed from: c */
    private final String f13367c;

    /* renamed from: d */
    private final String f13368d;

    /* renamed from: com.google.firebase.crashlytics.h.l.n$b */
    static final class C4745b extends C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a.C4677a {

        /* renamed from: a */
        private Long f13369a;

        /* renamed from: b */
        private Long f13370b;

        /* renamed from: c */
        private String f13371c;

        /* renamed from: d */
        private String f13372d;

        C4745b() {
        }

        /* renamed from: a */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a mo14445a() {
            Long l = this.f13369a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = str + " baseAddress";
            }
            if (this.f13370b == null) {
                str = str + " size";
            }
            if (this.f13371c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C4743n(this.f13369a.longValue(), this.f13370b.longValue(), this.f13371c, this.f13372d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a.C4677a mo14446b(long j) {
            this.f13369a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a.C4677a mo14447c(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f13371c = str;
            return this;
        }

        /* renamed from: d */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a.C4677a mo14448d(long j) {
            this.f13370b = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a.C4677a mo14449e(String str) {
            this.f13372d = str;
            return this;
        }
    }

    private C4743n(long j, long j2, String str, String str2) {
        this.f13365a = j;
        this.f13366b = j2;
        this.f13367c = str;
        this.f13368d = str2;
    }

    /* renamed from: b */
    public long mo14440b() {
        return this.f13365a;
    }

    /* renamed from: c */
    public String mo14441c() {
        return this.f13367c;
    }

    /* renamed from: d */
    public long mo14442d() {
        return this.f13366b;
    }

    /* renamed from: e */
    public String mo14443e() {
        return this.f13368d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a)) {
            return false;
        }
        C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a aVar = (C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a) obj;
        if (this.f13365a == aVar.mo14440b() && this.f13366b == aVar.mo14442d() && this.f13367c.equals(aVar.mo14441c())) {
            String str = this.f13368d;
            String e = aVar.mo14443e();
            if (str == null) {
                if (e == null) {
                    return true;
                }
            } else if (str.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f13365a;
        long j2 = this.f13366b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f13367c.hashCode()) * 1000003;
        String str = this.f13368d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f13365a + ", size=" + this.f13366b + ", name=" + this.f13367c + ", uuid=" + this.f13368d + "}";
    }
}
