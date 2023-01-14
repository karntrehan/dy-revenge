package com.facebook.react.p115e0;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.p115e0.C2738f;
import com.facebook.react.uimanager.C2918a;
import com.facebook.react.uimanager.C2922b;
import com.p106BV.LinearGradient.LinearGradientManager;

/* renamed from: com.facebook.react.e0.e */
public class C2737e<T extends View, U extends C2922b<T> & C2738f<T>> extends C2918a<T, U> {
    public C2737e(U u) {
        super(u);
    }

    /* renamed from: a */
    public void mo8907a(T t, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeRefreshing")) {
            ((C2738f) this.f8197a).setNativeRefreshing(t, readableArray.getBoolean(0));
        }
    }

    /* renamed from: b */
    public void mo8908b(T t, String str, Object obj) {
        str.hashCode();
        boolean z = true;
        boolean z2 = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals("enabled")) {
                    c = 0;
                    break;
                }
                break;
            case -1354842768:
                if (str.equals(LinearGradientManager.PROP_COLORS)) {
                    c = 1;
                    break;
                }
                break;
            case -885150488:
                if (str.equals("progressBackgroundColor")) {
                    c = 2;
                    break;
                }
                break;
            case -416037467:
                if (str.equals("progressViewOffset")) {
                    c = 3;
                    break;
                }
                break;
            case -321826009:
                if (str.equals("refreshing")) {
                    c = 4;
                    break;
                }
                break;
            case 3530753:
                if (str.equals("size")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C2738f fVar = (C2738f) this.f8197a;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                fVar.setEnabled(t, z);
                return;
            case 1:
                ((C2738f) this.f8197a).setColors(t, (ReadableArray) obj);
                return;
            case 2:
                ((C2738f) this.f8197a).setProgressBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 3:
                ((C2738f) this.f8197a).setProgressViewOffset(t, obj == null ? 0.0f : ((Double) obj).floatValue());
                return;
            case 4:
                C2738f fVar2 = (C2738f) this.f8197a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                fVar2.setRefreshing(t, z2);
                return;
            case 5:
                ((C2738f) this.f8197a).setSize(t, (String) obj);
                return;
            default:
                super.mo8908b(t, str, obj);
                return;
        }
    }
}
