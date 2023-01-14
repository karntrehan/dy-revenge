package p174e.p247e.p274h.p284e;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: e.e.h.e.b */
public class C6187b extends C6193g implements Runnable {

    /* renamed from: r */
    private int f17085r;

    /* renamed from: s */
    private boolean f17086s;

    /* renamed from: t */
    float f17087t;

    /* renamed from: u */
    private boolean f17088u;

    public C6187b(Drawable drawable, int i) {
        this(drawable, i, true);
    }

    public C6187b(Drawable drawable, int i, boolean z) {
        super((Drawable) C6062k.m22839g(drawable));
        this.f17087t = 0.0f;
        this.f17088u = false;
        this.f17085r = i;
        this.f17086s = z;
    }

    /* renamed from: w */
    private int m23419w() {
        return (int) ((20.0f / ((float) this.f17085r)) * 360.0f);
    }

    /* renamed from: x */
    private void m23420x() {
        if (!this.f17088u) {
            this.f17088u = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right;
        int i2 = bounds.left;
        int i3 = i - i2;
        int i4 = bounds.bottom;
        int i5 = bounds.top;
        int i6 = i4 - i5;
        float f = this.f17087t;
        if (!this.f17086s) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (float) (i2 + (i3 / 2)), (float) (i5 + (i6 / 2)));
        super.draw(canvas);
        canvas.restoreToCount(save);
        m23420x();
    }

    public void run() {
        this.f17088u = false;
        this.f17087t += (float) m23419w();
        invalidateSelf();
    }
}
