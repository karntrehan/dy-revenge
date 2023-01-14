package p174e.p319f.p320a.p363d.p364a0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: e.f.a.d.a0.b */
public final class C8985b implements C8986c {

    /* renamed from: a */
    private final C8986c f24409a;

    /* renamed from: b */
    private final float f24410b;

    public C8985b(float f, C8986c cVar) {
        while (cVar instanceof C8985b) {
            cVar = ((C8985b) cVar).f24409a;
            f += ((C8985b) cVar).f24410b;
        }
        this.f24409a = cVar;
        this.f24410b = f;
    }

    /* renamed from: a */
    public float mo22801a(RectF rectF) {
        return Math.max(0.0f, this.f24409a.mo22801a(rectF) + this.f24410b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8985b)) {
            return false;
        }
        C8985b bVar = (C8985b) obj;
        return this.f24409a.equals(bVar.f24409a) && this.f24410b == bVar.f24410b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24409a, Float.valueOf(this.f24410b)});
    }
}
