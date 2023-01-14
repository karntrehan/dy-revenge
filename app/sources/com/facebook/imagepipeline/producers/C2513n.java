package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.imagepipeline.producers.C2451a0;
import com.facebook.imageutils.C2567a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;
import p174e.p247e.p253d.p257d.C6055g;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6065n;
import p174e.p247e.p253d.p260g.C6076a;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p253d.p264k.C6105a;
import p174e.p247e.p253d.p264k.C6111f;
import p174e.p247e.p293j.C6252b;
import p174e.p247e.p294k.p301e.C6313b;
import p174e.p247e.p294k.p302f.C6319a;
import p174e.p247e.p294k.p305i.C6357c;
import p174e.p247e.p294k.p305i.C6359e;
import p174e.p247e.p294k.p305i.C6360f;
import p174e.p247e.p294k.p307k.C6366a;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p307k.C6368c;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p307k.C6373h;
import p174e.p247e.p294k.p307k.C6374i;
import p174e.p247e.p294k.p311o.C6384b;
import p174e.p247e.p294k.p312p.C6394b;
import p174e.p247e.p294k.p313q.C6399a;

/* renamed from: com.facebook.imagepipeline.producers.n */
public class C2513n implements C2529o0<C6088a<C6367b>> {

    /* renamed from: a */
    private final C6076a f7406a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f7407b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6357c f7408c;

    /* renamed from: d */
    private final C6359e f7409d;

    /* renamed from: e */
    private final C2529o0<C6369d> f7410e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final boolean f7411f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final boolean f7412g;

    /* renamed from: h */
    private final boolean f7413h;

    /* renamed from: i */
    private final int f7414i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C6319a f7415j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Runnable f7416k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C6065n<Boolean> f7417l;

    /* renamed from: com.facebook.imagepipeline.producers.n$a */
    private class C2514a extends C2516c {
        public C2514a(C2505l<C6088a<C6367b>> lVar, C2531p0 p0Var, boolean z, int i) {
            super(lVar, p0Var, z, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: I */
        public synchronized boolean mo8311I(C6369d dVar, int i) {
            if (C2459b.m10211f(i)) {
                return false;
            }
            return super.mo8311I(dVar, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public int mo8312x(C6369d dVar) {
            return dVar.mo18902s0();
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public C6374i mo8313y() {
            return C6373h.m24342d(0, false, false);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.n$b */
    private class C2515b extends C2516c {

        /* renamed from: j */
        private final C6360f f7419j;

        /* renamed from: k */
        private final C6359e f7420k;

        /* renamed from: l */
        private int f7421l = 0;

        public C2515b(C2505l<C6088a<C6367b>> lVar, C2531p0 p0Var, C6360f fVar, C6359e eVar, boolean z, int i) {
            super(lVar, p0Var, z, i);
            this.f7419j = (C6360f) C6062k.m22839g(fVar);
            this.f7420k = (C6359e) C6062k.m22839g(eVar);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0054, code lost:
            return r0;
         */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean mo8311I(p174e.p247e.p294k.p307k.C6369d r4, int r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = super.mo8311I(r4, r5)     // Catch:{ all -> 0x0055 }
                boolean r1 = com.facebook.imagepipeline.producers.C2459b.m10211f(r5)     // Catch:{ all -> 0x0055 }
                if (r1 != 0) goto L_0x0013
                r1 = 8
                boolean r1 = com.facebook.imagepipeline.producers.C2459b.m10214n(r5, r1)     // Catch:{ all -> 0x0055 }
                if (r1 == 0) goto L_0x0053
            L_0x0013:
                r1 = 4
                boolean r5 = com.facebook.imagepipeline.producers.C2459b.m10214n(r5, r1)     // Catch:{ all -> 0x0055 }
                if (r5 != 0) goto L_0x0053
                boolean r5 = p174e.p247e.p294k.p307k.C6369d.m24312z0(r4)     // Catch:{ all -> 0x0055 }
                if (r5 == 0) goto L_0x0053
                e.e.j.c r5 = r4.mo18891W()     // Catch:{ all -> 0x0055 }
                e.e.j.c r1 = p174e.p247e.p293j.C6252b.f17318a     // Catch:{ all -> 0x0055 }
                if (r5 != r1) goto L_0x0053
                e.e.k.i.f r5 = r3.f7419j     // Catch:{ all -> 0x0055 }
                boolean r4 = r5.mo18865g(r4)     // Catch:{ all -> 0x0055 }
                r5 = 0
                if (r4 != 0) goto L_0x0033
                monitor-exit(r3)
                return r5
            L_0x0033:
                e.e.k.i.f r4 = r3.f7419j     // Catch:{ all -> 0x0055 }
                int r4 = r4.mo18863d()     // Catch:{ all -> 0x0055 }
                int r1 = r3.f7421l     // Catch:{ all -> 0x0055 }
                if (r4 > r1) goto L_0x003f
                monitor-exit(r3)
                return r5
            L_0x003f:
                e.e.k.i.e r2 = r3.f7420k     // Catch:{ all -> 0x0055 }
                int r1 = r2.mo18861b(r1)     // Catch:{ all -> 0x0055 }
                if (r4 >= r1) goto L_0x0051
                e.e.k.i.f r1 = r3.f7419j     // Catch:{ all -> 0x0055 }
                boolean r1 = r1.mo18864e()     // Catch:{ all -> 0x0055 }
                if (r1 != 0) goto L_0x0051
                monitor-exit(r3)
                return r5
            L_0x0051:
                r3.f7421l = r4     // Catch:{ all -> 0x0055 }
            L_0x0053:
                monitor-exit(r3)
                return r0
            L_0x0055:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2513n.C2515b.mo8311I(e.e.k.k.d, int):boolean");
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public int mo8312x(C6369d dVar) {
            return this.f7419j.mo18862c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public C6374i mo8313y() {
            return this.f7420k.mo18860a(this.f7419j.mo18863d());
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.n$c */
    private abstract class C2516c extends C2530p<C6369d, C6088a<C6367b>> {

        /* renamed from: c */
        private final String f7423c = "ProgressiveDecoder";
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2531p0 f7424d;

        /* renamed from: e */
        private final C2539r0 f7425e;

        /* renamed from: f */
        private final C6313b f7426f;

        /* renamed from: g */
        private boolean f7427g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final C2451a0 f7428h;

        /* renamed from: com.facebook.imagepipeline.producers.n$c$a */
        class C2517a implements C2451a0.C2455d {

            /* renamed from: a */
            final /* synthetic */ C2513n f7430a;

            /* renamed from: b */
            final /* synthetic */ C2531p0 f7431b;

            /* renamed from: c */
            final /* synthetic */ int f7432c;

            C2517a(C2513n nVar, C2531p0 p0Var, int i) {
                this.f7430a = nVar;
                this.f7431b = p0Var;
                this.f7432c = i;
            }

            /* renamed from: a */
            public void mo8217a(C6369d dVar, int i) {
                if (dVar != null) {
                    C2516c.this.f7424d.mo8239e("image_format", dVar.mo18891W().mo18570a());
                    if (C2513n.this.f7411f || !C2459b.m10214n(i, 16)) {
                        C6384b f = this.f7431b.mo8240f();
                        if (C2513n.this.f7412g || !C6111f.m23008l(f.mo18938r())) {
                            dVar.mo18888J0(C6399a.m24485b(f.mo18936p(), f.mo18934n(), dVar, this.f7432c));
                        }
                    }
                    if (this.f7431b.mo8242h().mo18733D().mo18796z()) {
                        C2516c.this.m10482F(dVar);
                    }
                    C2516c.this.m10489v(dVar, i);
                }
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.n$c$b */
        class C2518b extends C2472e {

            /* renamed from: a */
            final /* synthetic */ C2513n f7434a;

            /* renamed from: b */
            final /* synthetic */ boolean f7435b;

            C2518b(C2513n nVar, boolean z) {
                this.f7434a = nVar;
                this.f7435b = z;
            }

            /* renamed from: a */
            public void mo8208a() {
                if (this.f7435b) {
                    C2516c.this.m10491z();
                }
            }

            /* renamed from: b */
            public void mo8257b() {
                if (C2516c.this.f7424d.mo8251q()) {
                    C2516c.this.f7428h.mo8213h();
                }
            }
        }

        public C2516c(C2505l<C6088a<C6367b>> lVar, C2531p0 p0Var, boolean z, int i) {
            super(lVar);
            this.f7424d = p0Var;
            this.f7425e = p0Var.mo8250p();
            C6313b e = p0Var.mo8240f().mo18923e();
            this.f7426f = e;
            this.f7427g = false;
            this.f7428h = new C2451a0(C2513n.this.f7407b, new C2517a(C2513n.this, p0Var, i), e.f17442b);
            p0Var.mo8241g(new C2518b(C2513n.this, z));
        }

        /* renamed from: A */
        private void m10477A(Throwable th) {
            m10481E(true);
            mo8320p().mo8221b(th);
        }

        /* renamed from: B */
        private void m10478B(C6367b bVar, int i) {
            C6088a b = C2513n.this.f7415j.mo18697b(bVar);
            try {
                m10481E(C2459b.m10210e(i));
                mo8320p().mo8223d(b, i);
            } finally {
                C6088a.m22949v0(b);
            }
        }

        /* renamed from: C */
        private C6367b m10479C(C6369d dVar, int i, C6374i iVar) {
            boolean z = C2513n.this.f7416k != null && ((Boolean) C2513n.this.f7417l.get()).booleanValue();
            try {
                return C2513n.this.f7408c.mo18855a(dVar, i, iVar, this.f7426f);
            } catch (OutOfMemoryError e) {
                if (z) {
                    C2513n.this.f7416k.run();
                    System.gc();
                    return C2513n.this.f7408c.mo18855a(dVar, i, iVar, this.f7426f);
                }
                throw e;
            }
        }

        /* renamed from: D */
        private synchronized boolean m10480D() {
            return this.f7427g;
        }

        /* renamed from: E */
        private void m10481E(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f7427g) {
                        mo8320p().mo8222c(1.0f);
                        this.f7427g = true;
                        this.f7428h.mo8211c();
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: F */
        public void m10482F(C6369d dVar) {
            if (dVar.mo18891W() == C6252b.f17318a) {
                dVar.mo18888J0(C6399a.m24486c(dVar, C2567a.m10703c(this.f7426f.f17448h), 104857600));
            }
        }

        /* renamed from: H */
        private void m10483H(C6369d dVar, C6367b bVar) {
            this.f7424d.mo8239e("encoded_width", Integer.valueOf(dVar.mo18896e()));
            this.f7424d.mo8239e("encoded_height", Integer.valueOf(dVar.mo18894c()));
            this.f7424d.mo8239e("encoded_size", Integer.valueOf(dVar.mo18902s0()));
            if (bVar instanceof C6366a) {
                Bitmap E = ((C6366a) bVar).mo18868E();
                this.f7424d.mo8239e("bitmap_config", String.valueOf(E == null ? null : E.getConfig()));
            }
            if (bVar != null) {
                bVar.mo18869A(this.f7424d.mo8236b());
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8 A[Catch:{ all -> 0x013c }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d4  */
        /* renamed from: v */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m10489v(p174e.p247e.p294k.p307k.C6369d r21, int r22) {
            /*
                r20 = this;
                r11 = r20
                r12 = r21
                r0 = r22
                java.lang.String r13 = "DecodeProducer"
                e.e.j.c r1 = r21.mo18891W()
                e.e.j.c r2 = p174e.p247e.p293j.C6252b.f17318a
                if (r1 == r2) goto L_0x0017
                boolean r1 = com.facebook.imagepipeline.producers.C2459b.m10211f(r22)
                if (r1 == 0) goto L_0x0017
                return
            L_0x0017:
                boolean r1 = r20.m10480D()
                if (r1 != 0) goto L_0x0141
                boolean r1 = p174e.p247e.p294k.p307k.C6369d.m24312z0(r21)
                if (r1 != 0) goto L_0x0025
                goto L_0x0141
            L_0x0025:
                e.e.j.c r1 = r21.mo18891W()
                java.lang.String r2 = "unknown"
                if (r1 == 0) goto L_0x0033
                java.lang.String r1 = r1.mo18570a()
                r7 = r1
                goto L_0x0034
            L_0x0033:
                r7 = r2
            L_0x0034:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r3 = r21.mo18896e()
                r1.append(r3)
                java.lang.String r3 = "x"
                r1.append(r3)
                int r4 = r21.mo18894c()
                r1.append(r4)
                java.lang.String r8 = r1.toString()
                int r1 = r21.mo18899n0()
                java.lang.String r10 = java.lang.String.valueOf(r1)
                boolean r6 = com.facebook.imagepipeline.producers.C2459b.m10210e(r22)
                r4 = 1
                if (r6 == 0) goto L_0x0069
                r5 = 8
                boolean r5 = com.facebook.imagepipeline.producers.C2459b.m10214n(r0, r5)
                if (r5 != 0) goto L_0x0069
                r5 = 1
                goto L_0x006a
            L_0x0069:
                r5 = 0
            L_0x006a:
                r9 = 4
                boolean r14 = com.facebook.imagepipeline.producers.C2459b.m10214n(r0, r9)
                com.facebook.imagepipeline.producers.p0 r15 = r11.f7424d
                e.e.k.o.b r15 = r15.mo8240f()
                e.e.k.e.e r15 = r15.mo18934n()
                if (r15 == 0) goto L_0x0093
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                int r1 = r15.f17470a
                r2.append(r1)
                r2.append(r3)
                int r1 = r15.f17471b
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r15 = r1
                goto L_0x0094
            L_0x0093:
                r15 = r2
            L_0x0094:
                com.facebook.imagepipeline.producers.a0 r1 = r11.f7428h     // Catch:{ all -> 0x013c }
                long r17 = r1.mo8212f()     // Catch:{ all -> 0x013c }
                com.facebook.imagepipeline.producers.p0 r1 = r11.f7424d     // Catch:{ all -> 0x013c }
                e.e.k.o.b r1 = r1.mo8240f()     // Catch:{ all -> 0x013c }
                android.net.Uri r1 = r1.mo18938r()     // Catch:{ all -> 0x013c }
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x013c }
                if (r5 != 0) goto L_0x00b2
                if (r14 == 0) goto L_0x00ad
                goto L_0x00b2
            L_0x00ad:
                int r2 = r20.mo8312x(r21)     // Catch:{ all -> 0x013c }
                goto L_0x00b6
            L_0x00b2:
                int r2 = r21.mo18902s0()     // Catch:{ all -> 0x013c }
            L_0x00b6:
                if (r5 != 0) goto L_0x00c0
                if (r14 == 0) goto L_0x00bb
                goto L_0x00c0
            L_0x00bb:
                e.e.k.k.i r3 = r20.mo8313y()     // Catch:{ all -> 0x013c }
                goto L_0x00c2
            L_0x00c0:
                e.e.k.k.i r3 = p174e.p247e.p294k.p307k.C6373h.f17773a     // Catch:{ all -> 0x013c }
            L_0x00c2:
                r5 = r3
                com.facebook.imagepipeline.producers.r0 r3 = r11.f7425e     // Catch:{ all -> 0x013c }
                com.facebook.imagepipeline.producers.p0 r14 = r11.f7424d     // Catch:{ all -> 0x013c }
                r3.mo8326e(r14, r13)     // Catch:{ all -> 0x013c }
                e.e.k.k.b r14 = r11.m10479C(r12, r2, r5)     // Catch:{ a -> 0x00f7 }
                int r1 = r21.mo18899n0()     // Catch:{ Exception -> 0x00f1 }
                if (r1 == r4) goto L_0x00d6
                r0 = r0 | 16
            L_0x00d6:
                r1 = r20
                r2 = r14
                r3 = r17
                r9 = r15
                java.util.Map r1 = r1.m10490w(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x013c }
                com.facebook.imagepipeline.producers.r0 r2 = r11.f7425e     // Catch:{ all -> 0x013c }
                com.facebook.imagepipeline.producers.p0 r3 = r11.f7424d     // Catch:{ all -> 0x013c }
                r2.mo8328j(r3, r13, r1)     // Catch:{ all -> 0x013c }
                r11.m10483H(r12, r14)     // Catch:{ all -> 0x013c }
                r11.m10478B(r14, r0)     // Catch:{ all -> 0x013c }
                p174e.p247e.p294k.p307k.C6369d.m24309h(r21)
                return
            L_0x00f1:
                r0 = move-exception
                r2 = r14
                goto L_0x0125
            L_0x00f4:
                r0 = move-exception
                r2 = 0
                goto L_0x0125
            L_0x00f7:
                r0 = move-exception
                r2 = r0
                e.e.k.k.d r0 = r2.mo18854a()     // Catch:{ Exception -> 0x00f4 }
                java.lang.String r14 = "ProgressiveDecoder"
                java.lang.String r3 = "%s, {uri: %s, firstEncodedBytes: %s, length: %d}"
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00f4 }
                java.lang.String r19 = r2.getMessage()     // Catch:{ Exception -> 0x00f4 }
                r16 = 0
                r9[r16] = r19     // Catch:{ Exception -> 0x00f4 }
                r9[r4] = r1     // Catch:{ Exception -> 0x00f4 }
                r1 = 2
                r4 = 10
                java.lang.String r4 = r0.mo18890L(r4)     // Catch:{ Exception -> 0x00f4 }
                r9[r1] = r4     // Catch:{ Exception -> 0x00f4 }
                r1 = 3
                int r0 = r0.mo18902s0()     // Catch:{ Exception -> 0x00f4 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00f4 }
                r9[r1] = r0     // Catch:{ Exception -> 0x00f4 }
                p174e.p247e.p253d.p258e.C6071a.m22861I(r14, r3, r9)     // Catch:{ Exception -> 0x00f4 }
                throw r2     // Catch:{ Exception -> 0x00f4 }
            L_0x0125:
                r1 = r20
                r3 = r17
                r9 = r15
                java.util.Map r1 = r1.m10490w(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x013c }
                com.facebook.imagepipeline.producers.r0 r2 = r11.f7425e     // Catch:{ all -> 0x013c }
                com.facebook.imagepipeline.producers.p0 r3 = r11.f7424d     // Catch:{ all -> 0x013c }
                r2.mo8329k(r3, r13, r0, r1)     // Catch:{ all -> 0x013c }
                r11.m10477A(r0)     // Catch:{ all -> 0x013c }
                p174e.p247e.p294k.p307k.C6369d.m24309h(r21)
                return
            L_0x013c:
                r0 = move-exception
                p174e.p247e.p294k.p307k.C6369d.m24309h(r21)
                throw r0
            L_0x0141:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2513n.C2516c.m10489v(e.e.k.k.d, int):void");
        }

        /* renamed from: w */
        private Map<String, String> m10490w(C6367b bVar, long j, C6374i iVar, boolean z, String str, String str2, String str3, String str4) {
            C6367b bVar2 = bVar;
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            String str8 = str4;
            if (!this.f7425e.mo8327g(this.f7424d, "DecodeProducer")) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(iVar.mo18908b());
            String valueOf3 = String.valueOf(z);
            if (bVar2 instanceof C6368c) {
                Bitmap E = ((C6368c) bVar2).mo18868E();
                C6062k.m22839g(E);
                Bitmap bitmap = E;
                HashMap hashMap = new HashMap(8);
                hashMap.put("bitmapSize", E.getWidth() + "x" + E.getHeight());
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str6);
                hashMap.put("imageFormat", str5);
                hashMap.put("requestedImageSize", str7);
                hashMap.put("sampleSize", str4);
                if (Build.VERSION.SDK_INT >= 12) {
                    hashMap.put("byteCount", bitmap.getByteCount() + HttpUrl.FRAGMENT_ENCODE_SET);
                }
                return C6055g.m22820c(hashMap);
            }
            String str9 = str8;
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put("queueTime", valueOf);
            hashMap2.put("hasGoodQuality", valueOf2);
            hashMap2.put("isFinal", valueOf3);
            hashMap2.put("encodedImageSize", str6);
            hashMap2.put("imageFormat", str5);
            hashMap2.put("requestedImageSize", str7);
            hashMap2.put("sampleSize", str9);
            return C6055g.m22820c(hashMap2);
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public void m10491z() {
            m10481E(true);
            mo8320p().mo8220a();
        }

        /* renamed from: G */
        public void mo8209i(C6369d dVar, int i) {
            boolean d;
            try {
                if (C6394b.m24481d()) {
                    C6394b.m24478a("DecodeProducer#onNewResultImpl");
                }
                boolean e = C2459b.m10210e(i);
                if (e) {
                    if (dVar == null) {
                        m10477A(new C6105a("Encoded image is null."));
                        if (!d) {
                            return;
                        }
                        return;
                    } else if (!dVar.mo18905y0()) {
                        m10477A(new C6105a("Encoded image is not valid."));
                        if (C6394b.m24481d()) {
                            C6394b.m24479b();
                            return;
                        }
                        return;
                    }
                }
                if (mo8311I(dVar, i)) {
                    boolean n = C2459b.m10214n(i, 4);
                    if (e || n || this.f7424d.mo8251q()) {
                        this.f7428h.mo8213h();
                    }
                    if (C6394b.m24481d()) {
                        C6394b.m24479b();
                    }
                } else if (C6394b.m24481d()) {
                    C6394b.m24479b();
                }
            } finally {
                if (C6394b.m24481d()) {
                    C6394b.m24479b();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: I */
        public boolean mo8311I(C6369d dVar, int i) {
            return this.f7428h.mo8214k(dVar, i);
        }

        /* renamed from: g */
        public void mo8224g() {
            m10491z();
        }

        /* renamed from: h */
        public void mo8225h(Throwable th) {
            m10477A(th);
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo8226j(float f) {
            super.mo8226j(f * 0.99f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public abstract int mo8312x(C6369d dVar);

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public abstract C6374i mo8313y();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.facebook.imagepipeline.producers.o0<e.e.k.k.d>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2513n(p174e.p247e.p253d.p260g.C6076a r1, java.util.concurrent.Executor r2, p174e.p247e.p294k.p305i.C6357c r3, p174e.p247e.p294k.p305i.C6359e r4, boolean r5, boolean r6, boolean r7, com.facebook.imagepipeline.producers.C2529o0<p174e.p247e.p294k.p307k.C6369d> r8, int r9, p174e.p247e.p294k.p302f.C6319a r10, java.lang.Runnable r11, p174e.p247e.p253d.p257d.C6065n<java.lang.Boolean> r12) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r1)
            e.e.d.g.a r1 = (p174e.p247e.p253d.p260g.C6076a) r1
            r0.f7406a = r1
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r2)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r0.f7407b = r1
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r3)
            e.e.k.i.c r1 = (p174e.p247e.p294k.p305i.C6357c) r1
            r0.f7408c = r1
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r4)
            e.e.k.i.e r1 = (p174e.p247e.p294k.p305i.C6359e) r1
            r0.f7409d = r1
            r0.f7411f = r5
            r0.f7412g = r6
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r8)
            com.facebook.imagepipeline.producers.o0 r1 = (com.facebook.imagepipeline.producers.C2529o0) r1
            r0.f7410e = r1
            r0.f7413h = r7
            r0.f7414i = r9
            r0.f7415j = r10
            r0.f7416k = r11
            r0.f7417l = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2513n.<init>(e.e.d.g.a, java.util.concurrent.Executor, e.e.k.i.c, e.e.k.i.e, boolean, boolean, boolean, com.facebook.imagepipeline.producers.o0, int, e.e.k.f.a, java.lang.Runnable, e.e.d.d.n):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.facebook.imagepipeline.producers.n$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.facebook.imagepipeline.producers.n$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.facebook.imagepipeline.producers.n$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.facebook.imagepipeline.producers.n$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8198b(com.facebook.imagepipeline.producers.C2505l<p174e.p247e.p253d.p261h.C6088a<p174e.p247e.p294k.p307k.C6367b>> r10, com.facebook.imagepipeline.producers.C2531p0 r11) {
        /*
            r9 = this;
            boolean r0 = p174e.p247e.p294k.p312p.C6394b.m24481d()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "DecodeProducer#produceResults"
            p174e.p247e.p294k.p312p.C6394b.m24478a(r0)     // Catch:{ all -> 0x004d }
        L_0x000b:
            e.e.k.o.b r0 = r11.mo8240f()     // Catch:{ all -> 0x004d }
            android.net.Uri r0 = r0.mo18938r()     // Catch:{ all -> 0x004d }
            boolean r0 = p174e.p247e.p253d.p264k.C6111f.m23008l(r0)     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0027
            com.facebook.imagepipeline.producers.n$a r0 = new com.facebook.imagepipeline.producers.n$a     // Catch:{ all -> 0x004d }
            boolean r5 = r9.f7413h     // Catch:{ all -> 0x004d }
            int r6 = r9.f7414i     // Catch:{ all -> 0x004d }
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r1.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x004d }
            goto L_0x003e
        L_0x0027:
            e.e.k.i.f r4 = new e.e.k.i.f     // Catch:{ all -> 0x004d }
            e.e.d.g.a r0 = r9.f7406a     // Catch:{ all -> 0x004d }
            r4.<init>(r0)     // Catch:{ all -> 0x004d }
            com.facebook.imagepipeline.producers.n$b r8 = new com.facebook.imagepipeline.producers.n$b     // Catch:{ all -> 0x004d }
            e.e.k.i.e r5 = r9.f7409d     // Catch:{ all -> 0x004d }
            boolean r6 = r9.f7413h     // Catch:{ all -> 0x004d }
            int r7 = r9.f7414i     // Catch:{ all -> 0x004d }
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004d }
            r0 = r8
        L_0x003e:
            com.facebook.imagepipeline.producers.o0<e.e.k.k.d> r10 = r9.f7410e     // Catch:{ all -> 0x004d }
            r10.mo8198b(r0, r11)     // Catch:{ all -> 0x004d }
            boolean r10 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r10 == 0) goto L_0x004c
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x004c:
            return
        L_0x004d:
            r10 = move-exception
            boolean r11 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r11 == 0) goto L_0x0057
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x0057:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2513n.mo8198b(com.facebook.imagepipeline.producers.l, com.facebook.imagepipeline.producers.p0):void");
    }
}
