package kotlinx.coroutines.p507m2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C10819p0;

/* renamed from: kotlinx.coroutines.m2.m */
public final class C10807m {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28342a;

    /* renamed from: b */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28343b;

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28344c;

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28345d;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;

    /* renamed from: e */
    private final AtomicReferenceArray<C10803i> f28346e = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<C10807m> cls = C10807m.class;
        f28342a = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f28343b = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f28344c = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f28345d = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: b */
    public static /* synthetic */ C10803i m36706b(C10807m mVar, C10803i iVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return mVar.mo26795a(iVar, z);
    }

    /* renamed from: c */
    private final C10803i m36707c(C10803i iVar) {
        boolean z = true;
        if (iVar.f28334o.mo26788L() != 1) {
            z = false;
        }
        if (z) {
            f28345d.incrementAndGet(this);
        }
        if (mo26796e() == 127) {
            return iVar;
        }
        int i = this.producerIndex & 127;
        while (this.f28346e.get(i) != null) {
            Thread.yield();
        }
        this.f28346e.lazySet(i, iVar);
        f28343b.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    private final void m36708d(C10803i iVar) {
        if (iVar != null) {
            boolean z = false;
            if (iVar.f28334o.mo26788L() == 1) {
                int decrementAndGet = f28345d.decrementAndGet(this);
                if (C10819p0.m36781a()) {
                    if (decrementAndGet >= 0) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private final C10803i m36709i() {
        C10803i andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f28344c.compareAndSet(this, i, i + 1) && (andSet = this.f28346e.getAndSet(i2, (Object) null)) != null) {
                m36708d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m36710j(C10798d dVar) {
        C10803i i = m36709i();
        if (i == null) {
            return false;
        }
        dVar.mo26735a(i);
        return true;
    }

    /* renamed from: m */
    private final long m36711m(C10807m mVar, boolean z) {
        C10803i iVar;
        do {
            iVar = (C10803i) mVar.lastScheduledTask;
            if (iVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (iVar.f28334o.mo26788L() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a = C10806l.f28341f.mo26792a() - iVar.f28333f;
            long j = C10806l.f28336a;
            if (a < j) {
                return j - a;
            }
        } while (!f28342a.compareAndSet(mVar, iVar, (Object) null));
        m36706b(this, iVar, false, 2, (Object) null);
        return -1;
    }

    /* renamed from: a */
    public final C10803i mo26795a(C10803i iVar, boolean z) {
        if (z) {
            return m36707c(iVar);
        }
        C10803i iVar2 = (C10803i) f28342a.getAndSet(this, iVar);
        if (iVar2 == null) {
            return null;
        }
        return m36707c(iVar2);
    }

    /* renamed from: e */
    public final int mo26796e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int mo26797f() {
        return this.lastScheduledTask != null ? mo26796e() + 1 : mo26796e();
    }

    /* renamed from: g */
    public final void mo26798g(C10798d dVar) {
        C10803i iVar = (C10803i) f28342a.getAndSet(this, (Object) null);
        if (iVar != null) {
            dVar.mo26735a(iVar);
        }
        do {
        } while (m36710j(dVar));
    }

    /* renamed from: h */
    public final C10803i mo26799h() {
        C10803i iVar = (C10803i) f28342a.getAndSet(this, (Object) null);
        return iVar == null ? m36709i() : iVar;
    }

    /* renamed from: k */
    public final long mo26800k(C10807m mVar) {
        if (C10819p0.m36781a()) {
            if (!(mo26796e() == 0)) {
                throw new AssertionError();
            }
        }
        int i = mVar.producerIndex;
        AtomicReferenceArray<C10803i> atomicReferenceArray = mVar.f28346e;
        for (int i2 = mVar.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            C10803i iVar = atomicReferenceArray.get(i3);
            if (iVar != null) {
                if ((iVar.f28334o.mo26788L() == 1) && atomicReferenceArray.compareAndSet(i3, iVar, (Object) null)) {
                    f28345d.decrementAndGet(mVar);
                    m36706b(this, iVar, false, 2, (Object) null);
                    return -1;
                }
            }
        }
        return m36711m(mVar, true);
    }

    /* renamed from: l */
    public final long mo26801l(C10807m mVar) {
        boolean z = true;
        if (C10819p0.m36781a()) {
            if (!(mo26796e() == 0)) {
                throw new AssertionError();
            }
        }
        C10803i i = mVar.m36709i();
        if (i == null) {
            return m36711m(mVar, false);
        }
        C10803i b = m36706b(this, i, false, 2, (Object) null);
        if (!C10819p0.m36781a()) {
            return -1;
        }
        if (b != null) {
            z = false;
        }
        if (z) {
            return -1;
        }
        throw new AssertionError();
    }
}
