package p493i;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p455g.C10323s;
import p455g.p470y.p471c.C10419a;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10456k;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.e0 */
public class C10600e0 {
    public static final C10602b Companion = new C10602b((C10452g) null);
    public static final C10600e0 NONE = new C10601a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* renamed from: i.e0$a */
    public static final class C10601a extends C10600e0 {
        C10601a() {
        }

        public C10600e0 deadlineNanoTime(long j) {
            return this;
        }

        public void throwIfReached() {
        }

        public C10600e0 timeout(long j, TimeUnit timeUnit) {
            C10457l.m35320e(timeUnit, "unit");
            return this;
        }
    }

    /* renamed from: i.e0$b */
    public static final class C10602b {
        private C10602b() {
        }

        public /* synthetic */ C10602b(C10452g gVar) {
            this();
        }

        /* renamed from: a */
        public final long mo26306a(long j, long j2) {
            return (j != 0 && (j2 == 0 || j < j2)) ? j : j2;
        }
    }

    public C10600e0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public C10600e0 clearTimeout() {
        this.timeoutNanos = 0;
        return this;
    }

    public final C10600e0 deadline(long j, TimeUnit timeUnit) {
        C10457l.m35320e(timeUnit, "unit");
        if (j > 0) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public C10600e0 deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final void intersectWith(C10600e0 e0Var, C10419a<C10323s> aVar) {
        C10457l.m35320e(e0Var, "other");
        C10457l.m35320e(aVar, "block");
        long timeoutNanos2 = timeoutNanos();
        long a = Companion.mo26306a(e0Var.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(a, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime2 = deadlineNanoTime();
            if (e0Var.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), e0Var.deadlineNanoTime()));
            }
            try {
                aVar.invoke();
                C10456k.m35315b(1);
                timeout(timeoutNanos2, timeUnit);
                if (e0Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime2);
                }
            } catch (Throwable th) {
                C10456k.m35315b(1);
                timeout(timeoutNanos2, TimeUnit.NANOSECONDS);
                if (e0Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime2);
                }
                C10456k.m35314a(1);
                throw th;
            }
        } else {
            if (e0Var.hasDeadline()) {
                deadlineNanoTime(e0Var.deadlineNanoTime());
            }
            try {
                aVar.invoke();
                C10456k.m35315b(1);
                timeout(timeoutNanos2, timeUnit);
                if (e0Var.hasDeadline()) {
                    clearDeadline();
                }
            } catch (Throwable th2) {
                C10456k.m35315b(1);
                timeout(timeoutNanos2, TimeUnit.NANOSECONDS);
                if (e0Var.hasDeadline()) {
                    clearDeadline();
                }
                C10456k.m35314a(1);
                throw th2;
            }
        }
        C10456k.m35314a(1);
    }

    public void throwIfReached() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C10600e0 timeout(long j, TimeUnit timeUnit) {
        C10457l.m35320e(timeUnit, "unit");
        if (j >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) {
        C10457l.m35320e(obj, "monitor");
        try {
            boolean hasDeadline2 = hasDeadline();
            long timeoutNanos2 = timeoutNanos();
            long j = 0;
            if (hasDeadline2 || timeoutNanos2 != 0) {
                long nanoTime = System.nanoTime();
                if (hasDeadline2 && timeoutNanos2 != 0) {
                    timeoutNanos2 = Math.min(timeoutNanos2, deadlineNanoTime() - nanoTime);
                } else if (hasDeadline2) {
                    timeoutNanos2 = deadlineNanoTime() - nanoTime;
                }
                if (timeoutNanos2 > 0) {
                    long j2 = timeoutNanos2 / 1000000;
                    Long.signum(j2);
                    obj.wait(j2, (int) (timeoutNanos2 - (1000000 * j2)));
                    j = System.nanoTime() - nanoTime;
                }
                if (j >= timeoutNanos2) {
                    throw new InterruptedIOException("timeout");
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
