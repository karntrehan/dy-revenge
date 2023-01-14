package com.p106BV.LinearGradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.p120j1.C2991a;

/* renamed from: com.BV.LinearGradient.LinearGradientManager */
public class LinearGradientManager extends SimpleViewManager<C2263b> {
    public static final String PROP_ANGLE = "angle";
    public static final String PROP_ANGLE_CENTER = "angleCenter";
    public static final String PROP_BORDER_RADII = "borderRadii";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_END_POS = "endPoint";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POS = "startPoint";
    public static final String PROP_USE_ANGLE = "useAngle";
    public static final String REACT_CLASS = "BVLinearGradient";

    /* access modifiers changed from: protected */
    public C2263b createViewInstance(C3031o0 o0Var) {
        return new C2263b(o0Var);
    }

    public String getName() {
        return REACT_CLASS;
    }

    @C2991a(defaultFloat = 45.0f, name = "angle")
    public void setAngle(C2263b bVar, float f) {
        bVar.setAngle(f);
    }

    @C2991a(name = "angleCenter")
    public void setAngleCenter(C2263b bVar, ReadableArray readableArray) {
        bVar.setAngleCenter(readableArray);
    }

    @C2991a(name = "borderRadii")
    public void setBorderRadii(C2263b bVar, ReadableArray readableArray) {
        bVar.setBorderRadii(readableArray);
    }

    @C2991a(name = "colors")
    public void setColors(C2263b bVar, ReadableArray readableArray) {
        bVar.setColors(readableArray);
    }

    @C2991a(name = "endPoint")
    public void setEndPosition(C2263b bVar, ReadableArray readableArray) {
        bVar.setEndPosition(readableArray);
    }

    @C2991a(name = "locations")
    public void setLocations(C2263b bVar, ReadableArray readableArray) {
        if (readableArray != null) {
            bVar.setLocations(readableArray);
        }
    }

    @C2991a(name = "startPoint")
    public void setStartPosition(C2263b bVar, ReadableArray readableArray) {
        bVar.setStartPosition(readableArray);
    }

    @C2991a(defaultBoolean = false, name = "useAngle")
    public void setUseAngle(C2263b bVar, boolean z) {
        bVar.setUseAngle(z);
    }
}
