package com.facebook.imagepipeline.producers;

import java.util.Map;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p257d.C6055g;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p300d.C6283f;
import p174e.p247e.p294k.p300d.C6304s;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p307k.C6371f;
import p174e.p247e.p294k.p307k.C6374i;
import p174e.p247e.p294k.p311o.C6384b;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: com.facebook.imagepipeline.producers.h */
public class C2484h implements C2529o0<C6088a<C6367b>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6304s<C5999d, C6367b> f7323a;

    /* renamed from: b */
    private final C6283f f7324b;

    /* renamed from: c */
    private final C2529o0<C6088a<C6367b>> f7325c;

    /* renamed from: com.facebook.imagepipeline.producers.h$a */
    class C2485a extends C2530p<C6088a<C6367b>, C6088a<C6367b>> {

        /* renamed from: c */
        final /* synthetic */ C5999d f7326c;

        /* renamed from: d */
        final /* synthetic */ boolean f7327d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2485a(C2505l lVar, C5999d dVar, boolean z) {
            super(lVar);
            this.f7326c = dVar;
            this.f7327d = z;
        }

        /* renamed from: q */
        public void mo8209i(C6088a<C6367b> aVar, int i) {
            C6088a<V> aVar2;
            C6088a aVar3;
            try {
                if (C6394b.m24481d()) {
                    C6394b.m24478a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean e = C2459b.m10210e(i);
                aVar2 = null;
                if (aVar == null) {
                    if (e) {
                        mo8320p().mo8223d(null, i);
                    }
                    if (C6394b.m24481d()) {
                        C6394b.m24479b();
                        return;
                    }
                    return;
                }
                if (!aVar.mo18082w0().mo18875o()) {
                    if (!C2459b.m10214n(i, 8)) {
                        if (!e && (aVar3 = C2484h.this.f7323a.get(this.f7326c)) != null) {
                            C6374i a = aVar.mo18082w0().mo18870a();
                            C6374i a2 = ((C6367b) aVar3.mo18082w0()).mo18870a();
                            if (a2.mo18907a() || a2.mo18909c() >= a.mo18909c()) {
                                mo8320p().mo8223d(aVar3, i);
                                C6088a.m22949v0(aVar3);
                                if (C6394b.m24481d()) {
                                    C6394b.m24479b();
                                    return;
                                }
                                return;
                            }
                            C6088a.m22949v0(aVar3);
                        }
                        if (this.f7327d) {
                            aVar2 = C2484h.this.f7323a.mo18647c(this.f7326c, aVar);
                        }
                        if (e) {
                            mo8320p().mo8222c(1.0f);
                        }
                        C2505l p = mo8320p();
                        if (aVar2 != null) {
                            aVar = aVar2;
                        }
                        p.mo8223d(aVar, i);
                        C6088a.m22949v0(aVar2);
                        if (C6394b.m24481d()) {
                            C6394b.m24479b();
                            return;
                        }
                        return;
                    }
                }
                mo8320p().mo8223d(aVar, i);
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

    public C2484h(C6304s<C5999d, C6367b> sVar, C6283f fVar, C2529o0<C6088a<C6367b>> o0Var) {
        this.f7323a = sVar;
        this.f7324b = fVar;
        this.f7325c = o0Var;
    }

    /* renamed from: f */
    private static void m10333f(C6371f fVar, C2531p0 p0Var) {
        p0Var.mo8245k(fVar.mo15980b());
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6088a<C6367b>> lVar, C2531p0 p0Var) {
        boolean d;
        try {
            if (C6394b.m24481d()) {
                C6394b.m24478a("BitmapMemoryCacheProducer#produceResults");
            }
            C2539r0 p = p0Var.mo8250p();
            p.mo8326e(p0Var, mo8265e());
            C5999d a = this.f7324b.mo18607a(p0Var.mo8240f(), p0Var.mo8237c());
            C6088a<C6367b> aVar = this.f7323a.get(a);
            Map map = null;
            if (aVar != null) {
                m10333f(aVar.mo18082w0(), p0Var);
                boolean a2 = aVar.mo18082w0().mo18870a().mo18907a();
                if (a2) {
                    p.mo8328j(p0Var, mo8265e(), p.mo8327g(p0Var, mo8265e()) ? C6055g.m22821of("cached_value_found", "true") : null);
                    p.mo8324c(p0Var, mo8265e(), true);
                    p0Var.mo8244j("memory_bitmap", mo8264d());
                    lVar.mo8222c(1.0f);
                }
                lVar.mo8223d(aVar, C2459b.m10212l(a2));
                aVar.close();
                if (a2) {
                    if (!d) {
                        return;
                    }
                    return;
                }
            }
            if (p0Var.mo8252r().mo18945g() >= C6384b.C6387c.BITMAP_MEMORY_CACHE.mo18945g()) {
                p.mo8328j(p0Var, mo8265e(), p.mo8327g(p0Var, mo8265e()) ? C6055g.m22821of("cached_value_found", "false") : null);
                p.mo8324c(p0Var, mo8265e(), false);
                p0Var.mo8244j("memory_bitmap", mo8264d());
                lVar.mo8223d(null, 1);
                if (C6394b.m24481d()) {
                    C6394b.m24479b();
                    return;
                }
                return;
            }
            C2505l<C6088a<C6367b>> g = mo8266g(lVar, a, p0Var.mo8240f().mo18942v());
            String e = mo8265e();
            if (p.mo8327g(p0Var, mo8265e())) {
                map = C6055g.m22821of("cached_value_found", "false");
            }
            p.mo8328j(p0Var, e, map);
            if (C6394b.m24481d()) {
                C6394b.m24478a("mInputProducer.produceResult");
            }
            this.f7325c.mo8198b(g, p0Var);
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
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
    /* renamed from: d */
    public String mo8264d() {
        return "pipe_bg";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo8265e() {
        return "BitmapMemoryCacheProducer";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C2505l<C6088a<C6367b>> mo8266g(C2505l<C6088a<C6367b>> lVar, C5999d dVar, boolean z) {
        return new C2485a(lVar, dVar, z);
    }
}
