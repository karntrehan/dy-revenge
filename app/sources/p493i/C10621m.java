package p493i;

import java.util.concurrent.TimeUnit;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.m */
public class C10621m extends C10600e0 {

    /* renamed from: a */
    private C10600e0 f28057a;

    public C10621m(C10600e0 e0Var) {
        C10457l.m35320e(e0Var, "delegate");
        this.f28057a = e0Var;
    }

    /* renamed from: a */
    public final C10600e0 mo26439a() {
        return this.f28057a;
    }

    /* renamed from: b */
    public final C10621m mo26440b(C10600e0 e0Var) {
        C10457l.m35320e(e0Var, "delegate");
        this.f28057a = e0Var;
        return this;
    }

    public C10600e0 clearDeadline() {
        return this.f28057a.clearDeadline();
    }

    public C10600e0 clearTimeout() {
        return this.f28057a.clearTimeout();
    }

    public long deadlineNanoTime() {
        return this.f28057a.deadlineNanoTime();
    }

    public C10600e0 deadlineNanoTime(long j) {
        return this.f28057a.deadlineNanoTime(j);
    }

    public boolean hasDeadline() {
        return this.f28057a.hasDeadline();
    }

    public void throwIfReached() {
        this.f28057a.throwIfReached();
    }

    public C10600e0 timeout(long j, TimeUnit timeUnit) {
        C10457l.m35320e(timeUnit, "unit");
        return this.f28057a.timeout(j, timeUnit);
    }

    public long timeoutNanos() {
        return this.f28057a.timeoutNanos();
    }
}
