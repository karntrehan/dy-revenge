package com.google.android.datatransport.cct.p128f;

import com.google.android.datatransport.cct.p128f.C3368o;

/* renamed from: com.google.android.datatransport.cct.f.i */
final class C3356i extends C3368o {

    /* renamed from: a */
    private final C3368o.C3371c f9520a;

    /* renamed from: b */
    private final C3368o.C3370b f9521b;

    /* renamed from: com.google.android.datatransport.cct.f.i$b */
    static final class C3358b extends C3368o.C3369a {

        /* renamed from: a */
        private C3368o.C3371c f9522a;

        /* renamed from: b */
        private C3368o.C3370b f9523b;

        C3358b() {
        }

        /* renamed from: a */
        public C3368o mo10942a() {
            return new C3356i(this.f9522a, this.f9523b);
        }

        /* renamed from: b */
        public C3368o.C3369a mo10943b(C3368o.C3370b bVar) {
            this.f9523b = bVar;
            return this;
        }

        /* renamed from: c */
        public C3368o.C3369a mo10944c(C3368o.C3371c cVar) {
            this.f9522a = cVar;
            return this;
        }
    }

    private C3356i(C3368o.C3371c cVar, C3368o.C3370b bVar) {
        this.f9520a = cVar;
        this.f9521b = bVar;
    }

    /* renamed from: b */
    public C3368o.C3370b mo10937b() {
        return this.f9521b;
    }

    /* renamed from: c */
    public C3368o.C3371c mo10938c() {
        return this.f9520a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3368o)) {
            return false;
        }
        C3368o oVar = (C3368o) obj;
        C3368o.C3371c cVar = this.f9520a;
        if (cVar != null ? cVar.equals(oVar.mo10938c()) : oVar.mo10938c() == null) {
            C3368o.C3370b bVar = this.f9521b;
            C3368o.C3370b b = oVar.mo10937b();
            if (bVar == null) {
                if (b == null) {
                    return true;
                }
            } else if (bVar.equals(b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C3368o.C3371c cVar = this.f9520a;
        int i = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        C3368o.C3370b bVar = this.f9521b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f9520a + ", mobileSubtype=" + this.f9521b + "}";
    }
}
