package p174e.p181b.p182a.p184u.p186c;

import java.util.List;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p183a0.C5420d;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.u.c.k */
public class C5515k extends C5510f<C5420d> {

    /* renamed from: i */
    private final C5420d f15551i = new C5420d();

    public C5515k(List<C5417a<C5420d>> list) {
        super(list);
    }

    /* renamed from: p */
    public C5420d mo16613i(C5417a<C5420d> aVar, float f) {
        T t;
        T t2 = aVar.f15114b;
        if (t2 == null || (t = aVar.f15115c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5420d dVar = (C5420d) t2;
        C5420d dVar2 = (C5420d) t;
        C5419c<A> cVar = this.f15530e;
        if (cVar != null) {
            C5420d dVar3 = (C5420d) cVar.mo16370b(aVar.f15119g, aVar.f15120h.floatValue(), dVar, dVar2, f, mo16610e(), mo16611f());
            if (dVar3 != null) {
                return dVar3;
            }
        }
        this.f15551i.mo16375d(C5646g.m21063k(dVar.mo16373b(), dVar2.mo16373b(), f), C5646g.m21063k(dVar.mo16374c(), dVar2.mo16374c(), f));
        return this.f15551i;
    }
}
