package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: com.google.android.gms.measurement.internal.d */
public final class C3845d extends C3730a {
    public static final Parcelable.Creator<C3845d> CREATOR = new C3858e();

    /* renamed from: f */
    public String f10606f;

    /* renamed from: o */
    public String f10607o;

    /* renamed from: p */
    public C4045sa f10608p;

    /* renamed from: q */
    public long f10609q;

    /* renamed from: r */
    public boolean f10610r;

    /* renamed from: s */
    public String f10611s;

    /* renamed from: t */
    public final C4094x f10612t;

    /* renamed from: u */
    public long f10613u;

    /* renamed from: v */
    public C4094x f10614v;

    /* renamed from: w */
    public final long f10615w;

    /* renamed from: x */
    public final C4094x f10616x;

    C3845d(C3845d dVar) {
        C3705r.m14346k(dVar);
        this.f10606f = dVar.f10606f;
        this.f10607o = dVar.f10607o;
        this.f10608p = dVar.f10608p;
        this.f10609q = dVar.f10609q;
        this.f10610r = dVar.f10610r;
        this.f10611s = dVar.f10611s;
        this.f10612t = dVar.f10612t;
        this.f10613u = dVar.f10613u;
        this.f10614v = dVar.f10614v;
        this.f10615w = dVar.f10615w;
        this.f10616x = dVar.f10616x;
    }

    C3845d(String str, String str2, C4045sa saVar, long j, boolean z, String str3, C4094x xVar, long j2, C4094x xVar2, long j3, C4094x xVar3) {
        this.f10606f = str;
        this.f10607o = str2;
        this.f10608p = saVar;
        this.f10609q = j;
        this.f10610r = z;
        this.f10611s = str3;
        this.f10612t = xVar;
        this.f10613u = j2;
        this.f10614v = xVar2;
        this.f10615w = j3;
        this.f10616x = xVar3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 2, this.f10606f, false);
        C3733c.m14448q(parcel, 3, this.f10607o, false);
        C3733c.m14447p(parcel, 4, this.f10608p, i, false);
        C3733c.m14445n(parcel, 5, this.f10609q);
        C3733c.m14434c(parcel, 6, this.f10610r);
        C3733c.m14448q(parcel, 7, this.f10611s, false);
        C3733c.m14447p(parcel, 8, this.f10612t, i, false);
        C3733c.m14445n(parcel, 9, this.f10613u);
        C3733c.m14447p(parcel, 10, this.f10614v, i, false);
        C3733c.m14445n(parcel, 11, this.f10615w);
        C3733c.m14447p(parcel, 12, this.f10616x, i, false);
        C3733c.m14433b(parcel, a);
    }
}
