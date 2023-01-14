package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: kotlinx.coroutines.r0 */
public final class C10825r0 extends C10690b1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: t */
    public static final C10825r0 f28369t;

    /* renamed from: u */
    private static final long f28370u;

    static {
        Long l;
        C10825r0 r0Var = new C10825r0();
        f28369t = r0Var;
        C10683a1.m36353B0(r0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f28370u = timeUnit.toNanos(l.longValue());
    }

    private C10825r0() {
    }

    /* renamed from: W0 */
    private final synchronized void m36793W0() {
        if (m36795Y0()) {
            debugStatus = 3;
            mo26633R0();
            notifyAll();
        }
    }

    /* renamed from: X0 */
    private final synchronized Thread m36794X0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: Y0 */
    private final boolean m36795Y0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: Z0 */
    private final synchronized boolean m36796Z0() {
        if (m36795Y0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F0 */
    public Thread mo26654F0() {
        Thread thread = _thread;
        return thread == null ? m36794X0() : thread;
    }

    public void run() {
        C10698d a;
        C10711f2.f28192a.mo26666c(this);
        if (C10702e.m36417a() == null) {
            try {
                if (m36796Z0()) {
                    long j = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long P0 = mo26632P0();
                        if (P0 != Long.MAX_VALUE) {
                            j = Long.MAX_VALUE;
                        } else if (C10702e.m36417a() == null) {
                            long nanoTime = System.nanoTime();
                            if (j == Long.MAX_VALUE) {
                                j = f28370u + nanoTime;
                            }
                            long j2 = j - nanoTime;
                            if (j2 <= 0) {
                                _thread = null;
                                m36793W0();
                                if (C10702e.m36417a() != null) {
                                    throw null;
                                } else if (!mo26631O0()) {
                                    mo26654F0();
                                    return;
                                } else {
                                    return;
                                }
                            } else {
                                P0 = C10247f.m34829e(P0, j2);
                            }
                        } else {
                            throw null;
                        }
                        if (P0 > 0) {
                            if (m36795Y0()) {
                                _thread = null;
                                m36793W0();
                                if (C10702e.m36417a() != null) {
                                    throw null;
                                } else if (!mo26631O0()) {
                                    mo26654F0();
                                    return;
                                } else {
                                    return;
                                }
                            } else if (C10702e.m36417a() == null) {
                                LockSupport.parkNanos(this, P0);
                            } else {
                                throw null;
                            }
                        }
                    }
                } else if (a != null) {
                    throw null;
                }
            } finally {
                _thread = null;
                m36793W0();
                if (C10702e.m36417a() == null) {
                    if (!mo26631O0()) {
                        mo26654F0();
                    }
                    throw th;
                }
            }
        } else {
            throw null;
        }
    }
}
