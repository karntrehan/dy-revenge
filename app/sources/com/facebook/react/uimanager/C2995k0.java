package com.facebook.react.uimanager;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.uimanager.k0 */
public class C2995k0 {
    /* renamed from: a */
    public static C2990j0 m11876a(View view) {
        while (!(view instanceof C2990j0)) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return null;
            }
            C6409a.m24519a(parent instanceof View);
            view = (View) parent;
        }
        return (C2990j0) view;
    }

    /* renamed from: b */
    public static Point m11877b(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }
}
