package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.C3038r;

/* renamed from: com.facebook.react.views.view.d */
public class C3239d {

    /* renamed from: a */
    private static final TypedValue f9125a = new TypedValue();

    @TargetApi(21)
    /* renamed from: a */
    public static Drawable m12663a(Context context, ReadableMap readableMap) {
        Drawable f;
        String string = readableMap.getString("type");
        if ("ThemeAttrAndroid".equals(string)) {
            String string2 = readableMap.getString("attribute");
            int b = m12664b(context, string2);
            if (context.getTheme().resolveAttribute(b, f9125a, true)) {
                f = m12666d(context);
            } else {
                throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " with id " + b + " couldn't be resolved into a drawable");
            }
        } else if ("RippleAndroid".equals(string)) {
            f = m12668f(context, readableMap);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid type for android drawable: " + string);
        }
        return m12669g(readableMap, f);
    }

    @TargetApi(21)
    /* renamed from: b */
    private static int m12664b(Context context, String str) {
        SoftAssertions.assertNotNull(str);
        if ("selectableItemBackground".equals(str)) {
            return 16843534;
        }
        if ("selectableItemBackgroundBorderless".equals(str)) {
            return 16843868;
        }
        return context.getResources().getIdentifier(str, "attr", "android");
    }

    /* renamed from: c */
    private static int m12665c(Context context, ReadableMap readableMap) {
        if (readableMap.hasKey("color") && !readableMap.isNull("color")) {
            return readableMap.getInt("color");
        }
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = f9125a;
        if (theme.resolveAttribute(16843820, typedValue, true)) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn't be resolved into a drawable");
    }

    /* renamed from: d */
    private static Drawable m12666d(Context context) {
        return context.getResources().getDrawable(f9125a.resourceId, context.getTheme());
    }

    /* renamed from: e */
    private static Drawable m12667e(ReadableMap readableMap) {
        if (!readableMap.hasKey("borderless") || readableMap.isNull("borderless") || !readableMap.getBoolean("borderless")) {
            return new ColorDrawable(-1);
        }
        return null;
    }

    /* renamed from: f */
    private static RippleDrawable m12668f(Context context, ReadableMap readableMap) {
        int c = m12665c(context, readableMap);
        return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{c}), (Drawable) null, m12667e(readableMap));
    }

    /* renamed from: g */
    private static Drawable m12669g(ReadableMap readableMap, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 && readableMap.hasKey("rippleRadius") && (drawable instanceof RippleDrawable)) {
            ((RippleDrawable) drawable).setRadius((int) C3038r.m12005b(readableMap.getDouble("rippleRadius")));
        }
        return drawable;
    }
}
