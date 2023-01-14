package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C10819p0;

/* renamed from: kotlinx.coroutines.internal.c */
public abstract class C10733c<T> extends C10759r {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28218a = AtomicReferenceFieldUpdater.newUpdater(C10733c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C10731b.f28216a;

    /* renamed from: a */
    public C10733c<?> mo26698a() {
        return this;
    }

    /* renamed from: c */
    public final Object mo26699c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C10731b.f28216a) {
            obj2 = mo26701e(mo26703g(obj));
        }
        mo26700d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo26700d(T t, Object obj);

    /* renamed from: e */
    public final Object mo26701e(Object obj) {
        if (C10819p0.m36781a()) {
            if (!(obj != C10731b.f28216a)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        Object obj3 = C10731b.f28216a;
        return obj2 != obj3 ? obj2 : f28218a.compareAndSet(this, obj3, obj) ? obj : this._consensus;
    }

    /* renamed from: f */
    public long mo26702f() {
        return 0;
    }

    /* renamed from: g */
    public abstract Object mo26703g(T t);
}
