package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C3627d;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: com.google.android.gms.common.internal.m1 */
public final class C3690m1 extends C3730a {
    public static final Parcelable.Creator<C3690m1> CREATOR = new C3693n1();

    /* renamed from: f */
    Bundle f10338f;

    /* renamed from: o */
    C3627d[] f10339o;

    /* renamed from: p */
    int f10340p;

    /* renamed from: q */
    C3663e f10341q;

    public C3690m1() {
    }

    C3690m1(Bundle bundle, C3627d[] dVarArr, int i, C3663e eVar) {
        this.f10338f = bundle;
        this.f10339o = dVarArr;
        this.f10340p = i;
        this.f10341q = eVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14436e(parcel, 1, this.f10338f, false);
        C3733c.m14451t(parcel, 2, this.f10339o, i, false);
        C3733c.m14443l(parcel, 3, this.f10340p);
        C3733c.m14447p(parcel, 4, this.f10341q, i, false);
        C3733c.m14433b(parcel, a);
    }
}
