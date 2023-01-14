package com.facebook.react.views.swiperefresh;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.events.C2954h;
import p027c.p098u.p099b.C2110c;

/* renamed from: com.facebook.react.views.swiperefresh.a */
public class C3157a extends C2110c {

    /* renamed from: i0 */
    private boolean f8840i0 = false;

    /* renamed from: j0 */
    private boolean f8841j0 = false;

    /* renamed from: k0 */
    private float f8842k0 = 0.0f;

    /* renamed from: l0 */
    private int f8843l0;

    /* renamed from: m0 */
    private float f8844m0;

    /* renamed from: n0 */
    private boolean f8845n0;

    public C3157a(ReactContext reactContext) {
        super(reactContext);
        this.f8843l0 = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    /* renamed from: B */
    private boolean m12406B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f8844m0 = motionEvent.getX();
            this.f8845n0 = false;
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - this.f8844m0);
            if (this.f8845n0 || abs > ((float) this.f8843l0)) {
                this.f8845n0 = true;
                return false;
            }
        }
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!m12406B(motionEvent) || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        C2954h.m11771a(this, motionEvent);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f8840i0) {
            this.f8840i0 = true;
            setProgressViewOffset(this.f8842k0);
            setRefreshing(this.f8841j0);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setProgressViewOffset(float f) {
        this.f8842k0 = f;
        if (this.f8840i0) {
            int progressCircleDiameter = getProgressCircleDiameter();
            mo7133s(false, Math.round(C3038r.m12006c(f)) - progressCircleDiameter, Math.round(C3038r.m12006c(f + 64.0f) - ((float) progressCircleDiameter)));
        }
    }

    public void setRefreshing(boolean z) {
        this.f8841j0 = z;
        if (this.f8840i0) {
            super.setRefreshing(z);
        }
    }
}
