package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: e.f.a.c.f.g.c0 */
final class C6727c0 implements Comparator {

    /* renamed from: f */
    final /* synthetic */ C6842j f18411f;

    /* renamed from: o */
    final /* synthetic */ C6991s4 f18412o;

    C6727c0(C6842j jVar, C6991s4 s4Var) {
        this.f18411f = jVar;
        this.f18412o = s4Var;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C6954q qVar = (C6954q) obj;
        C6954q qVar2 = (C6954q) obj2;
        C6842j jVar = this.f18411f;
        C6991s4 s4Var = this.f18412o;
        if (qVar instanceof C7034v) {
            return !(qVar2 instanceof C7034v) ? 1 : 0;
        }
        if (qVar2 instanceof C7034v) {
            return -1;
        }
        if (jVar == null) {
            return qVar.mo19741g().compareTo(qVar2.mo19741g());
        }
        return (int) C7008t5.m26531a(jVar.mo19542a(s4Var, Arrays.asList(new C6954q[]{qVar, qVar2})).mo19739d().doubleValue());
    }
}
