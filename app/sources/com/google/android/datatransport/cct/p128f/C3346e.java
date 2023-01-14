package com.google.android.datatransport.cct.p128f;

import com.google.android.datatransport.cct.p128f.C3360k;

/* renamed from: com.google.android.datatransport.cct.f.e */
final class C3346e extends C3360k {

    /* renamed from: a */
    private final C3360k.C3362b f9487a;

    /* renamed from: b */
    private final C3333a f9488b;

    /* renamed from: com.google.android.datatransport.cct.f.e$b */
    static final class C3348b extends C3360k.C3361a {

        /* renamed from: a */
        private C3360k.C3362b f9489a;

        /* renamed from: b */
        private C3333a f9490b;

        C3348b() {
        }

        /* renamed from: a */
        public C3360k mo10894a() {
            return new C3346e(this.f9489a, this.f9490b);
        }

        /* renamed from: b */
        public C3360k.C3361a mo10895b(C3333a aVar) {
            this.f9490b = aVar;
            return this;
        }

        /* renamed from: c */
        public C3360k.C3361a mo10896c(C3360k.C3362b bVar) {
            this.f9489a = bVar;
            return this;
        }
    }

    private C3346e(C3360k.C3362b bVar, C3333a aVar) {
        this.f9487a = bVar;
        this.f9488b = aVar;
    }

    /* renamed from: b */
    public C3333a mo10889b() {
        return this.f9488b;
    }

    /* renamed from: c */
    public C3360k.C3362b mo10890c() {
        return this.f9487a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3360k)) {
            return false;
        }
        C3360k kVar = (C3360k) obj;
        C3360k.C3362b bVar = this.f9487a;
        if (bVar != null ? bVar.equals(kVar.mo10890c()) : kVar.mo10890c() == null) {
            C3333a aVar = this.f9488b;
            C3333a b = kVar.mo10889b();
            if (aVar == null) {
                if (b == null) {
                    return true;
                }
            } else if (aVar.equals(b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C3360k.C3362b bVar = this.f9487a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        C3333a aVar = this.f9488b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f9487a + ", androidClientInfo=" + this.f9488b + "}";
    }
}
