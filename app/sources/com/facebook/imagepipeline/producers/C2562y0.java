package com.facebook.imagepipeline.producers;

import java.util.Map;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p294k.p308l.C6375a;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: com.facebook.imagepipeline.producers.y0 */
public class C2562y0<T> implements C2529o0<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2529o0<T> f7547a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2566z0 f7548b;

    /* renamed from: com.facebook.imagepipeline.producers.y0$a */
    class C2563a extends C2554w0<T> {

        /* renamed from: s */
        final /* synthetic */ C2539r0 f7549s;

        /* renamed from: t */
        final /* synthetic */ C2531p0 f7550t;

        /* renamed from: u */
        final /* synthetic */ C2505l f7551u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2563a(C2505l lVar, C2539r0 r0Var, C2531p0 p0Var, String str, C2539r0 r0Var2, C2531p0 p0Var2, C2505l lVar2) {
            super(lVar, r0Var, p0Var, str);
            this.f7549s = r0Var2;
            this.f7550t = p0Var2;
            this.f7551u = lVar2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo8202b(T t) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public T mo8203c() {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo8269f(T t) {
            this.f7549s.mo8328j(this.f7550t, "BackgroundThreadHandoffProducer", (Map<String, String>) null);
            C2562y0.this.f7547a.mo8198b(this.f7551u, this.f7550t);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.y0$b */
    class C2564b extends C2472e {

        /* renamed from: a */
        final /* synthetic */ C2554w0 f7553a;

        C2564b(C2554w0 w0Var) {
            this.f7553a = w0Var;
        }

        /* renamed from: a */
        public void mo8208a() {
            this.f7553a.mo18036a();
            C2562y0.this.f7548b.mo8218a(this.f7553a);
        }
    }

    public C2562y0(C2529o0<T> o0Var, C2566z0 z0Var) {
        this.f7547a = (C2529o0) C6062k.m22839g(o0Var);
        this.f7548b = z0Var;
    }

    /* renamed from: e */
    private static String m10687e(C2531p0 p0Var) {
        if (!C6375a.m24350b()) {
            return null;
        }
        return "ThreadHandoffProducer_produceResults_" + p0Var.mo8235a();
    }

    /* renamed from: b */
    public void mo8198b(C2505l<T> lVar, C2531p0 p0Var) {
        try {
            if (C6394b.m24481d()) {
                C6394b.m24478a("ThreadHandoffProducer#produceResults");
            }
            C2539r0 p = p0Var.mo8250p();
            C2563a aVar = new C2563a(lVar, p, p0Var, "BackgroundThreadHandoffProducer", p, p0Var, lVar);
            p0Var.mo8241g(new C2564b(aVar));
            this.f7548b.mo8219b(C6375a.m24349a(aVar, m10687e(p0Var)));
        } finally {
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
    }
}
