package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.p133n.C3746c;
import com.google.android.gms.common.util.C3758e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.HttpUrl;
import p027c.p060f.C1788a;
import p174e.p319f.p320a.p335c.p345f.p352g.C6724be;
import p174e.p319f.p320a.p335c.p345f.p352g.C6749d5;
import p174e.p319f.p320a.p335c.p345f.p352g.C6766e5;
import p174e.p319f.p320a.p335c.p345f.p352g.C6775ee;
import p174e.p319f.p320a.p335c.p345f.p352g.C6825he;
import p174e.p319f.p320a.p335c.p345f.p352g.C6847j4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6863k4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6911n4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6924o1;
import p174e.p319f.p320a.p335c.p345f.p352g.C6927o4;
import p174e.p319f.p320a.p335c.p345f.p352g.C7023u4;
import p174e.p319f.p320a.p335c.p345f.p352g.C7047vc;
import p174e.p319f.p320a.p335c.p345f.p352g.C7054w3;

/* renamed from: com.google.android.gms.measurement.internal.pa */
public final class C4009pa implements C3891g6 {

    /* renamed from: a */
    private static volatile C4009pa f11148a;

    /* renamed from: A */
    private long f11149A;

    /* renamed from: B */
    private final Map f11150B;

    /* renamed from: C */
    private final Map f11151C;

    /* renamed from: D */
    private C4114y7 f11152D;

    /* renamed from: E */
    private String f11153E;

    /* renamed from: F */
    private final C4093wa f11154F = new C3947ka(this);

    /* renamed from: b */
    private final C3838c5 f11155b;

    /* renamed from: c */
    private final C3889g4 f11156c;

    /* renamed from: d */
    private C3974n f11157d;

    /* renamed from: e */
    private C3915i4 f11158e;

    /* renamed from: f */
    private C3817aa f11159f;

    /* renamed from: g */
    private C3819b f11160g;

    /* renamed from: h */
    private final C4033ra f11161h;

    /* renamed from: i */
    private C4090w7 f11162i;

    /* renamed from: j */
    private C3933j9 f11163j;

    /* renamed from: k */
    private final C3856da f11164k;

    /* renamed from: l */
    private C4039s4 f11165l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C3955l5 f11166m;

    /* renamed from: n */
    private boolean f11167n = false;

    /* renamed from: o */
    private boolean f11168o;

    /* renamed from: p */
    long f11169p;

    /* renamed from: q */
    private List f11170q;

    /* renamed from: r */
    private int f11171r;

    /* renamed from: s */
    private int f11172s;

    /* renamed from: t */
    private boolean f11173t;

    /* renamed from: u */
    private boolean f11174u;

    /* renamed from: v */
    private boolean f11175v;

    /* renamed from: w */
    private FileLock f11176w;

    /* renamed from: x */
    private FileChannel f11177x;

    /* renamed from: y */
    private List f11178y;

    /* renamed from: z */
    private List f11179z;

    C4009pa(C4021qa qaVar, C3955l5 l5Var) {
        C3705r.m14346k(qaVar);
        this.f11166m = C3955l5.m14977H(qaVar.f11216a, (C6924o1) null, (Long) null);
        this.f11149A = -1;
        this.f11164k = new C3856da(this);
        C4033ra raVar = new C4033ra(this);
        raVar.mo11894j();
        this.f11161h = raVar;
        C3889g4 g4Var = new C3889g4(this);
        g4Var.mo11894j();
        this.f11156c = g4Var;
        C3838c5 c5Var = new C3838c5(this);
        c5Var.mo11894j();
        this.f11155b = c5Var;
        this.f11150B = new HashMap();
        this.f11151C = new HashMap();
        mo11934a().mo12110z(new C3869ea(this, qaVar));
    }

    /* renamed from: G */
    static final void m15148G(C6847j4 j4Var, int i, String str) {
        List N = j4Var.mo19867N();
        int i2 = 0;
        while (i2 < N.size()) {
            if (!"_err".equals(((C6927o4) N.get(i2)).mo20057D())) {
                i2++;
            } else {
                return;
            }
        }
        C6911n4 B = C6927o4.m26284B();
        B.mo19981F("_err");
        B.mo19980D(Long.valueOf((long) i).longValue());
        C6911n4 B2 = C6927o4.m26284B();
        B2.mo19981F("_ev");
        B2.mo19982G(str);
        j4Var.mo19874z((C6927o4) B.mo20436r());
        j4Var.mo19874z((C6927o4) B2.mo20436r());
    }

    /* renamed from: H */
    static final void m15149H(C6847j4 j4Var, String str) {
        List N = j4Var.mo19867N();
        for (int i = 0; i < N.size(); i++) {
            if (str.equals(((C6927o4) N.get(i)).mo20057D())) {
                j4Var.mo19859C(i);
                return;
            }
        }
    }

    /* renamed from: I */
    private final C3844cb m15150I(String str) {
        C4098x3 q;
        String str2;
        Object obj;
        String str3 = str;
        C3974n nVar = this.f11157d;
        m15159R(nVar);
        C3904h6 R = nVar.mo12204R(str3);
        if (R == null || TextUtils.isEmpty(R.mo12075g0())) {
            q = mo11935b().mo12543q();
            str2 = "No app data available; dropping";
            obj = str3;
        } else {
            Boolean J = m15151J(R);
            if (J == null || J.booleanValue()) {
                String i0 = R.mo12079i0();
                String g0 = R.mo12075g0();
                long L = R.mo12047L();
                String f0 = R.mo12073f0();
                long W = R.mo12058W();
                long T = R.mo12055T();
                boolean J2 = R.mo12045J();
                String h0 = R.mo12077h0();
                R.mo12036A();
                C3904h6 h6Var = R;
                return new C3844cb(str, i0, g0, L, f0, W, T, (String) null, J2, false, h0, 0, 0, 0, h6Var.mo12044I(), false, h6Var.mo12065b0(), h6Var.mo12063a0(), h6Var.mo12056U(), h6Var.mo12066c(), (String) null, mo12276V(str).mo12121h(), HttpUrl.FRAGMENT_ENCODE_SET, (String) null);
            }
            q = mo11935b().mo12544r();
            str2 = "App version does not match; dropping. appId";
            obj = C4122z3.m15469z(str);
        }
        q.mo12477b(str2, obj);
        return null;
    }

    /* renamed from: J */
    private final Boolean m15151J(C3904h6 h6Var) {
        try {
            if (h6Var.mo12047L() != -2147483648L) {
                if (h6Var.mo12047L() == ((long) C3746c.m14493a(this.f11166m.mo11938f()).mo11719d(h6Var.mo12069d0(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C3746c.m14493a(this.f11166m.mo11938f()).mo11719d(h6Var.mo12069d0(), 0).versionName;
                String g0 = h6Var.mo12075g0();
                if (g0 != null && g0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: K */
    private final void m15152K() {
        mo11934a().mo11931h();
        if (this.f11173t || this.f11174u || this.f11175v) {
            mo11935b().mo12548v().mo12479d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f11173t), Boolean.valueOf(this.f11174u), Boolean.valueOf(this.f11175v));
            return;
        }
        mo11935b().mo12548v().mo12476a("Stopping uploading service(s)");
        List<Runnable> list = this.f11170q;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) C3705r.m14346k(this.f11170q)).clear();
        }
    }

    /* renamed from: L */
    private final void m15153L(C7023u4 u4Var, long j, boolean z) {
        String str = true != z ? "_lte" : "_se";
        C3974n nVar = this.f11157d;
        m15159R(nVar);
        C4069ua X = nVar.mo12209X(u4Var.mo20276s0(), str);
        C4069ua uaVar = (X == null || X.f11332e == null) ? new C4069ua(u4Var.mo20276s0(), "auto", str, mo11936c().mo11730a(), Long.valueOf(j)) : new C4069ua(u4Var.mo20276s0(), "auto", str, mo11936c().mo11730a(), Long.valueOf(((Long) X.f11332e).longValue() + j));
        C6749d5 A = C6766e5.m25622A();
        A.mo19677z(str);
        A.mo19670B(mo11936c().mo11730a());
        A.mo19676y(((Long) uaVar.f11332e).longValue());
        C6766e5 e5Var = (C6766e5) A.mo20436r();
        int w = C4033ra.m15297w(u4Var, str);
        if (w >= 0) {
            u4Var.mo20273p0(w, e5Var);
        } else {
            u4Var.mo20232I0(e5Var);
        }
        if (j > 0) {
            C3974n nVar2 = this.f11157d;
            m15159R(nVar2);
            nVar2.mo12231x(uaVar);
            mo11935b().mo12548v().mo12478c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", uaVar.f11332e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x021c  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m15154M() {
        /*
            r20 = this;
            r0 = r20
            com.google.android.gms.measurement.internal.i5 r1 = r20.mo11934a()
            r1.mo11931h()
            r20.mo12286g()
            long r1 = r0.f11169p
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004e
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            com.google.android.gms.common.util.e r5 = r20.mo11936c()
            long r5 = r5.mo11731b()
            long r7 = r0.f11169p
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            long r1 = r1 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
            com.google.android.gms.measurement.internal.z3 r3 = r20.mo11935b()
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12548v()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r3.mo12477b(r2, r1)
            com.google.android.gms.measurement.internal.i4 r1 = r20.mo12280Z()
            r1.mo12102c()
            com.google.android.gms.measurement.internal.aa r1 = r0.f11159f
            m15159R(r1)
            r1.mo11854m()
            return
        L_0x004c:
            r0.f11169p = r3
        L_0x004e:
            com.google.android.gms.measurement.internal.l5 r1 = r0.f11166m
            boolean r1 = r1.mo12177r()
            if (r1 == 0) goto L_0x0239
            boolean r1 = r20.m15156O()
            if (r1 != 0) goto L_0x005e
            goto L_0x0239
        L_0x005e:
            com.google.android.gms.common.util.e r1 = r20.mo11936c()
            long r1 = r1.mo11730a()
            r20.mo12275U()
            com.google.android.gms.measurement.internal.l3 r5 = com.google.android.gms.measurement.internal.C3966m3.f10952B
            r6 = 0
            java.lang.Object r5 = r5.mo12145a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.n r5 = r0.f11157d
            m15159R(r5)
            boolean r5 = r5.mo12227t()
            r10 = 1
            if (r5 != 0) goto L_0x0093
            com.google.android.gms.measurement.internal.n r5 = r0.f11157d
            m15159R(r5)
            boolean r5 = r5.mo12226s()
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00b7
            com.google.android.gms.measurement.internal.h r5 = r20.mo12275U()
            java.lang.String r5 = r5.mo12027u()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x00b1
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x00b1
            r20.mo12275U()
            com.google.android.gms.measurement.internal.l3 r5 = com.google.android.gms.measurement.internal.C3966m3.f11030w
            goto L_0x00bc
        L_0x00b1:
            r20.mo12275U()
            com.google.android.gms.measurement.internal.l3 r5 = com.google.android.gms.measurement.internal.C3966m3.f11028v
            goto L_0x00bc
        L_0x00b7:
            r20.mo12275U()
            com.google.android.gms.measurement.internal.l3 r5 = com.google.android.gms.measurement.internal.C3966m3.f11026u
        L_0x00bc:
            java.lang.Object r5 = r5.mo12145a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            com.google.android.gms.measurement.internal.j9 r5 = r0.f11163j
            com.google.android.gms.measurement.internal.l4 r5 = r5.f10836g
            long r13 = r5.mo12147a()
            com.google.android.gms.measurement.internal.j9 r5 = r0.f11163j
            com.google.android.gms.measurement.internal.l4 r5 = r5.f10837h
            long r15 = r5.mo12147a()
            com.google.android.gms.measurement.internal.n r5 = r0.f11157d
            m15159R(r5)
            r17 = r10
            long r9 = r5.mo12199M()
            com.google.android.gms.measurement.internal.n r5 = r0.f11157d
            m15159R(r5)
            r18 = r7
            long r6 = r5.mo12200N()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x00fb
        L_0x00f8:
            r7 = r3
            goto L_0x0173
        L_0x00fb:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r9 = r1 - r9
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r1, r9)
            long r7 = r5 + r18
            if (r17 == 0) goto L_0x0120
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x0120
            long r7 = java.lang.Math.min(r5, r1)
            long r7 = r7 + r11
        L_0x0120:
            com.google.android.gms.measurement.internal.ra r13 = r0.f11161h
            m15159R(r13)
            boolean r13 = r13.mo12398M(r1, r11)
            if (r13 != 0) goto L_0x012d
            long r7 = r1 + r11
        L_0x012d:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0173
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0173
            r1 = 0
        L_0x0136:
            r20.mo12275U()
            r2 = 20
            com.google.android.gms.measurement.internal.l3 r5 = com.google.android.gms.measurement.internal.C3966m3.f10956D
            r6 = 0
            java.lang.Object r5 = r5.mo12145a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r11 = 0
            int r5 = java.lang.Math.max(r11, r5)
            int r2 = java.lang.Math.min(r2, r5)
            if (r1 >= r2) goto L_0x00f8
            r20.mo12275U()
            com.google.android.gms.measurement.internal.l3 r2 = com.google.android.gms.measurement.internal.C3966m3.f10954C
            java.lang.Object r2 = r2.mo12145a(r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r5 = r2.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            r12 = 1
            long r12 = r12 << r1
            long r5 = r5 * r12
            long r7 = r7 + r5
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0173
            int r1 = r1 + 1
            goto L_0x0136
        L_0x0173:
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x021c
            com.google.android.gms.measurement.internal.g4 r1 = r0.f11156c
            m15159R(r1)
            boolean r1 = r1.mo11970m()
            if (r1 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.j9 r1 = r0.f11163j
            com.google.android.gms.measurement.internal.l4 r1 = r1.f10835f
            long r1 = r1.mo12147a()
            r20.mo12275U()
            com.google.android.gms.measurement.internal.l3 r5 = com.google.android.gms.measurement.internal.C3966m3.f11022s
            r6 = 0
            java.lang.Object r5 = r5.mo12145a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.ra r9 = r0.f11161h
            m15159R(r9)
            boolean r9 = r9.mo12398M(r1, r5)
            if (r9 != 0) goto L_0x01ae
            long r1 = r1 + r5
            long r7 = java.lang.Math.max(r7, r1)
        L_0x01ae:
            com.google.android.gms.measurement.internal.i4 r1 = r20.mo12280Z()
            r1.mo12102c()
            com.google.android.gms.common.util.e r1 = r20.mo11936c()
            long r1 = r1.mo11730a()
            long r7 = r7 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x01e5
            r20.mo12275U()
            com.google.android.gms.measurement.internal.l3 r1 = com.google.android.gms.measurement.internal.C3966m3.f11032x
            r2 = 0
            java.lang.Object r1 = r1.mo12145a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r7 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.j9 r1 = r0.f11163j
            com.google.android.gms.measurement.internal.l4 r1 = r1.f10836g
            com.google.android.gms.common.util.e r2 = r20.mo11936c()
            long r2 = r2.mo11730a()
            r1.mo12148b(r2)
        L_0x01e5:
            com.google.android.gms.measurement.internal.z3 r1 = r20.mo11935b()
            com.google.android.gms.measurement.internal.x3 r1 = r1.mo12548v()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.mo12477b(r3, r2)
            com.google.android.gms.measurement.internal.aa r1 = r0.f11159f
            m15159R(r1)
            r1.mo11855n(r7)
            return
        L_0x01ff:
            com.google.android.gms.measurement.internal.z3 r1 = r20.mo11935b()
            com.google.android.gms.measurement.internal.x3 r1 = r1.mo12548v()
            java.lang.String r2 = "No network"
            r1.mo12476a(r2)
            com.google.android.gms.measurement.internal.i4 r1 = r20.mo12280Z()
            r1.mo12101b()
            com.google.android.gms.measurement.internal.aa r1 = r0.f11159f
            m15159R(r1)
            r1.mo11854m()
            return
        L_0x021c:
            com.google.android.gms.measurement.internal.z3 r1 = r20.mo11935b()
            com.google.android.gms.measurement.internal.x3 r1 = r1.mo12548v()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo12476a(r2)
            com.google.android.gms.measurement.internal.i4 r1 = r20.mo12280Z()
            r1.mo12102c()
            com.google.android.gms.measurement.internal.aa r1 = r0.f11159f
            m15159R(r1)
            r1.mo11854m()
            return
        L_0x0239:
            com.google.android.gms.measurement.internal.z3 r1 = r20.mo11935b()
            com.google.android.gms.measurement.internal.x3 r1 = r1.mo12548v()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo12476a(r2)
            com.google.android.gms.measurement.internal.i4 r1 = r20.mo12280Z()
            r1.mo12102c()
            com.google.android.gms.measurement.internal.aa r1 = r0.f11159f
            m15159R(r1)
            r1.mo11854m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4009pa.m15154M():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0b76, code lost:
        if (r10 > (com.google.android.gms.measurement.internal.C3897h.m14818i() + r8)) goto L_0x0b78;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03a7 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x046b A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04c5 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x081f A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0868 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0888 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x08ff A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0901 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0909 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0932 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0b66 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0bed A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0c09 A[Catch:{ SQLiteException -> 0x0c21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0c70 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0ca1 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:69:0x01e4=Splitter:B:69:0x01e4, B:420:0x0cfb=Splitter:B:420:0x0cfb} */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m15155N(java.lang.String r42, long r43) {
        /*
            r41 = this;
            r1 = r41
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "_ai"
            com.google.android.gms.measurement.internal.n r4 = r1.f11157d
            m15159R(r4)
            r4.mo12216e0()
            com.google.android.gms.measurement.internal.ma r4 = new com.google.android.gms.measurement.internal.ma     // Catch:{ all -> 0x0d0d }
            r12 = 0
            r4.<init>(r1, r12)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.n r5 = r1.f11157d     // Catch:{ all -> 0x0d0d }
            m15159R(r5)     // Catch:{ all -> 0x0d0d }
            r6 = 0
            long r9 = r1.f11149A     // Catch:{ all -> 0x0d0d }
            r7 = r43
            r11 = r4
            r5.mo12196G(r6, r7, r9, r11)     // Catch:{ all -> 0x0d0d }
            java.util.List r5 = r4.f11054c     // Catch:{ all -> 0x0d0d }
            if (r5 == 0) goto L_0x0cfb
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d0d }
            if (r5 == 0) goto L_0x002e
            goto L_0x0cfb
        L_0x002e:
            e.f.a.c.f.g.v4 r5 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.x8 r5 = r5.mo19526u()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.u4 r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C7023u4) r5     // Catch:{ all -> 0x0d0d }
            r5.mo20241N0()     // Catch:{ all -> 0x0d0d }
            r10 = r12
            r13 = r10
            r8 = 0
            r9 = 0
            r11 = -1
            r14 = -1
            r15 = 0
        L_0x0040:
            java.util.List r12 = r4.f11054c     // Catch:{ all -> 0x0d0d }
            int r12 = r12.size()     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = "_fr"
            java.lang.String r7 = "_et"
            r16 = r15
            java.lang.String r15 = "_e"
            r17 = r2
            r18 = r3
            if (r8 >= r12) goto L_0x0543
            java.util.List r3 = r4.f11054c     // Catch:{ all -> 0x0d0d }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.k4 r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r3     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.x8 r3 = r3.mo19526u()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.j4 r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C6847j4) r3     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c5 r12 = r1.f11155b     // Catch:{ all -> 0x0d0d }
            m15159R(r12)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r2 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r2 = r2.mo20346P1()     // Catch:{ all -> 0x0d0d }
            r20 = r9
            java.lang.String r9 = r3.mo19866M()     // Catch:{ all -> 0x0d0d }
            boolean r2 = r12.mo11872F(r2, r9)     // Catch:{ all -> 0x0d0d }
            java.lang.String r9 = "_err"
            if (r2 == 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.z3 r2 = r41.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12549w()     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = "Dropping blocked raw event. appId"
            e.f.a.c.f.g.v4 r7 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = r7.mo20346P1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r7)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.l5 r12 = r1.f11166m     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.u3 r12 = r12.mo12152D()     // Catch:{ all -> 0x0d0d }
            java.lang.String r15 = r3.mo19866M()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r12.mo12438d(r15)     // Catch:{ all -> 0x0d0d }
            r2.mo12478c(r6, r7, r12)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c5 r2 = r1.f11155b     // Catch:{ all -> 0x0d0d }
            m15159R(r2)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r6 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = r6.mo20346P1()     // Catch:{ all -> 0x0d0d }
            boolean r2 = r2.mo11870D(r6)     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.c5 r2 = r1.f11155b     // Catch:{ all -> 0x0d0d }
            m15159R(r2)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r6 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = r6.mo20346P1()     // Catch:{ all -> 0x0d0d }
            boolean r2 = r2.mo11873G(r6)     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x00c3
            goto L_0x00e8
        L_0x00c3:
            java.lang.String r2 = r3.mo19866M()     // Catch:{ all -> 0x0d0d }
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.xa r21 = r41.mo12289h0()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.wa r2 = r1.f11154F     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r6 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r23 = r6.mo20346P1()     // Catch:{ all -> 0x0d0d }
            r24 = 11
            java.lang.String r25 = "_ev"
            java.lang.String r26 = r3.mo19866M()     // Catch:{ all -> 0x0d0d }
            r27 = 0
            r22 = r2
            r21.mo12485B(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0d0d }
        L_0x00e8:
            r7 = r8
            r23 = r10
            r15 = r16
            r9 = r20
            r10 = r5
            r5 = -1
            goto L_0x0538
        L_0x00f3:
            java.lang.String r2 = r3.mo19866M()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = com.google.android.gms.measurement.internal.C3930j6.m14950a(r18)     // Catch:{ all -> 0x0d0d }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x016d
            r2 = r18
            r3.mo19860D(r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r12 = r41.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r12 = r12.mo12548v()     // Catch:{ all -> 0x0d0d }
            r18 = r2
            java.lang.String r2 = "Renaming ad_impression to _ai"
            r12.mo12476a(r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r2 = r41.mo11935b()     // Catch:{ all -> 0x0d0d }
            java.lang.String r2 = r2.mo12541C()     // Catch:{ all -> 0x0d0d }
            r12 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r12)     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x016d
            r2 = 0
        L_0x0125:
            int r12 = r3.mo19869u()     // Catch:{ all -> 0x0d0d }
            if (r2 >= r12) goto L_0x016d
            java.lang.String r12 = "ad_platform"
            e.f.a.c.f.g.o4 r21 = r3.mo19865K(r2)     // Catch:{ all -> 0x0d0d }
            r22 = r8
            java.lang.String r8 = r21.mo20057D()     // Catch:{ all -> 0x0d0d }
            boolean r8 = r12.equals(r8)     // Catch:{ all -> 0x0d0d }
            if (r8 == 0) goto L_0x0168
            e.f.a.c.f.g.o4 r8 = r3.mo19865K(r2)     // Catch:{ all -> 0x0d0d }
            java.lang.String r8 = r8.mo20058E()     // Catch:{ all -> 0x0d0d }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0d0d }
            if (r8 != 0) goto L_0x0168
            java.lang.String r8 = "admob"
            e.f.a.c.f.g.o4 r12 = r3.mo19865K(r2)     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r12.mo20058E()     // Catch:{ all -> 0x0d0d }
            boolean r8 = r8.equalsIgnoreCase(r12)     // Catch:{ all -> 0x0d0d }
            if (r8 == 0) goto L_0x0168
            com.google.android.gms.measurement.internal.z3 r8 = r41.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r8 = r8.mo12550x()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = "AdMob ad impression logged from app. Potentially duplicative."
            r8.mo12476a(r12)     // Catch:{ all -> 0x0d0d }
        L_0x0168:
            int r2 = r2 + 1
            r8 = r22
            goto L_0x0125
        L_0x016d:
            r22 = r8
            com.google.android.gms.measurement.internal.c5 r2 = r1.f11155b     // Catch:{ all -> 0x0d0d }
            m15159R(r2)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r8 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r8 = r8.mo20346P1()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r3.mo19866M()     // Catch:{ all -> 0x0d0d }
            boolean r2 = r2.mo11871E(r8, r12)     // Catch:{ all -> 0x0d0d }
            java.lang.String r8 = "_c"
            if (r2 != 0) goto L_0x01db
            com.google.android.gms.measurement.internal.ra r12 = r1.f11161h     // Catch:{ all -> 0x0d0d }
            m15159R(r12)     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r3.mo19866M()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.common.internal.C3705r.m14342g(r12)     // Catch:{ all -> 0x0d0d }
            r21 = r11
            int r11 = r12.hashCode()     // Catch:{ all -> 0x0d0d }
            r23 = r10
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r11 == r10) goto L_0x01be
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r11 == r10) goto L_0x01b4
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r11 == r10) goto L_0x01aa
            goto L_0x01c8
        L_0x01aa:
            java.lang.String r10 = "_ui"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 1
            goto L_0x01c9
        L_0x01b4:
            java.lang.String r10 = "_ug"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 2
            goto L_0x01c9
        L_0x01be:
            java.lang.String r10 = "_in"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 0
            goto L_0x01c9
        L_0x01c8:
            r10 = -1
        L_0x01c9:
            if (r10 == 0) goto L_0x01df
            r11 = 1
            if (r10 == r11) goto L_0x01df
            r11 = 2
            if (r10 == r11) goto L_0x01df
            r25 = r5
            r24 = r7
            r7 = r13
            r19 = r14
            r2 = 0
            goto L_0x03a5
        L_0x01db:
            r23 = r10
            r21 = r11
        L_0x01df:
            r24 = r7
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x01e4:
            int r7 = r3.mo19869u()     // Catch:{ all -> 0x0d0d }
            r25 = r5
            java.lang.String r5 = "_r"
            if (r10 >= r7) goto L_0x024b
            e.f.a.c.f.g.o4 r7 = r3.mo19865K(r10)     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = r7.mo20057D()     // Catch:{ all -> 0x0d0d }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0d0d }
            if (r7 == 0) goto L_0x0219
            e.f.a.c.f.g.o4 r5 = r3.mo19865K(r10)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.x8 r5 = r5.mo19526u()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.n4 r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6911n4) r5     // Catch:{ all -> 0x0d0d }
            r7 = r13
            r19 = r14
            r13 = 1
            r5.mo19980D(r13)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.a9 r5 = r5.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.o4 r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6927o4) r5     // Catch:{ all -> 0x0d0d }
            r3.mo19862G(r10, r5)     // Catch:{ all -> 0x0d0d }
            r11 = 1
            goto L_0x0243
        L_0x0219:
            r7 = r13
            r19 = r14
            e.f.a.c.f.g.o4 r13 = r3.mo19865K(r10)     // Catch:{ all -> 0x0d0d }
            java.lang.String r13 = r13.mo20057D()     // Catch:{ all -> 0x0d0d }
            boolean r5 = r5.equals(r13)     // Catch:{ all -> 0x0d0d }
            if (r5 == 0) goto L_0x0243
            e.f.a.c.f.g.o4 r5 = r3.mo19865K(r10)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.x8 r5 = r5.mo19526u()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.n4 r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6911n4) r5     // Catch:{ all -> 0x0d0d }
            r12 = 1
            r5.mo19980D(r12)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.a9 r5 = r5.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.o4 r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6927o4) r5     // Catch:{ all -> 0x0d0d }
            r3.mo19862G(r10, r5)     // Catch:{ all -> 0x0d0d }
            r12 = 1
        L_0x0243:
            int r10 = r10 + 1
            r13 = r7
            r14 = r19
            r5 = r25
            goto L_0x01e4
        L_0x024b:
            r7 = r13
            r19 = r14
            if (r11 != 0) goto L_0x027c
            if (r2 == 0) goto L_0x027c
            com.google.android.gms.measurement.internal.z3 r10 = r41.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r10 = r10.mo12548v()     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.l5 r13 = r1.f11166m     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.u3 r13 = r13.mo12152D()     // Catch:{ all -> 0x0d0d }
            java.lang.String r14 = r3.mo19866M()     // Catch:{ all -> 0x0d0d }
            java.lang.String r13 = r13.mo12438d(r14)     // Catch:{ all -> 0x0d0d }
            r10.mo12477b(r11, r13)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.n4 r10 = p174e.p319f.p320a.p335c.p345f.p352g.C6927o4.m26284B()     // Catch:{ all -> 0x0d0d }
            r10.mo19981F(r8)     // Catch:{ all -> 0x0d0d }
            r13 = 1
            r10.mo19980D(r13)     // Catch:{ all -> 0x0d0d }
            r3.mo19873y(r10)     // Catch:{ all -> 0x0d0d }
        L_0x027c:
            if (r12 != 0) goto L_0x02a8
            com.google.android.gms.measurement.internal.z3 r10 = r41.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r10 = r10.mo12548v()     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.l5 r12 = r1.f11166m     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.u3 r12 = r12.mo12152D()     // Catch:{ all -> 0x0d0d }
            java.lang.String r13 = r3.mo19866M()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r12.mo12438d(r13)     // Catch:{ all -> 0x0d0d }
            r10.mo12477b(r11, r12)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.n4 r10 = p174e.p319f.p320a.p335c.p345f.p352g.C6927o4.m26284B()     // Catch:{ all -> 0x0d0d }
            r10.mo19981F(r5)     // Catch:{ all -> 0x0d0d }
            r11 = 1
            r10.mo19980D(r11)     // Catch:{ all -> 0x0d0d }
            r3.mo19873y(r10)     // Catch:{ all -> 0x0d0d }
        L_0x02a8:
            com.google.android.gms.measurement.internal.n r10 = r1.f11157d     // Catch:{ all -> 0x0d0d }
            m15159R(r10)     // Catch:{ all -> 0x0d0d }
            long r27 = r41.mo12272F()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r11 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r29 = r11.mo20346P1()     // Catch:{ all -> 0x0d0d }
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 1
            r26 = r10
            com.google.android.gms.measurement.internal.l r10 = r26.mo12206T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0d0d }
            long r10 = r10.f10877e     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.h r12 = r41.mo12275U()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r13 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r13 = r13.mo20346P1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.l3 r14 = com.google.android.gms.measurement.internal.C3966m3.f11016p     // Catch:{ all -> 0x0d0d }
            int r12 = r12.mo12021o(r13, r14)     // Catch:{ all -> 0x0d0d }
            long r12 = (long) r12     // Catch:{ all -> 0x0d0d }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x02e2
            m15149H(r3, r5)     // Catch:{ all -> 0x0d0d }
            goto L_0x02e4
        L_0x02e2:
            r16 = 1
        L_0x02e4:
            java.lang.String r5 = r3.mo19866M()     // Catch:{ all -> 0x0d0d }
            boolean r5 = com.google.android.gms.measurement.internal.C4105xa.m15395X(r5)     // Catch:{ all -> 0x0d0d }
            if (r5 == 0) goto L_0x03a5
            if (r2 == 0) goto L_0x03a5
            com.google.android.gms.measurement.internal.n r5 = r1.f11157d     // Catch:{ all -> 0x0d0d }
            m15159R(r5)     // Catch:{ all -> 0x0d0d }
            long r27 = r41.mo12272F()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r10 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r29 = r10.mo20346P1()     // Catch:{ all -> 0x0d0d }
            r30 = 0
            r31 = 0
            r32 = 1
            r33 = 0
            r34 = 0
            r26 = r5
            com.google.android.gms.measurement.internal.l r5 = r26.mo12206T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0d0d }
            long r10 = r5.f10875c     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.h r5 = r41.mo12275U()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r12 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r12.mo20346P1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.l3 r13 = com.google.android.gms.measurement.internal.C3966m3.f11014o     // Catch:{ all -> 0x0d0d }
            int r5 = r5.mo12021o(r12, r13)     // Catch:{ all -> 0x0d0d }
            long r12 = (long) r5     // Catch:{ all -> 0x0d0d }
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x03a5
            com.google.android.gms.measurement.internal.z3 r5 = r41.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12549w()     // Catch:{ all -> 0x0d0d }
            java.lang.String r10 = "Too many conversions. Not logging as conversion. appId"
            e.f.a.c.f.g.v4 r11 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = r11.mo20346P1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r11)     // Catch:{ all -> 0x0d0d }
            r5.mo12477b(r10, r11)     // Catch:{ all -> 0x0d0d }
            r5 = 0
            r10 = 0
            r11 = 0
            r12 = -1
        L_0x0341:
            int r13 = r3.mo19869u()     // Catch:{ all -> 0x0d0d }
            if (r10 >= r13) goto L_0x036b
            e.f.a.c.f.g.o4 r13 = r3.mo19865K(r10)     // Catch:{ all -> 0x0d0d }
            java.lang.String r14 = r13.mo20057D()     // Catch:{ all -> 0x0d0d }
            boolean r14 = r8.equals(r14)     // Catch:{ all -> 0x0d0d }
            if (r14 == 0) goto L_0x035d
            e.f.a.c.f.g.x8 r5 = r13.mo19526u()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.n4 r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6911n4) r5     // Catch:{ all -> 0x0d0d }
            r12 = r10
            goto L_0x0368
        L_0x035d:
            java.lang.String r13 = r13.mo20057D()     // Catch:{ all -> 0x0d0d }
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x0d0d }
            if (r13 == 0) goto L_0x0368
            r11 = 1
        L_0x0368:
            int r10 = r10 + 1
            goto L_0x0341
        L_0x036b:
            if (r11 == 0) goto L_0x0374
            if (r5 == 0) goto L_0x0373
            r3.mo19859C(r12)     // Catch:{ all -> 0x0d0d }
            goto L_0x03a5
        L_0x0373:
            r5 = 0
        L_0x0374:
            if (r5 == 0) goto L_0x038e
            e.f.a.c.f.g.x8 r5 = r5.clone()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.n4 r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6911n4) r5     // Catch:{ all -> 0x0d0d }
            r5.mo19981F(r9)     // Catch:{ all -> 0x0d0d }
            r9 = 10
            r5.mo19980D(r9)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.a9 r5 = r5.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.o4 r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6927o4) r5     // Catch:{ all -> 0x0d0d }
            r3.mo19862G(r12, r5)     // Catch:{ all -> 0x0d0d }
            goto L_0x03a5
        L_0x038e:
            com.google.android.gms.measurement.internal.z3 r5 = r41.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12544r()     // Catch:{ all -> 0x0d0d }
            java.lang.String r9 = "Did not find conversion parameter. appId"
            e.f.a.c.f.g.v4 r10 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r10 = r10.mo20346P1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r10)     // Catch:{ all -> 0x0d0d }
            r5.mo12477b(r9, r10)     // Catch:{ all -> 0x0d0d }
        L_0x03a5:
            if (r2 == 0) goto L_0x045e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0d0d }
            java.util.List r5 = r3.mo19867N()     // Catch:{ all -> 0x0d0d }
            r2.<init>(r5)     // Catch:{ all -> 0x0d0d }
            r5 = 0
            r9 = -1
            r10 = -1
        L_0x03b3:
            int r11 = r2.size()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = "currency"
            java.lang.String r13 = "value"
            if (r5 >= r11) goto L_0x03e3
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.o4 r11 = (p174e.p319f.p320a.p335c.p345f.p352g.C6927o4) r11     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = r11.mo20057D()     // Catch:{ all -> 0x0d0d }
            boolean r11 = r13.equals(r11)     // Catch:{ all -> 0x0d0d }
            if (r11 == 0) goto L_0x03cf
            r9 = r5
            goto L_0x03e0
        L_0x03cf:
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.o4 r11 = (p174e.p319f.p320a.p335c.p345f.p352g.C6927o4) r11     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = r11.mo20057D()     // Catch:{ all -> 0x0d0d }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0d0d }
            if (r11 == 0) goto L_0x03e0
            r10 = r5
        L_0x03e0:
            int r5 = r5 + 1
            goto L_0x03b3
        L_0x03e3:
            r5 = -1
            if (r9 != r5) goto L_0x03e8
            goto L_0x045f
        L_0x03e8:
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.o4 r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6927o4) r5     // Catch:{ all -> 0x0d0d }
            boolean r5 = r5.mo20062S()     // Catch:{ all -> 0x0d0d }
            if (r5 != 0) goto L_0x0419
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.o4 r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6927o4) r5     // Catch:{ all -> 0x0d0d }
            boolean r5 = r5.mo20060Q()     // Catch:{ all -> 0x0d0d }
            if (r5 != 0) goto L_0x0419
            com.google.android.gms.measurement.internal.z3 r2 = r41.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12550x()     // Catch:{ all -> 0x0d0d }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r2.mo12476a(r5)     // Catch:{ all -> 0x0d0d }
            r3.mo19859C(r9)     // Catch:{ all -> 0x0d0d }
            m15149H(r3, r8)     // Catch:{ all -> 0x0d0d }
            r2 = 18
            m15148G(r3, r2, r13)     // Catch:{ all -> 0x0d0d }
            goto L_0x045e
        L_0x0419:
            r5 = -1
            if (r10 != r5) goto L_0x041d
            goto L_0x0445
        L_0x041d:
            java.lang.Object r2 = r2.get(r10)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.o4 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C6927o4) r2     // Catch:{ all -> 0x0d0d }
            java.lang.String r2 = r2.mo20058E()     // Catch:{ all -> 0x0d0d }
            int r10 = r2.length()     // Catch:{ all -> 0x0d0d }
            r11 = 3
            if (r10 != r11) goto L_0x0445
            r10 = 0
        L_0x042f:
            int r11 = r2.length()     // Catch:{ all -> 0x0d0d }
            if (r10 >= r11) goto L_0x045f
            int r11 = r2.codePointAt(r10)     // Catch:{ all -> 0x0d0d }
            boolean r13 = java.lang.Character.isLetter(r11)     // Catch:{ all -> 0x0d0d }
            if (r13 == 0) goto L_0x0445
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x0d0d }
            int r10 = r10 + r11
            goto L_0x042f
        L_0x0445:
            com.google.android.gms.measurement.internal.z3 r2 = r41.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12550x()     // Catch:{ all -> 0x0d0d }
            java.lang.String r10 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo12476a(r10)     // Catch:{ all -> 0x0d0d }
            r3.mo19859C(r9)     // Catch:{ all -> 0x0d0d }
            m15149H(r3, r8)     // Catch:{ all -> 0x0d0d }
            r2 = 19
            m15148G(r3, r2, r12)     // Catch:{ all -> 0x0d0d }
            goto L_0x045f
        L_0x045e:
            r5 = -1
        L_0x045f:
            java.lang.String r2 = r3.mo19866M()     // Catch:{ all -> 0x0d0d }
            boolean r2 = r15.equals(r2)     // Catch:{ all -> 0x0d0d }
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04c5
            com.google.android.gms.measurement.internal.ra r2 = r1.f11161h     // Catch:{ all -> 0x0d0d }
            m15159R(r2)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.a9 r2 = r3.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.k4 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r2     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.o4 r2 = com.google.android.gms.measurement.internal.C4033ra.m15288n(r2, r6)     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x04c0
            if (r7 == 0) goto L_0x04b4
            long r10 = r7.mo19871w()     // Catch:{ all -> 0x0d0d }
            long r12 = r3.mo19871w()     // Catch:{ all -> 0x0d0d }
            long r10 = r10 - r12
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0d0d }
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x04b4
            e.f.a.c.f.g.x8 r2 = r7.clone()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.j4 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C6847j4) r2     // Catch:{ all -> 0x0d0d }
            boolean r6 = r1.m15157P(r3, r2)     // Catch:{ all -> 0x0d0d }
            if (r6 == 0) goto L_0x04a7
            r6 = r19
            r10 = r25
            r10.mo20246Q(r6, r2)     // Catch:{ all -> 0x0d0d }
            r11 = r21
            r2 = 0
            r13 = 0
            goto L_0x04af
        L_0x04a7:
            r6 = r19
            r10 = r25
            r2 = r3
            r13 = r7
            r11 = r20
        L_0x04af:
            r23 = r2
            r14 = r6
            goto L_0x0524
        L_0x04b4:
            r6 = r19
            r10 = r25
            r23 = r3
            r14 = r6
            r13 = r7
            r11 = r20
            goto L_0x0524
        L_0x04c0:
            r6 = r19
            r10 = r25
            goto L_0x051f
        L_0x04c5:
            r6 = r19
            r10 = r25
            java.lang.String r2 = "_vs"
            java.lang.String r11 = r3.mo19866M()     // Catch:{ all -> 0x0d0d }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x051f
            com.google.android.gms.measurement.internal.ra r2 = r1.f11161h     // Catch:{ all -> 0x0d0d }
            m15159R(r2)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.a9 r2 = r3.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.k4 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r2     // Catch:{ all -> 0x0d0d }
            r11 = r24
            e.f.a.c.f.g.o4 r2 = com.google.android.gms.measurement.internal.C4033ra.m15288n(r2, r11)     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x051f
            if (r23 == 0) goto L_0x0518
            long r11 = r23.mo19871w()     // Catch:{ all -> 0x0d0d }
            long r13 = r3.mo19871w()     // Catch:{ all -> 0x0d0d }
            long r11 = r11 - r13
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0d0d }
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0518
            e.f.a.c.f.g.x8 r2 = r23.clone()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.j4 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C6847j4) r2     // Catch:{ all -> 0x0d0d }
            boolean r7 = r1.m15157P(r2, r3)     // Catch:{ all -> 0x0d0d }
            if (r7 == 0) goto L_0x0511
            r8 = r21
            r10.mo20246Q(r8, r2)     // Catch:{ all -> 0x0d0d }
            r14 = r6
            r2 = 0
            r23 = 0
            goto L_0x0516
        L_0x0511:
            r8 = r21
            r2 = r3
            r14 = r20
        L_0x0516:
            r13 = r2
            goto L_0x0523
        L_0x0518:
            r8 = r21
            r13 = r3
            r11 = r8
            r14 = r20
            goto L_0x0524
        L_0x051f:
            r8 = r21
            r14 = r6
            r13 = r7
        L_0x0523:
            r11 = r8
        L_0x0524:
            java.util.List r2 = r4.f11054c     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.a9 r6 = r3.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.k4 r6 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r6     // Catch:{ all -> 0x0d0d }
            r7 = r22
            r2.set(r7, r6)     // Catch:{ all -> 0x0d0d }
            int r9 = r20 + 1
            r10.mo20229G0(r3)     // Catch:{ all -> 0x0d0d }
            r15 = r16
        L_0x0538:
            int r8 = r7 + 1
            r5 = r10
            r2 = r17
            r3 = r18
            r10 = r23
            goto L_0x0040
        L_0x0543:
            r10 = r5
            r11 = r7
            r20 = r9
            r2 = 0
            r7 = r2
            r5 = 0
        L_0x054b:
            if (r5 >= r9) goto L_0x059b
            e.f.a.c.f.g.k4 r12 = r10.mo20218A0(r5)     // Catch:{ all -> 0x0d0d }
            java.lang.String r13 = r12.mo19916E()     // Catch:{ all -> 0x0d0d }
            boolean r13 = r15.equals(r13)     // Catch:{ all -> 0x0d0d }
            if (r13 == 0) goto L_0x056e
            com.google.android.gms.measurement.internal.ra r13 = r1.f11161h     // Catch:{ all -> 0x0d0d }
            m15159R(r13)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.o4 r13 = com.google.android.gms.measurement.internal.C4033ra.m15288n(r12, r6)     // Catch:{ all -> 0x0d0d }
            if (r13 == 0) goto L_0x056e
            r10.mo20278u(r5)     // Catch:{ all -> 0x0d0d }
            int r9 = r9 + -1
            int r5 = r5 + -1
            goto L_0x0598
        L_0x056e:
            com.google.android.gms.measurement.internal.ra r13 = r1.f11161h     // Catch:{ all -> 0x0d0d }
            m15159R(r13)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.o4 r12 = com.google.android.gms.measurement.internal.C4033ra.m15288n(r12, r11)     // Catch:{ all -> 0x0d0d }
            if (r12 == 0) goto L_0x0598
            boolean r13 = r12.mo20062S()     // Catch:{ all -> 0x0d0d }
            if (r13 == 0) goto L_0x0588
            long r12 = r12.mo20056A()     // Catch:{ all -> 0x0d0d }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d0d }
            goto L_0x0589
        L_0x0588:
            r12 = 0
        L_0x0589:
            if (r12 == 0) goto L_0x0598
            long r13 = r12.longValue()     // Catch:{ all -> 0x0d0d }
            int r18 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r18 <= 0) goto L_0x0598
            long r12 = r12.longValue()     // Catch:{ all -> 0x0d0d }
            long r7 = r7 + r12
        L_0x0598:
            r12 = 1
            int r5 = r5 + r12
            goto L_0x054b
        L_0x059b:
            r5 = 0
            r1.m15153L(r10, r7, r5)     // Catch:{ all -> 0x0d0d }
            java.util.List r5 = r10.mo20281v0()     // Catch:{ all -> 0x0d0d }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0d0d }
        L_0x05a7:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0d0d }
            java.lang.String r9 = "_se"
            if (r6 == 0) goto L_0x05cd
            java.lang.String r6 = "_s"
            java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.k4 r11 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r11     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = r11.mo19916E()     // Catch:{ all -> 0x0d0d }
            boolean r6 = r6.equals(r11)     // Catch:{ all -> 0x0d0d }
            if (r6 == 0) goto L_0x05a7
            com.google.android.gms.measurement.internal.n r5 = r1.f11157d     // Catch:{ all -> 0x0d0d }
            m15159R(r5)     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = r10.mo20276s0()     // Catch:{ all -> 0x0d0d }
            r5.mo12220m(r6, r9)     // Catch:{ all -> 0x0d0d }
        L_0x05cd:
            java.lang.String r5 = "_sid"
            int r5 = com.google.android.gms.measurement.internal.C4033ra.m15297w(r10, r5)     // Catch:{ all -> 0x0d0d }
            if (r5 < 0) goto L_0x05da
            r5 = 1
            r1.m15153L(r10, r7, r5)     // Catch:{ all -> 0x0d0d }
            goto L_0x05fa
        L_0x05da:
            int r5 = com.google.android.gms.measurement.internal.C4033ra.m15297w(r10, r9)     // Catch:{ all -> 0x0d0d }
            if (r5 < 0) goto L_0x05fa
            r10.mo20280v(r5)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r5 = r41.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12544r()     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = "Session engagement user property is in the bundle without session ID. appId"
            e.f.a.c.f.g.v4 r7 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = r7.mo20346P1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r7)     // Catch:{ all -> 0x0d0d }
            r5.mo12477b(r6, r7)     // Catch:{ all -> 0x0d0d }
        L_0x05fa:
            com.google.android.gms.measurement.internal.ra r5 = r1.f11161h     // Catch:{ all -> 0x0d0d }
            m15159R(r5)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.l5 r6 = r5.f10651a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r6 = r6.mo12548v()     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = "Checking account type status for ad personalization signals"
            r6.mo12476a(r7)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.pa r6 = r5.f10552b     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c5 r6 = r6.f11155b     // Catch:{ all -> 0x0d0d }
            m15159R(r6)     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = r10.mo20276s0()     // Catch:{ all -> 0x0d0d }
            boolean r6 = r6.mo11868B(r7)     // Catch:{ all -> 0x0d0d }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.pa r6 = r5.f10552b     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.n r6 = r6.f11157d     // Catch:{ all -> 0x0d0d }
            m15159R(r6)     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = r10.mo20276s0()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.h6 r6 = r6.mo12204R(r7)     // Catch:{ all -> 0x0d0d }
            if (r6 == 0) goto L_0x0691
            boolean r6 = r6.mo12044I()     // Catch:{ all -> 0x0d0d }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.l5 r6 = r5.f10651a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.r r6 = r6.mo12149A()     // Catch:{ all -> 0x0d0d }
            boolean r6 = r6.mo12339s()     // Catch:{ all -> 0x0d0d }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.l5 r6 = r5.f10651a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r6 = r6.mo12543q()     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = "Turning off ad personalization due to account type"
            r6.mo12476a(r7)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.d5 r6 = p174e.p319f.p320a.p335c.p345f.p352g.C6766e5.m25622A()     // Catch:{ all -> 0x0d0d }
            r7 = r17
            r6.mo19677z(r7)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.l5 r5 = r5.f10651a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.r r5 = r5.mo12149A()     // Catch:{ all -> 0x0d0d }
            long r8 = r5.mo12335o()     // Catch:{ all -> 0x0d0d }
            r6.mo19670B(r8)     // Catch:{ all -> 0x0d0d }
            r8 = 1
            r6.mo19676y(r8)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.a9 r5 = r6.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.e5 r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6766e5) r5     // Catch:{ all -> 0x0d0d }
            r6 = 0
        L_0x0673:
            int r8 = r10.mo20285x0()     // Catch:{ all -> 0x0d0d }
            if (r6 >= r8) goto L_0x068e
            e.f.a.c.f.g.e5 r8 = r10.mo20275r0(r6)     // Catch:{ all -> 0x0d0d }
            java.lang.String r8 = r8.mo19696C()     // Catch:{ all -> 0x0d0d }
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x0d0d }
            if (r8 == 0) goto L_0x068b
            r10.mo20273p0(r6, r5)     // Catch:{ all -> 0x0d0d }
            goto L_0x0691
        L_0x068b:
            int r6 = r6 + 1
            goto L_0x0673
        L_0x068e:
            r10.mo20232I0(r5)     // Catch:{ all -> 0x0d0d }
        L_0x0691:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10.mo20269l0(r5)     // Catch:{ all -> 0x0d0d }
            r5 = -9223372036854775808
            r10.mo20242O(r5)     // Catch:{ all -> 0x0d0d }
            r5 = 0
        L_0x069f:
            int r6 = r10.mo20260a0()     // Catch:{ all -> 0x0d0d }
            if (r5 >= r6) goto L_0x06d2
            e.f.a.c.f.g.k4 r6 = r10.mo20218A0(r5)     // Catch:{ all -> 0x0d0d }
            long r7 = r6.mo19914A()     // Catch:{ all -> 0x0d0d }
            long r11 = r10.mo20289z0()     // Catch:{ all -> 0x0d0d }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x06bc
            long r7 = r6.mo19914A()     // Catch:{ all -> 0x0d0d }
            r10.mo20269l0(r7)     // Catch:{ all -> 0x0d0d }
        L_0x06bc:
            long r7 = r6.mo19914A()     // Catch:{ all -> 0x0d0d }
            long r11 = r10.mo20287y0()     // Catch:{ all -> 0x0d0d }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x06cf
            long r6 = r6.mo19914A()     // Catch:{ all -> 0x0d0d }
            r10.mo20242O(r6)     // Catch:{ all -> 0x0d0d }
        L_0x06cf:
            int r5 = r5 + 1
            goto L_0x069f
        L_0x06d2:
            r10.mo20257V0()     // Catch:{ all -> 0x0d0d }
            r10.mo20236K0()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.b r5 = r1.f11160g     // Catch:{ all -> 0x0d0d }
            m15159R(r5)     // Catch:{ all -> 0x0d0d }
            java.lang.String r21 = r10.mo20276s0()     // Catch:{ all -> 0x0d0d }
            java.util.List r22 = r10.mo20281v0()     // Catch:{ all -> 0x0d0d }
            java.util.List r23 = r10.mo20283w0()     // Catch:{ all -> 0x0d0d }
            long r6 = r10.mo20289z0()     // Catch:{ all -> 0x0d0d }
            java.lang.Long r24 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d0d }
            long r6 = r10.mo20287y0()     // Catch:{ all -> 0x0d0d }
            java.lang.Long r25 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d0d }
            r20 = r5
            java.util.List r5 = r20.mo11857m(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0d0d }
            r10.mo20220B0(r5)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.h r5 = r41.mo12275U()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r6 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = r6.mo20346P1()     // Catch:{ all -> 0x0d0d }
            boolean r5 = r5.mo12014F(r6)     // Catch:{ all -> 0x0d0d }
            if (r5 == 0) goto L_0x0a49
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0d0d }
            r5.<init>()     // Catch:{ all -> 0x0d0d }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0d0d }
            r6.<init>()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.xa r7 = r41.mo12289h0()     // Catch:{ all -> 0x0d0d }
            java.security.SecureRandom r7 = r7.mo12523u()     // Catch:{ all -> 0x0d0d }
            r8 = 0
        L_0x0725:
            int r9 = r10.mo20260a0()     // Catch:{ all -> 0x0d0d }
            if (r8 >= r9) goto L_0x0a0f
            e.f.a.c.f.g.k4 r9 = r10.mo20218A0(r8)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.x8 r9 = r9.mo19526u()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.j4 r9 = (p174e.p319f.p320a.p335c.p345f.p352g.C6847j4) r9     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = r9.mo19866M()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = "_ep"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = "_efs"
            java.lang.String r13 = "_sr"
            if (r11 == 0) goto L_0x07c8
            com.google.android.gms.measurement.internal.ra r11 = r1.f11161h     // Catch:{ all -> 0x0d0d }
            m15159R(r11)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.a9 r11 = r9.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.k4 r11 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r11     // Catch:{ all -> 0x0d0d }
            java.lang.String r14 = "_en"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C4033ra.m15289o(r11, r14)     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0d0d }
            java.lang.Object r14 = r5.get(r11)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.t r14 = (com.google.android.gms.measurement.internal.C4046t) r14     // Catch:{ all -> 0x0d0d }
            if (r14 != 0) goto L_0x077c
            com.google.android.gms.measurement.internal.n r14 = r1.f11157d     // Catch:{ all -> 0x0d0d }
            m15159R(r14)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r15 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r15 = r15.mo20346P1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r17 = com.google.android.gms.common.internal.C3705r.m14346k(r11)     // Catch:{ all -> 0x0d0d }
            r2 = r17
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.t r14 = r14.mo12208V(r15, r2)     // Catch:{ all -> 0x0d0d }
            if (r14 == 0) goto L_0x077c
            r5.put(r11, r14)     // Catch:{ all -> 0x0d0d }
        L_0x077c:
            if (r14 == 0) goto L_0x07bb
            java.lang.Long r2 = r14.f11290i     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x07bb
            java.lang.Long r2 = r14.f11291j     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x079a
            long r2 = r2.longValue()     // Catch:{ all -> 0x0d0d }
            r17 = 1
            int r11 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r11 <= 0) goto L_0x079a
            com.google.android.gms.measurement.internal.ra r2 = r1.f11161h     // Catch:{ all -> 0x0d0d }
            m15159R(r2)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r2 = r14.f11291j     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.C4033ra.m15286P(r9, r13, r2)     // Catch:{ all -> 0x0d0d }
        L_0x079a:
            java.lang.Boolean r2 = r14.f11292k     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x07b2
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x07b2
            com.google.android.gms.measurement.internal.ra r2 = r1.f11161h     // Catch:{ all -> 0x0d0d }
            m15159R(r2)     // Catch:{ all -> 0x0d0d }
            r2 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.C4033ra.m15286P(r9, r12, r11)     // Catch:{ all -> 0x0d0d }
        L_0x07b2:
            e.f.a.c.f.g.a9 r2 = r9.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.k4 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r2     // Catch:{ all -> 0x0d0d }
            r6.add(r2)     // Catch:{ all -> 0x0d0d }
        L_0x07bb:
            r10.mo20246Q(r8, r9)     // Catch:{ all -> 0x0d0d }
            r24 = r4
            r22 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a03
        L_0x07c8:
            com.google.android.gms.measurement.internal.c5 r2 = r1.f11155b     // Catch:{ all -> 0x0d0d }
            m15159R(r2)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r3 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r3 = r3.mo20346P1()     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r11 = r2.mo11881e(r3, r11)     // Catch:{ all -> 0x0d0d }
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0d0d }
            if (r14 != 0) goto L_0x07f9
            long r2 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x07e4 }
            goto L_0x07fb
        L_0x07e4:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12549w()     // Catch:{ all -> 0x0d0d }
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)     // Catch:{ all -> 0x0d0d }
            r2.mo12478c(r14, r3, r11)     // Catch:{ all -> 0x0d0d }
        L_0x07f9:
            r2 = 0
        L_0x07fb:
            com.google.android.gms.measurement.internal.xa r11 = r41.mo12289h0()     // Catch:{ all -> 0x0d0d }
            long r14 = r9.mo19871w()     // Catch:{ all -> 0x0d0d }
            long r14 = r11.mo12521s0(r14, r2)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.a9 r11 = r9.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.k4 r11 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r11     // Catch:{ all -> 0x0d0d }
            r44 = r12
            r17 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0d0d }
            r17 = r2
            java.lang.String r2 = "_dbg"
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0d0d }
            if (r3 != 0) goto L_0x0853
            java.util.List r3 = r11.mo19917F()     // Catch:{ all -> 0x0d0d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d0d }
        L_0x0827:
            boolean r11 = r3.hasNext()     // Catch:{ all -> 0x0d0d }
            if (r11 == 0) goto L_0x0853
            java.lang.Object r11 = r3.next()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.o4 r11 = (p174e.p319f.p320a.p335c.p345f.p352g.C6927o4) r11     // Catch:{ all -> 0x0d0d }
            r22 = r3
            java.lang.String r3 = r11.mo20057D()     // Catch:{ all -> 0x0d0d }
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0d0d }
            if (r3 == 0) goto L_0x0850
            long r2 = r11.mo20056A()     // Catch:{ all -> 0x0d0d }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d0d }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x084e
            goto L_0x0853
        L_0x084e:
            r2 = 1
            goto L_0x0866
        L_0x0850:
            r3 = r22
            goto L_0x0827
        L_0x0853:
            com.google.android.gms.measurement.internal.c5 r2 = r1.f11155b     // Catch:{ all -> 0x0d0d }
            m15159R(r2)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r3 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r3 = r3.mo20346P1()     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = r9.mo19866M()     // Catch:{ all -> 0x0d0d }
            int r2 = r2.mo11882r(r3, r11)     // Catch:{ all -> 0x0d0d }
        L_0x0866:
            if (r2 > 0) goto L_0x0888
            com.google.android.gms.measurement.internal.z3 r3 = r41.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12549w()     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r9.mo19866M()     // Catch:{ all -> 0x0d0d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0d0d }
            r3.mo12478c(r11, r12, r2)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.a9 r2 = r9.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.k4 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r2     // Catch:{ all -> 0x0d0d }
            r6.add(r2)     // Catch:{ all -> 0x0d0d }
            goto L_0x07bb
        L_0x0888:
            java.lang.String r3 = r9.mo19866M()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.t r3 = (com.google.android.gms.measurement.internal.C4046t) r3     // Catch:{ all -> 0x0d0d }
            if (r3 != 0) goto L_0x08e8
            com.google.android.gms.measurement.internal.n r3 = r1.f11157d     // Catch:{ all -> 0x0d0d }
            m15159R(r3)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r11 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = r11.mo20346P1()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r9.mo19866M()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.t r3 = r3.mo12208V(r11, r12)     // Catch:{ all -> 0x0d0d }
            if (r3 != 0) goto L_0x08e8
            com.google.android.gms.measurement.internal.z3 r3 = r41.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12549w()     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = "Event being bundled has no eventAggregate. appId, eventName"
            e.f.a.c.f.g.v4 r12 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r12.mo20346P1()     // Catch:{ all -> 0x0d0d }
            r22 = r14
            java.lang.String r14 = r9.mo19866M()     // Catch:{ all -> 0x0d0d }
            r3.mo12478c(r11, r12, r14)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.t r3 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r11 = r4.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r25 = r11.mo20346P1()     // Catch:{ all -> 0x0d0d }
            java.lang.String r26 = r9.mo19866M()     // Catch:{ all -> 0x0d0d }
            r27 = 1
            r29 = 1
            r31 = 1
            long r33 = r9.mo19871w()     // Catch:{ all -> 0x0d0d }
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r24 = r3
            r24.<init>(r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40)     // Catch:{ all -> 0x0d0d }
            goto L_0x08ea
        L_0x08e8:
            r22 = r14
        L_0x08ea:
            com.google.android.gms.measurement.internal.ra r11 = r1.f11161h     // Catch:{ all -> 0x0d0d }
            m15159R(r11)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.a9 r11 = r9.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.k4 r11 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r11     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = "_eid"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C4033ra.m15289o(r11, r12)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0d0d }
            if (r11 == 0) goto L_0x0901
            r12 = 1
            goto L_0x0902
        L_0x0901:
            r12 = 0
        L_0x0902:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0d0d }
            r14 = 1
            if (r2 != r14) goto L_0x0932
            e.f.a.c.f.g.a9 r2 = r9.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.k4 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r2     // Catch:{ all -> 0x0d0d }
            r6.add(r2)     // Catch:{ all -> 0x0d0d }
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x07bb
            java.lang.Long r2 = r3.f11290i     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x0924
            java.lang.Long r2 = r3.f11291j     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x0924
            java.lang.Boolean r2 = r3.f11292k     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x07bb
        L_0x0924:
            r2 = 0
            com.google.android.gms.measurement.internal.t r3 = r3.mo12420a(r2, r2, r2)     // Catch:{ all -> 0x0d0d }
            java.lang.String r2 = r9.mo19866M()     // Catch:{ all -> 0x0d0d }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d0d }
            goto L_0x07bb
        L_0x0932:
            int r14 = r7.nextInt(r2)     // Catch:{ all -> 0x0d0d }
            if (r14 != 0) goto L_0x0974
            com.google.android.gms.measurement.internal.ra r11 = r1.f11161h     // Catch:{ all -> 0x0d0d }
            m15159R(r11)     // Catch:{ all -> 0x0d0d }
            long r14 = (long) r2     // Catch:{ all -> 0x0d0d }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.C4033ra.m15286P(r9, r13, r2)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.a9 r11 = r9.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.k4 r11 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r11     // Catch:{ all -> 0x0d0d }
            r6.add(r11)     // Catch:{ all -> 0x0d0d }
            boolean r11 = r12.booleanValue()     // Catch:{ all -> 0x0d0d }
            if (r11 == 0) goto L_0x0959
            r11 = 0
            com.google.android.gms.measurement.internal.t r3 = r3.mo12420a(r11, r2, r11)     // Catch:{ all -> 0x0d0d }
        L_0x0959:
            java.lang.String r2 = r9.mo19866M()     // Catch:{ all -> 0x0d0d }
            long r11 = r9.mo19871w()     // Catch:{ all -> 0x0d0d }
            r14 = r22
            com.google.android.gms.measurement.internal.t r3 = r3.mo12421b(r11, r14)     // Catch:{ all -> 0x0d0d }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d0d }
            r24 = r4
            r22 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a00
        L_0x0974:
            r14 = r22
            r22 = r7
            java.lang.Long r7 = r3.f11289h     // Catch:{ all -> 0x0d0d }
            if (r7 == 0) goto L_0x0989
            long r17 = r7.longValue()     // Catch:{ all -> 0x0d0d }
            r24 = r4
            r26 = r5
            r25 = r10
            r23 = r11
            goto L_0x099f
        L_0x0989:
            com.google.android.gms.measurement.internal.xa r7 = r41.mo12289h0()     // Catch:{ all -> 0x0d0d }
            r25 = r10
            r23 = r11
            long r10 = r9.mo19870v()     // Catch:{ all -> 0x0d0d }
            r24 = r4
            r26 = r5
            r4 = r17
            long r17 = r7.mo12521s0(r10, r4)     // Catch:{ all -> 0x0d0d }
        L_0x099f:
            int r4 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x09e8
            com.google.android.gms.measurement.internal.ra r4 = r1.f11161h     // Catch:{ all -> 0x0d0d }
            m15159R(r4)     // Catch:{ all -> 0x0d0d }
            r4 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d0d }
            r10 = r44
            com.google.android.gms.measurement.internal.C4033ra.m15286P(r9, r10, r7)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.ra r7 = r1.f11161h     // Catch:{ all -> 0x0d0d }
            m15159R(r7)     // Catch:{ all -> 0x0d0d }
            long r10 = (long) r2     // Catch:{ all -> 0x0d0d }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.C4033ra.m15286P(r9, r13, r2)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.a9 r7 = r9.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.k4 r7 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r7     // Catch:{ all -> 0x0d0d }
            r6.add(r7)     // Catch:{ all -> 0x0d0d }
            boolean r7 = r12.booleanValue()     // Catch:{ all -> 0x0d0d }
            if (r7 == 0) goto L_0x09d6
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d0d }
            r10 = 0
            com.google.android.gms.measurement.internal.t r3 = r3.mo12420a(r10, r2, r7)     // Catch:{ all -> 0x0d0d }
        L_0x09d6:
            java.lang.String r2 = r9.mo19866M()     // Catch:{ all -> 0x0d0d }
            long r10 = r9.mo19871w()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.t r3 = r3.mo12421b(r10, r14)     // Catch:{ all -> 0x0d0d }
            r7 = r26
        L_0x09e4:
            r7.put(r2, r3)     // Catch:{ all -> 0x0d0d }
            goto L_0x09fe
        L_0x09e8:
            r7 = r26
            r4 = 1
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x09fe
            java.lang.String r2 = r9.mo19866M()     // Catch:{ all -> 0x0d0d }
            r11 = r23
            r10 = 0
            com.google.android.gms.measurement.internal.t r3 = r3.mo12420a(r11, r10, r10)     // Catch:{ all -> 0x0d0d }
            goto L_0x09e4
        L_0x09fe:
            r2 = r25
        L_0x0a00:
            r2.mo20246Q(r8, r9)     // Catch:{ all -> 0x0d0d }
        L_0x0a03:
            int r8 = r8 + 1
            r10 = r2
            r5 = r7
            r7 = r22
            r4 = r24
            r2 = 0
            goto L_0x0725
        L_0x0a0f:
            r24 = r4
            r7 = r5
            r2 = r10
            int r3 = r6.size()     // Catch:{ all -> 0x0d0d }
            int r4 = r2.mo20260a0()     // Catch:{ all -> 0x0d0d }
            if (r3 >= r4) goto L_0x0a23
            r2.mo20241N0()     // Catch:{ all -> 0x0d0d }
            r2.mo20222C0(r6)     // Catch:{ all -> 0x0d0d }
        L_0x0a23:
            java.util.Set r3 = r7.entrySet()     // Catch:{ all -> 0x0d0d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d0d }
        L_0x0a2b:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0d0d }
            if (r4 == 0) goto L_0x0a46
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0d0d }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.n r5 = r1.f11157d     // Catch:{ all -> 0x0d0d }
            m15159R(r5)     // Catch:{ all -> 0x0d0d }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.t r4 = (com.google.android.gms.measurement.internal.C4046t) r4     // Catch:{ all -> 0x0d0d }
            r5.mo12224q(r4)     // Catch:{ all -> 0x0d0d }
            goto L_0x0a2b
        L_0x0a46:
            r3 = r24
            goto L_0x0a4b
        L_0x0a49:
            r2 = r10
            r3 = r4
        L_0x0a4b:
            e.f.a.c.f.g.v4 r4 = r3.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r4 = r4.mo20346P1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.n r5 = r1.f11157d     // Catch:{ all -> 0x0d0d }
            m15159R(r5)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.h6 r5 = r5.mo12204R(r4)     // Catch:{ all -> 0x0d0d }
            if (r5 != 0) goto L_0x0a74
            com.google.android.gms.measurement.internal.z3 r5 = r41.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12544r()     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            e.f.a.c.f.g.v4 r7 = r3.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = r7.mo20346P1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r7)     // Catch:{ all -> 0x0d0d }
            r5.mo12477b(r6, r7)     // Catch:{ all -> 0x0d0d }
            goto L_0x0ad0
        L_0x0a74:
            int r6 = r2.mo20260a0()     // Catch:{ all -> 0x0d0d }
            if (r6 <= 0) goto L_0x0ad0
            long r6 = r5.mo12059X()     // Catch:{ all -> 0x0d0d }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0a88
            r2.mo20262c0(r6)     // Catch:{ all -> 0x0d0d }
            goto L_0x0a8b
        L_0x0a88:
            r2.mo20249R0()     // Catch:{ all -> 0x0d0d }
        L_0x0a8b:
            long r8 = r5.mo12061Z()     // Catch:{ all -> 0x0d0d }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0a96
            goto L_0x0a97
        L_0x0a96:
            r6 = r8
        L_0x0a97:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0a9f
            r2.mo20263d0(r6)     // Catch:{ all -> 0x0d0d }
            goto L_0x0aa2
        L_0x0a9f:
            r2.mo20251S0()     // Catch:{ all -> 0x0d0d }
        L_0x0aa2:
            r5.mo12070e()     // Catch:{ all -> 0x0d0d }
            long r6 = r5.mo12060Y()     // Catch:{ all -> 0x0d0d }
            int r7 = (int) r6     // Catch:{ all -> 0x0d0d }
            r2.mo20223D(r7)     // Catch:{ all -> 0x0d0d }
            long r6 = r2.mo20289z0()     // Catch:{ all -> 0x0d0d }
            r5.mo12038C(r6)     // Catch:{ all -> 0x0d0d }
            long r6 = r2.mo20287y0()     // Catch:{ all -> 0x0d0d }
            r5.mo12097z(r6)     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = r5.mo12067c0()     // Catch:{ all -> 0x0d0d }
            if (r6 == 0) goto L_0x0ac5
            r2.mo20254U(r6)     // Catch:{ all -> 0x0d0d }
            goto L_0x0ac8
        L_0x0ac5:
            r2.mo20243O0()     // Catch:{ all -> 0x0d0d }
        L_0x0ac8:
            com.google.android.gms.measurement.internal.n r6 = r1.f11157d     // Catch:{ all -> 0x0d0d }
            m15159R(r6)     // Catch:{ all -> 0x0d0d }
            r6.mo12223p(r5)     // Catch:{ all -> 0x0d0d }
        L_0x0ad0:
            int r5 = r2.mo20260a0()     // Catch:{ all -> 0x0d0d }
            if (r5 <= 0) goto L_0x0c52
            com.google.android.gms.measurement.internal.l5 r5 = r1.f11166m     // Catch:{ all -> 0x0d0d }
            r5.mo11937d()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c5 r5 = r1.f11155b     // Catch:{ all -> 0x0d0d }
            m15159R(r5)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r6 = r3.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = r6.mo20346P1()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.w3 r5 = r5.mo11883t(r6)     // Catch:{ all -> 0x0d0d }
            r6 = -1
            if (r5 == 0) goto L_0x0afd
            boolean r8 = r5.mo20407O()     // Catch:{ all -> 0x0d0d }
            if (r8 != 0) goto L_0x0af5
            goto L_0x0afd
        L_0x0af5:
            long r8 = r5.mo20410z()     // Catch:{ all -> 0x0d0d }
            r2.mo20228G(r8)     // Catch:{ all -> 0x0d0d }
            goto L_0x0b24
        L_0x0afd:
            e.f.a.c.f.g.v4 r5 = r3.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r5 = r5.mo20325C()     // Catch:{ all -> 0x0d0d }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d0d }
            if (r5 == 0) goto L_0x0b0d
            r2.mo20228G(r6)     // Catch:{ all -> 0x0d0d }
            goto L_0x0b24
        L_0x0b0d:
            com.google.android.gms.measurement.internal.z3 r5 = r41.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12549w()     // Catch:{ all -> 0x0d0d }
            java.lang.String r8 = "Did not find measurement config or missing version info. appId"
            e.f.a.c.f.g.v4 r9 = r3.f11052a     // Catch:{ all -> 0x0d0d }
            java.lang.String r9 = r9.mo20346P1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r9)     // Catch:{ all -> 0x0d0d }
            r5.mo12477b(r8, r9)     // Catch:{ all -> 0x0d0d }
        L_0x0b24:
            com.google.android.gms.measurement.internal.n r5 = r1.f11157d     // Catch:{ all -> 0x0d0d }
            m15159R(r5)     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.a9 r2 = r2.mo20436r()     // Catch:{ all -> 0x0d0d }
            e.f.a.c.f.g.v4 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C7039v4) r2     // Catch:{ all -> 0x0d0d }
            r5.mo11931h()     // Catch:{ all -> 0x0d0d }
            r5.mo11893i()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.common.internal.C3705r.m14346k(r2)     // Catch:{ all -> 0x0d0d }
            java.lang.String r8 = r2.mo20346P1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.common.internal.C3705r.m14342g(r8)     // Catch:{ all -> 0x0d0d }
            boolean r8 = r2.mo20355i1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.common.internal.C3705r.m14349n(r8)     // Catch:{ all -> 0x0d0d }
            r5.mo12219h0()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.l5 r8 = r5.f10651a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.common.util.e r8 = r8.mo11936c()     // Catch:{ all -> 0x0d0d }
            long r8 = r8.mo11730a()     // Catch:{ all -> 0x0d0d }
            long r10 = r2.mo20328D1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.l5 r12 = r5.f10651a     // Catch:{ all -> 0x0d0d }
            r12.mo12181z()     // Catch:{ all -> 0x0d0d }
            long r12 = com.google.android.gms.measurement.internal.C3897h.m14818i()     // Catch:{ all -> 0x0d0d }
            long r12 = r8 - r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0b78
            long r10 = r2.mo20328D1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.l5 r12 = r5.f10651a     // Catch:{ all -> 0x0d0d }
            r12.mo12181z()     // Catch:{ all -> 0x0d0d }
            long r12 = com.google.android.gms.measurement.internal.C3897h.m14818i()     // Catch:{ all -> 0x0d0d }
            long r12 = r12 + r8
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0b9b
        L_0x0b78:
            com.google.android.gms.measurement.internal.l5 r10 = r5.f10651a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r10 = r10.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r10 = r10.mo12549w()     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r2.mo20346P1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r12)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0d0d }
            long r13 = r2.mo20328D1()     // Catch:{ all -> 0x0d0d }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0d0d }
            r10.mo12479d(r11, r12, r8, r9)     // Catch:{ all -> 0x0d0d }
        L_0x0b9b:
            byte[] r8 = r2.mo19840k()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.pa r9 = r5.f10552b     // Catch:{ IOException -> 0x0c3b }
            com.google.android.gms.measurement.internal.ra r9 = r9.f11161h     // Catch:{ IOException -> 0x0c3b }
            m15159R(r9)     // Catch:{ IOException -> 0x0c3b }
            byte[] r8 = r9.mo12399O(r8)     // Catch:{ IOException -> 0x0c3b }
            com.google.android.gms.measurement.internal.l5 r9 = r5.f10651a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r9 = r9.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r9 = r9.mo12548v()     // Catch:{ all -> 0x0d0d }
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch:{ all -> 0x0d0d }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0d0d }
            r9.mo12477b(r10, r11)     // Catch:{ all -> 0x0d0d }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0d0d }
            r9.<init>()     // Catch:{ all -> 0x0d0d }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r2.mo20346P1()     // Catch:{ all -> 0x0d0d }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d0d }
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r2.mo20328D1()     // Catch:{ all -> 0x0d0d }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d0d }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d0d }
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch:{ all -> 0x0d0d }
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0d0d }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d0d }
            boolean r8 = r2.mo20361o1()     // Catch:{ all -> 0x0d0d }
            if (r8 == 0) goto L_0x0bfa
            java.lang.String r8 = "retry_count"
            int r10 = r2.mo20372x1()     // Catch:{ all -> 0x0d0d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0d0d }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d0d }
        L_0x0bfa:
            android.database.sqlite.SQLiteDatabase r8 = r5.mo12202P()     // Catch:{ SQLiteException -> 0x0c21 }
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0c21 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0c52
            com.google.android.gms.measurement.internal.l5 r6 = r5.f10651a     // Catch:{ SQLiteException -> 0x0c21 }
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo11935b()     // Catch:{ SQLiteException -> 0x0c21 }
            com.google.android.gms.measurement.internal.x3 r6 = r6.mo12544r()     // Catch:{ SQLiteException -> 0x0c21 }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r2.mo20346P1()     // Catch:{ SQLiteException -> 0x0c21 }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r8)     // Catch:{ SQLiteException -> 0x0c21 }
            r6.mo12477b(r7, r8)     // Catch:{ SQLiteException -> 0x0c21 }
            goto L_0x0c52
        L_0x0c21:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.l5 r5 = r5.f10651a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12544r()     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r2 = r2.mo20346P1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r2)     // Catch:{ all -> 0x0d0d }
        L_0x0c37:
            r5.mo12478c(r7, r2, r6)     // Catch:{ all -> 0x0d0d }
            goto L_0x0c52
        L_0x0c3b:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.l5 r5 = r5.f10651a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12544r()     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r2 = r2.mo20346P1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r2)     // Catch:{ all -> 0x0d0d }
            goto L_0x0c37
        L_0x0c52:
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d     // Catch:{ all -> 0x0d0d }
            m15159R(r2)     // Catch:{ all -> 0x0d0d }
            java.util.List r3 = r3.f11053b     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.common.internal.C3705r.m14346k(r3)     // Catch:{ all -> 0x0d0d }
            r2.mo11931h()     // Catch:{ all -> 0x0d0d }
            r2.mo11893i()     // Catch:{ all -> 0x0d0d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0d0d }
            r6 = 0
        L_0x0c6a:
            int r7 = r3.size()     // Catch:{ all -> 0x0d0d }
            if (r6 >= r7) goto L_0x0c87
            if (r6 == 0) goto L_0x0c77
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0d0d }
        L_0x0c77:
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d0d }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d0d }
            r5.append(r7)     // Catch:{ all -> 0x0d0d }
            int r6 = r6 + 1
            goto L_0x0c6a
        L_0x0c87:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0d0d }
            android.database.sqlite.SQLiteDatabase r6 = r2.mo12202P()     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0d0d }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0d0d }
            int r6 = r3.size()     // Catch:{ all -> 0x0d0d }
            if (r5 == r6) goto L_0x0cbc
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0d0d }
            int r3 = r3.size()     // Catch:{ all -> 0x0d0d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0d0d }
            r2.mo12478c(r6, r5, r3)     // Catch:{ all -> 0x0d0d }
        L_0x0cbc:
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d     // Catch:{ all -> 0x0d0d }
            m15159R(r2)     // Catch:{ all -> 0x0d0d }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo12202P()     // Catch:{ all -> 0x0d0d }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0cd4 }
            r6 = 0
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0cd4 }
            r6 = 1
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0cd4 }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r3.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0cd4 }
            goto L_0x0ce9
        L_0x0cd4:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x0d0d }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r4)     // Catch:{ all -> 0x0d0d }
            r2.mo12478c(r5, r4, r3)     // Catch:{ all -> 0x0d0d }
        L_0x0ce9:
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d     // Catch:{ all -> 0x0d0d }
            m15159R(r2)     // Catch:{ all -> 0x0d0d }
            r2.mo12222o()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d
            m15159R(r2)
            r2.mo12217f0()
            r2 = 1
            return r2
        L_0x0cfb:
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d     // Catch:{ all -> 0x0d0d }
            m15159R(r2)     // Catch:{ all -> 0x0d0d }
            r2.mo12222o()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d
            m15159R(r2)
            r2.mo12217f0()
            r2 = 0
            return r2
        L_0x0d0d:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.n r3 = r1.f11157d
            m15159R(r3)
            r3.mo12217f0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4009pa.m15155N(java.lang.String, long):boolean");
    }

    /* renamed from: O */
    private final boolean m15156O() {
        mo11934a().mo11931h();
        mo12286g();
        C3974n nVar = this.f11157d;
        m15159R(nVar);
        if (nVar.mo12225r()) {
            return true;
        }
        C3974n nVar2 = this.f11157d;
        m15159R(nVar2);
        return !TextUtils.isEmpty(nVar2.mo12211Z());
    }

    /* renamed from: P */
    private final boolean m15157P(C6847j4 j4Var, C6847j4 j4Var2) {
        C3705r.m14336a("_e".equals(j4Var.mo19866M()));
        m15159R(this.f11161h);
        C6927o4 n = C4033ra.m15288n((C6863k4) j4Var.mo20436r(), "_sc");
        String str = null;
        String E = n == null ? null : n.mo20058E();
        m15159R(this.f11161h);
        C6927o4 n2 = C4033ra.m15288n((C6863k4) j4Var2.mo20436r(), "_pc");
        if (n2 != null) {
            str = n2.mo20058E();
        }
        if (str == null || !str.equals(E)) {
            return false;
        }
        C3705r.m14336a("_e".equals(j4Var.mo19866M()));
        m15159R(this.f11161h);
        C6927o4 n3 = C4033ra.m15288n((C6863k4) j4Var.mo20436r(), "_et");
        if (n3 == null || !n3.mo20062S() || n3.mo20056A() <= 0) {
            return true;
        }
        long A = n3.mo20056A();
        m15159R(this.f11161h);
        C6927o4 n4 = C4033ra.m15288n((C6863k4) j4Var2.mo20436r(), "_et");
        if (n4 != null && n4.mo20056A() > 0) {
            A += n4.mo20056A();
        }
        m15159R(this.f11161h);
        C4033ra.m15286P(j4Var2, "_et", Long.valueOf(A));
        m15159R(this.f11161h);
        C4033ra.m15286P(j4Var, "_fr", 1L);
        return true;
    }

    /* renamed from: Q */
    private static final boolean m15158Q(C3844cb cbVar) {
        return !TextUtils.isEmpty(cbVar.f10594o) || !TextUtils.isEmpty(cbVar.f10585D);
    }

    /* renamed from: R */
    private static final C3843ca m15159R(C3843ca caVar) {
        if (caVar == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (caVar.mo11895k()) {
            return caVar;
        } else {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(caVar.getClass())));
        }
    }

    /* renamed from: f0 */
    public static C4009pa m15161f0(Context context) {
        C3705r.m14346k(context);
        C3705r.m14346k(context.getApplicationContext());
        if (f11148a == null) {
            synchronized (C4009pa.class) {
                if (f11148a == null) {
                    f11148a = new C4009pa((C4021qa) C3705r.m14346k(new C4021qa(context)), (C3955l5) null);
                }
            }
        }
        return f11148a;
    }

    /* renamed from: k0 */
    static /* bridge */ /* synthetic */ void m15162k0(C4009pa paVar, C4021qa qaVar) {
        paVar.mo11934a().mo11931h();
        paVar.f11165l = new C4039s4(paVar);
        C3974n nVar = new C3974n(paVar);
        nVar.mo11894j();
        paVar.f11157d = nVar;
        paVar.mo12275U().mo12032z((C3884g) C3705r.m14346k(paVar.f11155b));
        C3933j9 j9Var = new C3933j9(paVar);
        j9Var.mo11894j();
        paVar.f11163j = j9Var;
        C3819b bVar = new C3819b(paVar);
        bVar.mo11894j();
        paVar.f11160g = bVar;
        C4090w7 w7Var = new C4090w7(paVar);
        w7Var.mo11894j();
        paVar.f11162i = w7Var;
        C3817aa aaVar = new C3817aa(paVar);
        aaVar.mo11894j();
        paVar.f11159f = aaVar;
        paVar.f11158e = new C3915i4(paVar);
        if (paVar.f11171r != paVar.f11172s) {
            paVar.mo11935b().mo12544r().mo12478c("Not all upload components initialized", Integer.valueOf(paVar.f11171r), Integer.valueOf(paVar.f11172s));
        }
        paVar.f11167n = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo12267A(String str, C3923j jVar) {
        mo11934a().mo11931h();
        mo12286g();
        this.f11150B.put(str, jVar);
        C3974n nVar = this.f11157d;
        m15159R(nVar);
        C3705r.m14346k(str);
        C3705r.m14346k(jVar);
        nVar.mo11931h();
        nVar.mo11893i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", jVar.mo12121h());
        try {
            if (nVar.mo12202P().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                nVar.f10651a.mo11935b().mo12544r().mo12477b("Failed to insert/update consent setting (got -1). appId", C4122z3.m15469z(str));
            }
        } catch (SQLiteException e) {
            nVar.f10651a.mo11935b().mo12544r().mo12478c("Error storing consent setting. appId, error", C4122z3.m15469z(str), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo12268B(C4045sa saVar, C3844cb cbVar) {
        long j;
        C4045sa saVar2 = saVar;
        C3844cb cbVar2 = cbVar;
        mo11934a().mo11931h();
        mo12286g();
        if (m15158Q(cbVar)) {
            if (!cbVar2.f10600u) {
                mo12273S(cbVar2);
                return;
            }
            int n0 = mo12289h0().mo12512n0(saVar2.f11276o);
            if (n0 != 0) {
                C4105xa h0 = mo12289h0();
                String str = saVar2.f11276o;
                mo12275U();
                String r = h0.mo12518r(str, 24, true);
                String str2 = saVar2.f11276o;
                mo12289h0().mo12485B(this.f11154F, cbVar2.f10593f, n0, "_ev", r, str2 != null ? str2.length() : 0);
                return;
            }
            int j0 = mo12289h0().mo12508j0(saVar2.f11276o, saVar.mo12418o());
            if (j0 != 0) {
                C4105xa h02 = mo12289h0();
                String str3 = saVar2.f11276o;
                mo12275U();
                String r2 = h02.mo12518r(str3, 24, true);
                Object o = saVar.mo12418o();
                mo12289h0().mo12485B(this.f11154F, cbVar2.f10593f, j0, "_ev", r2, (o == null || (!(o instanceof String) && !(o instanceof CharSequence))) ? 0 : o.toString().length());
                return;
            }
            Object p = mo12289h0().mo12515p(saVar2.f11276o, saVar.mo12418o());
            if (p != null) {
                if ("_sid".equals(saVar2.f11276o)) {
                    long j2 = saVar2.f11277p;
                    String str4 = saVar2.f11280s;
                    String str5 = (String) C3705r.m14346k(cbVar2.f10593f);
                    C3974n nVar = this.f11157d;
                    m15159R(nVar);
                    C4069ua X = nVar.mo12209X(str5, "_sno");
                    if (X != null) {
                        Object obj = X.f11332e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            mo12268B(new C4045sa("_sno", j2, Long.valueOf(j + 1), str4), cbVar2);
                        }
                    }
                    if (X != null) {
                        mo11935b().mo12549w().mo12477b("Retrieved last session number from database does not contain a valid (long) value", X.f11332e);
                    }
                    C3974n nVar2 = this.f11157d;
                    m15159R(nVar2);
                    C4046t V = nVar2.mo12208V(str5, "_s");
                    if (V != null) {
                        j = V.f11284c;
                        mo11935b().mo12548v().mo12477b("Backfill the session number. Last used session number", Long.valueOf(j));
                    } else {
                        j = 0;
                    }
                    mo12268B(new C4045sa("_sno", j2, Long.valueOf(j + 1), str4), cbVar2);
                }
                C4069ua uaVar = new C4069ua((String) C3705r.m14346k(cbVar2.f10593f), (String) C3705r.m14346k(saVar2.f11280s), saVar2.f11276o, saVar2.f11277p, p);
                mo11935b().mo12548v().mo12478c("Setting user property", this.f11166m.mo12152D().mo12440f(uaVar.f11330c), p);
                C3974n nVar3 = this.f11157d;
                m15159R(nVar3);
                nVar3.mo12216e0();
                try {
                    if ("_id".equals(uaVar.f11330c)) {
                        C3974n nVar4 = this.f11157d;
                        m15159R(nVar4);
                        C4069ua X2 = nVar4.mo12209X(cbVar2.f10593f, "_id");
                        if (X2 != null && !uaVar.f11332e.equals(X2.f11332e)) {
                            C3974n nVar5 = this.f11157d;
                            m15159R(nVar5);
                            nVar5.mo12220m(cbVar2.f10593f, "_lair");
                        }
                    }
                    mo12273S(cbVar2);
                    C3974n nVar6 = this.f11157d;
                    m15159R(nVar6);
                    boolean x = nVar6.mo12231x(uaVar);
                    C3974n nVar7 = this.f11157d;
                    m15159R(nVar7);
                    nVar7.mo12222o();
                    if (!x) {
                        mo11935b().mo12544r().mo12478c("Too many unique user properties are set. Ignoring user property", this.f11166m.mo12152D().mo12440f(uaVar.f11330c), uaVar.f11332e);
                        mo12289h0().mo12485B(this.f11154F, cbVar2.f10593f, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    C3974n nVar8 = this.f11157d;
                    m15159R(nVar8);
                    nVar8.mo12217f0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:203|204) */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0258, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x025a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        mo11935b().mo12544r().mo12478c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C4122z3.m15469z(r6), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0551, code lost:
        if (r11 != null) goto L_0x052e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0115, code lost:
        if (r11 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:203:0x04d2 */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0281 A[SYNTHETIC, Splitter:B:136:0x0281] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x028a A[Catch:{ all -> 0x011b, all -> 0x0576 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0465 A[Catch:{ MalformedURLException -> 0x04d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0473 A[Catch:{ MalformedURLException -> 0x04d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0485 A[Catch:{ MalformedURLException -> 0x04d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04e9 A[Catch:{ all -> 0x011b, all -> 0x0576 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x055b A[Catch:{ all -> 0x011b, all -> 0x0576 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0572 A[SYNTHETIC, Splitter:B:243:0x0572] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011f A[Catch:{ all -> 0x011b, all -> 0x0576 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:194:0x0453=Splitter:B:194:0x0453, B:123:0x0255=Splitter:B:123:0x0255, B:233:0x0555=Splitter:B:233:0x0555, B:48:0x0106=Splitter:B:48:0x0106, B:40:0x00f7=Splitter:B:40:0x00f7, B:51:0x0118=Splitter:B:51:0x0118, B:133:0x0268=Splitter:B:133:0x0268, B:217:0x052e=Splitter:B:217:0x052e} */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12269C() {
        /*
            r22 = this;
            r1 = r22
            com.google.android.gms.measurement.internal.i5 r0 = r22.mo11934a()
            r0.mo11931h()
            r22.mo12286g()
            r2 = 1
            r1.f11175v = r2
            r3 = 0
            com.google.android.gms.measurement.internal.l5 r0 = r1.f11166m     // Catch:{ all -> 0x0576 }
            r0.mo11937d()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.l5 r0 = r1.f11166m     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.g9 r0 = r0.mo12159L()     // Catch:{ all -> 0x0576 }
            java.lang.Boolean r0 = r0.mo11985J()     // Catch:{ all -> 0x0576 }
            if (r0 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.z3 r0 = r22.mo11935b()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12549w()     // Catch:{ all -> 0x0576 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
        L_0x002b:
            r0.mo12476a(r2)     // Catch:{ all -> 0x0576 }
        L_0x002e:
            r1.f11175v = r3
        L_0x0030:
            r22.m15152K()
            return
        L_0x0034:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0576 }
            if (r0 == 0) goto L_0x0045
            com.google.android.gms.measurement.internal.z3 r0 = r22.mo11935b()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12544r()     // Catch:{ all -> 0x0576 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            goto L_0x002b
        L_0x0045:
            long r4 = r1.f11169p     // Catch:{ all -> 0x0576 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
        L_0x004d:
            r22.m15154M()     // Catch:{ all -> 0x0576 }
            goto L_0x002e
        L_0x0051:
            com.google.android.gms.measurement.internal.i5 r0 = r22.mo11934a()     // Catch:{ all -> 0x0576 }
            r0.mo11931h()     // Catch:{ all -> 0x0576 }
            java.util.List r0 = r1.f11178y     // Catch:{ all -> 0x0576 }
            if (r0 == 0) goto L_0x0067
            com.google.android.gms.measurement.internal.z3 r0 = r22.mo11935b()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12548v()     // Catch:{ all -> 0x0576 }
            java.lang.String r2 = "Uploading requested multiple times"
            goto L_0x002b
        L_0x0067:
            com.google.android.gms.measurement.internal.g4 r0 = r1.f11156c     // Catch:{ all -> 0x0576 }
            m15159R(r0)     // Catch:{ all -> 0x0576 }
            boolean r0 = r0.mo11970m()     // Catch:{ all -> 0x0576 }
            if (r0 != 0) goto L_0x0080
            com.google.android.gms.measurement.internal.z3 r0 = r22.mo11935b()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12548v()     // Catch:{ all -> 0x0576 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.mo12476a(r2)     // Catch:{ all -> 0x0576 }
            goto L_0x004d
        L_0x0080:
            com.google.android.gms.common.util.e r0 = r22.mo11936c()     // Catch:{ all -> 0x0576 }
            long r4 = r0.mo11730a()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.h r0 = r22.mo12275U()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.l3 r8 = com.google.android.gms.measurement.internal.C3966m3.f10977R     // Catch:{ all -> 0x0576 }
            r9 = 0
            int r0 = r0.mo12021o(r9, r8)     // Catch:{ all -> 0x0576 }
            r22.mo12275U()     // Catch:{ all -> 0x0576 }
            long r10 = com.google.android.gms.measurement.internal.C3897h.m14817I()     // Catch:{ all -> 0x0576 }
            long r10 = r4 - r10
            r8 = 0
        L_0x009d:
            if (r8 >= r0) goto L_0x00a8
            boolean r12 = r1.m15155N(r9, r10)     // Catch:{ all -> 0x0576 }
            if (r12 == 0) goto L_0x00a8
            int r8 = r8 + 1
            goto L_0x009d
        L_0x00a8:
            com.google.android.gms.measurement.internal.j9 r0 = r1.f11163j     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.l4 r0 = r0.f10836g     // Catch:{ all -> 0x0576 }
            long r10 = r0.mo12147a()     // Catch:{ all -> 0x0576 }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00cb
            com.google.android.gms.measurement.internal.z3 r0 = r22.mo11935b()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12543q()     // Catch:{ all -> 0x0576 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0576 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0576 }
            r0.mo12477b(r6, r7)     // Catch:{ all -> 0x0576 }
        L_0x00cb:
            com.google.android.gms.measurement.internal.n r0 = r1.f11157d     // Catch:{ all -> 0x0576 }
            m15159R(r0)     // Catch:{ all -> 0x0576 }
            java.lang.String r6 = r0.mo12211Z()     // Catch:{ all -> 0x0576 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0576 }
            r7 = -1
            if (r0 != 0) goto L_0x04ed
            long r10 = r1.f11149A     // Catch:{ all -> 0x0576 }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0123
            com.google.android.gms.measurement.internal.n r10 = r1.f11157d     // Catch:{ all -> 0x0576 }
            m15159R(r10)     // Catch:{ all -> 0x0576 }
            android.database.sqlite.SQLiteDatabase r0 = r10.mo12202P()     // Catch:{ SQLiteException -> 0x0104, all -> 0x0102 }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0102 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0100 }
            if (r0 != 0) goto L_0x00fb
        L_0x00f7:
            r11.close()     // Catch:{ all -> 0x0576 }
            goto L_0x0118
        L_0x00fb:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0100 }
            goto L_0x00f7
        L_0x0100:
            r0 = move-exception
            goto L_0x0106
        L_0x0102:
            r0 = move-exception
            goto L_0x011d
        L_0x0104:
            r0 = move-exception
            r11 = r9
        L_0x0106:
            com.google.android.gms.measurement.internal.l5 r10 = r10.f10651a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.z3 r10 = r10.mo11935b()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.x3 r10 = r10.mo12544r()     // Catch:{ all -> 0x011b }
            java.lang.String r12 = "Error querying raw events"
            r10.mo12477b(r12, r0)     // Catch:{ all -> 0x011b }
            if (r11 == 0) goto L_0x0118
            goto L_0x00f7
        L_0x0118:
            r1.f11149A = r7     // Catch:{ all -> 0x0576 }
            goto L_0x0123
        L_0x011b:
            r0 = move-exception
            r9 = r11
        L_0x011d:
            if (r9 == 0) goto L_0x0122
            r9.close()     // Catch:{ all -> 0x0576 }
        L_0x0122:
            throw r0     // Catch:{ all -> 0x0576 }
        L_0x0123:
            com.google.android.gms.measurement.internal.h r0 = r22.mo12275U()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.l3 r7 = com.google.android.gms.measurement.internal.C3966m3.f11000h     // Catch:{ all -> 0x0576 }
            int r0 = r0.mo12021o(r6, r7)     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.h r7 = r22.mo12275U()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.l3 r8 = com.google.android.gms.measurement.internal.C3966m3.f11002i     // Catch:{ all -> 0x0576 }
            int r7 = r7.mo12021o(r6, r8)     // Catch:{ all -> 0x0576 }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.n r8 = r1.f11157d     // Catch:{ all -> 0x0576 }
            m15159R(r8)     // Catch:{ all -> 0x0576 }
            r8.mo11931h()     // Catch:{ all -> 0x0576 }
            r8.mo11893i()     // Catch:{ all -> 0x0576 }
            if (r0 <= 0) goto L_0x014a
            r10 = 1
            goto L_0x014b
        L_0x014a:
            r10 = 0
        L_0x014b:
            com.google.android.gms.common.internal.C3705r.m14336a(r10)     // Catch:{ all -> 0x0576 }
            if (r7 <= 0) goto L_0x0152
            r10 = 1
            goto L_0x0153
        L_0x0152:
            r10 = 0
        L_0x0153:
            com.google.android.gms.common.internal.C3705r.m14336a(r10)     // Catch:{ all -> 0x0576 }
            com.google.android.gms.common.internal.C3705r.m14342g(r6)     // Catch:{ all -> 0x0576 }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo12202P()     // Catch:{ SQLiteException -> 0x0264, all -> 0x0260 }
            java.lang.String r12 = "rowid"
            java.lang.String r13 = "data"
            java.lang.String r14 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r12, r13, r14}     // Catch:{ SQLiteException -> 0x0264, all -> 0x0260 }
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0264, all -> 0x0260 }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x0264, all -> 0x0260 }
            java.lang.String r12 = "queue"
            java.lang.String r14 = "app_id=?"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0264, all -> 0x0260 }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0264, all -> 0x0260 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x025c }
            if (r0 != 0) goto L_0x018e
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x025c }
            r11.close()     // Catch:{ all -> 0x0576 }
            r20 = r4
            goto L_0x0284
        L_0x018e:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x025c }
            r12.<init>()     // Catch:{ SQLiteException -> 0x025c }
            r13 = 0
        L_0x0194:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x025c }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x0231 }
            com.google.android.gms.measurement.internal.pa r2 = r8.f10552b     // Catch:{ IOException -> 0x0231 }
            com.google.android.gms.measurement.internal.ra r2 = r2.f11161h     // Catch:{ IOException -> 0x0231 }
            m15159R(r2)     // Catch:{ IOException -> 0x0231 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x021c }
            r9.<init>(r0)     // Catch:{ IOException -> 0x021c }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x021c }
            r0.<init>(r9)     // Catch:{ IOException -> 0x021c }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x021c }
            r3.<init>()     // Catch:{ IOException -> 0x021c }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x021c }
            r20 = r4
        L_0x01b8:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x021a }
            if (r4 > 0) goto L_0x0215
            r0.close()     // Catch:{ IOException -> 0x021a }
            r9.close()     // Catch:{ IOException -> 0x021a }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x021a }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x025a }
            if (r2 != 0) goto L_0x01d4
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x025a }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01d4
            goto L_0x0255
        L_0x01d4:
            e.f.a.c.f.g.u4 r2 = p174e.p319f.p320a.p335c.p345f.p352g.C7039v4.m26810L1()     // Catch:{ IOException -> 0x0200 }
            e.f.a.c.f.g.fa r2 = com.google.android.gms.measurement.internal.C4033ra.m15282C(r2, r0)     // Catch:{ IOException -> 0x0200 }
            e.f.a.c.f.g.u4 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C7023u4) r2     // Catch:{ IOException -> 0x0200 }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x025a }
            if (r4 != 0) goto L_0x01ec
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x025a }
            r2.mo20266h0(r4)     // Catch:{ SQLiteException -> 0x025a }
        L_0x01ec:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x025a }
            int r13 = r13 + r0
            e.f.a.c.f.g.a9 r0 = r2.mo20436r()     // Catch:{ SQLiteException -> 0x025a }
            e.f.a.c.f.g.v4 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C7039v4) r0     // Catch:{ SQLiteException -> 0x025a }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x025a }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x025a }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x025a }
            goto L_0x0245
        L_0x0200:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l5 r2 = r8.f10651a     // Catch:{ SQLiteException -> 0x025a }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ SQLiteException -> 0x025a }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ SQLiteException -> 0x025a }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r6)     // Catch:{ SQLiteException -> 0x025a }
        L_0x0211:
            r2.mo12478c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x025a }
            goto L_0x0245
        L_0x0215:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x021a }
            goto L_0x01b8
        L_0x021a:
            r0 = move-exception
            goto L_0x021f
        L_0x021c:
            r0 = move-exception
            r20 = r4
        L_0x021f:
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a     // Catch:{ IOException -> 0x022f }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ IOException -> 0x022f }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ IOException -> 0x022f }
            java.lang.String r3 = "Failed to ungzip content"
            r2.mo12477b(r3, r0)     // Catch:{ IOException -> 0x022f }
            throw r0     // Catch:{ IOException -> 0x022f }
        L_0x022f:
            r0 = move-exception
            goto L_0x0234
        L_0x0231:
            r0 = move-exception
            r20 = r4
        L_0x0234:
            com.google.android.gms.measurement.internal.l5 r2 = r8.f10651a     // Catch:{ SQLiteException -> 0x025a }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ SQLiteException -> 0x025a }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ SQLiteException -> 0x025a }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r6)     // Catch:{ SQLiteException -> 0x025a }
            goto L_0x0211
        L_0x0245:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x025a }
            if (r0 == 0) goto L_0x0255
            if (r13 <= r7) goto L_0x024e
            goto L_0x0255
        L_0x024e:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            goto L_0x0194
        L_0x0255:
            r11.close()     // Catch:{ all -> 0x0576 }
            r0 = r12
            goto L_0x0284
        L_0x025a:
            r0 = move-exception
            goto L_0x0268
        L_0x025c:
            r0 = move-exception
            r20 = r4
            goto L_0x0268
        L_0x0260:
            r0 = move-exception
            r9 = 0
            goto L_0x04e7
        L_0x0264:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x0268:
            com.google.android.gms.measurement.internal.l5 r2 = r8.f10651a     // Catch:{ all -> 0x04e5 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ all -> 0x04e5 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x04e5 }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r6)     // Catch:{ all -> 0x04e5 }
            r2.mo12478c(r3, r4, r0)     // Catch:{ all -> 0x04e5 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04e5 }
            if (r11 == 0) goto L_0x0284
            r11.close()     // Catch:{ all -> 0x0576 }
        L_0x0284:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0576 }
            if (r2 != 0) goto L_0x0569
            com.google.android.gms.measurement.internal.j r2 = r1.mo12276V(r6)     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.i r3 = com.google.android.gms.measurement.internal.C3910i.AD_STORAGE     // Catch:{ all -> 0x0576 }
            boolean r2 = r2.mo12123i(r3)     // Catch:{ all -> 0x0576 }
            if (r2 == 0) goto L_0x02eb
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0576 }
        L_0x029a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0576 }
            if (r3 == 0) goto L_0x02b9
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0576 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0576 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0576 }
            e.f.a.c.f.g.v4 r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C7039v4) r3     // Catch:{ all -> 0x0576 }
            java.lang.String r4 = r3.mo20333G()     // Catch:{ all -> 0x0576 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0576 }
            if (r4 != 0) goto L_0x029a
            java.lang.String r2 = r3.mo20333G()     // Catch:{ all -> 0x0576 }
            goto L_0x02ba
        L_0x02b9:
            r2 = 0
        L_0x02ba:
            if (r2 == 0) goto L_0x02eb
            r3 = 0
        L_0x02bd:
            int r4 = r0.size()     // Catch:{ all -> 0x0576 }
            if (r3 >= r4) goto L_0x02eb
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0576 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0576 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x0576 }
            e.f.a.c.f.g.v4 r4 = (p174e.p319f.p320a.p335c.p345f.p352g.C7039v4) r4     // Catch:{ all -> 0x0576 }
            java.lang.String r5 = r4.mo20333G()     // Catch:{ all -> 0x0576 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0576 }
            if (r5 == 0) goto L_0x02d8
            goto L_0x02e8
        L_0x02d8:
            java.lang.String r4 = r4.mo20333G()     // Catch:{ all -> 0x0576 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0576 }
            if (r4 != 0) goto L_0x02e8
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)     // Catch:{ all -> 0x0576 }
            goto L_0x02eb
        L_0x02e8:
            int r3 = r3 + 1
            goto L_0x02bd
        L_0x02eb:
            e.f.a.c.f.g.r4 r2 = p174e.p319f.p320a.p335c.p345f.p352g.C7007t4.m26526x()     // Catch:{ all -> 0x0576 }
            int r3 = r0.size()     // Catch:{ all -> 0x0576 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0576 }
            int r5 = r0.size()     // Catch:{ all -> 0x0576 }
            r4.<init>(r5)     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.h r5 = r22.mo12275U()     // Catch:{ all -> 0x0576 }
            boolean r5 = r5.mo12011C(r6)     // Catch:{ all -> 0x0576 }
            if (r5 == 0) goto L_0x0314
            com.google.android.gms.measurement.internal.j r5 = r1.mo12276V(r6)     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.i r7 = com.google.android.gms.measurement.internal.C3910i.AD_STORAGE     // Catch:{ all -> 0x0576 }
            boolean r5 = r5.mo12123i(r7)     // Catch:{ all -> 0x0576 }
            if (r5 == 0) goto L_0x0314
            r5 = 1
            goto L_0x0315
        L_0x0314:
            r5 = 0
        L_0x0315:
            com.google.android.gms.measurement.internal.j r7 = r1.mo12276V(r6)     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.i r8 = com.google.android.gms.measurement.internal.C3910i.AD_STORAGE     // Catch:{ all -> 0x0576 }
            boolean r7 = r7.mo12123i(r8)     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.j r8 = r1.mo12276V(r6)     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.i r9 = com.google.android.gms.measurement.internal.C3910i.ANALYTICS_STORAGE     // Catch:{ all -> 0x0576 }
            boolean r8 = r8.mo12123i(r9)     // Catch:{ all -> 0x0576 }
            p174e.p319f.p320a.p335c.p345f.p352g.C6825he.m25843b()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.h r9 = r22.mo12275U()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.l3 r10 = com.google.android.gms.measurement.internal.C3966m3.f10951A0     // Catch:{ all -> 0x0576 }
            r11 = 0
            boolean r9 = r9.mo12010B(r11, r10)     // Catch:{ all -> 0x0576 }
            r10 = 0
        L_0x0338:
            if (r10 >= r3) goto L_0x03b6
            java.lang.Object r11 = r0.get(r10)     // Catch:{ all -> 0x0576 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x0576 }
            java.lang.Object r11 = r11.first     // Catch:{ all -> 0x0576 }
            e.f.a.c.f.g.v4 r11 = (p174e.p319f.p320a.p335c.p345f.p352g.C7039v4) r11     // Catch:{ all -> 0x0576 }
            e.f.a.c.f.g.x8 r11 = r11.mo19526u()     // Catch:{ all -> 0x0576 }
            e.f.a.c.f.g.u4 r11 = (p174e.p319f.p320a.p335c.p345f.p352g.C7023u4) r11     // Catch:{ all -> 0x0576 }
            java.lang.Object r12 = r0.get(r10)     // Catch:{ all -> 0x0576 }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x0576 }
            java.lang.Object r12 = r12.second     // Catch:{ all -> 0x0576 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0576 }
            r4.add(r12)     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.h r12 = r22.mo12275U()     // Catch:{ all -> 0x0576 }
            r12.mo12023q()     // Catch:{ all -> 0x0576 }
            r12 = 68000(0x109a0, double:3.35965E-319)
            r11.mo20272o0(r12)     // Catch:{ all -> 0x0576 }
            r12 = r20
            r11.mo20271n0(r12)     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.l5 r14 = r1.f11166m     // Catch:{ all -> 0x0576 }
            r14.mo11937d()     // Catch:{ all -> 0x0576 }
            r14 = 0
            r11.mo20267j0(r14)     // Catch:{ all -> 0x0576 }
            if (r5 != 0) goto L_0x0377
            r11.mo20239M0()     // Catch:{ all -> 0x0576 }
        L_0x0377:
            if (r7 != 0) goto L_0x037f
            r11.mo20253T0()     // Catch:{ all -> 0x0576 }
            r11.mo20245P0()     // Catch:{ all -> 0x0576 }
        L_0x037f:
            if (r8 != 0) goto L_0x0384
            r11.mo20234J0()     // Catch:{ all -> 0x0576 }
        L_0x0384:
            r1.mo12288h(r6, r11)     // Catch:{ all -> 0x0576 }
            if (r9 != 0) goto L_0x038c
            r11.mo20255U0()     // Catch:{ all -> 0x0576 }
        L_0x038c:
            com.google.android.gms.measurement.internal.h r14 = r22.mo12275U()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.l3 r15 = com.google.android.gms.measurement.internal.C3966m3.f10981V     // Catch:{ all -> 0x0576 }
            boolean r14 = r14.mo12010B(r6, r15)     // Catch:{ all -> 0x0576 }
            if (r14 == 0) goto L_0x03ae
            e.f.a.c.f.g.a9 r14 = r11.mo20436r()     // Catch:{ all -> 0x0576 }
            e.f.a.c.f.g.v4 r14 = (p174e.p319f.p320a.p335c.p345f.p352g.C7039v4) r14     // Catch:{ all -> 0x0576 }
            byte[] r14 = r14.mo19840k()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.ra r15 = r1.f11161h     // Catch:{ all -> 0x0576 }
            m15159R(r15)     // Catch:{ all -> 0x0576 }
            long r14 = r15.mo12400x(r14)     // Catch:{ all -> 0x0576 }
            r11.mo20226F(r14)     // Catch:{ all -> 0x0576 }
        L_0x03ae:
            r2.mo20122u(r11)     // Catch:{ all -> 0x0576 }
            int r10 = r10 + 1
            r20 = r12
            goto L_0x0338
        L_0x03b6:
            r12 = r20
            com.google.android.gms.measurement.internal.z3 r0 = r22.mo11935b()     // Catch:{ all -> 0x0576 }
            java.lang.String r0 = r0.mo12541C()     // Catch:{ all -> 0x0576 }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0576 }
            if (r0 == 0) goto L_0x03d8
            com.google.android.gms.measurement.internal.ra r0 = r1.f11161h     // Catch:{ all -> 0x0576 }
            m15159R(r0)     // Catch:{ all -> 0x0576 }
            e.f.a.c.f.g.a9 r5 = r2.mo20436r()     // Catch:{ all -> 0x0576 }
            e.f.a.c.f.g.t4 r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C7007t4) r5     // Catch:{ all -> 0x0576 }
            java.lang.String r0 = r0.mo12391D(r5)     // Catch:{ all -> 0x0576 }
            r11 = r0
            goto L_0x03d9
        L_0x03d8:
            r11 = 0
        L_0x03d9:
            com.google.android.gms.measurement.internal.ra r0 = r1.f11161h     // Catch:{ all -> 0x0576 }
            m15159R(r0)     // Catch:{ all -> 0x0576 }
            e.f.a.c.f.g.a9 r0 = r2.mo20436r()     // Catch:{ all -> 0x0576 }
            e.f.a.c.f.g.t4 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C7007t4) r0     // Catch:{ all -> 0x0576 }
            byte[] r14 = r0.mo19840k()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.da r0 = r1.f11164k     // Catch:{ all -> 0x0576 }
            p174e.p319f.p320a.p335c.p345f.p352g.C6724be.m25469b()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.l5 r5 = r0.f10651a     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.h r5 = r5.mo12181z()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.l3 r7 = com.google.android.gms.measurement.internal.C3966m3.f11031w0     // Catch:{ all -> 0x0576 }
            boolean r5 = r5.mo12010B(r6, r7)     // Catch:{ all -> 0x0576 }
            if (r5 == 0) goto L_0x044b
            com.google.android.gms.measurement.internal.pa r0 = r0.f10552b     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.c5 r0 = r0.f11155b     // Catch:{ all -> 0x0576 }
            m15159R(r0)     // Catch:{ all -> 0x0576 }
            java.lang.String r0 = r0.mo11886w(r6)     // Catch:{ all -> 0x0576 }
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0576 }
            if (r5 != 0) goto L_0x0441
            com.google.android.gms.measurement.internal.l3 r5 = com.google.android.gms.measurement.internal.C3966m3.f11020r     // Catch:{ all -> 0x0576 }
            r7 = 0
            java.lang.Object r5 = r5.mo12145a(r7)     // Catch:{ all -> 0x0576 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0576 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0576 }
            android.net.Uri$Builder r7 = r5.buildUpon()     // Catch:{ all -> 0x0576 }
            java.lang.String r5 = r5.getAuthority()     // Catch:{ all -> 0x0576 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0576 }
            r8.<init>()     // Catch:{ all -> 0x0576 }
            r8.append(r0)     // Catch:{ all -> 0x0576 }
            java.lang.String r0 = "."
            r8.append(r0)     // Catch:{ all -> 0x0576 }
            r8.append(r5)     // Catch:{ all -> 0x0576 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0576 }
            r7.authority(r0)     // Catch:{ all -> 0x0576 }
            android.net.Uri r0 = r7.build()     // Catch:{ all -> 0x0576 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0576 }
            goto L_0x0453
        L_0x0441:
            com.google.android.gms.measurement.internal.l3 r0 = com.google.android.gms.measurement.internal.C3966m3.f11020r     // Catch:{ all -> 0x0576 }
            r5 = 0
            java.lang.Object r0 = r0.mo12145a(r5)     // Catch:{ all -> 0x0576 }
        L_0x0448:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0576 }
            goto L_0x0453
        L_0x044b:
            com.google.android.gms.measurement.internal.l3 r0 = com.google.android.gms.measurement.internal.C3966m3.f11020r     // Catch:{ all -> 0x0576 }
            r5 = 0
            java.lang.Object r0 = r0.mo12145a(r5)     // Catch:{ all -> 0x0576 }
            goto L_0x0448
        L_0x0453:
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x04d2 }
            r5.<init>(r0)     // Catch:{ MalformedURLException -> 0x04d2 }
            boolean r7 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x04d2 }
            r8 = 1
            r7 = r7 ^ r8
            com.google.android.gms.common.internal.C3705r.m14336a(r7)     // Catch:{ MalformedURLException -> 0x04d2 }
            java.util.List r7 = r1.f11178y     // Catch:{ MalformedURLException -> 0x04d2 }
            if (r7 == 0) goto L_0x0473
            com.google.android.gms.measurement.internal.z3 r4 = r22.mo11935b()     // Catch:{ MalformedURLException -> 0x04d2 }
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12544r()     // Catch:{ MalformedURLException -> 0x04d2 }
            java.lang.String r7 = "Set uploading progress before finishing the previous upload"
            r4.mo12476a(r7)     // Catch:{ MalformedURLException -> 0x04d2 }
            goto L_0x047a
        L_0x0473:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x04d2 }
            r7.<init>(r4)     // Catch:{ MalformedURLException -> 0x04d2 }
            r1.f11178y = r7     // Catch:{ MalformedURLException -> 0x04d2 }
        L_0x047a:
            com.google.android.gms.measurement.internal.j9 r4 = r1.f11163j     // Catch:{ MalformedURLException -> 0x04d2 }
            com.google.android.gms.measurement.internal.l4 r4 = r4.f10837h     // Catch:{ MalformedURLException -> 0x04d2 }
            r4.mo12148b(r12)     // Catch:{ MalformedURLException -> 0x04d2 }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x048e
            r3 = 0
            e.f.a.c.f.g.v4 r2 = r2.mo20123v(r3)     // Catch:{ MalformedURLException -> 0x04d2 }
            java.lang.String r4 = r2.mo20346P1()     // Catch:{ MalformedURLException -> 0x04d2 }
        L_0x048e:
            com.google.android.gms.measurement.internal.z3 r2 = r22.mo11935b()     // Catch:{ MalformedURLException -> 0x04d2 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12548v()     // Catch:{ MalformedURLException -> 0x04d2 }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r7 = r14.length     // Catch:{ MalformedURLException -> 0x04d2 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x04d2 }
            r2.mo12479d(r3, r4, r7, r11)     // Catch:{ MalformedURLException -> 0x04d2 }
            r2 = 1
            r1.f11174u = r2     // Catch:{ MalformedURLException -> 0x04d2 }
            com.google.android.gms.measurement.internal.g4 r11 = r1.f11156c     // Catch:{ MalformedURLException -> 0x04d2 }
            m15159R(r11)     // Catch:{ MalformedURLException -> 0x04d2 }
            com.google.android.gms.measurement.internal.fa r2 = new com.google.android.gms.measurement.internal.fa     // Catch:{ MalformedURLException -> 0x04d2 }
            r2.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x04d2 }
            r11.mo11931h()     // Catch:{ MalformedURLException -> 0x04d2 }
            r11.mo11893i()     // Catch:{ MalformedURLException -> 0x04d2 }
            com.google.android.gms.common.internal.C3705r.m14346k(r5)     // Catch:{ MalformedURLException -> 0x04d2 }
            com.google.android.gms.common.internal.C3705r.m14346k(r14)     // Catch:{ MalformedURLException -> 0x04d2 }
            com.google.android.gms.common.internal.C3705r.m14346k(r2)     // Catch:{ MalformedURLException -> 0x04d2 }
            com.google.android.gms.measurement.internal.l5 r3 = r11.f10651a     // Catch:{ MalformedURLException -> 0x04d2 }
            com.google.android.gms.measurement.internal.i5 r3 = r3.mo11934a()     // Catch:{ MalformedURLException -> 0x04d2 }
            com.google.android.gms.measurement.internal.e4 r4 = new com.google.android.gms.measurement.internal.e4     // Catch:{ MalformedURLException -> 0x04d2 }
            r15 = 0
            r10 = r4
            r12 = r6
            r13 = r5
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x04d2 }
            r3.mo12109y(r4)     // Catch:{ MalformedURLException -> 0x04d2 }
            goto L_0x0569
        L_0x04d2:
            com.google.android.gms.measurement.internal.z3 r2 = r22.mo11935b()     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x0576 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r6)     // Catch:{ all -> 0x0576 }
            r2.mo12478c(r3, r4, r0)     // Catch:{ all -> 0x0576 }
            goto L_0x0569
        L_0x04e5:
            r0 = move-exception
            r9 = r11
        L_0x04e7:
            if (r9 == 0) goto L_0x04ec
            r9.close()     // Catch:{ all -> 0x0576 }
        L_0x04ec:
            throw r0     // Catch:{ all -> 0x0576 }
        L_0x04ed:
            r12 = r4
            r5 = r9
            r1.f11149A = r7     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d     // Catch:{ all -> 0x0576 }
            m15159R(r2)     // Catch:{ all -> 0x0576 }
            r22.mo12275U()     // Catch:{ all -> 0x0576 }
            long r3 = com.google.android.gms.measurement.internal.C3897h.m14817I()     // Catch:{ all -> 0x0576 }
            long r3 = r12 - r3
            r2.mo11931h()     // Catch:{ all -> 0x0576 }
            r2.mo11893i()     // Catch:{ all -> 0x0576 }
            android.database.sqlite.SQLiteDatabase r0 = r2.mo12202P()     // Catch:{ SQLiteException -> 0x0540, all -> 0x053d }
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0540, all -> 0x053d }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ SQLiteException -> 0x0540, all -> 0x053d }
            r4 = 0
            r6[r4] = r3     // Catch:{ SQLiteException -> 0x0540, all -> 0x053d }
            java.lang.String r3 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r3, r6)     // Catch:{ SQLiteException -> 0x0540, all -> 0x053d }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x053b }
            if (r0 != 0) goto L_0x0532
            com.google.android.gms.measurement.internal.l5 r0 = r2.f10651a     // Catch:{ SQLiteException -> 0x053b }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ SQLiteException -> 0x053b }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12548v()     // Catch:{ SQLiteException -> 0x053b }
            java.lang.String r3 = "No expired configs for apps with pending events"
            r0.mo12476a(r3)     // Catch:{ SQLiteException -> 0x053b }
        L_0x052e:
            r11.close()     // Catch:{ all -> 0x0576 }
            goto L_0x0554
        L_0x0532:
            r3 = 0
            java.lang.String r9 = r11.getString(r3)     // Catch:{ SQLiteException -> 0x053b }
            r11.close()     // Catch:{ all -> 0x0576 }
            goto L_0x0555
        L_0x053b:
            r0 = move-exception
            goto L_0x0542
        L_0x053d:
            r0 = move-exception
            r9 = r5
            goto L_0x0570
        L_0x0540:
            r0 = move-exception
            r11 = r5
        L_0x0542:
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a     // Catch:{ all -> 0x056e }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ all -> 0x056e }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x056e }
            java.lang.String r3 = "Error selecting expired configs"
            r2.mo12477b(r3, r0)     // Catch:{ all -> 0x056e }
            if (r11 == 0) goto L_0x0554
            goto L_0x052e
        L_0x0554:
            r9 = r5
        L_0x0555:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0576 }
            if (r0 != 0) goto L_0x0569
            com.google.android.gms.measurement.internal.n r0 = r1.f11157d     // Catch:{ all -> 0x0576 }
            m15159R(r0)     // Catch:{ all -> 0x0576 }
            com.google.android.gms.measurement.internal.h6 r0 = r0.mo12204R(r9)     // Catch:{ all -> 0x0576 }
            if (r0 == 0) goto L_0x0569
            r1.mo12290i(r0)     // Catch:{ all -> 0x0576 }
        L_0x0569:
            r2 = 0
            r1.f11175v = r2
            goto L_0x0030
        L_0x056e:
            r0 = move-exception
            r9 = r11
        L_0x0570:
            if (r9 == 0) goto L_0x0575
            r9.close()     // Catch:{ all -> 0x0576 }
        L_0x0575:
            throw r0     // Catch:{ all -> 0x0576 }
        L_0x0576:
            r0 = move-exception
            r2 = 0
            r1.f11175v = r2
            r22.m15152K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4009pa.mo12269C():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0731, code lost:
        if (r14.isEmpty() != false) goto L_0x0733;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x030b A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0369 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x04f9 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0538 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x05b1 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x05fe A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x060b A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0618 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0642 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0653 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0694 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x06af A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0736 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0788 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x07d0 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x07e9 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0875 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0894 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0926 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x09d1 A[Catch:{ SQLiteException -> 0x09ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x09e7  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0932 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0155 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016b A[SYNTHETIC, Splitter:B:46:0x016b] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e6 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02be A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0308 A[Catch:{ NumberFormatException -> 0x071b, all -> 0x0a68 }] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12270D(com.google.android.gms.measurement.internal.C4094x r35, com.google.android.gms.measurement.internal.C3844cb r36) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.C3705r.m14346k(r36)
            java.lang.String r8 = r3.f10593f
            com.google.android.gms.common.internal.C3705r.m14342g(r8)
            long r8 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.i5 r10 = r34.mo11934a()
            r10.mo11931h()
            r34.mo12286g()
            java.lang.String r10 = r3.f10593f
            com.google.android.gms.measurement.internal.ra r11 = r1.f11161h
            m15159R(r11)
            boolean r11 = com.google.android.gms.measurement.internal.C4033ra.m15287m(r35, r36)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f10600u
            if (r11 == 0) goto L_0x0a73
            com.google.android.gms.measurement.internal.c5 r11 = r1.f11155b
            m15159R(r11)
            java.lang.String r12 = r2.f11381f
            boolean r11 = r11.mo11872F(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.z3 r3 = r34.mo11935b()
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12549w()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r10)
            com.google.android.gms.measurement.internal.l5 r5 = r1.f11166m
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo12152D()
            java.lang.String r6 = r2.f11381f
            java.lang.String r5 = r5.mo12438d(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.mo12478c(r6, r4, r5)
            com.google.android.gms.measurement.internal.c5 r3 = r1.f11155b
            m15159R(r3)
            boolean r3 = r3.mo11870D(r10)
            if (r3 != 0) goto L_0x0097
            com.google.android.gms.measurement.internal.c5 r3 = r1.f11155b
            m15159R(r3)
            boolean r3 = r3.mo11873G(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x0097
        L_0x007a:
            java.lang.String r3 = r2.f11381f
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00de
            com.google.android.gms.measurement.internal.xa r11 = r34.mo12289h0()
            com.google.android.gms.measurement.internal.wa r12 = r1.f11154F
            r14 = 11
            java.lang.String r2 = r2.f11381f
            r17 = 0
            java.lang.String r15 = "_ev"
            r13 = r10
            r16 = r2
            r11.mo12485B(r12, r13, r14, r15, r16, r17)
            return
        L_0x0097:
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d
            m15159R(r2)
            com.google.android.gms.measurement.internal.h6 r2 = r2.mo12204R(r10)
            if (r2 == 0) goto L_0x00de
            long r3 = r2.mo12057V()
            long r5 = r2.mo12048M()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.common.util.e r5 = r34.mo11936c()
            long r5 = r5.mo11730a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r34.mo12275U()
            com.google.android.gms.measurement.internal.l3 r5 = com.google.android.gms.measurement.internal.C3966m3.f10950A
            java.lang.Object r5 = r5.mo12145a(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.z3 r3 = r34.mo11935b()
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12543q()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.mo12476a(r4)
            r1.mo12290i(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.a4 r2 = com.google.android.gms.measurement.internal.C3811a4.m14622b(r35)
            com.google.android.gms.measurement.internal.xa r11 = r34.mo12289h0()
            com.google.android.gms.measurement.internal.h r12 = r34.mo12275U()
            int r12 = r12.mo12020n(r10)
            r11.mo12484A(r2, r12)
            com.google.android.gms.measurement.internal.x r2 = r2.mo11846a()
            com.google.android.gms.measurement.internal.z3 r11 = r34.mo11935b()
            java.lang.String r11 = r11.mo12541C()
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)
            if (r11 == 0) goto L_0x011c
            com.google.android.gms.measurement.internal.z3 r11 = r34.mo11935b()
            com.google.android.gms.measurement.internal.x3 r11 = r11.mo12548v()
            com.google.android.gms.measurement.internal.l5 r12 = r1.f11166m
            com.google.android.gms.measurement.internal.u3 r12 = r12.mo12152D()
            java.lang.String r12 = r12.mo12437c(r2)
            java.lang.String r13 = "Logging event"
            r11.mo12477b(r13, r12)
        L_0x011c:
            com.google.android.gms.measurement.internal.n r11 = r1.f11157d
            m15159R(r11)
            r11.mo12216e0()
            r1.mo12273S(r3)     // Catch:{ all -> 0x0a68 }
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.f11381f     // Catch:{ all -> 0x0a68 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0a68 }
            java.lang.String r12 = "refund"
            r28 = r8
            if (r11 != 0) goto L_0x014a
            java.lang.String r9 = "purchase"
            java.lang.String r11 = r2.f11381f     // Catch:{ all -> 0x0a68 }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0a68 }
            if (r9 != 0) goto L_0x014a
            java.lang.String r9 = r2.f11381f     // Catch:{ all -> 0x0a68 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0a68 }
            if (r9 == 0) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            r9 = 0
            goto L_0x014b
        L_0x014a:
            r9 = 1
        L_0x014b:
            java.lang.String r11 = "_iap"
            java.lang.String r13 = r2.f11381f     // Catch:{ all -> 0x0a68 }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0a68 }
            if (r11 != 0) goto L_0x015f
            if (r9 == 0) goto L_0x0159
            r9 = 1
            goto L_0x015f
        L_0x0159:
            r33 = r4
            r8 = r15
        L_0x015c:
            r4 = 2
            goto L_0x02f5
        L_0x015f:
            com.google.android.gms.measurement.internal.v r11 = r2.f11382o     // Catch:{ all -> 0x0a68 }
            java.lang.String r13 = "currency"
            java.lang.String r11 = r11.mo12450H(r13)     // Catch:{ all -> 0x0a68 }
            java.lang.String r13 = "value"
            if (r9 == 0) goto L_0x01d4
            com.google.android.gms.measurement.internal.v r9 = r2.f11382o     // Catch:{ all -> 0x0a68 }
            java.lang.Double r9 = r9.mo12447C(r13)     // Catch:{ all -> 0x0a68 }
            double r17 = r9.doubleValue()     // Catch:{ all -> 0x0a68 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r9 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r9 != 0) goto L_0x0192
            com.google.android.gms.measurement.internal.v r9 = r2.f11382o     // Catch:{ all -> 0x0a68 }
            java.lang.Long r9 = r9.mo12448E(r13)     // Catch:{ all -> 0x0a68 }
            r21 = r15
            long r14 = r9.longValue()     // Catch:{ all -> 0x0a68 }
            double r13 = (double) r14     // Catch:{ all -> 0x0a68 }
            double r17 = r13 * r19
            goto L_0x0194
        L_0x0192:
            r21 = r15
        L_0x0194:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x01ae
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x01ae
            long r13 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0a68 }
            java.lang.String r9 = r2.f11381f     // Catch:{ all -> 0x0a68 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0a68 }
            if (r9 == 0) goto L_0x01e0
            long r13 = -r13
            goto L_0x01e0
        L_0x01ae:
            com.google.android.gms.measurement.internal.z3 r2 = r34.mo11935b()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12549w()     // Catch:{ all -> 0x0a68 }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r10)     // Catch:{ all -> 0x0a68 }
            java.lang.Double r5 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0a68 }
            r2.mo12478c(r3, r4, r5)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r2)     // Catch:{ all -> 0x0a68 }
            r2.mo12222o()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d
            m15159R(r2)
            r2.mo12217f0()
            return
        L_0x01d4:
            r21 = r15
            com.google.android.gms.measurement.internal.v r9 = r2.f11382o     // Catch:{ all -> 0x0a68 }
            java.lang.Long r9 = r9.mo12448E(r13)     // Catch:{ all -> 0x0a68 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0a68 }
        L_0x01e0:
            boolean r9 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0a68 }
            if (r9 != 0) goto L_0x02ef
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0a68 }
            java.lang.String r9 = r11.toUpperCase(r9)     // Catch:{ all -> 0x0a68 }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r9.matches(r11)     // Catch:{ all -> 0x0a68 }
            if (r11 == 0) goto L_0x02ef
            java.lang.String r11 = "_ltv_"
            java.lang.String r9 = r11.concat(r9)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.n r11 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r11)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.ua r11 = r11.mo12209X(r10, r9)     // Catch:{ all -> 0x0a68 }
            if (r11 == 0) goto L_0x023a
            java.lang.Object r11 = r11.f11332e     // Catch:{ all -> 0x0a68 }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0a68 }
            if (r12 != 0) goto L_0x020c
            goto L_0x023a
        L_0x020c:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0a68 }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.ua r18 = new com.google.android.gms.measurement.internal.ua     // Catch:{ all -> 0x0a68 }
            java.lang.String r15 = r2.f11383p     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.common.util.e r17 = r34.mo11936c()     // Catch:{ all -> 0x0a68 }
            long r19 = r17.mo11730a()     // Catch:{ all -> 0x0a68 }
            long r11 = r11 + r13
            java.lang.Long r17 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0a68 }
            r11 = r18
            r12 = r10
            r14 = 0
            r13 = r15
            r8 = 0
            r15 = 0
            r14 = r9
            r9 = r21
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0a68 }
            r33 = r4
            r8 = r9
            r9 = r18
            r4 = 2
            goto L_0x02b3
        L_0x023a:
            r15 = r21
            r8 = 0
            com.google.android.gms.measurement.internal.n r11 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r11)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.h r12 = r34.mo12275U()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l3 r8 = com.google.android.gms.measurement.internal.C3966m3.f10960F     // Catch:{ all -> 0x0a68 }
            int r8 = r12.mo12021o(r10, r8)     // Catch:{ all -> 0x0a68 }
            int r8 = r8 + -1
            com.google.android.gms.common.internal.C3705r.m14342g(r10)     // Catch:{ all -> 0x0a68 }
            r11.mo11931h()     // Catch:{ all -> 0x0a68 }
            r11.mo11893i()     // Catch:{ all -> 0x0a68 }
            android.database.sqlite.SQLiteDatabase r12 = r11.mo12202P()     // Catch:{ SQLiteException -> 0x027d }
            r21 = r15
            r15 = 3
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0279 }
            r16 = 0
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x0279 }
            r16 = 1
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x0279 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x0279 }
            r33 = r4
            r4 = 2
            r15[r4] = r8     // Catch:{ SQLiteException -> 0x0277 }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r12.execSQL(r8, r15)     // Catch:{ SQLiteException -> 0x0277 }
            goto L_0x0297
        L_0x0277:
            r0 = move-exception
            goto L_0x0283
        L_0x0279:
            r0 = move-exception
            r33 = r4
            goto L_0x0282
        L_0x027d:
            r0 = move-exception
            r33 = r4
            r21 = r15
        L_0x0282:
            r4 = 2
        L_0x0283:
            r8 = r0
            com.google.android.gms.measurement.internal.l5 r11 = r11.f10651a     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.z3 r11 = r11.mo11935b()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.x3 r11 = r11.mo12544r()     // Catch:{ all -> 0x0a68 }
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r10)     // Catch:{ all -> 0x0a68 }
            r11.mo12478c(r12, r15, r8)     // Catch:{ all -> 0x0a68 }
        L_0x0297:
            com.google.android.gms.measurement.internal.ua r18 = new com.google.android.gms.measurement.internal.ua     // Catch:{ all -> 0x0a68 }
            java.lang.String r8 = r2.f11383p     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.common.util.e r11 = r34.mo11936c()     // Catch:{ all -> 0x0a68 }
            long r15 = r11.mo11730a()     // Catch:{ all -> 0x0a68 }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0a68 }
            r11 = r18
            r12 = r10
            r13 = r8
            r14 = r9
            r8 = r21
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0a68 }
            r9 = r18
        L_0x02b3:
            com.google.android.gms.measurement.internal.n r11 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r11)     // Catch:{ all -> 0x0a68 }
            boolean r11 = r11.mo12231x(r9)     // Catch:{ all -> 0x0a68 }
            if (r11 != 0) goto L_0x02f5
            com.google.android.gms.measurement.internal.z3 r11 = r34.mo11935b()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.x3 r11 = r11.mo12544r()     // Catch:{ all -> 0x0a68 }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r10)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l5 r14 = r1.f11166m     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.u3 r14 = r14.mo12152D()     // Catch:{ all -> 0x0a68 }
            java.lang.String r15 = r9.f11330c     // Catch:{ all -> 0x0a68 }
            java.lang.String r14 = r14.mo12440f(r15)     // Catch:{ all -> 0x0a68 }
            java.lang.Object r9 = r9.f11332e     // Catch:{ all -> 0x0a68 }
            r11.mo12479d(r12, r13, r14, r9)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.xa r11 = r34.mo12289h0()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.wa r12 = r1.f11154F     // Catch:{ all -> 0x0a68 }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo12485B(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a68 }
            goto L_0x02f5
        L_0x02ef:
            r33 = r4
            r8 = r21
            goto L_0x015c
        L_0x02f5:
            java.lang.String r9 = r2.f11381f     // Catch:{ all -> 0x0a68 }
            boolean r9 = com.google.android.gms.measurement.internal.C4105xa.m15395X(r9)     // Catch:{ all -> 0x0a68 }
            java.lang.String r11 = r2.f11381f     // Catch:{ all -> 0x0a68 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0a68 }
            r34.mo12289h0()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.v r11 = r2.f11382o     // Catch:{ all -> 0x0a68 }
            if (r11 != 0) goto L_0x030b
            r16 = 0
            goto L_0x032b
        L_0x030b:
            com.google.android.gms.measurement.internal.u r12 = new com.google.android.gms.measurement.internal.u     // Catch:{ all -> 0x0a68 }
            r12.<init>(r11)     // Catch:{ all -> 0x0a68 }
            r16 = 0
        L_0x0312:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0a68 }
            if (r13 == 0) goto L_0x032b
            java.lang.String r13 = r12.next()     // Catch:{ all -> 0x0a68 }
            java.lang.Object r13 = r11.mo12449G(r13)     // Catch:{ all -> 0x0a68 }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0a68 }
            if (r14 == 0) goto L_0x0312
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0a68 }
            int r13 = r13.length     // Catch:{ all -> 0x0a68 }
            long r13 = (long) r13     // Catch:{ all -> 0x0a68 }
            long r16 = r16 + r13
            goto L_0x0312
        L_0x032b:
            r22 = 1
            long r15 = r16 + r22
            com.google.android.gms.measurement.internal.n r11 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r11)     // Catch:{ all -> 0x0a68 }
            long r12 = r34.mo12272F()     // Catch:{ all -> 0x0a68 }
            r17 = 1
            r20 = 0
            r21 = 0
            r30 = r5
            r4 = 0
            r14 = r10
            r18 = r9
            r19 = r20
            r20 = r8
            com.google.android.gms.measurement.internal.l r11 = r11.mo12207U(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0a68 }
            long r12 = r11.f10874b     // Catch:{ all -> 0x0a68 }
            r34.mo12275U()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l3 r14 = com.google.android.gms.measurement.internal.C3966m3.f11008l     // Catch:{ all -> 0x0a68 }
            r15 = 0
            java.lang.Object r14 = r14.mo12145a(r15)     // Catch:{ all -> 0x0a68 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0a68 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0a68 }
            long r4 = (long) r14     // Catch:{ all -> 0x0a68 }
            long r12 = r12 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            r16 = 0
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x0396
            long r12 = r12 % r4
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0385
            com.google.android.gms.measurement.internal.z3 r2 = r34.mo11935b()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x0a68 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r10)     // Catch:{ all -> 0x0a68 }
            long r5 = r11.f10874b     // Catch:{ all -> 0x0a68 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a68 }
            r2.mo12478c(r3, r4, r5)     // Catch:{ all -> 0x0a68 }
        L_0x0385:
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r2)     // Catch:{ all -> 0x0a68 }
            r2.mo12222o()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d
            m15159R(r2)
            r2.mo12217f0()
            return
        L_0x0396:
            if (r9 == 0) goto L_0x03f4
            long r12 = r11.f10873a     // Catch:{ all -> 0x0a68 }
            r34.mo12275U()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l3 r14 = com.google.android.gms.measurement.internal.C3966m3.f11012n     // Catch:{ all -> 0x0a68 }
            java.lang.Object r14 = r14.mo12145a(r15)     // Catch:{ all -> 0x0a68 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0a68 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0a68 }
            long r4 = (long) r14     // Catch:{ all -> 0x0a68 }
            long r12 = r12 - r4
            r4 = 0
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x03f4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 % r4
            int r3 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x03cf
            com.google.android.gms.measurement.internal.z3 r3 = r34.mo11935b()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()     // Catch:{ all -> 0x0a68 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r10)     // Catch:{ all -> 0x0a68 }
            long r6 = r11.f10873a     // Catch:{ all -> 0x0a68 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0a68 }
            r3.mo12478c(r4, r5, r6)     // Catch:{ all -> 0x0a68 }
        L_0x03cf:
            com.google.android.gms.measurement.internal.xa r11 = r34.mo12289h0()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.wa r12 = r1.f11154F     // Catch:{ all -> 0x0a68 }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f11381f     // Catch:{ all -> 0x0a68 }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo12485B(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r2)     // Catch:{ all -> 0x0a68 }
            r2.mo12222o()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d
            m15159R(r2)
            r2.mo12217f0()
            return
        L_0x03f4:
            r4 = 1000000(0xf4240, float:1.401298E-39)
            if (r8 == 0) goto L_0x0444
            long r12 = r11.f10876d     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.h r5 = r34.mo12275U()     // Catch:{ all -> 0x0a68 }
            java.lang.String r8 = r3.f10593f     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l3 r14 = com.google.android.gms.measurement.internal.C3966m3.f11010m     // Catch:{ all -> 0x0a68 }
            int r5 = r5.mo12021o(r8, r14)     // Catch:{ all -> 0x0a68 }
            int r5 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x0a68 }
            r8 = 0
            int r5 = java.lang.Math.max(r8, r5)     // Catch:{ all -> 0x0a68 }
            long r4 = (long) r5     // Catch:{ all -> 0x0a68 }
            long r12 = r12 - r4
            r4 = 0
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x0444
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0433
            com.google.android.gms.measurement.internal.z3 r2 = r34.mo11935b()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x0a68 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r10)     // Catch:{ all -> 0x0a68 }
            long r5 = r11.f10876d     // Catch:{ all -> 0x0a68 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a68 }
            r2.mo12478c(r3, r4, r5)     // Catch:{ all -> 0x0a68 }
        L_0x0433:
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r2)     // Catch:{ all -> 0x0a68 }
            r2.mo12222o()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d
            m15159R(r2)
            r2.mo12217f0()
            return
        L_0x0444:
            com.google.android.gms.measurement.internal.v r4 = r2.f11382o     // Catch:{ all -> 0x0a68 }
            android.os.Bundle r4 = r4.mo12453r()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.xa r5 = r34.mo12289h0()     // Catch:{ all -> 0x0a68 }
            java.lang.String r11 = "_o"
            java.lang.String r12 = r2.f11383p     // Catch:{ all -> 0x0a68 }
            r5.mo12486C(r4, r11, r12)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.xa r5 = r34.mo12289h0()     // Catch:{ all -> 0x0a68 }
            boolean r5 = r5.mo12503T(r10)     // Catch:{ all -> 0x0a68 }
            java.lang.String r14 = "_r"
            if (r5 == 0) goto L_0x0475
            com.google.android.gms.measurement.internal.xa r5 = r34.mo12289h0()     // Catch:{ all -> 0x0a68 }
            java.lang.Long r11 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0a68 }
            java.lang.String r12 = "_dbg"
            r5.mo12486C(r4, r12, r11)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.xa r5 = r34.mo12289h0()     // Catch:{ all -> 0x0a68 }
            r5.mo12486C(r4, r14, r11)     // Catch:{ all -> 0x0a68 }
        L_0x0475:
            java.lang.String r5 = "_s"
            java.lang.String r11 = r2.f11381f     // Catch:{ all -> 0x0a68 }
            boolean r5 = r5.equals(r11)     // Catch:{ all -> 0x0a68 }
            if (r5 == 0) goto L_0x049b
            com.google.android.gms.measurement.internal.n r5 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r5)     // Catch:{ all -> 0x0a68 }
            java.lang.String r11 = r3.f10593f     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.ua r5 = r5.mo12209X(r11, r7)     // Catch:{ all -> 0x0a68 }
            if (r5 == 0) goto L_0x049b
            java.lang.Object r11 = r5.f11332e     // Catch:{ all -> 0x0a68 }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0a68 }
            if (r11 == 0) goto L_0x049b
            com.google.android.gms.measurement.internal.xa r11 = r34.mo12289h0()     // Catch:{ all -> 0x0a68 }
            java.lang.Object r5 = r5.f11332e     // Catch:{ all -> 0x0a68 }
            r11.mo12486C(r4, r7, r5)     // Catch:{ all -> 0x0a68 }
        L_0x049b:
            com.google.android.gms.measurement.internal.n r5 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r5)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.common.internal.C3705r.m14342g(r10)     // Catch:{ all -> 0x0a68 }
            r5.mo11931h()     // Catch:{ all -> 0x0a68 }
            r5.mo11893i()     // Catch:{ all -> 0x0a68 }
            android.database.sqlite.SQLiteDatabase r7 = r5.mo12202P()     // Catch:{ SQLiteException -> 0x04db }
            com.google.android.gms.measurement.internal.l5 r11 = r5.f10651a     // Catch:{ SQLiteException -> 0x04db }
            com.google.android.gms.measurement.internal.h r11 = r11.mo12181z()     // Catch:{ SQLiteException -> 0x04db }
            com.google.android.gms.measurement.internal.l3 r12 = com.google.android.gms.measurement.internal.C3966m3.f11018q     // Catch:{ SQLiteException -> 0x04db }
            int r11 = r11.mo12021o(r10, r12)     // Catch:{ SQLiteException -> 0x04db }
            r8 = 1000000(0xf4240, float:1.401298E-39)
            int r8 = java.lang.Math.min(r8, r11)     // Catch:{ SQLiteException -> 0x04db }
            r13 = 0
            int r8 = java.lang.Math.max(r13, r8)     // Catch:{ SQLiteException -> 0x04d9 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x04d9 }
            r11 = 2
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x04d9 }
            r11[r13] = r10     // Catch:{ SQLiteException -> 0x04d9 }
            r12 = 1
            r11[r12] = r8     // Catch:{ SQLiteException -> 0x04d9 }
            java.lang.String r8 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            int r5 = r7.delete(r6, r8, r11)     // Catch:{ SQLiteException -> 0x04d9 }
            long r7 = (long) r5
            goto L_0x04f3
        L_0x04d9:
            r0 = move-exception
            goto L_0x04dd
        L_0x04db:
            r0 = move-exception
            r13 = 0
        L_0x04dd:
            r7 = r0
            com.google.android.gms.measurement.internal.l5 r5 = r5.f10651a     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo11935b()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12544r()     // Catch:{ all -> 0x0a68 }
            java.lang.String r8 = "Error deleting over the limit events. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r10)     // Catch:{ all -> 0x0a68 }
            r5.mo12478c(r8, r11, r7)     // Catch:{ all -> 0x0a68 }
            r7 = 0
        L_0x04f3:
            r11 = 0
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x050e
            com.google.android.gms.measurement.internal.z3 r5 = r34.mo11935b()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12549w()     // Catch:{ all -> 0x0a68 }
            java.lang.String r11 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r10)     // Catch:{ all -> 0x0a68 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0a68 }
            r5.mo12478c(r11, r12, r7)     // Catch:{ all -> 0x0a68 }
        L_0x050e:
            com.google.android.gms.measurement.internal.s r5 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l5 r12 = r1.f11166m     // Catch:{ all -> 0x0a68 }
            java.lang.String r7 = r2.f11383p     // Catch:{ all -> 0x0a68 }
            java.lang.String r8 = r2.f11381f     // Catch:{ all -> 0x0a68 }
            long r2 = r2.f11384q     // Catch:{ all -> 0x0a68 }
            r18 = 0
            r11 = r5
            r31 = 0
            r13 = r7
            r7 = r14
            r14 = r10
            r32 = r6
            r6 = r15
            r15 = r8
            r16 = r2
            r20 = r4
            r11.<init>((com.google.android.gms.measurement.internal.C3955l5) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r2)     // Catch:{ all -> 0x0a68 }
            java.lang.String r3 = r5.f11254b     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo12208V(r10, r3)     // Catch:{ all -> 0x0a68 }
            if (r2 != 0) goto L_0x05b1
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r2)     // Catch:{ all -> 0x0a68 }
            long r2 = r2.mo12201O(r10)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.h r4 = r34.mo12275U()     // Catch:{ all -> 0x0a68 }
            int r4 = r4.mo12018l(r10)     // Catch:{ all -> 0x0a68 }
            long r11 = (long) r4     // Catch:{ all -> 0x0a68 }
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x0593
            if (r9 == 0) goto L_0x0593
            com.google.android.gms.measurement.internal.z3 r2 = r34.mo11935b()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x0a68 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r10)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l5 r6 = r1.f11166m     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo12152D()     // Catch:{ all -> 0x0a68 }
            java.lang.String r5 = r5.f11254b     // Catch:{ all -> 0x0a68 }
            java.lang.String r5 = r6.mo12438d(r5)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.h r6 = r34.mo12275U()     // Catch:{ all -> 0x0a68 }
            int r6 = r6.mo12018l(r10)     // Catch:{ all -> 0x0a68 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0a68 }
            r2.mo12479d(r3, r4, r5, r6)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.xa r11 = r34.mo12289h0()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.wa r12 = r1.f11154F     // Catch:{ all -> 0x0a68 }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo12485B(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d
            m15159R(r2)
            r2.mo12217f0()
            return
        L_0x0593:
            com.google.android.gms.measurement.internal.t r2 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x0a68 }
            java.lang.String r13 = r5.f11254b     // Catch:{ all -> 0x0a68 }
            long r3 = r5.f11256d     // Catch:{ all -> 0x0a68 }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r3
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0a68 }
            goto L_0x05bf
        L_0x05b1:
            com.google.android.gms.measurement.internal.l5 r3 = r1.f11166m     // Catch:{ all -> 0x0a68 }
            long r8 = r2.f11287f     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.s r5 = r5.mo12403a(r3, r8)     // Catch:{ all -> 0x0a68 }
            long r3 = r5.f11256d     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo12422c(r3)     // Catch:{ all -> 0x0a68 }
        L_0x05bf:
            com.google.android.gms.measurement.internal.n r3 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r3)     // Catch:{ all -> 0x0a68 }
            r3.mo12224q(r2)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.i5 r2 = r34.mo11934a()     // Catch:{ all -> 0x0a68 }
            r2.mo11931h()     // Catch:{ all -> 0x0a68 }
            r34.mo12286g()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.common.internal.C3705r.m14346k(r5)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.common.internal.C3705r.m14346k(r36)     // Catch:{ all -> 0x0a68 }
            java.lang.String r2 = r5.f11253a     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.common.internal.C3705r.m14342g(r2)     // Catch:{ all -> 0x0a68 }
            java.lang.String r2 = r5.f11253a     // Catch:{ all -> 0x0a68 }
            r3 = r36
            java.lang.String r4 = r3.f10593f     // Catch:{ all -> 0x0a68 }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.common.internal.C3705r.m14336a(r2)     // Catch:{ all -> 0x0a68 }
            e.f.a.c.f.g.u4 r2 = p174e.p319f.p320a.p335c.p345f.p352g.C7039v4.m26810L1()     // Catch:{ all -> 0x0a68 }
            r4 = 1
            r2.mo20264f0(r4)     // Catch:{ all -> 0x0a68 }
            java.lang.String r8 = "android"
            r2.mo20259Z(r8)     // Catch:{ all -> 0x0a68 }
            java.lang.String r8 = r3.f10593f     // Catch:{ all -> 0x0a68 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a68 }
            if (r8 != 0) goto L_0x0603
            java.lang.String r8 = r3.f10593f     // Catch:{ all -> 0x0a68 }
            r2.mo20284x(r8)     // Catch:{ all -> 0x0a68 }
        L_0x0603:
            java.lang.String r8 = r3.f10596q     // Catch:{ all -> 0x0a68 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a68 }
            if (r8 != 0) goto L_0x0610
            java.lang.String r8 = r3.f10596q     // Catch:{ all -> 0x0a68 }
            r2.mo20288z(r8)     // Catch:{ all -> 0x0a68 }
        L_0x0610:
            java.lang.String r8 = r3.f10595p     // Catch:{ all -> 0x0a68 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a68 }
            if (r8 != 0) goto L_0x061d
            java.lang.String r8 = r3.f10595p     // Catch:{ all -> 0x0a68 }
            r2.mo20219B(r8)     // Catch:{ all -> 0x0a68 }
        L_0x061d:
            p174e.p319f.p320a.p335c.p345f.p352g.C6825he.m25843b()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.h r8 = r34.mo12275U()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l3 r9 = com.google.android.gms.measurement.internal.C3966m3.f10951A0     // Catch:{ all -> 0x0a68 }
            boolean r8 = r8.mo12010B(r6, r9)     // Catch:{ all -> 0x0a68 }
            if (r8 == 0) goto L_0x0639
            java.lang.String r8 = r3.f10592K     // Catch:{ all -> 0x0a68 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a68 }
            if (r8 != 0) goto L_0x0639
            java.lang.String r8 = r3.f10592K     // Catch:{ all -> 0x0a68 }
            r2.mo20268k0(r8)     // Catch:{ all -> 0x0a68 }
        L_0x0639:
            long r8 = r3.f10602w     // Catch:{ all -> 0x0a68 }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0646
            int r9 = (int) r8     // Catch:{ all -> 0x0a68 }
            r2.mo20221C(r9)     // Catch:{ all -> 0x0a68 }
        L_0x0646:
            long r8 = r3.f10597r     // Catch:{ all -> 0x0a68 }
            r2.mo20252T(r8)     // Catch:{ all -> 0x0a68 }
            java.lang.String r8 = r3.f10594o     // Catch:{ all -> 0x0a68 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a68 }
            if (r8 != 0) goto L_0x0658
            java.lang.String r8 = r3.f10594o     // Catch:{ all -> 0x0a68 }
            r2.mo20250S(r8)     // Catch:{ all -> 0x0a68 }
        L_0x0658:
            java.lang.String r8 = r3.f10593f     // Catch:{ all -> 0x0a68 }
            java.lang.Object r8 = com.google.android.gms.common.internal.C3705r.m14346k(r8)     // Catch:{ all -> 0x0a68 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.j r8 = r1.mo12276V(r8)     // Catch:{ all -> 0x0a68 }
            java.lang.String r9 = r3.f10590I     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.j r9 = com.google.android.gms.measurement.internal.C3923j.m14935b(r9)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.j r8 = r8.mo12116c(r9)     // Catch:{ all -> 0x0a68 }
            java.lang.String r8 = r8.mo12121h()     // Catch:{ all -> 0x0a68 }
            r2.mo20230H(r8)     // Catch:{ all -> 0x0a68 }
            java.lang.String r8 = r2.mo20277t0()     // Catch:{ all -> 0x0a68 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0a68 }
            if (r8 == 0) goto L_0x068c
            java.lang.String r8 = r3.f10585D     // Catch:{ all -> 0x0a68 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a68 }
            if (r8 != 0) goto L_0x068c
            java.lang.String r8 = r3.f10585D     // Catch:{ all -> 0x0a68 }
            r2.mo20282w(r8)     // Catch:{ all -> 0x0a68 }
        L_0x068c:
            long r8 = r3.f10598s     // Catch:{ all -> 0x0a68 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0697
            r2.mo20233J(r8)     // Catch:{ all -> 0x0a68 }
        L_0x0697:
            long r8 = r3.f10587F     // Catch:{ all -> 0x0a68 }
            r2.mo20240N(r8)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.ra r8 = r1.f11161h     // Catch:{ all -> 0x0a68 }
            m15159R(r8)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.pa r9 = r8.f10552b     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l5 r9 = r9.f11166m     // Catch:{ all -> 0x0a68 }
            android.content.Context r9 = r9.mo11938f()     // Catch:{ all -> 0x0a68 }
            java.util.Map r9 = com.google.android.gms.measurement.internal.C3966m3.m15027c(r9)     // Catch:{ all -> 0x0a68 }
            if (r9 == 0) goto L_0x0733
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0a68 }
            if (r10 == 0) goto L_0x06b7
            goto L_0x0733
        L_0x06b7:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0a68 }
            r14.<init>()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l3 r10 = com.google.android.gms.measurement.internal.C3966m3.f10976Q     // Catch:{ all -> 0x0a68 }
            java.lang.Object r10 = r10.mo12145a(r6)     // Catch:{ all -> 0x0a68 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0a68 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0a68 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0a68 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0a68 }
        L_0x06d0:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0a68 }
            if (r11 == 0) goto L_0x072d
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0a68 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0a68 }
            java.lang.Object r12 = r11.getKey()     // Catch:{ all -> 0x0a68 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0a68 }
            java.lang.String r13 = "measurement.id."
            boolean r12 = r12.startsWith(r13)     // Catch:{ all -> 0x0a68 }
            if (r12 == 0) goto L_0x06d0
            java.lang.Object r11 = r11.getValue()     // Catch:{ NumberFormatException -> 0x071b }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x071b }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x071b }
            if (r11 == 0) goto L_0x06d0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x071b }
            r14.add(r11)     // Catch:{ NumberFormatException -> 0x071b }
            int r11 = r14.size()     // Catch:{ NumberFormatException -> 0x071b }
            if (r11 < r10) goto L_0x06d0
            com.google.android.gms.measurement.internal.l5 r11 = r8.f10651a     // Catch:{ NumberFormatException -> 0x071b }
            com.google.android.gms.measurement.internal.z3 r11 = r11.mo11935b()     // Catch:{ NumberFormatException -> 0x071b }
            com.google.android.gms.measurement.internal.x3 r11 = r11.mo12549w()     // Catch:{ NumberFormatException -> 0x071b }
            java.lang.String r12 = "Too many experiment IDs. Number of IDs"
            int r13 = r14.size()     // Catch:{ NumberFormatException -> 0x071b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x071b }
            r11.mo12477b(r12, r13)     // Catch:{ NumberFormatException -> 0x071b }
            goto L_0x072d
        L_0x071b:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.l5 r12 = r8.f10651a     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.z3 r12 = r12.mo11935b()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.x3 r12 = r12.mo12549w()     // Catch:{ all -> 0x0a68 }
            java.lang.String r13 = "Experiment ID NumberFormatException"
            r12.mo12477b(r13, r11)     // Catch:{ all -> 0x0a68 }
            goto L_0x06d0
        L_0x072d:
            boolean r8 = r14.isEmpty()     // Catch:{ all -> 0x0a68 }
            if (r8 == 0) goto L_0x0734
        L_0x0733:
            r14 = r6
        L_0x0734:
            if (r14 == 0) goto L_0x0739
            r2.mo20224D0(r14)     // Catch:{ all -> 0x0a68 }
        L_0x0739:
            java.lang.String r8 = r3.f10593f     // Catch:{ all -> 0x0a68 }
            java.lang.Object r8 = com.google.android.gms.common.internal.C3705r.m14346k(r8)     // Catch:{ all -> 0x0a68 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.j r8 = r1.mo12276V(r8)     // Catch:{ all -> 0x0a68 }
            java.lang.String r9 = r3.f10590I     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.j r9 = com.google.android.gms.measurement.internal.C3923j.m14935b(r9)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.j r8 = r8.mo12116c(r9)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.i r9 = com.google.android.gms.measurement.internal.C3910i.AD_STORAGE     // Catch:{ all -> 0x0a68 }
            boolean r10 = r8.mo12123i(r9)     // Catch:{ all -> 0x0a68 }
            if (r10 == 0) goto L_0x0791
            com.google.android.gms.measurement.internal.h r10 = r34.mo12275U()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l3 r11 = com.google.android.gms.measurement.internal.C3966m3.f11009l0     // Catch:{ all -> 0x0a68 }
            boolean r10 = r10.mo12010B(r6, r11)     // Catch:{ all -> 0x0a68 }
            if (r10 == 0) goto L_0x0767
            boolean r10 = r3.f10583B     // Catch:{ all -> 0x0a68 }
            if (r10 == 0) goto L_0x0791
        L_0x0767:
            com.google.android.gms.measurement.internal.j9 r10 = r1.f11163j     // Catch:{ all -> 0x0a68 }
            java.lang.String r11 = r3.f10593f     // Catch:{ all -> 0x0a68 }
            android.util.Pair r10 = r10.mo12132n(r11, r8)     // Catch:{ all -> 0x0a68 }
            java.lang.Object r11 = r10.first     // Catch:{ all -> 0x0a68 }
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ all -> 0x0a68 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0a68 }
            if (r11 != 0) goto L_0x0791
            boolean r11 = r3.f10583B     // Catch:{ all -> 0x0a68 }
            if (r11 == 0) goto L_0x0791
            java.lang.Object r11 = r10.first     // Catch:{ all -> 0x0a68 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0a68 }
            r2.mo20265g0(r11)     // Catch:{ all -> 0x0a68 }
            java.lang.Object r10 = r10.second     // Catch:{ all -> 0x0a68 }
            if (r10 == 0) goto L_0x0791
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0a68 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0a68 }
            r2.mo20256V(r10)     // Catch:{ all -> 0x0a68 }
        L_0x0791:
            com.google.android.gms.measurement.internal.l5 r10 = r1.f11166m     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.r r10 = r10.mo12149A()     // Catch:{ all -> 0x0a68 }
            r10.mo11959k()     // Catch:{ all -> 0x0a68 }
            java.lang.String r10 = android.os.Build.MODEL     // Catch:{ all -> 0x0a68 }
            r2.mo20235K(r10)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l5 r10 = r1.f11166m     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.r r10 = r10.mo12149A()     // Catch:{ all -> 0x0a68 }
            r10.mo11959k()     // Catch:{ all -> 0x0a68 }
            java.lang.String r10 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0a68 }
            r2.mo20258Y(r10)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l5 r10 = r1.f11166m     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.r r10 = r10.mo12149A()     // Catch:{ all -> 0x0a68 }
            long r10 = r10.mo12336p()     // Catch:{ all -> 0x0a68 }
            int r11 = (int) r10     // Catch:{ all -> 0x0a68 }
            r2.mo20270m0(r11)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l5 r10 = r1.f11166m     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.r r10 = r10.mo12149A()     // Catch:{ all -> 0x0a68 }
            java.lang.String r10 = r10.mo12337q()     // Catch:{ all -> 0x0a68 }
            r2.mo20274q0(r10)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l5 r10 = r1.f11166m     // Catch:{ all -> 0x0a68 }
            boolean r10 = r10.mo12174o()     // Catch:{ all -> 0x0a68 }
            if (r10 == 0) goto L_0x07dc
            r2.mo20276s0()     // Catch:{ all -> 0x0a68 }
            boolean r10 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a68 }
            if (r10 != 0) goto L_0x07dc
            r2.mo20238M(r6)     // Catch:{ all -> 0x0a68 }
        L_0x07dc:
            com.google.android.gms.measurement.internal.n r10 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r10)     // Catch:{ all -> 0x0a68 }
            java.lang.String r11 = r3.f10593f     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.h6 r10 = r10.mo12204R(r11)     // Catch:{ all -> 0x0a68 }
            if (r10 != 0) goto L_0x084c
            com.google.android.gms.measurement.internal.h6 r10 = new com.google.android.gms.measurement.internal.h6     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l5 r11 = r1.f11166m     // Catch:{ all -> 0x0a68 }
            java.lang.String r12 = r3.f10593f     // Catch:{ all -> 0x0a68 }
            r10.<init>(r11, r12)     // Catch:{ all -> 0x0a68 }
            java.lang.String r11 = r1.mo12291i0(r8)     // Catch:{ all -> 0x0a68 }
            r10.mo12076h(r11)     // Catch:{ all -> 0x0a68 }
            java.lang.String r11 = r3.f10603x     // Catch:{ all -> 0x0a68 }
            r10.mo12093v(r11)     // Catch:{ all -> 0x0a68 }
            java.lang.String r11 = r3.f10594o     // Catch:{ all -> 0x0a68 }
            r10.mo12094w(r11)     // Catch:{ all -> 0x0a68 }
            boolean r9 = r8.mo12123i(r9)     // Catch:{ all -> 0x0a68 }
            if (r9 == 0) goto L_0x0816
            com.google.android.gms.measurement.internal.j9 r9 = r1.f11163j     // Catch:{ all -> 0x0a68 }
            java.lang.String r11 = r3.f10593f     // Catch:{ all -> 0x0a68 }
            boolean r12 = r3.f10583B     // Catch:{ all -> 0x0a68 }
            java.lang.String r9 = r9.mo12133o(r11, r12)     // Catch:{ all -> 0x0a68 }
            r10.mo12041F(r9)     // Catch:{ all -> 0x0a68 }
        L_0x0816:
            r11 = 0
            r10.mo12037B(r11)     // Catch:{ all -> 0x0a68 }
            r10.mo12038C(r11)     // Catch:{ all -> 0x0a68 }
            r10.mo12097z(r11)     // Catch:{ all -> 0x0a68 }
            java.lang.String r9 = r3.f10595p     // Catch:{ all -> 0x0a68 }
            r10.mo12080j(r9)     // Catch:{ all -> 0x0a68 }
            long r11 = r3.f10602w     // Catch:{ all -> 0x0a68 }
            r10.mo12082k(r11)     // Catch:{ all -> 0x0a68 }
            java.lang.String r9 = r3.f10596q     // Catch:{ all -> 0x0a68 }
            r10.mo12078i(r9)     // Catch:{ all -> 0x0a68 }
            long r11 = r3.f10597r     // Catch:{ all -> 0x0a68 }
            r10.mo12095x(r11)     // Catch:{ all -> 0x0a68 }
            long r11 = r3.f10598s     // Catch:{ all -> 0x0a68 }
            r10.mo12090s(r11)     // Catch:{ all -> 0x0a68 }
            boolean r9 = r3.f10600u     // Catch:{ all -> 0x0a68 }
            r10.mo12039D(r9)     // Catch:{ all -> 0x0a68 }
            long r11 = r3.f10587F     // Catch:{ all -> 0x0a68 }
            r10.mo12091t(r11)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.n r9 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r9)     // Catch:{ all -> 0x0a68 }
            r9.mo12223p(r10)     // Catch:{ all -> 0x0a68 }
        L_0x084c:
            com.google.android.gms.measurement.internal.i r9 = com.google.android.gms.measurement.internal.C3910i.ANALYTICS_STORAGE     // Catch:{ all -> 0x0a68 }
            boolean r8 = r8.mo12123i(r9)     // Catch:{ all -> 0x0a68 }
            if (r8 == 0) goto L_0x086b
            java.lang.String r8 = r10.mo12071e0()     // Catch:{ all -> 0x0a68 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a68 }
            if (r8 != 0) goto L_0x086b
            java.lang.String r8 = r10.mo12071e0()     // Catch:{ all -> 0x0a68 }
            java.lang.Object r8 = com.google.android.gms.common.internal.C3705r.m14346k(r8)     // Catch:{ all -> 0x0a68 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a68 }
            r2.mo20286y(r8)     // Catch:{ all -> 0x0a68 }
        L_0x086b:
            java.lang.String r8 = r10.mo12077h0()     // Catch:{ all -> 0x0a68 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a68 }
            if (r8 != 0) goto L_0x0882
            java.lang.String r8 = r10.mo12077h0()     // Catch:{ all -> 0x0a68 }
            java.lang.Object r8 = com.google.android.gms.common.internal.C3705r.m14346k(r8)     // Catch:{ all -> 0x0a68 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a68 }
            r2.mo20248R(r8)     // Catch:{ all -> 0x0a68 }
        L_0x0882:
            com.google.android.gms.measurement.internal.n r8 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r8)     // Catch:{ all -> 0x0a68 }
            java.lang.String r3 = r3.f10593f     // Catch:{ all -> 0x0a68 }
            java.util.List r3 = r8.mo12214c0(r3)     // Catch:{ all -> 0x0a68 }
            r13 = 0
        L_0x088e:
            int r8 = r3.size()     // Catch:{ all -> 0x0a68 }
            if (r13 >= r8) goto L_0x08c4
            e.f.a.c.f.g.d5 r8 = p174e.p319f.p320a.p335c.p345f.p352g.C6766e5.m25622A()     // Catch:{ all -> 0x0a68 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.ua r9 = (com.google.android.gms.measurement.internal.C4069ua) r9     // Catch:{ all -> 0x0a68 }
            java.lang.String r9 = r9.f11330c     // Catch:{ all -> 0x0a68 }
            r8.mo19677z(r9)     // Catch:{ all -> 0x0a68 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.ua r9 = (com.google.android.gms.measurement.internal.C4069ua) r9     // Catch:{ all -> 0x0a68 }
            long r9 = r9.f11331d     // Catch:{ all -> 0x0a68 }
            r8.mo19670B(r9)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.ra r9 = r1.f11161h     // Catch:{ all -> 0x0a68 }
            m15159R(r9)     // Catch:{ all -> 0x0a68 }
            java.lang.Object r10 = r3.get(r13)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.ua r10 = (com.google.android.gms.measurement.internal.C4069ua) r10     // Catch:{ all -> 0x0a68 }
            java.lang.Object r10 = r10.f11332e     // Catch:{ all -> 0x0a68 }
            r9.mo12397K(r8, r10)     // Catch:{ all -> 0x0a68 }
            r2.mo20231H0(r8)     // Catch:{ all -> 0x0a68 }
            int r13 = r13 + 1
            goto L_0x088e
        L_0x08c4:
            com.google.android.gms.measurement.internal.n r3 = r1.f11157d     // Catch:{ IOException -> 0x0a1e }
            m15159R(r3)     // Catch:{ IOException -> 0x0a1e }
            e.f.a.c.f.g.a9 r8 = r2.mo20436r()     // Catch:{ IOException -> 0x0a1e }
            e.f.a.c.f.g.v4 r8 = (p174e.p319f.p320a.p335c.p345f.p352g.C7039v4) r8     // Catch:{ IOException -> 0x0a1e }
            r3.mo11931h()     // Catch:{ IOException -> 0x0a1e }
            r3.mo11893i()     // Catch:{ IOException -> 0x0a1e }
            com.google.android.gms.common.internal.C3705r.m14346k(r8)     // Catch:{ IOException -> 0x0a1e }
            java.lang.String r9 = r8.mo20346P1()     // Catch:{ IOException -> 0x0a1e }
            com.google.android.gms.common.internal.C3705r.m14342g(r9)     // Catch:{ IOException -> 0x0a1e }
            byte[] r9 = r8.mo19840k()     // Catch:{ IOException -> 0x0a1e }
            com.google.android.gms.measurement.internal.pa r10 = r3.f10552b     // Catch:{ IOException -> 0x0a1e }
            com.google.android.gms.measurement.internal.ra r10 = r10.f11161h     // Catch:{ IOException -> 0x0a1e }
            m15159R(r10)     // Catch:{ IOException -> 0x0a1e }
            long r10 = r10.mo12400x(r9)     // Catch:{ IOException -> 0x0a1e }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ IOException -> 0x0a1e }
            r12.<init>()     // Catch:{ IOException -> 0x0a1e }
            java.lang.String r13 = r8.mo20346P1()     // Catch:{ IOException -> 0x0a1e }
            r14 = r30
            r12.put(r14, r13)     // Catch:{ IOException -> 0x0a1e }
            java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x0a1e }
            r15 = r33
            r12.put(r15, r13)     // Catch:{ IOException -> 0x0a1e }
            java.lang.String r13 = "metadata"
            r12.put(r13, r9)     // Catch:{ IOException -> 0x0a1e }
            android.database.sqlite.SQLiteDatabase r9 = r3.mo12202P()     // Catch:{ SQLiteException -> 0x0a04 }
            java.lang.String r13 = "raw_events_metadata"
            r4 = 4
            r9.insertWithOnConflict(r13, r6, r12, r4)     // Catch:{ SQLiteException -> 0x0a04 }
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r2)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.v r3 = r5.f11258f     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.u r4 = new com.google.android.gms.measurement.internal.u     // Catch:{ all -> 0x0a68 }
            r4.<init>(r3)     // Catch:{ all -> 0x0a68 }
        L_0x0920:
            boolean r3 = r4.hasNext()     // Catch:{ all -> 0x0a68 }
            if (r3 == 0) goto L_0x0932
            java.lang.String r3 = r4.next()     // Catch:{ all -> 0x0a68 }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x0a68 }
            if (r3 == 0) goto L_0x0920
        L_0x0930:
            r13 = 1
            goto L_0x0973
        L_0x0932:
            com.google.android.gms.measurement.internal.c5 r3 = r1.f11155b     // Catch:{ all -> 0x0a68 }
            m15159R(r3)     // Catch:{ all -> 0x0a68 }
            java.lang.String r4 = r5.f11253a     // Catch:{ all -> 0x0a68 }
            java.lang.String r7 = r5.f11254b     // Catch:{ all -> 0x0a68 }
            boolean r3 = r3.mo11871E(r4, r7)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.n r4 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r4)     // Catch:{ all -> 0x0a68 }
            long r17 = r34.mo12272F()     // Catch:{ all -> 0x0a68 }
            java.lang.String r7 = r5.f11253a     // Catch:{ all -> 0x0a68 }
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r16 = r4
            r19 = r7
            com.google.android.gms.measurement.internal.l r4 = r16.mo12206T(r17, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0a68 }
            if (r3 == 0) goto L_0x0972
            long r3 = r4.f10877e     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.h r7 = r34.mo12275U()     // Catch:{ all -> 0x0a68 }
            java.lang.String r8 = r5.f11253a     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.l3 r9 = com.google.android.gms.measurement.internal.C3966m3.f11016p     // Catch:{ all -> 0x0a68 }
            int r7 = r7.mo12021o(r8, r9)     // Catch:{ all -> 0x0a68 }
            long r7 = (long) r7     // Catch:{ all -> 0x0a68 }
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0972
            goto L_0x0930
        L_0x0972:
            r13 = 0
        L_0x0973:
            r2.mo11931h()     // Catch:{ all -> 0x0a68 }
            r2.mo11893i()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.common.internal.C3705r.m14346k(r5)     // Catch:{ all -> 0x0a68 }
            java.lang.String r3 = r5.f11253a     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.common.internal.C3705r.m14342g(r3)     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.pa r3 = r2.f10552b     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.ra r3 = r3.f11161h     // Catch:{ all -> 0x0a68 }
            m15159R(r3)     // Catch:{ all -> 0x0a68 }
            e.f.a.c.f.g.k4 r3 = r3.mo12390B(r5)     // Catch:{ all -> 0x0a68 }
            byte[] r3 = r3.mo19840k()     // Catch:{ all -> 0x0a68 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0a68 }
            r4.<init>()     // Catch:{ all -> 0x0a68 }
            java.lang.String r7 = r5.f11253a     // Catch:{ all -> 0x0a68 }
            r4.put(r14, r7)     // Catch:{ all -> 0x0a68 }
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.f11254b     // Catch:{ all -> 0x0a68 }
            r4.put(r7, r8)     // Catch:{ all -> 0x0a68 }
            java.lang.String r7 = "timestamp"
            long r8 = r5.f11256d     // Catch:{ all -> 0x0a68 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0a68 }
            r4.put(r7, r8)     // Catch:{ all -> 0x0a68 }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0a68 }
            r4.put(r15, r7)     // Catch:{ all -> 0x0a68 }
            java.lang.String r7 = "data"
            r4.put(r7, r3)     // Catch:{ all -> 0x0a68 }
            java.lang.String r3 = "realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0a68 }
            r4.put(r3, r7)     // Catch:{ all -> 0x0a68 }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo12202P()     // Catch:{ SQLiteException -> 0x09ec }
            r7 = r32
            long r3 = r3.insert(r7, r6, r4)     // Catch:{ SQLiteException -> 0x09ec }
            r6 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x09e7
            com.google.android.gms.measurement.internal.l5 r3 = r2.f10651a     // Catch:{ SQLiteException -> 0x09ec }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()     // Catch:{ SQLiteException -> 0x09ec }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()     // Catch:{ SQLiteException -> 0x09ec }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r6 = r5.f11253a     // Catch:{ SQLiteException -> 0x09ec }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r6)     // Catch:{ SQLiteException -> 0x09ec }
            r3.mo12477b(r4, r6)     // Catch:{ SQLiteException -> 0x09ec }
            goto L_0x0a35
        L_0x09e7:
            r3 = 0
            r1.f11169p = r3     // Catch:{ all -> 0x0a68 }
            goto L_0x0a35
        L_0x09ec:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x0a68 }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r5.f11253a     // Catch:{ all -> 0x0a68 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r5)     // Catch:{ all -> 0x0a68 }
            r2.mo12478c(r4, r5, r3)     // Catch:{ all -> 0x0a68 }
            goto L_0x0a35
        L_0x0a04:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.l5 r3 = r3.f10651a     // Catch:{ IOException -> 0x0a1e }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()     // Catch:{ IOException -> 0x0a1e }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()     // Catch:{ IOException -> 0x0a1e }
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r6 = r8.mo20346P1()     // Catch:{ IOException -> 0x0a1e }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r6)     // Catch:{ IOException -> 0x0a1e }
            r3.mo12478c(r5, r6, r4)     // Catch:{ IOException -> 0x0a1e }
            throw r4     // Catch:{ IOException -> 0x0a1e }
        L_0x0a1e:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.z3 r4 = r34.mo11935b()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12544r()     // Catch:{ all -> 0x0a68 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo20276s0()     // Catch:{ all -> 0x0a68 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r2)     // Catch:{ all -> 0x0a68 }
            r4.mo12478c(r5, r2, r3)     // Catch:{ all -> 0x0a68 }
        L_0x0a35:
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d     // Catch:{ all -> 0x0a68 }
            m15159R(r2)     // Catch:{ all -> 0x0a68 }
            r2.mo12222o()     // Catch:{ all -> 0x0a68 }
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d
            m15159R(r2)
            r2.mo12217f0()
            r34.m15154M()
            com.google.android.gms.measurement.internal.z3 r2 = r34.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12548v()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo12477b(r4, r3)
            return
        L_0x0a68:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.n r3 = r1.f11157d
            m15159R(r3)
            r3.mo12217f0()
            throw r2
        L_0x0a73:
            r1.mo12273S(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4009pa.mo12270D(com.google.android.gms.measurement.internal.x, com.google.android.gms.measurement.internal.cb):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final boolean mo12271E() {
        String str;
        C4098x3 x3Var;
        mo11934a().mo11931h();
        FileLock fileLock = this.f11176w;
        if (fileLock == null || !fileLock.isValid()) {
            this.f11157d.f10651a.mo12181z();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f11166m.mo11938f().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f11177x = channel;
                FileLock tryLock = channel.tryLock();
                this.f11176w = tryLock;
                if (tryLock != null) {
                    mo11935b().mo12548v().mo12476a("Storage concurrent access okay");
                    return true;
                }
                mo11935b().mo12544r().mo12476a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                e = e;
                x3Var = mo11935b().mo12544r();
                str = "Failed to acquire storage lock";
                x3Var.mo12477b(str, e);
                return false;
            } catch (IOException e2) {
                e = e2;
                x3Var = mo11935b().mo12544r();
                str = "Failed to access storage lock file";
                x3Var.mo12477b(str, e);
                return false;
            } catch (OverlappingFileLockException e3) {
                e = e3;
                x3Var = mo11935b().mo12549w();
                str = "Storage lock already acquired";
                x3Var.mo12477b(str, e);
                return false;
            }
        } else {
            mo11935b().mo12548v().mo12476a("Storage concurrent access okay");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final long mo12272F() {
        long a = mo11936c().mo11730a();
        C3933j9 j9Var = this.f11163j;
        j9Var.mo11893i();
        j9Var.mo11931h();
        long a2 = j9Var.f10838i.mo12147a();
        if (a2 == 0) {
            a2 = ((long) j9Var.f10651a.mo12161N().mo12523u().nextInt(86400000)) + 1;
            j9Var.f10838i.mo12148b(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final C3904h6 mo12273S(C3844cb cbVar) {
        mo11934a().mo11931h();
        mo12286g();
        C3705r.m14346k(cbVar);
        C3705r.m14342g(cbVar.f10593f);
        C6724be.m25469b();
        if (mo12275U().mo12010B(cbVar.f10593f, C3966m3.f10955C0) && !cbVar.f10591J.isEmpty()) {
            this.f11151C.put(cbVar.f10593f, new C3997oa(this, cbVar.f10591J));
        }
        C3974n nVar = this.f11157d;
        m15159R(nVar);
        C3904h6 R = nVar.mo12204R(cbVar.f10593f);
        C3923j c = mo12276V(cbVar.f10593f).mo12116c(C3923j.m14935b(cbVar.f10590I));
        C3910i iVar = C3910i.AD_STORAGE;
        String o = c.mo12123i(iVar) ? this.f11163j.mo12133o(cbVar.f10593f, cbVar.f10583B) : HttpUrl.FRAGMENT_ENCODE_SET;
        if (R == null) {
            R = new C3904h6(this.f11166m, cbVar.f10593f);
            if (c.mo12123i(C3910i.ANALYTICS_STORAGE)) {
                R.mo12076h(mo12291i0(c));
            }
            if (c.mo12123i(iVar)) {
                R.mo12041F(o);
            }
        } else if (c.mo12123i(iVar) && o != null && !o.equals(R.mo12062a())) {
            R.mo12041F(o);
            if ((!mo12275U().mo12010B((String) null, C3966m3.f11009l0) || cbVar.f10583B) && !"00000000-0000-0000-0000-000000000000".equals(this.f11163j.mo12132n(cbVar.f10593f, c).first)) {
                R.mo12076h(mo12291i0(c));
                C3974n nVar2 = this.f11157d;
                m15159R(nVar2);
                if (nVar2.mo12209X(cbVar.f10593f, "_id") != null) {
                    C3974n nVar3 = this.f11157d;
                    m15159R(nVar3);
                    if (nVar3.mo12209X(cbVar.f10593f, "_lair") == null) {
                        C4069ua uaVar = new C4069ua(cbVar.f10593f, "auto", "_lair", mo11936c().mo11730a(), 1L);
                        C3974n nVar4 = this.f11157d;
                        m15159R(nVar4);
                        nVar4.mo12231x(uaVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(R.mo12071e0()) && c.mo12123i(C3910i.ANALYTICS_STORAGE)) {
            R.mo12076h(mo12291i0(c));
        }
        R.mo12094w(cbVar.f10594o);
        R.mo12072f(cbVar.f10585D);
        if (!TextUtils.isEmpty(cbVar.f10603x)) {
            R.mo12093v(cbVar.f10603x);
        }
        long j = cbVar.f10597r;
        if (j != 0) {
            R.mo12095x(j);
        }
        if (!TextUtils.isEmpty(cbVar.f10595p)) {
            R.mo12080j(cbVar.f10595p);
        }
        R.mo12082k(cbVar.f10602w);
        String str = cbVar.f10596q;
        if (str != null) {
            R.mo12078i(str);
        }
        R.mo12090s(cbVar.f10598s);
        R.mo12039D(cbVar.f10600u);
        if (!TextUtils.isEmpty(cbVar.f10599t)) {
            R.mo12096y(cbVar.f10599t);
        }
        R.mo12074g(cbVar.f10583B);
        R.mo12040E(cbVar.f10586E);
        R.mo12091t(cbVar.f10587F);
        C6825he.m25843b();
        if (mo12275U().mo12010B((String) null, C3966m3.f10951A0)) {
            R.mo12043H(cbVar.f10592K);
        }
        C7047vc.m26943b();
        if (mo12275U().mo12010B((String) null, C3966m3.f11023s0)) {
            R.mo12042G(cbVar.f10588G);
        } else {
            C7047vc.m26943b();
            if (mo12275U().mo12010B((String) null, C3966m3.f11021r0)) {
                R.mo12042G((List) null);
            }
        }
        if (R.mo12046K()) {
            C3974n nVar5 = this.f11157d;
            m15159R(nVar5);
            nVar5.mo12223p(R);
        }
        return R;
    }

    /* renamed from: T */
    public final C3819b mo12274T() {
        C3819b bVar = this.f11160g;
        m15159R(bVar);
        return bVar;
    }

    /* renamed from: U */
    public final C3897h mo12275U() {
        return ((C3955l5) C3705r.m14346k(this.f11166m)).mo12181z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final C3923j mo12276V(String str) {
        String str2;
        C3923j jVar = C3923j.f10811a;
        mo11934a().mo11931h();
        mo12286g();
        C3923j jVar2 = (C3923j) this.f11150B.get(str);
        if (jVar2 != null) {
            return jVar2;
        }
        C3974n nVar = this.f11157d;
        m15159R(nVar);
        C3705r.m14346k(str);
        nVar.mo11931h();
        nVar.mo11893i();
        Cursor cursor = null;
        try {
            Cursor rawQuery = nVar.mo12202P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            C3923j b = C3923j.m14935b(str2);
            mo12267A(str, b);
            return b;
        } catch (SQLiteException e) {
            nVar.f10651a.mo11935b().mo12544r().mo12478c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: W */
    public final C3974n mo12277W() {
        C3974n nVar = this.f11157d;
        m15159R(nVar);
        return nVar;
    }

    /* renamed from: X */
    public final C4062u3 mo12278X() {
        return this.f11166m.mo12152D();
    }

    /* renamed from: Y */
    public final C3889g4 mo12279Y() {
        C3889g4 g4Var = this.f11156c;
        m15159R(g4Var);
        return g4Var;
    }

    /* renamed from: Z */
    public final C3915i4 mo12280Z() {
        C3915i4 i4Var = this.f11158e;
        if (i4Var != null) {
            return i4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: a */
    public final C3916i5 mo11934a() {
        return ((C3955l5) C3705r.m14346k(this.f11166m)).mo11934a();
    }

    /* renamed from: a0 */
    public final C3838c5 mo12281a0() {
        C3838c5 c5Var = this.f11155b;
        m15159R(c5Var);
        return c5Var;
    }

    /* renamed from: b */
    public final C4122z3 mo11935b() {
        return ((C3955l5) C3705r.m14346k(this.f11166m)).mo11935b();
    }

    /* renamed from: c */
    public final C3758e mo11936c() {
        return ((C3955l5) C3705r.m14346k(this.f11166m)).mo11936c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final C3955l5 mo12282c0() {
        return this.f11166m;
    }

    /* renamed from: d */
    public final C3832c mo11937d() {
        throw null;
    }

    /* renamed from: d0 */
    public final C4090w7 mo12283d0() {
        C4090w7 w7Var = this.f11162i;
        m15159R(w7Var);
        return w7Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo12284e() {
        C4098x3 r;
        Integer valueOf;
        Integer valueOf2;
        String str;
        mo11934a().mo11931h();
        mo12286g();
        if (!this.f11168o) {
            this.f11168o = true;
            if (mo12271E()) {
                FileChannel fileChannel = this.f11177x;
                mo11934a().mo11931h();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    mo11935b().mo12544r().mo12476a("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            mo11935b().mo12549w().mo12477b("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e) {
                        mo11935b().mo12544r().mo12477b("Failed to read from channel", e);
                    }
                }
                int p = this.f11166m.mo12150B().mo12316p();
                mo11934a().mo11931h();
                if (i > p) {
                    r = mo11935b().mo12544r();
                    valueOf = Integer.valueOf(i);
                    valueOf2 = Integer.valueOf(p);
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (i < p) {
                    FileChannel fileChannel2 = this.f11177x;
                    mo11934a().mo11931h();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        mo11935b().mo12544r().mo12476a("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(p);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                mo11935b().mo12544r().mo12477b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            r = mo11935b().mo12548v();
                            valueOf = Integer.valueOf(i);
                            valueOf2 = Integer.valueOf(p);
                            str = "Storage version upgraded. Previous, current version";
                        } catch (IOException e2) {
                            mo11935b().mo12544r().mo12477b("Failed to write to channel", e2);
                        }
                    }
                    r = mo11935b().mo12544r();
                    valueOf = Integer.valueOf(i);
                    valueOf2 = Integer.valueOf(p);
                    str = "Storage version upgrade failed. Previous, current version";
                } else {
                    return;
                }
                r.mo12478c(str, valueOf, valueOf2);
            }
        }
    }

    /* renamed from: e0 */
    public final C3933j9 mo12285e0() {
        return this.f11163j;
    }

    /* renamed from: f */
    public final Context mo11938f() {
        return this.f11166m.mo11938f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo12286g() {
        if (!this.f11167n) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: g0 */
    public final C4033ra mo12287g0() {
        C4033ra raVar = this.f11161h;
        m15159R(raVar);
        return raVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo12288h(String str, C7023u4 u4Var) {
        int w;
        int indexOf;
        C6724be.m25469b();
        if (mo12275U().mo12010B(str, C3966m3.f11029v0)) {
            C3838c5 c5Var = this.f11155b;
            m15159R(c5Var);
            Set y = c5Var.mo11887y(str);
            if (y != null) {
                u4Var.mo20225E0(y);
            }
        }
        if (mo12275U().mo12010B(str, C3966m3.f11033x0)) {
            C3838c5 c5Var2 = this.f11155b;
            m15159R(c5Var2);
            if (c5Var2.mo11876J(str)) {
                u4Var.mo20237L0();
            }
            C3838c5 c5Var3 = this.f11155b;
            m15159R(c5Var3);
            if (c5Var3.mo11879M(str)) {
                if (mo12275U().mo12010B(str, C3966m3.f10965H0)) {
                    String u0 = u4Var.mo20279u0();
                    if (!TextUtils.isEmpty(u0) && (indexOf = u0.indexOf(".")) != -1) {
                        u4Var.mo20258Y(u0.substring(0, indexOf));
                    }
                } else {
                    u4Var.mo20247Q0();
                }
            }
        }
        if (mo12275U().mo12010B(str, C3966m3.f11035y0)) {
            C3838c5 c5Var4 = this.f11155b;
            m15159R(c5Var4);
            if (c5Var4.mo11880N(str) && (w = C4033ra.m15297w(u4Var, "_id")) != -1) {
                u4Var.mo20280v(w);
            }
        }
        if (mo12275U().mo12010B(str, C3966m3.f11037z0)) {
            C3838c5 c5Var5 = this.f11155b;
            m15159R(c5Var5);
            if (c5Var5.mo11878L(str)) {
                u4Var.mo20239M0();
            }
        }
        if (mo12275U().mo12010B(str, C3966m3.f10955C0)) {
            C3838c5 c5Var6 = this.f11155b;
            m15159R(c5Var6);
            if (c5Var6.mo11875I(str)) {
                u4Var.mo20234J0();
                if (mo12275U().mo12010B(str, C3966m3.f10957D0)) {
                    C3997oa oaVar = (C3997oa) this.f11151C.get(str);
                    if (oaVar == null || oaVar.f11101b + mo12275U().mo12024r(str, C3966m3.f10979T) < mo11936c().mo11731b()) {
                        oaVar = new C3997oa(this);
                        this.f11151C.put(str, oaVar);
                    }
                    u4Var.mo20244P(oaVar.f11100a);
                }
            }
        }
        if (mo12275U().mo12010B(str, C3966m3.f10959E0)) {
            C3838c5 c5Var7 = this.f11155b;
            m15159R(c5Var7);
            if (c5Var7.mo11877K(str)) {
                u4Var.mo20255U0();
            }
        }
    }

    /* renamed from: h0 */
    public final C4105xa mo12289h0() {
        return ((C3955l5) C3705r.m14346k(this.f11166m)).mo12161N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo12290i(C3904h6 h6Var) {
        C1788a aVar;
        C1788a aVar2;
        mo11934a().mo11931h();
        if (!TextUtils.isEmpty(h6Var.mo12079i0()) || !TextUtils.isEmpty(h6Var.mo12065b0())) {
            C3856da daVar = this.f11164k;
            Uri.Builder builder = new Uri.Builder();
            String i0 = h6Var.mo12079i0();
            if (TextUtils.isEmpty(i0)) {
                i0 = h6Var.mo12065b0();
            }
            C1788a aVar3 = null;
            Uri.Builder appendQueryParameter = builder.scheme((String) C3966m3.f10996f.mo12145a((Object) null)).encodedAuthority((String) C3966m3.f10998g.mo12145a((Object) null)).path("config/app/".concat(String.valueOf(i0))).appendQueryParameter("platform", "android");
            daVar.f10651a.mo12181z().mo12023q();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(68000)).appendQueryParameter("runtime_version", "0");
            C6724be.m25469b();
            if (!daVar.f10651a.mo12181z().mo12010B(h6Var.mo12069d0(), C3966m3.f11025t0)) {
                builder.appendQueryParameter("app_instance_id", h6Var.mo12071e0());
            }
            String uri = builder.build().toString();
            try {
                String str = (String) C3705r.m14346k(h6Var.mo12069d0());
                URL url = new URL(uri);
                mo11935b().mo12548v().mo12477b("Fetching remote configuration", str);
                C3838c5 c5Var = this.f11155b;
                m15159R(c5Var);
                C7054w3 t = c5Var.mo11883t(str);
                C3838c5 c5Var2 = this.f11155b;
                m15159R(c5Var2);
                String v = c5Var2.mo11885v(str);
                if (t != null) {
                    if (!TextUtils.isEmpty(v)) {
                        aVar2 = new C1788a();
                        aVar2.put("If-Modified-Since", v);
                    } else {
                        aVar2 = null;
                    }
                    C6724be.m25469b();
                    if (mo12275U().mo12010B((String) null, C3966m3.f10961F0)) {
                        C3838c5 c5Var3 = this.f11155b;
                        m15159R(c5Var3);
                        String u = c5Var3.mo11884u(str);
                        if (!TextUtils.isEmpty(u)) {
                            if (aVar2 == null) {
                                aVar2 = new C1788a();
                            }
                            aVar3 = aVar2;
                            aVar3.put("If-None-Match", u);
                        }
                    }
                    aVar = aVar2;
                    this.f11173t = true;
                    C3889g4 g4Var = this.f11156c;
                    m15159R(g4Var);
                    C3895ga gaVar = new C3895ga(this);
                    g4Var.mo11931h();
                    g4Var.mo11893i();
                    C3705r.m14346k(url);
                    C3705r.m14346k(gaVar);
                    g4Var.f10651a.mo11934a().mo12109y(new C3863e4(g4Var, str, url, (byte[]) null, aVar, gaVar));
                }
                aVar = aVar3;
                this.f11173t = true;
                C3889g4 g4Var2 = this.f11156c;
                m15159R(g4Var2);
                C3895ga gaVar2 = new C3895ga(this);
                g4Var2.mo11931h();
                g4Var2.mo11893i();
                C3705r.m14346k(url);
                C3705r.m14346k(gaVar2);
                g4Var2.f10651a.mo11934a().mo12109y(new C3863e4(g4Var2, str, url, (byte[]) null, aVar, gaVar2));
            } catch (MalformedURLException unused) {
                mo11935b().mo12544r().mo12478c("Failed to parse config URL. Not fetching. appId", C4122z3.m15469z(h6Var.mo12069d0()), uri);
            }
        } else {
            mo12298n((String) C3705r.m14346k(h6Var.mo12069d0()), 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final String mo12291i0(C3923j jVar) {
        if (!jVar.mo12123i(C3910i.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        mo12289h0().mo12523u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo12292j(C4094x xVar, C3844cb cbVar) {
        C4094x xVar2;
        List<C3845d> list;
        List<C3845d> list2;
        List<C3845d> list3;
        C4098x3 r;
        String str;
        Object z;
        String f;
        Object obj;
        String str2;
        C3844cb cbVar2 = cbVar;
        C3705r.m14346k(cbVar);
        C3705r.m14342g(cbVar2.f10593f);
        mo11934a().mo11931h();
        mo12286g();
        String str3 = cbVar2.f10593f;
        C4094x xVar3 = xVar;
        long j = xVar3.f11384q;
        C6775ee.m25666b();
        C4114y7 y7Var = null;
        if (mo12275U().mo12010B((String) null, C3966m3.f11011m0)) {
            C3811a4 b = C3811a4.m14622b(xVar);
            mo11934a().mo11931h();
            if (!(this.f11152D == null || (str2 = this.f11153E) == null || !str2.equals(str3))) {
                y7Var = this.f11152D;
            }
            C4105xa.m15408y(y7Var, b.f10508d, false);
            xVar3 = b.mo11846a();
        }
        m15159R(this.f11161h);
        if (C4033ra.m15287m(xVar3, cbVar2)) {
            if (!cbVar2.f10600u) {
                mo12273S(cbVar2);
                return;
            }
            List list4 = cbVar2.f10588G;
            if (list4 == null) {
                xVar2 = xVar3;
            } else if (list4.contains(xVar3.f11381f)) {
                Bundle r2 = xVar3.f11382o.mo12453r();
                r2.putLong("ga_safelisted", 1);
                xVar2 = new C4094x(xVar3.f11381f, new C4070v(r2), xVar3.f11383p, xVar3.f11384q);
            } else {
                mo11935b().mo12543q().mo12479d("Dropping non-safelisted event. appId, event name, origin", str3, xVar3.f11381f, xVar3.f11383p);
                return;
            }
            C3974n nVar = this.f11157d;
            m15159R(nVar);
            nVar.mo12216e0();
            try {
                C3974n nVar2 = this.f11157d;
                m15159R(nVar2);
                C3705r.m14342g(str3);
                nVar2.mo11931h();
                nVar2.mo11893i();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    nVar2.f10651a.mo11935b().mo12549w().mo12478c("Invalid time querying timed out conditional properties", C4122z3.m15469z(str3), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = nVar2.mo12213b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str3, String.valueOf(j)});
                }
                for (C3845d dVar : list) {
                    if (dVar != null) {
                        mo11935b().mo12548v().mo12479d("User property timed out", dVar.f10606f, this.f11166m.mo12152D().mo12440f(dVar.f10608p.f11276o), dVar.f10608p.mo12418o());
                        C4094x xVar4 = dVar.f10612t;
                        if (xVar4 != null) {
                            mo12270D(new C4094x(xVar4, j), cbVar2);
                        }
                        C3974n nVar3 = this.f11157d;
                        m15159R(nVar3);
                        nVar3.mo12197J(str3, dVar.f10608p.f11276o);
                    }
                }
                C3974n nVar4 = this.f11157d;
                m15159R(nVar4);
                C3705r.m14342g(str3);
                nVar4.mo11931h();
                nVar4.mo11893i();
                if (i < 0) {
                    nVar4.f10651a.mo11935b().mo12549w().mo12478c("Invalid time querying expired conditional properties", C4122z3.m15469z(str3), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = nVar4.mo12213b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str3, String.valueOf(j)});
                }
                ArrayList<C4094x> arrayList = new ArrayList<>(list2.size());
                for (C3845d dVar2 : list2) {
                    if (dVar2 != null) {
                        mo11935b().mo12548v().mo12479d("User property expired", dVar2.f10606f, this.f11166m.mo12152D().mo12440f(dVar2.f10608p.f11276o), dVar2.f10608p.mo12418o());
                        C3974n nVar5 = this.f11157d;
                        m15159R(nVar5);
                        nVar5.mo12220m(str3, dVar2.f10608p.f11276o);
                        C4094x xVar5 = dVar2.f10616x;
                        if (xVar5 != null) {
                            arrayList.add(xVar5);
                        }
                        C3974n nVar6 = this.f11157d;
                        m15159R(nVar6);
                        nVar6.mo12197J(str3, dVar2.f10608p.f11276o);
                    }
                }
                for (C4094x xVar6 : arrayList) {
                    mo12270D(new C4094x(xVar6, j), cbVar2);
                }
                C3974n nVar7 = this.f11157d;
                m15159R(nVar7);
                String str4 = xVar2.f11381f;
                C3705r.m14342g(str3);
                C3705r.m14342g(str4);
                nVar7.mo11931h();
                nVar7.mo11893i();
                if (i < 0) {
                    nVar7.f10651a.mo11935b().mo12549w().mo12479d("Invalid time querying triggered conditional properties", C4122z3.m15469z(str3), nVar7.f10651a.mo12152D().mo12438d(str4), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = nVar7.mo12213b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str3, str4, String.valueOf(j)});
                }
                ArrayList<C4094x> arrayList2 = new ArrayList<>(list3.size());
                for (C3845d dVar3 : list3) {
                    if (dVar3 != null) {
                        C4045sa saVar = dVar3.f10608p;
                        C4069ua uaVar = new C4069ua((String) C3705r.m14346k(dVar3.f10606f), dVar3.f10607o, saVar.f11276o, j, C3705r.m14346k(saVar.mo12418o()));
                        C3974n nVar8 = this.f11157d;
                        m15159R(nVar8);
                        if (nVar8.mo12231x(uaVar)) {
                            r = mo11935b().mo12548v();
                            str = "User property triggered";
                            z = dVar3.f10606f;
                            f = this.f11166m.mo12152D().mo12440f(uaVar.f11330c);
                            obj = uaVar.f11332e;
                        } else {
                            r = mo11935b().mo12544r();
                            str = "Too many active user properties, ignoring";
                            z = C4122z3.m15469z(dVar3.f10606f);
                            f = this.f11166m.mo12152D().mo12440f(uaVar.f11330c);
                            obj = uaVar.f11332e;
                        }
                        r.mo12479d(str, z, f, obj);
                        C4094x xVar7 = dVar3.f10614v;
                        if (xVar7 != null) {
                            arrayList2.add(xVar7);
                        }
                        dVar3.f10608p = new C4045sa(uaVar);
                        dVar3.f10610r = true;
                        C3974n nVar9 = this.f11157d;
                        m15159R(nVar9);
                        nVar9.mo12230w(dVar3);
                    }
                }
                mo12270D(xVar2, cbVar2);
                for (C4094x xVar8 : arrayList2) {
                    mo12270D(new C4094x(xVar8, j), cbVar2);
                }
                C3974n nVar10 = this.f11157d;
                m15159R(nVar10);
                nVar10.mo12222o();
            } finally {
                C3974n nVar11 = this.f11157d;
                m15159R(nVar11);
                nVar11.mo12217f0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final String mo12293j0(C3844cb cbVar) {
        try {
            return (String) mo11934a().mo12107s(new C3908ha(this, cbVar)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo11935b().mo12544r().mo12478c("Failed to get app instance id. appId", C4122z3.m15469z(cbVar.f10593f), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo12294k(C4094x xVar, String str) {
        C4094x xVar2 = xVar;
        String str2 = str;
        C3974n nVar = this.f11157d;
        m15159R(nVar);
        C3904h6 R = nVar.mo12204R(str2);
        if (R == null || TextUtils.isEmpty(R.mo12075g0())) {
            mo11935b().mo12543q().mo12477b("No app data available; dropping event", str2);
            return;
        }
        Boolean J = m15151J(R);
        if (J == null) {
            if (!"_ui".equals(xVar2.f11381f)) {
                mo11935b().mo12549w().mo12477b("Could not find package. appId", C4122z3.m15469z(str));
            }
        } else if (!J.booleanValue()) {
            mo11935b().mo12544r().mo12477b("App version does not match; dropping event. appId", C4122z3.m15469z(str));
            return;
        }
        String i0 = R.mo12079i0();
        String g0 = R.mo12075g0();
        long L = R.mo12047L();
        String f0 = R.mo12073f0();
        long W = R.mo12058W();
        long T = R.mo12055T();
        boolean J2 = R.mo12045J();
        String h0 = R.mo12077h0();
        R.mo12036A();
        C3844cb cbVar = r2;
        C3904h6 h6Var = R;
        C3844cb cbVar2 = new C3844cb(str, i0, g0, L, f0, W, T, (String) null, J2, false, h0, 0, 0, 0, h6Var.mo12044I(), false, h6Var.mo12065b0(), h6Var.mo12063a0(), h6Var.mo12056U(), h6Var.mo12066c(), (String) null, mo12276V(str2).mo12121h(), HttpUrl.FRAGMENT_ENCODE_SET, (String) null);
        mo12295l(xVar2, cbVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo12295l(C4094x xVar, C3844cb cbVar) {
        C3705r.m14342g(cbVar.f10593f);
        C3811a4 b = C3811a4.m14622b(xVar);
        C4105xa h0 = mo12289h0();
        Bundle bundle = b.f10508d;
        C3974n nVar = this.f11157d;
        m15159R(nVar);
        h0.mo12529z(bundle, nVar.mo12203Q(cbVar.f10593f));
        mo12289h0().mo12484A(b, mo12275U().mo12020n(cbVar.f10593f));
        C4094x a = b.mo11846a();
        if ("_cmp".equals(a.f11381f) && "referrer API v2".equals(a.f11382o.mo12450H("_cis"))) {
            String H = a.f11382o.mo12450H("gclid");
            if (!TextUtils.isEmpty(H)) {
                mo12268B(new C4045sa("_lgclid", a.f11384q, H, "auto"), cbVar);
            }
        }
        mo12292j(a, cbVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final void mo12296l0(Runnable runnable) {
        mo11934a().mo11931h();
        if (this.f11170q == null) {
            this.f11170q = new ArrayList();
        }
        this.f11170q.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo12297m() {
        this.f11172s++;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[Catch:{ all -> 0x0193, all -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[Catch:{ all -> 0x0193, all -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0105 A[Catch:{ all -> 0x0193, all -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012c A[Catch:{ all -> 0x0193, all -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0152 A[Catch:{ all -> 0x0193, all -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0160 A[Catch:{ all -> 0x0193, all -> 0x019d }] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12298n(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.i5 r0 = r8.mo11934a()
            r0.mo11931h()
            r8.mo12286g()
            com.google.android.gms.common.internal.C3705r.m14342g(r9)
            r0 = 0
            if (r12 != 0) goto L_0x0012
            byte[] r12 = new byte[r0]     // Catch:{ all -> 0x019d }
        L_0x0012:
            com.google.android.gms.measurement.internal.z3 r1 = r8.mo11935b()     // Catch:{ all -> 0x019d }
            com.google.android.gms.measurement.internal.x3 r1 = r1.mo12548v()     // Catch:{ all -> 0x019d }
            int r2 = r12.length     // Catch:{ all -> 0x019d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x019d }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.mo12477b(r3, r2)     // Catch:{ all -> 0x019d }
            com.google.android.gms.measurement.internal.n r1 = r8.f11157d     // Catch:{ all -> 0x019d }
            m15159R(r1)     // Catch:{ all -> 0x019d }
            r1.mo12216e0()     // Catch:{ all -> 0x019d }
            com.google.android.gms.measurement.internal.n r1 = r8.f11157d     // Catch:{ all -> 0x0193 }
            m15159R(r1)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.h6 r1 = r1.mo12204R(r9)     // Catch:{ all -> 0x0193 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r10 == r3) goto L_0x0043
            r3 = 204(0xcc, float:2.86E-43)
            if (r10 == r3) goto L_0x0043
            if (r10 != r4) goto L_0x0047
            r10 = 304(0x130, float:4.26E-43)
        L_0x0043:
            if (r11 != 0) goto L_0x0047
            r3 = 1
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            if (r1 != 0) goto L_0x005d
            com.google.android.gms.measurement.internal.z3 r10 = r8.mo11935b()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.x3 r10 = r10.mo12549w()     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r9)     // Catch:{ all -> 0x0193 }
            r10.mo12477b(r11, r9)     // Catch:{ all -> 0x0193 }
            goto L_0x0185
        L_0x005d:
            r5 = 404(0x194, float:5.66E-43)
            if (r3 != 0) goto L_0x00bb
            if (r10 != r5) goto L_0x0064
            goto L_0x00bb
        L_0x0064:
            com.google.android.gms.common.util.e r12 = r8.mo11936c()     // Catch:{ all -> 0x0193 }
            long r12 = r12.mo11730a()     // Catch:{ all -> 0x0193 }
            r1.mo12092u(r12)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.n r12 = r8.f11157d     // Catch:{ all -> 0x0193 }
            m15159R(r12)     // Catch:{ all -> 0x0193 }
            r12.mo12223p(r1)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.z3 r12 = r8.mo11935b()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.x3 r12 = r12.mo12548v()     // Catch:{ all -> 0x0193 }
            java.lang.String r13 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0193 }
            r12.mo12478c(r13, r1, r11)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.c5 r11 = r8.f11155b     // Catch:{ all -> 0x0193 }
            m15159R(r11)     // Catch:{ all -> 0x0193 }
            r11.mo11888z(r9)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.j9 r9 = r8.f11163j     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.l4 r9 = r9.f10837h     // Catch:{ all -> 0x0193 }
            com.google.android.gms.common.util.e r11 = r8.mo11936c()     // Catch:{ all -> 0x0193 }
            long r11 = r11.mo11730a()     // Catch:{ all -> 0x0193 }
            r9.mo12148b(r11)     // Catch:{ all -> 0x0193 }
            r9 = 503(0x1f7, float:7.05E-43)
            if (r10 == r9) goto L_0x00a7
            r9 = 429(0x1ad, float:6.01E-43)
            if (r10 != r9) goto L_0x00b6
        L_0x00a7:
            com.google.android.gms.measurement.internal.j9 r9 = r8.f11163j     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.l4 r9 = r9.f10835f     // Catch:{ all -> 0x0193 }
            com.google.android.gms.common.util.e r10 = r8.mo11936c()     // Catch:{ all -> 0x0193 }
            long r10 = r10.mo11730a()     // Catch:{ all -> 0x0193 }
            r9.mo12148b(r10)     // Catch:{ all -> 0x0193 }
        L_0x00b6:
            r8.m15154M()     // Catch:{ all -> 0x0193 }
            goto L_0x0185
        L_0x00bb:
            r11 = 0
            if (r13 == 0) goto L_0x00c7
            java.lang.String r3 = "Last-Modified"
            java.lang.Object r3 = r13.get(r3)     // Catch:{ all -> 0x0193 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0193 }
            goto L_0x00c8
        L_0x00c7:
            r3 = r11
        L_0x00c8:
            if (r3 == 0) goto L_0x00d7
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x0193 }
            if (r6 != 0) goto L_0x00d7
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0193 }
            goto L_0x00d8
        L_0x00d7:
            r3 = r11
        L_0x00d8:
            p174e.p319f.p320a.p335c.p345f.p352g.C6724be.m25469b()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.h r6 = r8.mo12275U()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.l3 r7 = com.google.android.gms.measurement.internal.C3966m3.f10961F0     // Catch:{ all -> 0x0193 }
            boolean r6 = r6.mo12010B(r11, r7)     // Catch:{ all -> 0x0193 }
            if (r6 == 0) goto L_0x0102
            if (r13 == 0) goto L_0x00f2
            java.lang.String r6 = "ETag"
            java.lang.Object r13 = r13.get(r6)     // Catch:{ all -> 0x0193 }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x0193 }
            goto L_0x00f3
        L_0x00f2:
            r13 = r11
        L_0x00f3:
            if (r13 == 0) goto L_0x0102
            boolean r6 = r13.isEmpty()     // Catch:{ all -> 0x0193 }
            if (r6 != 0) goto L_0x0102
            java.lang.Object r13 = r13.get(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0193 }
            goto L_0x0103
        L_0x0102:
            r13 = r11
        L_0x0103:
            if (r10 == r5) goto L_0x0121
            if (r10 != r4) goto L_0x0108
            goto L_0x0121
        L_0x0108:
            com.google.android.gms.measurement.internal.c5 r11 = r8.f11155b     // Catch:{ all -> 0x0193 }
            m15159R(r11)     // Catch:{ all -> 0x0193 }
            boolean r11 = r11.mo11874H(r9, r12, r3, r13)     // Catch:{ all -> 0x0193 }
            if (r11 != 0) goto L_0x013d
            com.google.android.gms.measurement.internal.n r9 = r8.f11157d     // Catch:{ all -> 0x019d }
            m15159R(r9)     // Catch:{ all -> 0x019d }
        L_0x0118:
            r9.mo12217f0()     // Catch:{ all -> 0x019d }
            r8.f11173t = r0
            r8.m15152K()
            return
        L_0x0121:
            com.google.android.gms.measurement.internal.c5 r12 = r8.f11155b     // Catch:{ all -> 0x0193 }
            m15159R(r12)     // Catch:{ all -> 0x0193 }
            e.f.a.c.f.g.w3 r12 = r12.mo11883t(r9)     // Catch:{ all -> 0x0193 }
            if (r12 != 0) goto L_0x013d
            com.google.android.gms.measurement.internal.c5 r12 = r8.f11155b     // Catch:{ all -> 0x0193 }
            m15159R(r12)     // Catch:{ all -> 0x0193 }
            boolean r11 = r12.mo11874H(r9, r11, r11, r11)     // Catch:{ all -> 0x0193 }
            if (r11 != 0) goto L_0x013d
            com.google.android.gms.measurement.internal.n r9 = r8.f11157d     // Catch:{ all -> 0x019d }
            m15159R(r9)     // Catch:{ all -> 0x019d }
            goto L_0x0118
        L_0x013d:
            com.google.android.gms.common.util.e r11 = r8.mo11936c()     // Catch:{ all -> 0x0193 }
            long r11 = r11.mo11730a()     // Catch:{ all -> 0x0193 }
            r1.mo12083l(r11)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.n r11 = r8.f11157d     // Catch:{ all -> 0x0193 }
            m15159R(r11)     // Catch:{ all -> 0x0193 }
            r11.mo12223p(r1)     // Catch:{ all -> 0x0193 }
            if (r10 != r5) goto L_0x0160
            com.google.android.gms.measurement.internal.z3 r10 = r8.mo11935b()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.x3 r10 = r10.mo12550x()     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = "Config not found. Using empty config. appId"
            r10.mo12477b(r11, r9)     // Catch:{ all -> 0x0193 }
            goto L_0x0171
        L_0x0160:
            com.google.android.gms.measurement.internal.z3 r9 = r8.mo11935b()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.x3 r9 = r9.mo12548v()     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0193 }
            r9.mo12478c(r11, r10, r2)     // Catch:{ all -> 0x0193 }
        L_0x0171:
            com.google.android.gms.measurement.internal.g4 r9 = r8.f11156c     // Catch:{ all -> 0x0193 }
            m15159R(r9)     // Catch:{ all -> 0x0193 }
            boolean r9 = r9.mo11970m()     // Catch:{ all -> 0x0193 }
            if (r9 == 0) goto L_0x00b6
            boolean r9 = r8.m15156O()     // Catch:{ all -> 0x0193 }
            if (r9 == 0) goto L_0x00b6
            r8.mo12269C()     // Catch:{ all -> 0x0193 }
        L_0x0185:
            com.google.android.gms.measurement.internal.n r9 = r8.f11157d     // Catch:{ all -> 0x0193 }
            m15159R(r9)     // Catch:{ all -> 0x0193 }
            r9.mo12222o()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.n r9 = r8.f11157d     // Catch:{ all -> 0x019d }
            m15159R(r9)     // Catch:{ all -> 0x019d }
            goto L_0x0118
        L_0x0193:
            r9 = move-exception
            com.google.android.gms.measurement.internal.n r10 = r8.f11157d     // Catch:{ all -> 0x019d }
            m15159R(r10)     // Catch:{ all -> 0x019d }
            r10.mo12217f0()     // Catch:{ all -> 0x019d }
            throw r9     // Catch:{ all -> 0x019d }
        L_0x019d:
            r9 = move-exception
            r8.f11173t = r0
            r8.m15152K()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4009pa.mo12298n(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo12299o(boolean z) {
        m15154M();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo12300p(int i, Throwable th, byte[] bArr, String str) {
        C3974n nVar;
        mo11934a().mo11931h();
        mo12286g();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f11174u = false;
                m15152K();
                throw th2;
            }
        }
        List<Long> list = (List) C3705r.m14346k(this.f11178y);
        this.f11178y = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            mo11935b().mo12548v().mo12478c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f11163j.f10837h.mo12148b(mo11936c().mo11730a());
            if (i == 503 || i == 429) {
                this.f11163j.f10835f.mo12148b(mo11936c().mo11730a());
            }
            C3974n nVar2 = this.f11157d;
            m15159R(nVar2);
            nVar2.mo12218g0(list);
            m15154M();
            this.f11174u = false;
            m15152K();
        }
        if (th == null) {
            try {
                this.f11163j.f10836g.mo12148b(mo11936c().mo11730a());
                this.f11163j.f10837h.mo12148b(0);
                m15154M();
                mo11935b().mo12548v().mo12478c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                C3974n nVar3 = this.f11157d;
                m15159R(nVar3);
                nVar3.mo12216e0();
                try {
                    for (Long l : list) {
                        try {
                            nVar = this.f11157d;
                            m15159R(nVar);
                            long longValue = l.longValue();
                            nVar.mo11931h();
                            nVar.mo11893i();
                            if (nVar.mo12202P().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            nVar.f10651a.mo11935b().mo12544r().mo12477b("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            List list2 = this.f11179z;
                            if (list2 == null || !list2.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    C3974n nVar4 = this.f11157d;
                    m15159R(nVar4);
                    nVar4.mo12222o();
                    C3974n nVar5 = this.f11157d;
                    m15159R(nVar5);
                    nVar5.mo12217f0();
                    this.f11179z = null;
                    C3889g4 g4Var = this.f11156c;
                    m15159R(g4Var);
                    if (!g4Var.mo11970m() || !m15156O()) {
                        this.f11149A = -1;
                        m15154M();
                    } else {
                        mo12269C();
                    }
                    this.f11169p = 0;
                } catch (Throwable th3) {
                    C3974n nVar6 = this.f11157d;
                    m15159R(nVar6);
                    nVar6.mo12217f0();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                mo11935b().mo12544r().mo12477b("Database error while trying to delete uploaded bundles", e3);
                this.f11169p = mo11936c().mo11731b();
                mo11935b().mo12548v().mo12477b("Disable upload, time", Long.valueOf(this.f11169p));
            }
            this.f11174u = false;
            m15152K();
        }
        mo11935b().mo12548v().mo12478c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.f11163j.f10837h.mo12148b(mo11936c().mo11730a());
        this.f11163j.f10835f.mo12148b(mo11936c().mo11730a());
        C3974n nVar22 = this.f11157d;
        m15159R(nVar22);
        nVar22.mo12218g0(list);
        m15154M();
        this.f11174u = false;
        m15152K();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03c2 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03ee A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0405 A[SYNTHETIC, Splitter:B:129:0x0405] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04c9 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x052d A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b9 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e4 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021a A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0239 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x023f A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x024e A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025e A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12301q(com.google.android.gms.measurement.internal.C3844cb r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            com.google.android.gms.measurement.internal.i5 r8 = r23.mo11934a()
            r8.mo11931h()
            r23.mo12286g()
            com.google.android.gms.common.internal.C3705r.m14346k(r24)
            java.lang.String r8 = r2.f10593f
            com.google.android.gms.common.internal.C3705r.m14342g(r8)
            boolean r8 = m15158Q(r24)
            if (r8 == 0) goto L_0x0563
            com.google.android.gms.measurement.internal.n r8 = r1.f11157d
            m15159R(r8)
            java.lang.String r9 = r2.f10593f
            com.google.android.gms.measurement.internal.h6 r8 = r8.mo12204R(r9)
            r9 = 0
            if (r8 == 0) goto L_0x005e
            java.lang.String r11 = r8.mo12079i0()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x005e
            java.lang.String r11 = r2.f10594o
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x005e
            r8.mo12083l(r9)
            com.google.android.gms.measurement.internal.n r11 = r1.f11157d
            m15159R(r11)
            r11.mo12223p(r8)
            com.google.android.gms.measurement.internal.c5 r8 = r1.f11155b
            m15159R(r8)
            java.lang.String r11 = r2.f10593f
            r8.mo11867A(r11)
        L_0x005e:
            boolean r8 = r2.f10600u
            if (r8 != 0) goto L_0x0066
            r23.mo12273S(r24)
            return
        L_0x0066:
            long r11 = r2.f10605z
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0074
            com.google.android.gms.common.util.e r8 = r23.mo11936c()
            long r11 = r8.mo11730a()
        L_0x0074:
            com.google.android.gms.measurement.internal.l5 r8 = r1.f11166m
            com.google.android.gms.measurement.internal.r r8 = r8.mo12149A()
            r8.mo12338r()
            int r8 = r2.f10582A
            r15 = 1
            if (r8 == 0) goto L_0x009c
            if (r8 == r15) goto L_0x009c
            com.google.android.gms.measurement.internal.z3 r13 = r23.mo11935b()
            com.google.android.gms.measurement.internal.x3 r13 = r13.mo12549w()
            java.lang.String r14 = r2.f10593f
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r14)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Incorrect app type, assuming installed app. appId, appType"
            r13.mo12478c(r9, r14, r8)
            r8 = 0
        L_0x009c:
            com.google.android.gms.measurement.internal.n r9 = r1.f11157d
            m15159R(r9)
            r9.mo12216e0()
            com.google.android.gms.measurement.internal.n r9 = r1.f11157d     // Catch:{ all -> 0x0559 }
            m15159R(r9)     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = r2.f10593f     // Catch:{ all -> 0x0559 }
            java.lang.String r13 = "_npa"
            com.google.android.gms.measurement.internal.ua r9 = r9.mo12209X(r10, r13)     // Catch:{ all -> 0x0559 }
            if (r9 == 0) goto L_0x00c5
            java.lang.String r10 = "auto"
            java.lang.String r13 = r9.f11329b     // Catch:{ all -> 0x0559 }
            boolean r10 = r10.equals(r13)     // Catch:{ all -> 0x0559 }
            if (r10 == 0) goto L_0x00be
            goto L_0x00c5
        L_0x00be:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            goto L_0x0119
        L_0x00c5:
            java.lang.Boolean r10 = r2.f10586E     // Catch:{ all -> 0x0559 }
            if (r10 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.sa r10 = new com.google.android.gms.measurement.internal.sa     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_npa"
            java.lang.Boolean r13 = r2.f10586E     // Catch:{ all -> 0x0559 }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x0559 }
            if (r15 == r13) goto L_0x00d8
            r19 = 0
            goto L_0x00da
        L_0x00d8:
            r19 = 1
        L_0x00da:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0559 }
            java.lang.String r20 = "auto"
            r21 = r3
            r22 = r4
            r3 = 1
            r13 = r10
            r3 = 0
            r4 = 1
            r15 = r11
            r17 = r19
            r18 = r20
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0559 }
            if (r9 == 0) goto L_0x00fd
            java.lang.Object r9 = r9.f11332e     // Catch:{ all -> 0x0559 }
            java.lang.Long r13 = r10.f11278q     // Catch:{ all -> 0x0559 }
            boolean r9 = r9.equals(r13)     // Catch:{ all -> 0x0559 }
            if (r9 != 0) goto L_0x0119
        L_0x00fd:
            r1.mo12268B(r10, r2)     // Catch:{ all -> 0x0559 }
            goto L_0x0119
        L_0x0101:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            if (r9 == 0) goto L_0x0119
            com.google.android.gms.measurement.internal.sa r9 = new com.google.android.gms.measurement.internal.sa     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_npa"
            r17 = 0
            java.lang.String r18 = "auto"
            r13 = r9
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0559 }
            r1.mo12305u(r9, r2)     // Catch:{ all -> 0x0559 }
        L_0x0119:
            com.google.android.gms.measurement.internal.n r9 = r1.f11157d     // Catch:{ all -> 0x0559 }
            m15159R(r9)     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = r2.f10593f     // Catch:{ all -> 0x0559 }
            java.lang.Object r10 = com.google.android.gms.common.internal.C3705r.m14346k(r10)     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.h6 r9 = r9.mo12204R(r10)     // Catch:{ all -> 0x0559 }
            if (r9 == 0) goto L_0x01e2
            com.google.android.gms.measurement.internal.xa r13 = r23.mo12289h0()     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = r2.f10594o     // Catch:{ all -> 0x0559 }
            java.lang.String r15 = r9.mo12079i0()     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = r2.f10585D     // Catch:{ all -> 0x0559 }
            java.lang.String r3 = r9.mo12065b0()     // Catch:{ all -> 0x0559 }
            boolean r3 = r13.mo12506b0(r14, r15, r10, r3)     // Catch:{ all -> 0x0559 }
            if (r3 == 0) goto L_0x01e2
            com.google.android.gms.measurement.internal.z3 r3 = r23.mo11935b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12549w()     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r9.mo12069d0()     // Catch:{ all -> 0x0559 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r13)     // Catch:{ all -> 0x0559 }
            r3.mo12477b(r10, r13)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.n r3 = r1.f11157d     // Catch:{ all -> 0x0559 }
            m15159R(r3)     // Catch:{ all -> 0x0559 }
            java.lang.String r9 = r9.mo12069d0()     // Catch:{ all -> 0x0559 }
            r3.mo11893i()     // Catch:{ all -> 0x0559 }
            r3.mo11931h()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.common.internal.C3705r.m14342g(r9)     // Catch:{ all -> 0x0559 }
            android.database.sqlite.SQLiteDatabase r10 = r3.mo12202P()     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String[] r13 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01cd }
            r14 = 0
            r13[r14] = r9     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r14 = "events"
            int r14 = r10.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x01e1
            com.google.android.gms.measurement.internal.l5 r0 = r3.f10651a     // Catch:{ SQLiteException -> 0x01cd }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ SQLiteException -> 0x01cd }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12548v()     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r10 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01cd }
            r0.mo12478c(r10, r9, r13)     // Catch:{ SQLiteException -> 0x01cd }
            goto L_0x01e1
        L_0x01cd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l5 r3 = r3.f10651a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = "Error deleting application data. appId, error"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r9)     // Catch:{ all -> 0x0559 }
            r3.mo12478c(r10, r9, r0)     // Catch:{ all -> 0x0559 }
        L_0x01e1:
            r9 = 0
        L_0x01e2:
            if (r9 == 0) goto L_0x0239
            long r13 = r9.mo12047L()     // Catch:{ all -> 0x0559 }
            r15 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01fc
            long r13 = r9.mo12047L()     // Catch:{ all -> 0x0559 }
            r3 = r5
            long r4 = r2.f10602w     // Catch:{ all -> 0x0559 }
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01fd
            r0 = 1
            goto L_0x01fe
        L_0x01fc:
            r3 = r5
        L_0x01fd:
            r0 = 0
        L_0x01fe:
            java.lang.String r4 = r9.mo12075g0()     // Catch:{ all -> 0x0559 }
            long r13 = r9.mo12047L()     // Catch:{ all -> 0x0559 }
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x0216
            if (r4 == 0) goto L_0x0216
            java.lang.String r5 = r2.f10595p     // Catch:{ all -> 0x0559 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0559 }
            if (r5 != 0) goto L_0x0216
            r15 = 1
            goto L_0x0217
        L_0x0216:
            r15 = 0
        L_0x0217:
            r0 = r0 | r15
            if (r0 == 0) goto L_0x023a
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0559 }
            r0.<init>()     // Catch:{ all -> 0x0559 }
            java.lang.String r5 = "_pv"
            r0.putString(r5, r4)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.x r4 = new com.google.android.gms.measurement.internal.x     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.v r15 = new com.google.android.gms.measurement.internal.v     // Catch:{ all -> 0x0559 }
            r15.<init>(r0)     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_au"
            java.lang.String r16 = "auto"
            r13 = r4
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0559 }
            r1.mo12292j(r4, r2)     // Catch:{ all -> 0x0559 }
            goto L_0x023a
        L_0x0239:
            r3 = r5
        L_0x023a:
            r23.mo12273S(r24)     // Catch:{ all -> 0x0559 }
            if (r8 != 0) goto L_0x024e
            com.google.android.gms.measurement.internal.n r0 = r1.f11157d     // Catch:{ all -> 0x0559 }
            m15159R(r0)     // Catch:{ all -> 0x0559 }
            java.lang.String r4 = r2.f10593f     // Catch:{ all -> 0x0559 }
            java.lang.String r5 = "_f"
            com.google.android.gms.measurement.internal.t r0 = r0.mo12208V(r4, r5)     // Catch:{ all -> 0x0559 }
            r15 = 0
            goto L_0x025c
        L_0x024e:
            com.google.android.gms.measurement.internal.n r0 = r1.f11157d     // Catch:{ all -> 0x0559 }
            m15159R(r0)     // Catch:{ all -> 0x0559 }
            java.lang.String r4 = r2.f10593f     // Catch:{ all -> 0x0559 }
            java.lang.String r5 = "_v"
            com.google.android.gms.measurement.internal.t r0 = r0.mo12208V(r4, r5)     // Catch:{ all -> 0x0559 }
            r15 = 1
        L_0x025c:
            if (r0 != 0) goto L_0x052d
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r11 / r4
            r13 = 1
            long r8 = r8 + r13
            long r8 = r8 * r4
            java.lang.String r4 = "_dac"
            java.lang.String r5 = "_et"
            java.lang.String r14 = "_r"
            java.lang.String r13 = "_c"
            if (r15 != 0) goto L_0x04e3
            com.google.android.gms.measurement.internal.sa r0 = new com.google.android.gms.measurement.internal.sa     // Catch:{ all -> 0x0559 }
            java.lang.String r15 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0559 }
            java.lang.String r18 = "auto"
            r8 = r13
            r13 = r0
            r9 = r14
            r14 = r15
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0559 }
            r1.mo12268B(r0, r2)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.i5 r0 = r23.mo11934a()     // Catch:{ all -> 0x0559 }
            r0.mo11931h()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.s4 r0 = r1.f11165l     // Catch:{ all -> 0x0559 }
            java.lang.Object r0 = com.google.android.gms.common.internal.C3705r.m14346k(r0)     // Catch:{ all -> 0x0559 }
            r13 = r0
            com.google.android.gms.measurement.internal.s4 r13 = (com.google.android.gms.measurement.internal.C4039s4) r13     // Catch:{ all -> 0x0559 }
            java.lang.String r0 = r2.f10593f     // Catch:{ all -> 0x0559 }
            if (r0 == 0) goto L_0x0382
            boolean r14 = r0.isEmpty()     // Catch:{ all -> 0x0559 }
            if (r14 == 0) goto L_0x02a3
            goto L_0x0382
        L_0x02a3:
            com.google.android.gms.measurement.internal.l5 r14 = r13.f11264a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.i5 r14 = r14.mo11934a()     // Catch:{ all -> 0x0559 }
            r14.mo11931h()     // Catch:{ all -> 0x0559 }
            boolean r14 = r13.mo12414a()     // Catch:{ all -> 0x0559 }
            if (r14 != 0) goto L_0x02c3
            com.google.android.gms.measurement.internal.l5 r0 = r13.f11264a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12547u()     // Catch:{ all -> 0x0559 }
            java.lang.String r3 = "Install Referrer Reporter is not available"
        L_0x02be:
            r0.mo12476a(r3)     // Catch:{ all -> 0x0559 }
            goto L_0x0390
        L_0x02c3:
            com.google.android.gms.measurement.internal.r4 r14 = new com.google.android.gms.measurement.internal.r4     // Catch:{ all -> 0x0559 }
            r14.<init>(r13, r0)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.l5 r0 = r13.f11264a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.i5 r0 = r0.mo11934a()     // Catch:{ all -> 0x0559 }
            r0.mo11931h()     // Catch:{ all -> 0x0559 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0559 }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r15)     // Catch:{ all -> 0x0559 }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r3, r10)     // Catch:{ all -> 0x0559 }
            r0.setComponent(r15)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.l5 r10 = r13.f11264a     // Catch:{ all -> 0x0559 }
            android.content.Context r10 = r10.mo11938f()     // Catch:{ all -> 0x0559 }
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch:{ all -> 0x0559 }
            if (r10 != 0) goto L_0x02fb
            com.google.android.gms.measurement.internal.l5 r0 = r13.f11264a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12551y()     // Catch:{ all -> 0x0559 }
            java.lang.String r3 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            goto L_0x02be
        L_0x02fb:
            r15 = 0
            java.util.List r10 = r10.queryIntentServices(r0, r15)     // Catch:{ all -> 0x0559 }
            if (r10 == 0) goto L_0x0374
            boolean r17 = r10.isEmpty()     // Catch:{ all -> 0x0559 }
            if (r17 != 0) goto L_0x0374
            java.lang.Object r10 = r10.get(r15)     // Catch:{ all -> 0x0559 }
            android.content.pm.ResolveInfo r10 = (android.content.pm.ResolveInfo) r10     // Catch:{ all -> 0x0559 }
            android.content.pm.ServiceInfo r10 = r10.serviceInfo     // Catch:{ all -> 0x0559 }
            if (r10 == 0) goto L_0x0390
            java.lang.String r15 = r10.packageName     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = r10.name     // Catch:{ all -> 0x0559 }
            if (r10 == 0) goto L_0x0366
            boolean r3 = r3.equals(r15)     // Catch:{ all -> 0x0559 }
            if (r3 == 0) goto L_0x0366
            boolean r3 = r13.mo12414a()     // Catch:{ all -> 0x0559 }
            if (r3 == 0) goto L_0x0366
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x0559 }
            r3.<init>(r0)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.common.m.a r0 = com.google.android.gms.common.p132m.C3743a.m14478b()     // Catch:{ RuntimeException -> 0x0351 }
            com.google.android.gms.measurement.internal.l5 r10 = r13.f11264a     // Catch:{ RuntimeException -> 0x0351 }
            android.content.Context r10 = r10.mo11938f()     // Catch:{ RuntimeException -> 0x0351 }
            r15 = 1
            boolean r0 = r0.mo11713a(r10, r3, r14, r15)     // Catch:{ RuntimeException -> 0x0351 }
            com.google.android.gms.measurement.internal.l5 r3 = r13.f11264a     // Catch:{ RuntimeException -> 0x0351 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()     // Catch:{ RuntimeException -> 0x0351 }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12548v()     // Catch:{ RuntimeException -> 0x0351 }
            java.lang.String r14 = "Install Referrer Service is"
            java.lang.String r15 = "available"
            java.lang.String r16 = "not available"
            r10 = 1
            if (r10 == r0) goto L_0x034d
            r15 = r16
        L_0x034d:
            r3.mo12477b(r14, r15)     // Catch:{ RuntimeException -> 0x0351 }
            goto L_0x0390
        L_0x0351:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l5 r3 = r13.f11264a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()     // Catch:{ all -> 0x0559 }
            java.lang.String r13 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0559 }
            r3.mo12477b(r13, r0)     // Catch:{ all -> 0x0559 }
            goto L_0x0390
        L_0x0366:
            com.google.android.gms.measurement.internal.l5 r0 = r13.f11264a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12549w()     // Catch:{ all -> 0x0559 }
            java.lang.String r3 = "Play Store version 8.3.73 or higher required for Install Referrer"
            goto L_0x02be
        L_0x0374:
            com.google.android.gms.measurement.internal.l5 r0 = r13.f11264a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12547u()     // Catch:{ all -> 0x0559 }
            java.lang.String r3 = "Play Service for fetching Install Referrer is unavailable on device"
            goto L_0x02be
        L_0x0382:
            com.google.android.gms.measurement.internal.l5 r0 = r13.f11264a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12551y()     // Catch:{ all -> 0x0559 }
            java.lang.String r3 = "Install Referrer Reporter was called with invalid app package name"
            goto L_0x02be
        L_0x0390:
            com.google.android.gms.measurement.internal.i5 r0 = r23.mo11934a()     // Catch:{ all -> 0x0559 }
            r0.mo11931h()     // Catch:{ all -> 0x0559 }
            r23.mo12286g()     // Catch:{ all -> 0x0559 }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0559 }
            r3.<init>()     // Catch:{ all -> 0x0559 }
            r13 = 1
            r3.putLong(r8, r13)     // Catch:{ all -> 0x0559 }
            r3.putLong(r9, r13)     // Catch:{ all -> 0x0559 }
            r8 = 0
            r3.putLong(r7, r8)     // Catch:{ all -> 0x0559 }
            r3.putLong(r6, r8)     // Catch:{ all -> 0x0559 }
            r15 = r22
            r3.putLong(r15, r8)     // Catch:{ all -> 0x0559 }
            r14 = r21
            r3.putLong(r14, r8)     // Catch:{ all -> 0x0559 }
            r8 = 1
            r3.putLong(r5, r8)     // Catch:{ all -> 0x0559 }
            boolean r0 = r2.f10584C     // Catch:{ all -> 0x0559 }
            if (r0 == 0) goto L_0x03c5
            r3.putLong(r4, r8)     // Catch:{ all -> 0x0559 }
        L_0x03c5:
            java.lang.String r0 = r2.f10593f     // Catch:{ all -> 0x0559 }
            java.lang.Object r0 = com.google.android.gms.common.internal.C3705r.m14346k(r0)     // Catch:{ all -> 0x0559 }
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.n r0 = r1.f11157d     // Catch:{ all -> 0x0559 }
            m15159R(r0)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.common.internal.C3705r.m14342g(r4)     // Catch:{ all -> 0x0559 }
            r0.mo11931h()     // Catch:{ all -> 0x0559 }
            r0.mo11893i()     // Catch:{ all -> 0x0559 }
            java.lang.String r5 = "first_open_count"
            long r8 = r0.mo12198L(r4, r5)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.l5 r0 = r1.f11166m     // Catch:{ all -> 0x0559 }
            android.content.Context r0 = r0.mo11938f()     // Catch:{ all -> 0x0559 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0559 }
            if (r0 != 0) goto L_0x0405
            com.google.android.gms.measurement.internal.z3 r0 = r23.mo11935b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12544r()     // Catch:{ all -> 0x0559 }
            java.lang.String r5 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r4)     // Catch:{ all -> 0x0559 }
            r0.mo12477b(r5, r4)     // Catch:{ all -> 0x0559 }
            r22 = r6
        L_0x0401:
            r4 = 0
            goto L_0x04c5
        L_0x0405:
            com.google.android.gms.measurement.internal.l5 r0 = r1.f11166m     // Catch:{ NameNotFoundException -> 0x0415 }
            android.content.Context r0 = r0.mo11938f()     // Catch:{ NameNotFoundException -> 0x0415 }
            com.google.android.gms.common.n.b r0 = com.google.android.gms.common.p133n.C3746c.m14493a(r0)     // Catch:{ NameNotFoundException -> 0x0415 }
            r5 = 0
            android.content.pm.PackageInfo r0 = r0.mo11719d(r4, r5)     // Catch:{ NameNotFoundException -> 0x0415 }
            goto L_0x0428
        L_0x0415:
            r0 = move-exception
            com.google.android.gms.measurement.internal.z3 r5 = r23.mo11935b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12544r()     // Catch:{ all -> 0x0559 }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r4)     // Catch:{ all -> 0x0559 }
            r5.mo12478c(r13, r10, r0)     // Catch:{ all -> 0x0559 }
            r0 = 0
        L_0x0428:
            if (r0 == 0) goto L_0x0484
            r21 = r14
            long r13 = r0.firstInstallTime     // Catch:{ all -> 0x0559 }
            r17 = 0
            int r5 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            r22 = r6
            if (r5 == 0) goto L_0x0480
            long r5 = r0.lastUpdateTime     // Catch:{ all -> 0x0559 }
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0460
            com.google.android.gms.measurement.internal.h r0 = r23.mo12275U()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.l3 r5 = com.google.android.gms.measurement.internal.C3966m3.f10993d0     // Catch:{ all -> 0x0559 }
            r6 = 0
            boolean r0 = r0.mo12010B(r6, r5)     // Catch:{ all -> 0x0559 }
            if (r0 == 0) goto L_0x045a
            r13 = 0
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0458
            r13 = 1
            r3.putLong(r7, r13)     // Catch:{ all -> 0x0559 }
            r0 = 0
            r8 = 0
            goto L_0x0462
        L_0x0458:
            r0 = 0
            goto L_0x0462
        L_0x045a:
            r13 = 1
            r3.putLong(r7, r13)     // Catch:{ all -> 0x0559 }
            goto L_0x0458
        L_0x0460:
            r6 = 0
            r0 = 1
        L_0x0462:
            com.google.android.gms.measurement.internal.sa r5 = new com.google.android.gms.measurement.internal.sa     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_fi"
            r7 = 1
            if (r7 == r0) goto L_0x046c
            r16 = 0
            goto L_0x046e
        L_0x046c:
            r16 = 1
        L_0x046e:
            java.lang.Long r17 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0559 }
            java.lang.String r18 = "auto"
            r13 = r5
            r7 = r21
            r6 = r15
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0559 }
            r1.mo12268B(r5, r2)     // Catch:{ all -> 0x0559 }
            goto L_0x0488
        L_0x0480:
            r6 = r15
            r7 = r21
            goto L_0x0488
        L_0x0484:
            r22 = r6
            r7 = r14
            r6 = r15
        L_0x0488:
            com.google.android.gms.measurement.internal.l5 r0 = r1.f11166m     // Catch:{ NameNotFoundException -> 0x0498 }
            android.content.Context r0 = r0.mo11938f()     // Catch:{ NameNotFoundException -> 0x0498 }
            com.google.android.gms.common.n.b r0 = com.google.android.gms.common.p133n.C3746c.m14493a(r0)     // Catch:{ NameNotFoundException -> 0x0498 }
            r5 = 0
            android.content.pm.ApplicationInfo r0 = r0.mo11717b(r4, r5)     // Catch:{ NameNotFoundException -> 0x0498 }
            goto L_0x04ab
        L_0x0498:
            r0 = move-exception
            com.google.android.gms.measurement.internal.z3 r5 = r23.mo11935b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12544r()     // Catch:{ all -> 0x0559 }
            java.lang.String r13 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r4)     // Catch:{ all -> 0x0559 }
            r5.mo12478c(r13, r4, r0)     // Catch:{ all -> 0x0559 }
            r0 = 0
        L_0x04ab:
            if (r0 == 0) goto L_0x0401
            int r4 = r0.flags     // Catch:{ all -> 0x0559 }
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x04b8
            r4 = 1
            r3.putLong(r6, r4)     // Catch:{ all -> 0x0559 }
        L_0x04b8:
            int r0 = r0.flags     // Catch:{ all -> 0x0559 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0401
            r4 = 1
            r3.putLong(r7, r4)     // Catch:{ all -> 0x0559 }
            goto L_0x0401
        L_0x04c5:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x04ce
            r4 = r22
            r3.putLong(r4, r8)     // Catch:{ all -> 0x0559 }
        L_0x04ce:
            com.google.android.gms.measurement.internal.x r0 = new com.google.android.gms.measurement.internal.x     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.v r15 = new com.google.android.gms.measurement.internal.v     // Catch:{ all -> 0x0559 }
            r15.<init>(r3)     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_f"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0559 }
            r1.mo12295l(r0, r2)     // Catch:{ all -> 0x0559 }
            goto L_0x0548
        L_0x04e3:
            r6 = r13
            r3 = r14
            com.google.android.gms.measurement.internal.sa r0 = new com.google.android.gms.measurement.internal.sa     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0559 }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0559 }
            r1.mo12268B(r0, r2)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.i5 r0 = r23.mo11934a()     // Catch:{ all -> 0x0559 }
            r0.mo11931h()     // Catch:{ all -> 0x0559 }
            r23.mo12286g()     // Catch:{ all -> 0x0559 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0559 }
            r0.<init>()     // Catch:{ all -> 0x0559 }
            r7 = 1
            r0.putLong(r6, r7)     // Catch:{ all -> 0x0559 }
            r0.putLong(r3, r7)     // Catch:{ all -> 0x0559 }
            r0.putLong(r5, r7)     // Catch:{ all -> 0x0559 }
            boolean r3 = r2.f10584C     // Catch:{ all -> 0x0559 }
            if (r3 == 0) goto L_0x0518
            r0.putLong(r4, r7)     // Catch:{ all -> 0x0559 }
        L_0x0518:
            com.google.android.gms.measurement.internal.x r3 = new com.google.android.gms.measurement.internal.x     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.v r15 = new com.google.android.gms.measurement.internal.v     // Catch:{ all -> 0x0559 }
            r15.<init>(r0)     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_v"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0559 }
        L_0x0529:
            r1.mo12295l(r3, r2)     // Catch:{ all -> 0x0559 }
            goto L_0x0548
        L_0x052d:
            boolean r0 = r2.f10601v     // Catch:{ all -> 0x0559 }
            if (r0 == 0) goto L_0x0548
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0559 }
            r0.<init>()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.x r3 = new com.google.android.gms.measurement.internal.x     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.v r15 = new com.google.android.gms.measurement.internal.v     // Catch:{ all -> 0x0559 }
            r15.<init>(r0)     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_cd"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0559 }
            goto L_0x0529
        L_0x0548:
            com.google.android.gms.measurement.internal.n r0 = r1.f11157d     // Catch:{ all -> 0x0559 }
            m15159R(r0)     // Catch:{ all -> 0x0559 }
            r0.mo12222o()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.n r0 = r1.f11157d
            m15159R(r0)
            r0.mo12217f0()
            return
        L_0x0559:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n r2 = r1.f11157d
            m15159R(r2)
            r2.mo12217f0()
            throw r0
        L_0x0563:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4009pa.mo12301q(com.google.android.gms.measurement.internal.cb):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo12302r() {
        this.f11171r++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo12303s(C3845d dVar) {
        C3844cb I = m15150I((String) C3705r.m14346k(dVar.f10606f));
        if (I != null) {
            mo12304t(dVar, I);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo12304t(C3845d dVar, C3844cb cbVar) {
        C3705r.m14346k(dVar);
        C3705r.m14342g(dVar.f10606f);
        C3705r.m14346k(dVar.f10608p);
        C3705r.m14342g(dVar.f10608p.f11276o);
        mo11934a().mo11931h();
        mo12286g();
        if (m15158Q(cbVar)) {
            if (cbVar.f10600u) {
                C3974n nVar = this.f11157d;
                m15159R(nVar);
                nVar.mo12216e0();
                try {
                    mo12273S(cbVar);
                    String str = (String) C3705r.m14346k(dVar.f10606f);
                    C3974n nVar2 = this.f11157d;
                    m15159R(nVar2);
                    C3845d S = nVar2.mo12205S(str, dVar.f10608p.f11276o);
                    if (S != null) {
                        mo11935b().mo12543q().mo12478c("Removing conditional user property", dVar.f10606f, this.f11166m.mo12152D().mo12440f(dVar.f10608p.f11276o));
                        C3974n nVar3 = this.f11157d;
                        m15159R(nVar3);
                        nVar3.mo12197J(str, dVar.f10608p.f11276o);
                        if (S.f10610r) {
                            C3974n nVar4 = this.f11157d;
                            m15159R(nVar4);
                            nVar4.mo12220m(str, dVar.f10608p.f11276o);
                        }
                        C4094x xVar = dVar.f10616x;
                        if (xVar != null) {
                            C4070v vVar = xVar.f11382o;
                            mo12270D((C4094x) C3705r.m14346k(mo12289h0().mo12527w0(str, ((C4094x) C3705r.m14346k(dVar.f10616x)).f11381f, vVar != null ? vVar.mo12453r() : null, S.f10607o, dVar.f10616x.f11384q, true, true)), cbVar);
                        }
                    } else {
                        mo11935b().mo12549w().mo12478c("Conditional user property doesn't exist", C4122z3.m15469z(dVar.f10606f), this.f11166m.mo12152D().mo12440f(dVar.f10608p.f11276o));
                    }
                    C3974n nVar5 = this.f11157d;
                    m15159R(nVar5);
                    nVar5.mo12222o();
                } finally {
                    C3974n nVar6 = this.f11157d;
                    m15159R(nVar6);
                    nVar6.mo12217f0();
                }
            } else {
                mo12273S(cbVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo12305u(C4045sa saVar, C3844cb cbVar) {
        mo11934a().mo11931h();
        mo12286g();
        if (m15158Q(cbVar)) {
            if (!cbVar.f10600u) {
                mo12273S(cbVar);
            } else if (!"_npa".equals(saVar.f11276o) || cbVar.f10586E == null) {
                mo11935b().mo12543q().mo12477b("Removing user property", this.f11166m.mo12152D().mo12440f(saVar.f11276o));
                C3974n nVar = this.f11157d;
                m15159R(nVar);
                nVar.mo12216e0();
                try {
                    mo12273S(cbVar);
                    if ("_id".equals(saVar.f11276o)) {
                        C3974n nVar2 = this.f11157d;
                        m15159R(nVar2);
                        nVar2.mo12220m((String) C3705r.m14346k(cbVar.f10593f), "_lair");
                    }
                    C3974n nVar3 = this.f11157d;
                    m15159R(nVar3);
                    nVar3.mo12220m((String) C3705r.m14346k(cbVar.f10593f), saVar.f11276o);
                    C3974n nVar4 = this.f11157d;
                    m15159R(nVar4);
                    nVar4.mo12222o();
                    mo11935b().mo12543q().mo12477b("User property removed", this.f11166m.mo12152D().mo12440f(saVar.f11276o));
                } finally {
                    C3974n nVar5 = this.f11157d;
                    m15159R(nVar5);
                    nVar5.mo12217f0();
                }
            } else {
                mo11935b().mo12543q().mo12476a("Falling back to manifest metadata value for ad personalization");
                mo12268B(new C4045sa("_npa", mo11936c().mo11730a(), Long.valueOf(true != cbVar.f10586E.booleanValue() ? 0 : 1), "auto"), cbVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo12306v(C3844cb cbVar) {
        if (this.f11178y != null) {
            ArrayList arrayList = new ArrayList();
            this.f11179z = arrayList;
            arrayList.addAll(this.f11178y);
        }
        C3974n nVar = this.f11157d;
        m15159R(nVar);
        String str = (String) C3705r.m14346k(cbVar.f10593f);
        C3705r.m14342g(str);
        nVar.mo11931h();
        nVar.mo11893i();
        try {
            SQLiteDatabase P = nVar.mo12202P();
            String[] strArr = {str};
            int delete = P.delete("apps", "app_id=?", strArr) + P.delete("events", "app_id=?", strArr) + P.delete("user_attributes", "app_id=?", strArr) + P.delete("conditional_properties", "app_id=?", strArr) + P.delete("raw_events", "app_id=?", strArr) + P.delete("raw_events_metadata", "app_id=?", strArr) + P.delete("queue", "app_id=?", strArr) + P.delete("audience_filter_values", "app_id=?", strArr) + P.delete("main_event_params", "app_id=?", strArr) + P.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                nVar.f10651a.mo11935b().mo12548v().mo12478c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            nVar.f10651a.mo11935b().mo12544r().mo12478c("Error resetting analytics data. appId, error", C4122z3.m15469z(str), e);
        }
        if (cbVar.f10600u) {
            mo12301q(cbVar);
        }
    }

    /* renamed from: w */
    public final void mo12307w(String str, C4114y7 y7Var) {
        mo11934a().mo11931h();
        String str2 = this.f11153E;
        if (str2 == null || str2.equals(str) || y7Var != null) {
            this.f11153E = str;
            this.f11152D = y7Var;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo12308x() {
        mo11934a().mo11931h();
        C3974n nVar = this.f11157d;
        m15159R(nVar);
        nVar.mo12219h0();
        if (this.f11163j.f10836g.mo12147a() == 0) {
            this.f11163j.f10836g.mo12148b(mo11936c().mo11730a());
        }
        m15154M();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo12309y(C3845d dVar) {
        C3844cb I = m15150I((String) C3705r.m14346k(dVar.f10606f));
        if (I != null) {
            mo12310z(dVar, I);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo12310z(C3845d dVar, C3844cb cbVar) {
        C4098x3 r;
        String str;
        Object z;
        String f;
        Object o;
        C4098x3 r2;
        String str2;
        Object z2;
        String f2;
        Object obj;
        C3705r.m14346k(dVar);
        C3705r.m14342g(dVar.f10606f);
        C3705r.m14346k(dVar.f10607o);
        C3705r.m14346k(dVar.f10608p);
        C3705r.m14342g(dVar.f10608p.f11276o);
        mo11934a().mo11931h();
        mo12286g();
        if (m15158Q(cbVar)) {
            if (!cbVar.f10600u) {
                mo12273S(cbVar);
                return;
            }
            C3845d dVar2 = new C3845d(dVar);
            boolean z3 = false;
            dVar2.f10610r = false;
            C3974n nVar = this.f11157d;
            m15159R(nVar);
            nVar.mo12216e0();
            try {
                C3974n nVar2 = this.f11157d;
                m15159R(nVar2);
                C3845d S = nVar2.mo12205S((String) C3705r.m14346k(dVar2.f10606f), dVar2.f10608p.f11276o);
                if (S != null && !S.f10607o.equals(dVar2.f10607o)) {
                    mo11935b().mo12549w().mo12479d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f11166m.mo12152D().mo12440f(dVar2.f10608p.f11276o), dVar2.f10607o, S.f10607o);
                }
                if (S != null && S.f10610r) {
                    dVar2.f10607o = S.f10607o;
                    dVar2.f10609q = S.f10609q;
                    dVar2.f10613u = S.f10613u;
                    dVar2.f10611s = S.f10611s;
                    dVar2.f10614v = S.f10614v;
                    dVar2.f10610r = true;
                    C4045sa saVar = dVar2.f10608p;
                    dVar2.f10608p = new C4045sa(saVar.f11276o, S.f10608p.f11277p, saVar.mo12418o(), S.f10608p.f11280s);
                } else if (TextUtils.isEmpty(dVar2.f10611s)) {
                    C4045sa saVar2 = dVar2.f10608p;
                    dVar2.f10608p = new C4045sa(saVar2.f11276o, dVar2.f10609q, saVar2.mo12418o(), dVar2.f10608p.f11280s);
                    dVar2.f10610r = true;
                    z3 = true;
                }
                if (dVar2.f10610r) {
                    C4045sa saVar3 = dVar2.f10608p;
                    C4069ua uaVar = new C4069ua((String) C3705r.m14346k(dVar2.f10606f), dVar2.f10607o, saVar3.f11276o, saVar3.f11277p, C3705r.m14346k(saVar3.mo12418o()));
                    C3974n nVar3 = this.f11157d;
                    m15159R(nVar3);
                    if (nVar3.mo12231x(uaVar)) {
                        r2 = mo11935b().mo12543q();
                        str2 = "User property updated immediately";
                        z2 = dVar2.f10606f;
                        f2 = this.f11166m.mo12152D().mo12440f(uaVar.f11330c);
                        obj = uaVar.f11332e;
                    } else {
                        r2 = mo11935b().mo12544r();
                        str2 = "(2)Too many active user properties, ignoring";
                        z2 = C4122z3.m15469z(dVar2.f10606f);
                        f2 = this.f11166m.mo12152D().mo12440f(uaVar.f11330c);
                        obj = uaVar.f11332e;
                    }
                    r2.mo12479d(str2, z2, f2, obj);
                    if (z3 && dVar2.f10614v != null) {
                        mo12270D(new C4094x(dVar2.f10614v, dVar2.f10609q), cbVar);
                    }
                }
                C3974n nVar4 = this.f11157d;
                m15159R(nVar4);
                if (nVar4.mo12230w(dVar2)) {
                    r = mo11935b().mo12543q();
                    str = "Conditional property added";
                    z = dVar2.f10606f;
                    f = this.f11166m.mo12152D().mo12440f(dVar2.f10608p.f11276o);
                    o = dVar2.f10608p.mo12418o();
                } else {
                    r = mo11935b().mo12544r();
                    str = "Too many conditional properties, ignoring";
                    z = C4122z3.m15469z(dVar2.f10606f);
                    f = this.f11166m.mo12152D().mo12440f(dVar2.f10608p.f11276o);
                    o = dVar2.f10608p.mo12418o();
                }
                r.mo12479d(str, z, f, o);
                C3974n nVar5 = this.f11157d;
                m15159R(nVar5);
                nVar5.mo12222o();
            } finally {
                C3974n nVar6 = this.f11157d;
                m15159R(nVar6);
                nVar6.mo12217f0();
            }
        }
    }
}
