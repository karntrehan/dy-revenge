package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.common.internal.C3705r;
import okhttp3.HttpUrl;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p174e.p319f.p320a.p335c.p336a.p337a.C6614a;
import p497j.p498a.p499a.p500a.p501a.C10675a;

/* renamed from: com.google.android.gms.measurement.internal.p4 */
final class C4003p4 extends C3878f6 {

    /* renamed from: c */
    static final Pair f11107c = new Pair(HttpUrl.FRAGMENT_ENCODE_SET, 0L);

    /* renamed from: d */
    private SharedPreferences f11108d;

    /* renamed from: e */
    public C3979n4 f11109e;

    /* renamed from: f */
    public final C3954l4 f11110f = new C3954l4(this, "first_open_time", 0);

    /* renamed from: g */
    public final C3954l4 f11111g = new C3954l4(this, "app_install_time", 0);

    /* renamed from: h */
    public final C3991o4 f11112h = new C3991o4(this, "app_instance_id", (String) null);

    /* renamed from: i */
    private String f11113i;

    /* renamed from: j */
    private boolean f11114j;

    /* renamed from: k */
    private long f11115k;

    /* renamed from: l */
    public final C3954l4 f11116l = new C3954l4(this, "session_timeout", 1800000);

    /* renamed from: m */
    public final C3928j4 f11117m = new C3928j4(this, "start_new_session", true);

    /* renamed from: n */
    public final C3991o4 f11118n = new C3991o4(this, "non_personalized_ads", (String) null);

    /* renamed from: o */
    public final C3928j4 f11119o = new C3928j4(this, "allow_remote_dynamite", false);

    /* renamed from: p */
    public final C3954l4 f11120p = new C3954l4(this, "last_pause_time", 0);

    /* renamed from: q */
    public boolean f11121q;

    /* renamed from: r */
    public final C3928j4 f11122r = new C3928j4(this, "app_backgrounded", false);

    /* renamed from: s */
    public final C3928j4 f11123s = new C3928j4(this, "deep_link_retrieval_complete", false);

    /* renamed from: t */
    public final C3954l4 f11124t = new C3954l4(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: u */
    public final C3991o4 f11125u = new C3991o4(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: v */
    public final C3991o4 f11126v = new C3991o4(this, "deferred_attribution_cache", (String) null);

    /* renamed from: w */
    public final C3954l4 f11127w = new C3954l4(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: x */
    public final C3941k4 f11128x = new C3941k4(this, "default_event_parameters", (Bundle) null);

    C4003p4(C3955l5 l5Var) {
        super(l5Var);
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNull.List({@C10675a({"this.preferences"}), @C10675a({"this.monitoringSample"})})
    /* renamed from: i */
    public final void mo11957i() {
        SharedPreferences sharedPreferences = this.f10651a.mo11938f().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f11108d = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f11121q = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f11108d.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f10651a.mo12181z();
        this.f11109e = new C3979n4(this, "health_monitor", Math.max(0, ((Long) C3966m3.f10992d.mo12145a((Object) null)).longValue()), (C3967m4) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo11958j() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final SharedPreferences mo12255o() {
        mo11931h();
        mo11959k();
        C3705r.m14346k(this.f11108d);
        return this.f11108d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final Pair mo12256p(String str) {
        mo11931h();
        long b = this.f10651a.mo11936c().mo11731b();
        String str2 = this.f11113i;
        if (str2 != null && b < this.f11115k) {
            return new Pair(str2, Boolean.valueOf(this.f11114j));
        }
        this.f11115k = b + this.f10651a.mo12181z().mo12024r(str, C3966m3.f10990c);
        C6614a.m25251b(true);
        try {
            C6614a.C6615a a = C6614a.m25250a(this.f10651a.mo11938f());
            this.f11113i = HttpUrl.FRAGMENT_ENCODE_SET;
            String a2 = a.mo19434a();
            if (a2 != null) {
                this.f11113i = a2;
            }
            this.f11114j = a.mo19435b();
        } catch (Exception e) {
            this.f10651a.mo11935b().mo12543q().mo12477b("Unable to get advertising id", e);
            this.f11113i = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C6614a.m25251b(false);
        return new Pair(this.f11113i, Boolean.valueOf(this.f11114j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final C3923j mo12257q() {
        mo11931h();
        return C3923j.m14935b(mo12255o().getString("consent_settings", "G1"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final Boolean mo12258r() {
        mo11931h();
        if (mo12255o().contains("measurement_enabled")) {
            return Boolean.valueOf(mo12255o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo12259s(Boolean bool) {
        mo11931h();
        SharedPreferences.Editor edit = mo12255o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo12260t(boolean z) {
        mo11931h();
        this.f10651a.mo11935b().mo12548v().mo12477b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo12255o().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo12261u() {
        SharedPreferences sharedPreferences = this.f11108d;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo12262v(long j) {
        return j - this.f11116l.mo12147a() > this.f11120p.mo12147a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo12263w(int i) {
        return C3923j.m14937j(i, mo12255o().getInt("consent_source", 100));
    }
}
