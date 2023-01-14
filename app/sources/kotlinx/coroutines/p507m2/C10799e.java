package kotlinx.coroutines.p507m2;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.C10716g1;
import p455g.p462v.C10381g;

/* renamed from: kotlinx.coroutines.m2.e */
final class C10799e extends C10716g1 implements C10804j, Executor {

    /* renamed from: p */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28324p = AtomicIntegerFieldUpdater.newUpdater(C10799e.class, "inFlightTasks");
    private volatile /* synthetic */ int inFlightTasks = 0;

    /* renamed from: q */
    private final C10797c f28325q;

    /* renamed from: r */
    private final int f28326r;

    /* renamed from: s */
    private final String f28327s;

    /* renamed from: t */
    private final int f28328t;

    /* renamed from: u */
    private final ConcurrentLinkedQueue<Runnable> f28329u = new ConcurrentLinkedQueue<>();

    public C10799e(C10797c cVar, int i, String str, int i2) {
        this.f28325q = cVar;
        this.f28326r = i;
        this.f28327s = str;
        this.f28328t = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Runnable) = (r4v0 java.lang.Runnable), (r4v5 java.lang.Runnable) binds: [B:0:0x0000, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m36696w0(java.lang.Runnable r4, boolean r5) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f28324p
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.f28326r
            if (r1 > r2) goto L_0x0010
            kotlinx.coroutines.m2.c r0 = r3.f28325q
            r0.mo26787x0(r4, r3, r5)
            return
        L_0x0010:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.f28329u
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.f28326r
            if (r4 < r0) goto L_0x001e
            return
        L_0x001e:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.f28329u
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p507m2.C10799e.m36696w0(java.lang.Runnable, boolean):void");
    }

    /* renamed from: L */
    public int mo26788L() {
        return this.f28328t;
    }

    /* renamed from: a */
    public void mo26789a() {
        Runnable poll = this.f28329u.poll();
        if (poll != null) {
            this.f28325q.mo26787x0(poll, this, true);
            return;
        }
        f28324p.decrementAndGet(this);
        Runnable poll2 = this.f28329u.poll();
        if (poll2 != null) {
            m36696w0(poll2, true);
        }
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        m36696w0(runnable, false);
    }

    public String toString() {
        String str = this.f28327s;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f28325q + ']';
    }

    /* renamed from: u0 */
    public void mo26625u0(C10381g gVar, Runnable runnable) {
        m36696w0(runnable, false);
    }
}
