package p174e.p199d.p218c.p238w.p239h;

import java.util.ArrayList;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.p238w.p239h.C5902h;

/* renamed from: e.d.c.w.h.i */
public abstract class C5903i<T extends C5902h> extends C5896c {

    /* renamed from: e */
    long f16413e;

    /* renamed from: f */
    ArrayList<T> f16414f = new ArrayList<>((int) this.f16413e);

    public C5903i(C5714o oVar, C5894a aVar) {
        super(oVar, aVar);
        this.f16413e = oVar.mo17097q();
        for (int i = 0; ((long) i) < this.f16413e; i++) {
            this.f16414f.add(mo17830a(oVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo17830a(C5714o oVar);
}
