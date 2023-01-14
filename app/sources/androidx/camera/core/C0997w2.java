package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: androidx.camera.core.w2 */
final class C0997w2 extends C0627c2 {

    /* renamed from: p */
    private final C0927j2 f2820p;

    /* renamed from: q */
    private Rect f2821q;

    /* renamed from: r */
    private final int f2822r;

    /* renamed from: s */
    private final int f2823s;

    C0997w2(ImageProxy imageProxy, Size size, C0927j2 j2Var) {
        super(imageProxy);
        int i;
        if (size == null) {
            this.f2822r = super.mo2541e();
            i = super.mo2539c();
        } else {
            this.f2822r = size.getWidth();
            i = size.getHeight();
        }
        this.f2823s = i;
        this.f2820p = j2Var;
    }

    C0997w2(ImageProxy imageProxy, C0927j2 j2Var) {
        this(imageProxy, (Size) null, j2Var);
    }

    /* renamed from: S */
    public synchronized void mo2536S(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, mo2541e(), mo2539c())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        this.f2821q = rect;
    }

    /* renamed from: U */
    public C0927j2 mo2537U() {
        return this.f2820p;
    }

    /* renamed from: c */
    public synchronized int mo2539c() {
        return this.f2823s;
    }

    /* renamed from: e */
    public synchronized int mo2541e() {
        return this.f2822r;
    }
}
