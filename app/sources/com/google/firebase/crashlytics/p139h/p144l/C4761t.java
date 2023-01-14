package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.t */
final class C4761t extends C4655a0.C4665e.C4672d.C4690d {

    /* renamed from: a */
    private final String f13417a;

    /* renamed from: com.google.firebase.crashlytics.h.l.t$b */
    static final class C4763b extends C4655a0.C4665e.C4672d.C4690d.C4691a {

        /* renamed from: a */
        private String f13418a;

        C4763b() {
        }

        /* renamed from: a */
        public C4655a0.C4665e.C4672d.C4690d mo14513a() {
            String str = this.f13418a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = str2 + " content";
            }
            if (str2.isEmpty()) {
                return new C4761t(this.f13418a);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: b */
        public C4655a0.C4665e.C4672d.C4690d.C4691a mo14514b(String str) {
            Objects.requireNonNull(str, "Null content");
            this.f13418a = str;
            return this;
        }
    }

    private C4761t(String str) {
        this.f13417a = str;
    }

    /* renamed from: b */
    public String mo14512b() {
        return this.f13417a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4655a0.C4665e.C4672d.C4690d) {
            return this.f13417a.equals(((C4655a0.C4665e.C4672d.C4690d) obj).mo14512b());
        }
        return false;
    }

    public int hashCode() {
        return this.f13417a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f13417a + "}";
    }
}
