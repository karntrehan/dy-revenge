package com.facebook.react.views.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.C2768i;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.p116f0.p117a.C2757a;
import com.facebook.react.uimanager.C2929d;
import com.facebook.react.uimanager.C2984i;
import com.facebook.react.uimanager.C2990j0;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.views.view.C3245g;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2Connection;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.views.modal.c */
public class C3115c extends ViewGroup implements LifecycleEventListener {

    /* renamed from: f */
    private C3117b f8659f;

    /* renamed from: o */
    private Dialog f8660o;

    /* renamed from: p */
    private boolean f8661p;

    /* renamed from: q */
    private boolean f8662q;

    /* renamed from: r */
    private String f8663r;

    /* renamed from: s */
    private boolean f8664s;

    /* renamed from: t */
    private boolean f8665t;

    /* renamed from: u */
    private DialogInterface.OnShowListener f8666u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C3120c f8667v;

    /* renamed from: com.facebook.react.views.modal.c$a */
    class C3116a implements DialogInterface.OnKeyListener {
        C3116a() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 1) {
                return false;
            }
            if (i == 4 || i == 111) {
                C6409a.m24522d(C3115c.this.f8667v, "setOnRequestCloseListener must be called by the manager");
                C3115c.this.f8667v.mo10008a(dialogInterface);
                return true;
            }
            Activity currentActivity = ((ReactContext) C3115c.this.getContext()).getCurrentActivity();
            if (currentActivity != null) {
                return currentActivity.onKeyUp(i, keyEvent);
            }
            return false;
        }
    }

    /* renamed from: com.facebook.react.views.modal.c$b */
    static class C3117b extends C3245g implements C2990j0 {

        /* renamed from: F */
        private boolean f8669F = false;
        /* access modifiers changed from: private */

        /* renamed from: G */
        public int f8670G;
        /* access modifiers changed from: private */

        /* renamed from: H */
        public int f8671H;

        /* renamed from: I */
        private C2945d f8672I;

        /* renamed from: J */
        private final C2929d f8673J = new C2929d();

        /* renamed from: K */
        private final C2984i f8674K = new C2984i(this);

        /* renamed from: com.facebook.react.views.modal.c$b$a */
        class C3118a extends GuardedRunnable {

            /* renamed from: f */
            final /* synthetic */ int f8675f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3118a(ReactContext reactContext, int i) {
                super(reactContext);
                this.f8675f = i;
            }

            public void runGuarded() {
                UIManagerModule uIManagerModule = (UIManagerModule) C3117b.this.m12259F().getNativeModule(UIManagerModule.class);
                if (uIManagerModule != null) {
                    uIManagerModule.updateNodeSize(this.f8675f, C3117b.this.f8670G, C3117b.this.f8671H);
                }
            }
        }

        /* renamed from: com.facebook.react.views.modal.c$b$b */
        class C3119b implements C2929d.C2930a {

            /* renamed from: a */
            final /* synthetic */ float f8677a;

            /* renamed from: b */
            final /* synthetic */ float f8678b;

            C3119b(float f, float f2) {
                this.f8677a = f;
                this.f8678b = f2;
            }

            /* renamed from: a */
            public WritableMap mo9497a() {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("screenWidth", (double) this.f8677a);
                writableNativeMap.putDouble("screenHeight", (double) this.f8678b);
                return writableNativeMap;
            }
        }

        public C3117b(Context context) {
            super(context);
        }

        /* access modifiers changed from: private */
        /* renamed from: F */
        public ReactContext m12259F() {
            return (ReactContext) getContext();
        }

        /* access modifiers changed from: private */
        /* renamed from: G */
        public void m12260G(C2945d dVar) {
            this.f8672I = dVar;
        }

        /* renamed from: H */
        private void m12261H() {
            if (getChildCount() > 0) {
                this.f8669F = false;
                int id = getChildAt(0).getId();
                if (this.f8673J.mo9494b()) {
                    mo10033I(this.f8670G, this.f8671H);
                    return;
                }
                ReactContext F = m12259F();
                F.runOnNativeModulesQueueThread(new C3118a(F, id));
                return;
            }
            this.f8669F = true;
        }

        /* renamed from: I */
        public void mo10033I(int i, int i2) {
            float a = C3038r.m12004a((float) i);
            float a2 = C3038r.m12004a((float) i2);
            ReadableMap a3 = getFabricViewStateManager().mo9493a();
            if (a3 != null) {
                float f = 0.0f;
                float f2 = a3.hasKey("screenHeight") ? (float) a3.getDouble("screenHeight") : 0.0f;
                if (a3.hasKey("screenWidth")) {
                    f = (float) a3.getDouble("screenWidth");
                }
                if (Math.abs(f - a) < 0.9f && Math.abs(f2 - a2) < 0.9f) {
                    return;
                }
            }
            this.f8673J.mo9495c(new C3119b(a, a2));
        }

        public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            super.addView(view, i, layoutParams);
            if (this.f8669F) {
                m12261H();
            }
        }

        /* renamed from: e */
        public void mo9713e(Throwable th) {
            m12259F().handleException(new RuntimeException(th));
        }

        /* renamed from: g */
        public void mo9714g(MotionEvent motionEvent) {
            this.f8674K.mo9688e(motionEvent, this.f8672I);
        }

        public C2929d getFabricViewStateManager() {
            return this.f8673J;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.f8674K.mo9687d(motionEvent, this.f8672I);
            return super.onInterceptTouchEvent(motionEvent);
        }

        /* access modifiers changed from: protected */
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.f8670G = i;
            this.f8671H = i2;
            m12261H();
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            this.f8674K.mo9687d(motionEvent, this.f8672I);
            super.onTouchEvent(motionEvent);
            return true;
        }

        public void requestDisallowInterceptTouchEvent(boolean z) {
        }
    }

    /* renamed from: com.facebook.react.views.modal.c$c */
    public interface C3120c {
        /* renamed from: a */
        void mo10008a(DialogInterface dialogInterface);
    }

    public C3115c(Context context) {
        super(context);
        ((ReactContext) context).addLifecycleEventListener(this);
        this.f8659f = new C3117b(context);
    }

    /* renamed from: b */
    private void m12250b() {
        Activity activity;
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.f8660o;
        if (dialog != null) {
            if (dialog.isShowing() && ((activity = (Activity) C2757a.m11062a(this.f8660o.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                this.f8660o.dismiss();
            }
            this.f8660o = null;
            ((ViewGroup) this.f8659f.getParent()).removeViewAt(0);
        }
    }

    /* renamed from: e */
    private void m12251e() {
        C6409a.m24522d(this.f8660o, "mDialog must exist when we call updateProperties");
        Activity currentActivity = getCurrentActivity();
        Window window = this.f8660o.getWindow();
        if (currentActivity != null && !currentActivity.isFinishing() && window.isActive()) {
            if ((currentActivity.getWindow().getAttributes().flags & 1024) != 0) {
                window.addFlags(1024);
            } else {
                window.clearFlags(1024);
            }
            if (this.f8661p) {
                window.clearFlags(2);
                return;
            }
            window.setDimAmount(0.5f);
            window.setFlags(2, 2);
        }
    }

    private View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.f8659f);
        if (this.f8662q) {
            frameLayout.setSystemUiVisibility(1024);
        } else {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private Activity getCurrentActivity() {
        return ((ReactContext) getContext()).getCurrentActivity();
    }

    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    public void addView(View view, int i) {
        UiThreadUtil.assertOnUiThread();
        this.f8659f.addView(view, i);
    }

    /* renamed from: c */
    public void mo10012c() {
        ((ReactContext) getContext()).removeLifecycleEventListener(this);
        m12250b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo10013d() {
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.f8660o;
        if (dialog != null) {
            Context context = (Context) C2757a.m11062a(dialog.getContext(), Activity.class);
            C6071a.m22875i("ReactModalHost", "Updating existing dialog with context: " + context + "@" + context.hashCode());
            if (this.f8665t) {
                m12250b();
            } else {
                m12251e();
                return;
            }
        }
        this.f8665t = false;
        int i = C2768i.Theme_FullScreenDialog;
        if (this.f8663r.equals("fade")) {
            i = C2768i.Theme_FullScreenDialogAnimatedFade;
        } else if (this.f8663r.equals("slide")) {
            i = C2768i.Theme_FullScreenDialogAnimatedSlide;
        }
        Activity currentActivity = getCurrentActivity();
        Context context2 = currentActivity == null ? getContext() : currentActivity;
        Dialog dialog2 = new Dialog(context2, i);
        this.f8660o = dialog2;
        dialog2.getWindow().setFlags(8, 8);
        C6071a.m22875i("ReactModalHost", "Creating new dialog from context: " + context2 + "@" + context2.hashCode());
        this.f8660o.setContentView(getContentView());
        m12251e();
        this.f8660o.setOnShowListener(this.f8666u);
        this.f8660o.setOnKeyListener(new C3116a());
        this.f8660o.getWindow().setSoftInputMode(16);
        if (this.f8664s) {
            this.f8660o.getWindow().addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        }
        if (currentActivity != null && !currentActivity.isFinishing()) {
            this.f8660o.show();
            if (context2 instanceof Activity) {
                this.f8660o.getWindow().getDecorView().setSystemUiVisibility(((Activity) context2).getWindow().getDecorView().getSystemUiVisibility());
            }
            this.f8660o.getWindow().clearFlags(8);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        this.f8659f.dispatchProvideStructure(viewStructure);
    }

    /* renamed from: f */
    public void mo10016f(int i, int i2) {
        this.f8659f.mo10033I(i, i2);
    }

    public View getChildAt(int i) {
        return this.f8659f.getChildAt(i);
    }

    public int getChildCount() {
        return this.f8659f.getChildCount();
    }

    public Dialog getDialog() {
        return this.f8660o;
    }

    public C2929d getFabricViewStateManager() {
        return this.f8659f.getFabricViewStateManager();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m12250b();
    }

    public void onHostDestroy() {
        mo10012c();
    }

    public void onHostPause() {
    }

    public void onHostResume() {
        mo10013d();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        this.f8659f.removeView(view);
    }

    public void removeViewAt(int i) {
        UiThreadUtil.assertOnUiThread();
        this.f8659f.removeView(getChildAt(i));
    }

    /* access modifiers changed from: protected */
    public void setAnimationType(String str) {
        this.f8663r = str;
        this.f8665t = true;
    }

    /* access modifiers changed from: package-private */
    public void setEventDispatcher(C2945d dVar) {
        this.f8659f.m12260G(dVar);
    }

    /* access modifiers changed from: protected */
    public void setHardwareAccelerated(boolean z) {
        this.f8664s = z;
        this.f8665t = true;
    }

    /* access modifiers changed from: protected */
    public void setOnRequestCloseListener(C3120c cVar) {
        this.f8667v = cVar;
    }

    /* access modifiers changed from: protected */
    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f8666u = onShowListener;
    }

    /* access modifiers changed from: protected */
    public void setStatusBarTranslucent(boolean z) {
        this.f8662q = z;
        this.f8665t = true;
    }

    /* access modifiers changed from: protected */
    public void setTransparent(boolean z) {
        this.f8661p = z;
    }
}
