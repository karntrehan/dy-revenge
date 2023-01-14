package com.facebook.react.views.drawer;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.C2693e;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p115e0.C2733a;
import com.facebook.react.p115e0.C2734b;
import com.facebook.react.uimanager.C2928c1;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.views.drawer.p125b.C3093a;
import com.facebook.react.views.drawer.p125b.C3094b;
import com.facebook.react.views.drawer.p125b.C3095c;
import com.facebook.react.views.drawer.p125b.C3096d;
import java.util.Map;
import p027c.p082m.p083a.C2039a;

@C2639a(name = "AndroidDrawerLayout")
public class ReactDrawerLayoutManager extends ViewGroupManager<C3092a> implements C2734b<C3092a> {
    public static final int CLOSE_DRAWER = 2;
    public static final int OPEN_DRAWER = 1;
    public static final String REACT_CLASS = "AndroidDrawerLayout";
    private final C2928c1<C3092a> mDelegate = new C2733a(this);

    /* renamed from: com.facebook.react.views.drawer.ReactDrawerLayoutManager$a */
    public static class C3091a implements C2039a.C2043d {

        /* renamed from: a */
        private final C2039a f8594a;

        /* renamed from: b */
        private final C2945d f8595b;

        public C3091a(C2039a aVar, C2945d dVar) {
            this.f8594a = aVar;
            this.f8595b = dVar;
        }

        /* renamed from: a */
        public void mo6876a(View view) {
            this.f8595b.mo9651c(new C3094b(C3051u0.m12088e(this.f8594a), this.f8594a.getId()));
        }

        /* renamed from: b */
        public void mo6877b(View view) {
            this.f8595b.mo9651c(new C3093a(C3051u0.m12088e(this.f8594a), this.f8594a.getId()));
        }

        /* renamed from: c */
        public void mo6878c(int i) {
            this.f8595b.mo9651c(new C3096d(C3051u0.m12088e(this.f8594a), this.f8594a.getId(), i));
        }

        /* renamed from: d */
        public void mo6879d(View view, float f) {
            this.f8595b.mo9651c(new C3095c(C3051u0.m12088e(this.f8594a), this.f8594a.getId(), f));
        }
    }

    private void setDrawerPositionInternal(C3092a aVar, String str) {
        int i;
        if (str.equals("left")) {
            i = 8388611;
        } else if (str.equals("right")) {
            i = 8388613;
        } else {
            throw new JSApplicationIllegalArgumentException("drawerPosition must be 'left' or 'right', received" + str);
        }
        aVar.mo9926X(i);
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3031o0 o0Var, C3092a aVar) {
        C2945d b = C3051u0.m12085b(o0Var, aVar.getId());
        if (b != null) {
            aVar.mo6823a(new C3091a(aVar, b));
        }
    }

    public void addView(C3092a aVar, View view, int i) {
        if (getChildCount(aVar) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        } else if (i == 0 || i == 1) {
            aVar.addView(view, i);
            aVar.mo9927Y();
        } else {
            throw new JSApplicationIllegalArgumentException("The only valid indices for drawer's child are 0 or 1. Got " + i + " instead.");
        }
    }

    public void closeDrawer(C3092a aVar) {
        aVar.mo9924V();
    }

    /* access modifiers changed from: protected */
    public C3092a createViewInstance(C3031o0 o0Var) {
        return new C3092a(o0Var);
    }

    public Map<String, Integer> getCommandsMap() {
        return C2693e.m10915e("openDrawer", 1, "closeDrawer", 2);
    }

    public C2928c1<C3092a> getDelegate() {
        return this.mDelegate;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return C2693e.m10917g("topDrawerSlide", C2693e.m10914d("registrationName", "onDrawerSlide"), "topDrawerOpen", C2693e.m10914d("registrationName", "onDrawerOpen"), "topDrawerClose", C2693e.m10914d("registrationName", "onDrawerClose"), "topDrawerStateChanged", C2693e.m10914d("registrationName", "onDrawerStateChanged"));
    }

    public Map getExportedViewConstants() {
        return C2693e.m10914d("DrawerPosition", C2693e.m10915e("Left", 8388611, "Right", 8388613));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void openDrawer(C3092a aVar) {
        aVar.mo9925W();
    }

    public void receiveCommand(C3092a aVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            aVar.mo9925W();
        } else if (i == 2) {
            aVar.mo9924V();
        }
    }

    public void receiveCommand(C3092a aVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("closeDrawer")) {
            aVar.mo9924V();
        } else if (str.equals("openDrawer")) {
            aVar.mo9925W();
        }
    }

    public void setDrawerBackgroundColor(C3092a aVar, Integer num) {
    }

    @C2991a(name = "drawerLockMode")
    public void setDrawerLockMode(C3092a aVar, String str) {
        int i;
        if (str == null || "unlocked".equals(str)) {
            i = 0;
        } else if ("locked-closed".equals(str)) {
            i = 1;
        } else if ("locked-open".equals(str)) {
            i = 2;
        } else {
            throw new JSApplicationIllegalArgumentException("Unknown drawerLockMode " + str);
        }
        aVar.setDrawerLockMode(i);
    }

    @C2991a(name = "drawerPosition")
    public void setDrawerPosition(C3092a aVar, Dynamic dynamic) {
        if (dynamic.isNull()) {
            aVar.mo9926X(8388611);
        } else if (dynamic.getType() == ReadableType.Number) {
            int asInt = dynamic.asInt();
            if (8388611 == asInt || 8388613 == asInt) {
                aVar.mo9926X(asInt);
                return;
            }
            throw new JSApplicationIllegalArgumentException("Unknown drawerPosition " + asInt);
        } else if (dynamic.getType() == ReadableType.String) {
            setDrawerPositionInternal(aVar, dynamic.asString());
        } else {
            throw new JSApplicationIllegalArgumentException("drawerPosition must be a string or int");
        }
    }

    public void setDrawerPosition(C3092a aVar, String str) {
        if (str == null) {
            aVar.mo9926X(8388611);
        } else {
            setDrawerPositionInternal(aVar, str);
        }
    }

    @C2991a(defaultFloat = Float.NaN, name = "drawerWidth")
    public void setDrawerWidth(C3092a aVar, float f) {
        aVar.mo9928Z(Float.isNaN(f) ? -1 : Math.round(C3038r.m12006c(f)));
    }

    public void setDrawerWidth(C3092a aVar, Float f) {
        aVar.mo9928Z(f == null ? -1 : Math.round(C3038r.m12006c(f.floatValue())));
    }

    public void setElevation(C3092a aVar, float f) {
        aVar.setDrawerElevation(C3038r.m12006c(f));
    }

    public void setKeyboardDismissMode(C3092a aVar, String str) {
    }

    public void setStatusBarBackgroundColor(C3092a aVar, Integer num) {
    }
}
