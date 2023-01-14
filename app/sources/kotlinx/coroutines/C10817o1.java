package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.o1 */
public final class C10817o1 extends CancellationException implements C10699d0<C10817o1> {

    /* renamed from: f */
    public final C10812n1 f28360f;

    public C10817o1(String str, Throwable th, C10812n1 n1Var) {
        super(str);
        this.f28360f = n1Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* renamed from: b */
    public C10817o1 mo26658a() {
        if (!C10819p0.m36783c()) {
            return null;
        }
        String message = getMessage();
        C10457l.m35317b(message);
        return new C10817o1(message, this, this.f28360f);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C10817o1) {
                C10817o1 o1Var = (C10817o1) obj;
                if (!C10457l.m35316a(o1Var.getMessage(), getMessage()) || !C10457l.m35316a(o1Var.f28360f, this.f28360f) || !C10457l.m35316a(o1Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        if (C10819p0.m36783c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C10457l.m35317b(message);
        int hashCode = ((message.hashCode() * 31) + this.f28360f.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    public String toString() {
        return super.toString() + "; job=" + this.f28360f;
    }
}
