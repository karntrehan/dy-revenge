package p027c.p098u.p099b;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.C1177h;
import p027c.p087p.p088a.p089a.C2064b;

/* renamed from: c.u.b.b */
public class C2106b extends Drawable implements Animatable {

    /* renamed from: f */
    private static final Interpolator f6150f = new LinearInterpolator();

    /* renamed from: o */
    private static final Interpolator f6151o = new C2064b();

    /* renamed from: p */
    private static final int[] f6152p = {-16777216};

    /* renamed from: q */
    private final C2109c f6153q;

    /* renamed from: r */
    private float f6154r;

    /* renamed from: s */
    private Resources f6155s;

    /* renamed from: t */
    private Animator f6156t;

    /* renamed from: u */
    float f6157u;

    /* renamed from: v */
    boolean f6158v;

    /* renamed from: c.u.b.b$a */
    class C2107a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C2109c f6159a;

        C2107a(C2109c cVar) {
            this.f6159a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C2106b.this.mo7074n(floatValue, this.f6159a);
            C2106b.this.mo7062b(floatValue, this.f6159a, false);
            C2106b.this.invalidateSelf();
        }
    }

    /* renamed from: c.u.b.b$b */
    class C2108b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C2109c f6161a;

        C2108b(C2109c cVar) {
            this.f6161a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            C2106b.this.mo7062b(1.0f, this.f6161a, true);
            this.f6161a.mo7084A();
            this.f6161a.mo7096l();
            C2106b bVar = C2106b.this;
            if (bVar.f6158v) {
                bVar.f6158v = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f6161a.mo7108x(false);
                return;
            }
            bVar.f6157u += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            C2106b.this.f6157u = 0.0f;
        }
    }

    /* renamed from: c.u.b.b$c */
    private static class C2109c {

        /* renamed from: a */
        final RectF f6163a = new RectF();

        /* renamed from: b */
        final Paint f6164b;

        /* renamed from: c */
        final Paint f6165c;

        /* renamed from: d */
        final Paint f6166d;

        /* renamed from: e */
        float f6167e;

        /* renamed from: f */
        float f6168f;

        /* renamed from: g */
        float f6169g;

        /* renamed from: h */
        float f6170h;

        /* renamed from: i */
        int[] f6171i;

        /* renamed from: j */
        int f6172j;

        /* renamed from: k */
        float f6173k;

        /* renamed from: l */
        float f6174l;

        /* renamed from: m */
        float f6175m;

        /* renamed from: n */
        boolean f6176n;

        /* renamed from: o */
        Path f6177o;

        /* renamed from: p */
        float f6178p;

        /* renamed from: q */
        float f6179q;

        /* renamed from: r */
        int f6180r;

        /* renamed from: s */
        int f6181s;

        /* renamed from: t */
        int f6182t;

        /* renamed from: u */
        int f6183u;

        C2109c() {
            Paint paint = new Paint();
            this.f6164b = paint;
            Paint paint2 = new Paint();
            this.f6165c = paint2;
            Paint paint3 = new Paint();
            this.f6166d = paint3;
            this.f6167e = 0.0f;
            this.f6168f = 0.0f;
            this.f6169g = 0.0f;
            this.f6170h = 5.0f;
            this.f6178p = 1.0f;
            this.f6182t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo7084A() {
            this.f6173k = this.f6167e;
            this.f6174l = this.f6168f;
            this.f6175m = this.f6169g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7085a(Canvas canvas, Rect rect) {
            RectF rectF = this.f6163a;
            float f = this.f6179q;
            float f2 = (this.f6170h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f6180r) * this.f6178p) / 2.0f, this.f6170h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f6167e;
            float f4 = this.f6169g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f6168f + f4) * 360.0f) - f5;
            this.f6164b.setColor(this.f6183u);
            this.f6164b.setAlpha(this.f6182t);
            float f7 = this.f6170h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f6166d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f6164b);
            mo7086b(canvas, f5, f6, rectF);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7086b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f6176n) {
                Path path = this.f6177o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f6177o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f6177o.moveTo(0.0f, 0.0f);
                this.f6177o.lineTo(((float) this.f6180r) * this.f6178p, 0.0f);
                Path path3 = this.f6177o;
                float f3 = this.f6178p;
                path3.lineTo((((float) this.f6180r) * f3) / 2.0f, ((float) this.f6181s) * f3);
                this.f6177o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f6180r) * this.f6178p) / 2.0f), rectF.centerY() + (this.f6170h / 2.0f));
                this.f6177o.close();
                this.f6165c.setColor(this.f6183u);
                this.f6165c.setAlpha(this.f6182t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f6177o, this.f6165c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo7087c() {
            return this.f6182t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public float mo7088d() {
            return this.f6168f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo7089e() {
            return this.f6171i[mo7090f()];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo7090f() {
            return (this.f6172j + 1) % this.f6171i.length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public float mo7091g() {
            return this.f6167e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo7092h() {
            return this.f6171i[this.f6172j];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public float mo7093i() {
            return this.f6174l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public float mo7094j() {
            return this.f6175m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public float mo7095k() {
            return this.f6173k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo7096l() {
            mo7104t(mo7090f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo7097m() {
            this.f6173k = 0.0f;
            this.f6174l = 0.0f;
            this.f6175m = 0.0f;
            mo7109y(0.0f);
            mo7106v(0.0f);
            mo7107w(0.0f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo7098n(int i) {
            this.f6182t = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo7099o(float f, float f2) {
            this.f6180r = (int) f;
            this.f6181s = (int) f2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo7100p(float f) {
            if (f != this.f6178p) {
                this.f6178p = f;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo7101q(float f) {
            this.f6179q = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo7102r(int i) {
            this.f6183u = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo7103s(ColorFilter colorFilter) {
            this.f6164b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo7104t(int i) {
            this.f6172j = i;
            this.f6183u = this.f6171i[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo7105u(int[] iArr) {
            this.f6171i = iArr;
            mo7104t(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo7106v(float f) {
            this.f6168f = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo7107w(float f) {
            this.f6169g = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo7108x(boolean z) {
            if (this.f6176n != z) {
                this.f6176n = z;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo7109y(float f) {
            this.f6167e = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo7110z(float f) {
            this.f6170h = f;
            this.f6164b.setStrokeWidth(f);
        }
    }

    public C2106b(Context context) {
        this.f6155s = ((Context) C1177h.m4583e(context)).getResources();
        C2109c cVar = new C2109c();
        this.f6153q = cVar;
        cVar.mo7105u(f6152p);
        mo7072k(2.5f);
        m8995m();
    }

    /* renamed from: a */
    private void m8991a(float f, C2109c cVar) {
        mo7074n(f, cVar);
        cVar.mo7109y(cVar.mo7095k() + (((cVar.mo7093i() - 0.01f) - cVar.mo7095k()) * f));
        cVar.mo7106v(cVar.mo7093i());
        cVar.mo7107w(cVar.mo7094j() + ((((float) (Math.floor((double) (cVar.mo7094j() / 0.8f)) + 1.0d)) - cVar.mo7094j()) * f));
    }

    /* renamed from: c */
    private int m8992c(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: h */
    private void m8993h(float f) {
        this.f6154r = f;
    }

    /* renamed from: i */
    private void m8994i(float f, float f2, float f3, float f4) {
        C2109c cVar = this.f6153q;
        float f5 = this.f6155s.getDisplayMetrics().density;
        cVar.mo7110z(f2 * f5);
        cVar.mo7101q(f * f5);
        cVar.mo7104t(0);
        cVar.mo7099o(f3 * f5, f4 * f5);
    }

    /* renamed from: m */
    private void m8995m() {
        C2109c cVar = this.f6153q;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C2107a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f6150f);
        ofFloat.addListener(new C2108b(cVar));
        this.f6156t = ofFloat;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7062b(float f, C2109c cVar, boolean z) {
        float f2;
        float f3;
        if (this.f6158v) {
            m8991a(f, cVar);
        } else if (f != 1.0f || z) {
            float j = cVar.mo7094j();
            if (f < 0.5f) {
                f2 = cVar.mo7095k();
                f3 = (f6151o.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float k = cVar.mo7095k() + 0.79f;
                float f4 = k;
                f2 = k - (((1.0f - f6151o.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f4;
            }
            cVar.mo7109y(f2);
            cVar.mo7106v(f3);
            cVar.mo7107w(j + (0.20999998f * f));
            m8993h((f + this.f6157u) * 216.0f);
        }
    }

    /* renamed from: d */
    public void mo7063d(boolean z) {
        this.f6153q.mo7108x(z);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f6154r, bounds.exactCenterX(), bounds.exactCenterY());
        this.f6153q.mo7085a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void mo7065e(float f) {
        this.f6153q.mo7100p(f);
        invalidateSelf();
    }

    /* renamed from: f */
    public void mo7066f(int... iArr) {
        this.f6153q.mo7105u(iArr);
        this.f6153q.mo7104t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void mo7067g(float f) {
        this.f6153q.mo7107w(f);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f6153q.mo7087c();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f6156t.isRunning();
    }

    /* renamed from: j */
    public void mo7071j(float f, float f2) {
        this.f6153q.mo7109y(f);
        this.f6153q.mo7106v(f2);
        invalidateSelf();
    }

    /* renamed from: k */
    public void mo7072k(float f) {
        this.f6153q.mo7110z(f);
        invalidateSelf();
    }

    /* renamed from: l */
    public void mo7073l(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i == 0) {
            f = 11.0f;
            f4 = 3.0f;
            f3 = 12.0f;
            f2 = 6.0f;
        } else {
            f = 7.5f;
            f4 = 2.5f;
            f3 = 10.0f;
            f2 = 5.0f;
        }
        m8994i(f, f4, f3, f2);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo7074n(float f, C2109c cVar) {
        cVar.mo7102r(f > 0.75f ? m8992c((f - 0.75f) / 0.25f, cVar.mo7092h(), cVar.mo7089e()) : cVar.mo7092h());
    }

    public void setAlpha(int i) {
        this.f6153q.mo7098n(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f6153q.mo7103s(colorFilter);
        invalidateSelf();
    }

    public void start() {
        long j;
        Animator animator;
        this.f6156t.cancel();
        this.f6153q.mo7084A();
        if (this.f6153q.mo7088d() != this.f6153q.mo7091g()) {
            this.f6158v = true;
            animator = this.f6156t;
            j = 666;
        } else {
            this.f6153q.mo7104t(0);
            this.f6153q.mo7097m();
            animator = this.f6156t;
            j = 1332;
        }
        animator.setDuration(j);
        this.f6156t.start();
    }

    public void stop() {
        this.f6156t.cancel();
        m8993h(0.0f);
        this.f6153q.mo7108x(false);
        this.f6153q.mo7104t(0);
        this.f6153q.mo7097m();
        invalidateSelf();
    }
}
