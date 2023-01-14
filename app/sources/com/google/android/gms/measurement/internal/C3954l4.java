package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.l4 */
public final class C3954l4 {

    /* renamed from: a */
    private final String f10889a;

    /* renamed from: b */
    private final long f10890b;

    /* renamed from: c */
    private boolean f10891c;

    /* renamed from: d */
    private long f10892d;

    /* renamed from: e */
    final /* synthetic */ C4003p4 f10893e;

    public C3954l4(C4003p4 p4Var, String str, long j) {
        this.f10893e = p4Var;
        C3705r.m14342g(str);
        this.f10889a = str;
        this.f10890b = j;
    }

    /* renamed from: a */
    public final long mo12147a() {
        if (!this.f10891c) {
            this.f10891c = true;
            this.f10892d = this.f10893e.mo12255o().getLong(this.f10889a, this.f10890b);
        }
        return this.f10892d;
    }

    /* renamed from: b */
    public final void mo12148b(long j) {
        SharedPreferences.Editor edit = this.f10893e.mo12255o().edit();
        edit.putLong(this.f10889a, j);
        edit.apply();
        this.f10892d = j;
    }
}
