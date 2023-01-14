package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.v */
public final class C4070v extends C3730a implements Iterable<String> {
    public static final Parcelable.Creator<C4070v> CREATOR = new C4082w();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Bundle f11333f;

    C4070v(Bundle bundle) {
        this.f11333f = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final Double mo12447C(String str) {
        return Double.valueOf(this.f11333f.getDouble("value"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final Long mo12448E(String str) {
        return Long.valueOf(this.f11333f.getLong("value"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final Object mo12449G(String str) {
        return this.f11333f.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final String mo12450H(String str) {
        return this.f11333f.getString(str);
    }

    public final Iterator iterator() {
        return new C4058u(this);
    }

    /* renamed from: o */
    public final int mo12452o() {
        return this.f11333f.size();
    }

    /* renamed from: r */
    public final Bundle mo12453r() {
        return new Bundle(this.f11333f);
    }

    public final String toString() {
        return this.f11333f.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14436e(parcel, 2, mo12453r(), false);
        C3733c.m14433b(parcel, a);
    }
}
