package com.facebook.imagepipeline.producers;

import java.util.Map;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p294k.p300d.C6276d;
import p174e.p247e.p294k.p300d.C6277e;
import p174e.p247e.p294k.p300d.C6283f;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: com.facebook.imagepipeline.producers.u */
public class C2545u implements C2529o0<C6369d> {

    /* renamed from: a */
    private final C6277e f7491a;

    /* renamed from: b */
    private final C6277e f7492b;

    /* renamed from: c */
    private final C6283f f7493c;

    /* renamed from: d */
    private final C2529o0<C6369d> f7494d;

    /* renamed from: e */
    private final C6276d<C5999d> f7495e;

    /* renamed from: f */
    private final C6276d<C5999d> f7496f;

    /* renamed from: com.facebook.imagepipeline.producers.u$a */
    private static class C2546a extends C2530p<C6369d, C6369d> {

        /* renamed from: c */
        private final C2531p0 f7497c;

        /* renamed from: d */
        private final C6277e f7498d;

        /* renamed from: e */
        private final C6277e f7499e;

        /* renamed from: f */
        private final C6283f f7500f;

        /* renamed from: g */
        private final C6276d<C5999d> f7501g;

        /* renamed from: h */
        private final C6276d<C5999d> f7502h;

        public C2546a(C2505l<C6369d> lVar, C2531p0 p0Var, C6277e eVar, C6277e eVar2, C6283f fVar, C6276d<C5999d> dVar, C6276d<C5999d> dVar2) {
            super(lVar);
            this.f7497c = p0Var;
            this.f7498d = eVar;
            this.f7499e = eVar2;
            this.f7500f = fVar;
            this.f7501g = dVar;
            this.f7502h = dVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo8209i(p174e.p247e.p294k.p307k.C6369d r6, int r7) {
            /*
                r5 = this;
                java.lang.String r0 = "origin"
                boolean r1 = p174e.p247e.p294k.p312p.C6394b.m24481d()     // Catch:{ all -> 0x00a1 }
                if (r1 == 0) goto L_0x000d
                java.lang.String r1 = "EncodedProbeProducer#onNewResultImpl"
                p174e.p247e.p294k.p312p.C6394b.m24478a(r1)     // Catch:{ all -> 0x00a1 }
            L_0x000d:
                boolean r1 = com.facebook.imagepipeline.producers.C2459b.m10211f(r7)     // Catch:{ all -> 0x00a1 }
                if (r1 != 0) goto L_0x0090
                if (r6 == 0) goto L_0x0090
                r1 = 10
                boolean r1 = com.facebook.imagepipeline.producers.C2459b.m10213m(r7, r1)     // Catch:{ all -> 0x00a1 }
                if (r1 != 0) goto L_0x0090
                e.e.j.c r1 = r6.mo18891W()     // Catch:{ all -> 0x00a1 }
                e.e.j.c r2 = p174e.p247e.p293j.C6253c.f17330a     // Catch:{ all -> 0x00a1 }
                if (r1 != r2) goto L_0x0026
                goto L_0x0090
            L_0x0026:
                com.facebook.imagepipeline.producers.p0 r1 = r5.f7497c     // Catch:{ all -> 0x00a1 }
                e.e.k.o.b r1 = r1.mo8240f()     // Catch:{ all -> 0x00a1 }
                e.e.k.d.f r2 = r5.f7500f     // Catch:{ all -> 0x00a1 }
                com.facebook.imagepipeline.producers.p0 r3 = r5.f7497c     // Catch:{ all -> 0x00a1 }
                java.lang.Object r3 = r3.mo8237c()     // Catch:{ all -> 0x00a1 }
                e.e.b.a.d r2 = r2.mo18610d(r1, r3)     // Catch:{ all -> 0x00a1 }
                e.e.k.d.d<e.e.b.a.d> r3 = r5.f7501g     // Catch:{ all -> 0x00a1 }
                r3.mo18591a(r2)     // Catch:{ all -> 0x00a1 }
                java.lang.String r3 = "memory_encoded"
                com.facebook.imagepipeline.producers.p0 r4 = r5.f7497c     // Catch:{ all -> 0x00a1 }
                java.lang.Object r4 = r4.mo8247m(r0)     // Catch:{ all -> 0x00a1 }
                boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x00a1 }
                if (r3 == 0) goto L_0x006e
                e.e.k.d.d<e.e.b.a.d> r0 = r5.f7502h     // Catch:{ all -> 0x00a1 }
                boolean r0 = r0.mo18592b(r2)     // Catch:{ all -> 0x00a1 }
                if (r0 != 0) goto L_0x007f
                e.e.k.o.b$b r0 = r1.mo18921c()     // Catch:{ all -> 0x00a1 }
                e.e.k.o.b$b r1 = p174e.p247e.p294k.p311o.C6384b.C6386b.SMALL     // Catch:{ all -> 0x00a1 }
                if (r0 != r1) goto L_0x005d
                r0 = 1
                goto L_0x005e
            L_0x005d:
                r0 = 0
            L_0x005e:
                if (r0 == 0) goto L_0x0063
                e.e.k.d.e r0 = r5.f7499e     // Catch:{ all -> 0x00a1 }
                goto L_0x0065
            L_0x0063:
                e.e.k.d.e r0 = r5.f7498d     // Catch:{ all -> 0x00a1 }
            L_0x0065:
                r0.mo18593h(r2)     // Catch:{ all -> 0x00a1 }
                e.e.k.d.d<e.e.b.a.d> r0 = r5.f7502h     // Catch:{ all -> 0x00a1 }
            L_0x006a:
                r0.mo18591a(r2)     // Catch:{ all -> 0x00a1 }
                goto L_0x007f
            L_0x006e:
                java.lang.String r1 = "disk"
                com.facebook.imagepipeline.producers.p0 r3 = r5.f7497c     // Catch:{ all -> 0x00a1 }
                java.lang.Object r0 = r3.mo8247m(r0)     // Catch:{ all -> 0x00a1 }
                boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00a1 }
                if (r0 == 0) goto L_0x007f
                e.e.k.d.d<e.e.b.a.d> r0 = r5.f7502h     // Catch:{ all -> 0x00a1 }
                goto L_0x006a
            L_0x007f:
                com.facebook.imagepipeline.producers.l r0 = r5.mo8320p()     // Catch:{ all -> 0x00a1 }
                r0.mo8223d(r6, r7)     // Catch:{ all -> 0x00a1 }
                boolean r6 = p174e.p247e.p294k.p312p.C6394b.m24481d()
                if (r6 == 0) goto L_0x008f
                p174e.p247e.p294k.p312p.C6394b.m24479b()
            L_0x008f:
                return
            L_0x0090:
                com.facebook.imagepipeline.producers.l r0 = r5.mo8320p()     // Catch:{ all -> 0x00a1 }
                r0.mo8223d(r6, r7)     // Catch:{ all -> 0x00a1 }
                boolean r6 = p174e.p247e.p294k.p312p.C6394b.m24481d()
                if (r6 == 0) goto L_0x00a0
                p174e.p247e.p294k.p312p.C6394b.m24479b()
            L_0x00a0:
                return
            L_0x00a1:
                r6 = move-exception
                boolean r7 = p174e.p247e.p294k.p312p.C6394b.m24481d()
                if (r7 == 0) goto L_0x00ab
                p174e.p247e.p294k.p312p.C6394b.m24479b()
            L_0x00ab:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2545u.C2546a.mo8209i(e.e.k.k.d, int):void");
        }
    }

    public C2545u(C6277e eVar, C6277e eVar2, C6283f fVar, C6276d dVar, C6276d dVar2, C2529o0<C6369d> o0Var) {
        this.f7491a = eVar;
        this.f7492b = eVar2;
        this.f7493c = fVar;
        this.f7495e = dVar;
        this.f7496f = dVar2;
        this.f7494d = o0Var;
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6369d> lVar, C2531p0 p0Var) {
        try {
            if (C6394b.m24481d()) {
                C6394b.m24478a("EncodedProbeProducer#produceResults");
            }
            C2539r0 p = p0Var.mo8250p();
            p.mo8326e(p0Var, mo8340c());
            C2546a aVar = new C2546a(lVar, p0Var, this.f7491a, this.f7492b, this.f7493c, this.f7495e, this.f7496f);
            p.mo8328j(p0Var, "EncodedProbeProducer", (Map<String, String>) null);
            if (C6394b.m24481d()) {
                C6394b.m24478a("mInputProducer.produceResult");
            }
            this.f7494d.mo8198b(aVar, p0Var);
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
    public String mo8340c() {
        return "EncodedProbeProducer";
    }
}
