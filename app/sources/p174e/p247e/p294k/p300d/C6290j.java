package p174e.p247e.p294k.p300d;

import android.app.ActivityManager;
import android.os.Build;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.concurrent.TimeUnit;
import p174e.p247e.p253d.p257d.C6065n;

/* renamed from: e.e.k.d.j */
public class C6290j implements C6065n<C6306t> {

    /* renamed from: a */
    private static final long f17408a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    private final ActivityManager f17409b;

    public C6290j(ActivityManager activityManager) {
        this.f17409b = activityManager;
    }

    /* renamed from: b */
    private int m23800b() {
        int min = Math.min(this.f17409b.getMemoryClass() * 1048576, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        if (Build.VERSION.SDK_INT < 11) {
            return 8388608;
        }
        return min / 4;
    }

    /* renamed from: a */
    public C6306t get() {
        return new C6306t(m23800b(), 256, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, f17408a);
    }
}
