package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1424a();

    /* renamed from: f */
    private final C1427c f4163f;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C1424a implements Parcelable.Creator<ParcelImpl> {
        C1424a() {
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f4163f = new C1426b(parcel).mo5304u();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C1426b(parcel).mo5285L(this.f4163f);
    }
}
