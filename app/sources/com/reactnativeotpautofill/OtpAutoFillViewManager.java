package com.reactnativeotpautofill;

import android.view.View;
import com.facebook.react.common.C2693e;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.p120j1.C2991a;
import java.util.Map;

public class OtpAutoFillViewManager extends SimpleViewManager<View> {
    public static final String REACT_CLASS = "OtpAutoFillView";

    public View createViewInstance(C3031o0 o0Var) {
        return new C5344e(o0Var);
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = C2693e.m10912b();
        }
        exportedCustomDirectEventTypeConstants.put("complete", C2693e.m10914d("registrationName", "onComplete"));
        exportedCustomDirectEventTypeConstants.put("androidSignature", C2693e.m10914d("registrationName", "onAndroidSignature"));
        return exportedCustomDirectEventTypeConstants;
    }

    public String getName() {
        return REACT_CLASS;
    }

    @C2991a(name = "color")
    public void setColor(C5344e eVar, String str) {
        eVar.setOtpTextColor(str);
    }

    @C2991a(name = "fontSize")
    public void setFontSize(C5344e eVar, float f) {
        eVar.setOtpTextFontSize(f);
    }

    @C2991a(name = "space")
    public void setSpace(C5344e eVar, float f) {
        eVar.setOtpTextSpace(f);
    }

    @C2991a(name = "length")
    public void setTextLength(C5344e eVar, int i) {
        eVar.setOtpTextLength(i);
    }
}
