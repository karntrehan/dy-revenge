package p174e.p247e.p294k.p300d;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.concurrent.TimeUnit;
import p174e.p247e.p253d.p257d.C6065n;

/* renamed from: e.e.k.d.l */
public class C6292l implements C6065n<C6306t> {

    /* renamed from: a */
    private static final long f17411a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    private int m23808b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 1048576;
        }
        return min < 33554432 ? 2097152 : 4194304;
    }

    /* renamed from: a */
    public C6306t get() {
        int b = m23808b();
        return new C6306t(b, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, b, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, b / 8, f17411a);
    }
}
