package p174e.p247e.p294k.p302f;

import android.net.Uri;
import com.facebook.imagepipeline.producers.C2529o0;
import com.facebook.imagepipeline.producers.C2552v0;
import com.facebook.imagepipeline.producers.C2565z;
import com.facebook.imagepipeline.producers.C2566z0;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p252c.C6032a;
import p174e.p247e.p253d.p257d.C6063l;
import p174e.p247e.p253d.p257d.C6065n;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p266e.C6122c;
import p174e.p247e.p266e.C6123d;
import p174e.p247e.p294k.p300d.C6277e;
import p174e.p247e.p294k.p300d.C6283f;
import p174e.p247e.p294k.p300d.C6304s;
import p174e.p247e.p294k.p301e.C6315d;
import p174e.p247e.p294k.p303g.C6351d;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p309m.C6378b;
import p174e.p247e.p294k.p309m.C6379c;
import p174e.p247e.p294k.p309m.C6380d;
import p174e.p247e.p294k.p309m.C6381e;
import p174e.p247e.p294k.p311o.C6384b;
import p174e.p247e.p294k.p311o.C6388c;

/* renamed from: e.e.k.f.h */
public class C6327h {

    /* renamed from: a */
    private static final CancellationException f17488a = new CancellationException("Prefetching is not enabled");

    /* renamed from: b */
    private final C6346p f17489b;

    /* renamed from: c */
    private final C6381e f17490c;

    /* renamed from: d */
    private final C6380d f17491d;

    /* renamed from: e */
    private final C6065n<Boolean> f17492e;

    /* renamed from: f */
    private final C6304s<C5999d, C6367b> f17493f;

    /* renamed from: g */
    private final C6304s<C5999d, C6082g> f17494g;

    /* renamed from: h */
    private final C6277e f17495h;

    /* renamed from: i */
    private final C6277e f17496i;

    /* renamed from: j */
    private final C6283f f17497j;

    /* renamed from: k */
    private final C2566z0 f17498k;

    /* renamed from: l */
    private final C6065n<Boolean> f17499l;

    /* renamed from: m */
    private AtomicLong f17500m = new AtomicLong();

    /* renamed from: n */
    private final C6065n<Boolean> f17501n;

    /* renamed from: o */
    private final C6032a f17502o;

    /* renamed from: p */
    private final C6335j f17503p;

    /* renamed from: e.e.k.f.h$a */
    class C6328a implements C6063l<C5999d> {
        C6328a() {
        }

        /* renamed from: a */
        public boolean apply(C5999d dVar) {
            return true;
        }
    }

    /* renamed from: e.e.k.f.h$b */
    class C6329b implements C6063l<C5999d> {

        /* renamed from: a */
        final /* synthetic */ Uri f17505a;

        C6329b(Uri uri) {
            this.f17505a = uri;
        }

        /* renamed from: a */
        public boolean apply(C5999d dVar) {
            return dVar.mo17918a(this.f17505a);
        }
    }

    /* renamed from: e.e.k.f.h$c */
    static /* synthetic */ class C6330c {

        /* renamed from: a */
        static final /* synthetic */ int[] f17507a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                e.e.k.o.b$b[] r0 = p174e.p247e.p294k.p311o.C6384b.C6386b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17507a = r0
                e.e.k.o.b$b r1 = p174e.p247e.p294k.p311o.C6384b.C6386b.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17507a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.e.k.o.b$b r1 = p174e.p247e.p294k.p311o.C6384b.C6386b.SMALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p294k.p302f.C6327h.C6330c.<clinit>():void");
        }
    }

    public C6327h(C6346p pVar, Set<C6381e> set, Set<C6380d> set2, C6065n<Boolean> nVar, C6304s<C5999d, C6367b> sVar, C6304s<C5999d, C6082g> sVar2, C6277e eVar, C6277e eVar2, C6283f fVar, C2566z0 z0Var, C6065n<Boolean> nVar2, C6065n<Boolean> nVar3, C6032a aVar, C6335j jVar) {
        this.f17489b = pVar;
        this.f17490c = new C6379c(set);
        this.f17491d = new C6378b(set2);
        this.f17492e = nVar;
        this.f17493f = sVar;
        this.f17494g = sVar2;
        this.f17495h = eVar;
        this.f17496i = eVar2;
        this.f17497j = fVar;
        this.f17498k = z0Var;
        this.f17499l = nVar2;
        this.f17501n = nVar3;
        this.f17502o = aVar;
        this.f17503p = jVar;
    }

    /* renamed from: r */
    private C6063l<C5999d> m23960r(Uri uri) {
        return new C6329b(uri);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> p174e.p247e.p266e.C6122c<p174e.p247e.p253d.p261h.C6088a<T>> m23961v(com.facebook.imagepipeline.producers.C2529o0<p174e.p247e.p253d.p261h.C6088a<T>> r15, p174e.p247e.p294k.p311o.C6384b r16, p174e.p247e.p294k.p311o.C6384b.C6387c r17, java.lang.Object r18, p174e.p247e.p294k.p309m.C6381e r19, java.lang.String r20) {
        /*
            r14 = this;
            r1 = r14
            boolean r0 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "ImagePipeline#submitFetchRequest"
            p174e.p247e.p294k.p312p.C6394b.m24478a(r0)
        L_0x000c:
            com.facebook.imagepipeline.producers.z r0 = new com.facebook.imagepipeline.producers.z
            r3 = r16
            r2 = r19
            e.e.k.m.e r2 = r14.mo18719l(r3, r2)
            e.e.k.m.d r4 = r1.f17491d
            r0.<init>(r2, r4)
            e.e.c.a r2 = r1.f17502o
            r4 = 0
            r7 = r18
            if (r2 == 0) goto L_0x0025
            r2.mo17998a(r7, r4)
        L_0x0025:
            e.e.k.o.b$c r2 = r16.mo18926g()     // Catch:{ Exception -> 0x006e }
            r5 = r17
            e.e.k.o.b$c r8 = p174e.p247e.p294k.p311o.C6384b.C6387c.m24435e(r2, r5)     // Catch:{ Exception -> 0x006e }
            com.facebook.imagepipeline.producers.v0 r13 = new com.facebook.imagepipeline.producers.v0     // Catch:{ Exception -> 0x006e }
            java.lang.String r5 = r14.mo18716i()     // Catch:{ Exception -> 0x006e }
            r9 = 0
            boolean r2 = r16.mo18932l()     // Catch:{ Exception -> 0x006e }
            if (r2 != 0) goto L_0x0049
            android.net.Uri r2 = r16.mo18938r()     // Catch:{ Exception -> 0x006e }
            boolean r2 = p174e.p247e.p253d.p264k.C6111f.m23008l(r2)     // Catch:{ Exception -> 0x006e }
            if (r2 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r10 = 0
            goto L_0x004b
        L_0x0049:
            r2 = 1
            r10 = 1
        L_0x004b:
            e.e.k.e.d r11 = r16.mo18931k()     // Catch:{ Exception -> 0x006e }
            e.e.k.f.j r12 = r1.f17503p     // Catch:{ Exception -> 0x006e }
            r2 = r13
            r3 = r16
            r4 = r5
            r5 = r20
            r6 = r0
            r7 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x006e }
            r2 = r15
            e.e.e.c r0 = p174e.p247e.p294k.p303g.C6350c.m24251J(r15, r13, r0)     // Catch:{ Exception -> 0x006e }
            boolean r2 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r2 == 0) goto L_0x006b
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x006b:
            return r0
        L_0x006c:
            r0 = move-exception
            goto L_0x007d
        L_0x006e:
            r0 = move-exception
            e.e.e.c r0 = p174e.p247e.p266e.C6123d.m23064b(r0)     // Catch:{ all -> 0x006c }
            boolean r2 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r2 == 0) goto L_0x007c
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x007c:
            return r0
        L_0x007d:
            boolean r2 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r2 == 0) goto L_0x0086
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x0086:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p294k.p302f.C6327h.m23961v(com.facebook.imagepipeline.producers.o0, e.e.k.o.b, e.e.k.o.b$c, java.lang.Object, e.e.k.m.e, java.lang.String):e.e.e.c");
    }

    /* renamed from: w */
    private C6122c<Void> m23962w(C2529o0<Void> o0Var, C6384b bVar, C6384b.C6387c cVar, Object obj, C6315d dVar, C6381e eVar) {
        C6384b bVar2 = bVar;
        C2565z zVar = new C2565z(mo18719l(bVar, eVar), this.f17491d);
        C6032a aVar = this.f17502o;
        if (aVar != null) {
            aVar.mo17998a(obj, true);
        } else {
            Object obj2 = obj;
        }
        try {
            C2529o0<Void> o0Var2 = o0Var;
            return C6351d.m24258I(o0Var, new C2552v0(bVar, mo18716i(), zVar, obj, C6384b.C6387c.m24435e(bVar.mo18926g(), cVar), true, false, dVar, this.f17503p), zVar);
        } catch (Exception e) {
            return C6123d.m23064b(e);
        }
    }

    /* renamed from: a */
    public void mo18708a() {
        mo18710c();
        mo18709b();
    }

    /* renamed from: b */
    public void mo18709b() {
        this.f17495h.mo18594j();
        this.f17496i.mo18594j();
    }

    /* renamed from: c */
    public void mo18710c() {
        C6328a aVar = new C6328a();
        this.f17493f.mo18648d(aVar);
        this.f17494g.mo18648d(aVar);
    }

    /* renamed from: d */
    public C6122c<C6088a<C6367b>> mo18711d(C6384b bVar, Object obj) {
        return mo18712e(bVar, obj, C6384b.C6387c.FULL_FETCH);
    }

    /* renamed from: e */
    public C6122c<C6088a<C6367b>> mo18712e(C6384b bVar, Object obj, C6384b.C6387c cVar) {
        return mo18713f(bVar, obj, cVar, (C6381e) null);
    }

    /* renamed from: f */
    public C6122c<C6088a<C6367b>> mo18713f(C6384b bVar, Object obj, C6384b.C6387c cVar, C6381e eVar) {
        return mo18714g(bVar, obj, cVar, eVar, (String) null);
    }

    /* renamed from: g */
    public C6122c<C6088a<C6367b>> mo18714g(C6384b bVar, Object obj, C6384b.C6387c cVar, C6381e eVar, String str) {
        try {
            return m23961v(this.f17489b.mo18845g(bVar), bVar, cVar, obj, eVar, str);
        } catch (Exception e) {
            return C6123d.m23064b(e);
        }
    }

    /* renamed from: h */
    public C6122c<C6088a<C6367b>> mo18715h(C6384b bVar, Object obj) {
        return mo18712e(bVar, obj, C6384b.C6387c.BITMAP_MEMORY_CACHE);
    }

    /* renamed from: i */
    public String mo18716i() {
        return String.valueOf(this.f17500m.getAndIncrement());
    }

    /* renamed from: j */
    public C6304s<C5999d, C6367b> mo18717j() {
        return this.f17493f;
    }

    /* renamed from: k */
    public C6283f mo18718k() {
        return this.f17497j;
    }

    /* renamed from: l */
    public C6381e mo18719l(C6384b bVar, C6381e eVar) {
        if (eVar == null) {
            if (bVar.mo18933m() == null) {
                return this.f17490c;
            }
            return new C6379c(this.f17490c, bVar.mo18933m());
        } else if (bVar.mo18933m() == null) {
            return new C6379c(this.f17490c, eVar);
        } else {
            return new C6379c(this.f17490c, eVar, bVar.mo18933m());
        }
    }

    /* renamed from: m */
    public boolean mo18720m(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f17493f.mo18649e(m23960r(uri));
    }

    /* renamed from: n */
    public boolean mo18721n(C6384b bVar) {
        if (bVar == null) {
            return false;
        }
        C6088a<C6367b> aVar = this.f17493f.get(this.f17497j.mo18607a(bVar, (Object) null));
        try {
            return C6088a.m22950z0(aVar);
        } finally {
            C6088a.m22949v0(aVar);
        }
    }

    /* renamed from: o */
    public boolean mo18722o(Uri uri) {
        return mo18723p(uri, C6384b.C6386b.SMALL) || mo18723p(uri, C6384b.C6386b.DEFAULT);
    }

    /* renamed from: p */
    public boolean mo18723p(Uri uri, C6384b.C6386b bVar) {
        return mo18724q(C6388c.m24438s(uri).mo18975v(bVar).mo18956a());
    }

    /* renamed from: q */
    public boolean mo18724q(C6384b bVar) {
        C6277e eVar;
        C5999d d = this.f17497j.mo18610d(bVar, (Object) null);
        int i = C6330c.f17507a[bVar.mo18921c().ordinal()];
        if (i == 1) {
            eVar = this.f17495h;
        } else if (i != 2) {
            return false;
        } else {
            eVar = this.f17496i;
        }
        return eVar.mo18596l(d);
    }

    /* renamed from: s */
    public C6122c<Void> mo18725s(C6384b bVar, Object obj) {
        return mo18726t(bVar, obj, C6315d.MEDIUM);
    }

    /* renamed from: t */
    public C6122c<Void> mo18726t(C6384b bVar, Object obj, C6315d dVar) {
        return mo18727u(bVar, obj, dVar, (C6381e) null);
    }

    /* renamed from: u */
    public C6122c<Void> mo18727u(C6384b bVar, Object obj, C6315d dVar, C6381e eVar) {
        if (!this.f17492e.get().booleanValue()) {
            return C6123d.m23064b(f17488a);
        }
        try {
            return m23962w(this.f17489b.mo18846i(bVar), bVar, C6384b.C6387c.FULL_FETCH, obj, dVar, eVar);
        } catch (Exception e) {
            return C6123d.m23064b(e);
        }
    }
}
