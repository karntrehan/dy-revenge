package androidx.camera.core.impl.p014a3.p015n;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.a3.n.c */
final class C0746c extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: f */
    private static ThreadLocal<ScheduledExecutorService> f2287f = new C0747a();

    /* renamed from: o */
    private final Handler f2288o;

    /* renamed from: androidx.camera.core.impl.a3.n.c$a */
    class C0747a extends ThreadLocal<ScheduledExecutorService> {
        C0747a() {
        }

        /* renamed from: a */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return C0744a.m3047d();
            }
            if (Looper.myLooper() != null) {
                return new C0746c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.n.c$b */
    class C0748b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Runnable f2289a;

        C0748b(Runnable runnable) {
            this.f2289a = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.f2289a.run();
            return null;
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.n.c$c */
    private static class C0749c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: f */
        final AtomicReference<C1814b.C1815a<V>> f2291f = new AtomicReference<>((Object) null);

        /* renamed from: o */
        private final long f2292o;

        /* renamed from: p */
        private final Callable<V> f2293p;

        /* renamed from: q */
        private final C9172b<V> f2294q;

        /* renamed from: androidx.camera.core.impl.a3.n.c$c$a */
        class C0750a implements C1814b.C1817c<V> {

            /* renamed from: a */
            final /* synthetic */ Handler f2295a;

            /* renamed from: b */
            final /* synthetic */ Callable f2296b;

            /* renamed from: androidx.camera.core.impl.a3.n.c$c$a$a */
            class C0751a implements Runnable {
                C0751a() {
                }

                public void run() {
                    if (C0749c.this.f2291f.getAndSet((Object) null) != null) {
                        C0750a aVar = C0750a.this;
                        aVar.f2295a.removeCallbacks(C0749c.this);
                    }
                }
            }

            C0750a(Handler handler, Callable callable) {
                this.f2295a = handler;
                this.f2296b = callable;
            }

            /* renamed from: a */
            public Object mo1960a(C1814b.C1815a<V> aVar) {
                aVar.mo6306a(new C0751a(), C0744a.m3044a());
                C0749c.this.f2291f.set(aVar);
                return "HandlerScheduledFuture-" + this.f2296b.toString();
            }
        }

        C0749c(Handler handler, long j, Callable<V> callable) {
            this.f2292o = j;
            this.f2293p = callable;
            this.f2294q = C1814b.m7736a(new C0750a(handler, callable));
        }

        public boolean cancel(boolean z) {
            return this.f2294q.cancel(z);
        }

        /* renamed from: g */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        public V get() {
            return this.f2294q.get();
        }

        public V get(long j, TimeUnit timeUnit) {
            return this.f2294q.get(j, timeUnit);
        }

        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f2292o - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public boolean isCancelled() {
            return this.f2294q.isCancelled();
        }

        public boolean isDone() {
            return this.f2294q.isDone();
        }

        public boolean isPeriodic() {
            return false;
        }

        public void run() {
            C1814b.C1815a andSet = this.f2291f.getAndSet((Object) null);
            if (andSet != null) {
                try {
                    andSet.mo6308c(this.f2293p.call());
                } catch (Exception e) {
                    andSet.mo6310f(e);
                }
            }
        }
    }

    C0746c(Handler handler) {
        this.f2288o = handler;
    }

    /* renamed from: a */
    private RejectedExecutionException m3052a() {
        return new RejectedExecutionException(this.f2288o + " is shutting down");
    }

    /* renamed from: b */
    static ScheduledExecutorService m3053b() {
        ScheduledExecutorService scheduledExecutorService = f2287f.get();
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            C0746c cVar = new C0746c(new Handler(myLooper));
            f2287f.set(cVar);
            return cVar;
        }
        throw new IllegalStateException("Current thread has no looper!");
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(C0746c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    public void execute(Runnable runnable) {
        if (!this.f2288o.post(runnable)) {
            throw m3052a();
        }
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new C0748b(runnable), j, timeUnit);
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
        C0749c cVar = new C0749c(this.f2288o, uptimeMillis, callable);
        return this.f2288o.postAtTime(cVar, uptimeMillis) ? cVar : C0768f.m3080f(m3052a());
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(C0746c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(C0746c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    public void shutdown() {
        throw new UnsupportedOperationException(C0746c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(C0746c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }
}
