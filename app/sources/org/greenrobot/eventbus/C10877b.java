package org.greenrobot.eventbus;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.logging.Level;

/* renamed from: org.greenrobot.eventbus.b */
final class C10877b implements Runnable, C10892l {

    /* renamed from: f */
    private final C10891k f28438f = new C10891k();

    /* renamed from: o */
    private final C10878c f28439o;

    /* renamed from: p */
    private volatile boolean f28440p;

    C10877b(C10878c cVar) {
        this.f28439o = cVar;
    }

    /* renamed from: a */
    public void mo28467a(C10898q qVar, Object obj) {
        C10890j a = C10890j.m37031a(qVar, obj);
        synchronized (this) {
            this.f28438f.mo28488a(a);
            if (!this.f28440p) {
                this.f28440p = true;
                this.f28439o.mo28474d().execute(this);
            }
        }
    }

    public void run() {
        while (true) {
            try {
                C10890j c = this.f28438f.mo28490c(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
                if (c == null) {
                    synchronized (this) {
                        c = this.f28438f.mo28489b();
                        if (c == null) {
                            this.f28440p = false;
                            this.f28440p = false;
                            return;
                        }
                    }
                }
                this.f28439o.mo28476g(c);
            } catch (InterruptedException e) {
                try {
                    C10885g e2 = this.f28439o.mo28475e();
                    Level level = Level.WARNING;
                    e2.mo28470b(level, Thread.currentThread().getName() + " was interruppted", e);
                    return;
                } finally {
                    this.f28440p = false;
                }
            }
        }
    }
}
