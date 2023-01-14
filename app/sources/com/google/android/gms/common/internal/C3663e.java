package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: com.google.android.gms.common.internal.e */
public class C3663e extends C3730a {
    public static final Parcelable.Creator<C3663e> CREATOR = new C3696o1();

    /* renamed from: f */
    private final C3711t f10278f;

    /* renamed from: o */
    private final boolean f10279o;

    /* renamed from: p */
    private final boolean f10280p;

    /* renamed from: q */
    private final int[] f10281q;

    /* renamed from: r */
    private final int f10282r;

    /* renamed from: s */
    private final int[] f10283s;

    public C3663e(C3711t tVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f10278f = tVar;
        this.f10279o = z;
        this.f10280p = z2;
        this.f10281q = iArr;
        this.f10282r = i;
        this.f10283s = iArr2;
    }

    /* renamed from: C */
    public boolean mo11585C() {
        return this.f10279o;
    }

    /* renamed from: E */
    public boolean mo11586E() {
        return this.f10280p;
    }

    /* renamed from: G */
    public final C3711t mo11587G() {
        return this.f10278f;
    }

    /* renamed from: o */
    public int mo11588o() {
        return this.f10282r;
    }

    /* renamed from: p */
    public int[] mo11589p() {
        return this.f10281q;
    }

    /* renamed from: r */
    public int[] mo11590r() {
        return this.f10283s;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14447p(parcel, 1, this.f10278f, i, false);
        C3733c.m14434c(parcel, 2, mo11585C());
        C3733c.m14434c(parcel, 3, mo11586E());
        C3733c.m14444m(parcel, 4, mo11589p(), false);
        C3733c.m14443l(parcel, 5, mo11588o());
        C3733c.m14444m(parcel, 6, mo11590r(), false);
        C3733c.m14433b(parcel, a);
    }
}
