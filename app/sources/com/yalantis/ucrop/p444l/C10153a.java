package com.yalantis.ucrop.p444l;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yalantis.ucrop.l.a */
public class C10153a implements Parcelable {
    public static final Parcelable.Creator<C10153a> CREATOR = new C10154a();

    /* renamed from: f */
    private final String f27109f;

    /* renamed from: o */
    private final float f27110o;

    /* renamed from: p */
    private final float f27111p;

    /* renamed from: com.yalantis.ucrop.l.a$a */
    static class C10154a implements Parcelable.Creator<C10153a> {
        C10154a() {
        }

        /* renamed from: a */
        public C10153a createFromParcel(Parcel parcel) {
            return new C10153a(parcel);
        }

        /* renamed from: b */
        public C10153a[] newArray(int i) {
            return new C10153a[i];
        }
    }

    protected C10153a(Parcel parcel) {
        this.f27109f = parcel.readString();
        this.f27110o = parcel.readFloat();
        this.f27111p = parcel.readFloat();
    }

    public C10153a(String str, float f, float f2) {
        this.f27109f = str;
        this.f27110o = f;
        this.f27111p = f2;
    }

    /* renamed from: a */
    public String mo25240a() {
        return this.f27109f;
    }

    /* renamed from: b */
    public float mo25241b() {
        return this.f27110o;
    }

    /* renamed from: c */
    public float mo25242c() {
        return this.f27111p;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27109f);
        parcel.writeFloat(this.f27110o);
        parcel.writeFloat(this.f27111p);
    }
}
