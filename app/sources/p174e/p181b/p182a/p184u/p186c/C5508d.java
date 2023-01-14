package p174e.p181b.p182a.p184u.p186c;

import java.util.List;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p188w.p190k.C5549c;

/* renamed from: e.b.a.u.c.d */
public class C5508d extends C5510f<C5549c> {

    /* renamed from: i */
    private final C5549c f15540i;

    public C5508d(List<C5417a<C5549c>> list) {
        super(list);
        int i = 0;
        C5549c cVar = (C5549c) list.get(0).f15114b;
        i = cVar != null ? cVar.mo16716c() : i;
        this.f15540i = new C5549c(new float[i], new int[i]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C5549c mo16613i(C5417a<C5549c> aVar, float f) {
        this.f15540i.mo16717d((C5549c) aVar.f15114b, (C5549c) aVar.f15115c, f);
        return this.f15540i;
    }
}
