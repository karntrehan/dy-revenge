package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.i */
public final class C3536i<L> {

    /* renamed from: a */
    private volatile L f9979a;

    /* renamed from: b */
    private volatile C3537a<L> f9980b;

    /* renamed from: com.google.android.gms.common.api.internal.i$a */
    public static final class C3537a<L> {

        /* renamed from: a */
        private final L f9981a;

        /* renamed from: b */
        private final String f9982b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3537a)) {
                return false;
            }
            C3537a aVar = (C3537a) obj;
            return this.f9981a == aVar.f9981a && this.f9982b.equals(aVar.f9982b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f9981a) * 31) + this.f9982b.hashCode();
        }
    }

    /* renamed from: a */
    public void mo11365a() {
        this.f9979a = null;
        this.f9980b = null;
    }
}
