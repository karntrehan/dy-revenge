package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p308l.C6375a;

/* renamed from: com.facebook.imagepipeline.producers.a0 */
public class C2451a0 {

    /* renamed from: a */
    private final Executor f7245a;

    /* renamed from: b */
    private final C2455d f7246b;

    /* renamed from: c */
    private final Runnable f7247c = new C2452a();

    /* renamed from: d */
    private final Runnable f7248d = new C2453b();

    /* renamed from: e */
    private final int f7249e;

    /* renamed from: f */
    C6369d f7250f = null;

    /* renamed from: g */
    int f7251g = 0;

    /* renamed from: h */
    C2457f f7252h = C2457f.IDLE;

    /* renamed from: i */
    long f7253i = 0;

    /* renamed from: j */
    long f7254j = 0;

    /* renamed from: com.facebook.imagepipeline.producers.a0$a */
    class C2452a implements Runnable {
        C2452a() {
        }

        public void run() {
            C2451a0.this.m10197d();
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.a0$b */
    class C2453b implements Runnable {
        C2453b() {
        }

        public void run() {
            C2451a0.this.m10201j();
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.a0$c */
    static /* synthetic */ class C2454c {

        /* renamed from: a */
        static final /* synthetic */ int[] f7257a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.imagepipeline.producers.a0$f[] r0 = com.facebook.imagepipeline.producers.C2451a0.C2457f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7257a = r0
                com.facebook.imagepipeline.producers.a0$f r1 = com.facebook.imagepipeline.producers.C2451a0.C2457f.IDLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7257a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.imagepipeline.producers.a0$f r1 = com.facebook.imagepipeline.producers.C2451a0.C2457f.QUEUED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7257a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.imagepipeline.producers.a0$f r1 = com.facebook.imagepipeline.producers.C2451a0.C2457f.RUNNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7257a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.imagepipeline.producers.a0$f r1 = com.facebook.imagepipeline.producers.C2451a0.C2457f.RUNNING_AND_PENDING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2451a0.C2454c.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.a0$d */
    public interface C2455d {
        /* renamed from: a */
        void mo8217a(C6369d dVar, int i);
    }

    /* renamed from: com.facebook.imagepipeline.producers.a0$e */
    static class C2456e {

        /* renamed from: a */
        private static ScheduledExecutorService f7258a;

        /* renamed from: a */
        static ScheduledExecutorService m10207a() {
            if (f7258a == null) {
                f7258a = Executors.newSingleThreadScheduledExecutor();
            }
            return f7258a;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.a0$f */
    enum C2457f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public C2451a0(Executor executor, C2455d dVar, int i) {
        this.f7245a = executor;
        this.f7246b = dVar;
        this.f7249e = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m10197d() {
        C6369d dVar;
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            dVar = this.f7250f;
            i = this.f7251g;
            this.f7250f = null;
            this.f7251g = 0;
            this.f7252h = C2457f.RUNNING;
            this.f7254j = uptimeMillis;
        }
        try {
            if (m10200i(dVar, i)) {
                this.f7246b.mo8217a(dVar, i);
            }
        } finally {
            C6369d.m24309h(dVar);
            m10199g();
        }
    }

    /* renamed from: e */
    private void m10198e(long j) {
        Runnable a = C6375a.m24349a(this.f7248d, "JobScheduler_enqueueJob");
        if (j > 0) {
            C2456e.m10207a().schedule(a, j, TimeUnit.MILLISECONDS);
        } else {
            a.run();
        }
    }

    /* renamed from: g */
    private void m10199g() {
        boolean z;
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.f7252h == C2457f.RUNNING_AND_PENDING) {
                j = Math.max(this.f7254j + ((long) this.f7249e), uptimeMillis);
                z = true;
                this.f7253i = uptimeMillis;
                this.f7252h = C2457f.QUEUED;
            } else {
                this.f7252h = C2457f.IDLE;
                j = 0;
                z = false;
            }
        }
        if (z) {
            m10198e(j - uptimeMillis);
        }
    }

    /* renamed from: i */
    private static boolean m10200i(C6369d dVar, int i) {
        return C2459b.m10210e(i) || C2459b.m10214n(i, 4) || C6369d.m24312z0(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m10201j() {
        this.f7245a.execute(C6375a.m24349a(this.f7247c, "JobScheduler_submitJob"));
    }

    /* renamed from: c */
    public void mo8211c() {
        C6369d dVar;
        synchronized (this) {
            dVar = this.f7250f;
            this.f7250f = null;
            this.f7251g = 0;
        }
        C6369d.m24309h(dVar);
    }

    /* renamed from: f */
    public synchronized long mo8212f() {
        return this.f7254j - this.f7253i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r3 == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        m10198e(r5 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        return true;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8213h() {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            monitor-enter(r7)
            e.e.k.k.d r2 = r7.f7250f     // Catch:{ all -> 0x0043 }
            int r3 = r7.f7251g     // Catch:{ all -> 0x0043 }
            boolean r2 = m10200i(r2, r3)     // Catch:{ all -> 0x0043 }
            r3 = 0
            if (r2 != 0) goto L_0x0012
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            return r3
        L_0x0012:
            int[] r2 = com.facebook.imagepipeline.producers.C2451a0.C2454c.f7257a     // Catch:{ all -> 0x0043 }
            com.facebook.imagepipeline.producers.a0$f r4 = r7.f7252h     // Catch:{ all -> 0x0043 }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x0043 }
            r2 = r2[r4]     // Catch:{ all -> 0x0043 }
            r4 = 1
            if (r2 == r4) goto L_0x002a
            r5 = 3
            if (r2 == r5) goto L_0x0023
            goto L_0x0027
        L_0x0023:
            com.facebook.imagepipeline.producers.a0$f r2 = com.facebook.imagepipeline.producers.C2451a0.C2457f.RUNNING_AND_PENDING     // Catch:{ all -> 0x0043 }
            r7.f7252h = r2     // Catch:{ all -> 0x0043 }
        L_0x0027:
            r5 = 0
            goto L_0x003b
        L_0x002a:
            long r2 = r7.f7254j     // Catch:{ all -> 0x0043 }
            int r5 = r7.f7249e     // Catch:{ all -> 0x0043 }
            long r5 = (long) r5     // Catch:{ all -> 0x0043 }
            long r2 = r2 + r5
            long r5 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0043 }
            r7.f7253i = r0     // Catch:{ all -> 0x0043 }
            com.facebook.imagepipeline.producers.a0$f r2 = com.facebook.imagepipeline.producers.C2451a0.C2457f.QUEUED     // Catch:{ all -> 0x0043 }
            r7.f7252h = r2     // Catch:{ all -> 0x0043 }
            r3 = 1
        L_0x003b:
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x0042
            long r5 = r5 - r0
            r7.m10198e(r5)
        L_0x0042:
            return r4
        L_0x0043:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2451a0.mo8213h():boolean");
    }

    /* renamed from: k */
    public boolean mo8214k(C6369d dVar, int i) {
        C6369d dVar2;
        if (!m10200i(dVar, i)) {
            return false;
        }
        synchronized (this) {
            dVar2 = this.f7250f;
            this.f7250f = C6369d.m24308b(dVar);
            this.f7251g = i;
        }
        C6369d.m24309h(dVar2);
        return true;
    }
}
