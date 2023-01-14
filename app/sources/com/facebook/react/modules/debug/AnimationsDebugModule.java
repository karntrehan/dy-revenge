package com.facebook.react.modules.debug;

import android.widget.Toast;
import com.facebook.fbreact.specs.NativeAnimationsDebugModuleSpec;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.debug.C2812b;
import com.facebook.react.modules.debug.p119c.C2815a;
import com.facebook.react.p109b0.p110a.C2639a;
import java.util.Locale;
import p174e.p247e.p253d.p258e.C6071a;

@C2639a(name = "AnimationsDebugModule")
public class AnimationsDebugModule extends NativeAnimationsDebugModuleSpec {
    protected static final String NAME = "AnimationsDebugModule";
    private final C2815a mCatalystSettings;
    private C2812b mFrameCallback;

    public AnimationsDebugModule(ReactApplicationContext reactApplicationContext, C2815a aVar) {
        super(reactApplicationContext);
        this.mCatalystSettings = aVar;
    }

    public String getName() {
        return NAME;
    }

    public void invalidate() {
        C2812b bVar = this.mFrameCallback;
        if (bVar != null) {
            bVar.mo9169n();
            this.mFrameCallback = null;
        }
    }

    public void startRecordingFps() {
        C2815a aVar = this.mCatalystSettings;
        if (aVar != null && aVar.mo9172b()) {
            if (this.mFrameCallback == null) {
                C2812b bVar = new C2812b(getReactApplicationContext());
                this.mFrameCallback = bVar;
                bVar.mo9168m();
                return;
            }
            throw new JSApplicationCausedNativeException("Already recording FPS!");
        }
    }

    public void stopRecordingFps(double d) {
        C2812b bVar = this.mFrameCallback;
        if (bVar != null) {
            bVar.mo9169n();
            C2812b.C2814b g = this.mFrameCallback.mo9162g((long) d);
            if (g == null) {
                Toast.makeText(getReactApplicationContext(), "Unable to get FPS info", 1);
            } else {
                Locale locale = Locale.US;
                String str = String.format(locale, "FPS: %.2f, %d frames (%d expected)", new Object[]{Double.valueOf(g.f7954e), Integer.valueOf(g.f7950a), Integer.valueOf(g.f7952c)}) + "\n" + String.format(locale, "JS FPS: %.2f, %d frames (%d expected)", new Object[]{Double.valueOf(g.f7955f), Integer.valueOf(g.f7951b), Integer.valueOf(g.f7952c)}) + "\nTotal Time MS: " + String.format(locale, "%d", new Object[]{Integer.valueOf(g.f7956g)});
                C6071a.m22868b("ReactNative", str);
                Toast.makeText(getReactApplicationContext(), str, 1).show();
            }
            this.mFrameCallback = null;
        }
    }
}
