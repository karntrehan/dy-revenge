package androidx.camera.core.impl;

import androidx.camera.core.impl.C0879s2;
import java.util.Objects;

/* renamed from: androidx.camera.core.impl.x */
final class C0903x extends C0879s2 {

    /* renamed from: a */
    private final C0879s2.C0881b f2589a;

    /* renamed from: b */
    private final C0879s2.C0880a f2590b;

    C0903x(C0879s2.C0881b bVar, C0879s2.C0880a aVar) {
        Objects.requireNonNull(bVar, "Null configType");
        this.f2589a = bVar;
        Objects.requireNonNull(aVar, "Null configSize");
        this.f2590b = aVar;
    }

    /* renamed from: b */
    public C0879s2.C0880a mo3101b() {
        return this.f2590b;
    }

    /* renamed from: c */
    public C0879s2.C0881b mo3102c() {
        return this.f2589a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0879s2)) {
            return false;
        }
        C0879s2 s2Var = (C0879s2) obj;
        return this.f2589a.equals(s2Var.mo3102c()) && this.f2590b.equals(s2Var.mo3101b());
    }

    public int hashCode() {
        return ((this.f2589a.hashCode() ^ 1000003) * 1000003) ^ this.f2590b.hashCode();
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f2589a + ", configSize=" + this.f2590b + "}";
    }
}
