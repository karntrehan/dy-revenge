package p174e.p319f.p320a.p335c.p345f.p353h;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: e.f.a.c.f.h.m */
public abstract class C7138m extends C7120d implements ExecutorService {
    protected C7138m() {
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return mo20533b().awaitTermination(j, timeUnit);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract ExecutorService mo20533b();

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return mo20533b().invokeAll(collection);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return mo20533b().invokeAll(collection, j, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return mo20533b().invokeAny(collection);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return mo20533b().invokeAny(collection, j, timeUnit);
    }

    public final boolean isShutdown() {
        return mo20533b().isShutdown();
    }

    public final boolean isTerminated() {
        return mo20533b().isTerminated();
    }

    public final void shutdown() {
        mo20533b().shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return mo20533b().shutdownNow();
    }

    public final Future<?> submit(Runnable runnable) {
        return mo20533b().submit(runnable);
    }

    public final <T> Future<T> submit(Runnable runnable, T t) {
        return mo20533b().submit(runnable, t);
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return mo20533b().submit(callable);
    }
}
