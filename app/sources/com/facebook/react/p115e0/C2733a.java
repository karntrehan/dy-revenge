package com.facebook.react.p115e0;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.p115e0.C2734b;
import com.facebook.react.uimanager.C2918a;
import com.facebook.react.uimanager.C2922b;

/* renamed from: com.facebook.react.e0.a */
public class C2733a<T extends View, U extends C2922b<T> & C2734b<T>> extends C2918a<T, U> {
    public C2733a(U u) {
        super(u);
    }

    /* renamed from: a */
    public void mo8907a(T t, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("closeDrawer")) {
            ((C2734b) this.f8197a).closeDrawer(t);
        } else if (str.equals("openDrawer")) {
            ((C2734b) this.f8197a).openDrawer(t);
        }
    }

    /* renamed from: b */
    public void mo8908b(T t, String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2082382380:
                if (str.equals("statusBarBackgroundColor")) {
                    c = 0;
                    break;
                }
                break;
            case -1233873500:
                if (str.equals("drawerBackgroundColor")) {
                    c = 1;
                    break;
                }
                break;
            case -764307226:
                if (str.equals("keyboardDismissMode")) {
                    c = 2;
                    break;
                }
                break;
            case 268251989:
                if (str.equals("drawerWidth")) {
                    c = 3;
                    break;
                }
                break;
            case 695891258:
                if (str.equals("drawerPosition")) {
                    c = 4;
                    break;
                }
                break;
            case 1857208703:
                if (str.equals("drawerLockMode")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ((C2734b) this.f8197a).setStatusBarBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 1:
                ((C2734b) this.f8197a).setDrawerBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 2:
                ((C2734b) this.f8197a).setKeyboardDismissMode(t, (String) obj);
                return;
            case 3:
                ((C2734b) this.f8197a).setDrawerWidth(t, obj == null ? null : Float.valueOf(((Double) obj).floatValue()));
                return;
            case 4:
                ((C2734b) this.f8197a).setDrawerPosition(t, (String) obj);
                return;
            case 5:
                ((C2734b) this.f8197a).setDrawerLockMode(t, (String) obj);
                return;
            default:
                super.mo8908b(t, str, obj);
                return;
        }
    }
}
