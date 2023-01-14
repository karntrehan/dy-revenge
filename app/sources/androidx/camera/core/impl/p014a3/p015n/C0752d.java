package androidx.camera.core.impl.p014a3.p015n;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.camera.core.impl.a3.n.d */
final class C0752d implements Executor {

    /* renamed from: f */
    private static volatile Executor f2299f;

    /* renamed from: o */
    private final ExecutorService f2300o = Executors.newSingleThreadExecutor(new C0753a());

    /* renamed from: androidx.camera.core.impl.a3.n.d$a */
    class C0753a implements ThreadFactory {
        C0753a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    C0752d() {
    }

    /* renamed from: a */
    static Executor m3058a() {
        if (f2299f != null) {
            return f2299f;
        }
        synchronized (C0752d.class) {
            if (f2299f == null) {
                f2299f = new C0752d();
            }
        }
        return f2299f;
    }

    public void execute(Runnable runnable) {
        this.f2300o.execute(runnable);
    }
}
