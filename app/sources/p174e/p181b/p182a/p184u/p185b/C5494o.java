package p174e.p181b.p182a.p184u.p185b;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.C5462l;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p184u.p186c.C5507c;
import p174e.p181b.p182a.p188w.C5528e;
import p174e.p181b.p182a.p188w.p190k.C5559j;
import p174e.p181b.p182a.p188w.p190k.C5569q;
import p174e.p181b.p182a.p188w.p191l.C5571a;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.u.b.o */
public class C5494o implements C5499a.C5501b, C5488k, C5491m {

    /* renamed from: a */
    private final Path f15487a = new Path();

    /* renamed from: b */
    private final RectF f15488b = new RectF();

    /* renamed from: c */
    private final String f15489c;

    /* renamed from: d */
    private final boolean f15490d;

    /* renamed from: e */
    private final C5442g f15491e;

    /* renamed from: f */
    private final C5499a<?, PointF> f15492f;

    /* renamed from: g */
    private final C5499a<?, PointF> f15493g;

    /* renamed from: h */
    private final C5499a<?, Float> f15494h;

    /* renamed from: i */
    private C5479b f15495i = new C5479b();

    /* renamed from: j */
    private boolean f15496j;

    public C5494o(C5442g gVar, C5571a aVar, C5559j jVar) {
        this.f15489c = jVar.mo16758c();
        this.f15490d = jVar.mo16761f();
        this.f15491e = gVar;
        C5499a<PointF, PointF> a = jVar.mo16759d().mo16693a();
        this.f15492f = a;
        C5499a<PointF, PointF> a2 = jVar.mo16760e().mo16693a();
        this.f15493g = a2;
        C5499a<Float, Float> a3 = jVar.mo16757b().mo16693a();
        this.f15494h = a3;
        aVar.mo16812j(a);
        aVar.mo16812j(a2);
        aVar.mo16812j(a3);
        a.mo16606a(this);
        a2.mo16606a(this);
        a3.mo16606a(this);
    }

    /* renamed from: f */
    private void m20451f() {
        this.f15496j = false;
        this.f15491e.invalidateSelf();
    }

    /* renamed from: a */
    public Path mo16596a() {
        if (this.f15496j) {
            return this.f15487a;
        }
        this.f15487a.reset();
        if (!this.f15490d) {
            PointF h = this.f15493g.mo16612h();
            float f = h.x / 2.0f;
            float f2 = h.y / 2.0f;
            C5499a<?, Float> aVar = this.f15494h;
            float p = aVar == null ? 0.0f : ((C5507c) aVar).mo16628p();
            float min = Math.min(f, f2);
            if (p > min) {
                p = min;
            }
            PointF h2 = this.f15492f.mo16612h();
            this.f15487a.moveTo(h2.x + f, (h2.y - f2) + p);
            this.f15487a.lineTo(h2.x + f, (h2.y + f2) - p);
            int i = (p > 0.0f ? 1 : (p == 0.0f ? 0 : -1));
            if (i > 0) {
                RectF rectF = this.f15488b;
                float f3 = h2.x;
                float f4 = p * 2.0f;
                float f5 = h2.y;
                rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
                this.f15487a.arcTo(this.f15488b, 0.0f, 90.0f, false);
            }
            this.f15487a.lineTo((h2.x - f) + p, h2.y + f2);
            if (i > 0) {
                RectF rectF2 = this.f15488b;
                float f6 = h2.x;
                float f7 = h2.y;
                float f8 = p * 2.0f;
                rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
                this.f15487a.arcTo(this.f15488b, 90.0f, 90.0f, false);
            }
            this.f15487a.lineTo(h2.x - f, (h2.y - f2) + p);
            if (i > 0) {
                RectF rectF3 = this.f15488b;
                float f9 = h2.x;
                float f10 = h2.y;
                float f11 = p * 2.0f;
                rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
                this.f15487a.arcTo(this.f15488b, 180.0f, 90.0f, false);
            }
            this.f15487a.lineTo((h2.x + f) - p, h2.y - f2);
            if (i > 0) {
                RectF rectF4 = this.f15488b;
                float f12 = h2.x;
                float f13 = p * 2.0f;
                float f14 = h2.y;
                rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
                this.f15487a.arcTo(this.f15488b, 270.0f, 90.0f, false);
            }
            this.f15487a.close();
            this.f15495i.mo16594b(this.f15487a);
        }
        this.f15496j = true;
        return this.f15487a;
    }

    /* renamed from: b */
    public void mo16587b() {
        m20451f();
    }

    /* renamed from: c */
    public void mo16588c(List<C5480c> list, List<C5480c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C5480c cVar = list.get(i);
            if (cVar instanceof C5498s) {
                C5498s sVar = (C5498s) cVar;
                if (sVar.mo16604j() == C5569q.C5570a.SIMULTANEOUSLY) {
                    this.f15495i.mo16593a(sVar);
                    sVar.mo16600d(this);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo16589d(C5528e eVar, int i, List<C5528e> list, C5528e eVar2) {
        C5646g.m21065m(eVar, i, list, eVar2, this);
    }

    public String getName() {
        return this.f15489c;
    }

    /* renamed from: h */
    public <T> void mo16592h(T t, C5419c<T> cVar) {
        C5499a aVar;
        if (t == C5462l.f15293j) {
            aVar = this.f15493g;
        } else if (t == C5462l.f15295l) {
            aVar = this.f15492f;
        } else if (t == C5462l.f15294k) {
            aVar = this.f15494h;
        } else {
            return;
        }
        aVar.mo16618n(cVar);
    }
}
