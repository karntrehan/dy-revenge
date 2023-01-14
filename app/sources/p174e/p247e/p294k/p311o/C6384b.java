package p174e.p247e.p294k.p311o;

import android.net.Uri;
import java.io.File;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p257d.C6053e;
import p174e.p247e.p253d.p257d.C6058j;
import p174e.p247e.p253d.p259f.C6074a;
import p174e.p247e.p253d.p264k.C6111f;
import p174e.p247e.p294k.p301e.C6312a;
import p174e.p247e.p294k.p301e.C6313b;
import p174e.p247e.p294k.p301e.C6315d;
import p174e.p247e.p294k.p301e.C6316e;
import p174e.p247e.p294k.p301e.C6317f;
import p174e.p247e.p294k.p309m.C6381e;

/* renamed from: e.e.k.o.b */
public class C6384b {

    /* renamed from: a */
    private static boolean f17785a;

    /* renamed from: b */
    private static boolean f17786b;

    /* renamed from: c */
    public static final C6053e<C6384b, Uri> f17787c = new C6385a();

    /* renamed from: d */
    private int f17788d;

    /* renamed from: e */
    private final C6386b f17789e;

    /* renamed from: f */
    private final Uri f17790f;

    /* renamed from: g */
    private final int f17791g;

    /* renamed from: h */
    private File f17792h;

    /* renamed from: i */
    private final boolean f17793i;

    /* renamed from: j */
    private final boolean f17794j;

    /* renamed from: k */
    private final C6313b f17795k;

    /* renamed from: l */
    private final C6316e f17796l;

    /* renamed from: m */
    private final C6317f f17797m;

    /* renamed from: n */
    private final C6312a f17798n;

    /* renamed from: o */
    private final C6315d f17799o;

    /* renamed from: p */
    private final C6387c f17800p;

    /* renamed from: q */
    private final boolean f17801q;

    /* renamed from: r */
    private final boolean f17802r;

    /* renamed from: s */
    private final Boolean f17803s;

    /* renamed from: t */
    private final C6390d f17804t;

    /* renamed from: u */
    private final C6381e f17805u;

    /* renamed from: v */
    private final Boolean f17806v;

    /* renamed from: w */
    private final int f17807w;

    /* renamed from: e.e.k.o.b$a */
    static class C6385a implements C6053e<C6384b, Uri> {
        C6385a() {
        }

        /* renamed from: a */
        public Uri apply(C6384b bVar) {
            if (bVar != null) {
                return bVar.mo18938r();
            }
            return null;
        }
    }

    /* renamed from: e.e.k.o.b$b */
    public enum C6386b {
        SMALL,
        DEFAULT
    }

    /* renamed from: e.e.k.o.b$c */
    public enum C6387c {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        

        /* renamed from: s */
        private int f17816s;

        private C6387c(int i) {
            this.f17816s = i;
        }

        /* renamed from: e */
        public static C6387c m24435e(C6387c cVar, C6387c cVar2) {
            return cVar.mo18945g() > cVar2.mo18945g() ? cVar : cVar2;
        }

        /* renamed from: g */
        public int mo18945g() {
            return this.f17816s;
        }
    }

    protected C6384b(C6388c cVar) {
        this.f17789e = cVar.mo18958d();
        Uri n = cVar.mo18968n();
        this.f17790f = n;
        this.f17791g = m24412t(n);
        this.f17793i = cVar.mo18972r();
        this.f17794j = cVar.mo18970p();
        this.f17795k = cVar.mo18960f();
        this.f17796l = cVar.mo18965k();
        this.f17797m = cVar.mo18967m() == null ? C6317f.m23927a() : cVar.mo18967m();
        this.f17798n = cVar.mo18957c();
        this.f17799o = cVar.mo18964j();
        this.f17800p = cVar.mo18961g();
        this.f17801q = cVar.mo18969o();
        this.f17802r = cVar.mo18971q();
        this.f17803s = cVar.mo18954I();
        this.f17804t = cVar.mo18962h();
        this.f17805u = cVar.mo18963i();
        this.f17806v = cVar.mo18966l();
        this.f17807w = cVar.mo18959e();
    }

    /* renamed from: a */
    public static C6384b m24411a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return C6388c.m24438s(uri).mo18956a();
    }

    /* renamed from: t */
    private static int m24412t(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (C6111f.m23008l(uri)) {
            return 0;
        }
        if (C6111f.m23006j(uri)) {
            return C6074a.m22923c(C6074a.m22922b(uri.getPath())) ? 2 : 3;
        }
        if (C6111f.m23005i(uri)) {
            return 4;
        }
        if (C6111f.m23002f(uri)) {
            return 5;
        }
        if (C6111f.m23007k(uri)) {
            return 6;
        }
        if (C6111f.m23001e(uri)) {
            return 7;
        }
        return C6111f.m23009m(uri) ? 8 : -1;
    }

    /* renamed from: b */
    public C6312a mo18920b() {
        return this.f17798n;
    }

    /* renamed from: c */
    public C6386b mo18921c() {
        return this.f17789e;
    }

    /* renamed from: d */
    public int mo18922d() {
        return this.f17807w;
    }

    /* renamed from: e */
    public C6313b mo18923e() {
        return this.f17795k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6384b)) {
            return false;
        }
        C6384b bVar = (C6384b) obj;
        if (f17785a) {
            int i = this.f17788d;
            int i2 = bVar.f17788d;
            if (!(i == 0 || i2 == 0 || i == i2)) {
                return false;
            }
        }
        if (this.f17794j != bVar.f17794j || this.f17801q != bVar.f17801q || this.f17802r != bVar.f17802r || !C6058j.m22825a(this.f17790f, bVar.f17790f) || !C6058j.m22825a(this.f17789e, bVar.f17789e) || !C6058j.m22825a(this.f17792h, bVar.f17792h) || !C6058j.m22825a(this.f17798n, bVar.f17798n) || !C6058j.m22825a(this.f17795k, bVar.f17795k) || !C6058j.m22825a(this.f17796l, bVar.f17796l) || !C6058j.m22825a(this.f17799o, bVar.f17799o) || !C6058j.m22825a(this.f17800p, bVar.f17800p) || !C6058j.m22825a(this.f17803s, bVar.f17803s) || !C6058j.m22825a(this.f17806v, bVar.f17806v) || !C6058j.m22825a(this.f17797m, bVar.f17797m)) {
            return false;
        }
        C6390d dVar = this.f17804t;
        C5999d dVar2 = null;
        C5999d c = dVar != null ? dVar.mo9953c() : null;
        C6390d dVar3 = bVar.f17804t;
        if (dVar3 != null) {
            dVar2 = dVar3.mo9953c();
        }
        return C6058j.m22825a(c, dVar2) && this.f17807w == bVar.f17807w;
    }

    /* renamed from: f */
    public boolean mo18925f() {
        return this.f17794j;
    }

    /* renamed from: g */
    public C6387c mo18926g() {
        return this.f17800p;
    }

    /* renamed from: h */
    public C6390d mo18927h() {
        return this.f17804t;
    }

    public int hashCode() {
        boolean z = f17786b;
        int i = z ? this.f17788d : 0;
        if (i == 0) {
            C6390d dVar = this.f17804t;
            i = C6058j.m22826b(this.f17789e, this.f17790f, Boolean.valueOf(this.f17794j), this.f17798n, this.f17799o, this.f17800p, Boolean.valueOf(this.f17801q), Boolean.valueOf(this.f17802r), this.f17795k, this.f17803s, this.f17796l, this.f17797m, dVar != null ? dVar.mo9953c() : null, this.f17806v, Integer.valueOf(this.f17807w));
            if (z) {
                this.f17788d = i;
            }
        }
        return i;
    }

    /* renamed from: i */
    public int mo18929i() {
        C6316e eVar = this.f17796l;
        if (eVar != null) {
            return eVar.f17471b;
        }
        return 2048;
    }

    /* renamed from: j */
    public int mo18930j() {
        C6316e eVar = this.f17796l;
        if (eVar != null) {
            return eVar.f17470a;
        }
        return 2048;
    }

    /* renamed from: k */
    public C6315d mo18931k() {
        return this.f17799o;
    }

    /* renamed from: l */
    public boolean mo18932l() {
        return this.f17793i;
    }

    /* renamed from: m */
    public C6381e mo18933m() {
        return this.f17805u;
    }

    /* renamed from: n */
    public C6316e mo18934n() {
        return this.f17796l;
    }

    /* renamed from: o */
    public Boolean mo18935o() {
        return this.f17806v;
    }

    /* renamed from: p */
    public C6317f mo18936p() {
        return this.f17797m;
    }

    /* renamed from: q */
    public synchronized File mo18937q() {
        if (this.f17792h == null) {
            this.f17792h = new File(this.f17790f.getPath());
        }
        return this.f17792h;
    }

    /* renamed from: r */
    public Uri mo18938r() {
        return this.f17790f;
    }

    /* renamed from: s */
    public int mo18939s() {
        return this.f17791g;
    }

    public String toString() {
        return C6058j.m22827c(this).mo18044b("uri", this.f17790f).mo18044b("cacheChoice", this.f17789e).mo18044b("decodeOptions", this.f17795k).mo18044b("postprocessor", this.f17804t).mo18044b("priority", this.f17799o).mo18044b("resizeOptions", this.f17796l).mo18044b("rotationOptions", this.f17797m).mo18044b("bytesRange", this.f17798n).mo18044b("resizingAllowedOverride", this.f17806v).mo18045c("progressiveRenderingEnabled", this.f17793i).mo18045c("localThumbnailPreviewsEnabled", this.f17794j).mo18044b("lowestPermittedRequestLevel", this.f17800p).mo18045c("isDiskCacheEnabled", this.f17801q).mo18045c("isMemoryCacheEnabled", this.f17802r).mo18044b("decodePrefetches", this.f17803s).mo18043a("delayMs", this.f17807w).toString();
    }

    /* renamed from: u */
    public boolean mo18941u() {
        return this.f17801q;
    }

    /* renamed from: v */
    public boolean mo18942v() {
        return this.f17802r;
    }

    /* renamed from: w */
    public Boolean mo18943w() {
        return this.f17803s;
    }
}
