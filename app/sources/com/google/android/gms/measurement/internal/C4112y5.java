package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C3705r;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p174e.p319f.p320a.p335c.p345f.p352g.C6749d5;
import p174e.p319f.p320a.p335c.p345f.p352g.C6766e5;
import p174e.p319f.p320a.p335c.p345f.p352g.C6825he;
import p174e.p319f.p320a.p335c.p345f.p352g.C6847j4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6863k4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6879l4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6895m4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6911n4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6927o4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6975r4;
import p174e.p319f.p320a.p335c.p345f.p352g.C7007t4;
import p174e.p319f.p320a.p335c.p345f.p352g.C7023u4;
import p174e.p319f.p320a.p335c.p345f.p352g.C7039v4;
import p174e.p319f.p320a.p335c.p345f.p352g.C7055w4;
import p174e.p319f.p320a.p335c.p345f.p352g.C7087y4;

/* renamed from: com.google.android.gms.measurement.internal.y5 */
final class C4112y5 implements Callable {

    /* renamed from: a */
    final /* synthetic */ C4094x f11422a;

    /* renamed from: b */
    final /* synthetic */ String f11423b;

    /* renamed from: c */
    final /* synthetic */ C3852d6 f11424c;

    C4112y5(C3852d6 d6Var, C4094x xVar, String str) {
        this.f11424c = d6Var;
        this.f11422a = xVar;
        this.f11423b = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        byte[] bArr;
        C4069ua uaVar;
        C6975r4 r4Var;
        C7023u4 u4Var;
        Bundle bundle;
        String str;
        C3904h6 h6Var;
        long j;
        String str2;
        C4046t tVar;
        this.f11424c.f10629a.mo12284e();
        C4090w7 d0 = this.f11424c.f10629a.mo12283d0();
        C4094x xVar = this.f11422a;
        String str3 = this.f11423b;
        d0.mo11931h();
        C3955l5.m14979t();
        C3705r.m14346k(xVar);
        C3705r.m14342g(str3);
        if (!d0.f10651a.mo12181z().mo12010B(str3, C3966m3.f10980U)) {
            d0.f10651a.mo11935b().mo12543q().mo12477b("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        } else if ("_iap".equals(xVar.f11381f) || "_iapx".equals(xVar.f11381f)) {
            C6975r4 x = C7007t4.m26526x();
            d0.f10552b.mo12277W().mo12216e0();
            try {
                C3904h6 R = d0.f10552b.mo12277W().mo12204R(str3);
                if (R == null) {
                    d0.f10651a.mo11935b().mo12543q().mo12477b("Log and bundle not available. package_name", str3);
                } else if (!R.mo12045J()) {
                    d0.f10651a.mo11935b().mo12543q().mo12477b("Log and bundle disabled. package_name", str3);
                } else {
                    C7023u4 L1 = C7039v4.m26810L1();
                    L1.mo20264f0(1);
                    L1.mo20259Z("android");
                    if (!TextUtils.isEmpty(R.mo12069d0())) {
                        L1.mo20284x(R.mo12069d0());
                    }
                    if (!TextUtils.isEmpty(R.mo12073f0())) {
                        L1.mo20288z((String) C3705r.m14346k(R.mo12073f0()));
                    }
                    if (!TextUtils.isEmpty(R.mo12075g0())) {
                        L1.mo20219B((String) C3705r.m14346k(R.mo12075g0()));
                    }
                    if (R.mo12047L() != -2147483648L) {
                        L1.mo20221C((int) R.mo12047L());
                    }
                    L1.mo20252T(R.mo12058W());
                    L1.mo20240N(R.mo12056U());
                    String i0 = R.mo12079i0();
                    String b0 = R.mo12065b0();
                    if (!TextUtils.isEmpty(i0)) {
                        L1.mo20250S(i0);
                    } else if (!TextUtils.isEmpty(b0)) {
                        L1.mo20282w(b0);
                    }
                    C3923j V = d0.f10552b.mo12276V(str3);
                    L1.mo20233J(R.mo12055T());
                    if (d0.f10651a.mo12174o() && d0.f10651a.mo12181z().mo12011C(L1.mo20276s0()) && V.mo12123i(C3910i.AD_STORAGE) && !TextUtils.isEmpty((CharSequence) null)) {
                        L1.mo20238M((String) null);
                    }
                    L1.mo20230H(V.mo12121h());
                    if (V.mo12123i(C3910i.AD_STORAGE) && (!d0.f10651a.mo12181z().mo12010B((String) null, C3966m3.f11009l0) || R.mo12044I())) {
                        Pair n = d0.f10552b.mo12285e0().mo12132n(R.mo12069d0(), V);
                        if (R.mo12044I() && !TextUtils.isEmpty((CharSequence) n.first)) {
                            L1.mo20265g0(C4090w7.m15376e((String) n.first, Long.toString(xVar.f11384q)));
                            Object obj = n.second;
                            if (obj != null) {
                                L1.mo20256V(((Boolean) obj).booleanValue());
                            }
                        }
                    }
                    d0.f10651a.mo12149A().mo11959k();
                    L1.mo20235K(Build.MODEL);
                    d0.f10651a.mo12149A().mo11959k();
                    L1.mo20258Y(Build.VERSION.RELEASE);
                    L1.mo20270m0((int) d0.f10651a.mo12149A().mo12336p());
                    L1.mo20274q0(d0.f10651a.mo12149A().mo12337q());
                    try {
                        if (V.mo12123i(C3910i.ANALYTICS_STORAGE) && R.mo12071e0() != null) {
                            L1.mo20286y(C4090w7.m15376e((String) C3705r.m14346k(R.mo12071e0()), Long.toString(xVar.f11384q)));
                        }
                        if (!TextUtils.isEmpty(R.mo12077h0())) {
                            L1.mo20248R((String) C3705r.m14346k(R.mo12077h0()));
                        }
                        String d02 = R.mo12069d0();
                        List c0 = d0.f10552b.mo12277W().mo12214c0(d02);
                        Iterator it = c0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                uaVar = null;
                                break;
                            }
                            uaVar = (C4069ua) it.next();
                            if ("_lte".equals(uaVar.f11330c)) {
                                break;
                            }
                        }
                        if (uaVar == null || uaVar.f11332e == null) {
                            C4069ua uaVar2 = new C4069ua(d02, "auto", "_lte", d0.f10651a.mo11936c().mo11730a(), 0L);
                            c0.add(uaVar2);
                            d0.f10552b.mo12277W().mo12231x(uaVar2);
                        }
                        C4033ra g0 = d0.f10552b.mo12287g0();
                        g0.f10651a.mo11935b().mo12548v().mo12476a("Checking account type status for ad personalization signals");
                        if (g0.f10651a.mo12149A().mo12339s()) {
                            String d03 = R.mo12069d0();
                            C3705r.m14346k(d03);
                            if (R.mo12044I() && g0.f10552b.mo12281a0().mo11868B(d03)) {
                                g0.f10651a.mo11935b().mo12543q().mo12476a("Turning off ad personalization due to account type");
                                Iterator it2 = c0.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((C4069ua) it2.next()).f11330c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                c0.add(new C4069ua(d03, "auto", "_npa", g0.f10651a.mo11936c().mo11730a(), 1L));
                            }
                        }
                        C6766e5[] e5VarArr = new C6766e5[c0.size()];
                        for (int i = 0; i < c0.size(); i++) {
                            C6749d5 A = C6766e5.m25622A();
                            A.mo19677z(((C4069ua) c0.get(i)).f11330c);
                            A.mo19670B(((C4069ua) c0.get(i)).f11331d);
                            d0.f10552b.mo12287g0().mo12397K(A, ((C4069ua) c0.get(i)).f11332e);
                            e5VarArr[i] = (C6766e5) A.mo20436r();
                        }
                        L1.mo20227F0(Arrays.asList(e5VarArr));
                        C3811a4 b = C3811a4.m14622b(xVar);
                        d0.f10651a.mo12161N().mo12529z(b.f10508d, d0.f10552b.mo12277W().mo12203Q(str3));
                        d0.f10651a.mo12161N().mo12484A(b, d0.f10651a.mo12181z().mo12020n(str3));
                        Bundle bundle2 = b.f10508d;
                        bundle2.putLong("_c", 1);
                        d0.f10651a.mo11935b().mo12543q().mo12476a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1);
                        bundle2.putString("_o", xVar.f11383p);
                        if (d0.f10651a.mo12161N().mo12503T(L1.mo20276s0())) {
                            d0.f10651a.mo12161N().mo12486C(bundle2, "_dbg", 1L);
                            d0.f10651a.mo12161N().mo12486C(bundle2, "_r", 1L);
                        }
                        C4046t V2 = d0.f10552b.mo12277W().mo12208V(str3, xVar.f11381f);
                        if (V2 == null) {
                            u4Var = L1;
                            h6Var = R;
                            r4Var = x;
                            str = str3;
                            bundle = bundle2;
                            str2 = null;
                            tVar = new C4046t(str3, xVar.f11381f, 0, 0, 0, xVar.f11384q, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                            j = 0;
                        } else {
                            h6Var = R;
                            r4Var = x;
                            str = str3;
                            bundle = bundle2;
                            u4Var = L1;
                            str2 = null;
                            long j2 = V2.f11287f;
                            tVar = V2.mo12422c(xVar.f11384q);
                            j = j2;
                        }
                        d0.f10552b.mo12277W().mo12224q(tVar);
                        C4034s sVar = new C4034s(d0.f10651a, xVar.f11383p, str, xVar.f11381f, xVar.f11384q, j, bundle);
                        C6847j4 B = C6863k4.m26045B();
                        B.mo19864J(sVar.f11256d);
                        B.mo19860D(sVar.f11254b);
                        B.mo19863H(sVar.f11257e);
                        C4058u uVar = new C4058u(sVar.f11258f);
                        while (uVar.hasNext()) {
                            String b2 = uVar.next();
                            C6911n4 B2 = C6927o4.m26284B();
                            B2.mo19981F(b2);
                            Object G = sVar.f11258f.mo12449G(b2);
                            if (G != null) {
                                d0.f10552b.mo12287g0().mo12396J(B2, G);
                                B.mo19873y(B2);
                            }
                        }
                        C7023u4 u4Var2 = u4Var;
                        u4Var2.mo20229G0(B);
                        C7055w4 x2 = C7087y4.m27033x();
                        C6879l4 x3 = C6895m4.m26122x();
                        x3.mo19938u(tVar.f11284c);
                        x3.mo19939v(xVar.f11381f);
                        x2.mo20411u(x3);
                        u4Var2.mo20261b0(x2);
                        u4Var2.mo20220B0(d0.f10552b.mo12274T().mo11857m(h6Var.mo12069d0(), Collections.emptyList(), u4Var2.mo20283w0(), Long.valueOf(B.mo19871w()), Long.valueOf(B.mo19871w())));
                        if (B.mo19868O()) {
                            u4Var2.mo20269l0(B.mo19871w());
                            u4Var2.mo20242O(B.mo19871w());
                        }
                        long X = h6Var.mo12059X();
                        int i2 = (X > 0 ? 1 : (X == 0 ? 0 : -1));
                        if (i2 != 0) {
                            u4Var2.mo20262c0(X);
                        }
                        long Z = h6Var.mo12061Z();
                        if (Z != 0) {
                            u4Var2.mo20263d0(Z);
                        } else if (i2 != 0) {
                            u4Var2.mo20263d0(X);
                        }
                        String b3 = h6Var.mo12064b();
                        C6825he.m25843b();
                        if (d0.f10651a.mo12181z().mo12010B(str2, C3966m3.f10951A0) && b3 != null) {
                            u4Var2.mo20268k0(b3);
                        }
                        h6Var.mo12070e();
                        u4Var2.mo20223D((int) h6Var.mo12060Y());
                        d0.f10651a.mo12181z().mo12023q();
                        u4Var2.mo20272o0(68000);
                        u4Var2.mo20271n0(d0.f10651a.mo11936c().mo11730a());
                        u4Var2.mo20267j0(true);
                        if (d0.f10651a.mo12181z().mo12010B(str2, C3966m3.f10967I0)) {
                            d0.f10552b.mo12288h(u4Var2.mo20276s0(), u4Var2);
                        }
                        C6975r4 r4Var2 = r4Var;
                        r4Var2.mo20122u(u4Var2);
                        C3904h6 h6Var2 = h6Var;
                        h6Var2.mo12038C(u4Var2.mo20289z0());
                        h6Var2.mo12097z(u4Var2.mo20287y0());
                        d0.f10552b.mo12277W().mo12223p(h6Var2);
                        d0.f10552b.mo12277W().mo12222o();
                        d0.f10552b.mo12277W().mo12217f0();
                        try {
                            return d0.f10552b.mo12287g0().mo12399O(((C7007t4) r4Var2.mo20436r()).mo19840k());
                        } catch (IOException e) {
                            d0.f10651a.mo11935b().mo12544r().mo12478c("Data loss. Failed to bundle and serialize. appId", C4122z3.m15469z(str), e);
                            return str2;
                        }
                    } catch (SecurityException e2) {
                        d0.f10651a.mo11935b().mo12543q().mo12477b("app instance id encryption failed", e2.getMessage());
                        bArr = new byte[0];
                    }
                }
            } catch (SecurityException e3) {
                d0.f10651a.mo11935b().mo12543q().mo12477b("Resettable device id encryption failed", e3.getMessage());
            } catch (Throwable th) {
                d0.f10552b.mo12277W().mo12217f0();
                throw th;
            }
            bArr = new byte[0];
            d0.f10552b.mo12277W().mo12217f0();
            return bArr;
        } else {
            d0.f10651a.mo11935b().mo12543q().mo12478c("Generating a payload for this event is not available. package_name, event_name", str3, xVar.f11381f);
            return null;
        }
    }
}
