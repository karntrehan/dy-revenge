package com.horcrux.svg;

import android.graphics.Matrix;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C2926c;
import com.facebook.react.uimanager.C2931d0;
import com.facebook.react.uimanager.C2987j;
import com.facebook.react.uimanager.C2993k;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.C3036q0;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.C3040s;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.uimanager.p120j1.C2992b;
import java.lang.reflect.Array;
import java.util.Locale;

class RenderableViewManager extends ViewGroupManager<C5070x0> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final double EPSILON = 1.0E-5d;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final SparseArray<C5017b0> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();
    private static final C5005c sMatrixDecompositionContext = new C5005c();
    private static final double[] sTransformDecompositionArray = new double[16];
    private final String mClassName;
    private final C5007e svgClass;

    static class CircleViewManager extends RenderableViewManager {
        CircleViewManager() {
            super(C5007e.RNSVGCircle, (C5003a) null);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void addEventEmitters(C3031o0 o0Var, View view) {
            RenderableViewManager.super.addEventEmitters(o0Var, (C5070x0) view);
        }

        public /* bridge */ /* synthetic */ C2931d0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ View createViewInstance(C3031o0 o0Var) {
            return RenderableViewManager.super.createViewInstance(o0Var);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((C5070x0) view);
        }

        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((C5070x0) view);
        }

        @C2991a(name = "cx")
        public void setCx(C5016b bVar, Dynamic dynamic) {
            bVar.setCx(dynamic);
        }

        @C2991a(name = "cy")
        public void setCy(C5016b bVar, Dynamic dynamic) {
            bVar.setCy(dynamic);
        }

        @C2991a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((C5070x0) view, f);
        }

        @C2991a(name = "r")
        public void setR(C5016b bVar, Dynamic dynamic) {
            bVar.setR(dynamic);
        }
    }

    static class ClipPathViewManager extends GroupViewManager {
        ClipPathViewManager() {
            super(C5007e.RNSVGClipPath);
        }
    }

    static class DefsViewManager extends RenderableViewManager {
        DefsViewManager() {
            super(C5007e.RNSVGDefs, (C5003a) null);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void addEventEmitters(C3031o0 o0Var, View view) {
            RenderableViewManager.super.addEventEmitters(o0Var, (C5070x0) view);
        }

        public /* bridge */ /* synthetic */ C2931d0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ View createViewInstance(C3031o0 o0Var) {
            return RenderableViewManager.super.createViewInstance(o0Var);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((C5070x0) view);
        }

        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((C5070x0) view);
        }

        @C2991a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((C5070x0) view, f);
        }
    }

    static class EllipseViewManager extends RenderableViewManager {
        EllipseViewManager() {
            super(C5007e.RNSVGEllipse, (C5003a) null);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void addEventEmitters(C3031o0 o0Var, View view) {
            RenderableViewManager.super.addEventEmitters(o0Var, (C5070x0) view);
        }

        public /* bridge */ /* synthetic */ C2931d0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ View createViewInstance(C3031o0 o0Var) {
            return RenderableViewManager.super.createViewInstance(o0Var);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((C5070x0) view);
        }

        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((C5070x0) view);
        }

        @C2991a(name = "cx")
        public void setCx(C5030g gVar, Dynamic dynamic) {
            gVar.setCx(dynamic);
        }

        @C2991a(name = "cy")
        public void setCy(C5030g gVar, Dynamic dynamic) {
            gVar.setCy(dynamic);
        }

        @C2991a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((C5070x0) view, f);
        }

        @C2991a(name = "rx")
        public void setRx(C5030g gVar, Dynamic dynamic) {
            gVar.setRx(dynamic);
        }

        @C2991a(name = "ry")
        public void setRy(C5030g gVar, Dynamic dynamic) {
            gVar.setRy(dynamic);
        }
    }

    static class ForeignObjectManager extends GroupViewManager {
        ForeignObjectManager() {
            super(C5007e.RNSVGForeignObject);
        }

        @C2991a(name = "height")
        public void setHeight(C5036i iVar, Dynamic dynamic) {
            iVar.setHeight(dynamic);
        }

        @C2991a(name = "width")
        public void setWidth(C5036i iVar, Dynamic dynamic) {
            iVar.setWidth(dynamic);
        }

        @C2991a(name = "x")
        public void setX(C5036i iVar, Dynamic dynamic) {
            iVar.setX(dynamic);
        }

        @C2991a(name = "y")
        public void setY(C5036i iVar, Dynamic dynamic) {
            iVar.setY(dynamic);
        }
    }

    static class GroupViewManager extends RenderableViewManager {
        GroupViewManager() {
            super(C5007e.RNSVGGroup, (C5003a) null);
        }

        GroupViewManager(C5007e eVar) {
            super(eVar, (C5003a) null);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void addEventEmitters(C3031o0 o0Var, View view) {
            RenderableViewManager.super.addEventEmitters(o0Var, (C5070x0) view);
        }

        public /* bridge */ /* synthetic */ C2931d0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ View createViewInstance(C3031o0 o0Var) {
            return RenderableViewManager.super.createViewInstance(o0Var);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((C5070x0) view);
        }

        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((C5070x0) view);
        }

        @C2991a(name = "font")
        public void setFont(C5042l lVar, ReadableMap readableMap) {
            lVar.setFont(readableMap);
        }

        @C2991a(name = "fontSize")
        public void setFontSize(C5042l lVar, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i = C5004b.f13936a[dynamic.getType().ordinal()];
            if (i == 1) {
                javaOnlyMap.putDouble("fontSize", dynamic.asDouble());
            } else if (i == 2) {
                javaOnlyMap.putString("fontSize", dynamic.asString());
            } else {
                return;
            }
            lVar.setFont(javaOnlyMap);
        }

        @C2991a(name = "fontWeight")
        public void setFontWeight(C5042l lVar, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i = C5004b.f13936a[dynamic.getType().ordinal()];
            if (i == 1) {
                javaOnlyMap.putDouble("fontWeight", dynamic.asDouble());
            } else if (i == 2) {
                javaOnlyMap.putString("fontWeight", dynamic.asString());
            } else {
                return;
            }
            lVar.setFont(javaOnlyMap);
        }

        @C2991a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((C5070x0) view, f);
        }
    }

    static class ImageViewManager extends RenderableViewManager {
        ImageViewManager() {
            super(C5007e.RNSVGImage, (C5003a) null);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void addEventEmitters(C3031o0 o0Var, View view) {
            RenderableViewManager.super.addEventEmitters(o0Var, (C5070x0) view);
        }

        public /* bridge */ /* synthetic */ C2931d0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ View createViewInstance(C3031o0 o0Var) {
            return RenderableViewManager.super.createViewInstance(o0Var);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((C5070x0) view);
        }

        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((C5070x0) view);
        }

        @C2991a(name = "align")
        public void setAlign(C5044m mVar, String str) {
            mVar.setAlign(str);
        }

        @C2991a(name = "height")
        public void setHeight(C5044m mVar, Dynamic dynamic) {
            mVar.setHeight(dynamic);
        }

        @C2991a(name = "meetOrSlice")
        public void setMeetOrSlice(C5044m mVar, int i) {
            mVar.setMeetOrSlice(i);
        }

        @C2991a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((C5070x0) view, f);
        }

        @C2991a(name = "src")
        public void setSrc(C5044m mVar, ReadableMap readableMap) {
            mVar.setSrc(readableMap);
        }

        @C2991a(name = "width")
        public void setWidth(C5044m mVar, Dynamic dynamic) {
            mVar.setWidth(dynamic);
        }

        @C2991a(name = "x")
        public void setX(C5044m mVar, Dynamic dynamic) {
            mVar.setX(dynamic);
        }

        @C2991a(name = "y")
        public void setY(C5044m mVar, Dynamic dynamic) {
            mVar.setY(dynamic);
        }
    }

    static class LineViewManager extends RenderableViewManager {
        LineViewManager() {
            super(C5007e.RNSVGLine, (C5003a) null);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void addEventEmitters(C3031o0 o0Var, View view) {
            RenderableViewManager.super.addEventEmitters(o0Var, (C5070x0) view);
        }

        public /* bridge */ /* synthetic */ C2931d0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ View createViewInstance(C3031o0 o0Var) {
            return RenderableViewManager.super.createViewInstance(o0Var);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((C5070x0) view);
        }

        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((C5070x0) view);
        }

        @C2991a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((C5070x0) view, f);
        }

        @C2991a(name = "x1")
        public void setX1(C5047n nVar, Dynamic dynamic) {
            nVar.setX1(dynamic);
        }

        @C2991a(name = "x2")
        public void setX2(C5047n nVar, Dynamic dynamic) {
            nVar.setX2(dynamic);
        }

        @C2991a(name = "y1")
        public void setY1(C5047n nVar, Dynamic dynamic) {
            nVar.setY1(dynamic);
        }

        @C2991a(name = "y2")
        public void setY2(C5047n nVar, Dynamic dynamic) {
            nVar.setY2(dynamic);
        }
    }

    static class LinearGradientManager extends RenderableViewManager {
        LinearGradientManager() {
            super(C5007e.RNSVGLinearGradient, (C5003a) null);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void addEventEmitters(C3031o0 o0Var, View view) {
            RenderableViewManager.super.addEventEmitters(o0Var, (C5070x0) view);
        }

        public /* bridge */ /* synthetic */ C2931d0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ View createViewInstance(C3031o0 o0Var) {
            return RenderableViewManager.super.createViewInstance(o0Var);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((C5070x0) view);
        }

        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((C5070x0) view);
        }

        @C2991a(name = "gradient")
        public void setGradient(C5049o oVar, ReadableArray readableArray) {
            oVar.setGradient(readableArray);
        }

        @C2991a(name = "gradientTransform")
        public void setGradientTransform(C5049o oVar, ReadableArray readableArray) {
            oVar.setGradientTransform(readableArray);
        }

        @C2991a(name = "gradientUnits")
        public void setGradientUnits(C5049o oVar, int i) {
            oVar.setGradientUnits(i);
        }

        @C2991a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((C5070x0) view, f);
        }

        @C2991a(name = "x1")
        public void setX1(C5049o oVar, Dynamic dynamic) {
            oVar.setX1(dynamic);
        }

        @C2991a(name = "x2")
        public void setX2(C5049o oVar, Dynamic dynamic) {
            oVar.setX2(dynamic);
        }

        @C2991a(name = "y1")
        public void setY1(C5049o oVar, Dynamic dynamic) {
            oVar.setY1(dynamic);
        }

        @C2991a(name = "y2")
        public void setY2(C5049o oVar, Dynamic dynamic) {
            oVar.setY2(dynamic);
        }
    }

    static class MarkerManager extends GroupViewManager {
        MarkerManager() {
            super(C5007e.RNSVGMarker);
        }

        @C2991a(name = "align")
        public void setAlign(C5051p pVar, String str) {
            pVar.setAlign(str);
        }

        @C2991a(name = "markerHeight")
        public void setMarkerHeight(C5051p pVar, Dynamic dynamic) {
            pVar.setMarkerHeight(dynamic);
        }

        @C2991a(name = "markerUnits")
        public void setMarkerUnits(C5051p pVar, String str) {
            pVar.setMarkerUnits(str);
        }

        @C2991a(name = "markerWidth")
        public void setMarkerWidth(C5051p pVar, Dynamic dynamic) {
            pVar.setMarkerWidth(dynamic);
        }

        @C2991a(name = "meetOrSlice")
        public void setMeetOrSlice(C5051p pVar, int i) {
            pVar.setMeetOrSlice(i);
        }

        @C2991a(name = "minX")
        public void setMinX(C5051p pVar, float f) {
            pVar.setMinX(f);
        }

        @C2991a(name = "minY")
        public void setMinY(C5051p pVar, float f) {
            pVar.setMinY(f);
        }

        @C2991a(name = "orient")
        public void setOrient(C5051p pVar, String str) {
            pVar.setOrient(str);
        }

        @C2991a(name = "refX")
        public void setRefX(C5051p pVar, Dynamic dynamic) {
            pVar.setRefX(dynamic);
        }

        @C2991a(name = "refY")
        public void setRefY(C5051p pVar, Dynamic dynamic) {
            pVar.setRefY(dynamic);
        }

        @C2991a(name = "vbHeight")
        public void setVbHeight(C5051p pVar, float f) {
            pVar.setVbHeight(f);
        }

        @C2991a(name = "vbWidth")
        public void setVbWidth(C5051p pVar, float f) {
            pVar.setVbWidth(f);
        }
    }

    static class MaskManager extends GroupViewManager {
        MaskManager() {
            super(C5007e.RNSVGMask);
        }

        @C2991a(name = "height")
        public void setHeight(C5053q qVar, Dynamic dynamic) {
            qVar.setHeight(dynamic);
        }

        @C2991a(name = "maskContentUnits")
        public void setMaskContentUnits(C5053q qVar, int i) {
            qVar.setMaskContentUnits(i);
        }

        @C2991a(name = "maskTransform")
        public void setMaskTransform(C5053q qVar, ReadableArray readableArray) {
            qVar.setMaskTransform(readableArray);
        }

        @C2991a(name = "maskUnits")
        public void setMaskUnits(C5053q qVar, int i) {
            qVar.setMaskUnits(i);
        }

        @C2991a(name = "width")
        public void setWidth(C5053q qVar, Dynamic dynamic) {
            qVar.setWidth(dynamic);
        }

        @C2991a(name = "x")
        public void setX(C5053q qVar, Dynamic dynamic) {
            qVar.setX(dynamic);
        }

        @C2991a(name = "y")
        public void setY(C5053q qVar, Dynamic dynamic) {
            qVar.setY(dynamic);
        }
    }

    static class PathViewManager extends RenderableViewManager {
        PathViewManager() {
            super(C5007e.RNSVGPath, (C5003a) null);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void addEventEmitters(C3031o0 o0Var, View view) {
            RenderableViewManager.super.addEventEmitters(o0Var, (C5070x0) view);
        }

        public /* bridge */ /* synthetic */ C2931d0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ View createViewInstance(C3031o0 o0Var) {
            return RenderableViewManager.super.createViewInstance(o0Var);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((C5070x0) view);
        }

        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((C5070x0) view);
        }

        @C2991a(name = "d")
        public void setD(C5059t tVar, String str) {
            tVar.setD(str);
        }

        @C2991a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((C5070x0) view, f);
        }
    }

    static class PatternManager extends GroupViewManager {
        PatternManager() {
            super(C5007e.RNSVGPattern);
        }

        @C2991a(name = "align")
        public void setAlign(C5061u uVar, String str) {
            uVar.setAlign(str);
        }

        @C2991a(name = "height")
        public void setHeight(C5061u uVar, Dynamic dynamic) {
            uVar.setHeight(dynamic);
        }

        @C2991a(name = "meetOrSlice")
        public void setMeetOrSlice(C5061u uVar, int i) {
            uVar.setMeetOrSlice(i);
        }

        @C2991a(name = "minX")
        public void setMinX(C5061u uVar, float f) {
            uVar.setMinX(f);
        }

        @C2991a(name = "minY")
        public void setMinY(C5061u uVar, float f) {
            uVar.setMinY(f);
        }

        @C2991a(name = "patternContentUnits")
        public void setPatternContentUnits(C5061u uVar, int i) {
            uVar.setPatternContentUnits(i);
        }

        @C2991a(name = "patternTransform")
        public void setPatternTransform(C5061u uVar, ReadableArray readableArray) {
            uVar.setPatternTransform(readableArray);
        }

        @C2991a(name = "patternUnits")
        public void setPatternUnits(C5061u uVar, int i) {
            uVar.setPatternUnits(i);
        }

        @C2991a(name = "vbHeight")
        public void setVbHeight(C5061u uVar, float f) {
            uVar.setVbHeight(f);
        }

        @C2991a(name = "vbWidth")
        public void setVbWidth(C5061u uVar, float f) {
            uVar.setVbWidth(f);
        }

        @C2991a(name = "width")
        public void setWidth(C5061u uVar, Dynamic dynamic) {
            uVar.setWidth(dynamic);
        }

        @C2991a(name = "x")
        public void setX(C5061u uVar, Dynamic dynamic) {
            uVar.setX(dynamic);
        }

        @C2991a(name = "y")
        public void setY(C5061u uVar, Dynamic dynamic) {
            uVar.setY(dynamic);
        }
    }

    static class RadialGradientManager extends RenderableViewManager {
        RadialGradientManager() {
            super(C5007e.RNSVGRadialGradient, (C5003a) null);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void addEventEmitters(C3031o0 o0Var, View view) {
            RenderableViewManager.super.addEventEmitters(o0Var, (C5070x0) view);
        }

        public /* bridge */ /* synthetic */ C2931d0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ View createViewInstance(C3031o0 o0Var) {
            return RenderableViewManager.super.createViewInstance(o0Var);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((C5070x0) view);
        }

        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((C5070x0) view);
        }

        @C2991a(name = "cx")
        public void setCx(C5073z zVar, Dynamic dynamic) {
            zVar.setCx(dynamic);
        }

        @C2991a(name = "cy")
        public void setCy(C5073z zVar, Dynamic dynamic) {
            zVar.setCy(dynamic);
        }

        @C2991a(name = "fx")
        public void setFx(C5073z zVar, Dynamic dynamic) {
            zVar.setFx(dynamic);
        }

        @C2991a(name = "fy")
        public void setFy(C5073z zVar, Dynamic dynamic) {
            zVar.setFy(dynamic);
        }

        @C2991a(name = "gradient")
        public void setGradient(C5073z zVar, ReadableArray readableArray) {
            zVar.setGradient(readableArray);
        }

        @C2991a(name = "gradientTransform")
        public void setGradientTransform(C5073z zVar, ReadableArray readableArray) {
            zVar.setGradientTransform(readableArray);
        }

        @C2991a(name = "gradientUnits")
        public void setGradientUnits(C5073z zVar, int i) {
            zVar.setGradientUnits(i);
        }

        @C2991a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((C5070x0) view, f);
        }

        @C2991a(name = "rx")
        public void setRx(C5073z zVar, Dynamic dynamic) {
            zVar.setRx(dynamic);
        }

        @C2991a(name = "ry")
        public void setRy(C5073z zVar, Dynamic dynamic) {
            zVar.setRy(dynamic);
        }
    }

    static class RectViewManager extends RenderableViewManager {
        RectViewManager() {
            super(C5007e.RNSVGRect, (C5003a) null);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void addEventEmitters(C3031o0 o0Var, View view) {
            RenderableViewManager.super.addEventEmitters(o0Var, (C5070x0) view);
        }

        public /* bridge */ /* synthetic */ C2931d0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ View createViewInstance(C3031o0 o0Var) {
            return RenderableViewManager.super.createViewInstance(o0Var);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((C5070x0) view);
        }

        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((C5070x0) view);
        }

        @C2991a(name = "height")
        public void setHeight(C5015a0 a0Var, Dynamic dynamic) {
            a0Var.setHeight(dynamic);
        }

        @C2991a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((C5070x0) view, f);
        }

        @C2991a(name = "rx")
        public void setRx(C5015a0 a0Var, Dynamic dynamic) {
            a0Var.setRx(dynamic);
        }

        @C2991a(name = "ry")
        public void setRy(C5015a0 a0Var, Dynamic dynamic) {
            a0Var.setRy(dynamic);
        }

        @C2991a(name = "width")
        public void setWidth(C5015a0 a0Var, Dynamic dynamic) {
            a0Var.setWidth(dynamic);
        }

        @C2991a(name = "x")
        public void setX(C5015a0 a0Var, Dynamic dynamic) {
            a0Var.setX(dynamic);
        }

        @C2991a(name = "y")
        public void setY(C5015a0 a0Var, Dynamic dynamic) {
            a0Var.setY(dynamic);
        }
    }

    static class SymbolManager extends GroupViewManager {
        SymbolManager() {
            super(C5007e.RNSVGSymbol);
        }

        @C2991a(name = "align")
        public void setAlign(C5031g0 g0Var, String str) {
            g0Var.setAlign(str);
        }

        @C2991a(name = "meetOrSlice")
        public void setMeetOrSlice(C5031g0 g0Var, int i) {
            g0Var.setMeetOrSlice(i);
        }

        @C2991a(name = "minX")
        public void setMinX(C5031g0 g0Var, float f) {
            g0Var.setMinX(f);
        }

        @C2991a(name = "minY")
        public void setMinY(C5031g0 g0Var, float f) {
            g0Var.setMinY(f);
        }

        @C2991a(name = "vbHeight")
        public void setVbHeight(C5031g0 g0Var, float f) {
            g0Var.setVbHeight(f);
        }

        @C2991a(name = "vbWidth")
        public void setVbWidth(C5031g0 g0Var, float f) {
            g0Var.setVbWidth(f);
        }
    }

    static class TSpanViewManager extends TextViewManager {
        TSpanViewManager() {
            super(C5007e.RNSVGTSpan);
        }

        @C2991a(name = "content")
        public void setContent(C5034h0 h0Var, String str) {
            h0Var.setContent(str);
        }
    }

    static class TextPathViewManager extends TextViewManager {
        TextPathViewManager() {
            super(C5007e.RNSVGTextPath);
        }

        @C2991a(name = "href")
        public void setHref(C5037i0 i0Var, String str) {
            i0Var.setHref(str);
        }

        @C2991a(name = "method")
        public void setMethod(C5037i0 i0Var, String str) {
            i0Var.setMethod(str);
        }

        @C2991a(name = "midLine")
        public void setSharp(C5037i0 i0Var, String str) {
            i0Var.setSharp(str);
        }

        @C2991a(name = "side")
        public void setSide(C5037i0 i0Var, String str) {
            i0Var.setSide(str);
        }

        @C2991a(name = "spacing")
        public void setSpacing(C5037i0 i0Var, String str) {
            i0Var.setSpacing(str);
        }

        @C2991a(name = "startOffset")
        public void setStartOffset(C5037i0 i0Var, Dynamic dynamic) {
            i0Var.setStartOffset(dynamic);
        }
    }

    static class TextViewManager extends GroupViewManager {
        TextViewManager() {
            super(C5007e.RNSVGText);
        }

        TextViewManager(C5007e eVar) {
            super(eVar);
        }

        @C2991a(name = "baselineShift")
        public void setBaselineShift(C5062u0 u0Var, Dynamic dynamic) {
            u0Var.setBaselineShift(dynamic);
        }

        @C2991a(name = "dx")
        public void setDeltaX(C5062u0 u0Var, Dynamic dynamic) {
            u0Var.setDeltaX(dynamic);
        }

        @C2991a(name = "dy")
        public void setDeltaY(C5062u0 u0Var, Dynamic dynamic) {
            u0Var.setDeltaY(dynamic);
        }

        @C2991a(name = "font")
        public void setFont(C5062u0 u0Var, ReadableMap readableMap) {
            u0Var.setFont(readableMap);
        }

        @C2991a(name = "inlineSize")
        public void setInlineSize(C5062u0 u0Var, Dynamic dynamic) {
            u0Var.setInlineSize(dynamic);
        }

        @C2991a(name = "lengthAdjust")
        public void setLengthAdjust(C5062u0 u0Var, String str) {
            u0Var.setLengthAdjust(str);
        }

        @C2991a(name = "alignmentBaseline")
        public void setMethod(C5062u0 u0Var, String str) {
            u0Var.setMethod(str);
        }

        @C2991a(name = "rotate")
        public void setRotate(C5062u0 u0Var, Dynamic dynamic) {
            u0Var.setRotate(dynamic);
        }

        @C2991a(name = "textLength")
        public void setTextLength(C5062u0 u0Var, Dynamic dynamic) {
            u0Var.setTextLength(dynamic);
        }

        @C2991a(name = "verticalAlign")
        public void setVerticalAlign(C5062u0 u0Var, String str) {
            u0Var.setVerticalAlign(str);
        }

        @C2991a(name = "x")
        public void setX(C5062u0 u0Var, Dynamic dynamic) {
            u0Var.setPositionX(dynamic);
        }

        @C2991a(name = "y")
        public void setY(C5062u0 u0Var, Dynamic dynamic) {
            u0Var.setPositionY(dynamic);
        }
    }

    static class UseViewManager extends RenderableViewManager {
        UseViewManager() {
            super(C5007e.RNSVGUse, (C5003a) null);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void addEventEmitters(C3031o0 o0Var, View view) {
            RenderableViewManager.super.addEventEmitters(o0Var, (C5070x0) view);
        }

        public /* bridge */ /* synthetic */ C2931d0 createShadowNodeInstance() {
            return RenderableViewManager.super.createShadowNodeInstance();
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ View createViewInstance(C3031o0 o0Var) {
            return RenderableViewManager.super.createViewInstance(o0Var);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            RenderableViewManager.super.onAfterUpdateTransaction((C5070x0) view);
        }

        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            RenderableViewManager.super.onDropViewInstance((C5070x0) view);
        }

        @C2991a(name = "height")
        public void setHeight(C5064v0 v0Var, Dynamic dynamic) {
            v0Var.setHeight(dynamic);
        }

        @C2991a(name = "href")
        public void setHref(C5064v0 v0Var, String str) {
            v0Var.setHref(str);
        }

        @C2991a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            RenderableViewManager.super.setOpacity((C5070x0) view, f);
        }

        @C2991a(name = "width")
        public void setWidth(C5064v0 v0Var, Dynamic dynamic) {
            v0Var.setWidth(dynamic);
        }

        @C2991a(name = "x")
        public void setX(C5064v0 v0Var, Dynamic dynamic) {
            v0Var.setX(dynamic);
        }

        @C2991a(name = "y")
        public void setY(C5064v0 v0Var, Dynamic dynamic) {
            v0Var.setY(dynamic);
        }
    }

    /* renamed from: com.horcrux.svg.RenderableViewManager$a */
    class C5003a implements ViewGroup.OnHierarchyChangeListener {
        C5003a() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view instanceof C5070x0) {
                RenderableViewManager.this.invalidateSvgView((C5070x0) view);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view instanceof C5070x0) {
                RenderableViewManager.this.invalidateSvgView((C5070x0) view);
            }
        }
    }

    /* renamed from: com.horcrux.svg.RenderableViewManager$b */
    static /* synthetic */ class C5004b {

        /* renamed from: a */
        static final /* synthetic */ int[] f13936a;

        /* renamed from: b */
        static final /* synthetic */ int[] f13937b;

        /* JADX WARNING: Can't wrap try/catch for region: R(47:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|45|46|47|48|50) */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                com.horcrux.svg.RenderableViewManager$e[] r0 = com.horcrux.svg.RenderableViewManager.C5007e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13937b = r0
                r1 = 1
                com.horcrux.svg.RenderableViewManager$e r2 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGGroup     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGPath     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGCircle     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGEllipse     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGLine     // Catch:{ NoSuchFieldError -> 0x003e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGRect     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGText     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r4 = 7
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGTSpan     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r4 = 8
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGTextPath     // Catch:{ NoSuchFieldError -> 0x006c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r4 = 9
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGImage     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r4 = 10
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGClipPath     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r4 = 11
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGDefs     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r4 = 12
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGUse     // Catch:{ NoSuchFieldError -> 0x009c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r4 = 13
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGSymbol     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r4 = 14
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGLinearGradient     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r4 = 15
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGRadialGradient     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r4 = 16
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGPattern     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r4 = 17
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGMask     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r4 = 18
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGMarker     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r4 = 19
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r2 = f13937b     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.horcrux.svg.RenderableViewManager$e r3 = com.horcrux.svg.RenderableViewManager.C5007e.RNSVGForeignObject     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r4 = 20
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                com.facebook.react.bridge.ReadableType[] r2 = com.facebook.react.bridge.ReadableType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f13936a = r2
                com.facebook.react.bridge.ReadableType r3 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                int[] r1 = f13936a     // Catch:{ NoSuchFieldError -> 0x010b }
                com.facebook.react.bridge.ReadableType r2 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x010b }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x010b }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x010b }
            L_0x010b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.RenderableViewManager.C5004b.<clinit>():void");
        }
    }

    /* renamed from: com.horcrux.svg.RenderableViewManager$c */
    static class C5005c extends C2993k.C2994a {

        /* renamed from: f */
        final double[] f13938f = new double[4];

        /* renamed from: g */
        final double[] f13939g = new double[3];

        /* renamed from: h */
        final double[] f13940h = new double[3];

        /* renamed from: i */
        final double[] f13941i = new double[3];

        /* renamed from: j */
        final double[] f13942j = new double[3];

        C5005c() {
        }
    }

    /* renamed from: com.horcrux.svg.RenderableViewManager$d */
    class C5006d extends C2987j {
        C5006d() {
        }

        @C2992b(names = {"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "overflow", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
        public void ignoreLayoutProps(int i, Dynamic dynamic) {
        }
    }

    /* renamed from: com.horcrux.svg.RenderableViewManager$e */
    private enum C5007e {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGMarker,
        RNSVGForeignObject
    }

    private RenderableViewManager(C5007e eVar) {
        this.svgClass = eVar;
        this.mClassName = eVar.toString();
    }

    /* synthetic */ RenderableViewManager(C5007e eVar, C5003a aVar) {
        this(eVar);
    }

    private static void decomposeMatrix() {
        Class<double> cls = double.class;
        C5005c cVar = sMatrixDecompositionContext;
        double[] dArr = cVar.f13938f;
        double[] dArr2 = cVar.f13939g;
        double[] dArr3 = cVar.f13940h;
        double[] dArr4 = cVar.f13941i;
        double[] dArr5 = cVar.f13942j;
        if (!isZero(sTransformDecompositionArray[15])) {
            double[][] dArr6 = (double[][]) Array.newInstance(cls, new int[]{4, 4});
            double[] dArr7 = new double[16];
            for (int i = 0; i < 4; i++) {
                for (int i2 = 0; i2 < 4; i2++) {
                    double[] dArr8 = sTransformDecompositionArray;
                    int i3 = (i * 4) + i2;
                    double d = dArr8[i3] / dArr8[15];
                    dArr6[i][i2] = d;
                    if (i2 == 3) {
                        d = 0.0d;
                    }
                    dArr7[i3] = d;
                }
            }
            dArr7[15] = 1.0d;
            if (!isZero(C2993k.m11861m(dArr7))) {
                if (!isZero(dArr6[0][3]) || !isZero(dArr6[1][3]) || !isZero(dArr6[2][3])) {
                    C2993k.m11865q(new double[]{dArr6[0][3], dArr6[1][3], dArr6[2][3], dArr6[3][3]}, C2993k.m11868t(C2993k.m11862n(dArr7)), dArr);
                } else {
                    dArr[2] = 0.0d;
                    dArr[1] = 0.0d;
                    dArr[0] = 0.0d;
                    dArr[3] = 1.0d;
                }
                System.arraycopy(dArr6[3], 0, dArr4, 0, 3);
                double[][] dArr9 = (double[][]) Array.newInstance(cls, new int[]{3, 3});
                for (int i4 = 0; i4 < 3; i4++) {
                    dArr9[i4][0] = dArr6[i4][0];
                    dArr9[i4][1] = dArr6[i4][1];
                    dArr9[i4][2] = dArr6[i4][2];
                }
                dArr2[0] = C2993k.m11872x(dArr9[0]);
                dArr9[0] = C2993k.m11873y(dArr9[0], dArr2[0]);
                dArr3[0] = C2993k.m11871w(dArr9[0], dArr9[1]);
                dArr9[1] = C2993k.m11869u(dArr9[1], dArr9[0], 1.0d, -dArr3[0]);
                dArr3[0] = C2993k.m11871w(dArr9[0], dArr9[1]);
                dArr9[1] = C2993k.m11869u(dArr9[1], dArr9[0], 1.0d, -dArr3[0]);
                dArr2[1] = C2993k.m11872x(dArr9[1]);
                dArr9[1] = C2993k.m11873y(dArr9[1], dArr2[1]);
                dArr3[0] = dArr3[0] / dArr2[1];
                dArr3[1] = C2993k.m11871w(dArr9[0], dArr9[2]);
                dArr9[2] = C2993k.m11869u(dArr9[2], dArr9[0], 1.0d, -dArr3[1]);
                dArr3[2] = C2993k.m11871w(dArr9[1], dArr9[2]);
                dArr9[2] = C2993k.m11869u(dArr9[2], dArr9[1], 1.0d, -dArr3[2]);
                dArr2[2] = C2993k.m11872x(dArr9[2]);
                dArr9[2] = C2993k.m11873y(dArr9[2], dArr2[2]);
                dArr3[1] = dArr3[1] / dArr2[2];
                dArr3[2] = dArr3[2] / dArr2[2];
                if (C2993k.m11871w(dArr9[0], C2993k.m11870v(dArr9[1], dArr9[2])) < 0.0d) {
                    for (int i5 = 0; i5 < 3; i5++) {
                        dArr2[i5] = dArr2[i5] * -1.0d;
                        double[] dArr10 = dArr9[i5];
                        dArr10[0] = dArr10[0] * -1.0d;
                        double[] dArr11 = dArr9[i5];
                        dArr11[1] = dArr11[1] * -1.0d;
                        double[] dArr12 = dArr9[i5];
                        dArr12[2] = dArr12[2] * -1.0d;
                    }
                }
                dArr5[0] = C2993k.m11867s((-Math.atan2(dArr9[2][1], dArr9[2][2])) * 57.29577951308232d);
                dArr5[1] = C2993k.m11867s((-Math.atan2(-dArr9[2][0], Math.sqrt((dArr9[2][1] * dArr9[2][1]) + (dArr9[2][2] * dArr9[2][2])))) * 57.29577951308232d);
                dArr5[2] = C2993k.m11867s((-Math.atan2(dArr9[1][0], dArr9[0][0])) * 57.29577951308232d);
            }
        }
    }

    static C5017b0 getRenderableViewByTag(int i) {
        return mTagToRenderableView.get(i);
    }

    /* access modifiers changed from: private */
    public void invalidateSvgView(C5070x0 x0Var) {
        C5028f0 svgView = x0Var.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (x0Var instanceof C5062u0) {
            ((C5062u0) x0Var).mo15362q0().mo15378C();
        }
    }

    private static boolean isZero(double d) {
        return !Double.isNaN(d) && Math.abs(d) < EPSILON;
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    static void runWhenViewIsAvailable(int i, Runnable runnable) {
        mTagToRunnable.put(i, runnable);
    }

    static void setRenderableView(int i, C5017b0 b0Var) {
        mTagToRenderableView.put(i, b0Var);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i);
        }
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        C3036q0.m12002b(readableArray, sTransformDecompositionArray);
        decomposeMatrix();
        C5005c cVar = sMatrixDecompositionContext;
        view.setTranslationX(C3038r.m12006c((float) cVar.f13941i[0]));
        view.setTranslationY(C3038r.m12006c((float) cVar.f13941i[1]));
        view.setRotation((float) cVar.f13942j[2]);
        view.setRotationX((float) cVar.f13942j[0]);
        view.setRotationY((float) cVar.f13942j[1]);
        view.setScaleX((float) cVar.f13939g[0]);
        view.setScaleY((float) cVar.f13939g[1]);
        double[] dArr = cVar.f13938f;
        if (dArr.length > 2) {
            float f = (float) dArr[2];
            if (f == 0.0f) {
                f = 7.8125E-4f;
            }
            float f2 = -1.0f / f;
            float f3 = C2926c.m11504c().density;
            view.setCameraDistance(f3 * f3 * f2 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3031o0 o0Var, C5070x0 x0Var) {
        super.addEventEmitters(o0Var, x0Var);
        x0Var.setOnHierarchyChangeListener(new C5003a());
    }

    public C2987j createShadowNodeInstance() {
        return new C5006d();
    }

    /* access modifiers changed from: protected */
    public C5070x0 createViewInstance(C3031o0 o0Var) {
        switch (C5004b.f13937b[this.svgClass.ordinal()]) {
            case 1:
                return new C5042l(o0Var);
            case 2:
                return new C5059t(o0Var);
            case 3:
                return new C5016b(o0Var);
            case 4:
                return new C5030g(o0Var);
            case 5:
                return new C5047n(o0Var);
            case 6:
                return new C5015a0(o0Var);
            case 7:
                return new C5062u0(o0Var);
            case 8:
                return new C5034h0(o0Var);
            case 9:
                return new C5037i0(o0Var);
            case 10:
                return new C5044m(o0Var);
            case 11:
                return new C5019c(o0Var);
            case 12:
                return new C5025e(o0Var);
            case 13:
                return new C5064v0(o0Var);
            case 14:
                return new C5031g0(o0Var);
            case 15:
                return new C5049o(o0Var);
            case 16:
                return new C5073z(o0Var);
            case 17:
                return new C5061u(o0Var);
            case 18:
                return new C5053q(o0Var);
            case 19:
                return new C5051p(o0Var);
            case 20:
                return new C5036i(o0Var);
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    public String getName() {
        return this.mClassName;
    }

    public Class<C5006d> getShadowNodeClass() {
        return C5006d.class;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C5070x0 x0Var) {
        super.onAfterUpdateTransaction(x0Var);
        invalidateSvgView(x0Var);
    }

    public void onDropViewInstance(C5070x0 x0Var) {
        super.onDropViewInstance(x0Var);
        mTagToRenderableView.remove(x0Var.getId());
    }

    @C2991a(name = "clipPath")
    public void setClipPath(C5070x0 x0Var, String str) {
        x0Var.setClipPath(str);
    }

    @C2991a(name = "clipRule")
    public void setClipRule(C5070x0 x0Var, int i) {
        x0Var.setClipRule(i);
    }

    @C2991a(name = "display")
    public void setDisplay(C5070x0 x0Var, String str) {
        x0Var.setDisplay(str);
    }

    @C2991a(name = "fill")
    public void setFill(C5017b0 b0Var, Dynamic dynamic) {
        b0Var.setFill(dynamic);
    }

    @C2991a(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(C5017b0 b0Var, float f) {
        b0Var.setFillOpacity(f);
    }

    @C2991a(defaultInt = 1, name = "fillRule")
    public void setFillRule(C5017b0 b0Var, int i) {
        b0Var.setFillRule(i);
    }

    @C2991a(name = "markerEnd")
    public void setMarkerEnd(C5070x0 x0Var, String str) {
        x0Var.setMarkerEnd(str);
    }

    @C2991a(name = "markerMid")
    public void setMarkerMid(C5070x0 x0Var, String str) {
        x0Var.setMarkerMid(str);
    }

    @C2991a(name = "markerStart")
    public void setMarkerStart(C5070x0 x0Var, String str) {
        x0Var.setMarkerStart(str);
    }

    @C2991a(name = "mask")
    public void setMask(C5070x0 x0Var, String str) {
        x0Var.setMask(str);
    }

    @C2991a(name = "matrix")
    public void setMatrix(C5070x0 x0Var, Dynamic dynamic) {
        x0Var.setMatrix(dynamic);
    }

    @C2991a(name = "name")
    public void setName(C5070x0 x0Var, String str) {
        x0Var.setName(str);
    }

    @C2991a(name = "onLayout")
    public void setOnLayout(C5070x0 x0Var, boolean z) {
        x0Var.setOnLayout(z);
    }

    @C2991a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(C5070x0 x0Var, float f) {
        x0Var.setOpacity(f);
    }

    @C2991a(name = "pointerEvents")
    public void setPointerEvents(C5070x0 x0Var, String str) {
        x0Var.setPointerEvents(str == null ? C3040s.AUTO : C3040s.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
    }

    @C2991a(name = "propList")
    public void setPropList(C5017b0 b0Var, ReadableArray readableArray) {
        b0Var.setPropList(readableArray);
    }

    @C2991a(name = "responsible")
    public void setResponsible(C5070x0 x0Var, boolean z) {
        x0Var.setResponsible(z);
    }

    @C2991a(name = "stroke")
    public void setStroke(C5017b0 b0Var, Dynamic dynamic) {
        b0Var.setStroke(dynamic);
    }

    @C2991a(name = "strokeDasharray")
    public void setStrokeDasharray(C5017b0 b0Var, ReadableArray readableArray) {
        b0Var.setStrokeDasharray(readableArray);
    }

    @C2991a(name = "strokeDashoffset")
    public void setStrokeDashoffset(C5017b0 b0Var, float f) {
        b0Var.setStrokeDashoffset(f);
    }

    @C2991a(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(C5017b0 b0Var, int i) {
        b0Var.setStrokeLinecap(i);
    }

    @C2991a(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(C5017b0 b0Var, int i) {
        b0Var.setStrokeLinejoin(i);
    }

    @C2991a(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(C5017b0 b0Var, float f) {
        b0Var.setStrokeMiterlimit(f);
    }

    @C2991a(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(C5017b0 b0Var, float f) {
        b0Var.setStrokeOpacity(f);
    }

    @C2991a(name = "strokeWidth")
    public void setStrokeWidth(C5017b0 b0Var, Dynamic dynamic) {
        b0Var.setStrokeWidth(dynamic);
    }

    @C2991a(name = "transform")
    public void setTransform(C5070x0 x0Var, Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Array) {
            ReadableArray asArray = dynamic.asArray();
            if (asArray == null) {
                resetTransformProperty(x0Var);
            } else {
                setTransformProperty(x0Var, asArray);
            }
            Matrix matrix = x0Var.getMatrix();
            x0Var.f14340K = matrix;
            x0Var.f14346Q = matrix.invert(x0Var.f14343N);
        }
    }

    @C2991a(name = "vectorEffect")
    public void setVectorEffect(C5017b0 b0Var, int i) {
        b0Var.setVectorEffect(i);
    }
}
