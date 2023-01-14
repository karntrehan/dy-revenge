package p174e.p175a.p176a.p177i;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.HttpUrl;
import p174e.p175a.p176a.C5376a;
import p174e.p175a.p176a.C5377b;
import p174e.p175a.p176a.C5379d;
import p174e.p175a.p176a.C5380e;
import p174e.p175a.p176a.C5382g;
import p174e.p175a.p176a.p177i.p178q.C5407c;
import p174e.p175a.p176a.p179j.C5412d;
import p174e.p175a.p176a.p179j.C5413e;
import p174e.p175a.p176a.p180k.C5414a;

/* renamed from: e.a.a.i.o */
public class C5402o {

    /* renamed from: a */
    private static Map f15091a;

    static {
        m20068d();
    }

    /* renamed from: a */
    private static void m20065a(C5399m mVar, C5399m mVar2, boolean z) {
        if (!mVar.mo16264Z().equals(mVar2.mo16264Z()) || mVar.mo16255P() != mVar2.mo16255P()) {
            throw new C5377b("Mismatch between alias and base nodes", 203);
        } else if (z || (mVar.mo16258S().equals(mVar2.mo16258S()) && mVar.mo16259T().equals(mVar2.mo16259T()) && mVar.mo16262X() == mVar2.mo16262X())) {
            Iterator g0 = mVar.mo16273g0();
            Iterator g02 = mVar2.mo16273g0();
            while (g0.hasNext() && g02.hasNext()) {
                m20065a((C5399m) g0.next(), (C5399m) g02.next(), false);
            }
            Iterator h0 = mVar.mo16275h0();
            Iterator h02 = mVar2.mo16275h0();
            while (h0.hasNext() && h02.hasNext()) {
                m20065a((C5399m) h0.next(), (C5399m) h02.next(), false);
            }
        } else {
            throw new C5377b("Mismatch between alias and base nodes", 203);
        }
    }

    /* renamed from: b */
    private static void m20066b(C5399m mVar) {
        Iterator g0 = mVar.mo16273g0();
        while (g0.hasNext()) {
            if (!((C5399m) g0.next()).mo16265a0()) {
                g0.remove();
            }
        }
    }

    /* renamed from: c */
    private static void m20067c(C5399m mVar) {
        C5399m e = C5401n.m20053e(mVar, "exif:GPSTimeStamp", false);
        if (e != null) {
            try {
                C5376a b = C5382g.m19903b(e.mo16264Z());
                if (b.mo16202t() != 0 || b.mo16203u() != 0) {
                    return;
                }
                if (b.mo16204x() == 0) {
                    C5399m e2 = C5401n.m20053e(mVar, "exif:DateTimeOriginal", false);
                    if (e2 == null) {
                        e2 = C5401n.m20053e(mVar, "exif:DateTimeDigitized", false);
                    }
                    C5376a b2 = C5382g.m19903b(e2.mo16264Z());
                    Calendar o = b.mo16197o();
                    o.set(1, b2.mo16202t());
                    o.set(2, b2.mo16203u());
                    o.set(5, b2.mo16204x());
                    e.mo16289v0(C5382g.m19902a(new C5392i(o)));
                }
            } catch (C5377b unused) {
            }
        }
    }

    /* renamed from: d */
    private static void m20068d() {
        f15091a = new HashMap();
        C5413e eVar = new C5413e();
        eVar.mo16351s(true);
        f15091a.put("dc:contributor", eVar);
        f15091a.put("dc:language", eVar);
        f15091a.put("dc:publisher", eVar);
        f15091a.put("dc:relation", eVar);
        f15091a.put("dc:subject", eVar);
        f15091a.put("dc:type", eVar);
        C5413e eVar2 = new C5413e();
        eVar2.mo16351s(true);
        eVar2.mo16354v(true);
        f15091a.put("dc:creator", eVar2);
        f15091a.put("dc:date", eVar2);
        C5413e eVar3 = new C5413e();
        eVar3.mo16351s(true);
        eVar3.mo16354v(true);
        eVar3.mo16353u(true);
        eVar3.mo16352t(true);
        f15091a.put("dc:description", eVar3);
        f15091a.put("dc:rights", eVar3);
        f15091a.put("dc:title", eVar3);
    }

    /* renamed from: e */
    private static void m20069e(C5379d dVar, C5399m mVar) {
        String str;
        try {
            C5399m j = C5401n.m20058j(((C5397k) dVar).mo16247c(), "http://purl.org/dc/elements/1.1/", true);
            String Z = mVar.mo16264Z();
            C5399m e = C5401n.m20053e(j, "dc:rights", false);
            if (e != null) {
                if (e.mo16265a0()) {
                    int m = C5401n.m20061m(e, "x-default");
                    if (m < 0) {
                        dVar.mo16207A("http://purl.org/dc/elements/1.1/", "rights", HttpUrl.FRAGMENT_ENCODE_SET, "x-default", e.mo16254N(1).mo16264Z(), (C5413e) null);
                        m = C5401n.m20061m(e, "x-default");
                    }
                    C5399m N = e.mo16254N(m);
                    String Z2 = N.mo16264Z();
                    int indexOf = Z2.indexOf("\n\n");
                    if (indexOf < 0) {
                        if (!Z.equals(Z2)) {
                            str = Z2 + "\n\n" + Z;
                        }
                        mVar.mo16260U().mo16277j0(mVar);
                    }
                    int i = indexOf + 2;
                    if (!Z2.substring(i).equals(Z)) {
                        str = Z2.substring(0, i) + Z;
                    }
                    mVar.mo16260U().mo16277j0(mVar);
                    N.mo16289v0(str);
                    mVar.mo16260U().mo16277j0(mVar);
                }
            }
            dVar.mo16207A("http://purl.org/dc/elements/1.1/", "rights", HttpUrl.FRAGMENT_ENCODE_SET, "x-default", "\n\n" + Z, (C5413e) null);
            mVar.mo16260U().mo16277j0(mVar);
        } catch (C5377b unused) {
        }
    }

    /* renamed from: f */
    private static void m20070f(C5399m mVar, C5412d dVar) {
        if (mVar.mo16256Q()) {
            mVar.mo16283p0(false);
            boolean m = dVar.mo16336m();
            for (C5399m mVar2 : mVar.mo16263Y()) {
                if (mVar2.mo16256Q()) {
                    Iterator g0 = mVar2.mo16273g0();
                    while (g0.hasNext()) {
                        C5399m mVar3 = (C5399m) g0.next();
                        if (mVar3.mo16267c0()) {
                            mVar3.mo16282o0(false);
                            C5414a d = C5380e.m19891a().mo16213d(mVar3.mo16258S());
                            if (d != null) {
                                C5399m mVar4 = null;
                                C5399m i = C5401n.m20057i(mVar, d.mo16294a(), (String) null, true);
                                i.mo16285r0(false);
                                C5399m e = C5401n.m20053e(i, d.mo16295b() + d.mo16296c(), false);
                                if (e == null) {
                                    if (d.mo16297d().mo16315j()) {
                                        mVar3.mo16286s0(d.mo16295b() + d.mo16296c());
                                        i.mo16272g(mVar3);
                                    } else {
                                        C5399m mVar5 = new C5399m(d.mo16295b() + d.mo16296c(), d.mo16297d().mo16318m());
                                        i.mo16272g(mVar5);
                                        m20075k(g0, mVar3, mVar5);
                                    }
                                } else if (!d.mo16297d().mo16315j()) {
                                    if (d.mo16297d().mo16314i()) {
                                        int m2 = C5401n.m20061m(e, "x-default");
                                        if (m2 != -1) {
                                            mVar4 = e.mo16254N(m2);
                                        }
                                    } else if (e.mo16265a0()) {
                                        mVar4 = e.mo16254N(1);
                                    }
                                    if (mVar4 == null) {
                                        m20075k(g0, mVar3, e);
                                    } else if (m) {
                                        m20065a(mVar3, mVar4, true);
                                    }
                                } else if (m) {
                                    m20065a(mVar3, e, true);
                                }
                                g0.remove();
                            }
                        }
                    }
                    mVar2.mo16283p0(false);
                }
            }
        }
    }

    /* renamed from: g */
    private static void m20071g(C5399m mVar) {
        for (int i = 1; i <= mVar.mo16255P(); i++) {
            C5399m N = mVar.mo16254N(i);
            C5413e eVar = (C5413e) f15091a.get(N.mo16258S());
            if (eVar != null) {
                if (N.mo16259T().mo16348p()) {
                    C5399m mVar2 = new C5399m(N.mo16258S(), eVar);
                    N.mo16286s0(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                    mVar2.mo16272g(N);
                    mVar.mo16281n0(i, mVar2);
                    if (eVar.mo16342j() && !N.mo16259T().mo16340h()) {
                        N.mo16274h(new C5399m("xml:lang", "x-default", (C5413e) null));
                    }
                } else {
                    N.mo16259T().mo16327f(7680, false);
                    N.mo16259T().mo16350r(eVar);
                    if (eVar.mo16342j()) {
                        m20073i(N);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    static C5379d m20072h(C5397k kVar, C5412d dVar) {
        C5399m c = kVar.mo16247c();
        m20074j(kVar);
        m20070f(c, dVar);
        m20076l(c);
        m20066b(c);
        return kVar;
    }

    /* renamed from: i */
    private static void m20073i(C5399m mVar) {
        if (mVar != null && mVar.mo16259T().mo16341i()) {
            mVar.mo16259T().mo16354v(true).mo16353u(true).mo16352t(true);
            Iterator g0 = mVar.mo16273g0();
            while (g0.hasNext()) {
                C5399m mVar2 = (C5399m) g0.next();
                if (!mVar2.mo16259T().mo16345m()) {
                    if (!mVar2.mo16259T().mo16340h()) {
                        String Z = mVar2.mo16264Z();
                        if (!(Z == null || Z.length() == 0)) {
                            mVar2.mo16274h(new C5399m("xml:lang", "x-repair", (C5413e) null));
                        }
                    }
                }
                g0.remove();
            }
        }
    }

    /* renamed from: j */
    private static void m20074j(C5397k kVar) {
        C5399m e;
        C5401n.m20058j(kVar.mo16247c(), "http://purl.org/dc/elements/1.1/", true);
        Iterator g0 = kVar.mo16247c().mo16273g0();
        while (g0.hasNext()) {
            C5399m mVar = (C5399m) g0.next();
            if ("http://purl.org/dc/elements/1.1/".equals(mVar.mo16258S())) {
                m20071g(mVar);
            } else {
                if ("http://ns.adobe.com/exif/1.0/".equals(mVar.mo16258S())) {
                    m20067c(mVar);
                    e = C5401n.m20053e(mVar, "exif:UserComment", false);
                    if (e == null) {
                    }
                } else if ("http://ns.adobe.com/xmp/1.0/DynamicMedia/".equals(mVar.mo16258S())) {
                    C5399m e2 = C5401n.m20053e(mVar, "xmpDM:copyright", false);
                    if (e2 != null) {
                        m20069e(kVar, e2);
                    }
                } else if ("http://ns.adobe.com/xap/1.0/rights/".equals(mVar.mo16258S())) {
                    e = C5401n.m20053e(mVar, "xmpRights:UsageTerms", false);
                    if (e == null) {
                    }
                }
                m20073i(e);
            }
        }
    }

    /* renamed from: k */
    private static void m20075k(Iterator it, C5399m mVar, C5399m mVar2) {
        if (mVar2.mo16259T().mo16342j()) {
            if (!mVar.mo16259T().mo16340h()) {
                mVar.mo16274h(new C5399m("xml:lang", "x-default", (C5413e) null));
            } else {
                throw new C5377b("Alias to x-default already has a language qualifier", 203);
            }
        }
        it.remove();
        mVar.mo16286s0(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        mVar2.mo16272g(mVar);
    }

    /* renamed from: l */
    private static void m20076l(C5399m mVar) {
        if (mVar.mo16258S() != null && mVar.mo16258S().length() >= 36) {
            String lowerCase = mVar.mo16258S().toLowerCase();
            if (lowerCase.startsWith("uuid:")) {
                lowerCase = lowerCase.substring(5);
            }
            if (C5391h.m19952a(lowerCase)) {
                C5399m g = C5401n.m20055g(mVar, C5407c.m20091a("http://ns.adobe.com/xap/1.0/mm/", "InstanceID"), true, (C5413e) null);
                if (g != null) {
                    g.mo16287t0((C5413e) null);
                    g.mo16289v0("uuid:" + lowerCase);
                    g.mo16278k0();
                    g.mo16280m0();
                    mVar.mo16286s0((String) null);
                    return;
                }
                throw new C5377b("Failure creating xmpMM:InstanceID", 9);
            }
        }
    }
}
