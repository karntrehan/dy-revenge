package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.i5 */
public final class C3916i5 extends C3878f6 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final AtomicLong f10782c = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3903h5 f10783d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3903h5 f10784e;

    /* renamed from: f */
    private final PriorityBlockingQueue f10785f = new PriorityBlockingQueue();

    /* renamed from: g */
    private final BlockingQueue f10786g = new LinkedBlockingQueue();

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f10787h = new C3864e5(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: i */
    private final Thread.UncaughtExceptionHandler f10788i = new C3864e5(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Object f10789j = new Object();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Semaphore f10790k = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public volatile boolean f10791l;

    C3916i5(C3955l5 l5Var) {
        super(l5Var);
    }

    /* renamed from: D */
    private final void m14913D(C3877f5 f5Var) {
        synchronized (this.f10789j) {
            this.f10785f.add(f5Var);
            C3903h5 h5Var = this.f10783d;
            if (h5Var == null) {
                C3903h5 h5Var2 = new C3903h5(this, "Measurement Worker", this.f10785f);
                this.f10783d = h5Var2;
                h5Var2.setUncaughtExceptionHandler(this.f10787h);
                this.f10783d.start();
            } else {
                h5Var.mo12034a();
            }
        }
    }

    /* renamed from: A */
    public final void mo12104A(Runnable runnable) {
        mo11959k();
        C3705r.m14346k(runnable);
        m14913D(new C3877f5(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: C */
    public final boolean mo12105C() {
        return Thread.currentThread() == this.f10783d;
    }

    /* renamed from: g */
    public final void mo11939g() {
        if (Thread.currentThread() != this.f10784e) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: h */
    public final void mo11931h() {
        if (Thread.currentThread() != this.f10783d) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo11958j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = r1.f10651a.mo11935b().mo12549w();
        r3.mo12476a("Interrupted waiting for " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r1.f10651a.mo11935b().mo12549w().mo12476a("Timed out waiting for ".concat(r5));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo12106r(java.util.concurrent.atomic.AtomicReference r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.l5 r0 = r1.f10651a     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.i5 r0 = r0.mo11934a()     // Catch:{ all -> 0x0049 }
            r0.mo12110z(r6)     // Catch:{ all -> 0x0049 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0027
            com.google.android.gms.measurement.internal.l5 r3 = r1.f10651a
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12549w()
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r4 = r4.concat(r5)
            r3.mo12476a(r4)
        L_0x0027:
            return r2
        L_0x0028:
            com.google.android.gms.measurement.internal.l5 r3 = r1.f10651a     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12549w()     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r6 = "Interrupted waiting for "
            r4.append(r6)     // Catch:{ all -> 0x0049 }
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0049 }
            r3.mo12476a(r4)     // Catch:{ all -> 0x0049 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            r2 = 0
            return r2
        L_0x0049:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3916i5.mo12106r(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: s */
    public final Future mo12107s(Callable callable) {
        mo11959k();
        C3705r.m14346k(callable);
        C3877f5 f5Var = new C3877f5(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f10783d) {
            if (!this.f10785f.isEmpty()) {
                this.f10651a.mo11935b().mo12549w().mo12476a("Callable skipped the worker queue.");
            }
            f5Var.run();
        } else {
            m14913D(f5Var);
        }
        return f5Var;
    }

    /* renamed from: t */
    public final Future mo12108t(Callable callable) {
        mo11959k();
        C3705r.m14346k(callable);
        C3877f5 f5Var = new C3877f5(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f10783d) {
            f5Var.run();
        } else {
            m14913D(f5Var);
        }
        return f5Var;
    }

    /* renamed from: y */
    public final void mo12109y(Runnable runnable) {
        mo11959k();
        C3705r.m14346k(runnable);
        C3877f5 f5Var = new C3877f5(this, runnable, false, "Task exception on network thread");
        synchronized (this.f10789j) {
            this.f10786g.add(f5Var);
            C3903h5 h5Var = this.f10784e;
            if (h5Var == null) {
                C3903h5 h5Var2 = new C3903h5(this, "Measurement Network", this.f10786g);
                this.f10784e = h5Var2;
                h5Var2.setUncaughtExceptionHandler(this.f10788i);
                this.f10784e.start();
            } else {
                h5Var.mo12034a();
            }
        }
    }

    /* renamed from: z */
    public final void mo12110z(Runnable runnable) {
        mo11959k();
        C3705r.m14346k(runnable);
        m14913D(new C3877f5(this, runnable, false, "Task exception on worker thread"));
    }
}
