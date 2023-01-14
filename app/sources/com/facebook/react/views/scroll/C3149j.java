package com.facebook.react.views.scroll;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* renamed from: com.facebook.react.views.scroll.j */
public class C3149j {

    /* renamed from: a */
    private VelocityTracker f8821a;

    /* renamed from: b */
    private float f8822b;

    /* renamed from: c */
    private float f8823c;

    /* renamed from: a */
    public void mo10227a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f8821a == null) {
            this.f8821a = VelocityTracker.obtain();
        }
        this.f8821a.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.f8821a.computeCurrentVelocity(1);
            this.f8822b = this.f8821a.getXVelocity();
            this.f8823c = this.f8821a.getYVelocity();
            VelocityTracker velocityTracker = this.f8821a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f8821a = null;
            }
        }
    }

    /* renamed from: b */
    public float mo10228b() {
        return this.f8822b;
    }

    /* renamed from: c */
    public float mo10229c() {
        return this.f8823c;
    }
}
