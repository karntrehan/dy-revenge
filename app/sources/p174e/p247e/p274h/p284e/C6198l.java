package p174e.p247e.p274h.p284e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: e.e.h.e.l */
public class C6198l extends Drawable implements C6196j {

    /* renamed from: A */
    private final RectF f17127A = new RectF();

    /* renamed from: B */
    private int f17128B = 255;

    /* renamed from: f */
    private final float[] f17129f = new float[8];

    /* renamed from: o */
    final float[] f17130o = new float[8];

    /* renamed from: p */
    float[] f17131p;

    /* renamed from: q */
    final Paint f17132q = new Paint(1);

    /* renamed from: r */
    private boolean f17133r = false;

    /* renamed from: s */
    private float f17134s = 0.0f;

    /* renamed from: t */
    private float f17135t = 0.0f;

    /* renamed from: u */
    private int f17136u = 0;

    /* renamed from: v */
    private boolean f17137v = false;

    /* renamed from: w */
    private boolean f17138w = false;

    /* renamed from: x */
    final Path f17139x = new Path();

    /* renamed from: y */
    final Path f17140y = new Path();

    /* renamed from: z */
    private int f17141z = 0;

    public C6198l(int i) {
        mo18415e(i);
    }

    @TargetApi(11)
    /* renamed from: a */
    public static C6198l m23473a(ColorDrawable colorDrawable) {
        return new C6198l(colorDrawable.getColor());
    }

    /* renamed from: f */
    private void m23474f() {
        float[] fArr;
        float[] fArr2;
        this.f17139x.reset();
        this.f17140y.reset();
        this.f17127A.set(getBounds());
        RectF rectF = this.f17127A;
        float f = this.f17134s;
        rectF.inset(f / 2.0f, f / 2.0f);
        int i = 0;
        if (this.f17133r) {
            this.f17140y.addCircle(this.f17127A.centerX(), this.f17127A.centerY(), Math.min(this.f17127A.width(), this.f17127A.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr2 = this.f17130o;
                if (i2 >= fArr2.length) {
                    break;
                }
                fArr2[i2] = (this.f17129f[i2] + this.f17135t) - (this.f17134s / 2.0f);
                i2++;
            }
            this.f17140y.addRoundRect(this.f17127A, fArr2, Path.Direction.CW);
        }
        RectF rectF2 = this.f17127A;
        float f2 = this.f17134s;
        rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
        float f3 = this.f17135t + (this.f17137v ? this.f17134s : 0.0f);
        this.f17127A.inset(f3, f3);
        if (this.f17133r) {
            this.f17139x.addCircle(this.f17127A.centerX(), this.f17127A.centerY(), Math.min(this.f17127A.width(), this.f17127A.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f17137v) {
            if (this.f17131p == null) {
                this.f17131p = new float[8];
            }
            while (true) {
                fArr = this.f17131p;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = this.f17129f[i] - this.f17134s;
                i++;
            }
            this.f17139x.addRoundRect(this.f17127A, fArr, Path.Direction.CW);
        } else {
            this.f17139x.addRoundRect(this.f17127A, this.f17129f, Path.Direction.CW);
        }
        float f4 = -f3;
        this.f17127A.inset(f4, f4);
    }

    /* renamed from: b */
    public void mo18402b(int i, float f) {
        if (this.f17136u != i) {
            this.f17136u = i;
            invalidateSelf();
        }
        if (this.f17134s != f) {
            this.f17134s = f;
            m23474f();
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public boolean mo18413c() {
        return this.f17138w;
    }

    /* renamed from: d */
    public void mo18403d(boolean z) {
        this.f17133r = z;
        m23474f();
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f17132q.setColor(C6190e.m23430c(this.f17141z, this.f17128B));
        this.f17132q.setStyle(Paint.Style.FILL);
        this.f17132q.setFilterBitmap(mo18413c());
        canvas.drawPath(this.f17139x, this.f17132q);
        if (this.f17134s != 0.0f) {
            this.f17132q.setColor(C6190e.m23430c(this.f17136u, this.f17128B));
            this.f17132q.setStyle(Paint.Style.STROKE);
            this.f17132q.setStrokeWidth(this.f17134s);
            canvas.drawPath(this.f17140y, this.f17132q);
        }
    }

    /* renamed from: e */
    public void mo18415e(int i) {
        if (this.f17141z != i) {
            this.f17141z = i;
            invalidateSelf();
        }
    }

    /* renamed from: g */
    public void mo18404g(boolean z) {
        if (this.f17138w != z) {
            this.f17138w = z;
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f17128B;
    }

    public int getOpacity() {
        return C6190e.m23429b(C6190e.m23430c(this.f17141z, this.f17128B));
    }

    /* renamed from: i */
    public void mo18405i(boolean z) {
        if (this.f17137v != z) {
            this.f17137v = z;
            m23474f();
            invalidateSelf();
        }
    }

    /* renamed from: m */
    public void mo18406m(float f) {
        if (this.f17135t != f) {
            this.f17135t = f;
            m23474f();
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m23474f();
    }

    /* renamed from: p */
    public void mo18407p(float f) {
        C6062k.m22835c(f >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f17129f, f);
        m23474f();
        invalidateSelf();
    }

    /* renamed from: s */
    public void mo18408s(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f17129f, 0.0f);
        } else {
            C6062k.m22835c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f17129f, 0, 8);
        }
        m23474f();
        invalidateSelf();
    }

    public void setAlpha(int i) {
        if (i != this.f17128B) {
            this.f17128B = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
