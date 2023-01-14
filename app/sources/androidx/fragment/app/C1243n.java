package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.n */
final class C1243n implements Parcelable {
    public static final Parcelable.Creator<C1243n> CREATOR = new C1244a();

    /* renamed from: f */
    ArrayList<C1247p> f3548f;

    /* renamed from: o */
    ArrayList<String> f3549o;

    /* renamed from: p */
    C1212b[] f3550p;

    /* renamed from: q */
    int f3551q;

    /* renamed from: r */
    String f3552r = null;

    /* renamed from: androidx.fragment.app.n$a */
    static class C1244a implements Parcelable.Creator<C1243n> {
        C1244a() {
        }

        /* renamed from: a */
        public C1243n createFromParcel(Parcel parcel) {
            return new C1243n(parcel);
        }

        /* renamed from: b */
        public C1243n[] newArray(int i) {
            return new C1243n[i];
        }
    }

    public C1243n() {
    }

    public C1243n(Parcel parcel) {
        this.f3548f = parcel.createTypedArrayList(C1247p.CREATOR);
        this.f3549o = parcel.createStringArrayList();
        this.f3550p = (C1212b[]) parcel.createTypedArray(C1212b.CREATOR);
        this.f3551q = parcel.readInt();
        this.f3552r = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f3548f);
        parcel.writeStringList(this.f3549o);
        parcel.writeTypedArray(this.f3550p, i);
        parcel.writeInt(this.f3551q);
        parcel.writeString(this.f3552r);
    }
}
