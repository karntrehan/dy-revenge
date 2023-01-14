package com.facebook.imagepipeline.producers;

import java.util.Map;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p257d.C6055g;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p293j.C6253c;
import p174e.p247e.p294k.p300d.C6283f;
import p174e.p247e.p294k.p300d.C6304s;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: com.facebook.imagepipeline.producers.t */
public class C2542t implements C2529o0<C6369d> {

    /* renamed from: a */
    private final C6304s<C5999d, C6082g> f7483a;

    /* renamed from: b */
    private final C6283f f7484b;

    /* renamed from: c */
    private final C2529o0<C6369d> f7485c;

    /* renamed from: com.facebook.imagepipeline.producers.t$a */
    private static class C2543a extends C2530p<C6369d, C6369d> {

        /* renamed from: c */
        private final C6304s<C5999d, C6082g> f7486c;

        /* renamed from: d */
        private final C5999d f7487d;

        /* renamed from: e */
        private final boolean f7488e;

        /* renamed from: f */
        private final boolean f7489f;

        public C2543a(C2505l<C6369d> lVar, C6304s<C5999d, C6082g> sVar, C5999d dVar, boolean z, boolean z2) {
            super(lVar);
            this.f7486c = sVar;
            this.f7487d = dVar;
            this.f7488e = z;
            this.f7489f = z2;
        }

        /* renamed from: q */
        public void mo8209i(C6369d dVar, int i) {
            C6088a<C6082g> r;
            C6088a<C6082g> aVar;
            C6369d dVar2;
            try {
                if (C6394b.m24481d()) {
                    C6394b.m24478a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!C2459b.m10211f(i) && dVar != null && !C2459b.m10213m(i, 10)) {
                    if (dVar.mo18891W() != C6253c.f17330a) {
                        r = dVar.mo18901r();
                        if (r != null) {
                            aVar = null;
                            if (this.f7489f && this.f7488e) {
                                aVar = this.f7486c.mo18647c(this.f7487d, r);
                            }
                            C6088a.m22949v0(r);
                            if (aVar != null) {
                                dVar2 = new C6369d(aVar);
                                dVar2.mo18900o(dVar);
                                C6088a.m22949v0(aVar);
                                mo8320p().mo8222c(1.0f);
                                mo8320p().mo8223d(dVar2, i);
                                C6369d.m24309h(dVar2);
                                if (C6394b.m24481d()) {
                                    C6394b.m24479b();
                                    return;
                                }
                                return;
                            }
                        }
                        mo8320p().mo8223d(dVar, i);
                        if (C6394b.m24481d()) {
                            C6394b.m24479b();
                            return;
                        }
                        return;
                    }
                }
                mo8320p().mo8223d(dVar, i);
                if (C6394b.m24481d()) {
                    C6394b.m24479b();
                }
            } catch (Throwable th) {
                if (C6394b.m24481d()) {
                    C6394b.m24479b();
                }
                throw th;
            }
        }
    }

    public C2542t(C6304s<C5999d, C6082g> sVar, C6283f fVar, C2529o0<C6369d> o0Var) {
        this.f7483a = sVar;
        this.f7484b = fVar;
        this.f7485c = o0Var;
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6369d> lVar, C2531p0 p0Var) {
        C6369d dVar;
        C2505l<C6369d> lVar2 = lVar;
        C2531p0 p0Var2 = p0Var;
        try {
            if (C6394b.m24481d()) {
                C6394b.m24478a("EncodedMemoryCacheProducer#produceResults");
            }
            C2539r0 p = p0Var.mo8250p();
            p.mo8326e(p0Var2, "EncodedMemoryCacheProducer");
            C5999d d = this.f7484b.mo18610d(p0Var.mo8240f(), p0Var.mo8237c());
            C6088a<C6082g> aVar = this.f7483a.get(d);
            Map map = null;
            if (aVar != null) {
                try {
                    dVar = new C6369d(aVar);
                    if (p.mo8327g(p0Var2, "EncodedMemoryCacheProducer")) {
                        map = C6055g.m22821of("cached_value_found", "true");
                    }
                    p.mo8328j(p0Var2, "EncodedMemoryCacheProducer", map);
                    p.mo8324c(p0Var2, "EncodedMemoryCacheProducer", true);
                    p0Var2.mo8249o("memory_encoded");
                    lVar2.mo8222c(1.0f);
                    lVar2.mo8223d(dVar, 1);
                    C6369d.m24309h(dVar);
                    C6088a.m22949v0(aVar);
                } catch (Throwable th) {
                    C6088a.m22949v0(aVar);
                    throw th;
                }
            } else if (p0Var.mo8252r().mo18945g() >= C6384b.C6387c.ENCODED_MEMORY_CACHE.mo18945g()) {
                p.mo8328j(p0Var2, "EncodedMemoryCacheProducer", p.mo8327g(p0Var2, "EncodedMemoryCacheProducer") ? C6055g.m22821of("cached_value_found", "false") : null);
                p.mo8324c(p0Var2, "EncodedMemoryCacheProducer", false);
                p0Var2.mo8244j("memory_encoded", "nil-result");
                lVar2.mo8223d(null, 1);
                C6088a.m22949v0(aVar);
                if (C6394b.m24481d()) {
                    C6394b.m24479b();
                }
            } else {
                C2543a aVar2 = new C2543a(lVar, this.f7483a, d, p0Var.mo8240f().mo18942v(), p0Var.mo8242h().mo18733D().mo18787q());
                if (p.mo8327g(p0Var2, "EncodedMemoryCacheProducer")) {
                    map = C6055g.m22821of("cached_value_found", "false");
                }
                p.mo8328j(p0Var2, "EncodedMemoryCacheProducer", map);
                this.f7485c.mo8198b(aVar2, p0Var2);
                C6088a.m22949v0(aVar);
                if (C6394b.m24481d()) {
                    C6394b.m24479b();
                }
            }
        } finally {
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
    }
}
