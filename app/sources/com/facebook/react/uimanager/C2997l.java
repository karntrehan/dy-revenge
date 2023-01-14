package com.facebook.react.uimanager;

import android.view.View;

/* renamed from: com.facebook.react.uimanager.l */
public class C2997l {
    /* renamed from: a */
    public static final void m11880a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 0 || mode2 == 0) {
            throw new IllegalStateException("A catalyst view must have an explicit width and height given to it. This should normally happen as part of the standard catalyst UI framework.");
        }
    }
}
