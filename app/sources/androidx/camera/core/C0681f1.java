package androidx.camera.core;

import androidx.camera.core.C0974t1;
import java.util.Objects;

/* renamed from: androidx.camera.core.f1 */
final class C0681f1 extends C0974t1 {

    /* renamed from: a */
    private final C0974t1.C0976b f2138a;

    /* renamed from: b */
    private final C0974t1.C0975a f2139b;

    C0681f1(C0974t1.C0976b bVar, C0974t1.C0975a aVar) {
        Objects.requireNonNull(bVar, "Null type");
        this.f2138a = bVar;
        this.f2139b = aVar;
    }

    /* renamed from: c */
    public C0974t1.C0975a mo2722c() {
        return this.f2139b;
    }

    /* renamed from: d */
    public C0974t1.C0976b mo2723d() {
        return this.f2138a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0974t1)) {
            return false;
        }
        C0974t1 t1Var = (C0974t1) obj;
        if (this.f2138a.equals(t1Var.mo2723d())) {
            C0974t1.C0975a aVar = this.f2139b;
            C0974t1.C0975a c = t1Var.mo2722c();
            if (aVar == null) {
                if (c == null) {
                    return true;
                }
            } else if (aVar.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f2138a.hashCode() ^ 1000003) * 1000003;
        C0974t1.C0975a aVar = this.f2139b;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f2138a + ", error=" + this.f2139b + "}";
    }
}
