package com.facebook.react.p113d0;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.facebook.react.d0.a */
public class C2706a implements C2707b {

    /* renamed from: a */
    private volatile int f7802a = -1;

    /* renamed from: b */
    private ViewParent f7803b;

    /* renamed from: c */
    private void m10974c() {
        ViewParent viewParent = this.f7803b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.f7803b = null;
        }
    }

    /* renamed from: a */
    public boolean mo8855a(ViewGroup viewGroup, MotionEvent motionEvent) {
        int i = this.f7802a;
        return (i == -1 || motionEvent.getAction() == 1 || viewGroup.getId() != i) ? false : true;
    }

    /* renamed from: b */
    public void mo8856b() {
        this.f7802a = -1;
        m10974c();
    }

    /* renamed from: d */
    public void mo8857d(int i, ViewParent viewParent) {
        this.f7802a = i;
        m10974c();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.f7803b = viewParent;
        }
    }
}
