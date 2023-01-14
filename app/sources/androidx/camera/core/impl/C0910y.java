package androidx.camera.core.impl;

import android.util.Size;
import java.util.Objects;

/* renamed from: androidx.camera.core.impl.y */
final class C0910y extends C0886t2 {

    /* renamed from: a */
    private final Size f2607a;

    /* renamed from: b */
    private final Size f2608b;

    /* renamed from: c */
    private final Size f2609c;

    C0910y(Size size, Size size2, Size size3) {
        Objects.requireNonNull(size, "Null analysisSize");
        this.f2607a = size;
        Objects.requireNonNull(size2, "Null previewSize");
        this.f2608b = size2;
        Objects.requireNonNull(size3, "Null recordSize");
        this.f2609c = size3;
    }

    /* renamed from: b */
    public Size mo3108b() {
        return this.f2607a;
    }

    /* renamed from: c */
    public Size mo3109c() {
        return this.f2608b;
    }

    /* renamed from: d */
    public Size mo3110d() {
        return this.f2609c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0886t2)) {
            return false;
        }
        C0886t2 t2Var = (C0886t2) obj;
        return this.f2607a.equals(t2Var.mo3108b()) && this.f2608b.equals(t2Var.mo3109c()) && this.f2609c.equals(t2Var.mo3110d());
    }

    public int hashCode() {
        return ((((this.f2607a.hashCode() ^ 1000003) * 1000003) ^ this.f2608b.hashCode()) * 1000003) ^ this.f2609c.hashCode();
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f2607a + ", previewSize=" + this.f2608b + ", recordSize=" + this.f2609c + "}";
    }
}
