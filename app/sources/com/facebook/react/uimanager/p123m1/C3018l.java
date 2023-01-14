package com.facebook.react.uimanager.p123m1;

import android.graphics.Paint;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.facebook.react.uimanager.m1.l */
class C3018l extends Animation {

    /* renamed from: f */
    private final View f8376f;

    /* renamed from: o */
    private final float f8377o;

    /* renamed from: p */
    private final float f8378p;

    /* renamed from: com.facebook.react.uimanager.m1.l$a */
    static class C3019a implements Animation.AnimationListener {

        /* renamed from: a */
        private final View f8379a;

        /* renamed from: b */
        private boolean f8380b = false;

        public C3019a(View view) {
            this.f8379a = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f8380b) {
                this.f8379a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            if (this.f8379a.hasOverlappingRendering() && this.f8379a.getLayerType() == 0) {
                this.f8380b = true;
                this.f8379a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C3018l(View view, float f, float f2) {
        this.f8376f = view;
        this.f8377o = f;
        this.f8378p = f2 - f;
        setAnimationListener(new C3019a(view));
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        this.f8376f.setAlpha(this.f8377o + (this.f8378p * f));
    }

    public boolean willChangeBounds() {
        return false;
    }
}
