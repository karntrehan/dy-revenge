package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3697p;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: com.google.android.gms.common.d */
public class C3627d extends C3730a {
    public static final Parcelable.Creator<C3627d> CREATOR = new C3749q();

    /* renamed from: f */
    private final String f10198f;
    @Deprecated

    /* renamed from: o */
    private final int f10199o;

    /* renamed from: p */
    private final long f10200p;

    public C3627d(String str, int i, long j) {
        this.f10198f = str;
        this.f10199o = i;
        this.f10200p = j;
    }

    public C3627d(String str, long j) {
        this.f10198f = str;
        this.f10200p = j;
        this.f10199o = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3627d) {
            C3627d dVar = (C3627d) obj;
            return ((mo11475o() != null && mo11475o().equals(dVar.mo11475o())) || (mo11475o() == null && dVar.mo11475o() == null)) && mo11476p() == dVar.mo11476p();
        }
    }

    public final int hashCode() {
        return C3697p.m14324c(mo11475o(), Long.valueOf(mo11476p()));
    }

    /* renamed from: o */
    public String mo11475o() {
        return this.f10198f;
    }

    /* renamed from: p */
    public long mo11476p() {
        long j = this.f10200p;
        return j == -1 ? (long) this.f10199o : j;
    }

    public final String toString() {
        C3697p.C3698a d = C3697p.m14325d(this);
        d.mo11646a("name", mo11475o());
        d.mo11646a("version", Long.valueOf(mo11476p()));
        return d.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 1, mo11475o(), false);
        C3733c.m14443l(parcel, 2, this.f10199o);
        C3733c.m14445n(parcel, 3, mo11476p());
        C3733c.m14433b(parcel, a);
    }
}
