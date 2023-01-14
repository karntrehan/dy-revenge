package p027c.p100v;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: c.v.m0 */
class C2178m0 implements C2181n0 {

    /* renamed from: a */
    private final ViewOverlay f6387a;

    C2178m0(View view) {
        this.f6387a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo7276a(Drawable drawable) {
        this.f6387a.add(drawable);
    }

    /* renamed from: b */
    public void mo7277b(Drawable drawable) {
        this.f6387a.remove(drawable);
    }
}
