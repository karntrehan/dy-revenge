package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.C2926c;
import com.facebook.react.uimanager.C2962f0;
import com.facebook.react.uimanager.C3025n0;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.uimanager.p120j1.C2992b;
import com.facebook.react.views.scroll.C3139f;
import com.facebook.yoga.C3307g;
import java.util.ArrayList;
import java.util.List;
import p027c.p064i.p072j.C1988t;

@C2639a(name = "AndroidHorizontalScrollView")
public class ReactHorizontalScrollViewManager extends ViewGroupManager<C3128d> implements C3139f.C3140a<C3128d> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private C3125a mFpsListener;

    public ReactHorizontalScrollViewManager() {
        this((C3125a) null);
    }

    public ReactHorizontalScrollViewManager(C3125a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    public C3128d createViewInstance(C3031o0 o0Var) {
        return new C3128d(o0Var, this.mFpsListener);
    }

    public void flashScrollIndicators(C3128d dVar) {
        dVar.mo10149q();
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void receiveCommand(C3128d dVar, int i, ReadableArray readableArray) {
        C3139f.m12359b(this, dVar, i, readableArray);
    }

    public void receiveCommand(C3128d dVar, String str, ReadableArray readableArray) {
        C3139f.m12360c(this, dVar, str, readableArray);
    }

    public void scrollTo(C3128d dVar, C3139f.C3141b bVar) {
        if (bVar.f8797c) {
            dVar.mo10128A(bVar.f8795a, bVar.f8796b);
        } else {
            dVar.scrollTo(bVar.f8795a, bVar.f8796b);
        }
    }

    public void scrollToEnd(C3128d dVar, C3139f.C3142c cVar) {
        int width = dVar.getChildAt(0).getWidth() + dVar.getPaddingRight();
        if (cVar.f8798a) {
            dVar.mo10128A(width, dVar.getScrollY());
        } else {
            dVar.scrollTo(width, dVar.getScrollY());
        }
    }

    @C2992b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C3128d dVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        dVar.mo10129C(SPACING_TYPES[i], intValue, f);
    }

    @C2992b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C3128d dVar, int i, float f) {
        if (!C3307g.m12971a(f)) {
            f = C3038r.m12006c(f);
        }
        if (i == 0) {
            dVar.setBorderRadius(f);
        } else {
            dVar.mo10130D(f, i - 1);
        }
    }

    @C2991a(name = "borderStyle")
    public void setBorderStyle(C3128d dVar, String str) {
        dVar.setBorderStyle(str);
    }

    @C2992b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C3128d dVar, int i, float f) {
        if (!C3307g.m12971a(f)) {
            f = C3038r.m12006c(f);
        }
        dVar.mo10131E(SPACING_TYPES[i], f);
    }

    @C2991a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(C3128d dVar, int i) {
        dVar.setEndFillColor(i);
    }

    @C2991a(name = "contentOffset")
    public void setContentOffset(C3128d dVar, ReadableMap readableMap) {
        if (readableMap != null) {
            double d = 0.0d;
            double d2 = readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d;
            if (readableMap.hasKey("y")) {
                d = readableMap.getDouble("y");
            }
            dVar.scrollTo((int) C3038r.m12005b(d2), (int) C3038r.m12005b(d));
            return;
        }
        dVar.scrollTo(0, 0);
    }

    @C2991a(name = "decelerationRate")
    public void setDecelerationRate(C3128d dVar, float f) {
        dVar.setDecelerationRate(f);
    }

    @C2991a(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(C3128d dVar, boolean z) {
        dVar.setDisableIntervalMomentum(z);
    }

    @C2991a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(C3128d dVar, int i) {
        if (i > 0) {
            dVar.setHorizontalFadingEdgeEnabled(true);
        } else {
            i = 0;
            dVar.setHorizontalFadingEdgeEnabled(false);
        }
        dVar.setFadingEdgeLength(i);
    }

    @C2991a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(C3128d dVar, boolean z) {
        C1988t.m8420z0(dVar, z);
    }

    @C2991a(name = "overScrollMode")
    public void setOverScrollMode(C3128d dVar, String str) {
        dVar.setOverScrollMode(C3143g.m12372j(str));
    }

    @C2991a(name = "overflow")
    public void setOverflow(C3128d dVar, String str) {
        dVar.setOverflow(str);
    }

    @C2991a(name = "pagingEnabled")
    public void setPagingEnabled(C3128d dVar, boolean z) {
        dVar.setPagingEnabled(z);
    }

    @C2991a(name = "persistentScrollbar")
    public void setPersistentScrollbar(C3128d dVar, boolean z) {
        dVar.setScrollbarFadingEnabled(!z);
    }

    @C2991a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(C3128d dVar, boolean z) {
        dVar.setRemoveClippedSubviews(z);
    }

    @C2991a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(C3128d dVar, boolean z) {
        dVar.setScrollEnabled(z);
    }

    @C2991a(name = "scrollPerfTag")
    public void setScrollPerfTag(C3128d dVar, String str) {
        dVar.setScrollPerfTag(str);
    }

    @C2991a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(C3128d dVar, boolean z) {
        dVar.setSendMomentumEvents(z);
    }

    @C2991a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(C3128d dVar, boolean z) {
        dVar.setHorizontalScrollBarEnabled(z);
    }

    @C2991a(name = "snapToAlignment")
    public void setSnapToAlignment(C3128d dVar, String str) {
        dVar.setSnapToAlignment(C3143g.m12373k(str));
    }

    @C2991a(name = "snapToEnd")
    public void setSnapToEnd(C3128d dVar, boolean z) {
        dVar.setSnapToEnd(z);
    }

    @C2991a(name = "snapToInterval")
    public void setSnapToInterval(C3128d dVar, float f) {
        dVar.setSnapInterval((int) (f * C2926c.m11504c().density));
    }

    @C2991a(name = "snapToOffsets")
    public void setSnapToOffsets(C3128d dVar, ReadableArray readableArray) {
        if (readableArray == null) {
            dVar.setSnapOffsets((List<Integer>) null);
            return;
        }
        DisplayMetrics c = C2926c.m11504c();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i) * ((double) c.density))));
        }
        dVar.setSnapOffsets(arrayList);
    }

    @C2991a(name = "snapToStart")
    public void setSnapToStart(C3128d dVar, boolean z) {
        dVar.setSnapToStart(z);
    }

    public Object updateState(C3128d dVar, C2962f0 f0Var, C3025n0 n0Var) {
        dVar.getFabricViewStateManager().mo9496e(n0Var);
        return null;
    }
}
