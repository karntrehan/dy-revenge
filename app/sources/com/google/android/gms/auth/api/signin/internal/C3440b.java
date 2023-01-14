package com.google.android.gms.auth.api.signin.internal;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
public class C3440b {

    /* renamed from: a */
    static int f9782a = 31;

    /* renamed from: b */
    private int f9783b = 1;

    /* renamed from: a */
    public C3440b mo11116a(Object obj) {
        this.f9783b = (f9782a * this.f9783b) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: b */
    public int mo11117b() {
        return this.f9783b;
    }

    /* renamed from: c */
    public final C3440b mo11118c(boolean z) {
        this.f9783b = (f9782a * this.f9783b) + (z ? 1 : 0);
        return this;
    }
}
