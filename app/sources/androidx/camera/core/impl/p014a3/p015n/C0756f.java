package androidx.camera.core.impl.p014a3.p015n;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.core.impl.a3.n.f */
final class C0756f {

    /* renamed from: a */
    private static volatile ScheduledExecutorService f2306a;

    private C0756f() {
    }

    /* renamed from: a */
    static ScheduledExecutorService m3060a() {
        if (f2306a != null) {
            return f2306a;
        }
        synchronized (C0756f.class) {
            if (f2306a == null) {
                f2306a = new C0746c(new Handler(Looper.getMainLooper()));
            }
        }
        return f2306a;
    }
}
