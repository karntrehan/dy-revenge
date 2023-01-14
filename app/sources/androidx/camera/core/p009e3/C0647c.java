package androidx.camera.core.p009e3;

/* renamed from: androidx.camera.core.e3.c */
final class C0647c extends C0653f {

    /* renamed from: a */
    private final float f2094a;

    /* renamed from: b */
    private final float f2095b;

    /* renamed from: c */
    private final float f2096c;

    /* renamed from: d */
    private final float f2097d;

    C0647c(float f, float f2, float f3, float f4) {
        this.f2094a = f;
        this.f2095b = f2;
        this.f2096c = f3;
        this.f2097d = f4;
    }

    /* renamed from: a */
    public float mo2068a() {
        return this.f2095b;
    }

    /* renamed from: b */
    public float mo2069b() {
        return this.f2096c;
    }

    /* renamed from: c */
    public float mo2070c() {
        return this.f2094a;
    }

    /* renamed from: d */
    public float mo2071d() {
        return this.f2097d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0653f)) {
            return false;
        }
        C0653f fVar = (C0653f) obj;
        return Float.floatToIntBits(this.f2094a) == Float.floatToIntBits(fVar.mo2070c()) && Float.floatToIntBits(this.f2095b) == Float.floatToIntBits(fVar.mo2068a()) && Float.floatToIntBits(this.f2096c) == Float.floatToIntBits(fVar.mo2069b()) && Float.floatToIntBits(this.f2097d) == Float.floatToIntBits(fVar.mo2071d());
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f2094a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f2095b)) * 1000003) ^ Float.floatToIntBits(this.f2096c)) * 1000003) ^ Float.floatToIntBits(this.f2097d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f2094a + ", maxZoomRatio=" + this.f2095b + ", minZoomRatio=" + this.f2096c + ", linearZoom=" + this.f2097d + "}";
    }
}
