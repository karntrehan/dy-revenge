package com.google.android.datatransport.cct.p128f;

/* renamed from: com.google.android.datatransport.cct.f.h */
final class C3355h extends C3367n {

    /* renamed from: a */
    private final long f9519a;

    C3355h(long j) {
        this.f9519a = j;
    }

    /* renamed from: c */
    public long mo10933c() {
        return this.f9519a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C3367n) && this.f9519a == ((C3367n) obj).mo10933c();
    }

    public int hashCode() {
        long j = this.f9519a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f9519a + "}";
    }
}
