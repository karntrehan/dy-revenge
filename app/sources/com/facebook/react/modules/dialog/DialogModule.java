package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.C1214c;
import androidx.fragment.app.C1231l;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.C2693e;
import com.facebook.react.p109b0.p110a.C2639a;
import java.util.Map;
import p174e.p247e.p253d.p258e.C6071a;

@C2639a(name = "DialogManagerAndroid")
public class DialogModule extends NativeDialogManagerAndroidSpec implements LifecycleEventListener {
    static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    static final String ACTION_DISMISSED = "dismissed";
    static final Map<String, Object> CONSTANTS = C2693e.m10918h(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, ACTION_DISMISSED, ACTION_DISMISSED, KEY_BUTTON_POSITIVE, -1, KEY_BUTTON_NEGATIVE, -2, KEY_BUTTON_NEUTRAL, -3);
    static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    static final String KEY_CANCELABLE = "cancelable";
    static final String KEY_ITEMS = "items";
    static final String KEY_MESSAGE = "message";
    static final String KEY_TITLE = "title";
    public static final String NAME = "DialogManagerAndroid";
    /* access modifiers changed from: private */
    public boolean mIsInForeground;

    /* renamed from: com.facebook.react.modules.dialog.DialogModule$a */
    class C2816a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2818c f7958f;

        /* renamed from: o */
        final /* synthetic */ Bundle f7959o;

        /* renamed from: p */
        final /* synthetic */ Callback f7960p;

        C2816a(C2818c cVar, Bundle bundle, Callback callback) {
            this.f7958f = cVar;
            this.f7959o = bundle;
            this.f7960p = callback;
        }

        public void run() {
            this.f7958f.mo9179b(this.f7959o, this.f7960p);
        }
    }

    /* renamed from: com.facebook.react.modules.dialog.DialogModule$b */
    class C2817b implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* renamed from: f */
        private final Callback f7962f;

        /* renamed from: o */
        private boolean f7963o = false;

        public C2817b(Callback callback) {
            this.f7962f = callback;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!this.f7963o && DialogModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                this.f7962f.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i));
                this.f7963o = true;
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.f7963o && DialogModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                this.f7962f.invoke(DialogModule.ACTION_DISMISSED);
                this.f7963o = true;
            }
        }
    }

    /* renamed from: com.facebook.react.modules.dialog.DialogModule$c */
    private class C2818c {

        /* renamed from: a */
        private final C1231l f7965a;

        /* renamed from: b */
        private Object f7966b;

        public C2818c(C1231l lVar) {
            this.f7965a = lVar;
        }

        /* renamed from: a */
        private void m11228a() {
            AlertFragment alertFragment;
            if (DialogModule.this.mIsInForeground && (alertFragment = (AlertFragment) this.f7965a.mo4131Z(DialogModule.FRAGMENT_TAG)) != null && alertFragment.mo3881Y()) {
                alertFragment.mo3831w1();
            }
        }

        /* renamed from: b */
        public void mo9179b(Bundle bundle, Callback callback) {
            UiThreadUtil.assertOnUiThread();
            m11228a();
            AlertFragment alertFragment = new AlertFragment(callback != null ? new C2817b(callback) : null, bundle);
            if (!DialogModule.this.mIsInForeground || this.f7965a.mo4164w0()) {
                this.f7966b = alertFragment;
                return;
            }
            if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                alertFragment.mo3817C1(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
            }
            alertFragment.mo3822F1(this.f7965a, DialogModule.FRAGMENT_TAG);
        }

        /* renamed from: c */
        public void mo9180c() {
            UiThreadUtil.assertOnUiThread();
            SoftAssertions.assertCondition(DialogModule.this.mIsInForeground, "showPendingAlert() called in background");
            if (this.f7966b != null) {
                m11228a();
                ((AlertFragment) this.f7966b).mo3822F1(this.f7965a, DialogModule.FRAGMENT_TAG);
                this.f7966b = null;
            }
        }
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private C2818c getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof C1214c)) {
            return null;
        }
        return new C2818c(((C1214c) currentActivity).mo4006q());
    }

    public String getName() {
        return NAME;
    }

    public Map<String, Object> getTypedExportedConstants() {
        return CONSTANTS;
    }

    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    public void invalidate() {
        super.invalidate();
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.removeLifecycleEventListener(this);
        }
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mIsInForeground = false;
    }

    public void onHostResume() {
        this.mIsInForeground = true;
        C2818c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.mo9180c();
        } else {
            C6071a.m22855C(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    public void showAlert(ReadableMap readableMap, Callback callback, Callback callback2) {
        C2818c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle bundle = new Bundle();
        if (readableMap.hasKey(KEY_TITLE)) {
            bundle.putString(KEY_TITLE, readableMap.getString(KEY_TITLE));
        }
        if (readableMap.hasKey(KEY_MESSAGE)) {
            bundle.putString(KEY_MESSAGE, readableMap.getString(KEY_MESSAGE));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey(KEY_ITEMS)) {
            ReadableArray array = readableMap.getArray(KEY_ITEMS);
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i = 0; i < array.size(); i++) {
                charSequenceArr[i] = array.getString(i);
            }
            bundle.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (readableMap.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, readableMap.getBoolean(KEY_CANCELABLE));
        }
        UiThreadUtil.runOnUiThread(new C2816a(fragmentManagerHelper, bundle, callback2));
    }
}
