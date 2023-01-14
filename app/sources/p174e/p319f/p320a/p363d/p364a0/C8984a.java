package p174e.p319f.p320a.p363d.p364a0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: e.f.a.d.a0.a */
public final class C8984a implements C8986c {

    /* renamed from: a */
    private final float f24408a;

    public C8984a(float f) {
        this.f24408a = f;
    }

    /* renamed from: a */
    public float mo22801a(RectF rectF) {
        return this.f24408a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8984a) && this.f24408a == ((C8984a) obj).f24408a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f24408a)});
    }
}
