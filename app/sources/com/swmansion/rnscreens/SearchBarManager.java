package com.swmansion.rnscreens;

import com.facebook.react.common.C2693e;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p120j1.C2991a;
import java.util.Map;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

@C2639a(name = "RNSSearchBar")
public final class SearchBarManager extends ViewGroupManager<C10038d0> {
    public static final C10026a Companion = new C10026a((C10452g) null);
    public static final String REACT_CLASS = "RNSSearchBar";

    /* renamed from: com.swmansion.rnscreens.SearchBarManager$a */
    public static final class C10026a {
        private C10026a() {
        }

        public /* synthetic */ C10026a(C10452g gVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public C10038d0 createViewInstance(C3031o0 o0Var) {
        C10457l.m35320e(o0Var, "context");
        return new C10038d0(o0Var);
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return C2693e.m10911a().mo8815b("onChangeText", C2693e.m10914d("registrationName", "onChangeText")).mo8815b("onSearchButtonPress", C2693e.m10914d("registrationName", "onSearchButtonPress")).mo8815b("onFocus", C2693e.m10914d("registrationName", "onFocus")).mo8815b("onBlur", C2693e.m10914d("registrationName", "onBlur")).mo8815b("onClose", C2693e.m10914d("registrationName", "onClose")).mo8815b("onOpen", C2693e.m10914d("registrationName", "onOpen")).mo8814a();
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C10038d0 d0Var) {
        C10457l.m35320e(d0Var, "view");
        super.onAfterUpdateTransaction(d0Var);
        d0Var.mo25006P();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r3.equals("none") != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        throw new com.facebook.react.bridge.JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
     */
    @com.facebook.react.uimanager.p120j1.C2991a(name = "autoCapitalize")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setAutoCapitalize(com.swmansion.rnscreens.C10038d0 r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            p455g.p470y.p472d.C10457l.m35320e(r2, r0)
            if (r3 == 0) goto L_0x0041
            int r0 = r3.hashCode()
            switch(r0) {
                case 3387192: goto L_0x0030;
                case 113318569: goto L_0x0025;
                case 490141296: goto L_0x001a;
                case 1245424234: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0039
        L_0x000f:
            java.lang.String r0 = "characters"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.d0$a r3 = com.swmansion.rnscreens.C10038d0.C10039a.CHARACTERS
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "sentences"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.d0$a r3 = com.swmansion.rnscreens.C10038d0.C10039a.SENTENCES
            goto L_0x0043
        L_0x0025:
            java.lang.String r0 = "words"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.d0$a r3 = com.swmansion.rnscreens.C10038d0.C10039a.WORDS
            goto L_0x0043
        L_0x0030:
            java.lang.String r0 = "none"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r3 = "Forbidden auto capitalize value passed"
            r2.<init>(r3)
            throw r2
        L_0x0041:
            com.swmansion.rnscreens.d0$a r3 = com.swmansion.rnscreens.C10038d0.C10039a.NONE
        L_0x0043:
            r2.setAutoCapitalize(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setAutoCapitalize(com.swmansion.rnscreens.d0, java.lang.String):void");
    }

    @C2991a(name = "autoFocus")
    public final void setAutoFocus(C10038d0 d0Var, Boolean bool) {
        C10457l.m35320e(d0Var, "view");
        d0Var.setAutoFocus(bool != null ? bool.booleanValue() : false);
    }

    @C2991a(name = "disableBackButtonOverride")
    public final void setDisableBackButtonOverride(C10038d0 d0Var, Boolean bool) {
        C10457l.m35320e(d0Var, "view");
        d0Var.setShouldOverrideBackButton(!C10457l.m35316a(bool, Boolean.TRUE));
    }

    @C2991a(customType = "Color", name = "headerIconColor")
    public final void setHeaderIconColor(C10038d0 d0Var, Integer num) {
        C10457l.m35320e(d0Var, "view");
        d0Var.setHeaderIconColor(num);
    }

    @C2991a(customType = "Color", name = "hintTextColor")
    public final void setHintTextColor(C10038d0 d0Var, Integer num) {
        C10457l.m35320e(d0Var, "view");
        d0Var.setHintTextColor(num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r3.equals("text") != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        throw new com.facebook.react.bridge.JSApplicationIllegalArgumentException("Forbidden input type value");
     */
    @com.facebook.react.uimanager.p120j1.C2991a(name = "inputType")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setInputType(com.swmansion.rnscreens.C10038d0 r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            p455g.p470y.p472d.C10457l.m35320e(r2, r0)
            if (r3 == 0) goto L_0x0041
            int r0 = r3.hashCode()
            switch(r0) {
                case -1034364087: goto L_0x002e;
                case 3556653: goto L_0x0025;
                case 96619420: goto L_0x001a;
                case 106642798: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0039
        L_0x000f:
            java.lang.String r0 = "phone"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.d0$b r3 = com.swmansion.rnscreens.C10038d0.C10040b.f26788o
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "email"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.d0$b r3 = com.swmansion.rnscreens.C10038d0.C10040b.f26790q
            goto L_0x0043
        L_0x0025:
            java.lang.String r0 = "text"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            goto L_0x0041
        L_0x002e:
            java.lang.String r0 = "number"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.d0$b r3 = com.swmansion.rnscreens.C10038d0.C10040b.f26789p
            goto L_0x0043
        L_0x0039:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r3 = "Forbidden input type value"
            r2.<init>(r3)
            throw r2
        L_0x0041:
            com.swmansion.rnscreens.d0$b r3 = com.swmansion.rnscreens.C10038d0.C10040b.f26787f
        L_0x0043:
            r2.setInputType(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setInputType(com.swmansion.rnscreens.d0, java.lang.String):void");
    }

    @C2991a(name = "placeholder")
    public final void setPlaceholder(C10038d0 d0Var, String str) {
        C10457l.m35320e(d0Var, "view");
        if (str != null) {
            d0Var.setPlaceholder(str);
        }
    }

    @C2991a(name = "shouldShowHintSearchIcon")
    public final void setShouldShowHintSearchIcon(C10038d0 d0Var, Boolean bool) {
        C10457l.m35320e(d0Var, "view");
        d0Var.setShouldShowHintSearchIcon(bool != null ? bool.booleanValue() : true);
    }

    @C2991a(customType = "Color", name = "textColor")
    public final void setTextColor(C10038d0 d0Var, Integer num) {
        C10457l.m35320e(d0Var, "view");
        d0Var.setTextColor(num);
    }

    @C2991a(customType = "Color", name = "barTintColor")
    public final void setTintColor(C10038d0 d0Var, Integer num) {
        C10457l.m35320e(d0Var, "view");
        d0Var.setTintColor(num);
    }
}
