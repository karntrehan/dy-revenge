package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3705r;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.measurement.internal.g8 */
public final class C3893g8 extends C3876f4 {

    /* renamed from: c */
    private volatile C4114y7 f10685c;

    /* renamed from: d */
    private volatile C4114y7 f10686d;

    /* renamed from: e */
    protected C4114y7 f10687e;

    /* renamed from: f */
    private final Map f10688f = new ConcurrentHashMap();

    /* renamed from: g */
    private Activity f10689g;

    /* renamed from: h */
    private volatile boolean f10690h;

    /* renamed from: i */
    private volatile C4114y7 f10691i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4114y7 f10692j;

    /* renamed from: k */
    private boolean f10693k;

    /* renamed from: l */
    private final Object f10694l = new Object();

    /* renamed from: m */
    private C4114y7 f10695m;

    /* renamed from: n */
    private String f10696n;

    public C3893g8(C3955l5 l5Var) {
        super(l5Var);
    }

    /* renamed from: H */
    private final C4114y7 m14756H(Activity activity) {
        C3705r.m14346k(activity);
        C4114y7 y7Var = (C4114y7) this.f10688f.get(activity);
        if (y7Var == null) {
            C4114y7 y7Var2 = new C4114y7((String) null, mo11981u(activity.getClass(), "Activity"), this.f10651a.mo12161N().mo12519r0());
            this.f10688f.put(activity, y7Var2);
            y7Var = y7Var2;
        }
        return this.f10691i != null ? this.f10691i : y7Var;
    }

    /* renamed from: o */
    private final void m14757o(Activity activity, C4114y7 y7Var, boolean z) {
        C4114y7 y7Var2;
        C4114y7 y7Var3 = y7Var;
        C4114y7 y7Var4 = this.f10685c == null ? this.f10686d : this.f10685c;
        if (y7Var3.f11428b == null) {
            y7Var2 = new C4114y7(y7Var3.f11427a, activity != null ? mo11981u(activity.getClass(), "Activity") : null, y7Var3.f11429c, y7Var3.f11431e, y7Var3.f11432f);
        } else {
            y7Var2 = y7Var3;
        }
        this.f10686d = this.f10685c;
        this.f10685c = y7Var2;
        this.f10651a.mo11934a().mo12110z(new C3828b8(this, y7Var2, y7Var4, this.f10651a.mo11936c().mo11731b(), z));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m14758p(C4114y7 y7Var, C4114y7 y7Var2, long j, boolean z, Bundle bundle) {
        Bundle bundle2;
        long j2;
        C4114y7 y7Var3 = y7Var;
        C4114y7 y7Var4 = y7Var2;
        long j3 = j;
        Bundle bundle3 = bundle;
        mo11931h();
        boolean z2 = false;
        boolean z3 = y7Var4 == null || y7Var4.f11429c != y7Var3.f11429c || !C4126z7.m15483a(y7Var4.f11428b, y7Var3.f11428b) || !C4126z7.m15483a(y7Var4.f11427a, y7Var3.f11427a);
        if (z && this.f10687e != null) {
            z2 = true;
        }
        if (z3) {
            if (bundle3 == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            C4105xa.m15408y(y7Var3, bundle4, true);
            if (y7Var4 != null) {
                String str = y7Var4.f11427a;
                if (str != null) {
                    bundle4.putString("_pn", str);
                }
                String str2 = y7Var4.f11428b;
                if (str2 != null) {
                    bundle4.putString("_pc", str2);
                }
                bundle4.putLong("_pi", y7Var4.f11429c);
            }
            if (z2) {
                C4080v9 v9Var = this.f10651a.mo12160M().f11409e;
                long j4 = j3 - v9Var.f11349b;
                v9Var.f11349b = j3;
                if (j4 > 0) {
                    this.f10651a.mo12161N().mo12526w(bundle4, j4);
                }
            }
            if (!this.f10651a.mo12181z().mo12012D()) {
                bundle4.putLong("_mst", 1);
            }
            String str3 = true != y7Var3.f11431e ? "auto" : "app";
            long a = this.f10651a.mo11936c().mo11730a();
            if (y7Var3.f11431e) {
                long j5 = y7Var3.f11432f;
                if (j5 != 0) {
                    j2 = j5;
                    this.f10651a.mo12156I().mo12382v(str3, "_vs", j2, bundle4);
                }
            }
            j2 = a;
            this.f10651a.mo12156I().mo12382v(str3, "_vs", j2, bundle4);
        }
        if (z2) {
            m14759q(this.f10687e, true, j3);
        }
        this.f10687e = y7Var3;
        if (y7Var3.f11431e) {
            this.f10692j = y7Var3;
        }
        this.f10651a.mo12159L().mo12001u(y7Var3);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m14759q(C4114y7 y7Var, boolean z, long j) {
        this.f10651a.mo12180y().mo11900n(this.f10651a.mo11936c().mo11731b());
        if (this.f10651a.mo12160M().f11409e.mo12463d(y7Var != null && y7Var.f11430d, z, j) && y7Var != null) {
            y7Var.f11430d = false;
        }
    }

    /* renamed from: x */
    static /* bridge */ /* synthetic */ void m14763x(C3893g8 g8Var, Bundle bundle, C4114y7 y7Var, C4114y7 y7Var2, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        g8Var.m14758p(y7Var, y7Var2, j, true, g8Var.f10651a.mo12161N().mo12525v0((String) null, "screen_view", bundle, (List) null, false));
    }

    /* renamed from: A */
    public final void mo11972A(Activity activity) {
        synchronized (this.f10694l) {
            if (activity == this.f10689g) {
                this.f10689g = null;
            }
        }
        if (this.f10651a.mo12181z().mo12012D()) {
            this.f10688f.remove(activity);
        }
    }

    /* renamed from: B */
    public final void mo11973B(Activity activity) {
        synchronized (this.f10694l) {
            this.f10693k = false;
            this.f10690h = true;
        }
        long b = this.f10651a.mo11936c().mo11731b();
        if (!this.f10651a.mo12181z().mo12012D()) {
            this.f10685c = null;
            this.f10651a.mo11934a().mo12110z(new C3854d8(this, b));
            return;
        }
        C4114y7 H = m14756H(activity);
        this.f10686d = this.f10685c;
        this.f10685c = null;
        this.f10651a.mo11934a().mo12110z(new C3867e8(this, H, b));
    }

    /* renamed from: C */
    public final void mo11974C(Activity activity) {
        synchronized (this.f10694l) {
            this.f10693k = true;
            if (activity != this.f10689g) {
                synchronized (this.f10694l) {
                    this.f10689g = activity;
                    this.f10690h = false;
                }
                if (this.f10651a.mo12181z().mo12012D()) {
                    this.f10691i = null;
                    this.f10651a.mo11934a().mo12110z(new C3880f8(this));
                }
            }
        }
        if (!this.f10651a.mo12181z().mo12012D()) {
            this.f10685c = this.f10691i;
            this.f10651a.mo11934a().mo12110z(new C3841c8(this));
            return;
        }
        m14757o(activity, m14756H(activity), false);
        C3848d2 y = this.f10651a.mo12180y();
        y.f10651a.mo11934a().mo12110z(new C3834c1(y, y.f10651a.mo11936c().mo11731b()));
    }

    /* renamed from: D */
    public final void mo11975D(Activity activity, Bundle bundle) {
        C4114y7 y7Var;
        if (this.f10651a.mo12181z().mo12012D() && bundle != null && (y7Var = (C4114y7) this.f10688f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", y7Var.f11429c);
            bundle2.putString("name", y7Var.f11427a);
            bundle2.putString("referrer_name", y7Var.f11428b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r5.length() <= 100) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r6.length() <= 100) goto L_0x00cf;
     */
    @java.lang.Deprecated
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11976E(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.l5 r0 = r3.f10651a
            com.google.android.gms.measurement.internal.h r0 = r0.mo12181z()
            boolean r0 = r0.mo12012D()
            if (r0 != 0) goto L_0x001c
            com.google.android.gms.measurement.internal.l5 r4 = r3.f10651a
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo11935b()
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12550x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.mo12476a(r5)
            return
        L_0x001c:
            com.google.android.gms.measurement.internal.y7 r0 = r3.f10685c
            if (r0 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.l5 r4 = r3.f10651a
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo11935b()
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12550x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.mo12476a(r5)
            return
        L_0x0030:
            java.util.Map r1 = r3.f10688f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L_0x0048
            com.google.android.gms.measurement.internal.l5 r4 = r3.f10651a
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo11935b()
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12550x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.mo12476a(r5)
            return
        L_0x0048:
            if (r6 != 0) goto L_0x0054
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.mo11981u(r6, r1)
        L_0x0054:
            java.lang.String r1 = r0.f11428b
            boolean r1 = com.google.android.gms.measurement.internal.C4126z7.m15483a(r1, r6)
            java.lang.String r0 = r0.f11427a
            boolean r0 = com.google.android.gms.measurement.internal.C4126z7.m15483a(r0, r5)
            if (r1 == 0) goto L_0x0075
            if (r0 != 0) goto L_0x0065
            goto L_0x0075
        L_0x0065:
            com.google.android.gms.measurement.internal.l5 r4 = r3.f10651a
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo11935b()
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12550x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.mo12476a(r5)
            return
        L_0x0075:
            r0 = 100
            if (r5 == 0) goto L_0x00a3
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x008b
            com.google.android.gms.measurement.internal.l5 r1 = r3.f10651a
            r1.mo12181z()
            int r1 = r5.length()
            if (r1 > r0) goto L_0x008b
            goto L_0x00a3
        L_0x008b:
            com.google.android.gms.measurement.internal.l5 r4 = r3.f10651a
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo11935b()
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12550x()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.mo12477b(r6, r5)
            return
        L_0x00a3:
            if (r6 == 0) goto L_0x00cf
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x00b7
            com.google.android.gms.measurement.internal.l5 r1 = r3.f10651a
            r1.mo12181z()
            int r1 = r6.length()
            if (r1 > r0) goto L_0x00b7
            goto L_0x00cf
        L_0x00b7:
            com.google.android.gms.measurement.internal.l5 r4 = r3.f10651a
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo11935b()
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12550x()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.mo12477b(r6, r5)
            return
        L_0x00cf:
            com.google.android.gms.measurement.internal.l5 r0 = r3.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12548v()
            if (r5 != 0) goto L_0x00de
            java.lang.String r1 = "null"
            goto L_0x00df
        L_0x00de:
            r1 = r5
        L_0x00df:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.mo12478c(r2, r1, r6)
            com.google.android.gms.measurement.internal.y7 r0 = new com.google.android.gms.measurement.internal.y7
            com.google.android.gms.measurement.internal.l5 r1 = r3.f10651a
            com.google.android.gms.measurement.internal.xa r1 = r1.mo12161N()
            long r1 = r1.mo12519r0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f10688f
            r5.put(r4, r0)
            r5 = 1
            r3.m14757o(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3893g8.mo11976E(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r2 > 100) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r4 > 100) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r0 = r12.f10651a.mo11935b().mo12548v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        if (r3 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        if (r4 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r0.mo12478c("Logging screen view with name, class", r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r12.f10685c != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r0 = r12.f10686d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        r0 = r12.f10685c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        r2 = new com.google.android.gms.measurement.internal.C4114y7(r3, r4, r12.f10651a.mo12161N().mo12519r0(), true, r14);
        r12.f10685c = r2;
        r12.f10686d = r0;
        r12.f10691i = r2;
        r12.f10651a.mo11934a().mo12110z(new com.google.android.gms.measurement.internal.C3815a8(r12, r13, r2, r0, r12.f10651a.mo11936c().mo11731b()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        return;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11977F(android.os.Bundle r13, long r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f10694l
            monitor-enter(r0)
            boolean r1 = r12.f10693k     // Catch:{ all -> 0x011b }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.measurement.internal.l5 r13 = r12.f10651a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.z3 r13 = r13.mo11935b()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.x3 r13 = r13.mo12550x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.mo12476a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x0018:
            java.lang.String r1 = "screen_name"
            java.lang.String r3 = r13.getString(r1)     // Catch:{ all -> 0x011b }
            r1 = 100
            if (r3 == 0) goto L_0x004c
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            if (r2 <= 0) goto L_0x0033
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.l5 r4 = r12.f10651a     // Catch:{ all -> 0x011b }
            r4.mo12181z()     // Catch:{ all -> 0x011b }
            if (r2 <= r1) goto L_0x004c
        L_0x0033:
            com.google.android.gms.measurement.internal.l5 r13 = r12.f10651a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.z3 r13 = r13.mo11935b()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.x3 r13 = r13.mo12550x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r3.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo12477b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x004c:
            java.lang.String r2 = "screen_class"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x007e
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            if (r4 <= 0) goto L_0x0065
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.l5 r5 = r12.f10651a     // Catch:{ all -> 0x011b }
            r5.mo12181z()     // Catch:{ all -> 0x011b }
            if (r4 <= r1) goto L_0x007e
        L_0x0065:
            com.google.android.gms.measurement.internal.l5 r13 = r12.f10651a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.z3 r13 = r13.mo11935b()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.x3 r13 = r13.mo12550x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r2.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo12477b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x007e:
            if (r2 != 0) goto L_0x0093
            android.app.Activity r1 = r12.f10689g     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x008f
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "Activity"
            java.lang.String r1 = r12.mo11981u(r1, r2)     // Catch:{ all -> 0x011b }
            goto L_0x0091
        L_0x008f:
            java.lang.String r1 = "Activity"
        L_0x0091:
            r4 = r1
            goto L_0x0094
        L_0x0093:
            r4 = r2
        L_0x0094:
            com.google.android.gms.measurement.internal.y7 r1 = r12.f10685c     // Catch:{ all -> 0x011b }
            boolean r2 = r12.f10690h     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            r2 = 0
            r12.f10690h = r2     // Catch:{ all -> 0x011b }
            java.lang.String r2 = r1.f11428b     // Catch:{ all -> 0x011b }
            boolean r2 = com.google.android.gms.measurement.internal.C4126z7.m15483a(r2, r4)     // Catch:{ all -> 0x011b }
            java.lang.String r1 = r1.f11427a     // Catch:{ all -> 0x011b }
            boolean r1 = com.google.android.gms.measurement.internal.C4126z7.m15483a(r1, r3)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            com.google.android.gms.measurement.internal.l5 r13 = r12.f10651a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.z3 r13 = r13.mo11935b()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.x3 r13 = r13.mo12550x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.mo12476a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x00c0:
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.l5 r0 = r12.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12548v()
            if (r3 != 0) goto L_0x00d0
            java.lang.String r1 = "null"
            goto L_0x00d1
        L_0x00d0:
            r1 = r3
        L_0x00d1:
            if (r4 != 0) goto L_0x00d6
            java.lang.String r2 = "null"
            goto L_0x00d7
        L_0x00d6:
            r2 = r4
        L_0x00d7:
            java.lang.String r5 = "Logging screen view with name, class"
            r0.mo12478c(r5, r1, r2)
            com.google.android.gms.measurement.internal.y7 r0 = r12.f10685c
            if (r0 != 0) goto L_0x00e3
            com.google.android.gms.measurement.internal.y7 r0 = r12.f10686d
            goto L_0x00e5
        L_0x00e3:
            com.google.android.gms.measurement.internal.y7 r0 = r12.f10685c
        L_0x00e5:
            com.google.android.gms.measurement.internal.y7 r1 = new com.google.android.gms.measurement.internal.y7
            com.google.android.gms.measurement.internal.l5 r2 = r12.f10651a
            com.google.android.gms.measurement.internal.xa r2 = r2.mo12161N()
            long r5 = r2.mo12519r0()
            r7 = 1
            r2 = r1
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.f10685c = r1
            r12.f10686d = r0
            r12.f10691i = r1
            com.google.android.gms.measurement.internal.l5 r14 = r12.f10651a
            com.google.android.gms.common.util.e r14 = r14.mo11936c()
            long r10 = r14.mo11731b()
            com.google.android.gms.measurement.internal.l5 r14 = r12.f10651a
            com.google.android.gms.measurement.internal.i5 r14 = r14.mo11934a()
            com.google.android.gms.measurement.internal.a8 r15 = new com.google.android.gms.measurement.internal.a8
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = r1
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r14.mo12110z(r15)
            return
        L_0x011b:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3893g8.mo11977F(android.os.Bundle, long):void");
    }

    /* renamed from: G */
    public final void mo11978G(String str, C4114y7 y7Var) {
        mo11931h();
        synchronized (this) {
            String str2 = this.f10696n;
            if (str2 == null || str2.equals(str) || y7Var != null) {
                this.f10696n = str;
                this.f10695m = y7Var;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo11954n() {
        return false;
    }

    /* renamed from: s */
    public final C4114y7 mo11979s() {
        return this.f10685c;
    }

    /* renamed from: t */
    public final C4114y7 mo11980t(boolean z) {
        mo11949i();
        mo11931h();
        if (!z) {
            return this.f10687e;
        }
        C4114y7 y7Var = this.f10687e;
        return y7Var != null ? y7Var : this.f10692j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final String mo11981u(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : HttpUrl.FRAGMENT_ENCODE_SET;
        int length2 = str2.length();
        this.f10651a.mo12181z();
        if (length2 <= 100) {
            return str2;
        }
        this.f10651a.mo12181z();
        return str2.substring(0, 100);
    }

    /* renamed from: z */
    public final void mo11982z(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f10651a.mo12181z().mo12012D() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f10688f.put(activity, new C4114y7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }
}
