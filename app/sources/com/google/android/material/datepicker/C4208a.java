package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.a */
public final class C4208a implements Parcelable {
    public static final Parcelable.Creator<C4208a> CREATOR = new C4209a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4220i f11867f;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C4220i f11868o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C4220i f11869p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C4211c f11870q;

    /* renamed from: r */
    private final int f11871r;

    /* renamed from: s */
    private final int f11872s;

    /* renamed from: com.google.android.material.datepicker.a$a */
    static class C4209a implements Parcelable.Creator<C4208a> {
        C4209a() {
        }

        /* renamed from: a */
        public C4208a createFromParcel(Parcel parcel) {
            return new C4208a((C4220i) parcel.readParcelable(C4220i.class.getClassLoader()), (C4220i) parcel.readParcelable(C4220i.class.getClassLoader()), (C4220i) parcel.readParcelable(C4220i.class.getClassLoader()), (C4211c) parcel.readParcelable(C4211c.class.getClassLoader()), (C4209a) null);
        }

        /* renamed from: b */
        public C4208a[] newArray(int i) {
            return new C4208a[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    public static final class C4210b {

        /* renamed from: a */
        static final long f11873a = C4230o.m16151a(C4220i.m16114N(1900, 0).f11904t);

        /* renamed from: b */
        static final long f11874b = C4230o.m16151a(C4220i.m16114N(2100, 11).f11904t);

        /* renamed from: c */
        private long f11875c = f11873a;

        /* renamed from: d */
        private long f11876d = f11874b;

        /* renamed from: e */
        private Long f11877e;

        /* renamed from: f */
        private C4211c f11878f = C4216f.m16107a(Long.MIN_VALUE);

        C4210b(C4208a aVar) {
            this.f11875c = aVar.f11867f.f11904t;
            this.f11876d = aVar.f11868o.f11904t;
            this.f11877e = Long.valueOf(aVar.f11869p.f11904t);
            this.f11878f = aVar.f11870q;
        }

        /* renamed from: a */
        public C4208a mo13174a() {
            if (this.f11877e == null) {
                long X1 = MaterialDatePicker.m16059X1();
                long j = this.f11875c;
                if (j > X1 || X1 > this.f11876d) {
                    X1 = j;
                }
                this.f11877e = Long.valueOf(X1);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f11878f);
            return new C4208a(C4220i.m16115O(this.f11875c), C4220i.m16115O(this.f11876d), C4220i.m16115O(this.f11877e.longValue()), (C4211c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), (C4209a) null);
        }

        /* renamed from: b */
        public C4210b mo13175b(long j) {
            this.f11877e = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    public interface C4211c extends Parcelable {
        /* renamed from: A */
        boolean mo13176A(long j);
    }

    private C4208a(C4220i iVar, C4220i iVar2, C4220i iVar3, C4211c cVar) {
        this.f11867f = iVar;
        this.f11868o = iVar2;
        this.f11869p = iVar3;
        this.f11870q = cVar;
        if (iVar.compareTo(iVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (iVar3.compareTo(iVar2) <= 0) {
            this.f11872s = iVar.mo13207U(iVar2) + 1;
            this.f11871r = (iVar2.f11901q - iVar.f11901q) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    /* synthetic */ C4208a(C4220i iVar, C4220i iVar2, C4220i iVar3, C4211c cVar, C4209a aVar) {
        this(iVar, iVar2, iVar3, cVar);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C4211c mo13161e() {
        return this.f11870q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4208a)) {
            return false;
        }
        C4208a aVar = (C4208a) obj;
        return this.f11867f.equals(aVar.f11867f) && this.f11868o.equals(aVar.f11868o) && this.f11869p.equals(aVar.f11869p) && this.f11870q.equals(aVar.f11870q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C4220i mo13163f() {
        return this.f11868o;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11867f, this.f11868o, this.f11869p, this.f11870q});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo13165i() {
        return this.f11872s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C4220i mo13166j() {
        return this.f11869p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C4220i mo13167k() {
        return this.f11867f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo13168l() {
        return this.f11871r;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11867f, 0);
        parcel.writeParcelable(this.f11868o, 0);
        parcel.writeParcelable(this.f11869p, 0);
        parcel.writeParcelable(this.f11870q, 0);
    }
}
