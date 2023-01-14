package com.swmansion.rnscreens;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C2693e;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p115e0.C2747o;
import com.facebook.react.p115e0.C2748p;
import com.facebook.react.uimanager.C2928c1;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.swmansion.rnscreens.C10084w;
import java.util.Map;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

@C2639a(name = "RNSScreen")
public final class ScreenViewManager extends ViewGroupManager<C10084w> implements C2748p<C10084w> {
    public static final C10025a Companion = new C10025a((C10452g) null);
    public static final String REACT_CLASS = "RNSScreen";
    private final C2928c1<C10084w> mDelegate = new C2747o(this);

    /* renamed from: com.swmansion.rnscreens.ScreenViewManager$a */
    public static final class C10025a {
        private C10025a() {
        }

        public /* synthetic */ C10025a(C10452g gVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public C10084w createViewInstance(C3031o0 o0Var) {
        C10457l.m35320e(o0Var, "reactContext");
        return new C10084w(o0Var);
    }

    /* access modifiers changed from: protected */
    public C2928c1<C10084w> getDelegate() {
        return this.mDelegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> i = C2693e.m10919i("topDismissed", C2693e.m10914d("registrationName", "onDismissed"), "topWillAppear", C2693e.m10914d("registrationName", "onWillAppear"), "topAppear", C2693e.m10914d("registrationName", "onAppear"), "topWillDisappear", C2693e.m10914d("registrationName", "onWillDisappear"), "topDisappear", C2693e.m10914d("registrationName", "onDisappear"), "topHeaderBackButtonClickedEvent", C2693e.m10914d("registrationName", "onHeaderBackButtonClicked"), "topTransitionProgress", C2693e.m10914d("registrationName", "onTransitionProgress"));
        C10457l.m35319d(i, "of(\n            ScreenDi…itionProgress\")\n        )");
        return i;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void setActivityState(C10084w wVar, float f) {
        C10457l.m35320e(wVar, "view");
        setActivityState(wVar, (int) f);
    }

    @C2991a(name = "activityState")
    public final void setActivityState(C10084w wVar, int i) {
        C10084w.C10085a aVar;
        C10457l.m35320e(wVar, "view");
        if (i != -1) {
            if (i == 0) {
                aVar = C10084w.C10085a.INACTIVE;
            } else if (i == 1) {
                aVar = C10084w.C10085a.TRANSITIONING_OR_BELOW_TOP;
            } else if (i == 2) {
                aVar = C10084w.C10085a.ON_TOP;
            } else {
                return;
            }
            wVar.setActivityState(aVar);
        }
    }

    public void setCustomAnimationOnSwipe(C10084w wVar, boolean z) {
    }

    public void setFullScreenSwipeEnabled(C10084w wVar, boolean z) {
    }

    @C2991a(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(C10084w wVar, boolean z) {
        C10457l.m35320e(wVar, "view");
        wVar.setGestureEnabled(z);
    }

    public void setGestureResponseDistance(C10084w wVar, ReadableMap readableMap) {
    }

    public void setHideKeyboardOnSwipe(C10084w wVar, boolean z) {
    }

    public void setHomeIndicatorHidden(C10084w wVar, boolean z) {
    }

    @C2991a(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(C10084w wVar, boolean z) {
        C10457l.m35320e(wVar, "view");
        wVar.setNativeBackButtonDismissalEnabled(z);
    }

    @C2991a(customType = "Color", name = "navigationBarColor")
    public void setNavigationBarColor(C10084w wVar, Integer num) {
        C10457l.m35320e(wVar, "view");
        wVar.setNavigationBarColor(num);
    }

    @C2991a(name = "navigationBarHidden")
    public void setNavigationBarHidden(C10084w wVar, boolean z) {
        C10457l.m35320e(wVar, "view");
        wVar.setNavigationBarHidden(Boolean.valueOf(z));
    }

    public void setPreventNativeDismiss(C10084w wVar, boolean z) {
    }

    @C2991a(name = "replaceAnimation")
    public void setReplaceAnimation(C10084w wVar, String str) {
        C10084w.C10086b bVar;
        C10457l.m35320e(wVar, "view");
        if (str == null ? true : C10457l.m35316a(str, "pop")) {
            bVar = C10084w.C10086b.POP;
        } else if (C10457l.m35316a(str, "push")) {
            bVar = C10084w.C10086b.PUSH;
        } else {
            throw new JSApplicationIllegalArgumentException("Unknown replace animation type " + str);
        }
        wVar.setReplaceAnimation(bVar);
    }

    @C2991a(name = "screenOrientation")
    public void setScreenOrientation(C10084w wVar, String str) {
        C10457l.m35320e(wVar, "view");
        wVar.setScreenOrientation(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r4.equals("flip") != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        if (r4.equals("simple_push") != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        throw new com.facebook.react.bridge.JSApplicationIllegalArgumentException("Unknown animation type " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r4.equals("default") != false) goto L_0x0084;
     */
    @com.facebook.react.uimanager.p120j1.C2991a(name = "stackAnimation")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStackAnimation(com.swmansion.rnscreens.C10084w r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            p455g.p470y.p472d.C10457l.m35320e(r3, r0)
            if (r4 == 0) goto L_0x0084
            int r0 = r4.hashCode()
            switch(r0) {
                case -1418955385: goto L_0x0064;
                case -427095442: goto L_0x0059;
                case -349395819: goto L_0x004e;
                case 3135100: goto L_0x0043;
                case 3145837: goto L_0x003a;
                case 3387192: goto L_0x002f;
                case 182437661: goto L_0x0024;
                case 1544803905: goto L_0x001b;
                case 1601504978: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x006d
        L_0x000f:
            java.lang.String r0 = "slide_from_bottom"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.w$c r4 = com.swmansion.rnscreens.C10084w.C10087c.SLIDE_FROM_BOTTOM
            goto L_0x0086
        L_0x001b:
            java.lang.String r0 = "default"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            goto L_0x0084
        L_0x0024:
            java.lang.String r0 = "fade_from_bottom"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.w$c r4 = com.swmansion.rnscreens.C10084w.C10087c.FADE_FROM_BOTTOM
            goto L_0x0086
        L_0x002f:
            java.lang.String r0 = "none"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.w$c r4 = com.swmansion.rnscreens.C10084w.C10087c.NONE
            goto L_0x0086
        L_0x003a:
            java.lang.String r0 = "flip"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            goto L_0x0084
        L_0x0043:
            java.lang.String r0 = "fade"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.w$c r4 = com.swmansion.rnscreens.C10084w.C10087c.FADE
            goto L_0x0086
        L_0x004e:
            java.lang.String r0 = "slide_from_right"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.w$c r4 = com.swmansion.rnscreens.C10084w.C10087c.SLIDE_FROM_RIGHT
            goto L_0x0086
        L_0x0059:
            java.lang.String r0 = "slide_from_left"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.w$c r4 = com.swmansion.rnscreens.C10084w.C10087c.SLIDE_FROM_LEFT
            goto L_0x0086
        L_0x0064:
            java.lang.String r0 = "simple_push"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            goto L_0x0084
        L_0x006d:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown animation type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L_0x0084:
            com.swmansion.rnscreens.w$c r4 = com.swmansion.rnscreens.C10084w.C10087c.DEFAULT
        L_0x0086:
            r3.setStackAnimation(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackAnimation(com.swmansion.rnscreens.w, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r4.equals("containedModal") != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r4.equals("modal") != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r4 = com.swmansion.rnscreens.C10084w.C10088d.f26868o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r4.equals("transparentModal") != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r4 = com.swmansion.rnscreens.C10084w.C10088d.f26869p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        r3.setStackPresentation(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r4.equals("formSheet") != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r4.equals("fullScreenModal") != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r4.equals("containedTransparentModal") != false) goto L_0x0051;
     */
    @com.facebook.react.uimanager.p120j1.C2991a(name = "stackPresentation")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStackPresentation(com.swmansion.rnscreens.C10084w r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            p455g.p470y.p472d.C10457l.m35320e(r3, r0)
            if (r4 == 0) goto L_0x0057
            int r0 = r4.hashCode()
            switch(r0) {
                case -76271493: goto L_0x0049;
                case 3452698: goto L_0x003e;
                case 104069805: goto L_0x0033;
                case 438078970: goto L_0x002a;
                case 955284238: goto L_0x0021;
                case 1171936146: goto L_0x0018;
                case 1798290171: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0057
        L_0x000f:
            java.lang.String r0 = "formSheet"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x003b
        L_0x0018:
            java.lang.String r0 = "fullScreenModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x003b
        L_0x0021:
            java.lang.String r0 = "containedTransparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x0051
        L_0x002a:
            java.lang.String r0 = "containedModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x003b
        L_0x0033:
            java.lang.String r0 = "modal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
        L_0x003b:
            com.swmansion.rnscreens.w$d r4 = com.swmansion.rnscreens.C10084w.C10088d.MODAL
            goto L_0x0053
        L_0x003e:
            java.lang.String r0 = "push"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
            com.swmansion.rnscreens.w$d r4 = com.swmansion.rnscreens.C10084w.C10088d.PUSH
            goto L_0x0053
        L_0x0049:
            java.lang.String r0 = "transparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
        L_0x0051:
            com.swmansion.rnscreens.w$d r4 = com.swmansion.rnscreens.C10084w.C10088d.TRANSPARENT_MODAL
        L_0x0053:
            r3.setStackPresentation(r4)
            return
        L_0x0057:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown presentation type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackPresentation(com.swmansion.rnscreens.w, java.lang.String):void");
    }

    @C2991a(name = "statusBarAnimation")
    public void setStatusBarAnimation(C10084w wVar, String str) {
        C10457l.m35320e(wVar, "view");
        wVar.setStatusBarAnimated(Boolean.valueOf(str != null && !C10457l.m35316a("none", str)));
    }

    @C2991a(customType = "Color", name = "statusBarColor")
    public void setStatusBarColor(C10084w wVar, Integer num) {
        C10457l.m35320e(wVar, "view");
        wVar.setStatusBarColor(num);
    }

    @C2991a(name = "statusBarHidden")
    public void setStatusBarHidden(C10084w wVar, boolean z) {
        C10457l.m35320e(wVar, "view");
        wVar.setStatusBarHidden(Boolean.valueOf(z));
    }

    @C2991a(name = "statusBarStyle")
    public void setStatusBarStyle(C10084w wVar, String str) {
        C10457l.m35320e(wVar, "view");
        wVar.setStatusBarStyle(str);
    }

    @C2991a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(C10084w wVar, boolean z) {
        C10457l.m35320e(wVar, "view");
        wVar.setStatusBarTranslucent(Boolean.valueOf(z));
    }

    public void setSwipeDirection(C10084w wVar, String str) {
    }

    public void setTransitionDuration(C10084w wVar, int i) {
    }
}
