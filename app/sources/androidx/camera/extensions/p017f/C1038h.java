package androidx.camera.extensions.p017f;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: androidx.camera.extensions.f.h */
final class C1038h {

    /* renamed from: a */
    private AtomicInteger f2910a = new AtomicInteger(0);

    /* renamed from: b */
    private final Lock f2911b;

    /* renamed from: c */
    private final Condition f2912c;

    C1038h() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f2911b = reentrantLock;
        this.f2912c = reentrantLock.newCondition();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3332a() {
        this.f2911b.lock();
        try {
            int andDecrement = this.f2910a.getAndDecrement();
            if (andDecrement == -1) {
                throw new IllegalStateException("Unable to decrement. Counter already destroyed");
            } else if (andDecrement != 0) {
                this.f2912c.signal();
            } else {
                throw new IllegalStateException("Unable to decrement. No corresponding counter increment");
            }
        } finally {
            this.f2911b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0005 */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x000f A[SYNTHETIC, Splitter:B:4:0x000f] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3333b() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f2911b
            r0.lock()
        L_0x0005:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f2910a     // Catch:{ all -> 0x001b }
            r1 = 0
            r2 = -1
            boolean r0 = r0.compareAndSet(r1, r2)     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0015
            java.util.concurrent.locks.Condition r0 = r3.f2912c     // Catch:{ InterruptedException -> 0x0005 }
            r0.await()     // Catch:{ InterruptedException -> 0x0005 }
            goto L_0x0005
        L_0x0015:
            java.util.concurrent.locks.Lock r0 = r3.f2911b
            r0.unlock()
            return
        L_0x001b:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.f2911b
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.extensions.p017f.C1038h.mo3333b():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3334c() {
        this.f2911b.lock();
        try {
            if (this.f2910a.get() == -1) {
                return false;
            }
            this.f2910a.getAndIncrement();
            this.f2911b.unlock();
            return true;
        } finally {
            this.f2911b.unlock();
        }
    }
}
