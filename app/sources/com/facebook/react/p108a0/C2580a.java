package com.facebook.react.p108a0;

import com.facebook.react.bridge.WritableMap;

/* renamed from: com.facebook.react.a0.a */
public class C2580a {

    /* renamed from: a */
    private final String f7574a;

    /* renamed from: b */
    private final WritableMap f7575b;

    /* renamed from: c */
    private final long f7576c;

    /* renamed from: d */
    private final boolean f7577d;

    /* renamed from: e */
    private final C2586d f7578e;

    public C2580a(C2580a aVar) {
        this.f7574a = aVar.f7574a;
        this.f7575b = aVar.f7575b.copy();
        this.f7576c = aVar.f7576c;
        this.f7577d = aVar.f7577d;
        C2586d dVar = aVar.f7578e;
        this.f7578e = dVar != null ? dVar.copy() : null;
    }

    public C2580a(String str, WritableMap writableMap, long j, boolean z, C2586d dVar) {
        this.f7574a = str;
        this.f7575b = writableMap;
        this.f7576c = j;
        this.f7577d = z;
        this.f7578e = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public WritableMap mo8387a() {
        return this.f7575b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2586d mo8388b() {
        return this.f7578e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo8389c() {
        return this.f7574a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo8390d() {
        return this.f7576c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo8391e() {
        return this.f7577d;
    }
}
