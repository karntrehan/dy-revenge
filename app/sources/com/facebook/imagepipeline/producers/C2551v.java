package com.facebook.imagepipeline.producers;

import java.util.concurrent.Executor;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: com.facebook.imagepipeline.producers.v */
public class C2551v implements C2566z0 {

    /* renamed from: a */
    private final Executor f7519a;

    public C2551v(Executor executor) {
        this.f7519a = (Executor) C6062k.m22839g(executor);
    }

    /* renamed from: a */
    public void mo8218a(Runnable runnable) {
    }

    /* renamed from: b */
    public void mo8219b(Runnable runnable) {
        this.f7519a.execute(runnable);
    }
}
