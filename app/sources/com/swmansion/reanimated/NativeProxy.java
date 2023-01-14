package com.swmansion.reanimated;

import android.os.SystemClock;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.C2775m;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.C9911d;
import com.swmansion.reanimated.layoutReanimation.C9943e;
import com.swmansion.reanimated.layoutReanimation.LayoutAnimations;
import com.swmansion.reanimated.p439i.C9925d;
import com.swmansion.reanimated.p440j.C9929b;
import com.swmansion.reanimated.p440j.C9931d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p174e.p247e.p317m.p318a.C6410a;
import p174e.p446g.p447a.C10191a;

public class NativeProxy {

    /* renamed from: a */
    private C9911d f26456a;

    /* renamed from: b */
    private final WeakReference<ReactApplicationContext> f26457b;

    /* renamed from: c */
    private Scheduler f26458c = null;

    /* renamed from: d */
    private C9929b f26459d;

    /* renamed from: e */
    private final C10191a f26460e;

    /* renamed from: f */
    private C9925d f26461f;

    /* renamed from: g */
    private Long f26462g = Long.valueOf(SystemClock.uptimeMillis());

    /* renamed from: h */
    private boolean f26463h = false;
    @C6410a
    private final HybridData mHybridData;

    @C6410a
    public static class AnimationFrameCallback implements C9911d.C9916e {
        @C6410a
        private final HybridData mHybridData;

        @C6410a
        private AnimationFrameCallback(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native void onAnimationFrame(double d);
    }

    @C6410a
    public static class EventHandler implements RCTEventEmitter {
        /* access modifiers changed from: private */
        public UIManagerModule.C2916d mCustomEventNamesResolver;
        @C6410a
        private final HybridData mHybridData;

        @C6410a
        private EventHandler(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public void receiveEvent(int i, String str, WritableMap writableMap) {
            String a = this.mCustomEventNamesResolver.mo9441a(str);
            receiveEvent(i + a, writableMap);
        }

        public native void receiveEvent(String str, WritableMap writableMap);

        public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        }
    }

    @C6410a
    public static class KeyboardEventDataUpdater {
        @C6410a
        private final HybridData mHybridData;

        @C6410a
        private KeyboardEventDataUpdater(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native void keyboardEventDataUpdater(int i, int i2);
    }

    @C6410a
    public static class SensorSetter {
        @C6410a
        private final HybridData mHybridData;

        @C6410a
        private SensorSetter(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native void sensorSetter(float[] fArr);
    }

    /* renamed from: com.swmansion.reanimated.NativeProxy$a */
    class C9893a implements C9943e {

        /* renamed from: a */
        final /* synthetic */ WeakReference f26464a;

        /* renamed from: b */
        final /* synthetic */ LayoutAnimations f26465b;

        C9893a(WeakReference weakReference, LayoutAnimations layoutAnimations) {
            this.f26464a = weakReference;
            this.f26465b = layoutAnimations;
        }

        /* renamed from: a */
        public void mo24764a(int i) {
            LayoutAnimations layoutAnimations = (LayoutAnimations) this.f26464a.get();
            if (layoutAnimations != null) {
                layoutAnimations.removeConfigForTag(i);
            }
        }

        /* renamed from: b */
        public boolean mo24765b() {
            return this.f26465b.isLayoutAnimationEnabled();
        }

        /* renamed from: c */
        public void mo24766c(int i, String str, HashMap<String, Float> hashMap) {
            LayoutAnimations layoutAnimations = (LayoutAnimations) this.f26464a.get();
            if (layoutAnimations != null) {
                HashMap hashMap2 = new HashMap();
                for (String next : hashMap.keySet()) {
                    hashMap2.put(next, hashMap.get(next).toString());
                }
                layoutAnimations.startAnimationForTag(i, str, hashMap2);
            }
        }
    }

    static {
        System.loadLibrary("reanimated");
    }

    public NativeProxy(ReactApplicationContext reactApplicationContext) {
        C10191a aVar = null;
        LayoutAnimations layoutAnimations = new LayoutAnimations(reactApplicationContext);
        this.f26458c = new Scheduler(reactApplicationContext);
        this.mHybridData = initHybrid(reactApplicationContext.getJavaScriptContextHolder().get(), (CallInvokerHolderImpl) reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder(), this.f26458c, layoutAnimations);
        WeakReference<ReactApplicationContext> weakReference = new WeakReference<>(reactApplicationContext);
        this.f26457b = weakReference;
        mo24758e(layoutAnimations);
        this.f26459d = new C9929b(weakReference);
        this.f26461f = new C9925d(weakReference);
        m33731a();
        try {
            aVar = (C10191a) reactApplicationContext.getNativeModule(Class.forName("com.swmansion.gesturehandler.react.RNGestureHandlerModule"));
        } catch (ClassCastException | ClassNotFoundException unused) {
        }
        this.f26460e = aVar;
    }

    /* renamed from: a */
    private void m33731a() {
        if (((ReactApplicationContext) this.f26457b.get()).getApplicationContext() instanceof C2775m) {
            ((C2775m) ((ReactApplicationContext) this.f26457b.get()).getApplicationContext()).mo9081a().mo9345i().mo9292y().mo8889l("Toggle slow animations (Reanimated)", new C9908a(this));
        }
    }

    /* renamed from: b */
    private Set<String> m33732b(ReadableNativeArray readableNativeArray) {
        HashSet hashSet = new HashSet();
        ArrayList<Object> arrayList = readableNativeArray.toArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            hashSet.add((String) arrayList.get(i));
        }
        return hashSet;
    }

    @C6410a
    private void configureProps(ReadableNativeArray readableNativeArray, ReadableNativeArray readableNativeArray2) {
        this.f26456a.mo24800g(m33732b(readableNativeArray), m33732b(readableNativeArray2));
    }

    @C6410a
    private long getCurrentTime() {
        return this.f26463h ? this.f26462g.longValue() + ((SystemClock.uptimeMillis() - this.f26462g.longValue()) / 10) : SystemClock.uptimeMillis();
    }

    private native HybridData initHybrid(long j, CallInvokerHolderImpl callInvokerHolderImpl, Scheduler scheduler, LayoutAnimations layoutAnimations);

    private native void installJSIBindings();

    @C6410a
    private float[] measure(int i) {
        return this.f26456a.mo24786A(i);
    }

    @C6410a
    private String obtainProp(int i, String str) {
        return this.f26456a.mo24787B(i, str);
    }

    @C6410a
    private void registerEventHandler(EventHandler eventHandler) {
        UIManagerModule.C2916d unused = eventHandler.mCustomEventNamesResolver = this.f26456a.mo24811t();
        this.f26456a.mo24793J(eventHandler);
    }

    @C6410a
    private int registerSensor(int i, int i2, SensorSetter sensorSetter) {
        return this.f26459d.mo24824a(C9931d.m33833e(i), i2, sensorSetter);
    }

    @C6410a
    private void requestRender(AnimationFrameCallback animationFrameCallback) {
        this.f26456a.mo24791H(animationFrameCallback);
    }

    @C6410a
    private void scrollTo(int i, double d, double d2, boolean z) {
        this.f26456a.mo24794K(i, d, d2, z);
    }

    @C6410a
    private void setGestureState(int i, int i2) {
        C10191a aVar = this.f26460e;
        if (aVar != null) {
            aVar.setGestureHandlerState(i, i2);
        }
    }

    @C6410a
    private int subscribeForKeyboardEvents(KeyboardEventDataUpdater keyboardEventDataUpdater) {
        return this.f26461f.mo24819k(keyboardEventDataUpdater);
    }

    @C6410a
    private void unregisterSensor(int i) {
        this.f26459d.mo24825b(i);
    }

    @C6410a
    private void unsubscribeFromKeyboardEvents(int i) {
        this.f26461f.mo24820l(i);
    }

    @C6410a
    private void updateProps(int i, Map<String, Object> map) {
        this.f26456a.mo24798P(i, map);
    }

    /* renamed from: c */
    public Scheduler mo24756c() {
        return this.f26458c;
    }

    /* renamed from: d */
    public void mo24757d() {
        this.f26458c.mo24783c();
        this.mHybridData.resetNative();
    }

    /* renamed from: e */
    public void mo24758e(LayoutAnimations layoutAnimations) {
        Class cls = ReanimatedModule.class;
        if (C9921h.f26544a) {
            Log.w("[REANIMATED]", "You can not use LayoutAnimation with enabled Chrome Debugger");
            return;
        }
        this.f26456a = ((ReanimatedModule) ((ReactApplicationContext) this.f26457b.get()).getNativeModule(cls)).getNodesManager();
        installJSIBindings();
        ((ReanimatedModule) ((ReactApplicationContext) this.f26457b.get()).getNativeModule(cls)).getNodesManager().mo24810s().mo24843m(new C9893a(new WeakReference(layoutAnimations), layoutAnimations));
    }

    public native boolean isAnyHandlerWaitingForEvent(String str);
}
