package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.appbar.c */
class C4146c<V extends View> extends CoordinatorLayout.C1087c<V> {

    /* renamed from: a */
    private C4147d f11540a;

    /* renamed from: b */
    private int f11541b = 0;

    /* renamed from: c */
    private int f11542c = 0;

    public C4146c() {
    }

    public C4146c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: E */
    public int mo12640E() {
        C4147d dVar = this.f11540a;
        if (dVar != null) {
            return dVar.mo12665b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo12658F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo3420I(v, i);
    }

    /* renamed from: G */
    public boolean mo12641G(int i) {
        C4147d dVar = this.f11540a;
        if (dVar != null) {
            return dVar.mo12668e(i);
        }
        this.f11541b = i;
        return false;
    }

    /* renamed from: l */
    public boolean mo3484l(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo12658F(coordinatorLayout, v, i);
        if (this.f11540a == null) {
            this.f11540a = new C4147d(v);
        }
        this.f11540a.mo12666c();
        this.f11540a.mo12664a();
        int i2 = this.f11541b;
        if (i2 != 0) {
            this.f11540a.mo12668e(i2);
            this.f11541b = 0;
        }
        int i3 = this.f11542c;
        if (i3 == 0) {
            return true;
        }
        this.f11540a.mo12667d(i3);
        this.f11542c = 0;
        return true;
    }
}
