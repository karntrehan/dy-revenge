package p493i;

import p455g.p470y.p472d.C10457l;

/* renamed from: i.l */
public abstract class C10620l implements C10598d0 {
    private final C10598d0 delegate;

    public C10620l(C10598d0 d0Var) {
        C10457l.m35320e(d0Var, "delegate");
        this.delegate = d0Var;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final C10598d0 m37328deprecated_delegate() {
        return this.delegate;
    }

    public void close() {
        this.delegate.close();
    }

    public final C10598d0 delegate() {
        return this.delegate;
    }

    public long read(C10603f fVar, long j) {
        C10457l.m35320e(fVar, "sink");
        return this.delegate.read(fVar, j);
    }

    public C10600e0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
