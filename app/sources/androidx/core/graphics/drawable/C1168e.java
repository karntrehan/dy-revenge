package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.drawable.e */
class C1168e extends C1167d {

    /* renamed from: u */
    private static Method f3253u;

    C1168e(Drawable drawable) {
        super(drawable);
        m4563g();
    }

    C1168e(C1169f fVar, Resources resources) {
        super(fVar, resources);
        m4563g();
    }

    /* renamed from: g */
    private void m4563g() {
        if (f3253u == null) {
            try {
                f3253u = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3660c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f3252t;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public Rect getDirtyBounds() {
        return this.f3252t.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f3252t.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f3252t;
        if (!(drawable == null || (method = f3253u) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        this.f3252t.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f3252t.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo3660c()) {
            super.setTint(i);
        } else {
            this.f3252t.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo3660c()) {
            super.setTintList(colorStateList);
        } else {
            this.f3252t.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (mo3660c()) {
            super.setTintMode(mode);
        } else {
            this.f3252t.setTintMode(mode);
        }
    }
}
