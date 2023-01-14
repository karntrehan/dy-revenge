package p027c.p058e.p059a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: c.e.a.g */
class C1785g extends Drawable {

    /* renamed from: a */
    private float f5278a;

    /* renamed from: b */
    private final Paint f5279b;

    /* renamed from: c */
    private final RectF f5280c;

    /* renamed from: d */
    private final Rect f5281d;

    /* renamed from: e */
    private float f5282e;

    /* renamed from: f */
    private boolean f5283f;

    /* renamed from: g */
    private boolean f5284g;

    /* renamed from: h */
    private ColorStateList f5285h;

    /* renamed from: i */
    private PorterDuffColorFilter f5286i;

    /* renamed from: j */
    private ColorStateList f5287j;

    /* renamed from: k */
    private PorterDuff.Mode f5288k;

    /* renamed from: a */
    private PorterDuffColorFilter m7568a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m7569e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f5285h = colorStateList;
        this.f5279b.setColor(colorStateList.getColorForState(getState(), this.f5285h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m7570i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f5280c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f5281d.set(rect);
        if (this.f5283f) {
            float d = C1786h.m7580d(this.f5282e, this.f5278a, this.f5284g);
            this.f5281d.inset((int) Math.ceil((double) C1786h.m7579c(this.f5282e, this.f5278a, this.f5284g)), (int) Math.ceil((double) d));
            this.f5280c.set(this.f5281d);
        }
    }

    /* renamed from: b */
    public ColorStateList mo6090b() {
        return this.f5285h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo6091c() {
        return this.f5282e;
    }

    /* renamed from: d */
    public float mo6092d() {
        return this.f5278a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f5279b;
        if (this.f5286i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f5286i);
            z = true;
        }
        RectF rectF = this.f5280c;
        float f = this.f5278a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    /* renamed from: f */
    public void mo6094f(ColorStateList colorStateList) {
        m7569e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo6095g(float f, boolean z, boolean z2) {
        if (f != this.f5282e || this.f5283f != z || this.f5284g != z2) {
            this.f5282e = f;
            this.f5283f = z;
            this.f5284g = z2;
            m7570i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f5281d, this.f5278a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo6098h(float f) {
        if (f != this.f5278a) {
            this.f5278a = f;
            m7570i((Rect) null);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f5285h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f5287j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f5285h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p058e.p059a.C1785g.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m7570i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f5285h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f5279b.getColor();
        if (z) {
            this.f5279b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f5287j;
        if (colorStateList2 == null || (mode = this.f5288k) == null) {
            return z;
        }
        this.f5286i = m7568a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.f5279b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f5279b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f5287j = colorStateList;
        this.f5286i = m7568a(colorStateList, this.f5288k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f5288k = mode;
        this.f5286i = m7568a(this.f5287j, mode);
        invalidateSelf();
    }
}
