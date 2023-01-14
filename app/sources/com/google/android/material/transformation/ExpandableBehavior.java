package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.p376u.C9056a;

public abstract class ExpandableBehavior extends CoordinatorLayout.C1087c<View> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f12340a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    class C4345a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: f */
        final /* synthetic */ View f12341f;

        /* renamed from: o */
        final /* synthetic */ int f12342o;

        /* renamed from: p */
        final /* synthetic */ C9056a f12343p;

        C4345a(View view, int i, C9056a aVar) {
            this.f12341f = view;
            this.f12342o = i;
            this.f12343p = aVar;
        }

        public boolean onPreDraw() {
            this.f12341f.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f12340a == this.f12342o) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                C9056a aVar = this.f12343p;
                expandableBehavior.mo13776H((View) aVar, this.f12341f, aVar.mo13275a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: F */
    private boolean m16702F(boolean z) {
        if (!z) {
            return this.f12340a == 1;
        }
        int i = this.f12340a;
        return i == 0 || i == 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public C9056a mo13775G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> r = coordinatorLayout.mo3453r(view);
        int size = r.size();
        for (int i = 0; i < size; i++) {
            View view2 = r.get(i);
            if (mo3477e(coordinatorLayout, view, view2)) {
                return (C9056a) view2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract boolean mo13776H(View view, View view2, boolean z, boolean z2);

    /* renamed from: h */
    public boolean mo3480h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C9056a aVar = (C9056a) view2;
        if (!m16702F(aVar.mo13275a())) {
            return false;
        }
        this.f12340a = aVar.mo13275a() ? 1 : 2;
        return mo13776H((View) aVar, view, aVar.mo13275a(), true);
    }

    /* renamed from: l */
    public boolean mo3484l(CoordinatorLayout coordinatorLayout, View view, int i) {
        C9056a G;
        if (C1988t.m8361S(view) || (G = mo13775G(coordinatorLayout, view)) == null || !m16702F(G.mo13275a())) {
            return false;
        }
        int i2 = G.mo13275a() ? 1 : 2;
        this.f12340a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new C4345a(view, i2, G));
        return false;
    }
}
