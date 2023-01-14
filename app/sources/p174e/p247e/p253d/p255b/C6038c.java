package p174e.p247e.p253d.p255b;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: e.e.d.b.c */
public class C6038c<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: f */
    private final Handler f16690f;

    /* renamed from: o */
    private final FutureTask<V> f16691o;

    public C6038c(Handler handler, Runnable runnable, V v) {
        this.f16690f = handler;
        this.f16691o = new FutureTask<>(runnable, v);
    }

    public C6038c(Handler handler, Callable<V> callable) {
        this.f16690f = handler;
        this.f16691o = new FutureTask<>(callable);
    }

    public boolean cancel(boolean z) {
        return this.f16691o.cancel(z);
    }

    /* renamed from: g */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    public V get() {
        return this.f16691o.get();
    }

    public V get(long j, TimeUnit timeUnit) {
        return this.f16691o.get(j, timeUnit);
    }

    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public boolean isCancelled() {
        return this.f16691o.isCancelled();
    }

    public boolean isDone() {
        return this.f16691o.isDone();
    }

    public void run() {
        this.f16691o.run();
    }
}
