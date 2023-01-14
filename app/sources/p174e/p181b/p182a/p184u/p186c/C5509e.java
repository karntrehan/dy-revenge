package p174e.p181b.p182a.p184u.p186c;

import java.util.List;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.u.c.e */
public class C5509e extends C5510f<Integer> {
    public C5509e(List<C5417a<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int mo16632p() {
        return mo16633q(mo16607b(), mo16609d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo16633q(C5417a<Integer> aVar, float f) {
        if (aVar.f15114b == null || aVar.f15115c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5419c<A> cVar = this.f15530e;
        if (cVar != null) {
            Integer num = (Integer) cVar.mo16370b(aVar.f15119g, aVar.f15120h.floatValue(), aVar.f15114b, aVar.f15115c, f, mo16610e(), mo16611f());
            if (num != null) {
                return num.intValue();
            }
        }
        return C5646g.m21064l(aVar.mo16365g(), aVar.mo16362d(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer mo16613i(C5417a<Integer> aVar, float f) {
        return Integer.valueOf(mo16633q(aVar, f));
    }
}
