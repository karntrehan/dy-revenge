package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.v */
public class C3717v extends C3730a {
    public static final Parcelable.Creator<C3717v> CREATOR = new C3648b0();

    /* renamed from: f */
    private final int f10398f;

    /* renamed from: o */
    private List<C3694o> f10399o;

    public C3717v(int i, List<C3694o> list) {
        this.f10398f = i;
        this.f10399o = list;
    }

    /* renamed from: o */
    public final int mo11682o() {
        return this.f10398f;
    }

    /* renamed from: p */
    public final List<C3694o> mo11683p() {
        return this.f10399o;
    }

    /* renamed from: r */
    public final void mo11684r(C3694o oVar) {
        if (this.f10399o == null) {
            this.f10399o = new ArrayList();
        }
        this.f10399o.add(oVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f10398f);
        C3733c.m14452u(parcel, 2, this.f10399o, false);
        C3733c.m14433b(parcel, a);
    }
}
