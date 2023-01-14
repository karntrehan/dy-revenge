package com.facebook.react;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.C2923b0;
import com.facebook.react.uimanager.C2926c;
import com.facebook.react.uimanager.C2981h;
import com.facebook.react.uimanager.C2984i;
import com.facebook.react.uimanager.C2990j0;
import com.facebook.react.uimanager.C2995k0;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.systrace.C3294a;
import java.util.concurrent.atomic.AtomicInteger;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.w */
public class C3249w extends FrameLayout implements C2990j0, C2923b0 {

    /* renamed from: A */
    private int f9187A = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* renamed from: B */
    private int f9188B = 0;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f9189C = 0;

    /* renamed from: D */
    private int f9190D = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: E */
    private int f9191E = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: F */
    private int f9192F = 1;

    /* renamed from: G */
    private final AtomicInteger f9193G = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2886o f9194f;

    /* renamed from: o */
    private String f9195o;

    /* renamed from: p */
    private Bundle f9196p;

    /* renamed from: q */
    private String f9197q;

    /* renamed from: r */
    private C3250a f9198r;

    /* renamed from: s */
    private C3251b f9199s;

    /* renamed from: t */
    private int f9200t = 0;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f9201u;

    /* renamed from: v */
    private boolean f9202v;

    /* renamed from: w */
    private C2984i f9203w;

    /* renamed from: x */
    private final C2774l f9204x = new C2774l(this);

    /* renamed from: y */
    private boolean f9205y = false;

    /* renamed from: z */
    private int f9206z = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* renamed from: com.facebook.react.w$a */
    private class C3250a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: f */
        private final Rect f9207f;

        /* renamed from: o */
        private final int f9208o;

        /* renamed from: p */
        private int f9209p = 0;

        /* renamed from: q */
        private int f9210q = 0;

        C3250a() {
            C2926c.m11507f(C3249w.this.getContext().getApplicationContext());
            this.f9207f = new Rect();
            this.f9208o = (int) C3038r.m12006c(60.0f);
        }

        /* renamed from: a */
        private void m12752a() {
            m12757f();
        }

        /* renamed from: b */
        private void m12753b() {
            int rotation = ((WindowManager) C3249w.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.f9210q != rotation) {
                this.f9210q = rotation;
                C2926c.m11506e(C3249w.this.getContext().getApplicationContext());
                m12756e(rotation);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
            r0 = (r0 = r11.f9211r.getRootView().getRootWindowInsets()).getDisplayCutout();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m12754c() {
            /*
                r11 = this;
                com.facebook.react.w r0 = com.facebook.react.C3249w.this
                android.view.View r0 = r0.getRootView()
                android.graphics.Rect r1 = r11.f9207f
                r0.getWindowVisibleDisplayFrame(r1)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 0
                r2 = 28
                if (r0 < r2) goto L_0x0029
                com.facebook.react.w r0 = com.facebook.react.C3249w.this
                android.view.View r0 = r0.getRootView()
                android.view.WindowInsets r0 = r0.getRootWindowInsets()
                if (r0 == 0) goto L_0x0029
                android.view.DisplayCutout r0 = r0.getDisplayCutout()
                if (r0 == 0) goto L_0x0029
                int r0 = r0.getSafeInsetTop()
                goto L_0x002a
            L_0x0029:
                r0 = 0
            L_0x002a:
                android.util.DisplayMetrics r2 = com.facebook.react.uimanager.C2926c.m11505d()
                int r2 = r2.heightPixels
                android.graphics.Rect r3 = r11.f9207f
                int r3 = r3.bottom
                int r2 = r2 - r3
                int r2 = r2 + r0
                int r0 = r11.f9209p
                r4 = 1
                if (r0 == r2) goto L_0x0041
                int r5 = r11.f9208o
                if (r2 <= r5) goto L_0x0041
                r5 = 1
                goto L_0x0042
            L_0x0041:
                r5 = 0
            L_0x0042:
                if (r5 == 0) goto L_0x0077
                r11.f9209p = r2
                com.facebook.react.w r0 = com.facebook.react.C3249w.this
                float r1 = (float) r3
                float r1 = com.facebook.react.uimanager.C3038r.m12004a(r1)
                double r3 = (double) r1
                android.graphics.Rect r1 = r11.f9207f
                int r1 = r1.left
                float r1 = (float) r1
                float r1 = com.facebook.react.uimanager.C3038r.m12004a(r1)
                double r5 = (double) r1
                android.graphics.Rect r1 = r11.f9207f
                int r1 = r1.width()
                float r1 = (float) r1
                float r1 = com.facebook.react.uimanager.C3038r.m12004a(r1)
                double r7 = (double) r1
                int r1 = r11.f9209p
                float r1 = (float) r1
                float r1 = com.facebook.react.uimanager.C3038r.m12004a(r1)
                double r9 = (double) r1
                r2 = r11
                com.facebook.react.bridge.WritableMap r1 = r2.m12755d(r3, r5, r7, r9)
                java.lang.String r2 = "keyboardDidShow"
                r0.mo10692n(r2, r1)
                return
            L_0x0077:
                if (r0 == 0) goto L_0x007e
                int r0 = r11.f9208o
                if (r2 > r0) goto L_0x007e
                goto L_0x007f
            L_0x007e:
                r4 = 0
            L_0x007f:
                if (r4 == 0) goto L_0x00a9
                r11.f9209p = r1
                com.facebook.react.w r0 = com.facebook.react.C3249w.this
                int r1 = r0.f9189C
                float r1 = (float) r1
                float r1 = com.facebook.react.uimanager.C3038r.m12004a(r1)
                double r3 = (double) r1
                r5 = 0
                android.graphics.Rect r1 = r11.f9207f
                int r1 = r1.width()
                float r1 = (float) r1
                float r1 = com.facebook.react.uimanager.C3038r.m12004a(r1)
                double r7 = (double) r1
                r9 = 0
                r2 = r11
                com.facebook.react.bridge.WritableMap r1 = r2.m12755d(r3, r5, r7, r9)
                java.lang.String r2 = "keyboardDidHide"
                r0.mo10692n(r2, r1)
            L_0x00a9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.C3249w.C3250a.m12754c():void");
        }

        /* renamed from: d */
        private WritableMap m12755d(double d, double d2, double d3, double d4) {
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble("height", d4);
            createMap2.putDouble("screenX", d2);
            createMap2.putDouble("width", d3);
            createMap2.putDouble("screenY", d);
            createMap.putMap("endCoordinates", createMap2);
            createMap.putString("easing", "keyboard");
            createMap.putDouble("duration", 0.0d);
            return createMap;
        }

        /* renamed from: e */
        private void m12756e(int i) {
            String str;
            double d;
            double d2;
            boolean z = true;
            if (i != 0) {
                if (i == 1) {
                    d = -90.0d;
                    str = "landscape-primary";
                } else if (i == 2) {
                    d2 = 180.0d;
                    str = "portrait-secondary";
                } else if (i == 3) {
                    d = 90.0d;
                    str = "landscape-secondary";
                } else {
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("name", str);
                createMap.putDouble("rotationDegrees", d);
                createMap.putBoolean("isLandscape", z);
                C3249w.this.mo10692n("namedOrientationDidChange", createMap);
            }
            d2 = 0.0d;
            str = "portrait-primary";
            d = d2;
            z = false;
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("name", str);
            createMap2.putDouble("rotationDegrees", d);
            createMap2.putBoolean("isLandscape", z);
            C3249w.this.mo10692n("namedOrientationDidChange", createMap2);
        }

        /* renamed from: f */
        private void m12757f() {
            DeviceInfoModule deviceInfoModule = (DeviceInfoModule) C3249w.this.f9194f.mo9291x().getNativeModule(DeviceInfoModule.class);
            if (deviceInfoModule != null) {
                deviceInfoModule.emitUpdateDimensionsEvent();
            }
        }

        public void onGlobalLayout() {
            if (C3249w.this.f9194f != null && C3249w.this.f9201u && C3249w.this.f9194f.mo9291x() != null) {
                m12754c();
                m12753b();
                m12752a();
            }
        }
    }

    /* renamed from: com.facebook.react.w$b */
    public interface C3251b {
        /* renamed from: a */
        void mo10710a(C3249w wVar);
    }

    public C3249w(Context context) {
        super(context);
        m12739j();
    }

    private C3250a getCustomGlobalLayoutListener() {
        if (this.f9198r == null) {
            this.f9198r = new C3250a();
        }
        return this.f9198r;
    }

    /* renamed from: h */
    private void m12737h() {
        C3294a.m12881c(0, "attachToReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_START);
        if (getId() == -1) {
            try {
                if (!this.f9201u) {
                    this.f9201u = true;
                    ((C2886o) C6409a.m24521c(this.f9194f)).mo9287n(this);
                    getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
                    ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_END);
                    C3294a.m12885g(0);
                }
            } finally {
                ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_END);
                C3294a.m12885g(0);
            }
        } else {
            throw new C2981h("Trying to attach a ReactRootView with an explicit id already set to [" + getId() + "]. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID.");
        }
    }

    /* renamed from: i */
    private void m12738i(MotionEvent motionEvent) {
        String str;
        C2886o oVar = this.f9194f;
        if (oVar == null || !this.f9201u || oVar.mo9291x() == null) {
            str = "Unable to dispatch touch to JS as the catalyst instance has not been attached";
        } else if (this.f9203w == null) {
            str = "Unable to dispatch touch to JS before the dispatcher is available";
        } else {
            UIManager f = C3051u0.m12089f(this.f9194f.mo9291x(), getUIManagerType());
            if (f != null) {
                this.f9203w.mo9687d(motionEvent, (C2945d) f.getEventDispatcher());
                return;
            }
            return;
        }
        C6071a.m22859G("ReactRootView", str);
    }

    /* renamed from: j */
    private void m12739j() {
        setClipChildren(false);
    }

    /* renamed from: k */
    private boolean m12740k() {
        int i = this.f9200t;
        return (i == 0 || i == -1) ? false : true;
    }

    /* renamed from: m */
    private void m12741m() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    /* renamed from: r */
    private void m12742r(boolean z, int i, int i2) {
        UIManager f;
        int i3;
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_START);
        if (this.f9194f == null) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            C6071a.m22859G("ReactRootView", "Unable to update root layout specs for uninitialized ReactInstanceManager");
        } else if (getUIManagerType() != 2 || m12740k()) {
            ReactContext x = this.f9194f.mo9291x();
            if (!(x == null || (f = C3051u0.m12089f(x, getUIManagerType())) == null)) {
                int i4 = 0;
                if (getUIManagerType() == 2) {
                    Point b = C2995k0.m11877b(this);
                    i4 = b.x;
                    i3 = b.y;
                } else {
                    i3 = 0;
                }
                if (!(!z && i4 == this.f9190D && i3 == this.f9191E)) {
                    f.updateRootLayoutSpecs(getRootViewTag(), i, i2, i4, i3);
                }
                this.f9190D = i4;
                this.f9191E = i3;
            }
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
        } else {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            C6071a.m22875i("ReactRootView", "Unable to update root layout specs for ReactRootView: no rootViewTag set yet");
        }
    }

    /* renamed from: a */
    public void mo9472a(int i) {
        if (i == 101) {
            mo10691l();
        }
    }

    /* renamed from: b */
    public void mo9473b() {
        C3294a.m12881c(0, "ReactRootView.runApplication");
        try {
            C2886o oVar = this.f9194f;
            if (oVar != null) {
                if (this.f9201u) {
                    ReactContext x = oVar.mo9291x();
                    if (x == null) {
                        C3294a.m12885g(0);
                        return;
                    }
                    CatalystInstance catalystInstance = x.getCatalystInstance();
                    String jSModuleName = getJSModuleName();
                    if (this.f9205y) {
                        m12742r(true, this.f9206z, this.f9187A);
                    }
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("rootTag", (double) getRootViewTag());
                    Bundle appProperties = getAppProperties();
                    if (appProperties != null) {
                        writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                    }
                    this.f9202v = true;
                    ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
                    C3294a.m12885g(0);
                }
            }
        } finally {
            C3294a.m12885g(0);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e) {
            mo9713e(e);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C2886o oVar = this.f9194f;
        if (oVar == null || !this.f9201u || oVar.mo9291x() == null) {
            C6071a.m22859G("ReactRootView", "Unable to handle key event as the catalyst instance has not been attached");
        } else {
            this.f9204x.mo9079d(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: e */
    public void mo9713e(Throwable th) {
        C2886o oVar = this.f9194f;
        if (oVar == null || oVar.mo9291x() == null) {
            throw new RuntimeException(th);
        }
        this.f9194f.mo9291x().handleException(new C2981h(th.getMessage(), this, th));
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
        C6409a.m24520b(!this.f9201u, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    /* renamed from: g */
    public void mo9714g(MotionEvent motionEvent) {
        String str;
        C2886o oVar = this.f9194f;
        if (oVar == null || !this.f9201u || oVar.mo9291x() == null) {
            str = "Unable to dispatch touch to JS as the catalyst instance has not been attached";
        } else if (this.f9203w == null) {
            str = "Unable to dispatch touch to JS before the dispatcher is available";
        } else {
            UIManager f = C3051u0.m12089f(this.f9194f.mo9291x(), getUIManagerType());
            if (f != null) {
                this.f9203w.mo9688e(motionEvent, (C2945d) f.getEventDispatcher());
                return;
            }
            return;
        }
        C6071a.m22859G("ReactRootView", str);
    }

    public Bundle getAppProperties() {
        return this.f9196p;
    }

    public int getHeightMeasureSpec() {
        return this.f9187A;
    }

    public String getInitialUITemplate() {
        return this.f9197q;
    }

    public String getJSModuleName() {
        return (String) C6409a.m24521c(this.f9195o);
    }

    public C2886o getReactInstanceManager() {
        return this.f9194f;
    }

    public ViewGroup getRootViewGroup() {
        return this;
    }

    public int getRootViewTag() {
        return this.f9200t;
    }

    public AtomicInteger getState() {
        return this.f9193G;
    }

    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString("surfaceID");
        }
        return null;
    }

    public int getUIManagerType() {
        return this.f9192F;
    }

    public int getWidthMeasureSpec() {
        return this.f9206z;
    }

    /* renamed from: l */
    public void mo10691l() {
        this.f9203w = new C2984i(this);
        C3251b bVar = this.f9199s;
        if (bVar != null) {
            bVar.mo10710a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo10692n(String str, WritableMap writableMap) {
        C2886o oVar = this.f9194f;
        if (oVar != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) oVar.mo9291x().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    /* renamed from: o */
    public void mo10693o(C2886o oVar, String str, Bundle bundle) {
        mo10702p(oVar, str, bundle, (String) null);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9201u) {
            m12741m();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f9201u) {
            m12741m();
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        C2886o oVar = this.f9194f;
        if (oVar == null || !this.f9201u || oVar.mo9291x() == null) {
            C6071a.m22859G("ReactRootView", "Unable to handle focus changed event as the catalyst instance has not been attached");
        } else {
            this.f9204x.mo9078a();
        }
        super.onFocusChanged(z, i, rect);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m12738i(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f9205y && getUIManagerType() == 2) {
            m12742r(false, this.f9206z, this.f9187A);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026 A[Catch:{ all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036 A[Catch:{ all -> 0x00b6 }, LOOP:0: B:15:0x0030->B:17:0x0036, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[Catch:{ all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069 A[Catch:{ all -> 0x00b6 }, LOOP:1: B:24:0x0063->B:26:0x0069, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094 A[Catch:{ all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098 A[ADDED_TO_REGION, Catch:{ all -> 0x00b6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r2 = "ReactRootView.onMeasure"
            com.facebook.systrace.C3294a.m12881c(r0, r2)
            com.facebook.react.bridge.ReactMarkerConstants r2 = com.facebook.react.bridge.ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_START
            com.facebook.react.bridge.ReactMarker.logMarker((com.facebook.react.bridge.ReactMarkerConstants) r2)
            int r2 = r10.f9206z     // Catch:{ all -> 0x00b6 }
            r3 = 0
            r4 = 1
            if (r11 != r2) goto L_0x0019
            int r2 = r10.f9187A     // Catch:{ all -> 0x00b6 }
            if (r12 == r2) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r2 = 0
            goto L_0x001a
        L_0x0019:
            r2 = 1
        L_0x001a:
            r10.f9206z = r11     // Catch:{ all -> 0x00b6 }
            r10.f9187A = r12     // Catch:{ all -> 0x00b6 }
            int r5 = android.view.View.MeasureSpec.getMode(r11)     // Catch:{ all -> 0x00b6 }
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x002e
            if (r5 != 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x00b6 }
            goto L_0x0054
        L_0x002e:
            r11 = 0
            r5 = 0
        L_0x0030:
            int r7 = r10.getChildCount()     // Catch:{ all -> 0x00b6 }
            if (r5 >= r7) goto L_0x0054
            android.view.View r7 = r10.getChildAt(r5)     // Catch:{ all -> 0x00b6 }
            int r8 = r7.getLeft()     // Catch:{ all -> 0x00b6 }
            int r9 = r7.getMeasuredWidth()     // Catch:{ all -> 0x00b6 }
            int r8 = r8 + r9
            int r9 = r7.getPaddingLeft()     // Catch:{ all -> 0x00b6 }
            int r8 = r8 + r9
            int r7 = r7.getPaddingRight()     // Catch:{ all -> 0x00b6 }
            int r8 = r8 + r7
            int r11 = java.lang.Math.max(r11, r8)     // Catch:{ all -> 0x00b6 }
            int r5 = r5 + 1
            goto L_0x0030
        L_0x0054:
            int r5 = android.view.View.MeasureSpec.getMode(r12)     // Catch:{ all -> 0x00b6 }
            if (r5 == r6) goto L_0x0062
            if (r5 != 0) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            int r12 = android.view.View.MeasureSpec.getSize(r12)     // Catch:{ all -> 0x00b6 }
            goto L_0x0087
        L_0x0062:
            r12 = 0
        L_0x0063:
            int r5 = r10.getChildCount()     // Catch:{ all -> 0x00b6 }
            if (r3 >= r5) goto L_0x0087
            android.view.View r5 = r10.getChildAt(r3)     // Catch:{ all -> 0x00b6 }
            int r6 = r5.getTop()     // Catch:{ all -> 0x00b6 }
            int r7 = r5.getMeasuredHeight()     // Catch:{ all -> 0x00b6 }
            int r6 = r6 + r7
            int r7 = r5.getPaddingTop()     // Catch:{ all -> 0x00b6 }
            int r6 = r6 + r7
            int r5 = r5.getPaddingBottom()     // Catch:{ all -> 0x00b6 }
            int r6 = r6 + r5
            int r12 = java.lang.Math.max(r12, r6)     // Catch:{ all -> 0x00b6 }
            int r3 = r3 + 1
            goto L_0x0063
        L_0x0087:
            r10.setMeasuredDimension(r11, r12)     // Catch:{ all -> 0x00b6 }
            r10.f9205y = r4     // Catch:{ all -> 0x00b6 }
            com.facebook.react.o r3 = r10.f9194f     // Catch:{ all -> 0x00b6 }
            if (r3 == 0) goto L_0x0098
            boolean r3 = r10.f9201u     // Catch:{ all -> 0x00b6 }
            if (r3 != 0) goto L_0x0098
            r10.m12737h()     // Catch:{ all -> 0x00b6 }
            goto L_0x00a9
        L_0x0098:
            if (r2 != 0) goto L_0x00a2
            int r2 = r10.f9188B     // Catch:{ all -> 0x00b6 }
            if (r2 != r11) goto L_0x00a2
            int r2 = r10.f9189C     // Catch:{ all -> 0x00b6 }
            if (r2 == r12) goto L_0x00a9
        L_0x00a2:
            int r2 = r10.f9206z     // Catch:{ all -> 0x00b6 }
            int r3 = r10.f9187A     // Catch:{ all -> 0x00b6 }
            r10.m12742r(r4, r2, r3)     // Catch:{ all -> 0x00b6 }
        L_0x00a9:
            r10.f9188B = r11     // Catch:{ all -> 0x00b6 }
            r10.f9189C = r12     // Catch:{ all -> 0x00b6 }
            com.facebook.react.bridge.ReactMarkerConstants r11 = com.facebook.react.bridge.ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END
            com.facebook.react.bridge.ReactMarker.logMarker((com.facebook.react.bridge.ReactMarkerConstants) r11)
            com.facebook.systrace.C3294a.m12885g(r0)
            return
        L_0x00b6:
            r11 = move-exception
            com.facebook.react.bridge.ReactMarkerConstants r12 = com.facebook.react.bridge.ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END
            com.facebook.react.bridge.ReactMarker.logMarker((com.facebook.react.bridge.ReactMarkerConstants) r12)
            com.facebook.systrace.C3294a.m12885g(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.C3249w.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        m12738i(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.f9202v) {
            this.f9202v = false;
            String str = this.f9195o;
            if (str != null) {
                ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, str, this.f9200t);
            }
        }
    }

    /* renamed from: p */
    public void mo10702p(C2886o oVar, String str, Bundle bundle, String str2) {
        C3294a.m12881c(0, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            C6409a.m24520b(this.f9194f == null, "This root view has already been attached to a catalyst instance manager");
            this.f9194f = oVar;
            this.f9195o = str;
            this.f9196p = bundle;
            this.f9197q = str2;
            oVar.mo9288t();
        } finally {
            C3294a.m12885g(0);
        }
    }

    /* renamed from: q */
    public void mo10703q() {
        ReactContext x;
        UIManager f;
        UiThreadUtil.assertOnUiThread();
        C2886o oVar = this.f9194f;
        if (!(oVar == null || (x = oVar.mo9291x()) == null || getUIManagerType() != 2 || (f = C3051u0.m12089f(x, getUIManagerType())) == null)) {
            int id = getId();
            setId(-1);
            removeAllViews();
            if (id == -1) {
                ReactSoftExceptionLogger.logSoftException("ReactRootView", new RuntimeException("unmountReactApplication called on ReactRootView with invalid id"));
            } else {
                f.stopSurface(id);
            }
        }
        C2886o oVar2 = this.f9194f;
        if (oVar2 != null && this.f9201u) {
            oVar2.mo9290v(this);
            this.f9201u = false;
        }
        this.f9194f = null;
        this.f9202v = false;
    }

    public void requestChildFocus(View view, View view2) {
        C2886o oVar = this.f9194f;
        if (oVar == null || !this.f9201u || oVar.mo9291x() == null) {
            C6071a.m22859G("ReactRootView", "Unable to handle child focus changed event as the catalyst instance has not been attached");
        } else {
            this.f9204x.mo9080e(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.f9196p = bundle;
        if (m12740k()) {
            mo9473b();
        }
    }

    public void setEventListener(C3251b bVar) {
        this.f9199s = bVar;
    }

    public void setIsFabric(boolean z) {
        this.f9192F = z ? 2 : 1;
    }

    public void setRootViewTag(int i) {
        this.f9200t = i;
    }

    public void setShouldLogContentAppeared(boolean z) {
        this.f9202v = z;
    }
}
