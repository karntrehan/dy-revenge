package p174e.p181b.p182a.p184u.p186c;

import android.graphics.PointF;
import java.util.List;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p183a0.C5419c;

/* renamed from: e.b.a.u.c.j */
public class C5514j extends C5510f<PointF> {

    /* renamed from: i */
    private final PointF f15550i = new PointF();

    public C5514j(List<C5417a<PointF>> list) {
        super(list);
    }

    /* renamed from: p */
    public PointF mo16613i(C5417a<PointF> aVar, float f) {
        return mo16614j(aVar, f, f, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public PointF mo16614j(C5417a<PointF> aVar, float f, float f2, float f3) {
        T t;
        T t2 = aVar.f15114b;
        if (t2 == null || (t = aVar.f15115c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t2;
        PointF pointF2 = (PointF) t;
        C5419c<A> cVar = this.f15530e;
        if (cVar != null) {
            PointF pointF3 = (PointF) cVar.mo16370b(aVar.f15119g, aVar.f15120h.floatValue(), pointF, pointF2, f, mo16610e(), mo16611f());
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.f15550i;
        float f4 = pointF.x;
        float f5 = f4 + (f2 * (pointF2.x - f4));
        float f6 = pointF.y;
        pointF4.set(f5, f6 + (f3 * (pointF2.y - f6)));
        return this.f15550i;
    }
}
