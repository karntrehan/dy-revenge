package p174e.p181b.p182a.p184u.p186c;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p183a0.C5419c;

/* renamed from: e.b.a.u.c.i */
public class C5513i extends C5510f<PointF> {

    /* renamed from: i */
    private final PointF f15546i = new PointF();

    /* renamed from: j */
    private final float[] f15547j = new float[2];

    /* renamed from: k */
    private final PathMeasure f15548k = new PathMeasure();

    /* renamed from: l */
    private C5512h f15549l;

    public C5513i(List<? extends C5417a<PointF>> list) {
        super(list);
    }

    /* renamed from: p */
    public PointF mo16613i(C5417a<PointF> aVar, float f) {
        C5512h hVar = (C5512h) aVar;
        Path j = hVar.mo16639j();
        if (j == null) {
            return (PointF) aVar.f15114b;
        }
        C5419c<A> cVar = this.f15530e;
        if (cVar != null) {
            PointF pointF = (PointF) cVar.mo16370b(hVar.f15119g, hVar.f15120h.floatValue(), hVar.f15114b, hVar.f15115c, mo16610e(), f, mo16611f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f15549l != hVar) {
            this.f15548k.setPath(j, false);
            this.f15549l = hVar;
        }
        PathMeasure pathMeasure = this.f15548k;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f15547j, (float[]) null);
        PointF pointF2 = this.f15546i;
        float[] fArr = this.f15547j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f15546i;
    }
}
