package android.support.p001v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p001v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0013a();

        /* renamed from: f */
        private final MediaDescriptionCompat f34f;

        /* renamed from: o */
        private final long f35o;

        /* renamed from: p */
        private Object f36p;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        static class C0013a implements Parcelable.Creator<QueueItem> {
            C0013a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        QueueItem(Parcel parcel) {
            this.f34f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f35o = parcel.readLong();
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f34f = mediaDescriptionCompat;
                this.f35o = j;
                this.f36p = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: a */
        public static QueueItem m54a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m7a(C0033f.m131a(obj)), C0033f.m132b(obj));
        }

        /* renamed from: b */
        public static List<QueueItem> m55b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m54a(a));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f34f + ", Id=" + this.f35o + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f34f.writeToParcel(parcel, i);
            parcel.writeLong(this.f35o);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0014a();

        /* renamed from: f */
        ResultReceiver f37f;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        static class C0014a implements Parcelable.Creator<ResultReceiverWrapper> {
            C0014a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f37f = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f37f.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0015a();

        /* renamed from: f */
        private final Object f38f;

        /* renamed from: o */
        private C0021b f39o;

        /* renamed from: p */
        private Bundle f40p;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        static class C0015a implements Parcelable.Creator<Token> {
            C0015a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable((ClassLoader) null) : parcel.readStrongBinder());
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, (C0021b) null, (Bundle) null);
        }

        Token(Object obj, C0021b bVar, Bundle bundle) {
            this.f38f = obj;
            this.f39o = bVar;
            this.f40p = bundle;
        }

        /* renamed from: a */
        public C0021b mo60a() {
            return this.f39o;
        }

        /* renamed from: b */
        public void mo61b(C0021b bVar) {
            this.f39o = bVar;
        }

        /* renamed from: c */
        public void mo62c(Bundle bundle) {
            this.f40p = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f38f;
            Object obj3 = ((Token) obj).f38f;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f38f;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f38f, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f38f);
            }
        }
    }

    /* renamed from: a */
    public static void m53a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
