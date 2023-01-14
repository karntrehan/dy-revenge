package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
public class C3439a extends C3730a {
    public static final Parcelable.Creator<C3439a> CREATOR = new C3442d();

    /* renamed from: f */
    final int f9779f;

    /* renamed from: o */
    private int f9780o;

    /* renamed from: p */
    private Bundle f9781p;

    C3439a(int i, int i2, Bundle bundle) {
        this.f9779f = i;
        this.f9780o = i2;
        this.f9781p = bundle;
    }

    /* renamed from: o */
    public int mo11114o() {
        return this.f9780o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f9779f);
        C3733c.m14443l(parcel, 2, mo11114o());
        C3733c.m14436e(parcel, 3, this.f9781p, false);
        C3733c.m14433b(parcel, a);
    }
}
