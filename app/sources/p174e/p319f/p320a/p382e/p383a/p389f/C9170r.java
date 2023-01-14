package p174e.p319f.p320a.p382e.p383a.p389f;

import java.util.concurrent.CountDownLatch;

/* renamed from: e.f.a.e.a.f.r */
final class C9170r implements C9154b, C9153a {

    /* renamed from: a */
    private final CountDownLatch f25056a = new CountDownLatch(1);

    /* synthetic */ C9170r(byte[] bArr) {
    }

    /* renamed from: a */
    public final void mo13853a(Object obj) {
        this.f25056a.countDown();
    }

    /* renamed from: b */
    public final void mo13857b(Exception exc) {
        this.f25056a.countDown();
    }

    /* renamed from: c */
    public final void mo23150c() {
        this.f25056a.await();
    }
}
