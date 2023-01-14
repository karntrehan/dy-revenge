package kotlinx.coroutines;

import p455g.p462v.C10372a;
import p455g.p462v.C10381g;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.k0 */
public final class C10777k0 extends C10372a {

    /* renamed from: f */
    public static final C10778a f28281f = new C10778a((C10452g) null);

    /* renamed from: o */
    private final String f28282o;

    /* renamed from: kotlinx.coroutines.k0$a */
    public static final class C10778a implements C10381g.C10386c<C10777k0> {
        private C10778a() {
        }

        public /* synthetic */ C10778a(C10452g gVar) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10777k0) && C10457l.m35316a(this.f28282o, ((C10777k0) obj).f28282o);
    }

    public int hashCode() {
        return this.f28282o.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f28282o + ')';
    }

    /* renamed from: u0 */
    public final String mo26762u0() {
        return this.f28282o;
    }
}
