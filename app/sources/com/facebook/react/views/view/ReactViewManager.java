package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C2693e;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.C3040s;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.uimanager.p120j1.C2992b;
import com.facebook.yoga.C3307g;
import java.util.Locale;
import java.util.Map;

@C2639a(name = "RCTView")
public class ReactViewManager extends ReactClippingViewManager<C3245g> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};

    /* renamed from: com.facebook.react.views.view.ReactViewManager$a */
    class C3235a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C3245g f9120f;

        C3235a(C3245g gVar) {
            this.f9120f = gVar;
        }

        public void onClick(View view) {
            C2945d b = C3051u0.m12085b((ReactContext) this.f9120f.getContext(), this.f9120f.getId());
            if (b != null) {
                b.mo9651c(new C3248h(C3051u0.m12087d(this.f9120f.getContext()), this.f9120f.getId()));
            }
        }
    }

    private void handleHotspotUpdate(C3245g gVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        }
        gVar.drawableHotspotChanged(C3038r.m12005b(readableArray.getDouble(0)), C3038r.m12005b(readableArray.getDouble(1)));
    }

    private void handleSetPressed(C3245g gVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 1) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
        }
        gVar.setPressed(readableArray.getBoolean(0));
    }

    public C3245g createViewInstance(C3031o0 o0Var) {
        return new C3245g(o0Var);
    }

    public Map<String, Integer> getCommandsMap() {
        return C2693e.m10915e(HOTSPOT_UPDATE_KEY, 1, "setPressed", 2);
    }

    public String getName() {
        return REACT_CLASS;
    }

    @C2991a(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(C3245g gVar, int i) {
        gVar.setNextFocusDownId(i);
    }

    @C2991a(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(C3245g gVar, int i) {
        gVar.setNextFocusForwardId(i);
    }

    @C2991a(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(C3245g gVar, int i) {
        gVar.setNextFocusLeftId(i);
    }

    @C2991a(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(C3245g gVar, int i) {
        gVar.setNextFocusRightId(i);
    }

    @C2991a(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(C3245g gVar, int i) {
        gVar.setNextFocusUpId(i);
    }

    public void receiveCommand(C3245g gVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            handleHotspotUpdate(gVar, readableArray);
        } else if (i == 2) {
            handleSetPressed(gVar, readableArray);
        }
    }

    public void receiveCommand(C3245g gVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setPressed")) {
            handleSetPressed(gVar, readableArray);
        } else if (str.equals(HOTSPOT_UPDATE_KEY)) {
            handleHotspotUpdate(gVar, readableArray);
        }
    }

    @C2991a(name = "accessible")
    public void setAccessible(C3245g gVar, boolean z) {
        gVar.setFocusable(z);
    }

    @C2991a(name = "backfaceVisibility")
    public void setBackfaceVisibility(C3245g gVar, String str) {
        gVar.setBackfaceVisibility(str);
    }

    @C2992b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor"})
    public void setBorderColor(C3245g gVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        gVar.mo10683u(SPACING_TYPES[i], intValue, f);
    }

    @C2992b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius"})
    public void setBorderRadius(C3245g gVar, int i, float f) {
        if (!C3307g.m12971a(f) && f < 0.0f) {
            f = Float.NaN;
        }
        if (!C3307g.m12971a(f)) {
            f = C3038r.m12006c(f);
        }
        if (i == 0) {
            gVar.setBorderRadius(f);
        } else {
            gVar.mo10684v(f, i - 1);
        }
    }

    @C2991a(name = "borderStyle")
    public void setBorderStyle(C3245g gVar, String str) {
        gVar.setBorderStyle(str);
    }

    @C2992b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(C3245g gVar, int i, float f) {
        if (!C3307g.m12971a(f) && f < 0.0f) {
            f = Float.NaN;
        }
        if (!C3307g.m12971a(f)) {
            f = C3038r.m12006c(f);
        }
        gVar.mo10685w(SPACING_TYPES[i], f);
    }

    @C2991a(name = "collapsable")
    public void setCollapsable(C3245g gVar, boolean z) {
    }

    @C2991a(name = "focusable")
    public void setFocusable(C3245g gVar, boolean z) {
        if (z) {
            gVar.setOnClickListener(new C3235a(gVar));
            gVar.setFocusable(true);
            return;
        }
        gVar.setOnClickListener((View.OnClickListener) null);
        gVar.setClickable(false);
    }

    @C2991a(name = "hitSlop")
    public void setHitSlop(C3245g gVar, ReadableMap readableMap) {
        if (readableMap == null) {
            gVar.setHitSlopRect((Rect) null);
            return;
        }
        int i = 0;
        int b = readableMap.hasKey("left") ? (int) C3038r.m12005b(readableMap.getDouble("left")) : 0;
        int b2 = readableMap.hasKey("top") ? (int) C3038r.m12005b(readableMap.getDouble("top")) : 0;
        int b3 = readableMap.hasKey("right") ? (int) C3038r.m12005b(readableMap.getDouble("right")) : 0;
        if (readableMap.hasKey("bottom")) {
            i = (int) C3038r.m12005b(readableMap.getDouble("bottom"));
        }
        gVar.setHitSlopRect(new Rect(b, b2, b3, i));
    }

    @C2991a(name = "nativeBackgroundAndroid")
    public void setNativeBackground(C3245g gVar, ReadableMap readableMap) {
        gVar.setTranslucentBackgroundDrawable(readableMap == null ? null : C3239d.m12663a(gVar.getContext(), readableMap));
    }

    @C2991a(name = "nativeForegroundAndroid")
    @TargetApi(23)
    public void setNativeForeground(C3245g gVar, ReadableMap readableMap) {
        gVar.setForeground(readableMap == null ? null : C3239d.m12663a(gVar.getContext(), readableMap));
    }

    @C2991a(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(C3245g gVar, boolean z) {
        gVar.setNeedsOffscreenAlphaCompositing(z);
    }

    public void setOpacity(C3245g gVar, float f) {
        gVar.setOpacityIfPossible(f);
    }

    @C2991a(name = "overflow")
    public void setOverflow(C3245g gVar, String str) {
        gVar.setOverflow(str);
    }

    @C2991a(name = "pointerEvents")
    public void setPointerEvents(C3245g gVar, String str) {
        gVar.setPointerEvents(str == null ? C3040s.AUTO : C3040s.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
    }

    @C2991a(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(C3245g gVar, boolean z) {
        if (z) {
            gVar.setFocusable(true);
            gVar.setFocusableInTouchMode(true);
            gVar.requestFocus();
        }
    }

    public void setTransform(C3245g gVar, ReadableArray readableArray) {
        super.setTransform(gVar, readableArray);
        gVar.mo10682t();
    }
}
