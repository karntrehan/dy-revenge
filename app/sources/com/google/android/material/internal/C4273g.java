package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0292x0;
import p027c.p028a.p035o.C1469d;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9024k;

/* renamed from: com.google.android.material.internal.g */
public final class C4273g {

    /* renamed from: a */
    private static final int[] f12117a = {C9013b.f24528j};

    /* renamed from: b */
    private static final int[] f12118b = {C9013b.colorPrimaryVariant};

    /* renamed from: c */
    private static final int[] f12119c = {16842752, C9013b.theme};

    /* renamed from: d */
    private static final int[] f12120d = {C9013b.materialThemeOverlay};

    /* renamed from: a */
    public static void m16419a(Context context) {
        m16423e(context, f12117a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m16420b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9024k.f24776s4, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C9024k.f24788u4, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C9013b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m16421c(context);
            }
        }
        m16419a(context);
    }

    /* renamed from: c */
    public static void m16421c(Context context) {
        m16423e(context, f12118b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m16422d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9024k.f24776s4, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C9024k.f24794v4, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(C9024k.f24782t4, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m16425g(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m16423e(Context context, int[] iArr, String str) {
        if (!m16426h(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: f */
    public static Context m16424f(Context context, AttributeSet attributeSet, int i, int i2) {
        int j = m16428j(context, attributeSet, i, i2);
        if (j == 0) {
            return context;
        }
        if ((context instanceof C1469d) && ((C1469d) context).mo5456c() == j) {
            return context;
        }
        C1469d dVar = new C1469d(context, j);
        int i3 = m16427i(dVar, attributeSet);
        return i3 != 0 ? new C1469d((Context) dVar, i3) : dVar;
    }

    /* renamed from: g */
    private static boolean m16425g(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    private static boolean m16426h(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: i */
    private static int m16427i(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12119c);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: j */
    private static int m16428j(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12120d, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: k */
    public static TypedArray m16429k(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m16420b(context, attributeSet, i, i2);
        m16422d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: l */
    public static C0292x0 m16430l(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m16420b(context, attributeSet, i, i2);
        m16422d(context, attributeSet, iArr, i, i2, iArr2);
        return C0292x0.m1407v(context, attributeSet, iArr, i, i2);
    }
}
