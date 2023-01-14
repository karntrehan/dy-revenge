package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0298z;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9024k;
import p174e.p319f.p320a.p363d.p379x.C9061b;
import p174e.p319f.p320a.p363d.p379x.C9062c;

public class MaterialTextView extends C0298z {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        int j;
        if (m16697i(context)) {
            Resources.Theme theme = context.getTheme();
            if (!m16700l(context, theme, attributeSet, i, i2) && (j = m16698j(theme, attributeSet, i, i2)) != -1) {
                m16696h(theme, j);
            }
        }
    }

    /* renamed from: h */
    private void m16696h(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C9024k.f24750o2);
        int k = m16699k(getContext(), obtainStyledAttributes, C9024k.f24756p2, C9024k.f24762q2);
        obtainStyledAttributes.recycle();
        if (k >= 0) {
            setLineHeight(k);
        }
    }

    /* renamed from: i */
    private static boolean m16697i(Context context) {
        return C9061b.m30194b(context, C9013b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: j */
    private static int m16698j(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C9024k.f24768r2, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C9024k.f24774s2, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: k */
    private static int m16699k(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C9062c.m30199c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: l */
    private static boolean m16700l(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C9024k.f24768r2, i, i2);
        int k = m16699k(context, obtainStyledAttributes, C9024k.f24780t2, C9024k.f24786u2);
        obtainStyledAttributes.recycle();
        return k != -1;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m16697i(context)) {
            m16696h(context.getTheme(), i);
        }
    }
}
