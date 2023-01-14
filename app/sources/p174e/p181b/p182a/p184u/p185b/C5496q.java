package p174e.p181b.p182a.p184u.p185b;

import android.graphics.Path;
import java.util.List;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p188w.p190k.C5561l;
import p174e.p181b.p182a.p188w.p190k.C5564o;
import p174e.p181b.p182a.p188w.p190k.C5569q;
import p174e.p181b.p182a.p188w.p191l.C5571a;

/* renamed from: e.b.a.u.b.q */
public class C5496q implements C5491m, C5499a.C5501b {

    /* renamed from: a */
    private final Path f15507a = new Path();

    /* renamed from: b */
    private final String f15508b;

    /* renamed from: c */
    private final boolean f15509c;

    /* renamed from: d */
    private final C5442g f15510d;

    /* renamed from: e */
    private final C5499a<?, Path> f15511e;

    /* renamed from: f */
    private boolean f15512f;

    /* renamed from: g */
    private C5479b f15513g = new C5479b();

    public C5496q(C5442g gVar, C5571a aVar, C5564o oVar) {
        this.f15508b = oVar.mo16783b();
        this.f15509c = oVar.mo16785d();
        this.f15510d = gVar;
        C5499a<C5561l, Path> a = oVar.mo16784c().mo16693a();
        this.f15511e = a;
        aVar.mo16812j(a);
        a.mo16606a(this);
    }

    /* renamed from: d */
    private void m20465d() {
        this.f15512f = false;
        this.f15510d.invalidateSelf();
    }

    /* renamed from: a */
    public Path mo16596a() {
        if (this.f15512f) {
            return this.f15507a;
        }
        this.f15507a.reset();
        if (!this.f15509c) {
            this.f15507a.set(this.f15511e.mo16612h());
            this.f15507a.setFillType(Path.FillType.EVEN_ODD);
            this.f15513g.mo16594b(this.f15507a);
        }
        this.f15512f = true;
        return this.f15507a;
    }

    /* renamed from: b */
    public void mo16587b() {
        m20465d();
    }

    /* renamed from: c */
    public void mo16588c(List<C5480c> list, List<C5480c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C5480c cVar = list.get(i);
            if (cVar instanceof C5498s) {
                C5498s sVar = (C5498s) cVar;
                if (sVar.mo16604j() == C5569q.C5570a.SIMULTANEOUSLY) {
                    this.f15513g.mo16593a(sVar);
                    sVar.mo16600d(this);
                }
            }
        }
    }
}
