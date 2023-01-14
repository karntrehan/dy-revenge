package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;

/* renamed from: com.facebook.react.views.text.d */
public final class C3170d {
    /* renamed from: a */
    private static ColorStateList m12443a(Context context, int i) {
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            obtainStyledAttributes.recycle();
            return colorStateList;
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static ColorStateList m12444b(Context context) {
        return m12443a(context, 16842904);
    }

    /* renamed from: c */
    public static int m12445c(Context context) {
        return m12443a(context, 16842905).getDefaultColor();
    }

    /* renamed from: d */
    public static ColorStateList m12446d(Context context) {
        return m12443a(context, 16842906);
    }
}
