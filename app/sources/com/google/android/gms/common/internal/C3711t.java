package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: com.google.android.gms.common.internal.t */
public class C3711t extends C3730a {
    public static final Parcelable.Creator<C3711t> CREATOR = new C3668f1();

    /* renamed from: f */
    private final int f10379f;

    /* renamed from: o */
    private final boolean f10380o;

    /* renamed from: p */
    private final boolean f10381p;

    /* renamed from: q */
    private final int f10382q;

    /* renamed from: r */
    private final int f10383r;

    public C3711t(int i, boolean z, boolean z2, int i2, int i3) {
        this.f10379f = i;
        this.f10380o = z;
        this.f10381p = z2;
        this.f10382q = i2;
        this.f10383r = i3;
    }

    /* renamed from: C */
    public boolean mo11671C() {
        return this.f10381p;
    }

    /* renamed from: E */
    public int mo11672E() {
        return this.f10379f;
    }

    /* renamed from: o */
    public int mo11673o() {
        return this.f10382q;
    }

    /* renamed from: p */
    public int mo11674p() {
        return this.f10383r;
    }

    /* renamed from: r */
    public boolean mo11675r() {
        return this.f10380o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, mo11672E());
        C3733c.m14434c(parcel, 2, mo11675r());
        C3733c.m14434c(parcel, 3, mo11671C());
        C3733c.m14443l(parcel, 4, mo11673o());
        C3733c.m14443l(parcel, 5, mo11674p());
        C3733c.m14433b(parcel, a);
    }
}
