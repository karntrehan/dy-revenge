package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C1164a;
import p027c.p028a.C1444j;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.appcompat.widget.v */
class C0276v extends C0267r {

    /* renamed from: d */
    private final SeekBar f1202d;

    /* renamed from: e */
    private Drawable f1203e;

    /* renamed from: f */
    private ColorStateList f1204f = null;

    /* renamed from: g */
    private PorterDuff.Mode f1205g = null;

    /* renamed from: h */
    private boolean f1206h = false;

    /* renamed from: i */
    private boolean f1207i = false;

    C0276v(SeekBar seekBar) {
        super(seekBar);
        this.f1202d = seekBar;
    }

    /* renamed from: f */
    private void m1357f() {
        Drawable drawable = this.f1203e;
        if (drawable == null) {
            return;
        }
        if (this.f1206h || this.f1207i) {
            Drawable r = C1164a.m4554r(drawable.mutate());
            this.f1203e = r;
            if (this.f1206h) {
                C1164a.m4551o(r, this.f1204f);
            }
            if (this.f1207i) {
                C1164a.m4552p(this.f1203e, this.f1205g);
            }
            if (this.f1203e.isStateful()) {
                this.f1203e.setState(this.f1202d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1640c(AttributeSet attributeSet, int i) {
        super.mo1640c(attributeSet, i);
        Context context = this.f1202d.getContext();
        int[] iArr = C1444j.f4305V;
        C0292x0 v = C0292x0.m1407v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f1202d;
        C1988t.m8390k0(seekBar, seekBar.getContext(), iArr, attributeSet, v.mo1801r(), i, 0);
        Drawable h = v.mo1791h(C1444j.f4310W);
        if (h != null) {
            this.f1202d.setThumb(h);
        }
        mo1715j(v.mo1790g(C1444j.f4315X));
        int i2 = C1444j.f4325Z;
        if (v.mo1802s(i2)) {
            this.f1205g = C0215e0.m1121e(v.mo1794k(i2, -1), this.f1205g);
            this.f1207i = true;
        }
        int i3 = C1444j.f4320Y;
        if (v.mo1802s(i3)) {
            this.f1204f = v.mo1786c(i3);
            this.f1206h = true;
        }
        v.mo1803w();
        m1357f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1712g(Canvas canvas) {
        if (this.f1203e != null) {
            int max = this.f1202d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1203e.getIntrinsicWidth();
                int intrinsicHeight = this.f1203e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1203e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1202d.getWidth() - this.f1202d.getPaddingLeft()) - this.f1202d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1202d.getPaddingLeft(), (float) (this.f1202d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1203e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1713h() {
        Drawable drawable = this.f1203e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1202d.getDrawableState())) {
            this.f1202d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1714i() {
        Drawable drawable = this.f1203e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1715j(Drawable drawable) {
        Drawable drawable2 = this.f1203e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1203e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1202d);
            C1164a.m4549m(drawable, C1988t.m8417y(this.f1202d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1202d.getDrawableState());
            }
            m1357f();
        }
        this.f1202d.invalidate();
    }
}
