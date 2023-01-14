package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.C4208a;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.f */
public class C4216f implements C4208a.C4211c {
    public static final Parcelable.Creator<C4216f> CREATOR = new C4217a();

    /* renamed from: f */
    private final long f11893f;

    /* renamed from: com.google.android.material.datepicker.f$a */
    static class C4217a implements Parcelable.Creator<C4216f> {
        C4217a() {
        }

        /* renamed from: a */
        public C4216f createFromParcel(Parcel parcel) {
            return new C4216f(parcel.readLong(), (C4217a) null);
        }

        /* renamed from: b */
        public C4216f[] newArray(int i) {
            return new C4216f[i];
        }
    }

    private C4216f(long j) {
        this.f11893f = j;
    }

    /* synthetic */ C4216f(long j, C4217a aVar) {
        this(j);
    }

    /* renamed from: a */
    public static C4216f m16107a(long j) {
        return new C4216f(j);
    }

    /* renamed from: A */
    public boolean mo13176A(long j) {
        return j >= this.f11893f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4216f) && this.f11893f == ((C4216f) obj).f11893f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11893f)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f11893f);
    }
}
