package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.p133n.C3746c;
import com.google.android.gms.common.util.C3758e;
import com.google.android.gms.common.util.C3761h;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import p174e.p319f.p320a.p335c.p345f.p352g.C6924o1;
import p174e.p319f.p320a.p335c.p345f.p352g.C7041v6;
import p174e.p319f.p320a.p335c.p345f.p352g.C7111zc;

/* renamed from: com.google.android.gms.measurement.internal.l5 */
public final class C3955l5 implements C3891g6 {

    /* renamed from: a */
    private static volatile C3955l5 f10894a;

    /* renamed from: A */
    private long f10895A;

    /* renamed from: B */
    private volatile Boolean f10896B;

    /* renamed from: C */
    protected Boolean f10897C;

    /* renamed from: D */
    protected Boolean f10898D;

    /* renamed from: E */
    private volatile boolean f10899E;

    /* renamed from: F */
    private int f10900F;

    /* renamed from: G */
    private final AtomicInteger f10901G = new AtomicInteger(0);

    /* renamed from: H */
    final long f10902H;

    /* renamed from: b */
    private final Context f10903b;

    /* renamed from: c */
    private final String f10904c;

    /* renamed from: d */
    private final String f10905d;

    /* renamed from: e */
    private final String f10906e;

    /* renamed from: f */
    private final boolean f10907f;

    /* renamed from: g */
    private final C3832c f10908g;

    /* renamed from: h */
    private final C3897h f10909h;

    /* renamed from: i */
    private final C4003p4 f10910i;

    /* renamed from: j */
    private final C4122z3 f10911j;

    /* renamed from: k */
    private final C3916i5 f10912k;

    /* renamed from: l */
    private final C4104x9 f10913l;

    /* renamed from: m */
    private final C4105xa f10914m;

    /* renamed from: n */
    private final C4062u3 f10915n;

    /* renamed from: o */
    private final C3758e f10916o;

    /* renamed from: p */
    private final C3893g8 f10917p;

    /* renamed from: q */
    private final C4030r7 f10918q;

    /* renamed from: r */
    private final C3848d2 f10919r;

    /* renamed from: s */
    private final C4078v7 f10920s;

    /* renamed from: t */
    private final String f10921t;

    /* renamed from: u */
    private C4038s3 f10922u;

    /* renamed from: v */
    private C3894g9 f10923v;

    /* renamed from: w */
    private C4022r f10924w;

    /* renamed from: x */
    private C4014q3 f10925x;

    /* renamed from: y */
    private boolean f10926y = false;

    /* renamed from: z */
    private Boolean f10927z;

    C3955l5(C4005p6 p6Var) {
        String str;
        C4098x3 x3Var;
        Bundle bundle;
        boolean z = false;
        C3705r.m14346k(p6Var);
        Context context = p6Var.f11133a;
        C3832c cVar = new C3832c(context);
        this.f10908g = cVar;
        C3927j3.f10816a = cVar;
        this.f10903b = context;
        this.f10904c = p6Var.f11134b;
        this.f10905d = p6Var.f11135c;
        this.f10906e = p6Var.f11136d;
        this.f10907f = p6Var.f11140h;
        this.f10896B = p6Var.f11137e;
        this.f10921t = p6Var.f11142j;
        this.f10899E = true;
        C6924o1 o1Var = p6Var.f11139g;
        if (!(o1Var == null || (bundle = o1Var.f18736t) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f10897C = (Boolean) obj;
            }
            Object obj2 = o1Var.f18736t.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f10898D = (Boolean) obj2;
            }
        }
        C7041v6.m26925e(context);
        C3758e c = C3761h.m14511c();
        this.f10916o = c;
        Long l = p6Var.f11141i;
        this.f10902H = l != null ? l.longValue() : c.mo11730a();
        this.f10909h = new C3897h(this);
        C4003p4 p4Var = new C4003p4(this);
        p4Var.mo11960l();
        this.f10910i = p4Var;
        C4122z3 z3Var = new C4122z3(this);
        z3Var.mo11960l();
        this.f10911j = z3Var;
        C4105xa xaVar = new C4105xa(this);
        xaVar.mo11960l();
        this.f10914m = xaVar;
        this.f10915n = new C4062u3(new C3993o6(p6Var, this));
        this.f10919r = new C3848d2(this);
        C3893g8 g8Var = new C3893g8(this);
        g8Var.mo11950j();
        this.f10917p = g8Var;
        C4030r7 r7Var = new C4030r7(this);
        r7Var.mo11950j();
        this.f10918q = r7Var;
        C4104x9 x9Var = new C4104x9(this);
        x9Var.mo11950j();
        this.f10913l = x9Var;
        C4078v7 v7Var = new C4078v7(this);
        v7Var.mo11960l();
        this.f10920s = v7Var;
        C3916i5 i5Var = new C3916i5(this);
        i5Var.mo11960l();
        this.f10912k = i5Var;
        C6924o1 o1Var2 = p6Var.f11139g;
        z = (o1Var2 == null || o1Var2.f18731o == 0) ? true : z;
        if (context.getApplicationContext() instanceof Application) {
            C4030r7 I = mo12156I();
            if (I.f10651a.f10903b.getApplicationContext() instanceof Application) {
                Application application = (Application) I.f10651a.f10903b.getApplicationContext();
                if (I.f11234c == null) {
                    I.f11234c = new C4018q7(I, (C4006p7) null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(I.f11234c);
                    application.registerActivityLifecycleCallbacks(I.f11234c);
                    x3Var = I.f10651a.mo11935b().mo12548v();
                    str = "Registered activity lifecycle callback";
                }
            }
            i5Var.mo12110z(new C3942k5(this, p6Var));
        }
        x3Var = mo11935b().mo12549w();
        str = "Application context is not an Application";
        x3Var.mo12476a(str);
        i5Var.mo12110z(new C3942k5(this, p6Var));
    }

    /* renamed from: H */
    public static C3955l5 m14977H(Context context, C6924o1 o1Var, Long l) {
        Bundle bundle;
        if (o1Var != null && (o1Var.f18734r == null || o1Var.f18735s == null)) {
            o1Var = new C6924o1(o1Var.f18730f, o1Var.f18731o, o1Var.f18732p, o1Var.f18733q, (String) null, (String) null, o1Var.f18736t, (String) null);
        }
        C3705r.m14346k(context);
        C3705r.m14346k(context.getApplicationContext());
        if (f10894a == null) {
            synchronized (C3955l5.class) {
                if (f10894a == null) {
                    f10894a = new C3955l5(new C4005p6(context, o1Var, l));
                }
            }
        } else if (!(o1Var == null || (bundle = o1Var.f18736t) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            C3705r.m14346k(f10894a);
            f10894a.f10896B = Boolean.valueOf(o1Var.f18736t.getBoolean("dataCollectionDefaultEnabled"));
        }
        C3705r.m14346k(f10894a);
        return f10894a;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ void m14978e(C3955l5 l5Var, C4005p6 p6Var) {
        l5Var.mo11934a().mo11931h();
        l5Var.f10909h.mo12029w();
        C4022r rVar = new C4022r(l5Var);
        rVar.mo11960l();
        l5Var.f10924w = rVar;
        C4014q3 q3Var = new C4014q3(l5Var, p6Var.f11138f);
        q3Var.mo11950j();
        l5Var.f10925x = q3Var;
        C4038s3 s3Var = new C4038s3(l5Var);
        s3Var.mo11950j();
        l5Var.f10922u = s3Var;
        C3894g9 g9Var = new C3894g9(l5Var);
        g9Var.mo11950j();
        l5Var.f10923v = g9Var;
        l5Var.f10914m.mo11961m();
        l5Var.f10910i.mo11961m();
        l5Var.f10925x.mo11951k();
        C4098x3 u = l5Var.mo11935b().mo12547u();
        l5Var.f10909h.mo12023q();
        u.mo12477b("App measurement initialized, version", 68000L);
        l5Var.mo11935b().mo12547u().mo12476a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String s = q3Var.mo12319s();
        if (TextUtils.isEmpty(l5Var.f10904c)) {
            if (l5Var.mo12161N().mo12503T(s)) {
                l5Var.mo11935b().mo12547u().mo12476a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                l5Var.mo11935b().mo12547u().mo12476a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(s)));
            }
        }
        l5Var.mo11935b().mo12543q().mo12476a("Debug-level message logging enabled");
        if (l5Var.f10900F != l5Var.f10901G.get()) {
            l5Var.mo11935b().mo12544r().mo12478c("Not all components initialized", Integer.valueOf(l5Var.f10900F), Integer.valueOf(l5Var.f10901G.get()));
        }
        l5Var.f10926y = true;
    }

    /* renamed from: t */
    static final void m14979t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: u */
    private static final void m14980u(C3865e6 e6Var) {
        if (e6Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: v */
    private static final void m14981v(C3876f4 f4Var) {
        if (f4Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!f4Var.mo11953m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(f4Var.getClass())));
        }
    }

    /* renamed from: w */
    private static final void m14982w(C3878f6 f6Var) {
        if (f6Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!f6Var.mo11962n()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(f6Var.getClass())));
        }
    }

    /* renamed from: A */
    public final C4022r mo12149A() {
        m14982w(this.f10924w);
        return this.f10924w;
    }

    /* renamed from: B */
    public final C4014q3 mo12150B() {
        m14981v(this.f10925x);
        return this.f10925x;
    }

    /* renamed from: C */
    public final C4038s3 mo12151C() {
        m14981v(this.f10922u);
        return this.f10922u;
    }

    /* renamed from: D */
    public final C4062u3 mo12152D() {
        return this.f10915n;
    }

    /* renamed from: E */
    public final C4122z3 mo12153E() {
        C4122z3 z3Var = this.f10911j;
        if (z3Var == null || !z3Var.mo11962n()) {
            return null;
        }
        return z3Var;
    }

    /* renamed from: F */
    public final C4003p4 mo12154F() {
        m14980u(this.f10910i);
        return this.f10910i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final C3916i5 mo12155G() {
        return this.f10912k;
    }

    /* renamed from: I */
    public final C4030r7 mo12156I() {
        m14981v(this.f10918q);
        return this.f10918q;
    }

    /* renamed from: J */
    public final C4078v7 mo12157J() {
        m14982w(this.f10920s);
        return this.f10920s;
    }

    /* renamed from: K */
    public final C3893g8 mo12158K() {
        m14981v(this.f10917p);
        return this.f10917p;
    }

    /* renamed from: L */
    public final C3894g9 mo12159L() {
        m14981v(this.f10923v);
        return this.f10923v;
    }

    /* renamed from: M */
    public final C4104x9 mo12160M() {
        m14981v(this.f10913l);
        return this.f10913l;
    }

    /* renamed from: N */
    public final C4105xa mo12161N() {
        m14980u(this.f10914m);
        return this.f10914m;
    }

    /* renamed from: O */
    public final String mo12162O() {
        return this.f10904c;
    }

    /* renamed from: P */
    public final String mo12163P() {
        return this.f10905d;
    }

    /* renamed from: Q */
    public final String mo12164Q() {
        return this.f10906e;
    }

    /* renamed from: R */
    public final String mo12165R() {
        return this.f10921t;
    }

    /* renamed from: a */
    public final C3916i5 mo11934a() {
        m14982w(this.f10912k);
        return this.f10912k;
    }

    /* renamed from: b */
    public final C4122z3 mo11935b() {
        m14982w(this.f10911j);
        return this.f10911j;
    }

    /* renamed from: c */
    public final C3758e mo11936c() {
        return this.f10916o;
    }

    /* renamed from: d */
    public final C3832c mo11937d() {
        return this.f10908g;
    }

    /* renamed from: f */
    public final Context mo11938f() {
        return this.f10903b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo12166g() {
        this.f10901G.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo12167h(String str, int i, Throwable th, byte[] bArr, Map map) {
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = 304;
            }
            mo11935b().mo12549w().mo12478c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            mo12154F().f11123s.mo12127a(true);
            if (bArr == null || bArr.length == 0) {
                mo11935b().mo12543q().mo12476a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", HttpUrl.FRAGMENT_ENCODE_SET);
                String optString2 = jSONObject.optString("gclid", HttpUrl.FRAGMENT_ENCODE_SET);
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    mo11935b().mo12543q().mo12476a("Deferred Deep Link is empty.");
                    return;
                }
                C4105xa N = mo12161N();
                C3955l5 l5Var = N.f10651a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = N.f10651a.f10903b.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f10918q.mo12381u("auto", "_cmp", bundle);
                        C4105xa N2 = mo12161N();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = N2.f10651a.f10903b.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    N2.f10651a.f10903b.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                N2.f10651a.mo11935b().mo12544r().mo12477b("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                mo11935b().mo12549w().mo12478c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                mo11935b().mo12544r().mo12477b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        mo11935b().mo12549w().mo12478c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo12168i() {
        this.f10900F++;
    }

    /* renamed from: j */
    public final void mo12169j() {
        mo11934a().mo11931h();
        m14982w(mo12157J());
        String s = mo12150B().mo12319s();
        Pair p = mo12154F().mo12256p(s);
        if (!this.f10909h.mo12009A() || ((Boolean) p.second).booleanValue() || TextUtils.isEmpty((CharSequence) p.first)) {
            mo11935b().mo12543q().mo12476a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        C4078v7 J = mo12157J();
        J.mo11959k();
        ConnectivityManager connectivityManager = (ConnectivityManager) J.f10651a.f10903b.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            mo11935b().mo12549w().mo12476a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        C4105xa N = mo12161N();
        mo12150B().f10651a.f10909h.mo12023q();
        URL s2 = N.mo12520s(68000, s, (String) p.first, mo12154F().f11124t.mo12147a() - 1);
        if (s2 != null) {
            C4078v7 J2 = mo12157J();
            C3929j5 j5Var = new C3929j5(this);
            J2.mo11931h();
            J2.mo11959k();
            C3705r.m14346k(s2);
            C3705r.m14346k(j5Var);
            J2.f10651a.mo11934a().mo12109y(new C4066u7(J2, s, s2, (byte[]) null, (Map) null, j5Var, (byte[]) null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo12170k(boolean z) {
        this.f10896B = Boolean.valueOf(z);
    }

    /* renamed from: l */
    public final void mo12171l(boolean z) {
        mo11934a().mo11931h();
        this.f10899E = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo12172m(C6924o1 o1Var) {
        C3923j jVar;
        mo11934a().mo11931h();
        C3923j q = mo12154F().mo12257q();
        C4003p4 F = mo12154F();
        C3955l5 l5Var = F.f10651a;
        F.mo11931h();
        int i = 100;
        int i2 = F.mo12255o().getInt("consent_source", 100);
        C3897h hVar = this.f10909h;
        C3955l5 l5Var2 = hVar.f10651a;
        Boolean t = hVar.mo12026t("google_analytics_default_allow_ad_storage");
        C3897h hVar2 = this.f10909h;
        C3955l5 l5Var3 = hVar2.f10651a;
        Boolean t2 = hVar2.mo12026t("google_analytics_default_allow_analytics_storage");
        if (!(t == null && t2 == null) && mo12154F().mo12263w(-10)) {
            jVar = new C3923j(t, t2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(mo12150B().mo12320t()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                mo12156I().mo12355G(C3923j.f10811a, -10, this.f10902H);
            } else if (TextUtils.isEmpty(mo12150B().mo12320t()) && o1Var != null && o1Var.f18736t != null && mo12154F().mo12263w(30)) {
                jVar = C3923j.m14934a(o1Var.f18736t);
                if (!jVar.equals(C3923j.f10811a)) {
                    i = 30;
                }
            }
            jVar = null;
        }
        if (jVar != null) {
            mo12156I().mo12355G(jVar, i, this.f10902H);
            q = jVar;
        }
        mo12156I().mo12358J(q);
        if (mo12154F().f11110f.mo12147a() == 0) {
            mo11935b().mo12548v().mo12477b("Persisting first open", Long.valueOf(this.f10902H));
            mo12154F().f11110f.mo12148b(this.f10902H);
        }
        mo12156I().f11245n.mo11946c();
        if (mo12177r()) {
            if (!TextUtils.isEmpty(mo12150B().mo12320t()) || !TextUtils.isEmpty(mo12150B().mo12318r())) {
                C4105xa N = mo12161N();
                String t3 = mo12150B().mo12320t();
                C4003p4 F2 = mo12154F();
                F2.mo11931h();
                String string = F2.mo12255o().getString("gmp_app_id", (String) null);
                String r = mo12150B().mo12318r();
                C4003p4 F3 = mo12154F();
                F3.mo11931h();
                if (N.mo12506b0(t3, string, r, F3.mo12255o().getString("admob_app_id", (String) null))) {
                    mo11935b().mo12547u().mo12476a("Rechecking which service to use due to a GMP App Id change");
                    C4003p4 F4 = mo12154F();
                    F4.mo11931h();
                    Boolean r2 = F4.mo12258r();
                    SharedPreferences.Editor edit = F4.mo12255o().edit();
                    edit.clear();
                    edit.apply();
                    if (r2 != null) {
                        F4.mo12259s(r2);
                    }
                    mo12151C().mo12407q();
                    this.f10923v.mo11988Q();
                    this.f10923v.mo11987P();
                    mo12154F().f11110f.mo12148b(this.f10902H);
                    mo12154F().f11112h.mo12239b((String) null);
                }
                C4003p4 F5 = mo12154F();
                String t4 = mo12150B().mo12320t();
                F5.mo11931h();
                SharedPreferences.Editor edit2 = F5.mo12255o().edit();
                edit2.putString("gmp_app_id", t4);
                edit2.apply();
                C4003p4 F6 = mo12154F();
                String r3 = mo12150B().mo12318r();
                F6.mo11931h();
                SharedPreferences.Editor edit3 = F6.mo12255o().edit();
                edit3.putString("admob_app_id", r3);
                edit3.apply();
            }
            if (!mo12154F().mo12257q().mo12123i(C3910i.ANALYTICS_STORAGE)) {
                mo12154F().f11112h.mo12239b((String) null);
            }
            mo12156I().mo12351C(mo12154F().f11112h.mo12238a());
            C7111zc.m27095b();
            if (this.f10909h.mo12010B((String) null, C3966m3.f10995e0)) {
                try {
                    mo12161N().f10651a.f10903b.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(mo12154F().f11125u.mo12238a())) {
                        mo11935b().mo12549w().mo12476a("Remote config removed with active feature rollouts");
                        mo12154F().f11125u.mo12239b((String) null);
                    }
                }
            }
            if (!TextUtils.isEmpty(mo12150B().mo12320t()) || !TextUtils.isEmpty(mo12150B().mo12318r())) {
                boolean o = mo12174o();
                if (!mo12154F().mo12261u() && !this.f10909h.mo12013E()) {
                    mo12154F().mo12260t(!o);
                }
                if (o) {
                    mo12156I().mo12374f0();
                }
                mo12160M().f11408d.mo12471a();
                mo12159L().mo11990S(new AtomicReference());
                mo12159L().mo12002v(mo12154F().f11128x.mo12139a());
            }
        } else if (mo12174o()) {
            if (!mo12161N().mo12502S("android.permission.INTERNET")) {
                mo11935b().mo12544r().mo12476a("App is missing INTERNET permission");
            }
            if (!mo12161N().mo12502S("android.permission.ACCESS_NETWORK_STATE")) {
                mo11935b().mo12544r().mo12476a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C3746c.m14493a(this.f10903b).mo11720e() && !this.f10909h.mo12015G()) {
                if (!C4105xa.m15396Y(this.f10903b)) {
                    mo11935b().mo12544r().mo12476a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C4105xa.m15397Z(this.f10903b, false)) {
                    mo11935b().mo12544r().mo12476a("AppMeasurementService not registered/enabled");
                }
            }
            mo11935b().mo12544r().mo12476a("Uploading is not possible. App measurement disabled");
        }
        mo12154F().f11119o.mo12127a(true);
    }

    /* renamed from: n */
    public final boolean mo12173n() {
        return this.f10896B != null && this.f10896B.booleanValue();
    }

    /* renamed from: o */
    public final boolean mo12174o() {
        return mo12179x() == 0;
    }

    /* renamed from: p */
    public final boolean mo12175p() {
        mo11934a().mo11931h();
        return this.f10899E;
    }

    /* renamed from: q */
    public final boolean mo12176q() {
        return TextUtils.isEmpty(this.f10904c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo12177r() {
        if (this.f10926y) {
            mo11934a().mo11931h();
            Boolean bool = this.f10927z;
            if (bool == null || this.f10895A == 0 || (!bool.booleanValue() && Math.abs(this.f10916o.mo11731b() - this.f10895A) > 1000)) {
                this.f10895A = this.f10916o.mo11731b();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(mo12161N().mo12502S("android.permission.INTERNET") && mo12161N().mo12502S("android.permission.ACCESS_NETWORK_STATE") && (C3746c.m14493a(this.f10903b).mo11720e() || this.f10909h.mo12015G() || (C4105xa.m15396Y(this.f10903b) && C4105xa.m15397Z(this.f10903b, false))));
                this.f10927z = valueOf;
                if (valueOf.booleanValue()) {
                    if (!mo12161N().mo12495L(mo12150B().mo12320t(), mo12150B().mo12318r()) && TextUtils.isEmpty(mo12150B().mo12318r())) {
                        z = false;
                    }
                    this.f10927z = Boolean.valueOf(z);
                }
            }
            return this.f10927z.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    /* renamed from: s */
    public final boolean mo12178s() {
        return this.f10907f;
    }

    /* renamed from: x */
    public final int mo12179x() {
        mo11934a().mo11931h();
        if (this.f10909h.mo12013E()) {
            return 1;
        }
        Boolean bool = this.f10898D;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo11934a().mo11931h();
        if (!this.f10899E) {
            return 8;
        }
        Boolean r = mo12154F().mo12258r();
        if (r != null) {
            return r.booleanValue() ? 0 : 3;
        }
        C3897h hVar = this.f10909h;
        C3832c cVar = hVar.f10651a.f10908g;
        Boolean t = hVar.mo12026t("firebase_analytics_collection_enabled");
        if (t != null) {
            return t.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f10897C;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f10896B == null || this.f10896B.booleanValue()) ? 0 : 7;
    }

    /* renamed from: y */
    public final C3848d2 mo12180y() {
        C3848d2 d2Var = this.f10919r;
        if (d2Var != null) {
            return d2Var;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: z */
    public final C3897h mo12181z() {
        return this.f10909h;
    }
}
