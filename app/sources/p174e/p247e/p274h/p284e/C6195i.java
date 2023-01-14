package p174e.p247e.p274h.p284e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: e.e.h.e.i */
public class C6195i extends C6193g {

    /* renamed from: r */
    final Matrix f17118r = new Matrix();

    /* renamed from: s */
    private int f17119s;

    /* renamed from: t */
    private int f17120t;

    /* renamed from: u */
    private final Matrix f17121u = new Matrix();

    /* renamed from: v */
    private final RectF f17122v = new RectF();

    public C6195i(Drawable drawable, int i, int i2) {
        super(drawable);
        this.f17119s = i - (i % 90);
        this.f17120t = (i2 < 0 || i2 > 8) ? 0 : i2;
    }

    public void draw(Canvas canvas) {
        int i;
        if (this.f17119s > 0 || !((i = this.f17120t) == 0 || i == 1)) {
            int save = canvas.save();
            canvas.concat(this.f17118r);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* renamed from: f */
    public void mo18341f(Matrix matrix) {
        mo18398t(matrix);
        if (!this.f17118r.isIdentity()) {
            matrix.preConcat(this.f17118r);
        }
    }

    public int getIntrinsicHeight() {
        int i = this.f17120t;
        return (i == 5 || i == 7 || this.f17119s % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        int i = this.f17120t;
        return (i == 5 || i == 7 || this.f17119s % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        int i;
        Drawable current = getCurrent();
        int i2 = this.f17119s;
        if (i2 > 0 || !((i = this.f17120t) == 0 || i == 1)) {
            int i3 = this.f17120t;
            if (i3 == 2) {
                this.f17118r.setScale(-1.0f, 1.0f);
            } else if (i3 == 7) {
                this.f17118r.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                this.f17118r.postScale(-1.0f, 1.0f);
            } else if (i3 == 4) {
                this.f17118r.setScale(1.0f, -1.0f);
            } else if (i3 != 5) {
                this.f17118r.setRotate((float) i2, (float) rect.centerX(), (float) rect.centerY());
            } else {
                this.f17118r.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                this.f17118r.postScale(1.0f, -1.0f);
            }
            this.f17121u.reset();
            this.f17118r.invert(this.f17121u);
            this.f17122v.set(rect);
            this.f17121u.mapRect(this.f17122v);
            RectF rectF = this.f17122v;
            current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            return;
        }
        current.setBounds(rect);
    }
}
