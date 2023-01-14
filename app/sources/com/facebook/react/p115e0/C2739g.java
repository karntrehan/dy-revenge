package com.facebook.react.p115e0;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.p115e0.C2740h;
import com.facebook.react.uimanager.C2918a;
import com.facebook.react.uimanager.C2922b;

/* renamed from: com.facebook.react.e0.g */
public class C2739g<T extends View, U extends C2922b<T> & C2740h<T>> extends C2918a<T, U> {
    public C2739g(U u) {
        super(u);
    }

    /* renamed from: a */
    public void mo8907a(T t, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            ((C2740h) this.f8197a).setNativeValue(t, readableArray.getBoolean(0));
        }
    }

    /* renamed from: b */
    public void mo8908b(T t, String str, Object obj) {
        str.hashCode();
        boolean z = true;
        boolean z2 = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -1742453971:
                if (str.equals("thumbColor")) {
                    c = 0;
                    break;
                }
                break;
            case -1609594047:
                if (str.equals("enabled")) {
                    c = 1;
                    break;
                }
                break;
            case -287374307:
                if (str.equals("trackTintColor")) {
                    c = 2;
                    break;
                }
                break;
            case 3551:
                if (str.equals("on")) {
                    c = 3;
                    break;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    c = 4;
                    break;
                }
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    c = 5;
                    break;
                }
                break;
            case 1084662482:
                if (str.equals("trackColorForFalse")) {
                    c = 6;
                    break;
                }
                break;
            case 1912319986:
                if (str.equals("thumbTintColor")) {
                    c = 7;
                    break;
                }
                break;
            case 2113632767:
                if (str.equals("trackColorForTrue")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ((C2740h) this.f8197a).setThumbColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 1:
                C2740h hVar = (C2740h) this.f8197a;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                hVar.setEnabled(t, z);
                return;
            case 2:
                ((C2740h) this.f8197a).setTrackTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 3:
                C2740h hVar2 = (C2740h) this.f8197a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                hVar2.setOn(t, z2);
                return;
            case 4:
                C2740h hVar3 = (C2740h) this.f8197a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                hVar3.setValue(t, z2);
                return;
            case 5:
                C2740h hVar4 = (C2740h) this.f8197a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                hVar4.setDisabled(t, z2);
                return;
            case 6:
                ((C2740h) this.f8197a).setTrackColorForFalse(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 7:
                ((C2740h) this.f8197a).setThumbTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 8:
                ((C2740h) this.f8197a).setTrackColorForTrue(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            default:
                super.mo8908b(t, str, obj);
                return;
        }
    }
}
