package p174e.p319f.p416e.p428v.p429r;

import p174e.p319f.p416e.C9670p;

/* renamed from: e.f.e.v.r.c */
public final class C9735c {

    /* renamed from: a */
    private final int f26088a;

    /* renamed from: b */
    private final int[] f26089b;

    /* renamed from: c */
    private final C9670p[] f26090c;

    public C9735c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f26088a = i;
        this.f26089b = iArr;
        float f = (float) i4;
        this.f26090c = new C9670p[]{new C9670p((float) i2, f), new C9670p((float) i3, f)};
    }

    /* renamed from: a */
    public C9670p[] mo24370a() {
        return this.f26090c;
    }

    /* renamed from: b */
    public int[] mo24371b() {
        return this.f26089b;
    }

    /* renamed from: c */
    public int mo24372c() {
        return this.f26088a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9735c) && this.f26088a == ((C9735c) obj).f26088a;
    }

    public int hashCode() {
        return this.f26088a;
    }
}
