package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.v */
final class C4767v extends C4655a0.C4665e.C4694f {

    /* renamed from: a */
    private final String f13427a;

    /* renamed from: com.google.firebase.crashlytics.h.l.v$b */
    static final class C4769b extends C4655a0.C4665e.C4694f.C4695a {

        /* renamed from: a */
        private String f13428a;

        C4769b() {
        }

        /* renamed from: a */
        public C4655a0.C4665e.C4694f mo14525a() {
            String str = this.f13428a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = str2 + " identifier";
            }
            if (str2.isEmpty()) {
                return new C4767v(this.f13428a);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: b */
        public C4655a0.C4665e.C4694f.C4695a mo14526b(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f13428a = str;
            return this;
        }
    }

    private C4767v(String str) {
        this.f13427a = str;
    }

    /* renamed from: b */
    public String mo14524b() {
        return this.f13427a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4655a0.C4665e.C4694f) {
            return this.f13427a.equals(((C4655a0.C4665e.C4694f) obj).mo14524b());
        }
        return false;
    }

    public int hashCode() {
        return this.f13427a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f13427a + "}";
    }
}
