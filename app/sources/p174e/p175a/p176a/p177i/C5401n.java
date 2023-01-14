package p174e.p175a.p176a.p177i;

import java.util.Iterator;
import okhttp3.HttpUrl;
import p174e.p175a.p176a.C5377b;
import p174e.p175a.p176a.C5380e;
import p174e.p175a.p176a.p177i.p178q.C5406b;
import p174e.p175a.p176a.p177i.p178q.C5408d;
import p174e.p175a.p176a.p179j.C5413e;

/* renamed from: e.a.a.i.n */
public class C5401n {
    /* renamed from: a */
    static void m20049a(C5399m mVar, String str, String str2) {
        C5399m mVar2 = new C5399m(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, str2, (C5413e) null);
        C5399m mVar3 = new C5399m("xml:lang", str, (C5413e) null);
        mVar2.mo16274h(mVar3);
        if (!"x-default".equals(mVar3.mo16264Z())) {
            mVar.mo16272g(mVar2);
        } else {
            mVar.mo16271e(1, mVar2);
        }
    }

    /* renamed from: b */
    static Object[] m20050b(C5399m mVar, String str, String str2) {
        if (mVar.mo16259T().mo16342j()) {
            C5399m mVar2 = null;
            if (!mVar.mo16265a0()) {
                return new Object[]{new Integer(0), null};
            }
            Iterator g0 = mVar.mo16273g0();
            C5399m mVar3 = null;
            int i = 0;
            while (g0.hasNext()) {
                C5399m mVar4 = (C5399m) g0.next();
                if (mVar4.mo16259T().mo16345m()) {
                    throw new C5377b("Alt-text array item is not simple", 102);
                } else if (!mVar4.mo16266b0() || !"xml:lang".equals(mVar4.mo16261V(1).mo16258S())) {
                    throw new C5377b("Alt-text array item has no language qualifier", 102);
                } else {
                    String Z = mVar4.mo16261V(1).mo16264Z();
                    if (str2.equals(Z)) {
                        return new Object[]{new Integer(1), mVar4};
                    } else if (str != null && Z.startsWith(str)) {
                        if (mVar2 == null) {
                            mVar2 = mVar4;
                        }
                        i++;
                    } else if ("x-default".equals(Z)) {
                        mVar3 = mVar4;
                    }
                }
            }
            if (i == 1) {
                return new Object[]{new Integer(2), mVar2};
            } else if (i > 1) {
                return new Object[]{new Integer(3), mVar2};
            } else if (mVar3 != null) {
                return new Object[]{new Integer(4), mVar3};
            } else {
                return new Object[]{new Integer(5), mVar.mo16254N(1)};
            }
        } else {
            throw new C5377b("Localized text array is not alt-text", 102);
        }
    }

    /* renamed from: c */
    static void m20051c(C5399m mVar) {
        C5399m U = mVar.mo16260U();
        if (mVar.mo16259T().mo16346n()) {
            U.mo16279l0(mVar);
        } else {
            U.mo16277j0(mVar);
        }
        if (!U.mo16265a0() && U.mo16259T().mo16347o()) {
            U.mo16260U().mo16277j0(U);
        }
    }

    /* renamed from: d */
    static void m20052d(C5399m mVar) {
        if (mVar.mo16259T().mo16343k() && mVar.mo16265a0()) {
            boolean z = false;
            Iterator g0 = mVar.mo16273g0();
            while (true) {
                if (g0.hasNext()) {
                    if (((C5399m) g0.next()).mo16259T().mo16340h()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                mVar.mo16259T().mo16352t(true);
                m20063o(mVar);
            }
        }
    }

    /* renamed from: e */
    static C5399m m20053e(C5399m mVar, String str, boolean z) {
        if (!mVar.mo16259T().mo16347o() && !mVar.mo16259T().mo16349q()) {
            if (!mVar.mo16270d0()) {
                throw new C5377b("Named children only allowed for schemas and structs", 102);
            } else if (mVar.mo16259T().mo16341i()) {
                throw new C5377b("Named children not allowed for arrays", 102);
            } else if (z) {
                mVar.mo16259T().mo16338B(true);
            }
        }
        C5399m F = mVar.mo16252F(str);
        if (F != null || !z) {
            return F;
        }
        C5399m mVar2 = new C5399m(str, new C5413e());
        mVar2.mo16285r0(true);
        mVar.mo16272g(mVar2);
        return mVar2;
    }

    /* renamed from: f */
    private static int m20054f(C5399m mVar, String str, boolean z) {
        try {
            int parseInt = Integer.parseInt(str.substring(1, str.length() - 1));
            if (parseInt >= 1) {
                if (z && parseInt == mVar.mo16255P() + 1) {
                    C5399m mVar2 = new C5399m(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, (C5413e) null);
                    mVar2.mo16285r0(true);
                    mVar.mo16272g(mVar2);
                }
                return parseInt;
            }
            throw new C5377b("Array index must be larger than zero", 102);
        } catch (NumberFormatException unused) {
            throw new C5377b("Array index not digits.", 102);
        }
    }

    /* renamed from: g */
    static C5399m m20055g(C5399m mVar, C5406b bVar, boolean z, C5413e eVar) {
        C5399m mVar2;
        if (bVar == null || bVar.mo16301c() == 0) {
            throw new C5377b("Empty XMPPath", 102);
        }
        C5399m j = m20058j(mVar, bVar.mo16300b(0).mo16305c(), z);
        if (j == null) {
            return null;
        }
        if (j.mo16270d0()) {
            j.mo16285r0(false);
            mVar2 = j;
        } else {
            mVar2 = null;
        }
        int i = 1;
        while (i < bVar.mo16301c()) {
            try {
                j = m20059k(j, bVar.mo16300b(i), z);
                if (j == null) {
                    if (z) {
                        m20051c(mVar2);
                    }
                    return null;
                }
                if (j.mo16270d0()) {
                    j.mo16285r0(false);
                    if (i == 1 && bVar.mo16300b(i).mo16306d() && bVar.mo16300b(i).mo16303a() != 0) {
                        j.mo16259T().mo16327f(bVar.mo16300b(i).mo16303a(), true);
                    } else if (i < bVar.mo16301c() - 1 && bVar.mo16300b(i).mo16304b() == 1 && !j.mo16259T().mo16345m()) {
                        j.mo16259T().mo16338B(true);
                    }
                    if (mVar2 == null) {
                        mVar2 = j;
                    }
                }
                i++;
            } catch (C5377b e) {
                if (mVar2 != null) {
                    m20051c(mVar2);
                }
                throw e;
            }
        }
        if (mVar2 != null) {
            j.mo16259T().mo16350r(eVar);
            j.mo16287t0(j.mo16259T());
        }
        return j;
    }

    /* renamed from: h */
    private static C5399m m20056h(C5399m mVar, String str, boolean z) {
        C5399m K = mVar.mo16253K(str);
        if (K != null || !z) {
            return K;
        }
        C5399m mVar2 = new C5399m(str, (C5413e) null);
        mVar2.mo16285r0(true);
        mVar.mo16274h(mVar2);
        return mVar2;
    }

    /* renamed from: i */
    static C5399m m20057i(C5399m mVar, String str, String str2, boolean z) {
        C5399m F = mVar.mo16252F(str);
        if (F == null && z) {
            F = new C5399m(str, new C5413e().mo16337A(true));
            F.mo16285r0(true);
            String a = C5380e.m19891a().mo16210a(str);
            if (a == null) {
                if (str2 == null || str2.length() == 0) {
                    throw new C5377b("Unregistered schema namespace URI", 101);
                }
                a = C5380e.m19891a().mo16212c(str, str2);
            }
            F.mo16289v0(a);
            mVar.mo16272g(F);
        }
        return F;
    }

    /* renamed from: j */
    static C5399m m20058j(C5399m mVar, String str, boolean z) {
        return m20057i(mVar, str, (String) null, z);
    }

    /* renamed from: k */
    private static C5399m m20059k(C5399m mVar, C5408d dVar, boolean z) {
        int i;
        int b = dVar.mo16304b();
        if (b == 1) {
            return m20053e(mVar, dVar.mo16305c(), z);
        }
        if (b == 2) {
            return m20056h(mVar, dVar.mo16305c().substring(1), z);
        }
        if (mVar.mo16259T().mo16341i()) {
            if (b == 3) {
                i = m20054f(mVar, dVar.mo16305c(), z);
            } else if (b == 4) {
                i = mVar.mo16255P();
            } else if (b == 6) {
                String[] i2 = C5391h.m19960i(dVar.mo16305c());
                i = m20060l(mVar, i2[0], i2[1]);
            } else if (b == 5) {
                String[] i3 = C5391h.m19960i(dVar.mo16305c());
                i = m20062n(mVar, i3[0], i3[1], dVar.mo16303a());
            } else {
                throw new C5377b("Unknown array indexing step in FollowXPathStep", 9);
            }
            if (1 > i || i > mVar.mo16255P()) {
                return null;
            }
            return mVar.mo16254N(i);
        }
        throw new C5377b("Indexing applied to non-array", 102);
    }

    /* renamed from: l */
    private static int m20060l(C5399m mVar, String str, String str2) {
        int i = -1;
        int i2 = 1;
        while (i2 <= mVar.mo16255P() && i < 0) {
            C5399m N = mVar.mo16254N(i2);
            if (N.mo16259T().mo16349q()) {
                int i3 = 1;
                while (true) {
                    if (i3 > N.mo16255P()) {
                        break;
                    }
                    C5399m N2 = N.mo16254N(i3);
                    if (str.equals(N2.mo16258S()) && str2.equals(N2.mo16264Z())) {
                        i = i2;
                        break;
                    }
                    i3++;
                }
                i2++;
            } else {
                throw new C5377b("Field selector must be used on array of struct", 102);
            }
        }
        return i;
    }

    /* renamed from: m */
    static int m20061m(C5399m mVar, String str) {
        if (mVar.mo16259T().mo16341i()) {
            for (int i = 1; i <= mVar.mo16255P(); i++) {
                C5399m N = mVar.mo16254N(i);
                if (N.mo16266b0() && "xml:lang".equals(N.mo16261V(1).mo16258S()) && str.equals(N.mo16261V(1).mo16264Z())) {
                    return i;
                }
            }
            return -1;
        }
        throw new C5377b("Language item must be used on array", 102);
    }

    /* renamed from: n */
    private static int m20062n(C5399m mVar, String str, String str2, int i) {
        if ("xml:lang".equals(str)) {
            int m = m20061m(mVar, C5391h.m19959h(str2));
            if (m >= 0 || (i & 4096) <= 0) {
                return m;
            }
            C5399m mVar2 = new C5399m(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, (C5413e) null);
            mVar2.mo16274h(new C5399m("xml:lang", "x-default", (C5413e) null));
            mVar.mo16271e(1, mVar2);
            return 1;
        }
        for (int i2 = 1; i2 < mVar.mo16255P(); i2++) {
            Iterator h0 = mVar.mo16254N(i2).mo16275h0();
            while (h0.hasNext()) {
                C5399m mVar3 = (C5399m) h0.next();
                if (str.equals(mVar3.mo16258S()) && str2.equals(mVar3.mo16264Z())) {
                    return i2;
                }
            }
        }
        return -1;
    }

    /* renamed from: o */
    static void m20063o(C5399m mVar) {
        if (mVar.mo16259T().mo16342j()) {
            int i = 2;
            while (i <= mVar.mo16255P()) {
                C5399m N = mVar.mo16254N(i);
                if (!N.mo16266b0() || !"x-default".equals(N.mo16261V(1).mo16264Z())) {
                    i++;
                } else {
                    try {
                        mVar.mo16276i0(i);
                        mVar.mo16271e(1, N);
                    } catch (C5377b unused) {
                    }
                    if (i == 2) {
                        mVar.mo16254N(2).mo16289v0(N.mo16264Z());
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: p */
    static C5413e m20064p(C5413e eVar, Object obj) {
        if (eVar == null) {
            eVar = new C5413e();
        }
        if (eVar.mo16342j()) {
            eVar.mo16353u(true);
        }
        if (eVar.mo16343k()) {
            eVar.mo16354v(true);
        }
        if (eVar.mo16344l()) {
            eVar.mo16351s(true);
        }
        if (!eVar.mo16345m() || obj == null || obj.toString().length() <= 0) {
            eVar.mo16323a(eVar.mo16325d());
            return eVar;
        }
        throw new C5377b("Structs and arrays can't have values", 103);
    }
}
