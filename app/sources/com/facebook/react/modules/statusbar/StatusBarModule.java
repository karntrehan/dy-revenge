package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.C2693e;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.C3038r;
import java.util.Map;
import p027c.p064i.p072j.C1988t;
import p174e.p247e.p253d.p258e.C6071a;

@C2639a(name = "StatusBarManager")
public class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    /* renamed from: com.facebook.react.modules.statusbar.StatusBarModule$a */
    class C2861a extends GuardedRunnable {

        /* renamed from: f */
        final /* synthetic */ Activity f8039f;

        /* renamed from: o */
        final /* synthetic */ boolean f8040o;

        /* renamed from: p */
        final /* synthetic */ int f8041p;

        /* renamed from: com.facebook.react.modules.statusbar.StatusBarModule$a$a */
        class C2862a implements ValueAnimator.AnimatorUpdateListener {
            C2862a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2861a.this.f8039f.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2861a(ReactContext reactContext, Activity activity, boolean z, int i) {
            super(reactContext);
            this.f8039f = activity;
            this.f8040o = z;
            this.f8041p = i;
        }

        @TargetApi(21)
        public void runGuarded() {
            this.f8039f.getWindow().addFlags(RecyclerView.UNDEFINED_DURATION);
            if (this.f8040o) {
                int statusBarColor = this.f8039f.getWindow().getStatusBarColor();
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(statusBarColor), Integer.valueOf(this.f8041p)});
                ofObject.addUpdateListener(new C2862a());
                ofObject.setDuration(300).setStartDelay(0);
                ofObject.start();
                return;
            }
            this.f8039f.getWindow().setStatusBarColor(this.f8041p);
        }
    }

    /* renamed from: com.facebook.react.modules.statusbar.StatusBarModule$b */
    class C2863b extends GuardedRunnable {

        /* renamed from: f */
        final /* synthetic */ Activity f8044f;

        /* renamed from: o */
        final /* synthetic */ boolean f8045o;

        /* renamed from: com.facebook.react.modules.statusbar.StatusBarModule$b$a */
        class C2864a implements View.OnApplyWindowInsetsListener {
            C2864a() {
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
                return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2863b(ReactContext reactContext, Activity activity, boolean z) {
            super(reactContext);
            this.f8044f = activity;
            this.f8045o = z;
        }

        @TargetApi(21)
        public void runGuarded() {
            View decorView = this.f8044f.getWindow().getDecorView();
            decorView.setOnApplyWindowInsetsListener(this.f8045o ? new C2864a() : null);
            C1988t.m8388j0(decorView);
        }
    }

    /* renamed from: com.facebook.react.modules.statusbar.StatusBarModule$c */
    class C2865c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ boolean f8048f;

        /* renamed from: o */
        final /* synthetic */ Activity f8049o;

        C2865c(boolean z, Activity activity) {
            this.f8048f = z;
            this.f8049o = activity;
        }

        public void run() {
            if (this.f8048f) {
                this.f8049o.getWindow().addFlags(1024);
                this.f8049o.getWindow().clearFlags(2048);
                return;
            }
            this.f8049o.getWindow().addFlags(2048);
            this.f8049o.getWindow().clearFlags(1024);
        }
    }

    /* renamed from: com.facebook.react.modules.statusbar.StatusBarModule$d */
    class C2866d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Activity f8051f;

        /* renamed from: o */
        final /* synthetic */ String f8052o;

        C2866d(Activity activity, String str) {
            this.f8051f = activity;
            this.f8052o = str;
        }

        @TargetApi(23)
        public void run() {
            View decorView = this.f8051f.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility("dark-content".equals(this.f8052o) ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
        }
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return NAME;
    }

    public Map<String, Object> getTypedExportedConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Activity currentActivity = getCurrentActivity();
        int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return C2693e.m10915e(HEIGHT_KEY, Float.valueOf(identifier > 0 ? C3038r.m12004a((float) reactApplicationContext.getResources().getDimensionPixelSize(identifier)) : 0.0f), DEFAULT_BACKGROUND_COLOR_KEY, currentActivity != null ? String.format("#%06X", new Object[]{Integer.valueOf(currentActivity.getWindow().getStatusBarColor() & 16777215)}) : "black");
    }

    public void setColor(double d, boolean z) {
        int i = (int) d;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C6071a.m22859G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
            return;
        }
        UiThreadUtil.runOnUiThread(new C2861a(getReactApplicationContext(), currentActivity, z, i));
    }

    public void setHidden(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C6071a.m22859G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new C2865c(z, currentActivity));
        }
    }

    public void setStyle(String str) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C6071a.m22859G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT >= 23) {
            UiThreadUtil.runOnUiThread(new C2866d(currentActivity, str));
        }
    }

    public void setTranslucent(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C6071a.m22859G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new C2863b(getReactApplicationContext(), currentActivity, z));
        }
    }
}
