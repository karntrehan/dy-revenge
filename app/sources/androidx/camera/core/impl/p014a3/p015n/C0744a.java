package androidx.camera.core.impl.p014a3.p015n;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.core.impl.a3.n.a */
public final class C0744a {
    /* renamed from: a */
    public static Executor m3044a() {
        return C0745b.m3051a();
    }

    /* renamed from: b */
    public static Executor m3045b() {
        return C0752d.m3058a();
    }

    /* renamed from: c */
    public static Executor m3046c() {
        return C0754e.m3059a();
    }

    /* renamed from: d */
    public static ScheduledExecutorService m3047d() {
        return C0756f.m3060a();
    }

    /* renamed from: e */
    public static ScheduledExecutorService m3048e() {
        return C0746c.m3053b();
    }

    /* renamed from: f */
    public static ScheduledExecutorService m3049f(Handler handler) {
        return new C0746c(handler);
    }

    /* renamed from: g */
    public static Executor m3050g(Executor executor) {
        return new C0757g(executor);
    }
}
