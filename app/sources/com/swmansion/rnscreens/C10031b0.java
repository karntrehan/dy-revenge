package com.swmansion.rnscreens;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.rnscreens.C10084w;
import java.util.Objects;
import p027c.p064i.p072j.C1929e0;
import p027c.p064i.p072j.C1945f0;
import p027c.p064i.p072j.C1988t;
import p455g.C10313k;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.rnscreens.b0 */
public final class C10031b0 {

    /* renamed from: a */
    public static final C10031b0 f26755a = new C10031b0();

    /* renamed from: b */
    private static boolean f26756b;

    /* renamed from: c */
    private static boolean f26757c;

    /* renamed from: d */
    private static boolean f26758d;

    /* renamed from: e */
    private static Integer f26759e;

    /* renamed from: com.swmansion.rnscreens.b0$a */
    public /* synthetic */ class C10032a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26760a;

        static {
            int[] iArr = new int[C10084w.C10089e.values().length];
            iArr[C10084w.C10089e.ORIENTATION.ordinal()] = 1;
            iArr[C10084w.C10089e.COLOR.ordinal()] = 2;
            iArr[C10084w.C10089e.STYLE.ordinal()] = 3;
            iArr[C10084w.C10089e.TRANSLUCENT.ordinal()] = 4;
            iArr[C10084w.C10089e.HIDDEN.ordinal()] = 5;
            iArr[C10084w.C10089e.ANIMATED.ordinal()] = 6;
            iArr[C10084w.C10089e.NAVIGATION_BAR_COLOR.ordinal()] = 7;
            iArr[C10084w.C10089e.NAVIGATION_BAR_HIDDEN.ordinal()] = 8;
            f26760a = iArr;
        }
    }

    /* renamed from: com.swmansion.rnscreens.b0$b */
    public static final class C10033b extends GuardedRunnable {

        /* renamed from: f */
        final /* synthetic */ Activity f26761f;

        /* renamed from: o */
        final /* synthetic */ Integer f26762o;

        /* renamed from: p */
        final /* synthetic */ boolean f26763p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10033b(ReactContext reactContext, Activity activity, Integer num, boolean z) {
            super(reactContext);
            this.f26761f = activity;
            this.f26762o = num;
            this.f26763p = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m34033b(Window window, ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            window.setStatusBarColor(((Integer) animatedValue).intValue());
        }

        public void runGuarded() {
            Window window = this.f26761f.getWindow();
            int statusBarColor = window.getStatusBarColor();
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(statusBarColor), this.f26762o});
            ofObject.addUpdateListener(new C10070j(window));
            if (this.f26763p) {
                ofObject.setDuration(300).setStartDelay(0);
            } else {
                ofObject.setDuration(0).setStartDelay(300);
            }
            ofObject.start();
        }
    }

    /* renamed from: com.swmansion.rnscreens.b0$c */
    public static final class C10034c extends GuardedRunnable {

        /* renamed from: f */
        final /* synthetic */ Activity f26764f;

        /* renamed from: o */
        final /* synthetic */ boolean f26765o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10034c(ReactContext reactContext, Activity activity, boolean z) {
            super(reactContext);
            this.f26764f = activity;
            this.f26765o = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final C1929e0 m34035b(View view, C1929e0 e0Var) {
            C1929e0 Z = C1988t.m8368Z(view, e0Var);
            C10457l.m35319d(Z, "onApplyWindowInsets(v, insets)");
            return Z.mo6495o(Z.mo6490i(), 0, Z.mo6491j(), Z.mo6488h());
        }

        @TargetApi(21)
        public void runGuarded() {
            View decorView = this.f26764f.getWindow().getDecorView();
            C10457l.m35319d(decorView, "activity.window.decorView");
            C1988t.m8334A0(decorView, this.f26765o ? C10071k.f26819a : null);
            C1988t.m8388j0(decorView);
        }
    }

    private C10031b0() {
    }

    /* renamed from: d */
    private final boolean m34010d(C10084w wVar, C10084w.C10089e eVar) {
        switch (C10032a.f26760a[eVar.ordinal()]) {
            case 1:
                if (wVar.getScreenOrientation() != null) {
                    return true;
                }
                break;
            case 2:
                if (wVar.getStatusBarColor() != null) {
                    return true;
                }
                break;
            case 3:
                if (wVar.getStatusBarStyle() != null) {
                    return true;
                }
                break;
            case 4:
                if (wVar.mo25058f() != null) {
                    return true;
                }
                break;
            case 5:
                if (wVar.mo25057e() != null) {
                    return true;
                }
                break;
            case 6:
                if (wVar.mo25054d() != null) {
                    return true;
                }
                break;
            case 7:
                if (wVar.getNavigationBarColor() != null) {
                    return true;
                }
                break;
            case 8:
                if (wVar.mo25053c() != null) {
                    return true;
                }
                break;
            default:
                throw new C10313k();
        }
        return false;
    }

    /* renamed from: e */
    private final C10084w m34011e(C10084w wVar, C10084w.C10089e eVar) {
        ScreenFragment fragment;
        if (wVar == null || (fragment = wVar.getFragment()) == null) {
            return null;
        }
        for (C10091x<?> topScreen : fragment.mo24891H1()) {
            C10084w topScreen2 = topScreen.getTopScreen();
            C10031b0 b0Var = f26755a;
            C10084w e = b0Var.m34011e(topScreen2, eVar);
            if (e != null) {
                return e;
            }
            if (topScreen2 != null && b0Var.m34010d(topScreen2, eVar)) {
                return topScreen2;
            }
        }
        return null;
    }

    /* renamed from: f */
    private final C10084w m34012f(C10084w wVar, C10084w.C10089e eVar) {
        for (ViewParent container = wVar.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof C10084w) {
                C10084w wVar2 = (C10084w) container;
                if (m34010d(wVar2, eVar)) {
                    return wVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    private final C10084w m34013g(C10084w wVar, C10084w.C10089e eVar) {
        C10084w e = m34011e(wVar, eVar);
        return e != null ? e : m34010d(wVar, eVar) ? wVar : m34012f(wVar, eVar);
    }

    /* renamed from: h */
    private final boolean m34014h(int i) {
        return ((double) 1) - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / ((double) 255)) < 0.5d;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m34018m(boolean z, C1945f0 f0Var) {
        C10457l.m35320e(f0Var, "$controller");
        if (z) {
            f0Var.mo6535a(C1929e0.C1942m.m8152d());
        } else {
            f0Var.mo6539e(C1929e0.C1942m.m8152d());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m34019o(Window window, int i) {
        new C1945f0(window, window.getDecorView()).mo6536b(f26755a.m34014h(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m34020s(Activity activity, String str) {
        C10457l.m35320e(str, "$style");
        View decorView = activity.getWindow().getDecorView();
        C10457l.m35319d(decorView, "activity.window.decorView");
        new C1945f0(activity.getWindow(), decorView).mo6537c(C10457l.m35316a(str, "dark"));
    }

    /* renamed from: a */
    public final void mo24993a() {
        f26758d = true;
    }

    /* renamed from: b */
    public final void mo24994b() {
        f26756b = true;
    }

    /* renamed from: c */
    public final void mo24995c() {
        f26757c = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r3 = r3.mo25054d();
     */
    @android.annotation.SuppressLint({"ObsoleteSdkInt"})
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24996l(com.swmansion.rnscreens.C10084w r3, android.app.Activity r4, com.facebook.react.bridge.ReactContext r5) {
        /*
            r2 = this;
            java.lang.String r0 = "screen"
            p455g.p470y.p472d.C10457l.m35320e(r3, r0)
            if (r4 == 0) goto L_0x0048
            if (r5 != 0) goto L_0x000a
            goto L_0x0048
        L_0x000a:
            java.lang.Integer r0 = f26759e
            if (r0 != 0) goto L_0x001c
            android.view.Window r0 = r4.getWindow()
            int r0 = r0.getStatusBarColor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            f26759e = r0
        L_0x001c:
            com.swmansion.rnscreens.w$e r0 = com.swmansion.rnscreens.C10084w.C10089e.COLOR
            com.swmansion.rnscreens.w r0 = r2.m34013g(r3, r0)
            com.swmansion.rnscreens.w$e r1 = com.swmansion.rnscreens.C10084w.C10089e.ANIMATED
            com.swmansion.rnscreens.w r3 = r2.m34013g(r3, r1)
            if (r0 == 0) goto L_0x0030
            java.lang.Integer r0 = r0.getStatusBarColor()
            if (r0 != 0) goto L_0x0032
        L_0x0030:
            java.lang.Integer r0 = f26759e
        L_0x0032:
            if (r3 == 0) goto L_0x003f
            java.lang.Boolean r3 = r3.mo25054d()
            if (r3 == 0) goto L_0x003f
            boolean r3 = r3.booleanValue()
            goto L_0x0040
        L_0x003f:
            r3 = 0
        L_0x0040:
            com.swmansion.rnscreens.b0$b r1 = new com.swmansion.rnscreens.b0$b
            r1.<init>(r5, r4, r0, r3)
            com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r1)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C10031b0.mo24996l(com.swmansion.rnscreens.w, android.app.Activity, com.facebook.react.bridge.ReactContext):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r3 = r3.mo25057e();
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24997n(com.swmansion.rnscreens.C10084w r3, android.app.Activity r4) {
        /*
            r2 = this;
            java.lang.String r0 = "screen"
            p455g.p470y.p472d.C10457l.m35320e(r3, r0)
            if (r4 != 0) goto L_0x0008
            return
        L_0x0008:
            com.swmansion.rnscreens.w$e r0 = com.swmansion.rnscreens.C10084w.C10089e.HIDDEN
            com.swmansion.rnscreens.w r3 = r2.m34013g(r3, r0)
            if (r3 == 0) goto L_0x001b
            java.lang.Boolean r3 = r3.mo25057e()
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.booleanValue()
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            android.view.Window r4 = r4.getWindow()
            c.i.j.f0 r0 = new c.i.j.f0
            android.view.View r1 = r4.getDecorView()
            r0.<init>(r4, r1)
            com.swmansion.rnscreens.h r4 = new com.swmansion.rnscreens.h
            r4.<init>(r3, r0)
            com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C10031b0.mo24997n(com.swmansion.rnscreens.w, android.app.Activity):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r2 = r2.getNavigationBarColor();
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24998p(com.swmansion.rnscreens.C10084w r2, android.app.Activity r3) {
        /*
            r1 = this;
            java.lang.String r0 = "screen"
            p455g.p470y.p472d.C10457l.m35320e(r2, r0)
            if (r3 != 0) goto L_0x0008
            return
        L_0x0008:
            android.view.Window r3 = r3.getWindow()
            com.swmansion.rnscreens.w$e r0 = com.swmansion.rnscreens.C10084w.C10089e.NAVIGATION_BAR_COLOR
            com.swmansion.rnscreens.w r2 = r1.m34013g(r2, r0)
            if (r2 == 0) goto L_0x001f
            java.lang.Integer r2 = r2.getNavigationBarColor()
            if (r2 == 0) goto L_0x001f
            int r2 = r2.intValue()
            goto L_0x0023
        L_0x001f:
            int r2 = r3.getNavigationBarColor()
        L_0x0023:
            com.swmansion.rnscreens.i r0 = new com.swmansion.rnscreens.i
            r0.<init>(r3, r2)
            com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r0)
            r3.setNavigationBarColor(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C10031b0.mo24998p(com.swmansion.rnscreens.w, android.app.Activity):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r2 = r2.mo25053c();
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24999q(com.swmansion.rnscreens.C10084w r2, android.app.Activity r3) {
        /*
            r1 = this;
            java.lang.String r0 = "screen"
            p455g.p470y.p472d.C10457l.m35320e(r2, r0)
            if (r3 != 0) goto L_0x0008
            return
        L_0x0008:
            android.view.Window r3 = r3.getWindow()
            com.swmansion.rnscreens.w$e r0 = com.swmansion.rnscreens.C10084w.C10089e.NAVIGATION_BAR_HIDDEN
            com.swmansion.rnscreens.w r2 = r1.m34013g(r2, r0)
            if (r2 == 0) goto L_0x001f
            java.lang.Boolean r2 = r2.mo25053c()
            if (r2 == 0) goto L_0x001f
            boolean r2 = r2.booleanValue()
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            p027c.p064i.p072j.C1912c0.m8008a(r3, r2)
            if (r2 == 0) goto L_0x003a
            c.i.j.f0 r2 = new c.i.j.f0
            android.view.View r0 = r3.getDecorView()
            r2.<init>(r3, r0)
            int r3 = p027c.p064i.p072j.C1929e0.C1942m.m8151c()
            r2.mo6535a(r3)
            r3 = 2
            r2.mo6538d(r3)
            goto L_0x004a
        L_0x003a:
            c.i.j.f0 r2 = new c.i.j.f0
            android.view.View r0 = r3.getDecorView()
            r2.<init>(r3, r0)
            int r3 = p027c.p064i.p072j.C1929e0.C1942m.m8151c()
            r2.mo6539e(r3)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C10031b0.mo24999q(com.swmansion.rnscreens.w, android.app.Activity):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r2 = r2.getScreenOrientation();
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25000r(com.swmansion.rnscreens.C10084w r2, android.app.Activity r3) {
        /*
            r1 = this;
            java.lang.String r0 = "screen"
            p455g.p470y.p472d.C10457l.m35320e(r2, r0)
            if (r3 != 0) goto L_0x0008
            return
        L_0x0008:
            com.swmansion.rnscreens.w$e r0 = com.swmansion.rnscreens.C10084w.C10089e.ORIENTATION
            com.swmansion.rnscreens.w r2 = r1.m34013g(r2, r0)
            if (r2 == 0) goto L_0x001b
            java.lang.Integer r2 = r2.getScreenOrientation()
            if (r2 == 0) goto L_0x001b
            int r2 = r2.intValue()
            goto L_0x001c
        L_0x001b:
            r2 = -1
        L_0x001c:
            r3.setRequestedOrientation(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C10031b0.mo25000r(com.swmansion.rnscreens.w, android.app.Activity):void");
    }

    /* renamed from: t */
    public final void mo25001t(C10084w wVar, Activity activity, ReactContext reactContext) {
        String str;
        C10457l.m35320e(wVar, "screen");
        if (activity != null && reactContext != null && Build.VERSION.SDK_INT >= 23) {
            C10084w g = m34013g(wVar, C10084w.C10089e.STYLE);
            if (g == null || (str = g.getStatusBarStyle()) == null) {
                str = "light";
            }
            UiThreadUtil.runOnUiThread(new C10067g(activity, str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r2 = r2.mo25058f();
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25002u(com.swmansion.rnscreens.C10084w r2, android.app.Activity r3, com.facebook.react.bridge.ReactContext r4) {
        /*
            r1 = this;
            java.lang.String r0 = "screen"
            p455g.p470y.p472d.C10457l.m35320e(r2, r0)
            if (r3 == 0) goto L_0x0026
            if (r4 != 0) goto L_0x000a
            goto L_0x0026
        L_0x000a:
            com.swmansion.rnscreens.w$e r0 = com.swmansion.rnscreens.C10084w.C10089e.TRANSLUCENT
            com.swmansion.rnscreens.w r2 = r1.m34013g(r2, r0)
            if (r2 == 0) goto L_0x001d
            java.lang.Boolean r2 = r2.mo25058f()
            if (r2 == 0) goto L_0x001d
            boolean r2 = r2.booleanValue()
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            com.swmansion.rnscreens.b0$c r0 = new com.swmansion.rnscreens.b0$c
            r0.<init>(r4, r3, r2)
            com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r0)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C10031b0.mo25002u(com.swmansion.rnscreens.w, android.app.Activity, com.facebook.react.bridge.ReactContext):void");
    }

    /* renamed from: v */
    public final void mo25003v(C10084w wVar, Activity activity, ReactContext reactContext) {
        C10457l.m35320e(wVar, "screen");
        if (f26756b) {
            mo25000r(wVar, activity);
        }
        if (f26757c) {
            mo24996l(wVar, activity, reactContext);
            mo25001t(wVar, activity, reactContext);
            mo25002u(wVar, activity, reactContext);
            mo24997n(wVar, activity);
        }
        if (f26758d) {
            mo24998p(wVar, activity);
            mo24999q(wVar, activity);
        }
    }
}
