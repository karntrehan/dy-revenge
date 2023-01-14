package p174e.p247e.p294k.p302f;

import android.content.Context;
import android.os.Build;
import com.facebook.imagepipeline.platform.C2444d;
import com.facebook.imagepipeline.platform.C2445e;
import com.facebook.imagepipeline.producers.C2458a1;
import com.facebook.imagepipeline.producers.C2551v;
import com.facebook.imagepipeline.producers.C2566z0;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p249b.p251b.C6030i;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p295a.p296a.C6257a;
import p174e.p247e.p294k.p295a.p296a.C6258b;
import p174e.p247e.p294k.p299c.C6270f;
import p174e.p247e.p294k.p299c.C6271g;
import p174e.p247e.p294k.p300d.C6277e;
import p174e.p247e.p294k.p300d.C6287i;
import p174e.p247e.p294k.p300d.C6293m;
import p174e.p247e.p294k.p300d.C6295n;
import p174e.p247e.p294k.p300d.C6298p;
import p174e.p247e.p294k.p300d.C6299q;
import p174e.p247e.p294k.p305i.C6355b;
import p174e.p247e.p294k.p305i.C6357c;
import p174e.p247e.p294k.p306j.C6365a;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p312p.C6394b;
import p174e.p247e.p294k.p313q.C6402d;

/* renamed from: e.e.k.f.l */
public class C6341l {

    /* renamed from: a */
    private static final Class<?> f17642a = C6341l.class;

    /* renamed from: b */
    private static C6341l f17643b;

    /* renamed from: c */
    private static boolean f17644c;

    /* renamed from: d */
    private static C6327h f17645d;

    /* renamed from: e */
    private final C2566z0 f17646e;

    /* renamed from: f */
    private final C6335j f17647f;

    /* renamed from: g */
    private final C6319a f17648g;

    /* renamed from: h */
    private C6287i<C5999d, C6367b> f17649h;

    /* renamed from: i */
    private C6298p<C5999d, C6367b> f17650i;

    /* renamed from: j */
    private C6287i<C5999d, C6082g> f17651j;

    /* renamed from: k */
    private C6298p<C5999d, C6082g> f17652k;

    /* renamed from: l */
    private C6277e f17653l;

    /* renamed from: m */
    private C6030i f17654m;

    /* renamed from: n */
    private C6357c f17655n;

    /* renamed from: o */
    private C6327h f17656o;

    /* renamed from: p */
    private C6402d f17657p;

    /* renamed from: q */
    private C6345o f17658q;

    /* renamed from: r */
    private C6346p f17659r;

    /* renamed from: s */
    private C6277e f17660s;

    /* renamed from: t */
    private C6030i f17661t;

    /* renamed from: u */
    private C6270f f17662u;

    /* renamed from: v */
    private C2444d f17663v;

    /* renamed from: w */
    private C6257a f17664w;

    public C6341l(C6335j jVar) {
        if (C6394b.m24481d()) {
            C6394b.m24478a("ImagePipelineConfig()");
        }
        C6335j jVar2 = (C6335j) C6062k.m22839g(jVar);
        this.f17647f = jVar2;
        this.f17646e = jVar2.mo18733D().mo18790t() ? new C2551v(jVar.mo18735F().mo18700b()) : new C2458a1(jVar.mo18735F().mo18700b());
        C6088a.m22945F0(jVar.mo18733D().mo18772b());
        this.f17648g = new C6319a(jVar.mo18742g());
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
    }

    /* renamed from: a */
    private C6327h m24147a() {
        return new C6327h(m24153r(), this.f17647f.mo18747l(), this.f17647f.mo18738c(), this.f17647f.mo18740e(), mo18801e(), mo18804h(), mo18806m(), m24154s(), this.f17647f.mo18748m(), this.f17646e, this.f17647f.mo18733D().mo18779i(), this.f17647f.mo18733D().mo18792v(), this.f17647f.mo18730A(), this.f17647f);
    }

    /* renamed from: c */
    private C6257a m24148c() {
        if (this.f17664w == null) {
            this.f17664w = C6258b.m23725a(mo18808o(), this.f17647f.mo18735F(), mo18800d(), this.f17647f.mo18733D().mo18768A(), this.f17647f.mo18756u());
        }
        return this.f17664w;
    }

    /* renamed from: i */
    private C6357c m24149i() {
        C6357c cVar;
        C6357c cVar2;
        if (this.f17655n == null) {
            if (this.f17647f.mo18732C() != null) {
                this.f17655n = this.f17647f.mo18732C();
            } else {
                C6257a c = m24148c();
                if (c != null) {
                    cVar = c.mo18574b();
                    cVar2 = c.mo18575c();
                } else {
                    cVar2 = null;
                    cVar = null;
                }
                if (this.f17647f.mo18760y() == null) {
                    this.f17655n = new C6355b(cVar, cVar2, mo18809p());
                } else {
                    mo18809p();
                    this.f17647f.mo18760y();
                    throw null;
                }
            }
        }
        return this.f17655n;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [e.e.k.q.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p174e.p247e.p294k.p313q.C6402d m24150k() {
        /*
            r8 = this;
            e.e.k.q.d r0 = r8.f17657p
            if (r0 != 0) goto L_0x0062
            e.e.k.f.j r0 = r8.f17647f
            e.e.k.q.d r0 = r0.mo18758w()
            if (r0 != 0) goto L_0x0030
            e.e.k.f.j r0 = r8.f17647f
            java.lang.Integer r0 = r0.mo18757v()
            if (r0 != 0) goto L_0x0030
            e.e.k.f.j r0 = r8.f17647f
            e.e.k.f.k r0 = r0.mo18733D()
            boolean r0 = r0.mo18793w()
            if (r0 == 0) goto L_0x0030
            e.e.k.q.h r0 = new e.e.k.q.h
            e.e.k.f.j r1 = r8.f17647f
            e.e.k.f.k r1 = r1.mo18733D()
            int r1 = r1.mo18776f()
            r0.<init>(r1)
            goto L_0x0060
        L_0x0030:
            e.e.k.q.f r0 = new e.e.k.q.f
            e.e.k.f.j r1 = r8.f17647f
            e.e.k.f.k r1 = r1.mo18733D()
            int r3 = r1.mo18776f()
            e.e.k.f.j r1 = r8.f17647f
            e.e.k.f.k r1 = r1.mo18733D()
            boolean r4 = r1.mo18782l()
            e.e.k.f.j r1 = r8.f17647f
            e.e.k.q.d r5 = r1.mo18758w()
            e.e.k.f.j r1 = r8.f17647f
            java.lang.Integer r6 = r1.mo18757v()
            e.e.k.f.j r1 = r8.f17647f
            e.e.k.f.k r1 = r1.mo18733D()
            boolean r7 = r1.mo18789s()
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0060:
            r8.f17657p = r0
        L_0x0062:
            e.e.k.q.d r0 = r8.f17657p
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p294k.p302f.C6341l.m24150k():e.e.k.q.d");
    }

    /* renamed from: l */
    public static C6341l m24151l() {
        return (C6341l) C6062k.m22840h(f17643b, "ImagePipelineFactory was not initialized!");
    }

    /* renamed from: q */
    private C6345o m24152q() {
        if (this.f17658q == null) {
            this.f17658q = this.f17647f.mo18733D().mo18778h().mo18798a(this.f17647f.mo18736a(), this.f17647f.mo18737b().mo8121k(), m24149i(), this.f17647f.mo18751p(), this.f17647f.mo18755t(), this.f17647f.mo18749n(), this.f17647f.mo18733D().mo18785o(), this.f17647f.mo18735F(), this.f17647f.mo18737b().mo8119i(this.f17647f.mo18739d()), this.f17647f.mo18737b().mo8120j(), mo18801e(), mo18804h(), mo18806m(), m24154s(), this.f17647f.mo18748m(), mo18808o(), this.f17647f.mo18733D().mo18775e(), this.f17647f.mo18733D().mo18774d(), this.f17647f.mo18733D().mo18773c(), this.f17647f.mo18733D().mo18776f(), mo18802f(), this.f17647f.mo18733D().mo18769B(), this.f17647f.mo18733D().mo18780j());
        }
        return this.f17658q;
    }

    /* renamed from: r */
    private C6346p m24153r() {
        boolean z = Build.VERSION.SDK_INT >= 24 && this.f17647f.mo18733D().mo18781k();
        if (this.f17659r == null) {
            this.f17659r = new C6346p(this.f17647f.mo18736a().getApplicationContext().getContentResolver(), m24152q(), this.f17647f.mo18744i(), this.f17647f.mo18749n(), this.f17647f.mo18733D().mo18795y(), this.f17646e, this.f17647f.mo18755t(), z, this.f17647f.mo18733D().mo18794x(), this.f17647f.mo18761z(), m24150k(), this.f17647f.mo18733D().mo18788r(), this.f17647f.mo18733D().mo18786p(), this.f17647f.mo18733D().mo18770C(), this.f17647f.mo18733D().mo18771a());
        }
        return this.f17659r;
    }

    /* renamed from: s */
    private C6277e m24154s() {
        if (this.f17660s == null) {
            this.f17660s = new C6277e(mo18810t(), this.f17647f.mo18737b().mo8119i(this.f17647f.mo18739d()), this.f17647f.mo18737b().mo8120j(), this.f17647f.mo18735F().mo18703e(), this.f17647f.mo18735F().mo18702d(), this.f17647f.mo18753r());
        }
        return this.f17660s;
    }

    /* renamed from: u */
    public static synchronized void m24155u(Context context) {
        synchronized (C6341l.class) {
            if (C6394b.m24481d()) {
                C6394b.m24478a("ImagePipelineFactory#initialize");
            }
            m24156v(C6331i.m23989K(context).mo18763K());
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
    }

    /* renamed from: v */
    public static synchronized void m24156v(C6335j jVar) {
        synchronized (C6341l.class) {
            if (f17643b != null) {
                C6071a.m22855C(f17642a, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            f17643b = new C6341l(jVar);
        }
    }

    /* renamed from: b */
    public C6365a mo18799b(Context context) {
        C6257a c = m24148c();
        if (c == null) {
            return null;
        }
        return c.mo18573a(context);
    }

    /* renamed from: d */
    public C6287i<C5999d, C6367b> mo18800d() {
        if (this.f17649h == null) {
            this.f17649h = this.f17647f.mo18743h().mo18587a(this.f17647f.mo18731B(), this.f17647f.mo18759x(), this.f17647f.mo18750o(), this.f17647f.mo18754s());
        }
        return this.f17649h;
    }

    /* renamed from: e */
    public C6298p<C5999d, C6367b> mo18801e() {
        if (this.f17650i == null) {
            this.f17650i = C6299q.m23838a(mo18800d(), this.f17647f.mo18753r());
        }
        return this.f17650i;
    }

    /* renamed from: f */
    public C6319a mo18802f() {
        return this.f17648g;
    }

    /* renamed from: g */
    public C6287i<C5999d, C6082g> mo18803g() {
        if (this.f17651j == null) {
            this.f17651j = C6293m.m23810a(this.f17647f.mo18734E(), this.f17647f.mo18759x());
        }
        return this.f17651j;
    }

    /* renamed from: h */
    public C6298p<C5999d, C6082g> mo18804h() {
        if (this.f17652k == null) {
            this.f17652k = C6295n.m23813a(this.f17647f.mo18745j() != null ? this.f17647f.mo18745j() : mo18803g(), this.f17647f.mo18753r());
        }
        return this.f17652k;
    }

    /* renamed from: j */
    public C6327h mo18805j() {
        if (f17644c) {
            if (f17645d == null) {
                C6327h a = m24147a();
                f17645d = a;
                this.f17656o = a;
            }
            return f17645d;
        }
        if (this.f17656o == null) {
            this.f17656o = m24147a();
        }
        return this.f17656o;
    }

    /* renamed from: m */
    public C6277e mo18806m() {
        if (this.f17653l == null) {
            this.f17653l = new C6277e(mo18807n(), this.f17647f.mo18737b().mo8119i(this.f17647f.mo18739d()), this.f17647f.mo18737b().mo8120j(), this.f17647f.mo18735F().mo18703e(), this.f17647f.mo18735F().mo18702d(), this.f17647f.mo18753r());
        }
        return this.f17653l;
    }

    /* renamed from: n */
    public C6030i mo18807n() {
        if (this.f17654m == null) {
            this.f17654m = this.f17647f.mo18741f().mo18706a(this.f17647f.mo18746k());
        }
        return this.f17654m;
    }

    /* renamed from: o */
    public C6270f mo18808o() {
        if (this.f17662u == null) {
            this.f17662u = C6271g.m23749a(this.f17647f.mo18737b(), mo18809p(), mo18802f());
        }
        return this.f17662u;
    }

    /* renamed from: p */
    public C2444d mo18809p() {
        if (this.f17663v == null) {
            this.f17663v = C2445e.m10175a(this.f17647f.mo18737b(), this.f17647f.mo18733D().mo18791u());
        }
        return this.f17663v;
    }

    /* renamed from: t */
    public C6030i mo18810t() {
        if (this.f17661t == null) {
            this.f17661t = this.f17647f.mo18741f().mo18706a(this.f17647f.mo18752q());
        }
        return this.f17661t;
    }
}
