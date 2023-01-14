package com.google.firebase.crashlytics.p139h.p142j;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.crashlytics.h.j.f0 */
public final class C4564f0 {

    /* renamed from: a */
    private final AtomicInteger f12902a = new AtomicInteger();

    /* renamed from: b */
    private final AtomicInteger f12903b = new AtomicInteger();

    /* renamed from: a */
    public void mo14128a() {
        this.f12903b.getAndIncrement();
    }

    /* renamed from: b */
    public void mo14129b() {
        this.f12902a.getAndIncrement();
    }

    /* renamed from: c */
    public void mo14130c() {
        this.f12903b.set(0);
    }
}
