package p174e.p181b.p182a.p184u.p186c;

import java.util.List;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p195z.C5641b;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.u.c.b */
public class C5506b extends C5510f<Integer> {
    public C5506b(List<C5417a<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int mo16625p() {
        return mo16626q(mo16607b(), mo16609d());
    }

    /* renamed from: q */
    public int mo16626q(C5417a<Integer> aVar, float f) {
        T t = aVar.f15114b;
        if (t == null || aVar.f15115c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) t).intValue();
        int intValue2 = ((Integer) aVar.f15115c).intValue();
        C5419c<A> cVar = this.f15530e;
        if (cVar != null) {
            Integer num = (Integer) cVar.mo16370b(aVar.f15119g, aVar.f15120h.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, mo16610e(), mo16611f());
            if (num != null) {
                return num.intValue();
            }
        }
        return C5641b.m21020c(C5646g.m21055c(f, 0.0f, 1.0f), intValue, intValue2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer mo16613i(C5417a<Integer> aVar, float f) {
        return Integer.valueOf(mo16626q(aVar, f));
    }
}
