package com.facebook.react.modules.i18nmanager;

import android.os.Build;
import com.facebook.fbreact.specs.NativeI18nManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.C2693e;
import com.facebook.react.p109b0.p110a.C2639a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@C2639a(name = "I18nManager")
public class I18nManagerModule extends NativeI18nManagerSpec {
    public static final String NAME = "I18nManager";
    private final C2822a sharedI18nUtilInstance = C2822a.m11246d();

    public I18nManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void allowRTL(boolean z) {
        this.sharedI18nUtilInstance.mo9189a(getReactApplicationContext(), z);
    }

    public void forceRTL(boolean z) {
        this.sharedI18nUtilInstance.mo9191c(getReactApplicationContext(), z);
    }

    public String getName() {
        return NAME;
    }

    public Map<String, Object> getTypedExportedConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Locale locale = Build.VERSION.SDK_INT >= 24 ? reactApplicationContext.getResources().getConfiguration().getLocales().get(0) : reactApplicationContext.getResources().getConfiguration().locale;
        HashMap b = C2693e.m10912b();
        b.put("isRTL", Boolean.valueOf(this.sharedI18nUtilInstance.mo9192g(reactApplicationContext)));
        b.put("doLeftAndRightSwapInRTL", Boolean.valueOf(this.sharedI18nUtilInstance.mo9190b(reactApplicationContext)));
        b.put("localeIdentifier", locale.toString());
        return b;
    }

    public void swapLeftAndRightInRTL(boolean z) {
        this.sharedI18nUtilInstance.mo9193k(getReactApplicationContext(), z);
    }
}
