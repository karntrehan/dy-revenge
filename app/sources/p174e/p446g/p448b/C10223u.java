package p174e.p446g.p448b;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C2944c;
import p455g.p470y.p472d.C10457l;

/* renamed from: e.g.b.u */
public final class C10223u {
    /* renamed from: a */
    public static final void m34737a(ReactContext reactContext, C2944c<?> cVar) {
        C10457l.m35320e(reactContext, "<this>");
        C10457l.m35320e(cVar, "event");
        try {
            NativeModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
            C10457l.m35317b(nativeModule);
            ((UIManagerModule) nativeModule).getEventDispatcher().mo9651c(cVar);
        } catch (NullPointerException e) {
            throw new Exception("Couldn't get an instance of UIManagerModule. Gesture Handler is unable to send an event.", e);
        }
    }
}
