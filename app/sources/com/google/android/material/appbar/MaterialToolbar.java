package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.C4273g;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9023j;
import p174e.p319f.p320a.p363d.p364a0.C8990g;
import p174e.p319f.p320a.p363d.p364a0.C8994h;

public class MaterialToolbar extends Toolbar {

    /* renamed from: f0 */
    private static final int f11525f0 = C9023j.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9013b.f24524E);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C4273g.m16424f(context, attributeSet, i, f11525f0), attributeSet, i);
        m15595P(getContext());
    }

    /* renamed from: P */
    private void m15595P(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C8990g gVar = new C8990g();
            gVar.mo22819T(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.mo22815L(context);
            gVar.mo22818S(C1988t.m8407t(this));
            C1988t.m8400p0(this, gVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8994h.m29990e(this);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C8994h.m29989d(this, f);
    }
}
