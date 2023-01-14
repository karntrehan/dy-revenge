package androidx.camera.core;

import android.graphics.Rect;
import androidx.camera.core.C1011z2;
import java.util.Objects;

/* renamed from: androidx.camera.core.j1 */
final class C0926j1 extends C1011z2.C1018g {

    /* renamed from: a */
    private final Rect f2637a;

    /* renamed from: b */
    private final int f2638b;

    /* renamed from: c */
    private final int f2639c;

    C0926j1(Rect rect, int i, int i2) {
        Objects.requireNonNull(rect, "Null cropRect");
        this.f2637a = rect;
        this.f2638b = i;
        this.f2639c = i2;
    }

    /* renamed from: a */
    public Rect mo3179a() {
        return this.f2637a;
    }

    /* renamed from: b */
    public int mo3180b() {
        return this.f2638b;
    }

    /* renamed from: c */
    public int mo3181c() {
        return this.f2639c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1011z2.C1018g)) {
            return false;
        }
        C1011z2.C1018g gVar = (C1011z2.C1018g) obj;
        return this.f2637a.equals(gVar.mo3179a()) && this.f2638b == gVar.mo3180b() && this.f2639c == gVar.mo3181c();
    }

    public int hashCode() {
        return ((((this.f2637a.hashCode() ^ 1000003) * 1000003) ^ this.f2638b) * 1000003) ^ this.f2639c;
    }

    public String toString() {
        return "TransformationInfo{cropRect=" + this.f2637a + ", rotationDegrees=" + this.f2638b + ", targetRotation=" + this.f2639c + "}";
    }
}
