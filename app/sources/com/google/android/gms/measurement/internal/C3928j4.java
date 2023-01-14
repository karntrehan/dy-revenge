package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.j4 */
public final class C3928j4 {

    /* renamed from: a */
    private final String f10817a;

    /* renamed from: b */
    private final boolean f10818b;

    /* renamed from: c */
    private boolean f10819c;

    /* renamed from: d */
    private boolean f10820d;

    /* renamed from: e */
    final /* synthetic */ C4003p4 f10821e;

    public C3928j4(C4003p4 p4Var, String str, boolean z) {
        this.f10821e = p4Var;
        C3705r.m14342g(str);
        this.f10817a = str;
        this.f10818b = z;
    }

    /* renamed from: a */
    public final void mo12127a(boolean z) {
        SharedPreferences.Editor edit = this.f10821e.mo12255o().edit();
        edit.putBoolean(this.f10817a, z);
        edit.apply();
        this.f10820d = z;
    }

    /* renamed from: b */
    public final boolean mo12128b() {
        if (!this.f10819c) {
            this.f10819c = true;
            this.f10820d = this.f10821e.mo12255o().getBoolean(this.f10817a, this.f10818b);
        }
        return this.f10820d;
    }
}
