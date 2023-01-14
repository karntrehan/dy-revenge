package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.C3245g;
import p455g.p470y.p472d.C10457l;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.swmansion.rnscreens.a0 */
public final class C10028a0 extends C3245g {

    /* renamed from: F */
    private int f26745F;

    /* renamed from: G */
    private int f26746G;

    /* renamed from: H */
    private C10029a f26747H = C10029a.RIGHT;

    /* renamed from: com.swmansion.rnscreens.a0$a */
    public enum C10029a {
        LEFT,
        CENTER,
        RIGHT,
        BACK,
        SEARCH_BAR
    }

    public C10028a0(ReactContext reactContext) {
        super(reactContext);
    }

    public final C10097z getConfig() {
        ViewParent parent = getParent();
        C10078q qVar = parent instanceof C10078q ? (C10078q) parent : null;
        if (qVar != null) {
            return qVar.getConfig();
        }
        return null;
    }

    public final C10029a getType() {
        return this.f26747H;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            this.f26745F = View.MeasureSpec.getSize(i);
            this.f26746G = View.MeasureSpec.getSize(i2);
            ViewParent parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.f26745F, this.f26746G);
    }

    public final void setType(C10029a aVar) {
        C10457l.m35320e(aVar, "<set-?>");
        this.f26747H = aVar;
    }
}
