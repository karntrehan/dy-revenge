package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: com.facebook.imagepipeline.producers.a1 */
public class C2458a1 implements C2566z0 {

    /* renamed from: a */
    private boolean f7264a = false;

    /* renamed from: b */
    private final Deque<Runnable> f7265b;

    /* renamed from: c */
    private final Executor f7266c;

    public C2458a1(Executor executor) {
        this.f7266c = (Executor) C6062k.m22839g(executor);
        this.f7265b = new ArrayDeque();
    }

    /* renamed from: a */
    public synchronized void mo8218a(Runnable runnable) {
        this.f7265b.remove(runnable);
    }

    /* renamed from: b */
    public synchronized void mo8219b(Runnable runnable) {
        if (this.f7264a) {
            this.f7265b.add(runnable);
        } else {
            this.f7266c.execute(runnable);
        }
    }
}
