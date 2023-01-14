package p027c.p043d.p044a;

import androidx.camera.core.impl.p014a3.C0717c;
import androidx.core.util.C1177h;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: c.d.a.b1 */
public final class C1516b1 implements AutoCloseable {

    /* renamed from: f */
    private final AtomicBoolean f4759f;

    /* renamed from: o */
    private final C1502a1 f4760o;

    /* renamed from: p */
    private final long f4761p;

    /* renamed from: q */
    private final C1721v0 f4762q;

    /* renamed from: r */
    private final C0717c f4763r;

    C1516b1(C1502a1 a1Var, long j, C1721v0 v0Var, boolean z) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f4759f = atomicBoolean;
        C0717c b = C0717c.m2967b();
        this.f4763r = b;
        this.f4760o = a1Var;
        this.f4761p = j;
        this.f4762q = v0Var;
        if (z) {
            atomicBoolean.set(true);
        } else {
            b.mo2824c("stop");
        }
    }

    /* renamed from: a */
    static C1516b1 m6789a(C1725x0 x0Var, long j) {
        C1177h.m4584f(x0Var, "The given PendingRecording cannot be null.");
        return new C1516b1(x0Var.mo5958e(), j, x0Var.mo5957d(), true);
    }

    /* renamed from: b */
    static C1516b1 m6790b(C1725x0 x0Var, long j) {
        C1177h.m4584f(x0Var, "The given PendingRecording cannot be null.");
        return new C1516b1(x0Var.mo5958e(), j, x0Var.mo5957d(), false);
    }

    /* renamed from: A */
    public void mo5623A() {
        if (!this.f4759f.get()) {
            this.f4760o.mo5583m0(this);
            return;
        }
        throw new IllegalStateException("The recording has been stopped.");
    }

    /* renamed from: E */
    public void mo5624E() {
        this.f4763r.mo2823a();
        if (!this.f4759f.getAndSet(true)) {
            this.f4760o.mo5593x0(this);
        }
    }

    public void close() {
        mo5624E();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            this.f4763r.mo2825d();
            mo5624E();
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C1721v0 mo5627h() {
        return this.f4762q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public long mo5628o() {
        return this.f4761p;
    }

    /* renamed from: r */
    public void mo5629r() {
        if (!this.f4759f.get()) {
            this.f4760o.mo5574a0(this);
            return;
        }
        throw new IllegalStateException("The recording has been stopped.");
    }
}
