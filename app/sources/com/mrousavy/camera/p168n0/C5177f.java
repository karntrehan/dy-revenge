package com.mrousavy.camera.p168n0;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactContext;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.n0.f */
public final class C5177f {
    /* renamed from: a */
    public static final int m19454a(Context context) {
        Display defaultDisplay;
        Activity currentActivity;
        Display display;
        C10457l.m35320e(context, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            Display display2 = context.getDisplay();
            if (display2 != null) {
                return display2.getRotation();
            }
            if (!(!(context instanceof ReactContext) || (currentActivity = ((ReactContext) context).getCurrentActivity()) == null || (display = currentActivity.getDisplay()) == null)) {
                return display.getRotation();
            }
        }
        Object systemService = context.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        return defaultDisplay.getRotation();
    }
}
