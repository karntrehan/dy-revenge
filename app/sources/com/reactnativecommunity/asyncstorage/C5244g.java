package com.reactnativecommunity.asyncstorage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: com.reactnativecommunity.asyncstorage.g */
public class C5244g implements Executor {

    /* renamed from: f */
    private final ArrayDeque<Runnable> f14771f = new ArrayDeque<>();

    /* renamed from: o */
    private Runnable f14772o;

    /* renamed from: p */
    private final Executor f14773p;

    /* renamed from: com.reactnativecommunity.asyncstorage.g$a */
    class C5245a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Runnable f14774f;

        C5245a(Runnable runnable) {
            this.f14774f = runnable;
        }

        public void run() {
            try {
                this.f14774f.run();
            } finally {
                C5244g.this.mo15858a();
            }
        }
    }

    public C5244g(Executor executor) {
        this.f14773p = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo15858a() {
        Runnable poll = this.f14771f.poll();
        this.f14772o = poll;
        if (poll != null) {
            this.f14773p.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f14771f.offer(new C5245a(runnable));
        if (this.f14772o == null) {
            mo15858a();
        }
    }
}
