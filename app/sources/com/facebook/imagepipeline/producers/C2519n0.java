package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p257d.C6055g;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p299c.C6270f;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p307k.C6368c;
import p174e.p247e.p294k.p311o.C6390d;
import p174e.p247e.p294k.p311o.C6391e;
import p174e.p247e.p294k.p311o.C6392f;

/* renamed from: com.facebook.imagepipeline.producers.n0 */
public class C2519n0 implements C2529o0<C6088a<C6367b>> {

    /* renamed from: a */
    private final C2529o0<C6088a<C6367b>> f7437a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6270f f7438b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f7439c;

    /* renamed from: com.facebook.imagepipeline.producers.n0$b */
    private class C2521b extends C2530p<C6088a<C6367b>, C6088a<C6367b>> {

        /* renamed from: c */
        private final C2539r0 f7440c;

        /* renamed from: d */
        private final C2531p0 f7441d;

        /* renamed from: e */
        private final C6390d f7442e;

        /* renamed from: f */
        private boolean f7443f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C6088a<C6367b> f7444g = null;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f7445h = 0;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f7446i = false;

        /* renamed from: j */
        private boolean f7447j = false;

        /* renamed from: com.facebook.imagepipeline.producers.n0$b$a */
        class C2522a extends C2472e {

            /* renamed from: a */
            final /* synthetic */ C2519n0 f7449a;

            C2522a(C2519n0 n0Var) {
                this.f7449a = n0Var;
            }

            /* renamed from: a */
            public void mo8208a() {
                C2521b.this.m10508C();
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.n0$b$b */
        class C2523b implements Runnable {
            C2523b() {
            }

            public void run() {
                C6088a r;
                int t;
                synchronized (C2521b.this) {
                    r = C2521b.this.f7444g;
                    t = C2521b.this.f7445h;
                    C6088a unused = C2521b.this.f7444g = null;
                    boolean unused2 = C2521b.this.f7446i = false;
                }
                if (C6088a.m22950z0(r)) {
                    try {
                        C2521b.this.m10525z(r, t);
                    } finally {
                        C6088a.m22949v0(r);
                    }
                }
                C2521b.this.m10523x();
            }
        }

        public C2521b(C2505l<C6088a<C6367b>> lVar, C2539r0 r0Var, C6390d dVar, C2531p0 p0Var) {
            super(lVar);
            this.f7440c = r0Var;
            this.f7442e = dVar;
            this.f7441d = p0Var;
            p0Var.mo8241g(new C2522a(C2519n0.this));
        }

        /* renamed from: A */
        private Map<String, String> m10506A(C2539r0 r0Var, C2531p0 p0Var, C6390d dVar) {
            if (!r0Var.mo8327g(p0Var, "PostprocessorProducer")) {
                return null;
            }
            return C6055g.m22821of("Postprocessor", dVar.getName());
        }

        /* renamed from: B */
        private synchronized boolean m10507B() {
            return this.f7443f;
        }

        /* access modifiers changed from: private */
        /* renamed from: C */
        public void m10508C() {
            if (m10524y()) {
                mo8320p().mo8220a();
            }
        }

        /* renamed from: D */
        private void m10509D(Throwable th) {
            if (m10524y()) {
                mo8320p().mo8221b(th);
            }
        }

        /* renamed from: E */
        private void m10510E(C6088a<C6367b> aVar, int i) {
            boolean e = C2459b.m10210e(i);
            if ((!e && !m10507B()) || (e && m10524y())) {
                mo8320p().mo8223d(aVar, i);
            }
        }

        /* renamed from: G */
        private C6088a<C6367b> m10511G(C6367b bVar) {
            C6368c cVar = (C6368c) bVar;
            C6088a<Bitmap> b = this.f7442e.mo9952b(cVar.mo18868E(), C2519n0.this.f7438b);
            try {
                C6368c cVar2 = new C6368c(b, bVar.mo18870a(), cVar.mo18878e0(), cVar.mo18877X());
                cVar2.mo18869A(cVar.mo15980b());
                return C6088a.m22940A0(cVar2);
            } finally {
                C6088a.m22949v0(b);
            }
        }

        /* renamed from: H */
        private synchronized boolean m10512H() {
            if (this.f7443f || !this.f7446i || this.f7447j || !C6088a.m22950z0(this.f7444g)) {
                return false;
            }
            this.f7447j = true;
            return true;
        }

        /* renamed from: I */
        private boolean m10513I(C6367b bVar) {
            return bVar instanceof C6368c;
        }

        /* renamed from: J */
        private void m10514J() {
            C2519n0.this.f7439c.execute(new C2523b());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
            m10514J();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
            p174e.p247e.p253d.p261h.C6088a.m22949v0(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
            if (r2 == false) goto L_?;
         */
        /* renamed from: K */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m10515K(p174e.p247e.p253d.p261h.C6088a<p174e.p247e.p294k.p307k.C6367b> r2, int r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.f7443f     // Catch:{ all -> 0x0022 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                e.e.d.h.a<e.e.k.k.b> r0 = r1.f7444g     // Catch:{ all -> 0x0022 }
                e.e.d.h.a r2 = p174e.p247e.p253d.p261h.C6088a.m22948u0(r2)     // Catch:{ all -> 0x0022 }
                r1.f7444g = r2     // Catch:{ all -> 0x0022 }
                r1.f7445h = r3     // Catch:{ all -> 0x0022 }
                r2 = 1
                r1.f7446i = r2     // Catch:{ all -> 0x0022 }
                boolean r2 = r1.m10512H()     // Catch:{ all -> 0x0022 }
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                p174e.p247e.p253d.p261h.C6088a.m22949v0(r0)
                if (r2 == 0) goto L_0x0021
                r1.m10514J()
            L_0x0021:
                return
            L_0x0022:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2519n0.C2521b.m10515K(e.e.d.h.a, int):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: x */
        public void m10523x() {
            boolean H;
            synchronized (this) {
                this.f7447j = false;
                H = m10512H();
            }
            if (H) {
                m10514J();
            }
        }

        /* renamed from: y */
        private boolean m10524y() {
            synchronized (this) {
                if (this.f7443f) {
                    return false;
                }
                C6088a<C6367b> aVar = this.f7444g;
                this.f7444g = null;
                this.f7443f = true;
                C6088a.m22949v0(aVar);
                return true;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public void m10525z(C6088a<C6367b> aVar, int i) {
            C6062k.m22834b(Boolean.valueOf(C6088a.m22950z0(aVar)));
            if (!m10513I(aVar.mo18082w0())) {
                m10510E(aVar, i);
                return;
            }
            this.f7440c.mo8326e(this.f7441d, "PostprocessorProducer");
            C6088a<C6367b> aVar2 = null;
            try {
                aVar2 = m10511G(aVar.mo18082w0());
                C2539r0 r0Var = this.f7440c;
                C2531p0 p0Var = this.f7441d;
                r0Var.mo8328j(p0Var, "PostprocessorProducer", m10506A(r0Var, p0Var, this.f7442e));
                m10510E(aVar2, i);
            } catch (Exception e) {
                C2539r0 r0Var2 = this.f7440c;
                C2531p0 p0Var2 = this.f7441d;
                r0Var2.mo8329k(p0Var2, "PostprocessorProducer", e, m10506A(r0Var2, p0Var2, this.f7442e));
                m10509D(e);
            } finally {
                C6088a.m22949v0(aVar2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: F */
        public void mo8209i(C6088a<C6367b> aVar, int i) {
            if (C6088a.m22950z0(aVar)) {
                m10515K(aVar, i);
            } else if (C2459b.m10210e(i)) {
                m10510E((C6088a<C6367b>) null, i);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo8224g() {
            m10508C();
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo8225h(Throwable th) {
            m10509D(th);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.n0$c */
    class C2524c extends C2530p<C6088a<C6367b>, C6088a<C6367b>> implements C6392f {

        /* renamed from: c */
        private boolean f7452c;

        /* renamed from: d */
        private C6088a<C6367b> f7453d;

        /* renamed from: com.facebook.imagepipeline.producers.n0$c$a */
        class C2525a extends C2472e {

            /* renamed from: a */
            final /* synthetic */ C2519n0 f7455a;

            C2525a(C2519n0 n0Var) {
                this.f7455a = n0Var;
            }

            /* renamed from: a */
            public void mo8208a() {
                if (C2524c.this.m10532r()) {
                    C2524c.this.mo8320p().mo8220a();
                }
            }
        }

        private C2524c(C2521b bVar, C6391e eVar, C2531p0 p0Var) {
            super(bVar);
            this.f7452c = false;
            this.f7453d = null;
            eVar.mo18980a(this);
            p0Var.mo8241g(new C2525a(C2519n0.this));
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public boolean m10532r() {
            synchronized (this) {
                if (this.f7452c) {
                    return false;
                }
                C6088a<C6367b> aVar = this.f7453d;
                this.f7453d = null;
                this.f7452c = true;
                C6088a.m22949v0(aVar);
                return true;
            }
        }

        /* renamed from: t */
        private void m10533t(C6088a<C6367b> aVar) {
            synchronized (this) {
                if (!this.f7452c) {
                    C6088a<C6367b> aVar2 = this.f7453d;
                    this.f7453d = C6088a.m22948u0(aVar);
                    C6088a.m22949v0(aVar2);
                }
            }
        }

        /* renamed from: u */
        private void m10534u() {
            synchronized (this) {
                if (!this.f7452c) {
                    C6088a<C6367b> u0 = C6088a.m22948u0(this.f7453d);
                    try {
                        mo8320p().mo8223d(u0, 0);
                    } finally {
                        C6088a.m22949v0(u0);
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo8224g() {
            if (m10532r()) {
                mo8320p().mo8220a();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo8225h(Throwable th) {
            if (m10532r()) {
                mo8320p().mo8221b(th);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public void mo8209i(C6088a<C6367b> aVar, int i) {
            if (!C2459b.m10211f(i)) {
                m10533t(aVar);
                m10534u();
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.n0$d */
    class C2526d extends C2530p<C6088a<C6367b>, C6088a<C6367b>> {
        private C2526d(C2521b bVar) {
            super(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void mo8209i(C6088a<C6367b> aVar, int i) {
            if (!C2459b.m10211f(i)) {
                mo8320p().mo8223d(aVar, i);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.imagepipeline.producers.o0<e.e.d.h.a<e.e.k.k.b>>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2519n0(com.facebook.imagepipeline.producers.C2529o0<p174e.p247e.p253d.p261h.C6088a<p174e.p247e.p294k.p307k.C6367b>> r1, p174e.p247e.p294k.p299c.C6270f r2, java.util.concurrent.Executor r3) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r1)
            com.facebook.imagepipeline.producers.o0 r1 = (com.facebook.imagepipeline.producers.C2529o0) r1
            r0.f7437a = r1
            r0.f7438b = r2
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r3)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r0.f7439c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2519n0.<init>(com.facebook.imagepipeline.producers.o0, e.e.k.c.f, java.util.concurrent.Executor):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.facebook.imagepipeline.producers.n0$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: com.facebook.imagepipeline.producers.n0$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.facebook.imagepipeline.producers.n0$c} */
    /* JADX WARNING: type inference failed for: r14v2, types: [com.facebook.imagepipeline.producers.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8198b(com.facebook.imagepipeline.producers.C2505l<p174e.p247e.p253d.p261h.C6088a<p174e.p247e.p294k.p307k.C6367b>> r14, com.facebook.imagepipeline.producers.C2531p0 r15) {
        /*
            r13 = this;
            com.facebook.imagepipeline.producers.r0 r3 = r15.mo8250p()
            e.e.k.o.b r0 = r15.mo8240f()
            e.e.k.o.d r6 = r0.mo18927h()
            com.facebook.imagepipeline.producers.n0$b r9 = new com.facebook.imagepipeline.producers.n0$b
            r0 = r9
            r1 = r13
            r2 = r14
            r4 = r6
            r5 = r15
            r0.<init>(r2, r3, r4, r5)
            boolean r14 = r6 instanceof p174e.p247e.p294k.p311o.C6391e
            if (r14 == 0) goto L_0x0027
            com.facebook.imagepipeline.producers.n0$c r14 = new com.facebook.imagepipeline.producers.n0$c
            r10 = r6
            e.e.k.o.e r10 = (p174e.p247e.p294k.p311o.C6391e) r10
            r12 = 0
            r7 = r14
            r8 = r13
            r11 = r15
            r7.<init>(r9, r10, r11)
            goto L_0x002d
        L_0x0027:
            com.facebook.imagepipeline.producers.n0$d r14 = new com.facebook.imagepipeline.producers.n0$d
            r0 = 0
            r14.<init>(r9)
        L_0x002d:
            com.facebook.imagepipeline.producers.o0<e.e.d.h.a<e.e.k.k.b>> r0 = r13.f7437a
            r0.mo8198b(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2519n0.mo8198b(com.facebook.imagepipeline.producers.l, com.facebook.imagepipeline.producers.p0):void");
    }
}
