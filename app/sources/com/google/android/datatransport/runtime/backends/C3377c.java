package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import java.util.Objects;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6552a;

/* renamed from: com.google.android.datatransport.runtime.backends.c */
final class C3377c extends C3384h {

    /* renamed from: a */
    private final Context f9589a;

    /* renamed from: b */
    private final C6552a f9590b;

    /* renamed from: c */
    private final C6552a f9591c;

    /* renamed from: d */
    private final String f9592d;

    C3377c(Context context, C6552a aVar, C6552a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f9589a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f9590b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f9591c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f9592d = str;
    }

    /* renamed from: b */
    public Context mo10963b() {
        return this.f9589a;
    }

    /* renamed from: c */
    public String mo10964c() {
        return this.f9592d;
    }

    /* renamed from: d */
    public C6552a mo10965d() {
        return this.f9591c;
    }

    /* renamed from: e */
    public C6552a mo10966e() {
        return this.f9590b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3384h)) {
            return false;
        }
        C3384h hVar = (C3384h) obj;
        return this.f9589a.equals(hVar.mo10963b()) && this.f9590b.equals(hVar.mo10966e()) && this.f9591c.equals(hVar.mo10965d()) && this.f9592d.equals(hVar.mo10964c());
    }

    public int hashCode() {
        return ((((((this.f9589a.hashCode() ^ 1000003) * 1000003) ^ this.f9590b.hashCode()) * 1000003) ^ this.f9591c.hashCode()) * 1000003) ^ this.f9592d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f9589a + ", wallClock=" + this.f9590b + ", monotonicClock=" + this.f9591c + ", backendName=" + this.f9592d + "}";
    }
}
