package p174e.p181b.p182a.p184u.p185b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.C5462l;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p184u.p186c.C5506b;
import p174e.p181b.p182a.p184u.p186c.C5520p;
import p174e.p181b.p182a.p188w.p190k.C5565p;
import p174e.p181b.p182a.p188w.p191l.C5571a;

/* renamed from: e.b.a.u.b.r */
public class C5497r extends C5476a {

    /* renamed from: o */
    private final C5571a f15514o;

    /* renamed from: p */
    private final String f15515p;

    /* renamed from: q */
    private final boolean f15516q;

    /* renamed from: r */
    private final C5499a<Integer, Integer> f15517r;

    /* renamed from: s */
    private C5499a<ColorFilter, ColorFilter> f15518s;

    public C5497r(C5442g gVar, C5571a aVar, C5565p pVar) {
        super(gVar, aVar, pVar.mo16787b().mo16797e(), pVar.mo16790e().mo16798e(), pVar.mo16792g(), pVar.mo16794i(), pVar.mo16795j(), pVar.mo16791f(), pVar.mo16789d());
        this.f15514o = aVar;
        this.f15515p = pVar.mo16793h();
        this.f15516q = pVar.mo16796k();
        C5499a<Integer, Integer> a = pVar.mo16788c().mo16693a();
        this.f15517r = a;
        a.mo16606a(this);
        aVar.mo16812j(a);
    }

    /* renamed from: g */
    public void mo16591g(Canvas canvas, Matrix matrix, int i) {
        if (!this.f15516q) {
            this.f15398i.setColor(((C5506b) this.f15517r).mo16625p());
            C5499a<ColorFilter, ColorFilter> aVar = this.f15518s;
            if (aVar != null) {
                this.f15398i.setColorFilter(aVar.mo16612h());
            }
            super.mo16591g(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.f15515p;
    }

    /* renamed from: h */
    public <T> void mo16592h(T t, C5419c<T> cVar) {
        super.mo16592h(t, cVar);
        if (t == C5462l.f15285b) {
            this.f15517r.mo16618n(cVar);
        } else if (t == C5462l.f15280E) {
            C5499a<ColorFilter, ColorFilter> aVar = this.f15518s;
            if (aVar != null) {
                this.f15514o.mo16806D(aVar);
            }
            if (cVar == null) {
                this.f15518s = null;
                return;
            }
            C5520p pVar = new C5520p(cVar);
            this.f15518s = pVar;
            pVar.mo16606a(this);
            this.f15514o.mo16812j(this.f15517r);
        }
    }
}
