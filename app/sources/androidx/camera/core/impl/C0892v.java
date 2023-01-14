package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import java.util.Objects;

/* renamed from: androidx.camera.core.impl.v */
final class C0892v extends C0806f2 {

    /* renamed from: a */
    private final Surface f2569a;

    /* renamed from: b */
    private final Size f2570b;

    /* renamed from: c */
    private final int f2571c;

    C0892v(Surface surface, Size size, int i) {
        Objects.requireNonNull(surface, "Null surface");
        this.f2569a = surface;
        Objects.requireNonNull(size, "Null size");
        this.f2570b = size;
        this.f2571c = i;
    }

    /* renamed from: b */
    public int mo2983b() {
        return this.f2571c;
    }

    /* renamed from: c */
    public Size mo2984c() {
        return this.f2570b;
    }

    /* renamed from: d */
    public Surface mo2985d() {
        return this.f2569a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0806f2)) {
            return false;
        }
        C0806f2 f2Var = (C0806f2) obj;
        return this.f2569a.equals(f2Var.mo2985d()) && this.f2570b.equals(f2Var.mo2984c()) && this.f2571c == f2Var.mo2983b();
    }

    public int hashCode() {
        return ((((this.f2569a.hashCode() ^ 1000003) * 1000003) ^ this.f2570b.hashCode()) * 1000003) ^ this.f2571c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f2569a + ", size=" + this.f2570b + ", imageFormat=" + this.f2571c + "}";
    }
}
