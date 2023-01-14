package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.reactnativecommunity.webview.RNCWebViewManager;

/* renamed from: com.facebook.react.views.progressbar.a */
class C3123a extends FrameLayout {

    /* renamed from: f */
    private Integer f8680f;

    /* renamed from: o */
    private boolean f8681o = true;

    /* renamed from: p */
    private boolean f8682p = true;

    /* renamed from: q */
    private double f8683q;

    /* renamed from: r */
    private ProgressBar f8684r;

    public C3123a(Context context) {
        super(context);
    }

    /* renamed from: c */
    private void m12271c(ProgressBar progressBar) {
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable != null) {
            Integer num = this.f8680f;
            if (num != null) {
                indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                indeterminateDrawable.clearColorFilter();
            }
        }
    }

    /* renamed from: a */
    public void mo10049a() {
        int i;
        ProgressBar progressBar;
        ProgressBar progressBar2 = this.f8684r;
        if (progressBar2 != null) {
            progressBar2.setIndeterminate(this.f8681o);
            m12271c(this.f8684r);
            this.f8684r.setProgress((int) (this.f8683q * 1000.0d));
            if (this.f8682p) {
                progressBar = this.f8684r;
                i = 0;
            } else {
                progressBar = this.f8684r;
                i = 4;
            }
            progressBar.setVisibility(i);
            return;
        }
        throw new JSApplicationIllegalArgumentException("setStyle() not called");
    }

    /* renamed from: b */
    public void mo10050b(boolean z) {
        this.f8682p = z;
    }

    /* renamed from: d */
    public void mo10051d(Integer num) {
        this.f8680f = num;
    }

    /* renamed from: e */
    public void mo10052e(boolean z) {
        this.f8681o = z;
    }

    /* renamed from: f */
    public void mo10053f(double d) {
        this.f8683q = d;
    }

    /* renamed from: g */
    public void mo10054g(String str) {
        ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.f8684r = createProgressBar;
        createProgressBar.setMax(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
        removeAllViews();
        addView(this.f8684r, new ViewGroup.LayoutParams(-1, -1));
    }
}
