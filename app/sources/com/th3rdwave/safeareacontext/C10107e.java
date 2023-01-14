package com.th3rdwave.safeareacontext;

import p455g.p470y.p472d.C10457l;

/* renamed from: com.th3rdwave.safeareacontext.e */
public final class C10107e {

    /* renamed from: a */
    private final float f26938a;

    /* renamed from: b */
    private final float f26939b;

    /* renamed from: c */
    private final float f26940c;

    /* renamed from: d */
    private final float f26941d;

    public C10107e(float f, float f2, float f3, float f4) {
        this.f26938a = f;
        this.f26939b = f2;
        this.f26940c = f3;
        this.f26941d = f4;
    }

    /* renamed from: a */
    public final float mo25162a() {
        return this.f26940c;
    }

    /* renamed from: b */
    public final float mo25163b() {
        return this.f26941d;
    }

    /* renamed from: c */
    public final float mo25164c() {
        return this.f26939b;
    }

    /* renamed from: d */
    public final float mo25165d() {
        return this.f26938a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10107e)) {
            return false;
        }
        C10107e eVar = (C10107e) obj;
        return C10457l.m35316a(Float.valueOf(this.f26938a), Float.valueOf(eVar.f26938a)) && C10457l.m35316a(Float.valueOf(this.f26939b), Float.valueOf(eVar.f26939b)) && C10457l.m35316a(Float.valueOf(this.f26940c), Float.valueOf(eVar.f26940c)) && C10457l.m35316a(Float.valueOf(this.f26941d), Float.valueOf(eVar.f26941d));
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f26938a) * 31) + Float.floatToIntBits(this.f26939b)) * 31) + Float.floatToIntBits(this.f26940c)) * 31) + Float.floatToIntBits(this.f26941d);
    }

    public String toString() {
        return "EdgeInsets(top=" + this.f26938a + ", right=" + this.f26939b + ", bottom=" + this.f26940c + ", left=" + this.f26941d + ')';
    }
}
