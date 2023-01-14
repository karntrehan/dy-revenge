package p027c.p064i.p070h;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.C1170a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: c.i.h.g */
class C1883g {

    /* renamed from: c.i.h.g$a */
    private static class C1884a implements ThreadFactory {

        /* renamed from: a */
        private String f5543a;

        /* renamed from: b */
        private int f5544b;

        /* renamed from: c.i.h.g$a$a */
        private static class C1885a extends Thread {

            /* renamed from: f */
            private final int f5545f;

            C1885a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f5545f = i;
            }

            public void run() {
                Process.setThreadPriority(this.f5545f);
                super.run();
            }
        }

        C1884a(String str, int i) {
            this.f5543a = str;
            this.f5544b = i;
        }

        public Thread newThread(Runnable runnable) {
            return new C1885a(runnable, this.f5543a, this.f5544b);
        }
    }

    /* renamed from: c.i.h.g$b */
    private static class C1886b<T> implements Runnable {

        /* renamed from: f */
        private Callable<T> f5546f;

        /* renamed from: o */
        private C1170a<T> f5547o;

        /* renamed from: p */
        private Handler f5548p;

        /* renamed from: c.i.h.g$b$a */
        class C1887a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C1170a f5549f;

            /* renamed from: o */
            final /* synthetic */ Object f5550o;

            C1887a(C1170a aVar, Object obj) {
                this.f5549f = aVar;
                this.f5550o = obj;
            }

            public void run() {
                this.f5549f.mo2687a(this.f5550o);
            }
        }

        C1886b(Handler handler, Callable<T> callable, C1170a<T> aVar) {
            this.f5546f = callable;
            this.f5547o = aVar;
            this.f5548p = handler;
        }

        public void run() {
            T t;
            try {
                t = this.f5546f.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f5548p.post(new C1887a(this.f5547o, t));
        }
    }

    /* renamed from: a */
    static ThreadPoolExecutor m7926a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C1884a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    static <T> void m7927b(Executor executor, Callable<T> callable, C1170a<T> aVar) {
        executor.execute(new C1886b(C1869b.m7887a(), callable, aVar));
    }

    /* renamed from: c */
    static <T> T m7928c(ExecutorService executorService, Callable<T> callable, int i) {
        try {
            return executorService.submit(callable).get((long) i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
