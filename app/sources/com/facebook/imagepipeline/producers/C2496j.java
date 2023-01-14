package com.facebook.imagepipeline.producers;

import java.util.Map;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p300d.C6276d;
import p174e.p247e.p294k.p300d.C6277e;
import p174e.p247e.p294k.p300d.C6283f;
import p174e.p247e.p294k.p300d.C6304s;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p311o.C6384b;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: com.facebook.imagepipeline.producers.j */
public class C2496j implements C2529o0<C6088a<C6367b>> {

    /* renamed from: a */
    private final C6304s<C5999d, C6082g> f7359a;

    /* renamed from: b */
    private final C6277e f7360b;

    /* renamed from: c */
    private final C6277e f7361c;

    /* renamed from: d */
    private final C6283f f7362d;

    /* renamed from: e */
    private final C2529o0<C6088a<C6367b>> f7363e;

    /* renamed from: f */
    private final C6276d<C5999d> f7364f;

    /* renamed from: g */
    private final C6276d<C5999d> f7365g;

    /* renamed from: com.facebook.imagepipeline.producers.j$a */
    private static class C2497a extends C2530p<C6088a<C6367b>, C6088a<C6367b>> {

        /* renamed from: c */
        private final C2531p0 f7366c;

        /* renamed from: d */
        private final C6304s<C5999d, C6082g> f7367d;

        /* renamed from: e */
        private final C6277e f7368e;

        /* renamed from: f */
        private final C6277e f7369f;

        /* renamed from: g */
        private final C6283f f7370g;

        /* renamed from: h */
        private final C6276d<C5999d> f7371h;

        /* renamed from: i */
        private final C6276d<C5999d> f7372i;

        public C2497a(C2505l<C6088a<C6367b>> lVar, C2531p0 p0Var, C6304s<C5999d, C6082g> sVar, C6277e eVar, C6277e eVar2, C6283f fVar, C6276d<C5999d> dVar, C6276d<C5999d> dVar2) {
            super(lVar);
            this.f7366c = p0Var;
            this.f7367d = sVar;
            this.f7368e = eVar;
            this.f7369f = eVar2;
            this.f7370g = fVar;
            this.f7371h = dVar;
            this.f7372i = dVar2;
        }

        /* renamed from: q */
        public void mo8209i(C6088a<C6367b> aVar, int i) {
            try {
                if (C6394b.m24481d()) {
                    C6394b.m24478a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!C2459b.m10211f(i) && aVar != null) {
                    if (!C2459b.m10213m(i, 8)) {
                        C6384b f = this.f7366c.mo8240f();
                        C5999d d = this.f7370g.mo18610d(f, this.f7366c.mo8237c());
                        String str = (String) this.f7366c.mo8247m("origin");
                        if (str != null && str.equals("memory_bitmap")) {
                            if (this.f7366c.mo8242h().mo18733D().mo18788r() && !this.f7371h.mo18592b(d)) {
                                this.f7367d.mo18646b(d);
                                this.f7371h.mo18591a(d);
                            }
                            if (this.f7366c.mo8242h().mo18733D().mo18786p() && !this.f7372i.mo18592b(d)) {
                                (f.mo18921c() == C6384b.C6386b.SMALL ? this.f7369f : this.f7368e).mo18593h(d);
                                this.f7372i.mo18591a(d);
                            }
                        }
                        mo8320p().mo8223d(aVar, i);
                        if (C6394b.m24481d()) {
                            C6394b.m24479b();
                            return;
                        }
                        return;
                    }
                }
                mo8320p().mo8223d(aVar, i);
            } finally {
                if (C6394b.m24481d()) {
                    C6394b.m24479b();
                }
            }
        }
    }

    public C2496j(C6304s<C5999d, C6082g> sVar, C6277e eVar, C6277e eVar2, C6283f fVar, C6276d<C5999d> dVar, C6276d<C5999d> dVar2, C2529o0<C6088a<C6367b>> o0Var) {
        this.f7359a = sVar;
        this.f7360b = eVar;
        this.f7361c = eVar2;
        this.f7362d = fVar;
        this.f7364f = dVar;
        this.f7365g = dVar2;
        this.f7363e = o0Var;
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6088a<C6367b>> lVar, C2531p0 p0Var) {
        try {
            if (C6394b.m24481d()) {
                C6394b.m24478a("BitmapProbeProducer#produceResults");
            }
            C2539r0 p = p0Var.mo8250p();
            p.mo8326e(p0Var, mo8292c());
            C2497a aVar = new C2497a(lVar, p0Var, this.f7359a, this.f7360b, this.f7361c, this.f7362d, this.f7364f, this.f7365g);
            p.mo8328j(p0Var, "BitmapProbeProducer", (Map<String, String>) null);
            if (C6394b.m24481d()) {
                C6394b.m24478a("mInputProducer.produceResult");
            }
            this.f7363e.mo8198b(aVar, p0Var);
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        } finally {
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo8292c() {
        return "BitmapProbeProducer";
    }
}
