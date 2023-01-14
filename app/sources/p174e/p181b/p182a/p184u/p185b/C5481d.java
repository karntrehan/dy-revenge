package p174e.p181b.p182a.p184u.p185b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p184u.C5475a;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p184u.p186c.C5519o;
import p174e.p181b.p182a.p188w.C5528e;
import p174e.p181b.p182a.p188w.C5529f;
import p174e.p181b.p182a.p188w.p189j.C5544l;
import p174e.p181b.p182a.p188w.p190k.C5548b;
import p174e.p181b.p182a.p188w.p190k.C5563n;
import p174e.p181b.p182a.p188w.p191l.C5571a;
import p174e.p181b.p182a.p195z.C5647h;

/* renamed from: e.b.a.u.b.d */
public class C5481d implements C5482e, C5491m, C5499a.C5501b, C5529f {

    /* renamed from: a */
    private Paint f15407a;

    /* renamed from: b */
    private RectF f15408b;

    /* renamed from: c */
    private final Matrix f15409c;

    /* renamed from: d */
    private final Path f15410d;

    /* renamed from: e */
    private final RectF f15411e;

    /* renamed from: f */
    private final String f15412f;

    /* renamed from: g */
    private final boolean f15413g;

    /* renamed from: h */
    private final List<C5480c> f15414h;

    /* renamed from: i */
    private final C5442g f15415i;

    /* renamed from: j */
    private List<C5491m> f15416j;

    /* renamed from: k */
    private C5519o f15417k;

    public C5481d(C5442g gVar, C5571a aVar, C5563n nVar) {
        this(gVar, aVar, nVar.mo16780c(), nVar.mo16781d(), m20394f(gVar, aVar, nVar.mo16779b()), m20395i(nVar.mo16779b()));
    }

    C5481d(C5442g gVar, C5571a aVar, String str, boolean z, List<C5480c> list, C5544l lVar) {
        this.f15407a = new C5475a();
        this.f15408b = new RectF();
        this.f15409c = new Matrix();
        this.f15410d = new Path();
        this.f15411e = new RectF();
        this.f15412f = str;
        this.f15415i = gVar;
        this.f15413g = z;
        this.f15414h = list;
        if (lVar != null) {
            C5519o b = lVar.mo16699b();
            this.f15417k = b;
            b.mo16650a(aVar);
            this.f15417k.mo16651b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            C5480c cVar = list.get(size);
            if (cVar instanceof C5487j) {
                arrayList.add((C5487j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((C5487j) arrayList.get(size2)).mo16599f(list.listIterator(list.size()));
        }
    }

    /* renamed from: f */
    private static List<C5480c> m20394f(C5442g gVar, C5571a aVar, List<C5548b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C5480c a = list.get(i).mo16698a(gVar, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    static C5544l m20395i(List<C5548b> list) {
        for (int i = 0; i < list.size(); i++) {
            C5548b bVar = list.get(i);
            if (bVar instanceof C5544l) {
                return (C5544l) bVar;
            }
        }
        return null;
    }

    /* renamed from: l */
    private boolean m20396l() {
        int i = 0;
        for (int i2 = 0; i2 < this.f15414h.size(); i2++) {
            if ((this.f15414h.get(i2) instanceof C5482e) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public Path mo16596a() {
        this.f15409c.reset();
        C5519o oVar = this.f15417k;
        if (oVar != null) {
            this.f15409c.set(oVar.mo16654f());
        }
        this.f15410d.reset();
        if (this.f15413g) {
            return this.f15410d;
        }
        for (int size = this.f15414h.size() - 1; size >= 0; size--) {
            C5480c cVar = this.f15414h.get(size);
            if (cVar instanceof C5491m) {
                this.f15410d.addPath(((C5491m) cVar).mo16596a(), this.f15409c);
            }
        }
        return this.f15410d;
    }

    /* renamed from: b */
    public void mo16587b() {
        this.f15415i.invalidateSelf();
    }

    /* renamed from: c */
    public void mo16588c(List<C5480c> list, List<C5480c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f15414h.size());
        arrayList.addAll(list);
        for (int size = this.f15414h.size() - 1; size >= 0; size--) {
            C5480c cVar = this.f15414h.get(size);
            cVar.mo16588c(arrayList, this.f15414h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    /* renamed from: d */
    public void mo16589d(C5528e eVar, int i, List<C5528e> list, C5528e eVar2) {
        if (eVar.mo16682g(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.mo16678a(getName());
                if (eVar.mo16679c(getName(), i)) {
                    list.add(eVar2.mo16684i(this));
                }
            }
            if (eVar.mo16683h(getName(), i)) {
                int e = i + eVar.mo16681e(getName(), i);
                for (int i2 = 0; i2 < this.f15414h.size(); i2++) {
                    C5480c cVar = this.f15414h.get(i2);
                    if (cVar instanceof C5529f) {
                        ((C5529f) cVar).mo16589d(eVar, e, list, eVar2);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void mo16590e(RectF rectF, Matrix matrix, boolean z) {
        this.f15409c.set(matrix);
        C5519o oVar = this.f15417k;
        if (oVar != null) {
            this.f15409c.preConcat(oVar.mo16654f());
        }
        this.f15411e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f15414h.size() - 1; size >= 0; size--) {
            C5480c cVar = this.f15414h.get(size);
            if (cVar instanceof C5482e) {
                ((C5482e) cVar).mo16590e(this.f15411e, this.f15409c, z);
                rectF.union(this.f15411e);
            }
        }
    }

    /* renamed from: g */
    public void mo16591g(Canvas canvas, Matrix matrix, int i) {
        if (!this.f15413g) {
            this.f15409c.set(matrix);
            C5519o oVar = this.f15417k;
            if (oVar != null) {
                this.f15409c.preConcat(oVar.mo16654f());
                i = (int) ((((((float) (this.f15417k.mo16656h() == null ? 100 : this.f15417k.mo16656h().mo16612h().intValue())) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            boolean z = this.f15415i.mo16499J() && m20396l() && i != 255;
            if (z) {
                this.f15408b.set(0.0f, 0.0f, 0.0f, 0.0f);
                mo16590e(this.f15408b, this.f15409c, true);
                this.f15407a.setAlpha(i);
                C5647h.m21078m(canvas, this.f15408b, this.f15407a);
            }
            if (z) {
                i = 255;
            }
            for (int size = this.f15414h.size() - 1; size >= 0; size--) {
                C5480c cVar = this.f15414h.get(size);
                if (cVar instanceof C5482e) {
                    ((C5482e) cVar).mo16591g(canvas, this.f15409c, i);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public String getName() {
        return this.f15412f;
    }

    /* renamed from: h */
    public <T> void mo16592h(T t, C5419c<T> cVar) {
        C5519o oVar = this.f15417k;
        if (oVar != null) {
            oVar.mo16652c(t, cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List<C5491m> mo16597j() {
        if (this.f15416j == null) {
            this.f15416j = new ArrayList();
            for (int i = 0; i < this.f15414h.size(); i++) {
                C5480c cVar = this.f15414h.get(i);
                if (cVar instanceof C5491m) {
                    this.f15416j.add((C5491m) cVar);
                }
            }
        }
        return this.f15416j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Matrix mo16598k() {
        C5519o oVar = this.f15417k;
        if (oVar != null) {
            return oVar.mo16654f();
        }
        this.f15409c.reset();
        return this.f15409c;
    }
}
