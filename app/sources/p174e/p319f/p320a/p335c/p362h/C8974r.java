package p174e.p319f.p320a.p335c.p362h;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: e.f.a.c.h.r */
final class C8974r implements C8975s {

    /* renamed from: a */
    private final CountDownLatch f24387a = new CountDownLatch(1);

    /* synthetic */ C8974r(C8973q qVar) {
    }

    /* renamed from: a */
    public final void mo16116a(Object obj) {
        this.f24387a.countDown();
    }

    /* renamed from: b */
    public final void mo14987b(Exception exc) {
        this.f24387a.countDown();
    }

    /* renamed from: c */
    public final void mo22759c() {
        this.f24387a.countDown();
    }

    /* renamed from: d */
    public final void mo22795d() {
        this.f24387a.await();
    }

    /* renamed from: e */
    public final boolean mo22796e(long j, TimeUnit timeUnit) {
        return this.f24387a.await(j, timeUnit);
    }
}
