package com.google.firebase.crashlytics.p139h.p142j;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p174e.p319f.p320a.p335c.p362h.C8945c;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: com.google.firebase.crashlytics.h.j.i0 */
public final class C4570i0 {

    /* renamed from: a */
    private static final ExecutorService f12920a = C4609y.m17549c("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: com.google.firebase.crashlytics.h.j.i0$a */
    class C4571a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Callable f12921f;

        /* renamed from: o */
        final /* synthetic */ C8965m f12922o;

        /* renamed from: com.google.firebase.crashlytics.h.j.i0$a$a */
        class C4572a implements C8945c<T, Void> {
            C4572a() {
            }

            /* renamed from: b */
            public Void mo14079a(C8963l<T> lVar) {
                if (lVar.mo22779o()) {
                    C4571a.this.f12922o.mo22784c(lVar.mo22776l());
                    return null;
                }
                C4571a.this.f12922o.mo22783b(lVar.mo22775k());
                return null;
            }
        }

        C4571a(Callable callable, C8965m mVar) {
            this.f12921f = callable;
            this.f12922o = mVar;
        }

        public void run() {
            try {
                ((C8963l) this.f12921f.call()).mo22772h(new C4572a());
            } catch (Exception e) {
                this.f12922o.mo22783b(e);
            }
        }
    }

    /* renamed from: a */
    public static <T> T m17344a(C8963l<T> lVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        lVar.mo22773i(f12920a, new C4565g(countDownLatch));
        countDownLatch.await(4, TimeUnit.SECONDS);
        if (lVar.mo22779o()) {
            return lVar.mo22776l();
        }
        if (lVar.mo22777m()) {
            throw new CancellationException("Task is already canceled");
        } else if (lVar.mo22778n()) {
            throw new IllegalStateException(lVar.mo22775k());
        } else {
            throw new TimeoutException();
        }
    }

    /* renamed from: b */
    public static <T> C8963l<T> m17345b(Executor executor, Callable<C8963l<T>> callable) {
        C8965m mVar = new C8965m();
        executor.execute(new C4571a(callable, mVar));
        return mVar.mo22782a();
    }

    /* renamed from: d */
    static /* synthetic */ Void m17347d(C8965m mVar, C8963l lVar) {
        if (lVar.mo22779o()) {
            mVar.mo22786e(lVar.mo22776l());
            return null;
        }
        Exception k = lVar.mo22775k();
        Objects.requireNonNull(k);
        mVar.mo22785d(k);
        return null;
    }

    /* renamed from: e */
    static /* synthetic */ Void m17348e(C8965m mVar, C8963l lVar) {
        if (lVar.mo22779o()) {
            mVar.mo22786e(lVar.mo22776l());
            return null;
        }
        Exception k = lVar.mo22775k();
        Objects.requireNonNull(k);
        mVar.mo22785d(k);
        return null;
    }

    /* renamed from: f */
    public static <T> C8963l<T> m17349f(C8963l<T> lVar, C8963l<T> lVar2) {
        C8965m mVar = new C8965m();
        C4563f fVar = new C4563f(mVar);
        lVar.mo22772h(fVar);
        lVar2.mo22772h(fVar);
        return mVar.mo22782a();
    }

    /* renamed from: g */
    public static <T> C8963l<T> m17350g(Executor executor, C8963l<T> lVar, C8963l<T> lVar2) {
        C8965m mVar = new C8965m();
        C4561e eVar = new C4561e(mVar);
        lVar.mo22773i(executor, eVar);
        lVar2.mo22773i(executor, eVar);
        return mVar.mo22782a();
    }
}
