package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.cb */
public final class C3844cb extends C3730a {
    public static final Parcelable.Creator<C3844cb> CREATOR = new C3857db();

    /* renamed from: A */
    public final int f10582A;

    /* renamed from: B */
    public final boolean f10583B;

    /* renamed from: C */
    public final boolean f10584C;

    /* renamed from: D */
    public final String f10585D;

    /* renamed from: E */
    public final Boolean f10586E;

    /* renamed from: F */
    public final long f10587F;

    /* renamed from: G */
    public final List f10588G;

    /* renamed from: H */
    public final String f10589H;

    /* renamed from: I */
    public final String f10590I;

    /* renamed from: J */
    public final String f10591J;

    /* renamed from: K */
    public final String f10592K;

    /* renamed from: f */
    public final String f10593f;

    /* renamed from: o */
    public final String f10594o;

    /* renamed from: p */
    public final String f10595p;

    /* renamed from: q */
    public final String f10596q;

    /* renamed from: r */
    public final long f10597r;

    /* renamed from: s */
    public final long f10598s;

    /* renamed from: t */
    public final String f10599t;

    /* renamed from: u */
    public final boolean f10600u;

    /* renamed from: v */
    public final boolean f10601v;

    /* renamed from: w */
    public final long f10602w;

    /* renamed from: x */
    public final String f10603x;
    @Deprecated

    /* renamed from: y */
    public final long f10604y;

    /* renamed from: z */
    public final long f10605z;

    C3844cb(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11) {
        C3705r.m14342g(str);
        this.f10593f = str;
        this.f10594o = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f10595p = str3;
        this.f10602w = j;
        this.f10596q = str4;
        this.f10597r = j2;
        this.f10598s = j3;
        this.f10599t = str5;
        this.f10600u = z;
        this.f10601v = z2;
        this.f10603x = str6;
        this.f10604y = 0;
        this.f10605z = j5;
        this.f10582A = i;
        this.f10583B = z3;
        this.f10584C = z4;
        this.f10585D = str7;
        this.f10586E = bool;
        this.f10587F = j6;
        this.f10588G = list;
        this.f10589H = null;
        this.f10590I = str9;
        this.f10591J = str10;
        this.f10592K = str11;
    }

    C3844cb(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11) {
        this.f10593f = str;
        this.f10594o = str2;
        this.f10595p = str3;
        this.f10602w = j3;
        this.f10596q = str4;
        this.f10597r = j;
        this.f10598s = j2;
        this.f10599t = str5;
        this.f10600u = z;
        this.f10601v = z2;
        this.f10603x = str6;
        this.f10604y = j4;
        this.f10605z = j5;
        this.f10582A = i;
        this.f10583B = z3;
        this.f10584C = z4;
        this.f10585D = str7;
        this.f10586E = bool;
        this.f10587F = j6;
        this.f10588G = list;
        this.f10589H = str8;
        this.f10590I = str9;
        this.f10591J = str10;
        this.f10592K = str11;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 2, this.f10593f, false);
        C3733c.m14448q(parcel, 3, this.f10594o, false);
        C3733c.m14448q(parcel, 4, this.f10595p, false);
        C3733c.m14448q(parcel, 5, this.f10596q, false);
        C3733c.m14445n(parcel, 6, this.f10597r);
        C3733c.m14445n(parcel, 7, this.f10598s);
        C3733c.m14448q(parcel, 8, this.f10599t, false);
        C3733c.m14434c(parcel, 9, this.f10600u);
        C3733c.m14434c(parcel, 10, this.f10601v);
        C3733c.m14445n(parcel, 11, this.f10602w);
        C3733c.m14448q(parcel, 12, this.f10603x, false);
        C3733c.m14445n(parcel, 13, this.f10604y);
        C3733c.m14445n(parcel, 14, this.f10605z);
        C3733c.m14443l(parcel, 15, this.f10582A);
        C3733c.m14434c(parcel, 16, this.f10583B);
        C3733c.m14434c(parcel, 18, this.f10584C);
        C3733c.m14448q(parcel, 19, this.f10585D, false);
        C3733c.m14435d(parcel, 21, this.f10586E, false);
        C3733c.m14445n(parcel, 22, this.f10587F);
        C3733c.m14450s(parcel, 23, this.f10588G, false);
        C3733c.m14448q(parcel, 24, this.f10589H, false);
        C3733c.m14448q(parcel, 25, this.f10590I, false);
        C3733c.m14448q(parcel, 26, this.f10591J, false);
        C3733c.m14448q(parcel, 27, this.f10592K, false);
        C3733c.m14433b(parcel, a);
    }
}
