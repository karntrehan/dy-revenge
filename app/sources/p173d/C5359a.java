package p173d;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: d.a */
final class C5359a {

    /* renamed from: a */
    private static final C5359a f14989a = new C5359a();

    /* renamed from: b */
    private static final int f14990b;

    /* renamed from: c */
    static final int f14991c;

    /* renamed from: d */
    static final int f14992d;

    /* renamed from: e */
    private final Executor f14993e = new C5361b();

    /* renamed from: d.a$b */
    private static class C5361b implements Executor {
        private C5361b() {
        }

        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f14990b = availableProcessors;
        f14991c = availableProcessors + 1;
        f14992d = (availableProcessors * 2) + 1;
    }

    private C5359a() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m19830a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        if (Build.VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(z);
        }
    }

    /* renamed from: b */
    public static ExecutorService m19831b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f14991c, f14992d, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        m19830a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public static Executor m19832c() {
        return f14989a.f14993e;
    }
}
