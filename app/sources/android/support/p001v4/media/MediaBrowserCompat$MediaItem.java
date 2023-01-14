package android.support.p001v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0001a();

    /* renamed from: f */
    private final int f2f;

    /* renamed from: o */
    private final MediaDescriptionCompat f3o;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
    static class C0001a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        C0001a() {
        }

        /* renamed from: a */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        /* renamed from: b */
        public MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f2f = parcel.readInt();
        this.f3o = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f2f + ", mDescription=" + this.f3o + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2f);
        this.f3o.writeToParcel(parcel, i);
    }
}
