package com.facebook.imagepipeline.producers;

import java.io.InputStream;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p257d.C6050b;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.imagepipeline.producers.e0 */
public abstract class C2473e0 implements C2529o0<C6369d> {

    /* renamed from: a */
    private final Executor f7305a;

    /* renamed from: b */
    private final C6084h f7306b;

    /* renamed from: com.facebook.imagepipeline.producers.e0$a */
    class C2474a extends C2554w0<C6369d> {

        /* renamed from: s */
        final /* synthetic */ C6384b f7307s;

        /* renamed from: t */
        final /* synthetic */ C2539r0 f7308t;

        /* renamed from: u */
        final /* synthetic */ C2531p0 f7309u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2474a(C2505l lVar, C2539r0 r0Var, C2531p0 p0Var, String str, C6384b bVar, C2539r0 r0Var2, C2531p0 p0Var2) {
            super(lVar, r0Var, p0Var, str);
            this.f7307s = bVar;
            this.f7308t = r0Var2;
            this.f7309u = p0Var2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo8202b(C6369d dVar) {
            C6369d.m24309h(dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public C6369d mo8203c() {
            C6369d d = C2473e0.this.mo8228d(this.f7307s);
            if (d == null) {
                this.f7308t.mo8324c(this.f7309u, C2473e0.this.mo8229f(), false);
                this.f7309u.mo8249o("local");
                return null;
            }
            d.mo18880A0();
            this.f7308t.mo8324c(this.f7309u, C2473e0.this.mo8229f(), true);
            this.f7309u.mo8249o("local");
            return d;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.e0$b */
    class C2475b extends C2472e {

        /* renamed from: a */
        final /* synthetic */ C2554w0 f7311a;

        C2475b(C2554w0 w0Var) {
            this.f7311a = w0Var;
        }

        /* renamed from: a */
        public void mo8208a() {
            this.f7311a.mo18036a();
        }
    }

    protected C2473e0(Executor executor, C6084h hVar) {
        this.f7305a = executor;
        this.f7306b = hVar;
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6369d> lVar, C2531p0 p0Var) {
        C2539r0 p = p0Var.mo8250p();
        C6384b f = p0Var.mo8240f();
        p0Var.mo8244j("local", "fetch");
        C2474a aVar = new C2474a(lVar, p, p0Var, mo8229f(), f, p, p0Var);
        p0Var.mo8241g(new C2475b(aVar));
        this.f7305a.execute(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C6369d mo8260c(InputStream inputStream, int i) {
        C6082g gVar;
        if (i <= 0) {
            try {
                gVar = this.f7306b.mo8165c(inputStream);
            } catch (Throwable th) {
                C6050b.m22817b(inputStream);
                C6088a.m22949v0((C6088a<?>) null);
                throw th;
            }
        } else {
            gVar = this.f7306b.mo8166d(inputStream, i);
        }
        C6088a A0 = C6088a.m22940A0(gVar);
        C6369d dVar = new C6369d((C6088a<C6082g>) A0);
        C6050b.m22817b(inputStream);
        C6088a.m22949v0(A0);
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C6369d mo8228d(C6384b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C6369d mo8261e(InputStream inputStream, int i) {
        return mo8260c(inputStream, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo8229f();
}
