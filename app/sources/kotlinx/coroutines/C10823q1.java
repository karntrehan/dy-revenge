package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.q1 */
public class C10823q1 extends C10835u1 implements C10842w {

    /* renamed from: o */
    private final boolean f28367o = m36789x0();

    public C10823q1(C10812n1 n1Var) {
        super(true);
        mo26844R(n1Var);
    }

    /* renamed from: x0 */
    private final boolean m36789x0() {
        C10830t tVar;
        C10827s N = mo26842N();
        C10830t tVar2 = N instanceof C10830t ? (C10830t) N : null;
        if (tVar2 == null) {
            return false;
        }
        do {
            C10835u1 u = tVar2.mo26837u();
            if (u.mo26833K()) {
                return true;
            }
            C10827s N2 = u.mo26842N();
            if (N2 instanceof C10830t) {
                tVar = (C10830t) N2;
                continue;
            } else {
                tVar = null;
                continue;
            }
        } while (tVar2 != null);
        return false;
    }

    /* renamed from: K */
    public boolean mo26833K() {
        return this.f28367o;
    }

    /* renamed from: L */
    public boolean mo26834L() {
        return true;
    }
}
