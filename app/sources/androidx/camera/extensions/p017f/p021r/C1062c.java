package androidx.camera.extensions.p017f.p021r;

import android.util.Size;
import androidx.camera.extensions.p017f.p021r.C1066g;
import java.util.Objects;

/* renamed from: androidx.camera.extensions.f.r.c */
final class C1062c extends C1066g.C1067a {

    /* renamed from: e */
    private final Size f2956e;

    /* renamed from: f */
    private final int f2957f;

    /* renamed from: g */
    private final int f2958g;

    C1062c(Size size, int i, int i2) {
        Objects.requireNonNull(size, "Null size");
        this.f2956e = size;
        this.f2957f = i;
        this.f2958g = i2;
    }

    /* renamed from: d */
    public int mo3353d() {
        return this.f2957f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1066g.C1067a)) {
            return false;
        }
        C1066g.C1067a aVar = (C1066g.C1067a) obj;
        return this.f2956e.equals(aVar.mo3356h()) && this.f2957f == aVar.mo3353d() && this.f2958g == aVar.mo3355f();
    }

    /* renamed from: f */
    public int mo3355f() {
        return this.f2958g;
    }

    /* renamed from: h */
    public Size mo3356h() {
        return this.f2956e;
    }

    public int hashCode() {
        return ((((this.f2956e.hashCode() ^ 1000003) * 1000003) ^ this.f2957f) * 1000003) ^ this.f2958g;
    }

    public String toString() {
        return "ImageReaderConfig{size=" + this.f2956e + ", imageFormat=" + this.f2957f + ", maxImages=" + this.f2958g + "}";
    }
}
