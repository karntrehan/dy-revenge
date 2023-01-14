package android.support.p001v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.media.session.C0034g;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0018a();

    /* renamed from: f */
    final int f46f;

    /* renamed from: o */
    final long f47o;

    /* renamed from: p */
    final long f48p;

    /* renamed from: q */
    final float f49q;

    /* renamed from: r */
    final long f50r;

    /* renamed from: s */
    final int f51s;

    /* renamed from: t */
    final CharSequence f52t;

    /* renamed from: u */
    final long f53u;

    /* renamed from: v */
    List<CustomAction> f54v;

    /* renamed from: w */
    final long f55w;

    /* renamed from: x */
    final Bundle f56x;

    /* renamed from: y */
    private Object f57y;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0017a();

        /* renamed from: f */
        private final String f58f;

        /* renamed from: o */
        private final CharSequence f59o;

        /* renamed from: p */
        private final int f60p;

        /* renamed from: q */
        private final Bundle f61q;

        /* renamed from: r */
        private Object f62r;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        static class C0017a implements Parcelable.Creator<CustomAction> {
            C0017a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(Parcel parcel) {
            this.f58f = parcel.readString();
            this.f59o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f60p = parcel.readInt();
            this.f61q = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f58f = str;
            this.f59o = charSequence;
            this.f60p = i;
            this.f61q = bundle;
        }

        /* renamed from: a */
        public static CustomAction m68a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0034g.C0035a.m142a(obj), C0034g.C0035a.m145d(obj), C0034g.C0035a.m144c(obj), C0034g.C0035a.m143b(obj));
            customAction.f62r = obj;
            return customAction;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f59o + ", mIcon=" + this.f60p + ", mExtras=" + this.f61q;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f58f);
            TextUtils.writeToParcel(this.f59o, parcel, i);
            parcel.writeInt(this.f60p);
            parcel.writeBundle(this.f61q);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    static class C0018a implements Parcelable.Creator<PlaybackStateCompat> {
        C0018a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f46f = i;
        this.f47o = j;
        this.f48p = j2;
        this.f49q = f;
        this.f50r = j3;
        this.f51s = i2;
        this.f52t = charSequence;
        this.f53u = j4;
        this.f54v = new ArrayList(list);
        this.f55w = j5;
        this.f56x = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f46f = parcel.readInt();
        this.f47o = parcel.readLong();
        this.f49q = parcel.readFloat();
        this.f53u = parcel.readLong();
        this.f48p = parcel.readLong();
        this.f50r = parcel.readLong();
        this.f52t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f54v = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f55w = parcel.readLong();
        this.f56x = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f51s = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m67a(Object obj) {
        ArrayList arrayList;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> d = C0034g.m136d(obj);
        if (d != null) {
            ArrayList arrayList2 = new ArrayList(d.size());
            for (Object a : d) {
                arrayList2.add(CustomAction.m68a(a));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = C0036h.m146a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0034g.m141i(obj), C0034g.m140h(obj), C0034g.m135c(obj), C0034g.m139g(obj), C0034g.m133a(obj), 0, C0034g.m137e(obj), C0034g.m138f(obj), arrayList, C0034g.m134b(obj), bundle);
        playbackStateCompat.f57y = obj2;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f46f + ", position=" + this.f47o + ", buffered position=" + this.f48p + ", speed=" + this.f49q + ", updated=" + this.f53u + ", actions=" + this.f50r + ", error code=" + this.f51s + ", error message=" + this.f52t + ", custom actions=" + this.f54v + ", active item id=" + this.f55w + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f46f);
        parcel.writeLong(this.f47o);
        parcel.writeFloat(this.f49q);
        parcel.writeLong(this.f53u);
        parcel.writeLong(this.f48p);
        parcel.writeLong(this.f50r);
        TextUtils.writeToParcel(this.f52t, parcel, i);
        parcel.writeTypedList(this.f54v);
        parcel.writeLong(this.f55w);
        parcel.writeBundle(this.f56x);
        parcel.writeInt(this.f51s);
    }
}
