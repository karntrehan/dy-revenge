package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.C2766g;
import com.facebook.react.C2767h;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.C2693e;
import com.facebook.react.uimanager.C2987j;
import com.facebook.react.uimanager.C2993k;
import com.facebook.react.uimanager.C3046u;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.uimanager.p124n1.C3026a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p027c.p064i.p072j.C1988t;
import p174e.p247e.p253d.p258e.C6071a;

public abstract class BaseViewManager<T extends View, C extends C2987j> extends ViewManager<T, C> implements C2922b<T> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = ((float) Math.sqrt(5.0d));
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static C2993k.C2994a sMatrixDecompositionContext = new C2993k.C2994a();
    public static final Map<String, Integer> sStateDescription;
    private static double[] sTransformDecompositionArray = new double[16];

    static {
        HashMap hashMap = new HashMap();
        sStateDescription = hashMap;
        hashMap.put(STATE_BUSY, Integer.valueOf(C2767h.state_busy_description));
        hashMap.put(STATE_EXPANDED, Integer.valueOf(C2767h.state_expanded_description));
        hashMap.put("collapsed", Integer.valueOf(C2767h.state_collapsed_description));
    }

    private void logUnsupportedPropertyWarning(String str) {
        C6071a.m22861I("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(C3038r.m12006c(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setTranslationY(C3038r.m12006c(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setRotation(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotationX(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotationY(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    private static float sanitizeFloatPropertyValue(float f) {
        if (f >= -3.4028235E38f && f <= Float.MAX_VALUE) {
            return f;
        }
        if (f < -3.4028235E38f || f == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f > Float.MAX_VALUE || f == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f)) {
            return CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        throw new IllegalStateException("Invalid float property value: " + f);
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        sMatrixDecompositionContext.mo9726a();
        C3036q0.m12002b(readableArray, sTransformDecompositionArray);
        C2993k.m11859k(sTransformDecompositionArray, sMatrixDecompositionContext);
        view.setTranslationX(C3038r.m12006c(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f8326d[0])));
        view.setTranslationY(C3038r.m12006c(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f8326d[1])));
        view.setRotation(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f8327e[2]));
        view.setRotationX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f8327e[0]));
        view.setRotationY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f8327e[1]));
        view.setScaleX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f8324b[0]));
        view.setScaleY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f8324b[1]));
        double[] dArr = sMatrixDecompositionContext.f8323a;
        if (dArr.length > 2) {
            float f = (float) dArr[2];
            if (f == CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f = 7.8125E-4f;
            }
            float f2 = -1.0f / f;
            float f3 = C2926c.m11504c().density;
            view.setCameraDistance(sanitizeFloatPropertyValue(f3 * f3 * f2 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    private void updateViewAccessibility(T t) {
        C3046u.m12074o(t);
    }

    private void updateViewContentDescription(T t) {
        Dynamic dynamic;
        Context context;
        int i;
        String str = (String) t.getTag(C2766g.accessibility_label);
        ReadableMap readableMap = (ReadableMap) t.getTag(C2766g.accessibility_state);
        String str2 = (String) t.getTag(C2766g.accessibility_hint);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t.getTag(C2766g.accessibility_value);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(nextKey);
                if (nextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    context = t.getContext();
                    i = C2767h.state_mixed_description;
                } else if (nextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    context = t.getContext();
                    i = C2767h.state_busy_description;
                } else if (nextKey.equals(STATE_EXPANDED) && dynamic2.getType() == ReadableType.Boolean) {
                    context = t.getContext();
                    i = dynamic2.asBoolean() ? C2767h.state_expanded_description : C2767h.state_collapsed_description;
                }
                arrayList.add(context.getString(i));
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (arrayList.size() > 0) {
            t.setContentDescription(TextUtils.join(", ", arrayList));
        }
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return C2693e.m10911a().mo8815b("topAccessibilityAction", C2693e.m10914d("registrationName", "onAccessibilityAction")).mo8814a();
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(T t) {
        super.onAfterUpdateTransaction(t);
        updateViewAccessibility(t);
    }

    @C2991a(name = "accessibilityActions")
    public void setAccessibilityActions(T t, ReadableArray readableArray) {
        if (readableArray != null) {
            t.setTag(C2766g.accessibility_actions, readableArray);
        }
    }

    @C2991a(name = "accessibilityHint")
    public void setAccessibilityHint(T t, String str) {
        t.setTag(C2766g.accessibility_hint, str);
        updateViewContentDescription(t);
    }

    @C2991a(name = "accessibilityLabel")
    public void setAccessibilityLabel(T t, String str) {
        t.setTag(C2766g.accessibility_label, str);
        updateViewContentDescription(t);
    }

    @C2991a(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(T t, String str) {
        int i;
        if (str == null || str.equals("none")) {
            i = 0;
        } else if (str.equals("polite")) {
            i = 1;
        } else if (str.equals("assertive")) {
            i = 2;
        } else {
            return;
        }
        C1988t.m8398o0(t, i);
    }

    @C2991a(name = "accessibilityRole")
    public void setAccessibilityRole(T t, String str) {
        if (str != null) {
            t.setTag(C2766g.accessibility_role, C3046u.C3050d.m12082e(str));
        }
    }

    @C2991a(name = "accessibilityValue")
    public void setAccessibilityValue(T t, ReadableMap readableMap) {
        if (readableMap != null) {
            t.setTag(C2766g.accessibility_value, readableMap);
            if (readableMap.hasKey("text")) {
                updateViewContentDescription(t);
            }
        }
    }

    @C2991a(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(T t, int i) {
        t.setBackgroundColor(i);
    }

    public void setBorderBottomLeftRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    public void setBorderBottomRightRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    public void setBorderRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    public void setBorderTopLeftRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    public void setBorderTopRightRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @C2991a(name = "elevation")
    public void setElevation(T t, float f) {
        C1988t.m8408t0(t, C3038r.m12006c(f));
    }

    @C2991a(name = "importantForAccessibility")
    public void setImportantForAccessibility(T t, String str) {
        int i;
        if (str == null || str.equals("auto")) {
            i = 0;
        } else if (str.equals("yes")) {
            i = 1;
        } else if (str.equals("no")) {
            i = 2;
        } else if (str.equals("no-hide-descendants")) {
            i = 4;
        } else {
            return;
        }
        C1988t.m8414w0(t, i);
    }

    @C2991a(name = "nativeID")
    public void setNativeId(T t, String str) {
        t.setTag(C2766g.view_tag_native_id, str);
        C3026a.m11961b(t);
    }

    @C2991a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t, float f) {
        t.setAlpha(f);
    }

    @C2991a(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(T t, boolean z) {
        t.setLayerType(z ? 2 : 0, (Paint) null);
    }

    @C2991a(name = "rotation")
    @Deprecated
    public void setRotation(T t, float f) {
        t.setRotation(f);
    }

    @C2991a(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(T t, float f) {
        t.setScaleX(f);
    }

    @C2991a(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(T t, float f) {
        t.setScaleY(f);
    }

    @C2991a(customType = "Color", defaultInt = -16777216, name = "shadowColor")
    public void setShadowColor(T t, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            t.setOutlineAmbientShadowColor(i);
            t.setOutlineSpotShadowColor(i);
        }
    }

    @C2991a(name = "testID")
    public void setTestId(T t, String str) {
        t.setTag(C2766g.react_test_id, str);
        t.setTag(str);
    }

    @C2991a(name = "transform")
    public void setTransform(T t, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(t);
        } else {
            setTransformProperty(t, readableArray);
        }
    }

    @C2991a(defaultFloat = 0.0f, name = "translateX")
    @Deprecated
    public void setTranslateX(T t, float f) {
        t.setTranslationX(C3038r.m12006c(f));
    }

    @C2991a(defaultFloat = 0.0f, name = "translateY")
    @Deprecated
    public void setTranslateY(T t, float f) {
        t.setTranslationY(C3038r.m12006c(f));
    }

    @C2991a(name = "accessibilityState")
    public void setViewState(T t, ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey("selected")) {
                boolean isSelected = t.isSelected();
                boolean z = readableMap.getBoolean("selected");
                t.setSelected(z);
                if (t.isAccessibilityFocused() && isSelected && !z) {
                    t.announceForAccessibility(t.getContext().getString(C2767h.state_unselected_description));
                }
            } else {
                t.setSelected(false);
            }
            t.setTag(C2766g.accessibility_state, readableMap);
            t.setEnabled(true);
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (nextKey.equals(STATE_BUSY) || nextKey.equals(STATE_EXPANDED) || (nextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                    updateViewContentDescription(t);
                    return;
                } else if (t.isAccessibilityFocused()) {
                    t.sendAccessibilityEvent(1);
                }
            }
        }
    }

    @C2991a(name = "zIndex")
    public void setZIndex(T t, float f) {
        ViewGroupManager.setViewZIndex(t, Math.round(f));
        ViewParent parent = t.getParent();
        if (parent instanceof C2982h0) {
            ((C2982h0) parent).mo9686d();
        }
    }
}
