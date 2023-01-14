package p174e.p446g.p448b;

import com.facebook.react.C2906s;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import java.util.List;
import p455g.p470y.p472d.C10457l;

/* renamed from: e.g.b.t */
public final class C10222t implements C2906s {
    /* renamed from: a */
    public List<ViewManager<?, ?>> mo7573a(ReactApplicationContext reactApplicationContext) {
        C10457l.m35320e(reactApplicationContext, "reactContext");
        return C10350l.m35140i(new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager());
    }

    /* renamed from: d */
    public List<NativeModule> mo7574d(ReactApplicationContext reactApplicationContext) {
        C10457l.m35320e(reactApplicationContext, "reactContext");
        return C10349k.m35133b(new RNGestureHandlerModule(reactApplicationContext));
    }
}
