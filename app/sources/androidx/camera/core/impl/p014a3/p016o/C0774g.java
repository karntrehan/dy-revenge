package androidx.camera.core.impl.p014a3.p016o;

import androidx.camera.core.C0949o2;
import androidx.core.util.C1177h;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.a3.o.g */
abstract class C0774g<V> implements C9172b<V> {

    /* renamed from: androidx.camera.core.impl.a3.o.g$a */
    static class C0775a<V> extends C0774g<V> {

        /* renamed from: f */
        private final Throwable f2338f;

        C0775a(Throwable th) {
            this.f2338f = th;
        }

        public V get() {
            throw new ExecutionException(this.f2338f);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f2338f + "]]";
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.o.g$b */
    static final class C0776b<V> extends C0775a<V> implements ScheduledFuture<V> {
        C0776b(Throwable th) {
            super(th);
        }

        public long getDelay(TimeUnit timeUnit) {
            return 0;
        }

        /* renamed from: h */
        public int compareTo(Delayed delayed) {
            return -1;
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.o.g$c */
    static final class C0777c<V> extends C0774g<V> {

        /* renamed from: f */
        static final C0774g<Object> f2339f = new C0777c((Object) null);

        /* renamed from: o */
        private final V f2340o;

        C0777c(V v) {
            this.f2340o = v;
        }

        public V get() {
            return this.f2340o;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f2340o + "]]";
        }
    }

    C0774g() {
    }

    /* renamed from: g */
    public static <V> C9172b<V> m3092g() {
        return C0777c.f2339f;
    }

    public boolean cancel(boolean z) {
        return false;
    }

    /* renamed from: e */
    public void mo2919e(Runnable runnable, Executor executor) {
        C1177h.m4583e(runnable);
        C1177h.m4583e(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            C0949o2.m3691d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    public abstract V get();

    public V get(long j, TimeUnit timeUnit) {
        C1177h.m4583e(timeUnit);
        return get();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
