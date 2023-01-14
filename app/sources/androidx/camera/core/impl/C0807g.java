package androidx.camera.core.impl;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p027c.p061g.p062a.C1814b;

/* renamed from: androidx.camera.core.impl.g */
public final /* synthetic */ class C0807g implements C1814b.C1817c {

    /* renamed from: a */
    public final /* synthetic */ List f2395a;

    /* renamed from: b */
    public final /* synthetic */ ScheduledExecutorService f2396b;

    /* renamed from: c */
    public final /* synthetic */ Executor f2397c;

    /* renamed from: d */
    public final /* synthetic */ long f2398d;

    /* renamed from: e */
    public final /* synthetic */ boolean f2399e;

    public /* synthetic */ C0807g(List list, ScheduledExecutorService scheduledExecutorService, Executor executor, long j, boolean z) {
        this.f2395a = list;
        this.f2396b = scheduledExecutorService;
        this.f2397c = executor;
        this.f2398d = j;
        this.f2399e = z;
    }

    /* renamed from: a */
    public final Object mo1960a(C1814b.C1815a aVar) {
        return C0826j1.m3244f(this.f2395a, this.f2396b, this.f2397c, this.f2398d, this.f2399e, aVar);
    }
}
