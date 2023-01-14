package com.horcrux.svg;

import android.util.SparseArray;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.views.view.C3245g;
import com.facebook.react.views.view.ReactViewManager;

class SvgViewManager extends ReactViewManager {
    private static final String REACT_CLASS = "RNSVGSvgView";
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();
    private static final SparseArray<C5028f0> mTagToSvgView = new SparseArray<>();

    SvgViewManager() {
    }

    static C5028f0 getSvgViewByTag(int i) {
        return mTagToSvgView.get(i);
    }

    static void runWhenViewIsAvailable(int i, Runnable runnable) {
        mTagToRunnable.put(i, runnable);
    }

    static void setSvgView(int i, C5028f0 f0Var) {
        mTagToSvgView.put(i, f0Var);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i);
        }
    }

    public C5028f0 createViewInstance(C3031o0 o0Var) {
        return new C5028f0(o0Var);
    }

    public String getName() {
        return REACT_CLASS;
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void onDropViewInstance(C3245g gVar) {
        super.onDropViewInstance(gVar);
        mTagToSvgView.remove(gVar.getId());
    }

    @C2991a(name = "align")
    public void setAlign(C5028f0 f0Var, String str) {
        f0Var.setAlign(str);
    }

    @C2991a(name = "bbHeight")
    public void setBbHeight(C5028f0 f0Var, Dynamic dynamic) {
        f0Var.setBbHeight(dynamic);
    }

    @C2991a(name = "bbWidth")
    public void setBbWidth(C5028f0 f0Var, Dynamic dynamic) {
        f0Var.setBbWidth(dynamic);
    }

    @C2991a(name = "color")
    public void setColor(C5028f0 f0Var, Dynamic dynamic) {
        f0Var.setTintColor(dynamic);
    }

    @C2991a(name = "meetOrSlice")
    public void setMeetOrSlice(C5028f0 f0Var, int i) {
        f0Var.setMeetOrSlice(i);
    }

    @C2991a(name = "minX")
    public void setMinX(C5028f0 f0Var, float f) {
        f0Var.setMinX(f);
    }

    @C2991a(name = "minY")
    public void setMinY(C5028f0 f0Var, float f) {
        f0Var.setMinY(f);
    }

    @C2991a(name = "tintColor")
    public void setTintColor(C5028f0 f0Var, Dynamic dynamic) {
        f0Var.setTintColor(dynamic);
    }

    @C2991a(name = "vbHeight")
    public void setVbHeight(C5028f0 f0Var, float f) {
        f0Var.setVbHeight(f);
    }

    @C2991a(name = "vbWidth")
    public void setVbWidth(C5028f0 f0Var, float f) {
        f0Var.setVbWidth(f);
    }

    public void updateExtraData(C3245g gVar, Object obj) {
        super.updateExtraData(gVar, obj);
        gVar.invalidate();
    }
}
