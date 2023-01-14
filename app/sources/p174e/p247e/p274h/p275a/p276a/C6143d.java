package p174e.p247e.p274h.p275a.p276a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p257d.C6054f;
import p174e.p247e.p253d.p257d.C6058j;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6065n;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p266e.C6122c;
import p174e.p247e.p272g.p273a.C6139a;
import p174e.p247e.p274h.p275a.p276a.p277h.C6148a;
import p174e.p247e.p274h.p275a.p276a.p277h.C6149b;
import p174e.p247e.p274h.p275a.p276a.p278i.C6150a;
import p174e.p247e.p274h.p275a.p276a.p278i.C6151b;
import p174e.p247e.p274h.p275a.p276a.p278i.C6153d;
import p174e.p247e.p274h.p275a.p276a.p278i.C6155f;
import p174e.p247e.p274h.p275a.p276a.p278i.C6156g;
import p174e.p247e.p274h.p280b.C6163a;
import p174e.p247e.p274h.p281c.C6170a;
import p174e.p247e.p274h.p281c.C6174b;
import p174e.p247e.p274h.p282d.C6182a;
import p174e.p247e.p274h.p282d.p283b.C6183a;
import p174e.p247e.p274h.p284e.C6204p;
import p174e.p247e.p274h.p284e.C6205q;
import p174e.p247e.p274h.p287h.C6233b;
import p174e.p247e.p289i.p291b.p292a.C6250f;
import p174e.p247e.p294k.p300d.C6304s;
import p174e.p247e.p294k.p306j.C6365a;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p307k.C6372g;
import p174e.p247e.p294k.p309m.C6381e;
import p174e.p247e.p294k.p311o.C6384b;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: e.e.h.a.a.d */
public class C6143d extends C6170a<C6088a<C6367b>, C6372g> {

    /* renamed from: A */
    private static final Class<?> f16830A = C6143d.class;

    /* renamed from: B */
    private final Resources f16831B;

    /* renamed from: C */
    private final C6365a f16832C;

    /* renamed from: D */
    private final C6054f<C6365a> f16833D;

    /* renamed from: E */
    private final C6304s<C5999d, C6367b> f16834E;

    /* renamed from: F */
    private C5999d f16835F;

    /* renamed from: G */
    private C6065n<C6122c<C6088a<C6367b>>> f16836G;

    /* renamed from: H */
    private boolean f16837H;

    /* renamed from: I */
    private C6054f<C6365a> f16838I;

    /* renamed from: J */
    private C6156g f16839J;

    /* renamed from: K */
    private Set<C6381e> f16840K;

    /* renamed from: L */
    private C6151b f16841L;

    /* renamed from: M */
    private C6149b f16842M;

    /* renamed from: N */
    private C6384b f16843N;

    /* renamed from: O */
    private C6384b[] f16844O;

    /* renamed from: P */
    private C6384b f16845P;

    public C6143d(Resources resources, C6163a aVar, C6365a aVar2, Executor executor, C6304s<C5999d, C6367b> sVar, C6054f<C6365a> fVar) {
        super(aVar, executor, (String) null, (Object) null);
        this.f16831B = resources;
        this.f16832C = new C6140a(resources, aVar2);
        this.f16833D = fVar;
        this.f16834E = sVar;
    }

    /* renamed from: q0 */
    private void m23133q0(C6065n<C6122c<C6088a<C6367b>>> nVar) {
        this.f16836G = nVar;
        m23135u0((C6367b) null);
    }

    /* renamed from: t0 */
    private Drawable m23134t0(C6054f<C6365a> fVar, C6367b bVar) {
        Drawable b;
        if (fVar == null) {
            return null;
        }
        Iterator<C6365a> it = fVar.iterator();
        while (it.hasNext()) {
            C6365a next = it.next();
            if (next.mo18153a(bVar) && (b = next.mo18154b(bVar)) != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: u0 */
    private void m23135u0(C6367b bVar) {
        if (this.f16837H) {
            if (mo18284t() == null) {
                C6182a aVar = new C6182a();
                C6183a aVar2 = new C6183a(aVar);
                this.f16842M = new C6149b();
                mo18278l(aVar2);
                mo18267a0(aVar);
            }
            if (this.f16841L == null) {
                mo18165i0(this.f16842M);
            }
            if (mo18284t() instanceof C6182a) {
                mo18159C0(bVar, (C6182a) mo18284t());
            }
        }
    }

    /* renamed from: A0 */
    public void mo18156A0(C6054f<C6365a> fVar) {
        this.f16838I = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public Uri mo18157B() {
        return C6250f.m23697a(this.f16843N, this.f16845P, this.f16844O, C6384b.f17787c);
    }

    /* renamed from: B0 */
    public void mo18158B0(boolean z) {
        this.f16837H = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public void mo18159C0(C6367b bVar, C6182a aVar) {
        C6204p a;
        aVar.mo18328i(mo18286x());
        C6233b c = mo18270c();
        C6205q.C6207b bVar2 = null;
        if (!(c == null || (a = C6205q.m23514a(c.mo18464g())) == null)) {
            bVar2 = a.mo18438z();
        }
        aVar.mo18332m(bVar2);
        int b = this.f16842M.mo18198b();
        aVar.mo18331l(C6153d.m23189b(b), C6148a.m23179a(b));
        if (bVar != null) {
            aVar.mo18329j(bVar.mo15982e(), bVar.mo15981c());
            aVar.mo18330k(bVar.mo18873h());
            return;
        }
        aVar.mo18327h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo18162P(Drawable drawable) {
        if (drawable instanceof C6139a) {
            ((C6139a) drawable).mo18152a();
        }
    }

    /* renamed from: g */
    public void mo18164g(C6233b bVar) {
        super.mo18164g(bVar);
        m23135u0((C6367b) null);
    }

    /* renamed from: i0 */
    public synchronized void mo18165i0(C6151b bVar) {
        C6151b bVar2 = this.f16841L;
        if (bVar2 instanceof C6150a) {
            ((C6150a) bVar2).mo18199b(bVar);
        } else if (bVar2 != null) {
            this.f16841L = new C6150a(bVar2, bVar);
        } else {
            this.f16841L = bVar;
        }
    }

    /* renamed from: j0 */
    public synchronized void mo18166j0(C6381e eVar) {
        if (this.f16840K == null) {
            this.f16840K = new HashSet();
        }
        this.f16840K.add(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public void mo18167k0() {
        synchronized (this) {
            this.f16841L = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public Drawable mo18170n(C6088a<C6367b> aVar) {
        try {
            if (C6394b.m24481d()) {
                C6394b.m24478a("PipelineDraweeController#createDrawable");
            }
            C6062k.m22841i(C6088a.m22950z0(aVar));
            C6367b w0 = aVar.mo18082w0();
            m23135u0(w0);
            Drawable t0 = m23134t0(this.f16838I, w0);
            if (t0 != null) {
                return t0;
            }
            Drawable t02 = m23134t0(this.f16833D, w0);
            if (t02 != null) {
                if (C6394b.m24481d()) {
                    C6394b.m24479b();
                }
                return t02;
            }
            Drawable b = this.f16832C.mo18154b(w0);
            if (b != null) {
                if (C6394b.m24481d()) {
                    C6394b.m24479b();
                }
                return b;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + w0);
        } finally {
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public C6088a<C6367b> mo18173p() {
        if (C6394b.m24481d()) {
            C6394b.m24478a("PipelineDraweeController#getCachedImage");
        }
        try {
            C6304s<C5999d, C6367b> sVar = this.f16834E;
            if (sVar != null) {
                C5999d dVar = this.f16835F;
                if (dVar != null) {
                    C6088a<C6367b> aVar = sVar.get(dVar);
                    if (aVar == null || aVar.mo18082w0().mo18870a().mo18907a()) {
                        if (C6394b.m24481d()) {
                            C6394b.m24479b();
                        }
                        return aVar;
                    }
                    aVar.close();
                    if (C6394b.m24481d()) {
                        C6394b.m24479b();
                    }
                    return null;
                }
            }
            return null;
        } finally {
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public int mo18183z(C6088a<C6367b> aVar) {
        if (aVar != null) {
            return aVar.mo18083x0();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public C6372g mo18155A(C6088a<C6367b> aVar) {
        C6062k.m22841i(C6088a.m22950z0(aVar));
        return aVar.mo18082w0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return r2;
     */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p174e.p247e.p294k.p309m.C6381e mo18174p0() {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            e.e.h.a.a.i.b r1 = r3.f16841L     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0011
            e.e.h.a.a.i.c r0 = new e.e.h.a.a.i.c     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = r3.mo18286x()     // Catch:{ all -> 0x0023 }
            e.e.h.a.a.i.b r2 = r3.f16841L     // Catch:{ all -> 0x0023 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0023 }
        L_0x0011:
            java.util.Set<e.e.k.m.e> r1 = r3.f16840K     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            e.e.k.m.c r2 = new e.e.k.m.c     // Catch:{ all -> 0x0023 }
            r2.<init>((java.util.Set<p174e.p247e.p294k.p309m.C6381e>) r1)     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x001f
            r2.mo18918l(r0)     // Catch:{ all -> 0x0023 }
        L_0x001f:
            monitor-exit(r3)
            return r2
        L_0x0021:
            monitor-exit(r3)
            return r0
        L_0x0023:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p274h.p275a.p276a.C6143d.mo18174p0():e.e.k.m.e");
    }

    /* renamed from: r0 */
    public void mo18175r0(C6065n<C6122c<C6088a<C6367b>>> nVar, String str, C5999d dVar, Object obj, C6054f<C6365a> fVar, C6151b bVar) {
        if (C6394b.m24481d()) {
            C6394b.m24478a("PipelineDraweeController#initialize");
        }
        super.mo18263E(str, obj);
        m23133q0(nVar);
        this.f16835F = dVar;
        mo18156A0(fVar);
        mo18167k0();
        m23135u0((C6367b) null);
        mo18165i0(bVar);
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public synchronized void mo18176s0(C6155f fVar, C6174b<C6144e, C6384b, C6088a<C6367b>, C6372g> bVar, C6065n<Boolean> nVar) {
        C6156g gVar = this.f16839J;
        if (gVar != null) {
            gVar.mo18209f();
        }
        if (fVar != null) {
            if (this.f16839J == null) {
                this.f16839J = new C6156g(AwakeTimeSinceBootClock.get(), this, nVar);
            }
            this.f16839J.mo18206c(fVar);
            this.f16839J.mo18210g(true);
            this.f16839J.mo18211i(bVar);
        }
        this.f16843N = bVar.mo18309o();
        this.f16844O = (C6384b[]) bVar.mo18308n();
        this.f16845P = bVar.mo18310p();
    }

    public String toString() {
        return C6058j.m22827c(this).mo18044b("super", super.toString()).mo18044b("dataSourceSupplier", this.f16836G).toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public C6122c<C6088a<C6367b>> mo18178u() {
        if (C6394b.m24481d()) {
            C6394b.m24478a("PipelineDraweeController#getDataSource");
        }
        if (C6071a.m22886t(2)) {
            C6071a.m22888v(f16830A, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        C6122c<C6088a<C6367b>> cVar = this.f16836G.get();
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        return cVar;
    }

    /* renamed from: v0 */
    public Map<String, Object> mo18160K(C6372g gVar) {
        if (gVar == null) {
            return null;
        }
        return gVar.mo15980b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public void mo18161M(String str, C6088a<C6367b> aVar) {
        super.mo18161M(str, aVar);
        synchronized (this) {
            C6151b bVar = this.f16841L;
            if (bVar != null) {
                bVar.mo18197a(str, 6, true, "PipelineDraweeController");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public void mo18163R(C6088a<C6367b> aVar) {
        C6088a.m22949v0(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        return;
     */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo18182y0(p174e.p247e.p274h.p275a.p276a.p278i.C6151b r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            e.e.h.a.a.i.b r0 = r2.f16841L     // Catch:{ all -> 0x0015 }
            boolean r1 = r0 instanceof p174e.p247e.p274h.p275a.p276a.p278i.C6150a     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x000e
            e.e.h.a.a.i.a r0 = (p174e.p247e.p274h.p275a.p276a.p278i.C6150a) r0     // Catch:{ all -> 0x0015 }
            r0.mo18200c(r3)     // Catch:{ all -> 0x0015 }
            monitor-exit(r2)
            return
        L_0x000e:
            if (r0 != r3) goto L_0x0013
            r3 = 0
            r2.f16841L = r3     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r2)
            return
        L_0x0015:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p274h.p275a.p276a.C6143d.mo18182y0(e.e.h.a.a.i.b):void");
    }

    /* renamed from: z0 */
    public synchronized void mo18184z0(C6381e eVar) {
        Set<C6381e> set = this.f16840K;
        if (set != null) {
            set.remove(eVar);
        }
    }
}
