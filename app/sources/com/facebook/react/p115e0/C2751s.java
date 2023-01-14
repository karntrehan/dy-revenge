package com.facebook.react.p115e0;

import android.view.View;
import com.facebook.react.p115e0.C2752t;
import com.facebook.react.uimanager.C2918a;
import com.facebook.react.uimanager.C2922b;

/* renamed from: com.facebook.react.e0.s */
public class C2751s<T extends View, U extends C2922b<T> & C2752t<T>> extends C2918a<T, U> {
    public C2751s(U u) {
        super(u);
    }

    /* renamed from: b */
    public void mo8908b(T t, String str, Object obj) {
        str.hashCode();
        if (!str.equals("type")) {
            super.mo8908b(t, str, obj);
        } else {
            ((C2752t) this.f8197a).setType(t, (String) obj);
        }
    }
}
