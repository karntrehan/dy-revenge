package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import com.facebook.react.C3249w;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p174e.p446g.p447a.C10191a;
import p174e.p446g.p448b.C10197f;
import p174e.p446g.p448b.C10198g;
import p174e.p446g.p448b.C10200h;
import p174e.p446g.p448b.C10210m;
import p174e.p446g.p448b.C10212n;
import p174e.p446g.p448b.C10213o;
import p174e.p446g.p448b.C10216p;
import p174e.p446g.p448b.C10217q;
import p174e.p446g.p448b.C10219r;
import p174e.p446g.p448b.C10223u;
import p174e.p446g.p448b.C10226w;
import p174e.p446g.p448b.C10232y;
import p455g.C10320p;
import p455g.C10323s;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

@C2639a(name = "RNGestureHandlerModule")
public final class RNGestureHandlerModule extends ReactContextBaseJavaModule implements C10191a {
    public static final C9859a Companion = new C9859a((C10452g) null);
    private static final String KEY_DIRECTION = "direction";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_HIT_SLOP = "hitSlop";
    private static final String KEY_HIT_SLOP_BOTTOM = "bottom";
    private static final String KEY_HIT_SLOP_HEIGHT = "height";
    private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
    private static final String KEY_HIT_SLOP_LEFT = "left";
    private static final String KEY_HIT_SLOP_RIGHT = "right";
    private static final String KEY_HIT_SLOP_TOP = "top";
    private static final String KEY_HIT_SLOP_VERTICAL = "vertical";
    private static final String KEY_HIT_SLOP_WIDTH = "width";
    private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
    private static final String KEY_MANUAL_ACTIVATION = "manualActivation";
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
    private static final String KEY_NEEDS_POINTER_DATA = "needsPointerData";
    private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
    private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
    private static final String KEY_PAN_MAX_POINTERS = "maxPointers";
    private static final String KEY_PAN_MIN_DIST = "minDist";
    private static final String KEY_PAN_MIN_POINTERS = "minPointers";
    private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
    private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
    private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
    private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
    private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
    private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
    private static final String KEY_TAP_MAX_DIST = "maxDist";
    private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
    private static final String KEY_TAP_MIN_POINTERS = "minPointers";
    private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
    public static final String MODULE_NAME = "RNGestureHandlerModule";
    private final List<Integer> enqueuedRootViewInit = new ArrayList();
    private final C9869k eventListener = new C9869k(this);
    private final C9861c<?>[] handlerFactories = {new C9864f(), new C9868j(), new C9862d(), new C9865g(), new C9866h(), new C9867i(), new C9860b(), new C9863e()};
    private final C9878g interactionManager = new C9878g();
    private final C9880h registry = new C9880h();
    private final List<C9881i> roots = new ArrayList();

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$a */
    public static final class C9859a {
        private C9859a() {
        }

        public /* synthetic */ C9859a(C10452g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m33591b(C10200h<?> hVar, ReadableMap readableMap) {
            float f;
            float f2;
            float f3;
            float f4;
            if (readableMap.getType(RNGestureHandlerModule.KEY_HIT_SLOP) == ReadableType.Number) {
                float b = C3038r.m12005b(readableMap.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP));
                hVar.mo25454s0(b, b, b, b, Float.NaN, Float.NaN);
                return;
            }
            ReadableMap map = readableMap.getMap(RNGestureHandlerModule.KEY_HIT_SLOP);
            C10457l.m35317b(map);
            C10457l.m35319d(map, "config.getMap(KEY_HIT_SLOP)!!");
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL)) {
                f2 = C3038r.m12005b(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL));
                f = f2;
            } else {
                f2 = Float.NaN;
                f = Float.NaN;
            }
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL)) {
                f4 = C3038r.m12005b(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL));
                f3 = f4;
            } else {
                f4 = Float.NaN;
                f3 = Float.NaN;
            }
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_LEFT)) {
                f2 = C3038r.m12005b(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_LEFT));
            }
            float f5 = f2;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_TOP)) {
                f4 = C3038r.m12005b(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_TOP));
            }
            float f6 = f4;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_RIGHT)) {
                f = C3038r.m12005b(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_RIGHT));
            }
            float f7 = f;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_BOTTOM)) {
                f3 = C3038r.m12005b(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_BOTTOM));
            }
            hVar.mo25454s0(f5, f6, f7, f3, map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_WIDTH) ? C3038r.m12005b(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_WIDTH)) : Float.NaN, map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_HEIGHT) ? C3038r.m12005b(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_HEIGHT)) : Float.NaN);
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$b */
    private static final class C9860b extends C9861c<C10198g> {

        /* renamed from: a */
        private final Class<C10198g> f26404a = C10198g.class;

        /* renamed from: b */
        private final String f26405b = "FlingGestureHandler";

        /* renamed from: d */
        public String mo24691d() {
            return this.f26405b;
        }

        /* renamed from: e */
        public Class<C10198g> mo24692e() {
            return this.f26404a;
        }

        /* renamed from: f */
        public void mo24689b(C10198g gVar, ReadableMap readableMap) {
            C10457l.m35320e(gVar, "handler");
            C10457l.m35320e(readableMap, "config");
            super.mo24689b(gVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                gVar.mo25404M0(readableMap.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_DIRECTION)) {
                gVar.mo25403L0(readableMap.getInt(RNGestureHandlerModule.KEY_DIRECTION));
            }
        }

        /* renamed from: g */
        public C10198g mo24690c(Context context) {
            return new C10198g();
        }

        /* renamed from: h */
        public void mo24688a(C10198g gVar, WritableMap writableMap) {
            C10457l.m35320e(gVar, "handler");
            C10457l.m35320e(writableMap, "eventData");
            super.mo24688a(gVar, writableMap);
            writableMap.putDouble("x", (double) C3038r.m12004a(gVar.mo25422I()));
            writableMap.putDouble("y", (double) C3038r.m12004a(gVar.mo25423J()));
            writableMap.putDouble("absoluteX", (double) C3038r.m12004a(gVar.mo25418G()));
            writableMap.putDouble("absoluteY", (double) C3038r.m12004a(gVar.mo25420H()));
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$c */
    private static abstract class C9861c<T extends C10200h<T>> implements C9877f<T> {
        /* renamed from: a */
        public void mo24688a(T t, WritableMap writableMap) {
            C10457l.m35320e(t, "handler");
            C10457l.m35320e(writableMap, "eventData");
            writableMap.putDouble(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS, (double) t.mo25425L());
        }

        /* renamed from: b */
        public void mo24689b(T t, ReadableMap readableMap) {
            C10457l.m35320e(t, "handler");
            C10457l.m35320e(readableMap, "config");
            t.mo25407j0();
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE)) {
                t.mo25463x0(readableMap.getBoolean(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_ENABLED)) {
                t.mo25452q0(readableMap.getBoolean(RNGestureHandlerModule.KEY_ENABLED));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP)) {
                RNGestureHandlerModule.Companion.m33591b(t, readableMap);
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA)) {
                t.mo25460v0(readableMap.getBoolean(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION)) {
                t.mo25459u0(readableMap.getBoolean(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION));
            }
        }

        /* renamed from: c */
        public abstract T mo24690c(Context context);

        /* renamed from: d */
        public abstract String mo24691d();

        /* renamed from: e */
        public abstract Class<T> mo24692e();
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$d */
    private static final class C9862d extends C9861c<C10210m> {

        /* renamed from: a */
        private final Class<C10210m> f26406a = C10210m.class;

        /* renamed from: b */
        private final String f26407b = "LongPressGestureHandler";

        /* renamed from: d */
        public String mo24691d() {
            return this.f26407b;
        }

        /* renamed from: e */
        public Class<C10210m> mo24692e() {
            return this.f26406a;
        }

        /* renamed from: f */
        public void mo24689b(C10210m mVar, ReadableMap readableMap) {
            C10457l.m35320e(mVar, "handler");
            C10457l.m35320e(readableMap, "config");
            super.mo24689b(mVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS)) {
                mVar.mo25486M0((long) readableMap.getInt(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS));
            }
            if (readableMap.hasKey("maxDist")) {
                mVar.mo25485L0(C3038r.m12005b(readableMap.getDouble("maxDist")));
            }
        }

        /* renamed from: g */
        public C10210m mo24690c(Context context) {
            C10457l.m35317b(context);
            return new C10210m(context);
        }

        /* renamed from: h */
        public void mo24688a(C10210m mVar, WritableMap writableMap) {
            C10457l.m35320e(mVar, "handler");
            C10457l.m35320e(writableMap, "eventData");
            super.mo24688a(mVar, writableMap);
            writableMap.putDouble("x", (double) C3038r.m12004a(mVar.mo25422I()));
            writableMap.putDouble("y", (double) C3038r.m12004a(mVar.mo25423J()));
            writableMap.putDouble("absoluteX", (double) C3038r.m12004a(mVar.mo25418G()));
            writableMap.putDouble("absoluteY", (double) C3038r.m12004a(mVar.mo25420H()));
            writableMap.putInt("duration", mVar.mo25484I0());
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$e */
    private static final class C9863e extends C9861c<C10212n> {

        /* renamed from: a */
        private final Class<C10212n> f26408a = C10212n.class;

        /* renamed from: b */
        private final String f26409b = "ManualGestureHandler";

        /* renamed from: d */
        public String mo24691d() {
            return this.f26409b;
        }

        /* renamed from: e */
        public Class<C10212n> mo24692e() {
            return this.f26408a;
        }

        /* renamed from: f */
        public C10212n mo24690c(Context context) {
            return new C10212n();
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$f */
    private static final class C9864f extends C9861c<C10213o> {

        /* renamed from: a */
        private final Class<C10213o> f26410a = C10213o.class;

        /* renamed from: b */
        private final String f26411b = "NativeViewGestureHandler";

        /* renamed from: d */
        public String mo24691d() {
            return this.f26411b;
        }

        /* renamed from: e */
        public Class<C10213o> mo24692e() {
            return this.f26410a;
        }

        /* renamed from: f */
        public void mo24689b(C10213o oVar, ReadableMap readableMap) {
            C10457l.m35320e(oVar, "handler");
            C10457l.m35320e(readableMap, "config");
            super.mo24689b(oVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START)) {
                oVar.mo25488L0(readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION)) {
                oVar.mo25487K0(readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION));
            }
        }

        /* renamed from: g */
        public C10213o mo24690c(Context context) {
            return new C10213o();
        }

        /* renamed from: h */
        public void mo24688a(C10213o oVar, WritableMap writableMap) {
            C10457l.m35320e(oVar, "handler");
            C10457l.m35320e(writableMap, "eventData");
            super.mo24688a(oVar, writableMap);
            writableMap.putBoolean("pointerInside", oVar.mo25437Y());
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$g */
    private static final class C9865g extends C9861c<C10217q> {

        /* renamed from: a */
        private final Class<C10217q> f26412a = C10217q.class;

        /* renamed from: b */
        private final String f26413b = "PanGestureHandler";

        /* renamed from: d */
        public String mo24691d() {
            return this.f26413b;
        }

        /* renamed from: e */
        public Class<C10217q> mo24692e() {
            return this.f26412a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x012d  */
        /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo24689b(p174e.p446g.p448b.C10217q r5, com.facebook.react.bridge.ReadableMap r6) {
            /*
                r4 = this;
                java.lang.String r0 = "handler"
                p455g.p470y.p472d.C10457l.m35320e(r5, r0)
                java.lang.String r0 = "config"
                p455g.p470y.p472d.C10457l.m35320e(r6, r0)
                super.mo24689b(r5, r6)
                java.lang.String r0 = "activeOffsetXStart"
                boolean r1 = r6.hasKey(r0)
                r2 = 1
                if (r1 == 0) goto L_0x0023
                double r0 = r6.getDouble(r0)
                float r0 = com.facebook.react.uimanager.C3038r.m12005b(r0)
                r5.mo25494N0(r0)
                r0 = 1
                goto L_0x0024
            L_0x0023:
                r0 = 0
            L_0x0024:
                java.lang.String r1 = "activeOffsetXEnd"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x0038
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C3038r.m12005b(r0)
                r5.mo25493M0(r0)
                r0 = 1
            L_0x0038:
                java.lang.String r1 = "failOffsetXStart"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x004c
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C3038r.m12005b(r0)
                r5.mo25499S0(r0)
                r0 = 1
            L_0x004c:
                java.lang.String r1 = "failOffsetXEnd"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x0060
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C3038r.m12005b(r0)
                r5.mo25498R0(r0)
                r0 = 1
            L_0x0060:
                java.lang.String r1 = "activeOffsetYStart"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x0074
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C3038r.m12005b(r0)
                r5.mo25496P0(r0)
                r0 = 1
            L_0x0074:
                java.lang.String r1 = "activeOffsetYEnd"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x0088
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C3038r.m12005b(r0)
                r5.mo25495O0(r0)
                r0 = 1
            L_0x0088:
                java.lang.String r1 = "failOffsetYStart"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x009c
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C3038r.m12005b(r0)
                r5.mo25501U0(r0)
                r0 = 1
            L_0x009c:
                java.lang.String r1 = "failOffsetYEnd"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x00b0
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C3038r.m12005b(r0)
                r5.mo25500T0(r0)
                r0 = 1
            L_0x00b0:
                java.lang.String r1 = "minVelocity"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x00c4
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C3038r.m12005b(r0)
                r5.mo25505Y0(r0)
                r0 = 1
            L_0x00c4:
                java.lang.String r1 = "minVelocityX"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x00d8
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C3038r.m12005b(r0)
                r5.mo25506Z0(r0)
                r0 = 1
            L_0x00d8:
                java.lang.String r1 = "minVelocityY"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x00ec
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C3038r.m12005b(r0)
                r5.mo25507a1(r0)
                goto L_0x00ed
            L_0x00ec:
                r2 = r0
            L_0x00ed:
                java.lang.String r0 = "minDist"
                boolean r1 = r6.hasKey(r0)
                if (r1 == 0) goto L_0x0101
                double r0 = r6.getDouble(r0)
                float r0 = com.facebook.react.uimanager.C3038r.m12005b(r0)
            L_0x00fd:
                r5.mo25503W0(r0)
                goto L_0x0107
            L_0x0101:
                if (r2 == 0) goto L_0x0107
                r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
                goto L_0x00fd
            L_0x0107:
                java.lang.String r0 = "minPointers"
                boolean r1 = r6.hasKey(r0)
                if (r1 == 0) goto L_0x0116
                int r0 = r6.getInt(r0)
                r5.mo25504X0(r0)
            L_0x0116:
                java.lang.String r0 = "maxPointers"
                boolean r1 = r6.hasKey(r0)
                if (r1 == 0) goto L_0x0125
                int r0 = r6.getInt(r0)
                r5.mo25502V0(r0)
            L_0x0125:
                java.lang.String r0 = "avgTouches"
                boolean r1 = r6.hasKey(r0)
                if (r1 == 0) goto L_0x0134
                boolean r6 = r6.getBoolean(r0)
                r5.mo25497Q0(r6)
            L_0x0134:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerModule.C9865g.mo24689b(e.g.b.q, com.facebook.react.bridge.ReadableMap):void");
        }

        /* renamed from: g */
        public C10217q mo24690c(Context context) {
            return new C10217q(context);
        }

        /* renamed from: h */
        public void mo24688a(C10217q qVar, WritableMap writableMap) {
            C10457l.m35320e(qVar, "handler");
            C10457l.m35320e(writableMap, "eventData");
            super.mo24688a(qVar, writableMap);
            writableMap.putDouble("x", (double) C3038r.m12004a(qVar.mo25422I()));
            writableMap.putDouble("y", (double) C3038r.m12004a(qVar.mo25423J()));
            writableMap.putDouble("absoluteX", (double) C3038r.m12004a(qVar.mo25418G()));
            writableMap.putDouble("absoluteY", (double) C3038r.m12004a(qVar.mo25420H()));
            writableMap.putDouble("translationX", (double) C3038r.m12004a(qVar.mo25489I0()));
            writableMap.putDouble("translationY", (double) C3038r.m12004a(qVar.mo25490J0()));
            writableMap.putDouble("velocityX", (double) C3038r.m12004a(qVar.mo25491K0()));
            writableMap.putDouble("velocityY", (double) C3038r.m12004a(qVar.mo25492L0()));
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$h */
    private static final class C9866h extends C9861c<C10219r> {

        /* renamed from: a */
        private final Class<C10219r> f26414a = C10219r.class;

        /* renamed from: b */
        private final String f26415b = "PinchGestureHandler";

        /* renamed from: d */
        public String mo24691d() {
            return this.f26415b;
        }

        /* renamed from: e */
        public Class<C10219r> mo24692e() {
            return this.f26414a;
        }

        /* renamed from: f */
        public C10219r mo24690c(Context context) {
            return new C10219r();
        }

        /* renamed from: g */
        public void mo24688a(C10219r rVar, WritableMap writableMap) {
            C10457l.m35320e(rVar, "handler");
            C10457l.m35320e(writableMap, "eventData");
            super.mo24688a(rVar, writableMap);
            writableMap.putDouble("scale", rVar.mo25510P0());
            writableMap.putDouble("focalX", (double) C3038r.m12004a(rVar.mo25508N0()));
            writableMap.putDouble("focalY", (double) C3038r.m12004a(rVar.mo25509O0()));
            writableMap.putDouble("velocity", rVar.mo25511Q0());
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$i */
    private static final class C9867i extends C9861c<C10226w> {

        /* renamed from: a */
        private final Class<C10226w> f26416a = C10226w.class;

        /* renamed from: b */
        private final String f26417b = "RotationGestureHandler";

        /* renamed from: d */
        public String mo24691d() {
            return this.f26417b;
        }

        /* renamed from: e */
        public Class<C10226w> mo24692e() {
            return this.f26416a;
        }

        /* renamed from: f */
        public C10226w mo24690c(Context context) {
            return new C10226w();
        }

        /* renamed from: g */
        public void mo24688a(C10226w wVar, WritableMap writableMap) {
            C10457l.m35320e(wVar, "handler");
            C10457l.m35320e(writableMap, "eventData");
            super.mo24688a(wVar, writableMap);
            writableMap.putDouble("rotation", wVar.mo25525M0());
            writableMap.putDouble("anchorX", (double) C3038r.m12004a(wVar.mo25523K0()));
            writableMap.putDouble("anchorY", (double) C3038r.m12004a(wVar.mo25524L0()));
            writableMap.putDouble("velocity", wVar.mo25526N0());
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$j */
    private static final class C9868j extends C9861c<C10232y> {

        /* renamed from: a */
        private final Class<C10232y> f26418a = C10232y.class;

        /* renamed from: b */
        private final String f26419b = "TapGestureHandler";

        /* renamed from: d */
        public String mo24691d() {
            return this.f26419b;
        }

        /* renamed from: e */
        public Class<C10232y> mo24692e() {
            return this.f26418a;
        }

        /* renamed from: f */
        public void mo24689b(C10232y yVar, ReadableMap readableMap) {
            C10457l.m35320e(yVar, "handler");
            C10457l.m35320e(readableMap, "config");
            super.mo24689b(yVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS)) {
                yVar.mo25542R0(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS)) {
                yVar.mo25538N0((long) readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS)) {
                yVar.mo25536L0((long) readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)) {
                yVar.mo25539O0(C3038r.m12005b(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)) {
                yVar.mo25540P0(C3038r.m12005b(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)));
            }
            if (readableMap.hasKey("maxDist")) {
                yVar.mo25537M0(C3038r.m12005b(readableMap.getDouble("maxDist")));
            }
            if (readableMap.hasKey("minPointers")) {
                yVar.mo25541Q0(readableMap.getInt("minPointers"));
            }
        }

        /* renamed from: g */
        public C10232y mo24690c(Context context) {
            return new C10232y();
        }

        /* renamed from: h */
        public void mo24688a(C10232y yVar, WritableMap writableMap) {
            C10457l.m35320e(yVar, "handler");
            C10457l.m35320e(writableMap, "eventData");
            super.mo24688a(yVar, writableMap);
            writableMap.putDouble("x", (double) C3038r.m12004a(yVar.mo25422I()));
            writableMap.putDouble("y", (double) C3038r.m12004a(yVar.mo25423J()));
            writableMap.putDouble("absoluteX", (double) C3038r.m12004a(yVar.mo25418G()));
            writableMap.putDouble("absoluteY", (double) C3038r.m12004a(yVar.mo25420H()));
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$k */
    public static final class C9869k implements C10216p {

        /* renamed from: a */
        final /* synthetic */ RNGestureHandlerModule f26420a;

        C9869k(RNGestureHandlerModule rNGestureHandlerModule) {
            this.f26420a = rNGestureHandlerModule;
        }

        /* renamed from: a */
        public <T extends C10200h<T>> void mo24713a(T t) {
            C10457l.m35320e(t, "handler");
            this.f26420a.onTouchEvent(t);
        }

        /* renamed from: b */
        public <T extends C10200h<T>> void mo24714b(T t, int i, int i2) {
            C10457l.m35320e(t, "handler");
            this.f26420a.onStateChange(t, i, i2);
        }

        /* renamed from: c */
        public <T extends C10200h<T>> void mo24715c(T t, MotionEvent motionEvent) {
            C10457l.m35320e(t, "handler");
            C10457l.m35320e(motionEvent, "event");
            this.f26420a.onHandlerUpdate(t);
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final native void decorateRuntime(long j);

    private final <T extends C10200h<T>> C9861c<T> findFactoryForHandler(C10200h<T> hVar) {
        for (C9861c<?> cVar : this.handlerFactories) {
            if (C10457l.m35316a(cVar.mo24692e(), hVar.getClass())) {
                return cVar;
            }
        }
        return null;
    }

    private final C9881i findRootHelperForViewAncestor(int i) {
        C9881i iVar;
        boolean z;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C10457l.m35319d(reactApplicationContext, "reactApplicationContext");
        int resolveRootTagFromReactTag = C10197f.m34503b(reactApplicationContext).resolveRootTagFromReactTag(i);
        T t = null;
        if (resolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.roots) {
            Iterator<T> it = this.roots.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                C9881i iVar2 = (C9881i) next;
                if (!(iVar2.mo24737c() instanceof C3249w) || ((C3249w) iVar2.mo24737c()).getRootViewTag() != resolveRootTagFromReactTag) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            iVar = (C9881i) t;
        }
        return iVar;
    }

    /* access modifiers changed from: private */
    public final <T extends C10200h<T>> void onHandlerUpdate(T t) {
        if (t.mo25428O() >= 0 && t.mo25427N() == 4) {
            C9861c findFactoryForHandler = findFactoryForHandler(t);
            if (t.mo25412D() == 1) {
                sendEventForReanimated(C9875e.f26424h.mo24721b(t, findFactoryForHandler));
            } else if (t.mo25412D() == 2) {
                sendEventForNativeAnimatedEvent(C9875e.f26424h.mo24721b(t, findFactoryForHandler));
            } else if (t.mo25412D() == 3) {
                sendEventForDirectEvent(C9875e.f26424h.mo24721b(t, findFactoryForHandler));
            } else if (t.mo25412D() == 4) {
                sendEventForDeviceEvent("onGestureHandlerEvent", C9875e.f26424h.mo24720a(t, findFactoryForHandler));
            }
        }
    }

    /* access modifiers changed from: private */
    public final <T extends C10200h<T>> void onStateChange(T t, int i, int i2) {
        if (t.mo25428O() >= 0) {
            C9861c findFactoryForHandler = findFactoryForHandler(t);
            if (t.mo25412D() == 1) {
                sendEventForReanimated(C9886k.f26445h.mo24747b(t, i, i2, findFactoryForHandler));
            } else if (t.mo25412D() == 2 || t.mo25412D() == 3) {
                sendEventForDirectEvent(C9886k.f26445h.mo24747b(t, i, i2, findFactoryForHandler));
            } else if (t.mo25412D() == 4) {
                sendEventForDeviceEvent("onGestureHandlerStateChange", C9886k.f26445h.mo24746a(t, findFactoryForHandler, i, i2));
            }
        }
    }

    /* access modifiers changed from: private */
    public final <T extends C10200h<T>> void onTouchEvent(T t) {
        if (t.mo25428O() >= 0) {
            if (t.mo25427N() != 2 && t.mo25427N() != 4 && t.mo25427N() != 0 && t.mo25431R() == null) {
                return;
            }
            if (t.mo25412D() == 1) {
                sendEventForReanimated(C9888l.f26448h.mo24749b(t));
            } else if (t.mo25412D() == 4) {
                sendEventForDeviceEvent("onGestureHandlerEvent", C9888l.f26448h.mo24748a(t));
            }
        }
    }

    private final void sendEventForDeviceEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C10457l.m35319d(reactApplicationContext, "reactApplicationContext");
        C10197f.m34502a(reactApplicationContext).emit(str, writableMap);
    }

    private final <T extends C2944c<T>> void sendEventForDirectEvent(T t) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C10457l.m35319d(reactApplicationContext, "reactApplicationContext");
        C10223u.m34737a(reactApplicationContext, t);
    }

    private final void sendEventForNativeAnimatedEvent(C9875e eVar) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C10457l.m35319d(reactApplicationContext, "reactApplicationContext");
        C10223u.m34737a(reactApplicationContext, eVar);
    }

    private final <T extends C2944c<T>> void sendEventForReanimated(T t) {
        sendEventForDirectEvent(t);
    }

    @ReactMethod
    public final void attachGestureHandler(int i, int i2, int i3) {
        if (!this.registry.mo24730b(i, i2, i3)) {
            throw new JSApplicationIllegalArgumentException("Handler with tag " + i + " does not exists");
        }
    }

    @ReactMethod
    public final <T extends C10200h<T>> void createGestureHandler(String str, int i, ReadableMap readableMap) {
        C10457l.m35320e(str, "handlerName");
        C10457l.m35320e(readableMap, "config");
        C9861c[] cVarArr = this.handlerFactories;
        int length = cVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            C9861c cVar = cVarArr[i2];
            i2++;
            if (C10457l.m35316a(cVar.mo24691d(), str)) {
                C10200h c = cVar.mo24690c(getReactApplicationContext());
                c.mo25466z0(i);
                c.mo25462w0(this.eventListener);
                this.registry.mo24735j(c);
                this.interactionManager.mo24726e(c, readableMap);
                cVar.mo24689b(c, readableMap);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException(C10457l.m35326k("Invalid handler name ", str));
    }

    @ReactMethod
    public final void dropGestureHandler(int i) {
        this.interactionManager.mo24727g(i);
        this.registry.mo24732f(i);
    }

    public Map<String, Object> getConstants() {
        return C10334c0.m35035e(C10320p.m35019a("State", C10334c0.m35035e(C10320p.m35019a("UNDETERMINED", 0), C10320p.m35019a("BEGAN", 2), C10320p.m35019a("ACTIVE", 4), C10320p.m35019a("CANCELLED", 3), C10320p.m35019a("FAILED", 1), C10320p.m35019a("END", 5))), C10320p.m35019a("Direction", C10334c0.m35035e(C10320p.m35019a("RIGHT", 1), C10320p.m35019a("LEFT", 2), C10320p.m35019a("UP", 4), C10320p.m35019a("DOWN", 8))));
    }

    public String getName() {
        return MODULE_NAME;
    }

    public final C9880h getRegistry() {
        return this.registry;
    }

    @ReactMethod
    public final void handleClearJSResponder() {
    }

    @ReactMethod
    public final void handleSetJSResponder(int i, boolean z) {
        C9881i findRootHelperForViewAncestor = findRootHelperForViewAncestor(i);
        if (findRootHelperForViewAncestor != null) {
            findRootHelperForViewAncestor.mo24738d(i, z);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean install() {
        try {
            SoLoader.m12782j("rngesturehandler_modules");
            decorateRuntime(getReactApplicationContext().getJavaScriptContextHolder().get());
            return true;
        } catch (Exception unused) {
            Log.w("[RNGestureHandler]", "Could not install JSI bindings.");
            return false;
        }
    }

    public void onCatalystInstanceDestroy() {
        this.registry.mo24731e();
        this.interactionManager.mo24728h();
        synchronized (this.roots) {
            while (!this.roots.isEmpty()) {
                int size = this.roots.size();
                this.roots.get(0).mo24740h();
                if (this.roots.size() >= size) {
                    throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                }
            }
            C10323s sVar = C10323s.f27547a;
        }
        super.onCatalystInstanceDestroy();
    }

    public final void registerRootHelper(C9881i iVar) {
        C10457l.m35320e(iVar, "root");
        synchronized (this.roots) {
            if (!this.roots.contains(iVar)) {
                this.roots.add(iVar);
            } else {
                throw new IllegalStateException("Root helper" + iVar + " already registered");
            }
        }
    }

    public void setGestureHandlerState(int i, int i2) {
        C10200h<?> g = this.registry.mo24733g(i);
        if (g != null) {
            if (i2 == 1) {
                g.mo25409B();
            } else if (i2 == 2) {
                g.mo25446n();
            } else if (i2 == 3) {
                g.mo25448o();
            } else if (i2 == 4) {
                g.mo25406j(true);
            } else if (i2 == 5) {
                g.mo25465z();
            }
        }
    }

    public final void unregisterRootHelper(C9881i iVar) {
        C10457l.m35320e(iVar, "root");
        synchronized (this.roots) {
            this.roots.remove(iVar);
        }
    }

    @ReactMethod
    public final <T extends C10200h<T>> void updateGestureHandler(int i, ReadableMap readableMap) {
        C9861c<T> findFactoryForHandler;
        C10457l.m35320e(readableMap, "config");
        C10200h<?> g = this.registry.mo24733g(i);
        if (g != null && (findFactoryForHandler = findFactoryForHandler(g)) != null) {
            this.interactionManager.mo24727g(i);
            this.interactionManager.mo24726e(g, readableMap);
            findFactoryForHandler.mo24689b(g, readableMap);
        }
    }
}
