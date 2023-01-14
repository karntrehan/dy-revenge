package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3705r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p027c.p060f.C1788a;
import p027c.p060f.C1794e;
import p174e.p319f.p320a.p335c.p345f.p352g.C6697a4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6724be;
import p174e.p319f.p320a.p335c.p345f.p352g.C6728c1;
import p174e.p319f.p320a.p335c.p345f.p352g.C6848j5;
import p174e.p319f.p320a.p335c.p345f.p352g.C6852j9;
import p174e.p319f.p320a.p335c.p345f.p352g.C6880l5;
import p174e.p319f.p320a.p335c.p345f.p352g.C6990s3;
import p174e.p319f.p320a.p335c.p345f.p352g.C7006t3;
import p174e.p319f.p320a.p335c.p345f.p352g.C7038v3;
import p174e.p319f.p320a.p335c.p345f.p352g.C7054w3;
import p174e.p319f.p320a.p335c.p345f.p352g.C7068x1;
import p174e.p319f.p320a.p335c.p345f.p352g.C7081xe;

/* renamed from: com.google.android.gms.measurement.internal.c5 */
public final class C3838c5 extends C3843ca implements C3884g {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map f10560d = new C1788a();

    /* renamed from: e */
    final Map f10561e = new C1788a();

    /* renamed from: f */
    final Map f10562f = new C1788a();

    /* renamed from: g */
    final Map f10563g = new C1788a();

    /* renamed from: h */
    private final Map f10564h = new C1788a();

    /* renamed from: i */
    private final Map f10565i = new C1788a();

    /* renamed from: j */
    final C1794e f10566j = new C4123z4(this, 20);

    /* renamed from: k */
    final C7081xe f10567k = new C3812a5(this);

    /* renamed from: l */
    private final Map f10568l = new C1788a();

    /* renamed from: m */
    private final Map f10569m = new C1788a();

    /* renamed from: n */
    private final Map f10570n = new C1788a();

    C3838c5(C4009pa paVar) {
        super(paVar);
    }

    /* renamed from: m */
    private final C7054w3 m14641m(String str, byte[] bArr) {
        if (bArr == null) {
            return C7054w3.m26951D();
        }
        try {
            C7054w3 w3Var = (C7054w3) ((C7038v3) C4033ra.m15282C(C7054w3.m26949B(), bArr)).mo20436r();
            C4098x3 v = this.f10651a.mo11935b().mo12548v();
            String str2 = null;
            Long valueOf = w3Var.mo20407O() ? Long.valueOf(w3Var.mo20410z()) : null;
            if (w3Var.mo20406N()) {
                str2 = w3Var.mo20399E();
            }
            v.mo12478c("Parsed config. version, gmp_app_id", valueOf, str2);
            return w3Var;
        } catch (C6852j9 | RuntimeException e) {
            this.f10651a.mo11935b().mo12549w().mo12478c("Unable to merge remote config. appId", C4122z3.m15469z(str), e);
            return C7054w3.m26951D();
        }
    }

    /* renamed from: n */
    private final void m14642n(String str, C7038v3 v3Var) {
        HashSet hashSet = new HashSet();
        C1788a aVar = new C1788a();
        C1788a aVar2 = new C1788a();
        C1788a aVar3 = new C1788a();
        if (v3Var != null) {
            C6724be.m25469b();
            if (this.f10651a.mo12181z().mo12010B((String) null, C3966m3.f11027u0)) {
                for (C6990s3 y : v3Var.mo20313B()) {
                    hashSet.add(y.mo20142y());
                }
            }
            for (int i = 0; i < v3Var.mo20314u(); i++) {
                C7006t3 t3Var = (C7006t3) v3Var.mo20315v(i).mo19526u();
                if (t3Var.mo20180w().isEmpty()) {
                    this.f10651a.mo11935b().mo12549w().mo12476a("EventConfig contained null event name");
                } else {
                    String w = t3Var.mo20180w();
                    String b = C3930j6.m14951b(t3Var.mo20180w());
                    if (!TextUtils.isEmpty(b)) {
                        t3Var.mo20179v(b);
                        v3Var.mo20317x(i, t3Var);
                    }
                    if (t3Var.mo20183z() && t3Var.mo20181x()) {
                        aVar.put(w, Boolean.TRUE);
                    }
                    if (t3Var.mo20176B() && t3Var.mo20182y()) {
                        aVar2.put(t3Var.mo20180w(), Boolean.TRUE);
                    }
                    if (t3Var.mo20177C()) {
                        if (t3Var.mo20178u() < 2 || t3Var.mo20178u() > 65535) {
                            this.f10651a.mo11935b().mo12549w().mo12478c("Invalid sampling rate. Event name, sample rate", t3Var.mo20180w(), Integer.valueOf(t3Var.mo20178u()));
                        } else {
                            aVar3.put(t3Var.mo20180w(), Integer.valueOf(t3Var.mo20178u()));
                        }
                    }
                }
            }
        }
        this.f10561e.put(str, hashSet);
        this.f10562f.put(str, aVar);
        this.f10563g.put(str, aVar2);
        this.f10565i.put(str, aVar3);
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (r2 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0125  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14643o(java.lang.String r13) {
        /*
            r12 = this;
            r12.mo11893i()
            r12.mo11931h()
            com.google.android.gms.common.internal.C3705r.m14342g(r13)
            java.util.Map r0 = r12.f10564h
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x0129
            com.google.android.gms.measurement.internal.pa r0 = r12.f10552b
            com.google.android.gms.measurement.internal.n r0 = r0.mo12277W()
            com.google.android.gms.common.internal.C3705r.m14342g(r13)
            r0.mo11931h()
            r0.mo11893i()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.mo12202P()     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4, r5}     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0089 }
            if (r3 != 0) goto L_0x0047
            goto L_0x00a6
        L_0x0047:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.l5 r5 = r0.f10651a     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.h r5 = r5.mo12181z()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.l3 r6 = com.google.android.gms.measurement.internal.C3966m3.f10961F0     // Catch:{ SQLiteException -> 0x0089 }
            boolean r5 = r5.mo12010B(r1, r6)     // Catch:{ SQLiteException -> 0x0089 }
            if (r5 == 0) goto L_0x0063
            r5 = 2
            java.lang.String r5 = r2.getString(r5)     // Catch:{ SQLiteException -> 0x0089 }
            goto L_0x0064
        L_0x0063:
            r5 = r1
        L_0x0064:
            boolean r6 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0089 }
            if (r6 == 0) goto L_0x007d
            com.google.android.gms.measurement.internal.l5 r6 = r0.f10651a     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo11935b()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.x3 r6 = r6.mo12544r()     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r13)     // Catch:{ SQLiteException -> 0x0089 }
            r6.mo12477b(r7, r8)     // Catch:{ SQLiteException -> 0x0089 }
        L_0x007d:
            if (r3 != 0) goto L_0x0080
            goto L_0x00a6
        L_0x0080:
            com.google.android.gms.measurement.internal.k r6 = new com.google.android.gms.measurement.internal.k     // Catch:{ SQLiteException -> 0x0089 }
            r6.<init>(r3, r4, r5)     // Catch:{ SQLiteException -> 0x0089 }
            r2.close()
            goto L_0x00aa
        L_0x0089:
            r3 = move-exception
            goto L_0x0091
        L_0x008b:
            r13 = move-exception
            goto L_0x0123
        L_0x008e:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0091:
            com.google.android.gms.measurement.internal.l5 r0 = r0.f10651a     // Catch:{ all -> 0x0121 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ all -> 0x0121 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12544r()     // Catch:{ all -> 0x0121 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r13)     // Catch:{ all -> 0x0121 }
            r0.mo12478c(r4, r5, r3)     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x00a9
        L_0x00a6:
            r2.close()
        L_0x00a9:
            r6 = r1
        L_0x00aa:
            if (r6 != 0) goto L_0x00da
            java.util.Map r0 = r12.f10560d
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10562f
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10561e
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10563g
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10564h
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10568l
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10569m
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10570n
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10565i
        L_0x00d6:
            r0.put(r13, r1)
            return
        L_0x00da:
            byte[] r0 = r6.f10843a
            e.f.a.c.f.g.w3 r0 = r12.m14641m(r13, r0)
            e.f.a.c.f.g.x8 r0 = r0.mo19526u()
            e.f.a.c.f.g.v3 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C7038v3) r0
            r12.m14642n(r13, r0)
            java.util.Map r1 = r12.f10560d
            e.f.a.c.f.g.a9 r2 = r0.mo20436r()
            e.f.a.c.f.g.w3 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C7054w3) r2
            java.util.Map r2 = m14645q(r2)
            r1.put(r13, r2)
            java.util.Map r1 = r12.f10564h
            e.f.a.c.f.g.a9 r2 = r0.mo20436r()
            e.f.a.c.f.g.w3 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C7054w3) r2
            r1.put(r13, r2)
            e.f.a.c.f.g.a9 r1 = r0.mo20436r()
            e.f.a.c.f.g.w3 r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C7054w3) r1
            r12.m14644p(r13, r1)
            java.util.Map r1 = r12.f10568l
            java.lang.String r0 = r0.mo20318y()
            r1.put(r13, r0)
            java.util.Map r0 = r12.f10569m
            java.lang.String r1 = r6.f10844b
            r0.put(r13, r1)
            java.util.Map r0 = r12.f10570n
            java.lang.String r1 = r6.f10845c
            goto L_0x00d6
        L_0x0121:
            r13 = move-exception
            r1 = r2
        L_0x0123:
            if (r1 == 0) goto L_0x0128
            r1.close()
        L_0x0128:
            throw r13
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3838c5.m14643o(java.lang.String):void");
    }

    /* renamed from: p */
    private final void m14644p(String str, C7054w3 w3Var) {
        if (w3Var.mo20408x() != 0) {
            this.f10651a.mo11935b().mo12548v().mo12477b("EES programs found", Integer.valueOf(w3Var.mo20408x()));
            C6880l5 l5Var = (C6880l5) w3Var.mo20403I().get(0);
            try {
                C6728c1 c1Var = new C6728c1();
                c1Var.mo19597d("internal.remoteConfig", new C4087w4(this, str));
                c1Var.mo19597d("internal.appMetadata", new C4099x4(this, str));
                c1Var.mo19597d("internal.logger", new C4111y4(this));
                c1Var.mo19596c(l5Var);
                this.f10566j.mo6178d(str, c1Var);
                this.f10651a.mo11935b().mo12548v().mo12478c("EES program loaded for appId, activities", str, Integer.valueOf(l5Var.mo19940x().mo19824x()));
                for (C6848j5 y : l5Var.mo19940x().mo19823A()) {
                    this.f10651a.mo11935b().mo12548v().mo12477b("EES program activity", y.mo19875y());
                }
            } catch (C7068x1 unused) {
                this.f10651a.mo11935b().mo12544r().mo12477b("Failed to load EES program. appId", str);
            }
        } else {
            this.f10566j.mo6179e(str);
        }
    }

    /* renamed from: q */
    private static final Map m14645q(C7054w3 w3Var) {
        C1788a aVar = new C1788a();
        if (w3Var != null) {
            for (C6697a4 a4Var : w3Var.mo20404J()) {
                aVar.put(a4Var.mo19500y(), a4Var.mo19501z());
            }
        }
        return aVar;
    }

    /* renamed from: s */
    static /* bridge */ /* synthetic */ C6728c1 m14646s(C3838c5 c5Var, String str) {
        c5Var.mo11893i();
        C3705r.m14342g(str);
        if (!c5Var.mo11869C(str)) {
            return null;
        }
        if (!c5Var.f10564h.containsKey(str) || c5Var.f10564h.get(str) == null) {
            c5Var.m14643o(str);
        } else {
            c5Var.m14644p(str, (C7054w3) c5Var.f10564h.get(str));
        }
        return (C6728c1) c5Var.f10566j.mo6181h().get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo11867A(String str) {
        mo11931h();
        this.f10564h.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final boolean mo11868B(String str) {
        mo11931h();
        C7054w3 t = mo11883t(str);
        if (t == null) {
            return false;
        }
        return t.mo20405M();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C7054w3) r2.f10564h.get(r3);
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11869C(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Map r0 = r2.f10564h
            java.lang.Object r3 = r0.get(r3)
            e.f.a.c.f.g.w3 r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C7054w3) r3
            if (r3 != 0) goto L_0x0013
            return r1
        L_0x0013:
            int r3 = r3.mo20408x()
            if (r3 == 0) goto L_0x001b
            r3 = 1
            return r3
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3838c5.mo11869C(java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final boolean mo11870D(String str) {
        return "1".equals(mo11881e(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final boolean mo11871E(String str, String str2) {
        Boolean bool;
        mo11931h();
        m14643o(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f10563g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final boolean mo11872F(String str, String str2) {
        Boolean bool;
        mo11931h();
        m14643o(str);
        if (mo11870D(str) && C4105xa.m15394W(str2)) {
            return true;
        }
        if (mo11873G(str) && C4105xa.m15395X(str2)) {
            return true;
        }
        Map map = (Map) this.f10562f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean mo11873G(String str) {
        return "1".equals(mo11881e(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean mo11874H(String str, byte[] bArr, String str2, String str3) {
        mo11893i();
        mo11931h();
        C3705r.m14342g(str);
        C7038v3 v3Var = (C7038v3) m14641m(str, bArr).mo19526u();
        if (v3Var == null) {
            return false;
        }
        m14642n(str, v3Var);
        m14644p(str, (C7054w3) v3Var.mo20436r());
        this.f10564h.put(str, (C7054w3) v3Var.mo20436r());
        this.f10568l.put(str, v3Var.mo20318y());
        this.f10569m.put(str, str2);
        this.f10570n.put(str, str3);
        this.f10560d.put(str, m14645q((C7054w3) v3Var.mo20436r()));
        this.f10552b.mo12277W().mo12221n(str, new ArrayList(v3Var.mo20319z()));
        try {
            v3Var.mo20316w();
            bArr = ((C7054w3) v3Var.mo20436r()).mo19840k();
        } catch (RuntimeException e) {
            this.f10651a.mo11935b().mo12549w().mo12478c("Unable to serialize reduced-size config. Storing full config instead. appId", C4122z3.m15469z(str), e);
        }
        C3974n W = this.f10552b.mo12277W();
        C3705r.m14342g(str);
        W.mo11931h();
        W.mo11893i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (W.f10651a.mo12181z().mo12010B((String) null, C3966m3.f10961F0)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (((long) W.mo12202P().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                W.f10651a.mo11935b().mo12544r().mo12477b("Failed to update remote config (got 0). appId", C4122z3.m15469z(str));
            }
        } catch (SQLiteException e2) {
            W.f10651a.mo11935b().mo12544r().mo12478c("Error storing remote config. appId", C4122z3.m15469z(str), e2);
        }
        this.f10564h.put(str, (C7054w3) v3Var.mo20436r());
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final boolean mo11875I(String str) {
        mo11931h();
        m14643o(str);
        return this.f10561e.get(str) != null && ((Set) this.f10561e.get(str)).contains("app_instance_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final boolean mo11876J(String str) {
        mo11931h();
        m14643o(str);
        return this.f10561e.get(str) != null && (((Set) this.f10561e.get(str)).contains("device_model") || ((Set) this.f10561e.get(str)).contains("device_info"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final boolean mo11877K(String str) {
        mo11931h();
        m14643o(str);
        return this.f10561e.get(str) != null && ((Set) this.f10561e.get(str)).contains("enhanced_user_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final boolean mo11878L(String str) {
        mo11931h();
        m14643o(str);
        return this.f10561e.get(str) != null && ((Set) this.f10561e.get(str)).contains("google_signals");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo11879M(String str) {
        mo11931h();
        m14643o(str);
        return this.f10561e.get(str) != null && (((Set) this.f10561e.get(str)).contains("os_version") || ((Set) this.f10561e.get(str)).contains("device_info"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo11880N(String str) {
        mo11931h();
        m14643o(str);
        return this.f10561e.get(str) != null && ((Set) this.f10561e.get(str)).contains("user_id");
    }

    /* renamed from: e */
    public final String mo11881e(String str, String str2) {
        mo11931h();
        m14643o(str);
        Map map = (Map) this.f10560d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo11853l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final int mo11882r(String str, String str2) {
        Integer num;
        mo11931h();
        m14643o(str);
        Map map = (Map) this.f10565i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C7054w3 mo11883t(String str) {
        mo11893i();
        mo11931h();
        C3705r.m14342g(str);
        m14643o(str);
        return (C7054w3) this.f10564h.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final String mo11884u(String str) {
        mo11931h();
        return (String) this.f10570n.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final String mo11885v(String str) {
        mo11931h();
        return (String) this.f10569m.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final String mo11886w(String str) {
        mo11931h();
        m14643o(str);
        return (String) this.f10568l.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final Set mo11887y(String str) {
        mo11931h();
        m14643o(str);
        return (Set) this.f10561e.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo11888z(String str) {
        mo11931h();
        this.f10569m.put(str, (Object) null);
    }
}
