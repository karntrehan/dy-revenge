package com.yalantis.ucrop.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.yalantis.ucrop.p445m.C10168h;

public class GestureCropImageView extends C10180a {

    /* renamed from: Q */
    private ScaleGestureDetector f27172Q;

    /* renamed from: R */
    private C10168h f27173R;

    /* renamed from: S */
    private GestureDetector f27174S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public float f27175T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public float f27176U;

    /* renamed from: V */
    private boolean f27177V;

    /* renamed from: W */
    private boolean f27178W;

    /* renamed from: a0 */
    private int f27179a0;

    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$b */
    private class C10175b extends GestureDetector.SimpleOnGestureListener {
        private C10175b() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.mo25337B(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200);
            return super.onDoubleTap(motionEvent);
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GestureCropImageView.this.mo25376m(-f, -f2);
            return true;
        }
    }

    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$c */
    private class C10176c extends C10168h.C10170b {
        private C10176c() {
        }

        /* renamed from: a */
        public boolean mo25287a(C10168h hVar) {
            GestureCropImageView.this.mo25375k(hVar.mo25285c(), GestureCropImageView.this.f27175T, GestureCropImageView.this.f27176U);
            return true;
        }
    }

    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$d */
    private class C10177d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private C10177d() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.mo25347l(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.f27175T, GestureCropImageView.this.f27176U);
            return true;
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27177V = true;
        this.f27178W = true;
        this.f27179a0 = 5;
    }

    /* renamed from: I */
    private void m34434I() {
        this.f27174S = new GestureDetector(getContext(), new C10175b(), (Handler) null, true);
        this.f27172Q = new ScaleGestureDetector(getContext(), new C10177d());
        this.f27173R = new C10168h(new C10176c());
    }

    public int getDoubleTapScaleSteps() {
        return this.f27179a0;
    }

    /* access modifiers changed from: protected */
    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow((double) (getMaxScale() / getMinScale()), (double) (1.0f / ((float) this.f27179a0))));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo25300i() {
        super.mo25300i();
        m34434I();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            mo25356t();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f27175T = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.f27176U = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        this.f27174S.onTouchEvent(motionEvent);
        if (this.f27178W) {
            this.f27172Q.onTouchEvent(motionEvent);
        }
        if (this.f27177V) {
            this.f27173R.mo25286d(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            mo25362z();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i) {
        this.f27179a0 = i;
    }

    public void setRotateEnabled(boolean z) {
        this.f27177V = z;
    }

    public void setScaleEnabled(boolean z) {
        this.f27178W = z;
    }
}
