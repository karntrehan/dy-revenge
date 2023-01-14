package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.C10690b1;

/* renamed from: kotlinx.coroutines.c1 */
public abstract class C10696c1 extends C10683a1 {
    /* access modifiers changed from: protected */
    /* renamed from: F0 */
    public abstract Thread mo26654F0();

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public final void mo26655G0(long j, C10690b1.C10691a aVar) {
        if (C10819p0.m36781a()) {
            if (!(this != C10825r0.f28369t)) {
                throw new AssertionError();
            }
        }
        C10825r0.f28369t.mo26634S0(j, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public final void mo26656H0() {
        Thread F0 = mo26654F0();
        if (Thread.currentThread() == F0) {
            return;
        }
        if (C10702e.m36417a() == null) {
            LockSupport.unpark(F0);
            return;
        }
        throw null;
    }
}
