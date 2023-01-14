package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C2693e;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p126z.C3257a;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.uimanager.events.C2946e;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.p121k1.C2996a;
import com.facebook.react.uimanager.p122l1.C2999a;
import com.facebook.systrace.C3294a;
import com.facebook.systrace.C3296b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p027c.p060f.C1788a;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p267f.p270b.C6137c;
import p174e.p247e.p267f.p271c.C6138a;

@C2639a(name = "UIManager")
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = C6137c.m23120a().mo18149a(C6138a.f16821f);
    public static final String NAME = "UIManager";
    public static final String TAG = "UIManagerModule";
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final C2945d mEventDispatcher;
    private final List<C3057x0> mListeners;
    private final C2917e mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private int mNumRootViews;
    /* access modifiers changed from: private */
    public final C3041s0 mUIImplementation;
    private final CopyOnWriteArrayList<UIManagerListener> mUIManagerListeners;
    private Map<String, WritableMap> mViewManagerConstantsCache;
    private volatile int mViewManagerConstantsCacheSize;
    private final C2941e1 mViewManagerRegistry;

    /* renamed from: com.facebook.react.uimanager.UIManagerModule$a */
    class C2913a implements C2916d {
        C2913a() {
        }

        /* renamed from: a */
        public String mo9441a(String str) {
            return UIManagerModule.this.resolveCustomDirectEventName(str);
        }
    }

    /* renamed from: com.facebook.react.uimanager.UIManagerModule$b */
    class C2914b extends GuardedRunnable {

        /* renamed from: f */
        final /* synthetic */ int f8189f;

        /* renamed from: o */
        final /* synthetic */ Object f8190o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2914b(ReactContext reactContext, int i, Object obj) {
            super(reactContext);
            this.f8189f = i;
            this.f8190o = obj;
        }

        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.mo9832Y(this.f8189f, this.f8190o);
        }
    }

    /* renamed from: com.facebook.react.uimanager.UIManagerModule$c */
    class C2915c extends GuardedRunnable {

        /* renamed from: f */
        final /* synthetic */ int f8192f;

        /* renamed from: o */
        final /* synthetic */ int f8193o;

        /* renamed from: p */
        final /* synthetic */ int f8194p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2915c(ReactContext reactContext, int i, int i2, int i3) {
            super(reactContext);
            this.f8192f = i;
            this.f8193o = i2;
            this.f8194p = i3;
        }

        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.mo9838c0(this.f8192f, this.f8193o, this.f8194p);
            UIManagerModule.this.mUIImplementation.mo9852n(-1);
        }
    }

    /* renamed from: com.facebook.react.uimanager.UIManagerModule$d */
    public interface C2916d {
        /* renamed from: a */
        String mo9441a(String str);
    }

    /* renamed from: com.facebook.react.uimanager.UIManagerModule$e */
    private class C2917e implements ComponentCallbacks2 {
        private C2917e() {
        }

        /* synthetic */ C2917e(UIManagerModule uIManagerModule, C2913a aVar) {
            this();
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i) {
            if (i >= 60) {
                C2986i1.m11844a().mo8807c();
            }
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, C2963f1 f1Var, int i) {
        this(reactApplicationContext, f1Var, new C3045t0(), i);
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, C2963f1 f1Var, C3045t0 t0Var, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new C2917e(this, (C2913a) null);
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        this.mNumRootViews = 0;
        C2926c.m11507f(reactApplicationContext);
        C2946e eVar = new C2946e(reactApplicationContext);
        this.mEventDispatcher = eVar;
        this.mModuleConstants = createConstants(f1Var);
        this.mCustomDirectEvents = C3053v0.m12096c();
        C2941e1 e1Var = new C2941e1(f1Var);
        this.mViewManagerRegistry = e1Var;
        this.mUIImplementation = t0Var.mo9864a(reactApplicationContext, e1Var, eVar, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i) {
        this(reactApplicationContext, list, new C3045t0(), i);
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, C3045t0 t0Var, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new C2917e(this, (C2913a) null);
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        this.mNumRootViews = 0;
        C2926c.m11507f(reactApplicationContext);
        C2946e eVar = new C2946e(reactApplicationContext);
        this.mEventDispatcher = eVar;
        HashMap b = C2693e.m10912b();
        this.mCustomDirectEvents = b;
        this.mModuleConstants = createConstants(list, (Map<String, Object>) null, b);
        C2941e1 e1Var = new C2941e1(list);
        this.mViewManagerRegistry = e1Var;
        this.mUIImplementation = t0Var.mo9864a(reactApplicationContext, e1Var, eVar, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private WritableMap computeConstantsForViewManager(String str) {
        ViewManager S = str != null ? this.mUIImplementation.mo9826S(str) : null;
        if (S == null) {
            return null;
        }
        C3296b.m12892a(0, "UIManagerModule.getConstantsForViewManager").mo10751b("ViewManager", S.getName()).mo10751b("Lazy", Boolean.TRUE).mo10752c();
        try {
            Map<String, Object> c = C3055w0.m12100c(S, (Map) null, (Map) null, (Map) null, this.mCustomDirectEvents);
            if (c != null) {
                return Arguments.makeNativeMap(c);
            }
            C3296b.m12893b(0).mo10752c();
            return null;
        } finally {
            C3296b.m12893b(0).mo10752c();
        }
    }

    private static Map<String, Object> createConstants(C2963f1 f1Var) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C3296b.m12892a(0, "CreateUIManagerConstants").mo10751b("Lazy", Boolean.TRUE).mo10752c();
        try {
            return C3055w0.m12098a(f1Var);
        } finally {
            C3294a.m12885g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    private static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C3296b.m12892a(0, "CreateUIManagerConstants").mo10751b("Lazy", Boolean.FALSE).mo10752c();
        try {
            return C3055w0.m12099b(list, map, map2);
        } finally {
            C3294a.m12885g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public <T extends View> int addRootView(T t) {
        return addRootView(t, (WritableMap) null, (String) null);
    }

    public <T extends View> int addRootView(T t, WritableMap writableMap, String str) {
        C3294a.m12881c(0, "UIManagerModule.addRootView");
        int a = C2927c0.m11510a();
        this.mUIImplementation.mo9818J(t, a, new C3031o0(getReactApplicationContext(), t.getContext(), ((C2923b0) t).getSurfaceID(), -1));
        this.mNumRootViews++;
        C3294a.m12885g(0);
        return a;
    }

    public void addUIBlock(C3039r0 r0Var) {
        this.mUIImplementation.mo9834a(r0Var);
    }

    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.add(uIManagerListener);
    }

    @Deprecated
    public void addUIManagerListener(C3057x0 x0Var) {
        this.mListeners.add(x0Var);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.mo9842f();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.mo9844g(readableMap, callback);
    }

    @ReactMethod
    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.createView) tag: " + i + ", class: " + str + ", props: " + readableMap;
            C6071a.m22868b("ReactNative", str2);
            C6137c.m23120a().mo18151c(C6138a.f16821f, str2);
        }
        this.mUIImplementation.mo9848j(i, str, i2, readableMap);
    }

    @ReactMethod
    public void dismissPopupMenu() {
        this.mUIImplementation.mo9849k();
    }

    @Deprecated
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        this.mUIImplementation.mo9850l(i, i2, readableArray);
    }

    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        this.mUIImplementation.mo9851m(i, str, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, Dynamic dynamic, ReadableArray readableArray) {
        UIManager f = C3051u0.m12089f(getReactApplicationContext(), C2996a.m11878a(i));
        if (f != null) {
            if (dynamic.getType() == ReadableType.Number) {
                f.dispatchCommand(i, dynamic.asInt(), readableArray);
            } else if (dynamic.getType() == ReadableType.String) {
                f.dispatchCommand(i, dynamic.asString(), readableArray);
            }
        }
    }

    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.mo9853p(i, (float) Math.round(C3038r.m12005b(readableArray.getDouble(0))), (float) Math.round(C3038r.m12005b(readableArray.getDouble(1))), callback);
    }

    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        Map<String, WritableMap> map = this.mViewManagerConstantsCache;
        if (map == null || !map.containsKey(str)) {
            return computeConstantsForViewManager(str);
        }
        WritableMap writableMap = this.mViewManagerConstantsCache.get(str);
        int i = this.mViewManagerConstantsCacheSize - 1;
        this.mViewManagerConstantsCacheSize = i;
        if (i <= 0) {
            this.mViewManagerConstantsCache = null;
        }
        return writableMap;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(C3055w0.m12101d());
    }

    @Deprecated
    public C2916d getDirectEventNamesResolver() {
        return new C2913a();
    }

    public C2945d getEventDispatcher() {
        return this.mEventDispatcher;
    }

    public String getName() {
        return NAME;
    }

    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.mo9854q();
    }

    @Deprecated
    public C3041s0 getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public C2941e1 getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        this.mEventDispatcher.mo9649a(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    public void invalidateNodeLayout(int i) {
        C2931d0 R = this.mUIImplementation.mo9825R(i);
        if (R == null) {
            C6071a.m22859G("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i);
            return;
        }
        R.mo9539k();
        this.mUIImplementation.mo9852n(-1);
    }

    @ReactMethod
    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        if (DEBUG) {
            String str = "(UIManager.manageChildren) tag: " + i + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5;
            C6071a.m22868b("ReactNative", str);
            C6137c.m23120a().mo18151c(C6138a.f16821f, str);
        }
        this.mUIImplementation.mo9689u(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        this.mUIImplementation.mo9858v(i, callback);
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        this.mUIImplementation.mo9859w(i, callback);
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        this.mUIImplementation.mo9860x(i, i2, callback, callback2);
    }

    @Deprecated
    @ReactMethod
    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        this.mUIImplementation.mo9861z(i, callback, callback2);
    }

    public void onBatchComplete() {
        int i = this.mBatchId;
        this.mBatchId = i + 1;
        C3296b.m12892a(0, "onBatchCompleteUI").mo10750a("BatchId", i).mo10752c();
        for (C3057x0 willDispatchViewUpdates : this.mListeners) {
            willDispatchViewUpdates.willDispatchViewUpdates(this);
        }
        Iterator<UIManagerListener> it = this.mUIManagerListeners.iterator();
        while (it.hasNext()) {
            it.next().willDispatchViewUpdates(this);
        }
        try {
            if (this.mNumRootViews > 0) {
                this.mUIImplementation.mo9852n(i);
            }
        } finally {
            C3294a.m12885g(0);
        }
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.mEventDispatcher.mo9652d();
        this.mUIImplementation.mo9812D();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (C3257a.f9228i) {
            reactApplicationContext.removeLifecycleEventListener(this);
        }
        reactApplicationContext.unregisterComponentCallbacks(this.mMemoryTrimCallback);
        C2986i1.m11844a().mo8807c();
        C2932d1.m11573a();
    }

    public void onHostDestroy() {
        this.mUIImplementation.mo9813E();
    }

    public void onHostPause() {
        this.mUIImplementation.mo9814F();
    }

    public void onHostResume() {
        this.mUIImplementation.mo9815G();
    }

    @Deprecated
    public void preInitializeViewManagers(List<String> list) {
        if (C3257a.f9225f) {
            for (String S : list) {
                this.mUIImplementation.mo9826S(S);
            }
            return;
        }
        C1788a aVar = new C1788a();
        for (String next : list) {
            WritableMap computeConstantsForViewManager = computeConstantsForViewManager(next);
            if (computeConstantsForViewManager != null) {
                aVar.put(next, computeConstantsForViewManager);
            }
        }
        this.mViewManagerConstantsCacheSize = list.size();
        this.mViewManagerConstantsCache = Collections.unmodifiableMap(aVar);
    }

    public void prependUIBlock(C3039r0 r0Var) {
        this.mUIImplementation.mo9816H(r0Var);
    }

    public void profileNextBatch() {
        this.mUIImplementation.mo9817I();
    }

    public void receiveEvent(int i, int i2, String str, WritableMap writableMap) {
        ((RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class)).receiveEvent(i2, str, writableMap);
    }

    public void receiveEvent(int i, String str, WritableMap writableMap) {
        receiveEvent(-1, i, str, writableMap);
    }

    @ReactMethod
    public void removeRootView(int i) {
        this.mUIImplementation.mo9820L(i);
        this.mNumRootViews--;
    }

    @Deprecated
    @ReactMethod
    public void removeSubviewsFromContainerWithID(int i) {
        this.mUIImplementation.mo9822O(i);
    }

    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.remove(uIManagerListener);
    }

    @Deprecated
    public void removeUIManagerListener(C3057x0 x0Var) {
        this.mListeners.remove(x0Var);
    }

    @Deprecated
    @ReactMethod
    public void replaceExistingNonRootView(int i, int i2) {
        this.mUIImplementation.mo9823P(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = (java.util.Map) r1.mCustomDirectEvents.get(r2);
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String resolveCustomDirectEventName(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0014
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mCustomDirectEvents
            java.lang.Object r0 = r0.get(r2)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "registrationName"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
        L_0x0014:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.UIManagerModule.resolveCustomDirectEventName(java.lang.String):java.lang.String");
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i) {
        return C2996a.m11879b(i) ? i : this.mUIImplementation.mo9824Q(i);
    }

    public View resolveView(int i) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.mo9855r().mo9893V().mo9786w(i);
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        int a = C2996a.m11878a(i);
        if (a == 2) {
            UIManager f = C3051u0.m12089f(getReactApplicationContext(), a);
            if (f != null) {
                f.sendAccessibilityEvent(i, i2);
                return;
            }
            return;
        }
        this.mUIImplementation.mo9827T(i, i2);
    }

    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        if (DEBUG) {
            String str = "(UIManager.setChildren) tag: " + i + ", children: " + readableArray;
            C6071a.m22868b("ReactNative", str);
            C6137c.m23120a().mo18151c(C6138a.f16821f, str);
        }
        this.mUIImplementation.mo9828U(i, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        this.mUIImplementation.mo9829V(i, z);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mUIImplementation.mo9830W(z);
    }

    public void setViewHierarchyUpdateDebugListener(C2999a aVar) {
        this.mUIImplementation.mo9831X(aVar);
    }

    public void setViewLocalData(int i, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new C2914b(reactApplicationContext, i, obj));
    }

    @ReactMethod
    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.mUIImplementation.mo9833Z(i, readableArray, callback, callback2);
    }

    public <T extends View> int startSurface(T t, String str, WritableMap writableMap, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public void stopSurface(int i) {
        throw new UnsupportedOperationException();
    }

    public void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap) {
        this.mUIImplementation.mo9835a0(i, new C2962f0(readableMap));
    }

    public void updateNodeSize(int i, int i2, int i3) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.mo9837b0(i, i2, i3);
    }

    public void updateRootLayoutSpecs(int i, int i2, int i3, int i4, int i5) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new C2915c(reactApplicationContext, i, i2, i3));
    }

    @ReactMethod
    public void updateView(int i, String str, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.updateView) tag: " + i + ", class: " + str + ", props: " + readableMap;
            C6071a.m22868b("ReactNative", str2);
            C6137c.m23120a().mo18151c(C6138a.f16821f, str2);
        }
        this.mUIImplementation.mo9841e0(i, str, readableMap);
    }

    @Deprecated
    @ReactMethod
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        this.mUIImplementation.mo9845g0(i, i2, callback);
    }
}
