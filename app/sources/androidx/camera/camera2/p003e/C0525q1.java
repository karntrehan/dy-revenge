package androidx.camera.camera2.p003e;

import android.util.Size;
import androidx.camera.camera2.p003e.C0553w1;
import androidx.camera.core.impl.C0840m2;
import java.util.Objects;

/* renamed from: androidx.camera.camera2.e.q1 */
final class C0525q1 extends C0553w1.C0563h {

    /* renamed from: a */
    private final String f1696a;

    /* renamed from: b */
    private final Class<?> f1697b;

    /* renamed from: c */
    private final C0840m2 f1698c;

    /* renamed from: d */
    private final Size f1699d;

    C0525q1(String str, Class<?> cls, C0840m2 m2Var, Size size) {
        Objects.requireNonNull(str, "Null useCaseId");
        this.f1696a = str;
        Objects.requireNonNull(cls, "Null useCaseType");
        this.f1697b = cls;
        Objects.requireNonNull(m2Var, "Null sessionConfig");
        this.f1698c = m2Var;
        this.f1699d = size;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0840m2 mo2266c() {
        return this.f1698c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Size mo2267d() {
        return this.f1699d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo2268e() {
        return this.f1696a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0553w1.C0563h)) {
            return false;
        }
        C0553w1.C0563h hVar = (C0553w1.C0563h) obj;
        if (this.f1696a.equals(hVar.mo2268e()) && this.f1697b.equals(hVar.mo2270f()) && this.f1698c.equals(hVar.mo2266c())) {
            Size size = this.f1699d;
            Size d = hVar.mo2267d();
            if (size == null) {
                if (d == null) {
                    return true;
                }
            } else if (size.equals(d)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Class<?> mo2270f() {
        return this.f1697b;
    }

    public int hashCode() {
        int hashCode = (((((this.f1696a.hashCode() ^ 1000003) * 1000003) ^ this.f1697b.hashCode()) * 1000003) ^ this.f1698c.hashCode()) * 1000003;
        Size size = this.f1699d;
        return hashCode ^ (size == null ? 0 : size.hashCode());
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f1696a + ", useCaseType=" + this.f1697b + ", sessionConfig=" + this.f1698c + ", surfaceResolution=" + this.f1699d + "}";
    }
}
