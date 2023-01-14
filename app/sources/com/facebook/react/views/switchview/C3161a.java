package com.facebook.react.views.switchview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.appcompat.widget.C0268r0;

/* renamed from: com.facebook.react.views.switchview.a */
class C3161a extends C0268r0 {

    /* renamed from: f0 */
    private boolean f8849f0 = true;

    /* renamed from: g0 */
    private Integer f8850g0 = null;

    /* renamed from: h0 */
    private Integer f8851h0 = null;

    public C3161a(Context context) {
        super(context);
    }

    /* renamed from: q */
    private void m12411q(boolean z) {
        Integer num = this.f8851h0;
        if (num != null || this.f8850g0 != null) {
            if (!z) {
                num = this.f8850g0;
            }
            mo10285p(num);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo10282m(Drawable drawable, Integer num) {
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo10283n(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
            m12411q(z);
        }
        this.f8849f0 = true;
    }

    /* renamed from: o */
    public void mo10284o(Integer num) {
        mo10282m(super.getThumbDrawable(), num);
        if (Build.VERSION.SDK_INT >= 21) {
            ((RippleDrawable) super.getBackground()).setColor(new ColorStateList(new int[][]{new int[]{16842919}}, new int[]{num.intValue()}));
        }
    }

    /* renamed from: p */
    public void mo10285p(Integer num) {
        mo10282m(super.getTrackDrawable(), num);
    }

    /* renamed from: r */
    public void mo10286r(Integer num) {
        if (num != this.f8850g0) {
            this.f8850g0 = num;
            if (!isChecked()) {
                mo10285p(this.f8850g0);
            }
        }
    }

    /* renamed from: s */
    public void mo10287s(Integer num) {
        if (num != this.f8851h0) {
            this.f8851h0 = num;
            if (isChecked()) {
                mo10285p(this.f8851h0);
            }
        }
    }

    public void setChecked(boolean z) {
        if (!this.f8849f0 || isChecked() == z) {
            super.setChecked(isChecked());
            return;
        }
        this.f8849f0 = false;
        super.setChecked(z);
        m12411q(z);
    }
}
