package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4703c0;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.h.l.y */
final class C4772y extends C4703c0.C4705b {

    /* renamed from: a */
    private final int f13438a;

    /* renamed from: b */
    private final String f13439b;

    /* renamed from: c */
    private final int f13440c;

    /* renamed from: d */
    private final long f13441d;

    /* renamed from: e */
    private final long f13442e;

    /* renamed from: f */
    private final boolean f13443f;

    /* renamed from: g */
    private final int f13444g;

    /* renamed from: h */
    private final String f13445h;

    /* renamed from: i */
    private final String f13446i;

    C4772y(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f13438a = i;
        Objects.requireNonNull(str, "Null model");
        this.f13439b = str;
        this.f13440c = i2;
        this.f13441d = j;
        this.f13442e = j2;
        this.f13443f = z;
        this.f13444g = i3;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f13445h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f13446i = str3;
    }

    /* renamed from: a */
    public int mo14567a() {
        return this.f13438a;
    }

    /* renamed from: b */
    public int mo14568b() {
        return this.f13440c;
    }

    /* renamed from: d */
    public long mo14569d() {
        return this.f13442e;
    }

    /* renamed from: e */
    public boolean mo14570e() {
        return this.f13443f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4703c0.C4705b)) {
            return false;
        }
        C4703c0.C4705b bVar = (C4703c0.C4705b) obj;
        return this.f13438a == bVar.mo14567a() && this.f13439b.equals(bVar.mo14572g()) && this.f13440c == bVar.mo14568b() && this.f13441d == bVar.mo14575j() && this.f13442e == bVar.mo14569d() && this.f13443f == bVar.mo14570e() && this.f13444g == bVar.mo14574i() && this.f13445h.equals(bVar.mo14571f()) && this.f13446i.equals(bVar.mo14573h());
    }

    /* renamed from: f */
    public String mo14571f() {
        return this.f13445h;
    }

    /* renamed from: g */
    public String mo14572g() {
        return this.f13439b;
    }

    /* renamed from: h */
    public String mo14573h() {
        return this.f13446i;
    }

    public int hashCode() {
        long j = this.f13441d;
        long j2 = this.f13442e;
        return ((((((((((((((((this.f13438a ^ 1000003) * 1000003) ^ this.f13439b.hashCode()) * 1000003) ^ this.f13440c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f13443f ? 1231 : 1237)) * 1000003) ^ this.f13444g) * 1000003) ^ this.f13445h.hashCode()) * 1000003) ^ this.f13446i.hashCode();
    }

    /* renamed from: i */
    public int mo14574i() {
        return this.f13444g;
    }

    /* renamed from: j */
    public long mo14575j() {
        return this.f13441d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f13438a + ", model=" + this.f13439b + ", availableProcessors=" + this.f13440c + ", totalRam=" + this.f13441d + ", diskSpace=" + this.f13442e + ", isEmulator=" + this.f13443f + ", state=" + this.f13444g + ", manufacturer=" + this.f13445h + ", modelClass=" + this.f13446i + "}";
    }
}
