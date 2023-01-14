package p027c.p100v;

import android.view.View;
import android.view.WindowId;

/* renamed from: c.v.y0 */
class C2223y0 implements C2227z0 {

    /* renamed from: a */
    private final WindowId f6488a;

    C2223y0(View view) {
        this.f6488a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2223y0) && ((C2223y0) obj).f6488a.equals(this.f6488a);
    }

    public int hashCode() {
        return this.f6488a.hashCode();
    }
}
