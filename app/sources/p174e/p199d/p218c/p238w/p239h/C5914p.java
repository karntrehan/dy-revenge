package p174e.p199d.p218c.p238w.p239h;

import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.p238w.p240i.C5933o;

/* renamed from: e.d.c.w.h.p */
public class C5914p extends C5903i<C5915a> {

    /* renamed from: e.d.c.w.h.p$a */
    class C5915a extends C5902h {

        /* renamed from: d */
        int f16453d;

        /* renamed from: e */
        int f16454e;

        /* renamed from: f */
        int f16455f;

        /* renamed from: g */
        int f16456g;

        public C5915a(C5714o oVar) {
            super(oVar);
            oVar.mo17084t(4);
            this.f16453d = oVar.mo17087f();
            this.f16454e = oVar.mo17087f();
            this.f16455f = oVar.mo17087f();
            this.f16456g = oVar.mo17089h();
            oVar.mo17084t(1);
        }
    }

    public C5914p(C5714o oVar, C5894a aVar) {
        super(oVar, aVar);
    }

    /* renamed from: b */
    public void mo17842b(C5933o oVar) {
        boolean z = false;
        C5915a aVar = (C5915a) this.f16414f.get(0);
        oVar.mo17117B(1, (aVar.f16453d & 1) == 1);
        oVar.mo17117B(2, (aVar.f16453d & 2) == 2);
        oVar.mo17117B(3, (aVar.f16453d & 4) == 4);
        if ((aVar.f16453d & 8) == 8) {
            z = true;
        }
        oVar.mo17117B(4, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5915a mo17830a(C5714o oVar) {
        return new C5915a(oVar);
    }
}
