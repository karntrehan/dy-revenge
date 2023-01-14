package p174e.p181b.p182a.p184u.p185b;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.C5462l;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p188w.C5528e;
import p174e.p181b.p182a.p188w.p190k.C5547a;
import p174e.p181b.p182a.p188w.p190k.C5569q;
import p174e.p181b.p182a.p188w.p191l.C5571a;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.u.b.f */
public class C5483f implements C5491m, C5499a.C5501b, C5488k {

    /* renamed from: a */
    private final Path f15418a = new Path();

    /* renamed from: b */
    private final String f15419b;

    /* renamed from: c */
    private final C5442g f15420c;

    /* renamed from: d */
    private final C5499a<?, PointF> f15421d;

    /* renamed from: e */
    private final C5499a<?, PointF> f15422e;

    /* renamed from: f */
    private final C5547a f15423f;

    /* renamed from: g */
    private C5479b f15424g = new C5479b();

    /* renamed from: h */
    private boolean f15425h;

    public C5483f(C5442g gVar, C5571a aVar, C5547a aVar2) {
        this.f15419b = aVar2.mo16709b();
        this.f15420c = gVar;
        C5499a<PointF, PointF> a = aVar2.mo16711d().mo16693a();
        this.f15421d = a;
        C5499a<PointF, PointF> a2 = aVar2.mo16710c().mo16693a();
        this.f15422e = a2;
        this.f15423f = aVar2;
        aVar.mo16812j(a);
        aVar.mo16812j(a2);
        a.mo16606a(this);
        a2.mo16606a(this);
    }

    /* renamed from: f */
    private void m20408f() {
        this.f15425h = false;
        this.f15420c.invalidateSelf();
    }

    /* renamed from: a */
    public Path mo16596a() {
        if (this.f15425h) {
            return this.f15418a;
        }
        this.f15418a.reset();
        if (!this.f15423f.mo16712e()) {
            PointF h = this.f15421d.mo16612h();
            float f = h.x / 2.0f;
            float f2 = h.y / 2.0f;
            float f3 = f * 0.55228f;
            float f4 = 0.55228f * f2;
            this.f15418a.reset();
            if (this.f15423f.mo16713f()) {
                float f5 = -f2;
                this.f15418a.moveTo(0.0f, f5);
                float f6 = 0.0f - f3;
                float f7 = -f;
                float f8 = 0.0f - f4;
                this.f15418a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
                float f9 = f4 + 0.0f;
                float f10 = f5;
                this.f15418a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
                float f11 = f3 + 0.0f;
                this.f15418a.cubicTo(f11, f2, f, f9, f, 0.0f);
                this.f15418a.cubicTo(f, f8, f11, f10, 0.0f, f10);
            } else {
                float f12 = -f2;
                this.f15418a.moveTo(0.0f, f12);
                float f13 = f3 + 0.0f;
                float f14 = 0.0f - f4;
                this.f15418a.cubicTo(f13, f12, f, f14, f, 0.0f);
                float f15 = f4 + 0.0f;
                this.f15418a.cubicTo(f, f15, f13, f2, 0.0f, f2);
                float f16 = 0.0f - f3;
                float f17 = -f;
                this.f15418a.cubicTo(f16, f2, f17, f15, f17, 0.0f);
                float f18 = f12;
                this.f15418a.cubicTo(f17, f14, f16, f18, 0.0f, f18);
            }
            PointF h2 = this.f15422e.mo16612h();
            this.f15418a.offset(h2.x, h2.y);
            this.f15418a.close();
            this.f15424g.mo16594b(this.f15418a);
        }
        this.f15425h = true;
        return this.f15418a;
    }

    /* renamed from: b */
    public void mo16587b() {
        m20408f();
    }

    /* renamed from: c */
    public void mo16588c(List<C5480c> list, List<C5480c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C5480c cVar = list.get(i);
            if (cVar instanceof C5498s) {
                C5498s sVar = (C5498s) cVar;
                if (sVar.mo16604j() == C5569q.C5570a.SIMULTANEOUSLY) {
                    this.f15424g.mo16593a(sVar);
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
        return this.f15419b;
    }

    /* renamed from: h */
    public <T> void mo16592h(T t, C5419c<T> cVar) {
        C5499a<?, PointF> aVar;
        if (t == C5462l.f15292i) {
            aVar = this.f15421d;
        } else if (t == C5462l.f15295l) {
            aVar = this.f15422e;
        } else {
            return;
        }
        aVar.mo16618n(cVar);
    }
}
