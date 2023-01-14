package p174e.p247e.p294k.p302f;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.imagepipeline.producers.C2448a;
import com.facebook.imagepipeline.producers.C2471d1;
import com.facebook.imagepipeline.producers.C2503k0;
import com.facebook.imagepipeline.producers.C2529o0;
import com.facebook.imagepipeline.producers.C2532q;
import com.facebook.imagepipeline.producers.C2566z0;
import java.util.HashMap;
import java.util.Map;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p253d.p265l.C6115c;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;
import p174e.p247e.p294k.p312p.C6394b;
import p174e.p247e.p294k.p313q.C6402d;

/* renamed from: e.e.k.f.p */
public class C6346p {

    /* renamed from: A */
    C2529o0<C6088a<C6367b>> f17697A;

    /* renamed from: B */
    C2529o0<C6088a<C6367b>> f17698B;

    /* renamed from: C */
    Map<C2529o0<C6088a<C6367b>>, C2529o0<C6088a<C6367b>>> f17699C = new HashMap();

    /* renamed from: D */
    Map<C2529o0<C6088a<C6367b>>, C2529o0<Void>> f17700D = new HashMap();

    /* renamed from: E */
    Map<C2529o0<C6088a<C6367b>>, C2529o0<C6088a<C6367b>>> f17701E = new HashMap();

    /* renamed from: a */
    private final ContentResolver f17702a;

    /* renamed from: b */
    private final C6345o f17703b;

    /* renamed from: c */
    private final C2503k0 f17704c;

    /* renamed from: d */
    private final boolean f17705d;

    /* renamed from: e */
    private final boolean f17706e;

    /* renamed from: f */
    private final boolean f17707f;

    /* renamed from: g */
    private final C2566z0 f17708g;

    /* renamed from: h */
    private final boolean f17709h;

    /* renamed from: i */
    private final boolean f17710i;

    /* renamed from: j */
    private final boolean f17711j;

    /* renamed from: k */
    private final C6402d f17712k;

    /* renamed from: l */
    private final boolean f17713l;

    /* renamed from: m */
    private final boolean f17714m;

    /* renamed from: n */
    private final boolean f17715n;

    /* renamed from: o */
    private final boolean f17716o;

    /* renamed from: p */
    C2529o0<C6088a<C6367b>> f17717p;

    /* renamed from: q */
    C2529o0<C6369d> f17718q;

    /* renamed from: r */
    C2529o0<C6369d> f17719r;

    /* renamed from: s */
    C2529o0<Void> f17720s;

    /* renamed from: t */
    C2529o0<Void> f17721t;

    /* renamed from: u */
    private C2529o0<C6369d> f17722u;

    /* renamed from: v */
    C2529o0<C6088a<C6367b>> f17723v;

    /* renamed from: w */
    C2529o0<C6088a<C6367b>> f17724w;

    /* renamed from: x */
    C2529o0<C6088a<C6367b>> f17725x;

    /* renamed from: y */
    C2529o0<C6088a<C6367b>> f17726y;

    /* renamed from: z */
    C2529o0<C6088a<C6367b>> f17727z;

    public C6346p(ContentResolver contentResolver, C6345o oVar, C2503k0 k0Var, boolean z, boolean z2, C2566z0 z0Var, boolean z3, boolean z4, boolean z5, boolean z6, C6402d dVar, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f17702a = contentResolver;
        this.f17703b = oVar;
        this.f17704c = k0Var;
        this.f17705d = z;
        this.f17706e = z2;
        this.f17715n = z9;
        this.f17708g = z0Var;
        this.f17709h = z3;
        this.f17710i = z4;
        this.f17707f = z5;
        this.f17711j = z6;
        this.f17712k = dVar;
        this.f17713l = z7;
        this.f17714m = z8;
        this.f17716o = z10;
    }

    /* renamed from: A */
    private C2529o0<C6369d> m24206A(C2471d1<C6369d>[] d1VarArr) {
        return this.f17703b.mo18816D(this.f17703b.mo18819G(d1VarArr), true, this.f17712k);
    }

    /* renamed from: B */
    private C2529o0<C6369d> m24207B(C2529o0<C6369d> o0Var, C2471d1<C6369d>[] d1VarArr) {
        return C6345o.m24173h(m24206A(d1VarArr), this.f17703b.mo18818F(this.f17703b.mo18816D(C6345o.m24172a(o0Var), true, this.f17712k)));
    }

    /* renamed from: C */
    private static void m24208C(C6384b bVar) {
        C6062k.m22839g(bVar);
        C6062k.m22834b(Boolean.valueOf(bVar.mo18926g().mo18945g() <= C6384b.C6387c.ENCODED_MEMORY_CACHE.mo18945g()));
    }

    /* renamed from: a */
    private synchronized C2529o0<C6369d> m24209a() {
        if (C6394b.m24481d()) {
            C6394b.m24478a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        }
        if (this.f17718q == null) {
            if (C6394b.m24481d()) {
                C6394b.m24478a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence:init");
            }
            this.f17718q = this.f17703b.mo18821b(m24232z(this.f17703b.mo18840v()), this.f17708g);
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        return this.f17718q;
    }

    /* renamed from: b */
    private synchronized C2529o0<C6369d> m24210b() {
        if (C6394b.m24481d()) {
            C6394b.m24478a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence");
        }
        if (this.f17719r == null) {
            if (C6394b.m24481d()) {
                C6394b.m24478a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
            }
            this.f17719r = this.f17703b.mo18821b(m24213e(), this.f17708g);
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        return this.f17719r;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc A[FINALLY_INSNS] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imagepipeline.producers.C2529o0<p174e.p247e.p253d.p261h.C6088a<p174e.p247e.p294k.p307k.C6367b>> m24211c(p174e.p247e.p294k.p311o.C6384b r4) {
        /*
            r3 = this;
            boolean r0 = p174e.p247e.p294k.p312p.C6394b.m24481d()     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "ProducerSequenceFactory#getBasicDecodedImageSequence"
            p174e.p247e.p294k.p312p.C6394b.m24478a(r0)     // Catch:{ all -> 0x00c5 }
        L_0x000b:
            p174e.p247e.p253d.p257d.C6062k.m22839g(r4)     // Catch:{ all -> 0x00c5 }
            android.net.Uri r0 = r4.mo18938r()     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "Uri is null."
            p174e.p247e.p253d.p257d.C6062k.m22840h(r0, r1)     // Catch:{ all -> 0x00c5 }
            int r4 = r4.mo18939s()     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x00b7
            switch(r4) {
                case 2: goto L_0x00a9;
                case 3: goto L_0x009b;
                case 4: goto L_0x0073;
                case 5: goto L_0x0065;
                case 6: goto L_0x0057;
                case 7: goto L_0x0049;
                case 8: goto L_0x003b;
                default: goto L_0x0020;
            }     // Catch:{ all -> 0x00c5 }
        L_0x0020:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c5 }
            r1.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = "Unsupported uri scheme! Uri is: "
            r1.append(r2)     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = m24226t(r0)     // Catch:{ all -> 0x00c5 }
            r1.append(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c5 }
            r4.<init>(r0)     // Catch:{ all -> 0x00c5 }
            throw r4     // Catch:{ all -> 0x00c5 }
        L_0x003b:
            com.facebook.imagepipeline.producers.o0 r4 = r3.m24225s()     // Catch:{ all -> 0x00c5 }
            boolean r0 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r0 == 0) goto L_0x0048
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x0048:
            return r4
        L_0x0049:
            com.facebook.imagepipeline.producers.o0 r4 = r3.m24214f()     // Catch:{ all -> 0x00c5 }
            boolean r0 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r0 == 0) goto L_0x0056
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x0056:
            return r4
        L_0x0057:
            com.facebook.imagepipeline.producers.o0 r4 = r3.m24220n()     // Catch:{ all -> 0x00c5 }
            boolean r0 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r0 == 0) goto L_0x0064
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x0064:
            return r4
        L_0x0065:
            com.facebook.imagepipeline.producers.o0 r4 = r3.m24216j()     // Catch:{ all -> 0x00c5 }
            boolean r0 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r0 == 0) goto L_0x0072
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x0072:
            return r4
        L_0x0073:
            android.content.ContentResolver r4 = r3.f17702a     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = r4.getType(r0)     // Catch:{ all -> 0x00c5 }
            boolean r4 = p174e.p247e.p253d.p259f.C6074a.m22923c(r4)     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x008d
            com.facebook.imagepipeline.producers.o0 r4 = r3.m24221o()     // Catch:{ all -> 0x00c5 }
            boolean r0 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r0 == 0) goto L_0x008c
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x008c:
            return r4
        L_0x008d:
            com.facebook.imagepipeline.producers.o0 r4 = r3.m24217k()     // Catch:{ all -> 0x00c5 }
            boolean r0 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r0 == 0) goto L_0x009a
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x009a:
            return r4
        L_0x009b:
            com.facebook.imagepipeline.producers.o0 r4 = r3.m24219m()     // Catch:{ all -> 0x00c5 }
            boolean r0 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r0 == 0) goto L_0x00a8
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x00a8:
            return r4
        L_0x00a9:
            com.facebook.imagepipeline.producers.o0 r4 = r3.m24221o()     // Catch:{ all -> 0x00c5 }
            boolean r0 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r0 == 0) goto L_0x00b6
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x00b6:
            return r4
        L_0x00b7:
            com.facebook.imagepipeline.producers.o0 r4 = r3.m24222p()     // Catch:{ all -> 0x00c5 }
            boolean r0 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r0 == 0) goto L_0x00c4
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x00c4:
            return r4
        L_0x00c5:
            r4 = move-exception
            boolean r0 = p174e.p247e.p294k.p312p.C6394b.m24481d()
            if (r0 == 0) goto L_0x00cf
            p174e.p247e.p294k.p312p.C6394b.m24479b()
        L_0x00cf:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p294k.p302f.C6346p.m24211c(e.e.k.o.b):com.facebook.imagepipeline.producers.o0");
    }

    /* renamed from: d */
    private synchronized C2529o0<C6088a<C6367b>> m24212d(C2529o0<C6088a<C6367b>> o0Var) {
        C2529o0<C6088a<C6367b>> o0Var2;
        o0Var2 = this.f17701E.get(o0Var);
        if (o0Var2 == null) {
            o0Var2 = this.f17703b.mo18825f(o0Var);
            this.f17701E.put(o0Var, o0Var2);
        }
        return o0Var2;
    }

    /* renamed from: e */
    private synchronized C2529o0<C6369d> m24213e() {
        if (C6394b.m24481d()) {
            C6394b.m24478a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        }
        if (this.f17722u == null) {
            if (C6394b.m24481d()) {
                C6394b.m24478a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
            }
            C2448a a = C6345o.m24172a((C2529o0) C6062k.m22839g(this.f17715n ? this.f17703b.mo18827i(this.f17704c) : m24232z(this.f17703b.mo18843y(this.f17704c))));
            this.f17722u = a;
            this.f17722u = this.f17703b.mo18816D(a, this.f17705d && !this.f17709h, this.f17712k);
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        return this.f17722u;
    }

    /* renamed from: f */
    private synchronized C2529o0<C6088a<C6367b>> m24214f() {
        if (this.f17697A == null) {
            C2529o0 j = this.f17703b.mo18828j();
            if (C6115c.f16765a && (!this.f17706e || C6115c.f16768d == null)) {
                j = this.f17703b.mo18820H(j);
            }
            this.f17697A = m24228v(this.f17703b.mo18816D(C6345o.m24172a(j), true, this.f17712k));
        }
        return this.f17697A;
    }

    /* renamed from: h */
    private synchronized C2529o0<C6088a<C6367b>> m24215h(C2529o0<C6088a<C6367b>> o0Var) {
        return this.f17703b.mo18830l(o0Var);
    }

    /* renamed from: j */
    private synchronized C2529o0<C6088a<C6367b>> m24216j() {
        if (this.f17727z == null) {
            this.f17727z = m24229w(this.f17703b.mo18836r());
        }
        return this.f17727z;
    }

    /* renamed from: k */
    private synchronized C2529o0<C6088a<C6367b>> m24217k() {
        if (this.f17725x == null) {
            this.f17725x = m24230x(this.f17703b.mo18837s(), new C2471d1[]{this.f17703b.mo18838t(), this.f17703b.mo18839u()});
        }
        return this.f17725x;
    }

    /* renamed from: l */
    private synchronized C2529o0<Void> m24218l() {
        if (C6394b.m24481d()) {
            C6394b.m24478a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f17720s == null) {
            if (C6394b.m24481d()) {
                C6394b.m24478a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f17720s = this.f17703b.mo18817E(m24209a());
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        return this.f17720s;
    }

    /* renamed from: m */
    private synchronized C2529o0<C6088a<C6367b>> m24219m() {
        if (this.f17723v == null) {
            this.f17723v = m24229w(this.f17703b.mo18840v());
        }
        return this.f17723v;
    }

    /* renamed from: n */
    private synchronized C2529o0<C6088a<C6367b>> m24220n() {
        if (this.f17726y == null) {
            this.f17726y = m24229w(this.f17703b.mo18841w());
        }
        return this.f17726y;
    }

    /* renamed from: o */
    private synchronized C2529o0<C6088a<C6367b>> m24221o() {
        if (this.f17724w == null) {
            this.f17724w = m24227u(this.f17703b.mo18842x());
        }
        return this.f17724w;
    }

    /* renamed from: p */
    private synchronized C2529o0<C6088a<C6367b>> m24222p() {
        if (C6394b.m24481d()) {
            C6394b.m24478a("ProducerSequenceFactory#getNetworkFetchSequence");
        }
        if (this.f17717p == null) {
            if (C6394b.m24481d()) {
                C6394b.m24478a("ProducerSequenceFactory#getNetworkFetchSequence:init");
            }
            this.f17717p = m24228v(m24213e());
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        return this.f17717p;
    }

    /* renamed from: q */
    private synchronized C2529o0<Void> m24223q() {
        if (C6394b.m24481d()) {
            C6394b.m24478a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f17721t == null) {
            if (C6394b.m24481d()) {
                C6394b.m24478a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f17721t = this.f17703b.mo18817E(m24210b());
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        return this.f17721t;
    }

    /* renamed from: r */
    private synchronized C2529o0<C6088a<C6367b>> m24224r(C2529o0<C6088a<C6367b>> o0Var) {
        C2529o0<C6088a<C6367b>> o0Var2;
        o0Var2 = this.f17699C.get(o0Var);
        if (o0Var2 == null) {
            o0Var2 = this.f17703b.mo18813A(this.f17703b.mo18814B(o0Var));
            this.f17699C.put(o0Var, o0Var2);
        }
        return o0Var2;
    }

    /* renamed from: s */
    private synchronized C2529o0<C6088a<C6367b>> m24225s() {
        if (this.f17698B == null) {
            this.f17698B = m24229w(this.f17703b.mo18815C());
        }
        return this.f17698B;
    }

    /* renamed from: t */
    private static String m24226t(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() <= 30) {
            return valueOf;
        }
        return valueOf.substring(0, 30) + "...";
    }

    /* renamed from: u */
    private C2529o0<C6088a<C6367b>> m24227u(C2529o0<C6088a<C6367b>> o0Var) {
        C2529o0 b = this.f17703b.mo18821b(this.f17703b.mo18823d(this.f17703b.mo18824e(o0Var)), this.f17708g);
        if (!this.f17713l && !this.f17714m) {
            return this.f17703b.mo18822c(b);
        }
        return this.f17703b.mo18826g(this.f17703b.mo18822c(b));
    }

    /* renamed from: v */
    private C2529o0<C6088a<C6367b>> m24228v(C2529o0<C6369d> o0Var) {
        if (C6394b.m24481d()) {
            C6394b.m24478a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        }
        C2529o0<C6088a<C6367b>> u = m24227u(this.f17703b.mo18829k(o0Var));
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        return u;
    }

    /* renamed from: w */
    private C2529o0<C6088a<C6367b>> m24229w(C2529o0<C6369d> o0Var) {
        return m24230x(o0Var, new C2471d1[]{this.f17703b.mo18839u()});
    }

    /* renamed from: x */
    private C2529o0<C6088a<C6367b>> m24230x(C2529o0<C6369d> o0Var, C2471d1<C6369d>[] d1VarArr) {
        return m24228v(m24207B(m24232z(o0Var), d1VarArr));
    }

    /* renamed from: y */
    private C2529o0<C6369d> m24231y(C2529o0<C6369d> o0Var) {
        if (C6394b.m24481d()) {
            C6394b.m24478a("ProducerSequenceFactory#newDiskCacheSequence");
        }
        if (this.f17707f) {
            o0Var = this.f17703b.mo18844z(o0Var);
        }
        C2532q m = this.f17703b.mo18831m(this.f17703b.mo18832n(o0Var));
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        return m;
    }

    /* renamed from: z */
    private C2529o0<C6369d> m24232z(C2529o0<C6369d> o0Var) {
        if (C6115c.f16765a && (!this.f17706e || C6115c.f16768d == null)) {
            o0Var = this.f17703b.mo18820H(o0Var);
        }
        if (this.f17711j) {
            o0Var = m24231y(o0Var);
        }
        C2529o0 p = this.f17703b.mo18834p(o0Var);
        if (this.f17714m) {
            p = this.f17703b.mo18835q(p);
        }
        return this.f17703b.mo18833o(p);
    }

    /* renamed from: g */
    public C2529o0<C6088a<C6367b>> mo18845g(C6384b bVar) {
        if (C6394b.m24481d()) {
            C6394b.m24478a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        }
        C2529o0<C6088a<C6367b>> c = m24211c(bVar);
        if (bVar.mo18927h() != null) {
            c = m24224r(c);
        }
        if (this.f17710i) {
            c = m24212d(c);
        }
        if (this.f17716o && bVar.mo18922d() > 0) {
            c = m24215h(c);
        }
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        return c;
    }

    /* renamed from: i */
    public C2529o0<Void> mo18846i(C6384b bVar) {
        m24208C(bVar);
        int s = bVar.mo18939s();
        if (s == 0) {
            return m24223q();
        }
        if (s == 2 || s == 3) {
            return m24218l();
        }
        Uri r = bVar.mo18938r();
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + m24226t(r));
    }
}
