package com.facebook.react.p115e0;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.p115e0.C2736d;
import com.facebook.react.uimanager.C2918a;
import com.facebook.react.uimanager.C2922b;
import okhttp3.HttpUrl;

/* renamed from: com.facebook.react.e0.c */
public class C2735c<T extends View, U extends C2922b<T> & C2736d<T>> extends C2918a<T, U> {
    public C2735c(U u) {
        super(u);
    }

    /* renamed from: b */
    public void mo8908b(T t, String str, Object obj) {
        str.hashCode();
        boolean z = true;
        boolean z2 = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -1001078227:
                if (str.equals("progress")) {
                    c = 0;
                    break;
                }
                break;
            case -877170387:
                if (str.equals("testID")) {
                    c = 1;
                    break;
                }
                break;
            case -676876213:
                if (str.equals("typeAttr")) {
                    c = 2;
                    break;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    c = 3;
                    break;
                }
                break;
            case 633138363:
                if (str.equals("indeterminate")) {
                    c = 4;
                    break;
                }
                break;
            case 1118509918:
                if (str.equals("animating")) {
                    c = 5;
                    break;
                }
                break;
            case 1804741442:
                if (str.equals("styleAttr")) {
                    c = 6;
                    break;
                }
                break;
        }
        String str2 = null;
        switch (c) {
            case 0:
                ((C2736d) this.f8197a).setProgress(t, obj == null ? 0.0d : ((Double) obj).doubleValue());
                return;
            case 1:
                ((C2736d) this.f8197a).setTestID(t, obj == null ? HttpUrl.FRAGMENT_ENCODE_SET : (String) obj);
                return;
            case 2:
                C2736d dVar = (C2736d) this.f8197a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                dVar.setTypeAttr(t, str2);
                return;
            case 3:
                ((C2736d) this.f8197a).setColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 4:
                C2736d dVar2 = (C2736d) this.f8197a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                dVar2.setIndeterminate(t, z2);
                return;
            case 5:
                C2736d dVar3 = (C2736d) this.f8197a;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                dVar3.setAnimating(t, z);
                return;
            case 6:
                C2736d dVar4 = (C2736d) this.f8197a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                dVar4.setStyleAttr(t, str2);
                return;
            default:
                super.mo8908b(t, str, obj);
                return;
        }
    }
}
