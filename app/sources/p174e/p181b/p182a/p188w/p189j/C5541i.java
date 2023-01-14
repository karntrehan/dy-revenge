package p174e.p181b.p182a.p188w.p189j;

import android.graphics.PointF;
import java.util.List;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p184u.p186c.C5517m;

/* renamed from: e.b.a.w.j.i */
public class C5541i implements C5545m<PointF, PointF> {

    /* renamed from: a */
    private final C5534b f15628a;

    /* renamed from: b */
    private final C5534b f15629b;

    public C5541i(C5534b bVar, C5534b bVar2) {
        this.f15628a = bVar;
        this.f15629b = bVar2;
    }

    /* renamed from: a */
    public C5499a<PointF, PointF> mo16693a() {
        return new C5517m(this.f15628a.mo16693a(), this.f15629b.mo16693a());
    }

    /* renamed from: b */
    public List<C5417a<PointF>> mo16694b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    /* renamed from: c */
    public boolean mo16695c() {
        return this.f15628a.mo16695c() && this.f15629b.mo16695c();
    }
}
