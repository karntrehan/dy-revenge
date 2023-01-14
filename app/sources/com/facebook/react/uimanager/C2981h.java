package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;

/* renamed from: com.facebook.react.uimanager.h */
public class C2981h extends JSApplicationCausedNativeException {

    /* renamed from: f */
    private View f8305f;

    public C2981h(String str) {
        super(str);
    }

    public C2981h(String str, View view, Throwable th) {
        super(str, th);
        this.f8305f = view;
    }
}
