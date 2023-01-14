package p174e.p319f.p320a.p335c.p336a.p337a;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: e.f.a.c.a.a.c */
final class C6617c extends Thread {

    /* renamed from: f */
    private final WeakReference<C6614a> f18274f;

    /* renamed from: o */
    private final long f18275o;

    /* renamed from: p */
    final CountDownLatch f18276p = new CountDownLatch(1);

    /* renamed from: q */
    boolean f18277q = false;

    public C6617c(C6614a aVar, long j) {
        this.f18274f = new WeakReference<>(aVar);
        this.f18275o = j;
        start();
    }

    /* renamed from: a */
    private final void m25259a() {
        C6614a aVar = (C6614a) this.f18274f.get();
        if (aVar != null) {
            aVar.mo19430c();
            this.f18277q = true;
        }
    }

    public final void run() {
        try {
            if (!this.f18276p.await(this.f18275o, TimeUnit.MILLISECONDS)) {
                m25259a();
            }
        } catch (InterruptedException unused) {
            m25259a();
        }
    }
}
