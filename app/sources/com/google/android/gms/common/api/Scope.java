package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

public final class Scope extends C3730a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C3621t();

    /* renamed from: f */
    final int f9817f;

    /* renamed from: o */
    private final String f9818o;

    Scope(int i, String str) {
        C3705r.m14343h(str, "scopeUri must not be null or empty");
        this.f9817f = i;
        this.f9818o = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f9818o.equals(((Scope) obj).f9818o);
    }

    public int hashCode() {
        return this.f9818o.hashCode();
    }

    /* renamed from: o */
    public String mo11163o() {
        return this.f9818o;
    }

    public String toString() {
        return this.f9818o;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f9817f);
        C3733c.m14448q(parcel, 2, mo11163o(), false);
        C3733c.m14433b(parcel, a);
    }
}
