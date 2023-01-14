package androidx.camera.extensions.p017f.p021r;

import android.view.Surface;
import androidx.camera.extensions.p017f.p021r.C1066g;
import java.util.Objects;

/* renamed from: androidx.camera.extensions.f.r.e */
final class C1064e extends C1066g.C1070d {

    /* renamed from: e */
    private final Surface f2961e;

    C1064e(Surface surface) {
        Objects.requireNonNull(surface, "Null surface");
        this.f2961e = surface;
    }

    /* renamed from: b */
    public Surface mo3364b() {
        return this.f2961e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1066g.C1070d) {
            return this.f2961e.equals(((C1066g.C1070d) obj).mo3364b());
        }
        return false;
    }

    public int hashCode() {
        return this.f2961e.hashCode() ^ 1000003;
    }

    public String toString() {
        return "SurfaceConfig{surface=" + this.f2961e + "}";
    }
}
