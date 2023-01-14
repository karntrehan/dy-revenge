package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.core.graphics.drawable.d */
class C1167d extends Drawable implements Drawable.Callback, C1166c, C1165b {

    /* renamed from: f */
    static final PorterDuff.Mode f3246f = PorterDuff.Mode.SRC_IN;

    /* renamed from: o */
    private int f3247o;

    /* renamed from: p */
    private PorterDuff.Mode f3248p;

    /* renamed from: q */
    private boolean f3249q;

    /* renamed from: r */
    C1169f f3250r;

    /* renamed from: s */
    private boolean f3251s;

    /* renamed from: t */
    Drawable f3252t;

    C1167d(Drawable drawable) {
        this.f3250r = m4557d();
        mo3658a(drawable);
    }

    C1167d(C1169f fVar, Resources resources) {
        this.f3250r = fVar;
        m4558e(resources);
    }

    /* renamed from: d */
    private C1169f m4557d() {
        return new C1169f(this.f3250r);
    }

    /* renamed from: e */
    private void m4558e(Resources resources) {
        Drawable.ConstantState constantState;
        C1169f fVar = this.f3250r;
        if (fVar != null && (constantState = fVar.f3255b) != null) {
            mo3658a(constantState.newDrawable(resources));
        }
    }

    /* renamed from: f */
    private boolean m4559f(int[] iArr) {
        if (!mo3660c()) {
            return false;
        }
        C1169f fVar = this.f3250r;
        ColorStateList colorStateList = fVar.f3256c;
        PorterDuff.Mode mode = fVar.f3257d;
        if (colorStateList == null || mode == null) {
            this.f3249q = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f3249q && colorForState == this.f3247o && mode == this.f3248p)) {
                setColorFilter(colorForState, mode);
                this.f3247o = colorForState;
                this.f3248p = mode;
                this.f3249q = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo3658a(Drawable drawable) {
        Drawable drawable2 = this.f3252t;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f3252t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C1169f fVar = this.f3250r;
            if (fVar != null) {
                fVar.f3255b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: b */
    public final Drawable mo3659b() {
        return this.f3252t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3660c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f3252t.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C1169f fVar = this.f3250r;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f3252t.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C1169f fVar = this.f3250r;
        if (fVar == null || !fVar.mo3697a()) {
            return null;
        }
        this.f3250r.f3254a = getChangingConfigurations();
        return this.f3250r;
    }

    public Drawable getCurrent() {
        return this.f3252t.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f3252t.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f3252t.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return C1164a.m4542f(this.f3252t);
    }

    public int getMinimumHeight() {
        return this.f3252t.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f3252t.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f3252t.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f3252t.getPadding(rect);
    }

    public int[] getState() {
        return this.f3252t.getState();
    }

    public Region getTransparentRegion() {
        return this.f3252t.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C1164a.m4544h(this.f3252t);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f3250r;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.mo3660c()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.f r0 = r1.f3250r
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f3256c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f3252t
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.C1167d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f3252t.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f3251s && super.mutate() == this) {
            this.f3250r = m4557d();
            Drawable drawable = this.f3252t;
            if (drawable != null) {
                drawable.mutate();
            }
            C1169f fVar = this.f3250r;
            if (fVar != null) {
                Drawable drawable2 = this.f3252t;
                fVar.f3255b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f3251s = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3252t;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return C1164a.m4549m(this.f3252t, i);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f3252t.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f3252t.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C1164a.m4546j(this.f3252t, z);
    }

    public void setChangingConfigurations(int i) {
        this.f3252t.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3252t.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f3252t.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f3252t.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m4559f(iArr) || this.f3252t.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f3250r.f3256c = colorStateList;
        m4559f(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f3250r.f3257d = mode;
        m4559f(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f3252t.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
