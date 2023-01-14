package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: com.google.android.gms.common.e0 */
public final class C3630e0 extends C3730a {
    public static final Parcelable.Creator<C3630e0> CREATOR = new C3632f0();

    /* renamed from: f */
    private final boolean f10205f;

    /* renamed from: o */
    private final String f10206o;

    /* renamed from: p */
    private final int f10207p;

    C3630e0(boolean z, String str, int i) {
        this.f10205f = z;
        this.f10206o = str;
        this.f10207p = C3628d0.m14085a(i) - 1;
    }

    /* renamed from: o */
    public final String mo11499o() {
        return this.f10206o;
    }

    /* renamed from: p */
    public final boolean mo11500p() {
        return this.f10205f;
    }

    /* renamed from: r */
    public final int mo11501r() {
        return C3628d0.m14085a(this.f10207p);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14434c(parcel, 1, this.f10205f);
        C3733c.m14448q(parcel, 2, this.f10206o, false);
        C3733c.m14443l(parcel, 3, this.f10207p);
        C3733c.m14433b(parcel, a);
    }
}
