package p174e.p247e.p274h.p284e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: e.e.h.e.n */
public abstract class C6202n extends Drawable implements C6196j, C6220r {

    /* renamed from: A */
    final RectF f17163A = new RectF();

    /* renamed from: B */
    final RectF f17164B = new RectF();

    /* renamed from: C */
    RectF f17165C;

    /* renamed from: D */
    final Matrix f17166D = new Matrix();

    /* renamed from: E */
    final Matrix f17167E = new Matrix();

    /* renamed from: F */
    final Matrix f17168F = new Matrix();

    /* renamed from: G */
    final Matrix f17169G = new Matrix();

    /* renamed from: H */
    final Matrix f17170H = new Matrix();

    /* renamed from: I */
    Matrix f17171I;

    /* renamed from: J */
    Matrix f17172J;

    /* renamed from: K */
    final Matrix f17173K = new Matrix();

    /* renamed from: L */
    private float f17174L = 0.0f;

    /* renamed from: M */
    private boolean f17175M = false;

    /* renamed from: N */
    private boolean f17176N = false;

    /* renamed from: O */
    private boolean f17177O = true;

    /* renamed from: P */
    private C6221s f17178P;

    /* renamed from: f */
    private final Drawable f17179f;

    /* renamed from: o */
    protected boolean f17180o = false;

    /* renamed from: p */
    protected boolean f17181p = false;

    /* renamed from: q */
    protected float f17182q = 0.0f;

    /* renamed from: r */
    protected final Path f17183r = new Path();

    /* renamed from: s */
    protected boolean f17184s = true;

    /* renamed from: t */
    protected int f17185t = 0;

    /* renamed from: u */
    protected final Path f17186u = new Path();

    /* renamed from: v */
    private final float[] f17187v = new float[8];

    /* renamed from: w */
    final float[] f17188w = new float[8];

    /* renamed from: x */
    float[] f17189x;

    /* renamed from: y */
    final RectF f17190y = new RectF();

    /* renamed from: z */
    final RectF f17191z = new RectF();

    C6202n(Drawable drawable) {
        this.f17179f = drawable;
    }

    /* renamed from: a */
    public boolean mo18423a() {
        return this.f17176N;
    }

    /* renamed from: b */
    public void mo18402b(int i, float f) {
        if (this.f17185t != i || this.f17182q != f) {
            this.f17185t = i;
            this.f17182q = f;
            this.f17177O = true;
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public void mo18337c(C6221s sVar) {
        this.f17178P = sVar;
    }

    public void clearColorFilter() {
        this.f17179f.clearColorFilter();
    }

    /* renamed from: d */
    public void mo18403d(boolean z) {
        this.f17180o = z;
        this.f17177O = true;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (C6394b.m24481d()) {
            C6394b.m24478a("RoundedDrawable#draw");
        }
        this.f17179f.draw(canvas);
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo18410e() {
        return this.f17180o || this.f17181p || this.f17182q > 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo18425f() {
        float[] fArr;
        if (this.f17177O) {
            this.f17186u.reset();
            RectF rectF = this.f17190y;
            float f = this.f17182q;
            rectF.inset(f / 2.0f, f / 2.0f);
            if (this.f17180o) {
                this.f17186u.addCircle(this.f17190y.centerX(), this.f17190y.centerY(), Math.min(this.f17190y.width(), this.f17190y.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.f17188w;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.f17187v[i] + this.f17174L) - (this.f17182q / 2.0f);
                    i++;
                }
                this.f17186u.addRoundRect(this.f17190y, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f17190y;
            float f2 = this.f17182q;
            rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
            this.f17183r.reset();
            float f3 = this.f17174L + (this.f17175M ? this.f17182q : 0.0f);
            this.f17190y.inset(f3, f3);
            if (this.f17180o) {
                this.f17183r.addCircle(this.f17190y.centerX(), this.f17190y.centerY(), Math.min(this.f17190y.width(), this.f17190y.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f17175M) {
                if (this.f17189x == null) {
                    this.f17189x = new float[8];
                }
                for (int i2 = 0; i2 < this.f17188w.length; i2++) {
                    this.f17189x[i2] = this.f17187v[i2] - this.f17182q;
                }
                this.f17183r.addRoundRect(this.f17190y, this.f17189x, Path.Direction.CW);
            } else {
                this.f17183r.addRoundRect(this.f17190y, this.f17187v, Path.Direction.CW);
            }
            float f4 = -f3;
            this.f17190y.inset(f4, f4);
            this.f17183r.setFillType(Path.FillType.WINDING);
            this.f17177O = false;
        }
    }

    /* renamed from: g */
    public void mo18404g(boolean z) {
        if (this.f17176N != z) {
            this.f17176N = z;
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f17179f.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f17179f.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f17179f.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f17179f.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.f17179f.getOpacity();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo18431h() {
        Matrix matrix;
        C6221s sVar = this.f17178P;
        if (sVar != null) {
            sVar.mo18341f(this.f17168F);
            this.f17178P.mo18349l(this.f17190y);
        } else {
            this.f17168F.reset();
            this.f17190y.set(getBounds());
        }
        this.f17163A.set(0.0f, 0.0f, (float) getIntrinsicWidth(), (float) getIntrinsicHeight());
        this.f17164B.set(this.f17179f.getBounds());
        this.f17166D.setRectToRect(this.f17163A, this.f17164B, Matrix.ScaleToFit.FILL);
        if (this.f17175M) {
            RectF rectF = this.f17165C;
            if (rectF == null) {
                this.f17165C = new RectF(this.f17190y);
            } else {
                rectF.set(this.f17190y);
            }
            RectF rectF2 = this.f17165C;
            float f = this.f17182q;
            rectF2.inset(f, f);
            if (this.f17171I == null) {
                this.f17171I = new Matrix();
            }
            this.f17171I.setRectToRect(this.f17190y, this.f17165C, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.f17171I;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.f17168F.equals(this.f17169G) || !this.f17166D.equals(this.f17167E) || ((matrix = this.f17171I) != null && !matrix.equals(this.f17172J))) {
            this.f17184s = true;
            this.f17168F.invert(this.f17170H);
            this.f17173K.set(this.f17168F);
            if (this.f17175M) {
                this.f17173K.postConcat(this.f17171I);
            }
            this.f17173K.preConcat(this.f17166D);
            this.f17169G.set(this.f17168F);
            this.f17167E.set(this.f17166D);
            if (this.f17175M) {
                Matrix matrix3 = this.f17172J;
                if (matrix3 == null) {
                    this.f17172J = new Matrix(this.f17171I);
                } else {
                    matrix3.set(this.f17171I);
                }
            } else {
                Matrix matrix4 = this.f17172J;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (!this.f17190y.equals(this.f17191z)) {
            this.f17177O = true;
            this.f17191z.set(this.f17190y);
        }
    }

    /* renamed from: i */
    public void mo18405i(boolean z) {
        if (this.f17175M != z) {
            this.f17175M = z;
            this.f17177O = true;
            invalidateSelf();
        }
    }

    /* renamed from: m */
    public void mo18406m(float f) {
        if (this.f17174L != f) {
            this.f17174L = f;
            this.f17177O = true;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f17179f.setBounds(rect);
    }

    /* renamed from: p */
    public void mo18407p(float f) {
        boolean z = false;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        C6062k.m22841i(i >= 0);
        Arrays.fill(this.f17187v, f);
        if (i != 0) {
            z = true;
        }
        this.f17181p = z;
        this.f17177O = true;
        invalidateSelf();
    }

    /* renamed from: s */
    public void mo18408s(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f17187v, 0.0f);
            this.f17181p = false;
        } else {
            C6062k.m22835c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f17187v, 0, 8);
            this.f17181p = false;
            for (int i = 0; i < 8; i++) {
                this.f17181p |= fArr[i] > 0.0f;
            }
        }
        this.f17177O = true;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.f17179f.setAlpha(i);
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f17179f.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f17179f.setColorFilter(colorFilter);
    }
}
