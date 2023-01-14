package p174e.p319f.p320a.p363d.p364a0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: e.f.a.d.a0.i */
public final class C8995i implements C8986c {

    /* renamed from: a */
    private final float f24459a;

    public C8995i(float f) {
        this.f24459a = f;
    }

    /* renamed from: a */
    public float mo22801a(RectF rectF) {
        return this.f24459a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8995i) && this.f24459a == ((C8995i) obj).f24459a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f24459a)});
    }
}
