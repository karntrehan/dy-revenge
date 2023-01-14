package p027c.p058e.p059a;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: c.e.a.a */
public class C1777a extends FrameLayout {

    /* renamed from: f */
    private static final int[] f5267f = {16842801};

    /* renamed from: o */
    private static final C1784f f5268o;

    /* renamed from: p */
    private boolean f5269p;

    /* renamed from: q */
    private boolean f5270q;

    /* renamed from: r */
    int f5271r;

    /* renamed from: s */
    int f5272s;

    /* renamed from: t */
    final Rect f5273t;

    /* renamed from: u */
    private final C1783e f5274u;

    static {
        int i = Build.VERSION.SDK_INT;
        f5268o = i >= 21 ? new C1780c() : i >= 17 ? new C1778b() : new C1781d();
        f5268o.mo6068h();
    }

    public ColorStateList getCardBackgroundColor() {
        return f5268o.mo6076g(this.f5274u);
    }

    public float getCardElevation() {
        return f5268o.mo6071b(this.f5274u);
    }

    public int getContentPaddingBottom() {
        return this.f5273t.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f5273t.left;
    }

    public int getContentPaddingRight() {
        return this.f5273t.right;
    }

    public int getContentPaddingTop() {
        return this.f5273t.top;
    }

    public float getMaxCardElevation() {
        return f5268o.mo6075f(this.f5274u);
    }

    public boolean getPreventCornerOverlap() {
        return this.f5270q;
    }

    public float getRadius() {
        return f5268o.mo6072c(this.f5274u);
    }

    public boolean getUseCompatPadding() {
        return this.f5269p;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C1784f fVar = f5268o;
        if (!(fVar instanceof C1780c)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.mo6078j(this.f5274u)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.mo6077i(this.f5274u)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f5268o.mo6080l(this.f5274u, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f5268o.mo6080l(this.f5274u, colorStateList);
    }

    public void setCardElevation(float f) {
        f5268o.mo6074e(this.f5274u, f);
    }

    public void setMaxCardElevation(float f) {
        f5268o.mo6081m(this.f5274u, f);
    }

    public void setMinimumHeight(int i) {
        this.f5272s = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f5271r = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f5270q) {
            this.f5270q = z;
            f5268o.mo6079k(this.f5274u);
        }
    }

    public void setRadius(float f) {
        f5268o.mo6070a(this.f5274u, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f5269p != z) {
            this.f5269p = z;
            f5268o.mo6073d(this.f5274u);
        }
    }
}
