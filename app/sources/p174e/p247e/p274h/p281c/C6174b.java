package p174e.p247e.p274h.p281c;

import android.content.Context;
import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p174e.p247e.p253d.p257d.C6058j;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6065n;
import p174e.p247e.p266e.C6122c;
import p174e.p247e.p266e.C6123d;
import p174e.p247e.p266e.C6126f;
import p174e.p247e.p266e.C6130g;
import p174e.p247e.p274h.p281c.C6174b;
import p174e.p247e.p274h.p286g.C6230a;
import p174e.p247e.p274h.p287h.C6232a;
import p174e.p247e.p274h.p287h.C6235d;
import p174e.p247e.p289i.p291b.p292a.C6245b;
import p174e.p247e.p289i.p291b.p292a.C6249e;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: e.e.h.c.b */
public abstract class C6174b<BUILDER extends C6174b<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements C6235d {

    /* renamed from: a */
    private static final C6179d<Object> f17016a = new C6175a();

    /* renamed from: b */
    private static final NullPointerException f17017b = new NullPointerException("No image request was specified!");

    /* renamed from: c */
    private static final AtomicLong f17018c = new AtomicLong();

    /* renamed from: d */
    private final Context f17019d;

    /* renamed from: e */
    private final Set<C6179d> f17020e;

    /* renamed from: f */
    private final Set<C6245b> f17021f;

    /* renamed from: g */
    private Object f17022g;

    /* renamed from: h */
    private REQUEST f17023h;

    /* renamed from: i */
    private REQUEST f17024i;

    /* renamed from: j */
    private REQUEST[] f17025j;

    /* renamed from: k */
    private boolean f17026k;

    /* renamed from: l */
    private C6065n<C6122c<IMAGE>> f17027l;

    /* renamed from: m */
    private C6179d<? super INFO> f17028m;

    /* renamed from: n */
    private C6249e f17029n;

    /* renamed from: o */
    private C6180e f17030o;

    /* renamed from: p */
    private boolean f17031p;

    /* renamed from: q */
    private boolean f17032q;

    /* renamed from: r */
    private boolean f17033r;

    /* renamed from: s */
    private String f17034s;

    /* renamed from: t */
    private C6232a f17035t;

    /* renamed from: e.e.h.c.b$a */
    static class C6175a extends C6178c<Object> {
        C6175a() {
        }

        /* renamed from: e */
        public void mo9987e(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* renamed from: e.e.h.c.b$b */
    class C6176b implements C6065n<C6122c<IMAGE>> {

        /* renamed from: a */
        final /* synthetic */ C6232a f17036a;

        /* renamed from: b */
        final /* synthetic */ String f17037b;

        /* renamed from: c */
        final /* synthetic */ Object f17038c;

        /* renamed from: d */
        final /* synthetic */ Object f17039d;

        /* renamed from: e */
        final /* synthetic */ C6177c f17040e;

        C6176b(C6232a aVar, String str, Object obj, Object obj2, C6177c cVar) {
            this.f17036a = aVar;
            this.f17037b = str;
            this.f17038c = obj;
            this.f17039d = obj2;
            this.f17040e = cVar;
        }

        /* renamed from: a */
        public C6122c<IMAGE> get() {
            return C6174b.this.mo18191j(this.f17036a, this.f17037b, this.f17038c, this.f17039d, this.f17040e);
        }

        public String toString() {
            return C6058j.m22827c(this).mo18044b("request", this.f17038c.toString()).toString();
        }
    }

    /* renamed from: e.e.h.c.b$c */
    public enum C6177c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    protected C6174b(Context context, Set<C6179d> set, Set<C6245b> set2) {
        this.f17019d = context;
        this.f17020e = set;
        this.f17021f = set2;
        m23338t();
    }

    /* renamed from: f */
    protected static String m23337f() {
        return String.valueOf(f17018c.getAndIncrement());
    }

    /* renamed from: t */
    private void m23338t() {
        this.f17022g = null;
        this.f17023h = null;
        this.f17024i = null;
        this.f17025j = null;
        this.f17026k = true;
        this.f17028m = null;
        this.f17029n = null;
        this.f17030o = null;
        this.f17031p = false;
        this.f17032q = false;
        this.f17035t = null;
        this.f17034s = null;
    }

    /* renamed from: A */
    public BUILDER mo18291A(boolean z) {
        this.f17032q = z;
        return mo18313s();
    }

    /* renamed from: B */
    public BUILDER mo18292B(Object obj) {
        this.f17022g = obj;
        return mo18313s();
    }

    /* renamed from: C */
    public BUILDER mo18293C(C6179d<? super INFO> dVar) {
        this.f17028m = dVar;
        return mo18313s();
    }

    /* renamed from: D */
    public BUILDER mo18294D(REQUEST request) {
        this.f17023h = request;
        return mo18313s();
    }

    /* renamed from: E */
    public BUILDER mo18295E(REQUEST request) {
        this.f17024i = request;
        return mo18313s();
    }

    /* renamed from: F */
    public BUILDER mo18300d(C6232a aVar) {
        this.f17035t = aVar;
        return mo18313s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo18297G() {
        boolean z = false;
        C6062k.m22842j(this.f17025j == null || this.f17023h == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f17027l == null || (this.f17025j == null && this.f17023h == null && this.f17024i == null)) {
            z = true;
        }
        C6062k.m22842j(z, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    /* renamed from: a */
    public C6170a mo18299b() {
        REQUEST request;
        mo18297G();
        if (this.f17023h == null && this.f17025j == null && (request = this.f17024i) != null) {
            this.f17023h = request;
            this.f17024i = null;
        }
        return mo18301e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C6170a mo18301e() {
        if (C6394b.m24481d()) {
            C6394b.m24478a("AbstractDraweeControllerBuilder#buildController");
        }
        C6170a x = mo18192x();
        x.mo18273d0(mo18312r());
        x.mo18266Z(mo18303h());
        x.mo18269b0(mo18304i());
        mo18316w(x);
        mo18314u(x);
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        return x;
    }

    /* renamed from: g */
    public Object mo18302g() {
        return this.f17022g;
    }

    /* renamed from: h */
    public String mo18303h() {
        return this.f17034s;
    }

    /* renamed from: i */
    public C6180e mo18304i() {
        return this.f17030o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract C6122c<IMAGE> mo18191j(C6232a aVar, String str, REQUEST request, Object obj, C6177c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C6065n<C6122c<IMAGE>> mo18305k(C6232a aVar, String str, REQUEST request) {
        return mo18306l(aVar, str, request, C6177c.FULL_FETCH);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C6065n<C6122c<IMAGE>> mo18306l(C6232a aVar, String str, REQUEST request, C6177c cVar) {
        return new C6176b(aVar, str, request, mo18302g(), cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C6065n<C6122c<IMAGE>> mo18307m(C6232a aVar, String str, REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST l : requestArr) {
                arrayList.add(mo18306l(aVar, str, l, C6177c.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST k : requestArr) {
            arrayList.add(mo18305k(aVar, str, k));
        }
        return C6126f.m23071b(arrayList);
    }

    /* renamed from: n */
    public REQUEST[] mo18308n() {
        return this.f17025j;
    }

    /* renamed from: o */
    public REQUEST mo18309o() {
        return this.f17023h;
    }

    /* renamed from: p */
    public REQUEST mo18310p() {
        return this.f17024i;
    }

    /* renamed from: q */
    public C6232a mo18311q() {
        return this.f17035t;
    }

    /* renamed from: r */
    public boolean mo18312r() {
        return this.f17033r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final BUILDER mo18313s() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo18314u(C6170a aVar) {
        Set<C6179d> set = this.f17020e;
        if (set != null) {
            for (C6179d l : set) {
                aVar.mo18278l(l);
            }
        }
        Set<C6245b> set2 = this.f17021f;
        if (set2 != null) {
            for (C6245b m : set2) {
                aVar.mo18279m(m);
            }
        }
        C6179d<? super INFO> dVar = this.f17028m;
        if (dVar != null) {
            aVar.mo18278l(dVar);
        }
        if (this.f17032q) {
            aVar.mo18278l(f17016a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo18315v(C6170a aVar) {
        if (aVar.mo18285w() == null) {
            aVar.mo18271c0(C6230a.m23618c(this.f17019d));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo18316w(C6170a aVar) {
        if (this.f17031p) {
            aVar.mo18262C().mo18260d(this.f17031p);
            mo18315v(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract C6170a mo18192x();

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C6065n<C6122c<IMAGE>> mo18317y(C6232a aVar, String str) {
        C6065n<C6122c<IMAGE>> nVar = this.f17027l;
        if (nVar != null) {
            return nVar;
        }
        C6065n<C6122c<IMAGE>> nVar2 = null;
        REQUEST request = this.f17023h;
        if (request != null) {
            nVar2 = mo18305k(aVar, str, request);
        } else {
            REQUEST[] requestArr = this.f17025j;
            if (requestArr != null) {
                nVar2 = mo18307m(aVar, str, requestArr, this.f17026k);
            }
        }
        if (!(nVar2 == null || this.f17024i == null)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(nVar2);
            arrayList.add(mo18305k(aVar, str, this.f17024i));
            nVar2 = C6130g.m23092c(arrayList, false);
        }
        return nVar2 == null ? C6123d.m23063a(f17017b) : nVar2;
    }

    /* renamed from: z */
    public BUILDER mo18318z() {
        m23338t();
        return mo18313s();
    }
}
