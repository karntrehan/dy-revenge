package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.C3382g;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.backends.b */
final class C3376b extends C3382g {

    /* renamed from: a */
    private final C3382g.C3383a f9587a;

    /* renamed from: b */
    private final long f9588b;

    C3376b(C3382g.C3383a aVar, long j) {
        Objects.requireNonNull(aVar, "Null status");
        this.f9587a = aVar;
        this.f9588b = j;
    }

    /* renamed from: b */
    public long mo10958b() {
        return this.f9588b;
    }

    /* renamed from: c */
    public C3382g.C3383a mo10959c() {
        return this.f9587a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3382g)) {
            return false;
        }
        C3382g gVar = (C3382g) obj;
        return this.f9587a.equals(gVar.mo10959c()) && this.f9588b == gVar.mo10958b();
    }

    public int hashCode() {
        long j = this.f9588b;
        return ((this.f9587a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f9587a + ", nextRequestWaitMillis=" + this.f9588b + "}";
    }
}
