package com.facebook.react.views.text;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.uimanager.p120j1.C2992b;
import com.facebook.react.views.text.C3181h;
import com.facebook.yoga.C3307g;
import p174e.p247e.p253d.p258e.C6071a;

public abstract class ReactTextAnchorViewManager<T extends View, C extends C3181h> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final String TAG = "ReactTextAnchorViewManager";

    @C2991a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(C3197s sVar, boolean z) {
        sVar.setAdjustFontSizeToFit(z);
    }

    @C2991a(name = "android_hyphenationFrequency")
    public void setAndroidHyphenationFrequency(C3197s sVar, String str) {
        int i;
        if (Build.VERSION.SDK_INT < 23) {
            C6071a.m22859G(TAG, "android_hyphenationFrequency only available since android 23");
            return;
        }
        if (str == null || str.equals("none")) {
            i = 0;
        } else if (str.equals("full")) {
            i = 2;
        } else if (str.equals("normal")) {
            i = 1;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid android_hyphenationFrequency: " + str);
        }
        sVar.setHyphenationFrequency(i);
    }

    @C2992b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C3197s sVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        sVar.mo10390i(SPACING_TYPES[i], intValue, f);
    }

    @C2992b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C3197s sVar, int i, float f) {
        if (!C3307g.m12971a(f)) {
            f = C3038r.m12006c(f);
        }
        if (i == 0) {
            sVar.setBorderRadius(f);
        } else {
            sVar.mo10392j(f, i - 1);
        }
    }

    @C2991a(name = "borderStyle")
    public void setBorderStyle(C3197s sVar, String str) {
        sVar.setBorderStyle(str);
    }

    @C2992b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C3197s sVar, int i, float f) {
        if (!C3307g.m12971a(f)) {
            f = C3038r.m12006c(f);
        }
        sVar.mo10393k(SPACING_TYPES[i], f);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @com.facebook.react.uimanager.p120j1.C2991a(name = "dataDetectorType")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDataDetectorType(com.facebook.react.views.text.C3197s r7, java.lang.String r8) {
        /*
            r6 = this;
            int r0 = r8.hashCode()
            r1 = 0
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1192969641: goto L_0x0035;
                case 96673: goto L_0x002b;
                case 3321850: goto L_0x0021;
                case 3387192: goto L_0x0017;
                case 96619420: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x003f
        L_0x000d:
            java.lang.String r0 = "email"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x003f
            r8 = 2
            goto L_0x0040
        L_0x0017:
            java.lang.String r0 = "none"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x003f
            r8 = 4
            goto L_0x0040
        L_0x0021:
            java.lang.String r0 = "link"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x003f
            r8 = 1
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "all"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x003f
            r8 = 3
            goto L_0x0040
        L_0x0035:
            java.lang.String r0 = "phoneNumber"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x003f
            r8 = 0
            goto L_0x0040
        L_0x003f:
            r8 = -1
        L_0x0040:
            if (r8 == 0) goto L_0x005a
            if (r8 == r5) goto L_0x0056
            if (r8 == r4) goto L_0x0052
            if (r8 == r3) goto L_0x004c
            r7.setLinkifyMask(r1)
            goto L_0x005d
        L_0x004c:
            r8 = 15
            r7.setLinkifyMask(r8)
            goto L_0x005d
        L_0x0052:
            r7.setLinkifyMask(r4)
            goto L_0x005d
        L_0x0056:
            r7.setLinkifyMask(r5)
            goto L_0x005d
        L_0x005a:
            r7.setLinkifyMask(r2)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextAnchorViewManager.setDataDetectorType(com.facebook.react.views.text.s, java.lang.String):void");
    }

    @C2991a(defaultBoolean = false, name = "disabled")
    public void setDisabled(C3197s sVar, boolean z) {
        sVar.setEnabled(!z);
    }

    @C2991a(name = "ellipsizeMode")
    public void setEllipsizeMode(C3197s sVar, String str) {
        TextUtils.TruncateAt truncateAt;
        if (str == null || str.equals("tail")) {
            truncateAt = TextUtils.TruncateAt.END;
        } else if (str.equals("head")) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (str.equals("middle")) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else if (str.equals("clip")) {
            truncateAt = null;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid ellipsizeMode: " + str);
        }
        sVar.setEllipsizeLocation(truncateAt);
    }

    @C2991a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(C3197s sVar, boolean z) {
        sVar.setIncludeFontPadding(z);
    }

    @C2991a(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(C3197s sVar, boolean z) {
        sVar.setNotifyOnInlineViewLayout(z);
    }

    @C2991a(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public void setNumberOfLines(C3197s sVar, int i) {
        sVar.setNumberOfLines(i);
    }

    @C2991a(name = "selectable")
    public void setSelectable(C3197s sVar, boolean z) {
        sVar.setTextIsSelectable(z);
    }

    @C2991a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(C3197s sVar, Integer num) {
        sVar.setHighlightColor(num == null ? C3170d.m12445c(sVar.getContext()) : num.intValue());
    }

    @C2991a(name = "textAlignVertical")
    public void setTextAlignVertical(C3197s sVar, String str) {
        int i;
        if (str == null || "auto".equals(str)) {
            i = 0;
        } else if ("top".equals(str)) {
            i = 48;
        } else if ("bottom".equals(str)) {
            i = 80;
        } else if ("center".equals(str)) {
            i = 16;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textAlignVertical: " + str);
        }
        sVar.setGravityVertical(i);
    }
}
