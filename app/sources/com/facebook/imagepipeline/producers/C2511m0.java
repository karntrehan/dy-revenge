package com.facebook.imagepipeline.producers;

import java.util.Map;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p257d.C6055g;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p300d.C6283f;
import p174e.p247e.p294k.p300d.C6304s;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p311o.C6384b;
import p174e.p247e.p294k.p311o.C6390d;
import p174e.p247e.p294k.p311o.C6391e;

/* renamed from: com.facebook.imagepipeline.producers.m0 */
public class C2511m0 implements C2529o0<C6088a<C6367b>> {

    /* renamed from: a */
    private final C6304s<C5999d, C6367b> f7399a;

    /* renamed from: b */
    private final C6283f f7400b;

    /* renamed from: c */
    private final C2529o0<C6088a<C6367b>> f7401c;

    /* renamed from: com.facebook.imagepipeline.producers.m0$a */
    public static class C2512a extends C2530p<C6088a<C6367b>, C6088a<C6367b>> {

        /* renamed from: c */
        private final C5999d f7402c;

        /* renamed from: d */
        private final boolean f7403d;

        /* renamed from: e */
        private final C6304s<C5999d, C6367b> f7404e;

        /* renamed from: f */
        private final boolean f7405f;

        public C2512a(C2505l<C6088a<C6367b>> lVar, C5999d dVar, boolean z, C6304s<C5999d, C6367b> sVar, boolean z2) {
            super(lVar);
            this.f7402c = dVar;
            this.f7403d = z;
            this.f7404e = sVar;
            this.f7405f = z2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void mo8209i(C6088a<C6367b> aVar, int i) {
            C6088a<C6367b> aVar2 = null;
            if (aVar == null) {
                if (C2459b.m10210e(i)) {
                    mo8320p().mo8223d(aVar2, i);
                }
            } else if (!C2459b.m10211f(i) || this.f7403d) {
                if (this.f7405f) {
                    aVar2 = this.f7404e.mo18647c(this.f7402c, aVar);
                }
                try {
                    mo8320p().mo8222c(1.0f);
                    C2505l p = mo8320p();
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                    p.mo8223d(aVar, i);
                } finally {
                    C6088a.m22949v0(aVar2);
                }
            }
        }
    }

    public C2511m0(C6304s<C5999d, C6367b> sVar, C6283f fVar, C2529o0<C6088a<C6367b>> o0Var) {
        this.f7399a = sVar;
        this.f7400b = fVar;
        this.f7401c = o0Var;
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6088a<C6367b>> lVar, C2531p0 p0Var) {
        C2539r0 p = p0Var.mo8250p();
        C6384b f = p0Var.mo8240f();
        Object c = p0Var.mo8237c();
        C6390d h = f.mo18927h();
        if (h == null || h.mo9953c() == null) {
            this.f7401c.mo8198b(lVar, p0Var);
            return;
        }
        p.mo8326e(p0Var, mo8309c());
        C5999d c2 = this.f7400b.mo18609c(f, c);
        C6088a<C6367b> aVar = this.f7399a.get(c2);
        Map map = null;
        if (aVar != null) {
            String c3 = mo8309c();
            if (p.mo8327g(p0Var, mo8309c())) {
                map = C6055g.m22821of("cached_value_found", "true");
            }
            p.mo8328j(p0Var, c3, map);
            p.mo8324c(p0Var, "PostprocessedBitmapMemoryCacheProducer", true);
            p0Var.mo8244j("memory_bitmap", "postprocessed");
            lVar.mo8222c(1.0f);
            lVar.mo8223d(aVar, 1);
            aVar.close();
            return;
        }
        C2505l<C6088a<C6367b>> lVar2 = lVar;
        C2512a aVar2 = new C2512a(lVar2, c2, h instanceof C6391e, this.f7399a, p0Var.mo8240f().mo18942v());
        String c4 = mo8309c();
        if (p.mo8327g(p0Var, mo8309c())) {
            map = C6055g.m22821of("cached_value_found", "false");
        }
        p.mo8328j(p0Var, c4, map);
        this.f7401c.mo8198b(aVar2, p0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo8309c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
