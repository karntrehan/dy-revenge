package com.th3rdwave.safeareacontext;

import p455g.p470y.p472d.C10457l;

/* renamed from: com.th3rdwave.safeareacontext.g */
public final class C10110g {

    /* renamed from: a */
    private final float f26945a;

    /* renamed from: b */
    private final float f26946b;

    /* renamed from: c */
    private final float f26947c;

    /* renamed from: d */
    private final float f26948d;

    public C10110g(float f, float f2, float f3, float f4) {
        this.f26945a = f;
        this.f26946b = f2;
        this.f26947c = f3;
        this.f26948d = f4;
    }

    /* renamed from: a */
    public final float mo25169a() {
        return this.f26948d;
    }

    /* renamed from: b */
    public final float mo25170b() {
        return this.f26947c;
    }

    /* renamed from: c */
    public final float mo25171c() {
        return this.f26945a;
    }

    /* renamed from: d */
    public final float mo25172d() {
        return this.f26946b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10110g)) {
            return false;
        }
        C10110g gVar = (C10110g) obj;
        return C10457l.m35316a(Float.valueOf(this.f26945a), Float.valueOf(gVar.f26945a)) && C10457l.m35316a(Float.valueOf(this.f26946b), Float.valueOf(gVar.f26946b)) && C10457l.m35316a(Float.valueOf(this.f26947c), Float.valueOf(gVar.f26947c)) && C10457l.m35316a(Float.valueOf(this.f26948d), Float.valueOf(gVar.f26948d));
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f26945a) * 31) + Float.floatToIntBits(this.f26946b)) * 31) + Float.floatToIntBits(this.f26947c)) * 31) + Float.floatToIntBits(this.f26948d);
    }

    public String toString() {
        return "Rect(x=" + this.f26945a + ", y=" + this.f26946b + ", width=" + this.f26947c + ", height=" + this.f26948d + ')';
    }
}
