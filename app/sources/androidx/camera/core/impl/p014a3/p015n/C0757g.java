package androidx.camera.core.impl.p014a3.p015n;

import androidx.core.util.C1177h;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.a3.n.g */
final class C0757g implements Executor {

    /* renamed from: f */
    final Deque<Runnable> f2307f = new ArrayDeque();

    /* renamed from: o */
    private final Executor f2308o;

    /* renamed from: p */
    private final C0759b f2309p = new C0759b();

    /* renamed from: q */
    C0760c f2310q = C0760c.IDLE;

    /* renamed from: r */
    long f2311r = 0;

    /* renamed from: androidx.camera.core.impl.a3.n.g$a */
    class C0758a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Runnable f2312f;

        C0758a(Runnable runnable) {
            this.f2312f = runnable;
        }

        public void run() {
            this.f2312f.run();
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.n.g$b */
    final class C0759b implements Runnable {
        C0759b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r3.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
            if (r1 == false) goto L_?;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m3061a() {
            /*
                r9 = this;
                r0 = 0
                r1 = 0
            L_0x0002:
                androidx.camera.core.impl.a3.n.g r2 = androidx.camera.core.impl.p014a3.p015n.C0757g.this     // Catch:{ all -> 0x0068 }
                java.util.Deque<java.lang.Runnable> r2 = r2.f2307f     // Catch:{ all -> 0x0068 }
                monitor-enter(r2)     // Catch:{ all -> 0x0068 }
                if (r0 != 0) goto L_0x0026
                androidx.camera.core.impl.a3.n.g r0 = androidx.camera.core.impl.p014a3.p015n.C0757g.this     // Catch:{ all -> 0x0065 }
                androidx.camera.core.impl.a3.n.g$c r3 = r0.f2310q     // Catch:{ all -> 0x0065 }
                androidx.camera.core.impl.a3.n.g$c r4 = androidx.camera.core.impl.p014a3.p015n.C0757g.C0760c.RUNNING     // Catch:{ all -> 0x0065 }
                if (r3 != r4) goto L_0x001c
                monitor-exit(r2)     // Catch:{ all -> 0x0065 }
                if (r1 == 0) goto L_0x001b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x001b:
                return
            L_0x001c:
                long r5 = r0.f2311r     // Catch:{ all -> 0x0065 }
                r7 = 1
                long r5 = r5 + r7
                r0.f2311r = r5     // Catch:{ all -> 0x0065 }
                r0.f2310q = r4     // Catch:{ all -> 0x0065 }
                r0 = 1
            L_0x0026:
                androidx.camera.core.impl.a3.n.g r3 = androidx.camera.core.impl.p014a3.p015n.C0757g.this     // Catch:{ all -> 0x0065 }
                java.util.Deque<java.lang.Runnable> r3 = r3.f2307f     // Catch:{ all -> 0x0065 }
                java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x0065 }
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ all -> 0x0065 }
                if (r3 != 0) goto L_0x0043
                androidx.camera.core.impl.a3.n.g r0 = androidx.camera.core.impl.p014a3.p015n.C0757g.this     // Catch:{ all -> 0x0065 }
                androidx.camera.core.impl.a3.n.g$c r3 = androidx.camera.core.impl.p014a3.p015n.C0757g.C0760c.IDLE     // Catch:{ all -> 0x0065 }
                r0.f2310q = r3     // Catch:{ all -> 0x0065 }
                monitor-exit(r2)     // Catch:{ all -> 0x0065 }
                if (r1 == 0) goto L_0x0042
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x0042:
                return
            L_0x0043:
                monitor-exit(r2)     // Catch:{ all -> 0x0065 }
                boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0068 }
                r1 = r1 | r2
                r3.run()     // Catch:{ RuntimeException -> 0x004d }
                goto L_0x0002
            L_0x004d:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
                r5.<init>()     // Catch:{ all -> 0x0068 }
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch:{ all -> 0x0068 }
                r5.append(r3)     // Catch:{ all -> 0x0068 }
                java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0068 }
                androidx.camera.core.C0949o2.m3691d(r4, r3, r2)     // Catch:{ all -> 0x0068 }
                goto L_0x0002
            L_0x0065:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0065 }
                throw r0     // Catch:{ all -> 0x0068 }
            L_0x0068:
                r0 = move-exception
                if (r1 == 0) goto L_0x0072
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L_0x0072:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.p014a3.p015n.C0757g.C0759b.m3061a():void");
        }

        public void run() {
            try {
                m3061a();
            } catch (Error e) {
                synchronized (C0757g.this.f2307f) {
                    C0757g.this.f2310q = C0760c.IDLE;
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.n.g$c */
    enum C0760c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    C0757g(Executor executor) {
        this.f2308o = (Executor) C1177h.m4583e(executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r8.f2308o.execute(r8.f2309p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r8.f2310q == r9) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r0 == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r6 = r8.f2307f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r8.f2311r != r3) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r8.f2310q != r9) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        r8.f2310q = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004d, code lost:
        monitor-enter(r8.f2307f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r3 = r8.f2310q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0052, code lost:
        if (r3 == androidx.camera.core.impl.p014a3.p015n.C0757g.C0760c.f2315f) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0061, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0064, code lost:
        if ((r9 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006a, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void execute(java.lang.Runnable r9) {
        /*
            r8 = this;
            androidx.core.util.C1177h.m4583e(r9)
            java.util.Deque<java.lang.Runnable> r0 = r8.f2307f
            monitor-enter(r0)
            androidx.camera.core.impl.a3.n.g$c r1 = r8.f2310q     // Catch:{ all -> 0x0075 }
            androidx.camera.core.impl.a3.n.g$c r2 = androidx.camera.core.impl.p014a3.p015n.C0757g.C0760c.RUNNING     // Catch:{ all -> 0x0075 }
            if (r1 == r2) goto L_0x006e
            androidx.camera.core.impl.a3.n.g$c r2 = androidx.camera.core.impl.p014a3.p015n.C0757g.C0760c.QUEUED     // Catch:{ all -> 0x0075 }
            if (r1 != r2) goto L_0x0011
            goto L_0x006e
        L_0x0011:
            long r3 = r8.f2311r     // Catch:{ all -> 0x0075 }
            androidx.camera.core.impl.a3.n.g$a r1 = new androidx.camera.core.impl.a3.n.g$a     // Catch:{ all -> 0x0075 }
            r1.<init>(r9)     // Catch:{ all -> 0x0075 }
            java.util.Deque<java.lang.Runnable> r9 = r8.f2307f     // Catch:{ all -> 0x0075 }
            r9.add(r1)     // Catch:{ all -> 0x0075 }
            androidx.camera.core.impl.a3.n.g$c r9 = androidx.camera.core.impl.p014a3.p015n.C0757g.C0760c.QUEUING     // Catch:{ all -> 0x0075 }
            r8.f2310q = r9     // Catch:{ all -> 0x0075 }
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            r0 = 1
            r5 = 0
            java.util.concurrent.Executor r6 = r8.f2308o     // Catch:{ RuntimeException -> 0x004a, Error -> 0x0048 }
            androidx.camera.core.impl.a3.n.g$b r7 = r8.f2309p     // Catch:{ RuntimeException -> 0x004a, Error -> 0x0048 }
            r6.execute(r7)     // Catch:{ RuntimeException -> 0x004a, Error -> 0x0048 }
            androidx.camera.core.impl.a3.n.g$c r1 = r8.f2310q
            if (r1 == r9) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 == 0) goto L_0x0034
            return
        L_0x0034:
            java.util.Deque<java.lang.Runnable> r6 = r8.f2307f
            monitor-enter(r6)
            long r0 = r8.f2311r     // Catch:{ all -> 0x0045 }
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0043
            androidx.camera.core.impl.a3.n.g$c r0 = r8.f2310q     // Catch:{ all -> 0x0045 }
            if (r0 != r9) goto L_0x0043
            r8.f2310q = r2     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r6)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r9 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0045 }
            throw r9
        L_0x0048:
            r9 = move-exception
            goto L_0x004b
        L_0x004a:
            r9 = move-exception
        L_0x004b:
            java.util.Deque<java.lang.Runnable> r2 = r8.f2307f
            monitor-enter(r2)
            androidx.camera.core.impl.a3.n.g$c r3 = r8.f2310q     // Catch:{ all -> 0x006b }
            androidx.camera.core.impl.a3.n.g$c r4 = androidx.camera.core.impl.p014a3.p015n.C0757g.C0760c.IDLE     // Catch:{ all -> 0x006b }
            if (r3 == r4) goto L_0x0058
            androidx.camera.core.impl.a3.n.g$c r4 = androidx.camera.core.impl.p014a3.p015n.C0757g.C0760c.QUEUING     // Catch:{ all -> 0x006b }
            if (r3 != r4) goto L_0x0061
        L_0x0058:
            java.util.Deque<java.lang.Runnable> r3 = r8.f2307f     // Catch:{ all -> 0x006b }
            boolean r1 = r3.removeLastOccurrence(r1)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            boolean r1 = r9 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x006a
            if (r0 != 0) goto L_0x006a
            monitor-exit(r2)     // Catch:{ all -> 0x006b }
            return
        L_0x006a:
            throw r9     // Catch:{ all -> 0x006b }
        L_0x006b:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006b }
            throw r9
        L_0x006e:
            java.util.Deque<java.lang.Runnable> r1 = r8.f2307f     // Catch:{ all -> 0x0075 }
            r1.add(r9)     // Catch:{ all -> 0x0075 }
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            return
        L_0x0075:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.p014a3.p015n.C0757g.execute(java.lang.Runnable):void");
    }
}
