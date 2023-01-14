package p174e.p181b.p182a.p193y;

import android.graphics.PointF;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.y */
public class C5638y implements C5614j0<PointF> {

    /* renamed from: a */
    public static final C5638y f15959a = new C5638y();

    private C5638y() {
    }

    /* renamed from: b */
    public PointF mo16853a(C5618c cVar, float f) {
        C5618c.C5620b n0 = cVar.mo16868n0();
        if (n0 == C5618c.C5620b.BEGIN_ARRAY) {
            return C5627p.m20984e(cVar, f);
        }
        if (n0 == C5618c.C5620b.BEGIN_OBJECT) {
            return C5627p.m20984e(cVar, f);
        }
        if (n0 == C5618c.C5620b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.mo16862L()) * f, ((float) cVar.mo16862L()) * f);
            while (cVar.mo16860E()) {
                cVar.mo16874w0();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + n0);
    }
}
