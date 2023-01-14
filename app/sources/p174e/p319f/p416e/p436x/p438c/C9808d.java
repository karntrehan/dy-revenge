package p174e.p319f.p416e.p436x.p438c;

import p174e.p319f.p416e.C9670p;

/* renamed from: e.f.e.x.c.d */
public final class C9808d extends C9670p {

    /* renamed from: c */
    private final float f26281c;

    /* renamed from: d */
    private final int f26282d;

    C9808d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    private C9808d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f26281c = f3;
        this.f26282d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo24543f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo24231d()) > f || Math.abs(f3 - mo24230c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f26281c);
        return abs <= 1.0f || abs <= this.f26281c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C9808d mo24544g(float f, float f2, float f3) {
        int i = this.f26282d;
        int i2 = i + 1;
        float c = (((float) i) * mo24230c()) + f2;
        float f4 = (float) i2;
        return new C9808d(c / f4, ((((float) this.f26282d) * mo24231d()) + f) / f4, ((((float) this.f26282d) * this.f26281c) + f3) / f4, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo24545h() {
        return this.f26282d;
    }

    /* renamed from: i */
    public float mo24546i() {
        return this.f26281c;
    }
}
