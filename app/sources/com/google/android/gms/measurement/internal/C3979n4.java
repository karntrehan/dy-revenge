package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.C3705r;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.measurement.internal.n4 */
public final class C3979n4 {

    /* renamed from: a */
    final String f11070a;

    /* renamed from: b */
    private final String f11071b;

    /* renamed from: c */
    private final String f11072c;

    /* renamed from: d */
    private final long f11073d;

    /* renamed from: e */
    final /* synthetic */ C4003p4 f11074e;

    /* synthetic */ C3979n4(C4003p4 p4Var, String str, long j, C3967m4 m4Var) {
        this.f11074e = p4Var;
        C3705r.m14342g("health_monitor");
        C3705r.m14336a(j > 0);
        this.f11070a = "health_monitor:start";
        this.f11071b = "health_monitor:count";
        this.f11072c = "health_monitor:value";
        this.f11073d = j;
    }

    /* renamed from: c */
    private final long m15095c() {
        return this.f11074e.mo12255o().getLong(this.f11070a, 0);
    }

    /* renamed from: d */
    private final void m15096d() {
        this.f11074e.mo11931h();
        long a = this.f11074e.f10651a.mo11936c().mo11730a();
        SharedPreferences.Editor edit = this.f11074e.mo12255o().edit();
        edit.remove(this.f11071b);
        edit.remove(this.f11072c);
        edit.putLong(this.f11070a, a);
        edit.apply();
    }

    /* renamed from: a */
    public final Pair mo12232a() {
        long j;
        this.f11074e.mo11931h();
        this.f11074e.mo11931h();
        long c = m15095c();
        if (c == 0) {
            m15096d();
            j = 0;
        } else {
            j = Math.abs(c - this.f11074e.f10651a.mo11936c().mo11730a());
        }
        long j2 = this.f11073d;
        if (j < j2) {
            return null;
        }
        if (j > j2 + j2) {
            m15096d();
            return null;
        }
        String string = this.f11074e.mo12255o().getString(this.f11072c, (String) null);
        long j3 = this.f11074e.mo12255o().getLong(this.f11071b, 0);
        m15096d();
        return (string == null || j3 <= 0) ? C4003p4.f11107c : new Pair(string, Long.valueOf(j3));
    }

    /* renamed from: b */
    public final void mo12233b(String str, long j) {
        this.f11074e.mo11931h();
        if (m15095c() == 0) {
            m15096d();
        }
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        long j2 = this.f11074e.mo12255o().getLong(this.f11071b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f11074e.mo12255o().edit();
            edit.putString(this.f11072c, str);
            edit.putLong(this.f11071b, 1);
            edit.apply();
            return;
        }
        long nextLong = this.f11074e.f10651a.mo12161N().mo12523u().nextLong();
        long j3 = j2 + 1;
        SharedPreferences.Editor edit2 = this.f11074e.mo12255o().edit();
        if ((nextLong & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
            edit2.putString(this.f11072c, str);
        }
        edit2.putLong(this.f11071b, j3);
        edit2.apply();
    }
}
