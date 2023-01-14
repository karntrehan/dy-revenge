package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import p174e.p319f.p320a.p335c.p343d.C6634a;
import p174e.p319f.p320a.p335c.p343d.C6636b;

/* renamed from: com.google.android.gms.common.b0 */
public final class C3624b0 extends C3730a {
    public static final Parcelable.Creator<C3624b0> CREATOR = new C3626c0();

    /* renamed from: f */
    private final String f10190f;

    /* renamed from: o */
    private final boolean f10191o;

    /* renamed from: p */
    private final boolean f10192p;

    /* renamed from: q */
    private final Context f10193q;

    /* renamed from: r */
    private final boolean f10194r;

    C3624b0(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.f10190f = str;
        this.f10191o = z;
        this.f10192p = z2;
        this.f10193q = (Context) C6636b.m25277m(C6634a.C6635a.m25275k(iBinder));
        this.f10194r = z3;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [e.f.a.c.d.a, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 1, this.f10190f, false);
        C3733c.m14434c(parcel, 2, this.f10191o);
        C3733c.m14434c(parcel, 3, this.f10192p);
        C3733c.m14442k(parcel, 4, C6636b.m25276Y(this.f10193q), false);
        C3733c.m14434c(parcel, 5, this.f10194r);
        C3733c.m14433b(parcel, a);
    }
}
