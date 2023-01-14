package kotlinx.coroutines.p507m2;

import kotlinx.coroutines.C10822q0;

/* renamed from: kotlinx.coroutines.m2.k */
public final class C10805k extends C10803i {

    /* renamed from: p */
    public final Runnable f28335p;

    public C10805k(Runnable runnable, long j, C10804j jVar) {
        super(j, jVar);
        this.f28335p = runnable;
    }

    public void run() {
        try {
            this.f28335p.run();
        } finally {
            this.f28334o.mo26789a();
        }
    }

    public String toString() {
        return "Task[" + C10822q0.m36786a(this.f28335p) + '@' + C10822q0.m36787b(this.f28335p) + ", " + this.f28333f + ", " + this.f28334o + ']';
    }
}
