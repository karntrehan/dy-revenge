package p174e.p319f.p320a.p335c.p345f.p350e;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: e.f.a.c.f.e.h */
final class C6684h implements C6682f {
    /* synthetic */ C6684h(C6683g gVar) {
    }

    /* renamed from: a */
    public final ExecutorService mo19476a(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: b */
    public final ExecutorService mo19477b(ThreadFactory threadFactory, int i) {
        return mo19476a(1, threadFactory, 1);
    }
}
