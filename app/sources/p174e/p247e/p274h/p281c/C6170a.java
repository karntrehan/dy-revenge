package p174e.p247e.p274h.p281c;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import java.util.Map;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p257d.C6055g;
import p174e.p247e.p253d.p257d.C6058j;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p266e.C6121b;
import p174e.p247e.p266e.C6122c;
import p174e.p247e.p274h.p280b.C6163a;
import p174e.p247e.p274h.p280b.C6167c;
import p174e.p247e.p274h.p280b.C6169d;
import p174e.p247e.p274h.p284e.C6191f;
import p174e.p247e.p274h.p285f.C6224a;
import p174e.p247e.p274h.p286g.C6230a;
import p174e.p247e.p274h.p287h.C6232a;
import p174e.p247e.p274h.p287h.C6233b;
import p174e.p247e.p274h.p287h.C6234c;
import p174e.p247e.p289i.p290a.C6243a;
import p174e.p247e.p289i.p291b.p292a.C6245b;
import p174e.p247e.p289i.p291b.p292a.C6248d;
import p174e.p247e.p289i.p291b.p292a.C6249e;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: e.e.h.c.a */
public abstract class C6170a<T, INFO> implements C6232a, C6163a.C6164a, C6230a.C6231a {

    /* renamed from: a */
    private static final Map<String, Object> f16986a = C6055g.m22821of("component_tag", "drawee");

    /* renamed from: b */
    private static final Map<String, Object> f16987b = C6055g.m22822of("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* renamed from: c */
    private static final Class<?> f16988c = C6170a.class;

    /* renamed from: d */
    private final C6167c f16989d = C6167c.m23263a();

    /* renamed from: e */
    private final C6163a f16990e;

    /* renamed from: f */
    private final Executor f16991f;

    /* renamed from: g */
    private C6169d f16992g;

    /* renamed from: h */
    private C6230a f16993h;

    /* renamed from: i */
    private C6180e f16994i;

    /* renamed from: j */
    protected C6179d<INFO> f16995j;

    /* renamed from: k */
    protected C6248d<INFO> f16996k = new C6248d<>();

    /* renamed from: l */
    protected C6249e f16997l;

    /* renamed from: m */
    private C6234c f16998m;

    /* renamed from: n */
    private Drawable f16999n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f17000o;

    /* renamed from: p */
    private Object f17001p;

    /* renamed from: q */
    private boolean f17002q;

    /* renamed from: r */
    private boolean f17003r;

    /* renamed from: s */
    private boolean f17004s;

    /* renamed from: t */
    private boolean f17005t;

    /* renamed from: u */
    private boolean f17006u;

    /* renamed from: v */
    private String f17007v;

    /* renamed from: w */
    private C6122c<T> f17008w;

    /* renamed from: x */
    private T f17009x;

    /* renamed from: y */
    private boolean f17010y = true;

    /* renamed from: z */
    protected Drawable f17011z;

    /* renamed from: e.e.h.c.a$a */
    class C6171a implements C6191f.C6192a {
        C6171a() {
        }

        /* renamed from: a */
        public void mo18288a() {
            C6170a aVar = C6170a.this;
            C6249e eVar = aVar.f16997l;
            if (eVar != null) {
                eVar.mo18567b(aVar.f17000o);
            }
        }

        /* renamed from: b */
        public void mo18289b() {
        }

        /* renamed from: c */
        public void mo18290c() {
            C6170a aVar = C6170a.this;
            C6249e eVar = aVar.f16997l;
            if (eVar != null) {
                eVar.mo18566a(aVar.f17000o);
            }
        }
    }

    /* renamed from: e.e.h.c.a$b */
    class C6172b extends C6121b<T> {

        /* renamed from: a */
        final /* synthetic */ String f17013a;

        /* renamed from: b */
        final /* synthetic */ boolean f17014b;

        C6172b(String str, boolean z) {
            this.f17013a = str;
            this.f17014b = z;
        }

        /* renamed from: d */
        public void mo18139d(C6122c<T> cVar) {
            boolean d = cVar.mo18118d();
            C6170a.this.m23278O(this.f17013a, cVar, cVar.mo18120f(), d);
        }

        /* renamed from: e */
        public void mo9194e(C6122c<T> cVar) {
            C6170a.this.m23276L(this.f17013a, cVar, cVar.mo18119e(), true);
        }

        /* renamed from: f */
        public void mo9195f(C6122c<T> cVar) {
            boolean d = cVar.mo18118d();
            boolean g = cVar.mo18121g();
            float f = cVar.mo18120f();
            T h = cVar.mo18122h();
            if (h != null) {
                C6170a.this.m23277N(this.f17013a, cVar, h, f, d, this.f17014b, g);
            } else if (d) {
                C6170a.this.m23276L(this.f17013a, cVar, new NullPointerException(), true);
            }
        }
    }

    /* renamed from: e.e.h.c.a$c */
    private static class C6173c<INFO> extends C6181f<INFO> {
        private C6173c() {
        }

        /* renamed from: f */
        public static <INFO> C6173c<INFO> m23336f(C6179d<? super INFO> dVar, C6179d<? super INFO> dVar2) {
            if (C6394b.m24481d()) {
                C6394b.m24478a("AbstractDraweeController#createInternal");
            }
            C6173c<INFO> cVar = new C6173c<>();
            cVar.mo18321b(dVar);
            cVar.mo18321b(dVar2);
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
            return cVar;
        }
    }

    public C6170a(C6163a aVar, Executor executor, String str, Object obj) {
        this.f16990e = aVar;
        this.f16991f = executor;
        m23270D(str, obj);
    }

    /* renamed from: D */
    private synchronized void m23270D(String str, Object obj) {
        C6163a aVar;
        if (C6394b.m24481d()) {
            C6394b.m24478a("AbstractDraweeController#init");
        }
        this.f16989d.mo18255b(C6167c.C6168a.ON_INIT_CONTROLLER);
        if (!this.f17010y && (aVar = this.f16990e) != null) {
            aVar.mo18251a(this);
        }
        this.f17002q = false;
        this.f17004s = false;
        m23279Q();
        this.f17006u = false;
        C6169d dVar = this.f16992g;
        if (dVar != null) {
            dVar.mo18257a();
        }
        C6230a aVar2 = this.f16993h;
        if (aVar2 != null) {
            aVar2.mo18511a();
            this.f16993h.mo18515f(this);
        }
        C6179d<INFO> dVar2 = this.f16995j;
        if (dVar2 instanceof C6173c) {
            ((C6173c) dVar2).mo18322c();
        } else {
            this.f16995j = null;
        }
        this.f16994i = null;
        C6234c cVar = this.f16998m;
        if (cVar != null) {
            cVar.mo18458a();
            this.f16998m.mo18460c((Drawable) null);
            this.f16998m = null;
        }
        this.f16999n = null;
        if (C6071a.m22886t(2)) {
            C6071a.m22890x(f16988c, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f17000o, str);
        }
        this.f17000o = str;
        this.f17001p = obj;
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        if (this.f16997l != null) {
            m23285e0();
        }
    }

    /* renamed from: F */
    private boolean m23271F(String str, C6122c<T> cVar) {
        if (cVar == null && this.f17008w == null) {
            return true;
        }
        return str.equals(this.f17000o) && cVar == this.f17008w && this.f17003r;
    }

    /* renamed from: G */
    private void m23272G(String str, Throwable th) {
        if (C6071a.m22886t(2)) {
            C6071a.m22891y(f16988c, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f17000o, str, th);
        }
    }

    /* renamed from: H */
    private void m23273H(String str, T t) {
        if (C6071a.m22886t(2)) {
            C6071a.m22892z(f16988c, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f17000o, str, mo18287y(t), Integer.valueOf(mo18183z(t)));
        }
    }

    /* renamed from: I */
    private C6245b.C6246a m23274I(C6122c<T> cVar, INFO info, Uri uri) {
        return m23275J(cVar == null ? null : cVar.mo18115b(), mo18160K(info), uri);
    }

    /* renamed from: J */
    private C6245b.C6246a m23275J(Map<String, Object> map, Map<String, Object> map2, Uri uri) {
        PointF pointF;
        String str;
        C6234c cVar = this.f16998m;
        if (cVar instanceof C6224a) {
            String valueOf = String.valueOf(((C6224a) cVar).mo18467o());
            pointF = ((C6224a) this.f16998m).mo18466n();
            str = valueOf;
        } else {
            str = null;
            pointF = null;
        }
        return C6243a.m23675a(f16986a, f16987b, map, m23291v(), str, pointF, map2, mo18281q(), uri);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m23276L(String str, C6122c<T> cVar, Throwable th, boolean z) {
        Drawable drawable;
        if (C6394b.m24481d()) {
            C6394b.m24478a("AbstractDraweeController#onFailureInternal");
        }
        if (!m23271F(str, cVar)) {
            m23272G("ignore_old_datasource @ onFailure", th);
            cVar.close();
            if (C6394b.m24481d()) {
                C6394b.m24479b();
                return;
            }
            return;
        }
        this.f16989d.mo18255b(z ? C6167c.C6168a.ON_DATASOURCE_FAILURE : C6167c.C6168a.ON_DATASOURCE_FAILURE_INT);
        if (z) {
            m23272G("final_failed @ onFailure", th);
            this.f17008w = null;
            this.f17005t = true;
            if (this.f17006u && (drawable = this.f17011z) != null) {
                this.f16998m.mo18465h(drawable, 1.0f, true);
            } else if (m23286g0()) {
                this.f16998m.mo18461d(th);
            } else {
                this.f16998m.mo18462e(th);
            }
            m23280T(th, cVar);
        } else {
            m23272G("intermediate_failed @ onFailure", th);
            m23281U(th);
        }
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m23277N(java.lang.String r6, p174e.p247e.p266e.C6122c<T> r7, T r8, float r9, boolean r10, boolean r11, boolean r12) {
        /*
            r5 = this;
            boolean r0 = p174e.p247e.p294k.p312p.C6394b.m24481d()     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "AbstractDraweeController#onNewResultInternal"
            p174e.p247e.p294k.p312p.C6394b.m24478a(r0)     // Catch:{ all -> 0x00b4 }
        L_0x000b:
            boolean r0 = r5.m23271F(r6, r7)     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x0026
            java.lang.String r6 = "ignore_old_datasource @ onNewResult"
            r5.m23273H(r6, r8)     // Catch:{ all -> 0x00b4 }
            r5.mo18163R(r8)     // Catch:{ all -> 0x00b4 }
            r7.close()     // Catch:{ all -> 0x00b4 }
            boolean r6 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r6 == 0) goto L_0x0025
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x0025:
            return
        L_0x0026:
            e.e.h.b.c r0 = r5.f16989d     // Catch:{ all -> 0x00b4 }
            if (r10 == 0) goto L_0x002d
            e.e.h.b.c$a r1 = p174e.p247e.p274h.p280b.C6167c.C6168a.ON_DATASOURCE_RESULT     // Catch:{ all -> 0x00b4 }
            goto L_0x002f
        L_0x002d:
            e.e.h.b.c$a r1 = p174e.p247e.p274h.p280b.C6167c.C6168a.ON_DATASOURCE_RESULT_INT     // Catch:{ all -> 0x00b4 }
        L_0x002f:
            r0.mo18255b(r1)     // Catch:{ all -> 0x00b4 }
            android.graphics.drawable.Drawable r0 = r5.mo18170n(r8)     // Catch:{ Exception -> 0x009e }
            T r1 = r5.f17009x     // Catch:{ all -> 0x00b4 }
            android.graphics.drawable.Drawable r2 = r5.f17011z     // Catch:{ all -> 0x00b4 }
            r5.f17009x = r8     // Catch:{ all -> 0x00b4 }
            r5.f17011z = r0     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "release_previous_result @ onNewResult"
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L_0x0057
            java.lang.String r9 = "set_final_result @ onNewResult"
            r5.m23273H(r9, r8)     // Catch:{ all -> 0x0055 }
            r9 = 0
            r5.f17008w = r9     // Catch:{ all -> 0x0055 }
            e.e.h.h.c r9 = r5.f16998m     // Catch:{ all -> 0x0055 }
            r9.mo18465h(r0, r4, r11)     // Catch:{ all -> 0x0055 }
        L_0x0051:
            r5.m23284Y(r6, r8, r7)     // Catch:{ all -> 0x0055 }
            goto L_0x0071
        L_0x0055:
            r6 = move-exception
            goto L_0x008c
        L_0x0057:
            if (r12 == 0) goto L_0x0064
            java.lang.String r9 = "set_temporary_result @ onNewResult"
            r5.m23273H(r9, r8)     // Catch:{ all -> 0x0055 }
            e.e.h.h.c r9 = r5.f16998m     // Catch:{ all -> 0x0055 }
            r9.mo18465h(r0, r4, r11)     // Catch:{ all -> 0x0055 }
            goto L_0x0051
        L_0x0064:
            java.lang.String r7 = "set_intermediate_result @ onNewResult"
            r5.m23273H(r7, r8)     // Catch:{ all -> 0x0055 }
            e.e.h.h.c r7 = r5.f16998m     // Catch:{ all -> 0x0055 }
            r7.mo18465h(r0, r9, r11)     // Catch:{ all -> 0x0055 }
            r5.m23282V(r6, r8)     // Catch:{ all -> 0x0055 }
        L_0x0071:
            if (r2 == 0) goto L_0x0078
            if (r2 == r0) goto L_0x0078
            r5.mo18162P(r2)     // Catch:{ all -> 0x00b4 }
        L_0x0078:
            if (r1 == 0) goto L_0x0082
            if (r1 == r8) goto L_0x0082
            r5.m23273H(r3, r1)     // Catch:{ all -> 0x00b4 }
            r5.mo18163R(r1)     // Catch:{ all -> 0x00b4 }
        L_0x0082:
            boolean r6 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r6 == 0) goto L_0x008b
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x008b:
            return
        L_0x008c:
            if (r2 == 0) goto L_0x0093
            if (r2 == r0) goto L_0x0093
            r5.mo18162P(r2)     // Catch:{ all -> 0x00b4 }
        L_0x0093:
            if (r1 == 0) goto L_0x009d
            if (r1 == r8) goto L_0x009d
            r5.m23273H(r3, r1)     // Catch:{ all -> 0x00b4 }
            r5.mo18163R(r1)     // Catch:{ all -> 0x00b4 }
        L_0x009d:
            throw r6     // Catch:{ all -> 0x00b4 }
        L_0x009e:
            r9 = move-exception
            java.lang.String r11 = "drawable_failed @ onNewResult"
            r5.m23273H(r11, r8)     // Catch:{ all -> 0x00b4 }
            r5.mo18163R(r8)     // Catch:{ all -> 0x00b4 }
            r5.m23276L(r6, r7, r9, r10)     // Catch:{ all -> 0x00b4 }
            boolean r6 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r6 == 0) goto L_0x00b3
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x00b3:
            return
        L_0x00b4:
            r6 = move-exception
            boolean r7 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r7 == 0) goto L_0x00be
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x00be:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p274h.p281c.C6170a.m23277N(java.lang.String, e.e.e.c, java.lang.Object, float, boolean, boolean, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m23278O(String str, C6122c<T> cVar, float f, boolean z) {
        if (!m23271F(str, cVar)) {
            m23272G("ignore_old_datasource @ onProgress", (Throwable) null);
            cVar.close();
        } else if (!z) {
            this.f16998m.mo18463f(f, false);
        }
    }

    /* renamed from: Q */
    private void m23279Q() {
        Map<String, Object> map;
        boolean z = this.f17003r;
        this.f17003r = false;
        this.f17005t = false;
        C6122c<T> cVar = this.f17008w;
        Map<String, Object> map2 = null;
        if (cVar != null) {
            map = cVar.mo18115b();
            this.f17008w.close();
            this.f17008w = null;
        } else {
            map = null;
        }
        Drawable drawable = this.f17011z;
        if (drawable != null) {
            mo18162P(drawable);
        }
        if (this.f17007v != null) {
            this.f17007v = null;
        }
        this.f17011z = null;
        T t = this.f17009x;
        if (t != null) {
            Map<String, Object> K = mo18160K(mo18155A(t));
            m23273H("release", this.f17009x);
            mo18163R(this.f17009x);
            this.f17009x = null;
            map2 = K;
        }
        if (z) {
            m23283W(map, map2);
        }
    }

    /* renamed from: T */
    private void m23280T(Throwable th, C6122c<T> cVar) {
        C6245b.C6246a I = m23274I(cVar, (Object) null, (Uri) null);
        mo18282r().mo9988h(this.f17000o, th);
        mo18283s().mo18248o(this.f17000o, th, I);
    }

    /* renamed from: U */
    private void m23281U(Throwable th) {
        mo18282r().mo9958o(this.f17000o, th);
        mo18283s().mo18563h(this.f17000o);
    }

    /* renamed from: V */
    private void m23282V(String str, T t) {
        Object A = mo18155A(t);
        mo18282r().mo9956a(str, A);
        mo18283s().mo18243a(str, A);
    }

    /* renamed from: W */
    private void m23283W(Map<String, Object> map, Map<String, Object> map2) {
        mo18282r().mo9957j(this.f17000o);
        mo18283s().mo18249r(this.f17000o, m23275J(map, map2, (Uri) null));
    }

    /* renamed from: Y */
    private void m23284Y(String str, T t, C6122c<T> cVar) {
        Object A = mo18155A(t);
        mo18282r().mo9987e(str, A, mo18280o());
        mo18283s().mo18240A(str, A, m23274I(cVar, A, (Uri) null));
    }

    /* renamed from: e0 */
    private void m23285e0() {
        C6234c cVar = this.f16998m;
        if (cVar instanceof C6224a) {
            ((C6224a) cVar).mo18472z(new C6171a());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f16992g;
     */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m23286g0() {
        /*
            r1 = this;
            boolean r0 = r1.f17005t
            if (r0 == 0) goto L_0x0010
            e.e.h.b.d r0 = r1.f16992g
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.mo18261e()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p274h.p281c.C6170a.m23286g0():boolean");
    }

    /* renamed from: v */
    private Rect m23291v() {
        C6234c cVar = this.f16998m;
        if (cVar == null) {
            return null;
        }
        return cVar.mo18459b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract INFO mo18155A(T t);

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public Uri mo18157B() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C6169d mo18262C() {
        if (this.f16992g == null) {
            this.f16992g = new C6169d();
        }
        return this.f16992g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo18263E(String str, Object obj) {
        m23270D(str, obj);
        this.f17010y = false;
    }

    /* renamed from: K */
    public abstract Map<String, Object> mo18160K(INFO info);

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo18161M(String str, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public abstract void mo18162P(Drawable drawable);

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public abstract void mo18163R(T t);

    /* renamed from: S */
    public void mo18264S(C6245b<INFO> bVar) {
        this.f16996k.mo18565L(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo18265X(C6122c<T> cVar, INFO info) {
        mo18282r().mo9989n(this.f17000o, this.f17001p);
        mo18283s().mo18244b(this.f17000o, this.f17001p, m23274I(cVar, info, mo18157B()));
    }

    /* renamed from: Z */
    public void mo18266Z(String str) {
        this.f17007v = str;
    }

    /* renamed from: a */
    public void mo18253a() {
        this.f16989d.mo18255b(C6167c.C6168a.ON_RELEASE_CONTROLLER);
        C6169d dVar = this.f16992g;
        if (dVar != null) {
            dVar.mo18259c();
        }
        C6230a aVar = this.f16993h;
        if (aVar != null) {
            aVar.mo18514e();
        }
        C6234c cVar = this.f16998m;
        if (cVar != null) {
            cVar.mo18458a();
        }
        m23279Q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo18267a0(Drawable drawable) {
        this.f16999n = drawable;
        C6234c cVar = this.f16998m;
        if (cVar != null) {
            cVar.mo18460c(drawable);
        }
    }

    /* renamed from: b */
    public void mo18268b() {
        if (C6394b.m24481d()) {
            C6394b.m24478a("AbstractDraweeController#onDetach");
        }
        if (C6071a.m22886t(2)) {
            C6071a.m22889w(f16988c, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f17000o);
        }
        this.f16989d.mo18255b(C6167c.C6168a.ON_DETACH_CONTROLLER);
        this.f17002q = false;
        this.f16990e.mo18252d(this);
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
    }

    /* renamed from: b0 */
    public void mo18269b0(C6180e eVar) {
        this.f16994i = eVar;
    }

    /* renamed from: c */
    public C6233b mo18270c() {
        return this.f16998m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo18271c0(C6230a aVar) {
        this.f16993h = aVar;
        if (aVar != null) {
            aVar.mo18515f(this);
        }
    }

    /* renamed from: d */
    public boolean mo18272d(MotionEvent motionEvent) {
        if (C6071a.m22886t(2)) {
            C6071a.m22890x(f16988c, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f17000o, motionEvent);
        }
        C6230a aVar = this.f16993h;
        if (aVar == null) {
            return false;
        }
        if (!aVar.mo18512b() && !mo18276f0()) {
            return false;
        }
        this.f16993h.mo18513d(motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo18273d0(boolean z) {
        this.f17006u = z;
    }

    /* renamed from: e */
    public boolean mo18274e() {
        if (C6071a.m22886t(2)) {
            C6071a.m22889w(f16988c, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f17000o);
        }
        if (!m23286g0()) {
            return false;
        }
        this.f16992g.mo18258b();
        this.f16998m.mo18458a();
        mo18277h0();
        return true;
    }

    /* renamed from: f */
    public void mo18275f() {
        if (C6394b.m24481d()) {
            C6394b.m24478a("AbstractDraweeController#onAttach");
        }
        if (C6071a.m22886t(2)) {
            C6071a.m22890x(f16988c, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f17000o, this.f17003r ? "request already submitted" : "request needs submit");
        }
        this.f16989d.mo18255b(C6167c.C6168a.ON_ATTACH_CONTROLLER);
        C6062k.m22839g(this.f16998m);
        this.f16990e.mo18251a(this);
        this.f17002q = true;
        if (!this.f17003r) {
            mo18277h0();
        }
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public boolean mo18276f0() {
        return m23286g0();
    }

    /* renamed from: g */
    public void mo18164g(C6233b bVar) {
        if (C6071a.m22886t(2)) {
            C6071a.m22890x(f16988c, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f17000o, bVar);
        }
        this.f16989d.mo18255b(bVar != null ? C6167c.C6168a.ON_SET_HIERARCHY : C6167c.C6168a.ON_CLEAR_HIERARCHY);
        if (this.f17003r) {
            this.f16990e.mo18251a(this);
            mo18253a();
        }
        C6234c cVar = this.f16998m;
        if (cVar != null) {
            cVar.mo18460c((Drawable) null);
            this.f16998m = null;
        }
        if (bVar != null) {
            C6062k.m22834b(Boolean.valueOf(bVar instanceof C6234c));
            C6234c cVar2 = (C6234c) bVar;
            this.f16998m = cVar2;
            cVar2.mo18460c(this.f16999n);
        }
        if (this.f16997l != null) {
            m23285e0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public void mo18277h0() {
        if (C6394b.m24481d()) {
            C6394b.m24478a("AbstractDraweeController#submitRequest");
        }
        Object p = mo18173p();
        if (p != null) {
            if (C6394b.m24481d()) {
                C6394b.m24478a("AbstractDraweeController#submitRequest->cache");
            }
            this.f17008w = null;
            this.f17003r = true;
            this.f17005t = false;
            this.f16989d.mo18255b(C6167c.C6168a.ON_SUBMIT_CACHE_HIT);
            mo18265X(this.f17008w, mo18155A(p));
            mo18161M(this.f17000o, p);
            m23277N(this.f17000o, this.f17008w, p, 1.0f, true, true, true);
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
            if (C6394b.m24481d()) {
                C6394b.m24479b();
                return;
            }
            return;
        }
        this.f16989d.mo18255b(C6167c.C6168a.ON_DATASOURCE_SUBMIT);
        this.f16998m.mo18463f(0.0f, true);
        this.f17003r = true;
        this.f17005t = false;
        C6122c<T> u = mo18178u();
        this.f17008w = u;
        mo18265X(u, (Object) null);
        if (C6071a.m22886t(2)) {
            C6071a.m22890x(f16988c, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f17000o, Integer.valueOf(System.identityHashCode(this.f17008w)));
        }
        this.f17008w.mo18123i(new C6172b(this.f17000o, this.f17008w.mo18116c()), this.f16991f);
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
    }

    /* renamed from: l */
    public void mo18278l(C6179d<? super INFO> dVar) {
        C6062k.m22839g(dVar);
        C6179d<INFO> dVar2 = this.f16995j;
        if (dVar2 instanceof C6173c) {
            ((C6173c) dVar2).mo18321b(dVar);
        } else if (dVar2 != null) {
            this.f16995j = C6173c.m23336f(dVar2, dVar);
        } else {
            this.f16995j = dVar;
        }
    }

    /* renamed from: m */
    public void mo18279m(C6245b<INFO> bVar) {
        this.f16996k.mo18564E(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract Drawable mo18170n(T t);

    /* renamed from: o */
    public Animatable mo18280o() {
        Drawable drawable = this.f17011z;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public T mo18173p() {
        return null;
    }

    /* renamed from: q */
    public Object mo18281q() {
        return this.f17001p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C6179d<INFO> mo18282r() {
        C6179d<INFO> dVar = this.f16995j;
        return dVar == null ? C6178c.m23371b() : dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public C6245b<INFO> mo18283s() {
        return this.f16996k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Drawable mo18284t() {
        return this.f16999n;
    }

    public String toString() {
        return C6058j.m22827c(this).mo18045c("isAttached", this.f17002q).mo18045c("isRequestSubmitted", this.f17003r).mo18045c("hasFetchFailed", this.f17005t).mo18043a("fetchedImage", mo18183z(this.f17009x)).mo18044b("events", this.f16989d.toString()).toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract C6122c<T> mo18178u();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C6230a mo18285w() {
        return this.f16993h;
    }

    /* renamed from: x */
    public String mo18286x() {
        return this.f17000o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public String mo18287y(T t) {
        return t != null ? t.getClass().getSimpleName() : "<null>";
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo18183z(T t) {
        return System.identityHashCode(t);
    }
}
