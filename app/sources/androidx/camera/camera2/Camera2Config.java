package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.p003e.C0334c2;
import androidx.camera.camera2.p003e.C0355f2;
import androidx.camera.core.C0945n2;
import androidx.camera.core.C0984u1;
import androidx.camera.core.C0994w1;
import androidx.camera.core.impl.C0875s0;
import androidx.camera.core.impl.C0915y2;
import java.util.Set;

public final class Camera2Config {

    public static final class DefaultProvider implements C0994w1.C0996b {
        public C0994w1 getCameraXConfig() {
            return Camera2Config.m1498a();
        }
    }

    /* renamed from: a */
    public static C0994w1 m1498a() {
        C0302c cVar = C0302c.f1294a;
        C0301b bVar = C0301b.f1293a;
        return new C0994w1.C0995a().mo3278c(cVar).mo3279d(bVar).mo3282g(C0300a.f1292a).mo3277a();
    }

    /* renamed from: b */
    static /* synthetic */ C0875s0 m1499b(Context context, Object obj, Set set) {
        try {
            return new C0334c2(context, obj, set);
        } catch (C0984u1 e) {
            throw new C0945n2(e);
        }
    }

    /* renamed from: c */
    static /* synthetic */ C0915y2 m1500c(Context context) {
        return new C0355f2(context);
    }
}
