package p027c.p058e.p059a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: c.e.a.h */
class C1786h extends Drawable {

    /* renamed from: a */
    private static final double f5289a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    static C1787a f5290b;

    /* renamed from: c */
    private final int f5291c;

    /* renamed from: d */
    private Paint f5292d;

    /* renamed from: e */
    private Paint f5293e;

    /* renamed from: f */
    private Paint f5294f;

    /* renamed from: g */
    private final RectF f5295g;

    /* renamed from: h */
    private float f5296h;

    /* renamed from: i */
    private Path f5297i;

    /* renamed from: j */
    private float f5298j;

    /* renamed from: k */
    private float f5299k;

    /* renamed from: l */
    private float f5300l;

    /* renamed from: m */
    private ColorStateList f5301m;

    /* renamed from: n */
    private boolean f5302n;

    /* renamed from: o */
    private final int f5303o;

    /* renamed from: p */
    private final int f5304p;

    /* renamed from: q */
    private boolean f5305q;

    /* renamed from: r */
    private boolean f5306r;

    /* renamed from: c.e.a.h$a */
    interface C1787a {
        /* renamed from: a */
        void mo6069a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    /* renamed from: a */
    private void m7577a(Rect rect) {
        float f = this.f5298j;
        float f2 = 1.5f * f;
        this.f5295g.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        m7578b();
    }

    /* renamed from: b */
    private void m7578b() {
        float f = this.f5296h;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f5299k;
        rectF2.inset(-f2, -f2);
        Path path = this.f5297i;
        if (path == null) {
            this.f5297i = new Path();
        } else {
            path.reset();
        }
        this.f5297i.setFillType(Path.FillType.EVEN_ODD);
        this.f5297i.moveTo(-this.f5296h, 0.0f);
        this.f5297i.rLineTo(-this.f5299k, 0.0f);
        this.f5297i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f5297i.arcTo(rectF, 270.0f, -90.0f, false);
        this.f5297i.close();
        float f3 = this.f5296h;
        float f4 = f3 / (this.f5299k + f3);
        Paint paint = this.f5293e;
        float f5 = this.f5296h + this.f5299k;
        int i = this.f5303o;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f5304p}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f5294f;
        float f6 = this.f5296h;
        float f7 = this.f5299k;
        int i2 = this.f5303o;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f5304p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f5294f.setAntiAlias(false);
    }

    /* renamed from: c */
    static float m7579c(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f5289a) * ((double) f2))) : f;
    }

    /* renamed from: d */
    static float m7580d(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        return z ? (float) (((double) f3) + ((1.0d - f5289a) * ((double) f2))) : f3;
    }

    /* renamed from: e */
    private void m7581e(Canvas canvas) {
        float f = this.f5296h;
        float f2 = (-f) - this.f5299k;
        float f3 = f + ((float) this.f5291c) + (this.f5300l / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f5295g.width() - f4 > 0.0f;
        boolean z2 = this.f5295g.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f5295g;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f5297i, this.f5293e);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f5295g.width() - f4, -this.f5296h, this.f5294f);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f5295g;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f5297i, this.f5293e);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f5295g.width() - f4, (-this.f5296h) + this.f5299k, this.f5294f);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f5295g;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f5297i, this.f5293e);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f5295g.height() - f4, -this.f5296h, this.f5294f);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f5295g;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f5297i, this.f5293e);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f5295g.height() - f4, -this.f5296h, this.f5294f);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: n */
    private void m7582n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f5301m = colorStateList;
        this.f5292d.setColor(colorStateList.getColorForState(getState(), this.f5301m.getDefaultColor()));
    }

    /* renamed from: s */
    private void m7583s(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float t = (float) m7584t(f);
            float t2 = (float) m7584t(f2);
            if (t > t2) {
                if (!this.f5306r) {
                    this.f5306r = true;
                }
                t = t2;
            }
            if (this.f5300l != t || this.f5298j != t2) {
                this.f5300l = t;
                this.f5298j = t2;
                this.f5299k = (float) ((int) ((t * 1.5f) + ((float) this.f5291c) + 0.5f));
                this.f5302n = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    /* renamed from: t */
    private int m7584t(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    public void draw(Canvas canvas) {
        if (this.f5302n) {
            m7577a(getBounds());
            this.f5302n = false;
        }
        canvas.translate(0.0f, this.f5300l / 2.0f);
        m7581e(canvas);
        canvas.translate(0.0f, (-this.f5300l) / 2.0f);
        f5290b.mo6069a(canvas, this.f5295g, this.f5296h, this.f5292d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo6107f() {
        return this.f5301m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo6108g() {
        return this.f5296h;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m7580d(this.f5298j, this.f5296h, this.f5305q));
        int ceil2 = (int) Math.ceil((double) m7579c(this.f5298j, this.f5296h, this.f5305q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo6111h(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo6112i() {
        return this.f5298j;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f5301m;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo6114j() {
        float f = this.f5298j;
        return (Math.max(f, this.f5296h + ((float) this.f5291c) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f5298j * 1.5f) + ((float) this.f5291c)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo6115k() {
        float f = this.f5298j;
        return (Math.max(f, this.f5296h + ((float) this.f5291c) + (f / 2.0f)) * 2.0f) + ((this.f5298j + ((float) this.f5291c)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo6116l() {
        return this.f5300l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6117m(boolean z) {
        this.f5305q = z;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo6118o(ColorStateList colorStateList) {
        m7582n(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5302n = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f5301m;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f5292d.getColor() == colorForState) {
            return false;
        }
        this.f5292d.setColor(colorForState);
        this.f5302n = true;
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo6121p(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f5296h != f2) {
                this.f5296h = f2;
                this.f5302n = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo6122q(float f) {
        m7583s(this.f5300l, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo6123r(float f) {
        m7583s(f, this.f5298j);
    }

    public void setAlpha(int i) {
        this.f5292d.setAlpha(i);
        this.f5293e.setAlpha(i);
        this.f5294f.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f5292d.setColorFilter(colorFilter);
    }
}
