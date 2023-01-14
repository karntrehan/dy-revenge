package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.d */
final class C4707d extends C4655a0.C4659c {

    /* renamed from: a */
    private final String f13261a;

    /* renamed from: b */
    private final String f13262b;

    /* renamed from: com.google.firebase.crashlytics.h.l.d$b */
    static final class C4709b extends C4655a0.C4659c.C4660a {

        /* renamed from: a */
        private String f13263a;

        /* renamed from: b */
        private String f13264b;

        C4709b() {
        }

        /* renamed from: a */
        public C4655a0.C4659c mo14342a() {
            String str = this.f13263a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = str2 + " key";
            }
            if (this.f13264b == null) {
                str2 = str2 + " value";
            }
            if (str2.isEmpty()) {
                return new C4707d(this.f13263a, this.f13264b);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: b */
        public C4655a0.C4659c.C4660a mo14343b(String str) {
            Objects.requireNonNull(str, "Null key");
            this.f13263a = str;
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4659c.C4660a mo14344c(String str) {
            Objects.requireNonNull(str, "Null value");
            this.f13264b = str;
            return this;
        }
    }

    private C4707d(String str, String str2) {
        this.f13261a = str;
        this.f13262b = str2;
    }

    /* renamed from: b */
    public String mo14340b() {
        return this.f13261a;
    }

    /* renamed from: c */
    public String mo14341c() {
        return this.f13262b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4655a0.C4659c)) {
            return false;
        }
        C4655a0.C4659c cVar = (C4655a0.C4659c) obj;
        return this.f13261a.equals(cVar.mo14340b()) && this.f13262b.equals(cVar.mo14341c());
    }

    public int hashCode() {
        return ((this.f13261a.hashCode() ^ 1000003) * 1000003) ^ this.f13262b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f13261a + ", value=" + this.f13262b + "}";
    }
}
