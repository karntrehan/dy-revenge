package android.support.p001v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0016a();

    /* renamed from: f */
    public int f41f;

    /* renamed from: o */
    public int f42o;

    /* renamed from: p */
    public int f43p;

    /* renamed from: q */
    public int f44q;

    /* renamed from: r */
    public int f45r;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    static class C0016a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0016a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f41f = parcel.readInt();
        this.f43p = parcel.readInt();
        this.f44q = parcel.readInt();
        this.f45r = parcel.readInt();
        this.f42o = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f41f);
        parcel.writeInt(this.f43p);
        parcel.writeInt(this.f44q);
        parcel.writeInt(this.f45r);
        parcel.writeInt(this.f42o);
    }
}
