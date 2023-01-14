package androidx.camera.core;

import androidx.camera.core.impl.C0883t0;
import androidx.core.util.C1177h;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.camera.core.n1 */
class C0943n1 implements Executor {

    /* renamed from: f */
    private static final ThreadFactory f2665f = new C0944a();

    /* renamed from: o */
    private final Object f2666o = new Object();

    /* renamed from: p */
    private ThreadPoolExecutor f2667p = m3682a();

    /* renamed from: androidx.camera.core.n1$a */
    class C0944a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f2668a = new AtomicInteger(0);

        C0944a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", new Object[]{Integer.valueOf(this.f2668a.getAndIncrement())}));
            return thread;
        }
    }

    C0943n1() {
    }

    /* renamed from: a */
    private static ThreadPoolExecutor m3682a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f2665f);
        threadPoolExecutor.setRejectedExecutionHandler(C0631d.f2054a);
        return threadPoolExecutor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3190b(C0883t0 t0Var) {
        ThreadPoolExecutor threadPoolExecutor;
        C1177h.m4583e(t0Var);
        synchronized (this.f2666o) {
            if (this.f2667p.isShutdown()) {
                this.f2667p = m3682a();
            }
            threadPoolExecutor = this.f2667p;
        }
        int max = Math.max(1, t0Var.mo2361a().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    public void execute(Runnable runnable) {
        C1177h.m4583e(runnable);
        synchronized (this.f2666o) {
            this.f2667p.execute(runnable);
        }
    }
}
