package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.p133n.C3746c;
import com.google.android.gms.common.util.C3766m;
import java.lang.reflect.InvocationTargetException;
import okhttp3.HttpUrl;
import p497j.p498a.p499a.p500a.p501a.C10675a;

/* renamed from: com.google.android.gms.measurement.internal.h */
public final class C3897h extends C3865e6 {

    /* renamed from: b */
    private Boolean f10713b;

    /* renamed from: c */
    private C3884g f10714c = C3871f.f10660a;

    /* renamed from: d */
    private Boolean f10715d;

    C3897h(C3955l5 l5Var) {
        super(l5Var);
    }

    /* renamed from: I */
    public static final long m14817I() {
        return ((Long) C3966m3.f10994e.mo12145a((Object) null)).longValue();
    }

    /* renamed from: i */
    public static final long m14818i() {
        return ((Long) C3966m3.f10958E.mo12145a((Object) null)).longValue();
    }

    /* renamed from: j */
    private final String m14819j(String str, String str2) {
        C4098x3 x3Var;
        String str3;
        Class<String> cls = String.class;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, HttpUrl.FRAGMENT_ENCODE_SET});
            C3705r.m14346k(str4);
            return str4;
        } catch (ClassNotFoundException e) {
            e = e;
            x3Var = this.f10651a.mo11935b().mo12544r();
            str3 = "Could not find SystemProperties class";
            x3Var.mo12477b(str3, e);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (NoSuchMethodException e2) {
            e = e2;
            x3Var = this.f10651a.mo11935b().mo12544r();
            str3 = "Could not find SystemProperties.get() method";
            x3Var.mo12477b(str3, e);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (IllegalAccessException e3) {
            e = e3;
            x3Var = this.f10651a.mo11935b().mo12544r();
            str3 = "Could not access SystemProperties.get()";
            x3Var.mo12477b(str3, e);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (InvocationTargetException e4) {
            e = e4;
            x3Var = this.f10651a.mo11935b().mo12544r();
            str3 = "SystemProperties.get() threw an exception";
            x3Var.mo12477b(str3, e);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: A */
    public final boolean mo12009A() {
        Boolean t = mo12026t("google_analytics_adid_collection_enabled");
        return t == null || t.booleanValue();
    }

    /* renamed from: B */
    public final boolean mo12010B(String str, C3953l3 l3Var) {
        Object a;
        if (str != null) {
            String e = this.f10714c.mo11881e(str, l3Var.mo12146b());
            if (!TextUtils.isEmpty(e)) {
                a = l3Var.mo12145a(Boolean.valueOf("1".equals(e)));
                return ((Boolean) a).booleanValue();
            }
        }
        a = l3Var.mo12145a((Object) null);
        return ((Boolean) a).booleanValue();
    }

    /* renamed from: C */
    public final boolean mo12011C(String str) {
        return "1".equals(this.f10714c.mo11881e(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean mo12012D() {
        Boolean t = mo12026t("google_analytics_automatic_screen_reporting_enabled");
        return t == null || t.booleanValue();
    }

    /* renamed from: E */
    public final boolean mo12013E() {
        this.f10651a.mo11937d();
        Boolean t = mo12026t("firebase_analytics_collection_deactivated");
        return t != null && t.booleanValue();
    }

    /* renamed from: F */
    public final boolean mo12014F(String str) {
        return "1".equals(this.f10714c.mo11881e(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean mo12015G() {
        if (this.f10713b == null) {
            Boolean t = mo12026t("app_measurement_lite");
            this.f10713b = t;
            if (t == null) {
                this.f10713b = Boolean.FALSE;
            }
        }
        return this.f10713b.booleanValue() || !this.f10651a.mo12178s();
    }

    @C10675a
    /* renamed from: H */
    public final boolean mo12016H() {
        if (this.f10715d == null) {
            synchronized (this) {
                if (this.f10715d == null) {
                    ApplicationInfo applicationInfo = this.f10651a.mo11938f().getApplicationInfo();
                    String a = C3766m.m14534a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(a)) {
                            z = true;
                        }
                        this.f10715d = Boolean.valueOf(z);
                    }
                    if (this.f10715d == null) {
                        this.f10715d = Boolean.TRUE;
                        this.f10651a.mo11935b().mo12544r().mo12476a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f10715d.booleanValue();
    }

    /* renamed from: k */
    public final double mo12017k(String str, C3953l3 l3Var) {
        if (str != null) {
            String e = this.f10714c.mo11881e(str, l3Var.mo12146b());
            if (!TextUtils.isEmpty(e)) {
                try {
                    return ((Double) l3Var.mo12145a(Double.valueOf(Double.parseDouble(e)))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Double) l3Var.mo12145a((Object) null)).doubleValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final int mo12018l(String str) {
        return mo12022p(str, C3966m3.f10966I, 500, 2000);
    }

    /* renamed from: m */
    public final int mo12019m() {
        C4105xa N = this.f10651a.mo12161N();
        Boolean J = N.f10651a.mo12159L().mo11985J();
        if (N.mo12514o0() < 201500) {
            return (J == null || J.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    /* renamed from: n */
    public final int mo12020n(String str) {
        return mo12022p(str, C3966m3.f10968J, 25, 100);
    }

    /* renamed from: o */
    public final int mo12021o(String str, C3953l3 l3Var) {
        if (str != null) {
            String e = this.f10714c.mo11881e(str, l3Var.mo12146b());
            if (!TextUtils.isEmpty(e)) {
                try {
                    return ((Integer) l3Var.mo12145a(Integer.valueOf(Integer.parseInt(e)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) l3Var.mo12145a((Object) null)).intValue();
    }

    /* renamed from: p */
    public final int mo12022p(String str, C3953l3 l3Var, int i, int i2) {
        return Math.max(Math.min(mo12021o(str, l3Var), i2), i);
    }

    /* renamed from: q */
    public final long mo12023q() {
        this.f10651a.mo11937d();
        return 68000;
    }

    /* renamed from: r */
    public final long mo12024r(String str, C3953l3 l3Var) {
        if (str != null) {
            String e = this.f10714c.mo11881e(str, l3Var.mo12146b());
            if (!TextUtils.isEmpty(e)) {
                try {
                    return ((Long) l3Var.mo12145a(Long.valueOf(Long.parseLong(e)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) l3Var.mo12145a((Object) null)).longValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final Bundle mo12025s() {
        try {
            if (this.f10651a.mo11938f().getPackageManager() == null) {
                this.f10651a.mo11935b().mo12544r().mo12476a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo b = C3746c.m14493a(this.f10651a.mo11938f()).mo11717b(this.f10651a.mo11938f().getPackageName(), 128);
            if (b != null) {
                return b.metaData;
            }
            this.f10651a.mo11935b().mo12544r().mo12476a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.f10651a.mo11935b().mo12544r().mo12477b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final Boolean mo12026t(String str) {
        C3705r.m14342g(str);
        Bundle s = mo12025s();
        if (s == null) {
            this.f10651a.mo11935b().mo12544r().mo12476a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!s.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(s.getBoolean(str));
        }
    }

    /* renamed from: u */
    public final String mo12027u() {
        return m14819j("debug.firebase.analytics.app", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: v */
    public final String mo12028v() {
        return m14819j("debug.deferred.deeplink", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final String mo12029w() {
        this.f10651a.mo11937d();
        return "FA";
    }

    /* renamed from: x */
    public final String mo12030x(String str, C3953l3 l3Var) {
        return (String) l3Var.mo12145a(str == null ? null : this.f10714c.mo11881e(str, l3Var.mo12146b()));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[SYNTHETIC, Splitter:B:8:0x002e] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo12031y(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.C3705r.m14342g(r4)
            android.os.Bundle r0 = r3.mo12025s()
            r1 = 0
            if (r0 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.l5 r4 = r3.f10651a
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo11935b()
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12544r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo12476a(r0)
        L_0x001b:
            r4 = r1
            goto L_0x002c
        L_0x001d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0024
            goto L_0x001b
        L_0x0024:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x002c:
            if (r4 == 0) goto L_0x0058
            com.google.android.gms.measurement.internal.l5 r0 = r3.f10651a     // Catch:{ NotFoundException -> 0x0048 }
            android.content.Context r0 = r0.mo11938f()     // Catch:{ NotFoundException -> 0x0048 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0048 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0048 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0048 }
            if (r4 != 0) goto L_0x0043
            return r1
        L_0x0043:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0048 }
            return r4
        L_0x0048:
            r4 = move-exception
            com.google.android.gms.measurement.internal.l5 r0 = r3.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12544r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo12477b(r2, r4)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3897h.mo12031y(java.lang.String):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo12032z(C3884g gVar) {
        this.f10714c = gVar;
    }
}
