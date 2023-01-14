package androidx.camera.extensions.p017f.p021r;

import androidx.camera.extensions.p017f.p021r.C1066g;

/* renamed from: androidx.camera.extensions.f.r.d */
final class C1063d extends C1066g.C1068b {

    /* renamed from: e */
    private final int f2959e;

    /* renamed from: f */
    private final int f2960f;

    C1063d(int i, int i2) {
        this.f2959e = i;
        this.f2960f = i2;
    }

    /* renamed from: d */
    public int mo3359d() {
        return this.f2959e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1066g.C1068b)) {
            return false;
        }
        C1066g.C1068b bVar = (C1066g.C1068b) obj;
        return this.f2959e == bVar.mo3359d() && this.f2960f == bVar.mo3361f();
    }

    /* renamed from: f */
    public int mo3361f() {
        return this.f2960f;
    }

    public int hashCode() {
        return ((this.f2959e ^ 1000003) * 1000003) ^ this.f2960f;
    }

    public String toString() {
        return "MultiResolutionImageReaderConfig{imageFormat=" + this.f2959e + ", maxImages=" + this.f2960f + "}";
    }
}
