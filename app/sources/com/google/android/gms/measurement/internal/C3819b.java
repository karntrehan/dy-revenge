package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.b */
final class C3819b extends C3843ca {

    /* renamed from: d */
    private String f10526d;

    /* renamed from: e */
    private Set f10527e;

    /* renamed from: f */
    private Map f10528f;

    /* renamed from: g */
    private Long f10529g;

    /* renamed from: h */
    private Long f10530h;

    C3819b(C4009pa paVar) {
        super(paVar);
    }

    /* renamed from: n */
    private final C3896gb m14633n(Integer num) {
        if (this.f10528f.containsKey(num)) {
            return (C3896gb) this.f10528f.get(num);
        }
        C3896gb gbVar = new C3896gb(this, this.f10526d, (C3883fb) null);
        this.f10528f.put(num, gbVar);
        return gbVar;
    }

    /* renamed from: o */
    private final boolean m14634o(int i, int i2) {
        C3896gb gbVar = (C3896gb) this.f10528f.get(Integer.valueOf(i));
        if (gbVar == null) {
            return false;
        }
        return gbVar.f10708d.get(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo11853l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ef, code lost:
        if (r5 != null) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0796, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0797, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0799, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x079a, code lost:
        r29 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x07b6, code lost:
        if (r5 == null) goto L_0x07b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x07bf, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0959, code lost:
        if (r13 == null) goto L_0x095c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0a6d, code lost:
        if (r7.mo19854G() == false) goto L_0x0a78;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0a6f, code lost:
        r7 = java.lang.Integer.valueOf(r7.mo19856x());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0a78, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0a79, code lost:
        r0.mo12478c("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0171, code lost:
        if (r5 != null) goto L_0x014f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0454  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0796 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:257:0x06f6] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x07bf  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x086c  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0964  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0ab6  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0b4a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b0 A[Catch:{ SQLiteException -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01be A[SYNTHETIC, Splitter:B:65:0x01be] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0249  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo11857m(java.lang.String r65, java.util.List r66, java.util.List r67, java.lang.Long r68, java.lang.Long r69) {
        /*
            r64 = this;
            r10 = r64
            java.lang.String r11 = "current_results"
            com.google.android.gms.common.internal.C3705r.m14342g(r65)
            com.google.android.gms.common.internal.C3705r.m14346k(r66)
            com.google.android.gms.common.internal.C3705r.m14346k(r67)
            r0 = r65
            r10.f10526d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.f10527e = r0
            c.f.a r0 = new c.f.a
            r0.<init>()
            r10.f10528f = r0
            r0 = r68
            r10.f10529g = r0
            r0 = r69
            r10.f10530h = r0
            java.util.Iterator r0 = r66.iterator()
        L_0x002b:
            boolean r1 = r0.hasNext()
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r0.next()
            e.f.a.c.f.g.k4 r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r1
            java.lang.String r1 = r1.mo19916E()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002b
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            p174e.p319f.p320a.p335c.p345f.p352g.C6740cd.m25562b()
            com.google.android.gms.measurement.internal.l5 r0 = r10.f10651a
            com.google.android.gms.measurement.internal.h r0 = r0.mo12181z()
            java.lang.String r2 = r10.f10526d
            com.google.android.gms.measurement.internal.l3 r3 = com.google.android.gms.measurement.internal.C3966m3.f10984Y
            boolean r14 = r0.mo12010B(r2, r3)
            p174e.p319f.p320a.p335c.p345f.p352g.C6740cd.m25562b()
            com.google.android.gms.measurement.internal.l5 r0 = r10.f10651a
            com.google.android.gms.measurement.internal.h r0 = r0.mo12181z()
            java.lang.String r2 = r10.f10526d
            com.google.android.gms.measurement.internal.l3 r3 = com.google.android.gms.measurement.internal.C3966m3.f10983X
            boolean r15 = r0.mo12010B(r2, r3)
            if (r1 == 0) goto L_0x00af
            com.google.android.gms.measurement.internal.pa r0 = r10.f10552b
            com.google.android.gms.measurement.internal.n r2 = r0.mo12277W()
            java.lang.String r3 = r10.f10526d
            r2.mo11893i()
            r2.mo11931h()
            com.google.android.gms.common.internal.C3705r.m14342g(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.mo12202P()     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x009b }
            r5[r12] = r3     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String r6 = "events"
            java.lang.String r7 = "app_id = ?"
            r4.update(r6, r0, r7, r5)     // Catch:{ SQLiteException -> 0x009b }
            goto L_0x00af
        L_0x009b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.mo12478c(r4, r3, r0)
        L_0x00af:
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r9 = "Failed to merge filter. appId"
            java.lang.String r8 = "Database error querying filters. appId"
            java.lang.String r7 = "data"
            java.lang.String r6 = "audience_id"
            if (r15 == 0) goto L_0x017a
            if (r14 == 0) goto L_0x017a
            com.google.android.gms.measurement.internal.pa r0 = r10.f10552b
            com.google.android.gms.measurement.internal.n r2 = r0.mo12277W()
            java.lang.String r3 = r10.f10526d
            com.google.android.gms.common.internal.C3705r.m14342g(r3)
            c.f.a r4 = new c.f.a
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r2.mo12202P()
            java.lang.String[] r18 = new java.lang.String[]{r6, r7}     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            r0[r12] = r3     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0155 }
            if (r0 == 0) goto L_0x014b
        L_0x00f1:
            byte[] r0 = r5.getBlob(r13)     // Catch:{ SQLiteException -> 0x0155 }
            e.f.a.c.f.g.z2 r13 = p174e.p319f.p320a.p335c.p345f.p352g.C6696a3.m25362z()     // Catch:{ IOException -> 0x012b }
            e.f.a.c.f.g.fa r0 = com.google.android.gms.measurement.internal.C4033ra.m15282C(r13, r0)     // Catch:{ IOException -> 0x012b }
            e.f.a.c.f.g.z2 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C7101z2) r0     // Catch:{ IOException -> 0x012b }
            e.f.a.c.f.g.a9 r0 = r0.mo20436r()     // Catch:{ IOException -> 0x012b }
            e.f.a.c.f.g.a3 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6696a3) r0     // Catch:{ IOException -> 0x012b }
            boolean r13 = r0.mo19494K()     // Catch:{ SQLiteException -> 0x0155 }
            if (r13 != 0) goto L_0x010c
            goto L_0x013d
        L_0x010c:
            int r13 = r5.getInt(r12)     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.Object r16 = r4.get(r13)     // Catch:{ SQLiteException -> 0x0155 }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x0155 }
            if (r16 != 0) goto L_0x0125
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0155 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0155 }
            r4.put(r13, r12)     // Catch:{ SQLiteException -> 0x0155 }
            goto L_0x0127
        L_0x0125:
            r12 = r16
        L_0x0127:
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0155 }
            goto L_0x013d
        L_0x012b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l5 r12 = r2.f10651a     // Catch:{ SQLiteException -> 0x0155 }
            com.google.android.gms.measurement.internal.z3 r12 = r12.mo11935b()     // Catch:{ SQLiteException -> 0x0155 }
            com.google.android.gms.measurement.internal.x3 r12 = r12.mo12544r()     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)     // Catch:{ SQLiteException -> 0x0155 }
            r12.mo12478c(r9, r13, r0)     // Catch:{ SQLiteException -> 0x0155 }
        L_0x013d:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0155 }
            if (r0 != 0) goto L_0x0148
            r5.close()
            r12 = r4
            goto L_0x017b
        L_0x0148:
            r12 = 0
            r13 = 1
            goto L_0x00f1
        L_0x014b:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0155 }
        L_0x014f:
            r5.close()
            goto L_0x017a
        L_0x0153:
            r0 = move-exception
            goto L_0x0174
        L_0x0155:
            r0 = move-exception
            goto L_0x015c
        L_0x0157:
            r0 = move-exception
            r5 = 0
            goto L_0x0174
        L_0x015a:
            r0 = move-exception
            r5 = 0
        L_0x015c:
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a     // Catch:{ all -> 0x0153 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ all -> 0x0153 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x0153 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)     // Catch:{ all -> 0x0153 }
            r2.mo12478c(r8, r3, r0)     // Catch:{ all -> 0x0153 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0153 }
            if (r5 == 0) goto L_0x017a
            goto L_0x014f
        L_0x0174:
            if (r5 == 0) goto L_0x0179
            r5.close()
        L_0x0179:
            throw r0
        L_0x017a:
            r12 = r0
        L_0x017b:
            com.google.android.gms.measurement.internal.pa r0 = r10.f10552b
            com.google.android.gms.measurement.internal.n r2 = r0.mo12277W()
            java.lang.String r3 = r10.f10526d
            r2.mo11893i()
            r2.mo11931h()
            com.google.android.gms.common.internal.C3705r.m14342g(r3)
            android.database.sqlite.SQLiteDatabase r16 = r2.mo12202P()
            java.lang.String[] r18 = new java.lang.String[]{r6, r11}     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            r4 = 0
            r0[r4] = r3     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            java.lang.String r17 = "audience_filter_values"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0220 }
            if (r0 != 0) goto L_0x01be
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0220 }
            r4.close()
            r13 = r0
            r18 = r6
            r19 = r7
            goto L_0x024d
        L_0x01be:
            c.f.a r5 = new c.f.a     // Catch:{ SQLiteException -> 0x0220 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0220 }
        L_0x01c3:
            r13 = 0
            int r16 = r4.getInt(r13)     // Catch:{ SQLiteException -> 0x0220 }
            r13 = 1
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x0220 }
            e.f.a.c.f.g.z4 r13 = p174e.p319f.p320a.p335c.p345f.p352g.C6698a5.m25380C()     // Catch:{ IOException -> 0x01eb }
            e.f.a.c.f.g.fa r0 = com.google.android.gms.measurement.internal.C4033ra.m15282C(r13, r0)     // Catch:{ IOException -> 0x01eb }
            e.f.a.c.f.g.z4 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C7103z4) r0     // Catch:{ IOException -> 0x01eb }
            e.f.a.c.f.g.a9 r0 = r0.mo20436r()     // Catch:{ IOException -> 0x01eb }
            e.f.a.c.f.g.a5 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6698a5) r0     // Catch:{ IOException -> 0x01eb }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x0220 }
            r5.put(r13, r0)     // Catch:{ SQLiteException -> 0x0220 }
            r17 = r5
            r18 = r6
            r19 = r7
            goto L_0x0209
        L_0x01eb:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l5 r13 = r2.f10651a     // Catch:{ SQLiteException -> 0x0220 }
            com.google.android.gms.measurement.internal.z3 r13 = r13.mo11935b()     // Catch:{ SQLiteException -> 0x0220 }
            com.google.android.gms.measurement.internal.x3 r13 = r13.mo12544r()     // Catch:{ SQLiteException -> 0x0220 }
            r17 = r5
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            r18 = r6
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)     // Catch:{ SQLiteException -> 0x021e }
            r19 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x021c }
            r13.mo12479d(r5, r6, r7, r0)     // Catch:{ SQLiteException -> 0x021c }
        L_0x0209:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x021c }
            if (r0 != 0) goto L_0x0215
            r4.close()
            r13 = r17
            goto L_0x024d
        L_0x0215:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L_0x01c3
        L_0x021c:
            r0 = move-exception
            goto L_0x0230
        L_0x021e:
            r0 = move-exception
            goto L_0x0223
        L_0x0220:
            r0 = move-exception
            r18 = r6
        L_0x0223:
            r19 = r7
            goto L_0x0230
        L_0x0226:
            r0 = move-exception
            r5 = 0
            goto L_0x0b48
        L_0x022a:
            r0 = move-exception
            r18 = r6
            r19 = r7
            r4 = 0
        L_0x0230:
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a     // Catch:{ all -> 0x0b46 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ all -> 0x0b46 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x0b46 }
            java.lang.String r5 = "Database error querying filter results. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)     // Catch:{ all -> 0x0b46 }
            r2.mo12478c(r5, r3, r0)     // Catch:{ all -> 0x0b46 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0b46 }
            if (r4 == 0) goto L_0x024c
            r4.close()
        L_0x024c:
            r13 = r0
        L_0x024d:
            boolean r0 = r13.isEmpty()
            r7 = 2
            if (r0 == 0) goto L_0x025c
            r12 = r8
            r13 = r9
            r28 = r18
            r29 = r19
            goto L_0x05ff
        L_0x025c:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r0 = r13.keySet()
            r2.<init>(r0)
            if (r1 == 0) goto L_0x0458
            java.lang.String r1 = r10.f10526d
            com.google.android.gms.measurement.internal.pa r0 = r10.f10552b
            com.google.android.gms.measurement.internal.n r3 = r0.mo12277W()
            java.lang.String r4 = r10.f10526d
            r3.mo11893i()
            r3.mo11931h()
            com.google.android.gms.common.internal.C3705r.m14342g(r4)
            c.f.a r0 = new c.f.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r5 = r3.mo12202P()
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x02d6, all -> 0x02d2 }
            r16 = 0
            r6[r16] = r4     // Catch:{ SQLiteException -> 0x02d6, all -> 0x02d2 }
            r16 = 1
            r6[r16] = r4     // Catch:{ SQLiteException -> 0x02d6, all -> 0x02d2 }
            java.lang.String r7 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r5 = r5.rawQuery(r7, r6)     // Catch:{ SQLiteException -> 0x02d6, all -> 0x02d2 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x02d0 }
            if (r6 == 0) goto L_0x02c8
        L_0x0299:
            r6 = 0
            int r7 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02d0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x02d0 }
            java.lang.Object r7 = r0.get(r6)     // Catch:{ SQLiteException -> 0x02d0 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SQLiteException -> 0x02d0 }
            if (r7 != 0) goto L_0x02b2
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02d0 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x02d0 }
            r0.put(r6, r7)     // Catch:{ SQLiteException -> 0x02d0 }
        L_0x02b2:
            r6 = 1
            int r17 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02d0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x02d0 }
            r7.add(r6)     // Catch:{ SQLiteException -> 0x02d0 }
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x02d0 }
            if (r6 != 0) goto L_0x0299
        L_0x02c4:
            r5.close()
            goto L_0x02f2
        L_0x02c8:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x02d0 }
            goto L_0x02c4
        L_0x02cd:
            r0 = move-exception
            goto L_0x0452
        L_0x02d0:
            r0 = move-exception
            goto L_0x02d8
        L_0x02d2:
            r0 = move-exception
            r5 = 0
            goto L_0x0452
        L_0x02d6:
            r0 = move-exception
            r5 = 0
        L_0x02d8:
            com.google.android.gms.measurement.internal.l5 r3 = r3.f10651a     // Catch:{ all -> 0x02cd }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()     // Catch:{ all -> 0x02cd }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()     // Catch:{ all -> 0x02cd }
            java.lang.String r6 = "Database error querying scoped filters. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r4)     // Catch:{ all -> 0x02cd }
            r3.mo12478c(r6, r4, r0)     // Catch:{ all -> 0x02cd }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x02cd }
            if (r5 == 0) goto L_0x02f2
            goto L_0x02c4
        L_0x02f2:
            com.google.android.gms.common.internal.C3705r.m14342g(r1)
            com.google.android.gms.common.internal.C3705r.m14346k(r13)
            c.f.a r1 = new c.f.a
            r1.<init>()
            boolean r3 = r13.isEmpty()
            if (r3 == 0) goto L_0x0307
        L_0x0303:
            r21 = r8
            goto L_0x0450
        L_0x0307:
            java.util.Set r3 = r13.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x030f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0303
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r13.get(r5)
            e.f.a.c.f.g.a5 r6 = (p174e.p319f.p320a.p335c.p345f.p352g.C6698a5) r6
            java.lang.Object r7 = r0.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x043f
            boolean r17 = r7.isEmpty()
            if (r17 == 0) goto L_0x0339
            goto L_0x043f
        L_0x0339:
            com.google.android.gms.measurement.internal.pa r5 = r10.f10552b
            com.google.android.gms.measurement.internal.ra r5 = r5.mo12287g0()
            r17 = r0
            java.util.List r0 = r6.mo19506H()
            java.util.List r0 = r5.mo12394G(r0, r7)
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x043b
            e.f.a.c.f.g.x8 r5 = r6.mo19526u()
            e.f.a.c.f.g.z4 r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C7103z4) r5
            r5.mo20471z()
            r5.mo20467v(r0)
            com.google.android.gms.measurement.internal.pa r0 = r10.f10552b
            com.google.android.gms.measurement.internal.ra r0 = r0.mo12287g0()
            r20 = r3
            java.util.List r3 = r6.mo19508J()
            java.util.List r0 = r0.mo12394G(r3, r7)
            r5.mo20463C()
            r5.mo20469x(r0)
            p174e.p319f.p320a.p335c.p345f.p352g.C6791fd.m25716b()
            com.google.android.gms.measurement.internal.l5 r0 = r10.f10651a
            com.google.android.gms.measurement.internal.h r0 = r0.mo12181z()
            com.google.android.gms.measurement.internal.l3 r3 = com.google.android.gms.measurement.internal.C3966m3.f10969J0
            r21 = r8
            r8 = 0
            boolean r0 = r0.mo12010B(r8, r3)
            if (r0 == 0) goto L_0x03ef
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r3 = r6.mo19505G()
            java.util.Iterator r3 = r3.iterator()
        L_0x0392:
            boolean r22 = r3.hasNext()
            if (r22 == 0) goto L_0x03b7
            java.lang.Object r22 = r3.next()
            r8 = r22
            e.f.a.c.f.g.i4 r8 = (p174e.p319f.p320a.p335c.p345f.p352g.C6831i4) r8
            int r22 = r8.mo19838x()
            r23 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            boolean r3 = r7.contains(r3)
            if (r3 != 0) goto L_0x03b3
            r0.add(r8)
        L_0x03b3:
            r3 = r23
            r8 = 0
            goto L_0x0392
        L_0x03b7:
            r5.mo20470y()
            r5.mo20466u(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r3 = r6.mo19507I()
            java.util.Iterator r3 = r3.iterator()
        L_0x03ca:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x03e8
            java.lang.Object r6 = r3.next()
            e.f.a.c.f.g.c5 r6 = (p174e.p319f.p320a.p335c.p345f.p352g.C6732c5) r6
            int r8 = r6.mo19613y()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r8 = r7.contains(r8)
            if (r8 != 0) goto L_0x03ca
            r0.add(r6)
            goto L_0x03ca
        L_0x03e8:
            r5.mo20462B()
            r5.mo20468w(r0)
            goto L_0x042d
        L_0x03ef:
            r0 = 0
        L_0x03f0:
            int r3 = r6.mo19509x()
            if (r0 >= r3) goto L_0x040e
            e.f.a.c.f.g.i4 r3 = r6.mo19503B(r0)
            int r3 = r3.mo19838x()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L_0x040b
            r5.mo20464D(r0)
        L_0x040b:
            int r0 = r0 + 1
            goto L_0x03f0
        L_0x040e:
            r0 = 0
        L_0x040f:
            int r3 = r6.mo19511z()
            if (r0 >= r3) goto L_0x042d
            e.f.a.c.f.g.c5 r3 = r6.mo19504F(r0)
            int r3 = r3.mo19613y()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L_0x042a
            r5.mo20465F(r0)
        L_0x042a:
            int r0 = r0 + 1
            goto L_0x040f
        L_0x042d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            e.f.a.c.f.g.a9 r3 = r5.mo20436r()
            e.f.a.c.f.g.a5 r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C6698a5) r3
            r1.put(r0, r3)
            goto L_0x0448
        L_0x043b:
            r0 = r17
            goto L_0x030f
        L_0x043f:
            r17 = r0
            r20 = r3
            r21 = r8
            r1.put(r5, r6)
        L_0x0448:
            r0 = r17
            r3 = r20
            r8 = r21
            goto L_0x030f
        L_0x0450:
            r0 = r1
            goto L_0x045b
        L_0x0452:
            if (r5 == 0) goto L_0x0457
            r5.close()
        L_0x0457:
            throw r0
        L_0x0458:
            r21 = r8
            r0 = r13
        L_0x045b:
            java.util.Iterator r17 = r2.iterator()
        L_0x045f:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x05f8
            java.lang.Object r1 = r17.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r20 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r0.get(r1)
            e.f.a.c.f.g.a5 r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6698a5) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            c.f.a r7 = new c.f.a
            r7.<init>()
            if (r1 == 0) goto L_0x04c7
            int r2 = r1.mo19509x()
            if (r2 != 0) goto L_0x0491
            goto L_0x04c7
        L_0x0491:
            java.util.List r2 = r1.mo19505G()
            java.util.Iterator r2 = r2.iterator()
        L_0x0499:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04c7
            java.lang.Object r3 = r2.next()
            e.f.a.c.f.g.i4 r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C6831i4) r3
            boolean r4 = r3.mo19837E()
            if (r4 == 0) goto L_0x0499
            int r4 = r3.mo19838x()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r8 = r3.mo19836D()
            if (r8 == 0) goto L_0x04c2
            long r22 = r3.mo19839y()
            java.lang.Long r3 = java.lang.Long.valueOf(r22)
            goto L_0x04c3
        L_0x04c2:
            r3 = 0
        L_0x04c3:
            r7.put(r4, r3)
            goto L_0x0499
        L_0x04c7:
            c.f.a r8 = new c.f.a
            r8.<init>()
            if (r1 == 0) goto L_0x0513
            int r2 = r1.mo19511z()
            if (r2 != 0) goto L_0x04d5
            goto L_0x0513
        L_0x04d5:
            java.util.List r2 = r1.mo19507I()
            java.util.Iterator r2 = r2.iterator()
        L_0x04dd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0513
            java.lang.Object r3 = r2.next()
            e.f.a.c.f.g.c5 r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C6732c5) r3
            boolean r4 = r3.mo19611F()
            if (r4 == 0) goto L_0x04dd
            int r4 = r3.mo19612x()
            if (r4 <= 0) goto L_0x04dd
            int r4 = r3.mo19613y()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r22 = r3.mo19612x()
            r23 = r0
            int r0 = r22 + -1
            long r24 = r3.mo19614z(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r24)
            r8.put(r4, r0)
            r0 = r23
            goto L_0x04dd
        L_0x0513:
            r23 = r0
            if (r1 == 0) goto L_0x0562
            r0 = 0
        L_0x0518:
            int r2 = r1.mo19502A()
            int r2 = r2 * 64
            if (r0 >= r2) goto L_0x0562
            java.util.List r2 = r1.mo19508J()
            boolean r2 = com.google.android.gms.measurement.internal.C4033ra.m15284L(r2, r0)
            if (r2 == 0) goto L_0x0554
            com.google.android.gms.measurement.internal.l5 r2 = r10.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12548v()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r22 = r9
            java.lang.String r9 = "Filter already evaluated. audience ID, filter ID"
            r2.mo12478c(r9, r3, r4)
            r6.set(r0)
            java.util.List r2 = r1.mo19506H()
            boolean r2 = com.google.android.gms.measurement.internal.C4033ra.m15284L(r2, r0)
            if (r2 == 0) goto L_0x0556
            r5.set(r0)
            goto L_0x055d
        L_0x0554:
            r22 = r9
        L_0x0556:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.remove(r2)
        L_0x055d:
            int r0 = r0 + 1
            r9 = r22
            goto L_0x0518
        L_0x0562:
            r22 = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r13.get(r0)
            r4 = r1
            e.f.a.c.f.g.a5 r4 = (p174e.p319f.p320a.p335c.p345f.p352g.C6698a5) r4
            if (r15 == 0) goto L_0x05cf
            if (r14 == 0) goto L_0x05cf
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x05cf
            java.lang.Long r1 = r10.f10530h
            if (r1 == 0) goto L_0x05cf
            java.lang.Long r1 = r10.f10529g
            if (r1 != 0) goto L_0x0584
            goto L_0x05cf
        L_0x0584:
            java.util.Iterator r0 = r0.iterator()
        L_0x0588:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05cf
            java.lang.Object r1 = r0.next()
            e.f.a.c.f.g.a3 r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6696a3) r1
            int r2 = r1.mo19499y()
            java.lang.Long r3 = r10.f10530h
            long r24 = r3.longValue()
            r26 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r26
            boolean r1 = r1.mo19492I()
            if (r1 == 0) goto L_0x05b0
            java.lang.Long r1 = r10.f10529g
            long r24 = r1.longValue()
            long r24 = r24 / r26
        L_0x05b0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r2 = r7.containsKey(r1)
            if (r2 == 0) goto L_0x05c1
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r7.put(r1, r2)
        L_0x05c1:
            boolean r2 = r8.containsKey(r1)
            if (r2 == 0) goto L_0x0588
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r8.put(r1, r2)
            goto L_0x0588
        L_0x05cf:
            com.google.android.gms.measurement.internal.gb r0 = new com.google.android.gms.measurement.internal.gb
            java.lang.String r3 = r10.f10526d
            r9 = 0
            r1 = r0
            r2 = r64
            r28 = r18
            r29 = r19
            r16 = r12
            r12 = r21
            r65 = r13
            r13 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Map r1 = r10.f10528f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1.put(r2, r0)
            r9 = r13
            r12 = r16
            r0 = r23
            r13 = r65
            goto L_0x045f
        L_0x05f8:
            r13 = r9
            r28 = r18
            r29 = r19
            r12 = r21
        L_0x05ff:
            boolean r0 = r66.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 == 0) goto L_0x060b
        L_0x0607:
            r24 = r11
            goto L_0x0862
        L_0x060b:
            com.google.android.gms.measurement.internal.ib r2 = new com.google.android.gms.measurement.internal.ib
            r3 = 0
            r2.<init>(r10, r3)
            c.f.a r4 = new c.f.a
            r4.<init>()
            java.util.Iterator r5 = r66.iterator()
        L_0x061a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0607
            java.lang.Object r0 = r5.next()
            e.f.a.c.f.g.k4 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r0
            java.lang.String r6 = r10.f10526d
            e.f.a.c.f.g.k4 r6 = r2.mo12115a(r6, r0)
            if (r6 == 0) goto L_0x061a
            com.google.android.gms.measurement.internal.pa r7 = r10.f10552b
            com.google.android.gms.measurement.internal.n r7 = r7.mo12277W()
            java.lang.String r8 = r10.f10526d
            java.lang.String r9 = r6.mo19916E()
            java.lang.String r14 = r0.mo19916E()
            com.google.android.gms.measurement.internal.t r14 = r7.mo12208V(r8, r14)
            if (r14 != 0) goto L_0x0683
            com.google.android.gms.measurement.internal.l5 r14 = r7.f10651a
            com.google.android.gms.measurement.internal.z3 r14 = r14.mo11935b()
            com.google.android.gms.measurement.internal.x3 r14 = r14.mo12549w()
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r8)
            com.google.android.gms.measurement.internal.l5 r7 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo12152D()
            java.lang.String r7 = r7.mo12438d(r9)
            java.lang.String r9 = "Event aggregate wasn't created during raw event logging. appId, event"
            r14.mo12478c(r9, r15, r7)
            com.google.android.gms.measurement.internal.t r7 = new com.google.android.gms.measurement.internal.t
            r30 = r7
            java.lang.String r32 = r0.mo19916E()
            r33 = 1
            r35 = 1
            r37 = 1
            long r39 = r0.mo19914A()
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r31 = r8
            r30.<init>(r31, r32, r33, r35, r37, r39, r41, r43, r44, r45, r46)
            goto L_0x06b8
        L_0x0683:
            com.google.android.gms.measurement.internal.t r7 = new com.google.android.gms.measurement.internal.t
            r47 = r7
            java.lang.String r0 = r14.f11282a
            r48 = r0
            java.lang.String r0 = r14.f11283b
            r49 = r0
            long r8 = r14.f11284c
            r15 = 1
            long r50 = r8 + r15
            long r8 = r14.f11285d
            long r52 = r8 + r15
            long r8 = r14.f11286e
            long r54 = r8 + r15
            long r8 = r14.f11287f
            r56 = r8
            long r8 = r14.f11288g
            r58 = r8
            java.lang.Long r0 = r14.f11289h
            r60 = r0
            java.lang.Long r0 = r14.f11290i
            r61 = r0
            java.lang.Long r0 = r14.f11291j
            r62 = r0
            java.lang.Boolean r0 = r14.f11292k
            r63 = r0
            r47.<init>(r48, r49, r50, r52, r54, r56, r58, r60, r61, r62, r63)
        L_0x06b8:
            com.google.android.gms.measurement.internal.pa r0 = r10.f10552b
            com.google.android.gms.measurement.internal.n r0 = r0.mo12277W()
            r0.mo12224q(r7)
            long r8 = r7.f11284c
            java.lang.String r14 = r6.mo19916E()
            java.lang.Object r0 = r4.get(r14)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x07c3
            com.google.android.gms.measurement.internal.pa r0 = r10.f10552b
            com.google.android.gms.measurement.internal.n r15 = r0.mo12277W()
            java.lang.String r3 = r10.f10526d
            r15.mo11893i()
            r15.mo11931h()
            com.google.android.gms.common.internal.C3705r.m14342g(r3)
            com.google.android.gms.common.internal.C3705r.m14342g(r14)
            r65 = r2
            c.f.a r2 = new c.f.a
            r2.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r15.mo12202P()
            r66 = r5
            r24 = r11
            r11 = r28
            r5 = r29
            java.lang.String[] r18 = new java.lang.String[]{r11, r5}     // Catch:{ SQLiteException -> 0x0799, all -> 0x0796 }
            r29 = r5
            r5 = 2
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0794, all -> 0x0796 }
            r17 = 0
            r0[r17] = r3     // Catch:{ SQLiteException -> 0x0794, all -> 0x0796 }
            r17 = 1
            r0[r17] = r14     // Catch:{ SQLiteException -> 0x0794, all -> 0x0796 }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=? AND event_name=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0794, all -> 0x0796 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x078e }
            if (r0 == 0) goto L_0x077e
            r28 = r11
        L_0x071f:
            r11 = 1
            byte[] r0 = r5.getBlob(r11)     // Catch:{ SQLiteException -> 0x077a }
            e.f.a.c.f.g.z2 r11 = p174e.p319f.p320a.p335c.p345f.p352g.C6696a3.m25362z()     // Catch:{ IOException -> 0x0758 }
            e.f.a.c.f.g.fa r0 = com.google.android.gms.measurement.internal.C4033ra.m15282C(r11, r0)     // Catch:{ IOException -> 0x0758 }
            e.f.a.c.f.g.z2 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C7101z2) r0     // Catch:{ IOException -> 0x0758 }
            e.f.a.c.f.g.a9 r0 = r0.mo20436r()     // Catch:{ IOException -> 0x0758 }
            e.f.a.c.f.g.a3 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6696a3) r0     // Catch:{ IOException -> 0x0758 }
            r11 = 0
            int r16 = r5.getInt(r11)     // Catch:{ SQLiteException -> 0x077a }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x077a }
            java.lang.Object r16 = r2.get(r11)     // Catch:{ SQLiteException -> 0x077a }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x077a }
            if (r16 != 0) goto L_0x0750
            r22 = r7
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x078a }
            r7.<init>()     // Catch:{ SQLiteException -> 0x078a }
            r2.put(r11, r7)     // Catch:{ SQLiteException -> 0x078a }
            goto L_0x0754
        L_0x0750:
            r22 = r7
            r7 = r16
        L_0x0754:
            r7.add(r0)     // Catch:{ SQLiteException -> 0x078a }
            goto L_0x076c
        L_0x0758:
            r0 = move-exception
            r22 = r7
            com.google.android.gms.measurement.internal.l5 r7 = r15.f10651a     // Catch:{ SQLiteException -> 0x078a }
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo11935b()     // Catch:{ SQLiteException -> 0x078a }
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo12544r()     // Catch:{ SQLiteException -> 0x078a }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)     // Catch:{ SQLiteException -> 0x078a }
            r7.mo12478c(r13, r11, r0)     // Catch:{ SQLiteException -> 0x078a }
        L_0x076c:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x078a }
            if (r0 != 0) goto L_0x0777
            r5.close()
            r0 = r2
            goto L_0x07b9
        L_0x0777:
            r7 = r22
            goto L_0x071f
        L_0x077a:
            r0 = move-exception
            r22 = r7
            goto L_0x07a1
        L_0x077e:
            r22 = r7
            r28 = r11
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x078a }
        L_0x0786:
            r5.close()
            goto L_0x07b9
        L_0x078a:
            r0 = move-exception
            goto L_0x07a1
        L_0x078c:
            r0 = move-exception
            goto L_0x07bd
        L_0x078e:
            r0 = move-exception
            r22 = r7
            r28 = r11
            goto L_0x07a1
        L_0x0794:
            r0 = move-exception
            goto L_0x079c
        L_0x0796:
            r0 = move-exception
            r5 = 0
            goto L_0x07bd
        L_0x0799:
            r0 = move-exception
            r29 = r5
        L_0x079c:
            r22 = r7
            r28 = r11
            r5 = 0
        L_0x07a1:
            com.google.android.gms.measurement.internal.l5 r2 = r15.f10651a     // Catch:{ all -> 0x078c }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ all -> 0x078c }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x078c }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)     // Catch:{ all -> 0x078c }
            r2.mo12478c(r12, r3, r0)     // Catch:{ all -> 0x078c }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x078c }
            if (r5 == 0) goto L_0x07b9
            goto L_0x0786
        L_0x07b9:
            r4.put(r14, r0)
            goto L_0x07cb
        L_0x07bd:
            if (r5 == 0) goto L_0x07c2
            r5.close()
        L_0x07c2:
            throw r0
        L_0x07c3:
            r65 = r2
            r66 = r5
            r22 = r7
            r24 = r11
        L_0x07cb:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x07d3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0859
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.util.Set r5 = r10.f10527e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r5 = r5.contains(r7)
            if (r5 == 0) goto L_0x07fd
            com.google.android.gms.measurement.internal.l5 r3 = r10.f10651a
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12548v()
            r3.mo12477b(r1, r7)
            goto L_0x07d3
        L_0x07fd:
            java.lang.Object r5 = r0.get(r7)
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
            r7 = 1
        L_0x0808:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x084c
            java.lang.Object r7 = r5.next()
            e.f.a.c.f.g.a3 r7 = (p174e.p319f.p320a.p335c.p345f.p352g.C6696a3) r7
            com.google.android.gms.measurement.internal.jb r11 = new com.google.android.gms.measurement.internal.jb
            java.lang.String r14 = r10.f10526d
            r11.<init>(r10, r14, r3, r7)
            java.lang.Long r15 = r10.f10529g
            java.lang.Long r14 = r10.f10530h
            int r7 = r7.mo19499y()
            boolean r21 = r10.m14634o(r3, r7)
            r7 = r14
            r14 = r11
            r16 = r7
            r17 = r6
            r18 = r8
            r20 = r22
            boolean r7 = r14.mo12138k(r15, r16, r17, r18, r20, r21)
            if (r7 == 0) goto L_0x0843
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.measurement.internal.gb r14 = r10.m14633n(r14)
            r14.mo12008c(r11)
            goto L_0x0808
        L_0x0843:
            java.util.Set r5 = r10.f10527e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r5.add(r11)
        L_0x084c:
            if (r7 != 0) goto L_0x07d3
            java.util.Set r5 = r10.f10527e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.add(r3)
            goto L_0x07d3
        L_0x0859:
            r2 = r65
            r5 = r66
            r11 = r24
            r3 = 0
            goto L_0x061a
        L_0x0862:
            boolean r0 = r67.isEmpty()
            if (r0 == 0) goto L_0x086c
        L_0x0868:
            r11 = r28
            goto L_0x0a9c
        L_0x086c:
            c.f.a r2 = new c.f.a
            r2.<init>()
            java.util.Iterator r3 = r67.iterator()
        L_0x0875:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0868
            java.lang.Object r0 = r3.next()
            r4 = r0
            e.f.a.c.f.g.e5 r4 = (p174e.p319f.p320a.p335c.p345f.p352g.C6766e5) r4
            java.lang.String r5 = r4.mo19696C()
            java.lang.Object r0 = r2.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0968
            com.google.android.gms.measurement.internal.pa r0 = r10.f10552b
            com.google.android.gms.measurement.internal.n r6 = r0.mo12277W()
            java.lang.String r7 = r10.f10526d
            r6.mo11893i()
            r6.mo11931h()
            com.google.android.gms.common.internal.C3705r.m14342g(r7)
            com.google.android.gms.common.internal.C3705r.m14342g(r5)
            c.f.a r8 = new c.f.a
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r13 = r6.mo12202P()
            r11 = r28
            r9 = r29
            java.lang.String[] r15 = new java.lang.String[]{r11, r9}     // Catch:{ SQLiteException -> 0x0940, all -> 0x093d }
            r14 = 2
            java.lang.String[] r0 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x0940, all -> 0x093d }
            r14 = 0
            r0[r14] = r7     // Catch:{ SQLiteException -> 0x0940, all -> 0x093d }
            r14 = 1
            r0[r14] = r5     // Catch:{ SQLiteException -> 0x0940, all -> 0x093d }
            java.lang.String r14 = "property_filters"
            java.lang.String r16 = "app_id=? AND property_name=?"
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r0
            android.database.Cursor r13 = r13.query(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x0940, all -> 0x093d }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0939 }
            if (r0 == 0) goto L_0x092d
        L_0x08d2:
            r14 = 1
            byte[] r0 = r13.getBlob(r14)     // Catch:{ SQLiteException -> 0x0939 }
            e.f.a.c.f.g.i3 r15 = p174e.p319f.p320a.p335c.p345f.p352g.C6846j3.m25937z()     // Catch:{ IOException -> 0x0909 }
            e.f.a.c.f.g.fa r0 = com.google.android.gms.measurement.internal.C4033ra.m15282C(r15, r0)     // Catch:{ IOException -> 0x0909 }
            e.f.a.c.f.g.i3 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6830i3) r0     // Catch:{ IOException -> 0x0909 }
            e.f.a.c.f.g.a9 r0 = r0.mo20436r()     // Catch:{ IOException -> 0x0909 }
            e.f.a.c.f.g.j3 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6846j3) r0     // Catch:{ IOException -> 0x0909 }
            r15 = 0
            int r16 = r13.getInt(r15)     // Catch:{ SQLiteException -> 0x0939 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x0939 }
            java.lang.Object r16 = r8.get(r14)     // Catch:{ SQLiteException -> 0x0939 }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x0939 }
            if (r16 != 0) goto L_0x0901
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0939 }
            r15.<init>()     // Catch:{ SQLiteException -> 0x0939 }
            r8.put(r14, r15)     // Catch:{ SQLiteException -> 0x0939 }
            goto L_0x0903
        L_0x0901:
            r15 = r16
        L_0x0903:
            r15.add(r0)     // Catch:{ SQLiteException -> 0x0939 }
            r65 = r3
            goto L_0x091f
        L_0x0909:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l5 r14 = r6.f10651a     // Catch:{ SQLiteException -> 0x0939 }
            com.google.android.gms.measurement.internal.z3 r14 = r14.mo11935b()     // Catch:{ SQLiteException -> 0x0939 }
            com.google.android.gms.measurement.internal.x3 r14 = r14.mo12544r()     // Catch:{ SQLiteException -> 0x0939 }
            java.lang.String r15 = "Failed to merge filter"
            r65 = r3
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r7)     // Catch:{ SQLiteException -> 0x0937 }
            r14.mo12478c(r15, r3, r0)     // Catch:{ SQLiteException -> 0x0937 }
        L_0x091f:
            boolean r0 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x0937 }
            if (r0 != 0) goto L_0x092a
            r13.close()
            r0 = r8
            goto L_0x095c
        L_0x092a:
            r3 = r65
            goto L_0x08d2
        L_0x092d:
            r65 = r3
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0937 }
        L_0x0933:
            r13.close()
            goto L_0x095c
        L_0x0937:
            r0 = move-exception
            goto L_0x0944
        L_0x0939:
            r0 = move-exception
            r65 = r3
            goto L_0x0944
        L_0x093d:
            r0 = move-exception
            r5 = 0
            goto L_0x0962
        L_0x0940:
            r0 = move-exception
            r65 = r3
            r13 = 0
        L_0x0944:
            com.google.android.gms.measurement.internal.l5 r3 = r6.f10651a     // Catch:{ all -> 0x0960 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()     // Catch:{ all -> 0x0960 }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()     // Catch:{ all -> 0x0960 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r7)     // Catch:{ all -> 0x0960 }
            r3.mo12478c(r12, r6, r0)     // Catch:{ all -> 0x0960 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0960 }
            if (r13 == 0) goto L_0x095c
            goto L_0x0933
        L_0x095c:
            r2.put(r5, r0)
            goto L_0x096e
        L_0x0960:
            r0 = move-exception
            r5 = r13
        L_0x0962:
            if (r5 == 0) goto L_0x0967
            r5.close()
        L_0x0967:
            throw r0
        L_0x0968:
            r65 = r3
            r11 = r28
            r9 = r29
        L_0x096e:
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0976:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0a94
            java.lang.Object r5 = r3.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Set r6 = r10.f10527e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x09a1
            com.google.android.gms.measurement.internal.l5 r0 = r10.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12548v()
            r0.mo12477b(r1, r7)
            goto L_0x0a94
        L_0x09a1:
            java.lang.Object r6 = r0.get(r7)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 1
        L_0x09ac:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0a83
            java.lang.Object r7 = r6.next()
            e.f.a.c.f.g.j3 r7 = (p174e.p319f.p320a.p335c.p345f.p352g.C6846j3) r7
            com.google.android.gms.measurement.internal.l5 r8 = r10.f10651a
            com.google.android.gms.measurement.internal.z3 r8 = r8.mo11935b()
            java.lang.String r8 = r8.mo12541C()
            r13 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r13)
            if (r8 == 0) goto L_0x0a16
            com.google.android.gms.measurement.internal.l5 r8 = r10.f10651a
            com.google.android.gms.measurement.internal.z3 r8 = r8.mo11935b()
            com.google.android.gms.measurement.internal.x3 r8 = r8.mo12548v()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r15 = r7.mo19854G()
            if (r15 == 0) goto L_0x09e6
            int r15 = r7.mo19856x()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x09e7
        L_0x09e6:
            r15 = 0
        L_0x09e7:
            com.google.android.gms.measurement.internal.l5 r13 = r10.f10651a
            com.google.android.gms.measurement.internal.u3 r13 = r13.mo12152D()
            r66 = r0
            java.lang.String r0 = r7.mo19850B()
            java.lang.String r0 = r13.mo12440f(r0)
            java.lang.String r13 = "Evaluating filter. audience, filter, property"
            r8.mo12479d(r13, r14, r15, r0)
            com.google.android.gms.measurement.internal.l5 r0 = r10.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12548v()
            com.google.android.gms.measurement.internal.pa r8 = r10.f10552b
            com.google.android.gms.measurement.internal.ra r8 = r8.mo12287g0()
            java.lang.String r8 = r8.mo12393F(r7)
            java.lang.String r13 = "Filter definition"
            r0.mo12477b(r13, r8)
            goto L_0x0a18
        L_0x0a16:
            r66 = r0
        L_0x0a18:
            boolean r0 = r7.mo19854G()
            if (r0 == 0) goto L_0x0a59
            int r0 = r7.mo19856x()
            r8 = 256(0x100, float:3.59E-43)
            if (r0 <= r8) goto L_0x0a27
            goto L_0x0a59
        L_0x0a27:
            com.google.android.gms.measurement.internal.lb r0 = new com.google.android.gms.measurement.internal.lb
            java.lang.String r8 = r10.f10526d
            r0.<init>(r10, r8, r5, r7)
            java.lang.Long r8 = r10.f10529g
            java.lang.Long r13 = r10.f10530h
            int r7 = r7.mo19856x()
            boolean r7 = r10.m14634o(r5, r7)
            boolean r7 = r0.mo12185k(r8, r13, r4, r7)
            if (r7 == 0) goto L_0x0a4f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            com.google.android.gms.measurement.internal.gb r8 = r10.m14633n(r8)
            r8.mo12008c(r0)
            r0 = r66
            goto L_0x09ac
        L_0x0a4f:
            java.util.Set r0 = r10.f10527e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r0.add(r6)
            goto L_0x0a85
        L_0x0a59:
            com.google.android.gms.measurement.internal.l5 r0 = r10.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12549w()
            java.lang.String r6 = r10.f10526d
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r6)
            boolean r8 = r7.mo19854G()
            if (r8 == 0) goto L_0x0a78
            int r7 = r7.mo19856x()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0a79
        L_0x0a78:
            r7 = 0
        L_0x0a79:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Invalid property filter ID. appId, id"
            r0.mo12478c(r8, r6, r7)
            goto L_0x0a87
        L_0x0a83:
            r66 = r0
        L_0x0a85:
            if (r7 != 0) goto L_0x0a90
        L_0x0a87:
            java.util.Set r0 = r10.f10527e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
        L_0x0a90:
            r0 = r66
            goto L_0x0976
        L_0x0a94:
            r3 = r65
            r29 = r9
            r28 = r11
            goto L_0x0875
        L_0x0a9c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r0 = r10.f10528f
            java.util.Set r0 = r0.keySet()
            java.util.Set r2 = r10.f10527e
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0ab0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b45
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map r3 = r10.f10528f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.measurement.internal.gb r3 = (com.google.android.gms.measurement.internal.C3896gb) r3
            com.google.android.gms.common.internal.C3705r.m14346k(r3)
            e.f.a.c.f.g.g4 r0 = r3.mo12007a(r0)
            r1.add(r0)
            com.google.android.gms.measurement.internal.pa r3 = r10.f10552b
            com.google.android.gms.measurement.internal.n r3 = r3.mo12277W()
            java.lang.String r5 = r10.f10526d
            e.f.a.c.f.g.a5 r0 = r0.mo19792A()
            r3.mo11893i()
            r3.mo11931h()
            com.google.android.gms.common.internal.C3705r.m14342g(r5)
            com.google.android.gms.common.internal.C3705r.m14346k(r0)
            byte[] r0 = r0.mo19840k()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            r6.put(r11, r4)
            r4 = r24
            r6.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.mo12202P()     // Catch:{ SQLiteException -> 0x0b2c }
            java.lang.String r7 = "audience_filter_values"
            r8 = 5
            r9 = 0
            long r6 = r0.insertWithOnConflict(r7, r9, r6, r8)     // Catch:{ SQLiteException -> 0x0b2a }
            r12 = -1
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0b41
            com.google.android.gms.measurement.internal.l5 r0 = r3.f10651a     // Catch:{ SQLiteException -> 0x0b2a }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ SQLiteException -> 0x0b2a }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12544r()     // Catch:{ SQLiteException -> 0x0b2a }
            java.lang.String r6 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r5)     // Catch:{ SQLiteException -> 0x0b2a }
            r0.mo12477b(r6, r7)     // Catch:{ SQLiteException -> 0x0b2a }
            goto L_0x0b41
        L_0x0b2a:
            r0 = move-exception
            goto L_0x0b2e
        L_0x0b2c:
            r0 = move-exception
            r9 = 0
        L_0x0b2e:
            com.google.android.gms.measurement.internal.l5 r3 = r3.f10651a
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r5)
            java.lang.String r6 = "Error storing filter results. appId"
            r3.mo12478c(r6, r5, r0)
        L_0x0b41:
            r24 = r4
            goto L_0x0ab0
        L_0x0b45:
            return r1
        L_0x0b46:
            r0 = move-exception
            r5 = r4
        L_0x0b48:
            if (r5 == 0) goto L_0x0b4d
            r5.close()
        L_0x0b4d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3819b.mo11857m(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
