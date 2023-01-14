package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.common.C2693e;
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
import java.util.Map;
import p027c.p064i.p072j.C1988t;

@C2639a(name = "RCTScrollView")
public class ReactScrollViewManager extends ViewGroupManager<C3134e> implements C3139f.C3140a<C3134e> {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private C3125a mFpsListener;

    public ReactScrollViewManager() {
        this((C3125a) null);
    }

    public ReactScrollViewManager(C3125a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        return C2693e.m10911a().mo8815b(C3147i.m12384e(C3147i.SCROLL), C2693e.m10914d("registrationName", "onScroll")).mo8815b(C3147i.m12384e(C3147i.BEGIN_DRAG), C2693e.m10914d("registrationName", "onScrollBeginDrag")).mo8815b(C3147i.m12384e(C3147i.END_DRAG), C2693e.m10914d("registrationName", "onScrollEndDrag")).mo8815b(C3147i.m12384e(C3147i.MOMENTUM_BEGIN), C2693e.m10914d("registrationName", "onMomentumScrollBegin")).mo8815b(C3147i.m12384e(C3147i.MOMENTUM_END), C2693e.m10914d("registrationName", "onMomentumScrollEnd")).mo8814a();
    }

    public C3134e createViewInstance(C3031o0 o0Var) {
        return new C3134e(o0Var, this.mFpsListener);
    }

    public void flashScrollIndicators(C3134e eVar) {
        eVar.mo10193p();
    }

    public Map<String, Integer> getCommandsMap() {
        return C3139f.m12358a();
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return createExportedCustomDirectEventTypeConstants();
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void receiveCommand(C3134e eVar, int i, ReadableArray readableArray) {
        C3139f.m12359b(this, eVar, i, readableArray);
    }

    public void receiveCommand(C3134e eVar, String str, ReadableArray readableArray) {
        C3139f.m12360c(this, eVar, str, readableArray);
    }

    public void scrollTo(C3134e eVar, C3139f.C3141b bVar) {
        if (bVar.f8797c) {
            eVar.mo10214w(bVar.f8795a, bVar.f8796b);
        } else {
            eVar.scrollTo(bVar.f8795a, bVar.f8796b);
        }
    }

    public void scrollToEnd(C3134e eVar, C3139f.C3142c cVar) {
        View childAt = eVar.getChildAt(0);
        if (childAt != null) {
            int height = childAt.getHeight() + eVar.getPaddingBottom();
            if (cVar.f8798a) {
                eVar.mo10214w(eVar.getScrollX(), height);
            } else {
                eVar.scrollTo(eVar.getScrollX(), height);
            }
        } else {
            throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
        }
    }

    @C2992b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C3134e eVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        eVar.mo10215y(SPACING_TYPES[i], intValue, f);
    }

    @C2992b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C3134e eVar, int i, float f) {
        if (!C3307g.m12971a(f)) {
            f = C3038r.m12006c(f);
        }
        if (i == 0) {
            eVar.setBorderRadius(f);
        } else {
            eVar.mo10216z(f, i - 1);
        }
    }

    @C2991a(name = "borderStyle")
    public void setBorderStyle(C3134e eVar, String str) {
        eVar.setBorderStyle(str);
    }

    @C2992b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C3134e eVar, int i, float f) {
        if (!C3307g.m12971a(f)) {
            f = C3038r.m12006c(f);
        }
        eVar.mo10175A(SPACING_TYPES[i], f);
    }

    @C2991a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(C3134e eVar, int i) {
        eVar.setEndFillColor(i);
    }

    @C2991a(customType = "Point", name = "contentOffset")
    public void setContentOffset(C3134e eVar, ReadableMap readableMap) {
        if (readableMap != null) {
            double d = 0.0d;
            double d2 = readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d;
            if (readableMap.hasKey("y")) {
                d = readableMap.getDouble("y");
            }
            eVar.scrollTo((int) C3038r.m12005b(d2), (int) C3038r.m12005b(d));
            return;
        }
        eVar.scrollTo(0, 0);
    }

    @C2991a(name = "decelerationRate")
    public void setDecelerationRate(C3134e eVar, float f) {
        eVar.setDecelerationRate(f);
    }

    @C2991a(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(C3134e eVar, boolean z) {
        eVar.setDisableIntervalMomentum(z);
    }

    @C2991a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(C3134e eVar, int i) {
        if (i > 0) {
            eVar.setVerticalFadingEdgeEnabled(true);
        } else {
            i = 0;
            eVar.setVerticalFadingEdgeEnabled(false);
        }
        eVar.setFadingEdgeLength(i);
    }

    @C2991a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(C3134e eVar, boolean z) {
        C1988t.m8420z0(eVar, z);
    }

    @C2991a(name = "overScrollMode")
    public void setOverScrollMode(C3134e eVar, String str) {
        eVar.setOverScrollMode(C3143g.m12372j(str));
    }

    @C2991a(name = "overflow")
    public void setOverflow(C3134e eVar, String str) {
        eVar.setOverflow(str);
    }

    @C2991a(name = "pagingEnabled")
    public void setPagingEnabled(C3134e eVar, boolean z) {
        eVar.setPagingEnabled(z);
    }

    @C2991a(name = "persistentScrollbar")
    public void setPersistentScrollbar(C3134e eVar, boolean z) {
        eVar.setScrollbarFadingEnabled(!z);
    }

    @C2991a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(C3134e eVar, boolean z) {
        eVar.setRemoveClippedSubviews(z);
    }

    @C2991a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(C3134e eVar, boolean z) {
        eVar.setScrollEnabled(z);
        eVar.setFocusable(z);
    }

    @C2991a(name = "scrollPerfTag")
    public void setScrollPerfTag(C3134e eVar, String str) {
        eVar.setScrollPerfTag(str);
    }

    @C2991a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(C3134e eVar, boolean z) {
        eVar.setSendMomentumEvents(z);
    }

    @C2991a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(C3134e eVar, boolean z) {
        eVar.setVerticalScrollBarEnabled(z);
    }

    @C2991a(name = "snapToAlignment")
    public void setSnapToAlignment(C3134e eVar, String str) {
        eVar.setSnapToAlignment(C3143g.m12373k(str));
    }

    @C2991a(name = "snapToEnd")
    public void setSnapToEnd(C3134e eVar, boolean z) {
        eVar.setSnapToEnd(z);
    }

    @C2991a(name = "snapToInterval")
    public void setSnapToInterval(C3134e eVar, float f) {
        eVar.setSnapInterval((int) (f * C2926c.m11504c().density));
    }

    @C2991a(name = "snapToOffsets")
    public void setSnapToOffsets(C3134e eVar, ReadableArray readableArray) {
        if (readableArray == null) {
            eVar.setSnapOffsets((List<Integer>) null);
            return;
        }
        DisplayMetrics c = C2926c.m11504c();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i) * ((double) c.density))));
        }
        eVar.setSnapOffsets(arrayList);
    }

    @C2991a(name = "snapToStart")
    public void setSnapToStart(C3134e eVar, boolean z) {
        eVar.setSnapToStart(z);
    }

    public Object updateState(C3134e eVar, C2962f0 f0Var, C3025n0 n0Var) {
        eVar.getFabricViewStateManager().mo9496e(n0Var);
        return null;
    }
}
