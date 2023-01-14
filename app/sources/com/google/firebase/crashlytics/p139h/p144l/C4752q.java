package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.q */
final class C4752q extends C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e {

    /* renamed from: a */
    private final String f13389a;

    /* renamed from: b */
    private final int f13390b;

    /* renamed from: c */
    private final C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b> f13391c;

    /* renamed from: com.google.firebase.crashlytics.h.l.q$b */
    static final class C4754b extends C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4684a {

        /* renamed from: a */
        private String f13392a;

        /* renamed from: b */
        private Integer f13393b;

        /* renamed from: c */
        private C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b> f13394c;

        C4754b() {
        }

        /* renamed from: a */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e mo14478a() {
            String str = this.f13392a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = str2 + " name";
            }
            if (this.f13393b == null) {
                str2 = str2 + " importance";
            }
            if (this.f13394c == null) {
                str2 = str2 + " frames";
            }
            if (str2.isEmpty()) {
                return new C4752q(this.f13392a, this.f13393b.intValue(), this.f13394c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: b */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4684a mo14479b(C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b> b0Var) {
            Objects.requireNonNull(b0Var, "Null frames");
            this.f13394c = b0Var;
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4684a mo14480c(int i) {
            this.f13393b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4684a mo14481d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f13392a = str;
            return this;
        }
    }

    private C4752q(String str, int i, C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b> b0Var) {
        this.f13389a = str;
        this.f13390b = i;
        this.f13391c = b0Var;
    }

    /* renamed from: b */
    public C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b> mo14475b() {
        return this.f13391c;
    }

    /* renamed from: c */
    public int mo14476c() {
        return this.f13390b;
    }

    /* renamed from: d */
    public String mo14477d() {
        return this.f13389a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e)) {
            return false;
        }
        C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e eVar = (C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e) obj;
        return this.f13389a.equals(eVar.mo14477d()) && this.f13390b == eVar.mo14476c() && this.f13391c.equals(eVar.mo14475b());
    }

    public int hashCode() {
        return ((((this.f13389a.hashCode() ^ 1000003) * 1000003) ^ this.f13390b) * 1000003) ^ this.f13391c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f13389a + ", importance=" + this.f13390b + ", frames=" + this.f13391c + "}";
    }
}
