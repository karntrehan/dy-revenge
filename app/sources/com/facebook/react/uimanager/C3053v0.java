package com.facebook.react.uimanager;

import android.widget.ImageView;
import com.facebook.react.common.C2693e;
import com.facebook.react.uimanager.events.C2958k;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.uimanager.v0 */
class C3053v0 {
    /* renamed from: a */
    static Map m12094a() {
        return C2693e.m10911a().mo8815b("topChange", C2693e.m10914d("phasedRegistrationNames", C2693e.m10915e("bubbled", "onChange", "captured", "onChangeCapture"))).mo8815b("topSelect", C2693e.m10914d("phasedRegistrationNames", C2693e.m10915e("bubbled", "onSelect", "captured", "onSelectCapture"))).mo8815b(C2958k.m11792e(C2958k.START), C2693e.m10914d("phasedRegistrationNames", C2693e.m10915e("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).mo8815b(C2958k.m11792e(C2958k.MOVE), C2693e.m10914d("phasedRegistrationNames", C2693e.m10915e("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).mo8815b(C2958k.m11792e(C2958k.END), C2693e.m10914d("phasedRegistrationNames", C2693e.m10915e("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).mo8815b(C2958k.m11792e(C2958k.CANCEL), C2693e.m10914d("phasedRegistrationNames", C2693e.m10915e("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).mo8814a();
    }

    /* renamed from: b */
    public static Map<String, Object> m12095b() {
        HashMap b = C2693e.m10912b();
        b.put("UIView", C2693e.m10914d("ContentMode", C2693e.m10916f("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        b.put("StyleConstants", C2693e.m10914d("PointerEventsValues", C2693e.m10917g("none", Integer.valueOf(C3040s.NONE.ordinal()), "boxNone", Integer.valueOf(C3040s.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(C3040s.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(C3040s.AUTO.ordinal()))));
        b.put("PopupMenu", C2693e.m10915e("dismissed", "dismissed", "itemSelected", "itemSelected"));
        b.put("AccessibilityEventTypes", C2693e.m10916f("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return b;
    }

    /* renamed from: c */
    static Map m12096c() {
        return C2693e.m10911a().mo8815b("topContentSizeChange", C2693e.m10914d("registrationName", "onContentSizeChange")).mo8815b("topLayout", C2693e.m10914d("registrationName", "onLayout")).mo8815b("topLoadingError", C2693e.m10914d("registrationName", "onLoadingError")).mo8815b("topLoadingFinish", C2693e.m10914d("registrationName", "onLoadingFinish")).mo8815b("topLoadingStart", C2693e.m10914d("registrationName", "onLoadingStart")).mo8815b("topSelectionChange", C2693e.m10914d("registrationName", "onSelectionChange")).mo8815b("topMessage", C2693e.m10914d("registrationName", "onMessage")).mo8815b("topClick", C2693e.m10914d("registrationName", "onClick")).mo8815b("topScrollBeginDrag", C2693e.m10914d("registrationName", "onScrollBeginDrag")).mo8815b("topScrollEndDrag", C2693e.m10914d("registrationName", "onScrollEndDrag")).mo8815b("topScroll", C2693e.m10914d("registrationName", "onScroll")).mo8815b("topMomentumScrollBegin", C2693e.m10914d("registrationName", "onMomentumScrollBegin")).mo8815b("topMomentumScrollEnd", C2693e.m10914d("registrationName", "onMomentumScrollEnd")).mo8814a();
    }
}
