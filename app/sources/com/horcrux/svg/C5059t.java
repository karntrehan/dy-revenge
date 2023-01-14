package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.p120j1.C2991a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.t */
class C5059t extends C5017b0 {

    /* renamed from: W0 */
    private Path f14282W0 = new Path();

    public C5059t(ReactContext reactContext) {
        super(reactContext);
        C5057s.f14266a = this.f14354b0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public Path mo15183I(Canvas canvas, Paint paint) {
        return this.f14282W0;
    }

    @C2991a(name = "d")
    public void setD(String str) {
        this.f14282W0 = C5057s.m19117o(str);
        this.f14334C0 = C5057s.f14271f;
        invalidate();
    }
}
