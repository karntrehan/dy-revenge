package p455g.p462v;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p455g.C10315m;
import p455g.p462v.p463j.C10390a;
import p455g.p462v.p464k.p465a.C10400e;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.v.i */
public final class C10388i<T> implements C10376d<T>, C10400e {

    /* renamed from: f */
    private static final C10389a f27575f = new C10389a((C10452g) null);
    @Deprecated

    /* renamed from: o */
    private static final AtomicReferenceFieldUpdater<C10388i<?>, Object> f27576o = AtomicReferenceFieldUpdater.newUpdater(C10388i.class, Object.class, "result");

    /* renamed from: p */
    private final C10376d<T> f27577p;
    private volatile Object result;

    /* renamed from: g.v.i$a */
    private static final class C10389a {
        private C10389a() {
        }

        public /* synthetic */ C10389a(C10452g gVar) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10388i(C10376d<? super T> dVar) {
        this(dVar, C10390a.UNDECIDED);
        C10457l.m35320e(dVar, "delegate");
    }

    public C10388i(C10376d<? super T> dVar, Object obj) {
        C10457l.m35320e(dVar, "delegate");
        this.f27577p = dVar;
        this.result = obj;
    }

    /* renamed from: a */
    public C10381g mo25781a() {
        return this.f27577p.mo25781a();
    }

    /* renamed from: b */
    public final Object mo25788b() {
        Object obj = this.result;
        C10390a aVar = C10390a.UNDECIDED;
        if (obj == aVar) {
            if (f27576o.compareAndSet(this, aVar, C10395d.m35244c())) {
                return C10395d.m35244c();
            }
            obj = this.result;
        }
        if (obj == C10390a.RESUMED) {
            return C10395d.m35244c();
        }
        if (!(obj instanceof C10315m.C10317b)) {
            return obj;
        }
        throw ((C10315m.C10317b) obj).f27542f;
    }

    /* renamed from: c */
    public C10400e mo25789c() {
        C10376d<T> dVar = this.f27577p;
        if (dVar instanceof C10400e) {
            return (C10400e) dVar;
        }
        return null;
    }

    /* renamed from: d */
    public void mo25782d(Object obj) {
        while (true) {
            Object obj2 = this.result;
            C10390a aVar = C10390a.UNDECIDED;
            if (obj2 == aVar) {
                if (f27576o.compareAndSet(this, aVar, obj)) {
                    return;
                }
            } else if (obj2 != C10395d.m35244c()) {
                throw new IllegalStateException("Already resumed");
            } else if (f27576o.compareAndSet(this, C10395d.m35244c(), C10390a.RESUMED)) {
                this.f27577p.mo25782d(obj);
                return;
            }
        }
    }

    /* renamed from: g */
    public StackTraceElement mo25790g() {
        return null;
    }

    public String toString() {
        return "SafeContinuation for " + this.f27577p;
    }
}
