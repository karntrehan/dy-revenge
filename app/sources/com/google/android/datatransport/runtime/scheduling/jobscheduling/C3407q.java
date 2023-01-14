package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3412t;
import java.util.Map;
import java.util.Objects;
import p174e.p319f.p320a.p322b.C6465d;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6552a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.q */
final class C3407q extends C3412t {

    /* renamed from: a */
    private final C6552a f9646a;

    /* renamed from: b */
    private final Map<C6465d, C3412t.C3414b> f9647b;

    C3407q(C6552a aVar, Map<C6465d, C3412t.C3414b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f9646a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f9647b = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C6552a mo10987e() {
        return this.f9646a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3412t)) {
            return false;
        }
        C3412t tVar = (C3412t) obj;
        return this.f9646a.equals(tVar.mo10987e()) && this.f9647b.equals(tVar.mo10989h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Map<C6465d, C3412t.C3414b> mo10989h() {
        return this.f9647b;
    }

    public int hashCode() {
        return ((this.f9646a.hashCode() ^ 1000003) * 1000003) ^ this.f9647b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f9646a + ", values=" + this.f9647b + "}";
    }
}
