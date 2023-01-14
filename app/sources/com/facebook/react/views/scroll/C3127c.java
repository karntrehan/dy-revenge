package com.facebook.react.views.scroll;

import android.content.Context;
import com.facebook.react.modules.i18nmanager.C2822a;
import com.facebook.react.views.view.C3245g;

/* renamed from: com.facebook.react.views.scroll.c */
public class C3127c extends C3245g {

    /* renamed from: F */
    private int f8694F;

    /* renamed from: G */
    private int f8695G = 0;

    public C3127c(Context context) {
        super(context);
        this.f8694F = C2822a.m11246d().mo9192g(context) ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f8694F == 1) {
            setLeft(0);
            setRight((i3 - i) + 0);
            if (this.f8695G != getWidth()) {
                C3128d dVar = (C3128d) getParent();
                dVar.scrollTo(((dVar.getScrollX() + getWidth()) - this.f8695G) - dVar.getWidth(), dVar.getScrollY());
            }
        }
        this.f8695G = getWidth();
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (this.f8694F == 1) {
            super.setRemoveClippedSubviews(false);
        } else {
            super.setRemoveClippedSubviews(z);
        }
    }
}
