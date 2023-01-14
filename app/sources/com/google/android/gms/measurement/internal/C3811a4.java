package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.a4 */
public final class C3811a4 {

    /* renamed from: a */
    public final String f10505a;

    /* renamed from: b */
    public final String f10506b;

    /* renamed from: c */
    public final long f10507c;

    /* renamed from: d */
    public final Bundle f10508d;

    public C3811a4(String str, String str2, Bundle bundle, long j) {
        this.f10505a = str;
        this.f10506b = str2;
        this.f10508d = bundle;
        this.f10507c = j;
    }

    /* renamed from: b */
    public static C3811a4 m14622b(C4094x xVar) {
        return new C3811a4(xVar.f11381f, xVar.f11383p, xVar.f11382o.mo12453r(), xVar.f11384q);
    }

    /* renamed from: a */
    public final C4094x mo11846a() {
        return new C4094x(this.f10505a, new C4070v(new Bundle(this.f10508d)), this.f10506b, this.f10507c);
    }

    public final String toString() {
        String str = this.f10506b;
        String str2 = this.f10505a;
        String obj = this.f10508d.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }
}
