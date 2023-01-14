package p174e.p247e.p294k.p311o;

import android.net.Uri;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p264k.C6111f;
import p174e.p247e.p294k.p301e.C6312a;
import p174e.p247e.p294k.p301e.C6313b;
import p174e.p247e.p294k.p301e.C6315d;
import p174e.p247e.p294k.p301e.C6316e;
import p174e.p247e.p294k.p301e.C6317f;
import p174e.p247e.p294k.p302f.C6331i;
import p174e.p247e.p294k.p309m.C6381e;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: e.e.k.o.c */
public class C6388c {

    /* renamed from: a */
    private Uri f17817a = null;

    /* renamed from: b */
    private C6384b.C6387c f17818b = C6384b.C6387c.FULL_FETCH;

    /* renamed from: c */
    private C6316e f17819c = null;

    /* renamed from: d */
    private C6317f f17820d = null;

    /* renamed from: e */
    private C6313b f17821e = C6313b.m23910a();

    /* renamed from: f */
    private C6384b.C6386b f17822f = C6384b.C6386b.DEFAULT;

    /* renamed from: g */
    private boolean f17823g = C6331i.m23985G().mo18767a();

    /* renamed from: h */
    private boolean f17824h = false;

    /* renamed from: i */
    private C6315d f17825i = C6315d.HIGH;

    /* renamed from: j */
    private C6390d f17826j = null;

    /* renamed from: k */
    private boolean f17827k = true;

    /* renamed from: l */
    private boolean f17828l = true;

    /* renamed from: m */
    private Boolean f17829m = null;

    /* renamed from: n */
    private C6381e f17830n;

    /* renamed from: o */
    private C6312a f17831o = null;

    /* renamed from: p */
    private Boolean f17832p = null;

    /* renamed from: q */
    private int f17833q;

    /* renamed from: e.e.k.o.c$a */
    public static class C6389a extends RuntimeException {
        public C6389a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private C6388c() {
    }

    /* renamed from: b */
    public static C6388c m24437b(C6384b bVar) {
        return m24438s(bVar.mo18938r()).mo18977x(bVar.mo18923e()).mo18974u(bVar.mo18920b()).mo18975v(bVar.mo18921c()).mo18978y(bVar.mo18925f()).mo18979z(bVar.mo18926g()).mo18946A(bVar.mo18927h()).mo18947B(bVar.mo18932l()).mo18949D(bVar.mo18931k()).mo18950E(bVar.mo18934n()).mo18948C(bVar.mo18933m()).mo18951F(bVar.mo18936p()).mo18952G(bVar.mo18943w()).mo18976w(bVar.mo18922d());
    }

    /* renamed from: s */
    public static C6388c m24438s(Uri uri) {
        return new C6388c().mo18953H(uri);
    }

    /* renamed from: A */
    public C6388c mo18946A(C6390d dVar) {
        this.f17826j = dVar;
        return this;
    }

    /* renamed from: B */
    public C6388c mo18947B(boolean z) {
        this.f17823g = z;
        return this;
    }

    /* renamed from: C */
    public C6388c mo18948C(C6381e eVar) {
        this.f17830n = eVar;
        return this;
    }

    /* renamed from: D */
    public C6388c mo18949D(C6315d dVar) {
        this.f17825i = dVar;
        return this;
    }

    /* renamed from: E */
    public C6388c mo18950E(C6316e eVar) {
        this.f17819c = eVar;
        return this;
    }

    /* renamed from: F */
    public C6388c mo18951F(C6317f fVar) {
        this.f17820d = fVar;
        return this;
    }

    /* renamed from: G */
    public C6388c mo18952G(Boolean bool) {
        this.f17829m = bool;
        return this;
    }

    /* renamed from: H */
    public C6388c mo18953H(Uri uri) {
        C6062k.m22839g(uri);
        this.f17817a = uri;
        return this;
    }

    /* renamed from: I */
    public Boolean mo18954I() {
        return this.f17829m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo18955J() {
        Uri uri = this.f17817a;
        if (uri != null) {
            if (C6111f.m23007k(uri)) {
                if (!this.f17817a.isAbsolute()) {
                    throw new C6389a("Resource URI path must be absolute.");
                } else if (!this.f17817a.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(this.f17817a.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new C6389a("Resource URI path must be a resource id.");
                    }
                } else {
                    throw new C6389a("Resource URI must not be empty");
                }
            }
            if (C6111f.m23002f(this.f17817a) && !this.f17817a.isAbsolute()) {
                throw new C6389a("Asset URI path must be absolute.");
            }
            return;
        }
        throw new C6389a("Source must be set!");
    }

    /* renamed from: a */
    public C6384b mo18956a() {
        mo18955J();
        return new C6384b(this);
    }

    /* renamed from: c */
    public C6312a mo18957c() {
        return this.f17831o;
    }

    /* renamed from: d */
    public C6384b.C6386b mo18958d() {
        return this.f17822f;
    }

    /* renamed from: e */
    public int mo18959e() {
        return this.f17833q;
    }

    /* renamed from: f */
    public C6313b mo18960f() {
        return this.f17821e;
    }

    /* renamed from: g */
    public C6384b.C6387c mo18961g() {
        return this.f17818b;
    }

    /* renamed from: h */
    public C6390d mo18962h() {
        return this.f17826j;
    }

    /* renamed from: i */
    public C6381e mo18963i() {
        return this.f17830n;
    }

    /* renamed from: j */
    public C6315d mo18964j() {
        return this.f17825i;
    }

    /* renamed from: k */
    public C6316e mo18965k() {
        return this.f17819c;
    }

    /* renamed from: l */
    public Boolean mo18966l() {
        return this.f17832p;
    }

    /* renamed from: m */
    public C6317f mo18967m() {
        return this.f17820d;
    }

    /* renamed from: n */
    public Uri mo18968n() {
        return this.f17817a;
    }

    /* renamed from: o */
    public boolean mo18969o() {
        return this.f17827k && C6111f.m23008l(this.f17817a);
    }

    /* renamed from: p */
    public boolean mo18970p() {
        return this.f17824h;
    }

    /* renamed from: q */
    public boolean mo18971q() {
        return this.f17828l;
    }

    /* renamed from: r */
    public boolean mo18972r() {
        return this.f17823g;
    }

    @Deprecated
    /* renamed from: t */
    public C6388c mo18973t(boolean z) {
        return mo18951F(z ? C6317f.m23927a() : C6317f.m23929d());
    }

    /* renamed from: u */
    public C6388c mo18974u(C6312a aVar) {
        this.f17831o = aVar;
        return this;
    }

    /* renamed from: v */
    public C6388c mo18975v(C6384b.C6386b bVar) {
        this.f17822f = bVar;
        return this;
    }

    /* renamed from: w */
    public C6388c mo18976w(int i) {
        this.f17833q = i;
        return this;
    }

    /* renamed from: x */
    public C6388c mo18977x(C6313b bVar) {
        this.f17821e = bVar;
        return this;
    }

    /* renamed from: y */
    public C6388c mo18978y(boolean z) {
        this.f17824h = z;
        return this;
    }

    /* renamed from: z */
    public C6388c mo18979z(C6384b.C6387c cVar) {
        this.f17818b = cVar;
        return this;
    }
}
