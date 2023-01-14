package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3705r;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p335c.p345f.p352g.C6696a3;
import p174e.p319f.p320a.p335c.p345f.p352g.C6698a5;
import p174e.p319f.p320a.p335c.p345f.p352g.C6730c3;
import p174e.p319f.p320a.p335c.p345f.p352g.C6732c5;
import p174e.p319f.p320a.p335c.p345f.p352g.C6749d5;
import p174e.p319f.p320a.p335c.p345f.p352g.C6766e5;
import p174e.p319f.p320a.p335c.p345f.p352g.C6788fa;
import p174e.p319f.p320a.p335c.p345f.p352g.C6799g4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6814h3;
import p174e.p319f.p320a.p335c.p345f.p352g.C6825he;
import p174e.p319f.p320a.p335c.p345f.p352g.C6831i4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6846j3;
import p174e.p319f.p320a.p335c.p345f.p352g.C6847j4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6863k4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6899m8;
import p174e.p319f.p320a.p335c.p345f.p352g.C6911n4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6926o3;
import p174e.p319f.p320a.p335c.p345f.p352g.C6927o4;
import p174e.p319f.p320a.p335c.p345f.p352g.C7007t4;
import p174e.p319f.p320a.p335c.p345f.p352g.C7023u4;
import p174e.p319f.p320a.p335c.p345f.p352g.C7032ud;
import p174e.p319f.p320a.p335c.p345f.p352g.C7039v4;

/* renamed from: com.google.android.gms.measurement.internal.ra */
public final class C4033ra extends C3843ca {
    C4033ra(C4009pa paVar) {
        super(paVar);
    }

    /* renamed from: C */
    static C6788fa m15282C(C6788fa faVar, byte[] bArr) {
        C6899m8 b = C6899m8.m26141b();
        return b != null ? faVar.mo19765W(bArr, b) : faVar.mo19767h(bArr);
    }

    /* renamed from: H */
    static List m15283H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: L */
    static boolean m15284L(List list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
    }

    /* renamed from: N */
    static boolean m15285N(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: P */
    static final void m15286P(C6847j4 j4Var, String str, Object obj) {
        List N = j4Var.mo19867N();
        int i = 0;
        while (true) {
            if (i >= N.size()) {
                i = -1;
                break;
            } else if (str.equals(((C6927o4) N.get(i)).mo20057D())) {
                break;
            } else {
                i++;
            }
        }
        C6911n4 B = C6927o4.m26284B();
        B.mo19981F(str);
        if (obj instanceof Long) {
            B.mo19980D(((Long) obj).longValue());
        }
        if (i >= 0) {
            j4Var.mo19861F(i, B);
        } else {
            j4Var.mo19873y(B);
        }
    }

    /* renamed from: m */
    static final boolean m15287m(C4094x xVar, C3844cb cbVar) {
        C3705r.m14346k(xVar);
        C3705r.m14346k(cbVar);
        return !TextUtils.isEmpty(cbVar.f10594o) || !TextUtils.isEmpty(cbVar.f10585D);
    }

    /* renamed from: n */
    static final C6927o4 m15288n(C6863k4 k4Var, String str) {
        for (C6927o4 o4Var : k4Var.mo19917F()) {
            if (o4Var.mo20057D().equals(str)) {
                return o4Var;
            }
        }
        return null;
    }

    /* renamed from: o */
    static final Object m15289o(C6863k4 k4Var, String str) {
        C6927o4 n = m15288n(k4Var, str);
        if (n == null) {
            return null;
        }
        if (n.mo20064U()) {
            return n.mo20058E();
        }
        if (n.mo20062S()) {
            return Long.valueOf(n.mo20056A());
        }
        if (n.mo20060Q()) {
            return Double.valueOf(n.mo20065x());
        }
        if (n.mo20067z() <= 0) {
            return null;
        }
        List<C6927o4> F = n.mo20059F();
        ArrayList arrayList = new ArrayList();
        for (C6927o4 o4Var : F) {
            if (o4Var != null) {
                Bundle bundle = new Bundle();
                for (C6927o4 o4Var2 : o4Var.mo20059F()) {
                    if (o4Var2.mo20064U()) {
                        bundle.putString(o4Var2.mo20057D(), o4Var2.mo20058E());
                    } else if (o4Var2.mo20062S()) {
                        bundle.putLong(o4Var2.mo20057D(), o4Var2.mo20056A());
                    } else if (o4Var2.mo20060Q()) {
                        bundle.putDouble(o4Var2.mo20057D(), o4Var2.mo20065x());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: p */
    private final void m15290p(StringBuilder sb, int i, List list) {
        if (list != null) {
            int i2 = i + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C6927o4 o4Var = (C6927o4) it.next();
                if (o4Var != null) {
                    m15292r(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    m15295u(sb, i2, "name", o4Var.mo20063T() ? this.f10651a.mo12152D().mo12439e(o4Var.mo20057D()) : null);
                    m15295u(sb, i2, "string_value", o4Var.mo20064U() ? o4Var.mo20058E() : null);
                    m15295u(sb, i2, "int_value", o4Var.mo20062S() ? Long.valueOf(o4Var.mo20056A()) : null);
                    if (o4Var.mo20060Q()) {
                        d = Double.valueOf(o4Var.mo20065x());
                    }
                    m15295u(sb, i2, "double_value", d);
                    if (o4Var.mo20067z() > 0) {
                        m15290p(sb, i2, o4Var.mo20059F());
                    }
                    m15292r(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: q */
    private final void m15291q(StringBuilder sb, int i, C6730c3 c3Var) {
        String str;
        if (c3Var != null) {
            m15292r(sb, i);
            sb.append("filter {\n");
            if (c3Var.mo19604E()) {
                m15295u(sb, i, "complement", Boolean.valueOf(c3Var.mo19603D()));
            }
            if (c3Var.mo19606G()) {
                m15295u(sb, i, "param_name", this.f10651a.mo12152D().mo12439e(c3Var.mo19602B()));
            }
            if (c3Var.mo19607H()) {
                int i2 = i + 1;
                C6926o3 A = c3Var.mo19601A();
                if (A != null) {
                    m15292r(sb, i2);
                    sb.append("string_filter {\n");
                    if (A.mo20053F()) {
                        switch (A.mo20054G()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        m15295u(sb, i2, "match_type", str);
                    }
                    if (A.mo20052E()) {
                        m15295u(sb, i2, "expression", A.mo20048A());
                    }
                    if (A.mo20051D()) {
                        m15295u(sb, i2, "case_sensitive", Boolean.valueOf(A.mo20050C()));
                    }
                    if (A.mo20055x() > 0) {
                        m15292r(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : A.mo20049B()) {
                            m15292r(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m15292r(sb, i2);
                    sb.append("}\n");
                }
            }
            if (c3Var.mo19605F()) {
                m15296v(sb, i + 1, "number_filter", c3Var.mo19608z());
            }
            m15292r(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: r */
    private static final void m15292r(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: s */
    private static final String m15293s(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: t */
    private static final void m15294t(StringBuilder sb, int i, String str, C6698a5 a5Var) {
        if (a5Var != null) {
            m15292r(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (a5Var.mo19510y() != 0) {
                m15292r(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l : a5Var.mo19506H()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (a5Var.mo19502A() != 0) {
                m15292r(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l2 : a5Var.mo19508J()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (a5Var.mo19509x() != 0) {
                m15292r(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (C6831i4 i4Var : a5Var.mo19505G()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(i4Var.mo19837E() ? Integer.valueOf(i4Var.mo19838x()) : null);
                    sb.append(":");
                    sb.append(i4Var.mo19836D() ? Long.valueOf(i4Var.mo19839y()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (a5Var.mo19511z() != 0) {
                m15292r(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C6732c5 c5Var : a5Var.mo19507I()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(c5Var.mo19611F() ? Integer.valueOf(c5Var.mo19613y()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : c5Var.mo19610C()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            m15292r(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: u */
    private static final void m15295u(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m15292r(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: v */
    private static final void m15296v(StringBuilder sb, int i, String str, C6814h3 h3Var) {
        if (h3Var != null) {
            m15292r(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (h3Var.mo19814D()) {
                int I = h3Var.mo19819I();
                m15295u(sb, i, "comparison_type", I != 1 ? I != 2 ? I != 3 ? I != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if (h3Var.mo19816F()) {
                m15295u(sb, i, "match_as_float", Boolean.valueOf(h3Var.mo19813C()));
            }
            if (h3Var.mo19815E()) {
                m15295u(sb, i, "comparison_value", h3Var.mo19820z());
            }
            if (h3Var.mo19818H()) {
                m15295u(sb, i, "min_comparison_value", h3Var.mo19812B());
            }
            if (h3Var.mo19817G()) {
                m15295u(sb, i, "max_comparison_value", h3Var.mo19811A());
            }
            m15292r(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: w */
    static int m15297w(C7023u4 u4Var, String str) {
        if (u4Var != null) {
            for (int i = 0; i < u4Var.mo20285x0(); i++) {
                if (str.equals(u4Var.mo20275r0(i).mo19696C())) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.get("_o");
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C4094x mo12389A(p174e.p319f.p320a.p335c.p345f.p352g.C6709b r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.mo19548e()
            r1 = 1
            android.os.Bundle r0 = r8.mo12401y(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001c
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r1 = "app"
        L_0x001e:
            r5 = r1
            java.lang.String r1 = r9.mo19547d()
            java.lang.String r1 = com.google.android.gms.measurement.internal.C3930j6.m14951b(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r9.mo19547d()
        L_0x002d:
            r3 = r1
            com.google.android.gms.measurement.internal.x r1 = new com.google.android.gms.measurement.internal.x
            com.google.android.gms.measurement.internal.v r4 = new com.google.android.gms.measurement.internal.v
            r4.<init>(r0)
            long r6 = r9.mo19543a()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4033ra.mo12389A(e.f.a.c.f.g.b):com.google.android.gms.measurement.internal.x");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final C6863k4 mo12390B(C4034s sVar) {
        C6847j4 B = C6863k4.m26045B();
        B.mo19863H(sVar.f11257e);
        C4058u uVar = new C4058u(sVar.f11258f);
        while (uVar.hasNext()) {
            String b = uVar.next();
            C6911n4 B2 = C6927o4.m26284B();
            B2.mo19981F(b);
            Object G = sVar.f11258f.mo12449G(b);
            C3705r.m14346k(G);
            mo12396J(B2, G);
            B.mo19873y(B2);
        }
        return (C6863k4) B.mo20436r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final String mo12391D(C7007t4 t4Var) {
        if (t4Var == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C7039v4 v4Var : t4Var.mo20184A()) {
            if (v4Var != null) {
                m15292r(sb, 1);
                sb.append("bundle {\n");
                if (v4Var.mo20360n1()) {
                    m15295u(sb, 1, "protocol_version", Integer.valueOf(v4Var.mo20369w1()));
                }
                C6825he.m25843b();
                if (this.f10651a.mo12181z().mo12010B((String) null, C3966m3.f10951A0) && v4Var.mo20363q1()) {
                    m15295u(sb, 1, "session_stitching_token", v4Var.mo20335H());
                }
                m15295u(sb, 1, "platform", v4Var.mo20331F());
                if (v4Var.mo20356j1()) {
                    m15295u(sb, 1, "gmp_version", Long.valueOf(v4Var.mo20330E1()));
                }
                if (v4Var.mo20367u1()) {
                    m15295u(sb, 1, "uploading_gmp_version", Long.valueOf(v4Var.mo20340J1()));
                }
                if (v4Var.mo20354h1()) {
                    m15295u(sb, 1, "dynamite_version", Long.valueOf(v4Var.mo20326C1()));
                }
                if (v4Var.mo20351e1()) {
                    m15295u(sb, 1, "config_version", Long.valueOf(v4Var.mo20322A1()));
                }
                m15295u(sb, 1, "gmp_app_id", v4Var.mo20325C());
                m15295u(sb, 1, "admob_app_id", v4Var.mo20345O1());
                m15295u(sb, 1, "app_id", v4Var.mo20346P1());
                m15295u(sb, 1, "app_version", v4Var.mo20370x());
                if (v4Var.mo20377z0()) {
                    m15295u(sb, 1, "app_version_major", Integer.valueOf(v4Var.mo20349Y()));
                }
                m15295u(sb, 1, "firebase_instance_id", v4Var.mo20323B());
                if (v4Var.mo20353g1()) {
                    m15295u(sb, 1, "dev_cert_hash", Long.valueOf(v4Var.mo20324B1()));
                }
                m15295u(sb, 1, "app_store", v4Var.mo20348R1());
                if (v4Var.mo20366t1()) {
                    m15295u(sb, 1, "upload_timestamp_millis", Long.valueOf(v4Var.mo20338I1()));
                }
                if (v4Var.mo20364r1()) {
                    m15295u(sb, 1, "start_timestamp_millis", Long.valueOf(v4Var.mo20336H1()));
                }
                if (v4Var.mo20355i1()) {
                    m15295u(sb, 1, "end_timestamp_millis", Long.valueOf(v4Var.mo20328D1()));
                }
                if (v4Var.mo20359m1()) {
                    m15295u(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(v4Var.mo20334G1()));
                }
                if (v4Var.mo20358l1()) {
                    m15295u(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(v4Var.mo20332F1()));
                }
                m15295u(sb, 1, "app_instance_id", v4Var.mo20347Q1());
                m15295u(sb, 1, "resettable_device_id", v4Var.mo20333G());
                m15295u(sb, 1, "ds_id", v4Var.mo20320A());
                if (v4Var.mo20357k1()) {
                    m15295u(sb, 1, "limited_ad_tracking", Boolean.valueOf(v4Var.mo20371x0()));
                }
                m15295u(sb, 1, "os_version", v4Var.mo20329E());
                m15295u(sb, 1, "device_model", v4Var.mo20376z());
                m15295u(sb, 1, "user_default_language", v4Var.mo20337I());
                if (v4Var.mo20365s1()) {
                    m15295u(sb, 1, "time_zone_offset_minutes", Integer.valueOf(v4Var.mo20375y1()));
                }
                if (v4Var.mo20321A0()) {
                    m15295u(sb, 1, "bundle_sequential_index", Integer.valueOf(v4Var.mo20350b1()));
                }
                if (v4Var.mo20362p1()) {
                    m15295u(sb, 1, "service_upload", Boolean.valueOf(v4Var.mo20374y0()));
                }
                m15295u(sb, 1, "health_monitor", v4Var.mo20327D());
                if (v4Var.mo20361o1()) {
                    m15295u(sb, 1, "retry_counter", Integer.valueOf(v4Var.mo20372x1()));
                }
                if (v4Var.mo20352f1()) {
                    m15295u(sb, 1, "consent_signals", v4Var.mo20373y());
                }
                List<C6766e5> L = v4Var.mo20343L();
                if (L != null) {
                    for (C6766e5 e5Var : L) {
                        if (e5Var != null) {
                            m15292r(sb, 2);
                            sb.append("user_property {\n");
                            m15295u(sb, 2, "set_timestamp_millis", e5Var.mo19700O() ? Long.valueOf(e5Var.mo19704z()) : null);
                            m15295u(sb, 2, "name", this.f10651a.mo12152D().mo12440f(e5Var.mo19696C()));
                            m15295u(sb, 2, "string_value", e5Var.mo19697D());
                            m15295u(sb, 2, "int_value", e5Var.mo19699N() ? Long.valueOf(e5Var.mo19703y()) : null);
                            m15295u(sb, 2, "double_value", e5Var.mo19698M() ? Double.valueOf(e5Var.mo19702x()) : null);
                            m15292r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C6799g4> J = v4Var.mo20339J();
                if (J != null) {
                    for (C6799g4 g4Var : J) {
                        if (g4Var != null) {
                            m15292r(sb, 2);
                            sb.append("audience_membership {\n");
                            if (g4Var.mo19795H()) {
                                m15295u(sb, 2, "audience_id", Integer.valueOf(g4Var.mo19798x()));
                            }
                            if (g4Var.mo19796I()) {
                                m15295u(sb, 2, "new_audience", Boolean.valueOf(g4Var.mo19794G()));
                            }
                            m15294t(sb, 2, "current_data", g4Var.mo19792A());
                            if (g4Var.mo19797J()) {
                                m15294t(sb, 2, "previous_data", g4Var.mo19793B());
                            }
                            m15292r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C6863k4> K = v4Var.mo20341K();
                if (K != null) {
                    for (C6863k4 k4Var : K) {
                        if (k4Var != null) {
                            m15292r(sb, 2);
                            sb.append("event {\n");
                            m15295u(sb, 2, "name", this.f10651a.mo12152D().mo12438d(k4Var.mo19916E()));
                            if (k4Var.mo19920Q()) {
                                m15295u(sb, 2, "timestamp_millis", Long.valueOf(k4Var.mo19914A()));
                            }
                            if (k4Var.mo19919P()) {
                                m15295u(sb, 2, "previous_timestamp_millis", Long.valueOf(k4Var.mo19923z()));
                            }
                            if (k4Var.mo19918O()) {
                                m15295u(sb, 2, "count", Integer.valueOf(k4Var.mo19921x()));
                            }
                            if (k4Var.mo19922y() != 0) {
                                m15290p(sb, 2, k4Var.mo19917F());
                            }
                            m15292r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m15292r(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final String mo12392E(C6696a3 a3Var) {
        if (a3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (a3Var.mo19495L()) {
            m15295u(sb, 0, "filter_id", Integer.valueOf(a3Var.mo19499y()));
        }
        m15295u(sb, 0, "event_name", this.f10651a.mo12152D().mo12438d(a3Var.mo19489D()));
        String s = m15293s(a3Var.mo19491H(), a3Var.mo19492I(), a3Var.mo19493J());
        if (!s.isEmpty()) {
            m15295u(sb, 0, "filter_type", s);
        }
        if (a3Var.mo19494K()) {
            m15296v(sb, 1, "event_count_filter", a3Var.mo19488C());
        }
        if (a3Var.mo19498x() > 0) {
            sb.append("  filters {\n");
            for (C6730c3 q : a3Var.mo19490E()) {
                m15291q(sb, 2, q);
            }
        }
        m15292r(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final String mo12393F(C6846j3 j3Var) {
        if (j3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (j3Var.mo19854G()) {
            m15295u(sb, 0, "filter_id", Integer.valueOf(j3Var.mo19856x()));
        }
        m15295u(sb, 0, "property_name", this.f10651a.mo12152D().mo12440f(j3Var.mo19850B()));
        String s = m15293s(j3Var.mo19851D(), j3Var.mo19852E(), j3Var.mo19853F());
        if (!s.isEmpty()) {
            m15295u(sb, 0, "filter_type", s);
        }
        m15291q(sb, 1, j3Var.mo19857y());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final List mo12394G(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f10651a.mo11935b().mo12549w().mo12477b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f10651a.mo11935b().mo12549w().mo12478c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final Map mo12395I(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            C7032ud.m26749b();
            if (!this.f10651a.mo12181z().mo12010B((String) null, C3966m3.f11007k0) ? (obj instanceof Bundle[]) || (obj instanceof ArrayList) || (obj instanceof Bundle) : (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (obj instanceof Parcelable[]) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(mo12395I((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(mo12395I((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(mo12395I((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo12396J(C6911n4 n4Var, Object obj) {
        C3705r.m14346k(obj);
        n4Var.mo19978B();
        n4Var.mo19987y();
        n4Var.mo19986x();
        n4Var.mo19988z();
        if (obj instanceof String) {
            n4Var.mo19982G((String) obj);
        } else if (obj instanceof Long) {
            n4Var.mo19980D(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            n4Var.mo19979C(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C6911n4 B = C6927o4.m26284B();
                    for (String str : bundle.keySet()) {
                        C6911n4 B2 = C6927o4.m26284B();
                        B2.mo19981F(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            B2.mo19980D(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            B2.mo19982G((String) obj2);
                        } else if (obj2 instanceof Double) {
                            B2.mo19979C(((Double) obj2).doubleValue());
                        }
                        B.mo19985w(B2);
                    }
                    if (B.mo19983u() > 0) {
                        arrayList.add((C6927o4) B.mo20436r());
                    }
                }
            }
            n4Var.mo19984v(arrayList);
        } else {
            this.f10651a.mo11935b().mo12544r().mo12477b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo12397K(C6749d5 d5Var, Object obj) {
        C3705r.m14346k(obj);
        d5Var.mo19674w();
        d5Var.mo19673v();
        d5Var.mo19672u();
        if (obj instanceof String) {
            d5Var.mo19671C((String) obj);
        } else if (obj instanceof Long) {
            d5Var.mo19676y(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            d5Var.mo19675x(((Double) obj).doubleValue());
        } else {
            this.f10651a.mo11935b().mo12544r().mo12477b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo12398M(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.f10651a.mo11936c().mo11730a() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final byte[] mo12399O(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f10651a.mo11935b().mo12544r().mo12477b("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo11853l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final long mo12400x(byte[] bArr) {
        C3705r.m14346k(bArr);
        this.f10651a.mo12161N().mo11931h();
        MessageDigest t = C4105xa.m15406t();
        if (t != null) {
            return C4105xa.m15405q0(t.digest(bArr));
        }
        this.f10651a.mo11935b().mo12544r().mo12476a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final Bundle mo12401y(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                C7032ud.m26749b();
                ArrayList arrayList = (ArrayList) obj;
                if (this.f10651a.mo12181z().mo12010B((String) null, C3966m3.f11007k0)) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(mo12401y((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList3.add(mo12401y((Map) arrayList.get(i2), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList3);
                }
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f10651a.mo11935b().mo12544r().mo12476a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable mo12402z(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            com.google.android.gms.measurement.internal.l5 r5 = r4.f10651a     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo11935b()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12544r()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo12476a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4033ra.mo12402z(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }
}
