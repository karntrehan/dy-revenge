package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import p455g.p462v.C10381g;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.v */
public final class C10839v extends C10716g1 {

    /* renamed from: p */
    public static final C10839v f28383p = new C10839v();
    private static volatile Executor pool;

    /* renamed from: q */
    private static final int f28384q;

    /* renamed from: r */
    private static boolean f28385r;

    static {
        String str;
        int i;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            i = -1;
        } else {
            Integer i2 = C10298o.m34921i(str);
            if (i2 == null || i2.intValue() < 1) {
                throw new IllegalStateException(C10457l.m35326k("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            i = i2.intValue();
        }
        f28384q = i;
    }

    private C10839v() {
    }

    /* renamed from: A0 */
    private final int m36901A0() {
        Integer valueOf = Integer.valueOf(f28384q);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        return valueOf == null ? C10247f.m34826b(Runtime.getRuntime().availableProcessors() - 1, 1) : valueOf.intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public static final void m36902C0() {
    }

    /* renamed from: w0 */
    private final ExecutorService m36905w0() {
        return Executors.newFixedThreadPool(m36901A0(), new C10688b(new AtomicInteger()));
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public static final Thread m36906x0(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, C10457l.m35326k("CommonPool-worker-", Integer.valueOf(atomicInteger.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.concurrent.ExecutorService m36907y0() {
        /*
            r6 = this;
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto L_0x000b
            java.util.concurrent.ExecutorService r0 = r6.m36905w0()
            return r0
        L_0x000b:
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r1 != 0) goto L_0x001b
            java.util.concurrent.ExecutorService r0 = r6.m36905w0()
            return r0
        L_0x001b:
            boolean r2 = f28385r
            r3 = 0
            if (r2 != 0) goto L_0x004b
            int r2 = f28384q
            if (r2 >= 0) goto L_0x004b
            java.lang.String r2 = "commonPool"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0039 }
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch:{ all -> 0x0039 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0039 }
            java.lang.Object r2 = r2.invoke(r0, r4)     // Catch:{ all -> 0x0039 }
            boolean r4 = r2 instanceof java.util.concurrent.ExecutorService     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x0039
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2     // Catch:{ all -> 0x0039 }
            goto L_0x003a
        L_0x0039:
            r2 = r0
        L_0x003a:
            if (r2 != 0) goto L_0x003d
            goto L_0x004b
        L_0x003d:
            kotlinx.coroutines.v r4 = f28383p
            boolean r4 = r4.mo26867B0(r1, r2)
            if (r4 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r2 = r0
        L_0x0047:
            if (r2 != 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            return r2
        L_0x004b:
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ all -> 0x0070 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0070 }
            r4[r3] = r5     // Catch:{ all -> 0x0070 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r4)     // Catch:{ all -> 0x0070 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0070 }
            kotlinx.coroutines.v r4 = f28383p     // Catch:{ all -> 0x0070 }
            int r4 = r4.m36901A0()     // Catch:{ all -> 0x0070 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0070 }
            r2[r3] = r4     // Catch:{ all -> 0x0070 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ all -> 0x0070 }
            boolean r2 = r1 instanceof java.util.concurrent.ExecutorService     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x0071
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1     // Catch:{ all -> 0x0070 }
            r0 = r1
            goto L_0x0071
        L_0x0070:
        L_0x0071:
            if (r0 != 0) goto L_0x0077
            java.util.concurrent.ExecutorService r0 = r6.m36905w0()
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10839v.m36907y0():java.util.concurrent.ExecutorService");
    }

    /* renamed from: z0 */
    private final synchronized Executor m36908z0() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = m36907y0();
            pool = executor;
        }
        return executor;
    }

    /* renamed from: B0 */
    public final boolean mo26867B0(Class<?> cls, ExecutorService executorService) {
        executorService.submit(C10681a.f28167f);
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (invoke instanceof Integer) {
                num = (Integer) invoke;
            }
        } catch (Throwable unused) {
        }
        return num != null && num.intValue() >= 1;
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    public String toString() {
        return "CommonPool";
    }

    /* renamed from: u0 */
    public void mo26625u0(C10381g gVar, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = m36908z0();
            }
            if (C10702e.m36417a() == null) {
                executor.execute(runnable);
                return;
            }
            throw null;
        } catch (RejectedExecutionException unused) {
            if (C10702e.m36417a() == null) {
                C10825r0.f28369t.mo26630L0(runnable);
                return;
            }
            throw null;
        }
    }
}
