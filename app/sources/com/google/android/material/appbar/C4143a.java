package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import p027c.p064i.p072j.C1988t;

/* renamed from: com.google.android.material.appbar.a */
abstract class C4143a<V extends View> extends C4146c<V> {

    /* renamed from: d */
    private Runnable f11526d;

    /* renamed from: e */
    OverScroller f11527e;

    /* renamed from: f */
    private boolean f11528f;

    /* renamed from: g */
    private int f11529g = -1;

    /* renamed from: h */
    private int f11530h;

    /* renamed from: i */
    private int f11531i = -1;

    /* renamed from: j */
    private VelocityTracker f11532j;

    /* renamed from: com.google.android.material.appbar.a$a */
    private class C4144a implements Runnable {

        /* renamed from: f */
        private final CoordinatorLayout f11533f;

        /* renamed from: o */
        private final V f11534o;

        C4144a(CoordinatorLayout coordinatorLayout, V v) {
            this.f11533f = coordinatorLayout;
            this.f11534o = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f11534o != null && (overScroller = C4143a.this.f11527e) != null) {
                if (overScroller.computeScrollOffset()) {
                    C4143a aVar = C4143a.this;
                    aVar.mo12656P(this.f11533f, this.f11534o, aVar.f11527e.getCurrY());
                    C1988t.m8378e0(this.f11534o, this);
                    return;
                }
                C4143a.this.mo12618N(this.f11533f, this.f11534o);
            }
        }
    }

    public C4143a() {
    }

    public C4143a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: I */
    private void m15596I() {
        if (this.f11532j == null) {
            this.f11532j = VelocityTracker.obtain();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00ae;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3472D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.f11531i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.f11531i = r0
        L_0x0012:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            r3 = -1
            if (r0 == r1) goto L_0x005c
            r4 = 2
            if (r0 == r4) goto L_0x0025
            r12 = 3
            if (r0 == r12) goto L_0x007e
            goto L_0x00ae
        L_0x0025:
            int r0 = r11.f11529g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002e
            return r2
        L_0x002e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.f11530h
            int r2 = r2 - r0
            boolean r3 = r11.f11528f
            if (r3 != 0) goto L_0x0049
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.f11531i
            if (r3 <= r4) goto L_0x0049
            r11.f11528f = r1
            if (r2 <= 0) goto L_0x0048
            int r2 = r2 - r4
            goto L_0x0049
        L_0x0048:
            int r2 = r2 + r4
        L_0x0049:
            r6 = r2
            boolean r2 = r11.f11528f
            if (r2 == 0) goto L_0x00ae
            r11.f11530h = r0
            int r7 = r11.mo12615K(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.mo12655O(r4, r5, r6, r7, r8)
            goto L_0x00ae
        L_0x005c:
            android.view.VelocityTracker r0 = r11.f11532j
            if (r0 == 0) goto L_0x007e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f11532j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f11532j
            int r4 = r11.f11529g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo12616L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo12654J(r6, r7, r8, r9, r10)
        L_0x007e:
            r11.f11528f = r2
            r11.f11529g = r3
            android.view.VelocityTracker r12 = r11.f11532j
            if (r12 == 0) goto L_0x00ae
            r12.recycle()
            r12 = 0
            r11.f11532j = r12
            goto L_0x00ae
        L_0x008d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.mo3417B(r13, r0, r3)
            if (r12 == 0) goto L_0x00b6
            boolean r12 = r11.mo12614H(r13)
            if (r12 == 0) goto L_0x00b6
            r11.f11530h = r3
            int r12 = r14.getPointerId(r2)
            r11.f11529g = r12
            r11.m15596I()
        L_0x00ae:
            android.view.VelocityTracker r12 = r11.f11532j
            if (r12 == 0) goto L_0x00b5
            r12.addMovement(r14)
        L_0x00b5:
            return r1
        L_0x00b6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.C4143a.mo3472D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public abstract boolean mo12614H(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final boolean mo12654J(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f11526d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f11526d = null;
        }
        if (this.f11527e == null) {
            this.f11527e = new OverScroller(v.getContext());
        }
        this.f11527e.fling(0, mo12640E(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f11527e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C4144a aVar = new C4144a(coordinatorLayout, v);
            this.f11526d = aVar;
            C1988t.m8378e0(v, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo12618N(coordinatorLayout, v);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public abstract int mo12615K(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public abstract int mo12616L(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public abstract int mo12617M();

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public abstract void mo12618N(CoordinatorLayout coordinatorLayout, V v);

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final int mo12655O(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo12619Q(coordinatorLayout, v, mo12617M() - i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public int mo12656P(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo12619Q(coordinatorLayout, v, i, RecyclerView.UNDEFINED_DURATION, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public abstract int mo12619Q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x0083;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3483k(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f11531i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f11531i = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.f11528f
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L_0x0060
            r5 = -1
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x0051
            goto L_0x0083
        L_0x002f:
            int r6 = r4.f11529g
            if (r6 != r5) goto L_0x0034
            goto L_0x0083
        L_0x0034:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L_0x003b
            goto L_0x0083
        L_0x003b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f11530h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f11531i
            if (r6 <= r0) goto L_0x0083
            r4.f11528f = r2
            r4.f11530h = r5
            goto L_0x0083
        L_0x0051:
            r4.f11528f = r3
            r4.f11529g = r5
            android.view.VelocityTracker r5 = r4.f11532j
            if (r5 == 0) goto L_0x0083
            r5.recycle()
            r5 = 0
            r4.f11532j = r5
            goto L_0x0083
        L_0x0060:
            r4.f11528f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.mo12614H(r6)
            if (r2 == 0) goto L_0x0083
            boolean r5 = r5.mo3417B(r6, r0, r1)
            if (r5 == 0) goto L_0x0083
            r4.f11530h = r1
            int r5 = r7.getPointerId(r3)
            r4.f11529g = r5
            r4.m15596I()
        L_0x0083:
            android.view.VelocityTracker r5 = r4.f11532j
            if (r5 == 0) goto L_0x008a
            r5.addMovement(r7)
        L_0x008a:
            boolean r5 = r4.f11528f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.C4143a.mo3483k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
