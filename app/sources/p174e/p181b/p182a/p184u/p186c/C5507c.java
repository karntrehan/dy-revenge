package p174e.p181b.p182a.p184u.p186c;

import java.util.List;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.u.c.c */
public class C5507c extends C5510f<Float> {
    public C5507c(List<C5417a<Float>> list) {
        super(list);
    }

    /* renamed from: p */
    public float mo16628p() {
        return mo16629q(mo16607b(), mo16609d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public float mo16629q(C5417a<Float> aVar, float f) {
        if (aVar.f15114b == null || aVar.f15115c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5419c<A> cVar = this.f15530e;
        if (cVar != null) {
            Float f2 = (Float) cVar.mo16370b(aVar.f15119g, aVar.f15120h.floatValue(), aVar.f15114b, aVar.f15115c, f, mo16610e(), mo16611f());
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        return C5646g.m21063k(aVar.mo16364f(), aVar.mo16361c(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Float mo16613i(C5417a<Float> aVar, float f) {
        return Float.valueOf(mo16629q(aVar, f));
    }
}
