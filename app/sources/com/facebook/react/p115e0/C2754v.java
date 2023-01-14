package com.facebook.react.p115e0;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.p115e0.C2755w;
import com.facebook.react.uimanager.C2918a;
import com.facebook.react.uimanager.C2922b;
import okhttp3.HttpUrl;

/* renamed from: com.facebook.react.e0.v */
public class C2754v<T extends View, U extends C2922b<T> & C2755w<T>> extends C2918a<T, U> {
    public C2754v(U u) {
        super(u);
    }

    /* renamed from: b */
    public void mo8908b(T t, String str, Object obj) {
        str.hashCode();
        boolean z = true;
        boolean z2 = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -1900655011:
                if (str.equals("maximumTrackTintColor")) {
                    c = 0;
                    break;
                }
                break;
            case -1736983259:
                if (str.equals("thumbImage")) {
                    c = 1;
                    break;
                }
                break;
            case -1609594047:
                if (str.equals("enabled")) {
                    c = 2;
                    break;
                }
                break;
            case -1021497397:
                if (str.equals("minimumTrackTintColor")) {
                    c = 3;
                    break;
                }
                break;
            case -981448432:
                if (str.equals("maximumTrackImage")) {
                    c = 4;
                    break;
                }
                break;
            case -877170387:
                if (str.equals("testID")) {
                    c = 5;
                    break;
                }
                break;
            case 3540684:
                if (str.equals("step")) {
                    c = 6;
                    break;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    c = 7;
                    break;
                }
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    c = 8;
                    break;
                }
                break;
            case 718061361:
                if (str.equals("maximumValue")) {
                    c = 9;
                    break;
                }
                break;
            case 1139400400:
                if (str.equals("trackImage")) {
                    c = 10;
                    break;
                }
                break;
            case 1192487427:
                if (str.equals("minimumValue")) {
                    c = 11;
                    break;
                }
                break;
            case 1333596542:
                if (str.equals("minimumTrackImage")) {
                    c = 12;
                    break;
                }
                break;
            case 1912319986:
                if (str.equals("thumbTintColor")) {
                    c = 13;
                    break;
                }
                break;
        }
        double d = 0.0d;
        switch (c) {
            case 0:
                ((C2755w) this.f8197a).setMaximumTrackTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 1:
                ((C2755w) this.f8197a).setThumbImage(t, (ReadableMap) obj);
                return;
            case 2:
                C2755w wVar = (C2755w) this.f8197a;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                wVar.setEnabled(t, z);
                return;
            case 3:
                ((C2755w) this.f8197a).setMinimumTrackTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 4:
                ((C2755w) this.f8197a).setMaximumTrackImage(t, (ReadableMap) obj);
                return;
            case 5:
                ((C2755w) this.f8197a).setTestID(t, obj == null ? HttpUrl.FRAGMENT_ENCODE_SET : (String) obj);
                return;
            case 6:
                C2755w wVar2 = (C2755w) this.f8197a;
                if (obj != null) {
                    d = ((Double) obj).doubleValue();
                }
                wVar2.setStep(t, d);
                return;
            case 7:
                C2755w wVar3 = (C2755w) this.f8197a;
                if (obj != null) {
                    d = ((Double) obj).doubleValue();
                }
                wVar3.setValue(t, d);
                return;
            case 8:
                C2755w wVar4 = (C2755w) this.f8197a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                wVar4.setDisabled(t, z2);
                return;
            case 9:
                ((C2755w) this.f8197a).setMaximumValue(t, obj == null ? 1.0d : ((Double) obj).doubleValue());
                return;
            case 10:
                ((C2755w) this.f8197a).setTrackImage(t, (ReadableMap) obj);
                return;
            case 11:
                C2755w wVar5 = (C2755w) this.f8197a;
                if (obj != null) {
                    d = ((Double) obj).doubleValue();
                }
                wVar5.setMinimumValue(t, d);
                return;
            case 12:
                ((C2755w) this.f8197a).setMinimumTrackImage(t, (ReadableMap) obj);
                return;
            case 13:
                ((C2755w) this.f8197a).setThumbTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            default:
                super.mo8908b(t, str, obj);
                return;
        }
    }
}
