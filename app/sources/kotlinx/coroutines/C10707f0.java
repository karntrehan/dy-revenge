package kotlinx.coroutines;

import kotlinx.coroutines.internal.C10736e;
import p455g.p462v.C10372a;
import p455g.p462v.C10373b;
import p455g.p462v.C10376d;
import p455g.p462v.C10377e;
import p455g.p462v.C10381g;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10458m;

/* renamed from: kotlinx.coroutines.f0 */
public abstract class C10707f0 extends C10372a implements C10377e {

    /* renamed from: f */
    public static final C10708a f28190f = new C10708a((C10452g) null);

    /* renamed from: kotlinx.coroutines.f0$a */
    public static final class C10708a extends C10373b<C10377e, C10707f0> {

        /* renamed from: kotlinx.coroutines.f0$a$a */
        static final class C10709a extends C10458m implements C10430l<C10381g.C10384b, C10707f0> {

            /* renamed from: f */
            public static final C10709a f28191f = new C10709a();

            C10709a() {
                super(1);
            }

            /* renamed from: a */
            public final C10707f0 invoke(C10381g.C10384b bVar) {
                if (bVar instanceof C10707f0) {
                    return (C10707f0) bVar;
                }
                return null;
            }
        }

        private C10708a() {
            super(C10377e.f27571l, C10709a.f28191f);
        }

        public /* synthetic */ C10708a(C10452g gVar) {
            this();
        }
    }

    public C10707f0() {
        super(C10377e.f27571l);
    }

    public <E extends C10381g.C10384b> E get(C10381g.C10386c<E> cVar) {
        return C10377e.C10378a.m35221a(this, cVar);
    }

    /* renamed from: h */
    public final void mo25783h(C10376d<?> dVar) {
        ((C10736e) dVar).mo26713t();
    }

    public C10381g minusKey(C10381g.C10386c<?> cVar) {
        return C10377e.C10378a.m35222b(this, cVar);
    }

    /* renamed from: r */
    public final <T> C10376d<T> mo25784r(C10376d<? super T> dVar) {
        return new C10736e(this, dVar);
    }

    public String toString() {
        return C10822q0.m36786a(this) + '@' + C10822q0.m36787b(this);
    }

    /* renamed from: u0 */
    public abstract void mo26625u0(C10381g gVar, Runnable runnable);

    /* renamed from: v0 */
    public boolean mo26626v0(C10381g gVar) {
        return true;
    }
}
