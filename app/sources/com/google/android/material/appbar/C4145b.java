package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p027c.p064i.p068f.C1847a;
import p027c.p064i.p072j.C1915d;
import p027c.p064i.p072j.C1929e0;
import p027c.p064i.p072j.C1988t;

/* renamed from: com.google.android.material.appbar.b */
abstract class C4145b extends C4146c<View> {

    /* renamed from: d */
    final Rect f11536d = new Rect();

    /* renamed from: e */
    final Rect f11537e = new Rect();

    /* renamed from: f */
    private int f11538f = 0;

    /* renamed from: g */
    private int f11539g;

    public C4145b() {
    }

    public C4145b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: N */
    private static int m15608N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo12658F(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View H = mo12642H(coordinatorLayout.mo3453r(view));
        if (H != null) {
            CoordinatorLayout.C1090f fVar = (CoordinatorLayout.C1090f) view.getLayoutParams();
            Rect rect = this.f11536d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, H.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            C1929e0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C1988t.m8411v(coordinatorLayout) && !C1988t.m8411v(view)) {
                rect.left += lastWindowInsets.mo6490i();
                rect.right -= lastWindowInsets.mo6491j();
            }
            Rect rect2 = this.f11537e;
            C1915d.m8011a(m15608N(fVar.f3040c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int I = mo12659I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            i2 = rect2.top - H.getBottom();
        } else {
            super.mo12658F(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.f11538f = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public abstract View mo12642H(List<View> list);

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final int mo12659I(View view) {
        if (this.f11539g == 0) {
            return 0;
        }
        float J = mo12643J(view);
        int i = this.f11539g;
        return C1847a.m7858b((int) (J * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public abstract float mo12643J(View view);

    /* renamed from: K */
    public final int mo12660K() {
        return this.f11539g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo12644L(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final int mo12661M() {
        return this.f11538f;
    }

    /* renamed from: O */
    public final void mo12662O(int i) {
        this.f11539g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public boolean mo12663P() {
        return false;
    }

    /* renamed from: m */
    public boolean mo3485m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View H;
        C1929e0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (H = mo12642H(coordinatorLayout.mo3453r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C1988t.m8411v(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.mo6492k() + lastWindowInsets.mo6488h();
        }
        int L = size + mo12644L(H);
        int measuredHeight = H.getMeasuredHeight();
        if (mo12663P()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            L -= measuredHeight;
        }
        coordinatorLayout.mo3421J(view, i, i2, View.MeasureSpec.makeMeasureSpec(L, i5 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i4);
        return true;
    }
}
