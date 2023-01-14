package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9021h;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: w */
    private static final int[] f12174w = {C9013b.snackbarButtonStyle};

    /* renamed from: x */
    private final AccessibilityManager f12175x;

    /* renamed from: y */
    private boolean f12176y;

    public static final class SnackbarLayout extends BaseTransientBottomBar.C4298v {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    class C4300a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ View.OnClickListener f12177f;

        C4300a(View.OnClickListener onClickListener) {
            this.f12177f = onClickListener;
        }

        public void onClick(View view) {
            this.f12177f.onClick(view);
            Snackbar.this.mo13527u(1);
        }
    }

    private Snackbar(ViewGroup viewGroup, View view, C4301a aVar) {
        super(viewGroup, view, aVar);
        this.f12175x = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: V */
    private static ViewGroup m16500V(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: W */
    protected static boolean m16501W(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f12174w);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* renamed from: X */
    public static Snackbar m16502X(View view, CharSequence charSequence, int i) {
        ViewGroup V = m16500V(view);
        if (V != null) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(V.getContext()).inflate(m16501W(V.getContext()) ? C9021h.mtrl_layout_snackbar_include : C9021h.design_layout_snackbar_include, V, false);
            Snackbar snackbar = new Snackbar(V, snackbarContentLayout, snackbarContentLayout);
            snackbar.mo13567a0(charSequence);
            snackbar.mo13521J(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: N */
    public void mo13523N() {
        super.mo13523N();
    }

    /* renamed from: Y */
    public Snackbar mo13565Y(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f12128g.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener((View.OnClickListener) null);
            this.f12176y = false;
        } else {
            this.f12176y = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new C4300a(onClickListener));
        }
        return this;
    }

    /* renamed from: Z */
    public Snackbar mo13566Z(int i) {
        ((SnackbarContentLayout) this.f12128g.getChildAt(0)).getActionView().setTextColor(i);
        return this;
    }

    /* renamed from: a0 */
    public Snackbar mo13567a0(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f12128g.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    /* renamed from: t */
    public void mo13526t() {
        super.mo13526t();
    }

    /* renamed from: w */
    public int mo13528w() {
        int w = super.mo13528w();
        if (w == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f12175x.getRecommendedTimeoutMillis(w, (this.f12176y ? 4 : 0) | 1 | 2);
        } else if (!this.f12176y || !this.f12175x.isTouchExplorationEnabled()) {
            return w;
        } else {
            return -2;
        }
    }
}
