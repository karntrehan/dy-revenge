package p174e.p247e.p274h.p284e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: e.e.h.e.h */
public class C6194h extends C6193g {

    /* renamed from: r */
    private Matrix f17114r;

    /* renamed from: s */
    private Matrix f17115s;

    /* renamed from: t */
    private int f17116t;

    /* renamed from: u */
    private int f17117u;

    /* renamed from: w */
    private void m23459w() {
        Matrix matrix;
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f17116t = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f17117u = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            matrix = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            matrix = this.f17114r;
        }
        this.f17115s = matrix;
    }

    /* renamed from: x */
    private void m23460x() {
        if (this.f17116t != getCurrent().getIntrinsicWidth() || this.f17117u != getCurrent().getIntrinsicHeight()) {
            m23459w();
        }
    }

    public void draw(Canvas canvas) {
        m23460x();
        if (this.f17115s != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f17115s);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* renamed from: f */
    public void mo18341f(Matrix matrix) {
        super.mo18341f(matrix);
        Matrix matrix2 = this.f17115s;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m23459w();
    }

    /* renamed from: u */
    public Drawable mo18399u(Drawable drawable) {
        Drawable u = super.mo18399u(drawable);
        m23459w();
        return u;
    }
}
