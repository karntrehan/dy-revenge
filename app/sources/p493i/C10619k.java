package p493i;

import p455g.p470y.p472d.C10457l;

/* renamed from: i.k */
public abstract class C10619k implements C10590b0 {
    private final C10590b0 delegate;

    public C10619k(C10590b0 b0Var) {
        C10457l.m35320e(b0Var, "delegate");
        this.delegate = b0Var;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final C10590b0 m37327deprecated_delegate() {
        return this.delegate;
    }

    public void close() {
        this.delegate.close();
    }

    public final C10590b0 delegate() {
        return this.delegate;
    }

    public void flush() {
        this.delegate.flush();
    }

    public C10600e0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    public void write(C10603f fVar, long j) {
        C10457l.m35320e(fVar, "source");
        this.delegate.write(fVar, j);
    }
}
