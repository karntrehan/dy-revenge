package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.List;
import java.util.WeakHashMap;

public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, C2987j> implements C2964g {
    private static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();

    public static Integer getViewZIndex(View view) {
        return mZIndexHash.get(view);
    }

    public static void setViewZIndex(View view, int i) {
        mZIndexHash.put(view, Integer.valueOf(i));
    }

    public void addView(T t, View view, int i) {
        t.addView(view, i);
    }

    public void addViews(T t, List<View> list) {
        UiThreadUtil.assertOnUiThread();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            addView(t, list.get(i), i);
        }
    }

    public C2987j createShadowNodeInstance() {
        return new C2987j();
    }

    public View getChildAt(T t, int i) {
        return t.getChildAt(i);
    }

    public int getChildCount(T t) {
        return t.getChildCount();
    }

    public Class<? extends C2987j> getShadowNodeClass() {
        return C2987j.class;
    }

    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public void removeAllViews(T t) {
        UiThreadUtil.assertOnUiThread();
        for (int childCount = getChildCount(t) - 1; childCount >= 0; childCount--) {
            removeViewAt(t, childCount);
        }
    }

    public void removeView(T t, View view) {
        UiThreadUtil.assertOnUiThread();
        for (int i = 0; i < getChildCount(t); i++) {
            if (getChildAt(t, i) == view) {
                removeViewAt(t, i);
                return;
            }
        }
    }

    public void removeViewAt(T t, int i) {
        UiThreadUtil.assertOnUiThread();
        t.removeViewAt(i);
    }

    public boolean shouldPromoteGrandchildren() {
        return false;
    }

    public void updateExtraData(T t, Object obj) {
    }
}
