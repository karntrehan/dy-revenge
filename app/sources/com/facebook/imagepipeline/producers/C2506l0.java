package com.facebook.imagepipeline.producers;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.http2.Http2;
import p173d.C5366d;
import p173d.C5368f;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p257d.C6055g;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p253d.p260g.C6076a;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p253d.p260g.C6086j;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p293j.C6253c;
import p174e.p247e.p294k.p300d.C6277e;
import p174e.p247e.p294k.p300d.C6283f;
import p174e.p247e.p294k.p301e.C6312a;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;
import p174e.p247e.p294k.p311o.C6388c;

/* renamed from: com.facebook.imagepipeline.producers.l0 */
public class C2506l0 implements C2529o0<C6369d> {

    /* renamed from: a */
    private final C6277e f7382a;

    /* renamed from: b */
    private final C6283f f7383b;

    /* renamed from: c */
    private final C6084h f7384c;

    /* renamed from: d */
    private final C6076a f7385d;

    /* renamed from: e */
    private final C2529o0<C6369d> f7386e;

    /* renamed from: com.facebook.imagepipeline.producers.l0$a */
    class C2507a implements C5366d<C6369d, Void> {

        /* renamed from: a */
        final /* synthetic */ C2539r0 f7387a;

        /* renamed from: b */
        final /* synthetic */ C2531p0 f7388b;

        /* renamed from: c */
        final /* synthetic */ C2505l f7389c;

        /* renamed from: d */
        final /* synthetic */ C5999d f7390d;

        C2507a(C2539r0 r0Var, C2531p0 p0Var, C2505l lVar, C5999d dVar) {
            this.f7387a = r0Var;
            this.f7388b = p0Var;
            this.f7389c = lVar;
            this.f7390d = dVar;
        }

        /* renamed from: b */
        public Void mo8306a(C5368f<C6369d> fVar) {
            if (C2506l0.m10442g(fVar)) {
                this.f7387a.mo8325d(this.f7388b, "PartialDiskCacheProducer", (Map<String, String>) null);
                this.f7389c.mo8220a();
            } else if (fVar.mo16169n()) {
                this.f7387a.mo8329k(this.f7388b, "PartialDiskCacheProducer", fVar.mo16165i(), (Map<String, String>) null);
                C2506l0.this.m10444i(this.f7389c, this.f7388b, this.f7390d, (C6369d) null);
            } else {
                C6369d j = fVar.mo16166j();
                C2539r0 r0Var = this.f7387a;
                C2531p0 p0Var = this.f7388b;
                if (j != null) {
                    r0Var.mo8328j(p0Var, "PartialDiskCacheProducer", C2506l0.m10441f(r0Var, p0Var, true, j.mo18902s0()));
                    C6312a e = C6312a.m23906e(j.mo18902s0() - 1);
                    j.mo18882E0(e);
                    int s0 = j.mo18902s0();
                    C6384b f = this.f7388b.mo8240f();
                    if (e.mo18665a(f.mo18920b())) {
                        this.f7388b.mo8244j("disk", "partial");
                        this.f7387a.mo8324c(this.f7388b, "PartialDiskCacheProducer", true);
                        this.f7389c.mo8223d(j, 9);
                    } else {
                        this.f7389c.mo8223d(j, 8);
                        C2506l0.this.m10444i(this.f7389c, new C2552v0(C6388c.m24437b(f).mo18974u(C6312a.m23904b(s0 - 1)).mo18956a(), this.f7388b), this.f7390d, j);
                    }
                } else {
                    r0Var.mo8328j(p0Var, "PartialDiskCacheProducer", C2506l0.m10441f(r0Var, p0Var, false, 0));
                    C2506l0.this.m10444i(this.f7389c, this.f7388b, this.f7390d, j);
                }
            }
            return null;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.l0$b */
    class C2508b extends C2472e {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f7392a;

        C2508b(AtomicBoolean atomicBoolean) {
            this.f7392a = atomicBoolean;
        }

        /* renamed from: a */
        public void mo8208a() {
            this.f7392a.set(true);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.l0$c */
    private static class C2509c extends C2530p<C6369d, C6369d> {

        /* renamed from: c */
        private final C6277e f7394c;

        /* renamed from: d */
        private final C5999d f7395d;

        /* renamed from: e */
        private final C6084h f7396e;

        /* renamed from: f */
        private final C6076a f7397f;

        /* renamed from: g */
        private final C6369d f7398g;

        private C2509c(C2505l<C6369d> lVar, C6277e eVar, C5999d dVar, C6084h hVar, C6076a aVar, C6369d dVar2) {
            super(lVar);
            this.f7394c = eVar;
            this.f7395d = dVar;
            this.f7396e = hVar;
            this.f7397f = aVar;
            this.f7398g = dVar2;
        }

        /* synthetic */ C2509c(C2505l lVar, C6277e eVar, C5999d dVar, C6084h hVar, C6076a aVar, C6369d dVar2, C2507a aVar2) {
            this(lVar, eVar, dVar, hVar, aVar, dVar2);
        }

        /* renamed from: q */
        private void m10450q(InputStream inputStream, OutputStream outputStream, int i) {
            byte[] bArr = (byte[]) this.f7397f.get(Http2.INITIAL_MAX_FRAME_SIZE);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(Http2.INITIAL_MAX_FRAME_SIZE, i2));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i2 -= read;
                    }
                } catch (Throwable th) {
                    this.f7397f.mo8068a(bArr);
                    throw th;
                }
            }
            this.f7397f.mo8068a(bArr);
            if (i2 > 0) {
                throw new IOException(String.format((Locale) null, "Failed to read %d bytes - finished %d short", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
            }
        }

        /* renamed from: r */
        private C6086j m10451r(C6369d dVar, C6369d dVar2) {
            int i = ((C6312a) C6062k.m22839g(dVar2.mo18879A())).f17439b;
            C6086j e = this.f7396e.mo8167e(dVar2.mo18902s0() + i);
            m10450q(dVar.mo18897e0(), e, i);
            m10450q(dVar2.mo18897e0(), e, dVar2.mo18902s0());
            return e;
        }

        /* renamed from: t */
        private void m10452t(C6086j jVar) {
            C6369d dVar;
            Throwable th;
            C6088a A0 = C6088a.m22940A0(jVar.mo8174a());
            try {
                dVar = new C6369d((C6088a<C6082g>) A0);
                try {
                    dVar.mo18880A0();
                    mo8320p().mo8223d(dVar, 1);
                    C6369d.m24309h(dVar);
                    C6088a.m22949v0(A0);
                } catch (Throwable th2) {
                    th = th2;
                    C6369d.m24309h(dVar);
                    C6088a.m22949v0(A0);
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                dVar = null;
                th = th4;
                C6369d.m24309h(dVar);
                C6088a.m22949v0(A0);
                throw th;
            }
        }

        /* renamed from: s */
        public void mo8209i(C6369d dVar, int i) {
            if (!C2459b.m10211f(i)) {
                if (this.f7398g == null || dVar == null || dVar.mo18879A() == null) {
                    if (C2459b.m10214n(i, 8) && C2459b.m10210e(i) && dVar != null && dVar.mo18891W() != C6253c.f17330a) {
                        this.f7394c.mo18598p(this.f7395d, dVar);
                    }
                    mo8320p().mo8223d(dVar, i);
                    return;
                }
                try {
                    m10452t(m10451r(this.f7398g, dVar));
                } catch (IOException e) {
                    C6071a.m22876j("PartialDiskCacheProducer", "Error while merging image data", e);
                    mo8320p().mo8221b(e);
                } catch (Throwable th) {
                    dVar.close();
                    this.f7398g.close();
                    throw th;
                }
                dVar.close();
                this.f7398g.close();
                this.f7394c.mo18599r(this.f7395d);
            }
        }
    }

    public C2506l0(C6277e eVar, C6283f fVar, C6084h hVar, C6076a aVar, C2529o0<C6369d> o0Var) {
        this.f7382a = eVar;
        this.f7383b = fVar;
        this.f7384c = hVar;
        this.f7385d = aVar;
        this.f7386e = o0Var;
    }

    /* renamed from: e */
    private static Uri m10440e(C6384b bVar) {
        return bVar.mo18938r().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    /* renamed from: f */
    static Map<String, String> m10441f(C2539r0 r0Var, C2531p0 p0Var, boolean z, int i) {
        if (!r0Var.mo8327g(p0Var, "PartialDiskCacheProducer")) {
            return null;
        }
        String valueOf = String.valueOf(z);
        return z ? C6055g.m22822of("cached_value_found", valueOf, "encodedImageSize", String.valueOf(i)) : C6055g.m22821of("cached_value_found", valueOf);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static boolean m10442g(C5368f<?> fVar) {
        return fVar.mo16167l() || (fVar.mo16169n() && (fVar.mo16165i() instanceof CancellationException));
    }

    /* renamed from: h */
    private C5366d<C6369d, Void> m10443h(C2505l<C6369d> lVar, C2531p0 p0Var, C5999d dVar) {
        return new C2507a(p0Var.mo8250p(), p0Var, lVar, dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m10444i(C2505l<C6369d> lVar, C2531p0 p0Var, C5999d dVar, C6369d dVar2) {
        this.f7386e.mo8198b(new C2509c(lVar, this.f7382a, dVar, this.f7384c, this.f7385d, dVar2, (C2507a) null), p0Var);
    }

    /* renamed from: j */
    private void m10445j(AtomicBoolean atomicBoolean, C2531p0 p0Var) {
        p0Var.mo8241g(new C2508b(atomicBoolean));
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6369d> lVar, C2531p0 p0Var) {
        C6384b f = p0Var.mo8240f();
        if (!f.mo18941u()) {
            this.f7386e.mo8198b(lVar, p0Var);
            return;
        }
        p0Var.mo8250p().mo8326e(p0Var, "PartialDiskCacheProducer");
        C5999d b = this.f7383b.mo18608b(f, m10440e(f), p0Var.mo8237c());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f7382a.mo18597n(b, atomicBoolean).mo16163e(m10443h(lVar, p0Var, b));
        m10445j(atomicBoolean, p0Var);
    }
}
