package android.support.p001v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0005a();

    /* renamed from: f */
    private final int f27f;

    /* renamed from: o */
    private final float f28o;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    static class C0005a implements Parcelable.Creator<RatingCompat> {
        C0005a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f27f = i;
        this.f28o = f;
    }

    public int describeContents() {
        return this.f27f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f27f);
        sb.append(" rating=");
        float f = this.f28o;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27f);
        parcel.writeFloat(this.f28o);
    }
}
