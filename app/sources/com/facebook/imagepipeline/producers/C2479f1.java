package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.nativecode.C2439e;
import com.facebook.imagepipeline.nativecode.C2440f;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p253d.p260g.C6086j;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p253d.p264k.C6109e;
import p174e.p247e.p293j.C6252b;
import p174e.p247e.p293j.C6253c;
import p174e.p247e.p293j.C6255d;
import p174e.p247e.p294k.p307k.C6369d;

/* renamed from: com.facebook.imagepipeline.producers.f1 */
public class C2479f1 implements C2529o0<C6369d> {

    /* renamed from: a */
    private final Executor f7313a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6084h f7314b;

    /* renamed from: c */
    private final C2529o0<C6369d> f7315c;

    /* renamed from: com.facebook.imagepipeline.producers.f1$a */
    class C2480a extends C2554w0<C6369d> {

        /* renamed from: s */
        final /* synthetic */ C6369d f7316s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2480a(C2505l lVar, C2539r0 r0Var, C2531p0 p0Var, String str, C6369d dVar) {
            super(lVar, r0Var, p0Var, str);
            this.f7316s = dVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo8267d() {
            C6369d.m24309h(this.f7316s);
            super.mo8267d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo8268e(Exception exc) {
            C6369d.m24309h(this.f7316s);
            super.mo8268e(exc);
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo8202b(C6369d dVar) {
            C6369d.m24309h(dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public C6369d mo8203c() {
            C6088a A0;
            C6086j a = C2479f1.this.f7314b.mo8163a();
            try {
                C2479f1.m10310g(this.f7316s, a);
                A0 = C6088a.m22940A0(a.mo8174a());
                C6369d dVar = new C6369d((C6088a<C6082g>) A0);
                dVar.mo18900o(this.f7316s);
                C6088a.m22949v0(A0);
                a.close();
                return dVar;
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public void mo8269f(C6369d dVar) {
            C6369d.m24309h(this.f7316s);
            super.mo8269f(dVar);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.f1$b */
    private class C2481b extends C2530p<C6369d, C6369d> {

        /* renamed from: c */
        private final C2531p0 f7318c;

        /* renamed from: d */
        private C6109e f7319d = C6109e.UNSET;

        public C2481b(C2505l<C6369d> lVar, C2531p0 p0Var) {
            super(lVar);
            this.f7318c = p0Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void mo8209i(C6369d dVar, int i) {
            if (this.f7319d == C6109e.UNSET && dVar != null) {
                this.f7319d = C2479f1.m10311h(dVar);
            }
            if (this.f7319d == C6109e.NO) {
                mo8320p().mo8223d(dVar, i);
            } else if (!C2459b.m10210e(i)) {
            } else {
                if (this.f7319d != C6109e.YES || dVar == null) {
                    mo8320p().mo8223d(dVar, i);
                } else {
                    C2479f1.this.m10312i(dVar, mo8320p(), this.f7318c);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.imagepipeline.producers.o0<e.e.k.k.d>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2479f1(java.util.concurrent.Executor r1, p174e.p247e.p253d.p260g.C6084h r2, com.facebook.imagepipeline.producers.C2529o0<p174e.p247e.p294k.p307k.C6369d> r3) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r1)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r0.f7313a = r1
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r2)
            e.e.d.g.h r1 = (p174e.p247e.p253d.p260g.C6084h) r1
            r0.f7314b = r1
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r3)
            com.facebook.imagepipeline.producers.o0 r1 = (com.facebook.imagepipeline.producers.C2529o0) r1
            r0.f7315c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2479f1.<init>(java.util.concurrent.Executor, e.e.d.g.h, com.facebook.imagepipeline.producers.o0):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m10310g(C6369d dVar, C6086j jVar) {
        C6253c cVar;
        InputStream inputStream = (InputStream) C6062k.m22839g(dVar.mo18892X());
        C6253c c = C6255d.m23714c(inputStream);
        if (c == C6252b.f17323f || c == C6252b.f17325h) {
            C2440f.m10153a().mo8192a(inputStream, jVar, 80);
            cVar = C6252b.f17318a;
        } else if (c == C6252b.f17324g || c == C6252b.f17326i) {
            C2440f.m10153a().mo8193b(inputStream, jVar);
            cVar = C6252b.f17319b;
        } else {
            throw new IllegalArgumentException("Wrong image format");
        }
        dVar.mo18885H0(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static C6109e m10311h(C6369d dVar) {
        C6062k.m22839g(dVar);
        C6253c c = C6255d.m23714c((InputStream) C6062k.m22839g(dVar.mo18892X()));
        if (!C6252b.m23708a(c)) {
            return c == C6253c.f17330a ? C6109e.UNSET : C6109e.NO;
        }
        C2439e a = C2440f.m10153a();
        return a == null ? C6109e.NO : C6109e.m22994h(!a.mo8194c(c));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m10312i(C6369d dVar, C2505l<C6369d> lVar, C2531p0 p0Var) {
        C6062k.m22839g(dVar);
        C2505l<C6369d> lVar2 = lVar;
        this.f7313a.execute(new C2480a(lVar2, p0Var.mo8250p(), p0Var, "WebpTranscodeProducer", C6369d.m24308b(dVar)));
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6369d> lVar, C2531p0 p0Var) {
        this.f7315c.mo8198b(new C2481b(lVar, p0Var), p0Var);
    }
}
