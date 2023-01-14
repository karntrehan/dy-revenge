package p174e.p247e.p274h.p284e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: e.e.h.e.g */
public class C6193g extends Drawable implements Drawable.Callback, C6221s, C6220r, C6188c {

    /* renamed from: f */
    private static final Matrix f17110f = new Matrix();

    /* renamed from: o */
    private Drawable f17111o;

    /* renamed from: p */
    private final C6189d f17112p = new C6189d();

    /* renamed from: q */
    protected C6221s f17113q;

    public C6193g(Drawable drawable) {
        this.f17111o = drawable;
        C6190e.m23431d(drawable, this, this);
    }

    /* renamed from: c */
    public void mo18337c(C6221s sVar) {
        this.f17113q = sVar;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f17111o;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    /* renamed from: f */
    public void mo18341f(Matrix matrix) {
        mo18398t(matrix);
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f17111o;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    public Drawable getCurrent() {
        return this.f17111o;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f17111o;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f17111o;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f17111o;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f17111o;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        Drawable drawable = this.f17111o;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    /* renamed from: k */
    public Drawable mo18362k(Drawable drawable) {
        return mo18399u(drawable);
    }

    /* renamed from: l */
    public void mo18349l(RectF rectF) {
        C6221s sVar = this.f17113q;
        if (sVar != null) {
            sVar.mo18349l(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public Drawable mutate() {
        Drawable drawable = this.f17111o;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17111o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f17111o;
        return drawable == null ? super.onLevelChange(i) : drawable.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f17111o;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    /* renamed from: r */
    public Drawable mo18363r() {
        return getCurrent();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f17112p.mo18367b(i);
        Drawable drawable = this.f17111o;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f17112p.mo18368c(colorFilter);
        Drawable drawable = this.f17111o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public void setDither(boolean z) {
        this.f17112p.mo18369d(z);
        Drawable drawable = this.f17111o;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    public void setFilterBitmap(boolean z) {
        this.f17112p.mo18370e(z);
        Drawable drawable = this.f17111o;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f17111o;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f17111o;
        return drawable == null ? visible : drawable.setVisible(z, z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo18398t(Matrix matrix) {
        C6221s sVar = this.f17113q;
        if (sVar != null) {
            sVar.mo18341f(matrix);
        } else {
            matrix.reset();
        }
    }

    /* renamed from: u */
    public Drawable mo18399u(Drawable drawable) {
        Drawable v = mo18401v(drawable);
        invalidateSelf();
        return v;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Drawable mo18401v(Drawable drawable) {
        Drawable drawable2 = this.f17111o;
        C6190e.m23431d(drawable2, (Drawable.Callback) null, (C6221s) null);
        C6190e.m23431d(drawable, (Drawable.Callback) null, (C6221s) null);
        C6190e.m23432e(drawable, this.f17112p);
        C6190e.m23428a(drawable, this);
        C6190e.m23431d(drawable, this, this);
        this.f17111o = drawable;
        return drawable2;
    }
}
