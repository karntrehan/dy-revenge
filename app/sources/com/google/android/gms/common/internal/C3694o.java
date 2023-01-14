package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: com.google.android.gms.common.internal.o */
public class C3694o extends C3730a {
    public static final Parcelable.Creator<C3694o> CREATOR = new C3695o0();

    /* renamed from: f */
    private final int f10347f;

    /* renamed from: o */
    private final int f10348o;

    /* renamed from: p */
    private final int f10349p;

    /* renamed from: q */
    private final long f10350q;

    /* renamed from: r */
    private final long f10351r;

    /* renamed from: s */
    private final String f10352s;

    /* renamed from: t */
    private final String f10353t;

    /* renamed from: u */
    private final int f10354u;

    /* renamed from: v */
    private final int f10355v;

    @Deprecated
    public C3694o(int i, int i2, int i3, long j, long j2, String str, String str2, int i4) {
        this(i, i2, i3, j, j2, str, str2, i4, -1);
    }

    public C3694o(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f10347f = i;
        this.f10348o = i2;
        this.f10349p = i3;
        this.f10350q = j;
        this.f10351r = j2;
        this.f10352s = str;
        this.f10353t = str2;
        this.f10354u = i4;
        this.f10355v = i5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f10347f);
        C3733c.m14443l(parcel, 2, this.f10348o);
        C3733c.m14443l(parcel, 3, this.f10349p);
        C3733c.m14445n(parcel, 4, this.f10350q);
        C3733c.m14445n(parcel, 5, this.f10351r);
        C3733c.m14448q(parcel, 6, this.f10352s, false);
        C3733c.m14448q(parcel, 7, this.f10353t, false);
        C3733c.m14443l(parcel, 8, this.f10354u);
        C3733c.m14443l(parcel, 9, this.f10355v);
        C3733c.m14433b(parcel, a);
    }
}
