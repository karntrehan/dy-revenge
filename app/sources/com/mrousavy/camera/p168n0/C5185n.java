package com.mrousavy.camera.p168n0;

import android.view.View;
import android.view.ViewGroup;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.n0.n */
public final class C5185n {

    /* renamed from: com.mrousavy.camera.n0.n$a */
    public static final class C5186a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: f */
        final /* synthetic */ ViewGroup f14662f;

        C5186a(ViewGroup viewGroup) {
            this.f14662f = viewGroup;
        }

        public void onChildViewAdded(View view, View view2) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(this.f14662f.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f14662f.getMeasuredHeight(), 1073741824));
            }
            if (view != null) {
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }

        public void onChildViewRemoved(View view, View view2) {
        }
    }

    /* renamed from: a */
    public static final void m19466a(ViewGroup viewGroup) {
        C10457l.m35320e(viewGroup, "<this>");
        viewGroup.setOnHierarchyChangeListener(new C5186a(viewGroup));
    }
}
