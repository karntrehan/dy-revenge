package p174e.p181b.p182a.p193y;

import android.graphics.Color;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.f */
public class C5605f implements C5614j0<Integer> {

    /* renamed from: a */
    public static final C5605f f15891a = new C5605f();

    private C5605f() {
    }

    /* renamed from: b */
    public Integer mo16853a(C5618c cVar, float f) {
        boolean z = cVar.mo16868n0() == C5618c.C5620b.BEGIN_ARRAY;
        if (z) {
            cVar.mo16865b();
        }
        double L = cVar.mo16862L();
        double L2 = cVar.mo16862L();
        double L3 = cVar.mo16862L();
        double L4 = cVar.mo16868n0() == C5618c.C5620b.NUMBER ? cVar.mo16862L() : 1.0d;
        if (z) {
            cVar.mo16869o();
        }
        if (L <= 1.0d && L2 <= 1.0d && L3 <= 1.0d) {
            L *= 255.0d;
            L2 *= 255.0d;
            L3 *= 255.0d;
            if (L4 <= 1.0d) {
                L4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) L4, (int) L, (int) L2, (int) L3));
    }
}
