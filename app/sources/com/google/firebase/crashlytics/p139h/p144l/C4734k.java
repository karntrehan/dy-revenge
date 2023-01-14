package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.k */
final class C4734k extends C4655a0.C4665e.C4672d {

    /* renamed from: a */
    private final long f13335a;

    /* renamed from: b */
    private final String f13336b;

    /* renamed from: c */
    private final C4655a0.C4665e.C4672d.C4673a f13337c;

    /* renamed from: d */
    private final C4655a0.C4665e.C4672d.C4688c f13338d;

    /* renamed from: e */
    private final C4655a0.C4665e.C4672d.C4690d f13339e;

    /* renamed from: com.google.firebase.crashlytics.h.l.k$b */
    static final class C4736b extends C4655a0.C4665e.C4672d.C4687b {

        /* renamed from: a */
        private Long f13340a;

        /* renamed from: b */
        private String f13341b;

        /* renamed from: c */
        private C4655a0.C4665e.C4672d.C4673a f13342c;

        /* renamed from: d */
        private C4655a0.C4665e.C4672d.C4688c f13343d;

        /* renamed from: e */
        private C4655a0.C4665e.C4672d.C4690d f13344e;

        C4736b() {
        }

        private C4736b(C4655a0.C4665e.C4672d dVar) {
            this.f13340a = Long.valueOf(dVar.mo14420e());
            this.f13341b = dVar.mo14421f();
            this.f13342c = dVar.mo14417b();
            this.f13343d = dVar.mo14418c();
            this.f13344e = dVar.mo14419d();
        }

        /* renamed from: a */
        public C4655a0.C4665e.C4672d mo14493a() {
            Long l = this.f13340a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = str + " timestamp";
            }
            if (this.f13341b == null) {
                str = str + " type";
            }
            if (this.f13342c == null) {
                str = str + " app";
            }
            if (this.f13343d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C4734k(this.f13340a.longValue(), this.f13341b, this.f13342c, this.f13343d, this.f13344e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C4655a0.C4665e.C4672d.C4687b mo14494b(C4655a0.C4665e.C4672d.C4673a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f13342c = aVar;
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4665e.C4672d.C4687b mo14495c(C4655a0.C4665e.C4672d.C4688c cVar) {
            Objects.requireNonNull(cVar, "Null device");
            this.f13343d = cVar;
            return this;
        }

        /* renamed from: d */
        public C4655a0.C4665e.C4672d.C4687b mo14496d(C4655a0.C4665e.C4672d.C4690d dVar) {
            this.f13344e = dVar;
            return this;
        }

        /* renamed from: e */
        public C4655a0.C4665e.C4672d.C4687b mo14497e(long j) {
            this.f13340a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public C4655a0.C4665e.C4672d.C4687b mo14498f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f13341b = str;
            return this;
        }
    }

    private C4734k(long j, String str, C4655a0.C4665e.C4672d.C4673a aVar, C4655a0.C4665e.C4672d.C4688c cVar, C4655a0.C4665e.C4672d.C4690d dVar) {
        this.f13335a = j;
        this.f13336b = str;
        this.f13337c = aVar;
        this.f13338d = cVar;
        this.f13339e = dVar;
    }

    /* renamed from: b */
    public C4655a0.C4665e.C4672d.C4673a mo14417b() {
        return this.f13337c;
    }

    /* renamed from: c */
    public C4655a0.C4665e.C4672d.C4688c mo14418c() {
        return this.f13338d;
    }

    /* renamed from: d */
    public C4655a0.C4665e.C4672d.C4690d mo14419d() {
        return this.f13339e;
    }

    /* renamed from: e */
    public long mo14420e() {
        return this.f13335a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4655a0.C4665e.C4672d)) {
            return false;
        }
        C4655a0.C4665e.C4672d dVar = (C4655a0.C4665e.C4672d) obj;
        if (this.f13335a == dVar.mo14420e() && this.f13336b.equals(dVar.mo14421f()) && this.f13337c.equals(dVar.mo14417b()) && this.f13338d.equals(dVar.mo14418c())) {
            C4655a0.C4665e.C4672d.C4690d dVar2 = this.f13339e;
            C4655a0.C4665e.C4672d.C4690d d = dVar.mo14419d();
            if (dVar2 == null) {
                if (d == null) {
                    return true;
                }
            } else if (dVar2.equals(d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo14421f() {
        return this.f13336b;
    }

    /* renamed from: g */
    public C4655a0.C4665e.C4672d.C4687b mo14422g() {
        return new C4736b(this);
    }

    public int hashCode() {
        long j = this.f13335a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f13336b.hashCode()) * 1000003) ^ this.f13337c.hashCode()) * 1000003) ^ this.f13338d.hashCode()) * 1000003;
        C4655a0.C4665e.C4672d.C4690d dVar = this.f13339e;
        return (dVar == null ? 0 : dVar.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.f13335a + ", type=" + this.f13336b + ", app=" + this.f13337c + ", device=" + this.f13338d + ", log=" + this.f13339e + "}";
    }
}
