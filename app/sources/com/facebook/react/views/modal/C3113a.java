package com.facebook.react.views.modal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.views.modal.a */
class C3113a {

    /* renamed from: a */
    private static final Point f8656a = new Point();

    /* renamed from: b */
    private static final Point f8657b = new Point();

    /* renamed from: c */
    private static final Point f8658c = new Point();

    /* renamed from: a */
    public static Point m12246a(Context context) {
        Display defaultDisplay = ((WindowManager) C6409a.m24521c((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        Point point = f8656a;
        Point point2 = f8657b;
        defaultDisplay.getCurrentSizeRange(point, point2);
        Point point3 = f8658c;
        defaultDisplay.getSize(point3);
        int i = 0;
        boolean z = context.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (z && identifier > 0) {
            i = (int) resources.getDimension(identifier);
        }
        return point3.x < point3.y ? new Point(point.x, point2.y + i) : new Point(point2.x, point.y + i);
    }
}
