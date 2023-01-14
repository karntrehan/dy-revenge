package androidx.camera.core.impl.p014a3.p015n;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.camera.core.impl.a3.n.e */
final class C0754e implements Executor {

    /* renamed from: f */
    private static volatile Executor f2302f;

    /* renamed from: o */
    private final ExecutorService f2303o = Executors.newFixedThreadPool(2, new C0755a());

    /* renamed from: androidx.camera.core.impl.a3.n.e$a */
    class C0755a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f2304a = new AtomicInteger(0);

        C0755a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", new Object[]{Integer.valueOf(this.f2304a.getAndIncrement())}));
            return thread;
        }
    }

    C0754e() {
    }

    /* renamed from: a */
    static Executor m3059a() {
        if (f2302f != null) {
            return f2302f;
        }
        synchronized (C0754e.class) {
            if (f2302f == null) {
                f2302f = new C0754e();
            }
        }
        return f2302f;
    }

    public void execute(Runnable runnable) {
        this.f2303o.execute(runnable);
    }
}
