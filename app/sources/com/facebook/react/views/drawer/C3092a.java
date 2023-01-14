package com.facebook.react.views.drawer;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.C2954h;
import p027c.p082m.p083a.C2039a;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.facebook.react.views.drawer.a */
class C3092a extends C2039a {

    /* renamed from: f0 */
    private int f8596f0 = 8388611;

    /* renamed from: g0 */
    private int f8597g0 = -1;

    public C3092a(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo9924V() {
        mo6830d(this.f8596f0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo9925W() {
        mo6814I(this.f8596f0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo9926X(int i) {
        this.f8596f0 = i;
        mo9927Y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo9927Y() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            C2039a.C2044e eVar = (C2039a.C2044e) childAt.getLayoutParams();
            eVar.f5899a = this.f8596f0;
            eVar.width = this.f8597g0;
            childAt.setLayoutParams(eVar);
            childAt.setClickable(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo9928Z(int i) {
        this.f8597g0 = i;
        mo9927Y();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            C2954h.m11771a(this, motionEvent);
            return true;
        } catch (IllegalArgumentException e) {
            C6071a.m22860H("ReactNative", "Error intercepting touch event.", e);
            return false;
        }
    }
}
