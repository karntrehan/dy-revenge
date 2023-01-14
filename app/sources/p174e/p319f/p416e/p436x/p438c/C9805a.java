package p174e.p319f.p416e.p436x.p438c;

import p174e.p319f.p416e.C9670p;

/* renamed from: e.f.e.x.c.a */
public final class C9805a extends C9670p {

    /* renamed from: c */
    private final float f26269c;

    C9805a(float f, float f2, float f3) {
        super(f, f2);
        this.f26269c = f3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo24536f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo24231d()) > f || Math.abs(f3 - mo24230c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f26269c);
        return abs <= 1.0f || abs <= this.f26269c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C9805a mo24537g(float f, float f2, float f3) {
        return new C9805a((mo24230c() + f2) / 2.0f, (mo24231d() + f) / 2.0f, (this.f26269c + f3) / 2.0f);
    }
}
