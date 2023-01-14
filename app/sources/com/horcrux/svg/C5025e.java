package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.react.bridge.ReactContext;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.e */
class C5025e extends C5023d {
    public C5025e(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo15193F(Canvas canvas, Paint paint, float f) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo15218R() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C5070x0) {
                ((C5070x0) childAt).mo15218R();
            }
        }
    }
}
