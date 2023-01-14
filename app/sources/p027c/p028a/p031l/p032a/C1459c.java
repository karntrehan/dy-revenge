package p027c.p028a.p031l.p032a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C1164a;

/* renamed from: c.a.l.a.c */
public class C1459c extends Drawable implements Drawable.Callback {

    /* renamed from: f */
    private Drawable f4528f;

    public C1459c(Drawable drawable) {
        mo5411b(drawable);
    }

    /* renamed from: a */
    public Drawable mo5410a() {
        return this.f4528f;
    }

    /* renamed from: b */
    public void mo5411b(Drawable drawable) {
        Drawable drawable2 = this.f4528f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f4528f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f4528f.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f4528f.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f4528f.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f4528f.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f4528f.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f4528f.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f4528f.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f4528f.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f4528f.getPadding(rect);
    }

    public int[] getState() {
        return this.f4528f.getState();
    }

    public Region getTransparentRegion() {
        return this.f4528f.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C1164a.m4544h(this.f4528f);
    }

    public boolean isStateful() {
        return this.f4528f.isStateful();
    }

    public void jumpToCurrentState() {
        this.f4528f.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f4528f.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f4528f.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f4528f.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C1164a.m4546j(this.f4528f, z);
    }

    public void setChangingConfigurations(int i) {
        this.f4528f.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4528f.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f4528f.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f4528f.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C1164a.m4547k(this.f4528f, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C1164a.m4548l(this.f4528f, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f4528f.setState(iArr);
    }

    public void setTint(int i) {
        C1164a.m4550n(this.f4528f, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C1164a.m4551o(this.f4528f, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C1164a.m4552p(this.f4528f, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f4528f.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
