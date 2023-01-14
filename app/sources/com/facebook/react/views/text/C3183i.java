package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.views.view.C3248h;

/* renamed from: com.facebook.react.views.text.i */
class C3183i extends ClickableSpan implements C3189m {

    /* renamed from: f */
    private final int f8935f;

    /* renamed from: o */
    private final int f8936o;

    C3183i(int i, int i2) {
        this.f8935f = i;
        this.f8936o = i2;
    }

    public void onClick(View view) {
        ReactContext reactContext = (ReactContext) view.getContext();
        C2945d b = C3051u0.m12085b(reactContext, this.f8935f);
        if (b != null) {
            b.mo9651c(new C3248h(C3051u0.m12087d(reactContext), this.f8935f));
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f8936o);
        textPaint.setUnderlineText(false);
    }
}
