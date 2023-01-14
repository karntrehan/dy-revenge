package com.facebook.react.views.view;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.views.view.C3245g;

public abstract class ReactClippingViewManager<T extends C3245g> extends ViewGroupManager<T> {
    public void addView(T t, View view, int i) {
        UiThreadUtil.assertOnUiThread();
        if (t.getRemoveClippedSubviews()) {
            t.mo10660k(view, i);
        } else {
            t.addView(view, i);
        }
    }

    public View getChildAt(T t, int i) {
        return t.getRemoveClippedSubviews() ? t.mo10662o(i) : t.getChildAt(i);
    }

    public int getChildCount(T t) {
        return t.getRemoveClippedSubviews() ? t.getAllChildrenCount() : t.getChildCount();
    }

    public void removeAllViews(T t) {
        UiThreadUtil.assertOnUiThread();
        if (t.getRemoveClippedSubviews()) {
            t.mo10666q();
        } else {
            t.removeAllViews();
        }
    }

    public void removeViewAt(T t, int i) {
        UiThreadUtil.assertOnUiThread();
        if (t.getRemoveClippedSubviews()) {
            View childAt = getChildAt(t, i);
            if (childAt.getParent() != null) {
                t.removeView(childAt);
            }
            t.mo10670s(childAt);
            return;
        }
        t.removeViewAt(i);
    }

    @C2991a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(T t, boolean z) {
        UiThreadUtil.assertOnUiThread();
        t.setRemoveClippedSubviews(z);
    }
}
