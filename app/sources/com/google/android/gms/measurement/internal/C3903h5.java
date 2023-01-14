package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.C3705r;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.h5 */
final class C3903h5 extends Thread {

    /* renamed from: f */
    private final Object f10722f;

    /* renamed from: o */
    private final BlockingQueue f10723o;

    /* renamed from: p */
    private boolean f10724p = false;

    /* renamed from: q */
    final /* synthetic */ C3916i5 f10725q;

    public C3903h5(C3916i5 i5Var, String str, BlockingQueue blockingQueue) {
        this.f10725q = i5Var;
        C3705r.m14346k(str);
        C3705r.m14346k(blockingQueue);
        this.f10722f = new Object();
        this.f10723o = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m14844b() {
        synchronized (this.f10725q.f10789j) {
            if (!this.f10724p) {
                this.f10725q.f10790k.release();
                this.f10725q.f10789j.notifyAll();
                C3916i5 i5Var = this.f10725q;
                if (this == i5Var.f10783d) {
                    i5Var.f10783d = null;
                } else if (this == i5Var.f10784e) {
                    i5Var.f10784e = null;
                } else {
                    i5Var.f10651a.mo11935b().mo12544r().mo12476a("Current scheduler thread is neither worker nor network");
                }
                this.f10724p = true;
            }
        }
    }

    /* renamed from: c */
    private final void m14845c(InterruptedException interruptedException) {
        this.f10725q.f10651a.mo11935b().mo12549w().mo12477b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void mo12034a() {
        synchronized (this.f10722f) {
            this.f10722f.notifyAll();
        }
    }

    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f10725q.f10790k.acquire();
                z = true;
            } catch (InterruptedException e) {
                m14845c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C3877f5 f5Var = (C3877f5) this.f10723o.poll();
                if (f5Var != null) {
                    Process.setThreadPriority(true != f5Var.f10667o ? 10 : threadPriority);
                    f5Var.run();
                } else {
                    synchronized (this.f10722f) {
                        if (this.f10723o.peek() == null) {
                            boolean unused = this.f10725q.f10791l;
                            try {
                                this.f10722f.wait(30000);
                            } catch (InterruptedException e2) {
                                m14845c(e2);
                            }
                        }
                    }
                    synchronized (this.f10725q.f10789j) {
                        if (this.f10723o.peek() == null) {
                            m14844b();
                            m14844b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m14844b();
            throw th;
        }
    }
}
