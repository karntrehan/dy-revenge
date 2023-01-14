package com.facebook.react.p115e0;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.p115e0.C2748p;
import com.facebook.react.uimanager.C2918a;
import com.facebook.react.uimanager.C2922b;

/* renamed from: com.facebook.react.e0.o */
public class C2747o<T extends View, U extends C2922b<T> & C2748p<T>> extends C2918a<T, U> {
    public C2747o(U u) {
        super(u);
    }

    /* renamed from: b */
    public void mo8908b(T t, String str, Object obj) {
        str.hashCode();
        boolean z = true;
        boolean z2 = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -1937389126:
                if (str.equals("homeIndicatorHidden")) {
                    c = 0;
                    break;
                }
                break;
            case -1853558344:
                if (str.equals("gestureEnabled")) {
                    c = 1;
                    break;
                }
                break;
            case -1734097646:
                if (str.equals("hideKeyboardOnSwipe")) {
                    c = 2;
                    break;
                }
                break;
            case -1322084375:
                if (str.equals("navigationBarHidden")) {
                    c = 3;
                    break;
                }
                break;
            case -1156137512:
                if (str.equals("statusBarTranslucent")) {
                    c = 4;
                    break;
                }
                break;
            case -1150711358:
                if (str.equals("stackPresentation")) {
                    c = 5;
                    break;
                }
                break;
            case -1047235902:
                if (str.equals("activityState")) {
                    c = 6;
                    break;
                }
                break;
            case -973702878:
                if (str.equals("statusBarColor")) {
                    c = 7;
                    break;
                }
                break;
            case -958765200:
                if (str.equals("statusBarStyle")) {
                    c = 8;
                    break;
                }
                break;
            case -577711652:
                if (str.equals("stackAnimation")) {
                    c = 9;
                    break;
                }
                break;
            case -462720700:
                if (str.equals("navigationBarColor")) {
                    c = 10;
                    break;
                }
                break;
            case -257141968:
                if (str.equals("replaceAnimation")) {
                    c = 11;
                    break;
                }
                break;
            case -166356101:
                if (str.equals("preventNativeDismiss")) {
                    c = 12;
                    break;
                }
                break;
            case 17337291:
                if (str.equals("statusBarHidden")) {
                    c = 13;
                    break;
                }
                break;
            case 129956386:
                if (str.equals("fullScreenSwipeEnabled")) {
                    c = 14;
                    break;
                }
                break;
            case 187703999:
                if (str.equals("gestureResponseDistance")) {
                    c = 15;
                    break;
                }
                break;
            case 227582404:
                if (str.equals("screenOrientation")) {
                    c = 16;
                    break;
                }
                break;
            case 425064969:
                if (str.equals("transitionDuration")) {
                    c = 17;
                    break;
                }
                break;
            case 1082157413:
                if (str.equals("swipeDirection")) {
                    c = 18;
                    break;
                }
                break;
            case 1110843912:
                if (str.equals("customAnimationOnSwipe")) {
                    c = 19;
                    break;
                }
                break;
            case 1387359683:
                if (str.equals("statusBarAnimation")) {
                    c = 20;
                    break;
                }
                break;
            case 1729091548:
                if (str.equals("nativeBackButtonDismissalEnabled")) {
                    c = 21;
                    break;
                }
                break;
        }
        String str2 = null;
        switch (c) {
            case 0:
                C2748p pVar = (C2748p) this.f8197a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                pVar.setHomeIndicatorHidden(t, z2);
                return;
            case 1:
                C2748p pVar2 = (C2748p) this.f8197a;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                pVar2.setGestureEnabled(t, z);
                return;
            case 2:
                C2748p pVar3 = (C2748p) this.f8197a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                pVar3.setHideKeyboardOnSwipe(t, z2);
                return;
            case 3:
                C2748p pVar4 = (C2748p) this.f8197a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                pVar4.setNavigationBarHidden(t, z2);
                return;
            case 4:
                C2748p pVar5 = (C2748p) this.f8197a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                pVar5.setStatusBarTranslucent(t, z2);
                return;
            case 5:
                ((C2748p) this.f8197a).setStackPresentation(t, (String) obj);
                return;
            case 6:
                ((C2748p) this.f8197a).setActivityState(t, obj == null ? -1.0f : ((Double) obj).floatValue());
                return;
            case 7:
                ((C2748p) this.f8197a).setStatusBarColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 8:
                C2748p pVar6 = (C2748p) this.f8197a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                pVar6.setStatusBarStyle(t, str2);
                return;
            case 9:
                ((C2748p) this.f8197a).setStackAnimation(t, (String) obj);
                return;
            case 10:
                ((C2748p) this.f8197a).setNavigationBarColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 11:
                ((C2748p) this.f8197a).setReplaceAnimation(t, (String) obj);
                return;
            case 12:
                C2748p pVar7 = (C2748p) this.f8197a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                pVar7.setPreventNativeDismiss(t, z2);
                return;
            case 13:
                C2748p pVar8 = (C2748p) this.f8197a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                pVar8.setStatusBarHidden(t, z2);
                return;
            case 14:
                C2748p pVar9 = (C2748p) this.f8197a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                pVar9.setFullScreenSwipeEnabled(t, z2);
                return;
            case 15:
                ((C2748p) this.f8197a).setGestureResponseDistance(t, (ReadableMap) obj);
                return;
            case 16:
                C2748p pVar10 = (C2748p) this.f8197a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                pVar10.setScreenOrientation(t, str2);
                return;
            case 17:
                ((C2748p) this.f8197a).setTransitionDuration(t, obj == null ? 350 : ((Double) obj).intValue());
                return;
            case 18:
                ((C2748p) this.f8197a).setSwipeDirection(t, (String) obj);
                return;
            case 19:
                C2748p pVar11 = (C2748p) this.f8197a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                pVar11.setCustomAnimationOnSwipe(t, z2);
                return;
            case 20:
                C2748p pVar12 = (C2748p) this.f8197a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                pVar12.setStatusBarAnimation(t, str2);
                return;
            case 21:
                C2748p pVar13 = (C2748p) this.f8197a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                pVar13.setNativeBackButtonDismissalEnabled(t, z2);
                return;
            default:
                super.mo8908b(t, str, obj);
                return;
        }
    }
}
