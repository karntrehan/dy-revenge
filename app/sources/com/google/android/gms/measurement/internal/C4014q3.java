package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.q3 */
public final class C4014q3 extends C3876f4 {

    /* renamed from: c */
    private String f11187c;

    /* renamed from: d */
    private String f11188d;

    /* renamed from: e */
    private int f11189e;

    /* renamed from: f */
    private String f11190f;

    /* renamed from: g */
    private String f11191g;

    /* renamed from: h */
    private long f11192h;

    /* renamed from: i */
    private final long f11193i;

    /* renamed from: j */
    private List f11194j;

    /* renamed from: k */
    private String f11195k;

    /* renamed from: l */
    private int f11196l;

    /* renamed from: m */
    private String f11197m;

    /* renamed from: n */
    private String f11198n;

    /* renamed from: o */
    private String f11199o;

    /* renamed from: p */
    private long f11200p = 0;

    /* renamed from: q */
    private String f11201q = null;

    C4014q3(C3955l5 l5Var, long j) {
        super(l5Var);
        this.f11193i = j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0142 A[Catch:{ IllegalStateException -> 0x0192 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014b A[Catch:{ IllegalStateException -> 0x0192 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0173 A[Catch:{ IllegalStateException -> 0x0192 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0203  */
    @p497j.p498a.p499a.p500a.p501a.C10675a
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11952l() {
        /*
            r11 = this;
            com.google.android.gms.measurement.internal.l5 r0 = r11.f10651a
            android.content.Context r0 = r0.mo11938f()
            java.lang.String r0 = r0.getPackageName()
            com.google.android.gms.measurement.internal.l5 r1 = r11.f10651a
            android.content.Context r1 = r1.mo11938f()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r6 = "unknown"
            if (r1 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.l5 r7 = r11.f10651a
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo11935b()
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo12544r()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo12477b(r9, r8)
        L_0x0032:
            r8 = r2
            goto L_0x009b
        L_0x0035:
            java.lang.String r6 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x003a }
            goto L_0x004d
        L_0x003a:
            com.google.android.gms.measurement.internal.l5 r7 = r11.f10651a
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo11935b()
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo12544r()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo12477b(r9, r8)
        L_0x004d:
            if (r6 != 0) goto L_0x0052
            java.lang.String r6 = "manual_install"
            goto L_0x005b
        L_0x0052:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x005b
            r6 = r4
        L_0x005b:
            com.google.android.gms.measurement.internal.l5 r7 = r11.f10651a     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.Context r7 = r7.mo11938f()     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r7 == 0) goto L_0x0032
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r9 != 0) goto L_0x007c
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0085 }
            goto L_0x007d
        L_0x007c:
            r8 = r2
        L_0x007d:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0082 }
            int r3 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0082 }
            goto L_0x009b
        L_0x0082:
            r7 = r2
            r2 = r8
            goto L_0x0086
        L_0x0085:
            r7 = r2
        L_0x0086:
            com.google.android.gms.measurement.internal.l5 r8 = r11.f10651a
            com.google.android.gms.measurement.internal.z3 r8 = r8.mo11935b()
            com.google.android.gms.measurement.internal.x3 r8 = r8.mo12544r()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo12478c(r10, r9, r2)
            r8 = r2
            r2 = r7
        L_0x009b:
            r11.f11187c = r0
            r11.f11190f = r6
            r11.f11188d = r2
            r11.f11189e = r3
            r11.f11191g = r8
            r2 = 0
            r11.f11192h = r2
            com.google.android.gms.measurement.internal.l5 r2 = r11.f10651a
            java.lang.String r2 = r2.mo12162O()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto L_0x00c6
            com.google.android.gms.measurement.internal.l5 r2 = r11.f10651a
            java.lang.String r2 = r2.mo12163P()
            java.lang.String r6 = "am"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x00c6
            r2 = 1
            goto L_0x00c7
        L_0x00c6:
            r2 = 0
        L_0x00c7:
            com.google.android.gms.measurement.internal.l5 r6 = r11.f10651a
            int r6 = r6.mo12179x()
            com.google.android.gms.measurement.internal.l5 r7 = r11.f10651a
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo11935b()
            switch(r6) {
                case 0: goto L_0x010e;
                case 1: goto L_0x0107;
                case 2: goto L_0x0100;
                case 3: goto L_0x00f9;
                case 4: goto L_0x00f2;
                case 5: goto L_0x00eb;
                case 6: goto L_0x00e4;
                case 7: goto L_0x00dd;
                default: goto L_0x00d6;
            }
        L_0x00d6:
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo12547u()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            goto L_0x0114
        L_0x00dd:
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo12547u()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            goto L_0x0114
        L_0x00e4:
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo12550x()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            goto L_0x0114
        L_0x00eb:
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo12548v()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            goto L_0x0114
        L_0x00f2:
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo12547u()
            java.lang.String r8 = "App measurement disabled via the manifest"
            goto L_0x0114
        L_0x00f9:
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo12547u()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            goto L_0x0114
        L_0x0100:
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo12548v()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            goto L_0x0114
        L_0x0107:
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo12547u()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            goto L_0x0114
        L_0x010e:
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo12548v()
            java.lang.String r8 = "App measurement collection enabled"
        L_0x0114:
            r7.mo12476a(r8)
            r11.f11197m = r4
            r11.f11198n = r4
            com.google.android.gms.measurement.internal.l5 r7 = r11.f10651a
            r7.mo11937d()
            if (r2 == 0) goto L_0x012a
            com.google.android.gms.measurement.internal.l5 r2 = r11.f10651a
            java.lang.String r2 = r2.mo12162O()
            r11.f11198n = r2
        L_0x012a:
            com.google.android.gms.measurement.internal.l5 r2 = r11.f10651a     // Catch:{ IllegalStateException -> 0x0192 }
            android.content.Context r2 = r2.mo11938f()     // Catch:{ IllegalStateException -> 0x0192 }
            com.google.android.gms.measurement.internal.l5 r7 = r11.f10651a     // Catch:{ IllegalStateException -> 0x0192 }
            java.lang.String r7 = r7.mo12165R()     // Catch:{ IllegalStateException -> 0x0192 }
            java.lang.String r8 = "google_app_id"
            java.lang.String r2 = com.google.android.gms.measurement.internal.C4102x7.m15387b(r2, r8, r7)     // Catch:{ IllegalStateException -> 0x0192 }
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x0192 }
            if (r3 == r7) goto L_0x0143
            r4 = r2
        L_0x0143:
            r11.f11197m = r4     // Catch:{ IllegalStateException -> 0x0192 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x0192 }
            if (r2 != 0) goto L_0x0171
            com.google.android.gms.measurement.internal.l5 r2 = r11.f10651a     // Catch:{ IllegalStateException -> 0x0192 }
            android.content.Context r2 = r2.mo11938f()     // Catch:{ IllegalStateException -> 0x0192 }
            com.google.android.gms.measurement.internal.l5 r3 = r11.f10651a     // Catch:{ IllegalStateException -> 0x0192 }
            java.lang.String r3 = r3.mo12165R()     // Catch:{ IllegalStateException -> 0x0192 }
            com.google.android.gms.common.internal.C3705r.m14346k(r2)     // Catch:{ IllegalStateException -> 0x0192 }
            android.content.res.Resources r4 = r2.getResources()     // Catch:{ IllegalStateException -> 0x0192 }
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x0192 }
            if (r7 != 0) goto L_0x0165
            goto L_0x0169
        L_0x0165:
            java.lang.String r3 = com.google.android.gms.measurement.internal.C3851d5.m14684a(r2)     // Catch:{ IllegalStateException -> 0x0192 }
        L_0x0169:
            java.lang.String r2 = "admob_app_id"
            java.lang.String r2 = com.google.android.gms.measurement.internal.C3851d5.m14685b(r2, r4, r3)     // Catch:{ IllegalStateException -> 0x0192 }
            r11.f11198n = r2     // Catch:{ IllegalStateException -> 0x0192 }
        L_0x0171:
            if (r6 != 0) goto L_0x01a6
            com.google.android.gms.measurement.internal.l5 r2 = r11.f10651a     // Catch:{ IllegalStateException -> 0x0192 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ IllegalStateException -> 0x0192 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12548v()     // Catch:{ IllegalStateException -> 0x0192 }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r4 = r11.f11187c     // Catch:{ IllegalStateException -> 0x0192 }
            java.lang.String r6 = r11.f11197m     // Catch:{ IllegalStateException -> 0x0192 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x0192 }
            if (r6 == 0) goto L_0x018c
            java.lang.String r6 = r11.f11198n     // Catch:{ IllegalStateException -> 0x0192 }
            goto L_0x018e
        L_0x018c:
            java.lang.String r6 = r11.f11197m     // Catch:{ IllegalStateException -> 0x0192 }
        L_0x018e:
            r2.mo12478c(r3, r4, r6)     // Catch:{ IllegalStateException -> 0x0192 }
            goto L_0x01a6
        L_0x0192:
            r2 = move-exception
            com.google.android.gms.measurement.internal.l5 r3 = r11.f10651a
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r0)
            java.lang.String r4 = "Fetching Google App Id failed with exception. appId"
            r3.mo12478c(r4, r0, r2)
        L_0x01a6:
            r0 = 0
            r11.f11194j = r0
            com.google.android.gms.measurement.internal.l5 r0 = r11.f10651a
            r0.mo11937d()
            com.google.android.gms.measurement.internal.l5 r0 = r11.f10651a
            com.google.android.gms.measurement.internal.h r0 = r0.mo12181z()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.mo12031y(r2)
            if (r0 != 0) goto L_0x01bd
            goto L_0x01f2
        L_0x01bd:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x01d3
            com.google.android.gms.measurement.internal.l5 r0 = r11.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12550x()
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.mo12476a(r2)
            goto L_0x01f4
        L_0x01d3:
            java.util.Iterator r2 = r0.iterator()
        L_0x01d7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01f2
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.l5 r4 = r11.f10651a
            com.google.android.gms.measurement.internal.xa r4 = r4.mo12161N()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r4.mo12500Q(r6, r3)
            if (r3 != 0) goto L_0x01d7
            goto L_0x01f4
        L_0x01f2:
            r11.f11194j = r0
        L_0x01f4:
            if (r1 == 0) goto L_0x0203
            com.google.android.gms.measurement.internal.l5 r0 = r11.f10651a
            android.content.Context r0 = r0.mo11938f()
            boolean r0 = com.google.android.gms.common.p133n.C3744a.m14486a(r0)
            r11.f11196l = r0
            return
        L_0x0203:
            r11.f11196l = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4014q3.mo11952l():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo11954n() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final int mo12315o() {
        mo11949i();
        return this.f11196l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final int mo12316p() {
        mo11949i();
        return this.f11189e;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0269  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C3844cb mo12317q(java.lang.String r37) {
        /*
            r36 = this;
            r1 = r36
            r36.mo11931h()
            com.google.android.gms.measurement.internal.cb r33 = new com.google.android.gms.measurement.internal.cb
            java.lang.String r3 = r36.mo12319s()
            java.lang.String r4 = r36.mo12320t()
            r36.mo11949i()
            java.lang.String r5 = r1.f11188d
            r36.mo11949i()
            int r0 = r1.f11189e
            long r6 = (long) r0
            r36.mo11949i()
            java.lang.String r0 = r1.f11190f
            com.google.android.gms.common.internal.C3705r.m14346k(r0)
            java.lang.String r8 = r1.f11190f
            com.google.android.gms.measurement.internal.l5 r0 = r1.f10651a
            com.google.android.gms.measurement.internal.h r0 = r0.mo12181z()
            r0.mo12023q()
            r36.mo11949i()
            r36.mo11931h()
            long r9 = r1.f11192h
            r2 = 0
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00d0
            com.google.android.gms.measurement.internal.l5 r0 = r1.f10651a
            com.google.android.gms.measurement.internal.xa r9 = r0.mo12161N()
            com.google.android.gms.measurement.internal.l5 r0 = r1.f10651a
            android.content.Context r0 = r0.mo11938f()
            com.google.android.gms.measurement.internal.l5 r10 = r1.f10651a
            android.content.Context r10 = r10.mo11938f()
            java.lang.String r10 = r10.getPackageName()
            r9.mo11931h()
            com.google.android.gms.common.internal.C3705r.m14346k(r0)
            com.google.android.gms.common.internal.C3705r.m14342g(r10)
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            java.security.MessageDigest r14 = com.google.android.gms.measurement.internal.C4105xa.m15406t()
            r15 = -1
            if (r14 != 0) goto L_0x0078
            com.google.android.gms.measurement.internal.l5 r0 = r9.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12544r()
            java.lang.String r9 = "Could not get MD5 instance"
            r0.mo12476a(r9)
        L_0x0076:
            r9 = r15
            goto L_0x00ce
        L_0x0078:
            if (r13 == 0) goto L_0x00cd
            boolean r10 = r9.mo12505V(r0, r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 != 0) goto L_0x00bb
            com.google.android.gms.common.n.b r0 = com.google.android.gms.common.p133n.C3746c.m14493a(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.l5 r10 = r9.f10651a     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.Context r10 = r10.mo11938f()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00bd }
            r13 = 64
            android.content.pm.PackageInfo r0 = r0.mo11719d(r10, r13)     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r0 == 0) goto L_0x00ab
            int r10 = r0.length     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 <= 0) goto L_0x00ab
            r0 = r0[r2]     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r14.digest(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            long r9 = com.google.android.gms.measurement.internal.C4105xa.m15405q0(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            r15 = r9
            goto L_0x0076
        L_0x00ab:
            com.google.android.gms.measurement.internal.l5 r0 = r9.f10651a     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12549w()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = "Could not get signatures"
            r0.mo12476a(r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            goto L_0x0076
        L_0x00bb:
            r15 = r11
            goto L_0x0076
        L_0x00bd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l5 r9 = r9.f10651a
            com.google.android.gms.measurement.internal.z3 r9 = r9.mo11935b()
            com.google.android.gms.measurement.internal.x3 r9 = r9.mo12544r()
            java.lang.String r10 = "Package name not found"
            r9.mo12477b(r10, r0)
        L_0x00cd:
            r9 = r11
        L_0x00ce:
            r1.f11192h = r9
        L_0x00d0:
            r13 = r9
            com.google.android.gms.measurement.internal.l5 r0 = r1.f10651a
            boolean r0 = r0.mo12174o()
            com.google.android.gms.measurement.internal.l5 r9 = r1.f10651a
            com.google.android.gms.measurement.internal.p4 r9 = r9.mo12154F()
            boolean r9 = r9.f11121q
            r10 = 1
            r15 = r9 ^ 1
            r36.mo11931h()
            com.google.android.gms.measurement.internal.l5 r9 = r1.f10651a
            boolean r9 = r9.mo12174o()
            r11 = 0
            if (r9 != 0) goto L_0x00f2
        L_0x00ee:
            r20 = r11
            goto L_0x0175
        L_0x00f2:
            p174e.p319f.p320a.p335c.p345f.p352g.C6921ne.m26260b()
            com.google.android.gms.measurement.internal.l5 r9 = r1.f10651a
            com.google.android.gms.measurement.internal.h r9 = r9.mo12181z()
            com.google.android.gms.measurement.internal.l3 r12 = com.google.android.gms.measurement.internal.C3966m3.f10991c0
            boolean r9 = r9.mo12010B(r11, r12)
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.l5 r9 = r1.f10651a
            com.google.android.gms.measurement.internal.z3 r9 = r9.mo11935b()
            com.google.android.gms.measurement.internal.x3 r9 = r9.mo12548v()
            java.lang.String r12 = "Disabled IID for tests."
            r9.mo12476a(r12)
            goto L_0x00ee
        L_0x0113:
            com.google.android.gms.measurement.internal.l5 r9 = r1.f10651a     // Catch:{ ClassNotFoundException -> 0x0173 }
            android.content.Context r9 = r9.mo11938f()     // Catch:{ ClassNotFoundException -> 0x0173 }
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0173 }
            java.lang.String r12 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r9 = r9.loadClass(r12)     // Catch:{ ClassNotFoundException -> 0x0173 }
            if (r9 != 0) goto L_0x0126
            goto L_0x00ee
        L_0x0126:
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0164 }
            java.lang.Class<android.content.Context> r18 = android.content.Context.class
            r12[r2] = r18     // Catch:{ Exception -> 0x0164 }
            java.lang.String r11 = "getInstance"
            java.lang.reflect.Method r11 = r9.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0164 }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0164 }
            com.google.android.gms.measurement.internal.l5 r10 = r1.f10651a     // Catch:{ Exception -> 0x0164 }
            android.content.Context r10 = r10.mo11938f()     // Catch:{ Exception -> 0x0164 }
            r12[r2] = r10     // Catch:{ Exception -> 0x0164 }
            r10 = 0
            java.lang.Object r11 = r11.invoke(r10, r12)     // Catch:{ Exception -> 0x0164 }
            if (r11 != 0) goto L_0x0144
            goto L_0x0173
        L_0x0144:
            java.lang.String r10 = "getFirebaseInstanceId"
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r10, r12)     // Catch:{ Exception -> 0x0157 }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r9 = r9.invoke(r11, r10)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0157 }
            r20 = r9
            goto L_0x0175
        L_0x0157:
            com.google.android.gms.measurement.internal.l5 r9 = r1.f10651a
            com.google.android.gms.measurement.internal.z3 r9 = r9.mo11935b()
            com.google.android.gms.measurement.internal.x3 r9 = r9.mo12550x()
            java.lang.String r10 = "Failed to retrieve Firebase Instance Id"
            goto L_0x0170
        L_0x0164:
            com.google.android.gms.measurement.internal.l5 r9 = r1.f10651a
            com.google.android.gms.measurement.internal.z3 r9 = r9.mo11935b()
            com.google.android.gms.measurement.internal.x3 r9 = r9.mo12551y()
            java.lang.String r10 = "Failed to obtain Firebase Analytics instance"
        L_0x0170:
            r9.mo12476a(r10)
        L_0x0173:
            r20 = 0
        L_0x0175:
            com.google.android.gms.measurement.internal.l5 r9 = r1.f10651a
            com.google.android.gms.measurement.internal.p4 r10 = r9.mo12154F()
            com.google.android.gms.measurement.internal.l4 r10 = r10.f11110f
            long r10 = r10.mo12147a()
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x018d
            long r9 = r9.f10902H
            r12 = r3
            r22 = r9
            goto L_0x0196
        L_0x018d:
            r12 = r3
            long r2 = r9.f10902H
            long r2 = java.lang.Math.min(r2, r10)
            r22 = r2
        L_0x0196:
            r36.mo11949i()
            int r11 = r1.f11196l
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a
            com.google.android.gms.measurement.internal.h r2 = r2.mo12181z()
            boolean r24 = r2.mo12009A()
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a
            com.google.android.gms.measurement.internal.p4 r2 = r2.mo12154F()
            r2.mo11931h()
            android.content.SharedPreferences r2 = r2.mo12255o()
            java.lang.String r3 = "deferred_analytics_collection"
            r9 = 0
            boolean r25 = r2.getBoolean(r3, r9)
            r36.mo11949i()
            java.lang.String r3 = r1.f11198n
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a
            com.google.android.gms.measurement.internal.h r2 = r2.mo12181z()
            java.lang.String r9 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r2 = r2.mo12026t(r9)
            if (r2 != 0) goto L_0x01cf
            r26 = 0
            goto L_0x01db
        L_0x01cf:
            boolean r2 = r2.booleanValue()
            r9 = 1
            r2 = r2 ^ r9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r26 = r2
        L_0x01db:
            long r9 = r1.f11193i
            java.util.List r2 = r1.f11194j
            r19 = r2
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a
            com.google.android.gms.measurement.internal.p4 r2 = r2.mo12154F()
            com.google.android.gms.measurement.internal.j r2 = r2.mo12257q()
            java.lang.String r30 = r2.mo12121h()
            java.lang.String r2 = r1.f11195k
            if (r2 != 0) goto L_0x0216
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a
            com.google.android.gms.measurement.internal.h r2 = r2.mo12181z()
            r21 = r3
            com.google.android.gms.measurement.internal.l3 r3 = com.google.android.gms.measurement.internal.C3966m3.f10963G0
            r27 = r9
            r9 = 0
            boolean r2 = r2.mo12010B(r9, r3)
            if (r2 == 0) goto L_0x0211
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a
            com.google.android.gms.measurement.internal.xa r2 = r2.mo12161N()
            java.lang.String r2 = r2.mo12517q()
            goto L_0x0213
        L_0x0211:
            java.lang.String r2 = ""
        L_0x0213:
            r1.f11195k = r2
            goto L_0x021a
        L_0x0216:
            r21 = r3
            r27 = r9
        L_0x021a:
            java.lang.String r3 = r1.f11195k
            p174e.p319f.p320a.p335c.p345f.p352g.C6825he.m25843b()
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a
            com.google.android.gms.measurement.internal.h r2 = r2.mo12181z()
            com.google.android.gms.measurement.internal.l3 r9 = com.google.android.gms.measurement.internal.C3966m3.f10953B0
            r10 = 0
            boolean r2 = r2.mo12010B(r10, r9)
            if (r2 == 0) goto L_0x0269
            r36.mo11931h()
            long r9 = r1.f11200p
            r16 = 0
            int r2 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x023c
            r16 = r3
            goto L_0x025d
        L_0x023c:
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a
            com.google.android.gms.common.util.e r2 = r2.mo11936c()
            long r9 = r2.mo11730a()
            r16 = r3
            long r2 = r1.f11200p
            long r9 = r9 - r2
            java.lang.String r2 = r1.f11199o
            if (r2 == 0) goto L_0x025d
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r17 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r17 <= 0) goto L_0x025d
            java.lang.String r2 = r1.f11201q
            if (r2 != 0) goto L_0x025d
            r36.mo12322v()
        L_0x025d:
            java.lang.String r2 = r1.f11199o
            if (r2 != 0) goto L_0x0264
            r36.mo12322v()
        L_0x0264:
            java.lang.String r2 = r1.f11199o
            r32 = r2
            goto L_0x026d
        L_0x0269:
            r16 = r3
            r32 = r10
        L_0x026d:
            r9 = 68000(0x109a0, double:3.35965E-319)
            r17 = 0
            r29 = 0
            r31 = r19
            r2 = r33
            r35 = r16
            r34 = r21
            r3 = r12
            r21 = r11
            r11 = r13
            r13 = r37
            r14 = r0
            r16 = r20
            r19 = r22
            r22 = r24
            r23 = r25
            r24 = r34
            r25 = r26
            r26 = r27
            r28 = r31
            r31 = r35
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (java.lang.String) r24, (java.lang.Boolean) r25, (long) r26, (java.util.List) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4014q3.mo12317q(java.lang.String):com.google.android.gms.measurement.internal.cb");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final String mo12318r() {
        mo11949i();
        return this.f11198n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final String mo12319s() {
        mo11949i();
        C3705r.m14346k(this.f11187c);
        return this.f11187c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final String mo12320t() {
        mo11931h();
        mo11949i();
        C3705r.m14346k(this.f11197m);
        return this.f11197m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final List mo12321u() {
        return this.f11194j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo12322v() {
        String str;
        mo11931h();
        if (!this.f10651a.mo12154F().mo12257q().mo12123i(C3910i.ANALYTICS_STORAGE)) {
            this.f10651a.mo11935b().mo12543q().mo12476a("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            this.f10651a.mo12161N().mo12523u().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        C4098x3 q = this.f10651a.mo11935b().mo12543q();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        q.mo12476a(String.format("Resetting session stitching token to %s", objArr));
        this.f11199o = str;
        this.f11200p = this.f10651a.mo11936c().mo11730a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo12323w(String str) {
        String str2 = this.f11201q;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.f11201q = str;
        return z;
    }
}
