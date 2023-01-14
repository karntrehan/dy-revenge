package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeTimingSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.devsupport.p114j.C2730d;
import com.facebook.react.p108a0.C2581b;
import com.facebook.react.p108a0.C2585c;
import com.facebook.react.p109b0.p110a.C2639a;

@C2639a(name = "Timing")
public final class TimingModule extends NativeTimingSpec implements LifecycleEventListener, C2585c {
    public static final String NAME = "Timing";
    private final C2795d mJavaTimerManager;

    /* renamed from: com.facebook.react.modules.core.TimingModule$a */
    public class C2789a implements C2794c {
        public C2789a() {
        }

        public void callIdleCallbacks(double d) {
            ReactApplicationContext access$100 = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (access$100 != null) {
                ((JSTimers) access$100.getJSModule(JSTimers.class)).callIdleCallbacks(d);
            }
        }

        public void callTimers(WritableArray writableArray) {
            ReactApplicationContext access$000 = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (access$000 != null) {
                ((JSTimers) access$000.getJSModule(JSTimers.class)).callTimers(writableArray);
            }
        }

        public void emitTimeDriftWarning(String str) {
            ReactApplicationContext access$200 = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (access$200 != null) {
                ((JSTimers) access$200.getJSModule(JSTimers.class)).emitTimeDriftWarning(str);
            }
        }
    }

    public TimingModule(ReactApplicationContext reactApplicationContext, C2730d dVar) {
        super(reactApplicationContext);
        this.mJavaTimerManager = new C2795d(reactApplicationContext, new C2789a(), C2804g.m11194i(), dVar);
    }

    public void createTimer(double d, double d2, double d3, boolean z) {
        this.mJavaTimerManager.mo9135q((int) d, (int) d2, d3, z);
    }

    public void deleteTimer(double d) {
        this.mJavaTimerManager.deleteTimer((int) d);
    }

    public String getName() {
        return NAME;
    }

    public boolean hasActiveTimersInRange(long j) {
        return this.mJavaTimerManager.mo9136r(j);
    }

    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        C2581b.m10755e(getReactApplicationContext()).mo8392c(this);
    }

    public void invalidate() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C2581b.m10755e(reactApplicationContext).mo8396h(this);
        this.mJavaTimerManager.mo9132A();
        reactApplicationContext.removeLifecycleEventListener(this);
    }

    public void onHeadlessJsTaskFinish(int i) {
        this.mJavaTimerManager.mo9138v(i);
    }

    public void onHeadlessJsTaskStart(int i) {
        this.mJavaTimerManager.mo9139w(i);
    }

    public void onHostDestroy() {
        this.mJavaTimerManager.mo9140x();
    }

    public void onHostPause() {
        this.mJavaTimerManager.mo9141y();
    }

    public void onHostResume() {
        this.mJavaTimerManager.mo9142z();
    }

    public void setSendIdleEvents(boolean z) {
        this.mJavaTimerManager.setSendIdleEvents(z);
    }
}
