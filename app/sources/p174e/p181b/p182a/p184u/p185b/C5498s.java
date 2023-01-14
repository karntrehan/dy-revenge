package p174e.p181b.p182a.p184u.p185b;

import java.util.ArrayList;
import java.util.List;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p188w.p190k.C5569q;
import p174e.p181b.p182a.p188w.p191l.C5571a;

/* renamed from: e.b.a.u.b.s */
public class C5498s implements C5480c, C5499a.C5501b {

    /* renamed from: a */
    private final String f15519a;

    /* renamed from: b */
    private final boolean f15520b;

    /* renamed from: c */
    private final List<C5499a.C5501b> f15521c = new ArrayList();

    /* renamed from: d */
    private final C5569q.C5570a f15522d;

    /* renamed from: e */
    private final C5499a<?, Float> f15523e;

    /* renamed from: f */
    private final C5499a<?, Float> f15524f;

    /* renamed from: g */
    private final C5499a<?, Float> f15525g;

    public C5498s(C5571a aVar, C5569q qVar) {
        this.f15519a = qVar.mo16800c();
        this.f15520b = qVar.mo16804g();
        this.f15522d = qVar.mo16803f();
        C5499a<Float, Float> a = qVar.mo16802e().mo16693a();
        this.f15523e = a;
        C5499a<Float, Float> a2 = qVar.mo16799b().mo16693a();
        this.f15524f = a2;
        C5499a<Float, Float> a3 = qVar.mo16801d().mo16693a();
        this.f15525g = a3;
        aVar.mo16812j(a);
        aVar.mo16812j(a2);
        aVar.mo16812j(a3);
        a.mo16606a(this);
        a2.mo16606a(this);
        a3.mo16606a(this);
    }

    /* renamed from: b */
    public void mo16587b() {
        for (int i = 0; i < this.f15521c.size(); i++) {
            this.f15521c.get(i).mo16587b();
        }
    }

    /* renamed from: c */
    public void mo16588c(List<C5480c> list, List<C5480c> list2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo16600d(C5499a.C5501b bVar) {
        this.f15521c.add(bVar);
    }

    /* renamed from: f */
    public C5499a<?, Float> mo16601f() {
        return this.f15524f;
    }

    /* renamed from: h */
    public C5499a<?, Float> mo16602h() {
        return this.f15525g;
    }

    /* renamed from: i */
    public C5499a<?, Float> mo16603i() {
        return this.f15523e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C5569q.C5570a mo16604j() {
        return this.f15522d;
    }

    /* renamed from: k */
    public boolean mo16605k() {
        return this.f15520b;
    }
}
