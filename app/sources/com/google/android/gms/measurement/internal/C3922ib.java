package com.google.android.gms.measurement.internal;

import p174e.p319f.p320a.p335c.p345f.p352g.C6863k4;

/* renamed from: com.google.android.gms.measurement.internal.ib */
final class C3922ib {

    /* renamed from: a */
    private C6863k4 f10807a;

    /* renamed from: b */
    private Long f10808b;

    /* renamed from: c */
    private long f10809c;

    /* renamed from: d */
    final /* synthetic */ C3819b f10810d;

    /* synthetic */ C3922ib(C3819b bVar, C3909hb hbVar) {
        this.f10810d = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        if (r14 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p174e.p319f.p320a.p335c.p345f.p352g.C6863k4 mo12115a(java.lang.String r18, p174e.p319f.p320a.p335c.p345f.p352g.C6863k4 r19) {
        /*
            r17 = this;
            r1 = r17
            r3 = r18
            r8 = r19
            java.lang.String r0 = r19.mo19916E()
            java.util.List r9 = r19.mo19917F()
            com.google.android.gms.measurement.internal.b r2 = r1.f10810d
            com.google.android.gms.measurement.internal.pa r2 = r2.f10552b
            r2.mo12287g0()
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4033ra.m15289o(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0233
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01e6
            com.google.android.gms.common.internal.C3705r.m14346k(r4)
            com.google.android.gms.measurement.internal.b r0 = r1.f10810d
            com.google.android.gms.measurement.internal.pa r0 = r0.f10552b
            r0.mo12287g0()
            java.lang.String r0 = "_en"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C4033ra.m15289o(r8, r0)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r5 = 0
            if (r0 == 0) goto L_0x0055
            com.google.android.gms.measurement.internal.b r0 = r1.f10810d
            com.google.android.gms.measurement.internal.l5 r0 = r0.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12546t()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.mo12477b(r2, r4)
            return r5
        L_0x0055:
            e.f.a.c.f.g.k4 r0 = r1.f10807a
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x006d
            java.lang.Long r0 = r1.f10808b
            if (r0 == 0) goto L_0x006d
            long r13 = r4.longValue()
            java.lang.Long r0 = r1.f10808b
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0127
        L_0x006d:
            com.google.android.gms.measurement.internal.b r0 = r1.f10810d
            com.google.android.gms.measurement.internal.pa r0 = r0.f10552b
            com.google.android.gms.measurement.internal.n r13 = r0.mo12277W()
            r13.mo11931h()
            r13.mo11893i()
            android.database.sqlite.SQLiteDatabase r0 = r13.mo12202P()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14[r12] = r3     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14[r11] = r15     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00e3 }
            if (r0 != 0) goto L_0x00aa
            com.google.android.gms.measurement.internal.l5 r0 = r13.f10651a     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12548v()     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.String r15 = "Main event not found"
            r0.mo12476a(r15)     // Catch:{ SQLiteException -> 0x00e3 }
            r14.close()
            r0 = r5
            goto L_0x0100
        L_0x00aa:
            byte[] r0 = r14.getBlob(r12)     // Catch:{ SQLiteException -> 0x00e3 }
            long r15 = r14.getLong(r11)     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00e3 }
            e.f.a.c.f.g.j4 r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6863k4.m26045B()     // Catch:{ IOException -> 0x00ce }
            e.f.a.c.f.g.fa r0 = com.google.android.gms.measurement.internal.C4033ra.m15282C(r5, r0)     // Catch:{ IOException -> 0x00ce }
            e.f.a.c.f.g.j4 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6847j4) r0     // Catch:{ IOException -> 0x00ce }
            e.f.a.c.f.g.a9 r0 = r0.mo20436r()     // Catch:{ IOException -> 0x00ce }
            e.f.a.c.f.g.k4 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r0     // Catch:{ IOException -> 0x00ce }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00e3 }
            r14.close()
            goto L_0x0100
        L_0x00ce:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l5 r5 = r13.f10651a     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo11935b()     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12544r()     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r18)     // Catch:{ SQLiteException -> 0x00e3 }
            r5.mo12479d(r15, r12, r4, r0)     // Catch:{ SQLiteException -> 0x00e3 }
            goto L_0x00fc
        L_0x00e3:
            r0 = move-exception
            goto L_0x00eb
        L_0x00e5:
            r0 = move-exception
            r5 = 0
            goto L_0x01e0
        L_0x00e9:
            r0 = move-exception
            r14 = 0
        L_0x00eb:
            com.google.android.gms.measurement.internal.l5 r5 = r13.f10651a     // Catch:{ all -> 0x01de }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo11935b()     // Catch:{ all -> 0x01de }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12544r()     // Catch:{ all -> 0x01de }
            java.lang.String r12 = "Error selecting main event"
            r5.mo12477b(r12, r0)     // Catch:{ all -> 0x01de }
            if (r14 == 0) goto L_0x00ff
        L_0x00fc:
            r14.close()
        L_0x00ff:
            r0 = 0
        L_0x0100:
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x0108
            goto L_0x01cb
        L_0x0108:
            e.f.a.c.f.g.k4 r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r5
            r1.f10807a = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            r1.f10809c = r12
            com.google.android.gms.measurement.internal.b r0 = r1.f10810d
            com.google.android.gms.measurement.internal.pa r0 = r0.f10552b
            r0.mo12287g0()
            e.f.a.c.f.g.k4 r0 = r1.f10807a
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C4033ra.m15289o(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f10808b = r0
        L_0x0127:
            long r12 = r1.f10809c
            r14 = -1
            long r12 = r12 + r14
            r1.f10809c = r12
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x016c
            com.google.android.gms.measurement.internal.b r0 = r1.f10810d
            com.google.android.gms.measurement.internal.pa r0 = r0.f10552b
            com.google.android.gms.measurement.internal.n r2 = r0.mo12277W()
            r2.mo11931h()
            com.google.android.gms.measurement.internal.l5 r0 = r2.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12548v()
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.mo12477b(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo12202P()     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x015b }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x015b }
            goto L_0x017d
        L_0x015b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()
            java.lang.String r3 = "Error clearing complex main event"
            r2.mo12477b(r3, r0)
            goto L_0x017d
        L_0x016c:
            com.google.android.gms.measurement.internal.b r0 = r1.f10810d
            com.google.android.gms.measurement.internal.pa r0 = r0.f10552b
            com.google.android.gms.measurement.internal.n r2 = r0.mo12277W()
            long r5 = r1.f10809c
            e.f.a.c.f.g.k4 r7 = r1.f10807a
            r3 = r18
            r2.mo12229v(r3, r4, r5, r7)
        L_0x017d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            e.f.a.c.f.g.k4 r2 = r1.f10807a
            java.util.List r2 = r2.mo19917F()
            java.util.Iterator r2 = r2.iterator()
        L_0x018c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ad
            java.lang.Object r3 = r2.next()
            e.f.a.c.f.g.o4 r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C6927o4) r3
            com.google.android.gms.measurement.internal.b r4 = r1.f10810d
            com.google.android.gms.measurement.internal.pa r4 = r4.f10552b
            r4.mo12287g0()
            java.lang.String r4 = r3.mo20057D()
            e.f.a.c.f.g.o4 r4 = com.google.android.gms.measurement.internal.C4033ra.m15288n(r8, r4)
            if (r4 != 0) goto L_0x018c
            r0.add(r3)
            goto L_0x018c
        L_0x01ad:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01b8
            r0.addAll(r9)
            r9 = r0
            goto L_0x01c9
        L_0x01b8:
            com.google.android.gms.measurement.internal.b r0 = r1.f10810d
            com.google.android.gms.measurement.internal.l5 r0 = r0.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12546t()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.mo12477b(r2, r10)
        L_0x01c9:
            r0 = r10
            goto L_0x0233
        L_0x01cb:
            com.google.android.gms.measurement.internal.b r0 = r1.f10810d
            com.google.android.gms.measurement.internal.l5 r0 = r0.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12546t()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.mo12478c(r2, r10, r4)
            r2 = 0
            return r2
        L_0x01de:
            r0 = move-exception
            r5 = r14
        L_0x01e0:
            if (r5 == 0) goto L_0x01e5
            r5.close()
        L_0x01e5:
            throw r0
        L_0x01e6:
            r1.f10808b = r4
            r1.f10807a = r8
            com.google.android.gms.measurement.internal.b r2 = r1.f10810d
            com.google.android.gms.measurement.internal.pa r2 = r2.f10552b
            r2.mo12287g0()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4033ra.m15289o(r8, r5)
            if (r5 == 0) goto L_0x01fe
            r2 = r5
        L_0x01fe:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.f10809c = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x021c
            com.google.android.gms.measurement.internal.b r2 = r1.f10810d
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12546t()
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.mo12477b(r3, r0)
            goto L_0x0233
        L_0x021c:
            com.google.android.gms.measurement.internal.b r2 = r1.f10810d
            com.google.android.gms.measurement.internal.pa r2 = r2.f10552b
            com.google.android.gms.measurement.internal.n r2 = r2.mo12277W()
            java.lang.Object r4 = com.google.android.gms.common.internal.C3705r.m14346k(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r5 = r1.f10809c
            r3 = r18
            r7 = r19
            r2.mo12229v(r3, r4, r5, r7)
        L_0x0233:
            e.f.a.c.f.g.x8 r2 = r19.mo19526u()
            e.f.a.c.f.g.j4 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C6847j4) r2
            r2.mo19860D(r0)
            r2.mo19858B()
            r2.mo19872x(r9)
            e.f.a.c.f.g.a9 r0 = r2.mo20436r()
            e.f.a.c.f.g.k4 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3922ib.mo12115a(java.lang.String, e.f.a.c.f.g.k4):e.f.a.c.f.g.k4");
    }
}
