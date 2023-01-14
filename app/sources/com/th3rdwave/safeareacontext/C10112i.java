package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.views.view.C3245g;
import java.util.Objects;
import p455g.C10323s;
import p455g.p470y.p471c.C10435q;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.th3rdwave.safeareacontext.i */
public final class C10112i extends C3245g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: F */
    private C10435q<? super C10112i, ? super C10107e, ? super C10110g, C10323s> f26949F;

    /* renamed from: G */
    private C10107e f26950G;

    /* renamed from: H */
    private C10110g f26951H;

    public C10112i(Context context) {
        super(context);
    }

    /* renamed from: B */
    private final void m34207B() {
        C10107e f;
        C10435q<? super C10112i, ? super C10107e, ? super C10110g, C10323s> qVar = this.f26949F;
        if (qVar != null && (f = C10114k.m34215f(this)) != null) {
            View rootView = getRootView();
            Objects.requireNonNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            C10110g a = C10114k.m34210a((ViewGroup) rootView, this);
            if (a != null) {
                if (!C10457l.m35316a(this.f26950G, f) || !C10457l.m35316a(this.f26951H, a)) {
                    qVar.mo25154f(this, f, a);
                    this.f26950G = f;
                    this.f26951H = a;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        m34207B();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    public boolean onPreDraw() {
        m34207B();
        return true;
    }

    public final void setOnInsetsChangeHandler(C10435q<? super C10112i, ? super C10107e, ? super C10110g, C10323s> qVar) {
        this.f26949F = qVar;
        m34207B();
    }
}
