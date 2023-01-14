package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.C2451a0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p257d.C6055g;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p253d.p260g.C6086j;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p253d.p264k.C6109e;
import p174e.p247e.p293j.C6252b;
import p174e.p247e.p293j.C6253c;
import p174e.p247e.p294k.p301e.C6316e;
import p174e.p247e.p294k.p301e.C6317f;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;
import p174e.p247e.p294k.p313q.C6400b;
import p174e.p247e.p294k.p313q.C6401c;
import p174e.p247e.p294k.p313q.C6402d;
import p174e.p247e.p294k.p313q.C6403e;

/* renamed from: com.facebook.imagepipeline.producers.u0 */
public class C2547u0 implements C2529o0<C6369d> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Executor f7503a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6084h f7504b;

    /* renamed from: c */
    private final C2529o0<C6369d> f7505c;

    /* renamed from: d */
    private final boolean f7506d;

    /* renamed from: e */
    private final C6402d f7507e;

    /* renamed from: com.facebook.imagepipeline.producers.u0$a */
    private class C2548a extends C2530p<C6369d, C6369d> {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final boolean f7508c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C6402d f7509d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C2531p0 f7510e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f7511f = false;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final C2451a0 f7512g;

        /* renamed from: com.facebook.imagepipeline.producers.u0$a$a */
        class C2549a implements C2451a0.C2455d {

            /* renamed from: a */
            final /* synthetic */ C2547u0 f7514a;

            C2549a(C2547u0 u0Var) {
                this.f7514a = u0Var;
            }

            /* renamed from: a */
            public void mo8217a(C6369d dVar, int i) {
                C2548a aVar = C2548a.this;
                aVar.m10628w(dVar, i, (C6401c) C6062k.m22839g(aVar.f7509d.createImageTranscoder(dVar.mo18891W(), C2548a.this.f7508c)));
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.u0$a$b */
        class C2550b extends C2472e {

            /* renamed from: a */
            final /* synthetic */ C2547u0 f7516a;

            /* renamed from: b */
            final /* synthetic */ C2505l f7517b;

            C2550b(C2547u0 u0Var, C2505l lVar) {
                this.f7516a = u0Var;
                this.f7517b = lVar;
            }

            /* renamed from: a */
            public void mo8208a() {
                C2548a.this.f7512g.mo8211c();
                boolean unused = C2548a.this.f7511f = true;
                this.f7517b.mo8220a();
            }

            /* renamed from: b */
            public void mo8257b() {
                if (C2548a.this.f7510e.mo8251q()) {
                    C2548a.this.f7512g.mo8213h();
                }
            }
        }

        C2548a(C2505l<C6369d> lVar, C2531p0 p0Var, boolean z, C6402d dVar) {
            super(lVar);
            this.f7510e = p0Var;
            Boolean o = p0Var.mo8240f().mo18935o();
            this.f7508c = o != null ? o.booleanValue() : z;
            this.f7509d = dVar;
            this.f7512g = new C2451a0(C2547u0.this.f7503a, new C2549a(C2547u0.this), 100);
            p0Var.mo8241g(new C2550b(C2547u0.this, lVar));
        }

        /* renamed from: A */
        private C6369d m10620A(C6369d dVar) {
            C6317f p = this.f7510e.mo8240f().mo18936p();
            return (p.mo18694g() || !p.mo18693f()) ? dVar : m10630y(dVar, p.mo18691e());
        }

        /* renamed from: B */
        private C6369d m10621B(C6369d dVar) {
            return (this.f7510e.mo8240f().mo18936p().mo18690c() || dVar.mo18898i0() == 0 || dVar.mo18898i0() == -1) ? dVar : m10630y(dVar, 0);
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public void m10628w(C6369d dVar, int i, C6401c cVar) {
            C6369d dVar2;
            this.f7510e.mo8250p().mo8326e(this.f7510e, "ResizeAndRotateProducer");
            C6384b f = this.f7510e.mo8240f();
            C6086j a = C2547u0.this.f7504b.mo8163a();
            Map<String, String> map = null;
            try {
                C6400b c = cVar.mo8189c(dVar, a, f.mo18936p(), f.mo18934n(), (C6253c) null, 85);
                if (c.mo18984a() != 2) {
                    map = m10631z(dVar, f.mo18934n(), c, cVar.mo8187a());
                    C6088a A0 = C6088a.m22940A0(a.mo8174a());
                    try {
                        dVar2 = new C6369d((C6088a<C6082g>) A0);
                        dVar2.mo18885H0(C6252b.f17318a);
                        dVar2.mo18880A0();
                        this.f7510e.mo8250p().mo8328j(this.f7510e, "ResizeAndRotateProducer", map);
                        if (c.mo18984a() != 1) {
                            i |= 16;
                        }
                        mo8320p().mo8223d(dVar2, i);
                        C6369d.m24309h(dVar2);
                        C6088a.m22949v0(A0);
                        a.close();
                    } catch (Throwable th) {
                        C6088a.m22949v0(A0);
                        throw th;
                    }
                } else {
                    throw new RuntimeException("Error while transcoding the image");
                }
            } catch (Exception e) {
                try {
                    this.f7510e.mo8250p().mo8329k(this.f7510e, "ResizeAndRotateProducer", e, map);
                    if (C2459b.m10210e(i)) {
                        mo8320p().mo8221b(e);
                    }
                } finally {
                    a.close();
                }
            }
        }

        /* renamed from: x */
        private void m10629x(C6369d dVar, int i, C6253c cVar) {
            mo8320p().mo8223d((cVar == C6252b.f17318a || cVar == C6252b.f17328k) ? m10621B(dVar) : m10620A(dVar), i);
        }

        /* renamed from: y */
        private C6369d m10630y(C6369d dVar, int i) {
            C6369d b = C6369d.m24308b(dVar);
            if (b != null) {
                b.mo18887I0(i);
            }
            return b;
        }

        /* renamed from: z */
        private Map<String, String> m10631z(C6369d dVar, C6316e eVar, C6400b bVar, String str) {
            String str2;
            if (!this.f7510e.mo8250p().mo8327g(this.f7510e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = dVar.mo18896e() + "x" + dVar.mo18894c();
            if (eVar != null) {
                str2 = eVar.f17470a + "x" + eVar.f17471b;
            } else {
                str2 = "Unspecified";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Image format", String.valueOf(dVar.mo18891W()));
            hashMap.put("Original size", str3);
            hashMap.put("Requested size", str2);
            hashMap.put("queueTime", String.valueOf(this.f7512g.mo8212f()));
            hashMap.put("Transcoder id", str);
            hashMap.put("Transcoding result", String.valueOf(bVar));
            return C6055g.m22820c(hashMap);
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public void mo8209i(C6369d dVar, int i) {
            if (!this.f7511f) {
                boolean e = C2459b.m10210e(i);
                if (dVar != null) {
                    C6253c W = dVar.mo18891W();
                    C6109e d = C2547u0.m10618h(this.f7510e.mo8240f(), dVar, (C6401c) C6062k.m22839g(this.f7509d.createImageTranscoder(W, this.f7508c)));
                    if (!e && d == C6109e.UNSET) {
                        return;
                    }
                    if (d != C6109e.YES) {
                        m10629x(dVar, i, W);
                    } else if (this.f7512g.mo8214k(dVar, i)) {
                        if (e || this.f7510e.mo8251q()) {
                            this.f7512g.mo8213h();
                        }
                    }
                } else if (e) {
                    mo8320p().mo8223d(null, 1);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.imagepipeline.producers.o0<e.e.k.k.d>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2547u0(java.util.concurrent.Executor r1, p174e.p247e.p253d.p260g.C6084h r2, com.facebook.imagepipeline.producers.C2529o0<p174e.p247e.p294k.p307k.C6369d> r3, boolean r4, p174e.p247e.p294k.p313q.C6402d r5) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r1)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r0.f7503a = r1
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r2)
            e.e.d.g.h r1 = (p174e.p247e.p253d.p260g.C6084h) r1
            r0.f7504b = r1
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r3)
            com.facebook.imagepipeline.producers.o0 r1 = (com.facebook.imagepipeline.producers.C2529o0) r1
            r0.f7505c = r1
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r5)
            e.e.k.q.d r1 = (p174e.p247e.p294k.p313q.C6402d) r1
            r0.f7507e = r1
            r0.f7506d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2547u0.<init>(java.util.concurrent.Executor, e.e.d.g.h, com.facebook.imagepipeline.producers.o0, boolean, e.e.k.q.d):void");
    }

    /* renamed from: f */
    private static boolean m10616f(C6317f fVar, C6369d dVar) {
        return !fVar.mo18690c() && (C6403e.m24499e(fVar, dVar) != 0 || m10617g(fVar, dVar));
    }

    /* renamed from: g */
    private static boolean m10617g(C6317f fVar, C6369d dVar) {
        if (fVar.mo18693f() && !fVar.mo18690c()) {
            return C6403e.f17837a.contains(Integer.valueOf(dVar.mo18886I()));
        }
        dVar.mo18883F0(0);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static C6109e m10618h(C6384b bVar, C6369d dVar, C6401c cVar) {
        if (dVar == null || dVar.mo18891W() == C6253c.f17330a) {
            return C6109e.UNSET;
        }
        if (!cVar.mo8190d(dVar.mo18891W())) {
            return C6109e.NO;
        }
        return C6109e.m22994h(m10616f(bVar.mo18936p(), dVar) || cVar.mo8188b(dVar, bVar.mo18936p(), bVar.mo18934n()));
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6369d> lVar, C2531p0 p0Var) {
        this.f7505c.mo8198b(new C2548a(lVar, p0Var, this.f7506d, this.f7507e), p0Var);
    }
}
