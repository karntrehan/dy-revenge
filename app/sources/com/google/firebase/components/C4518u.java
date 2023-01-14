package com.google.firebase.components;

/* renamed from: com.google.firebase.components.u */
public final class C4518u {

    /* renamed from: a */
    private final Class<?> f12839a;

    /* renamed from: b */
    private final int f12840b;

    /* renamed from: c */
    private final int f12841c;

    private C4518u(Class<?> cls, int i, int i2) {
        this.f12839a = (Class) C4489d0.m17108c(cls, "Null dependency anInterface.");
        this.f12840b = i;
        this.f12841c = i2;
    }

    /* renamed from: a */
    public static C4518u m17190a(Class<?> cls) {
        return new C4518u(cls, 0, 2);
    }

    /* renamed from: b */
    private static String m17191b(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    /* renamed from: h */
    public static C4518u m17192h(Class<?> cls) {
        return new C4518u(cls, 0, 1);
    }

    /* renamed from: i */
    public static C4518u m17193i(Class<?> cls) {
        return new C4518u(cls, 1, 0);
    }

    /* renamed from: j */
    public static C4518u m17194j(Class<?> cls) {
        return new C4518u(cls, 1, 1);
    }

    /* renamed from: k */
    public static C4518u m17195k(Class<?> cls) {
        return new C4518u(cls, 2, 0);
    }

    /* renamed from: c */
    public Class<?> mo14053c() {
        return this.f12839a;
    }

    /* renamed from: d */
    public boolean mo14054d() {
        return this.f12841c == 2;
    }

    /* renamed from: e */
    public boolean mo14055e() {
        return this.f12841c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4518u)) {
            return false;
        }
        C4518u uVar = (C4518u) obj;
        return this.f12839a == uVar.f12839a && this.f12840b == uVar.f12840b && this.f12841c == uVar.f12841c;
    }

    /* renamed from: f */
    public boolean mo14057f() {
        return this.f12840b == 1;
    }

    /* renamed from: g */
    public boolean mo14058g() {
        return this.f12840b == 2;
    }

    public int hashCode() {
        return ((((this.f12839a.hashCode() ^ 1000003) * 1000003) ^ this.f12840b) * 1000003) ^ this.f12841c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f12839a);
        sb.append(", type=");
        int i = this.f12840b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(m17191b(this.f12841c));
        sb.append("}");
        return sb.toString();
    }
}
