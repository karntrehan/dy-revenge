package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.p130z.C3730a;

/* renamed from: com.google.android.gms.measurement.internal.x */
public final class C4094x extends C3730a {
    public static final Parcelable.Creator<C4094x> CREATOR = new C4106y();

    /* renamed from: f */
    public final String f11381f;

    /* renamed from: o */
    public final C4070v f11382o;

    /* renamed from: p */
    public final String f11383p;

    /* renamed from: q */
    public final long f11384q;

    C4094x(C4094x xVar, long j) {
        C3705r.m14346k(xVar);
        this.f11381f = xVar.f11381f;
        this.f11382o = xVar.f11382o;
        this.f11383p = xVar.f11383p;
        this.f11384q = j;
    }

    public C4094x(String str, C4070v vVar, String str2, long j) {
        this.f11381f = str;
        this.f11382o = vVar;
        this.f11383p = str2;
        this.f11384q = j;
    }

    public final String toString() {
        String str = this.f11383p;
        String str2 = this.f11381f;
        String valueOf = String.valueOf(this.f11382o);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C4106y.m15457a(this, parcel, i);
    }
}
