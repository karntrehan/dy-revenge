package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.m */
final class C4740m extends C4655a0.C4665e.C4672d.C4673a.C4675b {

    /* renamed from: a */
    private final C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e> f13355a;

    /* renamed from: b */
    private final C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c f13356b;

    /* renamed from: c */
    private final C4655a0.C4656a f13357c;

    /* renamed from: d */
    private final C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d f13358d;

    /* renamed from: e */
    private final C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a> f13359e;

    /* renamed from: com.google.firebase.crashlytics.h.l.m$b */
    static final class C4742b extends C4655a0.C4665e.C4672d.C4673a.C4675b.C4678b {

        /* renamed from: a */
        private C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e> f13360a;

        /* renamed from: b */
        private C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c f13361b;

        /* renamed from: c */
        private C4655a0.C4656a f13362c;

        /* renamed from: d */
        private C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d f13363d;

        /* renamed from: e */
        private C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a> f13364e;

        C4742b() {
        }

        /* renamed from: a */
        public C4655a0.C4665e.C4672d.C4673a.C4675b mo14451a() {
            C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d dVar = this.f13363d;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (dVar == null) {
                str = str + " signal";
            }
            if (this.f13364e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C4740m(this.f13360a, this.f13361b, this.f13362c, this.f13363d, this.f13364e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4678b mo14452b(C4655a0.C4656a aVar) {
            this.f13362c = aVar;
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4678b mo14453c(C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a> b0Var) {
            Objects.requireNonNull(b0Var, "Null binaries");
            this.f13364e = b0Var;
            return this;
        }

        /* renamed from: d */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4678b mo14454d(C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c cVar) {
            this.f13361b = cVar;
            return this;
        }

        /* renamed from: e */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4678b mo14455e(C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d dVar) {
            Objects.requireNonNull(dVar, "Null signal");
            this.f13363d = dVar;
            return this;
        }

        /* renamed from: f */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4678b mo14456f(C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e> b0Var) {
            this.f13360a = b0Var;
            return this;
        }
    }

    private C4740m(C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e> b0Var, C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c cVar, C4655a0.C4656a aVar, C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d dVar, C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a> b0Var2) {
        this.f13355a = b0Var;
        this.f13356b = cVar;
        this.f13357c = aVar;
        this.f13358d = dVar;
        this.f13359e = b0Var2;
    }

    /* renamed from: b */
    public C4655a0.C4656a mo14435b() {
        return this.f13357c;
    }

    /* renamed from: c */
    public C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a> mo14436c() {
        return this.f13359e;
    }

    /* renamed from: d */
    public C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c mo14437d() {
        return this.f13356b;
    }

    /* renamed from: e */
    public C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d mo14438e() {
        return this.f13358d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4655a0.C4665e.C4672d.C4673a.C4675b)) {
            return false;
        }
        C4655a0.C4665e.C4672d.C4673a.C4675b bVar = (C4655a0.C4665e.C4672d.C4673a.C4675b) obj;
        C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e> b0Var = this.f13355a;
        if (b0Var != null ? b0Var.equals(bVar.mo14439f()) : bVar.mo14439f() == null) {
            C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c cVar = this.f13356b;
            if (cVar != null ? cVar.equals(bVar.mo14437d()) : bVar.mo14437d() == null) {
                C4655a0.C4656a aVar = this.f13357c;
                if (aVar != null ? aVar.equals(bVar.mo14435b()) : bVar.mo14435b() == null) {
                    return this.f13358d.equals(bVar.mo14438e()) && this.f13359e.equals(bVar.mo14436c());
                }
            }
        }
    }

    /* renamed from: f */
    public C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e> mo14439f() {
        return this.f13355a;
    }

    public int hashCode() {
        C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e> b0Var = this.f13355a;
        int i = 0;
        int hashCode = ((b0Var == null ? 0 : b0Var.hashCode()) ^ 1000003) * 1000003;
        C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c cVar = this.f13356b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        C4655a0.C4656a aVar = this.f13357c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return ((((hashCode2 ^ i) * 1000003) ^ this.f13358d.hashCode()) * 1000003) ^ this.f13359e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f13355a + ", exception=" + this.f13356b + ", appExitInfo=" + this.f13357c + ", signal=" + this.f13358d + ", binaries=" + this.f13359e + "}";
    }
}
