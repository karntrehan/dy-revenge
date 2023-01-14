package p455g;

import java.io.Serializable;
import p455g.p470y.p471c.C10419a;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.o */
final class C10319o<T> implements C10309g<T>, Serializable {

    /* renamed from: f */
    private C10419a<? extends T> f27543f;

    /* renamed from: o */
    private volatile Object f27544o;

    /* renamed from: p */
    private final Object f27545p;

    public C10319o(C10419a<? extends T> aVar, Object obj) {
        C10457l.m35320e(aVar, "initializer");
        this.f27543f = aVar;
        this.f27544o = C10321q.f27546a;
        this.f27545p = obj == null ? this : obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10319o(C10419a aVar, Object obj, int i, C10452g gVar) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }

    /* renamed from: a */
    public boolean mo25619a() {
        return this.f27544o != C10321q.f27546a;
    }

    public T getValue() {
        T t;
        T t2 = this.f27544o;
        T t3 = C10321q.f27546a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.f27545p) {
            t = this.f27544o;
            if (t == t3) {
                C10419a aVar = this.f27543f;
                C10457l.m35317b(aVar);
                t = aVar.invoke();
                this.f27544o = t;
                this.f27543f = null;
            }
        }
        return t;
    }

    public String toString() {
        return mo25619a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
