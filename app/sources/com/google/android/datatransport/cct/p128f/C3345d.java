package com.google.android.datatransport.cct.p128f;

import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.cct.f.d */
final class C3345d extends C3359j {

    /* renamed from: a */
    private final List<C3365m> f9486a;

    C3345d(List<C3365m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f9486a = list;
    }

    /* renamed from: c */
    public List<C3365m> mo10885c() {
        return this.f9486a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3359j) {
            return this.f9486a.equals(((C3359j) obj).mo10885c());
        }
        return false;
    }

    public int hashCode() {
        return this.f9486a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f9486a + "}";
    }
}
