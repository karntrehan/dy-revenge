package androidx.camera.core.impl.p014a3.p016o;

import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.core.util.C1177h;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.a3.o.c */
class C0763c<I, O> extends C0766e<O> implements Runnable {

    /* renamed from: p */
    private C0762b<? super I, ? extends O> f2321p;

    /* renamed from: q */
    private final BlockingQueue<Boolean> f2322q = new LinkedBlockingQueue(1);

    /* renamed from: r */
    private final CountDownLatch f2323r = new CountDownLatch(1);

    /* renamed from: s */
    private C9172b<? extends I> f2324s;

    /* renamed from: t */
    volatile C9172b<? extends O> f2325t;

    /* renamed from: androidx.camera.core.impl.a3.o.c$a */
    class C0764a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C9172b f2326f;

        C0764a(C9172b bVar) {
            this.f2326f = bVar;
        }

        public void run() {
            try {
                C0763c.this.mo2916b(C0768f.m3078d(this.f2326f));
            } catch (CancellationException unused) {
                C0763c.this.cancel(false);
                C0763c.this.f2325t = null;
                return;
            } catch (ExecutionException e) {
                C0763c.this.mo2917c(e.getCause());
            } catch (Throwable th) {
                C0763c.this.f2325t = null;
                throw th;
            }
            C0763c.this.f2325t = null;
        }
    }

    C0763c(C0762b<? super I, ? extends O> bVar, C9172b<? extends I> bVar2) {
        this.f2321p = (C0762b) C1177h.m4583e(bVar);
        this.f2324s = (C9172b) C1177h.m4583e(bVar2);
    }

    /* renamed from: g */
    private void m3063g(Future<?> future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    /* renamed from: h */
    private <E> void m3064h(BlockingQueue<E> blockingQueue, E e) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(e);
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: i */
    private <E> E m3065i(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    public boolean cancel(boolean z) {
        if (!super.cancel(z)) {
            return false;
        }
        m3064h(this.f2322q, Boolean.valueOf(z));
        m3063g(this.f2324s, z);
        m3063g(this.f2325t, z);
        return true;
    }

    public O get() {
        if (!isDone()) {
            C9172b<? extends I> bVar = this.f2324s;
            if (bVar != null) {
                bVar.get();
            }
            this.f2323r.await();
            C9172b<? extends O> bVar2 = this.f2325t;
            if (bVar2 != null) {
                bVar2.get();
            }
        }
        return super.get();
    }

    public O get(long j, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            C9172b<? extends I> bVar = this.f2324s;
            if (bVar != null) {
                long nanoTime = System.nanoTime();
                bVar.get(j, timeUnit);
                j -= Math.max(0, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f2323r.await(j, timeUnit)) {
                j -= Math.max(0, System.nanoTime() - nanoTime2);
                C9172b<? extends O> bVar2 = this.f2325t;
                if (bVar2 != null) {
                    bVar2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j, timeUnit);
    }

    public void run() {
        Throwable e;
        try {
            try {
                C9172b<? extends O> apply = this.f2321p.apply(C0768f.m3078d(this.f2324s));
                this.f2325t = apply;
                if (isCancelled()) {
                    apply.cancel(((Boolean) m3065i(this.f2322q)).booleanValue());
                    this.f2325t = null;
                    this.f2321p = null;
                    this.f2324s = null;
                    this.f2323r.countDown();
                    return;
                }
                apply.mo2919e(new C0764a(apply), C0744a.m3044a());
                this.f2321p = null;
                this.f2324s = null;
                this.f2323r.countDown();
            } catch (UndeclaredThrowableException e2) {
                e = e2.getCause();
            } catch (Exception e3) {
                e = e3;
            } catch (Error e4) {
                e = e4;
            } catch (Throwable th) {
                this.f2321p = null;
                this.f2324s = null;
                this.f2323r.countDown();
                throw th;
            }
            mo2917c(e);
            this.f2321p = null;
            this.f2324s = null;
            this.f2323r.countDown();
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e5) {
            mo2917c(e5.getCause());
        }
    }
}
