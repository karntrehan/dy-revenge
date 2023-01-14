package p174e.p181b.p182a.p188w.p189j;

import android.graphics.PointF;
import java.util.List;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p184u.p186c.C5513i;
import p174e.p181b.p182a.p184u.p186c.C5514j;

/* renamed from: e.b.a.w.j.e */
public class C5537e implements C5545m<PointF, PointF> {

    /* renamed from: a */
    private final List<C5417a<PointF>> f15627a;

    public C5537e(List<C5417a<PointF>> list) {
        this.f15627a = list;
    }

    /* renamed from: a */
    public C5499a<PointF, PointF> mo16693a() {
        return this.f15627a.get(0).mo16366h() ? new C5514j(this.f15627a) : new C5513i(this.f15627a);
    }

    /* renamed from: b */
    public List<C5417a<PointF>> mo16694b() {
        return this.f15627a;
    }

    /* renamed from: c */
    public boolean mo16695c() {
        return this.f15627a.size() == 1 && this.f15627a.get(0).mo16366h();
    }
}
