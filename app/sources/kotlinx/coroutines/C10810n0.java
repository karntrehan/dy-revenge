package kotlinx.coroutines;

import kotlinx.coroutines.p506l2.C10786a;
import kotlinx.coroutines.p506l2.C10787b;
import p455g.C10313k;
import p455g.p462v.C10376d;
import p455g.p462v.C10380f;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p471c.C10434p;

/* renamed from: kotlinx.coroutines.n0 */
public enum C10810n0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: kotlinx.coroutines.n0$a */
    public /* synthetic */ class C10811a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28352a = null;

        static {
            int[] iArr = new int[C10810n0.values().length];
            iArr[C10810n0.DEFAULT.ordinal()] = 1;
            iArr[C10810n0.ATOMIC.ordinal()] = 2;
            iArr[C10810n0.UNDISPATCHED.ordinal()] = 3;
            iArr[C10810n0.LAZY.ordinal()] = 4;
            f28352a = iArr;
        }
    }

    /* renamed from: g */
    public final <R, T> void mo26807g(C10434p<? super R, ? super C10376d<? super T>, ? extends Object> pVar, R r, C10376d<? super T> dVar) {
        int i = C10811a.f28352a[ordinal()];
        if (i == 1) {
            C10786a.m36642e(pVar, r, dVar, (C10430l) null, 4, (Object) null);
        } else if (i == 2) {
            C10380f.m35223a(pVar, r, dVar);
        } else if (i == 3) {
            C10787b.m36643a(pVar, r, dVar);
        } else if (i != 4) {
            throw new C10313k();
        }
    }

    /* renamed from: h */
    public final boolean mo26808h() {
        return this == LAZY;
    }
}
