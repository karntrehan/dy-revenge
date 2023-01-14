package p174e.p247e.p274h.p284e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: e.e.h.e.m */
public class C6199m extends C6193g implements C6196j {

    /* renamed from: A */
    private int f17142A = 0;

    /* renamed from: B */
    private int f17143B = 0;

    /* renamed from: C */
    private float f17144C = 0.0f;

    /* renamed from: D */
    private boolean f17145D = false;

    /* renamed from: E */
    private boolean f17146E = false;

    /* renamed from: F */
    private final Path f17147F = new Path();

    /* renamed from: G */
    private final Path f17148G = new Path();

    /* renamed from: H */
    private final RectF f17149H = new RectF();

    /* renamed from: r */
    C6201b f17150r = C6201b.OVERLAY_COLOR;

    /* renamed from: s */
    private final RectF f17151s = new RectF();

    /* renamed from: t */
    private RectF f17152t;

    /* renamed from: u */
    private Matrix f17153u;

    /* renamed from: v */
    private final float[] f17154v = new float[8];

    /* renamed from: w */
    final float[] f17155w = new float[8];

    /* renamed from: x */
    final Paint f17156x = new Paint(1);

    /* renamed from: y */
    private boolean f17157y = false;

    /* renamed from: z */
    private float f17158z = 0.0f;

    /* renamed from: e.e.h.e.m$a */
    static /* synthetic */ class C6200a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17159a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                e.e.h.e.m$b[] r0 = p174e.p247e.p274h.p284e.C6199m.C6201b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17159a = r0
                e.e.h.e.m$b r1 = p174e.p247e.p274h.p284e.C6199m.C6201b.CLIPPING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17159a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.e.h.e.m$b r1 = p174e.p247e.p274h.p284e.C6199m.C6201b.OVERLAY_COLOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p274h.p284e.C6199m.C6200a.<clinit>():void");
        }
    }

    /* renamed from: e.e.h.e.m$b */
    public enum C6201b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public C6199m(Drawable drawable) {
        super((Drawable) C6062k.m22839g(drawable));
    }

    /* renamed from: y */
    private void m23484y() {
        float[] fArr;
        this.f17147F.reset();
        this.f17148G.reset();
        this.f17149H.set(getBounds());
        RectF rectF = this.f17149H;
        float f = this.f17144C;
        rectF.inset(f, f);
        if (this.f17150r == C6201b.OVERLAY_COLOR) {
            this.f17147F.addRect(this.f17149H, Path.Direction.CW);
        }
        if (this.f17157y) {
            this.f17147F.addCircle(this.f17149H.centerX(), this.f17149H.centerY(), Math.min(this.f17149H.width(), this.f17149H.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f17147F.addRoundRect(this.f17149H, this.f17154v, Path.Direction.CW);
        }
        RectF rectF2 = this.f17149H;
        float f2 = this.f17144C;
        rectF2.inset(-f2, -f2);
        RectF rectF3 = this.f17149H;
        float f3 = this.f17158z;
        rectF3.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.f17157y) {
            this.f17148G.addCircle(this.f17149H.centerX(), this.f17149H.centerY(), Math.min(this.f17149H.width(), this.f17149H.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.f17155w;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.f17154v[i] + this.f17144C) - (this.f17158z / 2.0f);
                i++;
            }
            this.f17148G.addRoundRect(this.f17149H, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f17149H;
        float f4 = this.f17158z;
        rectF4.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }

    /* renamed from: b */
    public void mo18402b(int i, float f) {
        this.f17142A = i;
        this.f17158z = f;
        m23484y();
        invalidateSelf();
    }

    /* renamed from: d */
    public void mo18403d(boolean z) {
        this.f17157y = z;
        m23484y();
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f17151s.set(getBounds());
        int i = C6200a.f17159a[this.f17150r.ordinal()];
        if (i == 1) {
            int save = canvas.save();
            canvas.clipPath(this.f17147F);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i == 2) {
            if (this.f17145D) {
                RectF rectF = this.f17152t;
                if (rectF == null) {
                    this.f17152t = new RectF(this.f17151s);
                    this.f17153u = new Matrix();
                } else {
                    rectF.set(this.f17151s);
                }
                RectF rectF2 = this.f17152t;
                float f = this.f17158z;
                rectF2.inset(f, f);
                this.f17153u.setRectToRect(this.f17151s, this.f17152t, Matrix.ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.f17151s);
                canvas.concat(this.f17153u);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.f17156x.setStyle(Paint.Style.FILL);
            this.f17156x.setColor(this.f17143B);
            this.f17156x.setStrokeWidth(0.0f);
            this.f17156x.setFilterBitmap(mo18421w());
            this.f17147F.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f17147F, this.f17156x);
            if (this.f17157y) {
                float width = ((this.f17151s.width() - this.f17151s.height()) + this.f17158z) / 2.0f;
                float height = ((this.f17151s.height() - this.f17151s.width()) + this.f17158z) / 2.0f;
                if (width > 0.0f) {
                    RectF rectF3 = this.f17151s;
                    float f2 = rectF3.left;
                    Canvas canvas2 = canvas;
                    canvas2.drawRect(f2, rectF3.top, f2 + width, rectF3.bottom, this.f17156x);
                    RectF rectF4 = this.f17151s;
                    float f3 = rectF4.right;
                    canvas2.drawRect(f3 - width, rectF4.top, f3, rectF4.bottom, this.f17156x);
                }
                if (height > 0.0f) {
                    RectF rectF5 = this.f17151s;
                    float f4 = rectF5.left;
                    float f5 = rectF5.top;
                    Canvas canvas3 = canvas;
                    canvas3.drawRect(f4, f5, rectF5.right, f5 + height, this.f17156x);
                    RectF rectF6 = this.f17151s;
                    float f6 = rectF6.left;
                    float f7 = rectF6.bottom;
                    canvas3.drawRect(f6, f7 - height, rectF6.right, f7, this.f17156x);
                }
            }
        }
        if (this.f17142A != 0) {
            this.f17156x.setStyle(Paint.Style.STROKE);
            this.f17156x.setColor(this.f17142A);
            this.f17156x.setStrokeWidth(this.f17158z);
            this.f17147F.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f17148G, this.f17156x);
        }
    }

    /* renamed from: g */
    public void mo18404g(boolean z) {
        if (this.f17146E != z) {
            this.f17146E = z;
            invalidateSelf();
        }
    }

    /* renamed from: i */
    public void mo18405i(boolean z) {
        this.f17145D = z;
        m23484y();
        invalidateSelf();
    }

    /* renamed from: m */
    public void mo18406m(float f) {
        this.f17144C = f;
        m23484y();
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m23484y();
    }

    /* renamed from: p */
    public void mo18407p(float f) {
        Arrays.fill(this.f17154v, f);
        m23484y();
        invalidateSelf();
    }

    /* renamed from: s */
    public void mo18408s(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f17154v, 0.0f);
        } else {
            C6062k.m22835c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f17154v, 0, 8);
        }
        m23484y();
        invalidateSelf();
    }

    /* renamed from: w */
    public boolean mo18421w() {
        return this.f17146E;
    }

    /* renamed from: x */
    public void mo18422x(int i) {
        this.f17143B = i;
        invalidateSelf();
    }
}
