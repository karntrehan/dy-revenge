package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.internal.C3678j;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: com.google.android.gms.common.internal.v0 */
public final class C3718v0 extends C3730a {
    public static final Parcelable.Creator<C3718v0> CREATOR = new C3721w0();

    /* renamed from: f */
    final int f10400f;

    /* renamed from: o */
    final IBinder f10401o;

    /* renamed from: p */
    private final C3623b f10402p;

    /* renamed from: q */
    private final boolean f10403q;

    /* renamed from: r */
    private final boolean f10404r;

    C3718v0(int i, IBinder iBinder, C3623b bVar, boolean z, boolean z2) {
        this.f10400f = i;
        this.f10401o = iBinder;
        this.f10402p = bVar;
        this.f10403q = z;
        this.f10404r = z2;
    }

    /* renamed from: C */
    public final boolean mo11686C() {
        return this.f10404r;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3718v0)) {
            return false;
        }
        C3718v0 v0Var = (C3718v0) obj;
        return this.f10402p.equals(v0Var.f10402p) && C3697p.m14323b(mo11689p(), v0Var.mo11689p());
    }

    /* renamed from: o */
    public final C3623b mo11688o() {
        return this.f10402p;
    }

    /* renamed from: p */
    public final C3678j mo11689p() {
        IBinder iBinder = this.f10401o;
        if (iBinder == null) {
            return null;
        }
        return C3678j.C3679a.m14296k(iBinder);
    }

    /* renamed from: r */
    public final boolean mo11690r() {
        return this.f10403q;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f10400f);
        C3733c.m14442k(parcel, 2, this.f10401o, false);
        C3733c.m14447p(parcel, 3, this.f10402p, i, false);
        C3733c.m14434c(parcel, 4, this.f10403q);
        C3733c.m14434c(parcel, 5, this.f10404r);
        C3733c.m14433b(parcel, a);
    }
}
