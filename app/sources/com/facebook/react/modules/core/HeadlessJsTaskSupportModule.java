package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p108a0.C2581b;
import com.facebook.react.p109b0.p110a.C2639a;
import p174e.p247e.p253d.p258e.C6071a;

@C2639a(name = "HeadlessJsTaskSupport")
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    public static final String NAME = "HeadlessJsTaskSupport";

    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return NAME;
    }

    public void notifyTaskFinished(double d) {
        int i = (int) d;
        C2581b e = C2581b.m10755e(getReactApplicationContext());
        if (e.mo8395g(i)) {
            e.mo8393d(i);
            return;
        }
        C6071a.m22857E(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i));
    }

    public void notifyTaskRetry(double d, Promise promise) {
        Boolean bool;
        int i = (int) d;
        C2581b e = C2581b.m10755e(getReactApplicationContext());
        if (e.mo8395g(i)) {
            bool = Boolean.valueOf(e.mo8397j(i));
        } else {
            C6071a.m22857E(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i));
            bool = Boolean.FALSE;
        }
        promise.resolve(bool);
    }
}
