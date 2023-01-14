package p027c.p098u.p099b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import p027c.p064i.p072j.C1988t;
import p027c.p098u.C2103a;

/* renamed from: c.u.b.a */
class C2104a extends ImageView {

    /* renamed from: f */
    private Animation.AnimationListener f6144f;

    /* renamed from: o */
    private int f6145o;

    /* renamed from: p */
    private int f6146p;

    /* renamed from: c.u.b.a$a */
    private static class C2105a extends OvalShape {

        /* renamed from: f */
        private Paint f6147f = new Paint();

        /* renamed from: o */
        private int f6148o;

        /* renamed from: p */
        private C2104a f6149p;

        C2105a(C2104a aVar, int i) {
            this.f6149p = aVar;
            this.f6148o = i;
            m8990c((int) rect().width());
        }

        /* renamed from: c */
        private void m8990c(int i) {
            float f = (float) (i / 2);
            this.f6147f.setShader(new RadialGradient(f, f, (float) this.f6148o, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = this.f6149p.getWidth() / 2;
            float f = (float) width;
            float height = (float) (this.f6149p.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f6147f);
            canvas.drawCircle(f, height, (float) (width - this.f6148o), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m8990c((int) f);
        }
    }

    C2104a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f6145o = (int) (3.5f * f);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C2103a.f6142f);
        this.f6146p = obtainStyledAttributes.getColor(C2103a.f6143g, -328966);
        obtainStyledAttributes.recycle();
        if (m8988a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C1988t.m8408t0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C2105a(this, this.f6145o));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f6145o, (float) i2, (float) i, 503316480);
            int i3 = this.f6145o;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f6146p);
        C1988t.m8400p0(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m8988a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: b */
    public void mo7055b(Animation.AnimationListener animationListener) {
        this.f6144f = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f6144f;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f6144f;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m8988a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f6145o * 2), getMeasuredHeight() + (this.f6145o * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f6146p = i;
        }
    }
}
