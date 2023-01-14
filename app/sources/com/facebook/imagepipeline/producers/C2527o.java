package com.facebook.imagepipeline.producers;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.imagepipeline.producers.o */
public class C2527o implements C2529o0<C6088a<C6367b>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2529o0<C6088a<C6367b>> f7458a;

    /* renamed from: b */
    private final ScheduledExecutorService f7459b;

    /* renamed from: com.facebook.imagepipeline.producers.o$a */
    class C2528a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2505l f7460f;

        /* renamed from: o */
        final /* synthetic */ C2531p0 f7461o;

        C2528a(C2505l lVar, C2531p0 p0Var) {
            this.f7460f = lVar;
            this.f7461o = p0Var;
        }

        public void run() {
            C2527o.this.f7458a.mo8198b(this.f7460f, this.f7461o);
        }
    }

    public C2527o(C2529o0<C6088a<C6367b>> o0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f7458a = o0Var;
        this.f7459b = scheduledExecutorService;
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6088a<C6367b>> lVar, C2531p0 p0Var) {
        C6384b f = p0Var.mo8240f();
        ScheduledExecutorService scheduledExecutorService = this.f7459b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new C2528a(lVar, p0Var), (long) f.mo18922d(), TimeUnit.MILLISECONDS);
        } else {
            this.f7458a.mo8198b(lVar, p0Var);
        }
    }
}
