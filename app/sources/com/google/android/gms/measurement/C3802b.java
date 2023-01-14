package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.measurement.internal.C3955l5;
import com.google.android.gms.measurement.internal.C4030r7;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.b */
final class C3802b extends C3805e {

    /* renamed from: a */
    private final C3955l5 f10493a;

    /* renamed from: b */
    private final C4030r7 f10494b;

    public C3802b(C3955l5 l5Var) {
        super((C3804d) null);
        C3705r.m14346k(l5Var);
        this.f10493a = l5Var;
        this.f10494b = l5Var.mo12156I();
    }

    /* renamed from: a */
    public final int mo11787a(String str) {
        this.f10494b.mo12363Q(str);
        return 25;
    }

    /* renamed from: b */
    public final List mo11788b(String str, String str2) {
        return this.f10494b.mo12372Z(str, str2);
    }

    /* renamed from: c */
    public final Map mo11789c(String str, String str2, boolean z) {
        return this.f10494b.mo12373a0(str, str2, z);
    }

    /* renamed from: d */
    public final String mo11790d() {
        return this.f10494b.mo12368V();
    }

    /* renamed from: e */
    public final void mo11791e(Bundle bundle) {
        this.f10494b.mo12352D(bundle);
    }

    /* renamed from: f */
    public final void mo11792f(String str, String str2, Bundle bundle) {
        this.f10494b.mo12378r(str, str2, bundle);
    }

    /* renamed from: g */
    public final String mo11793g() {
        return this.f10494b.mo12369W();
    }

    /* renamed from: h */
    public final void mo11794h(String str) {
        this.f10493a.mo12180y().mo11898l(str, this.f10493a.mo11936c().mo11731b());
    }

    /* renamed from: i */
    public final void mo11795i(String str, String str2, Bundle bundle) {
        this.f10493a.mo12156I().mo12375o(str, str2, bundle);
    }

    /* renamed from: j */
    public final void mo11796j(String str) {
        this.f10493a.mo12180y().mo11899m(str, this.f10493a.mo11936c().mo11731b());
    }

    /* renamed from: l */
    public final String mo11797l() {
        return this.f10494b.mo12370X();
    }

    /* renamed from: m */
    public final String mo11798m() {
        return this.f10494b.mo12368V();
    }

    public final long zzb() {
        return this.f10493a.mo12161N().mo12519r0();
    }
}
