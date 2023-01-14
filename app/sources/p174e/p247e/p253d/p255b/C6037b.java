package p174e.p247e.p253d.p255b;

import android.os.Handler;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: e.e.d.b.b */
public class C6037b extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: f */
    private final Handler f16689f;

    public C6037b(Handler handler) {
        this.f16689f = handler;
    }

    /* renamed from: a */
    public boolean mo18006a() {
        return Thread.currentThread() == this.f16689f.getLooper().getThread();
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <T> C6038c<T> newTaskFor(Runnable runnable, T t) {
        return new C6038c<>(this.f16689f, runnable, t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public <T> C6038c<T> newTaskFor(Callable<T> callable) {
        return new C6038c<>(this.f16689f, callable);
    }

    /* renamed from: d */
    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, (Object) null);
    }

    /* renamed from: e */
    public <T> ScheduledFuture<T> submit(Runnable runnable, T t) {
        Objects.requireNonNull(runnable);
        C6038c b = newTaskFor(runnable, t);
        execute(b);
        return b;
    }

    public void execute(Runnable runnable) {
        this.f16689f.post(runnable);
    }

    /* renamed from: f */
    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        Objects.requireNonNull(callable);
        C6038c<T> c = newTaskFor(callable);
        execute(c);
        return c;
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        C6038c b = newTaskFor(runnable, (Object) null);
        this.f16689f.postDelayed(b, timeUnit.toMillis(j));
        return b;
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        C6038c<T> c = newTaskFor(callable);
        this.f16689f.postDelayed(c, timeUnit.toMillis(j));
        return c;
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
