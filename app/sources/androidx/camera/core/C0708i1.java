package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.C1011z2;
import java.util.Objects;

/* renamed from: androidx.camera.core.i1 */
final class C0708i1 extends C1011z2.C1017f {

    /* renamed from: a */
    private final int f2218a;

    /* renamed from: b */
    private final Surface f2219b;

    C0708i1(int i, Surface surface) {
        this.f2218a = i;
        Objects.requireNonNull(surface, "Null surface");
        this.f2219b = surface;
    }

    /* renamed from: a */
    public int mo2789a() {
        return this.f2218a;
    }

    /* renamed from: b */
    public Surface mo2790b() {
        return this.f2219b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1011z2.C1017f)) {
            return false;
        }
        C1011z2.C1017f fVar = (C1011z2.C1017f) obj;
        return this.f2218a == fVar.mo2789a() && this.f2219b.equals(fVar.mo2790b());
    }

    public int hashCode() {
        return ((this.f2218a ^ 1000003) * 1000003) ^ this.f2219b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f2218a + ", surface=" + this.f2219b + "}";
    }
}
