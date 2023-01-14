package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.Objects;
import p455g.p470y.p472d.C10457l;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.swmansion.rnscreens.w */
public final class C10084w extends C10079r {

    /* renamed from: A */
    private Integer f26835A;

    /* renamed from: B */
    private Boolean f26836B;

    /* renamed from: C */
    private Boolean f26837C;

    /* renamed from: D */
    private boolean f26838D = true;

    /* renamed from: f */
    private ScreenFragment f26839f;

    /* renamed from: o */
    private C10091x<?> f26840o;

    /* renamed from: p */
    private C10085a f26841p;

    /* renamed from: q */
    private boolean f26842q;

    /* renamed from: r */
    private C10088d f26843r = C10088d.PUSH;

    /* renamed from: s */
    private C10086b f26844s = C10086b.POP;

    /* renamed from: t */
    private C10087c f26845t = C10087c.DEFAULT;

    /* renamed from: u */
    private boolean f26846u = true;

    /* renamed from: v */
    private Integer f26847v;

    /* renamed from: w */
    private String f26848w;

    /* renamed from: x */
    private Boolean f26849x;

    /* renamed from: y */
    private Boolean f26850y;

    /* renamed from: z */
    private Integer f26851z;

    /* renamed from: com.swmansion.rnscreens.w$a */
    public enum C10085a {
        INACTIVE,
        TRANSITIONING_OR_BELOW_TOP,
        ON_TOP
    }

    /* renamed from: com.swmansion.rnscreens.w$b */
    public enum C10086b {
        PUSH,
        POP
    }

    /* renamed from: com.swmansion.rnscreens.w$c */
    public enum C10087c {
        DEFAULT,
        NONE,
        FADE,
        SLIDE_FROM_BOTTOM,
        SLIDE_FROM_RIGHT,
        SLIDE_FROM_LEFT,
        FADE_FROM_BOTTOM
    }

    /* renamed from: com.swmansion.rnscreens.w$d */
    public enum C10088d {
        PUSH,
        MODAL,
        TRANSPARENT_MODAL
    }

    /* renamed from: com.swmansion.rnscreens.w$e */
    public enum C10089e {
        ORIENTATION,
        COLOR,
        STYLE,
        TRANSLUCENT,
        HIDDEN,
        ANIMATED,
        NAVIGATION_BAR_COLOR,
        NAVIGATION_BAR_HIDDEN
    }

    /* renamed from: com.swmansion.rnscreens.w$f */
    public static final class C10090f extends GuardedRunnable {

        /* renamed from: f */
        final /* synthetic */ ReactContext f26880f;

        /* renamed from: o */
        final /* synthetic */ C10084w f26881o;

        /* renamed from: p */
        final /* synthetic */ int f26882p;

        /* renamed from: q */
        final /* synthetic */ int f26883q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10090f(ReactContext reactContext, C10084w wVar, int i, int i2) {
            super(reactContext);
            this.f26880f = reactContext;
            this.f26881o = wVar;
            this.f26882p = i;
            this.f26883q = i2;
        }

        public void runGuarded() {
            UIManagerModule uIManagerModule = (UIManagerModule) this.f26880f.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.updateNodeSize(this.f26881o.getId(), this.f26882p, this.f26883q);
            }
        }
    }

    public C10084w(ReactContext reactContext) {
        super(reactContext);
        setLayoutParams(new WindowManager.LayoutParams(2));
    }

    /* renamed from: b */
    private final boolean m34117b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && m34117b((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private final void m34118g(int i, int i2) {
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        reactContext.runOnNativeModulesQueueThread(new C10090f(reactContext, this, i, i2));
    }

    /* renamed from: a */
    public final void mo25052a(int i) {
        setImportantForAccessibility(i);
        C10097z headerConfig = getHeaderConfig();
        C10078q toolbar = headerConfig != null ? headerConfig.getToolbar() : null;
        if (toolbar != null) {
            toolbar.setImportantForAccessibility(i);
        }
    }

    /* renamed from: c */
    public final Boolean mo25053c() {
        return this.f26836B;
    }

    /* renamed from: d */
    public final Boolean mo25054d() {
        return this.f26837C;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        C10457l.m35320e(sparseArray, "container");
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        C10457l.m35320e(sparseArray, "container");
    }

    /* renamed from: e */
    public final Boolean mo25057e() {
        return this.f26849x;
    }

    /* renamed from: f */
    public final Boolean mo25058f() {
        return this.f26850y;
    }

    public final C10085a getActivityState() {
        return this.f26841p;
    }

    public final C10091x<?> getContainer() {
        return this.f26840o;
    }

    public final ScreenFragment getFragment() {
        return this.f26839f;
    }

    public final C10097z getHeaderConfig() {
        View childAt = getChildAt(0);
        if (childAt instanceof C10097z) {
            return (C10097z) childAt;
        }
        return null;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.f26838D;
    }

    public final Integer getNavigationBarColor() {
        return this.f26835A;
    }

    public final C10086b getReplaceAnimation() {
        return this.f26844s;
    }

    public final Integer getScreenOrientation() {
        return this.f26847v;
    }

    public final C10087c getStackAnimation() {
        return this.f26845t;
    }

    public final C10088d getStackPresentation() {
        return this.f26843r;
    }

    public final Integer getStatusBarColor() {
        return this.f26851z;
    }

    public final String getStatusBarStyle() {
        return this.f26848w;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            m34118g(i3 - i, i4 - i2);
        }
    }

    public final void setActivityState(C10085a aVar) {
        C10457l.m35320e(aVar, "activityState");
        if (aVar != this.f26841p) {
            this.f26841p = aVar;
            C10091x<?> xVar = this.f26840o;
            if (xVar != null) {
                xVar.mo25097l();
            }
        }
    }

    public final void setContainer(C10091x<?> xVar) {
        this.f26840o = xVar;
    }

    public final void setFragment(ScreenFragment screenFragment) {
        this.f26839f = screenFragment;
    }

    public final void setGestureEnabled(boolean z) {
        this.f26846u = z;
    }

    public void setLayerType(int i, Paint paint) {
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z) {
        this.f26838D = z;
    }

    public final void setNavigationBarColor(Integer num) {
        if (num != null) {
            C10031b0.f26755a.mo24993a();
        }
        this.f26835A = num;
        ScreenFragment screenFragment = this.f26839f;
        if (screenFragment != null) {
            C10031b0.f26755a.mo24998p(this, screenFragment.mo24898R1());
        }
    }

    public final void setNavigationBarHidden(Boolean bool) {
        if (bool != null) {
            C10031b0.f26755a.mo24993a();
        }
        this.f26836B = bool;
        ScreenFragment screenFragment = this.f26839f;
        if (screenFragment != null) {
            C10031b0.f26755a.mo24999q(this, screenFragment.mo24898R1());
        }
    }

    public final void setReplaceAnimation(C10086b bVar) {
        C10457l.m35320e(bVar, "<set-?>");
        this.f26844s = bVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setScreenOrientation(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0006
            r3 = 0
            r2.f26847v = r3
            return
        L_0x0006:
            com.swmansion.rnscreens.b0 r0 = com.swmansion.rnscreens.C10031b0.f26755a
            r0.mo24994b()
            int r1 = r3.hashCode()
            switch(r1) {
                case -1894896954: goto L_0x0057;
                case 96673: goto L_0x004b;
                case 729267099: goto L_0x0040;
                case 1430647483: goto L_0x0035;
                case 1651658175: goto L_0x002a;
                case 1730732811: goto L_0x001e;
                case 2118770584: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0063
        L_0x0013:
            java.lang.String r1 = "landscape_right"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x001c
            goto L_0x0063
        L_0x001c:
            r3 = 0
            goto L_0x0064
        L_0x001e:
            java.lang.String r1 = "landscape_left"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0027
            goto L_0x0063
        L_0x0027:
            r3 = 8
            goto L_0x0064
        L_0x002a:
            java.lang.String r1 = "portrait_up"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0033
            goto L_0x0063
        L_0x0033:
            r3 = 1
            goto L_0x0064
        L_0x0035:
            java.lang.String r1 = "landscape"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x003e
            goto L_0x0063
        L_0x003e:
            r3 = 6
            goto L_0x0064
        L_0x0040:
            java.lang.String r1 = "portrait"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0049
            goto L_0x0063
        L_0x0049:
            r3 = 7
            goto L_0x0064
        L_0x004b:
            java.lang.String r1 = "all"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0054
            goto L_0x0063
        L_0x0054:
            r3 = 10
            goto L_0x0064
        L_0x0057:
            java.lang.String r1 = "portrait_down"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0060
            goto L_0x0063
        L_0x0060:
            r3 = 9
            goto L_0x0064
        L_0x0063:
            r3 = -1
        L_0x0064:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f26847v = r3
            com.swmansion.rnscreens.ScreenFragment r3 = r2.f26839f
            if (r3 == 0) goto L_0x0075
            android.app.Activity r3 = r3.mo24898R1()
            r0.mo25000r(r2, r3)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C10084w.setScreenOrientation(java.lang.String):void");
    }

    public final void setStackAnimation(C10087c cVar) {
        C10457l.m35320e(cVar, "<set-?>");
        this.f26845t = cVar;
    }

    public final void setStackPresentation(C10088d dVar) {
        C10457l.m35320e(dVar, "<set-?>");
        this.f26843r = dVar;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.f26837C = bool;
    }

    public final void setStatusBarColor(Integer num) {
        if (num != null) {
            C10031b0.f26755a.mo24995c();
        }
        this.f26851z = num;
        ScreenFragment screenFragment = this.f26839f;
        if (screenFragment != null) {
            C10031b0.f26755a.mo24996l(this, screenFragment.mo24898R1(), screenFragment.mo24899S1());
        }
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            C10031b0.f26755a.mo24995c();
        }
        this.f26849x = bool;
        ScreenFragment screenFragment = this.f26839f;
        if (screenFragment != null) {
            C10031b0.f26755a.mo24997n(this, screenFragment.mo24898R1());
        }
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            C10031b0.f26755a.mo24995c();
        }
        this.f26848w = str;
        ScreenFragment screenFragment = this.f26839f;
        if (screenFragment != null) {
            C10031b0.f26755a.mo25001t(this, screenFragment.mo24898R1(), screenFragment.mo24899S1());
        }
    }

    public final void setStatusBarTranslucent(Boolean bool) {
        if (bool != null) {
            C10031b0.f26755a.mo24995c();
        }
        this.f26850y = bool;
        ScreenFragment screenFragment = this.f26839f;
        if (screenFragment != null) {
            C10031b0.f26755a.mo25002u(this, screenFragment.mo24898R1(), screenFragment.mo24899S1());
        }
    }

    public final void setTransitioning(boolean z) {
        if (this.f26842q != z) {
            this.f26842q = z;
            boolean b = m34117b(this);
            int i = 2;
            if (!b || getLayerType() == 2) {
                if (!z || b) {
                    i = 0;
                }
                super.setLayerType(i, (Paint) null);
            }
        }
    }
}
