package com.learnium.RNDeviceInfo.p166d;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.learnium.RNDeviceInfo.C5082a;

/* renamed from: com.learnium.RNDeviceInfo.d.b */
public class C5088b {

    /* renamed from: a */
    private final Context f14433a;

    public C5088b(Context context) {
        this.f14433a = context;
    }

    /* renamed from: b */
    private C5082a m19236b() {
        WindowManager windowManager = (WindowManager) this.f14433a.getSystemService("window");
        if (windowManager == null) {
            return C5082a.UNKNOWN;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i = Build.VERSION.SDK_INT;
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (i >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        double sqrt = Math.sqrt(Math.pow(((double) displayMetrics.widthPixels) / ((double) displayMetrics.xdpi), 2.0d) + Math.pow(((double) displayMetrics.heightPixels) / ((double) displayMetrics.ydpi), 2.0d));
        return (sqrt < 3.0d || sqrt > 6.9d) ? (sqrt <= 6.9d || sqrt > 18.0d) ? C5082a.UNKNOWN : C5082a.TABLET : C5082a.HANDSET;
    }

    /* renamed from: c */
    private C5082a m19237c() {
        int i = this.f14433a.getResources().getConfiguration().smallestScreenWidthDp;
        return i == 0 ? C5082a.UNKNOWN : i >= 600 ? C5082a.TABLET : C5082a.HANDSET;
    }

    /* renamed from: a */
    public C5082a mo15546a() {
        if (this.f14433a.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            return C5082a.TV;
        }
        UiModeManager uiModeManager = (UiModeManager) this.f14433a.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return C5082a.TV;
        }
        C5082a c = m19237c();
        return (c == null || c == C5082a.UNKNOWN) ? m19236b() : c;
    }

    /* renamed from: d */
    public boolean mo15547d() {
        return mo15546a() == C5082a.TABLET;
    }
}
