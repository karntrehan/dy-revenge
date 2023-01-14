package p174e.p181b.p182a.p184u.p185b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p174e.p181b.p182a.C5422c;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.C5462l;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p184u.C5475a;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p184u.p186c.C5507c;
import p174e.p181b.p182a.p184u.p186c.C5509e;
import p174e.p181b.p182a.p184u.p186c.C5520p;
import p174e.p181b.p182a.p188w.C5528e;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p188w.p189j.C5536d;
import p174e.p181b.p182a.p188w.p190k.C5569q;
import p174e.p181b.p182a.p188w.p191l.C5571a;
import p174e.p181b.p182a.p195z.C5646g;
import p174e.p181b.p182a.p195z.C5647h;

/* renamed from: e.b.a.u.b.a */
public abstract class C5476a implements C5499a.C5501b, C5488k, C5482e {

    /* renamed from: a */
    private final PathMeasure f15390a = new PathMeasure();

    /* renamed from: b */
    private final Path f15391b = new Path();

    /* renamed from: c */
    private final Path f15392c = new Path();

    /* renamed from: d */
    private final RectF f15393d = new RectF();

    /* renamed from: e */
    private final C5442g f15394e;

    /* renamed from: f */
    protected final C5571a f15395f;

    /* renamed from: g */
    private final List<C5478b> f15396g = new ArrayList();

    /* renamed from: h */
    private final float[] f15397h;

    /* renamed from: i */
    final Paint f15398i;

    /* renamed from: j */
    private final C5499a<?, Float> f15399j;

    /* renamed from: k */
    private final C5499a<?, Integer> f15400k;

    /* renamed from: l */
    private final List<C5499a<?, Float>> f15401l;

    /* renamed from: m */
    private final C5499a<?, Float> f15402m;

    /* renamed from: n */
    private C5499a<ColorFilter, ColorFilter> f15403n;

    /* renamed from: e.b.a.u.b.a$b */
    private static final class C5478b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C5491m> f15404a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C5498s f15405b;

        private C5478b(C5498s sVar) {
            this.f15404a = new ArrayList();
            this.f15405b = sVar;
        }
    }

    C5476a(C5442g gVar, C5571a aVar, Paint.Cap cap, Paint.Join join, float f, C5536d dVar, C5534b bVar, List<C5534b> list, C5534b bVar2) {
        C5475a aVar2 = new C5475a(1);
        this.f15398i = aVar2;
        this.f15394e = gVar;
        this.f15395f = aVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f);
        this.f15400k = dVar.mo16693a();
        this.f15399j = bVar.mo16693a();
        this.f15402m = bVar2 == null ? null : bVar2.mo16693a();
        this.f15401l = new ArrayList(list.size());
        this.f15397h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f15401l.add(list.get(i).mo16693a());
        }
        aVar.mo16812j(this.f15400k);
        aVar.mo16812j(this.f15399j);
        for (int i2 = 0; i2 < this.f15401l.size(); i2++) {
            aVar.mo16812j(this.f15401l.get(i2));
        }
        C5499a<?, Float> aVar3 = this.f15402m;
        if (aVar3 != null) {
            aVar.mo16812j(aVar3);
        }
        this.f15400k.mo16606a(this);
        this.f15399j.mo16606a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f15401l.get(i3).mo16606a(this);
        }
        C5499a<?, Float> aVar4 = this.f15402m;
        if (aVar4 != null) {
            aVar4.mo16606a(this);
        }
    }

    /* renamed from: f */
    private void m20381f(Matrix matrix) {
        C5422c.m20179a("StrokeContent#applyDashPattern");
        if (this.f15401l.isEmpty()) {
            C5422c.m20180b("StrokeContent#applyDashPattern");
            return;
        }
        float g = C5647h.m21072g(matrix);
        for (int i = 0; i < this.f15401l.size(); i++) {
            this.f15397h[i] = ((Float) this.f15401l.get(i).mo16612h()).floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f15397h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f15397h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f15397h;
            fArr3[i] = fArr3[i] * g;
        }
        C5499a<?, Float> aVar = this.f15402m;
        this.f15398i.setPathEffect(new DashPathEffect(this.f15397h, aVar == null ? 0.0f : g * aVar.mo16612h().floatValue()));
        C5422c.m20180b("StrokeContent#applyDashPattern");
    }

    /* renamed from: i */
    private void m20382i(Canvas canvas, C5478b bVar, Matrix matrix) {
        float f;
        C5422c.m20179a("StrokeContent#applyTrimPath");
        if (bVar.f15405b == null) {
            C5422c.m20180b("StrokeContent#applyTrimPath");
            return;
        }
        this.f15391b.reset();
        for (int size = bVar.f15404a.size() - 1; size >= 0; size--) {
            this.f15391b.addPath(((C5491m) bVar.f15404a.get(size)).mo16596a(), matrix);
        }
        this.f15390a.setPath(this.f15391b, false);
        float length = this.f15390a.getLength();
        while (this.f15390a.nextContour()) {
            length += this.f15390a.getLength();
        }
        float floatValue = (bVar.f15405b.mo16602h().mo16612h().floatValue() * length) / 360.0f;
        float floatValue2 = ((bVar.f15405b.mo16603i().mo16612h().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((bVar.f15405b.mo16601f().mo16612h().floatValue() * length) / 100.0f) + floatValue;
        float f2 = 0.0f;
        for (int size2 = bVar.f15404a.size() - 1; size2 >= 0; size2--) {
            this.f15392c.set(((C5491m) bVar.f15404a.get(size2)).mo16596a());
            this.f15392c.transform(matrix);
            this.f15390a.setPath(this.f15392c, false);
            float length2 = this.f15390a.getLength();
            float f3 = 1.0f;
            if (floatValue3 > length) {
                float f4 = floatValue3 - length;
                if (f4 < f2 + length2 && f2 < f4) {
                    f = floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f;
                    f3 = Math.min(f4 / length2, 1.0f);
                    C5647h.m21066a(this.f15392c, f, f3, 0.0f);
                    canvas.drawPath(this.f15392c, this.f15398i);
                    f2 += length2;
                }
            }
            float f5 = f2 + length2;
            if (f5 >= floatValue2 && f2 <= floatValue3) {
                if (f5 > floatValue3 || floatValue2 >= f2) {
                    f = floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length2;
                    if (floatValue3 <= f5) {
                        f3 = (floatValue3 - f2) / length2;
                    }
                    C5647h.m21066a(this.f15392c, f, f3, 0.0f);
                }
                canvas.drawPath(this.f15392c, this.f15398i);
            }
            f2 += length2;
        }
        C5422c.m20180b("StrokeContent#applyTrimPath");
    }

    /* renamed from: b */
    public void mo16587b() {
        this.f15394e.invalidateSelf();
    }

    /* renamed from: c */
    public void mo16588c(List<C5480c> list, List<C5480c> list2) {
        C5498s sVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C5480c cVar = list.get(size);
            if (cVar instanceof C5498s) {
                C5498s sVar2 = (C5498s) cVar;
                if (sVar2.mo16604j() == C5569q.C5570a.INDIVIDUALLY) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.mo16600d(this);
        }
        C5478b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            C5480c cVar2 = list2.get(size2);
            if (cVar2 instanceof C5498s) {
                C5498s sVar3 = (C5498s) cVar2;
                if (sVar3.mo16604j() == C5569q.C5570a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f15396g.add(bVar);
                    }
                    bVar = new C5478b(sVar3);
                    sVar3.mo16600d(this);
                }
            }
            if (cVar2 instanceof C5491m) {
                if (bVar == null) {
                    bVar = new C5478b(sVar);
                }
                bVar.f15404a.add((C5491m) cVar2);
            }
        }
        if (bVar != null) {
            this.f15396g.add(bVar);
        }
    }

    /* renamed from: d */
    public void mo16589d(C5528e eVar, int i, List<C5528e> list, C5528e eVar2) {
        C5646g.m21065m(eVar, i, list, eVar2, this);
    }

    /* renamed from: e */
    public void mo16590e(RectF rectF, Matrix matrix, boolean z) {
        C5422c.m20179a("StrokeContent#getBounds");
        this.f15391b.reset();
        for (int i = 0; i < this.f15396g.size(); i++) {
            C5478b bVar = this.f15396g.get(i);
            for (int i2 = 0; i2 < bVar.f15404a.size(); i2++) {
                this.f15391b.addPath(((C5491m) bVar.f15404a.get(i2)).mo16596a(), matrix);
            }
        }
        this.f15391b.computeBounds(this.f15393d, false);
        float p = ((C5507c) this.f15399j).mo16628p();
        RectF rectF2 = this.f15393d;
        float f = p / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f15393d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C5422c.m20180b("StrokeContent#getBounds");
    }

    /* renamed from: g */
    public void mo16591g(Canvas canvas, Matrix matrix, int i) {
        C5422c.m20179a("StrokeContent#draw");
        if (C5647h.m21073h(matrix)) {
            C5422c.m20180b("StrokeContent#draw");
            return;
        }
        this.f15398i.setAlpha(C5646g.m21056d((int) ((((((float) i) / 255.0f) * ((float) ((C5509e) this.f15400k).mo16632p())) / 100.0f) * 255.0f), 0, 255));
        this.f15398i.setStrokeWidth(((C5507c) this.f15399j).mo16628p() * C5647h.m21072g(matrix));
        if (this.f15398i.getStrokeWidth() <= 0.0f) {
            C5422c.m20180b("StrokeContent#draw");
            return;
        }
        m20381f(matrix);
        C5499a<ColorFilter, ColorFilter> aVar = this.f15403n;
        if (aVar != null) {
            this.f15398i.setColorFilter(aVar.mo16612h());
        }
        for (int i2 = 0; i2 < this.f15396g.size(); i2++) {
            C5478b bVar = this.f15396g.get(i2);
            if (bVar.f15405b != null) {
                m20382i(canvas, bVar, matrix);
            } else {
                C5422c.m20179a("StrokeContent#buildPath");
                this.f15391b.reset();
                for (int size = bVar.f15404a.size() - 1; size >= 0; size--) {
                    this.f15391b.addPath(((C5491m) bVar.f15404a.get(size)).mo16596a(), matrix);
                }
                C5422c.m20180b("StrokeContent#buildPath");
                C5422c.m20179a("StrokeContent#drawPath");
                canvas.drawPath(this.f15391b, this.f15398i);
                C5422c.m20180b("StrokeContent#drawPath");
            }
        }
        C5422c.m20180b("StrokeContent#draw");
    }

    /* renamed from: h */
    public <T> void mo16592h(T t, C5419c<T> cVar) {
        C5499a aVar;
        if (t == C5462l.f15287d) {
            aVar = this.f15400k;
        } else if (t == C5462l.f15300q) {
            aVar = this.f15399j;
        } else if (t == C5462l.f15280E) {
            C5499a<ColorFilter, ColorFilter> aVar2 = this.f15403n;
            if (aVar2 != null) {
                this.f15395f.mo16806D(aVar2);
            }
            if (cVar == null) {
                this.f15403n = null;
                return;
            }
            C5520p pVar = new C5520p(cVar);
            this.f15403n = pVar;
            pVar.mo16606a(this);
            this.f15395f.mo16812j(this.f15403n);
            return;
        } else {
            return;
        }
        aVar.mo16618n(cVar);
    }
}
