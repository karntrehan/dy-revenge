package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.producers.C2503k0;
import java.io.InputStream;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import p174e.p247e.p253d.p260g.C6076a;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p253d.p260g.C6086j;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p301e.C6312a;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p307k.C6370e;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: com.facebook.imagepipeline.producers.j0 */
public class C2498j0 implements C2529o0<C6369d> {

    /* renamed from: a */
    protected final C6084h f7373a;

    /* renamed from: b */
    private final C6076a f7374b;

    /* renamed from: c */
    private final C2503k0 f7375c;

    /* renamed from: com.facebook.imagepipeline.producers.j0$a */
    class C2499a implements C2503k0.C2504a {

        /* renamed from: a */
        final /* synthetic */ C2553w f7376a;

        C2499a(C2553w wVar) {
            this.f7376a = wVar;
        }

        /* renamed from: a */
        public void mo8298a() {
            C2498j0.this.m10410k(this.f7376a);
        }

        /* renamed from: b */
        public void mo8299b(Throwable th) {
            C2498j0.this.m10411l(this.f7376a, th);
        }

        /* renamed from: c */
        public void mo8300c(InputStream inputStream, int i) {
            if (C6394b.m24481d()) {
                C6394b.m24478a("NetworkFetcher->onResponse");
            }
            C2498j0.this.mo8297m(this.f7376a, inputStream, i);
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
    }

    public C2498j0(C6084h hVar, C6076a aVar, C2503k0 k0Var) {
        this.f7373a = hVar;
        this.f7374b = aVar;
        this.f7375c = k0Var;
    }

    /* renamed from: e */
    protected static float m10407e(int i, int i2) {
        return i2 > 0 ? ((float) i) / ((float) i2) : 1.0f - ((float) Math.exp(((double) (-i)) / 50000.0d));
    }

    /* renamed from: f */
    private Map<String, String> m10408f(C2553w wVar, int i) {
        if (!wVar.mo8346d().mo8327g(wVar.mo8344b(), "NetworkFetchProducer")) {
            return null;
        }
        return this.f7375c.mo8303c(wVar, i);
    }

    /* renamed from: j */
    protected static void m10409j(C6086j jVar, int i, C6312a aVar, C2505l<C6369d> lVar, C2531p0 p0Var) {
        C6088a A0 = C6088a.m22940A0(jVar.mo8174a());
        C6369d dVar = null;
        try {
            C6369d dVar2 = new C6369d((C6088a<C6082g>) A0);
            try {
                dVar2.mo18882E0(aVar);
                dVar2.mo18880A0();
                p0Var.mo8243i(C6370e.NETWORK);
                lVar.mo8223d(dVar2, i);
                C6369d.m24309h(dVar2);
                C6088a.m22949v0(A0);
            } catch (Throwable th) {
                th = th;
                dVar = dVar2;
                C6369d.m24309h(dVar);
                C6088a.m22949v0(A0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C6369d.m24309h(dVar);
            C6088a.m22949v0(A0);
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m10410k(C2553w wVar) {
        wVar.mo8346d().mo8325d(wVar.mo8344b(), "NetworkFetchProducer", (Map<String, String>) null);
        wVar.mo8343a().mo8220a();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m10411l(C2553w wVar, Throwable th) {
        wVar.mo8346d().mo8329k(wVar.mo8344b(), "NetworkFetchProducer", th, (Map<String, String>) null);
        wVar.mo8346d().mo8324c(wVar.mo8344b(), "NetworkFetchProducer", false);
        wVar.mo8344b().mo8249o("network");
        wVar.mo8343a().mo8221b(th);
    }

    /* renamed from: n */
    private boolean m10412n(C2553w wVar) {
        if (!wVar.mo8344b().mo8251q()) {
            return false;
        }
        return this.f7375c.mo8232b(wVar);
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6369d> lVar, C2531p0 p0Var) {
        p0Var.mo8250p().mo8326e(p0Var, "NetworkFetchProducer");
        C2553w e = this.f7375c.mo8305e(lVar, p0Var);
        this.f7375c.mo8304d(e, new C2499a(e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public long mo8294g() {
        return SystemClock.uptimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo8295h(C6086j jVar, C2553w wVar) {
        Map<String, String> f = m10408f(wVar, jVar.size());
        C2539r0 d = wVar.mo8346d();
        d.mo8328j(wVar.mo8344b(), "NetworkFetchProducer", f);
        d.mo8324c(wVar.mo8344b(), "NetworkFetchProducer", true);
        wVar.mo8344b().mo8249o("network");
        m10409j(jVar, wVar.mo8347e() | 1, wVar.mo8348f(), wVar.mo8343a(), wVar.mo8344b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo8296i(C6086j jVar, C2553w wVar) {
        long g = mo8294g();
        if (m10412n(wVar) && g - wVar.mo8345c() >= 100) {
            wVar.mo8350h(g);
            wVar.mo8346d().mo8323a(wVar.mo8344b(), "NetworkFetchProducer", "intermediate_result");
            m10409j(jVar, wVar.mo8347e(), wVar.mo8348f(), wVar.mo8343a(), wVar.mo8344b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo8297m(C2553w wVar, InputStream inputStream, int i) {
        C6084h hVar = this.f7373a;
        C6086j e = i > 0 ? hVar.mo8167e(i) : hVar.mo8163a();
        byte[] bArr = (byte[]) this.f7374b.get(Http2.INITIAL_MAX_FRAME_SIZE);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.f7375c.mo8302a(wVar, e.size());
                    mo8295h(e, wVar);
                    return;
                } else if (read > 0) {
                    e.write(bArr, 0, read);
                    mo8296i(e, wVar);
                    wVar.mo8343a().mo8222c(m10407e(e.size(), i));
                }
            } finally {
                this.f7374b.mo8068a(bArr);
                e.close();
            }
        }
    }
}
