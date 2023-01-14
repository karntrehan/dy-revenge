package com.google.firebase.p161o;

import java.util.List;
import java.util.Objects;

/* renamed from: com.google.firebase.o.f */
final class C4916f extends C4924m {

    /* renamed from: a */
    private final String f13772a;

    /* renamed from: b */
    private final List<String> f13773b;

    C4916f(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f13772a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f13773b = list;
    }

    /* renamed from: b */
    public List<String> mo14915b() {
        return this.f13773b;
    }

    /* renamed from: c */
    public String mo14916c() {
        return this.f13772a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4924m)) {
            return false;
        }
        C4924m mVar = (C4924m) obj;
        return this.f13772a.equals(mVar.mo14916c()) && this.f13773b.equals(mVar.mo14915b());
    }

    public int hashCode() {
        return ((this.f13772a.hashCode() ^ 1000003) * 1000003) ^ this.f13773b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f13772a + ", usedDates=" + this.f13773b + "}";
    }
}
