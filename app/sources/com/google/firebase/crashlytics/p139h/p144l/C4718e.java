package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.e */
final class C4718e extends C4655a0.C4661d {

    /* renamed from: a */
    private final C4699b0<C4655a0.C4661d.C4663b> f13272a;

    /* renamed from: b */
    private final String f13273b;

    /* renamed from: com.google.firebase.crashlytics.h.l.e$b */
    static final class C4720b extends C4655a0.C4661d.C4662a {

        /* renamed from: a */
        private C4699b0<C4655a0.C4661d.C4663b> f13274a;

        /* renamed from: b */
        private String f13275b;

        C4720b() {
        }

        /* renamed from: a */
        public C4655a0.C4661d mo14347a() {
            C4699b0<C4655a0.C4661d.C4663b> b0Var = this.f13274a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (b0Var == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new C4718e(this.f13274a, this.f13275b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C4655a0.C4661d.C4662a mo14348b(C4699b0<C4655a0.C4661d.C4663b> b0Var) {
            Objects.requireNonNull(b0Var, "Null files");
            this.f13274a = b0Var;
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4661d.C4662a mo14349c(String str) {
            this.f13275b = str;
            return this;
        }
    }

    private C4718e(C4699b0<C4655a0.C4661d.C4663b> b0Var, String str) {
        this.f13272a = b0Var;
        this.f13273b = str;
    }

    /* renamed from: b */
    public C4699b0<C4655a0.C4661d.C4663b> mo14345b() {
        return this.f13272a;
    }

    /* renamed from: c */
    public String mo14346c() {
        return this.f13273b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4655a0.C4661d)) {
            return false;
        }
        C4655a0.C4661d dVar = (C4655a0.C4661d) obj;
        if (this.f13272a.equals(dVar.mo14345b())) {
            String str = this.f13273b;
            String c = dVar.mo14346c();
            if (str == null) {
                if (c == null) {
                    return true;
                }
            } else if (str.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f13272a.hashCode() ^ 1000003) * 1000003;
        String str = this.f13273b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f13272a + ", orgId=" + this.f13273b + "}";
    }
}
