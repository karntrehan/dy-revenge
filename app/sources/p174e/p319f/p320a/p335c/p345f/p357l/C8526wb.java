package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.Comparator;

/* renamed from: e.f.a.c.f.l.wb */
final class C8526wb implements Comparator<C8177dc> {
    C8526wb() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C8177dc dcVar = (C8177dc) obj;
        C8177dc dcVar2 = (C8177dc) obj2;
        C8490ub ubVar = new C8490ub(dcVar);
        C8490ub ubVar2 = new C8490ub(dcVar2);
        while (ubVar.hasNext() && ubVar2.hasNext()) {
            int a = C8508vb.m29165a(ubVar.zza() & 255, ubVar2.zza() & 255);
            if (a != 0) {
                return a;
            }
        }
        return C8508vb.m29165a(dcVar.mo21692h(), dcVar2.mo21692h());
    }
}
