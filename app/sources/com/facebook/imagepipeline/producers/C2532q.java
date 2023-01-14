package com.facebook.imagepipeline.producers;

import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p173d.C5366d;
import p173d.C5368f;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p257d.C6055g;
import p174e.p247e.p294k.p300d.C6277e;
import p174e.p247e.p294k.p300d.C6283f;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.imagepipeline.producers.q */
public class C2532q implements C2529o0<C6369d> {

    /* renamed from: a */
    private final C6277e f7464a;

    /* renamed from: b */
    private final C6277e f7465b;

    /* renamed from: c */
    private final C6283f f7466c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2529o0<C6369d> f7467d;

    /* renamed from: com.facebook.imagepipeline.producers.q$a */
    class C2533a implements C5366d<C6369d, Void> {

        /* renamed from: a */
        final /* synthetic */ C2539r0 f7468a;

        /* renamed from: b */
        final /* synthetic */ C2531p0 f7469b;

        /* renamed from: c */
        final /* synthetic */ C2505l f7470c;

        C2533a(C2539r0 r0Var, C2531p0 p0Var, C2505l lVar) {
            this.f7468a = r0Var;
            this.f7469b = p0Var;
            this.f7470c = lVar;
        }

        /* renamed from: b */
        public Void mo8306a(C5368f<C6369d> fVar) {
            if (C2532q.m10570f(fVar)) {
                this.f7468a.mo8325d(this.f7469b, "DiskCacheProducer", (Map<String, String>) null);
                this.f7470c.mo8220a();
            } else {
                if (fVar.mo16169n()) {
                    this.f7468a.mo8329k(this.f7469b, "DiskCacheProducer", fVar.mo16165i(), (Map<String, String>) null);
                } else {
                    C6369d j = fVar.mo16166j();
                    if (j != null) {
                        C2539r0 r0Var = this.f7468a;
                        C2531p0 p0Var = this.f7469b;
                        r0Var.mo8328j(p0Var, "DiskCacheProducer", C2532q.m10569e(r0Var, p0Var, true, j.mo18902s0()));
                        this.f7468a.mo8324c(this.f7469b, "DiskCacheProducer", true);
                        this.f7469b.mo8249o("disk");
                        this.f7470c.mo8222c(1.0f);
                        this.f7470c.mo8223d(j, 1);
                        j.close();
                    } else {
                        C2539r0 r0Var2 = this.f7468a;
                        C2531p0 p0Var2 = this.f7469b;
                        r0Var2.mo8328j(p0Var2, "DiskCacheProducer", C2532q.m10569e(r0Var2, p0Var2, false, 0));
                    }
                }
                C2532q.this.f7467d.mo8198b(this.f7470c, this.f7469b);
            }
            return null;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.q$b */
    class C2534b extends C2472e {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f7472a;

        C2534b(AtomicBoolean atomicBoolean) {
            this.f7472a = atomicBoolean;
        }

        /* renamed from: a */
        public void mo8208a() {
            this.f7472a.set(true);
        }
    }

    public C2532q(C6277e eVar, C6277e eVar2, C6283f fVar, C2529o0<C6369d> o0Var) {
        this.f7464a = eVar;
        this.f7465b = eVar2;
        this.f7466c = fVar;
        this.f7467d = o0Var;
    }

    /* renamed from: e */
    static Map<String, String> m10569e(C2539r0 r0Var, C2531p0 p0Var, boolean z, int i) {
        if (!r0Var.mo8327g(p0Var, "DiskCacheProducer")) {
            return null;
        }
        String valueOf = String.valueOf(z);
        return z ? C6055g.m22822of("cached_value_found", valueOf, "encodedImageSize", String.valueOf(i)) : C6055g.m22821of("cached_value_found", valueOf);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m10570f(C5368f<?> fVar) {
        return fVar.mo16167l() || (fVar.mo16169n() && (fVar.mo16165i() instanceof CancellationException));
    }

    /* renamed from: g */
    private void m10571g(C2505l<C6369d> lVar, C2531p0 p0Var) {
        if (p0Var.mo8252r().mo18945g() >= C6384b.C6387c.DISK_CACHE.mo18945g()) {
            p0Var.mo8244j("disk", "nil-result_read");
            lVar.mo8223d(null, 1);
            return;
        }
        this.f7467d.mo8198b(lVar, p0Var);
    }

    /* renamed from: h */
    private C5366d<C6369d, Void> m10572h(C2505l<C6369d> lVar, C2531p0 p0Var) {
        return new C2533a(p0Var.mo8250p(), p0Var, lVar);
    }

    /* renamed from: i */
    private void m10573i(AtomicBoolean atomicBoolean, C2531p0 p0Var) {
        p0Var.mo8241g(new C2534b(atomicBoolean));
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6369d> lVar, C2531p0 p0Var) {
        C6384b f = p0Var.mo8240f();
        if (!f.mo18941u()) {
            m10571g(lVar, p0Var);
            return;
        }
        p0Var.mo8250p().mo8326e(p0Var, "DiskCacheProducer");
        C5999d d = this.f7466c.mo18610d(f, p0Var.mo8237c());
        C6277e eVar = f.mo18921c() == C6384b.C6386b.SMALL ? this.f7465b : this.f7464a;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        eVar.mo18597n(d, atomicBoolean).mo16163e(m10572h(lVar, p0Var));
        m10573i(atomicBoolean, p0Var);
    }
}
