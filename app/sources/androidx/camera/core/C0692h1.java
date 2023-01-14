package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.C0891u2;
import java.util.Objects;

/* renamed from: androidx.camera.core.h1 */
final class C0692h1 extends C0940m2 {

    /* renamed from: a */
    private final C0891u2 f2159a;

    /* renamed from: b */
    private final long f2160b;

    /* renamed from: c */
    private final int f2161c;

    /* renamed from: d */
    private final Matrix f2162d;

    C0692h1(C0891u2 u2Var, long j, int i, Matrix matrix) {
        Objects.requireNonNull(u2Var, "Null tagBundle");
        this.f2159a = u2Var;
        this.f2160b = j;
        this.f2161c = i;
        Objects.requireNonNull(matrix, "Null sensorToBufferTransformMatrix");
        this.f2162d = matrix;
    }

    /* renamed from: b */
    public long mo2692b() {
        return this.f2160b;
    }

    /* renamed from: c */
    public C0891u2 mo2693c() {
        return this.f2159a;
    }

    /* renamed from: e */
    public int mo2695e() {
        return this.f2161c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0940m2)) {
            return false;
        }
        C0940m2 m2Var = (C0940m2) obj;
        return this.f2159a.equals(m2Var.mo2693c()) && this.f2160b == m2Var.mo2692b() && this.f2161c == m2Var.mo2695e() && this.f2162d.equals(m2Var.mo2740f());
    }

    /* renamed from: f */
    public Matrix mo2740f() {
        return this.f2162d;
    }

    public int hashCode() {
        long j = this.f2160b;
        return ((((((this.f2159a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f2161c) * 1000003) ^ this.f2162d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f2159a + ", timestamp=" + this.f2160b + ", rotationDegrees=" + this.f2161c + ", sensorToBufferTransformMatrix=" + this.f2162d + "}";
    }
}
