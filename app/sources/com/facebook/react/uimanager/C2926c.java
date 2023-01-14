package com.facebook.react.uimanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.uimanager.c */
public class C2926c {

    /* renamed from: a */
    private static DisplayMetrics f8205a;

    /* renamed from: b */
    private static DisplayMetrics f8206b;

    /* renamed from: a */
    public static WritableMap m11502a(double d) {
        C6409a.m24520b((f8205a == null || f8206b == null) ? false : true, "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("windowPhysicalPixels", m11503b(f8205a, d));
        writableNativeMap.putMap("screenPhysicalPixels", m11503b(f8206b, d));
        return writableNativeMap;
    }

    /* renamed from: b */
    private static WritableMap m11503b(DisplayMetrics displayMetrics, double d) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", displayMetrics.widthPixels);
        writableNativeMap.putInt("height", displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", (double) displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d);
        writableNativeMap.putDouble("densityDpi", (double) displayMetrics.densityDpi);
        return writableNativeMap;
    }

    /* renamed from: c */
    public static DisplayMetrics m11504c() {
        return f8206b;
    }

    @Deprecated
    /* renamed from: d */
    public static DisplayMetrics m11505d() {
        return f8205a;
    }

    /* renamed from: e */
    public static void m11506e(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        m11509h(displayMetrics);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        C6409a.m24522d(windowManager, "WindowManager is null!");
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics2);
        m11508g(displayMetrics2);
    }

    /* renamed from: f */
    public static void m11507f(Context context) {
        if (m11504c() == null) {
            m11506e(context);
        }
    }

    /* renamed from: g */
    public static void m11508g(DisplayMetrics displayMetrics) {
        f8206b = displayMetrics;
    }

    /* renamed from: h */
    public static void m11509h(DisplayMetrics displayMetrics) {
        f8205a = displayMetrics;
    }
}
