package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: com.google.android.material.datepicker.i */
final class C4220i implements Comparable<C4220i>, Parcelable {
    public static final Parcelable.Creator<C4220i> CREATOR = new C4221a();

    /* renamed from: f */
    private final Calendar f11898f;

    /* renamed from: o */
    private final String f11899o;

    /* renamed from: p */
    final int f11900p;

    /* renamed from: q */
    final int f11901q;

    /* renamed from: r */
    final int f11902r;

    /* renamed from: s */
    final int f11903s;

    /* renamed from: t */
    final long f11904t;

    /* renamed from: com.google.android.material.datepicker.i$a */
    static class C4221a implements Parcelable.Creator<C4220i> {
        C4221a() {
        }

        /* renamed from: a */
        public C4220i createFromParcel(Parcel parcel) {
            return C4220i.m16114N(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public C4220i[] newArray(int i) {
            return new C4220i[i];
        }
    }

    private C4220i(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d = C4230o.m16154d(calendar);
        this.f11898f = d;
        this.f11900p = d.get(2);
        this.f11901q = d.get(1);
        this.f11902r = d.getMaximum(7);
        this.f11903s = d.getActualMaximum(5);
        this.f11899o = C4230o.m16164n().format(d.getTime());
        this.f11904t = d.getTimeInMillis();
    }

    /* renamed from: N */
    static C4220i m16114N(int i, int i2) {
        Calendar k = C4230o.m16161k();
        k.set(1, i);
        k.set(2, i2);
        return new C4220i(k);
    }

    /* renamed from: O */
    static C4220i m16115O(long j) {
        Calendar k = C4230o.m16161k();
        k.setTimeInMillis(j);
        return new C4220i(k);
    }

    /* renamed from: V */
    static C4220i m16116V() {
        return new C4220i(C4230o.m16159i());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public int mo13202P() {
        int firstDayOfWeek = this.f11898f.get(7) - this.f11898f.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f11902r : firstDayOfWeek;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public long mo13203Q(int i) {
        Calendar d = C4230o.m16154d(this.f11898f);
        d.set(5, i);
        return d.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public String mo13204R() {
        return this.f11899o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public long mo13205S() {
        return this.f11898f.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public C4220i mo13206T(int i) {
        Calendar d = C4230o.m16154d(this.f11898f);
        d.add(2, i);
        return new C4220i(d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public int mo13207U(C4220i iVar) {
        if (this.f11898f instanceof GregorianCalendar) {
            return ((iVar.f11901q - this.f11901q) * 12) + (iVar.f11900p - this.f11900p);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int compareTo(C4220i iVar) {
        return this.f11898f.compareTo(iVar.f11898f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4220i)) {
            return false;
        }
        C4220i iVar = (C4220i) obj;
        return this.f11900p == iVar.f11900p && this.f11901q == iVar.f11901q;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11900p), Integer.valueOf(this.f11901q)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11901q);
        parcel.writeInt(this.f11900p);
    }
}
