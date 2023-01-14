package p174e.p181b.p182a.p184u.p185b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p174e.p181b.p182a.C5422c;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.C5462l;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p184u.C5475a;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p184u.p186c.C5506b;
import p174e.p181b.p182a.p184u.p186c.C5520p;
import p174e.p181b.p182a.p188w.C5528e;
import p174e.p181b.p182a.p188w.p190k.C5562m;
import p174e.p181b.p182a.p188w.p191l.C5571a;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.u.b.g */
public class C5484g implements C5482e, C5499a.C5501b, C5488k {

    /* renamed from: a */
    private final Path f15426a;

    /* renamed from: b */
    private final Paint f15427b = new C5475a(1);

    /* renamed from: c */
    private final C5571a f15428c;

    /* renamed from: d */
    private final String f15429d;

    /* renamed from: e */
    private final boolean f15430e;

    /* renamed from: f */
    private final List<C5491m> f15431f = new ArrayList();

    /* renamed from: g */
    private final C5499a<Integer, Integer> f15432g;

    /* renamed from: h */
    private final C5499a<Integer, Integer> f15433h;

    /* renamed from: i */
    private C5499a<ColorFilter, ColorFilter> f15434i;

    /* renamed from: j */
    private final C5442g f15435j;

    public C5484g(C5442g gVar, C5571a aVar, C5562m mVar) {
        Path path = new Path();
        this.f15426a = path;
        this.f15428c = aVar;
        this.f15429d = mVar.mo16775d();
        this.f15430e = mVar.mo16777f();
        this.f15435j = gVar;
        if (mVar.mo16773b() == null || mVar.mo16776e() == null) {
            this.f15432g = null;
            this.f15433h = null;
            return;
        }
        path.setFillType(mVar.mo16774c());
        C5499a<Integer, Integer> a = mVar.mo16773b().mo16693a();
        this.f15432g = a;
        a.mo16606a(this);
        aVar.mo16812j(a);
        C5499a<Integer, Integer> a2 = mVar.mo16776e().mo16693a();
        this.f15433h = a2;
        a2.mo16606a(this);
        aVar.mo16812j(a2);
    }

    /* renamed from: b */
    public void mo16587b() {
        this.f15435j.invalidateSelf();
    }

    /* renamed from: c */
    public void mo16588c(List<C5480c> list, List<C5480c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C5480c cVar = list2.get(i);
            if (cVar instanceof C5491m) {
                this.f15431f.add((C5491m) cVar);
            }
        }
    }

    /* renamed from: d */
    public void mo16589d(C5528e eVar, int i, List<C5528e> list, C5528e eVar2) {
        C5646g.m21065m(eVar, i, list, eVar2, this);
    }

    /* renamed from: e */
    public void mo16590e(RectF rectF, Matrix matrix, boolean z) {
        this.f15426a.reset();
        for (int i = 0; i < this.f15431f.size(); i++) {
            this.f15426a.addPath(this.f15431f.get(i).mo16596a(), matrix);
        }
        this.f15426a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: g */
    public void mo16591g(Canvas canvas, Matrix matrix, int i) {
        if (!this.f15430e) {
            C5422c.m20179a("FillContent#draw");
            this.f15427b.setColor(((C5506b) this.f15432g).mo16625p());
            this.f15427b.setAlpha(C5646g.m21056d((int) ((((((float) i) / 255.0f) * ((float) this.f15433h.mo16612h().intValue())) / 100.0f) * 255.0f), 0, 255));
            C5499a<ColorFilter, ColorFilter> aVar = this.f15434i;
            if (aVar != null) {
                this.f15427b.setColorFilter(aVar.mo16612h());
            }
            this.f15426a.reset();
            for (int i2 = 0; i2 < this.f15431f.size(); i2++) {
                this.f15426a.addPath(this.f15431f.get(i2).mo16596a(), matrix);
            }
            canvas.drawPath(this.f15426a, this.f15427b);
            C5422c.m20180b("FillContent#draw");
        }
    }

    public String getName() {
        return this.f15429d;
    }

    /* renamed from: h */
    public <T> void mo16592h(T t, C5419c<T> cVar) {
        C5499a<Integer, Integer> aVar;
        if (t == C5462l.f15284a) {
            aVar = this.f15432g;
        } else if (t == C5462l.f15287d) {
            aVar = this.f15433h;
        } else if (t == C5462l.f15280E) {
            C5499a<ColorFilter, ColorFilter> aVar2 = this.f15434i;
            if (aVar2 != null) {
                this.f15428c.mo16806D(aVar2);
            }
            if (cVar == null) {
                this.f15434i = null;
                return;
            }
            C5520p pVar = new C5520p(cVar);
            this.f15434i = pVar;
            pVar.mo16606a(this);
            this.f15428c.mo16812j(this.f15434i);
            return;
        } else {
            return;
        }
        aVar.mo16618n(cVar);
    }
}
