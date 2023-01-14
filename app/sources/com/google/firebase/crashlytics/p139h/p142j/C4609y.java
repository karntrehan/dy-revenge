package com.google.firebase.crashlytics.p139h.p142j;

import com.google.firebase.crashlytics.p139h.C4542f;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.firebase.crashlytics.h.j.y */
public final class C4609y {

    /* renamed from: com.google.firebase.crashlytics.h.j.y$a */
    class C4610a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f13051a;

        /* renamed from: b */
        final /* synthetic */ AtomicLong f13052b;

        /* renamed from: com.google.firebase.crashlytics.h.j.y$a$a */
        class C4611a extends C4573j {

            /* renamed from: f */
            final /* synthetic */ Runnable f13053f;

            C4611a(Runnable runnable) {
                this.f13053f = runnable;
            }

            /* renamed from: a */
            public void mo14151a() {
                this.f13053f.run();
            }
        }

        C4610a(String str, AtomicLong atomicLong) {
            this.f13051a = str;
            this.f13052b = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C4611a(runnable));
            newThread.setName(this.f13051a + this.f13052b.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.j.y$b */
    class C4612b extends C4573j {

        /* renamed from: f */
        final /* synthetic */ String f13055f;

        /* renamed from: o */
        final /* synthetic */ ExecutorService f13056o;

        /* renamed from: p */
        final /* synthetic */ long f13057p;

        /* renamed from: q */
        final /* synthetic */ TimeUnit f13058q;

        C4612b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f13055f = str;
            this.f13056o = executorService;
            this.f13057p = j;
            this.f13058q = timeUnit;
        }

        /* renamed from: a */
        public void mo14151a() {
            try {
                C4542f f = C4542f.m17259f();
                f.mo14104b("Executing shutdown hook for " + this.f13055f);
                this.f13056o.shutdown();
                if (!this.f13056o.awaitTermination(this.f13057p, this.f13058q)) {
                    C4542f f2 = C4542f.m17259f();
                    f2.mo14104b(this.f13055f + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f13056o.shutdownNow();
                }
            } catch (InterruptedException unused) {
                C4542f.m17259f().mo14104b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f13055f}));
                this.f13056o.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    private static void m17547a(String str, ExecutorService executorService) {
        m17548b(str, executorService, 2, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    private static void m17548b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C4612b bVar = new C4612b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m17549c(String str) {
        ExecutorService e = m17551e(m17550d(str), new ThreadPoolExecutor.DiscardPolicy());
        m17547a(str, e);
        return e;
    }

    /* renamed from: d */
    public static ThreadFactory m17550d(String str) {
        return new C4610a(str, new AtomicLong(1));
    }

    /* renamed from: e */
    private static ExecutorService m17551e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
