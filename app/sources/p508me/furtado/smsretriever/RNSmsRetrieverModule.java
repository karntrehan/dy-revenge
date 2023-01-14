package p508me.furtado.smsretriever;

import android.app.Activity;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import p508me.furtado.smsretriever.C10856b;

/* renamed from: me.furtado.smsretriever.RNSmsRetrieverModule */
final class RNSmsRetrieverModule extends ReactContextBaseJavaModule {
    private final C10856b mPhoneNumberHelper = new C10856b();
    private final C10863e mSmsHelper;

    /* renamed from: me.furtado.smsretriever.RNSmsRetrieverModule$a */
    class C10854a implements C10856b.C10860d {

        /* renamed from: a */
        final /* synthetic */ ReactApplicationContext f28410a;

        /* renamed from: b */
        final /* synthetic */ ActivityEventListener f28411b;

        C10854a(ReactApplicationContext reactApplicationContext, ActivityEventListener activityEventListener) {
            this.f28410a = reactApplicationContext;
            this.f28411b = activityEventListener;
        }

        /* renamed from: a */
        public void mo26888a() {
            this.f28410a.removeActivityEventListener(this.f28411b);
        }
    }

    RNSmsRetrieverModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mSmsHelper = new C10863e(reactApplicationContext);
    }

    public String getName() {
        return "RNSmsRetrieverModule";
    }

    @ReactMethod
    public void requestPhoneNumber(Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Activity currentActivity = getCurrentActivity();
        ActivityEventListener e = this.mPhoneNumberHelper.mo26889e();
        reactApplicationContext.addActivityEventListener(e);
        this.mPhoneNumberHelper.mo26891j(new C10854a(reactApplicationContext, e));
        this.mPhoneNumberHelper.mo26890i(reactApplicationContext, currentActivity, promise);
    }

    @ReactMethod
    public void startSmsRetriever(Promise promise) {
        this.mSmsHelper.mo26893g(promise);
    }
}
