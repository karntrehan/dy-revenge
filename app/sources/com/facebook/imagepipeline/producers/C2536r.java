package com.facebook.imagepipeline.producers;

import java.util.Map;
import p174e.p247e.p293j.C6253c;
import p174e.p247e.p294k.p300d.C6277e;
import p174e.p247e.p294k.p300d.C6283f;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.imagepipeline.producers.r */
public class C2536r implements C2529o0<C6369d> {

    /* renamed from: a */
    private final C6277e f7474a;

    /* renamed from: b */
    private final C6277e f7475b;

    /* renamed from: c */
    private final C6283f f7476c;

    /* renamed from: d */
    private final C2529o0<C6369d> f7477d;

    /* renamed from: com.facebook.imagepipeline.producers.r$b */
    private static class C2538b extends C2530p<C6369d, C6369d> {

        /* renamed from: c */
        private final C2531p0 f7478c;

        /* renamed from: d */
        private final C6277e f7479d;

        /* renamed from: e */
        private final C6277e f7480e;

        /* renamed from: f */
        private final C6283f f7481f;

        private C2538b(C2505l<C6369d> lVar, C2531p0 p0Var, C6277e eVar, C6277e eVar2, C6283f fVar) {
            super(lVar);
            this.f7478c = p0Var;
            this.f7479d = eVar;
            this.f7480e = eVar2;
            this.f7481f = fVar;
        }

        /* renamed from: q */
        public void mo8209i(C6369d dVar, int i) {
            this.f7478c.mo8250p().mo8326e(this.f7478c, "DiskCacheWriteProducer");
            if (!C2459b.m10211f(i) && dVar != null && !C2459b.m10213m(i, 10) && dVar.mo18891W() != C6253c.f17330a) {
                C6384b f = this.f7478c.mo8240f();
                (f.mo18921c() == C6384b.C6386b.SMALL ? this.f7480e : this.f7479d).mo18598p(this.f7481f.mo18610d(f, this.f7478c.mo8237c()), dVar);
            }
            this.f7478c.mo8250p().mo8328j(this.f7478c, "DiskCacheWriteProducer", (Map<String, String>) null);
            mo8320p().mo8223d(dVar, i);
        }
    }

    public C2536r(C6277e eVar, C6277e eVar2, C6283f fVar, C2529o0<C6369d> o0Var) {
        this.f7474a = eVar;
        this.f7475b = eVar2;
        this.f7476c = fVar;
        this.f7477d = o0Var;
    }

    /* renamed from: c */
    private void m10582c(C2505l<C6369d> lVar, C2531p0 p0Var) {
        if (p0Var.mo8252r().mo18945g() >= C6384b.C6387c.DISK_CACHE.mo18945g()) {
            p0Var.mo8244j("disk", "nil-result_write");
            lVar.mo8223d(null, 1);
            return;
        }
        if (p0Var.mo8240f().mo18941u()) {
            lVar = new C2538b(lVar, p0Var, this.f7474a, this.f7475b, this.f7476c);
        }
        this.f7477d.mo8198b(lVar, p0Var);
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6369d> lVar, C2531p0 p0Var) {
        m10582c(lVar, p0Var);
    }
}
