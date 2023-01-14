package p174e.p319f.p416e.p428v.p429r.p430g.p431e;

import p174e.p319f.p416e.C9660f;

/* renamed from: e.f.e.v.r.g.e.p */
final class C9759p extends C9760q {

    /* renamed from: b */
    private final int f26135b;

    /* renamed from: c */
    private final int f26136c;

    C9759p(int i, int i2, int i3) {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw C9660f.m32836a();
        }
        this.f26135b = i2;
        this.f26136c = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo24417b() {
        return this.f26135b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo24418c() {
        return this.f26136c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo24419d() {
        return this.f26135b == 10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo24420e() {
        return this.f26136c == 10;
    }
}
