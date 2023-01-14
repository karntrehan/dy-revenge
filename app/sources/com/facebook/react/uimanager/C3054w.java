package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.facebook.react.uimanager.w */
public class C3054w {

    /* renamed from: a */
    private static final Rect f8492a = new Rect();

    /* renamed from: a */
    public static void m12097a(View view, Rect rect) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            rect.setEmpty();
            return;
        }
        if (parent instanceof C3052v) {
            C3052v vVar = (C3052v) parent;
            if (vVar.getRemoveClippedSubviews()) {
                Rect rect2 = f8492a;
                vVar.mo9868h(rect2);
                if (!rect2.intersect(view.getLeft(), view.getTop() + ((int) view.getTranslationY()), view.getRight(), view.getBottom() + ((int) view.getTranslationY()))) {
                    rect.setEmpty();
                    return;
                }
                rect2.offset(-view.getLeft(), -view.getTop());
                rect2.offset(-((int) view.getTranslationX()), -((int) view.getTranslationY()));
                rect2.offset(view.getScrollX(), view.getScrollY());
                rect.set(rect2);
                return;
            }
        }
        view.getDrawingRect(rect);
    }
}
