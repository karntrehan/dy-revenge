package p027c.p100v;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: c.v.h0 */
class C2165h0 implements C2167i0 {

    /* renamed from: a */
    private final ViewGroupOverlay f6355a;

    C2165h0(ViewGroup viewGroup) {
        this.f6355a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo7276a(Drawable drawable) {
        this.f6355a.add(drawable);
    }

    /* renamed from: b */
    public void mo7277b(Drawable drawable) {
        this.f6355a.remove(drawable);
    }

    /* renamed from: c */
    public void mo7273c(View view) {
        this.f6355a.add(view);
    }

    /* renamed from: d */
    public void mo7274d(View view) {
        this.f6355a.remove(view);
    }
}
