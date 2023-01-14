package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.o4 */
public final class C3991o4 {

    /* renamed from: a */
    private final String f11085a;

    /* renamed from: b */
    private boolean f11086b;

    /* renamed from: c */
    private String f11087c;

    /* renamed from: d */
    final /* synthetic */ C4003p4 f11088d;

    public C3991o4(C4003p4 p4Var, String str, String str2) {
        this.f11088d = p4Var;
        C3705r.m14342g(str);
        this.f11085a = str;
    }

    /* renamed from: a */
    public final String mo12238a() {
        if (!this.f11086b) {
            this.f11086b = true;
            this.f11087c = this.f11088d.mo12255o().getString(this.f11085a, (String) null);
        }
        return this.f11087c;
    }

    /* renamed from: b */
    public final void mo12239b(String str) {
        SharedPreferences.Editor edit = this.f11088d.mo12255o().edit();
        edit.putString(this.f11085a, str);
        edit.apply();
        this.f11087c = str;
    }
}
